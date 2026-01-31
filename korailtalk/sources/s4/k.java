package S4;

import android.content.Context;
import android.graphics.Color;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.korail.talk.data.vo.AvailableDates;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.InterfaceC6431a;
import y6.C6542b;
import z4.C;
import z4.C6625A;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class k extends C6542b implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public static final int BUSINESS_DAY_INDEX = 0;
    public static final int HOLIDAY_INDEX = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f4643a;

    /* renamed from: b, reason: collision with root package name */
    private int f4644b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f4645c;

    /* renamed from: d, reason: collision with root package name */
    private a f4646d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f4647e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f4648f;

    /* renamed from: g, reason: collision with root package name */
    private TextView f4649g;

    /* renamed from: h, reason: collision with root package name */
    private TextView f4650h;

    /* renamed from: i, reason: collision with root package name */
    private ToggleButton f4651i;

    public interface a {
        void onSelectedDate(String str, String str2);
    }

    public k(Context context) {
        super(context);
        i();
    }

    private ArrayList<String> getEnableArrivalDate() {
        return C6634h.getCommutationBetweenDates(getDepartCalendar(), C6634h.getCalendarFromString(C6634h.addDay(getDepartDate(), "yyyyMMdd", this.f4644b), "yyyyMMdd"), this.f4643a);
    }

    private void i() {
        o();
        setText();
        n();
    }

    private boolean j(String str) {
        return ((ArrayList) this.f4645c.get(0)).contains(str);
    }

    private boolean k(String str) {
        return !j(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Calendar calendar) {
        setDepartDate(C6634h.getStringFromCalendar(calendar, "yyyy년 MM월 dd일"));
        if (!getArrivalDate().isEmpty() && !getEnableArrivalDate().contains(getArrivalDate())) {
            setArrivalDate("");
            C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.period_commutation_select_finish_again)).showDialog();
        }
        if (C6630d.isNotNull(this.f4646d)) {
            this.f4646d.onSelectedDate(getDepartDate(), getArrivalDate());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(Calendar calendar) {
        setArrivalDate(C6634h.getStringFromCalendar(calendar, "yyyy년 MM월 dd일 (E)"));
        if (C6630d.isNotNull(this.f4646d)) {
            this.f4646d.onSelectedDate(getDepartDate(), getArrivalDate());
        }
    }

    private void n() {
        this.f4649g.setOnClickListener(this);
        this.f4650h.setOnClickListener(this);
        this.f4648f.setOnClickListener(this);
        this.f4651i.setOnCheckedChangeListener(this);
    }

    private void o() {
        View.inflate(getContext(), AbstractC5957h.period_date_option, this);
        this.f4647e = (TextView) findViewById(AbstractC5955f.tv_period_date_option);
        this.f4648f = (TextView) findViewById(AbstractC5955f.tv_cb_period_date_option_include_holiday);
        this.f4651i = (ToggleButton) findViewById(AbstractC5955f.tb_period_date_option);
        this.f4649g = (TextView) findViewById(AbstractC5955f.tv_period_date_depart);
        this.f4650h = (TextView) findViewById(AbstractC5955f.tv_period_date_arrival);
    }

    private void setText() {
        this.f4647e.setText(AbstractC5959j.period_commutation_available_date);
        this.f4648f.setText(b(AbstractC5959j.period_commutation_include_holiday1));
        this.f4648f.append(N.applySpannable(b(AbstractC5959j.period_commutation_include_holiday2), new AbsoluteSizeSpan(N.dpToPx(12.0f)), new ForegroundColorSpan(Color.parseColor("#fff04922"))));
    }

    public Calendar getArrivalCalendar() {
        return C6634h.getCalendarFromString(getArrivalDate(), "yyyyMMdd");
    }

    public String getArrivalDate() {
        return C.getNumber(N.getText(this.f4650h));
    }

    public Calendar getDepartCalendar() {
        return C6634h.getCalendarFromString(getDepartDate(), "yyyyMMdd");
    }

    public String getDepartDate() {
        return C.getNumber(N.getText(this.f4649g));
    }

    public boolean isChecked() {
        return this.f4651i.isChecked();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
        if (z8 || !k(getDepartDate())) {
            return;
        }
        setDepartDate("");
        setArrivalDate("");
        C6637k.getCDialog(getContext(), 1001, 0, b(AbstractC5959j.dialog_title)).setContent(b(AbstractC5959j.period_commutation_select_start_again)).showDialog();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.tv_period_date_depart == id) {
            AvailableDates availableDates = new AvailableDates(C6625A.toArray((ArrayList) this.f4645c.get(this.f4651i.isChecked() ? 1 : 0)));
            Calendar departCalendar = getDepartCalendar();
            u4.d dVar = new u4.d(getContext());
            dVar.setCalendarView(availableDates, departCalendar, b(AbstractC5959j.booking_departure_date));
            dVar.setCalendarListener(new InterfaceC6431a() { // from class: S4.i
                @Override // v4.InterfaceC6431a
                public final void onSelectDate(Calendar calendar) {
                    this.f4641a.l(calendar);
                }
            });
            dVar.show();
            return;
        }
        if (AbstractC5955f.tv_period_date_arrival != id) {
            if (AbstractC5955f.tv_cb_period_date_option_include_holiday == id) {
                this.f4651i.setChecked(!r4.isChecked());
                return;
            }
            return;
        }
        AvailableDates availableDates2 = new AvailableDates(C6625A.toArray(getEnableArrivalDate()));
        u4.d dVar2 = new u4.d(getContext());
        dVar2.setCalendarView(availableDates2, N.isNotNull(getArrivalDate()) ? getArrivalCalendar() : availableDates2.getFirstDate(), b(AbstractC5959j.booking_end_date));
        dVar2.setCalendarListener(new InterfaceC6431a() { // from class: S4.j
            @Override // v4.InterfaceC6431a
            public final void onSelectDate(Calendar calendar) {
                this.f4642a.m(calendar);
            }
        });
        dVar2.show();
    }

    public void setArrivalDate(String str) {
        this.f4650h.setText(str);
    }

    public void setDateData(ArrayList<ArrayList<String>> arrayList) {
        this.f4645c = arrayList;
        setDepartDate(C6634h.getStringFromCalendar(new AvailableDates(C6625A.toArray(arrayList.get(this.f4651i.isChecked() ? 1 : 0))).getFirstDate(), "yyyy년 MM월 dd일 (E)"));
    }

    public void setDepartDate(String str) {
        this.f4649g.setText(str);
    }

    public void setIPeriodDateOption(a aVar) {
        this.f4646d = aVar;
    }

    public void setPeriodData(List<List<DiscountMenuDao.PassPeriodInfo>> list) {
        List<DiscountMenuDao.PassPeriodInfo> list2 = list.get(0);
        this.f4643a = Integer.parseInt(C.getNumber(list2.get(0).getH_cmtr_utl_trm_cd())) - 1;
        this.f4644b = Integer.parseInt(C.getNumber(list2.get(list2.size() - 1).getH_cmtr_utl_trm_cd()));
    }

    public k(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i();
    }

    public k(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        i();
    }
}
