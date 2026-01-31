package K3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;

/* loaded from: classes2.dex */
public final class b implements SensorEventListener {

    /* renamed from: a */
    private k4.i f2878a;

    /* renamed from: b */
    private k4.k f2879b;

    /* renamed from: c */
    private Sensor f2880c;

    /* renamed from: d */
    private Context f2881d;

    /* renamed from: e */
    private Handler f2882e = new Handler();

    public b(Context context, k4.i iVar, k4.k kVar) {
        this.f2881d = context;
        this.f2878a = iVar;
        this.f2879b = kVar;
    }

    public /* synthetic */ void b(boolean z8) {
        this.f2878a.setTorch(z8);
    }

    private void c(final boolean z8) {
        this.f2882e.post(new Runnable() { // from class: K3.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2876a.b(z8);
            }
        });
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float f8 = sensorEvent.values[0];
        if (this.f2878a != null) {
            if (f8 <= 45.0f) {
                c(true);
            } else if (f8 >= 450.0f) {
                c(false);
            }
        }
    }

    public void start() {
        if (this.f2879b.isAutoTorchEnabled()) {
            SensorManager sensorManager = (SensorManager) this.f2881d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f2880c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    public void stop() {
        if (this.f2880c != null) {
            ((SensorManager) this.f2881d.getSystemService("sensor")).unregisterListener(this);
            this.f2880c = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }
}
