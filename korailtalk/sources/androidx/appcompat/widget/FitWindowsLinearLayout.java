package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Y;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout implements Y {

    /* renamed from: a, reason: collision with root package name */
    private Y.a f6796a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        Y.a aVar = this.f6796a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.Y
    public void setOnFitSystemWindowsListener(Y.a aVar) {
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
