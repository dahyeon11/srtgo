package androidx.camera.core;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7431a;

    private K(boolean z8) {
        this.f7431a = z8;
    }

    public static K create(boolean z8) {
        return new K(z8);
    }

    public static K emptyInstance() {
        return new K(false);
    }

    public boolean isFocusSuccessful() {
        return this.f7431a;
    }
}
