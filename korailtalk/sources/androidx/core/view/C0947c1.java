package androidx.core.view;

import android.view.WindowInsetsAnimationController;

/* renamed from: androidx.core.view.c1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0947c1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f9176a;

    /* renamed from: androidx.core.view.c1$a */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f9177a;

        a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f9177a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.C0947c1.b
        void a(boolean z8) {
            this.f9177a.finish(z8);
        }

        @Override // androidx.core.view.C0947c1.b
        boolean b() {
            return this.f9177a.isCancelled();
        }

        @Override // androidx.core.view.C0947c1.b
        boolean c() {
            return this.f9177a.isFinished();
        }

        @Override // androidx.core.view.C0947c1.b
        public float getCurrentAlpha() {
            return this.f9177a.getCurrentAlpha();
        }

        @Override // androidx.core.view.C0947c1.b
        public float getCurrentFraction() {
            return this.f9177a.getCurrentFraction();
        }

        @Override // androidx.core.view.C0947c1.b
        public androidx.core.graphics.b getCurrentInsets() {
            return androidx.core.graphics.b.toCompatInsets(this.f9177a.getCurrentInsets());
        }

        @Override // androidx.core.view.C0947c1.b
        public androidx.core.graphics.b getHiddenStateInsets() {
            return androidx.core.graphics.b.toCompatInsets(this.f9177a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.C0947c1.b
        public androidx.core.graphics.b getShownStateInsets() {
            return androidx.core.graphics.b.toCompatInsets(this.f9177a.getShownStateInsets());
        }

        @Override // androidx.core.view.C0947c1.b
        public int getTypes() {
            return this.f9177a.getTypes();
        }

        @Override // androidx.core.view.C0947c1.b
        public void setInsetsAndAlpha(androidx.core.graphics.b bVar, float f8, float f9) {
            this.f9177a.setInsetsAndAlpha(bVar == null ? null : bVar.toPlatformInsets(), f8, f9);
        }
    }

    /* renamed from: androidx.core.view.c1$b */
    private static class b {
        b() {
        }

        abstract void a(boolean z8);

        abstract boolean b();

        abstract boolean c();

        public float getCurrentAlpha() {
            return 0.0f;
        }

        public float getCurrentFraction() {
            return 0.0f;
        }

        public androidx.core.graphics.b getCurrentInsets() {
            return androidx.core.graphics.b.NONE;
        }

        public androidx.core.graphics.b getHiddenStateInsets() {
            return androidx.core.graphics.b.NONE;
        }

        public androidx.core.graphics.b getShownStateInsets() {
            return androidx.core.graphics.b.NONE;
        }

        public int getTypes() {
            return 0;
        }

        public void setInsetsAndAlpha(androidx.core.graphics.b bVar, float f8, float f9) {
        }
    }

    C0947c1(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f9176a = new a(windowInsetsAnimationController);
    }

    public void finish(boolean z8) {
        this.f9176a.a(z8);
    }

    public float getCurrentAlpha() {
        return this.f9176a.getCurrentAlpha();
    }

    public float getCurrentFraction() {
        return this.f9176a.getCurrentFraction();
    }

    public androidx.core.graphics.b getCurrentInsets() {
        return this.f9176a.getCurrentInsets();
    }

    public androidx.core.graphics.b getHiddenStateInsets() {
        return this.f9176a.getHiddenStateInsets();
    }

    public androidx.core.graphics.b getShownStateInsets() {
        return this.f9176a.getShownStateInsets();
    }

    public int getTypes() {
        return this.f9176a.getTypes();
    }

    public boolean isCancelled() {
        return this.f9176a.b();
    }

    public boolean isFinished() {
        return this.f9176a.c();
    }

    public boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public void setInsetsAndAlpha(androidx.core.graphics.b bVar, float f8, float f9) {
        this.f9176a.setInsetsAndAlpha(bVar, f8, f9);
    }
}
