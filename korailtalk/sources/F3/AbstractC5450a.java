package f3;

import java.util.NoSuchElementException;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5450a extends u1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f30854a;

    /* renamed from: b, reason: collision with root package name */
    private int f30855b;

    protected AbstractC5450a(int i8) {
        this(i8, 0);
    }

    protected abstract Object get(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f30855b < this.f30854a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f30855b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f30855b;
        this.f30855b = i8 + 1;
        return get(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f30855b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f30855b - 1;
        this.f30855b = i8;
        return get(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f30855b - 1;
    }

    protected AbstractC5450a(int i8, int i9) {
        e3.w.checkPositionIndex(i9, i8);
        this.f30854a = i8;
        this.f30855b = i9;
    }
}
