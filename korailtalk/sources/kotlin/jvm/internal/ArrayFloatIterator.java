package kotlin.jvm.internal;

import S6.H;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayFloatIterator extends H {
    private final float[] array;
    private int index;

    public ArrayFloatIterator(float[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.H
    public float nextFloat() {
        try {
            float[] fArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return fArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
