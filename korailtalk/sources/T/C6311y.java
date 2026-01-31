package t;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.camera.core.C0903t;
import androidx.camera.core.C0907v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import u.C6386i;
import z.AbstractC6559H;
import z.C6558G;
import z.InterfaceC6553B;
import z.InterfaceC6607y;

/* renamed from: t.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6311y implements InterfaceC6607y {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6559H f36824a;

    /* renamed from: c, reason: collision with root package name */
    private final u.P f36826c;

    /* renamed from: d, reason: collision with root package name */
    private final List f36827d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f36828e = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C6558G f36825b = new C6558G(1);

    public C6311y(Context context, AbstractC6559H abstractC6559H, C0903t c0903t) {
        this.f36824a = abstractC6559H;
        this.f36826c = u.P.from(context, abstractC6559H.getSchedulerHandler());
        this.f36827d = a(AbstractC6297q0.b(this, c0903t));
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (c(str)) {
                arrayList.add(str);
            } else {
                androidx.camera.core.B0.d("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    private boolean c(String str) throws androidx.camera.core.A0 {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.f36826c.getCameraCharacteristicsCompat(str).get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i8 : iArr) {
                    if (i8 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (C6386i e8) {
            throw new androidx.camera.core.A0(AbstractC6300s0.createFrom(e8));
        }
    }

    S b(String str) throws C0907v {
        try {
            S s8 = (S) this.f36828e.get(str);
            if (s8 != null) {
                return s8;
            }
            S s9 = new S(str, this.f36826c);
            this.f36828e.put(str, s9);
            return s9;
        } catch (C6386i e8) {
            throw AbstractC6300s0.createFrom(e8);
        }
    }

    @Override // z.InterfaceC6607y
    public Set<String> getAvailableCameraIds() {
        return new LinkedHashSet(this.f36827d);
    }

    @Override // z.InterfaceC6607y
    public InterfaceC6553B getCamera(String str) {
        if (this.f36827d.contains(str)) {
            return new O(this.f36826c, str, b(str), this.f36825b, this.f36824a.getCameraExecutor(), this.f36824a.getSchedulerHandler());
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // z.InterfaceC6607y
    public u.P getCameraManager() {
        return this.f36826c;
    }
}
