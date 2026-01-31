package com.google.android.gms.internal.ads;

import I2.AbstractC0608l;
import I2.C0609m;
import I2.InterfaceC0602f;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.aj0 */
/* loaded from: classes2.dex */
public final class C2275aj0 {

    /* renamed from: o */
    private static final Map f18006o = new HashMap();

    /* renamed from: a */
    private final Context f18007a;

    /* renamed from: b */
    private final C1718Oi0 f18008b;

    /* renamed from: g */
    private boolean f18013g;

    /* renamed from: h */
    private final Intent f18014h;

    /* renamed from: l */
    private ServiceConnection f18018l;

    /* renamed from: m */
    private IInterface f18019m;

    /* renamed from: n */
    private final C1186Bi0 f18020n;

    /* renamed from: d */
    private final List f18010d = new ArrayList();

    /* renamed from: e */
    private final Set f18011e = new HashSet();

    /* renamed from: f */
    private final Object f18012f = new Object();

    /* renamed from: j */
    private final IBinder.DeathRecipient f18016j = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.Qi0
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C2275aj0.zzj(this.zza);
        }
    };

    /* renamed from: k */
    private final AtomicInteger f18017k = new AtomicInteger(0);

    /* renamed from: c */
    private final String f18009c = "OverlayDisplayService";

    /* renamed from: i */
    private final WeakReference f18015i = new WeakReference(null);

    public C2275aj0(Context context, C1718Oi0 c1718Oi0, String str, Intent intent, C1186Bi0 c1186Bi0, InterfaceC2005Vi0 interfaceC2005Vi0) {
        this.f18007a = context;
        this.f18008b = c1718Oi0;
        this.f18014h = intent;
        this.f18020n = c1186Bi0;
    }

    static /* bridge */ /* synthetic */ void k(final C2275aj0 c2275aj0, final C0609m c0609m) {
        c2275aj0.f18011e.add(c0609m);
        c0609m.getTask().addOnCompleteListener(new InterfaceC0602f() { // from class: com.google.android.gms.internal.ads.Ri0
            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l) {
                this.zza.p(c0609m, abstractC0608l);
            }
        });
    }

    static /* bridge */ /* synthetic */ void m(C2275aj0 c2275aj0, AbstractRunnableC1759Pi0 abstractRunnableC1759Pi0) {
        if (c2275aj0.f18019m != null || c2275aj0.f18013g) {
            if (!c2275aj0.f18013g) {
                abstractRunnableC1759Pi0.run();
                return;
            } else {
                c2275aj0.f18008b.zzc("Waiting to bind to the service.", new Object[0]);
                c2275aj0.f18010d.add(abstractRunnableC1759Pi0);
                return;
            }
        }
        c2275aj0.f18008b.zzc("Initiate binding to the service.", new Object[0]);
        c2275aj0.f18010d.add(abstractRunnableC1759Pi0);
        ServiceConnectionC2169Zi0 serviceConnectionC2169Zi0 = new ServiceConnectionC2169Zi0(c2275aj0, null);
        c2275aj0.f18018l = serviceConnectionC2169Zi0;
        c2275aj0.f18013g = true;
        if (c2275aj0.f18007a.bindService(c2275aj0.f18014h, serviceConnectionC2169Zi0, 1)) {
            return;
        }
        c2275aj0.f18008b.zzc("Failed to bind to the service.", new Object[0]);
        c2275aj0.f18013g = false;
        Iterator it = c2275aj0.f18010d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC1759Pi0) it.next()).zzc(new C2390bj0());
        }
        c2275aj0.f18010d.clear();
    }

    static /* bridge */ /* synthetic */ void n(C2275aj0 c2275aj0) throws RemoteException {
        c2275aj0.f18008b.zzc("linkToDeath", new Object[0]);
        try {
            c2275aj0.f18019m.asBinder().linkToDeath(c2275aj0.f18016j, 0);
        } catch (RemoteException e8) {
            c2275aj0.f18008b.zzb(e8, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void o(C2275aj0 c2275aj0) {
        c2275aj0.f18008b.zzc("unlinkToDeath", new Object[0]);
        c2275aj0.f18019m.asBinder().unlinkToDeath(c2275aj0.f18016j, 0);
    }

    private final RemoteException q() {
        return new RemoteException(String.valueOf(this.f18009c).concat(" : Binder has died."));
    }

    public final void r() {
        Iterator it = this.f18011e.iterator();
        while (it.hasNext()) {
            ((C0609m) it.next()).trySetException(q());
        }
        this.f18011e.clear();
    }

    public static /* synthetic */ void zzj(C2275aj0 c2275aj0) {
        c2275aj0.f18008b.zzc("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.f.a(c2275aj0.f18015i.get());
        c2275aj0.f18008b.zzc("%s : Binder has died.", c2275aj0.f18009c);
        Iterator it = c2275aj0.f18010d.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC1759Pi0) it.next()).zzc(c2275aj0.q());
        }
        c2275aj0.f18010d.clear();
        synchronized (c2275aj0.f18012f) {
            c2275aj0.r();
        }
    }

    final /* synthetic */ void p(C0609m c0609m, AbstractC0608l abstractC0608l) {
        synchronized (this.f18012f) {
            this.f18011e.remove(c0609m);
        }
    }

    public final Handler zzc() {
        Handler handler;
        Map map = f18006o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f18009c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f18009c, 10);
                    handlerThread.start();
                    map.put(this.f18009c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f18009c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface zze() {
        return this.f18019m;
    }

    public final void zzs(AbstractRunnableC1759Pi0 abstractRunnableC1759Pi0, C0609m c0609m) {
        zzc().post(new C1882Si0(this, abstractRunnableC1759Pi0.a(), c0609m, abstractRunnableC1759Pi0));
    }

    public final void zzu() {
        zzc().post(new C1964Ui0(this));
    }
}
