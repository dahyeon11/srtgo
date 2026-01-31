package s7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p7.AbstractC6072j;

/* renamed from: s7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6244e {

    /* renamed from: a, reason: collision with root package name */
    private static final K f36341a = new K("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s7.f] */
    public static final <N extends AbstractC6245f> N close(N n8) {
        while (true) {
            Object objC = n8.c();
            if (objC == f36341a) {
                return n8;
            }
            ?? r02 = (AbstractC6245f) objC;
            if (r02 != 0) {
                n8 = r02;
            } else if (n8.markAsClosed()) {
                return n8;
            }
        }
    }

    public static final Object findSegmentAndMoveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, long j8, H h8, f7.p pVar) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(h8, j8, pVar);
            if (!I.m578isClosedimpl(objFindSegmentInternal)) {
                H hM576getSegmentimpl = I.m576getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    H h9 = (H) atomicReferenceFieldUpdater.get(obj);
                    if (h9.id >= hM576getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!hM576getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, h9, hM576getSegmentimpl)) {
                        if (h9.decPointers$kotlinx_coroutines_core()) {
                            h9.remove();
                        }
                    } else if (hM576getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        hM576getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    public static final Object findSegmentAndMoveForward$atomicfu$array(Object obj, AtomicReferenceArray atomicReferenceArray, int i8, long j8, H h8, f7.p pVar) {
        Object objFindSegmentInternal;
        loop0: while (true) {
            objFindSegmentInternal = findSegmentInternal(h8, j8, pVar);
            if (!I.m578isClosedimpl(objFindSegmentInternal)) {
                H hM576getSegmentimpl = I.m576getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    H h9 = (H) atomicReferenceArray.get(i8);
                    if (h9.id >= hM576getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!hM576getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (AbstractC6072j.a(atomicReferenceArray, i8, h9, hM576getSegmentimpl)) {
                        if (h9.decPointers$kotlinx_coroutines_core()) {
                            h9.remove();
                        }
                    } else if (hM576getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        hM576getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        return objFindSegmentInternal;
    }

    public static final <S extends H> Object findSegmentInternal(S s8, long j8, f7.p pVar) {
        while (true) {
            if (s8.id >= j8 && !s8.isRemoved()) {
                return I.m573constructorimpl(s8);
            }
            Object objC = s8.c();
            if (objC == f36341a) {
                return I.m573constructorimpl(f36341a);
            }
            AbstractC6245f abstractC6245f = (H) ((AbstractC6245f) objC);
            if (abstractC6245f == null) {
                abstractC6245f = (H) pVar.invoke(Long.valueOf(s8.id + 1), s8);
                if (s8.trySetNext(abstractC6245f)) {
                    if (s8.isRemoved()) {
                        s8.remove();
                    }
                }
            }
            s8 = abstractC6245f;
        }
    }

    public static final boolean moveForward$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, H h8) {
        while (true) {
            H h9 = (H) atomicReferenceFieldUpdater.get(obj);
            if (h9.id >= h8.id) {
                return true;
            }
            if (!h8.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, obj, h9, h8)) {
                if (h9.decPointers$kotlinx_coroutines_core()) {
                    h9.remove();
                }
                return true;
            }
            if (h8.decPointers$kotlinx_coroutines_core()) {
                h8.remove();
            }
        }
    }

    public static final boolean moveForward$atomicfu$array(Object obj, AtomicReferenceArray atomicReferenceArray, int i8, H h8) {
        while (true) {
            H h9 = (H) atomicReferenceArray.get(i8);
            if (h9.id >= h8.id) {
                return true;
            }
            if (!h8.tryIncPointers$kotlinx_coroutines_core()) {
                return false;
            }
            if (AbstractC6072j.a(atomicReferenceArray, i8, h9, h8)) {
                if (h9.decPointers$kotlinx_coroutines_core()) {
                    h9.remove();
                }
                return true;
            }
            if (h8.decPointers$kotlinx_coroutines_core()) {
                h8.remove();
            }
        }
    }
}
