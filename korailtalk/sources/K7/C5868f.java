package k7;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: k7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5868f implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33670a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.l f33671b;

    /* renamed from: k7.f$a */
    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33672a;

        /* renamed from: b, reason: collision with root package name */
        private int f33673b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f33674c;

        a() {
            this.f33672a = C5868f.this.f33670a.iterator();
        }

        private final void a() {
            while (this.f33672a.hasNext()) {
                Object next = this.f33672a.next();
                if (!((Boolean) C5868f.this.f33671b.invoke(next)).booleanValue()) {
                    this.f33674c = next;
                    this.f33673b = 1;
                    return;
                }
            }
            this.f33673b = 0;
        }

        public final int getDropState() {
            return this.f33673b;
        }

        public final Iterator<Object> getIterator() {
            return this.f33672a;
        }

        public final Object getNextItem() {
            return this.f33674c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33673b == -1) {
                a();
            }
            return this.f33673b == 1 || this.f33672a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f33673b == -1) {
                a();
            }
            if (this.f33673b != 1) {
                return this.f33672a.next();
            }
            Object obj = this.f33674c;
            this.f33674c = null;
            this.f33673b = 0;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setDropState(int i8) {
            this.f33673b = i8;
        }

        public final void setNextItem(Object obj) {
            this.f33674c = obj;
        }
    }

    public C5868f(m sequence, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f33670a = sequence;
        this.f33671b = predicate;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
