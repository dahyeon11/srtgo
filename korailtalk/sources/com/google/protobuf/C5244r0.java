package com.google.protobuf;

/* renamed from: com.google.protobuf.r0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5244r0 {

    /* renamed from: e, reason: collision with root package name */
    private static final M f26699e = M.getEmptyRegistry();

    /* renamed from: a, reason: collision with root package name */
    private AbstractC5235o f26700a;

    /* renamed from: b, reason: collision with root package name */
    private M f26701b;

    /* renamed from: c, reason: collision with root package name */
    protected volatile K0 f26702c;

    /* renamed from: d, reason: collision with root package name */
    private volatile AbstractC5235o f26703d;

    public C5244r0(M m8, AbstractC5235o abstractC5235o) {
        a(m8, abstractC5235o);
        this.f26701b = m8;
        this.f26700a = abstractC5235o;
    }

    private static void a(M m8, AbstractC5235o abstractC5235o) {
        if (m8 == null) {
            throw new NullPointerException("found null ExtensionRegistry");
        }
        if (abstractC5235o == null) {
            throw new NullPointerException("found null ByteString");
        }
    }

    private static K0 c(K0 k02, AbstractC5235o abstractC5235o, M m8) {
        try {
            return k02.toBuilder().mergeFrom(abstractC5235o, m8).build();
        } catch (C5230m0 unused) {
            return k02;
        }
    }

    public static C5244r0 fromValue(K0 k02) {
        C5244r0 c5244r0 = new C5244r0();
        c5244r0.setValue(k02);
        return c5244r0;
    }

    protected void b(K0 k02) {
        if (this.f26702c != null) {
            return;
        }
        synchronized (this) {
            if (this.f26702c != null) {
                return;
            }
            try {
                if (this.f26700a != null) {
                    this.f26702c = (K0) k02.getParserForType().parseFrom(this.f26700a, this.f26701b);
                    this.f26703d = this.f26700a;
                } else {
                    this.f26702c = k02;
                    this.f26703d = AbstractC5235o.EMPTY;
                }
            } catch (C5230m0 unused) {
                this.f26702c = k02;
                this.f26703d = AbstractC5235o.EMPTY;
            }
        }
    }

    public void clear() {
        this.f26700a = null;
        this.f26702c = null;
        this.f26703d = null;
    }

    public boolean containsDefaultInstance() {
        AbstractC5235o abstractC5235o;
        AbstractC5235o abstractC5235o2 = this.f26703d;
        AbstractC5235o abstractC5235o3 = AbstractC5235o.EMPTY;
        return abstractC5235o2 == abstractC5235o3 || (this.f26702c == null && ((abstractC5235o = this.f26700a) == null || abstractC5235o == abstractC5235o3));
    }

    void d(R1 r12, int i8) {
        if (this.f26703d != null) {
            r12.writeBytes(i8, this.f26703d);
            return;
        }
        AbstractC5235o abstractC5235o = this.f26700a;
        if (abstractC5235o != null) {
            r12.writeBytes(i8, abstractC5235o);
        } else if (this.f26702c != null) {
            r12.writeMessage(i8, this.f26702c);
        } else {
            r12.writeBytes(i8, AbstractC5235o.EMPTY);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5244r0)) {
            return false;
        }
        C5244r0 c5244r0 = (C5244r0) obj;
        K0 k02 = this.f26702c;
        K0 k03 = c5244r0.f26702c;
        return (k02 == null && k03 == null) ? toByteString().equals(c5244r0.toByteString()) : (k02 == null || k03 == null) ? k02 != null ? k02.equals(c5244r0.getValue(k02.getDefaultInstanceForType())) : getValue(k03.getDefaultInstanceForType()).equals(k03) : k02.equals(k03);
    }

    public int getSerializedSize() {
        if (this.f26703d != null) {
            return this.f26703d.size();
        }
        AbstractC5235o abstractC5235o = this.f26700a;
        if (abstractC5235o != null) {
            return abstractC5235o.size();
        }
        if (this.f26702c != null) {
            return this.f26702c.getSerializedSize();
        }
        return 0;
    }

    public K0 getValue(K0 k02) {
        b(k02);
        return this.f26702c;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(C5244r0 c5244r0) {
        AbstractC5235o abstractC5235o;
        if (c5244r0.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(c5244r0);
            return;
        }
        if (this.f26701b == null) {
            this.f26701b = c5244r0.f26701b;
        }
        AbstractC5235o abstractC5235o2 = this.f26700a;
        if (abstractC5235o2 != null && (abstractC5235o = c5244r0.f26700a) != null) {
            this.f26700a = abstractC5235o2.concat(abstractC5235o);
            return;
        }
        if (this.f26702c == null && c5244r0.f26702c != null) {
            setValue(c(c5244r0.f26702c, this.f26700a, this.f26701b));
        } else if (this.f26702c == null || c5244r0.f26702c != null) {
            setValue(this.f26702c.toBuilder().mergeFrom(c5244r0.f26702c).build());
        } else {
            setValue(c(this.f26702c, c5244r0.f26700a, c5244r0.f26701b));
        }
    }

    public void mergeFrom(r rVar, M m8) {
        if (containsDefaultInstance()) {
            setByteString(rVar.readBytes(), m8);
            return;
        }
        if (this.f26701b == null) {
            this.f26701b = m8;
        }
        AbstractC5235o abstractC5235o = this.f26700a;
        if (abstractC5235o != null) {
            setByteString(abstractC5235o.concat(rVar.readBytes()), this.f26701b);
        } else {
            try {
                setValue(this.f26702c.toBuilder().mergeFrom(rVar, m8).build());
            } catch (C5230m0 unused) {
            }
        }
    }

    public void set(C5244r0 c5244r0) {
        this.f26700a = c5244r0.f26700a;
        this.f26702c = c5244r0.f26702c;
        this.f26703d = c5244r0.f26703d;
        M m8 = c5244r0.f26701b;
        if (m8 != null) {
            this.f26701b = m8;
        }
    }

    public void setByteString(AbstractC5235o abstractC5235o, M m8) {
        a(m8, abstractC5235o);
        this.f26700a = abstractC5235o;
        this.f26701b = m8;
        this.f26702c = null;
        this.f26703d = null;
    }

    public K0 setValue(K0 k02) {
        K0 k03 = this.f26702c;
        this.f26700a = null;
        this.f26703d = null;
        this.f26702c = k02;
        return k03;
    }

    public AbstractC5235o toByteString() {
        if (this.f26703d != null) {
            return this.f26703d;
        }
        AbstractC5235o abstractC5235o = this.f26700a;
        if (abstractC5235o != null) {
            return abstractC5235o;
        }
        synchronized (this) {
            try {
                if (this.f26703d != null) {
                    return this.f26703d;
                }
                if (this.f26702c == null) {
                    this.f26703d = AbstractC5235o.EMPTY;
                } else {
                    this.f26703d = this.f26702c.toByteString();
                }
                return this.f26703d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C5244r0() {
    }
}
