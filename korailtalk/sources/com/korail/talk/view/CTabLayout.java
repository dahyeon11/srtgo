package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public class CTabLayout extends TabLayout {
    public CTabLayout(Context context) {
        super(context);
    }

    @Override // com.google.android.material.tabs.TabLayout
    public void setupWithViewPager(ViewPager viewPager) {
        super.setupWithViewPager(viewPager);
        a.setFont(getContext(), this);
    }

    public CTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CTabLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
