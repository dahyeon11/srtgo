package n3;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import r3.C6173a;
import u3.InterfaceC6416a;

/* loaded from: classes2.dex */
final class w extends AbstractC5948a {

    /* renamed from: a, reason: collision with root package name */
    private final Set f34250a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f34251b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f34252c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f34253d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f34254e;

    /* renamed from: f, reason: collision with root package name */
    private final f f34255f;

    private static class a implements r3.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f34256a;

        /* renamed from: b, reason: collision with root package name */
        private final r3.c f34257b;

        public a(Set<Class<?>> set, r3.c cVar) {
            this.f34256a = set;
            this.f34257b = cVar;
        }

        @Override // r3.c
        public void publish(C6173a c6173a) {
            if (!this.f34256a.contains(c6173a.getType())) {
                throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", c6173a));
            }
            this.f34257b.publish(c6173a);
        }
    }

    w(e eVar, f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (o oVar : eVar.getDependencies()) {
            if (oVar.isDirectInjection()) {
                if (oVar.isSet()) {
                    hashSet3.add(oVar.getInterface());
                } else {
                    hashSet.add(oVar.getInterface());
                }
            } else if (oVar.isSet()) {
                hashSet4.add(oVar.getInterface());
            } else {
                hashSet2.add(oVar.getInterface());
            }
        }
        if (!eVar.getPublishedEvents().isEmpty()) {
            hashSet.add(r3.c.class);
        }
        this.f34250a = Collections.unmodifiableSet(hashSet);
        this.f34251b = Collections.unmodifiableSet(hashSet2);
        this.f34252c = Collections.unmodifiableSet(hashSet3);
        this.f34253d = Collections.unmodifiableSet(hashSet4);
        this.f34254e = eVar.getPublishedEvents();
        this.f34255f = fVar;
    }

    @Override // n3.AbstractC5948a, n3.f
    public <T> T get(Class<T> cls) {
        if (!this.f34250a.contains(cls)) {
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t8 = (T) this.f34255f.get(cls);
        return !cls.equals(r3.c.class) ? t8 : (T) new a(this.f34254e, (r3.c) t8);
    }

    @Override // n3.AbstractC5948a, n3.f
    public <T> InterfaceC6416a getProvider(Class<T> cls) {
        if (this.f34251b.contains(cls)) {
            return this.f34255f.getProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // n3.AbstractC5948a, n3.f
    public <T> Set<T> setOf(Class<T> cls) {
        if (this.f34252c.contains(cls)) {
            return this.f34255f.setOf(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // n3.AbstractC5948a, n3.f
    public <T> InterfaceC6416a setOfProvider(Class<T> cls) {
        if (this.f34253d.contains(cls)) {
            return this.f34255f.setOfProvider(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
