package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.ss0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4348ss0 extends AbstractC1730Oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3553lt0 f22698a;

    public C4348ss0(C3553lt0 c3553lt0) {
        this.f22698a = c3553lt0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4348ss0)) {
            return false;
        }
        C3553lt0 c3553lt0 = ((C4348ss0) obj).f22698a;
        return this.f22698a.zzc().zzg().equals(c3553lt0.zzc().zzg()) && this.f22698a.zzc().zzi().equals(c3553lt0.zzc().zzi()) && this.f22698a.zzc().zzh().equals(c3553lt0.zzc().zzh());
    }

    public final int hashCode() {
        C3553lt0 c3553lt0 = this.f22698a;
        return Objects.hash(c3553lt0.zzc(), c3553lt0.zzd());
    }

    public final String toString() {
        String strZzi = this.f22698a.zzc().zzi();
        Tw0 tw0Zzg = this.f22698a.zzc().zzg();
        Tw0 tw0 = Tw0.UNKNOWN_PREFIX;
        int iOrdinal = tw0Zzg.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", strZzi, iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f22698a.zzc().zzg() != Tw0.RAW;
    }

    public final C3553lt0 zzb() {
        return this.f22698a;
    }
}
