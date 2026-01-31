package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public final class QS extends AbstractC1962Uh0 {

    /* renamed from: b, reason: collision with root package name */
    private final Context f15778b;

    /* renamed from: c, reason: collision with root package name */
    private SensorManager f15779c;

    /* renamed from: d, reason: collision with root package name */
    private Sensor f15780d;

    /* renamed from: e, reason: collision with root package name */
    private long f15781e;

    /* renamed from: f, reason: collision with root package name */
    private int f15782f;

    /* renamed from: g, reason: collision with root package name */
    private PS f15783g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f15784h;

    QS(Context context) {
        super("ShakeDetector", "ads");
        this.f15778b = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1962Uh0
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziY)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f8 = fArr[0] / 9.80665f;
            float f9 = fArr[1] / 9.80665f;
            float f10 = fArr[2] / 9.80665f;
            if (((float) Math.sqrt((f8 * f8) + (f9 * f9) + (f10 * f10))) >= ((Float) H1.C.zzc().zza(AbstractC4439th.zziZ)).floatValue()) {
                long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
                if (this.f15781e + ((Integer) H1.C.zzc().zza(AbstractC4439th.zzja)).intValue() <= jCurrentTimeMillis) {
                    if (this.f15781e + ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjb)).intValue() < jCurrentTimeMillis) {
                        this.f15782f = 0;
                    }
                    AbstractC0667v0.zza("Shake detected.");
                    this.f15781e = jCurrentTimeMillis;
                    int i8 = this.f15782f + 1;
                    this.f15782f = i8;
                    PS ps = this.f15783g;
                    if (ps != null) {
                        if (i8 == ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjc)).intValue()) {
                            C3734nS c3734nS = (C3734nS) ps;
                            c3734nS.zzh(new BinderC3278jS(c3734nS), EnumC3506lS.GESTURE);
                        }
                    }
                }
            }
        }
    }

    public final void zzb() {
        synchronized (this) {
            try {
                if (this.f15784h) {
                    SensorManager sensorManager = this.f15779c;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.f15780d);
                        AbstractC0667v0.zza("Stopped listening for shake gestures.");
                    }
                    this.f15784h = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zziY)).booleanValue()) {
                    if (this.f15779c == null) {
                        SensorManager sensorManager2 = (SensorManager) this.f15778b.getSystemService("sensor");
                        this.f15779c = sensorManager2;
                        if (sensorManager2 == null) {
                            L1.n.zzj("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.f15780d = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.f15784h && (sensorManager = this.f15779c) != null && (sensor = this.f15780d) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f15781e = G1.u.zzB().currentTimeMillis() - ((Integer) H1.C.zzc().zza(AbstractC4439th.zzja)).intValue();
                        this.f15784h = true;
                        AbstractC0667v0.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(PS ps) {
        this.f15783g = ps;
    }
}
