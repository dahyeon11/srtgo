package kotlin.jvm.internal;

import S6.C;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayDoubleIterator extends C {
    private final double[] array;
    private int index;

    public ArrayDoubleIterator(double[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.C
    public double nextDouble() {
        try {
            double[] dArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return dArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
