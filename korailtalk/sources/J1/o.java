package J1;

import K1.C0666v;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* loaded from: classes.dex */
final class o extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    final C0666v f2545a;

    /* renamed from: b, reason: collision with root package name */
    boolean f2546b;

    public o(Context context, String str, String str2, String str3) {
        super(context);
        C0666v c0666v = new C0666v(context, str);
        this.f2545a = c0666v;
        c0666v.zzo(str2);
        c0666v.zzn(str3);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2546b) {
            return false;
        }
        this.f2545a.zzm(motionEvent);
        return false;
    }
}
