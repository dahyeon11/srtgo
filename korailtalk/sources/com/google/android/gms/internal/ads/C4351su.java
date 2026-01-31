package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.android.gms.internal.ads.su */
/* loaded from: classes2.dex */
public final class C4351su extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC4124qu {

    /* renamed from: B */
    private static final float[] f22703B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private volatile boolean f22704A;

    /* renamed from: a */
    private final C4237ru f22705a;

    /* renamed from: b */
    private final float[] f22706b;

    /* renamed from: c */
    private final float[] f22707c;

    /* renamed from: d */
    private final float[] f22708d;

    /* renamed from: e */
    private final float[] f22709e;

    /* renamed from: f */
    private final float[] f22710f;

    /* renamed from: g */
    private final float[] f22711g;

    /* renamed from: h */
    private final float[] f22712h;

    /* renamed from: i */
    private float f22713i;

    /* renamed from: j */
    private float f22714j;

    /* renamed from: k */
    private float f22715k;

    /* renamed from: l */
    private int f22716l;

    /* renamed from: m */
    private int f22717m;

    /* renamed from: n */
    private SurfaceTexture f22718n;

    /* renamed from: o */
    private SurfaceTexture f22719o;

    /* renamed from: p */
    private int f22720p;

    /* renamed from: q */
    private int f22721q;

    /* renamed from: r */
    private int f22722r;

    /* renamed from: s */
    private final FloatBuffer f22723s;

    /* renamed from: t */
    private final CountDownLatch f22724t;

    /* renamed from: u */
    private final Object f22725u;

    /* renamed from: v */
    private EGL10 f22726v;

    /* renamed from: w */
    private EGLDisplay f22727w;

    /* renamed from: x */
    private EGLContext f22728x;

    /* renamed from: y */
    private EGLSurface f22729y;

    /* renamed from: z */
    private volatile boolean f22730z;

    public C4351su(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f22703B;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f22723s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f22706b = new float[9];
        this.f22707c = new float[9];
        this.f22708d = new float[9];
        this.f22709e = new float[9];
        this.f22710f = new float[9];
        this.f22711g = new float[9];
        this.f22712h = new float[9];
        this.f22713i = Float.NaN;
        C4237ru c4237ru = new C4237ru(context);
        this.f22705a = c4237ru;
        c4237ru.a(this);
        this.f22724t = new CountDownLatch(1);
        this.f22725u = new Object();
    }

    private static final void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    private static final void c(float[] fArr, float[] fArr2, float[] fArr3) {
        float f8 = fArr2[0] * fArr3[0];
        float f9 = fArr2[1];
        float f10 = fArr3[3];
        float f11 = fArr2[2];
        float f12 = fArr3[6];
        fArr[0] = f8 + (f9 * f10) + (f11 * f12);
        float f13 = fArr2[0];
        float f14 = fArr3[1] * f13;
        float f15 = fArr3[4];
        float f16 = fArr3[7];
        fArr[1] = f14 + (f9 * f15) + (f11 * f16);
        float f17 = f13 * fArr3[2];
        float f18 = fArr2[1];
        float f19 = fArr3[5];
        float f20 = fArr3[8];
        fArr[2] = f17 + (f18 * f19) + (f11 * f20);
        float f21 = fArr2[3];
        float f22 = fArr3[0];
        float f23 = fArr2[4];
        float f24 = fArr2[5];
        fArr[3] = (f21 * f22) + (f10 * f23) + (f24 * f12);
        float f25 = fArr2[3];
        float f26 = fArr3[1];
        fArr[4] = (f25 * f26) + (f23 * f15) + (f24 * f16);
        float f27 = fArr3[2];
        fArr[5] = (f25 * f27) + (fArr2[4] * f19) + (f24 * f20);
        float f28 = fArr2[6] * f22;
        float f29 = fArr2[7];
        float f30 = fArr3[3] * f29;
        float f31 = fArr2[8];
        fArr[6] = f28 + f30 + (f12 * f31);
        float f32 = fArr2[6];
        fArr[7] = (f26 * f32) + (f29 * fArr3[4]) + (f16 * f31);
        fArr[8] = (f32 * f27) + (fArr2[7] * fArr3[5]) + (f31 * f20);
    }

    private static final void d(float[] fArr, float f8) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d9 = f8;
        fArr[4] = (float) Math.cos(d9);
        fArr[5] = (float) (-Math.sin(d9));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d9);
        fArr[8] = (float) Math.cos(d9);
    }

    private static final void e(float[] fArr, float f8) {
        double d9 = f8;
        fArr[0] = (float) Math.cos(d9);
        fArr[1] = (float) (-Math.sin(d9));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d9);
        fArr[4] = (float) Math.cos(d9);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    private static final int f(int i8, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i8);
        b("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            b("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            b("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            b("getShaderiv");
            if (iArr[0] == 0) {
                Log.e("SphericalVideoRenderer", "Could not compile shader " + i8 + ":");
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                b("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }

    final boolean a() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f22729y;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f22726v.eglDestroySurface(this.f22727w, this.f22729y) | this.f22726v.eglMakeCurrent(this.f22727w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f22729y = null;
        }
        EGLContext eGLContext = this.f22728x;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f22726v.eglDestroyContext(this.f22727w, eGLContext);
            this.f22728x = null;
        }
        EGLDisplay eGLDisplay = this.f22727w;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f22726v.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.f22727w = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f22722r++;
        synchronized (this.f22725u) {
            this.f22725u.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00bc  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C4351su.run():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4124qu
    public final void zza() {
        synchronized (this.f22725u) {
            this.f22725u.notifyAll();
        }
    }

    public final SurfaceTexture zzb() throws InterruptedException {
        if (this.f22719o == null) {
            return null;
        }
        try {
            this.f22724t.await();
        } catch (InterruptedException unused) {
        }
        return this.f22718n;
    }

    public final void zzc(int i8, int i9) {
        synchronized (this.f22725u) {
            this.f22717m = i8;
            this.f22716l = i9;
            this.f22730z = true;
            this.f22725u.notifyAll();
        }
    }

    public final void zzd(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f22717m = i8;
        this.f22716l = i9;
        this.f22719o = surfaceTexture;
    }

    public final void zze() {
        synchronized (this.f22725u) {
            this.f22704A = true;
            this.f22719o = null;
            this.f22725u.notifyAll();
        }
    }

    public final void zzf(float f8, float f9) {
        int i8 = this.f22717m;
        int i9 = this.f22716l;
        if (i8 <= i9) {
            i8 = i9;
        }
        float f10 = i8;
        this.f22714j -= (f8 * 1.7453293f) / f10;
        float f11 = this.f22715k - ((f9 * 1.7453293f) / f10);
        this.f22715k = f11;
        if (f11 < -1.5707964f) {
            this.f22715k = -1.5707964f;
            f11 = -1.5707964f;
        }
        if (f11 > 1.5707964f) {
            this.f22715k = 1.5707964f;
        }
    }
}
