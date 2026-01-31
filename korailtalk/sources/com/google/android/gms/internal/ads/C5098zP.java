package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zP */
/* loaded from: classes2.dex */
public final class C5098zP {

    /* renamed from: a */
    private final C3859ob0 f24175a;

    /* renamed from: b */
    private final C4756wP f24176b;

    C5098zP(C3859ob0 c3859ob0, C4756wP c4756wP) {
        this.f24175a = c3859ob0;
        this.f24176b = c4756wP;
    }

    final InterfaceC1850Rn a() throws RemoteException {
        InterfaceC1850Rn interfaceC1850RnZzb = this.f24175a.zzb();
        if (interfaceC1850RnZzb != null) {
            return interfaceC1850RnZzb;
        }
        L1.n.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final InterfaceC1852Ro zzb(String str) {
        InterfaceC1852Ro interfaceC1852RoZzc = a().zzc(str);
        this.f24176b.b(str, interfaceC1852RoZzc);
        return interfaceC1852RoZzc;
    }

    public final C4087qb0 zzc(String str, JSONObject jSONObject) {
        InterfaceC1973Un interfaceC1973UnZzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC1973UnZzb = new BinderC4453to(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC1973UnZzb = new BinderC4453to(new zzbtx());
            } else {
                InterfaceC1850Rn interfaceC1850RnA = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        interfaceC1973UnZzb = interfaceC1850RnA.zze(string) ? interfaceC1850RnA.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC1850RnA.zzd(string) ? interfaceC1850RnA.zzb(string) : interfaceC1850RnA.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e8) {
                        L1.n.zzh("Invalid custom event.", e8);
                    }
                } else {
                    interfaceC1973UnZzb = interfaceC1850RnA.zzb(str);
                }
            }
            C4087qb0 c4087qb0 = new C4087qb0(interfaceC1973UnZzb);
            this.f24176b.a(str, c4087qb0);
            return c4087qb0;
        } catch (Throwable th) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjr)).booleanValue()) {
                this.f24176b.a(str, null);
            }
            throw new C2112Ya0(th);
        }
    }

    public final boolean zzd() {
        return this.f24175a.zzb() != null;
    }
}
