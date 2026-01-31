package com.kakao.sdk.common.model;

import com.google.gson.l;

/* loaded from: classes.dex */
public interface ContextInfo {
    String getAppVer();

    l getExtras();

    String getKaHeader();

    byte[] getSalt();

    String getSigningKeyHash();
}
