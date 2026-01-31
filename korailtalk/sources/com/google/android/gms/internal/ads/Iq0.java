package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class Iq0 extends AbstractC2287ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final Gq0 f13503a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13504b;

    /* renamed from: c, reason: collision with root package name */
    private final Fq0 f13505c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC2287ap0 f13506d;

    /* synthetic */ Iq0(Gq0 gq0, String str, Fq0 fq0, AbstractC2287ap0 abstractC2287ap0, Hq0 hq0) {
        this.f13503a = gq0;
        this.f13504b = str;
        this.f13505c = fq0;
        this.f13506d = abstractC2287ap0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Iq0)) {
            return false;
        }
        Iq0 iq0 = (Iq0) obj;
        return iq0.f13505c.equals(this.f13505c) && iq0.f13506d.equals(this.f13506d) && iq0.f13504b.equals(this.f13504b) && iq0.f13503a.equals(this.f13503a);
    }

    public final int hashCode() {
        return Objects.hash(Iq0.class, this.f13504b, this.f13505c, this.f13506d, this.f13503a);
    }

    public final String toString() {
        Gq0 gq0 = this.f13503a;
        AbstractC2287ap0 abstractC2287ap0 = this.f13506d;
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f13504b + ", dekParsingStrategy: " + String.valueOf(this.f13505c) + ", dekParametersForNewKeys: " + String.valueOf(abstractC2287ap0) + ", variant: " + String.valueOf(gq0) + ")";
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1730Oo0
    public final boolean zza() {
        return this.f13503a != Gq0.zzb;
    }

    public final AbstractC2287ap0 zzb() {
        return this.f13506d;
    }

    public final Gq0 zzc() {
        return this.f13503a;
    }

    public final String zzd() {
        return this.f13504b;
    }
}
