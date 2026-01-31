package com.korail.talk.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.a;
import androidx.fragment.app.r;
import androidx.viewpager.widget.ViewPager;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import v4.c;
import y6.C6542b;
import z4.N;

/* loaded from: classes.dex */
public class RoundTabLayout extends C6542b implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private View f29336a;

    /* renamed from: b, reason: collision with root package name */
    private ViewPager f29337b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29338c;

    public RoundTabLayout(Context context) {
        super(context);
        this.f29338c = true;
    }

    private void g() {
        setOrientation(0);
    }

    @Override // v4.c.a
    public void onCustomClick(View view, int i8) {
        this.f29336a.setSelected(false);
        this.f29336a = view;
        view.setSelected(true);
        this.f29337b.setCurrentItem(i8);
    }

    public void setEnable(boolean z8) {
        this.f29338c = z8;
    }

    public void setViewPager(ViewPager viewPager) throws Resources.NotFoundException {
        this.f29337b = viewPager;
        r rVar = (r) viewPager.getAdapter();
        int count = rVar.getCount();
        for (int i8 = 0; i8 < count; i8++) {
            CTextView cTextView = new CTextView(getContext());
            cTextView.setTextSize(1, 15.0f);
            cTextView.setText(rVar.getPageTitle(i8));
            cTextView.setTextColor(a.getColorStateList(getContext(), AbstractC5953d.selector_delivery_tab_text));
            cTextView.setOnClickListener(new c(this, i8));
            cTextView.setGravity(17);
            if (1 < count && i8 == 0) {
                cTextView.setBackgroundResource(AbstractC5954e.selector_delivery_tab_left);
            } else if (1 >= count || i8 != count - 1) {
                cTextView.setBackgroundResource(AbstractC5954e.selector_delivery_tab_middle);
                if (!this.f29338c) {
                    cTextView.setEnabled(false);
                    cTextView.setTextColor(a.getColor(getContext(), AbstractC5953d.color_disable));
                }
            } else {
                cTextView.setBackgroundResource(AbstractC5954e.selector_delivery_tab_right);
                if (!this.f29338c) {
                    cTextView.setEnabled(false);
                    cTextView.setTextColor(a.getColor(getContext(), AbstractC5953d.color_disable));
                }
            }
            if (i8 == 0) {
                this.f29336a = cTextView;
                cTextView.setSelected(true);
            }
            cTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, N.dpToPx(42.0f), 1.0f));
            addView(cTextView);
        }
        this.f29337b.setOffscreenPageLimit(count);
    }

    public RoundTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29338c = true;
        g();
    }

    public RoundTabLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f29338c = true;
        g();
    }
}
