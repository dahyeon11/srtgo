package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import f2.C5392b;
import f2.C5398h;
import g2.AbstractC5544f;
import g2.C5539a;
import h2.AbstractC5601s;
import i2.AbstractC5683p;
import i2.C5642A;
import i2.C5661U;
import i2.C5671d;
import i2.InterfaceC5677j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class C implements h2.r {

    /* renamed from: a */
    private final N f11872a;

    /* renamed from: b */
    private final Lock f11873b;

    /* renamed from: c */
    private final Context f11874c;

    /* renamed from: d */
    private final C5398h f11875d;

    /* renamed from: e */
    private C5392b f11876e;

    /* renamed from: f */
    private int f11877f;

    /* renamed from: h */
    private int f11879h;

    /* renamed from: k */
    private F2.e f11882k;

    /* renamed from: l */
    private boolean f11883l;

    /* renamed from: m */
    private boolean f11884m;

    /* renamed from: n */
    private boolean f11885n;

    /* renamed from: o */
    private InterfaceC5677j f11886o;

    /* renamed from: p */
    private boolean f11887p;

    /* renamed from: q */
    private boolean f11888q;

    /* renamed from: r */
    private final C5671d f11889r;

    /* renamed from: s */
    private final Map f11890s;

    /* renamed from: t */
    private final C5539a.AbstractC0301a f11891t;

    /* renamed from: g */
    private int f11878g = 0;

    /* renamed from: i */
    private final Bundle f11880i = new Bundle();

    /* renamed from: j */
    private final Set f11881j = new HashSet();

    /* renamed from: u */
    private final ArrayList f11892u = new ArrayList();

    public C(N n8, C5671d c5671d, Map<C5539a, Boolean> map, C5398h c5398h, C5539a.AbstractC0301a abstractC0301a, Lock lock, Context context) {
        this.f11872a = n8;
        this.f11889r = c5671d;
        this.f11890s = map;
        this.f11875d = c5398h;
        this.f11891t = abstractC0301a;
        this.f11873b = lock;
        this.f11874c = context;
    }

    private final void B() {
        ArrayList arrayList = this.f11892u;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((Future) arrayList.get(i8)).cancel(true);
        }
        this.f11892u.clear();
    }

    public final void a() {
        this.f11884m = false;
        this.f11872a.f11945n.f11919p = Collections.emptySet();
        for (C5539a.c cVar : this.f11881j) {
            if (!this.f11872a.f11938g.containsKey(cVar)) {
                this.f11872a.f11938g.put(cVar, new C5392b(17, null));
            }
        }
    }

    private final void b(boolean z8) {
        F2.e eVar = this.f11882k;
        if (eVar != null) {
            if (eVar.isConnected() && z8) {
                eVar.zaa();
            }
            eVar.disconnect();
            this.f11886o = null;
        }
    }

    private final void c() {
        this.f11872a.c();
        AbstractC5601s.zaa().execute(new RunnableC1120s(this));
        F2.e eVar = this.f11882k;
        if (eVar != null) {
            if (this.f11887p) {
                eVar.zac((InterfaceC5677j) AbstractC5683p.checkNotNull(this.f11886o), this.f11888q);
            }
            b(false);
        }
        Iterator it = this.f11872a.f11938g.keySet().iterator();
        while (it.hasNext()) {
            ((C5539a.f) AbstractC5683p.checkNotNull((C5539a.f) this.f11872a.f11937f.get((C5539a.c) it.next()))).disconnect();
        }
        this.f11872a.f11946o.zab(this.f11880i.isEmpty() ? null : this.f11880i);
    }

    public final void d(C5392b c5392b) {
        B();
        b(!c5392b.hasResolution());
        this.f11872a.e(c5392b);
        this.f11872a.f11946o.zaa(c5392b);
    }

    public final void e(C5392b c5392b, C5539a c5539a, boolean z8) {
        int priority = c5539a.zac().getPriority();
        if ((!z8 || c5392b.hasResolution() || this.f11875d.getErrorResolutionIntent(c5392b.getErrorCode()) != null) && (this.f11876e == null || priority < this.f11877f)) {
            this.f11876e = c5392b;
            this.f11877f = priority;
        }
        this.f11872a.f11938g.put(c5539a.zab(), c5392b);
    }

    public final void f() {
        if (this.f11879h != 0) {
            return;
        }
        if (!this.f11884m || this.f11885n) {
            ArrayList arrayList = new ArrayList();
            this.f11878g = 1;
            this.f11879h = this.f11872a.f11937f.size();
            for (C5539a.c cVar : this.f11872a.f11937f.keySet()) {
                if (!this.f11872a.f11938g.containsKey(cVar)) {
                    arrayList.add((C5539a.f) this.f11872a.f11937f.get(cVar));
                } else if (h()) {
                    c();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f11892u.add(AbstractC5601s.zaa().submit(new C1125x(this, arrayList)));
        }
    }

    public final boolean g(int i8) {
        if (this.f11878g == i8) {
            return true;
        }
        Log.w("GACConnecting", this.f11872a.f11945n.c());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i9 = this.f11879h;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i9);
        Log.w("GACConnecting", sb.toString());
        String strJ = j(this.f11878g);
        String strJ2 = j(i8);
        StringBuilder sb2 = new StringBuilder(strJ.length() + 70 + strJ2.length());
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(strJ);
        sb2.append(" but received callback for step ");
        sb2.append(strJ2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        d(new C5392b(8, null));
        return false;
    }

    public final boolean h() {
        int i8 = this.f11879h - 1;
        this.f11879h = i8;
        if (i8 > 0) {
            return false;
        }
        if (i8 < 0) {
            Log.w("GACConnecting", this.f11872a.f11945n.c());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            d(new C5392b(8, null));
            return false;
        }
        C5392b c5392b = this.f11876e;
        if (c5392b == null) {
            return true;
        }
        this.f11872a.f11944m = this.f11877f;
        d(c5392b);
        return false;
    }

    public final boolean i(C5392b c5392b) {
        return this.f11883l && !c5392b.hasResolution();
    }

    private static final String j(int i8) {
        return i8 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    static /* bridge */ /* synthetic */ Set q(C c9) {
        C5671d c5671d = c9.f11889r;
        if (c5671d == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(c5671d.getRequiredScopes());
        Map<C5539a, C5642A> mapZad = c9.f11889r.zad();
        for (C5539a c5539a : mapZad.keySet()) {
            if (!c9.f11872a.f11938g.containsKey(c5539a.zab())) {
                hashSet.addAll(mapZad.get(c5539a).zaa);
            }
        }
        return hashSet;
    }

    static /* bridge */ /* synthetic */ void t(C c9, G2.l lVar) {
        if (c9.g(0)) {
            C5392b c5392bZaa = lVar.zaa();
            if (!c5392bZaa.isSuccess()) {
                if (!c9.i(c5392bZaa)) {
                    c9.d(c5392bZaa);
                    return;
                } else {
                    c9.a();
                    c9.f();
                    return;
                }
            }
            C5661U c5661u = (C5661U) AbstractC5683p.checkNotNull(lVar.zab());
            C5392b c5392bZaa2 = c5661u.zaa();
            if (!c5392bZaa2.isSuccess()) {
                String strValueOf = String.valueOf(c5392bZaa2);
                Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                c9.d(c5392bZaa2);
                return;
            }
            c9.f11885n = true;
            c9.f11886o = (InterfaceC5677j) AbstractC5683p.checkNotNull(c5661u.zab());
            c9.f11887p = c5661u.zac();
            c9.f11888q = c5661u.zad();
            c9.f();
        }
    }

    @Override // h2.r
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T zaa(T t8) {
        this.f11872a.f11945n.f11911h.add(t8);
        return t8;
    }

    @Override // h2.r
    public final <A extends C5539a.b, T extends AbstractC1103b> T zab(T t8) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [F2.e, g2.a$f] */
    @Override // h2.r
    public final void zad() {
        this.f11872a.f11938g.clear();
        this.f11884m = false;
        this.f11876e = null;
        this.f11878g = 0;
        this.f11883l = true;
        this.f11885n = false;
        this.f11887p = false;
        HashMap map = new HashMap();
        boolean z8 = false;
        for (C5539a c5539a : this.f11890s.keySet()) {
            C5539a.f fVar = (C5539a.f) AbstractC5683p.checkNotNull((C5539a.f) this.f11872a.f11937f.get(c5539a.zab()));
            z8 |= c5539a.zac().getPriority() == 1;
            boolean zBooleanValue = ((Boolean) this.f11890s.get(c5539a)).booleanValue();
            if (fVar.requiresSignIn()) {
                this.f11884m = true;
                if (zBooleanValue) {
                    this.f11881j.add(c5539a.zab());
                } else {
                    this.f11883l = false;
                }
            }
            map.put(fVar, new C1121t(this, c5539a, zBooleanValue));
        }
        if (z8) {
            this.f11884m = false;
        }
        if (this.f11884m) {
            AbstractC5683p.checkNotNull(this.f11889r);
            AbstractC5683p.checkNotNull(this.f11891t);
            this.f11889r.zae(Integer.valueOf(System.identityHashCode(this.f11872a.f11945n)));
            A a9 = new A(this, null);
            C5539a.AbstractC0301a abstractC0301a = this.f11891t;
            Context context = this.f11874c;
            Looper looper = this.f11872a.f11945n.getLooper();
            C5671d c5671d = this.f11889r;
            this.f11882k = abstractC0301a.buildClient(context, looper, c5671d, (Object) c5671d.zaa(), (AbstractC5544f.b) a9, (AbstractC5544f.c) a9);
        }
        this.f11879h = this.f11872a.f11937f.size();
        this.f11892u.add(AbstractC5601s.zaa().submit(new C1124w(this, map)));
    }

    @Override // h2.r
    public final void zae() {
    }

    @Override // h2.r
    public final void zag(Bundle bundle) {
        if (g(1)) {
            if (bundle != null) {
                this.f11880i.putAll(bundle);
            }
            if (h()) {
                c();
            }
        }
    }

    @Override // h2.r
    public final void zah(C5392b c5392b, C5539a c5539a, boolean z8) {
        if (g(1)) {
            e(c5392b, c5539a, z8);
            if (h()) {
                c();
            }
        }
    }

    @Override // h2.r
    public final void zai(int i8) {
        d(new C5392b(8, null));
    }

    @Override // h2.r
    public final boolean zaj() {
        B();
        b(true);
        this.f11872a.e(null);
        return true;
    }
}
