package k7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class v implements m, InterfaceC5867e {

    /* renamed from: a, reason: collision with root package name */
    private final m f33786a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33787b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33788c;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33789a;

        /* renamed from: b, reason: collision with root package name */
        private int f33790b;

        a() {
            this.f33789a = v.this.f33786a.iterator();
        }

        private final void a() {
            while (this.f33790b < v.this.f33787b && this.f33789a.hasNext()) {
                this.f33789a.next();
                this.f33790b++;
            }
        }

        public final Iterator<Object> getIterator() {
            return this.f33789a;
        }

        public final int getPosition() {
            return this.f33790b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f33790b < v.this.f33788c && this.f33789a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            if (this.f33790b >= v.this.f33788c) {
                throw new NoSuchElementException();
            }
            this.f33790b++;
            return this.f33789a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setPosition(int i8) {
            this.f33790b = i8;
        }
    }

    public v(m sequence, int i8, int i9) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f33786a = sequence;
        this.f33787b = i8;
        this.f33788c = i9;
        if (i8 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i8).toString());
        }
        if (i9 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i9).toString());
        }
        if (i9 >= i8) {
            return;
        }
        throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i9 + " < " + i8).toString());
    }

    private final int a() {
        return this.f33788c - this.f33787b;
    }

    @Override // k7.InterfaceC5867e
    public m drop(int i8) {
        return i8 >= a() ? p.emptySequence() : new v(this.f33786a, this.f33787b + i8, this.f33788c);
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }

    @Override // k7.InterfaceC5867e
    public m take(int i8) {
        if (i8 >= a()) {
            return this;
        }
        m mVar = this.f33786a;
        int i9 = this.f33787b;
        return new v(mVar, i9, i8 + i9);
    }
}
