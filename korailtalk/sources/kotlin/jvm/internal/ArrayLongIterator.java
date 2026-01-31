package kotlin.jvm.internal;

import S6.N;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayLongIterator extends N {
    private final long[] array;
    private int index;

    public ArrayLongIterator(long[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.N
    public long nextLong() {
        try {
            long[] jArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return jArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
