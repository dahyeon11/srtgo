package k7;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: k7.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5870h implements m {

    /* renamed from: a, reason: collision with root package name */
    private final m f33676a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f33677b;

    /* renamed from: c, reason: collision with root package name */
    private final f7.l f33678c;

    /* renamed from: k7.h$a */
    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final Iterator f33679a;

        /* renamed from: b, reason: collision with root package name */
        private int f33680b = -1;

        /* renamed from: c, reason: collision with root package name */
        private Object f33681c;

        a() {
            this.f33679a = C5870h.this.f33676a.iterator();
        }

        private final void a() {
            while (this.f33679a.hasNext()) {
                Object next = this.f33679a.next();
                if (((Boolean) C5870h.this.f33678c.invoke(next)).booleanValue() == C5870h.this.f33677b) {
                    this.f33681c = next;
                    this.f33680b = 1;
                    return;
                }
            }
            this.f33680b = 0;
        }

        public final Iterator<Object> getIterator() {
            return this.f33679a;
        }

        public final Object getNextItem() {
            return this.f33681c;
        }

        public final int getNextState() {
            return this.f33680b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33680b == -1) {
                a();
            }
            return this.f33680b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f33680b == -1) {
                a();
            }
            if (this.f33680b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f33681c;
            this.f33681c = null;
            this.f33680b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(Object obj) {
            this.f33681c = obj;
        }

        public final void setNextState(int i8) {
            this.f33680b = i8;
        }
    }

    public C5870h(m sequence, boolean z8, f7.l predicate) {
        Intrinsics.checkNotNullParameter(sequence, "sequence");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        this.f33676a = sequence;
        this.f33677b = z8;
        this.f33678c = predicate;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }

    public /* synthetic */ C5870h(m mVar, boolean z8, f7.l lVar, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(mVar, (i8 & 2) != 0 ? true : z8, lVar);
    }
}
