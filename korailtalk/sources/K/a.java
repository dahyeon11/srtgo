package K;

import android.content.Context;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Size;
import android.view.Surface;
import androidx.camera.extensions.impl.advanced.Camera2OutputConfigImpl;
import androidx.camera.extensions.impl.advanced.Camera2SessionConfigImpl;
import androidx.camera.extensions.impl.advanced.ImageProcessorImpl;
import androidx.camera.extensions.impl.advanced.ImageReferenceImpl;
import androidx.camera.extensions.impl.advanced.OutputSurfaceImpl;
import androidx.camera.extensions.impl.advanced.RequestProcessorImpl;
import androidx.camera.extensions.impl.advanced.SessionProcessorImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.AbstractC6202a;
import s.C6203b;
import y.l;
import z.B0;
import z.C6588k;
import z.D0;
import z.InterfaceC6565N;
import z.InterfaceC6600q;
import z.w0;

/* loaded from: classes.dex */
public class a extends o {

    /* renamed from: f, reason: collision with root package name */
    private final SessionProcessorImpl f2678f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f2679g;

    /* renamed from: K.a$a, reason: collision with other inner class name */
    private static class C0050a implements B0.a {

        /* renamed from: a, reason: collision with root package name */
        private final RequestProcessorImpl.Callback f2680a;

        C0050a(RequestProcessorImpl.Callback callback) {
            this.f2680a = callback;
        }

        private RequestProcessorImpl.Request a(B0.b bVar) {
            Z.h.checkArgument(bVar instanceof e);
            return ((e) bVar).getImplRequest();
        }

        @Override // z.B0.a
        public void onCaptureBufferLost(B0.b bVar, long j8, int i8) {
            this.f2680a.onCaptureBufferLost(a(bVar), j8, i8);
        }

        @Override // z.B0.a
        public void onCaptureCompleted(B0.b bVar, InterfaceC6600q interfaceC6600q) {
            CaptureResult captureResult = AbstractC6202a.getCaptureResult(interfaceC6600q);
            Z.h.checkArgument(captureResult instanceof TotalCaptureResult, "CaptureResult in cameraCaptureResult is not a TotalCaptureResult");
            this.f2680a.onCaptureCompleted(a(bVar), (TotalCaptureResult) captureResult);
        }

        @Override // z.B0.a
        public void onCaptureFailed(B0.b bVar, C6588k c6588k) {
            CaptureFailure captureFailure = AbstractC6202a.getCaptureFailure(c6588k);
            Z.h.checkArgument(captureFailure != null, "CameraCaptureFailure does not contain CaptureFailure.");
            this.f2680a.onCaptureFailed(a(bVar), captureFailure);
        }

        @Override // z.B0.a
        public void onCaptureProgressed(B0.b bVar, InterfaceC6600q interfaceC6600q) {
            CaptureResult captureResult = AbstractC6202a.getCaptureResult(interfaceC6600q);
            Z.h.checkArgument(captureResult != null, "Cannot get CaptureResult from the cameraCaptureResult ");
            this.f2680a.onCaptureProgressed(a(bVar), captureResult);
        }

        @Override // z.B0.a
        public void onCaptureSequenceAborted(int i8) {
            this.f2680a.onCaptureSequenceAborted(i8);
        }

        @Override // z.B0.a
        public void onCaptureSequenceCompleted(int i8, long j8) {
            this.f2680a.onCaptureSequenceCompleted(i8, j8);
        }

        @Override // z.B0.a
        public void onCaptureStarted(B0.b bVar, long j8, long j9) {
            this.f2680a.onCaptureStarted(a(bVar), j8, j9);
        }
    }

    private static class b implements i {

        /* renamed from: a, reason: collision with root package name */
        private final ImageProcessorImpl f2681a;

        b(ImageProcessorImpl imageProcessorImpl) {
            this.f2681a = imageProcessorImpl;
        }

        @Override // K.i
        public void onNextImageAvailable(int i8, long j8, k kVar, String str) {
            this.f2681a.onNextImageAvailable(i8, j8, new c(kVar), str);
        }
    }

    private static class c implements ImageReferenceImpl {

        /* renamed from: a, reason: collision with root package name */
        private final k f2682a;

        c(k kVar) {
            this.f2682a = kVar;
        }

        public boolean decrement() {
            return this.f2682a.decrement();
        }

        public Image get() {
            return this.f2682a.get();
        }

        public boolean increment() {
            return this.f2682a.increment();
        }
    }

    private static class d implements OutputSurfaceImpl {

        /* renamed from: a, reason: collision with root package name */
        private final w0 f2683a;

        d(w0 w0Var) {
            this.f2683a = w0Var;
        }

        public int getImageFormat() {
            return this.f2683a.getImageFormat();
        }

        public Size getSize() {
            return this.f2683a.getSize();
        }

        public Surface getSurface() {
            return this.f2683a.getSurface();
        }
    }

    private static class e implements B0.b {

        /* renamed from: a, reason: collision with root package name */
        private final RequestProcessorImpl.Request f2684a;

        /* renamed from: b, reason: collision with root package name */
        private final List f2685b;

        /* renamed from: c, reason: collision with root package name */
        private final InterfaceC6565N f2686c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2687d;

        e(RequestProcessorImpl.Request request) {
            this.f2684a = request;
            ArrayList arrayList = new ArrayList();
            Iterator it = request.getTargetOutputConfigIds().iterator();
            while (it.hasNext()) {
                arrayList.add((Integer) it.next());
            }
            this.f2685b = arrayList;
            C6203b.a aVar = new C6203b.a();
            for (CaptureRequest.Key key : request.getParameters().keySet()) {
                aVar.setCaptureRequestOption(key, request.getParameters().get(key));
            }
            this.f2686c = aVar.build();
            this.f2687d = request.getTemplateId().intValue();
        }

        public RequestProcessorImpl.Request getImplRequest() {
            return this.f2684a;
        }

        @Override // z.B0.b
        public InterfaceC6565N getParameters() {
            return this.f2686c;
        }

        @Override // z.B0.b
        public List<Integer> getTargetOutputConfigIds() {
            return this.f2685b;
        }

        @Override // z.B0.b
        public int getTemplateId() {
            return this.f2687d;
        }
    }

    private class f implements RequestProcessorImpl {

        /* renamed from: a, reason: collision with root package name */
        private final B0 f2688a;

        f(B0 b02) {
            this.f2688a = b02;
        }

        public void abortCaptures() {
            this.f2688a.abortCaptures();
        }

        public void setImageProcessor(int i8, ImageProcessorImpl imageProcessorImpl) {
            a.this.g(i8, new b(imageProcessorImpl));
        }

        public int setRepeating(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.f2688a.setRepeating(new e(request), new C0050a(callback));
        }

        public void stopRepeating() {
            this.f2688a.stopRepeating();
        }

        public int submit(RequestProcessorImpl.Request request, RequestProcessorImpl.Callback callback) {
            return this.f2688a.submit(new e(request), new C0050a(callback));
        }

        public int submit(List<RequestProcessorImpl.Request> list, RequestProcessorImpl.Callback callback) {
            ArrayList arrayList = new ArrayList();
            Iterator<RequestProcessorImpl.Request> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new e(it.next()));
            }
            return this.f2688a.submit(arrayList, new C0050a(callback));
        }
    }

    private static class g implements SessionProcessorImpl.CaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        private final D0.a f2690a;

        g(D0.a aVar) {
            this.f2690a = aVar;
        }

        public void onCaptureFailed(int i8) {
            this.f2690a.onCaptureFailed(i8);
        }

        public void onCaptureProcessStarted(int i8) {
            this.f2690a.onCaptureProcessStarted(i8);
        }

        public void onCaptureSequenceAborted(int i8) {
            this.f2690a.onCaptureSequenceAborted(i8);
        }

        public void onCaptureSequenceCompleted(int i8) {
            this.f2690a.onCaptureSequenceCompleted(i8);
        }

        public void onCaptureStarted(int i8, long j8) {
            this.f2690a.onCaptureStarted(i8, j8);
        }
    }

    public a(SessionProcessorImpl sessionProcessorImpl, Context context) {
        this.f2678f = sessionProcessorImpl;
        this.f2679g = context;
    }

    private K.g h(Camera2SessionConfigImpl camera2SessionConfigImpl) {
        h hVar = new h();
        Iterator it = camera2SessionConfigImpl.getOutputConfigs().iterator();
        while (it.hasNext()) {
            hVar.a(K.f.b((Camera2OutputConfigImpl) it.next()).a());
        }
        for (CaptureRequest.Key key : camera2SessionConfigImpl.getSessionParameters().keySet()) {
            hVar.b(key, camera2SessionConfigImpl.getSessionParameters().get(key));
        }
        hVar.d(camera2SessionConfigImpl.getSessionTemplateId());
        return hVar.c();
    }

    @Override // K.o, z.D0
    public void abortCapture(int i8) {
        this.f2678f.abortCapture(i8);
    }

    @Override // K.o
    protected void c() {
        this.f2678f.deInitSession();
    }

    @Override // K.o
    protected K.g d(String str, Map map, w0 w0Var, w0 w0Var2, w0 w0Var3) {
        return h(this.f2678f.initSession(str, map, this.f2679g, new d(w0Var), new d(w0Var2), w0Var3 == null ? null : new d(w0Var3)));
    }

    @Override // K.o, z.D0
    public void onCaptureSessionEnd() {
        this.f2678f.onCaptureSessionEnd();
    }

    @Override // K.o, z.D0
    public void onCaptureSessionStart(B0 b02) {
        this.f2678f.onCaptureSessionStart(new f(b02));
    }

    @Override // K.o, z.D0
    public void setParameters(InterfaceC6565N interfaceC6565N) {
        HashMap map = new HashMap();
        y.l lVarBuild = l.a.from(interfaceC6565N).build();
        for (InterfaceC6565N.a aVar : lVarBuild.listOptions()) {
            map.put((CaptureRequest.Key) aVar.getToken(), lVarBuild.retrieveOption(aVar));
        }
        this.f2678f.setParameters(map);
    }

    @Override // K.o, z.D0
    public int startCapture(D0.a aVar) {
        return this.f2678f.startCapture(new g(aVar));
    }

    @Override // K.o, z.D0
    public int startRepeating(D0.a aVar) {
        return this.f2678f.startRepeating(new g(aVar));
    }

    @Override // K.o, z.D0
    public void stopRepeating() {
        this.f2678f.stopRepeating();
    }
}
