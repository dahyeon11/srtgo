package com.google.android.gms.internal.ads;

import H1.AbstractBinderC0560o0;
import H1.C0575t1;
import H1.InterfaceC0563p0;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.ob0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3859ob0 {

    /* renamed from: d, reason: collision with root package name */
    private static C3859ob0 f21511d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f21512a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0563p0 f21513b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f21514c = new AtomicReference();

    C3859ob0(Context context, InterfaceC0563p0 interfaceC0563p0) {
        this.f21512a = context;
        this.f21513b = interfaceC0563p0;
    }

    static InterfaceC0563p0 a(Context context) {
        try {
            return AbstractBinderC0560o0.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e8) {
            L1.n.zzh("Failed to retrieve lite SDK info.", e8);
            return null;
        }
    }

    private final C0575t1 b() {
        InterfaceC0563p0 interfaceC0563p0 = this.f21513b;
        if (interfaceC0563p0 != null) {
            try {
                return interfaceC0563p0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public static C3859ob0 zzd(Context context) {
        synchronized (C3859ob0.class) {
            try {
                C3859ob0 c3859ob0 = f21511d;
                if (c3859ob0 != null) {
                    return c3859ob0;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) AbstractC4213ri.zzb.zze()).longValue();
                InterfaceC0563p0 interfaceC0563p0A = null;
                if (jLongValue > 0 && jLongValue <= 241806202) {
                    interfaceC0563p0A = a(applicationContext);
                }
                C3859ob0 c3859ob02 = new C3859ob0(applicationContext, interfaceC0563p0A);
                f21511d = c3859ob02;
                return c3859ob02;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final InterfaceC1850Rn zzb() {
        return (InterfaceC1850Rn) this.f21514c.get();
    }

    public final L1.a zzc(int i8, boolean z8, int i9) {
        C0575t1 c0575t1B;
        G1.u.zzp();
        boolean zZzE = K1.K0.zzE(this.f21512a);
        L1.a aVar = new L1.a(241806000, i9, true, zZzE);
        return (((Boolean) AbstractC4213ri.zzc.zze()).booleanValue() && (c0575t1B = b()) != null) ? new L1.a(241806000, c0575t1B.zza(), true, zZzE) : aVar;
    }

    public final String zze() {
        C0575t1 c0575t1B = b();
        if (c0575t1B != null) {
            return c0575t1B.zzb();
        }
        return null;
    }

    public final void zzf(InterfaceC1850Rn interfaceC1850Rn) {
        InterfaceC1850Rn adapterCreator;
        if (!((Boolean) AbstractC4213ri.zza.zze()).booleanValue()) {
            AbstractC3745nb0.zza(this.f21514c, null, interfaceC1850Rn);
            return;
        }
        InterfaceC0563p0 interfaceC0563p0 = this.f21513b;
        if (interfaceC0563p0 == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = interfaceC0563p0.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.f21514c;
        if (adapterCreator != null) {
            interfaceC1850Rn = adapterCreator;
        }
        AbstractC3745nb0.zza(atomicReference, null, interfaceC1850Rn);
    }
}
