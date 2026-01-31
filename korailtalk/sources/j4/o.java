package j4;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private int f33466a;

    /* renamed from: b, reason: collision with root package name */
    private WindowManager f33467b;

    /* renamed from: c, reason: collision with root package name */
    private OrientationEventListener f33468c;

    /* renamed from: d, reason: collision with root package name */
    private n f33469d;

    class a extends OrientationEventListener {
        a(Context context, int i8) {
            super(context, i8);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i8) {
            int rotation;
            WindowManager windowManager = o.this.f33467b;
            n nVar = o.this.f33469d;
            if (o.this.f33467b == null || nVar == null || (rotation = windowManager.getDefaultDisplay().getRotation()) == o.this.f33466a) {
                return;
            }
            o.this.f33466a = rotation;
            nVar.onRotationChanged(rotation);
        }
    }

    public void listen(Context context, n nVar) {
        stop();
        Context applicationContext = context.getApplicationContext();
        this.f33469d = nVar;
        this.f33467b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f33468c = aVar;
        aVar.enable();
        this.f33466a = this.f33467b.getDefaultDisplay().getRotation();
    }

    public void stop() {
        OrientationEventListener orientationEventListener = this.f33468c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f33468c = null;
        this.f33467b = null;
        this.f33469d = null;
    }
}
