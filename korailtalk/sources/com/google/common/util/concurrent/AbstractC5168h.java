package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC5162b;
import f3.h1;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.h */
/* loaded from: classes2.dex */
abstract class AbstractC5168h extends AbstractC5162b.j {

    /* renamed from: j */
    private static final b f25568j;

    /* renamed from: k */
    private static final Logger f25569k = Logger.getLogger(AbstractC5168h.class.getName());

    /* renamed from: h */
    private volatile Set f25570h = null;

    /* renamed from: i */
    private volatile int f25571i;

    /* renamed from: com.google.common.util.concurrent.h$b */
    private static abstract class b {
        private b() {
        }

        abstract void a(AbstractC5168h abstractC5168h, Set set, Set set2);

        abstract int b(AbstractC5168h abstractC5168h);

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* renamed from: com.google.common.util.concurrent.h$c */
    private static final class c extends b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater f25572a;

        /* renamed from: b */
        final AtomicIntegerFieldUpdater f25573b;

        c(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f25572a = atomicReferenceFieldUpdater;
            this.f25573b = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.AbstractC5168h.b
        void a(AbstractC5168h abstractC5168h, Set set, Set set2) {
            androidx.concurrent.futures.b.a(this.f25572a, abstractC5168h, set, set2);
        }

        @Override // com.google.common.util.concurrent.AbstractC5168h.b
        int b(AbstractC5168h abstractC5168h) {
            return this.f25573b.decrementAndGet(abstractC5168h);
        }
    }

    /* renamed from: com.google.common.util.concurrent.h$d */
    private static final class d extends b {
        private d() {
            super();
        }

        @Override // com.google.common.util.concurrent.AbstractC5168h.b
        void a(AbstractC5168h abstractC5168h, Set set, Set set2) {
            synchronized (abstractC5168h) {
                try {
                    if (abstractC5168h.f25570h == set) {
                        abstractC5168h.f25570h = set2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC5168h.b
        int b(AbstractC5168h abstractC5168h) {
            int iE;
            synchronized (abstractC5168h) {
                iE = AbstractC5168h.E(abstractC5168h);
            }
            return iE;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    static {
        b dVar;
        Throwable th = null;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(AbstractC5168h.class, Set.class, "h"), AtomicIntegerFieldUpdater.newUpdater(AbstractC5168h.class, "i"));
        } catch (Error | RuntimeException e8) {
            dVar = new d();
            th = e8;
        }
        f25568j = dVar;
        if (th != null) {
            f25569k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    AbstractC5168h(int i8) {
        this.f25571i = i8;
    }

    static /* synthetic */ int E(AbstractC5168h abstractC5168h) {
        int i8 = abstractC5168h.f25571i - 1;
        abstractC5168h.f25571i = i8;
        return i8;
    }

    abstract void F(Set set);

    final void G() {
        this.f25570h = null;
    }

    final int H() {
        return f25568j.b(this);
    }

    final Set I() {
        Set set = this.f25570h;
        if (set != null) {
            return set;
        }
        Set setNewConcurrentHashSet = h1.newConcurrentHashSet();
        F(setNewConcurrentHashSet);
        f25568j.a(this, null, setNewConcurrentHashSet);
        Set set2 = this.f25570h;
        Objects.requireNonNull(set2);
        return set2;
    }
}
