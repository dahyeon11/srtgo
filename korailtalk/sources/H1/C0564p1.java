package H1;

import F1.a;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.internal.ads.AbstractC1802Qj0;
import com.google.android.gms.internal.ads.C1523Jn;
import com.google.android.gms.internal.ads.C2051Wl;
import com.google.android.gms.internal.ads.C2738em;
import com.google.android.gms.internal.ads.C2853fm;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y1.C6523d;
import y1.x;

/* renamed from: H1.p1 */
/* loaded from: classes.dex */
public final class C0564p1 {

    /* renamed from: h */
    private static C0564p1 f1728h;

    /* renamed from: f */
    private InterfaceC0571s0 f1734f;

    /* renamed from: a */
    private final Object f1729a = new Object();

    /* renamed from: c */
    private boolean f1731c = false;

    /* renamed from: d */
    private boolean f1732d = false;

    /* renamed from: e */
    private final Object f1733e = new Object();

    /* renamed from: g */
    private y1.x f1735g = new x.a().build();

    /* renamed from: b */
    private final ArrayList f1730b = new ArrayList();

    private C0564p1() {
    }

    private final void a(Context context) {
        if (this.f1734f == null) {
            this.f1734f = (InterfaceC0571s0) new r(C0591z.zza(), context).zzd(context, false);
        }
    }

    private final void b(y1.x xVar) {
        try {
            this.f1734f.zzu(new M1(xVar));
        } catch (RemoteException e8) {
            L1.n.zzh("Unable to set request configuration parcel.", e8);
        }
    }

    static /* bridge */ /* synthetic */ y1.r c(C0564p1 c0564p1) {
        c0564p1.getClass();
        return null;
    }

    public static F1.b k(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2051Wl c2051Wl = (C2051Wl) it.next();
            map.put(c2051Wl.zza, new C2738em(c2051Wl.zzb ? a.EnumC0028a.READY : a.EnumC0028a.NOT_READY, c2051Wl.zzd, c2051Wl.zzc));
        }
        return new C2853fm(map);
    }

    private final void l(Context context, String str) {
        try {
            C1523Jn.zza().zzb(context, null);
            this.f1734f.zzk();
            this.f1734f.zzl(null, r2.b.wrap(null));
        } catch (RemoteException e8) {
            L1.n.zzk("MobileAdsSettingManager initialization failed", e8);
        }
    }

    public static C0564p1 zzf() {
        C0564p1 c0564p1;
        synchronized (C0564p1.class) {
            try {
                if (f1728h == null) {
                    f1728h = new C0564p1();
                }
                c0564p1 = f1728h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0564p1;
    }

    final /* synthetic */ void i(Context context, String str) {
        synchronized (this.f1733e) {
            l(context, null);
        }
    }

    final /* synthetic */ void j(Context context, String str) {
        synchronized (this.f1733e) {
            l(context, null);
        }
    }

    public final float zza() {
        synchronized (this.f1733e) {
            InterfaceC0571s0 interfaceC0571s0 = this.f1734f;
            float fZze = 1.0f;
            if (interfaceC0571s0 == null) {
                return 1.0f;
            }
            try {
                fZze = interfaceC0571s0.zze();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to get app volume.", e8);
            }
            return fZze;
        }
    }

    public final y1.x zzc() {
        return this.f1735g;
    }

    public final F1.b zze() {
        F1.b bVarK;
        synchronized (this.f1733e) {
            try {
                AbstractC5683p.checkState(this.f1734f != null, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    bVarK = k(this.f1734f.zzg());
                } catch (RemoteException unused) {
                    L1.n.zzg("Unable to get Initialization status.");
                    return new F1.b() { // from class: H1.h1
                        @Override // F1.b
                        public final Map getAdapterStatusMap() {
                            HashMap map = new HashMap();
                            map.put("com.google.android.gms.ads.MobileAds", new C0549k1(this.zza));
                            return map;
                        }
                    };
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVarK;
    }

    public final String zzh() {
        String strZzc;
        synchronized (this.f1733e) {
            try {
                AbstractC5683p.checkState(this.f1734f != null, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    strZzc = AbstractC1802Qj0.zzc(this.f1734f.zzf());
                } catch (RemoteException e8) {
                    L1.n.zzh("Unable to get internal version.", e8);
                    return "";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strZzc;
    }

    public final void zzl(Context context) {
        synchronized (this.f1733e) {
            a(context);
            try {
                this.f1734f.zzi();
            } catch (RemoteException unused) {
                L1.n.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00a0 A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:87:0x0034, B:89:0x0054, B:99:0x006d, B:101:0x007e, B:103:0x0090, B:110:0x00d3, B:104:0x00a0, B:106:0x00ae, B:108:0x00c0, B:109:0x00cb, B:96:0x0062, B:98:0x0068), top: B:118:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cb A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:87:0x0034, B:89:0x0054, B:99:0x006d, B:101:0x007e, B:103:0x0090, B:110:0x00d3, B:104:0x00a0, B:106:0x00ae, B:108:0x00c0, B:109:0x00cb, B:96:0x0062, B:98:0x0068), top: B:118:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzm(final android.content.Context r3, java.lang.String r4, F1.c r5) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.C0564p1.zzm(android.content.Context, java.lang.String, F1.c):void");
    }

    public final void zzp(Context context, y1.r rVar) {
        synchronized (this.f1733e) {
            a(context);
            try {
                this.f1734f.zzm(new BinderC0555m1(null));
            } catch (RemoteException unused) {
                L1.n.zzg("Unable to open the ad inspector.");
                if (rVar != null) {
                    rVar.a(new C6523d(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        synchronized (this.f1733e) {
            AbstractC5683p.checkState(this.f1734f != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.f1734f.zzn(r2.b.wrap(context), str);
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to open debug menu.", e8);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.f1733e) {
            try {
                this.f1734f.zzh(cls.getCanonicalName());
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to register RtbAdapter", e8);
            }
        }
    }

    public final void zzs(boolean z8) {
        synchronized (this.f1733e) {
            AbstractC5683p.checkState(this.f1734f != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.f1734f.zzp(z8);
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to set app mute state.", e8);
            }
        }
    }

    public final void zzt(float f8) {
        boolean z8 = true;
        AbstractC5683p.checkArgument(f8 >= 0.0f && f8 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.f1733e) {
            if (this.f1734f == null) {
                z8 = false;
            }
            AbstractC5683p.checkState(z8, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.f1734f.zzq(f8);
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to set app volume.", e8);
            }
        }
    }

    public final void zzu(String str) {
        synchronized (this.f1733e) {
            AbstractC5683p.checkState(this.f1734f != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            try {
                this.f1734f.zzt(str);
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to set plugin.", e8);
            }
        }
    }

    public final void zzv(y1.x xVar) {
        AbstractC5683p.checkArgument(xVar != null, "Null passed to setRequestConfiguration.");
        synchronized (this.f1733e) {
            try {
                y1.x xVar2 = this.f1735g;
                this.f1735g = xVar;
                if (this.f1734f == null) {
                    return;
                }
                if (xVar2.getTagForChildDirectedTreatment() != xVar.getTagForChildDirectedTreatment() || xVar2.getTagForUnderAgeOfConsent() != xVar.getTagForUnderAgeOfConsent()) {
                    b(xVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzw() {
        synchronized (this.f1733e) {
            InterfaceC0571s0 interfaceC0571s0 = this.f1734f;
            boolean zZzv = false;
            if (interfaceC0571s0 == null) {
                return false;
            }
            try {
                zZzv = interfaceC0571s0.zzv();
            } catch (RemoteException e8) {
                L1.n.zzh("Unable to get app mute state.", e8);
            }
            return zZzv;
        }
    }

    public final boolean zzx(boolean z8) {
        synchronized (this.f1733e) {
            try {
                AbstractC5683p.checkState(this.f1734f != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
                try {
                    this.f1734f.zzj(z8);
                } catch (RemoteException e8) {
                    L1.n.zzh("Unable to " + (z8 ? "enable" : "disable") + " the publisher first-party ID.", e8);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }
}
