package com.kakao.sdk.auth;

import com.kakao.sdk.auth.model.OAuthToken;

/* loaded from: classes.dex */
public interface TokenManageable {
    void clear();

    OAuthToken getToken();

    void setToken(OAuthToken oAuthToken);
}
