package com.korail.talk.ui.mileage;

import I4.h;
import Q7.X;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.xPoint.MileageInquiryDao;
import com.korail.talk.network.dao.xPoint.MileageInquiryDao.MileageInquiryRequest;
import com.korail.talk.view.base.BaseViewActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import n4.AbstractC5951b;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class MileageHistoryActivity extends BaseViewActivity implements DropDownSelector.b {

    /* renamed from: A */
    private TextView f28450A;

    /* renamed from: B */
    private TextView f28451B;

    /* renamed from: C */
    private Button f28452C;

    /* renamed from: D */
    private Button f28453D;

    /* renamed from: E */
    private TextView f28454E;

    /* renamed from: F */
    private TextView f28455F;

    /* renamed from: G */
    private TextView f28456G;

    /* renamed from: H */
    private Calendar f28457H;

    /* renamed from: I */
    private Calendar f28458I;

    /* renamed from: J */
    private Calendar f28459J;

    /* renamed from: K */
    private Calendar f28460K;

    /* renamed from: L */
    private DropDownSelector f28461L;

    /* renamed from: M */
    private ListView f28462M;

    /* renamed from: N */
    private d f28463N;

    /* renamed from: t */
    private List f28479t;

    /* renamed from: u */
    private String f28480u;

    /* renamed from: w */
    private int f28482w;

    /* renamed from: y */
    private TextView f28484y;

    /* renamed from: z */
    private TextView f28485z;

    /* renamed from: i */
    private final String f28468i = "1";

    /* renamed from: j */
    private final String f28469j = "2";

    /* renamed from: k */
    private final String f28470k = "20";

    /* renamed from: l */
    private final int f28471l = -60;

    /* renamed from: m */
    private final int f28472m = 60;

    /* renamed from: n */
    private final int f28473n = 0;

    /* renamed from: o */
    private final int f28474o = 1;

    /* renamed from: p */
    private final int f28475p = 2;

    /* renamed from: q */
    private final int f28476q = 3;

    /* renamed from: r */
    private SimpleDateFormat f28477r = new SimpleDateFormat("yyyyMMdd");

    /* renamed from: s */
    private SimpleDateFormat f28478s = new SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: v */
    private int f28481v = 1;

    /* renamed from: x */
    private String f28483x = "0";

    /* renamed from: O */
    private boolean f28464O = false;

    /* renamed from: P */
    private boolean f28465P = false;

    /* renamed from: Q */
    private DatePickerDialog.OnDateSetListener f28466Q = new b();

    /* renamed from: R */
    private DatePickerDialog.OnDateSetListener f28467R = new c();

    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
            if (MileageHistoryActivity.this.f28482w <= MileageHistoryActivity.this.f28481v || i8 != 0 || (MileageHistoryActivity.this.f28462M.getLastVisiblePosition() - MileageHistoryActivity.this.f28462M.getHeaderViewsCount()) - MileageHistoryActivity.this.f28462M.getFooterViewsCount() < MileageHistoryActivity.this.f28463N.getCount() - 1) {
                return;
            }
            t.d("mMaxPageNo :" + MileageHistoryActivity.this.f28482w + ", mNowPageNo : " + MileageHistoryActivity.this.f28481v);
            MileageHistoryActivity.H0(MileageHistoryActivity.this);
            MileageHistoryActivity.this.R0();
        }
    }

    class b implements DatePickerDialog.OnDateSetListener {
        b() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i8, int i9, int i10) {
            MileageHistoryActivity.this.f28457H.set(i8, i9, i10);
            MileageHistoryActivity.this.f28455F.setText(MileageHistoryActivity.this.f28478s.format(MileageHistoryActivity.this.f28457H.getTime()));
        }
    }

    class c implements DatePickerDialog.OnDateSetListener {
        c() {
        }

        @Override // android.app.DatePickerDialog.OnDateSetListener
        public void onDateSet(DatePicker datePicker, int i8, int i9, int i10) {
            MileageHistoryActivity.this.f28458I.set(i8, i9, i10);
            MileageHistoryActivity.this.f28456G.setText(MileageHistoryActivity.this.f28478s.format(MileageHistoryActivity.this.f28458I.getTime()));
        }
    }

    private class d extends BaseAdapter {

        /* renamed from: a */
        private final LayoutInflater f28489a;

        private class a {
            public TextView mTvAmount;
            public TextView mTvDate;
            public TextView mTvInfo;

            private a() {
            }

            /* synthetic */ a(d dVar, a aVar) {
                this();
            }
        }

        public d() {
            this.f28489a = LayoutInflater.from(MileageHistoryActivity.this.getApplicationContext());
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(MileageHistoryActivity.this.f28479t)) {
                return 0;
            }
            return MileageHistoryActivity.this.f28479t.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            View viewInflate;
            a aVar;
            if (C6630d.isNull(view)) {
                aVar = new a(this, null);
                viewInflate = this.f28489a.inflate(AbstractC5957h.item_gifticket_detail, viewGroup, false);
                aVar.mTvInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_info);
                aVar.mTvDate = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_date);
                aVar.mTvAmount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_detail_amount);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            aVar.mTvInfo.setText(((MileageInquiryDao.SpecList) MileageHistoryActivity.this.f28479t.get(i8)).getPontDvNm() + X.SPACE + ((MileageInquiryDao.SpecList) MileageHistoryActivity.this.f28479t.get(i8)).getRcpDvNm());
            aVar.mTvDate.setText(C6634h.convertFormat(((MileageInquiryDao.SpecList) MileageHistoryActivity.this.f28479t.get(i8)).getDptDt(), "yyyyMMdd", "yyyy.MM.dd"));
            aVar.mTvAmount.setText(((MileageInquiryDao.SpecList) MileageHistoryActivity.this.f28479t.get(i8)).getPontAmt());
            return viewInflate;
        }
    }

    static /* synthetic */ int H0(MileageHistoryActivity mileageHistoryActivity) {
        int i8 = mileageHistoryActivity.f28481v;
        mileageHistoryActivity.f28481v = i8 + 1;
        return i8;
    }

    private void Q0() {
        this.f28481v = 1;
        this.f28479t.clear();
        d dVar = this.f28463N;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    public void R0() {
        MileageInquiryDao mileageInquiryDao = new MileageInquiryDao();
        MileageInquiryDao.MileageInquiryRequest mileageInquiryRequest = mileageInquiryDao.new MileageInquiryRequest();
        mileageInquiryRequest.setPontTpVal(this.f28480u);
        mileageInquiryRequest.setQryDvVal(this.f28483x);
        mileageInquiryRequest.setQryStDt(this.f28477r.format(this.f28457H.getTime()));
        mileageInquiryRequest.setQryClsDt(this.f28477r.format(this.f28458I.getTime()));
        mileageInquiryRequest.setPgPrCnt("20");
        mileageInquiryRequest.setNowPgNo(Integer.toString(this.f28481v));
        mileageInquiryDao.setRequest(mileageInquiryRequest);
        executeDao(mileageInquiryDao);
    }

    public /* synthetic */ void S0(View view) {
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.mileage_dialog_title)).setContent(getString(AbstractC5959j.mileage_dialog_info)).showDialog();
    }

    public /* synthetic */ void T0(View view) {
        t.d("mBtnKTXMileage");
        Q0();
        this.f28480u = "1";
        this.f28452C.setSelected(true);
        this.f28453D.setSelected(false);
        R0();
    }

    public /* synthetic */ void U0(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this.f28467R, this.f28458I.get(1), this.f28458I.get(2), this.f28458I.get(5));
        datePickerDialog.getDatePicker().setMinDate(this.f28459J.getTimeInMillis());
        datePickerDialog.getDatePicker().setMaxDate(this.f28460K.getTimeInMillis());
        datePickerDialog.show();
    }

    public /* synthetic */ void V0(View view) {
        Q0();
        R0();
    }

    public /* synthetic */ void W0(View view) {
        t.d("mBtnRailPoint");
        Q0();
        this.f28480u = "2";
        this.f28452C.setSelected(false);
        this.f28453D.setSelected(true);
        R0();
    }

    public /* synthetic */ void X0(View view) {
        f1();
    }

    public /* synthetic */ void Y0(View view) {
        f1();
    }

    public /* synthetic */ void Z0(View view) {
        e1(0);
    }

    public /* synthetic */ void a1(View view) {
        e1(1);
    }

    public /* synthetic */ void b1(View view) {
        e1(2);
    }

    public /* synthetic */ void c1(View view) {
        e1(3);
    }

    public /* synthetic */ void d1(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, this.f28466Q, this.f28457H.get(1), this.f28457H.get(2), this.f28457H.get(5));
        datePickerDialog.getDatePicker().setMinDate(this.f28459J.getTimeInMillis());
        datePickerDialog.getDatePicker().setMaxDate(this.f28460K.getTimeInMillis());
        datePickerDialog.show();
    }

    private void e1(int i8) {
        t.d("mode - " + i8);
        if (this.f28455F == null || this.f28456G == null) {
            t.e("Err - CalendarEditText is null");
            return;
        }
        onCancelDao();
        Q0();
        if (i8 == 0) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, this.f28466Q, this.f28457H.get(1), this.f28457H.get(2), this.f28457H.get(5));
            datePickerDialog.getDatePicker().setMinDate(this.f28459J.getTimeInMillis());
            datePickerDialog.getDatePicker().setMaxDate(this.f28460K.getTimeInMillis());
            datePickerDialog.show();
            return;
        }
        if (i8 == 2) {
            Calendar calendar = Calendar.getInstance();
            this.f28457H = calendar;
            calendar.add(2, -3);
            this.f28458I = Calendar.getInstance();
            this.f28454E.setText(getString(AbstractC5959j.mileage_period_full, this.f28478s.format(this.f28457H.getTime()), this.f28478s.format(this.f28458I.getTime())));
            this.f28455F.setText(this.f28478s.format(this.f28457H.getTime()));
            this.f28456G.setText(this.f28478s.format(this.f28458I.getTime()));
            return;
        }
        if (i8 != 3) {
            Calendar calendar2 = Calendar.getInstance();
            this.f28457H = calendar2;
            calendar2.add(2, -1);
            this.f28458I = Calendar.getInstance();
            this.f28454E.setText(getString(AbstractC5959j.mileage_period_full, this.f28478s.format(this.f28457H.getTime()), this.f28478s.format(this.f28458I.getTime())));
            this.f28455F.setText(this.f28478s.format(this.f28457H.getTime()));
            this.f28456G.setText(this.f28478s.format(this.f28458I.getTime()));
            return;
        }
        Calendar calendar3 = Calendar.getInstance();
        this.f28457H = calendar3;
        calendar3.add(2, -6);
        this.f28458I = Calendar.getInstance();
        this.f28454E.setText(getString(AbstractC5959j.mileage_period_full, this.f28478s.format(this.f28457H.getTime()), this.f28478s.format(this.f28458I.getTime())));
        this.f28455F.setText(this.f28478s.format(this.f28457H.getTime()));
        this.f28456G.setText(this.f28478s.format(this.f28458I.getTime()));
    }

    private void f1() {
        this.f28464O = !this.f28464O;
        findViewById(AbstractC5955f.ll_calendar).setVisibility(this.f28464O ? 0 : 8);
        findViewById(AbstractC5955f.iv_mileage_period_arrow).startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), this.f28464O ? AbstractC5951b.rotation_to_right_180 : AbstractC5951b.rotation_to_left_180));
    }

    private void g1() {
        this.f28479t = new ArrayList();
        this.f28457H = Calendar.getInstance();
        this.f28458I = Calendar.getInstance();
        this.f28459J = Calendar.getInstance();
        this.f28460K = Calendar.getInstance();
        this.f28459J.add(2, -60);
        this.f28460K.add(2, 60);
    }

    private void h1() {
        findViewById(AbstractC5955f.tv_ktx_mileage_info).setOnClickListener(new View.OnClickListener() { // from class: B5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f344a.S0(view);
            }
        });
        this.f28452C.setOnClickListener(new View.OnClickListener() { // from class: B5.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f349a.T0(view);
            }
        });
        this.f28453D.setOnClickListener(new View.OnClickListener() { // from class: B5.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f350a.W0(view);
            }
        });
        this.f28454E.setOnClickListener(new View.OnClickListener() { // from class: B5.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f351a.X0(view);
            }
        });
        findViewById(AbstractC5955f.iv_mileage_period_arrow).setOnClickListener(new View.OnClickListener() { // from class: B5.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f352a.Y0(view);
            }
        });
        findViewById(AbstractC5955f.btn_period_custom).setOnClickListener(new View.OnClickListener() { // from class: B5.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f353a.Z0(view);
            }
        });
        findViewById(AbstractC5955f.btn_period_1).setOnClickListener(new View.OnClickListener() { // from class: B5.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f354a.a1(view);
            }
        });
        findViewById(AbstractC5955f.btn_period_2).setOnClickListener(new View.OnClickListener() { // from class: B5.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f355a.b1(view);
            }
        });
        findViewById(AbstractC5955f.btn_period_3).setOnClickListener(new View.OnClickListener() { // from class: B5.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f345a.c1(view);
            }
        });
        this.f28461L.setOnSelectorItemClickListener(this);
        this.f28455F.setOnClickListener(new View.OnClickListener() { // from class: B5.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f346a.d1(view);
            }
        });
        this.f28456G.setOnClickListener(new View.OnClickListener() { // from class: B5.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f347a.U0(view);
            }
        });
        findViewById(AbstractC5955f.btn_inquiry).setOnClickListener(new View.OnClickListener() { // from class: B5.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f348a.V0(view);
            }
        });
        this.f28462M.setOnScrollListener(new a());
    }

    private void i1() {
        n0(false);
        this.f28485z = (TextView) findViewById(AbstractC5955f.tv_ktx_mileage);
        this.f28450A = (TextView) findViewById(AbstractC5955f.tv_ktx_samsung_mileage);
        this.f28451B = (TextView) findViewById(AbstractC5955f.tv_rail_point);
        this.f28484y = (TextView) findViewById(AbstractC5955f.tv_ktx_mileage_expire);
        this.f28452C = (Button) findViewById(AbstractC5955f.btn_ktx_mileage);
        this.f28453D = (Button) findViewById(AbstractC5955f.btn_rail_point);
        String[] strArr = {getString(AbstractC5959j.common_type_all), getString(AbstractC5959j.common_type_save), getString(AbstractC5959j.common_type_use)};
        DropDownSelector dropDownSelector = (DropDownSelector) findViewById(AbstractC5955f.selector_mileage_option_type);
        this.f28461L = dropDownSelector;
        dropDownSelector.changeResourceId(AbstractC5954e.bg_drop_down_selector_pop_dark, AbstractC5954e.ic_unfold_dropdown_big);
        this.f28461L.setEntries(strArr, (String[]) null, 0);
        this.f28454E = (TextView) findViewById(AbstractC5955f.tv_mileage_period);
        this.f28455F = (TextView) findViewById(AbstractC5955f.startCal);
        this.f28456G = (TextView) findViewById(AbstractC5955f.endCal);
        ListView listView = (ListView) findViewById(AbstractC5955f.lv_mileage);
        this.f28462M = listView;
        listView.setClickable(false);
        this.f28462M.setEmptyView(findViewById(AbstractC5955f.tv_no_content));
        d dVar = new d();
        this.f28463N = dVar;
        this.f28462M.setAdapter((ListAdapter) dVar);
        this.f28462M.getEmptyView().setVisibility(8);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.title_mileage_inquiry);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1) {
            if (107 == i8 || 127 == i8) {
                Q0();
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_mileage_history_list);
        if (C6630d.isNull(bundle)) {
            g1();
            i1();
            setText();
            h1();
            this.f28480u = "1";
            this.f28452C.setSelected(true);
            e1(2);
            R0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        h hVar = h.getInstance();
        if (hVar.isNonMember()) {
            hVar.setNonMember(false);
        }
        super.onDestroy();
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) {
        if (AbstractC5955f.selector_mileage_option_type != dropDownSelector.getId() || this.f28483x.equals(Integer.toString(i8))) {
            return;
        }
        t.d("onItemSelected() idx : " + i8);
        Q0();
        this.f28483x = Integer.toString(i8);
        R0();
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_mileage_inquiry == iBaseDao.getId()) {
            MileageInquiryDao.MileageInquiryResponse mileageInquiryResponse = (MileageInquiryDao.MileageInquiryResponse) iBaseDao.getResponse();
            int integer = N.getInteger(mileageInquiryResponse.getTotAvlRailPontValNum());
            int integer2 = N.getInteger(mileageInquiryResponse.gettotAvlRailPontValNum1());
            this.f28485z.setText(N.getDecimalFormatString(integer + integer2));
            this.f28450A.setText(getString(AbstractC5959j.mileage_ktx_samsung, N.getDecimalFormatString(integer), N.getDecimalFormatString(integer2)));
            this.f28451B.setText(N.getDecimalFormatString(mileageInquiryResponse.getTotAvlAfltPontValNum()));
            this.f28484y.setText(getString(AbstractC5959j.mileage_expire, N.getDecimalFormatString(mileageInquiryResponse.getDelPontValNum())));
            this.f28482w = N.getInteger(mileageInquiryResponse.getPgCnt());
            this.f28479t.addAll(mileageInquiryResponse.getSpecList());
            this.f28463N.notifyDataSetChanged();
        }
    }
}
