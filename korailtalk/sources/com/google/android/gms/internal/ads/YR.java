package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* loaded from: classes2.dex */
public final class YR extends AbstractC1962Uh0 {

    /* renamed from: b, reason: collision with root package name */
    private final SensorManager f17371b;

    /* renamed from: c, reason: collision with root package name */
    private final Sensor f17372c;

    /* renamed from: d, reason: collision with root package name */
    private float f17373d;

    /* renamed from: e, reason: collision with root package name */
    private Float f17374e;

    /* renamed from: f, reason: collision with root package name */
    private long f17375f;

    /* renamed from: g, reason: collision with root package name */
    private int f17376g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17377h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17378i;

    /* renamed from: j, reason: collision with root package name */
    private XR f17379j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f17380k;

    YR(Context context) {
        super("FlickDetector", "ads");
        this.f17373d = 0.0f;
        this.f17374e = Float.valueOf(0.0f);
        this.f17375f = G1.u.zzB().currentTimeMillis();
        this.f17376g = 0;
        this.f17377h = false;
        this.f17378i = false;
        this.f17379j = null;
        this.f17380k = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f17371b = sensorManager;
        if (sensorManager != null) {
            this.f17372c = sensorManager.getDefaultSensor(4);
        } else {
            this.f17372c = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1962Uh0
    public final void zza(SensorEvent sensorEvent) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjd)).booleanValue()) {
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            if (this.f17375f + ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjf)).intValue() < jCurrentTimeMillis) {
                this.f17376g = 0;
                this.f17375f = jCurrentTimeMillis;
                this.f17377h = false;
                this.f17378i = false;
                this.f17373d = this.f17374e.floatValue();
            }
            Float fValueOf = Float.valueOf(this.f17374e.floatValue() + (sensorEvent.values[1] * 4.0f));
            this.f17374e = fValueOf;
            float fFloatValue = fValueOf.floatValue();
            float f8 = this.f17373d;
            AbstractC3414kh abstractC3414kh = AbstractC4439th.zzje;
            if (fFloatValue > f8 + ((Float) H1.C.zzc().zza(abstractC3414kh)).floatValue()) {
                this.f17373d = this.f17374e.floatValue();
                this.f17378i = true;
            } else if (this.f17374e.floatValue() < this.f17373d - ((Float) H1.C.zzc().zza(abstractC3414kh)).floatValue()) {
                this.f17373d = this.f17374e.floatValue();
                this.f17377h = true;
            }
            if (this.f17374e.isInfinite()) {
                this.f17374e = Float.valueOf(0.0f);
                this.f17373d = 0.0f;
            }
            if (this.f17377h && this.f17378i) {
                AbstractC0667v0.zza("Flick detected.");
                this.f17375f = jCurrentTimeMillis;
                int i8 = this.f17376g + 1;
                this.f17376g = i8;
                this.f17377h = false;
                this.f17378i = false;
                XR xr = this.f17379j;
                if (xr != null) {
                    if (i8 == ((Integer) H1.C.zzc().zza(AbstractC4439th.zzjg)).intValue()) {
                        C3734nS c3734nS = (C3734nS) xr;
                        c3734nS.zzh(new BinderC3392kS(c3734nS), EnumC3506lS.GESTURE);
                    }
                }
            }
        }
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (this.f17380k && (sensorManager = this.f17371b) != null && (sensor = this.f17372c) != null) {
                    sensorManager.unregisterListener(this, sensor);
                    this.f17380k = false;
                    AbstractC0667v0.zza("Stopped listening for flick gestures.");
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
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzjd)).booleanValue()) {
                    if (!this.f17380k && (sensorManager = this.f17371b) != null && (sensor = this.f17372c) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f17380k = true;
                        AbstractC0667v0.zza("Listening for flick gestures.");
                    }
                    if (this.f17371b == null || this.f17372c == null) {
                        L1.n.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(XR xr) {
        this.f17379j = xr;
    }
}
