package kotlin.jvm.internal;

import S6.h0;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayShortIterator extends h0 {
    private final short[] array;
    private int index;

    public ArrayShortIterator(short[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.h0
    public short nextShort() {
        try {
            short[] sArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return sArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
