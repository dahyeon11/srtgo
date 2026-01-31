package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.ads.mn0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC3655mn0 extends AbstractC1849Rm0 {

    /* renamed from: j, reason: collision with root package name */
    private static final AbstractC3200in0 f20981j;

    /* renamed from: k, reason: collision with root package name */
    private static final C1933Tn0 f20982k = new C1933Tn0(AbstractC3655mn0.class);

    /* renamed from: h, reason: collision with root package name */
    private volatile Set f20983h = null;

    /* renamed from: i, reason: collision with root package name */
    private volatile int f20984i;

    static {
        AbstractC3200in0 c3541ln0;
        Throwable th;
        AbstractC3427kn0 abstractC3427kn0 = null;
        try {
            c3541ln0 = new C3313jn0(AtomicReferenceFieldUpdater.newUpdater(AbstractC3655mn0.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC3655mn0.class, "i"));
            th = null;
        } catch (Throwable th2) {
            c3541ln0 = new C3541ln0(abstractC3427kn0);
            th = th2;
        }
        f20981j = c3541ln0;
        if (th != null) {
            f20982k.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    AbstractC3655mn0(int i8) {
        this.f20984i = i8;
    }

    final Set A() {
        Set set = this.f20983h;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        E(setNewSetFromMap);
        f20981j.b(this, null, setNewSetFromMap);
        Set set2 = this.f20983h;
        Objects.requireNonNull(set2);
        return set2;
    }

    final void D() {
        this.f20983h = null;
    }

    abstract void E(Set set);

    final int y() {
        return f20981j.a(this);
    }
}
