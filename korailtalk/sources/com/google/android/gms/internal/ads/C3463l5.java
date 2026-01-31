package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3463l5 implements InterfaceC2769f1 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2769f1 f20629a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3122i5 f20630b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f20631c = new SparseArray();

    public C3463l5(InterfaceC2769f1 interfaceC2769f1, InterfaceC3122i5 interfaceC3122i5) {
        this.f20629a = interfaceC2769f1;
        this.f20630b = interfaceC3122i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final void zzD() {
        this.f20629a.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final void zzO(C1 c12) {
        this.f20629a.zzO(c12);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2769f1
    public final K1 zzw(int i8, int i9) {
        if (i9 != 3) {
            return this.f20629a.zzw(i8, i9);
        }
        C3691n5 c3691n5 = (C3691n5) this.f20631c.get(i8);
        if (c3691n5 != null) {
            return c3691n5;
        }
        C3691n5 c3691n52 = new C3691n5(this.f20629a.zzw(i8, 3), this.f20630b);
        this.f20631c.put(i8, c3691n52);
        return c3691n52;
    }
}
