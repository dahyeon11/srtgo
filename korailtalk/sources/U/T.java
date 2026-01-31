package u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import u.C6373D;
import u.P;

/* loaded from: classes.dex */
class T implements P.b {

    /* renamed from: a, reason: collision with root package name */
    final CameraManager f36981a;

    /* renamed from: b, reason: collision with root package name */
    final Object f36982b;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Map f36983a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        final Handler f36984b;

        a(Handler handler) {
            this.f36984b = handler;
        }
    }

    T(Context context, Object obj) {
        this.f36981a = (CameraManager) context.getSystemService("camera");
        this.f36982b = obj;
    }

    static T a(Context context, Handler handler) {
        return new T(context, new a(handler));
    }

    @Override // u.P.b
    public CameraCharacteristics getCameraCharacteristics(String str) throws C6386i {
        try {
            return this.f36981a.getCameraCharacteristics(str);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }

    @Override // u.P.b
    public String[] getCameraIdList() throws C6386i {
        try {
            return this.f36981a.getCameraIdList();
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }

    @Override // u.P.b
    public CameraManager getCameraManager() {
        return this.f36981a;
    }

    @Override // u.P.b
    public void openCamera(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws C6386i, CameraAccessException {
        Z.h.checkNotNull(executor);
        Z.h.checkNotNull(stateCallback);
        try {
            this.f36981a.openCamera(str, new C6373D.b(executor, stateCallback), ((a) this.f36982b).f36984b);
        } catch (CameraAccessException e8) {
            throw C6386i.toCameraAccessExceptionCompat(e8);
        }
    }

    @Override // u.P.b
    public void registerAvailabilityCallback(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        P.a aVar;
        if (executor == null) {
            throw new IllegalArgumentException("executor was null");
        }
        a aVar2 = (a) this.f36982b;
        if (availabilityCallback != null) {
            synchronized (aVar2.f36983a) {
                try {
                    aVar = (P.a) aVar2.f36983a.get(availabilityCallback);
                    if (aVar == null) {
                        aVar = new P.a(executor, availabilityCallback);
                        aVar2.f36983a.put(availabilityCallback, aVar);
                    }
                } finally {
                }
            }
        } else {
            aVar = null;
        }
        this.f36981a.registerAvailabilityCallback(aVar, aVar2.f36984b);
    }

    @Override // u.P.b
    public void unregisterAvailabilityCallback(CameraManager.AvailabilityCallback availabilityCallback) {
        P.a aVar;
        if (availabilityCallback != null) {
            a aVar2 = (a) this.f36982b;
            synchronized (aVar2.f36983a) {
                aVar = (P.a) aVar2.f36983a.remove(availabilityCallback);
            }
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.g();
        }
        this.f36981a.unregisterAvailabilityCallback(aVar);
    }
}
