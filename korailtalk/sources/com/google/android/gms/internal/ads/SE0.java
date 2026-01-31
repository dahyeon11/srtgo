package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class SE0 implements InterfaceC2227aG0 {

    /* renamed from: a, reason: collision with root package name */
    private final C2703eP0 f16217a;

    /* renamed from: b, reason: collision with root package name */
    private final long f16218b;

    /* renamed from: c, reason: collision with root package name */
    private final long f16219c;

    /* renamed from: d, reason: collision with root package name */
    private final long f16220d;

    /* renamed from: e, reason: collision with root package name */
    private final long f16221e;

    /* renamed from: f, reason: collision with root package name */
    private final long f16222f;

    /* renamed from: g, reason: collision with root package name */
    private final HashMap f16223g;

    /* renamed from: h, reason: collision with root package name */
    private long f16224h;

    public SE0() {
        C2703eP0 c2703eP0 = new C2703eP0(true, 65536);
        b(2500, 0, "bufferForPlaybackMs", "0");
        b(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        b(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        b(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        b(50000, 50000, "maxBufferMs", "minBufferMs");
        b(0, 0, "backBufferDurationMs", "0");
        this.f16217a = c2703eP0;
        this.f16218b = AbstractC2281am0.zzr(50000L);
        this.f16219c = AbstractC2281am0.zzr(50000L);
        this.f16220d = AbstractC2281am0.zzr(2500L);
        this.f16221e = AbstractC2281am0.zzr(5000L);
        this.f16222f = AbstractC2281am0.zzr(0L);
        this.f16223g = new HashMap();
        this.f16224h = -1L;
    }

    private static void b(int i8, int i9, String str, String str2) {
        F10.zze(i8 >= i9, str + " cannot be less than " + str2);
    }

    private final void c(C2577dJ0 c2577dJ0) {
        if (this.f16223g.remove(c2577dJ0) != null) {
            d();
        }
    }

    private final void d() {
        if (this.f16223g.isEmpty()) {
            this.f16217a.zze();
        } else {
            this.f16217a.zzf(a());
        }
    }

    final int a() {
        Iterator it = this.f16223g.values().iterator();
        int i8 = 0;
        while (it.hasNext()) {
            i8 += ((RE0) it.next()).zzb;
        }
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final long zzb(C2577dJ0 c2577dJ0) {
        return this.f16222f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zzc(C2577dJ0 c2577dJ0) {
        long id = Thread.currentThread().getId();
        long j8 = this.f16224h;
        boolean z8 = true;
        if (j8 != -1 && j8 != id) {
            z8 = false;
        }
        F10.zzg(z8, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f16224h = id;
        if (!this.f16223g.containsKey(c2577dJ0)) {
            this.f16223g.put(c2577dJ0, new RE0(null));
        }
        RE0 re0 = (RE0) this.f16223g.get(c2577dJ0);
        re0.getClass();
        re0.zzb = 13107200;
        re0.zza = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zzd(C2577dJ0 c2577dJ0) {
        c(c2577dJ0);
        if (this.f16223g.isEmpty()) {
            this.f16224h = -1L;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zze(C2577dJ0 c2577dJ0) {
        c(c2577dJ0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final void zzf(C2577dJ0 c2577dJ0, RG rg, NM0 nm0, EG0[] eg0Arr, SN0 sn0, PO0[] po0Arr) {
        RE0 re0 = (RE0) this.f16223g.get(c2577dJ0);
        re0.getClass();
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int length = eg0Arr.length;
            if (i8 >= 2) {
                re0.zzb = Math.max(13107200, i9);
                d();
                return;
            } else {
                if (po0Arr[i8] != null) {
                    i9 += eg0Arr[i8].zzb() != 1 ? 131072000 : 13107200;
                }
                i8++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final boolean zzg(C2577dJ0 c2577dJ0) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final boolean zzh(C2577dJ0 c2577dJ0, RG rg, NM0 nm0, long j8, long j9, float f8) {
        RE0 re0 = (RE0) this.f16223g.get(c2577dJ0);
        re0.getClass();
        int iZza = this.f16217a.zza();
        int iA = a();
        long jMin = this.f16218b;
        if (f8 > 1.0f) {
            jMin = Math.min(AbstractC2281am0.zzp(jMin, f8), this.f16219c);
        }
        if (j9 < Math.max(jMin, 500000L)) {
            boolean z8 = iZza < iA;
            re0.zza = z8;
            if (!z8 && j9 < 500000) {
                AbstractC2834fc0.zzf("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j9 >= this.f16219c || iZza >= iA) {
            re0.zza = false;
        }
        return re0.zza;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final boolean zzi(C2577dJ0 c2577dJ0, RG rg, NM0 nm0, long j8, float f8, boolean z8, long j9) {
        long jZzq = AbstractC2281am0.zzq(j8, f8);
        long jMin = z8 ? this.f16221e : this.f16220d;
        if (j9 != -9223372036854775807L) {
            jMin = Math.min(j9 / 2, jMin);
        }
        return jMin <= 0 || jZzq >= jMin || this.f16217a.zza() >= a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2227aG0
    public final C2703eP0 zzj() {
        return this.f16217a;
    }
}
