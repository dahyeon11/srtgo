package s7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class x {
    public static final int ADD_CLOSED = 2;
    public static final int ADD_FROZEN = 1;
    public static final int ADD_SUCCESS = 0;
    public static final int CAPACITY_BITS = 30;
    public static final long CLOSED_MASK = 2305843009213693952L;
    public static final int CLOSED_SHIFT = 61;
    public static final long FROZEN_MASK = 1152921504606846976L;
    public static final int FROZEN_SHIFT = 60;
    public static final long HEAD_MASK = 1073741823;
    public static final int HEAD_SHIFT = 0;
    public static final int INITIAL_CAPACITY = 8;
    public static final int MAX_CAPACITY_MASK = 1073741823;
    public static final int MIN_ADD_SPIN_CAPACITY = 1024;
    public static final long TAIL_MASK = 1152921503533105152L;
    public static final int TAIL_SHIFT = 30;
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    private final int f36373a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f36374b;

    /* renamed from: c, reason: collision with root package name */
    private final int f36375c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReferenceArray f36376d;
    public static final a Companion = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36371e = AtomicReferenceFieldUpdater.newUpdater(x.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    private static final AtomicLongFieldUpdater f36372f = AtomicLongFieldUpdater.newUpdater(x.class, "_state");
    public static final K REMOVE_FROZEN = new K("REMOVE_FROZEN");

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int addFailReason(long j8) {
            return (j8 & x.CLOSED_MASK) != 0 ? 2 : 1;
        }

        public final long updateHead(long j8, int i8) {
            return wo(j8, x.HEAD_MASK) | i8;
        }

        public final long updateTail(long j8, int i8) {
            return wo(j8, x.TAIL_MASK) | (i8 << 30);
        }

        public final <T> T withState(long j8, f7.p pVar) {
            return (T) pVar.invoke(Integer.valueOf((int) (x.HEAD_MASK & j8)), Integer.valueOf((int) ((j8 & x.TAIL_MASK) >> 30)));
        }

        public final long wo(long j8, long j9) {
            return j8 & (~j9);
        }

        private a() {
        }
    }

    public static final class b {
        public final int index;

        public b(int i8) {
            this.index = i8;
        }
    }

    public x(int i8, boolean z8) {
        this.f36373a = i8;
        this.f36374b = z8;
        int i9 = i8 - 1;
        this.f36375c = i9;
        this.f36376d = new AtomicReferenceArray(i8);
        if (i9 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i8 & i9) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    private final x a(long j8) {
        x xVar = new x(this.f36373a * 2, this.f36374b);
        int i8 = (int) (HEAD_MASK & j8);
        int i9 = (int) ((TAIL_MASK & j8) >> 30);
        while (true) {
            int i10 = this.f36375c;
            if ((i8 & i10) == (i9 & i10)) {
                f36372f.set(xVar, Companion.wo(j8, FROZEN_MASK));
                return xVar;
            }
            Object bVar = this.f36376d.get(i10 & i8);
            if (bVar == null) {
                bVar = new b(i8);
            }
            xVar.f36376d.set(xVar.f36375c & i8, bVar);
            i8++;
        }
    }

    private final x b(long j8) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36371e;
        while (true) {
            x xVar = (x) atomicReferenceFieldUpdater.get(this);
            if (xVar != null) {
                return xVar;
            }
            androidx.concurrent.futures.b.a(f36371e, this, null, a(j8));
        }
    }

    private final x c(int i8, Object obj) {
        Object obj2 = this.f36376d.get(this.f36375c & i8);
        if (!(obj2 instanceof b) || ((b) obj2).index != i8) {
            return null;
        }
        this.f36376d.set(i8 & this.f36375c, obj);
        return this;
    }

    private final long d() {
        long j8;
        long j9;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36372f;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & FROZEN_MASK) != 0) {
                return j8;
            }
            j9 = j8 | FROZEN_MASK;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j9));
        return j9;
    }

    private final x e(int i8, int i9) {
        long j8;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36372f;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            i10 = (int) (HEAD_MASK & j8);
            if ((FROZEN_MASK & j8) != 0) {
                return next();
            }
        } while (!f36372f.compareAndSet(this, j8, Companion.updateHead(j8, i9)));
        this.f36376d.set(this.f36375c & i10, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int addLast(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = s7.x.f36372f
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            s7.x$a r13 = s7.x.Companion
            int r13 = r13.addFailReason(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f36375c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.f36374b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f36376d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.f36373a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = s7.x.f36372f
            s7.x$a r5 = s7.x.Companion
            long r5 = r5.updateTail(r3, r1)
            r1 = r2
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r12.f36376d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r12
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = s7.x.f36372f
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            s7.x r0 = r0.next()
            s7.x r0 = r0.c(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.x.addLast(java.lang.Object):int");
    }

    public final boolean close() {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36372f;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if ((j8 & CLOSED_MASK) != 0) {
                return true;
            }
            if ((FROZEN_MASK & j8) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, j8 | CLOSED_MASK));
        return true;
    }

    public final int getSize() {
        long j8 = f36372f.get(this);
        return (((int) ((j8 & TAIL_MASK) >> 30)) - ((int) (HEAD_MASK & j8))) & MAX_CAPACITY_MASK;
    }

    public final boolean isClosed() {
        return (f36372f.get(this) & CLOSED_MASK) != 0;
    }

    public final boolean isEmpty() {
        long j8 = f36372f.get(this);
        return ((int) (HEAD_MASK & j8)) == ((int) ((j8 & TAIL_MASK) >> 30));
    }

    public final <R> List<R> map(f7.l lVar) {
        ArrayList arrayList = new ArrayList(this.f36373a);
        long j8 = f36372f.get(this);
        int i8 = (int) (HEAD_MASK & j8);
        int i9 = (int) ((j8 & TAIL_MASK) >> 30);
        while (true) {
            int i10 = this.f36375c;
            if ((i8 & i10) == (i9 & i10)) {
                return arrayList;
            }
            Object obj = this.f36376d.get(i10 & i8);
            if (obj != null && !(obj instanceof b)) {
                arrayList.add(lVar.invoke(obj));
            }
            i8++;
        }
    }

    public final x next() {
        return b(d());
    }

    public final Object removeFirstOrNull() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f36372f;
        while (true) {
            long j8 = atomicLongFieldUpdater.get(this);
            if ((FROZEN_MASK & j8) != 0) {
                return REMOVE_FROZEN;
            }
            int i8 = (int) (HEAD_MASK & j8);
            int i9 = (int) ((TAIL_MASK & j8) >> 30);
            int i10 = this.f36375c;
            if ((i9 & i10) == (i8 & i10)) {
                return null;
            }
            Object obj = this.f36376d.get(i10 & i8);
            if (obj == null) {
                if (this.f36374b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i11 = (i8 + 1) & MAX_CAPACITY_MASK;
                if (f36372f.compareAndSet(this, j8, Companion.updateHead(j8, i11))) {
                    this.f36376d.set(this.f36375c & i8, null);
                    return obj;
                }
                if (this.f36374b) {
                    x xVarE = this;
                    do {
                        xVarE = xVarE.e(i8, i11);
                    } while (xVarE != null);
                    return obj;
                }
            }
        }
    }
}
