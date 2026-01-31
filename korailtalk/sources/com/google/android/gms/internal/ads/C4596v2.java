package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4596v2 implements InterfaceC2425c1 {

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC2769f1 f23153b;

    /* renamed from: c, reason: collision with root package name */
    private int f23154c;

    /* renamed from: d, reason: collision with root package name */
    private int f23155d;

    /* renamed from: e, reason: collision with root package name */
    private int f23156e;

    /* renamed from: g, reason: collision with root package name */
    private C4142r3 f23158g;

    /* renamed from: h, reason: collision with root package name */
    private InterfaceC2540d1 f23159h;

    /* renamed from: i, reason: collision with root package name */
    private C4938y2 f23160i;

    /* renamed from: j, reason: collision with root package name */
    private C4828x4 f23161j;

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f23152a = new C4099qh0(6);

    /* renamed from: f, reason: collision with root package name */
    private long f23157f = -1;

    private final int a(InterfaceC2540d1 interfaceC2540d1) {
        this.f23152a.zzH(2);
        ((Q0) interfaceC2540d1).zzm(this.f23152a.zzM(), 0, 2, false);
        return this.f23152a.zzq();
    }

    private final void b() {
        InterfaceC2769f1 interfaceC2769f1 = this.f23153b;
        interfaceC2769f1.getClass();
        interfaceC2769f1.zzD();
        this.f23153b.zzO(new B1(-9223372036854775807L, 0L));
        this.f23154c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(com.google.android.gms.internal.ads.InterfaceC2540d1 r24, com.google.android.gms.internal.ads.C5050z1 r25) throws com.google.android.gms.internal.ads.C1901Sv, java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4596v2.zzb(com.google.android.gms.internal.ads.d1, com.google.android.gms.internal.ads.z1):int");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f23153b = interfaceC2769f1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        if (j8 == 0) {
            this.f23154c = 0;
            this.f23161j = null;
        } else if (this.f23154c == 5) {
            C4828x4 c4828x4 = this.f23161j;
            c4828x4.getClass();
            c4828x4.zze(j8, j9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        if (a(interfaceC2540d1) != 65496) {
            return false;
        }
        int iA = a(interfaceC2540d1);
        this.f23155d = iA;
        if (iA == 65504) {
            this.f23152a.zzH(2);
            Q0 q02 = (Q0) interfaceC2540d1;
            q02.zzm(this.f23152a.zzM(), 0, 2, false);
            q02.zzl(this.f23152a.zzq() - 2, false);
            iA = a(interfaceC2540d1);
            this.f23155d = iA;
        }
        if (iA == 65505) {
            Q0 q03 = (Q0) interfaceC2540d1;
            q03.zzl(2, false);
            this.f23152a.zzH(6);
            q03.zzm(this.f23152a.zzM(), 0, 6, false);
            if (this.f23152a.zzu() == 1165519206 && this.f23152a.zzq() == 0) {
                return true;
            }
        }
        return false;
    }
}
