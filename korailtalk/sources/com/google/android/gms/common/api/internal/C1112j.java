package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import f2.C5392b;
import f2.C5398h;
import g2.C5539a;
import h2.InterfaceC5581A;
import h2.InterfaceC5594k;
import i2.AbstractC5681n;
import i2.AbstractC5683p;
import i2.C5671d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import x2.AbstractC6488e;

/* renamed from: com.google.android.gms.common.api.internal.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1112j implements InterfaceC5581A {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12046a;

    /* renamed from: b, reason: collision with root package name */
    private final K f12047b;

    /* renamed from: c, reason: collision with root package name */
    private final Looper f12048c;

    /* renamed from: d, reason: collision with root package name */
    private final N f12049d;

    /* renamed from: e, reason: collision with root package name */
    private final N f12050e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f12051f;

    /* renamed from: h, reason: collision with root package name */
    private final C5539a.f f12053h;

    /* renamed from: i, reason: collision with root package name */
    private Bundle f12054i;

    /* renamed from: m, reason: collision with root package name */
    private final Lock f12058m;

    /* renamed from: g, reason: collision with root package name */
    private final Set f12052g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: j, reason: collision with root package name */
    private C5392b f12055j = null;

    /* renamed from: k, reason: collision with root package name */
    private C5392b f12056k = null;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12057l = false;

    /* renamed from: n, reason: collision with root package name */
    private int f12059n = 0;

    private C1112j(Context context, K k8, Lock lock, Looper looper, C5398h c5398h, Map map, Map map2, C5671d c5671d, C5539a.AbstractC0301a abstractC0301a, C5539a.f fVar, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f12046a = context;
        this.f12047b = k8;
        this.f12058m = lock;
        this.f12048c = looper;
        this.f12053h = fVar;
        this.f12049d = new N(context, k8, lock, looper, c5398h, map2, null, map4, null, arrayList2, new A0(this, null));
        this.f12050e = new N(context, k8, lock, looper, c5398h, map, c5671d, map3, abstractC0301a, arrayList, new B0(this, null));
        O.a aVar = new O.a();
        Iterator it = map2.keySet().iterator();
        while (it.hasNext()) {
            aVar.put((C5539a.c) it.next(), this.f12049d);
        }
        Iterator it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            aVar.put((C5539a.c) it2.next(), this.f12050e);
        }
        this.f12051f = Collections.unmodifiableMap(aVar);
    }

    private final void a(C5392b c5392b) {
        int i8 = this.f12059n;
        if (i8 == 1) {
            b();
        } else if (i8 != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f12047b.zaa(c5392b);
            b();
        }
        this.f12059n = 0;
    }

    private final void b() {
        Iterator it = this.f12052g.iterator();
        while (it.hasNext()) {
            ((InterfaceC5594k) it.next()).onComplete();
        }
        this.f12052g.clear();
    }

    private final boolean c() {
        C5392b c5392b = this.f12056k;
        return c5392b != null && c5392b.getErrorCode() == 4;
    }

    private final boolean d(AbstractC1103b abstractC1103b) {
        N n8 = (N) this.f12051f.get(abstractC1103b.getClientKey());
        AbstractC5683p.checkNotNull(n8, "GoogleApiClient is not configured to use the API required for this call.");
        return n8.equals(this.f12050e);
    }

    private static boolean e(C5392b c5392b) {
        return c5392b != null && c5392b.isSuccess();
    }

    static /* bridge */ /* synthetic */ void m(C1112j c1112j, int i8, boolean z8) {
        c1112j.f12047b.zac(i8, z8);
        c1112j.f12056k = null;
        c1112j.f12055j = null;
    }

    static /* bridge */ /* synthetic */ void n(C1112j c1112j, Bundle bundle) {
        Bundle bundle2 = c1112j.f12054i;
        if (bundle2 == null) {
            c1112j.f12054i = bundle;
        } else if (bundle != null) {
            bundle2.putAll(bundle);
        }
    }

    static /* bridge */ /* synthetic */ void o(C1112j c1112j) {
        C5392b c5392b;
        if (!e(c1112j.f12055j)) {
            if (c1112j.f12055j != null && e(c1112j.f12056k)) {
                c1112j.f12050e.zar();
                c1112j.a((C5392b) AbstractC5683p.checkNotNull(c1112j.f12055j));
                return;
            }
            C5392b c5392b2 = c1112j.f12055j;
            if (c5392b2 == null || (c5392b = c1112j.f12056k) == null) {
                return;
            }
            if (c1112j.f12050e.f11944m < c1112j.f12049d.f11944m) {
                c5392b2 = c5392b;
            }
            c1112j.a(c5392b2);
            return;
        }
        if (e(c1112j.f12056k) || c1112j.c()) {
            int i8 = c1112j.f12059n;
            if (i8 == 1) {
                c1112j.b();
            } else if (i8 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((K) AbstractC5683p.checkNotNull(c1112j.f12047b)).zab(c1112j.f12054i);
                c1112j.b();
            }
            c1112j.f12059n = 0;
            return;
        }
        C5392b c5392b3 = c1112j.f12056k;
        if (c5392b3 != null) {
            if (c1112j.f12059n == 1) {
                c1112j.b();
            } else {
                c1112j.a(c5392b3);
                c1112j.f12049d.zar();
            }
        }
    }

    private final PendingIntent q() {
        if (this.f12053h == null) {
            return null;
        }
        return AbstractC6488e.zaa(this.f12046a, System.identityHashCode(this.f12047b), this.f12053h.getSignInIntent(), AbstractC6488e.zaa | 134217728);
    }

    public static C1112j zag(Context context, K k8, Lock lock, Looper looper, C5398h c5398h, Map<C5539a.c, C5539a.f> map, C5671d c5671d, Map<C5539a, Boolean> map2, C5539a.AbstractC0301a abstractC0301a, ArrayList<h2.T> arrayList) {
        O.a aVar = new O.a();
        O.a aVar2 = new O.a();
        C5539a.f fVar = null;
        for (Map.Entry<C5539a.c, C5539a.f> entry : map.entrySet()) {
            C5539a.f value = entry.getValue();
            if (true == value.providesSignIn()) {
                fVar = value;
            }
            if (value.requiresSignIn()) {
                aVar.put(entry.getKey(), value);
            } else {
                aVar2.put(entry.getKey(), value);
            }
        }
        AbstractC5683p.checkState(!aVar.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        O.a aVar3 = new O.a();
        O.a aVar4 = new O.a();
        for (C5539a c5539a : map2.keySet()) {
            C5539a.c cVarZab = c5539a.zab();
            if (aVar.containsKey(cVarZab)) {
                aVar3.put(c5539a, map2.get(c5539a));
            } else {
                if (!aVar2.containsKey(cVarZab)) {
                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                }
                aVar4.put(c5539a, map2.get(c5539a));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            h2.T t8 = arrayList.get(i8);
            if (aVar3.containsKey(t8.zaa)) {
                arrayList2.add(t8);
            } else {
                if (!aVar4.containsKey(t8.zaa)) {
                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                }
                arrayList3.add(t8);
            }
        }
        return new C1112j(context, k8, lock, looper, c5398h, aVar, aVar2, c5671d, abstractC0301a, fVar, arrayList2, arrayList3, aVar3, aVar4);
    }

    @Override // h2.InterfaceC5581A
    public final C5392b zab() {
        throw new UnsupportedOperationException();
    }

    @Override // h2.InterfaceC5581A
    public final C5392b zac(long j8, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // h2.InterfaceC5581A
    public final C5392b zad(C5539a c5539a) {
        return AbstractC5681n.equal(this.f12051f.get(c5539a.zab()), this.f12050e) ? c() ? new C5392b(4, q()) : this.f12050e.zad(c5539a) : this.f12049d.zad(c5539a);
    }

    @Override // h2.InterfaceC5581A
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T zae(T t8) {
        if (!d(t8)) {
            this.f12049d.zae(t8);
            return t8;
        }
        if (c()) {
            t8.setFailedResult(new Status(4, (String) null, q()));
            return t8;
        }
        this.f12050e.zae(t8);
        return t8;
    }

    @Override // h2.InterfaceC5581A
    public final <A extends C5539a.b, T extends AbstractC1103b> T zaf(T t8) {
        if (!d(t8)) {
            return (T) this.f12049d.zaf(t8);
        }
        if (!c()) {
            return (T) this.f12050e.zaf(t8);
        }
        t8.setFailedResult(new Status(4, (String) null, q()));
        return t8;
    }

    @Override // h2.InterfaceC5581A
    public final void zaq() {
        this.f12059n = 2;
        this.f12057l = false;
        this.f12056k = null;
        this.f12055j = null;
        this.f12049d.zaq();
        this.f12050e.zaq();
    }

    @Override // h2.InterfaceC5581A
    public final void zar() {
        this.f12056k = null;
        this.f12055j = null;
        this.f12059n = 0;
        this.f12049d.zar();
        this.f12050e.zar();
        b();
    }

    @Override // h2.InterfaceC5581A
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(":");
        this.f12050e.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(":");
        this.f12049d.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // h2.InterfaceC5581A
    public final void zat() {
        this.f12049d.zat();
        this.f12050e.zat();
    }

    @Override // h2.InterfaceC5581A
    public final void zau() {
        this.f12058m.lock();
        try {
            boolean zZax = zax();
            this.f12050e.zar();
            this.f12056k = new C5392b(4);
            if (zZax) {
                new x2.j(this.f12048c).post(new z0(this));
            } else {
                b();
            }
            this.f12058m.unlock();
        } catch (Throwable th) {
            this.f12058m.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    @Override // h2.InterfaceC5581A
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zaw() {
        /*
            r3 = this;
            java.util.concurrent.locks.Lock r0 = r3.f12058m
            r0.lock()
            com.google.android.gms.common.api.internal.N r0 = r3.f12049d     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            if (r0 == 0) goto L25
            com.google.android.gms.common.api.internal.N r0 = r3.f12050e     // Catch: java.lang.Throwable -> L23
            boolean r0 = r0.zaw()     // Catch: java.lang.Throwable -> L23
            r2 = 1
            if (r0 != 0) goto L21
            boolean r0 = r3.c()     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L21
            int r0 = r3.f12059n     // Catch: java.lang.Throwable -> L23
            if (r0 != r2) goto L25
        L21:
            r1 = r2
            goto L25
        L23:
            r0 = move-exception
            goto L2b
        L25:
            java.util.concurrent.locks.Lock r0 = r3.f12058m
            r0.unlock()
            return r1
        L2b:
            java.util.concurrent.locks.Lock r1 = r3.f12058m
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C1112j.zaw():boolean");
    }

    @Override // h2.InterfaceC5581A
    public final boolean zax() {
        this.f12058m.lock();
        try {
            return this.f12059n == 2;
        } finally {
            this.f12058m.unlock();
        }
    }

    @Override // h2.InterfaceC5581A
    public final boolean zay(InterfaceC5594k interfaceC5594k) {
        this.f12058m.lock();
        try {
            if (zax() || zaw()) {
                if (!this.f12050e.zaw()) {
                    this.f12052g.add(interfaceC5594k);
                    if (this.f12059n == 0) {
                        this.f12059n = 1;
                    }
                    this.f12056k = null;
                    this.f12050e.zaq();
                    this.f12058m.unlock();
                    return true;
                }
            }
            this.f12058m.unlock();
            return false;
        } catch (Throwable th) {
            this.f12058m.unlock();
            throw th;
        }
    }
}
