package com.korail.talk.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import z4.C6630d;

/* loaded from: classes.dex */
public class TabView extends LinearLayout implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private a f29339a;

    public interface a {
        void onTabItemSelectedChanged(View view);
    }

    public TabView(Context context) {
        super(context);
    }

    private void a() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt instanceof TabViewItem) {
                childAt.setOnClickListener(this);
            }
        }
    }

    private View getSelectedTabItem() {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if ((childAt instanceof TabViewItem) && childAt.isSelected()) {
                return childAt;
            }
        }
        return null;
    }

    public int getSelectedTabId() {
        return getSelectedTabItem().getId();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.isSelected()) {
            return;
        }
        View selectedTabItem = getSelectedTabItem();
        if (C6630d.isNull(selectedTabItem)) {
            return;
        }
        selectedTabItem.setSelected(false);
        view.setSelected(true);
        if (C6630d.isNull(this.f29339a)) {
            return;
        }
        this.f29339a.onTabItemSelectedChanged(view);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        a();
    }

    public void setSelectedTabItem(int i8, boolean z8) {
        if (getChildCount() > 0) {
            findViewById(i8).setSelected(z8);
        }
    }

    public void setTabItemOnSelectedChangeListener(a aVar) {
        this.f29339a = aVar;
    }

    public TabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TabView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
