package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* renamed from: com.google.android.gms.internal.ads.pt, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4008pt {

    /* renamed from: a, reason: collision with root package name */
    private BigInteger f21819a = BigInteger.ONE;

    /* renamed from: b, reason: collision with root package name */
    private String f21820b = "0";

    public final synchronized String zza() {
        String string;
        string = this.f21819a.toString();
        this.f21819a = this.f21819a.add(BigInteger.ONE);
        this.f21820b = string;
        return string;
    }

    public final synchronized String zzb() {
        return this.f21820b;
    }
}
