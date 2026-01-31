package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.ActivityC1010e;
import com.google.android.gms.common.api.Status;
import f2.C5392b;
import f2.C5397g;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.C5539a;
import h2.C5588e;
import h2.C5596m;
import h2.C5606x;
import h2.InterfaceC5581A;
import h2.InterfaceC5594k;
import h2.InterfaceC5607y;
import i2.AbstractC5683p;
import i2.C5651J;
import i2.C5671d;
import i2.InterfaceC5650I;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import k2.C5846a;

/* loaded from: classes.dex */
public final class K extends AbstractC5544f implements InterfaceC5607y {

    /* renamed from: b */
    private final Lock f11905b;

    /* renamed from: c */
    private final C5651J f11906c;

    /* renamed from: e */
    private final int f11908e;

    /* renamed from: f */
    private final Context f11909f;

    /* renamed from: g */
    private final Looper f11910g;

    /* renamed from: i */
    private volatile boolean f11912i;

    /* renamed from: j */
    private long f11913j;

    /* renamed from: k */
    private long f11914k;

    /* renamed from: l */
    private final I f11915l;

    /* renamed from: m */
    private final C5397g f11916m;

    /* renamed from: n */
    C5606x f11917n;

    /* renamed from: o */
    final Map f11918o;

    /* renamed from: p */
    Set f11919p;

    /* renamed from: q */
    final C5671d f11920q;

    /* renamed from: r */
    final Map f11921r;

    /* renamed from: s */
    final C5539a.AbstractC0301a f11922s;

    /* renamed from: t */
    private final C1107e f11923t;

    /* renamed from: u */
    private final ArrayList f11924u;

    /* renamed from: v */
    private Integer f11925v;

    /* renamed from: w */
    Set f11926w;

    /* renamed from: x */
    final l0 f11927x;

    /* renamed from: y */
    private final InterfaceC5650I f11928y;

    /* renamed from: d */
    private InterfaceC5581A f11907d = null;

    /* renamed from: h */
    final Queue f11911h = new LinkedList();

    public K(Context context, Lock lock, Looper looper, C5671d c5671d, C5397g c5397g, C5539a.AbstractC0301a abstractC0301a, Map<C5539a, Boolean> map, List<AbstractC5544f.b> list, List<AbstractC5544f.c> list2, Map<C5539a.c, C5539a.f> map2, int i8, int i9, ArrayList<h2.T> arrayList) {
        this.f11913j = true != o2.e.isPackageSide() ? 120000L : H0.y.MIN_BACKOFF_MILLIS;
        this.f11914k = 5000L;
        this.f11919p = new HashSet();
        this.f11923t = new C1107e();
        this.f11925v = null;
        this.f11926w = null;
        E e8 = new E(this);
        this.f11928y = e8;
        this.f11909f = context;
        this.f11905b = lock;
        this.f11906c = new C5651J(looper, e8);
        this.f11910g = looper;
        this.f11915l = new I(this, looper);
        this.f11916m = c5397g;
        this.f11908e = i8;
        if (i8 >= 0) {
            this.f11925v = Integer.valueOf(i9);
        }
        this.f11921r = map;
        this.f11918o = map2;
        this.f11924u = arrayList;
        this.f11927x = new l0();
        Iterator<AbstractC5544f.b> it = list.iterator();
        while (it.hasNext()) {
            this.f11906c.zaf(it.next());
        }
        Iterator<AbstractC5544f.c> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f11906c.zag(it2.next());
        }
        this.f11920q = c5671d;
        this.f11922s = abstractC0301a;
    }

    static String d(int i8) {
        return i8 != 1 ? i8 != 2 ? i8 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    static /* bridge */ /* synthetic */ void f(K k8) {
        k8.f11905b.lock();
        try {
            if (k8.f11912i) {
                k8.k();
            }
        } finally {
            k8.f11905b.unlock();
        }
    }

    static /* bridge */ /* synthetic */ void g(K k8) {
        k8.f11905b.lock();
        try {
            if (k8.h()) {
                k8.k();
            }
        } finally {
            k8.f11905b.unlock();
        }
    }

    private final void i(int i8) {
        Integer num = this.f11925v;
        if (num == null) {
            this.f11925v = Integer.valueOf(i8);
        } else if (num.intValue() != i8) {
            String strD = d(i8);
            String strD2 = d(this.f11925v.intValue());
            StringBuilder sb = new StringBuilder(strD.length() + 51 + strD2.length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(strD);
            sb.append(". Mode was already set to ");
            sb.append(strD2);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f11907d != null) {
            return;
        }
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (C5539a.f fVar : this.f11918o.values()) {
            zRequiresSignIn |= fVar.requiresSignIn();
            zProvidesSignIn |= fVar.providesSignIn();
        }
        int iIntValue = this.f11925v.intValue();
        if (iIntValue == 1) {
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else if (iIntValue == 2 && zRequiresSignIn) {
            this.f11907d = C1112j.zag(this.f11909f, this, this.f11905b, this.f11910g, this.f11916m, this.f11918o, this.f11920q, this.f11921r, this.f11922s, this.f11924u);
            return;
        }
        this.f11907d = new N(this.f11909f, this, this.f11905b, this.f11910g, this.f11916m, this.f11918o, this.f11920q, this.f11921r, this.f11922s, this.f11924u, this);
    }

    public final void j(AbstractC5544f abstractC5544f, C5596m c5596m, boolean z8) {
        C5846a.zaa.zaa(abstractC5544f).setResultCallback(new H(this, c5596m, z8, abstractC5544f));
    }

    private final void k() {
        this.f11906c.zab();
        ((InterfaceC5581A) AbstractC5683p.checkNotNull(this.f11907d)).zaq();
    }

    public static int zad(Iterable<C5539a.f> iterable, boolean z8) {
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (C5539a.f fVar : iterable) {
            zRequiresSignIn |= fVar.requiresSignIn();
            zProvidesSignIn |= fVar.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z8) ? 2 : 1;
        }
        return 3;
    }

    @Override // g2.AbstractC5544f
    public final C5392b blockingConnect() {
        boolean z8 = true;
        AbstractC5683p.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f11905b.lock();
        try {
            if (this.f11908e >= 0) {
                if (this.f11925v == null) {
                    z8 = false;
                }
                AbstractC5683p.checkState(z8, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f11925v;
                if (num == null) {
                    this.f11925v = Integer.valueOf(zad(this.f11918o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            i(((Integer) AbstractC5683p.checkNotNull(this.f11925v)).intValue());
            this.f11906c.zab();
            C5392b c5392bZab = ((InterfaceC5581A) AbstractC5683p.checkNotNull(this.f11907d)).zab();
            this.f11905b.unlock();
            return c5392bZab;
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    final String c() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @Override // g2.AbstractC5544f
    public final AbstractC5547i clearDefaultAccountAndReconnect() {
        AbstractC5683p.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.f11925v;
        boolean z8 = true;
        if (num != null && num.intValue() == 2) {
            z8 = false;
        }
        AbstractC5683p.checkState(z8, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        C5596m c5596m = new C5596m(this);
        if (this.f11918o.containsKey(C5846a.CLIENT_KEY)) {
            j(this, c5596m, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            F f8 = new F(this, atomicReference, c5596m);
            G g8 = new G(this, c5596m);
            AbstractC5544f.a aVar = new AbstractC5544f.a(this.f11909f);
            aVar.addApi(C5846a.API);
            aVar.addConnectionCallbacks(f8);
            aVar.addOnConnectionFailedListener(g8);
            aVar.setHandler(this.f11915l);
            AbstractC5544f abstractC5544fBuild = aVar.build();
            atomicReference.set(abstractC5544fBuild);
            abstractC5544fBuild.connect();
        }
        return c5596m;
    }

    @Override // g2.AbstractC5544f
    public final void connect() {
        this.f11905b.lock();
        try {
            int i8 = 2;
            boolean z8 = false;
            if (this.f11908e >= 0) {
                AbstractC5683p.checkState(this.f11925v != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f11925v;
                if (num == null) {
                    this.f11925v = Integer.valueOf(zad(this.f11918o.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) AbstractC5683p.checkNotNull(this.f11925v)).intValue();
            this.f11905b.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i8 = iIntValue;
                    }
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i8);
                    AbstractC5683p.checkArgument(z8, sb.toString());
                    i(i8);
                    k();
                    this.f11905b.unlock();
                    return;
                }
                i8 = iIntValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i8);
                AbstractC5683p.checkArgument(z8, sb2.toString());
                i(i8);
                k();
                this.f11905b.unlock();
                return;
            } finally {
                this.f11905b.unlock();
            }
            z8 = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final void disconnect() {
        Lock lock;
        this.f11905b.lock();
        try {
            this.f11927x.zab();
            InterfaceC5581A interfaceC5581A = this.f11907d;
            if (interfaceC5581A != null) {
                interfaceC5581A.zar();
            }
            this.f11923t.zab();
            for (AbstractC1103b abstractC1103b : this.f11911h) {
                abstractC1103b.zan(null);
                abstractC1103b.cancel();
            }
            this.f11911h.clear();
            if (this.f11907d == null) {
                lock = this.f11905b;
            } else {
                h();
                this.f11906c.zaa();
                lock = this.f11905b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f11909f);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f11912i);
        printWriter.append(" mWorkQueue.size()=").print(this.f11911h.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f11927x.f12074a.size());
        InterfaceC5581A interfaceC5581A = this.f11907d;
        if (interfaceC5581A != null) {
            interfaceC5581A.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // g2.AbstractC5544f
    public final <A extends C5539a.b, R extends g2.n, T extends AbstractC1103b> T enqueue(T t8) {
        Lock lock;
        C5539a api = t8.getApi();
        boolean zContainsKey = this.f11918o.containsKey(t8.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        AbstractC5683p.checkArgument(zContainsKey, sb.toString());
        this.f11905b.lock();
        try {
            InterfaceC5581A interfaceC5581A = this.f11907d;
            if (interfaceC5581A == null) {
                this.f11911h.add(t8);
                lock = this.f11905b;
            } else {
                t8 = (T) interfaceC5581A.zae(t8);
                lock = this.f11905b;
            }
            lock.unlock();
            return t8;
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final <A extends C5539a.b, T extends AbstractC1103b> T execute(T t8) {
        Lock lock;
        C5539a api = t8.getApi();
        boolean zContainsKey = this.f11918o.containsKey(t8.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        AbstractC5683p.checkArgument(zContainsKey, sb.toString());
        this.f11905b.lock();
        try {
            InterfaceC5581A interfaceC5581A = this.f11907d;
            if (interfaceC5581A == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f11912i) {
                this.f11911h.add(t8);
                while (!this.f11911h.isEmpty()) {
                    AbstractC1103b abstractC1103b = (AbstractC1103b) this.f11911h.remove();
                    this.f11927x.a(abstractC1103b);
                    abstractC1103b.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                lock = this.f11905b;
            } else {
                t8 = (T) interfaceC5581A.zaf(t8);
                lock = this.f11905b;
            }
            lock.unlock();
            return t8;
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final <C extends C5539a.f> C getClient(C5539a.c cVar) {
        C c9 = (C) this.f11918o.get(cVar);
        AbstractC5683p.checkNotNull(c9, "Appropriate Api was not requested.");
        return c9;
    }

    @Override // g2.AbstractC5544f
    public final C5392b getConnectionResult(C5539a c5539a) {
        C5392b c5392b;
        Lock lock;
        this.f11905b.lock();
        try {
            if (!isConnected() && !this.f11912i) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.f11918o.containsKey(c5539a.zab())) {
                throw new IllegalArgumentException(String.valueOf(c5539a.zad()).concat(" was never registered with GoogleApiClient"));
            }
            C5392b c5392bZad = ((InterfaceC5581A) AbstractC5683p.checkNotNull(this.f11907d)).zad(c5539a);
            if (c5392bZad != null) {
                this.f11905b.unlock();
                return c5392bZad;
            }
            if (this.f11912i) {
                c5392b = C5392b.RESULT_SUCCESS;
                lock = this.f11905b;
            } else {
                Log.w("GoogleApiClientImpl", c());
                Log.wtf("GoogleApiClientImpl", String.valueOf(c5539a.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                c5392b = new C5392b(8, null);
                lock = this.f11905b;
            }
            lock.unlock();
            return c5392b;
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final Context getContext() {
        return this.f11909f;
    }

    @Override // g2.AbstractC5544f
    public final Looper getLooper() {
        return this.f11910g;
    }

    final boolean h() {
        if (!this.f11912i) {
            return false;
        }
        this.f11912i = false;
        this.f11915l.removeMessages(2);
        this.f11915l.removeMessages(1);
        C5606x c5606x = this.f11917n;
        if (c5606x != null) {
            c5606x.zab();
            this.f11917n = null;
        }
        return true;
    }

    @Override // g2.AbstractC5544f
    public final boolean hasApi(C5539a c5539a) {
        return this.f11918o.containsKey(c5539a.zab());
    }

    @Override // g2.AbstractC5544f
    public final boolean hasConnectedApi(C5539a c5539a) {
        C5539a.f fVar;
        return isConnected() && (fVar = (C5539a.f) this.f11918o.get(c5539a.zab())) != null && fVar.isConnected();
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnected() {
        InterfaceC5581A interfaceC5581A = this.f11907d;
        return interfaceC5581A != null && interfaceC5581A.zaw();
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnecting() {
        InterfaceC5581A interfaceC5581A = this.f11907d;
        return interfaceC5581A != null && interfaceC5581A.zax();
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnectionCallbacksRegistered(AbstractC5544f.b bVar) {
        return this.f11906c.zaj(bVar);
    }

    @Override // g2.AbstractC5544f
    public final boolean isConnectionFailedListenerRegistered(AbstractC5544f.c cVar) {
        return this.f11906c.zak(cVar);
    }

    @Override // g2.AbstractC5544f
    public final boolean maybeSignIn(InterfaceC5594k interfaceC5594k) {
        InterfaceC5581A interfaceC5581A = this.f11907d;
        return interfaceC5581A != null && interfaceC5581A.zay(interfaceC5594k);
    }

    @Override // g2.AbstractC5544f
    public final void maybeSignOut() {
        InterfaceC5581A interfaceC5581A = this.f11907d;
        if (interfaceC5581A != null) {
            interfaceC5581A.zau();
        }
    }

    @Override // g2.AbstractC5544f
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // g2.AbstractC5544f
    public final void registerConnectionCallbacks(AbstractC5544f.b bVar) {
        this.f11906c.zaf(bVar);
    }

    @Override // g2.AbstractC5544f
    public final void registerConnectionFailedListener(AbstractC5544f.c cVar) {
        this.f11906c.zag(cVar);
    }

    @Override // g2.AbstractC5544f
    public final <L> C1106d registerListener(L l8) {
        this.f11905b.lock();
        try {
            return this.f11923t.zaa(l8, this.f11910g, "NO_TYPE");
        } finally {
            this.f11905b.unlock();
        }
    }

    @Override // g2.AbstractC5544f
    public final void stopAutoManage(ActivityC1010e activityC1010e) {
        C5588e c5588e = new C5588e((Activity) activityC1010e);
        if (this.f11908e < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        s0.zaa(c5588e).zae(this.f11908e);
    }

    @Override // g2.AbstractC5544f
    public final void unregisterConnectionCallbacks(AbstractC5544f.b bVar) {
        this.f11906c.zah(bVar);
    }

    @Override // g2.AbstractC5544f
    public final void unregisterConnectionFailedListener(AbstractC5544f.c cVar) {
        this.f11906c.zai(cVar);
    }

    @Override // h2.InterfaceC5607y
    public final void zaa(C5392b c5392b) {
        if (!this.f11916m.isPlayServicesPossiblyUpdating(this.f11909f, c5392b.getErrorCode())) {
            h();
        }
        if (this.f11912i) {
            return;
        }
        this.f11906c.zac(c5392b);
        this.f11906c.zaa();
    }

    @Override // h2.InterfaceC5607y
    public final void zab(Bundle bundle) {
        while (!this.f11911h.isEmpty()) {
            execute((AbstractC1103b) this.f11911h.remove());
        }
        this.f11906c.zad(bundle);
    }

    @Override // h2.InterfaceC5607y
    public final void zac(int i8, boolean z8) {
        if (i8 == 1) {
            if (!z8 && !this.f11912i) {
                this.f11912i = true;
                if (this.f11917n == null && !o2.e.isPackageSide()) {
                    try {
                        this.f11917n = this.f11916m.zac(this.f11909f.getApplicationContext(), new J(this));
                    } catch (SecurityException unused) {
                    }
                }
                I i9 = this.f11915l;
                i9.sendMessageDelayed(i9.obtainMessage(1), this.f11913j);
                I i10 = this.f11915l;
                i10.sendMessageDelayed(i10.obtainMessage(2), this.f11914k);
            }
            i8 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f11927x.f12074a.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(l0.zaa);
        }
        this.f11906c.zae(i8);
        this.f11906c.zaa();
        if (i8 == 2) {
            k();
        }
    }

    @Override // g2.AbstractC5544f
    public final void zao(j0 j0Var) {
        this.f11905b.lock();
        try {
            if (this.f11926w == null) {
                this.f11926w = new HashSet();
            }
            this.f11926w.add(j0Var);
            this.f11905b.unlock();
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final void zap(j0 j0Var) {
        this.f11905b.lock();
        try {
            Set set = this.f11926w;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (set.remove(j0Var)) {
                this.f11905b.lock();
                try {
                    Set set2 = this.f11926w;
                    if (set2 == null) {
                        this.f11905b.unlock();
                    } else {
                        boolean zIsEmpty = set2.isEmpty();
                        this.f11905b.unlock();
                        if (zIsEmpty) {
                        }
                    }
                    InterfaceC5581A interfaceC5581A = this.f11907d;
                    if (interfaceC5581A != null) {
                        interfaceC5581A.zat();
                    }
                } finally {
                    this.f11905b.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final C5392b blockingConnect(long j8, TimeUnit timeUnit) {
        AbstractC5683p.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        AbstractC5683p.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.f11905b.lock();
        try {
            Integer num = this.f11925v;
            if (num == null) {
                this.f11925v = Integer.valueOf(zad(this.f11918o.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            i(((Integer) AbstractC5683p.checkNotNull(this.f11925v)).intValue());
            this.f11906c.zab();
            C5392b c5392bZac = ((InterfaceC5581A) AbstractC5683p.checkNotNull(this.f11907d)).zac(j8, timeUnit);
            this.f11905b.unlock();
            return c5392bZac;
        } catch (Throwable th) {
            this.f11905b.unlock();
            throw th;
        }
    }

    @Override // g2.AbstractC5544f
    public final void connect(int i8) {
        this.f11905b.lock();
        boolean z8 = true;
        if (i8 != 3 && i8 != 1) {
            if (i8 == 2) {
                i8 = 2;
            } else {
                z8 = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i8);
            AbstractC5683p.checkArgument(z8, sb.toString());
            i(i8);
            k();
        } finally {
            this.f11905b.unlock();
        }
    }
}
