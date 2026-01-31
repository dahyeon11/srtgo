package retrofit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit.client.Header;
import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.EncodedPath;
import retrofit.http.EncodedQuery;
import retrofit.http.EncodedQueryMap;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.Part;
import retrofit.http.PartMap;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;
import retrofit.http.RestMethod;
import retrofit.http.Streaming;
import rx.Observable;

/* loaded from: classes3.dex */
final class RestMethodInfo {
    private static final String PARAM = "[a-zA-Z][a-zA-Z0-9_-]*";
    private static final Pattern PARAM_NAME_REGEX = Pattern.compile(PARAM);
    private static final Pattern PARAM_URL_REGEX = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    String contentTypeHeader;
    List<Header> headers;
    final boolean isObservable;
    boolean isStreaming;
    final boolean isSynchronous;
    final Method method;
    boolean requestHasBody;
    String requestMethod;
    String[] requestParamNames;
    ParamUsage[] requestParamUsage;
    String requestQuery;
    String requestUrl;
    Set<String> requestUrlParamNames;
    Type responseObjectType;
    final ResponseType responseType;
    boolean loaded = false;
    RequestType requestType = RequestType.SIMPLE;

    enum ParamUsage {
        PATH,
        ENCODED_PATH,
        QUERY,
        ENCODED_QUERY,
        QUERY_MAP,
        ENCODED_QUERY_MAP,
        FIELD,
        FIELD_MAP,
        PART,
        PART_MAP,
        BODY,
        HEADER
    }

    enum RequestType {
        SIMPLE,
        MULTIPART,
        FORM_URL_ENCODED
    }

    private enum ResponseType {
        VOID,
        OBSERVABLE,
        OBJECT
    }

    private static final class RxSupport {
        private RxSupport() {
        }

        public static Type getObservableType(Type type, Class cls) {
            return Types.getSupertype(type, cls, Observable.class);
        }

        public static boolean isObservable(Class cls) {
            return cls == Observable.class;
        }
    }

    RestMethodInfo(Method method) {
        this.method = method;
        ResponseType responseType = parseResponseType();
        this.responseType = responseType;
        this.isSynchronous = responseType == ResponseType.OBJECT;
        this.isObservable = responseType == ResponseType.OBSERVABLE;
    }

    private static Type getParameterUpperBound(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i8 = 0; i8 < actualTypeArguments.length; i8++) {
            Type type = actualTypeArguments[i8];
            if (type instanceof WildcardType) {
                actualTypeArguments[i8] = ((WildcardType) type).getUpperBounds()[0];
            }
        }
        return actualTypeArguments[0];
    }

    private RuntimeException methodError(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(str, objArr);
        }
        return new IllegalArgumentException(this.method.getDeclaringClass().getSimpleName() + "." + this.method.getName() + ": " + str);
    }

    private RuntimeException parameterError(int i8, String str, Object... objArr) {
        return methodError(str + " (parameter #" + (i8 + 1) + ")", objArr);
    }

    private void parseMethodAnnotations() {
        RestMethod restMethod;
        for (Annotation annotation : this.method.getAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            Annotation[] annotations = clsAnnotationType.getAnnotations();
            int length = annotations.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    restMethod = null;
                    break;
                }
                Annotation annotation2 = annotations[i8];
                if (RestMethod.class == annotation2.annotationType()) {
                    restMethod = (RestMethod) annotation2;
                    break;
                }
                i8++;
            }
            if (restMethod != null) {
                String str = this.requestMethod;
                if (str != null) {
                    throw methodError("Only one HTTP method is allowed. Found: %s and %s.", str, restMethod.value());
                }
                try {
                    parsePath((String) clsAnnotationType.getMethod("value", null).invoke(annotation, null));
                    this.requestMethod = restMethod.value();
                    this.requestHasBody = restMethod.hasBody();
                } catch (Exception unused) {
                    throw methodError("Failed to extract String 'value' from @%s annotation.", clsAnnotationType.getSimpleName());
                }
            } else if (clsAnnotationType == Headers.class) {
                String[] strArrValue = ((Headers) annotation).value();
                if (strArrValue.length == 0) {
                    throw methodError("@Headers annotation is empty.", new Object[0]);
                }
                this.headers = parseHeaders(strArrValue);
            } else if (clsAnnotationType == Multipart.class) {
                if (this.requestType != RequestType.SIMPLE) {
                    throw methodError("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.requestType = RequestType.MULTIPART;
            } else if (clsAnnotationType == FormUrlEncoded.class) {
                if (this.requestType != RequestType.SIMPLE) {
                    throw methodError("Only one encoding annotation is allowed.", new Object[0]);
                }
                this.requestType = RequestType.FORM_URL_ENCODED;
            } else if (clsAnnotationType != Streaming.class) {
                continue;
            } else {
                if (this.responseObjectType != Response.class) {
                    throw methodError("Only methods having %s as data type are allowed to have @%s annotation.", Response.class.getSimpleName(), Streaming.class.getSimpleName());
                }
                this.isStreaming = true;
            }
        }
        if (this.requestMethod == null) {
            throw methodError("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
        if (this.requestHasBody) {
            return;
        }
        RequestType requestType = this.requestType;
        if (requestType == RequestType.MULTIPART) {
            throw methodError("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
        }
        if (requestType == RequestType.FORM_URL_ENCODED) {
            throw methodError("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
        }
    }

    private void parseParameters() {
        Annotation[][] annotationArr;
        Class<?>[] parameterTypes = this.method.getParameterTypes();
        Annotation[][] parameterAnnotations = this.method.getParameterAnnotations();
        int length = parameterAnnotations.length;
        if (!this.isSynchronous && !this.isObservable) {
            length--;
        }
        String[] strArr = new String[length];
        this.requestParamNames = strArr;
        ParamUsage[] paramUsageArr = new ParamUsage[length];
        this.requestParamUsage = paramUsageArr;
        int i8 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i8 < length) {
            Class<?> cls = parameterTypes[i8];
            Annotation[] annotationArr2 = parameterAnnotations[i8];
            if (annotationArr2 != null) {
                int length2 = annotationArr2.length;
                int i9 = 0;
                while (i9 < length2) {
                    Annotation annotation = annotationArr2[i9];
                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                    Class<?>[] clsArr = parameterTypes;
                    if (clsAnnotationType == Path.class) {
                        String strValue = ((Path) annotation).value();
                        validatePathName(i8, strValue);
                        strArr[i8] = strValue;
                        paramUsageArr[i8] = ParamUsage.PATH;
                    } else if (clsAnnotationType == EncodedPath.class) {
                        String strValue2 = ((EncodedPath) annotation).value();
                        validatePathName(i8, strValue2);
                        strArr[i8] = strValue2;
                        paramUsageArr[i8] = ParamUsage.ENCODED_PATH;
                    } else if (clsAnnotationType == Query.class) {
                        strArr[i8] = ((Query) annotation).value();
                        paramUsageArr[i8] = ParamUsage.QUERY;
                    } else if (clsAnnotationType == EncodedQuery.class) {
                        strArr[i8] = ((EncodedQuery) annotation).value();
                        paramUsageArr[i8] = ParamUsage.ENCODED_QUERY;
                    } else {
                        annotationArr = parameterAnnotations;
                        if (clsAnnotationType == QueryMap.class) {
                            if (!Map.class.isAssignableFrom(cls)) {
                                throw parameterError(i8, "@QueryMap parameter type must be Map.", new Object[0]);
                            }
                            paramUsageArr[i8] = ParamUsage.QUERY_MAP;
                        } else if (clsAnnotationType == EncodedQueryMap.class) {
                            if (!Map.class.isAssignableFrom(cls)) {
                                throw parameterError(i8, "@EncodedQueryMap parameter type must be Map.", new Object[0]);
                            }
                            paramUsageArr[i8] = ParamUsage.ENCODED_QUERY_MAP;
                        } else if (clsAnnotationType == retrofit.http.Header.class) {
                            String strValue3 = ((retrofit.http.Header) annotation).value();
                            if (cls != String.class) {
                                throw parameterError(i8, "@Header parameter type must be String. Found: %s.", cls.getSimpleName());
                            }
                            strArr[i8] = strValue3;
                            paramUsageArr[i8] = ParamUsage.HEADER;
                        } else {
                            if (clsAnnotationType == Field.class) {
                                if (this.requestType != RequestType.FORM_URL_ENCODED) {
                                    throw parameterError(i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                }
                                strArr[i8] = ((Field) annotation).value();
                                paramUsageArr[i8] = ParamUsage.FIELD;
                            } else if (clsAnnotationType != FieldMap.class) {
                                if (clsAnnotationType == Part.class) {
                                    if (this.requestType != RequestType.MULTIPART) {
                                        throw parameterError(i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                    }
                                    strArr[i8] = ((Part) annotation).value();
                                    paramUsageArr[i8] = ParamUsage.PART;
                                } else if (clsAnnotationType == PartMap.class) {
                                    if (this.requestType != RequestType.MULTIPART) {
                                        throw parameterError(i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                    }
                                    if (!Map.class.isAssignableFrom(cls)) {
                                        throw parameterError(i8, "@PartMap parameter type must be Map.", new Object[0]);
                                    }
                                    paramUsageArr[i8] = ParamUsage.PART_MAP;
                                } else if (clsAnnotationType != Body.class) {
                                    continue;
                                } else {
                                    if (this.requestType != RequestType.SIMPLE) {
                                        throw parameterError(i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                    }
                                    if (z8) {
                                        throw methodError("Multiple @Body method annotations found.", new Object[0]);
                                    }
                                    paramUsageArr[i8] = ParamUsage.BODY;
                                    z8 = true;
                                }
                                z10 = true;
                            } else {
                                if (this.requestType != RequestType.FORM_URL_ENCODED) {
                                    throw parameterError(i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                }
                                if (!Map.class.isAssignableFrom(cls)) {
                                    throw parameterError(i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                }
                                paramUsageArr[i8] = ParamUsage.FIELD_MAP;
                            }
                            z9 = true;
                        }
                        i9++;
                        parameterTypes = clsArr;
                        parameterAnnotations = annotationArr;
                    }
                    annotationArr = parameterAnnotations;
                    i9++;
                    parameterTypes = clsArr;
                    parameterAnnotations = annotationArr;
                }
            }
            Class<?>[] clsArr2 = parameterTypes;
            Annotation[][] annotationArr3 = parameterAnnotations;
            if (paramUsageArr[i8] == null) {
                throw parameterError(i8, "No Retrofit annotation found.", new Object[0]);
            }
            i8++;
            parameterTypes = clsArr2;
            parameterAnnotations = annotationArr3;
        }
        RequestType requestType = this.requestType;
        if (requestType == RequestType.SIMPLE && !this.requestHasBody && z8) {
            throw methodError("Non-body HTTP method cannot contain @Body or @TypedOutput.", new Object[0]);
        }
        if (requestType == RequestType.FORM_URL_ENCODED && !z9) {
            throw methodError("Form-encoded method must contain at least one @Field.", new Object[0]);
        }
        if (requestType == RequestType.MULTIPART && !z10) {
            throw methodError("Multipart method must contain at least one @Part.", new Object[0]);
        }
    }

    private void parsePath(String str) {
        String strSubstring;
        String strSubstring2;
        if (str == null || str.length() == 0 || str.charAt(0) != '/') {
            throw methodError("URL path \"%s\" must start with '/'.", str);
        }
        int iIndexOf = str.indexOf(63);
        if (iIndexOf == -1 || iIndexOf >= str.length() - 1) {
            strSubstring = null;
            strSubstring2 = str;
        } else {
            strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = str.substring(iIndexOf + 1);
            if (PARAM_URL_REGEX.matcher(strSubstring).find()) {
                throw methodError("URL query string \"%s\" must not have replace block.", strSubstring);
            }
        }
        Set<String> pathParameters = parsePathParameters(str);
        this.requestUrl = strSubstring2;
        this.requestUrlParamNames = pathParameters;
        this.requestQuery = strSubstring;
    }

    static Set<String> parsePathParameters(String str) {
        Matcher matcher = PARAM_URL_REGEX.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    private ResponseType parseResponseType() {
        Type type;
        Type genericReturnType = this.method.getGenericReturnType();
        Type[] genericParameterTypes = this.method.getGenericParameterTypes();
        Class cls = null;
        if (genericParameterTypes.length > 0) {
            type = genericParameterTypes[genericParameterTypes.length - 1];
            Type rawType = type instanceof ParameterizedType ? ((ParameterizedType) type).getRawType() : type;
            if (rawType instanceof Class) {
                cls = (Class) rawType;
            }
        } else {
            type = null;
        }
        boolean z8 = genericReturnType != Void.TYPE;
        boolean z9 = cls != null && Callback.class.isAssignableFrom(cls);
        if (z8 && z9) {
            throw methodError("Must have return type or Callback as last argument, not both.", new Object[0]);
        }
        if (!z8 && !z9) {
            throw methodError("Must have either a return type or Callback as last argument.", new Object[0]);
        }
        if (!z8) {
            Type supertype = Types.getSupertype(type, Types.getRawType(type), Callback.class);
            if (!(supertype instanceof ParameterizedType)) {
                throw methodError("Last parameter must be of type Callback<X> or Callback<? super X>.", new Object[0]);
            }
            this.responseObjectType = getParameterUpperBound((ParameterizedType) supertype);
            return ResponseType.VOID;
        }
        if (Platform.HAS_RX_JAVA) {
            Class<?> rawType2 = Types.getRawType(genericReturnType);
            if (RxSupport.isObservable(rawType2)) {
                this.responseObjectType = getParameterUpperBound((ParameterizedType) RxSupport.getObservableType(genericReturnType, rawType2));
                return ResponseType.OBSERVABLE;
            }
        }
        this.responseObjectType = genericReturnType;
        return ResponseType.OBJECT;
    }

    private void validatePathName(int i8, String str) {
        if (!PARAM_NAME_REGEX.matcher(str).matches()) {
            throw parameterError(i8, "@Path parameter name must match %s. Found: %s", PARAM_URL_REGEX.pattern(), str);
        }
        if (!this.requestUrlParamNames.contains(str)) {
            throw parameterError(i8, "URL \"%s\" does not contain \"{%s}\".", this.requestUrl, str);
        }
    }

    synchronized void init() {
        if (this.loaded) {
            return;
        }
        parseMethodAnnotations();
        parseParameters();
        this.loaded = true;
    }

    List<Header> parseHeaders(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int iIndexOf = str.indexOf(58);
            if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                throw methodError("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
            }
            String strSubstring = str.substring(0, iIndexOf);
            String strTrim = str.substring(iIndexOf + 1).trim();
            if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                this.contentTypeHeader = strTrim;
            } else {
                arrayList.add(new Header(strSubstring, strTrim));
            }
        }
        return arrayList;
    }
}
