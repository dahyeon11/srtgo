package k7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class x implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33796a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.l f33797b;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33798a;

        /* renamed from: b, reason: collision with root package name */
        private int f33799b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f33800c;

        a() {
            this.f33798a = x.this.f33796a.iterator();
        }

        private final void a() {
            if (this.f33798a.hasNext()) {
                Object next = this.f33798a.next();
                if (((Boolean) x.this.f33797b.invoke(next)).booleanValue()) {
                    this.f33799b = 1;
                    this.f33800c = next;
                    return;
                }
            }
            this.f33799b = 0;
        }

        public final Iterator<Object> getIterator() {
            return this.f33798a;
        }

        public final Object getNextItem() {
            return this.f33800c;
        }

        public final int getNextState() {
            return this.f33799b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33799b == -1) {
                a();
            }
            return this.f33799b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f33799b == -1) {
                a();
            }
            if (this.f33799b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f33800c;
            this.f33800c = null;
            this.f33799b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(Object obj) {
            this.f33800c = obj;
        }

        public final void setNextState(int i8) {
            this.f33799b = i8;
        }
    }

    public x(m sequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f33796a = sequence;
        this.f33797b = predicate;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
