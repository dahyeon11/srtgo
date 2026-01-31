package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Y;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements Y {

    /* renamed from: a, reason: collision with root package name */
    private Y.a f6795a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        Y.a aVar = this.f6795a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.Y
    public void setOnFitSystemWindowsListener(Y.a aVar) {
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
