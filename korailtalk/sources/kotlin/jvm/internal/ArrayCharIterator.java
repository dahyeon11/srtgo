package kotlin.jvm.internal;

import S6.AbstractC0775q;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayCharIterator extends AbstractC0775q {
    private final char[] array;
    private int index;

    public ArrayCharIterator(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.AbstractC0775q
    public char nextChar() {
        try {
            char[] cArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return cArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
