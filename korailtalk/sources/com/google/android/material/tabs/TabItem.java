package com.google.android.material.tabs;

import J2.l;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.r0;

/* loaded from: classes2.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        r0 r0VarObtainStyledAttributes = r0.obtainStyledAttributes(context, attributeSet, l.TabItem);
        this.text = r0VarObtainStyledAttributes.getText(l.TabItem_android_text);
        this.icon = r0VarObtainStyledAttributes.getDrawable(l.TabItem_android_icon);
        this.customLayout = r0VarObtainStyledAttributes.getResourceId(l.TabItem_android_layout, 0);
        r0VarObtainStyledAttributes.recycle();
    }
}
