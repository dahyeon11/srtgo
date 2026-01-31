package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ri0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4214ri0 extends AbstractC1555Ki0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f22509a;

    /* renamed from: b, reason: collision with root package name */
    private final String f22510b;

    /* synthetic */ C4214ri0(int i8, String str, AbstractC4101qi0 abstractC4101qi0) {
        this.f22509a = i8;
        this.f22510b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1555Ki0) {
            AbstractC1555Ki0 abstractC1555Ki0 = (AbstractC1555Ki0) obj;
            if (this.f22509a == abstractC1555Ki0.zza() && ((str = this.f22510b) != null ? str.equals(abstractC1555Ki0.zzb()) : abstractC1555Ki0.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22510b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f22509a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f22509a + ", sessionToken=" + this.f22510b + "}";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1555Ki0
    public final int zza() {
        return this.f22509a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1555Ki0
    public final String zzb() {
        return this.f22510b;
    }
}
