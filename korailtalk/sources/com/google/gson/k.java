package com.google.gson;

/* loaded from: classes2.dex */
public final class k extends i {
    public static final k INSTANCE = new k();

    @Deprecated
    public k() {
    }

    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    public int hashCode() {
        return k.class.hashCode();
    }

    @Override // com.google.gson.i
    public k deepCopy() {
        return INSTANCE;
    }
}
