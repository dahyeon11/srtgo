package o1;

import m1.AbstractC5905c;
import m1.C5904b;
import o1.k;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6025b extends k {

    /* renamed from: a, reason: collision with root package name */
    private final l f34393a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34394b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5905c f34395c;

    /* renamed from: d, reason: collision with root package name */
    private final m1.e f34396d;

    /* renamed from: e, reason: collision with root package name */
    private final C5904b f34397e;

    /* renamed from: o1.b$b, reason: collision with other inner class name */
    static final class C0359b extends k.a {

        /* renamed from: a, reason: collision with root package name */
        private l f34398a;

        /* renamed from: b, reason: collision with root package name */
        private String f34399b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5905c f34400c;

        /* renamed from: d, reason: collision with root package name */
        private m1.e f34401d;

        /* renamed from: e, reason: collision with root package name */
        private C5904b f34402e;

        C0359b() {
        }

        @Override // o1.k.a
        k.a a(C5904b c5904b) {
            if (c5904b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f34402e = c5904b;
            return this;
        }

        @Override // o1.k.a
        k.a b(AbstractC5905c abstractC5905c) {
            if (abstractC5905c == null) {
                throw new NullPointerException("Null event");
            }
            this.f34400c = abstractC5905c;
            return this;
        }

        @Override // o1.k.a
        public k build() {
            String str = "";
            if (this.f34398a == null) {
                str = " transportContext";
            }
            if (this.f34399b == null) {
                str = str + " transportName";
            }
            if (this.f34400c == null) {
                str = str + " event";
            }
            if (this.f34401d == null) {
                str = str + " transformer";
            }
            if (this.f34402e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C6025b(this.f34398a, this.f34399b, this.f34400c, this.f34401d, this.f34402e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o1.k.a
        k.a c(m1.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f34401d = eVar;
            return this;
        }

        @Override // o1.k.a
        public k.a setTransportContext(l lVar) {
            if (lVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f34398a = lVar;
            return this;
        }

        @Override // o1.k.a
        public k.a setTransportName(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f34399b = str;
            return this;
        }
    }

    @Override // o1.k
    AbstractC5905c a() {
        return this.f34395c;
    }

    @Override // o1.k
    m1.e b() {
        return this.f34396d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f34393a.equals(kVar.getTransportContext()) && this.f34394b.equals(kVar.getTransportName()) && this.f34395c.equals(kVar.a()) && this.f34396d.equals(kVar.b()) && this.f34397e.equals(kVar.getEncoding());
    }

    @Override // o1.k
    public C5904b getEncoding() {
        return this.f34397e;
    }

    @Override // o1.k
    public l getTransportContext() {
        return this.f34393a;
    }

    @Override // o1.k
    public String getTransportName() {
        return this.f34394b;
    }

    public int hashCode() {
        return ((((((((this.f34393a.hashCode() ^ 1000003) * 1000003) ^ this.f34394b.hashCode()) * 1000003) ^ this.f34395c.hashCode()) * 1000003) ^ this.f34396d.hashCode()) * 1000003) ^ this.f34397e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f34393a + ", transportName=" + this.f34394b + ", event=" + this.f34395c + ", transformer=" + this.f34396d + ", encoding=" + this.f34397e + "}";
    }

    private C6025b(l lVar, String str, AbstractC5905c abstractC5905c, m1.e eVar, C5904b c5904b) {
        this.f34393a = lVar;
        this.f34394b = str;
        this.f34395c = abstractC5905c;
        this.f34396d = eVar;
        this.f34397e = c5904b;
    }
}
