package z;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6570b extends AbstractC6559H {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f37799a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f37800b;

    C6570b(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f37799a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f37800b = handler;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC6559H)) {
            return false;
        }
        AbstractC6559H abstractC6559H = (AbstractC6559H) obj;
        return this.f37799a.equals(abstractC6559H.getCameraExecutor()) && this.f37800b.equals(abstractC6559H.getSchedulerHandler());
    }

    @Override // z.AbstractC6559H
    public Executor getCameraExecutor() {
        return this.f37799a;
    }

    @Override // z.AbstractC6559H
    public Handler getSchedulerHandler() {
        return this.f37800b;
    }

    public int hashCode() {
        return ((this.f37799a.hashCode() ^ 1000003) * 1000003) ^ this.f37800b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f37799a + ", schedulerHandler=" + this.f37800b + "}";
    }
}
