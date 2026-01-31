package com.kakao.sdk.common.util;

/* loaded from: classes.dex */
public enum SdkLogLevel {
    V(0, "[💬]"),
    D(1, "[ℹ️]"),
    I(2, "[🔬]"),
    W(3, "[⚠️]"),
    E(4, "[‼️]");

    private final int level;
    private final String symbol;

    SdkLogLevel(int i8, String str) {
        this.level = i8;
        this.symbol = str;
    }

    public final int getLevel() {
        return this.level;
    }

    public final String getSymbol() {
        return this.symbol;
    }
}
