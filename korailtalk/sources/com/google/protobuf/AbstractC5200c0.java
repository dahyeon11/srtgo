package com.google.protobuf;

import com.google.protobuf.C5269x;
import com.google.protobuf.I;
import com.google.protobuf.P1;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.protobuf.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5200c0 extends AbstractC5193a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f26381a = 0;

    /* renamed from: com.google.protobuf.c0$a */
    class a extends e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H0 f26382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f26383c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(H0 h02, int i8) {
            super(null);
            this.f26382b = h02;
            this.f26383c = i8;
        }

        @Override // com.google.protobuf.AbstractC5200c0.e
        public C5269x.g loadDescriptor() {
            return this.f26382b.getDescriptorForType().getExtensions().get(this.f26383c);
        }
    }

    /* renamed from: com.google.protobuf.c0$b */
    class b extends e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ H0 f26384b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(H0 h02, String str) {
            super(null);
            this.f26384b = h02;
            this.f26385c = str;
        }

        @Override // com.google.protobuf.AbstractC5200c0.e
        protected C5269x.g loadDescriptor() {
            return this.f26384b.getDescriptorForType().findFieldByName(this.f26385c);
        }
    }

    /* renamed from: com.google.protobuf.c0$c */
    class c extends e {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Class f26386b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26387c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f26388d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Class cls, String str, String str2) {
            super(null);
            this.f26386b = cls;
            this.f26387c = str;
            this.f26388d = str2;
        }

        @Override // com.google.protobuf.AbstractC5200c0.e
        protected C5269x.g loadDescriptor() {
            try {
                return ((C5269x.h) this.f26386b.getClassLoader().loadClass(this.f26387c).getField("descriptor").get(null)).findExtensionByName(this.f26388d);
            } catch (Exception e8) {
                throw new RuntimeException("Cannot load descriptors: " + this.f26387c + " is not a valid descriptor class name", e8);
            }
        }
    }

    /* renamed from: com.google.protobuf.c0$d */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26389a;

        static {
            int[] iArr = new int[C5269x.g.b.values().length];
            f26389a = iArr;
            try {
                iArr[C5269x.g.b.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26389a[C5269x.g.b.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.protobuf.c0$e */
    private static abstract class e implements f {

        /* renamed from: a, reason: collision with root package name */
        private volatile C5269x.g f26390a;

        private e() {
        }

        @Override // com.google.protobuf.AbstractC5200c0.f
        public C5269x.g getDescriptor() {
            if (this.f26390a == null) {
                synchronized (this) {
                    try {
                        if (this.f26390a == null) {
                            this.f26390a = loadDescriptor();
                        }
                    } finally {
                    }
                }
            }
            return this.f26390a;
        }

        protected abstract C5269x.g loadDescriptor();

        /* synthetic */ e(AbstractC5197b0 abstractC5197b0) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.c0$f */
    interface f {
        C5269x.g getDescriptor();
    }

    /* renamed from: com.google.protobuf.c0$g */
    public static class g extends I {

        /* renamed from: a, reason: collision with root package name */
        private f f26391a;

        /* renamed from: b, reason: collision with root package name */
        private final Class f26392b;

        /* renamed from: c, reason: collision with root package name */
        private final H0 f26393c;

        /* renamed from: d, reason: collision with root package name */
        private final Method f26394d;

        /* renamed from: e, reason: collision with root package name */
        private final Method f26395e;

        /* renamed from: f, reason: collision with root package name */
        private final I.a f26396f;

        /* renamed from: com.google.protobuf.c0$g$a */
        class a implements f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C5269x.g f26397a;

            a(C5269x.g gVar) {
                this.f26397a = gVar;
            }

            @Override // com.google.protobuf.AbstractC5200c0.f
            public C5269x.g getDescriptor() {
                return this.f26397a;
            }
        }

        g(f fVar, Class cls, H0 h02, I.a aVar) {
            if (H0.class.isAssignableFrom(cls) && !cls.isInstance(h02)) {
                throw new IllegalArgumentException("Bad messageDefaultInstance for " + cls.getName());
            }
            this.f26391a = fVar;
            this.f26392b = cls;
            this.f26393c = h02;
            if (InterfaceC5204d1.class.isAssignableFrom(cls)) {
                this.f26394d = AbstractC5200c0.i(cls, "valueOf", C5269x.f.class);
                this.f26395e = AbstractC5200c0.i(cls, "getValueDescriptor", new Class[0]);
            } else {
                this.f26394d = null;
                this.f26395e = null;
            }
            this.f26396f = aVar;
        }

        @Override // com.google.protobuf.I
        protected Object b(Object obj) {
            C5269x.g descriptor = getDescriptor();
            if (!descriptor.isRepeated()) {
                return d(obj);
            }
            if (descriptor.getJavaType() != C5269x.g.b.MESSAGE && descriptor.getJavaType() != C5269x.g.b.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(d(it.next()));
            }
            return arrayList;
        }

        @Override // com.google.protobuf.I
        protected I.a c() {
            return this.f26396f;
        }

        @Override // com.google.protobuf.I
        protected Object d(Object obj) {
            int i8 = d.f26389a[getDescriptor().getJavaType().ordinal()];
            return i8 != 1 ? i8 != 2 ? obj : AbstractC5200c0.j(this.f26394d, null, (C5269x.f) obj) : this.f26392b.isInstance(obj) ? obj : this.f26393c.newBuilderForType().mergeFrom((H0) obj).build();
        }

        @Override // com.google.protobuf.I
        protected Object e(Object obj) {
            return d.f26389a[getDescriptor().getJavaType().ordinal()] != 2 ? obj : AbstractC5200c0.j(this.f26395e, obj, new Object[0]);
        }

        @Override // com.google.protobuf.I
        protected Object f(Object obj) {
            C5269x.g descriptor = getDescriptor();
            if (!descriptor.isRepeated()) {
                return e(obj);
            }
            if (descriptor.getJavaType() != C5269x.g.b.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        @Override // com.google.protobuf.J
        public Object getDefaultValue() {
            return isRepeated() ? Collections.emptyList() : getDescriptor().getJavaType() == C5269x.g.b.MESSAGE ? this.f26393c : d(getDescriptor().getDefaultValue());
        }

        @Override // com.google.protobuf.I
        public C5269x.g getDescriptor() {
            f fVar = this.f26391a;
            if (fVar != null) {
                return fVar.getDescriptor();
            }
            throw new IllegalStateException("getDescriptor() called before internalInit()");
        }

        @Override // com.google.protobuf.J
        public P1.b getLiteType() {
            return getDescriptor().getLiteType();
        }

        @Override // com.google.protobuf.J
        public int getNumber() {
            return getDescriptor().getNumber();
        }

        public void internalInit(C5269x.g gVar) {
            if (this.f26391a != null) {
                throw new IllegalStateException("Already initialized.");
            }
            this.f26391a = new a(gVar);
        }

        @Override // com.google.protobuf.J
        public boolean isRepeated() {
            return getDescriptor().isRepeated();
        }

        @Override // com.google.protobuf.I, com.google.protobuf.J
        public H0 getMessageDefaultInstance() {
            return this.f26393c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method i(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object j(Method method, Object obj, Object... objArr) {
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

    public static <ContainingType extends H0, Type> g newFileScopedGeneratedExtension(Class cls, H0 h02) {
        return new g(null, cls, h02, I.a.IMMUTABLE);
    }

    public static <ContainingType extends H0, Type> g newMessageScopedGeneratedExtension(H0 h02, int i8, Class cls, H0 h03) {
        return new g(new a(h02, i8), cls, h03, I.a.IMMUTABLE);
    }

    public static <ContainingType extends H0, Type> g newFileScopedGeneratedExtension(Class cls, H0 h02, String str, String str2) {
        return new g(new c(cls, str, str2), cls, h02, I.a.MUTABLE);
    }

    public static <ContainingType extends H0, Type> g newMessageScopedGeneratedExtension(H0 h02, String str, Class cls, H0 h03) {
        return new g(new b(h02, str), cls, h03, I.a.MUTABLE);
    }
}
