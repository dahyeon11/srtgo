package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.al0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2279al0 extends AbstractC2394bl0 {

    /* renamed from: c, reason: collision with root package name */
    final transient int f18021c;

    /* renamed from: d, reason: collision with root package name */
    final transient int f18022d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ AbstractC2394bl0 f18023e;

    C2279al0(AbstractC2394bl0 abstractC2394bl0, int i8, int i9) {
        this.f18023e = abstractC2394bl0;
        this.f18021c = i8;
        this.f18022d = i9;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int b() {
        return this.f18023e.c() + this.f18021c + this.f18022d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final int c() {
        return this.f18023e.c() + this.f18021c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final Object[] d() {
        return this.f18023e.d();
    }

    @Override // java.util.List
    public final Object get(int i8) {
        AbstractC1188Bj0.zza(i8, this.f18022d, "index");
        return this.f18023e.get(i8 + this.f18021c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18022d;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2394bl0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i8, int i9) {
        return subList(i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2009Vk0
    final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2394bl0
    /* renamed from: zzh */
    public final AbstractC2394bl0 subList(int i8, int i9) {
        AbstractC1188Bj0.zzi(i8, i9, this.f18022d);
        int i10 = this.f18021c;
        return this.f18023e.subList(i8 + i10, i9 + i10);
    }
}
