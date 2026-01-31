package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.li0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3531li0 extends AbstractC4898xi0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20730a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20731b;

    /* synthetic */ C3531li0(String str, String str2, AbstractC3417ki0 abstractC3417ki0) {
        this.f20730a = str;
        this.f20731b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4898xi0) {
            AbstractC4898xi0 abstractC4898xi0 = (AbstractC4898xi0) obj;
            String str = this.f20730a;
            if (str != null ? str.equals(abstractC4898xi0.zzb()) : abstractC4898xi0.zzb() == null) {
                String str2 = this.f20731b;
                if (str2 != null ? str2.equals(abstractC4898xi0.zza()) : abstractC4898xi0.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f20730a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f20731b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayDismissRequest{sessionToken=" + this.f20730a + ", appId=" + this.f20731b + "}";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4898xi0
    public final String zza() {
        return this.f20731b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4898xi0
    public final String zzb() {
        return this.f20730a;
    }
}
