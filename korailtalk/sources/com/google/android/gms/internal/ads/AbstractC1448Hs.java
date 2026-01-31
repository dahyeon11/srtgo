package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Hs */
/* loaded from: classes2.dex */
public abstract class AbstractC1448Hs {

    /* renamed from: a */
    static AbstractC1448Hs f13367a;

    public static synchronized AbstractC1448Hs zzd(Context context) {
        try {
            AbstractC1448Hs abstractC1448Hs = f13367a;
            if (abstractC1448Hs != null) {
                return abstractC1448Hs;
            }
            Context applicationContext = context.getApplicationContext();
            AbstractC4439th.zza(applicationContext);
            InterfaceC0671x0 interfaceC0671x0Zzi = G1.u.zzo().zzi();
            interfaceC0671x0Zzi.zzs(applicationContext);
            C5145zs c5145zs = new C5145zs(null);
            c5145zs.zzb(applicationContext);
            c5145zs.zzc(G1.u.zzB());
            c5145zs.zza(interfaceC0671x0Zzi);
            c5145zs.zzd(G1.u.zzn());
            AbstractC1448Hs abstractC1448HsZze = c5145zs.zze();
            f13367a = abstractC1448HsZze;
            abstractC1448HsZze.a().a();
            C1611Ls c1611LsC = f13367a.c();
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzar)).booleanValue()) {
                G1.u.zzp();
                Map mapZzv = K1.K0.zzv((String) H1.C.zzc().zza(AbstractC4439th.zzat));
                Iterator it = mapZzv.keySet().iterator();
                while (it.hasNext()) {
                    c1611LsC.c((String) it.next());
                }
                c1611LsC.d(new C1530Js(c1611LsC, mapZzv));
            }
            return f13367a;
        } catch (Throwable th) {
            throw th;
        }
    }

    abstract SharedPreferencesOnSharedPreferenceChangeListenerC4347ss a();

    abstract C4803ws b();

    abstract C1611Ls c();
}
