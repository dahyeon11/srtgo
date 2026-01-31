package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Il */
/* loaded from: classes2.dex */
public final class C1478Il {

    /* renamed from: a */
    private static final String f13493a = Integer.toString(0, 36);

    /* renamed from: b */
    private static final String f13494b = Integer.toString(1, 36);

    /* renamed from: c */
    private static final String f13495c = Integer.toString(2, 36);

    /* renamed from: d */
    private static final String f13496d = Integer.toString(3, 36);

    /* renamed from: e */
    private static final String f13497e = Integer.toString(4, 36);

    /* renamed from: f */
    private static final String f13498f = Integer.toString(5, 36);

    /* renamed from: g */
    private static final String f13499g = Integer.toString(6, 36);

    /* renamed from: h */
    private static final String f13500h = Integer.toString(7, 36);

    @Deprecated
    public static final RG0 zza = new RG0() { // from class: com.google.android.gms.internal.ads.Kk
    };
    public final Uri zzb;
    public final String zzc;
    public final AbstractC2845fi zzd;
    public final W9 zze;
    public final List zzf;
    public final String zzg;
    public final AbstractC2394bl0 zzh;

    @Deprecated
    public final List zzi;
    public final Object zzj;
    public final long zzk;

    /* synthetic */ C1478Il(Uri uri, String str, AbstractC2845fi abstractC2845fi, W9 w9, List list, String str2, AbstractC2394bl0 abstractC2394bl0, Object obj, long j8, AbstractC3536ll abstractC3536ll) {
        this.zzb = uri;
        int i8 = AbstractC4239rv.zza;
        this.zzc = null;
        this.zzf = list;
        this.zzg = null;
        this.zzh = abstractC2394bl0;
        C2091Xk0 c2091Xk0 = new C2091Xk0();
        if (abstractC2394bl0.size() > 0) {
            android.support.v4.media.session.f.a(abstractC2394bl0.get(0));
            throw null;
        }
        this.zzi = c2091Xk0.zzi();
        this.zzj = null;
        this.zzk = -9223372036854775807L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1478Il)) {
            return false;
        }
        C1478Il c1478Il = (C1478Il) obj;
        return this.zzb.equals(c1478Il.zzb) && AbstractC2281am0.zzG(null, null) && AbstractC2281am0.zzG(null, null) && AbstractC2281am0.zzG(null, null) && this.zzf.equals(c1478Il.zzf) && AbstractC2281am0.zzG(null, null) && this.zzh.equals(c1478Il.zzh) && AbstractC2281am0.zzG(null, null) && AbstractC2281am0.zzG(-9223372036854775807L, -9223372036854775807L);
    }

    public final int hashCode() {
        return (int) (((((((this.zzb.hashCode() * 923521) + this.zzf.hashCode()) * 961) + this.zzh.hashCode()) * 31) * 31) - Long.MAX_VALUE);
    }
}
