package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.aD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2220aD implements InterfaceC2335bD {

    /* renamed from: a, reason: collision with root package name */
    private final Map f17925a;

    C2220aD(Map map) {
        this.f17925a = map;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2335bD
    public final InterfaceC3171iX zza(int i8, String str) {
        return (InterfaceC3171iX) this.f17925a.get(str);
    }
}
