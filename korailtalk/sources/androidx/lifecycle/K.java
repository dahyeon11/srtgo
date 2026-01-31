package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import k0.AbstractC5837a;
import k0.C5838b;
import k0.C5840d;
import k0.C5842f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class K {

    /* renamed from: a, reason: collision with root package name */
    private final M f9977a;

    /* renamed from: b, reason: collision with root package name */
    private final b f9978b;

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5837a f9979c;

    public static class c implements b {
        public static final a Companion = new a(null);
        public static final AbstractC5837a.b VIEW_MODEL_KEY = a.C0152a.INSTANCE;

        /* renamed from: a, reason: collision with root package name */
        private static c f9983a;

        public static final class a {

            /* renamed from: androidx.lifecycle.K$c$a$a, reason: collision with other inner class name */
            private static final class C0152a implements AbstractC5837a.b {
                public static final C0152a INSTANCE = new C0152a();

                private C0152a() {
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ void getInstance$annotations() {
            }

            public final c getInstance() {
                if (c.f9983a == null) {
                    c.f9983a = new c();
                }
                c cVar = c.f9983a;
                Intrinsics.checkNotNull(cVar);
                return cVar;
            }

            private a() {
            }
        }

        public static final c getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.K.b
        public /* bridge */ /* synthetic */ J create(Class cls, AbstractC5837a abstractC5837a) {
            return super.create(cls, abstractC5837a);
        }

        @Override // androidx.lifecycle.K.b
        public <T extends J> T create(Class<T> modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
                Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
            }
        }
    }

    public static class d {
        public void onRequery(J viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(M store, b factory) {
        this(store, factory, null, 4, null);
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public <T extends J> T get(Class<T> modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    public static class a extends c {
        public static final String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        /* renamed from: c, reason: collision with root package name */
        private static a f9980c;

        /* renamed from: b, reason: collision with root package name */
        private final Application f9981b;
        public static final C0150a Companion = new C0150a(null);
        public static final AbstractC5837a.b APPLICATION_KEY = C0150a.C0151a.INSTANCE;

        /* renamed from: androidx.lifecycle.K$a$a, reason: collision with other inner class name */
        public static final class C0150a {

            /* renamed from: androidx.lifecycle.K$a$a$a, reason: collision with other inner class name */
            private static final class C0151a implements AbstractC5837a.b {
                public static final C0151a INSTANCE = new C0151a();

                private C0151a() {
                }
            }

            public /* synthetic */ C0150a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b defaultFactory$lifecycle_viewmodel_release(N owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                return owner instanceof InterfaceC1018g ? ((InterfaceC1018g) owner).getDefaultViewModelProviderFactory() : c.Companion.getInstance();
            }

            public final a getInstance(Application application) {
                Intrinsics.checkNotNullParameter(application, "application");
                if (a.f9980c == null) {
                    a.f9980c = new a(application);
                }
                a aVar = a.f9980c;
                Intrinsics.checkNotNull(aVar);
                return aVar;
            }

            private C0150a() {
            }
        }

        private a(Application application, int i8) {
            this.f9981b = application;
        }

        private final J a(Class cls, Application application) {
            if (!C1012a.class.isAssignableFrom(cls)) {
                return super.create(cls);
            }
            try {
                J j8 = (J) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(j8, "{\n                try {\n…          }\n            }");
                return j8;
            } catch (IllegalAccessException e8) {
                throw new RuntimeException("Cannot create an instance of " + cls, e8);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }

        public static final a getInstance(Application application) {
            return Companion.getInstance(application);
        }

        @Override // androidx.lifecycle.K.c, androidx.lifecycle.K.b
        public <T extends J> T create(Class<T> modelClass, AbstractC5837a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.f9981b != null) {
                return (T) create(modelClass);
            }
            Application application = (Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) a(modelClass, application);
            }
            if (C1012a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.K.c, androidx.lifecycle.K.b
        public <T extends J> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Application application = this.f9981b;
            if (application != null) {
                return (T) a(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
    }

    public K(M store, b factory, AbstractC5837a defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f9977a = store;
        this.f9978b = factory;
        this.f9979c = defaultCreationExtras;
    }

    public interface b {
        public static final a Companion = a.f9982a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            static final /* synthetic */ a f9982a = new a();

            private a() {
            }

            public final b from(C5842f... initializers) {
                Intrinsics.checkNotNullParameter(initializers, "initializers");
                return new C5838b((C5842f[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        static b from(C5842f... c5842fArr) {
            return Companion.from(c5842fArr);
        }

        default <T extends J> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends J> T create(Class<T> modelClass, AbstractC5837a extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }
    }

    public <T extends J> T get(String key, Class<T> modelClass) {
        T t8;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T t9 = (T) this.f9977a.get(key);
        if (modelClass.isInstance(t9)) {
            Object obj = this.f9978b;
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                Intrinsics.checkNotNull(t9);
                dVar.onRequery(t9);
            }
            Intrinsics.checkNotNull(t9, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t9;
        }
        C5840d c5840d = new C5840d(this.f9979c);
        c5840d.set(c.VIEW_MODEL_KEY, key);
        try {
            t8 = (T) this.f9978b.create(modelClass, c5840d);
        } catch (AbstractMethodError unused) {
            t8 = (T) this.f9978b.create(modelClass);
        }
        this.f9977a.put(key, t8);
        return t8;
    }

    public /* synthetic */ K(M m8, b bVar, AbstractC5837a abstractC5837a, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(m8, bVar, (i8 & 4) != 0 ? AbstractC5837a.C0336a.INSTANCE : abstractC5837a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(N owner) {
        this(owner.getViewModelStore(), a.Companion.defaultFactory$lifecycle_viewmodel_release(owner), L.defaultCreationExtras(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public K(N owner, b factory) {
        this(owner.getViewModelStore(), factory, L.defaultCreationExtras(owner));
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
    }
}
