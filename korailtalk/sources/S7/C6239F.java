package s7;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: s7.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6239F {
    private volatile AtomicReferenceArray<Object> array;

    public C6239F(int i8) {
        this.array = new AtomicReferenceArray<>(i8);
    }

    public final int currentLength() {
        return this.array.length();
    }

    public final Object get(int i8) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i8 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i8);
        }
        return null;
    }

    public final void setSynchronized(int i8, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i8 < length) {
            atomicReferenceArray.set(i8, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(j7.s.coerceAtLeast(i8 + 1, length * 2));
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i8, obj);
        this.array = atomicReferenceArray2;
    }
}
