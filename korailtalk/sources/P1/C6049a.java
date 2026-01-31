package p1;

import java.util.Arrays;
import p1.f;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6049a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f34566a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34567b;

    /* renamed from: p1.a$b */
    static final class b extends f.a {

        /* renamed from: a, reason: collision with root package name */
        private Iterable f34568a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f34569b;

        b() {
        }

        @Override // p1.f.a
        public f build() {
            String str = "";
            if (this.f34568a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C6049a(this.f34568a, this.f34569b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p1.f.a
        public f.a setEvents(Iterable<o1.h> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f34568a = iterable;
            return this;
        }

        @Override // p1.f.a
        public f.a setExtras(byte[] bArr) {
            this.f34569b = bArr;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f34566a.equals(fVar.getEvents())) {
            if (Arrays.equals(this.f34567b, fVar instanceof C6049a ? ((C6049a) fVar).f34567b : fVar.getExtras())) {
                return true;
            }
        }
        return false;
    }

    @Override // p1.f
    public Iterable<o1.h> getEvents() {
        return this.f34566a;
    }

    @Override // p1.f
    public byte[] getExtras() {
        return this.f34567b;
    }

    public int hashCode() {
        return ((this.f34566a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f34567b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f34566a + ", extras=" + Arrays.toString(this.f34567b) + "}";
    }

    private C6049a(Iterable iterable, byte[] bArr) {
        this.f34566a = iterable;
        this.f34567b = bArr;
    }
}
