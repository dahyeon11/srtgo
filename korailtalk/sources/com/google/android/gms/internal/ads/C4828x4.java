package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.x4 */
/* loaded from: classes2.dex */
public final class C4828x4 implements InterfaceC2425c1, C1 {

    @Deprecated
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.v4
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C4828x4(InterfaceC3122i5.zza, 16)};
        }
    };

    /* renamed from: A */
    private C4142r3 f23604A;

    /* renamed from: a */
    private final InterfaceC3122i5 f23605a;

    /* renamed from: b */
    private final int f23606b;

    /* renamed from: c */
    private final C4099qh0 f23607c;

    /* renamed from: d */
    private final C4099qh0 f23608d;

    /* renamed from: e */
    private final C4099qh0 f23609e;

    /* renamed from: f */
    private final C4099qh0 f23610f;

    /* renamed from: g */
    private final ArrayDeque f23611g;

    /* renamed from: h */
    private final B4 f23612h;

    /* renamed from: i */
    private final List f23613i;

    /* renamed from: j */
    private AbstractC2394bl0 f23614j;

    /* renamed from: k */
    private int f23615k;

    /* renamed from: l */
    private int f23616l;

    /* renamed from: m */
    private long f23617m;

    /* renamed from: n */
    private int f23618n;

    /* renamed from: o */
    private C4099qh0 f23619o;

    /* renamed from: p */
    private int f23620p;

    /* renamed from: q */
    private int f23621q;

    /* renamed from: r */
    private int f23622r;

    /* renamed from: s */
    private int f23623s;

    /* renamed from: t */
    private boolean f23624t;

    /* renamed from: u */
    private InterfaceC2769f1 f23625u;

    /* renamed from: v */
    private C4714w4[] f23626v;

    /* renamed from: w */
    private long[][] f23627w;

    /* renamed from: x */
    private int f23628x;

    /* renamed from: y */
    private long f23629y;

    /* renamed from: z */
    private int f23630z;

    @Deprecated
    public C4828x4() {
        this(InterfaceC3122i5.zza, 16);
    }

    private static int a(int i8) {
        if (i8 != 1751476579) {
            return i8 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int b(G4 g42, long j8) {
        int iZza = g42.zza(j8);
        return iZza == -1 ? g42.zzb(j8) : iZza;
    }

    private static long c(G4 g42, long j8, long j9) {
        int iB = b(g42, j8);
        return iB == -1 ? j9 : Math.min(g42.zzc[iB], j9);
    }

    private final void d() {
        this.f23615k = 0;
        this.f23618n = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(long j8) {
        int i8;
        int i9;
        C1735Ot c1735Ot;
        long j9;
        List list;
        C1735Ot c1735Ot2;
        C1735Ot c1735Ot3;
        C1735Ot c1735Ot4;
        int i10;
        C1735Ot c1735Ot5;
        int i11;
        C1735Ot c1735OtZzc;
        int i12;
        int i13 = 0;
        int i14 = 1;
        while (!this.f23611g.isEmpty() && ((Z3) this.f23611g.peek()).zza == j8) {
            Z3 z32 = (Z3) this.f23611g.pop();
            if (z32.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                int i15 = this.f23630z;
                C4252s1 c4252s1 = new C4252s1();
                C2202a4 c2202a4Zzb = z32.zzb(1969517665);
                if (c2202a4Zzb != null) {
                    C1735Ot c1735OtZzb = AbstractC3233j4.zzb(c2202a4Zzb);
                    c4252s1.zzb(c1735OtZzb);
                    c1735Ot = c1735OtZzb;
                } else {
                    c1735Ot = null;
                }
                Z3 z3Zza = z32.zza(1835365473);
                C1735Ot c1735OtZza = z3Zza != null ? AbstractC3233j4.zza(z3Zza) : null;
                C2202a4 c2202a4Zzb2 = z32.zzb(1836476516);
                c2202a4Zzb2.getClass();
                int i16 = i15 == i14 ? i14 : i13;
                C4688vr0 c4688vr0Zzc = AbstractC3233j4.zzc(c2202a4Zzb2.zza);
                InterfaceC3894ot[] interfaceC3894otArr = new InterfaceC3894ot[i14];
                interfaceC3894otArr[i13] = c4688vr0Zzc;
                C1735Ot c1735Ot6 = new C1735Ot(-9223372036854775807L, interfaceC3894otArr);
                int i17 = i14 != (this.f23606b & i14) ? i13 : i14;
                C1735Ot c1735Ot7 = c1735Ot;
                long j10 = -9223372036854775807L;
                C1735Ot c1735Ot8 = c1735Ot6;
                C1735Ot c1735Ot9 = c1735OtZza;
                List listZzd = AbstractC3233j4.zzd(z32, c4252s1, -9223372036854775807L, null, i17, i16, new InterfaceC3875oj0() { // from class: com.google.android.gms.internal.ads.u4
                    @Override // com.google.android.gms.internal.ads.InterfaceC3875oj0
                    public final Object apply(Object obj) {
                        return (D4) obj;
                    }
                });
                long j11 = -9223372036854775807L;
                int i18 = 0;
                int i19 = 0;
                int size = -1;
                while (true) {
                    j9 = 0;
                    if (i18 >= listZzd.size()) {
                        break;
                    }
                    G4 g42 = (G4) listZzd.get(i18);
                    if (g42.zzb == 0) {
                        list = listZzd;
                        c1735Ot3 = c1735Ot7;
                        c1735Ot4 = c1735Ot8;
                        i10 = i14;
                    } else {
                        D4 d42 = g42.zza;
                        list = listZzd;
                        long j12 = d42.zze;
                        if (j12 == j10) {
                            j12 = g42.zzh;
                        }
                        long jMax = Math.max(j11, j12);
                        int i20 = i19 + 1;
                        C4714w4 c4714w4 = new C4714w4(d42, g42, this.f23625u.zzw(i19, d42.zzb));
                        int i21 = "audio/true-hd".equals(d42.zzf.zzn) ? g42.zze * 16 : g42.zze + 30;
                        O4 o4Zzb = d42.zzf.zzb();
                        o4Zzb.zzP(i21);
                        if (d42.zzb == 2) {
                            if ((this.f23606b & 8) != 0) {
                                o4Zzb.zzV(d42.zzf.zzg | (size == -1 ? 1 : 2));
                            }
                            if (j12 > 0 && (i12 = g42.zzb) > 0) {
                                o4Zzb.zzH(i12 / (j12 / 1000000.0f));
                            }
                        }
                        int i22 = d42.zzb;
                        int i23 = AbstractC4372t4.zzb;
                        if (i22 == 1 && c4252s1.zza()) {
                            o4Zzb.zzF(c4252s1.zza);
                            o4Zzb.zzG(c4252s1.zzb);
                        }
                        int i24 = d42.zzb;
                        if (this.f23613i.isEmpty()) {
                            c1735Ot3 = c1735Ot7;
                            c1735Ot2 = null;
                        } else {
                            c1735Ot2 = new C1735Ot(this.f23613i);
                            c1735Ot3 = c1735Ot7;
                        }
                        C1735Ot[] c1735OtArr = {c1735Ot2, c1735Ot3, c1735Ot8};
                        c1735Ot4 = c1735Ot8;
                        C1735Ot c1735Ot10 = new C1735Ot(-9223372036854775807L, new InterfaceC3894ot[0]);
                        C1735Ot c1735Ot11 = c1735Ot9;
                        if (c1735Ot11 != null) {
                            int i25 = 0;
                            while (i25 < c1735Ot11.zza()) {
                                InterfaceC3894ot interfaceC3894otZzb = c1735Ot11.zzb(i25);
                                if (interfaceC3894otZzb instanceof C4113qo0) {
                                    C4113qo0 c4113qo0 = (C4113qo0) interfaceC3894otZzb;
                                    c1735Ot5 = c1735Ot11;
                                    if (!c4113qo0.zza.equals("com.android.capture.fps")) {
                                        i11 = 1;
                                        c1735OtZzc = c1735Ot10.zzc(c4113qo0);
                                    } else if (i24 == 2) {
                                        i11 = 1;
                                        c1735OtZzc = c1735Ot10.zzc(c4113qo0);
                                    } else {
                                        i11 = 1;
                                    }
                                    c1735Ot10 = c1735OtZzc;
                                } else {
                                    c1735Ot5 = c1735Ot11;
                                    i11 = 1;
                                }
                                i25 += i11;
                                c1735Ot11 = c1735Ot5;
                            }
                        }
                        c1735Ot9 = c1735Ot11;
                        for (int i26 = 0; i26 < 3; i26++) {
                            c1735Ot10 = c1735Ot10.zzd(c1735OtArr[i26]);
                        }
                        if (c1735Ot10.zza() > 0) {
                            o4Zzb.zzQ(c1735Ot10);
                        }
                        c4714w4.zzc.zzl(o4Zzb.zzad());
                        if (d42.zzb == 2 && size == -1) {
                            size = arrayList.size();
                        }
                        arrayList.add(c4714w4);
                        i19 = i20;
                        j11 = jMax;
                        i10 = 1;
                    }
                    i18 += i10;
                    i14 = i10;
                    c1735Ot8 = c1735Ot4;
                    listZzd = list;
                    j10 = -9223372036854775807L;
                    c1735Ot7 = c1735Ot3;
                }
                this.f23628x = size;
                this.f23629y = j11;
                C4714w4[] c4714w4Arr = (C4714w4[]) arrayList.toArray(new C4714w4[0]);
                this.f23626v = c4714w4Arr;
                int length = c4714w4Arr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i27 = 0; i27 < c4714w4Arr.length; i27++) {
                    jArr[i27] = new long[c4714w4Arr[i27].zzb.zzb];
                    jArr2[i27] = c4714w4Arr[i27].zzb.zzf[0];
                }
                i8 = 0;
                int i28 = 0;
                while (i28 < c4714w4Arr.length) {
                    long j13 = Long.MAX_VALUE;
                    int i29 = -1;
                    for (int i30 = 0; i30 < c4714w4Arr.length; i30++) {
                        if (!zArr[i30]) {
                            long j14 = jArr2[i30];
                            if (j14 <= j13) {
                                i29 = i30;
                                j13 = j14;
                            }
                        }
                    }
                    int i31 = iArr[i29];
                    long[] jArr3 = jArr[i29];
                    jArr3[i31] = j9;
                    G4 g43 = c4714w4Arr[i29].zzb;
                    j9 += g43.zzd[i31];
                    int i32 = i31 + 1;
                    iArr[i29] = i32;
                    if (i32 < jArr3.length) {
                        jArr2[i29] = g43.zzf[i32];
                    } else {
                        zArr[i29] = true;
                        i28++;
                    }
                }
                i9 = 1;
                this.f23627w = jArr;
                this.f23625u.zzD();
                this.f23625u.zzO(this);
                this.f23611g.clear();
                this.f23615k = 2;
            } else {
                i8 = i13;
                i9 = i14;
                if (!this.f23611g.isEmpty()) {
                    ((Z3) this.f23611g.peek()).zzc(z32);
                }
            }
            i13 = i8;
            i14 = i9;
        }
        if (this.f23615k != 2) {
            d();
        }
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final long zza() {
        return this.f23629y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:274:0x0017, code lost:
    
        if (r7 == r6) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0019, code lost:
    
        if (r7 == 2) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x001b, code lost:
    
        r33.f23612h.zza(r34, r35, r33.f23613i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0026, code lost:
    
        if (r35.zza != 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0028, code lost:
    
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x002b, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x002c, code lost:
    
        r7 = r34.zzf();
        r14 = r33.f23620p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0032, code lost:
    
        if (r14 != (-1)) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0034, code lost:
    
        r21 = r6;
        r28 = r21;
        r26 = -1;
        r27 = -1;
        r19 = Long.MAX_VALUE;
        r22 = Long.MAX_VALUE;
        r24 = Long.MAX_VALUE;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0048, code lost:
    
        r3 = r33.f23626v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x004b, code lost:
    
        if (r14 >= r3.length) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x004d, code lost:
    
        r3 = r3[r14];
        r9 = r3.zze;
        r3 = r3.zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0055, code lost:
    
        if (r9 != r3.zzb) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0058, code lost:
    
        r29 = r3.zzc[r9];
        r3 = r33.f23627w;
        r5 = com.google.android.gms.internal.ads.AbstractC2281am0.zza;
        r31 = r3[r14][r9];
        r29 = r29 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0068, code lost:
    
        if (r29 < 0) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x006c, code lost:
    
        if (r29 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x006e, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0070, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0071, code lost:
    
        if (r3 != 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0073, code lost:
    
        if (r28 != 0) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0075, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0077, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0079, code lost:
    
        if (r3 != r5) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x007d, code lost:
    
        if (r29 >= r24) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x007f, code lost:
    
        r28 = r3;
        r27 = r14;
        r24 = r29;
        r22 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0088, code lost:
    
        r28 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x008c, code lost:
    
        if (r31 >= r19) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x008e, code lost:
    
        r21 = r3;
        r26 = r14;
        r19 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0094, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0098, code lost:
    
        if (r19 == Long.MAX_VALUE) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x009a, code lost:
    
        if (r21 == 0) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x00a3, code lost:
    
        if (r22 < (r19 + r4.C6174a.MIN_STORAGE_SIZE)) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x00a5, code lost:
    
        r14 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x00a8, code lost:
    
        r14 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x00aa, code lost:
    
        r33.f23620p = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00ac, code lost:
    
        if (r14 != (-1)) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00b1, code lost:
    
        r3 = r33.f23626v[r14];
        r5 = r3.zzc;
        r9 = r3.zze;
        r14 = r3.zzb;
        r12 = r14.zzc[r9];
        r14 = r14.zzd[r9];
        r4 = r3.zzd;
        r7 = (r12 - r7) + r33.f23621q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00cf, code lost:
    
        if (r7 < 0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00d3, code lost:
    
        if (r7 < android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00de, code lost:
    
        if (r3.zza.zzg != 1) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00e0, code lost:
    
        r7 = r7 + 8;
        r14 = r14 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00e5, code lost:
    
        r34.zzk((int) r7);
        r2 = r3.zza;
        r6 = r2.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00ed, code lost:
    
        if (r6 == 0) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00ef, code lost:
    
        r2 = r33.f23608d.zzM();
        r2[0] = 0;
        r2[1] = 0;
        r2[2] = 0;
        r8 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0103, code lost:
    
        if (r33.f23622r >= r14) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0105, code lost:
    
        r7 = r33.f23623s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0107, code lost:
    
        if (r7 != 0) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0109, code lost:
    
        r34.zzi(r2, r8, r6);
        r33.f23621q += r6;
        r33.f23608d.zzK(0);
        r7 = r33.f23608d.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x011d, code lost:
    
        if (r7 < 0) goto L523;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x011f, code lost:
    
        r33.f23623s = r7;
        r33.f23607c.zzK(0);
        r5.zzq(r33.f23607c, 4);
        r33.f23622r += 4;
        r14 = r14 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x013a, code lost:
    
        throw com.google.android.gms.internal.ads.C1901Sv.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x013b, code lost:
    
        r7 = r5.zzf(r34, r7, false);
        r33.f23621q += r7;
        r33.f23622r += r7;
        r33.f23623s -= r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x015a, code lost:
    
        if ("audio/ac4".equals(r2.zzf.zzn) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x015e, code lost:
    
        if (r33.f23622r != 0) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0160, code lost:
    
        com.google.android.gms.internal.ads.D0.zzb(r14, r33.f23609e);
        r6 = 7;
        r5.zzq(r33.f23609e, 7);
        r33.f23622r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0171, code lost:
    
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0172, code lost:
    
        r14 = r14 + r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0174, code lost:
    
        if (r4 == null) goto L529;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0176, code lost:
    
        r4.zzd(r34);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0179, code lost:
    
        r2 = r33.f23622r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x017b, code lost:
    
        if (r2 >= r14) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x017d, code lost:
    
        r2 = r5.zzf(r34, r14 - r2, false);
        r33.f23621q += r2;
        r33.f23622r += r2;
        r33.f23623s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0194, code lost:
    
        r1 = r3.zzb;
        r6 = r1.zzf[r9];
        r1 = r1.zzg[r9];
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x019e, code lost:
    
        if (r4 == null) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x01a0, code lost:
    
        r4.zzc(r5, r6, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x01b7, code lost:
    
        if ((r9 + 1) != r3.zzb.zzb) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01b9, code lost:
    
        r4.zza(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x01be, code lost:
    
        r5.zzs(r6, r1, r14, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01cd, code lost:
    
        r3.zze++;
        r33.f23620p = -1;
        r33.f23621q = 0;
        r33.f23622r = 0;
        r33.f23623s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01df, code lost:
    
        r35.zza = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x01e2, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x01e3, code lost:
    
        r3 = r33.f23617m - r33.f23618n;
        r9 = r34.zzf() + r3;
        r5 = r33.f23619o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x01f1, code lost:
    
        if (r5 == null) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x01f3, code lost:
    
        r34.zzi(r5.zzM(), r33.f23618n, (int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x01ff, code lost:
    
        if (r33.f23616l != 1718909296) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0201, code lost:
    
        r33.f23624t = true;
        r5.zzK(8);
        r3 = a(r5.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x020f, code lost:
    
        if (r3 == 0) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0212, code lost:
    
        r5.zzL(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x021a, code lost:
    
        if (r5.zzb() <= 0) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x021c, code lost:
    
        r3 = a(r5.zzg());
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0224, code lost:
    
        if (r3 == 0) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0227, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0228, code lost:
    
        r33.f23630z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x022a, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x0232, code lost:
    
        if (r33.f23611g.isEmpty() != false) goto L374;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0234, code lost:
    
        ((com.google.android.gms.internal.ads.Z3) r33.f23611g.peek()).zzd(new com.google.android.gms.internal.ads.C2202a4(r33.f23616l, r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0249, code lost:
    
        if (r33.f23624t != false) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0250, code lost:
    
        if (r33.f23616l != 1835295092) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0252, code lost:
    
        r33.f23630z = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0257, code lost:
    
        if (r3 >= android.support.v4.media.session.PlaybackStateCompat.ACTION_SET_REPEAT_MODE) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0259, code lost:
    
        r34.zzk((int) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x025e, code lost:
    
        r35.zza = r34.zzf() + r3;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0266, code lost:
    
        e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0269, code lost:
    
        if (r3 == false) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x026e, code lost:
    
        if (r33.f23615k == 2) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0270, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v21 */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r34, com.google.android.gms.internal.ads.C5050z1 r35) throws com.google.android.gms.internal.ads.C1901Sv {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4828x4.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return this.f23614j;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        if ((this.f23606b & 16) == 0) {
            interfaceC2769f1 = new C3463l5(interfaceC2769f1, this.f23605a);
        }
        this.f23625u = interfaceC2769f1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f23611g.clear();
        this.f23618n = 0;
        this.f23620p = -1;
        this.f23621q = 0;
        this.f23622r = 0;
        this.f23623s = 0;
        if (j8 == 0) {
            if (this.f23615k != 3) {
                d();
                return;
            } else {
                this.f23612h.zzb();
                this.f23613i.clear();
                return;
            }
        }
        for (C4714w4 c4714w4 : this.f23626v) {
            G4 g42 = c4714w4.zzb;
            int iZza = g42.zza(j9);
            if (iZza == -1) {
                iZza = g42.zzb(j9);
            }
            c4714w4.zze = iZza;
            L1 l12 = c4714w4.zzd;
            if (l12 != null) {
                l12.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) {
        G1 g1Zzb = C4.zzb(interfaceC2540d1, (this.f23606b & 2) != 0);
        this.f23614j = g1Zzb != null ? AbstractC2394bl0.zzn(g1Zzb) : AbstractC2394bl0.zzm();
        return g1Zzb == null;
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final A1 zzg(long j8) {
        long j9;
        long j10;
        int iZzb;
        C4714w4[] c4714w4Arr = this.f23626v;
        if (c4714w4Arr.length == 0) {
            D1 d12 = D1.zza;
            return new A1(d12, d12);
        }
        int i8 = this.f23628x;
        long jC = -1;
        if (i8 != -1) {
            G4 g42 = c4714w4Arr[i8].zzb;
            int iB = b(g42, j8);
            if (iB == -1) {
                D1 d13 = D1.zza;
                return new A1(d13, d13);
            }
            long j11 = g42.zzf[iB];
            j9 = g42.zzc[iB];
            if (j11 >= j8 || iB >= g42.zzb - 1 || (iZzb = g42.zzb(j8)) == -1 || iZzb == iB) {
                j10 = -9223372036854775807L;
            } else {
                j10 = g42.zzf[iZzb];
                jC = g42.zzc[iZzb];
            }
            j8 = j11;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i9 = 0;
        while (true) {
            C4714w4[] c4714w4Arr2 = this.f23626v;
            if (i9 >= c4714w4Arr2.length) {
                break;
            }
            if (i9 != this.f23628x) {
                G4 g43 = c4714w4Arr2[i9].zzb;
                long jC2 = c(g43, j8, j9);
                if (j10 != -9223372036854775807L) {
                    jC = c(g43, j10, jC);
                }
                j9 = jC2;
            }
            i9++;
        }
        D1 d14 = new D1(j8, j9);
        return j10 == -9223372036854775807L ? new A1(d14, d14) : new A1(d14, new D1(j10, jC));
    }

    @Override // com.google.android.gms.internal.ads.C1
    public final boolean zzh() {
        return true;
    }

    public C4828x4(InterfaceC3122i5 interfaceC3122i5, int i8) {
        this.f23605a = interfaceC3122i5;
        this.f23606b = i8;
        this.f23614j = AbstractC2394bl0.zzm();
        this.f23615k = (i8 & 4) != 0 ? 3 : 0;
        this.f23612h = new B4();
        this.f23613i = new ArrayList();
        this.f23610f = new C4099qh0(16);
        this.f23611g = new ArrayDeque();
        this.f23607c = new C4099qh0(AbstractC5148zt0.zza);
        this.f23608d = new C4099qh0(4);
        this.f23609e = new C4099qh0();
        this.f23620p = -1;
        this.f23625u = InterfaceC2769f1.zza;
        this.f23626v = new C4714w4[0];
    }
}
