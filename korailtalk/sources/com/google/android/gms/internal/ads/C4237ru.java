package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.ru, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4237ru extends AbstractC1962Uh0 {

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f22526b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f22527c;

    /* renamed from: d, reason: collision with root package name */
    private final Display f22528d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f22529e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f22530f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f22531g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f22532h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC4124qu f22533i;

    C4237ru(Context context) {
        super("OrientationMonitor", "ads");
        this.f22526b = (SensorManager) context.getSystemService("sensor");
        this.f22528d = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        this.f22529e = new float[9];
        this.f22530f = new float[9];
        this.f22527c = new Object();
    }

    final void a(InterfaceC4124qu interfaceC4124qu) {
        this.f22533i = interfaceC4124qu;
    }

    final void b() {
        if (this.f22532h == null) {
            return;
        }
        this.f22526b.unregisterListener(this);
        this.f22532h.post(new RunnableC4010pu(this));
        this.f22532h = null;
    }

    final boolean c(float[] fArr) {
        synchronized (this.f22527c) {
            try {
                float[] fArr2 = this.f22531g;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1962Uh0
    public final void zza(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f22527c) {
            try {
                if (this.f22531g == null) {
                    this.f22531g = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SensorManager.getRotationMatrixFromVector(this.f22529e, fArr);
        int rotation = this.f22528d.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.f22529e, 2, 129, this.f22530f);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.f22529e, 129, 130, this.f22530f);
        } else if (rotation != 3) {
            System.arraycopy(this.f22529e, 0, this.f22530f, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.f22529e, 130, 1, this.f22530f);
        }
        float[] fArr2 = this.f22530f;
        float f8 = fArr2[1];
        fArr2[1] = fArr2[3];
        fArr2[3] = f8;
        float f9 = fArr2[2];
        fArr2[2] = fArr2[6];
        fArr2[6] = f9;
        float f10 = fArr2[5];
        fArr2[5] = fArr2[7];
        fArr2[7] = f10;
        synchronized (this.f22527c) {
            System.arraycopy(this.f22530f, 0, this.f22531g, 0, 9);
        }
        InterfaceC4124qu interfaceC4124qu = this.f22533i;
        if (interfaceC4124qu != null) {
            interfaceC4124qu.zza();
        }
    }

    final void zzc() {
        if (this.f22532h != null) {
            return;
        }
        Sensor defaultSensor = this.f22526b.getDefaultSensor(11);
        if (defaultSensor == null) {
            L1.n.zzg("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        HandlerC1634Mh0 handlerC1634Mh0 = new HandlerC1634Mh0(handlerThread.getLooper());
        this.f22532h = handlerC1634Mh0;
        if (this.f22526b.registerListener(this, defaultSensor, 0, handlerC1634Mh0)) {
            return;
        }
        L1.n.zzg("SensorManager.registerListener failed.");
        b();
    }
}
