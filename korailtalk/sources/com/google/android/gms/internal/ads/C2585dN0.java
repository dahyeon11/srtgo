package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.dN0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2585dN0 implements LM0, KM0 {

    /* renamed from: a, reason: collision with root package name */
    private final LM0[] f18612a;

    /* renamed from: e, reason: collision with root package name */
    private KM0 f18616e;

    /* renamed from: f, reason: collision with root package name */
    private SN0 f18617f;

    /* renamed from: i, reason: collision with root package name */
    private final C4865xM0 f18620i;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f18614c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f18615d = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private IN0 f18619h = new C4751wM0(AbstractC2394bl0.zzm(), AbstractC2394bl0.zzm());

    /* renamed from: b, reason: collision with root package name */
    private final IdentityHashMap f18613b = new IdentityHashMap();

    /* renamed from: g, reason: collision with root package name */
    private LM0[] f18618g = new LM0[0];

    public C2585dN0(C4865xM0 c4865xM0, long[] jArr, LM0... lm0Arr) {
        this.f18620i = c4865xM0;
        this.f18612a = lm0Arr;
        for (int i8 = 0; i8 < lm0Arr.length; i8++) {
            long j8 = jArr[i8];
            if (j8 != 0) {
                this.f18612a[i8] = new ON0(lm0Arr[i8], j8);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zza(long j8, IG0 ig0) {
        LM0[] lm0Arr = this.f18618g;
        return (lm0Arr.length > 0 ? lm0Arr[0] : this.f18612a[0]).zza(j8, ig0);
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzb() {
        return this.f18619h.zzb();
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final long zzc() {
        return this.f18619h.zzc();
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzd() {
        long j8 = -9223372036854775807L;
        for (LM0 lm0 : this.f18618g) {
            long jZzd = lm0.zzd();
            if (jZzd == -9223372036854775807L) {
                if (j8 != -9223372036854775807L && lm0.zze(j8) != j8) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j8 == -9223372036854775807L) {
                for (LM0 lm02 : this.f18618g) {
                    if (lm02 == lm0) {
                        break;
                    }
                    if (lm02.zze(jZzd) != jZzd) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j8 = jZzd;
            } else if (jZzd != j8) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zze(long j8) {
        long jZze = this.f18618g[0].zze(j8);
        int i8 = 1;
        while (true) {
            LM0[] lm0Arr = this.f18618g;
            if (i8 >= lm0Arr.length) {
                return jZze;
            }
            if (lm0Arr[i8].zze(jZze) != jZze) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final long zzf(PO0[] po0Arr, boolean[] zArr, GN0[] gn0Arr, boolean[] zArr2, long j8) {
        int length;
        int length2 = po0Arr.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            length = po0Arr.length;
            if (i9 >= length) {
                break;
            }
            GN0 gn0 = gn0Arr[i9];
            Integer num = gn0 != null ? (Integer) this.f18613b.get(gn0) : null;
            iArr[i9] = num == null ? -1 : num.intValue();
            PO0 po0 = po0Arr[i9];
            if (po0 != null) {
                String str = po0.zze().zzc;
                iArr2[i9] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i9] = -1;
            }
            i9++;
        }
        this.f18613b.clear();
        GN0[] gn0Arr2 = new GN0[length];
        GN0[] gn0Arr3 = new GN0[length];
        PO0[] po0Arr2 = new PO0[length];
        ArrayList arrayList = new ArrayList(this.f18612a.length);
        long j9 = j8;
        int i10 = 0;
        while (i10 < this.f18612a.length) {
            for (int i11 = i8; i11 < po0Arr.length; i11++) {
                gn0Arr3[i11] = iArr[i11] == i10 ? gn0Arr[i11] : null;
                if (iArr2[i11] == i10) {
                    PO0 po02 = po0Arr[i11];
                    po02.getClass();
                    TH th = (TH) this.f18615d.get(po02.zze());
                    th.getClass();
                    po0Arr2[i11] = new C2470cN0(po02, th);
                } else {
                    po0Arr2[i11] = null;
                }
            }
            ArrayList arrayList2 = arrayList;
            PO0[] po0Arr3 = po0Arr2;
            GN0[] gn0Arr4 = gn0Arr3;
            long jZzf = this.f18612a[i10].zzf(po0Arr2, zArr, gn0Arr3, zArr2, j9);
            if (i10 == 0) {
                j9 = jZzf;
            } else if (jZzf != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z8 = false;
            for (int i12 = 0; i12 < po0Arr.length; i12++) {
                if (iArr2[i12] == i10) {
                    GN0 gn02 = gn0Arr4[i12];
                    gn02.getClass();
                    gn0Arr2[i12] = gn02;
                    this.f18613b.put(gn02, Integer.valueOf(i10));
                    z8 = true;
                } else if (iArr[i12] == i10) {
                    F10.zzf(gn0Arr4[i12] == null);
                }
            }
            if (z8) {
                arrayList2.add(this.f18612a[i10]);
            }
            i10++;
            arrayList = arrayList2;
            po0Arr2 = po0Arr3;
            gn0Arr3 = gn0Arr4;
            i8 = 0;
        }
        int i13 = i8;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(gn0Arr2, i13, gn0Arr, i13, length);
        this.f18618g = (LM0[]) arrayList3.toArray(new LM0[i13]);
        this.f18619h = new C4751wM0(arrayList3, AbstractC4220rl0.zzb(arrayList3, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.bN0
            @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
            public final Object apply(Object obj) {
                return ((LM0) obj).zzh().zzc();
            }
        }));
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.KM0, com.google.android.gms.internal.ads.HN0
    public final /* bridge */ /* synthetic */ void zzg(IN0 in0) {
        KM0 km0 = this.f18616e;
        km0.getClass();
        km0.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final SN0 zzh() {
        SN0 sn0 = this.f18617f;
        sn0.getClass();
        return sn0;
    }

    @Override // com.google.android.gms.internal.ads.KM0
    public final void zzi(LM0 lm0) {
        this.f18614c.remove(lm0);
        if (!this.f18614c.isEmpty()) {
            return;
        }
        int i8 = 0;
        for (LM0 lm02 : this.f18612a) {
            i8 += lm02.zzh().zzc;
        }
        TH[] thArr = new TH[i8];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            LM0[] lm0Arr = this.f18612a;
            if (i9 >= lm0Arr.length) {
                this.f18617f = new SN0(thArr);
                KM0 km0 = this.f18616e;
                km0.getClass();
                km0.zzi(this);
                return;
            }
            SN0 sn0Zzh = lm0Arr[i9].zzh();
            int i11 = sn0Zzh.zzc;
            int i12 = 0;
            while (i12 < i11) {
                TH thZzb = sn0Zzh.zzb(i12);
                Q5[] q5Arr = new Q5[thZzb.zzb];
                for (int i13 = 0; i13 < thZzb.zzb; i13++) {
                    Q5 q5Zzb = thZzb.zzb(i13);
                    O4 o4Zzb = q5Zzb.zzb();
                    String str = q5Zzb.zzb;
                    if (str == null) {
                        str = "";
                    }
                    o4Zzb.zzK(i9 + ":" + str);
                    q5Arr[i13] = o4Zzb.zzad();
                }
                TH th = new TH(i9 + ":" + thZzb.zzc, q5Arr);
                this.f18615d.put(th, thZzb);
                thArr[i10] = th;
                i12++;
                i10++;
            }
            i9++;
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzj(long j8, boolean z8) {
        for (LM0 lm0 : this.f18618g) {
            lm0.zzj(j8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzk() {
        int i8 = 0;
        while (true) {
            LM0[] lm0Arr = this.f18612a;
            if (i8 >= lm0Arr.length) {
                return;
            }
            lm0Arr[i8].zzk();
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0
    public final void zzl(KM0 km0, long j8) {
        this.f18616e = km0;
        Collections.addAll(this.f18614c, this.f18612a);
        int i8 = 0;
        while (true) {
            LM0[] lm0Arr = this.f18612a;
            if (i8 >= lm0Arr.length) {
                return;
            }
            lm0Arr[i8].zzl(this, j8);
            i8++;
        }
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final void zzm(long j8) {
        this.f18619h.zzm(j8);
    }

    public final LM0 zzn(int i8) {
        LM0 lm0 = this.f18612a[i8];
        return lm0 instanceof ON0 ? ((ON0) lm0).zzn() : lm0;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzo(C2685eG0 c2685eG0) {
        if (this.f18614c.isEmpty()) {
            return this.f18619h.zzo(c2685eG0);
        }
        int size = this.f18614c.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((LM0) this.f18614c.get(i8)).zzo(c2685eG0);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.LM0, com.google.android.gms.internal.ads.IN0
    public final boolean zzp() {
        return this.f18619h.zzp();
    }
}
