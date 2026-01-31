package com.google.firebase.installations;

/* loaded from: classes2.dex */
public class i extends l3.e {

    /* renamed from: a, reason: collision with root package name */
    private final a f25728a;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE
    }

    public i(a aVar) {
        this.f25728a = aVar;
    }

    public a getStatus() {
        return this.f25728a;
    }

    public i(String str, a aVar) {
        super(str);
        this.f25728a = aVar;
    }

    public i(String str, a aVar, Throwable th) {
        super(str, th);
        this.f25728a = aVar;
    }
}
