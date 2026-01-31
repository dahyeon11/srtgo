package com.korail.talk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

/* loaded from: classes.dex */
public class ExtraProductGrid extends GridView {
    public ExtraProductGrid(Context context) {
        super(context);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public ExtraProductGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtraProductGrid(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
