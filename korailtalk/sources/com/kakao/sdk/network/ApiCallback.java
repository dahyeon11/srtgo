package com.kakao.sdk.network;

import C7.K;
import com.kakao.sdk.common.model.ApiError;
import com.kakao.sdk.common.model.ApiErrorCause;
import com.kakao.sdk.common.model.ApiErrorResponse;
import com.kakao.sdk.common.util.KakaoJson;
import com.kakao.sdk.common.util.SdkLog;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.InterfaceC6201b;
import retrofit2.h;
import retrofit2.w;

/* loaded from: classes.dex */
public abstract class ApiCallback<T> implements retrofit2.d {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Throwable translateError(Throwable t8) {
            K kErrorBody;
            Intrinsics.checkNotNullParameter(t8, "t");
            try {
                if (t8 instanceof h) {
                    w<?> wVarResponse = ((h) t8).response();
                    String strString = null;
                    if (wVarResponse != null && (kErrorBody = wVarResponse.errorBody()) != null) {
                        strString = kErrorBody.string();
                    }
                    KakaoJson kakaoJson = KakaoJson.INSTANCE;
                    Intrinsics.checkNotNull(strString);
                    ApiErrorResponse apiErrorResponse = (ApiErrorResponse) kakaoJson.fromJson(strString, ApiErrorResponse.class);
                    ApiErrorCause apiErrorCause = (ApiErrorCause) kakaoJson.fromJson(String.valueOf(apiErrorResponse.getCode()), ApiErrorCause.class);
                    if (apiErrorCause == null) {
                        apiErrorCause = ApiErrorCause.Unknown;
                    }
                    return new ApiError(((h) t8).code(), apiErrorCause, apiErrorResponse);
                }
            } catch (Throwable th) {
                t8 = th;
            }
            return t8;
        }

        private Companion() {
        }
    }

    public abstract void onComplete(T t8, Throwable th);

    @Override // retrofit2.d
    public void onFailure(InterfaceC6201b<T> call, Throwable t8) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(t8, "t");
        Throwable origin = ExceptionWrapperKt.getOrigin(t8);
        SdkLog.Companion.e(origin);
        onComplete(null, origin);
    }

    @Override // retrofit2.d
    public void onResponse(InterfaceC6201b<T> call, w<T> response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        T tBody = response.body();
        if (tBody == null) {
            onFailure(call, Companion.translateError(new h(response)));
        } else {
            SdkLog.Companion.i(tBody);
            onComplete(tBody, null);
        }
    }
}
