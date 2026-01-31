package s7;

import R6.q;
import e7.AbstractC5376a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: s7.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6254o {

    /* renamed from: a, reason: collision with root package name */
    private static final int f36349a = d(Throwable.class, -1);

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC6249j f36350b;

    /* renamed from: s7.o$a */
    static final class a extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f36351a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Constructor constructor) {
            super(1);
            this.f36351a = constructor;
        }

        @Override // f7.l
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Object objNewInstance = this.f36351a.newInstance(th.getMessage(), th);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) objNewInstance;
        }
    }

    /* renamed from: s7.o$b */
    static final class b extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f36352a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Constructor constructor) {
            super(1);
            this.f36352a = constructor;
        }

        @Override // f7.l
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Object objNewInstance = this.f36352a.newInstance(th.getMessage());
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* renamed from: s7.o$c */
    static final class c extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f36353a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Constructor constructor) {
            super(1);
            this.f36353a = constructor;
        }

        @Override // f7.l
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Object objNewInstance = this.f36353a.newInstance(th);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            return (Throwable) objNewInstance;
        }
    }

    /* renamed from: s7.o$d */
    static final class d extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Constructor f36354a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Constructor constructor) {
            super(1);
            this.f36354a = constructor;
        }

        @Override // f7.l
        public final Throwable invoke(Throwable th) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Object objNewInstance = this.f36354a.newInstance(null);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(th);
            return th2;
        }
    }

    /* renamed from: s7.o$e */
    static final class e extends Lambda implements f7.l {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Override // f7.l
        public final Void invoke(Throwable th) {
            return null;
        }
    }

    /* renamed from: s7.o$f */
    static final class f extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f7.l f36355a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(f7.l lVar) {
            super(1);
            this.f36355a = lVar;
        }

        @Override // f7.l
        public final Throwable invoke(Throwable th) {
            Object objM67constructorimpl;
            f7.l lVar = this.f36355a;
            try {
                q.a aVar = R6.q.Companion;
                Throwable th2 = (Throwable) lVar.invoke(th);
                if (!Intrinsics.areEqual(th.getMessage(), th2.getMessage()) && !Intrinsics.areEqual(th2.getMessage(), th.toString())) {
                    th2 = null;
                }
                objM67constructorimpl = R6.q.m67constructorimpl(th2);
            } catch (Throwable th3) {
                q.a aVar2 = R6.q.Companion;
                objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th3));
            }
            return (Throwable) (R6.q.m72isFailureimpl(objM67constructorimpl) ? null : objM67constructorimpl);
        }
    }

    static {
        AbstractC6249j abstractC6249j;
        try {
            abstractC6249j = AbstractC6255p.getANDROID_DETECTED() ? V.INSTANCE : C6243d.INSTANCE;
        } catch (Throwable unused) {
            abstractC6249j = V.INSTANCE;
        }
        f36350b = abstractC6249j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f7.l a(Class cls) throws SecurityException {
        Object next;
        f7.l lVar;
        R6.p pVar;
        e eVar = e.INSTANCE;
        if (f36349a != d(cls, 0)) {
            return eVar;
        }
        Constructor<?>[] constructors = cls.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.length);
        int length = constructors.length;
        int i8 = 0;
        while (true) {
            next = null;
            if (i8 >= length) {
                break;
            }
            Constructor<?> constructor = constructors[i8];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            int length2 = parameterTypes.length;
            if (length2 == 0) {
                pVar = R6.v.to(e(new d(constructor)), 0);
            } else if (length2 != 1) {
                pVar = length2 != 2 ? R6.v.to(null, -1) : (Intrinsics.areEqual(parameterTypes[0], String.class) && Intrinsics.areEqual(parameterTypes[1], Throwable.class)) ? R6.v.to(e(new a(constructor)), 3) : R6.v.to(null, -1);
            } else {
                Class<?> cls2 = parameterTypes[0];
                pVar = Intrinsics.areEqual(cls2, String.class) ? R6.v.to(e(new b(constructor)), 2) : Intrinsics.areEqual(cls2, Throwable.class) ? R6.v.to(e(new c(constructor)), 1) : R6.v.to(null, -1);
            }
            arrayList.add(pVar);
            i8++;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int iIntValue = ((Number) ((R6.p) next).getSecond()).intValue();
                do {
                    Object next2 = it.next();
                    int iIntValue2 = ((Number) ((R6.p) next2).getSecond()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it.hasNext());
            }
        }
        R6.p pVar2 = (R6.p) next;
        return (pVar2 == null || (lVar = (f7.l) pVar2.getFirst()) == null) ? eVar : lVar;
    }

    private static final int b(Class cls, int i8) {
        do {
            int i9 = 0;
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    i9++;
                }
            }
            i8 += i9;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i8;
    }

    static /* synthetic */ int c(Class cls, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = 0;
        }
        return b(cls, i8);
    }

    private static final int d(Class cls, int i8) {
        Object objM67constructorimpl;
        AbstractC5376a.getKotlinClass(cls);
        try {
            q.a aVar = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th) {
            q.a aVar2 = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th));
        }
        Integer numValueOf = Integer.valueOf(i8);
        if (R6.q.m72isFailureimpl(objM67constructorimpl)) {
            objM67constructorimpl = numValueOf;
        }
        return ((Number) objM67constructorimpl).intValue();
    }

    private static final f7.l e(f7.l lVar) {
        return new f(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E tryCopyException(E e8) {
        Object objM67constructorimpl;
        if (!(e8 instanceof n7.G)) {
            return (E) f36350b.get(e8.getClass()).invoke(e8);
        }
        try {
            q.a aVar = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(((n7.G) e8).createCopy());
        } catch (Throwable th) {
            q.a aVar2 = R6.q.Companion;
            objM67constructorimpl = R6.q.m67constructorimpl(R6.r.createFailure(th));
        }
        if (R6.q.m72isFailureimpl(objM67constructorimpl)) {
            objM67constructorimpl = null;
        }
        return (E) objM67constructorimpl;
    }
}
