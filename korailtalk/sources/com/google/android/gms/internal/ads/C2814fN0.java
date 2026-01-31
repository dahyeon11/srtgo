package com.google.android.gms.internal.ads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.fN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2814fN0 extends AbstractC4523uM0 {

    /* renamed from: t, reason: collision with root package name */
    private static final C3658mp f19169t;

    /* renamed from: k, reason: collision with root package name */
    private final PM0[] f19170k;

    /* renamed from: l, reason: collision with root package name */
    private final RG[] f19171l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f19172m;

    /* renamed from: r, reason: collision with root package name */
    private C2699eN0 f19177r;

    /* renamed from: s, reason: collision with root package name */
    private final C4865xM0 f19178s;

    /* renamed from: p, reason: collision with root package name */
    private int f19175p = -1;

    /* renamed from: q, reason: collision with root package name */
    private long[][] f19176q = new long[0][];

    /* renamed from: n, reason: collision with root package name */
    private final Map f19173n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC1151Al0 f19174o = AbstractC1479Il0.zzb(8).zzb(2).zza();

    static {
        C4881xa c4881xa = new C4881xa();
        c4881xa.zza("MergingMediaSource");
        f19169t = c4881xa.zzc();
    }

    public C2814fN0(boolean z8, boolean z9, C4865xM0 c4865xM0, PM0... pm0Arr) {
        this.f19170k = pm0Arr;
        this.f19178s = c4865xM0;
        this.f19172m = new ArrayList(Arrays.asList(pm0Arr));
        this.f19171l = new RG[pm0Arr.length];
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void h(InterfaceC4279sE0 interfaceC4279sE0) {
        super.h(interfaceC4279sE0);
        int i8 = 0;
        while (true) {
            PM0[] pm0Arr = this.f19170k;
            if (i8 >= pm0Arr.length) {
                return;
            }
            l(Integer.valueOf(i8), pm0Arr[i8]);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0
    protected final /* bridge */ /* synthetic */ void k(Object obj, PM0 pm0, RG rg) {
        int iZzb;
        if (this.f19177r != null) {
            return;
        }
        if (this.f19175p == -1) {
            iZzb = rg.zzb();
            this.f19175p = iZzb;
        } else {
            int iZzb2 = rg.zzb();
            int i8 = this.f19175p;
            if (iZzb2 != i8) {
                this.f19177r = new C2699eN0(0);
                return;
            }
            iZzb = i8;
        }
        if (this.f19176q.length == 0) {
            this.f19176q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iZzb, this.f19171l.length);
        }
        this.f19172m.remove(pm0);
        this.f19171l[((Integer) obj).intValue()] = rg;
        if (this.f19172m.isEmpty()) {
            i(this.f19171l[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0
    protected final /* bridge */ /* synthetic */ NM0 o(Object obj, NM0 nm0) {
        if (((Integer) obj).intValue() == 0) {
            return nm0;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzG(LM0 lm0) {
        C2585dN0 c2585dN0 = (C2585dN0) lm0;
        int i8 = 0;
        while (true) {
            PM0[] pm0Arr = this.f19170k;
            if (i8 >= pm0Arr.length) {
                return;
            }
            pm0Arr[i8].zzG(c2585dN0.zzn(i8));
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final LM0 zzI(NM0 nm0, C2703eP0 c2703eP0, long j8) {
        RG[] rgArr = this.f19171l;
        int length = this.f19170k.length;
        LM0[] lm0Arr = new LM0[length];
        int iZza = rgArr[0].zza(nm0.zza);
        for (int i8 = 0; i8 < length; i8++) {
            lm0Arr[i8] = this.f19170k[i8].zzI(nm0.zza(this.f19171l[i8].zzf(iZza)), c2703eP0, j8 - this.f19176q[iZza][i8]);
        }
        return new C2585dN0(this.f19178s, this.f19176q[iZza], lm0Arr);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final C3658mp zzJ() {
        PM0[] pm0Arr = this.f19170k;
        return pm0Arr.length > 0 ? pm0Arr[0].zzJ() : f19169t;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0
    protected final void zzq() {
        super.zzq();
        Arrays.fill(this.f19171l, (Object) null);
        this.f19175p = -1;
        this.f19177r = null;
        this.f19172m.clear();
        Collections.addAll(this.f19172m, this.f19170k);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzt(C3658mp c3658mp) {
        this.f19170k[0].zzt(c3658mp);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4523uM0, com.google.android.gms.internal.ads.AbstractC3726nM0, com.google.android.gms.internal.ads.PM0
    public final void zzz() throws C2699eN0 {
        C2699eN0 c2699eN0 = this.f19177r;
        if (c2699eN0 != null) {
            throw c2699eN0;
        }
        super.zzz();
    }
}
