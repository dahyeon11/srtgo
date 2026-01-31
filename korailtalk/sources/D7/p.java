package d7;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
final class p implements k7.m {

    /* renamed from: a, reason: collision with root package name */
    private final BufferedReader f30127a;

    public static final class a implements Iterator, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private String f30128a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f30129b;

        a() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            if (this.f30128a == null && !this.f30129b) {
                String line = p.this.f30127a.readLine();
                this.f30128a = line;
                if (line == null) {
                    this.f30129b = true;
                }
            }
            return this.f30128a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Iterator
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.f30128a;
            this.f30128a = null;
            Intrinsics.checkNotNull(str);
            return str;
        }
    }

    public p(BufferedReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        this.f30127a = reader;
    }

    @Override // k7.m
    public Iterator<String> iterator() {
        return new a();
    }
}
