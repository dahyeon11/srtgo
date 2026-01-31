package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import f2.C5392b;
import f2.C5398h;
import g2.C5539a;
import h2.InterfaceC5581A;
import h2.InterfaceC5594k;
import h2.InterfaceC5607y;
import i2.AbstractC5683p;
import i2.C5671d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class N implements InterfaceC5581A, h2.U {

    /* renamed from: a, reason: collision with root package name */
    private final Lock f11932a;

    /* renamed from: b, reason: collision with root package name */
    private final Condition f11933b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f11934c;

    /* renamed from: d, reason: collision with root package name */
    private final C5398h f11935d;

    /* renamed from: e, reason: collision with root package name */
    private final M f11936e;

    /* renamed from: f, reason: collision with root package name */
    final Map f11937f;

    /* renamed from: h, reason: collision with root package name */
    final C5671d f11939h;

    /* renamed from: i, reason: collision with root package name */
    final Map f11940i;

    /* renamed from: j, reason: collision with root package name */
    final C5539a.AbstractC0301a f11941j;

    /* renamed from: k, reason: collision with root package name */
    private volatile h2.r f11942k;

    /* renamed from: m, reason: collision with root package name */
    int f11944m;

    /* renamed from: n, reason: collision with root package name */
    final K f11945n;

    /* renamed from: o, reason: collision with root package name */
    final InterfaceC5607y f11946o;

    /* renamed from: g, reason: collision with root package name */
    final Map f11938g = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private C5392b f11943l = null;

    public N(Context context, K k8, Lock lock, Looper looper, C5398h c5398h, Map<C5539a.c, C5539a.f> map, C5671d c5671d, Map<C5539a, Boolean> map2, C5539a.AbstractC0301a abstractC0301a, ArrayList<h2.T> arrayList, InterfaceC5607y interfaceC5607y) {
        this.f11934c = context;
        this.f11932a = lock;
        this.f11935d = c5398h;
        this.f11937f = map;
        this.f11939h = c5671d;
        this.f11940i = map2;
        this.f11941j = abstractC0301a;
        this.f11945n = k8;
        this.f11946o = interfaceC5607y;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.get(i8).zaa(this);
        }
        this.f11936e = new M(this, looper);
        this.f11933b = lock.newCondition();
        this.f11942k = new D(this);
    }

    final void c() {
        this.f11932a.lock();
        try {
            this.f11945n.h();
            this.f11942k = new r(this);
            this.f11942k.zad();
            this.f11933b.signalAll();
        } finally {
            this.f11932a.unlock();
        }
    }

    final void d() {
        this.f11932a.lock();
        try {
            this.f11942k = new C(this, this.f11939h, this.f11940i, this.f11935d, this.f11941j, this.f11932a, this.f11934c);
            this.f11942k.zad();
            this.f11933b.signalAll();
        } finally {
            this.f11932a.unlock();
        }
    }

    final void e(C5392b c5392b) {
        this.f11932a.lock();
        try {
            this.f11943l = c5392b;
            this.f11942k = new D(this);
            this.f11942k.zad();
            this.f11933b.signalAll();
        } finally {
            this.f11932a.unlock();
        }
    }

    final void f(L l8) {
        this.f11936e.sendMessage(this.f11936e.obtainMessage(1, l8));
    }

    final void g(RuntimeException runtimeException) {
        this.f11936e.sendMessage(this.f11936e.obtainMessage(2, runtimeException));
    }

    @Override // h2.U, g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnected(Bundle bundle) {
        this.f11932a.lock();
        try {
            this.f11942k.zag(bundle);
        } finally {
            this.f11932a.unlock();
        }
    }

    @Override // h2.U, g2.AbstractC5544f.b, h2.InterfaceC5587d
    public final void onConnectionSuspended(int i8) {
        this.f11932a.lock();
        try {
            this.f11942k.zai(i8);
        } finally {
            this.f11932a.unlock();
        }
    }

    @Override // h2.U
    public final void zaa(C5392b c5392b, C5539a c5539a, boolean z8) {
        this.f11932a.lock();
        try {
            this.f11942k.zah(c5392b, c5539a, z8);
        } finally {
            this.f11932a.unlock();
        }
    }

    @Override // h2.InterfaceC5581A
    public final C5392b zab() throws InterruptedException {
        zaq();
        while (this.f11942k instanceof C) {
            try {
                this.f11933b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C5392b(15, null);
            }
        }
        if (this.f11942k instanceof r) {
            return C5392b.RESULT_SUCCESS;
        }
        C5392b c5392b = this.f11943l;
        return c5392b != null ? c5392b : new C5392b(13, null);
    }

    @Override // h2.InterfaceC5581A
    public final C5392b zac(long j8, TimeUnit timeUnit) throws InterruptedException {
        zaq();
        long nanos = timeUnit.toNanos(j8);
        while (this.f11942k instanceof C) {
            if (nanos <= 0) {
                zar();
                return new C5392b(14, null);
            }
            try {
                nanos = this.f11933b.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new C5392b(15, null);
            }
            Thread.currentThread().interrupt();
            return new C5392b(15, null);
        }
        if (this.f11942k instanceof r) {
            return C5392b.RESULT_SUCCESS;
        }
        C5392b c5392b = this.f11943l;
        return c5392b != null ? c5392b : new C5392b(13, null);
    }

    @Override // h2.InterfaceC5581A
    public final C5392b zad(C5539a c5539a) {
        C5539a.c cVarZab = c5539a.zab();
        if (!this.f11937f.containsKey(cVarZab)) {
            return null;
        }
        if (((C5539a.f) this.f11937f.get(cVarZab)).isConnected()) {
            return C5392b.RESULT_SUCCESS;
        }
        if (this.f11938g.containsKey(cVarZab)) {
            return (C5392b) this.f11938g.get(cVarZab);
        }
        return null;
    }

    @Override // h2.InterfaceC5581A
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T zae(T t8) {
        t8.zak();
        this.f11942k.zaa(t8);
        return t8;
    }

    @Override // h2.InterfaceC5581A
    public final <A extends C5539a.b, T extends AbstractC1103b> T zaf(T t8) {
        t8.zak();
        return (T) this.f11942k.zab(t8);
    }

    @Override // h2.InterfaceC5581A
    public final void zaq() {
        this.f11942k.zae();
    }

    @Override // h2.InterfaceC5581A
    public final void zar() {
        if (this.f11942k.zaj()) {
            this.f11938g.clear();
        }
    }

    @Override // h2.InterfaceC5581A
    public final void zas(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f11942k);
        for (C5539a c5539a : this.f11940i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c5539a.zad()).println(":");
            ((C5539a.f) AbstractC5683p.checkNotNull((C5539a.f) this.f11937f.get(c5539a.zab()))).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // h2.InterfaceC5581A
    public final void zat() {
        if (this.f11942k instanceof r) {
            ((r) this.f11942k).b();
        }
    }

    @Override // h2.InterfaceC5581A
    public final void zau() {
    }

    @Override // h2.InterfaceC5581A
    public final boolean zaw() {
        return this.f11942k instanceof r;
    }

    @Override // h2.InterfaceC5581A
    public final boolean zax() {
        return this.f11942k instanceof C;
    }

    @Override // h2.InterfaceC5581A
    public final boolean zay(InterfaceC5594k interfaceC5594k) {
        return false;
    }
}
