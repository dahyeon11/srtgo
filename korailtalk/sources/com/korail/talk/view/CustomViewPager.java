package com.korail.talk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes.dex */
public class CustomViewPager extends ViewPager {

    /* renamed from: l0, reason: collision with root package name */
    private boolean f29335l0;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29335l0 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f29335l0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f29335l0) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setSwipeEnabled(boolean z8) {
        this.f29335l0 = z8;
    }
}
