package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public class RS extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f16117a;

    public RS(int i8) {
        this.f16117a = i8;
    }

    public final int zza() {
        return this.f16117a;
    }

    public RS(int i8, String str) {
        super(str);
        this.f16117a = i8;
    }

    public RS(int i8, String str, Throwable th) {
        super(str, th);
        this.f16117a = 1;
    }
}
