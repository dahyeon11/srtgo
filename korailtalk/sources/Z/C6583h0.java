package z;

import android.util.Size;
import android.view.Surface;

/* renamed from: z.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6583h0 extends S {

    /* renamed from: l, reason: collision with root package name */
    private final Surface f37814l;

    public C6583h0(Surface surface, Size size, int i8) {
        super(size, i8);
        this.f37814l = surface;
    }

    @Override // z.S
    public com.google.common.util.concurrent.C provideSurface() {
        return B.f.immediateFuture(this.f37814l);
    }

    public C6583h0(Surface surface) {
        this.f37814l = surface;
    }
}
