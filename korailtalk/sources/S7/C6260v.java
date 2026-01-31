package s7;

import f7.InterfaceC5519a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

/* renamed from: s7.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6260v {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36366a = AtomicReferenceFieldUpdater.newUpdater(C6260v.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36367b = AtomicReferenceFieldUpdater.newUpdater(C6260v.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36368c = AtomicReferenceFieldUpdater.newUpdater(C6260v.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: s7.v$a */
    public static abstract class a extends AbstractC6241b {
        public final C6260v newNode;
        public C6260v oldNext;

        public a(C6260v c6260v) {
            this.newNode = c6260v;
        }

        @Override // s7.AbstractC6241b
        public void complete(C6260v c6260v, Object obj) {
            boolean z8 = obj == null;
            C6260v c6260v2 = z8 ? this.newNode : this.oldNext;
            if (c6260v2 != null && androidx.concurrent.futures.b.a(C6260v.f36366a, c6260v, this, c6260v2) && z8) {
                C6260v c6260v3 = this.newNode;
                C6260v c6260v4 = this.oldNext;
                Intrinsics.checkNotNull(c6260v4);
                c6260v3.c(c6260v4);
            }
        }
    }

    /* renamed from: s7.v$b */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5519a f36369b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6260v c6260v, InterfaceC5519a interfaceC5519a) {
            super(c6260v);
            this.f36369b = interfaceC5519a;
        }

        @Override // s7.AbstractC6241b
        public Object prepare(C6260v c6260v) {
            if (((Boolean) this.f36369b.invoke()).booleanValue()) {
                return null;
            }
            return AbstractC6259u.getCONDITION_FALSE();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
    
        if (androidx.concurrent.futures.b.a(r4, r3, r2, ((s7.C6238E) r5).ref) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final s7.C6260v a(s7.AbstractC6237D r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = s7.C6260v.f36367b
            java.lang.Object r0 = r0.get(r8)
            s7.v r0 = (s7.C6260v) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = s7.C6260v.f36366a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = s7.C6260v.f36367b
            boolean r0 = androidx.concurrent.futures.b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.isRemoved()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof s7.AbstractC6237D
            if (r6 == 0) goto L34
            s7.D r5 = (s7.AbstractC6237D) r5
            r5.perform(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof s7.C6238E
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            s7.E r5 = (s7.C6238E) r5
            s7.v r5 = r5.ref
            boolean r2 = androidx.concurrent.futures.b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = s7.C6260v.f36367b
            java.lang.Object r2 = r4.get(r2)
            s7.v r2 = (s7.C6260v) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r3)
            r3 = r5
            s7.v r3 = (s7.C6260v) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C6260v.a(s7.D):s7.v");
    }

    private final C6260v b(C6260v c6260v) {
        while (c6260v.isRemoved()) {
            c6260v = (C6260v) f36367b.get(c6260v);
        }
        return c6260v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(C6260v c6260v) {
        C6260v c6260v2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36367b;
        do {
            c6260v2 = (C6260v) atomicReferenceFieldUpdater.get(c6260v);
            if (getNext() != c6260v) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f36367b, c6260v, c6260v2, this));
        if (isRemoved()) {
            c6260v.a(null);
        }
    }

    private final C6238E d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36368c;
        C6238E c6238e = (C6238E) atomicReferenceFieldUpdater.get(this);
        if (c6238e != null) {
            return c6238e;
        }
        C6238E c6238e2 = new C6238E(this);
        atomicReferenceFieldUpdater.lazySet(this, c6238e2);
        return c6238e2;
    }

    public final void addLast(C6260v c6260v) {
        while (!getPrevNode().addNext(c6260v, this)) {
        }
    }

    public final boolean addLastIf(C6260v c6260v, InterfaceC5519a interfaceC5519a) {
        int iTryCondAddNext;
        b bVar = new b(c6260v, interfaceC5519a);
        do {
            iTryCondAddNext = getPrevNode().tryCondAddNext(c6260v, this, bVar);
            if (iTryCondAddNext == 1) {
                return true;
            }
        } while (iTryCondAddNext != 2);
        return false;
    }

    public final boolean addNext(C6260v c6260v, C6260v c6260v2) {
        f36367b.lazySet(c6260v, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36366a;
        atomicReferenceFieldUpdater.lazySet(c6260v, c6260v2);
        if (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c6260v2, c6260v)) {
            return false;
        }
        c6260v.c(c6260v2);
        return true;
    }

    public final boolean addOneIfEmpty(C6260v c6260v) {
        f36367b.lazySet(c6260v, this);
        f36366a.lazySet(c6260v, this);
        while (getNext() == this) {
            if (androidx.concurrent.futures.b.a(f36366a, this, this, c6260v)) {
                c6260v.c(this);
                return true;
            }
        }
        return false;
    }

    public final Object getNext() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36366a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC6237D)) {
                return obj;
            }
            ((AbstractC6237D) obj).perform(this);
        }
    }

    public final C6260v getNextNode() {
        return AbstractC6259u.unwrap(getNext());
    }

    public final C6260v getPrevNode() {
        C6260v c6260vA = a(null);
        return c6260vA == null ? b((C6260v) f36367b.get(this)) : c6260vA;
    }

    public boolean isRemoved() {
        return getNext() instanceof C6238E;
    }

    public final a makeCondAddOp(C6260v c6260v, InterfaceC5519a interfaceC5519a) {
        return new b(c6260v, interfaceC5519a);
    }

    /* renamed from: remove */
    public boolean mo591remove() {
        return removeOrNext() == null;
    }

    public final C6260v removeOrNext() {
        Object next;
        C6260v c6260v;
        do {
            next = getNext();
            if (next instanceof C6238E) {
                return ((C6238E) next).ref;
            }
            if (next == this) {
                return (C6260v) next;
            }
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c6260v = (C6260v) next;
        } while (!androidx.concurrent.futures.b.a(f36366a, this, next, c6260v.d()));
        c6260v.a(null);
        return null;
    }

    public String toString() {
        return new PropertyReference0Impl(this) { // from class: s7.v.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return n7.P.getClassSimpleName(this.receiver);
            }
        } + '@' + n7.P.getHexAddress(this);
    }

    public final int tryCondAddNext(C6260v c6260v, C6260v c6260v2, a aVar) {
        f36367b.lazySet(c6260v, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36366a;
        atomicReferenceFieldUpdater.lazySet(c6260v, c6260v2);
        aVar.oldNext = c6260v2;
        if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, c6260v2, aVar)) {
            return aVar.perform(this) == null ? 1 : 2;
        }
        return 0;
    }

    public final void validateNode$kotlinx_coroutines_core(C6260v c6260v, C6260v c6260v2) {
    }
}
