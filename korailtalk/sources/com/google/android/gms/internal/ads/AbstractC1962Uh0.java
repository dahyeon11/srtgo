package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* renamed from: com.google.android.gms.internal.ads.Uh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1962Uh0 implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC1675Nh0 f16705a;

    protected AbstractC1962Uh0(String str, String str2) {
        C1921Th0.zza();
        EnumC1508Jf0 enumC1508Jf0 = EnumC1508Jf0.UNKNOWN;
        C1757Ph0.zza();
        this.f16705a = C1757Ph0.zza;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i8) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        zza(sensorEvent);
    }

    public abstract void zza(SensorEvent sensorEvent);
}
