package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import h.AbstractC5572j;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C0856p extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7217b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f7218a;

    public C0856p(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet, i8, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i8, int i9) {
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, AbstractC5572j.PopupWindow, i8, i9);
        if (r0VarObtainStyledAttributes.hasValue(AbstractC5572j.PopupWindow_overlapAnchor)) {
            b(r0VarObtainStyledAttributes.getBoolean(AbstractC5572j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(r0VarObtainStyledAttributes.getDrawable(AbstractC5572j.PopupWindow_android_popupBackground));
        r0VarObtainStyledAttributes.recycle();
    }

    private void b(boolean z8) {
        if (f7217b) {
            this.f7218a = z8;
        } else {
            androidx.core.widget.g.setOverlapAnchor(this, z8);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9) {
        if (f7217b && this.f7218a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i8, int i9, int i10, int i11) {
        if (f7217b && this.f7218a) {
            i9 -= view.getHeight();
        }
        super.update(view, i8, i9, i10, i11);
    }

    public C0856p(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        a(context, attributeSet, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i8, int i9, int i10) {
        if (f7217b && this.f7218a) {
            i9 -= view.getHeight();
        }
        super.showAsDropDown(view, i8, i9, i10);
    }
}
