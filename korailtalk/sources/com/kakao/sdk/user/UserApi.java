package com.kakao.sdk.user;

import R6.G;
import com.kakao.sdk.common.json.IntDate;
import com.kakao.sdk.user.model.AccessTokenInfo;
import com.kakao.sdk.user.model.ScopeInfo;
import com.kakao.sdk.user.model.User;
import com.kakao.sdk.user.model.UserServiceTerms;
import com.kakao.sdk.user.model.UserShippingAddresses;
import d8.c;
import d8.e;
import d8.f;
import d8.o;
import d8.t;
import java.util.Date;
import java.util.Map;
import retrofit2.InterfaceC6201b;

/* loaded from: classes.dex */
public interface UserApi {

    public static final class DefaultImpls {
        public static /* synthetic */ InterfaceC6201b me$default(UserApi userApi, boolean z8, String str, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: me");
            }
            if ((i8 & 1) != 0) {
                z8 = true;
            }
            if ((i8 & 2) != 0) {
                str = null;
            }
            return userApi.me(z8, str);
        }

        public static /* synthetic */ InterfaceC6201b scopes$default(UserApi userApi, String str, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scopes");
            }
            if ((i8 & 1) != 0) {
                str = null;
            }
            return userApi.scopes(str);
        }

        public static /* synthetic */ InterfaceC6201b serviceTerms$default(UserApi userApi, String str, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: serviceTerms");
            }
            if ((i8 & 1) != 0) {
                str = null;
            }
            return userApi.serviceTerms(str);
        }

        public static /* synthetic */ InterfaceC6201b shippingAddresses$default(UserApi userApi, Long l8, Date date, Integer num, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: shippingAddresses");
            }
            if ((i8 & 1) != 0) {
                l8 = null;
            }
            if ((i8 & 2) != 0) {
                date = null;
            }
            if ((i8 & 4) != 0) {
                num = null;
            }
            return userApi.shippingAddresses(l8, date, num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InterfaceC6201b signup$default(UserApi userApi, Map map, int i8, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signup");
            }
            if ((i8 & 1) != 0) {
                map = null;
            }
            return userApi.signup(map);
        }
    }

    @f(Constants.V1_ACCESS_TOKEN_INFO_PATH)
    InterfaceC6201b<AccessTokenInfo> accessTokenInfo();

    @o(Constants.V1_LOGOUT_PATH)
    InterfaceC6201b<G> logout();

    @f(Constants.V2_ME_PATH)
    InterfaceC6201b<User> me(@t("secure_resource") boolean z8, @t(Constants.PROPERTY_KEYS) String str);

    @o(Constants.V2_REVOKE_SCOPE)
    @e
    InterfaceC6201b<ScopeInfo> revokeScopes(@c(Constants.SCOPES) String str);

    @f(Constants.V2_SCOPES)
    InterfaceC6201b<ScopeInfo> scopes(@t(Constants.SCOPES) String str);

    @f(Constants.V1_SERVICE_TERMS_PATH)
    InterfaceC6201b<UserServiceTerms> serviceTerms(@t(Constants.EXTRA) String str);

    @f(Constants.V1_SHIPPING_ADDRESSES_PATH)
    InterfaceC6201b<UserShippingAddresses> shippingAddresses(@t(Constants.ADDRESS_ID) Long l8, @t(Constants.FROM_UPDATED_AT) @IntDate Date date, @t(Constants.PAGE_SIZE) Integer num);

    @o(Constants.V1_SIGNUP_PATH)
    @e
    InterfaceC6201b<G> signup(@c(Constants.PROPERTIES) Map<String, String> map);

    @o(Constants.V1_UNLINK_PATH)
    InterfaceC6201b<G> unlink();

    @o(Constants.V1_UPDATE_PROFILE_PATH)
    @e
    InterfaceC6201b<G> updateProfile(@c(Constants.PROPERTIES) Map<String, String> map);
}
