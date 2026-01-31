package com.google.android.gms.common.api.internal;

import I2.C0609m;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1106d;
import f2.C5392b;
import f2.C5394d;
import g2.AbstractC5543e;
import g2.AbstractC5544f;
import g2.C5539a;
import h2.AbstractC5608z;
import h2.C5585b;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import o2.AbstractC6030b;

/* loaded from: classes.dex */
public final class U implements AbstractC5544f.b, AbstractC5544f.c, h2.U {

    /* renamed from: b */
    private final C5539a.f f11954b;

    /* renamed from: c */
    private final C5585b f11955c;

    /* renamed from: d */
    private final C1115m f11956d;

    /* renamed from: g */
    private final int f11959g;

    /* renamed from: h */
    private final h2.M f11960h;

    /* renamed from: i */
    private boolean f11961i;

    /* renamed from: m */
    final /* synthetic */ C1105c f11965m;

    /* renamed from: a */
    private final Queue f11953a = new LinkedList();

    /* renamed from: e */
    private final Set f11957e = new HashSet();

    /* renamed from: f */
    private final Map f11958f = new HashMap();

    /* renamed from: j */
    private final List f11962j = new ArrayList();

    /* renamed from: k */
    private C5392b f11963k = null;

    /* renamed from: l */
    private int f11964l = 0;

    public U(C1105c c1105c, AbstractC5543e abstractC5543e) {
        this.f11965m = c1105c;
        C5539a.f fVarZab = abstractC5543e.zab(c1105c.f12011p.getLooper(), this);
        this.f11954b = fVarZab;
        this.f11955c = abstractC5543e.getApiKey();
        this.f11956d = new C1115m();
        this.f11959g = abstractC5543e.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f11960h = abstractC5543e.zac(c1105c.f12002g, c1105c.f12011p);
        } else {
            this.f11960h = null;
        }
    }

    private final C5394d a(C5394d[] c5394dArr) {
        if (c5394dArr != null && c5394dArr.length != 0) {
            C5394d[] availableFeatures = this.f11954b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new C5394d[0];
            }
            O.a aVar = new O.a(availableFeatures.length);
            for (C5394d c5394d : availableFeatures) {
                aVar.put(c5394d.getName(), Long.valueOf(c5394d.getVersion()));
            }
            for (C5394d c5394d2 : c5394dArr) {
                Long l8 = (Long) aVar.get(c5394d2.getName());
                if (l8 == null || l8.longValue() < c5394d2.getVersion()) {
                    return c5394d2;
                }
            }
        }
        return null;
    }

    private final void b(C5392b c5392b) {
        Iterator it = this.f11957e.iterator();
        while (it.hasNext()) {
            ((h2.Q) it.next()).zac(this.f11955c, c5392b, AbstractC5681n.equal(c5392b, C5392b.RESULT_SUCCESS) ? this.f11954b.getEndpointPackageName() : null);
        }
        this.f11957e.clear();
    }

    public final void c(Status status) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        d(status, null, false);
    }

    private final void d(Status status, Exception exc, boolean z8) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f11953a.iterator();
        while (it.hasNext()) {
            q0 q0Var = (q0) it.next();
            if (!z8 || q0Var.zac == 2) {
                if (status != null) {
                    q0Var.zad(status);
                } else {
                    q0Var.zae(exc);
                }
                it.remove();
            }
        }
    }

    private final void e() {
        ArrayList arrayList = new ArrayList(this.f11953a);
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            q0 q0Var = (q0) arrayList.get(i8);
            if (!this.f11954b.isConnected()) {
                return;
            }
            if (k(q0Var)) {
                this.f11953a.remove(q0Var);
            }
        }
    }

    public final void f() {
        zan();
        b(C5392b.RESULT_SUCCESS);
        j();
        Iterator it = this.f11958f.values().iterator();
        while (it.hasNext()) {
            h2.E e8 = (h2.E) it.next();
            if (a(e8.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    e8.zaa.a(this.f11954b, new C0609m());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f11954b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i8) {
        zan();
        this.f11961i = true;
        this.f11956d.e(i8, this.f11954b.getLastDisconnectMessage());
        C1105c c1105c = this.f11965m;
        c1105c.f12011p.sendMessageDelayed(Message.obtain(c1105c.f12011p, 9, this.f11955c), this.f11965m.f11996a);
        C1105c c1105c2 = this.f11965m;
        c1105c2.f12011p.sendMessageDelayed(Message.obtain(c1105c2.f12011p, 11, this.f11955c), this.f11965m.f11997b);
        this.f11965m.f12004i.zac();
        Iterator it = this.f11958f.values().iterator();
        while (it.hasNext()) {
            ((h2.E) it.next()).zac.run();
        }
    }

    private final void h() {
        this.f11965m.f12011p.removeMessages(12, this.f11955c);
        C1105c c1105c = this.f11965m;
        c1105c.f12011p.sendMessageDelayed(c1105c.f12011p.obtainMessage(12, this.f11955c), this.f11965m.f11998c);
    }

    private final void i(q0 q0Var) {
        q0Var.zag(this.f11956d, zaz());
        try {
            q0Var.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f11954b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    private final void j() {
        if (this.f11961i) {
            this.f11965m.f12011p.removeMessages(11, this.f11955c);
            this.f11965m.f12011p.removeMessages(9, this.f11955c);
            this.f11961i = false;
        }
    }

    private final boolean k(q0 q0Var) {
        if (!(q0Var instanceof AbstractC5608z)) {
            i(q0Var);
            return true;
        }
        AbstractC5608z abstractC5608z = (AbstractC5608z) q0Var;
        C5394d c5394dA = a(abstractC5608z.zab(this));
        if (c5394dA == null) {
            i(q0Var);
            return true;
        }
        String name = this.f11954b.getClass().getName();
        String name2 = c5394dA.getName();
        long version = c5394dA.getVersion();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(name2);
        sb.append(", ");
        sb.append(version);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f11965m.f12012q || !abstractC5608z.zaa(this)) {
            abstractC5608z.zae(new g2.s(c5394dA));
            return true;
        }
        V v8 = new V(this.f11955c, c5394dA, null);
        int iIndexOf = this.f11962j.indexOf(v8);
        if (iIndexOf >= 0) {
            V v9 = (V) this.f11962j.get(iIndexOf);
            this.f11965m.f12011p.removeMessages(15, v9);
            C1105c c1105c = this.f11965m;
            c1105c.f12011p.sendMessageDelayed(Message.obtain(c1105c.f12011p, 15, v9), this.f11965m.f11996a);
            return false;
        }
        this.f11962j.add(v8);
        C1105c c1105c2 = this.f11965m;
        c1105c2.f12011p.sendMessageDelayed(Message.obtain(c1105c2.f12011p, 15, v8), this.f11965m.f11996a);
        C1105c c1105c3 = this.f11965m;
        c1105c3.f12011p.sendMessageDelayed(Message.obtain(c1105c3.f12011p, 16, v8), this.f11965m.f11997b);
        C5392b c5392b = new C5392b(2, null);
        if (l(c5392b)) {
            return false;
        }
        this.f11965m.d(c5392b, this.f11959g);
        return false;
    }

    private final boolean l(C5392b c5392b) {
        synchronized (C1105c.f11994s) {
            try {
                C1105c c1105c = this.f11965m;
                if (c1105c.f12008m == null || !c1105c.f12009n.contains(this.f11955c)) {
                    return false;
                }
                this.f11965m.f12008m.zah(c5392b, this.f11959g);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean m(boolean z8) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        if (!this.f11954b.isConnected() || this.f11958f.size() != 0) {
            return false;
        }
        if (!this.f11956d.f()) {
            this.f11954b.disconnect("Timing out service connection.");
            return true;
        }
        if (z8) {
            h();
        }
        return false;
    }

    static /* bridge */ /* synthetic */ void t(U u8, V v8) {
        if (u8.f11962j.contains(v8) && !u8.f11961i) {
            if (u8.f11954b.isConnected()) {
                u8.e();
            } else {
                u8.zao();
            }
        }
    }

    static /* bridge */ /* synthetic */ void u(U u8, V v8) {
        C5394d[] c5394dArrZab;
        if (u8.f11962j.remove(v8)) {
            u8.f11965m.f12011p.removeMessages(15, v8);
            u8.f11965m.f12011p.removeMessages(16, v8);
            C5394d c5394d = v8.f11967b;
            ArrayList arrayList = new ArrayList(u8.f11953a.size());
            for (q0 q0Var : u8.f11953a) {
                if ((q0Var instanceof AbstractC5608z) && (c5394dArrZab = ((AbstractC5608z) q0Var).zab(u8)) != null && AbstractC6030b.contains(c5394dArrZab, c5394d)) {
                    arrayList.add(q0Var);
                }
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                q0 q0Var2 = (q0) arrayList.get(i8);
                u8.f11953a.remove(q0Var2);
                q0Var2.zae(new g2.s(c5394d));
            }
        }
    }

    final int n() {
        return this.f11964l;
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f11965m.f12011p.getLooper()) {
            f();
        } else {
            this.f11965m.f12011p.post(new P(this));
        }
    }

    @Override // g2.AbstractC5544f.c, h2.InterfaceC5591h
    public final void onConnectionFailed(C5392b c5392b) {
        zar(c5392b, null);
    }

    @Override // g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnectionSuspended(int i8) {
        if (Looper.myLooper() == this.f11965m.f12011p.getLooper()) {
            g(i8);
        } else {
            this.f11965m.f12011p.post(new Q(this, i8));
        }
    }

    final void v() {
        this.f11964l++;
    }

    final boolean x() {
        return this.f11954b.isConnected();
    }

    public final boolean zaA() {
        return m(true);
    }

    @Override // h2.U
    public final void zaa(C5392b c5392b, C5539a c5539a, boolean z8) {
        throw null;
    }

    public final int zab() {
        return this.f11959g;
    }

    public final C5392b zad() {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        return this.f11963k;
    }

    public final C5539a.f zaf() {
        return this.f11954b;
    }

    public final Map<C1106d.a, h2.E> zah() {
        return this.f11958f;
    }

    public final void zan() {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        this.f11963k = null;
    }

    public final void zao() {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        if (this.f11954b.isConnected() || this.f11954b.isConnecting()) {
            return;
        }
        try {
            C1105c c1105c = this.f11965m;
            int iZab = c1105c.f12004i.zab(c1105c.f12002g, this.f11954b);
            if (iZab == 0) {
                C1105c c1105c2 = this.f11965m;
                C5539a.f fVar = this.f11954b;
                X x8 = new X(c1105c2, fVar, this.f11955c);
                if (fVar.requiresSignIn()) {
                    ((h2.M) AbstractC5683p.checkNotNull(this.f11960h)).zae(x8);
                }
                try {
                    this.f11954b.connect(x8);
                    return;
                } catch (SecurityException e8) {
                    zar(new C5392b(10), e8);
                    return;
                }
            }
            C5392b c5392b = new C5392b(iZab, null);
            String name = this.f11954b.getClass().getName();
            String string = c5392b.toString();
            StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
            sb.append("The service for ");
            sb.append(name);
            sb.append(" is not available: ");
            sb.append(string);
            Log.w("GoogleApiManager", sb.toString());
            zar(c5392b, null);
        } catch (IllegalStateException e9) {
            zar(new C5392b(10), e9);
        }
    }

    public final void zap(q0 q0Var) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        if (this.f11954b.isConnected()) {
            if (k(q0Var)) {
                h();
                return;
            } else {
                this.f11953a.add(q0Var);
                return;
            }
        }
        this.f11953a.add(q0Var);
        C5392b c5392b = this.f11963k;
        if (c5392b == null || !c5392b.hasResolution()) {
            zao();
        } else {
            zar(this.f11963k, null);
        }
    }

    public final void zar(C5392b c5392b, Exception exc) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        h2.M m8 = this.f11960h;
        if (m8 != null) {
            m8.zaf();
        }
        zan();
        this.f11965m.f12004i.zac();
        b(c5392b);
        if ((this.f11954b instanceof k2.q) && c5392b.getErrorCode() != 24) {
            this.f11965m.f11999d = true;
            C1105c c1105c = this.f11965m;
            c1105c.f12011p.sendMessageDelayed(c1105c.f12011p.obtainMessage(19), H0.q.MIN_PERIODIC_FLEX_MILLIS);
        }
        if (c5392b.getErrorCode() == 4) {
            c(C1105c.f11993r);
            return;
        }
        if (this.f11953a.isEmpty()) {
            this.f11963k = c5392b;
            return;
        }
        if (exc != null) {
            AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
            d(null, exc, false);
            return;
        }
        if (!this.f11965m.f12012q) {
            c(C1105c.e(this.f11955c, c5392b));
            return;
        }
        d(C1105c.e(this.f11955c, c5392b), null, true);
        if (this.f11953a.isEmpty() || l(c5392b) || this.f11965m.d(c5392b, this.f11959g)) {
            return;
        }
        if (c5392b.getErrorCode() == 18) {
            this.f11961i = true;
        }
        if (!this.f11961i) {
            c(C1105c.e(this.f11955c, c5392b));
        } else {
            C1105c c1105c2 = this.f11965m;
            c1105c2.f12011p.sendMessageDelayed(Message.obtain(c1105c2.f12011p, 9, this.f11955c), this.f11965m.f11996a);
        }
    }

    public final void zas(C5392b c5392b) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        C5539a.f fVar = this.f11954b;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(c5392b);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        fVar.disconnect(sb.toString());
        zar(c5392b, null);
    }

    public final void zat(h2.Q q8) {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        this.f11957e.add(q8);
    }

    public final void zau() {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        if (this.f11961i) {
            zao();
        }
    }

    public final void zav() {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        c(C1105c.zaa);
        this.f11956d.zaf();
        for (C1106d.a aVar : (C1106d.a[]) this.f11958f.keySet().toArray(new C1106d.a[0])) {
            zap(new p0(aVar, new C0609m()));
        }
        b(new C5392b(4));
        if (this.f11954b.isConnected()) {
            this.f11954b.onUserSignOut(new T(this));
        }
    }

    public final void zaw() {
        AbstractC5683p.checkHandlerThread(this.f11965m.f12011p);
        if (this.f11961i) {
            j();
            C1105c c1105c = this.f11965m;
            c(c1105c.f12003h.isGooglePlayServicesAvailable(c1105c.f12002g) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f11954b.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.f11954b.requiresSignIn();
    }
}
