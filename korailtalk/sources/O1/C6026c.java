package o1;

import java.util.Arrays;
import o1.l;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6026c extends l {

    /* renamed from: a, reason: collision with root package name */
    private final String f34403a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34404b;

    /* renamed from: c, reason: collision with root package name */
    private final m1.d f34405c;

    /* renamed from: o1.c$b */
    static final class b extends l.a {

        /* renamed from: a, reason: collision with root package name */
        private String f34406a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f34407b;

        /* renamed from: c, reason: collision with root package name */
        private m1.d f34408c;

        b() {
        }

        @Override // o1.l.a
        public l build() {
            String str = "";
            if (this.f34406a == null) {
                str = " backendName";
            }
            if (this.f34408c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new C6026c(this.f34406a, this.f34407b, this.f34408c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o1.l.a
        public l.a setBackendName(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f34406a = str;
            return this;
        }

        @Override // o1.l.a
        public l.a setExtras(byte[] bArr) {
            this.f34407b = bArr;
            return this;
        }

        @Override // o1.l.a
        public l.a setPriority(m1.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f34408c = dVar;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f34403a.equals(lVar.getBackendName())) {
            if (Arrays.equals(this.f34404b, lVar instanceof C6026c ? ((C6026c) lVar).f34404b : lVar.getExtras()) && this.f34405c.equals(lVar.getPriority())) {
                return true;
            }
        }
        return false;
    }

    @Override // o1.l
    public String getBackendName() {
        return this.f34403a;
    }

    @Override // o1.l
    public byte[] getExtras() {
        return this.f34404b;
    }

    @Override // o1.l
    public m1.d getPriority() {
        return this.f34405c;
    }

    public int hashCode() {
        return ((((this.f34403a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f34404b)) * 1000003) ^ this.f34405c.hashCode();
    }

    private C6026c(String str, byte[] bArr, m1.d dVar) {
        this.f34403a = str;
        this.f34404b = bArr;
        this.f34405c = dVar;
    }
}
