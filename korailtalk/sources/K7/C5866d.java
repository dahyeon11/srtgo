package k7;

import Q7.C;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: k7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5866d implements m, InterfaceC5867e {

    /* renamed from: a, reason: collision with root package name */
    private final m f33666a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33667b;

    /* renamed from: k7.d$a */
    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33668a;

        /* renamed from: b, reason: collision with root package name */
        private int f33669b;

        a(C5866d c5866d) {
            this.f33668a = c5866d.f33666a.iterator();
            this.f33669b = c5866d.f33667b;
        }

        private final void a() {
            while (this.f33669b > 0 && this.f33668a.hasNext()) {
                this.f33668a.next();
                this.f33669b--;
            }
        }

        public final Iterator<Object> getIterator() {
            return this.f33668a;
        }

        public final int getLeft() {
            return this.f33669b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f33668a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            a();
            return this.f33668a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setLeft(int i8) {
            this.f33669b = i8;
        }
    }

    public C5866d(m sequence, int i8) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        this.f33666a = sequence;
        this.f33667b = i8;
        if (i8 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i8 + C.PACKAGE_SEPARATOR_CHAR).toString());
    }

    @Override // k7.InterfaceC5867e
    public m drop(int i8) {
        int i9 = this.f33667b + i8;
        return i9 < 0 ? new C5866d(this, i8) : new C5866d(this.f33666a, i9);
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a(this);
    }

    @Override // k7.InterfaceC5867e
    public m take(int i8) {
        int i9 = this.f33667b;
        int i10 = i9 + i8;
        return i10 < 0 ? new w(this, i8) : new v(this.f33666a, i9, i10);
    }
}
