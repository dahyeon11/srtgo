package kotlin.jvm.internal;

import S6.AbstractC0774p;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class ArrayByteIterator extends AbstractC0774p {
    private final byte[] array;
    private int index;

    public ArrayByteIterator(byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        this.array = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.array.length;
    }

    @Override // S6.AbstractC0774p
    public byte nextByte() {
        try {
            byte[] bArr = this.array;
            int i8 = this.index;
            this.index = i8 + 1;
            return bArr[i8];
        } catch (ArrayIndexOutOfBoundsException e8) {
            this.index--;
            throw new NoSuchElementException(e8.getMessage());
        }
    }
}
