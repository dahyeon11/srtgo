package com.korail.talk.ui.booking.option.date;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.ui.booking.option.date.BookingHourPickScroll;
import com.korail.talk.ui.booking.option.date.BookingPassPicker;
import com.korail.talk.viewGroup.LinearCalendarView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.InterfaceC6431a;
import y6.C6550j;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class a extends C6550j {

    /* renamed from: A, reason: collision with root package name */
    private BookingHourPickScroll.b f27843A;

    /* renamed from: B, reason: collision with root package name */
    private InterfaceC6431a f27844B;

    /* renamed from: C, reason: collision with root package name */
    private BookingPassPicker.a f27845C;

    /* renamed from: D, reason: collision with root package name */
    private InterfaceC6431a f27846D;

    /* renamed from: f, reason: collision with root package name */
    private SimpleDateFormat f27847f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f27848g;

    /* renamed from: h, reason: collision with root package name */
    private int f27849h;

    /* renamed from: i, reason: collision with root package name */
    private String f27850i;

    /* renamed from: j, reason: collision with root package name */
    private String[] f27851j;

    /* renamed from: k, reason: collision with root package name */
    private AvailableDates f27852k;

    /* renamed from: l, reason: collision with root package name */
    private Calendar f27853l;

    /* renamed from: m, reason: collision with root package name */
    private d f27854m;

    /* renamed from: n, reason: collision with root package name */
    private e f27855n;

    /* renamed from: o, reason: collision with root package name */
    private View f27856o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f27857p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f27858q;

    /* renamed from: r, reason: collision with root package name */
    private Button f27859r;

    /* renamed from: s, reason: collision with root package name */
    private LinearCalendarView f27860s;

    /* renamed from: t, reason: collision with root package name */
    private BookingHourPickScroll f27861t;

    /* renamed from: u, reason: collision with root package name */
    private View f27862u;

    /* renamed from: v, reason: collision with root package name */
    private CalendarManualPicker f27863v;

    /* renamed from: w, reason: collision with root package name */
    private BookingPassPicker f27864w;

    /* renamed from: x, reason: collision with root package name */
    private View f27865x;

    /* renamed from: y, reason: collision with root package name */
    private RadioGroup f27866y;

    /* renamed from: z, reason: collision with root package name */
    private InterfaceC6431a f27867z;

    /* renamed from: com.korail.talk.ui.booking.option.date.a$a, reason: collision with other inner class name */
    class C0238a implements InterfaceC6431a {
        C0238a() {
        }

        @Override // v4.InterfaceC6431a
        public void onSelectDate(Calendar calendar) {
            if (C6634h.isEquals(a.this.f27853l, calendar, "yyyyMMdd")) {
                a.this.A(calendar.get(11));
            } else {
                a.this.z(calendar);
                a.this.f27860s.setSelectDate(a.this.f27853l);
            }
        }
    }

    class b implements BookingPassPicker.a {
        b() {
        }

        @Override // com.korail.talk.ui.booking.option.date.BookingPassPicker.a
        public void onItemChanged(BookingPassPicker bookingPassPicker, int i8) {
            bookingPassPicker.setFocus(true);
            try {
                ((RadioButton) a.this.f27866y.getChildAt(i8)).setChecked(true);
            } catch (Exception e8) {
                t.e(e8.getMessage());
            }
        }
    }

    class c implements InterfaceC6431a {
        c() {
        }

        @Override // v4.InterfaceC6431a
        public void onSelectDate(Calendar calendar) {
            a.this.z(calendar);
            a.this.f27860s.setSelectDate(a.this.f27853l);
        }
    }

    public interface d {
        void onChangeDateOption(CalendarData calendarData);
    }

    public interface e {
        void onChangeRadioButton(int i8);
    }

    public a(Context context) {
        super(context);
        this.f27849h = 0;
        this.f27867z = new InterfaceC6431a() { // from class: S4.e
            @Override // v4.InterfaceC6431a
            public final void onSelectDate(Calendar calendar) {
                this.f4637a.z(calendar);
            }
        };
        this.f27843A = new BookingHourPickScroll.b() { // from class: S4.f
            @Override // com.korail.talk.ui.booking.option.date.BookingHourPickScroll.b
            public final void onHourChanged(int i8) {
                this.f4638a.A(i8);
            }
        };
        this.f27844B = new C0238a();
        this.f27845C = new b();
        this.f27846D = new c();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(int i8) {
        Calendar calendar = Calendar.getInstance();
        if (C6634h.isEquals(this.f27853l, calendar, "yyyyMMdd") && calendar.get(11) > i8) {
            this.f27863v.setSelectedDate(this.f27853l);
            C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.booking_select_prev_hour_warning)).showDialog();
            return;
        }
        if (C6634h.isEquals(this.f27853l, calendar, "yyyyMMdd") && calendar.get(11) < i8) {
            this.f27853l.set(12, 0);
            this.f27853l.set(13, 0);
        }
        this.f27853l.set(11, i8);
        this.f27861t.selectItem(i8);
        this.f27863v.setSelectedDate(this.f27853l);
        setHeaderMsg();
        if (C6630d.isNull(this.f27854m)) {
            return;
        }
        this.f27854m.onChangeDateOption(getSelectedDate());
    }

    private void g() {
        View.inflate(getContext(), AbstractC5957h.option_departure_date, this);
        h();
        y();
        x();
        t();
    }

    private void h() {
        this.f27847f = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm");
    }

    private void s(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            RadioButton radioButton = (RadioButton) View.inflate(getContext(), AbstractC5957h.toggle_btn_blue, null);
            radioButton.setText(str);
            this.f27866y.addView(radioButton);
            RadioGroup.LayoutParams layoutParams = (RadioGroup.LayoutParams) radioButton.getLayoutParams();
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            if (this.f27866y.getChildCount() > 0) {
                layoutParams.setMargins(N.dpToPx(10.5f), 0, 0, 0);
            }
            radioButton.setLayoutParams(layoutParams);
        }
        this.f27866y.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: S4.d
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i8) {
                this.f4636a.u(radioGroup, i8);
            }
        });
        ((RadioButton) this.f27866y.getChildAt(0)).setChecked(true);
    }

    private void t() {
        this.f27862u.setVisibility(C6630d.isAccessibilityEnable(getContext()) ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(RadioGroup radioGroup, int i8) {
        int iIndexOfChild = radioGroup.indexOfChild(radioGroup.findViewById(i8));
        this.f27864w.select(iIndexOfChild);
        e eVar = this.f27855n;
        if (eVar != null) {
            eVar.onChangeRadioButton(iIndexOfChild);
        }
        this.f27849h = iIndexOfChild;
        setHeaderMsg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v(View view) {
        onHeaderClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(View view) {
        u4.d dVar = new u4.d(getContext());
        dVar.setCalendarView(this.f27852k, (Calendar) this.f27853l.clone(), this.f27850i);
        dVar.setCalendarListener(this.f27846D);
        dVar.show();
    }

    private void x() {
        this.f27856o.setOnClickListener(new View.OnClickListener() { // from class: S4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4639a.v(view);
            }
        });
        this.f27859r.setOnClickListener(new View.OnClickListener() { // from class: S4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4640a.w(view);
            }
        });
        this.f27861t.setOnHourChangeListener(this.f27843A);
        this.f27864w.setOnItemChangeListener(this.f27845C);
    }

    private void y() {
        View viewFindViewById = findViewById(AbstractC5955f.headerView);
        this.f27856o = viewFindViewById;
        this.f27857p = (TextView) viewFindViewById.findViewById(AbstractC5955f.headerTitleTxt);
        this.f27858q = (TextView) this.f27856o.findViewById(AbstractC5955f.headerVal0Txt);
        this.f27859r = (Button) findViewById(AbstractC5955f.monthCalendarButton);
        this.f27860s = (LinearCalendarView) findViewById(AbstractC5955f.linearCalendar);
        this.f27861t = (BookingHourPickScroll) findViewById(AbstractC5955f.hourPickScroll);
        this.f27862u = findViewById(AbstractC5955f.v_picker);
        this.f27863v = (CalendarManualPicker) findViewById(AbstractC5955f.calendarManualPicker);
        this.f27864w = (BookingPassPicker) findViewById(AbstractC5955f.passPicker);
        this.f27865x = findViewById(AbstractC5955f.v_pass_select);
        this.f27866y = (RadioGroup) findViewById(AbstractC5955f.passSelectView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(Calendar calendar) {
        if (C6630d.isNull(calendar)) {
            return;
        }
        Calendar calendar2 = Calendar.getInstance();
        if (C6634h.isEquals(calendar2, calendar, "yyyyMMdd")) {
            this.f27853l = calendar2;
        } else {
            Calendar calendar3 = (Calendar) calendar.clone();
            this.f27853l = calendar3;
            calendar3.set(11, 0);
            this.f27853l.set(12, 0);
            this.f27853l.set(13, 0);
        }
        this.f27861t.selectHour(this.f27853l.get(11));
        this.f27863v.setSelectedDate(this.f27853l);
        setHeaderMsg();
        if (C6630d.isNull(this.f27854m)) {
            return;
        }
        this.f27854m.onChangeDateOption(getSelectedDate());
    }

    public CalendarData getSelectedDate() {
        Calendar calendar = this.f27853l;
        return new CalendarData(String.valueOf(calendar.get(1)), String.format(com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(2) + 1)), String.format(com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(5))), String.format(com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27861t.getSelectedHour())), String.format(com.google.android.material.timepicker.c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(C6634h.isToday(calendar) ? calendar.get(12) : 0)));
    }

    public String getSelectedDay() {
        return getSelectedDay("yyyyMMdd");
    }

    public String getSelectedHour() {
        return C6634h.getStringFromCalendar(this.f27853l, "HHmmss");
    }

    public void refreshDate() {
        try {
            CalendarData today = C6634h.getToday();
            if (getSelectedDate().isBeforeThan(today)) {
                refreshDate(today);
            }
        } catch (NullPointerException e8) {
            t.e(e8.getMessage());
        }
    }

    public void setDate(String[] strArr) {
        this.f27852k = new AvailableDates(strArr);
        Calendar calendar = Calendar.getInstance();
        Calendar firstDate = this.f27852k.getFirstDate();
        if (C6634h.isEquals(firstDate, calendar, "yyyyMMdd")) {
            this.f27853l = calendar;
        } else {
            this.f27853l = firstDate;
        }
        this.f27860s.setAvailableDates(this.f27867z, this.f27852k, this.f27853l, this.f27850i);
        this.f27861t.selectHour(this.f27853l.get(11));
        this.f27863v.setAvailableDates(this.f27844B, this.f27852k);
        this.f27863v.setSelectedDate(this.f27853l);
        setHeaderMsg();
    }

    public void setHeaderMsg() {
        if (this.f27848g) {
            setHeaderPassMsg();
        } else {
            this.f27858q.setText(this.f27847f.format(this.f27853l.getTime()));
        }
    }

    public void setHeaderPassMsg() {
        if (C6630d.isNull(this.f27853l)) {
            return;
        }
        this.f27858q.setText(this.f27847f.format(this.f27853l.getTime()) + ", " + this.f27851j[this.f27849h] + b(AbstractC5959j.booking_use));
    }

    public void setHeaderSummary(String str) {
        this.f27857p.setText(str);
    }

    public void setOnChangeDateOptionListener(d dVar) {
        this.f27854m = dVar;
    }

    public void setOnChangeRadioButtonListener(e eVar) {
        this.f27855n = eVar;
    }

    public void setPass(boolean z8) {
        this.f27848g = z8;
        this.f27847f = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
    }

    public void setPassDate(String[] strArr) {
        this.f27851j = strArr;
        this.f27864w.setEntries(strArr);
        s(this.f27851j);
        this.f27861t.setVisibility(8);
        this.f27865x.setVisibility(0);
        this.f27864w.setVisibility(0);
        this.f27863v.setHourVisible(false);
    }

    public void setSelectDateMsg(String str) {
        this.f27850i = str;
    }

    public String getSelectedDay(String str) {
        return C6634h.getStringFromCalendar(this.f27853l, str);
    }

    public void refreshDate(CalendarData calendarData) {
        CalendarData today = C6634h.getToday();
        if (calendarData.isBeforeThan(today)) {
            calendarData = today;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, Integer.parseInt(calendarData.getYear()));
        calendar.set(2, Integer.parseInt(calendarData.getMonth()) - 1);
        calendar.set(5, Integer.parseInt(calendarData.getDate()));
        calendar.set(11, Integer.parseInt(calendarData.getHour()));
        calendar.set(12, Integer.parseInt(calendarData.getMinute()));
        this.f27853l = calendar;
        this.f27860s.setSelectDate(calendar);
        this.f27861t.selectHour(this.f27853l.get(11));
        this.f27863v.setSelectedDate(this.f27853l);
        setHeaderMsg();
    }
}
