package k7;

import f7.InterfaceC5519a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: k7.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5872j implements m {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5519a f33689a;

    /* renamed from: b, reason: collision with root package name */
    private final f7.l f33690b;

    /* renamed from: k7.j$a */
    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private Object f33691a;

        /* renamed from: b, reason: collision with root package name */
        private int f33692b = -2;

        a() {
        }

        private final void a() {
            Object objInvoke;
            if (this.f33692b == -2) {
                objInvoke = C5872j.this.f33689a.invoke();
            } else {
                f7.l lVar = C5872j.this.f33690b;
                Object obj = this.f33691a;
                Intrinsics.checkNotNull(obj);
                objInvoke = lVar.invoke(obj);
            }
            this.f33691a = objInvoke;
            this.f33692b = objInvoke == null ? 0 : 1;
        }

        public final Object getNextItem() {
            return this.f33691a;
        }

        public final int getNextState() {
            return this.f33692b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f33692b < 0) {
                a();
            }
            return this.f33692b == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f33692b < 0) {
                a();
            }
            if (this.f33692b == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f33691a;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f33692b = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void setNextItem(Object obj) {
            this.f33691a = obj;
        }

        public final void setNextState(int i8) {
            this.f33692b = i8;
        }
    }

    public C5872j(InterfaceC5519a getInitialValue, f7.l getNextValue) {
        Intrinsics.checkNotNullParameter(getInitialValue, "getInitialValue");
        Intrinsics.checkNotNullParameter(getNextValue, "getNextValue");
        this.f33689a = getInitialValue;
        this.f33690b = getNextValue;
    }

    @Override // k7.m
    public Iterator<Object> iterator() {
        return new a();
    }
}
