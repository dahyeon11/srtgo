package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import java.util.Calendar;

/* loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f24651a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24652b;

    class a extends C0923a {
        a() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setCollectionInfo(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private void a(int i8, Rect rect) {
        if (i8 == 33) {
            setSelection(getAdapter().e());
        } else if (i8 == 130) {
            setSelection(getAdapter().b());
        } else {
            super.onFocusChanged(true, i8, rect);
        }
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m adapter = getAdapter();
        adapter.getClass();
        adapter.getItem(adapter.b());
        adapter.getItem(adapter.e());
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        if (z8) {
            a(i8, rect);
        } else {
            super.onFocusChanged(false, i8, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (!super.onKeyDown(i8, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i8) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i8, int i9) {
        if (!this.f24652b) {
            super.onMeasure(i8, i9);
            return;
        }
        super.onMeasure(i8, View.MeasureSpec.makeMeasureSpec(AbstractC0985p0.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i8) {
        if (i8 < getAdapter().b()) {
            super.setSelection(getAdapter().b());
        } else {
            super.setSelection(i8);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof m)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), m.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f24651a = s.i();
        if (i.D0(getContext())) {
            setNextFocusLeftId(J2.f.cancel_button);
            setNextFocusRightId(J2.f.confirm_button);
        }
        this.f24652b = i.E0(getContext());
        AbstractC0985p0.setAccessibilityDelegate(this, new a());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public m getAdapter() {
        return (m) super.getAdapter();
    }
}
