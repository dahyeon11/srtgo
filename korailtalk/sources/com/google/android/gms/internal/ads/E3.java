package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* loaded from: classes2.dex */
final class E3 implements G3 {

    /* renamed from: a */
    private final byte[] f12745a = new byte[8];

    /* renamed from: b */
    private final ArrayDeque f12746b = new ArrayDeque();

    /* renamed from: c */
    private final O3 f12747c = new O3();

    /* renamed from: d */
    private F3 f12748d;

    /* renamed from: e */
    private int f12749e;

    /* renamed from: f */
    private int f12750f;

    /* renamed from: g */
    private long f12751g;

    private final long a(InterfaceC2540d1 interfaceC2540d1, int i8) throws EOFException, InterruptedIOException {
        ((Q0) interfaceC2540d1).zzn(this.f12745a, 0, i8, false);
        long j8 = 0;
        for (int i9 = 0; i9 < i8; i9++) {
            j8 = (j8 << 8) | (this.f12745a[i9] & 255);
        }
        return j8;
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void zza(F3 f32) {
        this.f12748d = f32;
    }

    @Override // com.google.android.gms.internal.ads.G3
    public final void zzb() {
        this.f12749e = 0;
        this.f12746b.clear();
        this.f12747c.zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x00b2 A[LOOP:0: B:95:0x0005->B:129:0x00b2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x016b A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.G3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.InterfaceC2540d1 r14) throws com.google.android.gms.internal.ads.C1901Sv, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.E3.zzc(com.google.android.gms.internal.ads.d1):boolean");
    }
}
