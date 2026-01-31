package R2;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes2.dex */
public class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f4427a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4428b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4429c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4430d;

    public a(Dialog dialog, Rect rect) {
        this.f4427a = dialog;
        this.f4428b = rect.left;
        this.f4429c = rect.top;
        this.f4430d = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f4428b + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f4429c + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i8 = this.f4430d;
            motionEventObtain.setLocation((-i8) - 1, (-i8) - 1);
        }
        view.performClick();
        return this.f4427a.onTouchEvent(motionEventObtain);
    }
}
