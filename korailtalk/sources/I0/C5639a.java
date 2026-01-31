package i0;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: i0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5639a extends View {
    @Deprecated
    public C5639a(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    private static int a(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? i8 : size : Math.min(i8, size);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(a(getSuggestedMinimumWidth(), i8), a(getSuggestedMinimumHeight(), i9));
    }

    @Deprecated
    public C5639a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public C5639a(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    @Deprecated
    public void draw(Canvas canvas) {
    }
}
