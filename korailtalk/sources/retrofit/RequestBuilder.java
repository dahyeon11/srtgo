package retrofit;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import retrofit.RequestInterceptor;
import retrofit.RestMethodInfo;
import retrofit.client.Header;
import retrofit.client.Request;
import retrofit.converter.Converter;
import retrofit.mime.FormUrlEncodedTypedOutput;
import retrofit.mime.MultipartTypedOutput;
import retrofit.mime.TypedOutput;
import retrofit.mime.TypedString;

/* loaded from: classes3.dex */
final class RequestBuilder implements RequestInterceptor.RequestFacade {
    private final String apiUrl;
    private TypedOutput body;
    private String contentTypeHeader;
    private final Converter converter;
    private final FormUrlEncodedTypedOutput formBody;
    private List<Header> headers;
    private final boolean isObservable;
    private final boolean isSynchronous;
    private final MultipartTypedOutput multipartBody;
    private final String[] paramNames;
    private final RestMethodInfo.ParamUsage[] paramUsages;
    private StringBuilder queryParams;
    private String relativeUrl;
    private final String requestMethod;

    /* renamed from: retrofit.RequestBuilder$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$retrofit$RestMethodInfo$ParamUsage;
        static final /* synthetic */ int[] $SwitchMap$retrofit$RestMethodInfo$RequestType;

        static {
            int[] iArr = new int[RestMethodInfo.ParamUsage.values().length];
            $SwitchMap$retrofit$RestMethodInfo$ParamUsage = iArr;
            try {
                iArr[RestMethodInfo.ParamUsage.PATH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.ENCODED_PATH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.QUERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.ENCODED_QUERY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.QUERY_MAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.ENCODED_QUERY_MAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.HEADER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.FIELD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.FIELD_MAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.PART.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.PART_MAP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$ParamUsage[RestMethodInfo.ParamUsage.BODY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr2 = new int[RestMethodInfo.RequestType.values().length];
            $SwitchMap$retrofit$RestMethodInfo$RequestType = iArr2;
            try {
                iArr2[RestMethodInfo.RequestType.FORM_URL_ENCODED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.MULTIPART.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$retrofit$RestMethodInfo$RequestType[RestMethodInfo.RequestType.SIMPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    private static class MimeOverridingTypedOutput implements TypedOutput {
        private final TypedOutput delegate;
        private final String mimeType;

        MimeOverridingTypedOutput(TypedOutput typedOutput, String str) {
            this.delegate = typedOutput;
            this.mimeType = str;
        }

        @Override // retrofit.mime.TypedOutput
        public String fileName() {
            return this.delegate.fileName();
        }

        @Override // retrofit.mime.TypedOutput
        public long length() {
            return this.delegate.length();
        }

        @Override // retrofit.mime.TypedOutput
        public String mimeType() {
            return this.mimeType;
        }

        @Override // retrofit.mime.TypedOutput
        public void writeTo(OutputStream outputStream) {
            this.delegate.writeTo(outputStream);
        }
    }

    RequestBuilder(String str, RestMethodInfo restMethodInfo, Converter converter) {
        this.apiUrl = str;
        this.converter = converter;
        this.paramNames = restMethodInfo.requestParamNames;
        this.paramUsages = restMethodInfo.requestParamUsage;
        this.requestMethod = restMethodInfo.requestMethod;
        this.isSynchronous = restMethodInfo.isSynchronous;
        this.isObservable = restMethodInfo.isObservable;
        if (restMethodInfo.headers != null) {
            this.headers = new ArrayList(restMethodInfo.headers);
        }
        this.contentTypeHeader = restMethodInfo.contentTypeHeader;
        this.relativeUrl = restMethodInfo.requestUrl;
        String str2 = restMethodInfo.requestQuery;
        if (str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append('?');
            sb.append(str2);
            this.queryParams = sb;
        }
        int i8 = AnonymousClass1.$SwitchMap$retrofit$RestMethodInfo$RequestType[restMethodInfo.requestType.ordinal()];
        if (i8 == 1) {
            FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
            this.formBody = formUrlEncodedTypedOutput;
            this.multipartBody = null;
            this.body = formUrlEncodedTypedOutput;
            return;
        }
        if (i8 == 2) {
            this.formBody = null;
            MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
            this.multipartBody = multipartTypedOutput;
            this.body = multipartTypedOutput;
            return;
        }
        if (i8 == 3) {
            this.formBody = null;
            this.multipartBody = null;
        } else {
            throw new IllegalArgumentException("Unknown request type: " + restMethodInfo.requestType);
        }
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public void addEncodedPathParam(String str, String str2) {
        addPathParam(str, str2, false);
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public void addEncodedQueryParam(String str, String str2) throws UnsupportedEncodingException {
        addQueryParam(str, str2, false);
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public void addHeader(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Header name must not be null.");
        }
        if ("Content-Type".equalsIgnoreCase(str)) {
            this.contentTypeHeader = str2;
            return;
        }
        List arrayList = this.headers;
        if (arrayList == null) {
            arrayList = new ArrayList(2);
            this.headers = arrayList;
        }
        arrayList.add(new Header(str, str2));
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public void addPathParam(String str, String str2) {
        addPathParam(str, str2, true);
    }

    @Override // retrofit.RequestInterceptor.RequestFacade
    public void addQueryParam(String str, String str2) throws UnsupportedEncodingException {
        addQueryParam(str, str2, true);
    }

    Request build() {
        MultipartTypedOutput multipartTypedOutput = this.multipartBody;
        if (multipartTypedOutput != null && multipartTypedOutput.getPartCount() == 0) {
            throw new IllegalStateException("Multipart requests must contain at least one part.");
        }
        String str = this.apiUrl;
        StringBuilder sb = new StringBuilder(str);
        if (str.endsWith("/")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(this.relativeUrl);
        StringBuilder sb2 = this.queryParams;
        if (sb2 != null) {
            sb.append((CharSequence) sb2);
        }
        TypedOutput mimeOverridingTypedOutput = this.body;
        List<Header> list = this.headers;
        String str2 = this.contentTypeHeader;
        if (str2 != null) {
            if (mimeOverridingTypedOutput != null) {
                mimeOverridingTypedOutput = new MimeOverridingTypedOutput(mimeOverridingTypedOutput, str2);
            } else {
                list.add(new Header("Content-Type", str2));
            }
        }
        return new Request(this.requestMethod, sb.toString(), list, mimeOverridingTypedOutput);
    }

    void setArguments(Object[] objArr) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, UnsupportedEncodingException {
        boolean z8;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        if (!this.isSynchronous && !this.isObservable) {
            length--;
        }
        for (int i8 = 0; i8 < length; i8++) {
            String str = this.paramNames[i8];
            Object obj = objArr[i8];
            RestMethodInfo.ParamUsage paramUsage = this.paramUsages[i8];
            switch (AnonymousClass1.$SwitchMap$retrofit$RestMethodInfo$ParamUsage[paramUsage.ordinal()]) {
                case 1:
                    if (obj == null) {
                        throw new IllegalArgumentException("Path parameter \"" + str + "\" value must not be null.");
                    }
                    addPathParam(str, obj.toString());
                    break;
                case 2:
                    if (obj == null) {
                        throw new IllegalArgumentException("Path parameter \"" + str + "\" value must not be null.");
                    }
                    addEncodedPathParam(str, obj.toString());
                    break;
                case 3:
                case 4:
                    if (obj == null) {
                        break;
                    } else {
                        z8 = paramUsage == RestMethodInfo.ParamUsage.QUERY;
                        if (obj instanceof Iterable) {
                            for (Object obj2 : (Iterable) obj) {
                                if (obj2 != null) {
                                    addQueryParam(str, obj2.toString(), z8);
                                }
                            }
                            break;
                        } else if (obj.getClass().isArray()) {
                            int length2 = Array.getLength(obj);
                            for (int i9 = 0; i9 < length2; i9++) {
                                Object obj3 = Array.get(obj, i9);
                                if (obj3 != null) {
                                    addQueryParam(str, obj3.toString(), z8);
                                }
                            }
                            break;
                        } else {
                            addQueryParam(str, obj.toString(), z8);
                            break;
                        }
                    }
                case 5:
                case 6:
                    if (obj == null) {
                        break;
                    } else {
                        z8 = paramUsage == RestMethodInfo.ParamUsage.QUERY_MAP;
                        for (Map.Entry entry : ((Map) obj).entrySet()) {
                            Object value = entry.getValue();
                            if (value != null) {
                                addQueryParam(entry.getKey().toString(), value.toString(), z8);
                            }
                        }
                        break;
                    }
                case 7:
                    if (obj != null) {
                        addHeader(str, obj.toString());
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (obj == null) {
                        break;
                    } else if (obj instanceof Iterable) {
                        for (Object obj4 : (Iterable) obj) {
                            if (obj4 != null) {
                                this.formBody.addField(str, obj4.toString());
                            }
                        }
                        break;
                    } else if (obj.getClass().isArray()) {
                        int length3 = Array.getLength(obj);
                        for (int i10 = 0; i10 < length3; i10++) {
                            Object obj5 = Array.get(obj, i10);
                            if (obj5 != null) {
                                this.formBody.addField(str, obj5.toString());
                            }
                        }
                        break;
                    } else {
                        this.formBody.addField(str, obj.toString());
                        break;
                    }
                case 9:
                    if (obj != null) {
                        for (Map.Entry entry2 : ((Map) obj).entrySet()) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                this.formBody.addField(entry2.getKey().toString(), value2.toString());
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (obj == null) {
                        break;
                    } else if (obj instanceof TypedOutput) {
                        this.multipartBody.addPart(str, (TypedOutput) obj);
                        break;
                    } else if (obj instanceof String) {
                        this.multipartBody.addPart(str, new TypedString((String) obj));
                        break;
                    } else {
                        this.multipartBody.addPart(str, this.converter.toBody(obj));
                        break;
                    }
                case 11:
                    if (obj != null) {
                        for (Map.Entry entry3 : ((Map) obj).entrySet()) {
                            String string = entry3.getKey().toString();
                            Object value3 = entry3.getValue();
                            if (value3 != null) {
                                if (value3 instanceof TypedOutput) {
                                    this.multipartBody.addPart(string, (TypedOutput) value3);
                                } else if (value3 instanceof String) {
                                    this.multipartBody.addPart(string, new TypedString((String) value3));
                                } else {
                                    this.multipartBody.addPart(string, this.converter.toBody(value3));
                                }
                            }
                        }
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (obj == null) {
                        throw new IllegalArgumentException("Body parameter value must not be null.");
                    }
                    if (obj instanceof TypedOutput) {
                        this.body = (TypedOutput) obj;
                        break;
                    } else {
                        this.body = this.converter.toBody(obj);
                        break;
                    }
                default:
                    throw new IllegalArgumentException("Unknown parameter usage: " + paramUsage);
            }
        }
    }

    private void addPathParam(String str, String str2, boolean z8) {
        if (str == null) {
            throw new IllegalArgumentException("Path replacement name must not be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Path replacement \"" + str + "\" value must not be null.");
        }
        try {
            if (z8) {
                String strReplace = URLEncoder.encode(str2, "UTF-8").replace("+", "%20");
                this.relativeUrl = this.relativeUrl.replace("{" + str + "}", strReplace);
            } else {
                this.relativeUrl = this.relativeUrl.replace("{" + str + "}", str2);
            }
        } catch (UnsupportedEncodingException e8) {
            throw new RuntimeException("Unable to convert path parameter \"" + str + "\" value to UTF-8:" + str2, e8);
        }
    }

    private void addQueryParam(String str, String str2, boolean z8) throws UnsupportedEncodingException {
        if (str == null) {
            throw new IllegalArgumentException("Query param name must not be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Query param \"" + str + "\" value must not be null.");
        }
        if (z8) {
            try {
                str2 = URLEncoder.encode(str2, "UTF-8");
            } catch (UnsupportedEncodingException e8) {
                throw new RuntimeException("Unable to convert query parameter \"" + str + "\" value to UTF-8: " + str2, e8);
            }
        }
        StringBuilder sb = this.queryParams;
        if (sb == null) {
            sb = new StringBuilder();
            this.queryParams = sb;
        }
        sb.append(sb.length() > 0 ? '&' : '?');
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }
}
