package p1;

import p1.C6049a;

/* loaded from: classes.dex */
public abstract class f {

    public static abstract class a {
        public abstract f build();

        public abstract a setEvents(Iterable<o1.h> iterable);

        public abstract a setExtras(byte[] bArr);
    }

    public static a builder() {
        return new C6049a.b();
    }

    public static f create(Iterable<o1.h> iterable) {
        return builder().setEvents(iterable).build();
    }

    public abstract Iterable<o1.h> getEvents();

    public abstract byte[] getExtras();
}
