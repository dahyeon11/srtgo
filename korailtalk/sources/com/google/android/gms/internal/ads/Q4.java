package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class Q4 {

    /* renamed from: a, reason: collision with root package name */
    private final R4 f15688a = new R4();

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f15689b = new C4099qh0(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    private int f15690c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f15691d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15692e;

    Q4() {
    }

    private final int a(int i8) {
        int i9;
        int i10 = 0;
        this.f15691d = 0;
        do {
            int i11 = this.f15691d;
            int i12 = i8 + i11;
            R4 r42 = this.f15688a;
            if (i12 >= r42.zzc) {
                break;
            }
            this.f15691d = i11 + 1;
            i9 = r42.zzf[i12];
            i10 += i9;
        } while (i9 == 255);
        return i10;
    }

    public final C4099qh0 zza() {
        return this.f15689b;
    }

    public final R4 zzb() {
        return this.f15688a;
    }

    public final void zzc() {
        this.f15688a.zza();
        this.f15689b.zzH(0);
        this.f15690c = -1;
        this.f15692e = false;
    }

    public final void zzd() {
        C4099qh0 c4099qh0 = this.f15689b;
        if (c4099qh0.zzM().length == 65025) {
            return;
        }
        c4099qh0.zzI(Arrays.copyOf(c4099qh0.zzM(), Math.max(65025, c4099qh0.zze())), this.f15689b.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(com.google.android.gms.internal.ads.InterfaceC2540d1 r7) {
        /*
            r6 = this;
            boolean r0 = r6.f15692e
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r6.f15692e = r1
            com.google.android.gms.internal.ads.qh0 r0 = r6.f15689b
            r0.zzH(r1)
        Ld:
            boolean r0 = r6.f15692e
            r2 = 1
            if (r0 != 0) goto L99
            int r0 = r6.f15690c
            if (r0 >= 0) goto L4e
            com.google.android.gms.internal.ads.R4 r0 = r6.f15688a
            r3 = -1
            boolean r0 = r0.zzc(r7, r3)
            if (r0 == 0) goto L4d
            com.google.android.gms.internal.ads.R4 r0 = r6.f15688a
            boolean r0 = r0.zzb(r7, r2)
            if (r0 != 0) goto L29
            goto L4d
        L29:
            com.google.android.gms.internal.ads.R4 r0 = r6.f15688a
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L42
            com.google.android.gms.internal.ads.qh0 r0 = r6.f15689b
            int r0 = r0.zze()
            if (r0 != 0) goto L42
            int r0 = r6.a(r1)
            int r3 = r3 + r0
            int r0 = r6.f15691d
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r3 = com.google.android.gms.internal.ads.AbstractC2884g1.zze(r7, r3)
            if (r3 != 0) goto L4a
            return r1
        L4a:
            r6.f15690c = r0
            goto L4e
        L4d:
            return r1
        L4e:
            int r0 = r6.a(r0)
            int r3 = r6.f15690c
            int r4 = r6.f15691d
            int r3 = r3 + r4
            if (r0 <= 0) goto L8e
            com.google.android.gms.internal.ads.qh0 r4 = r6.f15689b
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzE(r5)
            com.google.android.gms.internal.ads.qh0 r4 = r6.f15689b
            byte[] r5 = r4.zzM()
            int r4 = r4.zze()
            boolean r4 = com.google.android.gms.internal.ads.AbstractC2884g1.zzd(r7, r5, r4, r0)
            if (r4 != 0) goto L74
            return r1
        L74:
            com.google.android.gms.internal.ads.qh0 r4 = r6.f15689b
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzJ(r5)
            com.google.android.gms.internal.ads.R4 r0 = r6.f15688a
            int r4 = r3 + (-1)
            int[] r0 = r0.zzf
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L8b
            goto L8c
        L8b:
            r2 = r1
        L8c:
            r6.f15692e = r2
        L8e:
            com.google.android.gms.internal.ads.R4 r0 = r6.f15688a
            int r0 = r0.zzc
            if (r3 != r0) goto L95
            r3 = -1
        L95:
            r6.f15690c = r3
            goto Ld
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Q4.zze(com.google.android.gms.internal.ads.d1):boolean");
    }
}
