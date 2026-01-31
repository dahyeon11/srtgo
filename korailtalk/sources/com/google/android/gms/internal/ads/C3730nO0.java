package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nO0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3730nO0 extends JO0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final int f21260a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21261b;

    public C3730nO0(int i8, TH th, int i9, C4413tO0 c4413tO0, int i10) {
        super(i8, th, i9);
        this.f21260a = NO0.i(i10, c4413tO0.zzT) ? 1 : 0;
        this.f21261b = this.zzd.zza();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3730nO0 c3730nO0) {
        return Integer.compare(this.f21261b, c3730nO0.f21261b);
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final int zzb() {
        return this.f21260a;
    }

    @Override // com.google.android.gms.internal.ads.JO0
    public final /* bridge */ /* synthetic */ boolean zzc(JO0 jo0) {
        return false;
    }
}
