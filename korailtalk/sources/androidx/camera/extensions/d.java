package androidx.camera.extensions;

import H.g;
import H.j;
import H.k;
import H.n;
import H.o;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.C0903t;
import androidx.camera.core.InterfaceC0898q;
import androidx.camera.core.InterfaceC0901s;
import androidx.camera.core.r;
import androidx.camera.extensions.b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z.D0;
import z.InterfaceC6601s;
import z.InterfaceC6603u;
import z.O0;
import z.Y;
import z.Z;

/* loaded from: classes.dex */
final class d {

    /* renamed from: b, reason: collision with root package name */
    private static final J.a f7902b = new J.a();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0901s f7903a;

    static class a implements n {
        a() {
        }

        @Override // H.n
        public D0 createSessionProcessor(Context context) {
            return null;
        }

        @Override // H.n
        public Range<Long> getEstimatedCaptureLatencyRange(Size size) {
            return null;
        }

        @Override // H.n
        public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
            return Collections.emptyList();
        }

        @Override // H.n
        public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
            return Collections.emptyList();
        }

        @Override // H.n
        public Size[] getSupportedYuvAnalysisResolutions() {
            return new Size[0];
        }

        @Override // H.n
        public void init(r rVar) {
        }

        @Override // H.n
        public boolean isExtensionAvailable(String str, Map<String, CameraCharacteristics> map) {
            return false;
        }
    }

    d(InterfaceC0901s interfaceC0901s) {
        this.f7903a = interfaceC0901s;
    }

    private static String c(int i8) {
        if (i8 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i8 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i8 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i8 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i8 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i8 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    private static InterfaceC0898q e(int i8) {
        return new androidx.camera.extensions.a(c(i8), f(i8));
    }

    private static n f(int i8) {
        boolean zH = h();
        return zH ? new a() : f7902b.shouldDisableExtension(zH) ? new a() : zH ? new H.e(i8) : new g(i8);
    }

    private static void g(final int i8) {
        final Z zCreate = Z.create(c(i8));
        if (Y.getConfigProvider(zCreate) == InterfaceC6603u.EMPTY) {
            Y.addConfig(zCreate, new InterfaceC6603u() { // from class: androidx.camera.extensions.c
                @Override // z.InterfaceC6603u
                public final InterfaceC6601s getConfig(r rVar, Context context) {
                    return d.j(i8, zCreate, rVar, context);
                }
            });
        }
    }

    private static boolean h() {
        if (j.getRuntimeVersion().compareTo(o.VERSION_1_2) < 0) {
            return false;
        }
        return j.isAdvancedExtenderSupported();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC6601s j(int i8, Z z8, r rVar, Context context) {
        n nVarF = f(i8);
        nVarF.init(rVar);
        b.a useCaseCombinationRequiredRule = new b.a().setExtensionMode(i8).setUseCaseConfigFactory((O0) new k(i8, nVarF, context)).setCompatibilityId(z8).setUseCaseCombinationRequiredRule(1);
        D0 d0CreateSessionProcessor = nVarF.createSessionProcessor(context);
        if (d0CreateSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(d0CreateSessionProcessor);
        }
        return useCaseCombinationRequiredRule.a();
    }

    Range b(C0903t c0903t, int i8, Size size) {
        List<r> listFilter = C0903t.a.fromSelector(c0903t).addCameraFilter(e(i8)).build().filter(this.f7903a.getAvailableCameraInfos());
        if (listFilter.isEmpty()) {
            throw new IllegalArgumentException("No cameras found for given CameraSelector");
        }
        r rVar = listFilter.get(0);
        if (j.getRuntimeVersion().compareTo(o.VERSION_1_2) < 0) {
            return null;
        }
        try {
            n nVarF = f(i8);
            nVarF.init(rVar);
            return nVarF.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    C0903t d(C0903t c0903t, int i8) {
        if (!i(c0903t, i8)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<InterfaceC0898q> it = c0903t.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof androidx.camera.extensions.a) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        g(i8);
        C0903t.a aVarFromSelector = C0903t.a.fromSelector(c0903t);
        aVarFromSelector.addCameraFilter(e(i8));
        return aVarFromSelector.build();
    }

    boolean i(C0903t c0903t, int i8) {
        C0903t.a.fromSelector(c0903t).addCameraFilter(e(i8));
        return !r1.build().filter(this.f7903a.getAvailableCameraInfos()).isEmpty();
    }
}
