package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.vi0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4670vi0 extends AbstractC1677Ni0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f23303a;

    /* renamed from: b, reason: collision with root package name */
    private final String f23304b;

    /* synthetic */ C4670vi0(String str, String str2, AbstractC4556ui0 abstractC4556ui0) {
        this.f23303a = str;
        this.f23304b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1677Ni0) {
            AbstractC1677Ni0 abstractC1677Ni0 = (AbstractC1677Ni0) obj;
            String str = this.f23303a;
            if (str != null ? str.equals(abstractC1677Ni0.zzb()) : abstractC1677Ni0.zzb() == null) {
                String str2 = this.f23304b;
                if (str2 != null ? str2.equals(abstractC1677Ni0.zza()) : abstractC1677Ni0.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f23303a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f23304b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.f23303a + ", appId=" + this.f23304b + "}";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1677Ni0
    public final String zza() {
        return this.f23304b;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1677Ni0
    public final String zzb() {
        return this.f23303a;
    }
}
