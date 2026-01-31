package z;

import android.view.Surface;

/* loaded from: classes.dex */
public final class E0 extends S {

    /* renamed from: l, reason: collision with root package name */
    private final Surface f37713l;

    /* renamed from: m, reason: collision with root package name */
    private final int f37714m;

    public E0(Surface surface, int i8) {
        this.f37713l = surface;
        this.f37714m = i8;
    }

    public int getOutputConfigId() {
        return this.f37714m;
    }

    @Override // z.S
    public com.google.common.util.concurrent.C provideSurface() {
        return B.f.immediateFuture(this.f37713l);
    }
}
