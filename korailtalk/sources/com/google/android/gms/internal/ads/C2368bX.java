package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bX */
/* loaded from: classes2.dex */
public final class C2368bX {

    /* renamed from: a */
    private final Context f18142a;

    /* renamed from: b */
    private final L1.a f18143b;

    /* renamed from: c */
    private final C4654va0 f18144c;

    /* renamed from: d */
    private final InterfaceC2065Wv f18145d;

    /* renamed from: e */
    private C1301Ee0 f18146e;

    C2368bX(Context context, L1.a aVar, C4654va0 c4654va0, InterfaceC2065Wv interfaceC2065Wv) {
        this.f18142a = context;
        this.f18143b = aVar;
        this.f18144c = c4654va0;
        this.f18145d = interfaceC2065Wv;
    }

    public final synchronized void zza(View view) {
        C1301Ee0 c1301Ee0 = this.f18146e;
        if (c1301Ee0 != null) {
            G1.u.zzA().zzh(c1301Ee0, view);
        }
    }

    public final synchronized void zzb() {
        InterfaceC2065Wv interfaceC2065Wv;
        if (this.f18146e == null || (interfaceC2065Wv = this.f18145d) == null) {
            return;
        }
        interfaceC2065Wv.zzd("onSdkImpression", AbstractC2737el0.zzd());
    }

    public final synchronized void zzc() {
        InterfaceC2065Wv interfaceC2065Wv;
        try {
            C1301Ee0 c1301Ee0 = this.f18146e;
            if (c1301Ee0 == null || (interfaceC2065Wv = this.f18145d) == null) {
                return;
            }
            Iterator it = interfaceC2065Wv.zzV().iterator();
            while (it.hasNext()) {
                G1.u.zzA().zzh(c1301Ee0, (View) it.next());
            }
            this.f18145d.zzd("onSdkLoaded", AbstractC2737el0.zzd());
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean zzd() {
        return this.f18146e != null;
    }

    public final synchronized boolean zze(boolean z8) {
        if (this.f18144c.zzU) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeZ)).booleanValue()) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfc)).booleanValue() && this.f18145d != null) {
                    if (this.f18146e != null) {
                        L1.n.zzj("Omid javascript session service already started for ad.");
                        return false;
                    }
                    if (!G1.u.zzA().zzl(this.f18142a)) {
                        L1.n.zzj("Unable to initialize omid.");
                        return false;
                    }
                    if (this.f18144c.zzW.zzb()) {
                        C1301Ee0 c1301Ee0Zze = G1.u.zzA().zze(this.f18143b, this.f18145d.zzG(), true);
                        if (c1301Ee0Zze == null) {
                            L1.n.zzj("Unable to create javascript session service.");
                            return false;
                        }
                        L1.n.zzi("Created omid javascript session service.");
                        this.f18146e = c1301Ee0Zze;
                        this.f18145d.zzas(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void zzf(C3786nw c3786nw) {
        C1301Ee0 c1301Ee0 = this.f18146e;
        if (c1301Ee0 == null || this.f18145d == null) {
            return;
        }
        G1.u.zzA().zzm(c1301Ee0, c3786nw);
        this.f18146e = null;
        this.f18145d.zzas(null);
    }
}
