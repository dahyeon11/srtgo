package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.core.AbstractC0905u;
import androidx.camera.core.C0903t;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import u.C6372C;
import u.C6386i;
import z.AbstractC6586j;
import z.InterfaceC6552A;
import z.InterfaceC6582h;

/* loaded from: classes.dex */
public final class S implements InterfaceC6552A {

    /* renamed from: a */
    private final String f36527a;

    /* renamed from: b */
    private final C6372C f36528b;

    /* renamed from: c */
    private final y.j f36529c;

    /* renamed from: e */
    private C6307w f36531e;

    /* renamed from: h */
    private final a f36534h;

    /* renamed from: j */
    private final z.z0 f36536j;

    /* renamed from: k */
    private final InterfaceC6582h f36537k;

    /* renamed from: l */
    private final u.P f36538l;

    /* renamed from: d */
    private final Object f36530d = new Object();

    /* renamed from: f */
    private a f36532f = null;

    /* renamed from: g */
    private a f36533g = null;

    /* renamed from: i */
    private List f36535i = null;

    static class a extends androidx.lifecycle.r {

        /* renamed from: m */
        private LiveData f36539m;

        /* renamed from: n */
        private Object f36540n;

        a(Object obj) {
            this.f36540n = obj;
        }

        @Override // androidx.lifecycle.r
        public <S> void addSource(LiveData liveData, androidx.lifecycle.u uVar) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.lifecycle.LiveData
        public Object getValue() {
            LiveData liveData = this.f36539m;
            return liveData == null ? this.f36540n : liveData.getValue();
        }

        void h(LiveData liveData) {
            LiveData liveData2 = this.f36539m;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.f36539m = liveData;
            super.addSource(liveData, new androidx.lifecycle.u() { // from class: t.Q
                @Override // androidx.lifecycle.u
                public final void onChanged(Object obj) {
                    this.f36524a.setValue(obj);
                }
            });
        }
    }

    S(String str, u.P p8) {
        String str2 = (String) Z.h.checkNotNull(str);
        this.f36527a = str2;
        this.f36538l = p8;
        C6372C cameraCharacteristicsCompat = p8.getCameraCharacteristicsCompat(str2);
        this.f36528b = cameraCharacteristicsCompat;
        this.f36529c = new y.j(this);
        this.f36536j = w.g.get(str, cameraCharacteristicsCompat);
        this.f36537k = new C6274f(str, cameraCharacteristicsCompat);
        this.f36534h = new a(AbstractC0905u.create(AbstractC0905u.c.CLOSED));
    }

    private void f() {
        g();
    }

    private void g() {
        String str;
        int iD = d();
        if (iD == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (iD == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (iD == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (iD == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else if (iD != 4) {
            str = "Unknown value: " + iD;
        } else {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        }
        androidx.camera.core.B0.i("Camera2CameraInfo", "Device Level: " + str);
    }

    @Override // z.InterfaceC6552A
    public void addSessionCaptureCallback(Executor executor, AbstractC6586j abstractC6586j) {
        synchronized (this.f36530d) {
            try {
                C6307w c6307w = this.f36531e;
                if (c6307w != null) {
                    c6307w.l(executor, abstractC6586j);
                    return;
                }
                if (this.f36535i == null) {
                    this.f36535i = new ArrayList();
                }
                this.f36535i.add(new Pair(abstractC6586j, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    int c() {
        Integer num = (Integer) this.f36528b.get(CameraCharacteristics.SENSOR_ORIENTATION);
        Z.h.checkNotNull(num);
        return num.intValue();
    }

    int d() {
        Integer num = (Integer) this.f36528b.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        Z.h.checkNotNull(num);
        return num.intValue();
    }

    void e(C6307w c6307w) {
        synchronized (this.f36530d) {
            try {
                this.f36531e = c6307w;
                a aVar = this.f36533g;
                if (aVar != null) {
                    aVar.h(c6307w.getZoomControl().i());
                }
                a aVar2 = this.f36532f;
                if (aVar2 != null) {
                    aVar2.h(this.f36531e.getTorchControl().f());
                }
                List<Pair> list = this.f36535i;
                if (list != null) {
                    for (Pair pair : list) {
                        this.f36531e.l((Executor) pair.second, (AbstractC6586j) pair.first);
                    }
                    this.f36535i = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f();
    }

    @Override // z.InterfaceC6552A
    public InterfaceC6582h getCamcorderProfileProvider() {
        return this.f36537k;
    }

    public y.j getCamera2CameraInfo() {
        return this.f36529c;
    }

    public C6372C getCameraCharacteristicsCompat() {
        return this.f36528b;
    }

    public Map<String, CameraCharacteristics> getCameraCharacteristicsMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(this.f36527a, this.f36528b.toCameraCharacteristics());
        for (String str : this.f36528b.getPhysicalCameraIds()) {
            if (!Objects.equals(str, this.f36527a)) {
                try {
                    linkedHashMap.put(str, this.f36538l.getCameraCharacteristicsCompat(str).toCameraCharacteristics());
                } catch (C6386i e8) {
                    androidx.camera.core.B0.e("Camera2CameraInfo", "Failed to get CameraCharacteristics for cameraId " + str, e8);
                }
            }
        }
        return linkedHashMap;
    }

    @Override // z.InterfaceC6552A
    public String getCameraId() {
        return this.f36527a;
    }

    @Override // z.InterfaceC6552A
    public z.z0 getCameraQuirks() {
        return this.f36536j;
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public /* bridge */ /* synthetic */ C0903t getCameraSelector() {
        return super.getCameraSelector();
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public LiveData getCameraState() {
        return this.f36534h;
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public androidx.camera.core.H getExposureState() {
        synchronized (this.f36530d) {
            try {
                C6307w c6307w = this.f36531e;
                if (c6307w == null) {
                    return I0.e(this.f36528b);
                }
                return c6307w.getExposureControl().f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public String getImplementationType() {
        return d() == 2 ? androidx.camera.core.r.IMPLEMENTATION_TYPE_CAMERA2_LEGACY : androidx.camera.core.r.IMPLEMENTATION_TYPE_CAMERA2;
    }

    @Override // z.InterfaceC6552A
    public Integer getLensFacing() {
        Integer num = (Integer) this.f36528b.get(CameraCharacteristics.LENS_FACING);
        Z.h.checkNotNull(num);
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            return iIntValue != 1 ? null : 1;
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0016  */
    @Override // z.InterfaceC6552A, androidx.camera.core.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getSensorRotationDegrees(int r4) {
        /*
            r3 = this;
            int r0 = r3.c()
            int r4 = androidx.camera.core.impl.utils.c.surfaceRotationToDegrees(r4)
            java.lang.Integer r1 = r3.getLensFacing()
            if (r1 == 0) goto L16
            int r1 = r1.intValue()
            r2 = 1
            if (r2 != r1) goto L16
            goto L17
        L16:
            r2 = 0
        L17:
            int r4 = androidx.camera.core.impl.utils.c.getRelativeImageRotation(r4, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t.S.getSensorRotationDegrees(int):int");
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public LiveData getTorchState() {
        synchronized (this.f36530d) {
            try {
                C6307w c6307w = this.f36531e;
                if (c6307w == null) {
                    if (this.f36532f == null) {
                        this.f36532f = new a(0);
                    }
                    return this.f36532f;
                }
                a aVar = this.f36532f;
                if (aVar != null) {
                    return aVar;
                }
                return c6307w.getTorchControl().f();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public LiveData getZoomState() {
        synchronized (this.f36530d) {
            try {
                C6307w c6307w = this.f36531e;
                if (c6307w == null) {
                    if (this.f36533g == null) {
                        this.f36533g = new a(y1.h(this.f36528b));
                    }
                    return this.f36533g;
                }
                a aVar = this.f36533g;
                if (aVar != null) {
                    return aVar;
                }
                return c6307w.getZoomControl().i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void h(LiveData liveData) {
        this.f36534h.h(liveData);
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public boolean hasFlashUnit() {
        Boolean bool = (Boolean) this.f36528b.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        Z.h.checkNotNull(bool);
        return bool.booleanValue();
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public boolean isFocusMeteringSupported(androidx.camera.core.J j8) {
        synchronized (this.f36530d) {
            try {
                C6307w c6307w = this.f36531e;
                if (c6307w == null) {
                    return false;
                }
                return c6307w.getFocusMeteringControl().q(j8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6552A
    public void removeSessionCaptureCallback(AbstractC6586j abstractC6586j) {
        synchronized (this.f36530d) {
            try {
                C6307w c6307w = this.f36531e;
                if (c6307w != null) {
                    c6307w.K(abstractC6586j);
                    return;
                }
                List list = this.f36535i;
                if (list == null) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Pair) it.next()).first == abstractC6586j) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6552A, androidx.camera.core.r
    public int getSensorRotationDegrees() {
        return getSensorRotationDegrees(0);
    }
}
