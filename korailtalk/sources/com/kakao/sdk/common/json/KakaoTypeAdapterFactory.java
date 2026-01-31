package com.kakao.sdk.common.json;

import C3.a;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.w;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class KakaoTypeAdapterFactory implements w {
    @Override // com.google.gson.w
    public <T> TypeAdapter create(Gson gson, a type) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(type, "type");
        Class<Object> rawType = type.getRawType();
        if (rawType == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
        }
        if (Intrinsics.areEqual(rawType, Date.class)) {
            return new KakaoDateTypeAdapter();
        }
        if (rawType.isEnum()) {
            return new KakaoEnumTypeAdapter(rawType);
        }
        return null;
    }
}
