package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.o6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3807o6 implements InterfaceC2425c1 {
    public static final InterfaceC3227j1 zza = new InterfaceC3227j1() { // from class: com.google.android.gms.internal.ads.n6
        @Override // com.google.android.gms.internal.ads.InterfaceC3227j1
        public final /* synthetic */ InterfaceC2425c1[] zza(Uri uri, Map map) {
            return new InterfaceC2425c1[]{new C3807o6(0)};
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C3921p6 f21406a;

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f21407b;

    /* renamed from: c, reason: collision with root package name */
    private final C4099qh0 f21408c;

    /* renamed from: d, reason: collision with root package name */
    private final C1755Pg0 f21409d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC2769f1 f21410e;

    /* renamed from: f, reason: collision with root package name */
    private long f21411f;

    /* renamed from: g, reason: collision with root package name */
    private long f21412g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21413h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21414i;

    public C3807o6() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final int zzb(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) {
        F10.zzb(this.f21410e);
        int iZza = interfaceC2540d1.zza(this.f21407b.zzM(), 0, 2048);
        if (!this.f21414i) {
            this.f21410e.zzO(new B1(-9223372036854775807L, 0L));
            this.f21414i = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.f21407b.zzK(0);
        this.f21407b.zzJ(iZza);
        if (!this.f21413h) {
            this.f21406a.zzd(this.f21411f, 4);
            this.f21413h = true;
        }
        this.f21406a.zza(this.f21407b);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final /* synthetic */ List zzc() {
        return AbstractC2394bl0.zzm();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zzd(InterfaceC2769f1 interfaceC2769f1) {
        this.f21410e = interfaceC2769f1;
        this.f21406a.zzb(interfaceC2769f1, new C3011h7(Integer.MIN_VALUE, 0, 1));
        interfaceC2769f1.zzD();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final void zze(long j8, long j9) {
        this.f21413h = false;
        this.f21406a.zze();
        this.f21411f = j9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2425c1
    public final boolean zzf(InterfaceC2540d1 interfaceC2540d1) throws EOFException, InterruptedIOException {
        int i8 = 0;
        while (true) {
            Q0 q02 = (Q0) interfaceC2540d1;
            q02.zzm(this.f21408c.zzM(), 0, 10, false);
            this.f21408c.zzK(0);
            if (this.f21408c.zzo() != 4801587) {
                break;
            }
            this.f21408c.zzL(3);
            int iZzl = this.f21408c.zzl();
            i8 += iZzl + 10;
            q02.zzl(iZzl, false);
        }
        interfaceC2540d1.zzj();
        Q0 q03 = (Q0) interfaceC2540d1;
        q03.zzl(i8, false);
        if (this.f21412g == -1) {
            this.f21412g = i8;
        }
        int i9 = 0;
        int i10 = 0;
        int i11 = i8;
        do {
            q03.zzm(this.f21408c.zzM(), 0, 2, false);
            this.f21408c.zzK(0);
            if (C3921p6.zzf(this.f21408c.zzq())) {
                i9++;
                if (i9 >= 4 && i10 > 188) {
                    return true;
                }
                q03.zzm(this.f21408c.zzM(), 0, 4, false);
                this.f21409d.zzk(14);
                int iZzd = this.f21409d.zzd(13);
                if (iZzd <= 6) {
                    i11++;
                    interfaceC2540d1.zzj();
                    q03.zzl(i11, false);
                } else {
                    q03.zzl(iZzd - 6, false);
                    i10 += iZzd;
                }
            } else {
                i11++;
                interfaceC2540d1.zzj();
                q03.zzl(i11, false);
            }
            i9 = 0;
            i10 = 0;
        } while (i11 - i8 < 8192);
        return false;
    }

    public C3807o6(int i8) {
        this.f21406a = new C3921p6(true, null, 0);
        this.f21407b = new C4099qh0(2048);
        this.f21412g = -1L;
        C4099qh0 c4099qh0 = new C4099qh0(10);
        this.f21408c = c4099qh0;
        byte[] bArrZzM = c4099qh0.zzM();
        this.f21409d = new C1755Pg0(bArrZzM, bArrZzM.length);
    }
}
