package t;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.d1;

/* loaded from: classes.dex */
final class o1 {

    /* renamed from: a, reason: collision with root package name */
    private final b f36746a;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Executor f36747a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledExecutorService f36748b;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f36749c;

        /* renamed from: d, reason: collision with root package name */
        private final C0 f36750d;

        /* renamed from: e, reason: collision with root package name */
        private final int f36751e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f36752f;

        a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C0 c02, int i8) {
            HashSet hashSet = new HashSet();
            this.f36752f = hashSet;
            this.f36747a = executor;
            this.f36748b = scheduledExecutorService;
            this.f36749c = handler;
            this.f36750d = c02;
            this.f36751e = i8;
            if (i8 == 2) {
                hashSet.add("deferrableSurface_close");
            }
            if (i8 == 2) {
                hashSet.add("wait_for_request");
            }
        }

        o1 a() {
            return this.f36752f.isEmpty() ? new o1(new j1(this.f36750d, this.f36747a, this.f36748b, this.f36749c)) : new o1(new n1(this.f36752f, this.f36750d, this.f36747a, this.f36748b, this.f36749c));
        }
    }

    interface b {
        v.g createSessionConfigurationCompat(int i8, List<v.b> list, d1.a aVar);

        Executor getExecutor();

        com.google.common.util.concurrent.C openCaptureSession(CameraDevice cameraDevice, v.g gVar, List<z.S> list);

        com.google.common.util.concurrent.C startWithDeferrableSurface(List<z.S> list, long j8);

        boolean stop();
    }

    o1(b bVar) {
        this.f36746a = bVar;
    }

    v.g a(int i8, List list, d1.a aVar) {
        return this.f36746a.createSessionConfigurationCompat(i8, list, aVar);
    }

    com.google.common.util.concurrent.C b(CameraDevice cameraDevice, v.g gVar, List list) {
        return this.f36746a.openCaptureSession(cameraDevice, gVar, list);
    }

    com.google.common.util.concurrent.C c(List list, long j8) {
        return this.f36746a.startWithDeferrableSurface(list, j8);
    }

    boolean d() {
        return this.f36746a.stop();
    }

    public Executor getExecutor() {
        return this.f36746a.getExecutor();
    }
}
