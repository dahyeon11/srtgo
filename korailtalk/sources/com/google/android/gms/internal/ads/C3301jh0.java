package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3301jh0 extends AbstractC3985ph0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f20292a;

    /* renamed from: b, reason: collision with root package name */
    private final int f20293b;

    /* synthetic */ C3301jh0(String str, boolean z8, boolean z9, InterfaceC2844fh0 interfaceC2844fh0, InterfaceC2959gh0 interfaceC2959gh0, int i8, AbstractC3188ih0 abstractC3188ih0) {
        this.f20292a = str;
        this.f20293b = i8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3985ph0) {
            AbstractC3985ph0 abstractC3985ph0 = (AbstractC3985ph0) obj;
            if (this.f20292a.equals(abstractC3985ph0.zzc())) {
                abstractC3985ph0.zzd();
                abstractC3985ph0.zze();
                abstractC3985ph0.zza();
                abstractC3985ph0.zzb();
                int i8 = this.f20293b;
                int iZzf = abstractC3985ph0.zzf();
                if (i8 == 0) {
                    throw null;
                }
                if (iZzf == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f20292a.hashCode() ^ 1000003;
        if (this.f20293b != 0) {
            return (((((iHashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str = this.f20293b != 1 ? "null" : "READ_AND_WRITE";
        return "FileComplianceOptions{fileOwner=" + this.f20292a + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3985ph0
    public final InterfaceC2844fh0 zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3985ph0
    public final InterfaceC2959gh0 zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3985ph0
    public final String zzc() {
        return this.f20292a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3985ph0
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3985ph0
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3985ph0
    public final int zzf() {
        return this.f20293b;
    }
}
