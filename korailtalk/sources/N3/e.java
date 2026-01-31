package n3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f34209a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f34210b;

    /* renamed from: c, reason: collision with root package name */
    private final int f34211c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34212d;

    /* renamed from: e, reason: collision with root package name */
    private final h f34213e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f34214f;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Set f34215a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f34216b;

        /* renamed from: c, reason: collision with root package name */
        private int f34217c;

        /* renamed from: d, reason: collision with root package name */
        private int f34218d;

        /* renamed from: e, reason: collision with root package name */
        private h f34219e;

        /* renamed from: f, reason: collision with root package name */
        private Set f34220f;

        /* JADX INFO: Access modifiers changed from: private */
        public b b() {
            this.f34218d = 1;
            return this;
        }

        private b c(int i8) {
            v.checkState(this.f34217c == 0, "Instantiation type has already been set.");
            this.f34217c = i8;
            return this;
        }

        private void d(Class cls) {
            v.checkArgument(!this.f34215a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b add(o oVar) {
            v.checkNotNull(oVar, "Null dependency");
            d(oVar.getInterface());
            this.f34216b.add(oVar);
            return this;
        }

        public b alwaysEager() {
            return c(1);
        }

        public e build() {
            v.checkState(this.f34219e != null, "Missing required property: factory.");
            return new e(new HashSet(this.f34215a), new HashSet(this.f34216b), this.f34217c, this.f34218d, this.f34219e, this.f34220f);
        }

        public b eagerInDefaultApp() {
            return c(2);
        }

        public b factory(h hVar) {
            this.f34219e = (h) v.checkNotNull(hVar, "Null factory");
            return this;
        }

        public b publishes(Class<?> cls) {
            this.f34220f.add(cls);
            return this;
        }

        private b(Class cls, Class... clsArr) {
            HashSet hashSet = new HashSet();
            this.f34215a = hashSet;
            this.f34216b = new HashSet();
            this.f34217c = 0;
            this.f34218d = 0;
            this.f34220f = new HashSet();
            v.checkNotNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                v.checkNotNull(cls2, "Null interface");
            }
            Collections.addAll(this.f34215a, clsArr);
        }
    }

    public static <T> b builder(Class<T> cls) {
        return new b(cls, new Class[0]);
    }

    public static <T> e intoSet(T t8, Class<T> cls) {
        return intoSetBuilder(cls).factory(d.lambdaFactory$(t8)).build();
    }

    public static <T> b intoSetBuilder(Class<T> cls) {
        return builder(cls).b();
    }

    @Deprecated
    public static <T> e of(Class<T> cls, T t8) {
        return builder(cls).factory(C5949b.lambdaFactory$(t8)).build();
    }

    public Set<o> getDependencies() {
        return this.f34210b;
    }

    public h getFactory() {
        return this.f34213e;
    }

    public Set<Class<Object>> getProvidedInterfaces() {
        return this.f34209a;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f34214f;
    }

    public boolean isAlwaysEager() {
        return this.f34211c == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.f34211c == 2;
    }

    public boolean isLazy() {
        return this.f34211c == 0;
    }

    public boolean isValue() {
        return this.f34212d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f34209a.toArray()) + ">{" + this.f34211c + ", type=" + this.f34212d + ", deps=" + Arrays.toString(this.f34210b.toArray()) + "}";
    }

    private e(Set set, Set set2, int i8, int i9, h hVar, Set set3) {
        this.f34209a = Collections.unmodifiableSet(set);
        this.f34210b = Collections.unmodifiableSet(set2);
        this.f34211c = i8;
        this.f34212d = i9;
        this.f34213e = hVar;
        this.f34214f = Collections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> b builder(Class<T> cls, Class<? super T>... clsArr) {
        return new b(cls, clsArr);
    }

    @SafeVarargs
    public static <T> e of(T t8, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(c.lambdaFactory$(t8)).build();
    }

    static /* synthetic */ Object a(Object obj, f fVar) {
        return obj;
    }

    static /* synthetic */ Object b(Object obj, f fVar) {
        return obj;
    }

    static /* synthetic */ Object c(Object obj, f fVar) {
        return obj;
    }
}
