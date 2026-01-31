package com.kakao.sdk.common.util;

import com.google.gson.Gson;
import com.google.gson.c;
import com.google.gson.e;
import com.kakao.sdk.common.json.Exclude;
import com.kakao.sdk.common.json.KakaoTypeAdapterFactory;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KakaoJson {
    public static final KakaoJson INSTANCE = new KakaoJson();
    private static final Gson base;
    private static final e internalBuilder;
    private static final KakaoJson$kakaoExclusionStrategy$1 kakaoExclusionStrategy;
    private static final Gson pretty;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.gson.a, com.kakao.sdk.common.util.KakaoJson$kakaoExclusionStrategy$1] */
    static {
        ?? r02 = new com.google.gson.a() { // from class: com.kakao.sdk.common.util.KakaoJson$kakaoExclusionStrategy$1
            @Override // com.google.gson.a
            public boolean shouldSkipClass(Class<?> cls) {
                return false;
            }

            @Override // com.google.gson.a
            public boolean shouldSkipField(com.google.gson.b bVar) {
                Intrinsics.checkNotNull(bVar);
                return ((Exclude) bVar.getAnnotation(Exclude.class)) != null;
            }
        };
        kakaoExclusionStrategy = r02;
        e eVarAddDeserializationExclusionStrategy = new e().registerTypeAdapterFactory(new KakaoTypeAdapterFactory()).setFieldNamingPolicy(c.LOWER_CASE_WITH_UNDERSCORES).addSerializationExclusionStrategy(r02).addDeserializationExclusionStrategy(r02);
        internalBuilder = eVarAddDeserializationExclusionStrategy;
        Gson gsonCreate = eVarAddDeserializationExclusionStrategy.create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "internalBuilder.create()");
        base = gsonCreate;
        Gson gsonCreate2 = eVarAddDeserializationExclusionStrategy.setPrettyPrinting().create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate2, "internalBuilder.setPrettyPrinting().create()");
        pretty = gsonCreate2;
    }

    private KakaoJson() {
    }

    public final <T> T fromJson(String string, Type type1) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(type1, "type1");
        return (T) base.fromJson(string, type1);
    }

    public final Gson getBase() {
        return base;
    }

    public final Gson getPretty() {
        return pretty;
    }

    public final <T> List<T> listFromJson(String string, Class<T> type) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(type, "type");
        Object objFromJson = base.fromJson(string, C3.a.getParameterized(List.class, type).getType());
        Intrinsics.checkNotNullExpressionValue(objFromJson, "base.fromJson(string, TypeToken.getParameterized(List::class.java, type).type)");
        return (List) objFromJson;
    }

    public final <T> T parameterizedFromJson(String string, Type type1, Type type2) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(type1, "type1");
        Intrinsics.checkNotNullParameter(type2, "type2");
        return (T) base.fromJson(string, C3.a.getParameterized(type1, type2).getType());
    }

    public final <T> String toJson(T t8) {
        String json = base.toJson(t8);
        Intrinsics.checkNotNullExpressionValue(json, "base.toJson(model)");
        return json;
    }
}
