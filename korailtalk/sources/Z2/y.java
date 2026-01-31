package z2;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
abstract class y extends l {

    /* renamed from: a, reason: collision with root package name */
    private final int f37875a;

    /* renamed from: b, reason: collision with root package name */
    private int f37876b;

    protected y(int i8, int i9) {
        w.zzb(i9, i8, "index");
        this.f37875a = i8;
        this.f37876b = i9;
    }

    protected abstract Object a(int i8);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f37876b < this.f37875a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f37876b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f37876b;
        this.f37876b = i8 + 1;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f37876b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i8 = this.f37876b - 1;
        this.f37876b = i8;
        return a(i8);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f37876b - 1;
    }
}
