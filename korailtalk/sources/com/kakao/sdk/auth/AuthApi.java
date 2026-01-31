package com.kakao.sdk.auth;

import com.kakao.sdk.auth.model.AccessTokenResponse;
import com.kakao.sdk.auth.model.AgtResponse;
import d8.c;
import d8.e;
import d8.o;
import retrofit2.InterfaceC6201b;

/* loaded from: classes.dex */
public interface AuthApi {

    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC6201b issueAccessToken$default(AuthApi authApi, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i8, Object obj) {
            if (obj == null) {
                return authApi.issueAccessToken(str, str2, str3, str4, (i8 & 16) != 0 ? null : str5, (i8 & 32) != 0 ? null : str6, (i8 & 64) != 0 ? Constants.AUTHORIZATION_CODE : str7);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: issueAccessToken");
        }

        public static /* synthetic */ InterfaceC6201b refreshToken$default(AuthApi authApi, String str, String str2, String str3, String str4, String str5, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshToken");
            }
            if ((i8 & 8) != 0) {
                str4 = null;
            }
            String str6 = str4;
            if ((i8 & 16) != 0) {
                str5 = Constants.REFRESH_TOKEN;
            }
            return authApi.refreshToken(str, str2, str3, str6, str5);
        }
    }

    @o(Constants.AGT_PATH)
    @e
    InterfaceC6201b<AgtResponse> agt(@c(Constants.CLIENT_ID) String str, @c(Constants.ACCESS_TOKEN) String str2);

    @o(Constants.TOKEN_PATH)
    @e
    InterfaceC6201b<AccessTokenResponse> issueAccessToken(@c(Constants.CLIENT_ID) String str, @c(Constants.ANDROID_KEY_HASH) String str2, @c(Constants.CODE) String str3, @c(Constants.REDIRECT_URI) String str4, @c(Constants.CODE_VERIFIER) String str5, @c(Constants.APPROVAL_TYPE) String str6, @c(Constants.GRANT_TYPE) String str7);

    @o(Constants.TOKEN_PATH)
    @e
    InterfaceC6201b<AccessTokenResponse> refreshToken(@c(Constants.CLIENT_ID) String str, @c(Constants.ANDROID_KEY_HASH) String str2, @c(Constants.REFRESH_TOKEN) String str3, @c(Constants.APPROVAL_TYPE) String str4, @c(Constants.GRANT_TYPE) String str5);
}
