package androidx.camera.core;

/* renamed from: androidx.camera.core.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0892n {

    /* renamed from: androidx.camera.core.n$a */
    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    com.google.common.util.concurrent.C cancelFocusAndMetering();

    com.google.common.util.concurrent.C enableTorch(boolean z8);

    com.google.common.util.concurrent.C setExposureCompensationIndex(int i8);

    com.google.common.util.concurrent.C setLinearZoom(float f8);

    com.google.common.util.concurrent.C setZoomRatio(float f8);

    com.google.common.util.concurrent.C startFocusAndMetering(J j8);
}
