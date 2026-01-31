package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import f2.C5392b;

/* loaded from: classes2.dex */
public final class OT extends IT {

    /* renamed from: g, reason: collision with root package name */
    private String f15117g;

    /* renamed from: h, reason: collision with root package name */
    private int f15118h = 1;

    OT(Context context) {
        this.f13471f = new C5027yq(context, G1.u.zzt().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.IT, i2.AbstractC5670c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.f13467b) {
            try {
                if (!this.f13469d) {
                    this.f13469d = true;
                    try {
                        int i8 = this.f15118h;
                        if (i8 == 2) {
                            this.f13471f.zzp().zze(this.f13470e, new HT(this));
                        } else if (i8 == 3) {
                            this.f13471f.zzp().zzh(this.f15117g, new HT(this));
                        } else {
                            this.f13466a.zzd(new YT(1));
                        }
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.f13466a.zzd(new YT(1));
                    } catch (Throwable th) {
                        G1.u.zzo().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
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
                int i8 = this.f15118h;
                if (i8 != 1 && i8 != 2) {
                    return AbstractC1483In0.zzg(new YT(2));
                }
                if (this.f13468c) {
                    return this.f13466a;
                }
                this.f15118h = 2;
                this.f13468c = true;
                this.f13470e = c2519cr;
                this.f13471f.checkAvailabilityAndConnect();
                this.f13466a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.MT
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a();
                    }
                }, AbstractC4805wt.zzf);
                return this.f13466a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.google.common.util.concurrent.C zzd(String str) {
        synchronized (this.f13467b) {
            try {
                int i8 = this.f15118h;
                if (i8 != 1 && i8 != 3) {
                    return AbstractC1483In0.zzg(new YT(2));
                }
                if (this.f13468c) {
                    return this.f13466a;
                }
                this.f15118h = 3;
                this.f13468c = true;
                this.f15117g = str;
                this.f13471f.checkAvailabilityAndConnect();
                this.f13466a.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.NT
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.a();
                    }
                }, AbstractC4805wt.zzf);
                return this.f13466a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
