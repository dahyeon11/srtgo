package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
public final class Eq0 {

    /* renamed from: a, reason: collision with root package name */
    private Gq0 f12862a;

    /* renamed from: b, reason: collision with root package name */
    private String f12863b;

    /* renamed from: c, reason: collision with root package name */
    private Fq0 f12864c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC2287ap0 f12865d;

    /* synthetic */ Eq0(Dq0 dq0) {
    }

    public final Eq0 zza(AbstractC2287ap0 abstractC2287ap0) {
        this.f12865d = abstractC2287ap0;
        return this;
    }

    public final Eq0 zzb(Fq0 fq0) {
        this.f12864c = fq0;
        return this;
    }

    public final Eq0 zzc(String str) {
        this.f12863b = str;
        return this;
    }

    public final Eq0 zzd(Gq0 gq0) {
        this.f12862a = gq0;
        return this;
    }

    public final Iq0 zze() throws GeneralSecurityException {
        if (this.f12862a == null) {
            this.f12862a = Gq0.zzb;
        }
        if (this.f12863b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        Fq0 fq0 = this.f12864c;
        if (fq0 == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        AbstractC2287ap0 abstractC2287ap0 = this.f12865d;
        if (abstractC2287ap0 == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (abstractC2287ap0.zza()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((fq0.equals(Fq0.zza) && (abstractC2287ap0 instanceof Sp0)) || ((fq0.equals(Fq0.zzc) && (abstractC2287ap0 instanceof C3661mq0)) || ((fq0.equals(Fq0.zzb) && (abstractC2287ap0 instanceof C2520cr0)) || ((fq0.equals(Fq0.zzd) && (abstractC2287ap0 instanceof C4456tp0)) || ((fq0.equals(Fq0.zze) && (abstractC2287ap0 instanceof Fp0)) || (fq0.equals(Fq0.zzf) && (abstractC2287ap0 instanceof C2977gq0))))))) {
            return new Iq0(this.f12862a, this.f12863b, this.f12864c, this.f12865d, null);
        }
        throw new GeneralSecurityException("Cannot use parsing strategy " + this.f12864c.toString() + " when new keys are picked according to " + String.valueOf(this.f12865d) + ".");
    }
}
