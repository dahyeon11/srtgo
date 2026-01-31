package z;

import android.graphics.Rect;
import androidx.camera.core.InterfaceC0892n;
import java.util.Collections;
import java.util.List;

/* renamed from: z.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC6605w extends InterfaceC0892n {
    public static final InterfaceC6605w DEFAULT_EMPTY_INSTANCE = new a();

    /* renamed from: z.w$c */
    public interface c {
        void onCameraControlCaptureRequests(List<C6562K> list);

        void onCameraControlUpdateSessionConfig();
    }

    void addInteropConfig(InterfaceC6565N interfaceC6565N);

    @Override // androidx.camera.core.InterfaceC0892n
    /* synthetic */ com.google.common.util.concurrent.C cancelFocusAndMetering();

    void clearInteropConfig();

    @Override // androidx.camera.core.InterfaceC0892n
    /* synthetic */ com.google.common.util.concurrent.C enableTorch(boolean z8);

    int getFlashMode();

    InterfaceC6565N getInteropConfig();

    Rect getSensorRect();

    C0 getSessionConfig();

    @Override // androidx.camera.core.InterfaceC0892n
    /* synthetic */ com.google.common.util.concurrent.C setExposureCompensationIndex(int i8);

    void setFlashMode(int i8);

    @Override // androidx.camera.core.InterfaceC0892n
    /* synthetic */ com.google.common.util.concurrent.C setLinearZoom(float f8);

    @Override // androidx.camera.core.InterfaceC0892n
    /* synthetic */ com.google.common.util.concurrent.C setZoomRatio(float f8);

    @Override // androidx.camera.core.InterfaceC0892n
    /* synthetic */ com.google.common.util.concurrent.C startFocusAndMetering(androidx.camera.core.J j8);

    com.google.common.util.concurrent.C submitStillCaptureRequests(List<C6562K> list, int i8, int i9);

    /* renamed from: z.w$b */
    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private C6588k f37847a;

        public b(C6588k c6588k) {
            this.f37847a = c6588k;
        }

        public C6588k getCameraCaptureFailure() {
            return this.f37847a;
        }

        public b(C6588k c6588k, Throwable th) {
            super(th);
            this.f37847a = c6588k;
        }
    }

    /* renamed from: z.w$a */
    class a implements InterfaceC6605w {
        a() {
        }

        @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
        public com.google.common.util.concurrent.C cancelFocusAndMetering() {
            return B.f.immediateFuture(null);
        }

        @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
        public com.google.common.util.concurrent.C enableTorch(boolean z8) {
            return B.f.immediateFuture(null);
        }

        @Override // z.InterfaceC6605w
        public int getFlashMode() {
            return 2;
        }

        @Override // z.InterfaceC6605w
        public InterfaceC6565N getInteropConfig() {
            return null;
        }

        @Override // z.InterfaceC6605w
        public Rect getSensorRect() {
            return new Rect();
        }

        @Override // z.InterfaceC6605w
        public C0 getSessionConfig() {
            return C0.defaultEmptySessionConfig();
        }

        @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
        public com.google.common.util.concurrent.C setExposureCompensationIndex(int i8) {
            return B.f.immediateFuture(0);
        }

        @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
        public com.google.common.util.concurrent.C setLinearZoom(float f8) {
            return B.f.immediateFuture(null);
        }

        @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
        public com.google.common.util.concurrent.C setZoomRatio(float f8) {
            return B.f.immediateFuture(null);
        }

        @Override // z.InterfaceC6605w, androidx.camera.core.InterfaceC0892n
        public com.google.common.util.concurrent.C startFocusAndMetering(androidx.camera.core.J j8) {
            return B.f.immediateFuture(androidx.camera.core.K.emptyInstance());
        }

        @Override // z.InterfaceC6605w
        public com.google.common.util.concurrent.C submitStillCaptureRequests(List<C6562K> list, int i8, int i9) {
            return B.f.immediateFuture(Collections.emptyList());
        }

        @Override // z.InterfaceC6605w
        public void clearInteropConfig() {
        }

        @Override // z.InterfaceC6605w
        public void addInteropConfig(InterfaceC6565N interfaceC6565N) {
        }

        @Override // z.InterfaceC6605w
        public void setFlashMode(int i8) {
        }
    }
}
