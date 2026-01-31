package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import z.InterfaceC6552A;
import z.InterfaceC6553B;
import z.InterfaceC6565N;
import z.InterfaceC6577e0;
import z.InterfaceC6605w;
import z.N0;

/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: d */
    private z.N0 f7644d;

    /* renamed from: e */
    private z.N0 f7645e;

    /* renamed from: f */
    private z.N0 f7646f;

    /* renamed from: g */
    private Size f7647g;

    /* renamed from: h */
    private z.N0 f7648h;

    /* renamed from: i */
    private Rect f7649i;

    /* renamed from: j */
    private InterfaceC6553B f7650j;

    /* renamed from: a */
    private final Set f7641a = new HashSet();

    /* renamed from: b */
    private final Object f7642b = new Object();

    /* renamed from: c */
    private c f7643c = c.INACTIVE;

    /* renamed from: k */
    private z.C0 f7651k = z.C0.defaultEmptySessionConfig();

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7652a;

        static {
            int[] iArr = new int[c.values().length];
            f7652a = iArr;
            try {
                iArr[c.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7652a[c.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public interface b {
        void onAttach(r rVar);

        void onDetach();
    }

    enum c {
        ACTIVE,
        INACTIVE
    }

    public interface d {
        void onUseCaseActive(h1 h1Var);

        void onUseCaseInactive(h1 h1Var);

        void onUseCaseReset(h1 h1Var);

        void onUseCaseUpdated(h1 h1Var);
    }

    protected h1(z.N0 n02) {
        this.f7645e = n02;
        this.f7646f = n02;
    }

    private void a(d dVar) {
        this.f7641a.add(dVar);
    }

    private void o(d dVar) {
        this.f7641a.remove(dVar);
    }

    protected InterfaceC6605w b() {
        synchronized (this.f7642b) {
            try {
                InterfaceC6553B interfaceC6553B = this.f7650j;
                if (interfaceC6553B == null) {
                    return InterfaceC6605w.DEFAULT_EMPTY_INSTANCE;
                }
                return interfaceC6553B.getCameraControlInternal();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected String c() {
        return ((InterfaceC6553B) Z.h.checkNotNull(getCamera(), "No camera attached to use case: " + this)).getCameraInfoInternal().getCameraId();
    }

    protected int d(InterfaceC6553B interfaceC6553B) {
        return interfaceC6553B.getCameraInfoInternal().getSensorRotationDegrees(f());
    }

    protected R0 e() {
        InterfaceC6553B camera = getCamera();
        Size attachedSurfaceResolution = getAttachedSurfaceResolution();
        if (camera == null || attachedSurfaceResolution == null) {
            return null;
        }
        Rect viewPortCropRect = getViewPortCropRect();
        if (viewPortCropRect == null) {
            viewPortCropRect = new Rect(0, 0, attachedSurfaceResolution.getWidth(), attachedSurfaceResolution.getHeight());
        }
        return R0.a(attachedSurfaceResolution, viewPortCropRect, d(camera));
    }

    protected int f() {
        return ((InterfaceC6577e0) this.f7646f).getTargetRotation(0);
    }

    protected boolean g(String str) {
        if (getCamera() == null) {
            return false;
        }
        return Objects.equals(str, c());
    }

    public Size getAttachedSurfaceResolution() {
        return this.f7647g;
    }

    public InterfaceC6553B getCamera() {
        InterfaceC6553B interfaceC6553B;
        synchronized (this.f7642b) {
            interfaceC6553B = this.f7650j;
        }
        return interfaceC6553B;
    }

    public z.N0 getCurrentConfig() {
        return this.f7646f;
    }

    public abstract z.N0 getDefaultConfig(boolean z8, z.O0 o02);

    public int getImageFormat() {
        return this.f7646f.getInputFormat();
    }

    public String getName() {
        return this.f7646f.getTargetName("<UnknownUseCase-" + hashCode() + SimpleComparison.GREATER_THAN_OPERATION);
    }

    public R0 getResolutionInfo() {
        return e();
    }

    public z.C0 getSessionConfig() {
        return this.f7651k;
    }

    public abstract N0.a getUseCaseConfigBuilder(InterfaceC6565N interfaceC6565N);

    public Rect getViewPortCropRect() {
        return this.f7649i;
    }

    protected final void h() {
        this.f7643c = c.ACTIVE;
        notifyState();
    }

    protected final void i() {
        this.f7643c = c.INACTIVE;
        notifyState();
    }

    protected final void j() {
        Iterator it = this.f7641a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onUseCaseReset(this);
        }
    }

    protected final void k() {
        Iterator it = this.f7641a.iterator();
        while (it.hasNext()) {
            ((d) it.next()).onUseCaseUpdated(this);
        }
    }

    protected void l() {
    }

    protected z.N0 m(InterfaceC6552A interfaceC6552A, N0.a aVar) {
        return aVar.getUseCaseConfig();
    }

    public z.N0 mergeConfigs(InterfaceC6552A interfaceC6552A, z.N0 n02, z.N0 n03) {
        z.r0 r0VarCreate;
        if (n03 != null) {
            r0VarCreate = z.r0.from((InterfaceC6565N) n03);
            r0VarCreate.removeOption(C.h.OPTION_TARGET_NAME);
        } else {
            r0VarCreate = z.r0.create();
        }
        for (InterfaceC6565N.a aVar : this.f7645e.listOptions()) {
            r0VarCreate.insertOption(aVar, this.f7645e.getOptionPriority(aVar), this.f7645e.retrieveOption(aVar));
        }
        if (n02 != null) {
            for (InterfaceC6565N.a aVar2 : n02.listOptions()) {
                if (!aVar2.getId().equals(C.h.OPTION_TARGET_NAME.getId())) {
                    r0VarCreate.insertOption(aVar2, n02.getOptionPriority(aVar2), n02.retrieveOption(aVar2));
                }
            }
        }
        if (r0VarCreate.containsOption(InterfaceC6577e0.OPTION_TARGET_RESOLUTION)) {
            InterfaceC6565N.a aVar3 = InterfaceC6577e0.OPTION_TARGET_ASPECT_RATIO;
            if (r0VarCreate.containsOption(aVar3)) {
                r0VarCreate.removeOption(aVar3);
            }
        }
        return m(interfaceC6552A, getUseCaseConfigBuilder(r0VarCreate));
    }

    protected abstract Size n(Size size);

    public final void notifyState() {
        int i8 = a.f7652a[this.f7643c.ordinal()];
        if (i8 == 1) {
            Iterator it = this.f7641a.iterator();
            while (it.hasNext()) {
                ((d) it.next()).onUseCaseInactive(this);
            }
        } else {
            if (i8 != 2) {
                return;
            }
            Iterator it2 = this.f7641a.iterator();
            while (it2.hasNext()) {
                ((d) it2.next()).onUseCaseActive(this);
            }
        }
    }

    public void onAttach(InterfaceC6553B interfaceC6553B, z.N0 n02, z.N0 n03) {
        synchronized (this.f7642b) {
            this.f7650j = interfaceC6553B;
            a(interfaceC6553B);
        }
        this.f7644d = n02;
        this.f7648h = n03;
        z.N0 n0MergeConfigs = mergeConfigs(interfaceC6553B.getCameraInfoInternal(), this.f7644d, this.f7648h);
        this.f7646f = n0MergeConfigs;
        b useCaseEventCallback = n0MergeConfigs.getUseCaseEventCallback(null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onAttach(interfaceC6553B.getCameraInfoInternal());
        }
        onAttached();
    }

    public void onAttached() {
    }

    public void onDetach(InterfaceC6553B interfaceC6553B) {
        onDetached();
        b useCaseEventCallback = this.f7646f.getUseCaseEventCallback(null);
        if (useCaseEventCallback != null) {
            useCaseEventCallback.onDetach();
        }
        synchronized (this.f7642b) {
            Z.h.checkArgument(interfaceC6553B == this.f7650j);
            o(this.f7650j);
            this.f7650j = null;
        }
        this.f7647g = null;
        this.f7649i = null;
        this.f7646f = this.f7645e;
        this.f7644d = null;
        this.f7648h = null;
    }

    public void onDetached() {
    }

    public void onStateAttached() {
        l();
    }

    public void onStateDetached() {
    }

    protected boolean p(int i8) {
        int targetRotation = ((InterfaceC6577e0) getCurrentConfig()).getTargetRotation(-1);
        if (targetRotation != -1 && targetRotation == i8) {
            return false;
        }
        N0.a useCaseConfigBuilder = getUseCaseConfigBuilder(this.f7645e);
        G.b.updateTargetRotationAndRelatedConfigs(useCaseConfigBuilder, i8);
        this.f7645e = useCaseConfigBuilder.getUseCaseConfig();
        InterfaceC6553B camera = getCamera();
        if (camera == null) {
            this.f7646f = this.f7645e;
            return true;
        }
        this.f7646f = mergeConfigs(camera.getCameraInfoInternal(), this.f7644d, this.f7648h);
        return true;
    }

    protected void q(z.C0 c02) {
        this.f7651k = c02;
        for (z.S s8 : c02.getSurfaces()) {
            if (s8.getContainerClass() == null) {
                s8.setContainerClass(getClass());
            }
        }
    }

    public void setSensorToBufferTransformMatrix(Matrix matrix) {
    }

    public void setViewPortCropRect(Rect rect) {
        this.f7649i = rect;
    }

    public void updateSuggestedResolution(Size size) {
        this.f7647g = n(size);
    }
}
