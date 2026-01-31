package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.Xe0 */
/* loaded from: classes2.dex */
public final class C2079Xe0 implements InterfaceC1792Qe0 {

    /* renamed from: f */
    private static C2079Xe0 f17271f;

    /* renamed from: a */
    private float f17272a = 0.0f;

    /* renamed from: b */
    private final C1628Me0 f17273b;

    /* renamed from: c */
    private final C1465Ie0 f17274c;

    /* renamed from: d */
    private C1588Le0 f17275d;

    /* renamed from: e */
    private C1751Pe0 f17276e;

    public C2079Xe0(C1628Me0 c1628Me0, C1465Ie0 c1465Ie0) {
        this.f17273b = c1628Me0;
        this.f17274c = c1465Ie0;
    }

    public static C2079Xe0 zzb() {
        if (f17271f == null) {
            f17271f = new C2079Xe0(new C1628Me0(), new C1465Ie0());
        }
        return f17271f;
    }

    public final float zza() {
        return this.f17272a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1792Qe0
    public final void zzc(boolean z8) {
        if (z8) {
            C5006yf0.zzd().zzi();
        } else {
            C5006yf0.zzd().zzh();
        }
    }

    public final void zzd(Context context) {
        this.f17275d = new C1588Le0(new Handler(), context, new C1424He0(), this);
    }

    public final void zze(float f8) {
        this.f17272a = f8;
        if (this.f17276e == null) {
            this.f17276e = C1751Pe0.zza();
        }
        Iterator it = this.f17276e.zzb().iterator();
        while (it.hasNext()) {
            ((C4890xe0) it.next()).zzg().zzl(f8);
        }
    }

    public final void zzf() {
        C1710Oe0.zza().zze(this);
        C1710Oe0.zza().zzf();
        C5006yf0.zzd().zzi();
        this.f17275d.zza();
    }

    public final void zzg() {
        C5006yf0.zzd().zzj();
        C1710Oe0.zza().zzg();
        this.f17275d.zzb();
    }
}
