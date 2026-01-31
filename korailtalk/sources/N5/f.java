package N5;

import Q7.X;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.compensate.CompensateRefundCheckDao;
import com.korail.talk.network.dao.compensate.CompensateRefundListDao;
import com.korail.talk.network.dao.delay.DelayRefundCheckDao;
import com.korail.talk.network.dao.delay.DelayRefundDao;
import com.korail.talk.network.dao.delay.DelayRefundListDao;
import com.korail.talk.network.response.delay.RefundResponse;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.viewGroup.DropDownSelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k0.AbstractC5837a;
import n4.AbstractC5952c;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import y4.C6536a;
import z4.C;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;
import z4.N;

/* loaded from: classes.dex */
public class f extends com.korail.talk.view.base.a implements DropDownSelector.b, View.OnClickListener, AbsListView.OnScrollListener {

    /* renamed from: d0, reason: collision with root package name */
    private int f3250d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f3251e0;

    /* renamed from: f0, reason: collision with root package name */
    protected int f3252f0;

    /* renamed from: g0, reason: collision with root package name */
    protected int f3253g0;

    /* renamed from: h0, reason: collision with root package name */
    private String[] f3254h0;

    /* renamed from: i0, reason: collision with root package name */
    private String[] f3255i0;

    /* renamed from: j0, reason: collision with root package name */
    private String[] f3256j0;

    /* renamed from: k0, reason: collision with root package name */
    private ArrayList f3257k0;

    /* renamed from: l0, reason: collision with root package name */
    protected HashMap f3258l0;

    /* renamed from: m0, reason: collision with root package name */
    private View f3259m0;

    /* renamed from: n0, reason: collision with root package name */
    private DropDownSelector f3260n0;

    /* renamed from: o0, reason: collision with root package name */
    private DropDownSelector f3261o0;

    /* renamed from: p0, reason: collision with root package name */
    private Button f3262p0;

    /* renamed from: q0, reason: collision with root package name */
    protected TextView f3263q0;

    /* renamed from: r0, reason: collision with root package name */
    private ListView f3264r0;

    /* renamed from: s0, reason: collision with root package name */
    private b f3265s0;

    private class b extends BaseAdapter implements C6432b.a {

        /* renamed from: a, reason: collision with root package name */
        private final LayoutInflater f3266a;

        private class a {
            public CheckBox mCb;
            public TextView mTvAmount;
            public TextView mTvInfo;

            private a() {
            }
        }

        public b() {
            this.f3266a = LayoutInflater.from(f.this.getApplicationContext());
        }

        private void a(TextView textView, RefundResponse.TicketList ticketList) {
            textView.setText(ticketList.getRefundAmount());
            textView.append(X.LF);
            if (!(f.this instanceof c)) {
                if (ticketList.getTrnRunStpCpstAmt() > 0) {
                    textView.append(N.applySpannable("(" + N.getDecimalFormatString(ticketList.getTrnRunStpCpstAmt()) + ")", new ForegroundColorSpan(Color.parseColor("#ff666666")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
                    return;
                }
                return;
            }
            int rcvdAmt = ticketList.getRcvdAmt();
            if (rcvdAmt > 0) {
                textView.append(N.applySpannable("(" + N.getDecimalFormatString(rcvdAmt) + ")", new ForegroundColorSpan(Color.parseColor("#ff666666")), new AbsoluteSizeSpan(N.dpToPx(13.0f))));
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (C6630d.isNull(f.this.f3257k0)) {
                return 0;
            }
            return f.this.f3257k0.size();
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
                aVar = new a();
                viewInflate = this.f3266a.inflate(AbstractC5957h.list_item_refund, viewGroup, false);
                aVar.mCb = (CheckBox) viewInflate.findViewById(AbstractC5955f.cb_refund);
                aVar.mTvInfo = (TextView) viewInflate.findViewById(AbstractC5955f.tv_refund_info);
                aVar.mTvAmount = (TextView) viewInflate.findViewById(AbstractC5955f.tv_refund_amount);
                viewInflate.setTag(aVar);
            } else {
                viewInflate = view;
                aVar = (a) view.getTag();
            }
            RefundResponse.TicketList item = getItem(i8);
            aVar.mTvInfo.setText(item.getRefundInfo() + X.LF + item.getRefundJrny());
            a(aVar.mTvAmount, item);
            aVar.mCb.setOnCheckedChangeListener(new C6432b(this, i8));
            aVar.mCb.setChecked(C6630d.isNull(f.this.f3258l0.get(Integer.valueOf(i8))) ^ true);
            return viewInflate;
        }

        @Override // v4.C6432b.a
        public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
            if (z8) {
                f.this.f3258l0.put(Integer.valueOf(i8), getItem(i8));
            } else {
                f.this.f3258l0.remove(Integer.valueOf(i8));
            }
            f.this.f3262p0.setEnabled(f.this.f3258l0.size() > 0);
        }

        @Override // android.widget.Adapter
        public RefundResponse.TicketList getItem(int i8) {
            return (RefundResponse.TicketList) f.this.f3257k0.get(i8);
        }
    }

    private String E0(List list) {
        return list.size() == 0 ? getString(AbstractC5959j.common_etc) : list.size() >= 2 ? getString(AbstractC5959j.refund_pay_type_mixed) : "02".equals(((RefundResponse.StlList) list.get(0)).getStlMnsCd()) ? getString(AbstractC5959j.common_credit_card) : getString(AbstractC5959j.refund_pay_type_mileage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(DialogInterface dialogInterface, int i8) {
        clearData();
        this.f3262p0.setEnabled(false);
        this.f3265s0.notifyDataSetChanged();
        D0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(DialogInterface dialogInterface, int i8) {
        clearData();
        this.f3262p0.setEnabled(false);
        this.f3265s0.notifyDataSetChanged();
        D0();
    }

    private void I0() {
        ArrayList arrayList = new ArrayList();
        int i8 = 0;
        while (true) {
            String[] strArr = this.f3256j0;
            if (i8 >= strArr.length) {
                String[] strArr2 = new String[arrayList.size()];
                this.f3255i0 = strArr2;
                arrayList.toArray(strArr2);
                return;
            } else {
                if (Integer.parseInt(C.getNumber(strArr[i8])) <= this.f3251e0) {
                    arrayList.add(this.f3256j0[i8]);
                }
                i8++;
            }
        }
    }

    private void J0() throws NumberFormatException {
        this.f3250d0 = Integer.parseInt(C6634h.getToday("yyyy"));
        this.f3251e0 = Integer.parseInt(C6634h.getToday("MM"));
        this.f3256j0 = getResources().getStringArray(AbstractC5952c.month);
        clearData();
        O0();
        L0();
    }

    private void K0() {
        this.f3260n0.setOnSelectorItemClickListener(this);
        this.f3264r0.setOnScrollListener(this);
        this.f3262p0.setOnClickListener(this);
        p0(AbstractC5955f.iv_refund_inquiry).setOnClickListener(this);
        p0(AbstractC5955f.iv_refund_info).setOnClickListener(this);
    }

    private void L0() throws NumberFormatException {
        if (C6630d.isNull(this.f3260n0)) {
            I0();
            return;
        }
        if (this.f3250d0 == Integer.parseInt(C.getNumber(this.f3260n0.getSelectItem()))) {
            I0();
        } else {
            this.f3255i0 = this.f3256j0;
        }
    }

    private void M0() {
        this.f3262p0.setText(getString(this instanceof c ? AbstractC5959j.refund_delay_request : AbstractC5959j.refund_stop_request));
    }

    private void N0() {
        this.f3259m0 = p0(AbstractC5955f.v_refund_label);
        DropDownSelector dropDownSelector = (DropDownSelector) p0(AbstractC5955f.dds_year);
        this.f3260n0 = dropDownSelector;
        dropDownSelector.setEntries(this.f3254h0, (String[]) null, 0);
        DropDownSelector dropDownSelector2 = (DropDownSelector) p0(AbstractC5955f.dds_month);
        this.f3261o0 = dropDownSelector2;
        dropDownSelector2.setEntries(this.f3255i0, (String[]) null, r1.length - 1);
        Button button = (Button) p0(AbstractC5955f.btn_refund_request);
        this.f3262p0 = button;
        button.setEnabled(false);
        this.f3263q0 = (TextView) p0(AbstractC5955f.tv_refund_label);
        ListView listView = (ListView) p0(AbstractC5955f.lv_refund);
        this.f3264r0 = listView;
        listView.setEmptyView(p0(AbstractC5955f.tv_refund_empty));
        b bVar = new b();
        this.f3265s0 = bVar;
        this.f3264r0.setAdapter((ListAdapter) bVar);
        this.f3264r0.getEmptyView().setVisibility(8);
    }

    private void O0() {
        String[] strArr = new String[2];
        this.f3254h0 = strArr;
        strArr[0] = C6634h.getToday("yyyy년");
        this.f3254h0[1] = C6634h.addYear("yyyy년", -1);
    }

    private void clearData() {
        this.f3252f0 = 1;
        this.f3257k0 = new ArrayList();
        this.f3258l0 = new HashMap();
    }

    protected void A0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RefundResponse.TicketList ticketList = (RefundResponse.TicketList) it.next();
            StringBuilder sb = new StringBuilder();
            if (arrayList.size() <= 0 || !ticketList.getReturnNo().equals(((RefundResponse.TicketList) arrayList.get(arrayList.size() - 1)).getReturnNo())) {
                sb.append(C6634h.convertFormat(ticketList.getArvDt(), "yyyyMMdd", "MM월 dd일"));
                sb.append(X.SPACE);
                sb.append("(" + E0(ticketList.getStlList()) + ")");
                ticketList.setRefundInfo(sb.toString());
                sb.setLength(0);
                sb.append(ticketList.getStlbTrnClsfNm() + X.SPACE + ticketList.getTrnNo());
                sb.append(X.LF);
                sb.append(ticketList.getDptRsStnNm() + " > " + ticketList.getArvRsStnNm());
                ticketList.setRefundJrny(sb.toString());
                sb.setLength(0);
                sb.append(N.getDecimalFormatString(this instanceof c ? ticketList.getDlayFare() : ticketList.getRcVdAmt()));
                ticketList.setRefundAmount(sb.toString());
                arrayList.add(ticketList);
            } else {
                RefundResponse.TicketList ticketList2 = (RefundResponse.TicketList) arrayList.get(arrayList.size() - 1);
                sb.append(ticketList2.getStlbTrnClsfNm() + X.SPACE + ticketList2.getTrnNo());
                sb.append(" > ");
                sb.append(ticketList.getStlbTrnClsfNm() + X.SPACE + ticketList.getTrnNo());
                sb.append(X.LF);
                sb.append(ticketList2.getDptRsStnNm() + " > ");
                sb.append(ticketList2.getArvRsStnNm() + " > ");
                if (!ticketList2.getArvRsStnNm().equals(ticketList.getDptRsStnNm())) {
                    sb.append(ticketList.getDptRsStnNm() + " > ");
                }
                sb.append(ticketList.getArvRsStnNm());
                ticketList2.setRefundJrny(sb.toString());
            }
        }
        this.f3259m0.setVisibility(0);
        this.f3257k0.addAll(arrayList);
        this.f3265s0.notifyDataSetChanged();
    }

    protected String F0() throws NumberFormatException {
        return Integer.parseInt(C.getNumber(this.f3260n0.getSelectItem())) + N.addZero(2, Integer.parseInt(C.getNumber(this.f3261o0.getSelectItem())));
    }

    @Override // com.korail.talk.view.base.a, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (C6630d.isNull(bundle)) {
            J0();
            N0();
            M0();
            K0();
        }
    }

    public void onClick(View view) {
        if (AbstractC5955f.iv_refund_inquiry == view.getId()) {
            clearData();
            this.f3262p0.setEnabled(false);
            D0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC5957h.fragment_refund, viewGroup, false);
    }

    @Override // com.korail.talk.viewGroup.DropDownSelector.b
    public void onItemSelected(DropDownSelector dropDownSelector, int i8) throws NumberFormatException {
        L0();
        int i9 = Integer.parseInt(C.getNumber(dropDownSelector.getSelectItem()));
        int i10 = Integer.parseInt(C.getNumber(this.f3261o0.getSelectItem()));
        int length = i10 - 1;
        if (this.f3250d0 == i9 && i10 > this.f3251e0) {
            length = this.f3255i0.length - 1;
        }
        this.f3261o0.setEntries(this.f3255i0, (String[]) null, length);
    }

    @Override // com.korail.talk.view.base.a
    public void onLoginFail(boolean z8) {
        super.onLoginFail(false);
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_refund_delay_list == id) {
            DelayRefundListDao.DelayRefundListResponse delayRefundListResponse = (DelayRefundListDao.DelayRefundListResponse) iBaseDao.getResponse();
            A0(delayRefundListResponse.getTicketList());
            this.f3253g0 = delayRefundListResponse.getWhlPgNum();
            return;
        }
        if (AbstractC5955f.dao_refund_delay_detail == id) {
            C0((DelayRefundCheckDao.DelayRefundCheckRequest) iBaseDao.getRequest());
            return;
        }
        if (AbstractC5955f.dao_refund_delay == id) {
            DelayRefundDao.DelayRefundRequest delayRefundRequest = (DelayRefundDao.DelayRefundRequest) iBaseDao.getRequest();
            String string = getString(AbstractC5959j.refund_delay_success_msg1);
            if (delayRefundRequest.getDlayFarePymtMtdCd().equals(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE)) {
                string = getString(AbstractC5959j.refund_delay_success_msg2);
            }
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(string).setButtonListener(new DialogInterface.OnClickListener() { // from class: N5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3248a.G0(dialogInterface, i8);
                }
            }).showDialog();
            return;
        }
        if (AbstractC5955f.dao_compensate_refund_list == id) {
            CompensateRefundListDao.CompensateRefundListResponse compensateRefundListResponse = (CompensateRefundListDao.CompensateRefundListResponse) iBaseDao.getResponse();
            A0(compensateRefundListResponse.getTicketList());
            this.f3253g0 = compensateRefundListResponse.getWhlPgNum();
        } else if (AbstractC5955f.dao_compensate_refund_detail == id) {
            B0((CompensateRefundCheckDao.CompensateRefundCheckRequest) iBaseDao.getRequest());
        } else if (AbstractC5955f.dao_compensate_refund == id) {
            C6637k.getCDialog(getActivity(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.refund_stop_success_msg)).setButtonListener(new DialogInterface.OnClickListener() { // from class: N5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f3249a.H0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }

    @Override // com.korail.talk.view.base.a, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        super.onReceiveError(iBaseDao, c6536a);
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_refund_delay_list == id || AbstractC5955f.dao_compensate_refund_list == id) {
            this.f3259m0.setVisibility(8);
            this.f3265s0.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        ListView listView = this.f3264r0;
        if (listView == null || listView.getAdapter() == null || this.f3264r0.getAdapter().getCount() <= 0 || absListView.getLastVisiblePosition() != ((ListAdapter) absListView.getAdapter()).getCount() - 1 || absListView.getChildAt(absListView.getChildCount() - 1).getBottom() > absListView.getHeight() || this.f3252f0 > this.f3253g0) {
            return;
        }
        D0();
    }

    protected void D0() {
    }

    protected void B0(CompensateRefundCheckDao.CompensateRefundCheckRequest compensateRefundCheckRequest) {
    }

    protected void C0(DelayRefundCheckDao.DelayRefundCheckRequest delayRefundCheckRequest) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i8) {
    }
}
