package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.ads.q50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4034q50 implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f21849g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    private final Handler f21850a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f21851b = new int[1];

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f21852c;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f21853d;

    /* renamed from: e, reason: collision with root package name */
    private EGLSurface f21854e;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceTexture f21855f;

    public RunnableC4034q50(Handler handler, M40 m40) {
        this.f21850a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f21850a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f21855f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final SurfaceTexture zza() {
        SurfaceTexture surfaceTexture = this.f21855f;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    public final void zzb(int i8) throws R50 {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC4263s60.zza(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        AbstractC4263s60.zza(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.f21852c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f21849g, 0, eGLConfigArr, 0, 1, iArr2, 0);
        AbstractC4263s60.zza(zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f21852c, eGLConfig, EGL14.EGL_NO_CONTEXT, i8 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC4263s60.zza(eGLContextEglCreateContext != null, "eglCreateContext failed");
        this.f21853d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = this.f21852c;
        if (i8 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i8 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC4263s60.zza(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        AbstractC4263s60.zza(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext), "eglMakeCurrent failed");
        this.f21854e = eGLSurfaceEglCreatePbufferSurface;
        GLES20.glGenTextures(1, this.f21851b, 0);
        StringBuilder sb = new StringBuilder();
        boolean z8 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z8) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z8 = true;
        }
        if (z8) {
            throw new R50(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f21851b[0]);
        this.f21855f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void zzc() {
        this.f21850a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f21855f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f21851b, 0);
            }
            EGLDisplay eGLDisplay = this.f21852c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f21852c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f21854e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f21852c, this.f21854e);
            }
            EGLContext eGLContext = this.f21853d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f21852c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f21852c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f21852c);
            }
            this.f21852c = null;
            this.f21853d = null;
            this.f21854e = null;
            this.f21855f = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f21852c;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f21852c;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f21854e;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f21852c, this.f21854e);
            }
            EGLContext eGLContext2 = this.f21853d;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f21852c, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f21852c;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f21852c);
            }
            this.f21852c = null;
            this.f21853d = null;
            this.f21854e = null;
            this.f21855f = null;
            throw th;
        }
    }
}
