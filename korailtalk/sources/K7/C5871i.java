package k7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: k7.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5871i implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33683a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.l f33684b;

    /* renamed from: c, reason: collision with root package name */
    private final f7.l f33685c;

    /* renamed from: k7.i$a */
    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33686a;

        /* renamed from: b, reason: collision with root package name */
        private Iterator f33687b;

        a() {
            this.f33686a = C5871i.this.f33683a.iterator();
        }

        private final boolean a() {
            Iterator it = this.f33687b;
            if (it != null && !it.hasNext()) {
                this.f33687b = null;
            }
            while (true) {
                if (this.f33687b != null) {
                    break;
                }
                if (!this.f33686a.hasNext()) {
                    return false;
                }
                Iterator it2 = (Iterator) C5871i.this.f33685c.invoke(C5871i.this.f33684b.invoke(this.f33686a.next()));
                if (it2.hasNext()) {
                    this.f33687b = it2;
                    break;
                }
            }
            return true;
        }

        public final Iterator<Object> getItemIterator() {
            return this.f33687b;
        }

        public final Iterator<Object> getIterator() {
            return this.f33686a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return a();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            Iterator it = this.f33687b;
            Intrinsics.checkNotNull(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setItemIterator(Iterator<Object> it) {
            this.f33687b = it;
        }
    }

    public C5871i(m sequence, f7.l transformer, f7.l iterator) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        Intrinsics.checkNotNullParameter(iterator, "iterator");
        this.f33683a = sequence;
        this.f33684b = transformer;
        this.f33685c = iterator;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
