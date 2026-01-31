package com.korail.talk.ui.booking.mainBooking;

import ai.maum.m2u.cdk.utils.G711;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.timepicker.c;
import com.korail.talk.data.CalendarData;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.ui.booking.option.date.BookingHourPickScroll;
import com.korail.talk.ui.booking.option.date.RentCarHourPickScroll;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.InterfaceC6431a;
import y6.ViewOnClickListenerC6544d;
import z4.C6630d;
import z4.C6631e;
import z4.C6634h;
import z4.C6637k;
import z4.t;

/* loaded from: classes.dex */
public class MaasMainCalendarActivity extends BaseViewActivity implements InterfaceC6431a {

    /* renamed from: A, reason: collision with root package name */
    private Calendar f27664A;

    /* renamed from: i, reason: collision with root package name */
    private SimpleDateFormat f27670i;

    /* renamed from: j, reason: collision with root package name */
    private Calendar f27671j;

    /* renamed from: k, reason: collision with root package name */
    private AvailableDates f27672k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f27673l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f27674m;

    /* renamed from: n, reason: collision with root package name */
    private String f27675n;

    /* renamed from: o, reason: collision with root package name */
    private BookingHourPickScroll f27676o;

    /* renamed from: p, reason: collision with root package name */
    private RelativeLayout f27677p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f27678q;

    /* renamed from: r, reason: collision with root package name */
    private Button f27679r;

    /* renamed from: s, reason: collision with root package name */
    private Button f27680s;

    /* renamed from: u, reason: collision with root package name */
    private LinearLayout f27682u;

    /* renamed from: v, reason: collision with root package name */
    private RentCarHourPickScroll f27683v;

    /* renamed from: w, reason: collision with root package name */
    private RentCarHourPickScroll f27684w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f27685x;

    /* renamed from: t, reason: collision with root package name */
    private String f27681t = "";

    /* renamed from: y, reason: collision with root package name */
    private final int f27686y = 0;

    /* renamed from: z, reason: collision with root package name */
    private final int f27687z = 1;
    public final String STR_VIEW_TYPE_MIN_10 = "min10";
    public final String STR_VIEW_TYPE_MIN_30 = "min30";

    /* renamed from: B, reason: collision with root package name */
    private String f27665B = "min10";

    /* renamed from: C, reason: collision with root package name */
    private String f27666C = "";

    /* renamed from: D, reason: collision with root package name */
    private String f27667D = "";

    /* renamed from: E, reason: collision with root package name */
    private String f27668E = "";

    /* renamed from: F, reason: collision with root package name */
    private String f27669F = "";

    private void A0() throws NumberFormatException {
        G0(0, 0, this.f27683v.getHourItems().get(0).getHour());
        G0(1, 0, this.f27684w.getHourItems().get(0).getHour());
    }

    private boolean B0(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(int i8, String str) throws NumberFormatException {
        G0(0, i8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D0(int i8, String str) throws NumberFormatException {
        G0(1, i8, str);
    }

    private void F0() throws NumberFormatException {
        CalendarData today = C6634h.getToday();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.parseInt(today.getYear()), Integer.parseInt(today.getMonth()) - 1, Integer.parseInt(today.getDate()));
        calendar.add(5, 1);
        this.f27671j = calendar;
        String string = getString(AbstractC5959j.normal_booking_maas_date);
        String str = this.f27681t;
        if (str != null && !str.isEmpty()) {
            string = this.f27681t.equals("FROM") ? "대여일" : "반납일";
        }
        J0(this.f27672k, (Calendar) this.f27671j.clone(), string);
        A0();
    }

    private void G0(int i8, int i9, String str) throws NumberFormatException {
        int i10 = Integer.parseInt(str);
        Calendar calendar = Calendar.getInstance();
        if (i8 != 0) {
            this.f27671j.set(12, i10);
            this.f27671j.set(13, 0);
            this.f27684w.selectItem(i9);
            I0();
            return;
        }
        if (C6634h.isEquals(this.f27671j, calendar, "yyyyMMdd") && calendar.get(11) > i10) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.booking_select_prev_hour_warning)).showDialog();
            return;
        }
        this.f27671j.set(11, i10);
        this.f27683v.selectItem(i9);
        I0();
    }

    private boolean H0(RentCarHourPickScroll rentCarHourPickScroll, int i8, String str) {
        if (i8 != -1) {
            rentCarHourPickScroll.selectItem(i8);
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No available ");
        sb.append(str);
        sb.append(" after current ");
        sb.append(str);
        sb.append(".");
        return true;
    }

    private void I0() {
        this.f27678q.setText(this.f27670i.format(this.f27671j.getTime()));
    }

    private void J0(AvailableDates availableDates, Calendar calendar, String str) {
        this.f27671j = calendar;
        this.f27677p.removeAllViews();
        ViewOnClickListenerC6544d viewOnClickListenerC6544d = new ViewOnClickListenerC6544d(this);
        viewOnClickListenerC6544d.setAvailableDates(availableDates, calendar, str, this);
        this.f27677p.addView(viewOnClickListenerC6544d);
    }

    private void K0() {
        this.f27675n = getIntent().getStringExtra("MAAS_TITLE");
        this.f27674m = getIntent().getBooleanExtra("MAAS_CALENDAR", false);
        this.f27673l = 132 == getIntent().getIntExtra("requestCode", G711.BIAS);
        String stringExtra = getIntent().getStringExtra("MAAS_RENTCAR_UI") != null ? getIntent().getStringExtra("MAAS_RENTCAR_UI") : "";
        this.f27681t = stringExtra;
        if (stringExtra == null || stringExtra.isEmpty()) {
            return;
        }
        if (this.f27681t.equals("M30")) {
            this.f27665B = "min30";
        } else if (this.f27681t.equals("M10")) {
            this.f27665B = "min10";
        }
        this.f27681t = "FROM";
        String[] strArrSplit = this.f27675n.split("\\|");
        if (strArrSplit.length > 0) {
            this.f27675n = strArrSplit[0] + getString(AbstractC5959j.maas_title_calendar_rent_start_select);
        }
    }

    private void L0() {
        if (this.f27674m && this.f27681t.isEmpty()) {
            this.f27670i = new SimpleDateFormat("yyyy년 MM월 dd일 (E)");
        } else {
            this.f27670i = new SimpleDateFormat("yyyy년 MM월 dd일 (E) HH:mm");
        }
        this.f27672k = new AvailableDates(C6631e.getNormalDateStrArray());
        Calendar calendar = Calendar.getInstance();
        Calendar firstDate = this.f27672k.getFirstDate();
        Date date = (Date) getIntent().getSerializableExtra("departureDate");
        Date date2 = (Date) getIntent().getSerializableExtra("arrivalDate");
        Calendar calendar2 = Calendar.getInstance();
        if (date != null || date2 != null) {
            if (this.f27673l) {
                calendar2.setTime(date);
            } else {
                calendar2.setTime(date2);
            }
            firstDate = calendar2;
        }
        if (this.f27671j != null) {
            String str = this.f27681t;
            if (str == null || str.isEmpty()) {
                this.f27664A = this.f27671j;
            }
        } else if (!C6634h.isEquals(firstDate, calendar, "yyyyMMdd") || firstDate.after(calendar)) {
            this.f27671j = firstDate;
        } else {
            this.f27671j = calendar;
        }
        this.f27676o.selectHour(this.f27671j.get(11));
    }

    private void M0() {
        this.f27676o.setOnHourChangeListener(new BookingHourPickScroll.b() { // from class: P4.g
            @Override // com.korail.talk.ui.booking.option.date.BookingHourPickScroll.b
            public final void onHourChanged(int i8) {
                this.f3717a.E0(i8);
            }
        });
        this.f27679r.setOnClickListener(this);
        this.f27680s.setOnClickListener(this);
    }

    private void N0() {
        m0();
        this.f27676o = (BookingHourPickScroll) findViewById(AbstractC5955f.hourPickScroll);
        findViewById(AbstractC5955f.hourPickScrollTitle).setVisibility(this.f27674m ? 8 : 0);
        this.f27676o.setVisibility(this.f27674m ? 8 : 0);
        this.f27677p = (RelativeLayout) findViewById(AbstractC5955f.rl_calendar_view);
        this.f27678q = (TextView) findViewById(AbstractC5955f.tv_right_text);
        this.f27679r = (Button) findViewById(AbstractC5955f.btn_left);
        this.f27680s = (Button) findViewById(AbstractC5955f.btn_right);
    }

    private void O0(Calendar calendar) {
        if (C6630d.isNull(calendar)) {
            return;
        }
        Calendar calendar2 = Calendar.getInstance();
        if (!C6634h.isEquals(calendar2, calendar, "yyyyMMdd")) {
            Calendar calendar3 = (Calendar) calendar.clone();
            this.f27671j = calendar3;
            calendar3.set(11, calendar3.get(11));
            this.f27671j.set(12, 0);
            this.f27671j.set(13, 0);
        } else if (calendar.after(calendar2)) {
            Calendar calendar4 = (Calendar) calendar.clone();
            this.f27671j = calendar4;
            calendar4.set(11, calendar4.get(11));
            this.f27671j.set(12, 0);
            this.f27671j.set(13, 0);
        } else {
            this.f27671j = calendar2;
        }
        this.f27676o.selectHour(this.f27671j.get(11));
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public void E0(int i8) {
        Calendar calendar = Calendar.getInstance();
        if (C6634h.isEquals(this.f27671j, calendar, "yyyyMMdd") && calendar.get(11) > i8) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.booking_select_prev_hour_warning)).showDialog();
            return;
        }
        if (C6634h.isEquals(this.f27671j, calendar, "yyyyMMdd") && calendar.get(11) < i8) {
            this.f27671j.set(12, 0);
            this.f27671j.set(13, 0);
        }
        this.f27671j.set(11, i8);
        this.f27676o.selectItem(i8);
        I0();
    }

    private boolean Q0(Calendar calendar) throws NumberFormatException {
        if (this.f27683v == null) {
            return true;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (!B0(calendar, calendar2)) {
            return true;
        }
        ArrayList<RentCarHourPickScroll.c> hourItems = this.f27683v.getHourItems();
        ArrayList<RentCarHourPickScroll.c> hourItems2 = this.f27684w.getHourItems();
        int i8 = Integer.parseInt(C6634h.getToday().getHour());
        int i9 = Integer.parseInt(C6634h.getToday().getMinute());
        int iZ0 = z0(hourItems, i8);
        return !H0(this.f27683v, iZ0, "hour") && (!H0(this.f27684w, (iZ0 == -1 || Integer.parseInt(hourItems.get(iZ0).getHour()) != i8) ? 0 : z0(hourItems2, i9), "minute") || iZ0 < hourItems.size() - 1);
    }

    private void setText() {
        if (this.f27674m) {
            setAppTitle(this.f27675n);
            ((TextView) findViewById(AbstractC5955f.tv_left_text)).setText(AbstractC5959j.normal_booking_maas_date);
        } else if (this.f27673l) {
            setAppTitle(AbstractC5959j.title_booking_going_date);
        } else {
            setAppTitle(AbstractC5959j.title_booking_coming_date);
            ((TextView) findViewById(AbstractC5955f.tv_left_text)).setText(AbstractC5959j.normal_booking_coming_date);
        }
    }

    private void v0() {
        this.f27682u = (LinearLayout) findViewById(AbstractC5955f.rentCarhourPickLayout);
        this.f27683v = (RentCarHourPickScroll) findViewById(AbstractC5955f.rentCarhourPickScroll);
        this.f27684w = (RentCarHourPickScroll) findViewById(AbstractC5955f.rentCarminPickScroll);
        this.f27685x = (TextView) findViewById(AbstractC5955f.rentCarhourTitle);
        this.f27684w.setViewType(this.f27665B);
        if (this.f27681t.equals("FROM")) {
            this.f27685x.setText(getString(AbstractC5959j.calendar_select_date_rent_car_from));
            ((TextView) findViewById(AbstractC5955f.tv_left_text)).setText(AbstractC5959j.maas_title_calendar_rent_start);
        } else if (this.f27681t.equals("TO")) {
            this.f27685x.setText(getString(AbstractC5959j.calendar_select_date_rent_car_to));
            ((TextView) findViewById(AbstractC5955f.tv_left_text)).setText(AbstractC5959j.maas_title_calendar_rent_end);
        }
        this.f27682u.setVisibility(0);
        this.f27683v.setOnHourChangeListener(new RentCarHourPickScroll.b() { // from class: P4.h
            @Override // com.korail.talk.ui.booking.option.date.RentCarHourPickScroll.b
            public final void onHourChanged(int i8, String str) throws NumberFormatException {
                this.f3718a.C0(i8, str);
            }
        });
        this.f27684w.setOnHourChangeListener(new RentCarHourPickScroll.b() { // from class: P4.i
            @Override // com.korail.talk.ui.booking.option.date.RentCarHourPickScroll.b
            public final void onHourChanged(int i8, String str) throws NumberFormatException {
                this.f3719a.D0(i8, str);
            }
        });
    }

    private void w0(boolean z8) {
        String string;
        if (this.f27674m) {
            string = getString(AbstractC5959j.normal_booking_maas_date);
            String str = this.f27681t;
            if (str != null && !str.isEmpty()) {
                string = this.f27681t.equals("FROM") ? "대여일" : "반납일";
            }
        } else {
            string = getString(this.f27673l ? AbstractC5959j.normal_booking_going_date : AbstractC5959j.normal_booking_coming_date);
        }
        if (!z8) {
            J0(this.f27672k, (Calendar) this.f27671j.clone(), string);
            return;
        }
        Calendar calendar = (Calendar) this.f27671j.clone();
        if (B0(this.f27672k.getLastDate(), calendar)) {
            calendar = (Calendar) this.f27671j.clone();
        } else {
            calendar.add(11, 24);
        }
        J0(this.f27672k, calendar, string);
    }

    private void x0() throws NumberFormatException {
        String str = this.f27681t;
        if (str == null || str.isEmpty()) {
            return;
        }
        v0();
        if (getIntent() == null || !getIntent().hasExtra("MAAS_RESELECT_DATE_CODE")) {
            validTime(null);
        } else {
            initTimeMin();
        }
    }

    private void y0() {
        String stringExtra = getIntent().getStringExtra("MAAS_INFO");
        String stringExtra2 = getIntent().getStringExtra("MAAS_POPUP_IMAGE");
        if (stringExtra2 != null) {
            C6637k.getCImageDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra2).showDialog();
        } else if (stringExtra != null) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra).showDialog();
        }
    }

    private int z0(ArrayList arrayList, int i8) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            if (Integer.parseInt(((RentCarHourPickScroll.c) arrayList.get(i9)).getHour()) >= i8) {
                return i9;
            }
        }
        return -1;
    }

    public void initTimeMin() throws NumberFormatException {
        RentCarHourPickScroll rentCarHourPickScroll = this.f27683v;
        if (rentCarHourPickScroll == null || rentCarHourPickScroll.getHourItems() == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f27683v.getHourItems().size(); i8++) {
            String str = this.f27681t.equals("FROM") ? this.f27668E : this.f27669F;
            if (this.f27683v.getHourItems().get(i8).getHour().equals(str)) {
                this.f27683v.selectItem(i8);
                G0(0, i8, str);
            }
        }
        for (int i9 = 0; i9 < this.f27684w.getHourItems().size(); i9++) {
            String str2 = this.f27681t.equals("FROM") ? this.f27666C : this.f27667D;
            if (this.f27684w.getHourItems().get(i9).getHour().equals(str2)) {
                this.f27684w.selectItem(i9);
                G0(1, i9, str2);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws NumberFormatException {
        if (isOpenDrawer()) {
            closeDrawer();
            return;
        }
        String str = this.f27681t;
        if (str == null || str.isEmpty() || !this.f27681t.equals("TO")) {
            super.onBackPressed();
            return;
        }
        this.f27681t = "FROM";
        this.f27685x.setText(getString(AbstractC5959j.calendar_select_date_rent_car_from));
        ((TextView) findViewById(AbstractC5955f.tv_left_text)).setText(AbstractC5959j.maas_title_calendar_rent_start);
        this.f27671j = this.f27664A;
        this.f27664A = null;
        String[] strArrSplit = this.f27675n.split("\\|");
        if (strArrSplit.length > 0) {
            String str2 = strArrSplit[0] + getString(AbstractC5959j.maas_title_calendar_rent_start_select);
            this.f27675n = str2;
            setAppTitle(str2);
        }
        w0(false);
        initTimeMin();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws NumberFormatException {
        int id = view.getId();
        if (AbstractC5955f.btn_left == id) {
            onBackPressed();
            return;
        }
        if (AbstractC5955f.btn_right != id) {
            super.onClick(view);
            return;
        }
        String str = this.f27681t;
        if (str == null || str.isEmpty()) {
            t.d("mSelectedCalendar : " + this.f27671j);
            Intent intent = new Intent();
            intent.putExtra("TICKET_DATE_INFO", this.f27671j);
            String stringExtra = getIntent().getStringExtra("MAAS_RENTCAR_UI");
            if (stringExtra != null && (stringExtra.equals("M30") || stringExtra.equals("M10"))) {
                intent.putExtra("MAAS_RENTCAR_UI", stringExtra);
            }
            setResult(-1, intent);
            finish();
            return;
        }
        if (!this.f27681t.equals("FROM")) {
            Intent intent2 = new Intent();
            intent2.putExtra("INTEGRATION_RENT", true);
            intent2.putExtra("TICKET_DATE_INFO_FROM", this.f27664A);
            t.d("loadUrl :: url = " + this.f27664A.getTime());
            intent2.putExtra("TICKET_DATE_INFO", this.f27671j);
            String stringExtra2 = getIntent().getStringExtra("MAAS_RENTCAR_UI");
            if (stringExtra2 != null && (stringExtra2.equals("M30") || stringExtra2.equals("M10"))) {
                intent2.putExtra("MAAS_RENTCAR_UI", stringExtra2);
            }
            setResult(-1, intent2);
            finish();
            return;
        }
        this.f27666C = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27671j.get(12)));
        this.f27668E = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27671j.get(11)));
        this.f27681t = "TO";
        this.f27685x.setText(getString(AbstractC5959j.calendar_select_date_rent_car_to));
        ((TextView) findViewById(AbstractC5955f.tv_left_text)).setText(AbstractC5959j.maas_title_calendar_rent_end);
        this.f27664A = this.f27671j;
        this.f27667D = this.f27666C;
        this.f27669F = this.f27668E;
        String[] strArrSplit = this.f27675n.split("\\|");
        if (strArrSplit.length > 0) {
            String str2 = strArrSplit[0] + getString(AbstractC5959j.maas_title_calendar_rent_end_select);
            this.f27675n = str2;
            setAppTitle(str2);
        }
        w0(true);
        initTimeMin();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maas_main_calendar);
        if (C6630d.isNull(bundle)) {
            y0();
            K0();
            onLoadReDateSelecetd();
            N0();
            setText();
            L0();
            M0();
            w0(false);
            x0();
        }
    }

    public void onLoadReDateSelecetd() {
        if (getIntent() == null || !getIntent().hasExtra("MAAS_RESELECT_DATE_CODE")) {
            return;
        }
        String stringExtra = getIntent().getStringExtra("MAAS_RESELECT_DATE_CODE");
        if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RENT_DATE")) {
            Calendar calendar = (Calendar) getIntent().getSerializableExtra("MAAS_ALREADY_CALENDAR");
            this.f27671j = calendar;
            this.f27666C = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(12)));
            this.f27668E = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27671j.get(11)));
            return;
        }
        if (stringExtra.equals("MAAS_SERVICE_RENTCAR_RETURN_DATE")) {
            this.f27681t = "TO";
            String[] strArrSplit = this.f27675n.split("\\|");
            if (strArrSplit.length > 0) {
                this.f27675n = strArrSplit[0] + getString(AbstractC5959j.maas_title_calendar_rent_end_select);
            }
            this.f27664A = (Calendar) getIntent().getSerializableExtra("MAAS_ALREADY_CALENDAR");
            this.f27671j = (Calendar) getIntent().getSerializableExtra("MAAS_ALREADY_CALENDAR_RETURN");
            this.f27666C = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27664A.get(12)));
            this.f27667D = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27671j.get(12)));
            this.f27668E = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27664A.get(11)));
            this.f27669F = String.format(c.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(this.f27671j.get(11)));
        }
    }

    @Override // v4.InterfaceC6431a
    public void onSelectDate(Calendar calendar) throws NumberFormatException {
        O0(calendar);
        if (this.f27681t.isEmpty()) {
            return;
        }
        if (!Q0(calendar)) {
            F0();
        } else {
            validTime(calendar);
            I0();
        }
    }

    public void performClickOnPosition(RecyclerView recyclerView, int i8) {
        RecyclerView.E eFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i8);
        if (eFindViewHolderForAdapterPosition != null) {
            eFindViewHolderForAdapterPosition.itemView.performClick();
        }
    }

    public void validTime(Calendar calendar) throws NumberFormatException {
        if (this.f27683v == null) {
            return;
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (calendar != null && !B0(calendar, calendar2)) {
            A0();
            return;
        }
        int i8 = Integer.parseInt(C6634h.getToday().getHour());
        int i9 = Integer.parseInt(C6634h.getToday().getMinute());
        ArrayList<RentCarHourPickScroll.c> hourItems = this.f27683v.getHourItems();
        ArrayList<RentCarHourPickScroll.c> hourItems2 = this.f27684w.getHourItems();
        int iZ0 = z0(hourItems, i8);
        int iZ02 = (iZ0 == -1 || Integer.parseInt(hourItems.get(iZ0).getHour()) != i8) ? 0 : z0(hourItems2, i9);
        boolean zH0 = H0(this.f27683v, iZ0, "hour");
        boolean zH02 = H0(this.f27684w, iZ02, "minute");
        if (!zH0) {
            this.f27671j.set(11, Integer.parseInt(hourItems.get(iZ0).getHour()));
        }
        if (!zH02) {
            this.f27671j.set(12, Integer.parseInt(hourItems2.get(iZ02).getHour()));
        }
        if (zH0) {
            F0();
        } else if (zH02) {
            if (iZ0 >= hourItems.size() - 1) {
                F0();
            } else {
                int i10 = iZ0 + 1;
                G0(0, i10, hourItems.get(i10).getHour());
                G0(1, 0, hourItems2.get(0).getHour());
            }
        }
        I0();
    }
}
