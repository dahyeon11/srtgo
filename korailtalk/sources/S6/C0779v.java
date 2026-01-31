package S6;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: S6.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C0779v extends C0778u {

    /* renamed from: S6.v$a */
    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Enumeration f4767a;

        a(Enumeration enumeration) {
            this.f4767a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4767a.hasMoreElements();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
        @Override // java.util.Iterator
        public T next() {
            return this.f4767a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> Iterator<T> iterator(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        return new a(enumeration);
    }
}
