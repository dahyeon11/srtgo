package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import f2.C5392b;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class FT extends IT {

    /* renamed from: g, reason: collision with root package name */
    private final Context f13030g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f13031h;

    public FT(Context context, Executor executor) {
        this.f13030g = context;
        this.f13031h = executor;
        this.f13471f = new C5027yq(context, G1.u.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.IT, i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f13467b) {
            try {
                if (!this.f13469d) {
                    this.f13469d = true;
                    try {
                        try {
                            this.f13471f.zzp().zzg(this.f13470e, new HT(this));
                        } catch (Throwable th) {
                            G1.u.zzo().zzw(th, "RemoteAdRequestClientTask.onConnected");
                            this.f13466a.zzd(new YT(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f13466a.zzd(new YT(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.IT, i2.AbstractC5670c.b
    public final void onConnectionFailed(C5392b c5392b) {
        L1.n.zze("Cannot connect to remote service, fallback to local instance.");
        this.f13466a.zzd(new YT(1));
    }

    public final com.google.common.util.concurrent.C zza(C2519cr c2519cr) {
        synchronized (this.f13467b) {
            try {
                if (this.f13468c) {
                    return this.f13466a;
                }
                this.f13468c = true;
                this.f13470e = c2519cr;
                this.f13471f.checkAvailabilityAndConnect();
                this.f13466a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.ET
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a();
                    }
                }, AbstractC4805wt.zzf);
                IT.b(this.f13030g, this.f13466a, this.f13031h);
                return this.f13466a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
