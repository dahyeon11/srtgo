package com.google.protobuf;

import com.google.protobuf.AbstractC5196b;
import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.K0;
import com.google.protobuf.P1;
import com.google.protobuf.W;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5206e0 extends AbstractC5196b {

    /* renamed from: c, reason: collision with root package name */
    private static Map f26407c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private int f26408a = -1;

    /* renamed from: b, reason: collision with root package name */
    protected H1 f26409b = H1.getDefaultInstance();

    /* renamed from: com.google.protobuf.e0$a */
    public static abstract class a extends AbstractC5196b.a {
    }

    /* renamed from: com.google.protobuf.e0$c */
    public interface c extends L0 {
        @Override // com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* synthetic */ K0 getDefaultInstanceForType();

        <Type> Type getExtension(J j8);

        <Type> Type getExtension(J j8, int i8);

        <Type> int getExtensionCount(J j8);

        <Type> boolean hasExtension(J j8);

        @Override // com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
        /* synthetic */ boolean isInitialized();
    }

    /* renamed from: com.google.protobuf.e0$d */
    static final class d implements W.c {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5227l0.d f26411a;

        /* renamed from: b, reason: collision with root package name */
        final int f26412b;

        /* renamed from: c, reason: collision with root package name */
        final P1.b f26413c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f26414d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f26415e;

        d(AbstractC5227l0.d dVar, int i8, P1.b bVar, boolean z8, boolean z9) {
            this.f26411a = dVar;
            this.f26412b = i8;
            this.f26413c = bVar;
            this.f26414d = z8;
            this.f26415e = z9;
        }

        @Override // com.google.protobuf.W.c
        public AbstractC5227l0.d getEnumType() {
            return this.f26411a;
        }

        @Override // com.google.protobuf.W.c
        public P1.c getLiteJavaType() {
            return this.f26413c.getJavaType();
        }

        @Override // com.google.protobuf.W.c
        public P1.b getLiteType() {
            return this.f26413c;
        }

        @Override // com.google.protobuf.W.c
        public int getNumber() {
            return this.f26412b;
        }

        @Override // com.google.protobuf.W.c
        public K0.a internalMergeFrom(K0.a aVar, K0 k02) {
            android.support.v4.media.session.f.a(aVar);
            throw null;
        }

        @Override // com.google.protobuf.W.c
        public boolean isPacked() {
            return this.f26415e;
        }

        @Override // com.google.protobuf.W.c
        public boolean isRepeated() {
            return this.f26414d;
        }

        @Override // java.lang.Comparable
        public int compareTo(d dVar) {
            return this.f26412b - dVar.f26412b;
        }
    }

    /* renamed from: com.google.protobuf.e0$e */
    public static class e extends J {

        /* renamed from: a, reason: collision with root package name */
        final K0 f26416a;

        /* renamed from: b, reason: collision with root package name */
        final Object f26417b;

        /* renamed from: c, reason: collision with root package name */
        final K0 f26418c;

        /* renamed from: d, reason: collision with root package name */
        final d f26419d;

        e(K0 k02, Object obj, K0 k03, d dVar, Class cls) {
            if (k02 == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (dVar.getLiteType() == P1.b.MESSAGE && k03 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f26416a = k02;
            this.f26417b = obj;
            this.f26418c = k03;
            this.f26419d = dVar;
        }

        Object b(Object obj) {
            if (!this.f26419d.isRepeated()) {
                return c(obj);
            }
            if (this.f26419d.getLiteJavaType() != P1.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(c(it.next()));
            }
            return arrayList;
        }

        Object c(Object obj) {
            return this.f26419d.getLiteJavaType() == P1.c.ENUM ? this.f26419d.f26411a.findValueByNumber(((Integer) obj).intValue()) : obj;
        }

        public K0 getContainingTypeDefaultInstance() {
            return this.f26416a;
        }

        @Override // com.google.protobuf.J
        public Object getDefaultValue() {
            return this.f26417b;
        }

        @Override // com.google.protobuf.J
        public P1.b getLiteType() {
            return this.f26419d.getLiteType();
        }

        @Override // com.google.protobuf.J
        public K0 getMessageDefaultInstance() {
            return this.f26418c;
        }

        @Override // com.google.protobuf.J
        public int getNumber() {
            return this.f26419d.getNumber();
        }

        @Override // com.google.protobuf.J
        public boolean isRepeated() {
            return this.f26419d.f26414d;
        }
    }

    /* renamed from: com.google.protobuf.e0$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.protobuf.e0$g */
    protected static final class g implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        private final Class f26421a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26422b;

        /* renamed from: c, reason: collision with root package name */
        private final byte[] f26423c;

        g(K0 k02) {
            Class<?> cls = k02.getClass();
            this.f26421a = cls;
            this.f26422b = cls.getName();
            this.f26423c = k02.toByteArray();
        }

        public static g of(K0 k02) {
            return new g(k02);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e d(J j8) {
        if (j8.a()) {
            return (e) j8;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private int h(InterfaceC5219i1 interfaceC5219i1) {
        return interfaceC5219i1 == null ? C5201c1.getInstance().schemaFor((C5201c1) this).getSerializedSize(this) : interfaceC5219i1.getSerializedSize(this);
    }

    static AbstractC5206e0 l(Class cls) throws ClassNotFoundException {
        AbstractC5206e0 defaultInstanceForType = (AbstractC5206e0) f26407c.get(cls);
        if (defaultInstanceForType == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                defaultInstanceForType = (AbstractC5206e0) f26407c.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (defaultInstanceForType == null) {
            defaultInstanceForType = ((AbstractC5206e0) L1.l(cls)).getDefaultInstanceForType();
            if (defaultInstanceForType == null) {
                throw new IllegalStateException();
            }
            f26407c.put(cls, defaultInstanceForType);
        }
        return defaultInstanceForType;
    }

    public static <ContainingType extends K0, Type> e newRepeatedGeneratedExtension(ContainingType containingtype, K0 k02, AbstractC5227l0.d dVar, int i8, P1.b bVar, boolean z8, Class cls) {
        return new e(containingtype, Collections.emptyList(), k02, new d(dVar, i8, bVar, true, z8), cls);
    }

    public static <ContainingType extends K0, Type> e newSingularGeneratedExtension(ContainingType containingtype, Type type, K0 k02, AbstractC5227l0.d dVar, int i8, P1.b bVar, Class cls) {
        return new e(containingtype, type, k02, new d(dVar, i8, bVar, false, false), cls);
    }

    static Object o(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean p(AbstractC5206e0 abstractC5206e0, boolean z8) {
        byte bByteValue = ((Byte) abstractC5206e0.i(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = C5201c1.getInstance().schemaFor((C5201c1) abstractC5206e0).isInitialized(abstractC5206e0);
        if (z8) {
            abstractC5206e0.j(f.SET_MEMOIZED_IS_INITIALIZED, zIsInitialized ? abstractC5206e0 : null);
        }
        return zIsInitialized;
    }

    Object c() {
        return i(f.BUILD_MESSAGE_INFO);
    }

    void e() {
        this.memoizedHashCode = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return C5201c1.getInstance().schemaFor((C5201c1) this).equals(this, (AbstractC5206e0) obj);
        }
        return false;
    }

    void f() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    int g() {
        return C5201c1.getInstance().schemaFor((C5201c1) this).hashCode(this);
    }

    @Override // com.google.protobuf.AbstractC5196b
    int getMemoizedSerializedSize() {
        return this.f26408a & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public final Z0 getParserForType() {
        return (Z0) i(f.GET_PARSER);
    }

    @Override // com.google.protobuf.AbstractC5196b
    int getSerializedSize(InterfaceC5219i1 interfaceC5219i1) {
        if (!q()) {
            if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
                return getMemoizedSerializedSize();
            }
            int iH = h(interfaceC5219i1);
            setMemoizedSerializedSize(iH);
            return iH;
        }
        int iH2 = h(interfaceC5219i1);
        if (iH2 >= 0) {
            return iH2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iH2);
    }

    public int hashCode() {
        if (q()) {
            return g();
        }
        if (n()) {
            u(g());
        }
        return m();
    }

    protected Object i(f fVar) {
        return k(fVar, null, null);
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final boolean isInitialized() {
        return p(this, true);
    }

    protected Object j(f fVar, Object obj) {
        return k(fVar, obj, null);
    }

    protected abstract Object k(f fVar, Object obj, Object obj2);

    int m() {
        return this.memoizedHashCode;
    }

    boolean n() {
        return m() == 0;
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public /* bridge */ /* synthetic */ K0.a newBuilderForType() {
        newBuilderForType();
        return null;
    }

    boolean q() {
        return (this.f26408a & Integer.MIN_VALUE) != 0;
    }

    protected void r() {
        C5201c1.getInstance().schemaFor((C5201c1) this).makeImmutable(this);
        s();
    }

    void s() {
        this.f26408a &= Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC5196b
    void setMemoizedSerializedSize(int i8) {
        if (i8 >= 0) {
            this.f26408a = (i8 & Integer.MAX_VALUE) | (this.f26408a & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i8);
        }
    }

    AbstractC5206e0 t() {
        return (AbstractC5206e0) i(f.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public /* bridge */ /* synthetic */ K0.a toBuilder() {
        toBuilder();
        return null;
    }

    public String toString() {
        return M0.f(this, super.toString());
    }

    void u(int i8) {
        this.memoizedHashCode = i8;
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public void writeTo(AbstractC5248t abstractC5248t) {
        C5201c1.getInstance().schemaFor((C5201c1) this).writeTo(this, C5250u.forCodedOutput(abstractC5248t));
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.L0, com.google.protobuf.H0, com.google.protobuf.N0, A7.a.c
    public final AbstractC5206e0 getDefaultInstanceForType() {
        return (AbstractC5206e0) i(f.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public final a newBuilderForType() {
        android.support.v4.media.session.f.a(i(f.NEW_BUILDER));
        return null;
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public final a toBuilder() {
        android.support.v4.media.session.f.a(i(f.NEW_BUILDER));
        throw null;
    }

    /* renamed from: com.google.protobuf.e0$b */
    public static abstract class b extends AbstractC5206e0 implements c {

        /* renamed from: d, reason: collision with root package name */
        protected W f26410d = W.emptySet();

        private void w(e eVar) {
            if (eVar.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.google.protobuf.AbstractC5206e0.c
        public final <Type> Type getExtension(J j8) {
            e eVarD = AbstractC5206e0.d(j8);
            w(eVarD);
            Object field = this.f26410d.getField(eVarD.f26419d);
            return field == null ? (Type) eVarD.f26417b : (Type) eVarD.b(field);
        }

        @Override // com.google.protobuf.AbstractC5206e0.c
        public final <Type> int getExtensionCount(J j8) {
            e eVarD = AbstractC5206e0.d(j8);
            w(eVarD);
            return this.f26410d.getRepeatedFieldCount(eVarD.f26419d);
        }

        @Override // com.google.protobuf.AbstractC5206e0.c
        public final <Type> boolean hasExtension(J j8) {
            e eVarD = AbstractC5206e0.d(j8);
            w(eVarD);
            return this.f26410d.hasField(eVarD.f26419d);
        }

        W v() {
            if (this.f26410d.isImmutable()) {
                this.f26410d = this.f26410d.m397clone();
            }
            return this.f26410d;
        }

        @Override // com.google.protobuf.AbstractC5206e0.c
        public final <Type> Type getExtension(J j8, int i8) {
            e eVarD = AbstractC5206e0.d(j8);
            w(eVarD);
            return (Type) eVarD.c(this.f26410d.getRepeatedField(eVarD.f26419d, i8));
        }
    }

    @Override // com.google.protobuf.AbstractC5196b, com.google.protobuf.K0, com.google.protobuf.H0
    public int getSerializedSize() {
        return getSerializedSize(null);
    }
}
