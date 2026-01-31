package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g {
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;

    /* renamed from: a, reason: collision with root package name */
    private final c f37191a;

    private static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        private final List f37194a;

        /* renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f37195b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f37196c;

        /* renamed from: d, reason: collision with root package name */
        private int f37197d;

        /* renamed from: e, reason: collision with root package name */
        private C6422a f37198e = null;

        /* renamed from: f, reason: collision with root package name */
        private CaptureRequest f37199f = null;

        b(int i8, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f37197d = i8;
            this.f37194a = Collections.unmodifiableList(new ArrayList(list));
            this.f37195b = stateCallback;
            this.f37196c = executor;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f37198e, bVar.f37198e) && this.f37197d == bVar.f37197d && this.f37194a.size() == bVar.f37194a.size()) {
                    for (int i8 = 0; i8 < this.f37194a.size(); i8++) {
                        if (!((v.b) this.f37194a.get(i8)).equals(bVar.f37194a.get(i8))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // v.g.c
        public Executor getExecutor() {
            return this.f37196c;
        }

        @Override // v.g.c
        public C6422a getInputConfiguration() {
            return this.f37198e;
        }

        @Override // v.g.c
        public List<v.b> getOutputConfigurations() {
            return this.f37194a;
        }

        @Override // v.g.c
        public Object getSessionConfiguration() {
            return null;
        }

        @Override // v.g.c
        public CaptureRequest getSessionParameters() {
            return this.f37199f;
        }

        @Override // v.g.c
        public int getSessionType() {
            return this.f37197d;
        }

        @Override // v.g.c
        public CameraCaptureSession.StateCallback getStateCallback() {
            return this.f37195b;
        }

        public int hashCode() {
            int iHashCode = this.f37194a.hashCode() ^ 31;
            int i8 = (iHashCode << 5) - iHashCode;
            C6422a c6422a = this.f37198e;
            int iHashCode2 = (c6422a == null ? 0 : c6422a.hashCode()) ^ i8;
            return this.f37197d ^ ((iHashCode2 << 5) - iHashCode2);
        }

        @Override // v.g.c
        public void setInputConfiguration(C6422a c6422a) {
            if (this.f37197d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f37198e = c6422a;
        }

        @Override // v.g.c
        public void setSessionParameters(CaptureRequest captureRequest) {
            this.f37199f = captureRequest;
        }
    }

    private interface c {
        Executor getExecutor();

        C6422a getInputConfiguration();

        List<v.b> getOutputConfigurations();

        Object getSessionConfiguration();

        CaptureRequest getSessionParameters();

        int getSessionType();

        CameraCaptureSession.StateCallback getStateCallback();

        void setInputConfiguration(C6422a c6422a);

        void setSessionParameters(CaptureRequest captureRequest);
    }

    public g(int i8, List<v.b> list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f37191a = new b(i8, list, executor, stateCallback);
        } else {
            this.f37191a = new a(i8, list, executor, stateCallback);
        }
    }

    static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(v.b.wrap((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public static List<OutputConfiguration> transformFromCompat(List<v.b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<v.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) it.next().unwrap());
        }
        return arrayList;
    }

    public static g wrap(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 28) {
            return new g(new a(obj));
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f37191a.equals(((g) obj).f37191a);
        }
        return false;
    }

    public Executor getExecutor() {
        return this.f37191a.getExecutor();
    }

    public C6422a getInputConfiguration() {
        return this.f37191a.getInputConfiguration();
    }

    public List<v.b> getOutputConfigurations() {
        return this.f37191a.getOutputConfigurations();
    }

    public CaptureRequest getSessionParameters() {
        return this.f37191a.getSessionParameters();
    }

    public int getSessionType() {
        return this.f37191a.getSessionType();
    }

    public CameraCaptureSession.StateCallback getStateCallback() {
        return this.f37191a.getStateCallback();
    }

    public int hashCode() {
        return this.f37191a.hashCode();
    }

    public void setInputConfiguration(C6422a c6422a) {
        this.f37191a.setInputConfiguration(c6422a);
    }

    public void setSessionParameters(CaptureRequest captureRequest) {
        this.f37191a.setSessionParameters(captureRequest);
    }

    public Object unwrap() {
        return this.f37191a.getSessionConfiguration();
    }

    private static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f37192a;

        /* renamed from: b, reason: collision with root package name */
        private final List f37193b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f37192a = sessionConfiguration;
            this.f37193b = Collections.unmodifiableList(g.a(sessionConfiguration.getOutputConfigurations()));
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f37192a, ((a) obj).f37192a);
            }
            return false;
        }

        @Override // v.g.c
        public Executor getExecutor() {
            return this.f37192a.getExecutor();
        }

        @Override // v.g.c
        public C6422a getInputConfiguration() {
            return C6422a.wrap(this.f37192a.getInputConfiguration());
        }

        @Override // v.g.c
        public List<v.b> getOutputConfigurations() {
            return this.f37193b;
        }

        @Override // v.g.c
        public Object getSessionConfiguration() {
            return this.f37192a;
        }

        @Override // v.g.c
        public CaptureRequest getSessionParameters() {
            return this.f37192a.getSessionParameters();
        }

        @Override // v.g.c
        public int getSessionType() {
            return this.f37192a.getSessionType();
        }

        @Override // v.g.c
        public CameraCaptureSession.StateCallback getStateCallback() {
            return this.f37192a.getStateCallback();
        }

        public int hashCode() {
            return this.f37192a.hashCode();
        }

        @Override // v.g.c
        public void setInputConfiguration(C6422a c6422a) {
            this.f37192a.setInputConfiguration((InputConfiguration) c6422a.unwrap());
        }

        @Override // v.g.c
        public void setSessionParameters(CaptureRequest captureRequest) {
            this.f37192a.setSessionParameters(captureRequest);
        }

        a(int i8, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i8, g.transformFromCompat(list), executor, stateCallback));
        }
    }

    private g(c cVar) {
        this.f37191a = cVar;
    }
}
