package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class NO0 extends SO0 implements FG0 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC1683Nl0 f14908j = AbstractC1683Nl0.zzb(new Comparator() { // from class: com.google.android.gms.internal.ads.cO0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = (Integer) obj;
            Integer num2 = (Integer) obj2;
            if (num.intValue() == -1) {
                return num2.intValue() == -1 ? 0 : -1;
            }
            if (num2.intValue() == -1) {
                return 1;
            }
            return num.intValue() - num2.intValue();
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final Object f14909d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f14910e;

    /* renamed from: f, reason: collision with root package name */
    private C4413tO0 f14911f;

    /* renamed from: g, reason: collision with root package name */
    private FO0 f14912g;

    /* renamed from: h, reason: collision with root package name */
    private C3940pF0 f14913h;

    /* renamed from: i, reason: collision with root package name */
    private final XN0 f14914i;
    public final Context zza;

    public NO0(Context context) {
        XN0 xn0 = new XN0();
        C4413tO0 c4413tO0Zzd = C4413tO0.zzd(context);
        this.f14909d = new Object();
        this.zza = context != null ? context.getApplicationContext() : null;
        this.f14914i = xn0;
        this.f14911f = c4413tO0Zzd;
        this.f14913h = C3940pF0.zza;
        boolean z8 = false;
        if (context != null && AbstractC2281am0.zzN(context)) {
            z8 = true;
        }
        this.f14910e = z8;
        if (!z8 && context != null && AbstractC2281am0.zza >= 32) {
            this.f14912g = FO0.zza(context);
        }
        if (this.f14911f.zzS && context == null) {
            AbstractC2834fc0.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    static /* bridge */ /* synthetic */ int d(int i8, int i9) {
        if (i8 == 0 || i8 != i9) {
            return Integer.bitCount(i8 & i9);
        }
        return Integer.MAX_VALUE;
    }

    protected static int e(Q5 q52, String str, boolean z8) {
        if (!TextUtils.isEmpty(str) && str.equals(q52.zze)) {
            return 4;
        }
        String strG = g(str);
        String strG2 = g(q52.zze);
        if (strG2 == null || strG == null) {
            return (z8 && strG2 == null) ? 1 : 0;
        }
        if (strG2.startsWith(strG) || strG.startsWith(strG2)) {
            return 3;
        }
        int i8 = AbstractC2281am0.zza;
        return strG2.split(g5.e.STATE_NAME_NONE, 2)[0].equals(strG.split(g5.e.STATE_NAME_NONE, 2)[0]) ? 2 : 0;
    }

    protected static String g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    protected static boolean i(int i8, boolean z8) {
        int i9 = i8 & 7;
        if (i9 != 4) {
            return z8 && i9 == 3;
        }
        return true;
    }

    private static void j(SN0 sn0, C4976yL c4976yL, Map map) {
        for (int i8 = 0; i8 < sn0.zzc; i8++) {
            android.support.v4.media.session.f.a(c4976yL.zzD.get(sn0.zzb(i8)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        boolean z8;
        FO0 fo0;
        synchronized (this.f14909d) {
            try {
                z8 = false;
                if (this.f14911f.zzS && !this.f14910e && AbstractC2281am0.zza >= 32 && (fo0 = this.f14912g) != null && fo0.zzg()) {
                    z8 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            b();
        }
    }

    private static final Pair l(int i8, RO0 ro0, int[][][] iArr, HO0 ho0, Comparator comparator) {
        RandomAccess randomAccessZzn;
        RO0 ro02 = ro0;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 < 2) {
            if (i8 == ro02.zzc(i9)) {
                SN0 sn0Zzd = ro02.zzd(i9);
                for (int i10 = 0; i10 < sn0Zzd.zzc; i10++) {
                    TH thZzb = sn0Zzd.zzb(i10);
                    List listZza = ho0.zza(i9, thZzb, iArr[i9][i10]);
                    boolean[] zArr = new boolean[thZzb.zzb];
                    int i11 = 0;
                    while (i11 < thZzb.zzb) {
                        int i12 = i11 + 1;
                        JO0 jo0 = (JO0) listZza.get(i11);
                        int iZzb = jo0.zzb();
                        if (!zArr[i11] && iZzb != 0) {
                            if (iZzb == 1) {
                                randomAccessZzn = AbstractC2394bl0.zzn(jo0);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(jo0);
                                for (int i13 = i12; i13 < thZzb.zzb; i13++) {
                                    JO0 jo02 = (JO0) listZza.get(i13);
                                    if (jo02.zzb() == 2 && jo0.zzc(jo02)) {
                                        arrayList2.add(jo02);
                                        zArr[i13] = true;
                                    }
                                }
                                randomAccessZzn = arrayList2;
                            }
                            arrayList.add(randomAccessZzn);
                        }
                        i11 = i12;
                    }
                }
            }
            i9++;
            ro02 = ro0;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((JO0) list.get(i14)).zzc;
        }
        JO0 jo03 = (JO0) list.get(0);
        return Pair.create(new OO0(jo03.zzb, iArr2, 0), Integer.valueOf(jo03.zza));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ boolean zzm(com.google.android.gms.internal.ads.NO0 r8, com.google.android.gms.internal.ads.Q5 r9) {
        /*
            java.lang.Object r0 = r8.f14909d
            monitor-enter(r0)
            com.google.android.gms.internal.ads.tO0 r1 = r8.f14911f     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzS     // Catch: java.lang.Throwable -> L8e
            r2 = 1
            if (r1 == 0) goto L90
            boolean r1 = r8.f14910e     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L90
            int r1 = r9.zzA     // Catch: java.lang.Throwable -> L8e
            r3 = 2
            if (r1 <= r3) goto L90
            java.lang.String r1 = r9.zzn     // Catch: java.lang.Throwable -> L8e
            r4 = 32
            r5 = 0
            if (r1 != 0) goto L1b
            goto L65
        L1b:
            int r6 = r1.hashCode()     // Catch: java.lang.Throwable -> L8e
            r7 = 3
            switch(r6) {
                case -2123537834: goto L42;
                case 187078296: goto L38;
                case 187078297: goto L2e;
                case 1504578661: goto L24;
                default: goto L23;
            }
        L23:
            goto L4c
        L24:
            java.lang.String r6 = "audio/eac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r2
            goto L4d
        L2e:
            java.lang.String r6 = "audio/ac4"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r7
            goto L4d
        L38:
            java.lang.String r6 = "audio/ac3"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r5
            goto L4d
        L42:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L4c
            r1 = r3
            goto L4d
        L4c:
            r1 = -1
        L4d:
            if (r1 == 0) goto L56
            if (r1 == r2) goto L56
            if (r1 == r3) goto L56
            if (r1 == r7) goto L56
            goto L65
        L56:
            int r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L90
            com.google.android.gms.internal.ads.FO0 r1 = r8.f14912g     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L90
            boolean r1 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L65
            goto L90
        L65:
            int r1 = com.google.android.gms.internal.ads.AbstractC2281am0.zza     // Catch: java.lang.Throwable -> L8e
            if (r1 < r4) goto L8c
            com.google.android.gms.internal.ads.FO0 r1 = r8.f14912g     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            boolean r3 = r1.zzg()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L8c
            boolean r1 = r1.zze()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.FO0 r1 = r8.f14912g     // Catch: java.lang.Throwable -> L8e
            boolean r1 = r1.zzf()     // Catch: java.lang.Throwable -> L8e
            if (r1 == 0) goto L8c
            com.google.android.gms.internal.ads.FO0 r1 = r8.f14912g     // Catch: java.lang.Throwable -> L8e
            com.google.android.gms.internal.ads.pF0 r8 = r8.f14913h     // Catch: java.lang.Throwable -> L8e
            boolean r8 = r1.zzd(r8, r9)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8c
            goto L90
        L8c:
            r2 = r5
            goto L90
        L8e:
            r8 = move-exception
            goto L92
        L90:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return r2
        L92:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.NO0.zzm(com.google.android.gms.internal.ads.NO0, com.google.android.gms.internal.ads.Q5):boolean");
    }

    @Override // com.google.android.gms.internal.ads.SO0
    protected final Pair c(RO0 ro0, int[][][] iArr, final int[] iArr2, NM0 nm0, RG rg) {
        final C4413tO0 c4413tO0;
        int i8;
        final boolean z8;
        final String str;
        int i9;
        int[] iArr3;
        int length;
        PO0 po0A;
        FO0 fo0;
        synchronized (this.f14909d) {
            try {
                c4413tO0 = this.f14911f;
                if (c4413tO0.zzS && AbstractC2281am0.zza >= 32 && (fo0 = this.f14912g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    F10.zzb(looperMyLooper);
                    fo0.zzb(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i10 = 2;
        OO0[] oo0Arr = new OO0[2];
        Pair pairL = l(2, ro0, iArr, new HO0() { // from class: com.google.android.gms.internal.ads.iO0
            /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.HO0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.util.List zza(int r20, com.google.android.gms.internal.ads.TH r21, int[] r22) {
                /*
                    Method dump skipped, instructions count: 200
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3161iO0.zza(int, com.google.android.gms.internal.ads.TH, int[]):java.util.List");
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.jO0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                return AbstractC1763Pk0.zzk().zzd((MO0) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.KO0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return MO0.zzd((MO0) obj3, (MO0) obj4);
                    }
                }), (MO0) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.KO0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return MO0.zzd((MO0) obj3, (MO0) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.KO0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return MO0.zzd((MO0) obj3, (MO0) obj4);
                    }
                }).zzb(list.size(), list2.size()).zzd((MO0) Collections.max(list, new Comparator() { // from class: com.google.android.gms.internal.ads.LO0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return MO0.zza((MO0) obj3, (MO0) obj4);
                    }
                }), (MO0) Collections.max(list2, new Comparator() { // from class: com.google.android.gms.internal.ads.LO0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return MO0.zza((MO0) obj3, (MO0) obj4);
                    }
                }), new Comparator() { // from class: com.google.android.gms.internal.ads.LO0
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        return MO0.zza((MO0) obj3, (MO0) obj4);
                    }
                }).zza();
            }
        });
        int i11 = 4;
        Pair pairL2 = pairL == null ? l(4, ro0, iArr, new HO0() { // from class: com.google.android.gms.internal.ads.eO0
            @Override // com.google.android.gms.internal.ads.HO0
            public final List zza(int i12, TH th2, int[] iArr4) {
                C2091Xk0 c2091Xk0 = new C2091Xk0();
                for (int i13 = 0; i13 < th2.zzb; i13++) {
                    c2091Xk0.zzf(new C3730nO0(i12, th2, i13, c4413tO0, iArr4[i13]));
                }
                return c2091Xk0.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.fO0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C3730nO0) ((List) obj).get(0)).zza((C3730nO0) ((List) obj2).get(0));
            }
        }) : null;
        int i12 = 0;
        if (pairL2 != null) {
            oo0Arr[((Integer) pairL2.second).intValue()] = (OO0) pairL2.first;
        } else if (pairL != null) {
            oo0Arr[((Integer) pairL.second).intValue()] = (OO0) pairL.first;
        }
        int i13 = 0;
        while (true) {
            i8 = 1;
            if (i13 >= 2) {
                z8 = false;
                break;
            }
            if (ro0.zzc(i13) == 2 && ro0.zzd(i13).zzc > 0) {
                z8 = true;
                break;
            }
            i13++;
        }
        Pair pairL3 = l(1, ro0, iArr, new HO0() { // from class: com.google.android.gms.internal.ads.gO0
            @Override // com.google.android.gms.internal.ads.HO0
            public final List zza(int i14, TH th2, int[] iArr4) {
                final NO0 no0 = this.zza;
                InterfaceC1229Cj0 interfaceC1229Cj0 = new InterfaceC1229Cj0() { // from class: com.google.android.gms.internal.ads.dO0
                    @Override // com.google.android.gms.internal.ads.InterfaceC1229Cj0
                    public final boolean zza(Object obj) {
                        return NO0.zzm(no0, (Q5) obj);
                    }
                };
                int i15 = iArr2[i14];
                C2091Xk0 c2091Xk0 = new C2091Xk0();
                for (int i16 = 0; i16 < th2.zzb; i16++) {
                    c2091Xk0.zzf(new C3616mO0(i14, th2, i16, c4413tO0, iArr4[i16], z8, interfaceC1229Cj0, i15));
                }
                return c2091Xk0.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.hO0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((C3616mO0) Collections.max((List) obj)).zza((C3616mO0) Collections.max((List) obj2));
            }
        });
        if (pairL3 != null) {
            oo0Arr[((Integer) pairL3.second).intValue()] = (OO0) pairL3.first;
        }
        if (pairL3 == null) {
            str = null;
        } else {
            Object obj = pairL3.first;
            str = ((OO0) obj).zza.zzb(((OO0) obj).zzb[0]).zze;
        }
        int i14 = 3;
        Pair pairL4 = l(3, ro0, iArr, new HO0() { // from class: com.google.android.gms.internal.ads.kO0
            @Override // com.google.android.gms.internal.ads.HO0
            public final List zza(int i15, TH th2, int[] iArr4) {
                C2091Xk0 c2091Xk0 = new C2091Xk0();
                for (int i16 = 0; i16 < th2.zzb; i16++) {
                    int i17 = i16;
                    c2091Xk0.zzf(new GO0(i15, th2, i17, c4413tO0, iArr4[i16], str));
                }
                return c2091Xk0.zzi();
            }
        }, new Comparator() { // from class: com.google.android.gms.internal.ads.lO0
            @Override // java.util.Comparator
            public final int compare(Object obj2, Object obj3) {
                return ((GO0) ((List) obj2).get(0)).zza((GO0) ((List) obj3).get(0));
            }
        });
        if (pairL4 != null) {
            oo0Arr[((Integer) pairL4.second).intValue()] = (OO0) pairL4.first;
        }
        int i15 = 0;
        while (i15 < i10) {
            int iZzc = ro0.zzc(i15);
            if (iZzc != i10 && iZzc != i8 && iZzc != i14 && iZzc != i11) {
                SN0 sn0Zzd = ro0.zzd(i15);
                int[][] iArr4 = iArr[i15];
                int i16 = i12;
                int i17 = i16;
                TH th2 = null;
                C3844oO0 c3844oO0 = null;
                while (i16 < sn0Zzd.zzc) {
                    TH thZzb = sn0Zzd.zzb(i16);
                    int[] iArr5 = iArr4[i16];
                    C3844oO0 c3844oO02 = c3844oO0;
                    for (int i18 = i12; i18 < thZzb.zzb; i18++) {
                        if (i(iArr5[i18], c4413tO0.zzT)) {
                            C3844oO0 c3844oO03 = new C3844oO0(thZzb.zzb(i18), iArr5[i18]);
                            if (c3844oO02 == null || c3844oO03.compareTo(c3844oO02) > 0) {
                                th2 = thZzb;
                                c3844oO02 = c3844oO03;
                                i17 = i18;
                            }
                        }
                    }
                    i16++;
                    c3844oO0 = c3844oO02;
                    i12 = 0;
                }
                oo0Arr[i15] = th2 == null ? null : new OO0(th2, new int[]{i17}, 0);
            }
            i15++;
            i10 = 2;
            i11 = 4;
            i8 = 1;
            i12 = 0;
            i14 = 3;
        }
        HashMap map = new HashMap();
        int i19 = 2;
        for (int i20 = 0; i20 < 2; i20++) {
            j(ro0.zzd(i20), c4413tO0, map);
        }
        j(ro0.zze(), c4413tO0, map);
        for (int i21 = 0; i21 < 2; i21++) {
            android.support.v4.media.session.f.a(map.get(Integer.valueOf(ro0.zzc(i21))));
        }
        int i22 = 0;
        while (i22 < i19) {
            SN0 sn0Zzd2 = ro0.zzd(i22);
            if (c4413tO0.zzg(i22, sn0Zzd2)) {
                c4413tO0.zze(i22, sn0Zzd2);
                oo0Arr[i22] = null;
            }
            i22++;
            i19 = 2;
        }
        int i23 = 0;
        for (int i24 = i19; i23 < i24; i24 = 2) {
            int iZzc2 = ro0.zzc(i23);
            if (c4413tO0.zzf(i23) || c4413tO0.zzE.contains(Integer.valueOf(iZzc2))) {
                oo0Arr[i23] = null;
            }
            i23++;
        }
        XN0 xn0 = this.f14914i;
        InterfaceC2589dP0 interfaceC2589dP0A = a();
        AbstractC2394bl0 abstractC2394bl0A = YN0.a(oo0Arr);
        int i25 = 2;
        PO0[] po0Arr = new PO0[2];
        int i26 = 0;
        while (i26 < i25) {
            OO0 oo0 = oo0Arr[i26];
            if (oo0 == null || (length = (iArr3 = oo0.zzb).length) == 0) {
                i9 = i26;
            } else {
                if (length == 1) {
                    po0A = new QO0(oo0.zza, iArr3[0], 0, 0, null);
                    i9 = i26;
                } else {
                    i9 = i26;
                    po0A = xn0.a(oo0.zza, iArr3, 0, interfaceC2589dP0A, (AbstractC2394bl0) abstractC2394bl0A.get(i26));
                }
                po0Arr[i9] = po0A;
            }
            i26 = i9 + 1;
            i25 = 2;
        }
        HG0[] hg0Arr = new HG0[i25];
        for (int i27 = 0; i27 < i25; i27++) {
            hg0Arr[i27] = (c4413tO0.zzf(i27) || c4413tO0.zzE.contains(Integer.valueOf(ro0.zzc(i27))) || (ro0.zzc(i27) != -2 && po0Arr[i27] == null)) ? null : HG0.zza;
        }
        return Pair.create(hg0Arr, po0Arr);
    }

    @Override // com.google.android.gms.internal.ads.FG0
    public final void zza(EG0 eg0) {
        synchronized (this.f14909d) {
            boolean z8 = this.f14911f.zzW;
        }
    }

    @Override // com.google.android.gms.internal.ads.VO0
    public final FG0 zze() {
        return this;
    }

    public final C4413tO0 zzf() {
        C4413tO0 c4413tO0;
        synchronized (this.f14909d) {
            c4413tO0 = this.f14911f;
        }
        return c4413tO0;
    }

    @Override // com.google.android.gms.internal.ads.VO0
    public final void zzj() {
        FO0 fo0;
        synchronized (this.f14909d) {
            try {
                if (AbstractC2281am0.zza >= 32 && (fo0 = this.f14912g) != null) {
                    fo0.zzc();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.zzj();
    }

    @Override // com.google.android.gms.internal.ads.VO0
    public final void zzk(C3940pF0 c3940pF0) {
        boolean zEquals;
        synchronized (this.f14909d) {
            zEquals = this.f14913h.equals(c3940pF0);
            this.f14913h = c3940pF0;
        }
        if (zEquals) {
            return;
        }
        k();
    }

    public final void zzl(C4185rO0 c4185rO0) {
        boolean zEquals;
        C4413tO0 c4413tO0 = new C4413tO0(c4185rO0);
        synchronized (this.f14909d) {
            zEquals = this.f14911f.equals(c4413tO0);
            this.f14911f = c4413tO0;
        }
        if (zEquals) {
            return;
        }
        if (c4413tO0.zzS && this.zza == null) {
            AbstractC2834fc0.zzf("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        b();
    }

    @Override // com.google.android.gms.internal.ads.VO0
    public final boolean zzn() {
        return true;
    }
}
