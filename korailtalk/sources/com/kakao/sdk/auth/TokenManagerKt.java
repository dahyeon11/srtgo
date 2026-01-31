package com.kakao.sdk.auth;

import com.kakao.sdk.common.util.SdkLog;
import f7.InterfaceC5519a;

/* loaded from: classes.dex */
public final class TokenManagerKt {
    private static final <T> T parseOrNull(InterfaceC5519a interfaceC5519a) {
        try {
            return (T) interfaceC5519a.invoke();
        } catch (Exception e8) {
            SdkLog.Companion.e(e8);
            return null;
        }
    }
}
