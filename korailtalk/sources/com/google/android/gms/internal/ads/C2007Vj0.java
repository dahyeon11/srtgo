package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Vj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2007Vj0 implements InterfaceC4721w70 {

    /* renamed from: b, reason: collision with root package name */
    private static final List f16889b = new ArrayList(50);

    /* renamed from: a, reason: collision with root package name */
    private final Handler f16890a;

    public C2007Vj0(Handler handler) {
        this.f16890a = handler;
    }

    static /* bridge */ /* synthetic */ void a(C4558uj0 c4558uj0) {
        List list = f16889b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(c4558uj0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static C4558uj0 b() {
        C4558uj0 c4558uj0;
        List list = f16889b;
        synchronized (list) {
            try {
                c4558uj0 = list.isEmpty() ? new C4558uj0(null) : (C4558uj0) list.remove(list.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4558uj0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final Looper zza() {
        return this.f16890a.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final V60 zzb(int i8) {
        Handler handler = this.f16890a;
        C4558uj0 c4558uj0B = b();
        c4558uj0B.zzb(handler.obtainMessage(i8), this);
        return c4558uj0B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final V60 zzc(int i8, Object obj) {
        Handler handler = this.f16890a;
        C4558uj0 c4558uj0B = b();
        c4558uj0B.zzb(handler.obtainMessage(i8, obj), this);
        return c4558uj0B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final V60 zzd(int i8, int i9, int i10) {
        Handler handler = this.f16890a;
        C4558uj0 c4558uj0B = b();
        c4558uj0B.zzb(handler.obtainMessage(1, i9, i10), this);
        return c4558uj0B;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final void zze(Object obj) {
        this.f16890a.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final void zzf(int i8) {
        this.f16890a.removeMessages(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final boolean zzg(int i8) {
        return this.f16890a.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final boolean zzh(Runnable runnable) {
        return this.f16890a.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final boolean zzi(int i8) {
        return this.f16890a.sendEmptyMessage(i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final boolean zzj(int i8, long j8) {
        return this.f16890a.sendEmptyMessageAtTime(2, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4721w70
    public final boolean zzk(V60 v60) {
        return ((C4558uj0) v60).zzc(this.f16890a);
    }
}
