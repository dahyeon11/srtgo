package x;

import z.z0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f37487a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37488b = false;

    public j(z0 z0Var) {
        this.f37487a = z0Var.get(w.d.class) != null;
    }

    public void onAePrecaptureFinished() {
        this.f37488b = false;
    }

    public void onAePrecaptureStarted() {
        this.f37488b = true;
    }

    public boolean shouldSetAeModeAlwaysFlash(int i8) {
        return this.f37488b && i8 == 0 && this.f37487a;
    }
}
