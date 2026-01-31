package com.kakao.sdk.auth;

/* loaded from: classes.dex */
public final class Constants {
    public static final String ACCESS_TOKEN = "access_token";
    public static final String ACCOUNT_LOGIN_PARAM_CONTINUE = "continue";
    public static final String ACCOUNT_LOGIN_PATH = "/sdks/page";
    public static final String AGT = "agt";
    public static final String AGT_PATH = "api/agt";
    public static final String ANDROID_KEY_HASH = "android_key_hash";
    public static final String APPROVAL_TYPE = "approval_type";
    public static final String AUTHORIZATION_CODE = "authorization_code";
    public static final String AUTHORIZE_PATH = "oauth/authorize";
    public static final String CAPRI_LOGGED_IN_ACTIVITY = "com.kakao.talk.intent.action.CAPRI_LOGGED_IN_ACTIVITY";
    public static final String CHANNEL_PUBLIC_ID = "channel_public_id";
    public static final String CLIENT_ID = "client_id";
    public static final String CODE = "code";
    public static final String CODE_CHALLENGE = "code_challenge";
    public static final String CODE_CHALLENGE_ALGORITHM = "SHA-256";
    public static final String CODE_CHALLENGE_METHOD = "code_challenge_method";
    public static final String CODE_CHALLENGE_METHOD_VALUE = "S256";
    public static final String CODE_VERIFIER = "code_verifier";
    public static final String CODE_VERIFIER_ALGORITHM = "SHA-512";
    public static final String ERROR = "error";
    public static final String ERROR_DESCRIPTION = "error_description";
    public static final String EXPIRES_IN = "expires_in";
    public static final String GRANT_TYPE = "grant_type";
    public static final String KA_HEADER = "ka";
    public static final String KEY_BUNDLE = "key.bundle";
    public static final String KEY_CUSTOM_TABS_OPENED = "key.customtabs.opened";
    public static final String KEY_EXCEPTION = "key.exception";
    public static final String KEY_FULL_URI = "key.full_authorize_uri";
    public static final String KEY_HEADERS = "key.extra.headers";
    public static final String KEY_LOGIN_INTENT = "key.login.intent";
    public static final String KEY_REDIRECT_URI = "key.redirect_uri";
    public static final String KEY_REQUEST_CODE = "key.request.code";
    public static final String KEY_RESULT_RECEIVER = "key.result.receiver";
    public static final String KEY_URL = "key.url";
    public static final String LOGIN_HINT = "login_hint";
    public static final String NONCE = "nonce";
    public static final String PROMPT = "prompt";
    public static final String REDIRECT_URI = "redirect_uri";
    public static final String REFRESH_TOKEN = "refresh_token";
    public static final String REFRESH_TOKEN_EXPIRES_IN = "refresh_token_expires_in";
    public static final String RESPONSE_TYPE = "response_type";
    public static final String SCOPE = "scope";
    public static final String SECURE_RESOURCE = "secure_resource";
    public static final String SERVICE_TERMS = "service_terms";
    public static final String STATE = "state";
    public static final String TOKEN_PATH = "oauth/token";
    public static final String TOKEN_TYPE = "token_type";
    public static final Constants INSTANCE = new Constants();
    private static final String EXTRA_APPLICATION_KEY = "com.kakao.sdk.talk.appKey";
    private static final String EXTRA_REDIRECT_URI = "com.kakao.sdk.talk.redirectUri";
    private static final String EXTRA_KA_HEADER = "com.kakao.sdk.talk.kaHeader";
    private static final String EXTRA_EXTRAPARAMS = "com.kakao.sdk.talk.extraparams";
    private static final String EXTRA_REDIRECT_URL = "com.kakao.sdk.talk.redirectUrl";
    private static final String EXTRA_ERROR_DESCRIPTION = "com.kakao.sdk.talk.error.description";
    private static final String EXTRA_ERROR_TYPE = "com.kakao.sdk.talk.error.type";
    private static final String NOT_SUPPORT_ERROR = "NotSupportError";
    private static final String UNKNOWN_ERROR = "unknown";

    private Constants() {
    }

    public final String getEXTRA_APPLICATION_KEY() {
        return EXTRA_APPLICATION_KEY;
    }

    public final String getEXTRA_ERROR_DESCRIPTION() {
        return EXTRA_ERROR_DESCRIPTION;
    }

    public final String getEXTRA_ERROR_TYPE() {
        return EXTRA_ERROR_TYPE;
    }

    public final String getEXTRA_EXTRAPARAMS() {
        return EXTRA_EXTRAPARAMS;
    }

    public final String getEXTRA_KA_HEADER() {
        return EXTRA_KA_HEADER;
    }

    public final String getEXTRA_REDIRECT_URI() {
        return EXTRA_REDIRECT_URI;
    }

    public final String getEXTRA_REDIRECT_URL() {
        return EXTRA_REDIRECT_URL;
    }

    public final String getNOT_SUPPORT_ERROR() {
        return NOT_SUPPORT_ERROR;
    }

    public final String getUNKNOWN_ERROR() {
        return UNKNOWN_ERROR;
    }
}
