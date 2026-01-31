package kotlin.jvm.internal;

import S6.M;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayIntIterator extends M {
    private final int[] array;
    private int index;

    public ArrayIntIterator(int[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.M
    public int nextInt() {
        try {
            int[] iArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return iArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
