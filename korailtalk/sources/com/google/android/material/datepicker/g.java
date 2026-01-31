package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
class g extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final int f24681d;

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f24682a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24683b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24684c;

    static {
        f24681d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar calendarI = s.i();
        this.f24682a = calendarI;
        this.f24683b = calendarI.getMaximum(7);
        this.f24684c = calendarI.getFirstDayOfWeek();
    }

    private int a(int i8) {
        int i9 = i8 + this.f24684c;
        int i10 = this.f24683b;
        return i9 > i10 ? i9 - i10 : i9;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f24683b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(J2.h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f24682a.set(7, a(i8));
        textView.setText(this.f24682a.getDisplayName(7, f24681d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(J2.j.mtrl_picker_day_of_week_column_header), this.f24682a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    public Integer getItem(int i8) {
        if (i8 >= this.f24683b) {
            return null;
        }
        return Integer.valueOf(a(i8));
    }
}
