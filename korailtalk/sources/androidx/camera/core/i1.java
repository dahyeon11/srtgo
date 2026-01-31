package androidx.camera.core;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    private final t1 f7659a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7660b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private t1 f7661a;

        /* renamed from: b, reason: collision with root package name */
        private final List f7662b = new ArrayList();

        public a addUseCase(h1 h1Var) {
            this.f7662b.add(h1Var);
            return this;
        }

        public i1 build() {
            Z.h.checkArgument(!this.f7662b.isEmpty(), "UseCase must not be empty.");
            return new i1(this.f7661a, this.f7662b);
        }

        public a setViewPort(t1 t1Var) {
            this.f7661a = t1Var;
            return this;
        }
    }

    i1(t1 t1Var, List list) {
        this.f7659a = t1Var;
        this.f7660b = list;
    }

    public List<h1> getUseCases() {
        return this.f7660b;
    }

    public t1 getViewPort() {
        return this.f7659a;
    }
}
