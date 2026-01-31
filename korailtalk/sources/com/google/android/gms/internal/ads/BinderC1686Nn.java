package com.google.android.gms.internal.ads;

import N1.AbstractC0676a;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* renamed from: com.google.android.gms.internal.ads.Nn, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC1686Nn extends AbstractBinderC1809Qn {

    /* renamed from: a, reason: collision with root package name */
    private static final C2016Vo f14950a = new C2016Vo();

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1809Qn, com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final InterfaceC1973Un zzb(String str) throws RemoteException {
        BinderC4453to binderC4453to;
        try {
            try {
                Class<?> cls = Class.forName(str, false, BinderC1686Nn.class.getClassLoader());
                if (N1.g.class.isAssignableFrom(cls)) {
                    return new BinderC4453to((N1.g) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (AbstractC0676a.class.isAssignableFrom(cls)) {
                    return new BinderC4453to((AbstractC0676a) cls.getDeclaredConstructor(null).newInstance(null));
                }
                L1.n.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
                throw new RemoteException();
            } catch (Throwable unused) {
                L1.n.zze("Reflection failed, retrying using direct instantiation");
                if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        binderC4453to = new BinderC4453to(new CustomEventAdapter());
                    }
                    throw new RemoteException();
                }
                binderC4453to = new BinderC4453to(new AdMobAdapter());
                return binderC4453to;
            }
        } catch (Throwable th) {
            L1.n.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1809Qn, com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final InterfaceC1852Ro zzc(String str) {
        return new BinderC2744ep((RtbAdapter) Class.forName(str, false, C2016Vo.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1809Qn, com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final boolean zzd(String str) {
        try {
            return AbstractC0676a.class.isAssignableFrom(Class.forName(str, false, BinderC1686Nn.class.getClassLoader()));
        } catch (Throwable unused) {
            L1.n.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1809Qn, com.google.android.gms.internal.ads.InterfaceC1850Rn
    public final boolean zze(String str) {
        try {
            return O1.a.class.isAssignableFrom(Class.forName(str, false, BinderC1686Nn.class.getClassLoader()));
        } catch (Throwable unused) {
            L1.n.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
