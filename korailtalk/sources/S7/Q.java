package s7;

import S6.AbstractC0765i;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class Q {

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f36332b = AtomicIntegerFieldUpdater.newUpdater(Q.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    private S[] f36333a;

    private final S[] a() {
        S[] sArr = this.f36333a;
        if (sArr == null) {
            S[] sArr2 = new S[4];
            this.f36333a = sArr2;
            return sArr2;
        }
        if (getSize() < sArr.length) {
            return sArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(sArr, getSize() * 2);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        S[] sArr3 = (S[]) objArrCopyOf;
        this.f36333a = sArr3;
        return sArr3;
    }

    private final void b(int i8) {
        f36332b.set(this, i8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c(int r6) {
        /*
            r5 = this;
        L0:
            int r0 = r6 * 2
            int r1 = r0 + 1
            int r2 = r5.getSize()
            if (r1 < r2) goto Lb
            return
        Lb:
            s7.S[] r2 = r5.f36333a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r0 = r0 + 2
            int r3 = r5.getSize()
            if (r0 >= r3) goto L2b
            r3 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r2[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            r1 = r2[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            r2 = r2[r0]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            int r1 = r1.compareTo(r2)
            if (r1 > 0) goto L3f
            return
        L3f:
            r5.e(r6, r0)
            r6 = r0
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.Q.c(int):void");
    }

    private final void d(int i8) {
        while (i8 > 0) {
            S[] sArr = this.f36333a;
            Intrinsics.checkNotNull(sArr);
            int i9 = (i8 - 1) / 2;
            S s8 = sArr[i9];
            Intrinsics.checkNotNull(s8);
            S s9 = sArr[i8];
            Intrinsics.checkNotNull(s9);
            if (((Comparable) s8).compareTo(s9) <= 0) {
                return;
            }
            e(i8, i9);
            i8 = i9;
        }
    }

    private final void e(int i8, int i9) {
        S[] sArr = this.f36333a;
        Intrinsics.checkNotNull(sArr);
        S s8 = sArr[i9];
        Intrinsics.checkNotNull(s8);
        S s9 = sArr[i8];
        Intrinsics.checkNotNull(s9);
        sArr[i8] = s8;
        sArr[i9] = s9;
        s8.setIndex(i8);
        s9.setIndex(i9);
    }

    public final void addImpl(S s8) {
        s8.setHeap(this);
        S[] sArrA = a();
        int size = getSize();
        b(size + 1);
        sArrA[size] = s8;
        s8.setIndex(size);
        d(size);
    }

    public final void addLast(S s8) {
        synchronized (this) {
            addImpl(s8);
            R6.G g8 = R6.G.INSTANCE;
        }
    }

    public final boolean addLastIf(S s8, f7.l lVar) {
        boolean z8;
        synchronized (this) {
            try {
                if (((Boolean) lVar.invoke(firstImpl())).booleanValue()) {
                    addImpl(s8);
                    z8 = true;
                } else {
                    z8 = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return z8;
    }

    public final void clear() {
        synchronized (this) {
            try {
                S[] sArr = this.f36333a;
                if (sArr != null) {
                    AbstractC0765i.fill$default(sArr, (Object) null, 0, 0, 6, (Object) null);
                }
                f36332b.set(this, 0);
                R6.G g8 = R6.G.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final S find(f7.l lVar) {
        S s8;
        synchronized (this) {
            try {
                int size = getSize();
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    S[] sArr = this.f36333a;
                    s8 = sArr != null ? sArr[i8] : null;
                    Intrinsics.checkNotNull(s8);
                    if (((Boolean) lVar.invoke(s8)).booleanValue()) {
                        break;
                    }
                    i8++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s8;
    }

    public final S firstImpl() {
        S[] sArr = this.f36333a;
        if (sArr != null) {
            return sArr[0];
        }
        return null;
    }

    public final int getSize() {
        return f36332b.get(this);
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final S peek() {
        S sFirstImpl;
        synchronized (this) {
            sFirstImpl = firstImpl();
        }
        return sFirstImpl;
    }

    public final boolean remove(S s8) {
        boolean z8;
        synchronized (this) {
            if (s8.getHeap() == null) {
                z8 = false;
            } else {
                removeAtImpl(s8.getIndex());
                z8 = true;
            }
        }
        return z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s7.S removeAtImpl(int r6) {
        /*
            r5 = this;
            s7.S[] r0 = r5.f36333a
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r1 = r5.getSize()
            r2 = -1
            int r1 = r1 + r2
            r5.b(r1)
            int r1 = r5.getSize()
            if (r6 >= r1) goto L3d
            int r1 = r5.getSize()
            r5.e(r6, r1)
            int r1 = r6 + (-1)
            int r1 = r1 / 2
            if (r6 <= 0) goto L3a
            r3 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            r4 = r0[r1]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r3 = r3.compareTo(r4)
            if (r3 >= 0) goto L3a
            r5.e(r6, r1)
            r5.d(r1)
            goto L3d
        L3a:
            r5.c(r6)
        L3d:
            int r6 = r5.getSize()
            r6 = r0[r6]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1 = 0
            r6.setHeap(r1)
            r6.setIndex(r2)
            int r2 = r5.getSize()
            r0[r2] = r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.Q.removeAtImpl(int):s7.S");
    }

    public final S removeFirstIf(f7.l lVar) {
        synchronized (this) {
            try {
                S sFirstImpl = firstImpl();
                if (sFirstImpl == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                S sRemoveAtImpl = ((Boolean) lVar.invoke(sFirstImpl)).booleanValue() ? removeAtImpl(0) : null;
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return sRemoveAtImpl;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final S removeFirstOrNull() {
        S sRemoveAtImpl;
        synchronized (this) {
            sRemoveAtImpl = getSize() > 0 ? removeAtImpl(0) : null;
        }
        return sRemoveAtImpl;
    }
}
