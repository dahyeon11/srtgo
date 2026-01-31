package t;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import s.C6203b;
import s.C6205d;
import t.C6291n0;
import t.d1;
import t.p1;
import z.AbstractC6586j;
import z.C6562K;
import z.InterfaceC6565N;

/* renamed from: t.z0 */
/* loaded from: classes.dex */
final class C6314z0 implements A0 {

    /* renamed from: e */
    o1 f36845e;

    /* renamed from: f */
    d1 f36846f;

    /* renamed from: g */
    z.C0 f36847g;

    /* renamed from: l */
    d f36852l;

    /* renamed from: m */
    com.google.common.util.concurrent.C f36853m;

    /* renamed from: n */
    c.a f36854n;

    /* renamed from: a */
    final Object f36841a = new Object();

    /* renamed from: b */
    private final List f36842b = new ArrayList();

    /* renamed from: c */
    private final CameraCaptureSession.CaptureCallback f36843c = new a();

    /* renamed from: h */
    InterfaceC6565N f36848h = z.v0.emptyBundle();

    /* renamed from: i */
    C6205d f36849i = C6205d.createEmptyCallback();

    /* renamed from: j */
    private final Map f36850j = new HashMap();

    /* renamed from: k */
    List f36851k = Collections.emptyList();

    /* renamed from: o */
    final x.m f36855o = new x.m();

    /* renamed from: d */
    private final e f36844d = new e();

    /* renamed from: t.z0$b */
    class b implements B.c {
        b() {
        }

        @Override // B.c
        public void onFailure(Throwable th) {
            synchronized (C6314z0.this.f36841a) {
                try {
                    C6314z0.this.f36845e.d();
                    int i8 = c.f36858a[C6314z0.this.f36852l.ordinal()];
                    if ((i8 == 4 || i8 == 6 || i8 == 7) && !(th instanceof CancellationException)) {
                        androidx.camera.core.B0.w("CaptureSession", "Opening session with fail " + C6314z0.this.f36852l, th);
                        C6314z0.this.f();
                    }
                } finally {
                }
            }
        }

        @Override // B.c
        public void onSuccess(Void r12) {
        }
    }

    /* renamed from: t.z0$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f36858a;

        static {
            int[] iArr = new int[d.values().length];
            f36858a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36858a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36858a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36858a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36858a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36858a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36858a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36858a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: t.z0$d */
    enum d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: t.z0$e */
    final class e extends d1.a {
        e() {
        }

        @Override // t.d1.a
        public void onConfigureFailed(d1 d1Var) {
            synchronized (C6314z0.this.f36841a) {
                try {
                    switch (c.f36858a[C6314z0.this.f36852l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C6314z0.this.f36852l);
                        case 4:
                        case 6:
                        case 7:
                            C6314z0.this.f();
                            break;
                        case 8:
                            androidx.camera.core.B0.d("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    androidx.camera.core.B0.e("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C6314z0.this.f36852l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.d1.a
        public void onConfigured(d1 d1Var) {
            synchronized (C6314z0.this.f36841a) {
                try {
                    switch (c.f36858a[C6314z0.this.f36852l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + C6314z0.this.f36852l);
                        case 4:
                            C6314z0 c6314z0 = C6314z0.this;
                            c6314z0.f36852l = d.OPENED;
                            c6314z0.f36846f = d1Var;
                            if (c6314z0.f36847g != null) {
                                List<C6562K> listOnEnableSession = c6314z0.f36849i.createComboCallback().onEnableSession();
                                if (!listOnEnableSession.isEmpty()) {
                                    C6314z0 c6314z02 = C6314z0.this;
                                    c6314z02.g(c6314z02.o(listOnEnableSession));
                                }
                            }
                            androidx.camera.core.B0.d("CaptureSession", "Attempting to send capture request onConfigured");
                            C6314z0 c6314z03 = C6314z0.this;
                            c6314z03.i(c6314z03.f36847g);
                            C6314z0.this.h();
                            break;
                        case 6:
                            C6314z0.this.f36846f = d1Var;
                            break;
                        case 7:
                            d1Var.close();
                            break;
                    }
                    androidx.camera.core.B0.d("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C6314z0.this.f36852l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.d1.a
        public void onReady(d1 d1Var) {
            synchronized (C6314z0.this.f36841a) {
                try {
                    if (c.f36858a[C6314z0.this.f36852l.ordinal()] == 1) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + C6314z0.this.f36852l);
                    }
                    androidx.camera.core.B0.d("CaptureSession", "CameraCaptureSession.onReady() " + C6314z0.this.f36852l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.d1.a
        public void onSessionFinished(d1 d1Var) {
            synchronized (C6314z0.this.f36841a) {
                try {
                    if (C6314z0.this.f36852l == d.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C6314z0.this.f36852l);
                    }
                    androidx.camera.core.B0.d("CaptureSession", "onSessionFinished()");
                    C6314z0.this.f();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    C6314z0() {
        this.f36852l = d.UNINITIALIZED;
        this.f36852l = d.INITIALIZED;
    }

    private CameraCaptureSession.CaptureCallback e(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6306v0.a((AbstractC6586j) it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return T.a(arrayList);
    }

    public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession, int i8, boolean z8) {
        synchronized (this.f36841a) {
            try {
                if (this.f36852l == d.OPENED) {
                    i(this.f36847g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ Object l(c.a aVar) {
        String str;
        synchronized (this.f36841a) {
            Z.h.checkState(this.f36854n == null, "Release completer expected to be null");
            this.f36854n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    private static InterfaceC6565N m(List list) {
        z.r0 r0VarCreate = z.r0.create();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC6565N implementationOptions = ((C6562K) it.next()).getImplementationOptions();
            for (InterfaceC6565N.a aVar : implementationOptions.listOptions()) {
                Object objRetrieveOption = implementationOptions.retrieveOption(aVar, null);
                if (r0VarCreate.containsOption(aVar)) {
                    Object objRetrieveOption2 = r0VarCreate.retrieveOption(aVar, null);
                    if (!Objects.equals(objRetrieveOption2, objRetrieveOption)) {
                        androidx.camera.core.B0.d("CaptureSession", "Detect conflicting option " + aVar.getId() + " : " + objRetrieveOption + " != " + objRetrieveOption2);
                    }
                } else {
                    r0VarCreate.insertOption(aVar, objRetrieveOption);
                }
            }
        }
        return r0VarCreate;
    }

    /* renamed from: n */
    public com.google.common.util.concurrent.C k(List list, z.C0 c02, CameraDevice cameraDevice) {
        synchronized (this.f36841a) {
            try {
                int i8 = c.f36858a[this.f36852l.ordinal()];
                if (i8 != 1 && i8 != 2) {
                    if (i8 == 3) {
                        this.f36850j.clear();
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            this.f36850j.put((z.S) this.f36851k.get(i9), (Surface) list.get(i9));
                        }
                        ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
                        this.f36852l = d.OPENING;
                        androidx.camera.core.B0.d("CaptureSession", "Opening capture session.");
                        d1.a aVarA = p1.a(this.f36844d, new p1.a(c02.getSessionStateCallbacks()));
                        C6203b c6203b = new C6203b(c02.getImplementationOptions());
                        C6205d cameraEventCallback = c6203b.getCameraEventCallback(C6205d.createEmptyCallback());
                        this.f36849i = cameraEventCallback;
                        List<C6562K> listOnPresetSession = cameraEventCallback.createComboCallback().onPresetSession();
                        C6562K.a aVarFrom = C6562K.a.from(c02.getRepeatingCaptureConfig());
                        Iterator<C6562K> it = listOnPresetSession.iterator();
                        while (it.hasNext()) {
                            aVarFrom.addImplementationOptions(it.next().getImplementationOptions());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            v.b bVar = new v.b((Surface) it2.next());
                            bVar.setPhysicalCameraId(c6203b.getPhysicalCameraId(null));
                            arrayList2.add(bVar);
                        }
                        v.g gVarA = this.f36845e.a(0, arrayList2, aVarA);
                        try {
                            CaptureRequest captureRequestBuildWithoutTarget = AbstractC6281i0.buildWithoutTarget(aVarFrom.build(), cameraDevice);
                            if (captureRequestBuildWithoutTarget != null) {
                                gVarA.setSessionParameters(captureRequestBuildWithoutTarget);
                            }
                            return this.f36845e.b(cameraDevice, gVarA, this.f36851k);
                        } catch (CameraAccessException e8) {
                            return B.f.immediateFailedFuture(e8);
                        }
                    }
                    if (i8 != 5) {
                        return B.f.immediateFailedFuture(new CancellationException("openCaptureSession() not execute in state: " + this.f36852l));
                    }
                }
                return B.f.immediateFailedFuture(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f36852l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // t.A0
    public void cancelIssuedCaptureRequests() {
        ArrayList arrayList;
        synchronized (this.f36841a) {
            try {
                if (this.f36842b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f36842b);
                    this.f36842b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<AbstractC6586j> it2 = ((C6562K) it.next()).getCameraCaptureCallbacks().iterator();
                while (it2.hasNext()) {
                    it2.next().onCaptureCancelled();
                }
            }
        }
    }

    @Override // t.A0
    public void close() {
        synchronized (this.f36841a) {
            int i8 = c.f36858a[this.f36852l.ordinal()];
            if (i8 == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.f36852l);
            }
            if (i8 == 2) {
                this.f36852l = d.RELEASED;
            } else if (i8 == 3) {
                Z.h.checkNotNull(this.f36845e, "The Opener shouldn't null in state:" + this.f36852l);
                this.f36845e.d();
                this.f36852l = d.RELEASED;
            } else if (i8 == 4) {
                Z.h.checkNotNull(this.f36845e, "The Opener shouldn't null in state:" + this.f36852l);
                this.f36845e.d();
                this.f36852l = d.CLOSED;
                this.f36847g = null;
            } else if (i8 == 5) {
                if (this.f36847g != null) {
                    List<C6562K> listOnDisableSession = this.f36849i.createComboCallback().onDisableSession();
                    if (!listOnDisableSession.isEmpty()) {
                        try {
                            issueCaptureRequests(o(listOnDisableSession));
                        } catch (IllegalStateException e8) {
                            androidx.camera.core.B0.e("CaptureSession", "Unable to issue the request before close the capture session", e8);
                        }
                    }
                }
                Z.h.checkNotNull(this.f36845e, "The Opener shouldn't null in state:" + this.f36852l);
                this.f36845e.d();
                this.f36852l = d.CLOSED;
                this.f36847g = null;
            }
        }
    }

    void d() {
        synchronized (this.f36841a) {
            if (this.f36852l == d.OPENED) {
                try {
                    this.f36846f.abortCaptures();
                } catch (CameraAccessException e8) {
                    androidx.camera.core.B0.e("CaptureSession", "Unable to abort captures.", e8);
                }
            } else {
                androidx.camera.core.B0.e("CaptureSession", "Unable to abort captures. Incorrect state:" + this.f36852l);
            }
        }
    }

    void f() {
        d dVar = this.f36852l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            androidx.camera.core.B0.d("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f36852l = dVar2;
        this.f36846f = null;
        c.a aVar = this.f36854n;
        if (aVar != null) {
            aVar.set(null);
            this.f36854n = null;
        }
    }

    int g(List list) {
        C6291n0 c6291n0;
        ArrayList arrayList;
        boolean z8;
        synchronized (this.f36841a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                c6291n0 = new C6291n0();
                arrayList = new ArrayList();
                androidx.camera.core.B0.d("CaptureSession", "Issuing capture request.");
                Iterator it = list.iterator();
                z8 = false;
                while (it.hasNext()) {
                    C6562K c6562k = (C6562K) it.next();
                    if (c6562k.getSurfaces().isEmpty()) {
                        androidx.camera.core.B0.d("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<z.S> it2 = c6562k.getSurfaces().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                z.S next = it2.next();
                                if (!this.f36850j.containsKey(next)) {
                                    androidx.camera.core.B0.d("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            } else {
                                if (c6562k.getTemplateType() == 2) {
                                    z8 = true;
                                }
                                C6562K.a aVarFrom = C6562K.a.from(c6562k);
                                z.C0 c02 = this.f36847g;
                                if (c02 != null) {
                                    aVarFrom.addImplementationOptions(c02.getRepeatingCaptureConfig().getImplementationOptions());
                                }
                                aVarFrom.addImplementationOptions(this.f36848h);
                                aVarFrom.addImplementationOptions(c6562k.getImplementationOptions());
                                CaptureRequest captureRequestBuild = AbstractC6281i0.build(aVarFrom.build(), this.f36846f.getDevice(), this.f36850j);
                                if (captureRequestBuild == null) {
                                    androidx.camera.core.B0.d("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator<AbstractC6586j> it3 = c6562k.getCameraCaptureCallbacks().iterator();
                                while (it3.hasNext()) {
                                    AbstractC6306v0.b(it3.next(), arrayList2);
                                }
                                c6291n0.a(captureRequestBuild, arrayList2);
                                arrayList.add(captureRequestBuild);
                            }
                        }
                    }
                }
            } catch (CameraAccessException e8) {
                androidx.camera.core.B0.e("CaptureSession", "Unable to access camera: " + e8.getMessage());
                Thread.dumpStack();
            }
            if (arrayList.isEmpty()) {
                androidx.camera.core.B0.d("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                return -1;
            }
            if (this.f36855o.shouldStopRepeatingBeforeCapture(arrayList, z8)) {
                this.f36846f.stopRepeating();
                c6291n0.setCaptureSequenceCallback(new C6291n0.a() { // from class: t.w0
                    @Override // t.C6291n0.a
                    public final void onCaptureSequenceCompletedOrAborted(CameraCaptureSession cameraCaptureSession, int i8, boolean z9) {
                        this.f36814a.j(cameraCaptureSession, i8, z9);
                    }
                });
            }
            return this.f36846f.captureBurstRequests(arrayList, c6291n0);
        }
    }

    @Override // t.A0
    public List<C6562K> getCaptureConfigs() {
        List<C6562K> listUnmodifiableList;
        synchronized (this.f36841a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f36842b);
        }
        return listUnmodifiableList;
    }

    @Override // t.A0
    public z.C0 getSessionConfig() {
        z.C0 c02;
        synchronized (this.f36841a) {
            c02 = this.f36847g;
        }
        return c02;
    }

    void h() {
        if (this.f36842b.isEmpty()) {
            return;
        }
        try {
            g(this.f36842b);
        } finally {
            this.f36842b.clear();
        }
    }

    int i(z.C0 c02) {
        synchronized (this.f36841a) {
            try {
            } catch (Throwable th) {
                throw th;
            }
            if (c02 == null) {
                androidx.camera.core.B0.d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            C6562K repeatingCaptureConfig = c02.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getSurfaces().isEmpty()) {
                androidx.camera.core.B0.d("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f36846f.stopRepeating();
                } catch (CameraAccessException e8) {
                    androidx.camera.core.B0.e("CaptureSession", "Unable to access camera: " + e8.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                androidx.camera.core.B0.d("CaptureSession", "Issuing request for session.");
                C6562K.a aVarFrom = C6562K.a.from(repeatingCaptureConfig);
                InterfaceC6565N interfaceC6565NM = m(this.f36849i.createComboCallback().onRepeating());
                this.f36848h = interfaceC6565NM;
                aVarFrom.addImplementationOptions(interfaceC6565NM);
                CaptureRequest captureRequestBuild = AbstractC6281i0.build(aVarFrom.build(), this.f36846f.getDevice(), this.f36850j);
                if (captureRequestBuild == null) {
                    androidx.camera.core.B0.d("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f36846f.setSingleRepeatingRequest(captureRequestBuild, e(repeatingCaptureConfig.getCameraCaptureCallbacks(), this.f36843c));
            } catch (CameraAccessException e9) {
                androidx.camera.core.B0.e("CaptureSession", "Unable to access camera: " + e9.getMessage());
                Thread.dumpStack();
                return -1;
            }
            throw th;
        }
    }

    @Override // t.A0
    public void issueCaptureRequests(List<C6562K> list) {
        synchronized (this.f36841a) {
            try {
                switch (c.f36858a[this.f36852l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f36852l);
                    case 2:
                    case 3:
                    case 4:
                        this.f36842b.addAll(list);
                        break;
                    case 5:
                        this.f36842b.addAll(list);
                        h();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } finally {
            }
        }
    }

    List o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C6562K.a aVarFrom = C6562K.a.from((C6562K) it.next());
            aVarFrom.setTemplateType(1);
            Iterator<z.S> it2 = this.f36847g.getRepeatingCaptureConfig().getSurfaces().iterator();
            while (it2.hasNext()) {
                aVarFrom.addSurface(it2.next());
            }
            arrayList.add(aVarFrom.build());
        }
        return arrayList;
    }

    @Override // t.A0
    public com.google.common.util.concurrent.C open(final z.C0 c02, final CameraDevice cameraDevice, o1 o1Var) {
        synchronized (this.f36841a) {
            try {
                if (c.f36858a[this.f36852l.ordinal()] == 2) {
                    this.f36852l = d.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(c02.getSurfaces());
                    this.f36851k = arrayList;
                    this.f36845e = o1Var;
                    B.d dVarTransformAsync = B.d.from(o1Var.c(arrayList, 5000L)).transformAsync(new B.a() { // from class: t.y0
                        @Override // B.a
                        public final com.google.common.util.concurrent.C apply(Object obj) {
                            return this.f36829a.k(c02, cameraDevice, (List) obj);
                        }
                    }, this.f36845e.getExecutor());
                    B.f.addCallback(dVarTransformAsync, new b(), this.f36845e.getExecutor());
                    return B.f.nonCancellationPropagating(dVarTransformAsync);
                }
                androidx.camera.core.B0.e("CaptureSession", "Open not allowed in state: " + this.f36852l);
                return B.f.immediateFailedFuture(new IllegalStateException("open() should not allow the state: " + this.f36852l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void p() {
        synchronized (this.f36841a) {
            if (this.f36852l == d.OPENED) {
                try {
                    this.f36846f.stopRepeating();
                } catch (CameraAccessException e8) {
                    androidx.camera.core.B0.e("CaptureSession", "Unable to stop repeating.", e8);
                }
            } else {
                androidx.camera.core.B0.e("CaptureSession", "Unable to stop repeating. Incorrect state:" + this.f36852l);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0050 A[Catch: all -> 0x001c, TryCatch #1 {, blocks: (B:42:0x0003, B:43:0x000d, B:66:0x0088, B:45:0x0012, B:48:0x0018, B:54:0x0027, B:53:0x0020, B:55:0x002c, B:57:0x0050, B:58:0x0054, B:60:0x0058, B:61:0x0063, B:62:0x0065, B:64:0x0067, B:65:0x0084, B:69:0x008f, B:70:0x00a7), top: B:75:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0058 A[Catch: all -> 0x001c, TryCatch #1 {, blocks: (B:42:0x0003, B:43:0x000d, B:66:0x0088, B:45:0x0012, B:48:0x0018, B:54:0x0027, B:53:0x0020, B:55:0x002c, B:57:0x0050, B:58:0x0054, B:60:0x0058, B:61:0x0063, B:62:0x0065, B:64:0x0067, B:65:0x0084, B:69:0x008f, B:70:0x00a7), top: B:75:0x0003, inners: #0 }] */
    @Override // t.A0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.common.util.concurrent.C release(boolean r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f36841a
            monitor-enter(r0)
            int[] r1 = t.C6314z0.c.f36858a     // Catch: java.lang.Throwable -> L1c
            t.z0$d r2 = r3.f36852l     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L1c
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1c
            switch(r1) {
                case 1: goto L8f;
                case 2: goto L84;
                case 3: goto L67;
                case 4: goto L2c;
                case 5: goto L12;
                case 6: goto L12;
                case 7: goto L54;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L1c
        L10:
            goto L88
        L12:
            t.d1 r1 = r3.f36846f     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L2c
            if (r4 == 0) goto L27
            r1.abortCaptures()     // Catch: java.lang.Throwable -> L1c android.hardware.camera2.CameraAccessException -> L1f
            goto L27
        L1c:
            r4 = move-exception
            goto La8
        L1f:
            r4 = move-exception
            java.lang.String r1 = "CaptureSession"
            java.lang.String r2 = "Unable to abort captures."
            androidx.camera.core.B0.e(r1, r2, r4)     // Catch: java.lang.Throwable -> L1c
        L27:
            t.d1 r4 = r3.f36846f     // Catch: java.lang.Throwable -> L1c
            r4.close()     // Catch: java.lang.Throwable -> L1c
        L2c:
            t.z0$d r4 = t.C6314z0.d.RELEASING     // Catch: java.lang.Throwable -> L1c
            r3.f36852l = r4     // Catch: java.lang.Throwable -> L1c
            t.o1 r4 = r3.f36845e     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            t.z0$d r2 = r3.f36852l     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            Z.h.checkNotNull(r4, r1)     // Catch: java.lang.Throwable -> L1c
            t.o1 r4 = r3.f36845e     // Catch: java.lang.Throwable -> L1c
            boolean r4 = r4.d()     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L54
            r3.f()     // Catch: java.lang.Throwable -> L1c
            goto L88
        L54:
            com.google.common.util.concurrent.C r4 = r3.f36853m     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L63
            t.x0 r4 = new t.x0     // Catch: java.lang.Throwable -> L1c
            r4.<init>()     // Catch: java.lang.Throwable -> L1c
            com.google.common.util.concurrent.C r4 = androidx.concurrent.futures.c.getFuture(r4)     // Catch: java.lang.Throwable -> L1c
            r3.f36853m = r4     // Catch: java.lang.Throwable -> L1c
        L63:
            com.google.common.util.concurrent.C r4 = r3.f36853m     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            return r4
        L67:
            t.o1 r4 = r3.f36845e     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "The Opener shouldn't null in state:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            t.z0$d r2 = r3.f36852l     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            Z.h.checkNotNull(r4, r1)     // Catch: java.lang.Throwable -> L1c
            t.o1 r4 = r3.f36845e     // Catch: java.lang.Throwable -> L1c
            r4.d()     // Catch: java.lang.Throwable -> L1c
        L84:
            t.z0$d r4 = t.C6314z0.d.RELEASED     // Catch: java.lang.Throwable -> L1c
            r3.f36852l = r4     // Catch: java.lang.Throwable -> L1c
        L88:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            r4 = 0
            com.google.common.util.concurrent.C r4 = B.f.immediateFuture(r4)
            return r4
        L8f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "release() should not be possible in state: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            t.z0$d r2 = r3.f36852l     // Catch: java.lang.Throwable -> L1c
            r1.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t.C6314z0.release(boolean):com.google.common.util.concurrent.C");
    }

    @Override // t.A0
    public void setSessionConfig(z.C0 c02) {
        synchronized (this.f36841a) {
            try {
                switch (c.f36858a[this.f36852l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f36852l);
                    case 2:
                    case 3:
                    case 4:
                        this.f36847g = c02;
                        break;
                    case 5:
                        this.f36847g = c02;
                        if (c02 != null) {
                            if (!this.f36850j.keySet().containsAll(c02.getSurfaces())) {
                                androidx.camera.core.B0.e("CaptureSession", "Does not have the proper configured lists");
                                return;
                            } else {
                                androidx.camera.core.B0.d("CaptureSession", "Attempting to submit CaptureRequest after setting");
                                i(this.f36847g);
                                break;
                            }
                        } else {
                            return;
                        }
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } finally {
            }
        }
    }

    /* renamed from: t.z0$a */
    class a extends CameraCaptureSession.CaptureCallback {
        a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }
}
