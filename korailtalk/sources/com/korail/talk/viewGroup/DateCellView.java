package com.korail.talk.viewGroup;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Calendar;
import n4.AbstractC5953d;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import y6.C6543c;
import z4.C6631e;
import z4.C6634h;

/* loaded from: classes.dex */
public class DateCellView extends C6543c {

    /* renamed from: a, reason: collision with root package name */
    private TextView f29543a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f29544b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f29545c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f29546d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f29547e;

    /* renamed from: f, reason: collision with root package name */
    private Calendar f29548f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29549g;

    public DateCellView(Context context) {
        super(context);
        d();
    }

    private void setTextColor(TextView textView) {
        Calendar calendar;
        if (textView == null || (calendar = this.f29548f) == null) {
            return;
        }
        if (this.f29549g) {
            textView.setTextColor(a(AbstractC5953d.selector_calendar_item_sunday));
            return;
        }
        int i8 = calendar.get(7);
        if (i8 == 1) {
            textView.setTextColor(a(AbstractC5953d.selector_calendar_item_sunday));
        } else if (i8 != 7) {
            textView.setTextColor(a(AbstractC5953d.selector_calendar_item_weekday));
        } else {
            textView.setTextColor(a(AbstractC5953d.selector_calendar_item_saturday));
        }
    }

    protected void c() {
        View.inflate(getContext(), AbstractC5957h.calendar_date_cell, this);
    }

    protected void d() {
        c();
        this.f29544b = (ImageView) findViewById(AbstractC5955f.todayImg);
        this.f29545c = (TextView) findViewById(AbstractC5955f.todayTxt);
        this.f29546d = (TextView) findViewById(AbstractC5955f.selectDayBgTxt);
        this.f29547e = (TextView) findViewById(AbstractC5955f.monthSuperscript);
        this.f29543a = (TextView) findViewById(AbstractC5955f.dateCellText);
    }

    protected void e() {
        Calendar calendar = this.f29548f;
        if (calendar == null) {
            return;
        }
        TextView textView = this.f29543a;
        if (textView != null) {
            textView.setText(Integer.toString(calendar.get(5)));
            setTextColor(this.f29543a);
        }
        TextView textView2 = this.f29547e;
        if (textView2 != null) {
            textView2.setText(Integer.toString(this.f29548f.get(2) + 1));
            setTextColor(this.f29547e);
        }
        if (this.f29544b == null || this.f29545c == null) {
            return;
        }
        if (!C6634h.isEquals(this.f29548f, Calendar.getInstance(), "yyyyMMdd")) {
            this.f29544b.setVisibility(8);
            this.f29545c.setVisibility(8);
        } else {
            this.f29544b.setImageResource(isSelected() ? AbstractC5954e.today_select : AbstractC5954e.today);
            this.f29544b.setVisibility(0);
            this.f29545c.setVisibility(0);
        }
    }

    public Calendar getDate() {
        Calendar calendar = this.f29548f;
        if (calendar == null) {
            return null;
        }
        return (Calendar) calendar.clone();
    }

    public Calendar getThisDate() {
        return this.f29548f;
    }

    public boolean isHoliday() {
        return this.f29549g;
    }

    public void setDate(Calendar calendar) {
        if (calendar == null) {
            return;
        }
        Calendar calendar2 = (Calendar) calendar.clone();
        this.f29548f = calendar2;
        this.f29549g = C6631e.isHoliday(calendar2);
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        TextView textView = this.f29543a;
        if (textView != null) {
            textView.setEnabled(z8);
        }
        TextView textView2 = this.f29547e;
        if (textView2 != null) {
            textView2.setEnabled(z8);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        super.setSelected(z8);
        ImageView imageView = this.f29544b;
        if (imageView != null) {
            imageView.setImageResource(z8 ? AbstractC5954e.today_select : AbstractC5954e.today);
        }
        TextView textView = this.f29546d;
        if (textView != null) {
            textView.setVisibility(z8 ? 0 : 8);
        }
    }

    public void setSelectedDateText(String str) {
        String strTrim = TextUtils.isEmpty(str) ? null : str.trim();
        if (this.f29546d == null || TextUtils.isEmpty(strTrim)) {
            return;
        }
        this.f29546d.setText(strTrim);
    }

    public void showMonth(boolean z8) {
        TextView textView = this.f29547e;
        if (textView == null) {
            return;
        }
        if (z8) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    public DateCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    public DateCellView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        d();
    }
}
