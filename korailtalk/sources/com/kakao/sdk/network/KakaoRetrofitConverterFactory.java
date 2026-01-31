package com.kakao.sdk.network;

import S6.r;
import com.kakao.sdk.common.json.IntDate;
import com.kakao.sdk.common.json.MapToQuery;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.Utility;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.f;
import retrofit2.x;

/* loaded from: classes.dex */
public final class KakaoRetrofitConverterFactory extends f.a {
    /* renamed from: stringConverter$lambda-0 */
    public static final String m399stringConverter$lambda0(Enum r22) {
        Intrinsics.checkNotNullParameter(r22, "enum");
        String json = KakaoJson.INSTANCE.toJson(r22);
        String strSubstring = json.substring(1, json.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    /* renamed from: stringConverter$lambda-2$lambda-1 */
    public static final String m400stringConverter$lambda2$lambda1(Date value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return String.valueOf(value.getTime() / 1000);
    }

    /* renamed from: stringConverter$lambda-4$lambda-3 */
    public static final String m401stringConverter$lambda4$lambda3(Map map) {
        Intrinsics.checkNotNullParameter(map, "map");
        return Utility.INSTANCE.buildQuery(map);
    }

    /* renamed from: stringConverter$lambda-5 */
    public static final String m402stringConverter$lambda5(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return KakaoJson.INSTANCE.toJson(value);
    }

    @Override // retrofit2.f.a
    public f stringConverter(Type type, Annotation[] annotationArr, x xVar) {
        if (Intrinsics.areEqual(type, String.class)) {
            return null;
        }
        if ((type instanceof Class) && ((Class) type).isEnum()) {
            return new f() { // from class: com.kakao.sdk.network.a
                @Override // retrofit2.f
                public final Object convert(Object obj) {
                    return KakaoRetrofitConverterFactory.m399stringConverter$lambda0((Enum) obj);
                }
            };
        }
        if (Intrinsics.areEqual(type, Date.class) && annotationArr != null) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotationArr) {
                if (annotation instanceof IntDate) {
                    arrayList.add(annotation);
                }
            }
            if (((IntDate) r.firstOrNull((List) arrayList)) != null) {
                return new f() { // from class: com.kakao.sdk.network.b
                    @Override // retrofit2.f
                    public final Object convert(Object obj) {
                        return KakaoRetrofitConverterFactory.m400stringConverter$lambda2$lambda1((Date) obj);
                    }
                };
            }
        }
        if ((type instanceof ParameterizedType) && Intrinsics.areEqual(((ParameterizedType) type).getRawType(), Map.class) && annotationArr != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Annotation annotation2 : annotationArr) {
                if (annotation2 instanceof MapToQuery) {
                    arrayList2.add(annotation2);
                }
            }
            if (((MapToQuery) r.firstOrNull((List) arrayList2)) != null) {
                return new f() { // from class: com.kakao.sdk.network.c
                    @Override // retrofit2.f
                    public final Object convert(Object obj) {
                        return KakaoRetrofitConverterFactory.m401stringConverter$lambda4$lambda3((Map) obj);
                    }
                };
            }
        }
        return new f() { // from class: com.kakao.sdk.network.d
            @Override // retrofit2.f
            public final Object convert(Object obj) {
                return KakaoRetrofitConverterFactory.m402stringConverter$lambda5(obj);
            }
        };
    }
}
