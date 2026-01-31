package z;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import z.C6562K;

/* loaded from: classes.dex */
public final class C0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f37689a;

    /* renamed from: b, reason: collision with root package name */
    private final List f37690b;

    /* renamed from: c, reason: collision with root package name */
    private final List f37691c;

    /* renamed from: d, reason: collision with root package name */
    private final List f37692d;

    /* renamed from: e, reason: collision with root package name */
    private final List f37693e;

    /* renamed from: f, reason: collision with root package name */
    private final C6562K f37694f;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final Set f37695a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        final C6562K.a f37696b = new C6562K.a();

        /* renamed from: c, reason: collision with root package name */
        final List f37697c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final List f37698d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        final List f37699e = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        final List f37700f = new ArrayList();

        a() {
        }
    }

    public static class b extends a {
        public static b createFrom(N0 n02) {
            d sessionOptionUnpacker = n02.getSessionOptionUnpacker(null);
            if (sessionOptionUnpacker != null) {
                b bVar = new b();
                sessionOptionUnpacker.unpack(n02, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + n02.getTargetName(n02.toString()));
        }

        public void addAllCameraCaptureCallbacks(Collection<AbstractC6586j> collection) {
            for (AbstractC6586j abstractC6586j : collection) {
                this.f37696b.addCameraCaptureCallback(abstractC6586j);
                if (!this.f37700f.contains(abstractC6586j)) {
                    this.f37700f.add(abstractC6586j);
                }
            }
        }

        public void addAllDeviceStateCallbacks(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                addDeviceStateCallback(it.next());
            }
        }

        public void addAllRepeatingCameraCaptureCallbacks(Collection<AbstractC6586j> collection) {
            this.f37696b.addAllCameraCaptureCallbacks(collection);
        }

        public void addAllSessionStateCallbacks(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                addSessionStateCallback(it.next());
            }
        }

        public void addCameraCaptureCallback(AbstractC6586j abstractC6586j) {
            this.f37696b.addCameraCaptureCallback(abstractC6586j);
            if (this.f37700f.contains(abstractC6586j)) {
                return;
            }
            this.f37700f.add(abstractC6586j);
        }

        public void addDeviceStateCallback(CameraDevice.StateCallback stateCallback) {
            if (this.f37697c.contains(stateCallback)) {
                return;
            }
            this.f37697c.add(stateCallback);
        }

        public void addErrorListener(c cVar) {
            this.f37699e.add(cVar);
        }

        public void addImplementationOptions(InterfaceC6565N interfaceC6565N) {
            this.f37696b.addImplementationOptions(interfaceC6565N);
        }

        public void addNonRepeatingSurface(S s8) {
            this.f37695a.add(s8);
        }

        public void addRepeatingCameraCaptureCallback(AbstractC6586j abstractC6586j) {
            this.f37696b.addCameraCaptureCallback(abstractC6586j);
        }

        public void addSessionStateCallback(CameraCaptureSession.StateCallback stateCallback) {
            if (this.f37698d.contains(stateCallback)) {
                return;
            }
            this.f37698d.add(stateCallback);
        }

        public void addSurface(S s8) {
            this.f37695a.add(s8);
            this.f37696b.addSurface(s8);
        }

        public void addTag(String str, Object obj) {
            this.f37696b.addTag(str, obj);
        }

        public C0 build() {
            return new C0(new ArrayList(this.f37695a), this.f37697c, this.f37698d, this.f37700f, this.f37699e, this.f37696b.build());
        }

        public void clearSurfaces() {
            this.f37695a.clear();
            this.f37696b.clearSurfaces();
        }

        public List<AbstractC6586j> getSingleCameraCaptureCallbacks() {
            return Collections.unmodifiableList(this.f37700f);
        }

        public void removeSurface(S s8) {
            this.f37695a.remove(s8);
            this.f37696b.removeSurface(s8);
        }

        public void setImplementationOptions(InterfaceC6565N interfaceC6565N) {
            this.f37696b.setImplementationOptions(interfaceC6565N);
        }

        public void setTemplateType(int i8) {
            this.f37696b.setTemplateType(i8);
        }
    }

    public interface c {
        void onError(C0 c02, e eVar);
    }

    public interface d {
        void unpack(N0 n02, b bVar);
    }

    public enum e {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static final class f extends a {

        /* renamed from: j, reason: collision with root package name */
        private static final List f37702j = Arrays.asList(1, 3);

        /* renamed from: g, reason: collision with root package name */
        private final F.c f37703g = new F.c();

        /* renamed from: h, reason: collision with root package name */
        private boolean f37704h = true;

        /* renamed from: i, reason: collision with root package name */
        private boolean f37705i = false;

        private int a(int i8, int i9) {
            List list = f37702j;
            return list.indexOf(Integer.valueOf(i8)) >= list.indexOf(Integer.valueOf(i9)) ? i8 : i9;
        }

        public void add(C0 c02) {
            C6562K repeatingCaptureConfig = c02.getRepeatingCaptureConfig();
            if (repeatingCaptureConfig.getTemplateType() != -1) {
                this.f37705i = true;
                this.f37696b.setTemplateType(a(repeatingCaptureConfig.getTemplateType(), this.f37696b.getTemplateType()));
            }
            this.f37696b.addAllTags(c02.getRepeatingCaptureConfig().getTagBundle());
            this.f37697c.addAll(c02.getDeviceStateCallbacks());
            this.f37698d.addAll(c02.getSessionStateCallbacks());
            this.f37696b.addAllCameraCaptureCallbacks(c02.getRepeatingCameraCaptureCallbacks());
            this.f37700f.addAll(c02.getSingleCameraCaptureCallbacks());
            this.f37699e.addAll(c02.getErrorListeners());
            this.f37695a.addAll(c02.getSurfaces());
            this.f37696b.getSurfaces().addAll(repeatingCaptureConfig.getSurfaces());
            if (!this.f37695a.containsAll(this.f37696b.getSurfaces())) {
                androidx.camera.core.B0.d("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f37704h = false;
            }
            this.f37696b.addImplementationOptions(repeatingCaptureConfig.getImplementationOptions());
        }

        public C0 build() {
            if (!this.f37704h) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f37695a);
            this.f37703g.sort(arrayList);
            return new C0(arrayList, this.f37697c, this.f37698d, this.f37700f, this.f37699e, this.f37696b.build());
        }

        public void clearSurfaces() {
            this.f37695a.clear();
            this.f37696b.clearSurfaces();
        }

        public boolean isValid() {
            return this.f37705i && this.f37704h;
        }
    }

    C0(List list, List list2, List list3, List list4, List list5, C6562K c6562k) {
        this.f37689a = list;
        this.f37690b = Collections.unmodifiableList(list2);
        this.f37691c = Collections.unmodifiableList(list3);
        this.f37692d = Collections.unmodifiableList(list4);
        this.f37693e = Collections.unmodifiableList(list5);
        this.f37694f = c6562k;
    }

    public static C0 defaultEmptySessionConfig() {
        return new C0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new C6562K.a().build());
    }

    public List<CameraDevice.StateCallback> getDeviceStateCallbacks() {
        return this.f37690b;
    }

    public List<c> getErrorListeners() {
        return this.f37693e;
    }

    public InterfaceC6565N getImplementationOptions() {
        return this.f37694f.getImplementationOptions();
    }

    public List<AbstractC6586j> getRepeatingCameraCaptureCallbacks() {
        return this.f37694f.getCameraCaptureCallbacks();
    }

    public C6562K getRepeatingCaptureConfig() {
        return this.f37694f;
    }

    public List<CameraCaptureSession.StateCallback> getSessionStateCallbacks() {
        return this.f37691c;
    }

    public List<AbstractC6586j> getSingleCameraCaptureCallbacks() {
        return this.f37692d;
    }

    public List<S> getSurfaces() {
        return Collections.unmodifiableList(this.f37689a);
    }

    public int getTemplateType() {
        return this.f37694f.getTemplateType();
    }
}
