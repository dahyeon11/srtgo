package y6;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.korail.talk.data.vo.AvailableDates;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import v4.InterfaceC6431a;
import z4.C6630d;
import z4.C6634h;

/* renamed from: y6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6544d extends C6542b implements View.OnClickListener, InterfaceC6431a {

    /* renamed from: a, reason: collision with root package name */
    private RelativeLayout f37619a;

    /* renamed from: b, reason: collision with root package name */
    private C6549i f37620b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f37621c;

    /* renamed from: d, reason: collision with root package name */
    private Button f37622d;

    /* renamed from: e, reason: collision with root package name */
    private Button f37623e;

    /* renamed from: f, reason: collision with root package name */
    private Calendar f37624f;

    /* renamed from: g, reason: collision with root package name */
    private Calendar f37625g;

    /* renamed from: h, reason: collision with root package name */
    private AvailableDates f37626h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC6431a f37627i;

    /* renamed from: j, reason: collision with root package name */
    private String f37628j;

    public ViewOnClickListenerC6544d(Context context) {
        super(context);
        g();
    }

    private void g() {
        removeAllViews();
        View viewInflate = View.inflate(getContext(), AbstractC5957h.calendar_navigator_view, null);
        this.f37619a = (RelativeLayout) viewInflate.findViewById(AbstractC5955f.month_or_week_container);
        this.f37621c = (TextView) viewInflate.findViewById(AbstractC5955f.yearMonthTxt);
        this.f37622d = (Button) viewInflate.findViewById(AbstractC5955f.prevBtn);
        this.f37623e = (Button) viewInflate.findViewById(AbstractC5955f.nextBtn);
        addView(viewInflate);
    }

    private void h(Calendar calendar, Calendar calendar2) {
        if (calendar == null) {
            return;
        }
        Calendar calendar3 = Calendar.getInstance();
        Calendar lastDate = this.f37626h.getLastDate();
        this.f37624f = calendar;
        this.f37621c.setText(new SimpleDateFormat("yyyy년 MM월").format(this.f37624f.getTime()));
        if (C6634h.isEquals(calendar3, this.f37624f, "yyyyMM")) {
            this.f37622d.setVisibility(4);
            this.f37622d.setOnClickListener(null);
        } else {
            this.f37622d.setVisibility(0);
            this.f37622d.setOnClickListener(this);
        }
        if (C6634h.isEquals(lastDate, this.f37624f, "yyyyMM")) {
            this.f37623e.setVisibility(4);
            this.f37623e.setOnClickListener(null);
        } else {
            this.f37623e.setVisibility(0);
            this.f37623e.setOnClickListener(this);
        }
        this.f37619a.removeAllViews();
        C6549i c6549i = new C6549i(getContext());
        this.f37620b = c6549i;
        c6549i.setMonth(this, this.f37624f, this.f37626h, calendar2, this.f37628j);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13, -1);
        this.f37619a.addView(this.f37620b, layoutParams);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Calendar calendar;
        if (view == null || (calendar = this.f37624f) == null) {
            return;
        }
        this.f37624f = (Calendar) calendar.clone();
        int id = view.getId();
        if (AbstractC5955f.prevBtn == id) {
            this.f37624f.add(2, -1);
            h(this.f37624f, this.f37625g);
        } else if (AbstractC5955f.nextBtn == id) {
            this.f37624f.add(2, 1);
            h(this.f37624f, this.f37625g);
        }
    }

    @Override // v4.InterfaceC6431a
    public void onSelectDate(Calendar calendar) {
        this.f37625g = calendar;
        if (C6630d.isNotNull(this.f37627i)) {
            this.f37627i.onSelectDate(calendar == null ? null : (Calendar) calendar.clone());
        }
    }

    public void setAvailableDates(AvailableDates availableDates, Calendar calendar, String str, InterfaceC6431a interfaceC6431a) {
        this.f37626h = availableDates;
        this.f37628j = str;
        this.f37627i = interfaceC6431a;
        Calendar firstDate = calendar == null ? availableDates.getFirstDate() : (Calendar) calendar.clone();
        if (firstDate == null) {
            return;
        }
        h(firstDate, firstDate);
        onSelectDate(firstDate);
    }

    public ViewOnClickListenerC6544d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g();
    }

    public ViewOnClickListenerC6544d(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g();
    }
}
