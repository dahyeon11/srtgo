package C;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.B0;
import androidx.camera.core.C0889l0;
import androidx.camera.core.InterfaceC0888l;
import androidx.camera.core.InterfaceC0892n;
import androidx.camera.core.K0;
import androidx.camera.core.g1;
import androidx.camera.core.h1;
import androidx.camera.core.r;
import androidx.camera.core.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import z.AbstractC6604v;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6565N;
import z.InterfaceC6601s;
import z.InterfaceC6605w;
import z.InterfaceC6606x;
import z.N0;
import z.O0;

/* loaded from: classes.dex */
public final class e implements InterfaceC0888l {

    /* renamed from: a */
    private InterfaceC6553B f386a;

    /* renamed from: b */
    private final LinkedHashSet f387b;

    /* renamed from: c */
    private final InterfaceC6606x f388c;

    /* renamed from: d */
    private final O0 f389d;

    /* renamed from: e */
    private final b f390e;

    /* renamed from: g */
    private t1 f392g;

    /* renamed from: f */
    private final List f391f = new ArrayList();

    /* renamed from: h */
    private InterfaceC6601s f393h = AbstractC6604v.emptyConfig();

    /* renamed from: i */
    private final Object f394i = new Object();

    /* renamed from: j */
    private boolean f395j = true;

    /* renamed from: k */
    private InterfaceC6565N f396k = null;

    /* renamed from: l */
    private List f397l = new ArrayList();

    public static final class a extends Exception {
        public a() {
        }

        public a(String str) {
            super(str);
        }

        public a(Throwable th) {
            super(th);
        }
    }

    public static final class b {

        /* renamed from: a */
        private final List f398a = new ArrayList();

        b(LinkedHashSet linkedHashSet) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f398a.add(((InterfaceC6553B) it.next()).getCameraInfoInternal().getCameraId());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f398a.equals(((b) obj).f398a);
            }
            return false;
        }

        public int hashCode() {
            return this.f398a.hashCode() * 53;
        }
    }

    private static class c {

        /* renamed from: a */
        N0 f399a;

        /* renamed from: b */
        N0 f400b;

        c(N0 n02, N0 n03) {
            this.f399a = n02;
            this.f400b = n03;
        }
    }

    public e(LinkedHashSet<InterfaceC6553B> linkedHashSet, InterfaceC6606x interfaceC6606x, O0 o02) {
        this.f386a = linkedHashSet.iterator().next();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(linkedHashSet);
        this.f387b = linkedHashSet2;
        this.f390e = new b(linkedHashSet2);
        this.f388c = interfaceC6606x;
        this.f389d = o02;
    }

    private void c() {
        synchronized (this.f394i) {
            InterfaceC6605w cameraControlInternal = this.f386a.getCameraControlInternal();
            this.f396k = cameraControlInternal.getInteropConfig();
            cameraControlInternal.clearInteropConfig();
        }
    }

    private List d(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean zM = m(list);
        boolean zL = l(list);
        Iterator it = list2.iterator();
        h1 h1Var = null;
        h1 h1Var2 = null;
        while (it.hasNext()) {
            h1 h1Var3 = (h1) it.next();
            if (o(h1Var3)) {
                h1Var = h1Var3;
            } else if (n(h1Var3)) {
                h1Var2 = h1Var3;
            }
        }
        if (zM && h1Var == null) {
            arrayList.add(h());
        } else if (!zM && h1Var != null) {
            arrayList.remove(h1Var);
        }
        if (zL && h1Var2 == null) {
            arrayList.add(g());
        } else if (!zL && h1Var2 != null) {
            arrayList.remove(h1Var2);
        }
        return arrayList;
    }

    private static Matrix e(Rect rect, Size size) {
        Z.h.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map f(InterfaceC6552A interfaceC6552A, List list, List list2, Map map) {
        ArrayList arrayList = new ArrayList();
        String cameraId = interfaceC6552A.getCameraId();
        HashMap map2 = new HashMap();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            arrayList.add(this.f388c.transformSurfaceConfig(cameraId, h1Var.getImageFormat(), h1Var.getAttachedSurfaceResolution()));
            map2.put(h1Var, h1Var.getAttachedSurfaceResolution());
        }
        if (!list.isEmpty()) {
            HashMap map3 = new HashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                h1 h1Var2 = (h1) it2.next();
                c cVar = (c) map.get(h1Var2);
                map3.put(h1Var2.mergeConfigs(interfaceC6552A, cVar.f399a, cVar.f400b), h1Var2);
            }
            Map<N0, Size> suggestedResolutions = this.f388c.getSuggestedResolutions(cameraId, arrayList, new ArrayList(map3.keySet()));
            for (Map.Entry entry : map3.entrySet()) {
                map2.put((h1) entry.getValue(), suggestedResolutions.get(entry.getKey()));
            }
        }
        return map2;
    }

    private C0889l0 g() {
        return new C0889l0.g().setTargetName("ImageCapture-Extra").build();
    }

    public static b generateCameraId(LinkedHashSet<InterfaceC6553B> linkedHashSet) {
        return new b(linkedHashSet);
    }

    private K0 h() {
        K0 k0Build = new K0.b().setTargetName("Preview-Extra").build();
        k0Build.setSurfaceProvider(new K0.d() { // from class: C.c
            @Override // androidx.camera.core.K0.d
            public final void onSurfaceRequested(g1 g1Var) throws ExecutionException, InterruptedException {
                e.q(g1Var);
            }
        });
        return k0Build;
    }

    private void i(List list) {
        synchronized (this.f394i) {
            try {
                if (!list.isEmpty()) {
                    this.f386a.detachUseCases(list);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        h1 h1Var = (h1) it.next();
                        if (this.f391f.contains(h1Var)) {
                            h1Var.onDetach(this.f386a);
                        } else {
                            B0.e("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + h1Var);
                        }
                    }
                    this.f391f.removeAll(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private Map j(List list, O0 o02, O0 o03) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            map.put(h1Var, new c(h1Var.getDefaultConfig(false, o02), h1Var.getDefaultConfig(true, o03)));
        }
        return map;
    }

    private boolean k() {
        boolean z8;
        synchronized (this.f394i) {
            z8 = true;
            if (this.f393h.getUseCaseCombinationRequiredRule() != 1) {
                z8 = false;
            }
        }
        return z8;
    }

    private boolean l(List list) {
        Iterator it = list.iterator();
        boolean z8 = false;
        boolean z9 = false;
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            if (o(h1Var)) {
                z8 = true;
            } else if (n(h1Var)) {
                z9 = true;
            }
        }
        return z8 && !z9;
    }

    private boolean m(List list) {
        Iterator it = list.iterator();
        boolean z8 = false;
        boolean z9 = false;
        while (it.hasNext()) {
            h1 h1Var = (h1) it.next();
            if (o(h1Var)) {
                z9 = true;
            } else if (n(h1Var)) {
                z8 = true;
            }
        }
        return z8 && !z9;
    }

    private boolean n(h1 h1Var) {
        return h1Var instanceof C0889l0;
    }

    private boolean o(h1 h1Var) {
        return h1Var instanceof K0;
    }

    public static /* synthetic */ void p(Surface surface, SurfaceTexture surfaceTexture, g1.f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void q(g1 g1Var) throws ExecutionException, InterruptedException {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(g1Var.getResolution().getWidth(), g1Var.getResolution().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        g1Var.provideSurface(surface, A.a.directExecutor(), new Z.a() { // from class: C.d
            @Override // Z.a
            public final void accept(Object obj) {
                e.p(surface, surfaceTexture, (g1.f) obj);
            }
        });
    }

    private void r() {
        synchronized (this.f394i) {
            try {
                if (this.f396k != null) {
                    this.f386a.getCameraControlInternal().addInteropConfig(this.f396k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void s(Map map, Collection collection) {
        synchronized (this.f394i) {
            try {
                if (this.f392g != null) {
                    Map<h1, Rect> mapCalculateViewPortRects = k.calculateViewPortRects(this.f386a.getCameraControlInternal().getSensorRect(), this.f386a.getCameraInfoInternal().getLensFacing().intValue() == 0, this.f392g.getAspectRatio(), this.f386a.getCameraInfoInternal().getSensorRotationDegrees(this.f392g.getRotation()), this.f392g.getScaleType(), this.f392g.getLayoutDirection(), map);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        h1 h1Var = (h1) it.next();
                        h1Var.setViewPortCropRect((Rect) Z.h.checkNotNull(mapCalculateViewPortRects.get(h1Var)));
                        h1Var.setSensorToBufferTransformMatrix(e(this.f386a.getCameraControlInternal().getSensorRect(), (Size) map.get(h1Var)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addUseCases(Collection<h1> collection) {
        synchronized (this.f394i) {
            try {
                ArrayList<h1> arrayList = new ArrayList();
                for (h1 h1Var : collection) {
                    if (this.f391f.contains(h1Var)) {
                        B0.d("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                    } else {
                        arrayList.add(h1Var);
                    }
                }
                List arrayList2 = new ArrayList(this.f391f);
                List listEmptyList = Collections.emptyList();
                List listEmptyList2 = Collections.emptyList();
                if (k()) {
                    arrayList2.removeAll(this.f397l);
                    arrayList2.addAll(arrayList);
                    listEmptyList = d(arrayList2, new ArrayList(this.f397l));
                    ArrayList arrayList3 = new ArrayList(listEmptyList);
                    arrayList3.removeAll(this.f397l);
                    arrayList.addAll(arrayList3);
                    listEmptyList2 = new ArrayList(this.f397l);
                    listEmptyList2.removeAll(listEmptyList);
                }
                Map mapJ = j(arrayList, this.f393h.getUseCaseConfigFactory(), this.f389d);
                try {
                    List arrayList4 = new ArrayList(this.f391f);
                    arrayList4.removeAll(listEmptyList2);
                    Map mapF = f(this.f386a.getCameraInfoInternal(), arrayList, arrayList4, mapJ);
                    s(mapF, collection);
                    this.f397l = listEmptyList;
                    i(listEmptyList2);
                    for (h1 h1Var2 : arrayList) {
                        c cVar = (c) mapJ.get(h1Var2);
                        h1Var2.onAttach(this.f386a, cVar.f399a, cVar.f400b);
                        h1Var2.updateSuggestedResolution((Size) Z.h.checkNotNull((Size) mapF.get(h1Var2)));
                    }
                    this.f391f.addAll(arrayList);
                    if (this.f395j) {
                        this.f386a.attachUseCases(arrayList);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((h1) it.next()).notifyState();
                    }
                } catch (IllegalArgumentException e8) {
                    throw new a(e8.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void attachUseCases() {
        synchronized (this.f394i) {
            try {
                if (!this.f395j) {
                    this.f386a.attachUseCases(this.f391f);
                    r();
                    Iterator it = this.f391f.iterator();
                    while (it.hasNext()) {
                        ((h1) it.next()).notifyState();
                    }
                    this.f395j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void detachUseCases() {
        synchronized (this.f394i) {
            try {
                if (this.f395j) {
                    this.f386a.detachUseCases(new ArrayList(this.f391f));
                    c();
                    this.f395j = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public InterfaceC0892n getCameraControl() {
        return this.f386a.getCameraControlInternal();
    }

    public b getCameraId() {
        return this.f390e;
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public r getCameraInfo() {
        return this.f386a.getCameraInfoInternal();
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public LinkedHashSet<InterfaceC6553B> getCameraInternals() {
        return this.f387b;
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public InterfaceC6601s getExtendedConfig() {
        InterfaceC6601s interfaceC6601s;
        synchronized (this.f394i) {
            interfaceC6601s = this.f393h;
        }
        return interfaceC6601s;
    }

    public List<h1> getUseCases() {
        ArrayList arrayList;
        synchronized (this.f394i) {
            arrayList = new ArrayList(this.f391f);
        }
        return arrayList;
    }

    public boolean isEquivalent(e eVar) {
        return this.f390e.equals(eVar.getCameraId());
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public boolean isUseCasesCombinationSupported(h1... h1VarArr) {
        synchronized (this.f394i) {
            try {
                try {
                    f(this.f386a.getCameraInfoInternal(), Arrays.asList(h1VarArr), Collections.emptyList(), j(Arrays.asList(h1VarArr), this.f393h.getUseCaseConfigFactory(), this.f389d));
                } catch (IllegalArgumentException unused) {
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public void removeUseCases(Collection<h1> collection) {
        synchronized (this.f394i) {
            i(new ArrayList(collection));
            if (k()) {
                this.f397l.removeAll(collection);
                try {
                    addUseCases(Collections.emptyList());
                } catch (a unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public void setActiveResumingMode(boolean z8) {
        this.f386a.setActiveResumingMode(z8);
    }

    @Override // androidx.camera.core.InterfaceC0888l
    public void setExtendedConfig(InterfaceC6601s interfaceC6601s) {
        synchronized (this.f394i) {
            if (interfaceC6601s == null) {
                try {
                    interfaceC6601s = AbstractC6604v.emptyConfig();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!this.f391f.isEmpty() && !this.f393h.getCompatibilityId().equals(interfaceC6601s.getCompatibilityId())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.f393h = interfaceC6601s;
            this.f386a.setExtendedConfig(interfaceC6601s);
        }
    }

    public void setViewPort(t1 t1Var) {
        synchronized (this.f394i) {
            this.f392g = t1Var;
        }
    }
}
