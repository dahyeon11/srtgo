package G1;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
final class o implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f1414a;

    o(t tVar) {
        this.f1414a = tVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        t tVar = this.f1414a;
        if (tVar.f1430h == null) {
            return false;
        }
        tVar.f1430h.zzd(motionEvent);
        return false;
    }
}
