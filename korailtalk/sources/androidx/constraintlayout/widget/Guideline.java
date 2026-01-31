package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {
    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.guideBegin = i8;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.guideEnd = i8;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.guidePercent = f8;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8);
        super.setVisibility(8);
    }
}
