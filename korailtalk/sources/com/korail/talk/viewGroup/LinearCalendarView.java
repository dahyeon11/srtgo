package com.korail.talk.viewGroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.korail.talk.data.vo.AvailableDates;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.InterfaceC6431a;
import y6.C6543c;
import y6.C6545e;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class LinearCalendarView extends C6543c {

    /* renamed from: a, reason: collision with root package name */
    private List f29569a;

    /* renamed from: b, reason: collision with root package name */
    private Calendar f29570b;

    /* renamed from: c, reason: collision with root package name */
    private View f29571c;

    /* renamed from: d, reason: collision with root package name */
    private HorizontalScrollView f29572d;

    /* renamed from: e, reason: collision with root package name */
    private LinearLayout f29573e;

    /* renamed from: f, reason: collision with root package name */
    private int f29574f;

    /* renamed from: g, reason: collision with root package name */
    private AvailableDates f29575g;

    /* renamed from: h, reason: collision with root package name */
    private Calendar f29576h;

    /* renamed from: i, reason: collision with root package name */
    private Calendar f29577i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC6431a f29578j;

    /* renamed from: k, reason: collision with root package name */
    private String f29579k;

    /* renamed from: l, reason: collision with root package name */
    private final View.OnClickListener f29580l;

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Calendar date = ((DateCellView) view).getDate();
            if (C6634h.isEquals(date, LinearCalendarView.this.f29570b, "yyyyMMdd")) {
                return;
            }
            Calendar calendar = (Calendar) date.clone();
            LinearCalendarView.this.f(view, calendar);
            if (LinearCalendarView.this.f29578j != null) {
                LinearCalendarView.this.f29578j.onSelectDate(calendar);
            }
        }
    }

    public LinearCalendarView(Context context) {
        super(context);
        this.f29580l = new a();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(View view, Calendar calendar) {
        View view2 = this.f29571c;
        if (view2 != null) {
            view2.setSelected(false);
        }
        if (view != null) {
            view.setSelected(calendar != null);
        }
        this.f29570b = calendar;
        this.f29571c = view;
    }

    private void g() {
        removeAllViews();
        View viewInflate = View.inflate(getContext(), AbstractC5957h.calendar_frame_linear, null);
        this.f29572d = (HorizontalScrollView) viewInflate.findViewById(AbstractC5955f.weeksContainerScroll);
        this.f29573e = (LinearLayout) viewInflate.findViewById(AbstractC5955f.weeksContainer);
        this.f29574f = N.dpToPx(47.0f);
        addView(viewInflate);
    }

    private List h() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        while (calendar.compareTo(this.f29577i) <= 0) {
            arrayList.add((Calendar) calendar.clone());
            calendar.add(5, 1);
        }
        return arrayList;
    }

    private void i() {
        this.f29573e.removeAllViews();
        Iterator it = this.f29569a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Calendar calendar = (Calendar) it.next();
            boolean zIsAvailableDate = this.f29575g.isAvailableDate(calendar);
            C6545e c6545e = new C6545e(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.f29574f, -2);
            c6545e.setDate(calendar);
            c6545e.setEnabled(zIsAvailableDate);
            c6545e.setOnClickListener(zIsAvailableDate ? this.f29580l : null);
            c6545e.showMonth(1 == calendar.get(5));
            c6545e.setSelectedDateText(this.f29579k);
            if (C6634h.isEquals(this.f29570b, calendar, "yyyyMMdd")) {
                f(c6545e, this.f29570b);
            }
            this.f29573e.addView(c6545e, layoutParams);
        }
        View view = this.f29571c;
        if (view != null) {
            this.f29572d.smoothScrollTo((int) view.getX(), 0);
        }
    }

    public void setAvailableDates(InterfaceC6431a interfaceC6431a, AvailableDates availableDates, Calendar calendar, String str) {
        if (availableDates == null || availableDates.isEmpty()) {
            return;
        }
        this.f29578j = interfaceC6431a;
        this.f29575g = availableDates;
        Calendar firstDate = availableDates.getFirstDate();
        this.f29576h = firstDate;
        firstDate.set(11, 0);
        this.f29576h.set(12, 0);
        this.f29576h.set(13, 0);
        Calendar lastDate = availableDates.getLastDate();
        this.f29577i = lastDate;
        lastDate.set(11, 23);
        this.f29577i.set(12, 59);
        this.f29577i.set(13, 59);
        this.f29579k = str;
        if (calendar == null || calendar.compareTo(this.f29576h) < 0 || calendar.compareTo(this.f29577i) > 0) {
            this.f29570b = (Calendar) this.f29576h.clone();
        } else {
            this.f29570b = (Calendar) calendar.clone();
        }
        this.f29569a = h();
        i();
    }

    public void setSelectDate(Calendar calendar) {
        DateCellView dateCellView;
        int childCount = this.f29573e.getChildCount();
        int i8 = 0;
        while (true) {
            if (i8 >= childCount) {
                dateCellView = null;
                break;
            }
            View childAt = this.f29573e.getChildAt(i8);
            if (childAt instanceof DateCellView) {
                dateCellView = (DateCellView) childAt;
                if (C6634h.isEquals(dateCellView.getDate(), calendar, "yyyyMMdd")) {
                    break;
                }
            }
            i8++;
        }
        if (dateCellView != null) {
            this.f29572d.smoothScrollTo((((int) dateCellView.getX()) - (this.f29572d.getWidth() / 2)) + (this.f29574f / 2), 0);
            f(dateCellView, dateCellView.getDate());
        }
    }

    public LinearCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29580l = new a();
        g();
    }

    public LinearCalendarView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f29580l = new a();
        g();
    }
}
