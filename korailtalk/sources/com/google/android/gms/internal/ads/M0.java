package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
public abstract class M0 {

    /* renamed from: a, reason: collision with root package name */
    protected final F0 f14508a;

    /* renamed from: b, reason: collision with root package name */
    protected final L0 f14509b;

    /* renamed from: c, reason: collision with root package name */
    protected I0 f14510c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14511d;

    protected M0(J0 j02, L0 l02, long j8, long j9, long j10, long j11, long j12, long j13, int i8) {
        this.f14509b = l02;
        this.f14511d = i8;
        this.f14508a = new F0(j02, j8, 0L, j10, j11, j12, j13);
    }

    protected static final int b(InterfaceC2540d1 interfaceC2540d1, long j8, C5050z1 c5050z1) {
        if (j8 == interfaceC2540d1.zzf()) {
            return 0;
        }
        c5050z1.zza = j8;
        return 1;
    }

    protected static final boolean c(InterfaceC2540d1 interfaceC2540d1, long j8) throws EOFException, InterruptedIOException {
        long jZzf = j8 - interfaceC2540d1.zzf();
        if (jZzf < 0 || jZzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((Q0) interfaceC2540d1).zzo((int) jZzf, false);
        return true;
    }

    protected final void a(boolean z8, long j8) {
        this.f14510c = null;
        this.f14509b.zzb();
    }

    public final int zza(InterfaceC2540d1 interfaceC2540d1, C5050z1 c5050z1) throws EOFException, InterruptedIOException {
        while (true) {
            I0 i02 = this.f14510c;
            F10.zzb(i02);
            long j8 = i02.f13386f;
            long j9 = i02.f13387g - j8;
            int i8 = this.f14511d;
            long j10 = i02.f13388h;
            if (j9 <= i8) {
                a(false, j8);
                return b(interfaceC2540d1, j8, c5050z1);
            }
            if (!c(interfaceC2540d1, j10)) {
                return b(interfaceC2540d1, j10, c5050z1);
            }
            interfaceC2540d1.zzj();
            K0 k0Zza = this.f14509b.zza(interfaceC2540d1, i02.f13382b);
            int i9 = k0Zza.f13719a;
            if (i9 == -3) {
                a(false, j10);
                return b(interfaceC2540d1, j10, c5050z1);
            }
            if (i9 == -2) {
                I0.h(i02, k0Zza.f13720b, k0Zza.f13721c);
            } else {
                if (i9 != -1) {
                    c(interfaceC2540d1, k0Zza.f13721c);
                    a(true, k0Zza.f13721c);
                    return b(interfaceC2540d1, k0Zza.f13721c, c5050z1);
                }
                I0.g(i02, k0Zza.f13720b, k0Zza.f13721c);
            }
        }
    }

    public final C1 zzb() {
        return this.f14508a;
    }

    public final void zzd(long j8) {
        I0 i02 = this.f14510c;
        if (i02 == null || i02.f13381a != j8) {
            F0 f02 = this.f14508a;
            this.f14510c = new I0(j8, f02.zzf(j8), 0L, f02.f12900c, f02.f12901d, f02.f12902e, f02.f12903f);
        }
    }

    public final boolean zze() {
        return this.f14510c != null;
    }
}
