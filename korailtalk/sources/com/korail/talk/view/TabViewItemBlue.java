package com.korail.talk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.core.content.a;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import z4.N;

/* loaded from: classes.dex */
public class TabViewItemBlue extends TabViewItem {
    public TabViewItemBlue(Context context) {
        super(context);
        c();
    }

    private void c() {
        d();
    }

    private void d() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(17);
        setTextSize(1, 18.0f);
        setBackgroundResource(AbstractC5954e.tab_item_blue);
        setTextColor(a.getColorStateList(getContext(), AbstractC5953d.tab_item_text_color_blue));
        setPadding(0, N.dpToPx(14.0f), 0, N.dpToPx(14.0f));
    }

    public TabViewItemBlue(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public TabViewItemBlue(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        c();
    }
}
