package o1;

import m1.AbstractC5905c;
import m1.C5904b;
import o1.C6025b;

/* loaded from: classes.dex */
abstract class k {

    public static abstract class a {
        abstract a a(C5904b c5904b);

        abstract a b(AbstractC5905c abstractC5905c);

        public abstract k build();

        abstract a c(m1.e eVar);

        public <T> a setEvent(AbstractC5905c abstractC5905c, C5904b c5904b, m1.e eVar) {
            b(abstractC5905c);
            a(c5904b);
            c(eVar);
            return this;
        }

        public abstract a setTransportContext(l lVar);

        public abstract a setTransportName(String str);
    }

    k() {
    }

    public static a builder() {
        return new C6025b.C0359b();
    }

    abstract AbstractC5905c a();

    abstract m1.e b();

    public abstract C5904b getEncoding();

    public byte[] getPayload() {
        return (byte[]) b().apply(a().getPayload());
    }

    public abstract l getTransportContext();

    public abstract String getTransportName();
}
