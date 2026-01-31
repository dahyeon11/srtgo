package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yf0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2122Yf0 extends AbstractC1958Uf0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17402a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17403b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17404c;

    /* synthetic */ C2122Yf0(String str, boolean z8, boolean z9, AbstractC2081Xf0 abstractC2081Xf0) {
        this.f17402a = str;
        this.f17403b = z8;
        this.f17404c = z9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1958Uf0) {
            AbstractC1958Uf0 abstractC1958Uf0 = (AbstractC1958Uf0) obj;
            if (this.f17402a.equals(abstractC1958Uf0.zzb()) && this.f17403b == abstractC1958Uf0.zzd() && this.f17404c == abstractC1958Uf0.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f17402a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f17403b ? 1237 : 1231)) * 1000003) ^ (true != this.f17404c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f17402a + ", shouldGetAdvertisingId=" + this.f17403b + ", isGooglePlayServicesAvailable=" + this.f17404c + "}";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1958Uf0
    public final String zzb() {
        return this.f17402a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1958Uf0
    public final boolean zzc() {
        return this.f17404c;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1958Uf0
    public final boolean zzd() {
        return this.f17403b;
    }
}
