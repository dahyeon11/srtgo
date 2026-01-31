package com.kakao.sdk.network;

import C7.B;
import C7.H;
import C7.J;
import C7.K;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.util.KakaoJson;
import f7.p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class UtilityKt {
    public static final J proceedApiError(B.a aVar, H request, p errorHandler) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        J jProceed = aVar.proceed(request);
        K kBody = jProceed.body();
        String strString = kBody == null ? null : kBody.string();
        J newResponse = jProceed.newBuilder().body(K.create(kBody == null ? null : kBody.contentType(), strString == null ? "" : strString)).build();
        Intrinsics.checkNotNullExpressionValue(newResponse, "newResponse");
        if (newResponse.isSuccessful()) {
            return newResponse;
        }
        ApiErrorResponse apiErrorResponse = strString == null ? null : (ApiErrorResponse) KakaoJson.INSTANCE.fromJson(strString, ApiErrorResponse.class);
        ApiErrorCause apiErrorCause = apiErrorResponse != null ? (ApiErrorCause) KakaoJson.INSTANCE.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class) : null;
        return apiErrorCause != null ? (J) errorHandler.invoke(newResponse, new ApiError(newResponse.code(), apiErrorCause, apiErrorResponse)) : newResponse;
    }

    public static final J proceedBodyString(B.a aVar, H request, p bodyHandler) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(bodyHandler, "bodyHandler");
        J jProceed = aVar.proceed(request);
        K kBody = jProceed.body();
        String strString = kBody == null ? null : kBody.string();
        J newResponse = jProceed.newBuilder().body(K.create(kBody != null ? kBody.contentType() : null, strString == null ? "" : strString)).build();
        Intrinsics.checkNotNullExpressionValue(newResponse, "newResponse");
        return (J) bodyHandler.invoke(newResponse, strString);
    }
}
