package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.d7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2552d7 implements InterfaceC2425c1 {

    @Deprecated
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.a7
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C2552d7(1, 1, InterfaceC3122i5.zza, new C2132Yk0(0L), new C4035q6(0), 112800)};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f18518a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f18519b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseIntArray f18520c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC2896g7 f18521d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3122i5 f18522e;

    /* renamed from: f, reason: collision with root package name */
    private final SparseArray f18523f;

    /* renamed from: g, reason: collision with root package name */
    private final SparseBooleanArray f18524g;

    /* renamed from: h, reason: collision with root package name */
    private final SparseBooleanArray f18525h;

    /* renamed from: i, reason: collision with root package name */
    private final Z6 f18526i;

    /* renamed from: j, reason: collision with root package name */
    private Y6 f18527j;

    /* renamed from: k, reason: collision with root package name */
    private InterfaceC2769f1 f18528k;

    /* renamed from: l, reason: collision with root package name */
    private int f18529l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18530m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f18531n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18532o;

    /* renamed from: p, reason: collision with root package name */
    private int f18533p;

    /* renamed from: q, reason: collision with root package name */
    private int f18534q;

    @Deprecated
    public C2552d7() {
        this(1, 1, InterfaceC3122i5.zza, new C2132Yk0(0L), new C4035q6(0), 112800);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r19, com.google.android.gms.internal.ads.C5050z1 r20) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2552d7.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f18528k = interfaceC2769f1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(long r9, long r11) {
        /*
            r8 = this;
            java.util.List r9 = r8.f18518a
            int r9 = r9.size()
            r10 = 0
            r0 = r10
        L8:
            r1 = 0
            if (r0 >= r9) goto L37
            java.util.List r3 = r8.f18518a
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.internal.ads.Yk0 r3 = (com.google.android.gms.internal.ads.C2132Yk0) r3
            long r4 = r3.zzf()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L31
            long r4 = r3.zzd()
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L34
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L34
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 == 0) goto L34
        L31:
            r3.zzi(r11)
        L34:
            int r0 = r0 + 1
            goto L8
        L37:
            int r9 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r9 == 0) goto L42
            com.google.android.gms.internal.ads.Y6 r9 = r8.f18527j
            if (r9 == 0) goto L42
            r9.zzd(r11)
        L42:
            com.google.android.gms.internal.ads.qh0 r9 = r8.f18519b
            r9.zzH(r10)
            android.util.SparseIntArray r9 = r8.f18520c
            r9.clear()
            r9 = r10
        L4d:
            android.util.SparseArray r11 = r8.f18523f
            int r11 = r11.size()
            if (r9 >= r11) goto L63
            android.util.SparseArray r11 = r8.f18523f
            java.lang.Object r11 = r11.valueAt(r9)
            com.google.android.gms.internal.ads.i7 r11 = (com.google.android.gms.internal.ads.InterfaceC3126i7) r11
            r11.zzc()
            int r9 = r9 + 1
            goto L4d
        L63:
            r8.f18533p = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2552d7.zze(long, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzf(com.google.android.gms.internal.ads.InterfaceC2540d1 r7) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.qh0 r0 = r6.f18519b
            byte[] r0 = r0.zzM()
            com.google.android.gms.internal.ads.Q0 r7 = (com.google.android.gms.internal.ads.Q0) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2552d7.zzf(com.google.android.gms.internal.ads.d1):boolean");
    }

    public C2552d7(int i8, int i9, InterfaceC3122i5 interfaceC3122i5, C2132Yk0 c2132Yk0, InterfaceC2896g7 interfaceC2896g7, int i10) {
        this.f18521d = interfaceC2896g7;
        this.f18522e = interfaceC3122i5;
        this.f18518a = Collections.singletonList(c2132Yk0);
        this.f18519b = new C4099qh0(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f18524g = sparseBooleanArray;
        this.f18525h = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f18523f = sparseArray;
        this.f18520c = new SparseIntArray();
        this.f18526i = new Z6(112800);
        this.f18528k = InterfaceC2769f1.zza;
        this.f18534q = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f18523f.put(sparseArray2.keyAt(i11), (InterfaceC3126i7) sparseArray2.valueAt(i11));
        }
        this.f18523f.put(0, new V6(new C2323b7(this)));
    }
}
