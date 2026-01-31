package kotlin.jvm.internal;

import S6.AbstractC0773o;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayBooleanIterator extends AbstractC0773o {
    private final boolean[] array;
    private int index;

    public ArrayBooleanIterator(boolean[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.AbstractC0773o
    public boolean nextBoolean() {
        try {
            boolean[] zArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return zArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
