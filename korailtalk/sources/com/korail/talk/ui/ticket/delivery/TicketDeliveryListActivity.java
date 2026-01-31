package com.korail.talk.ui.ticket.delivery;

import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.dao.giftInfo.TicketPresentDao;
import com.korail.talk.network.dao.giftInfo.TicketPresentDao.TicketPresentParams;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import com.korail.talk.ui.delivery.DeliveryActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import z4.C6630d;
import z4.C6642p;
import z4.N;

/* loaded from: classes.dex */
public class TicketDeliveryListActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private final int f29026i = 100;

    /* renamed from: j, reason: collision with root package name */
    private final String f29027j = "AGE_TYPE";

    /* renamed from: k, reason: collision with root package name */
    private final String f29028k = "SEAT_NO";

    /* renamed from: l, reason: collision with root package name */
    private final String f29029l = "AMOUNT";

    /* renamed from: m, reason: collision with root package name */
    private ArrayList f29030m;

    /* renamed from: n, reason: collision with root package name */
    private List f29031n;

    /* renamed from: o, reason: collision with root package name */
    private HashMap f29032o;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f29033p;

    /* renamed from: q, reason: collision with root package name */
    private RecyclerView f29034q;

    /* renamed from: r, reason: collision with root package name */
    private b f29035r;

    /* renamed from: s, reason: collision with root package name */
    private Button f29036s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f29037t;

    private class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f29038d;

        /* renamed from: e, reason: collision with root package name */
        private final int f29039e;

        /* renamed from: f, reason: collision with root package name */
        private final int f29040f;

        public class a extends RecyclerView.E {
            public void setEventListener(int i8) {
            }

            public void setText(int i8) {
            }

            public void setView(int i8) {
            }

            private a(View view) {
                super(view);
            }
        }

        /* renamed from: com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity$b$b, reason: collision with other inner class name */
        private class C0258b extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f29043u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f29044v;

            /* renamed from: w, reason: collision with root package name */
            private final TextView f29045w;

            /* renamed from: x, reason: collision with root package name */
            private final TextView f29046x;

            private Bundle G(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
                Bundle bundle = new Bundle();
                List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
                bundle.putString("AMOUNT", TicketDeliveryListActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(ticketDetailResponse.getH_tot_rcvd_amt())));
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                Iterator<TicketDetailDao.TicketInfo> it = ticket_info.iterator();
                while (it.hasNext()) {
                    for (TicketDetailDao.TicketSeatInfo ticketSeatInfo : it.next().getTk_seat_info()) {
                        if (sb.length() > 0) {
                            sb.append(X.LF);
                        }
                        sb.append((A4.a.isApplyDiscount(ticketSeatInfo.getH_dcnt_knd_cd()) && N.isNotNull(ticketSeatInfo.getH_dcnt_knd_nm())) ? ticketSeatInfo.getH_dcnt_knd_nm() : ticketSeatInfo.getH_psg_tp_nm());
                        String h_srcar_no = ticketSeatInfo.getH_srcar_no();
                        String h_seat_no = ticketSeatInfo.getH_seat_no();
                        if (sb2.length() > 0) {
                            sb2.append(X.LF);
                        }
                        sb2.append(TicketDeliveryListActivity.this.getString(AbstractC5959j.ticket_handling_return_train_number, h_srcar_no, h_seat_no));
                    }
                    bundle.putString("AGE_TYPE", sb.toString());
                    bundle.putString("SEAT_NO", sb2.toString());
                }
                return bundle;
            }

            private void H() {
                this.f29043u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                if (z8) {
                    TicketDeliveryListActivity.this.f29032o.put(Integer.valueOf(i8), b.this.c(i8));
                    TicketDeliveryListActivity.this.f29033p.add(Integer.valueOf(i8));
                } else {
                    TicketDeliveryListActivity.this.f29032o.remove(Integer.valueOf(i8));
                    TicketDeliveryListActivity.this.f29033p.remove(Integer.valueOf(i8));
                }
                b.this.notifyDataSetChanged();
                TicketDeliveryListActivity.this.f29036s.setEnabled(TicketDeliveryListActivity.this.f29032o.size() > 0);
            }

            @Override // com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity.b.a
            public void setEventListener(int i8) {
                this.f29043u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity.b.a
            public void setText(int i8) {
                Bundle bundleG = G((TicketDetailDao.TicketDetailResponse) b.this.c(i8));
                this.f29044v.setText(bundleG.getString("AGE_TYPE"));
                this.f29045w.setText(bundleG.getString("SEAT_NO"));
                this.f29046x.setText(bundleG.getString("AMOUNT"));
            }

            @Override // com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity.b.a
            public void setView(int i8) {
                H();
                this.f29043u.setChecked(!C6630d.isNull(TicketDeliveryListActivity.this.f29032o.get(Integer.valueOf(i8))));
                setEventListener(i8);
            }

            private C0258b(View view) {
                super(view);
                this.f29043u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f29044v = (TextView) view.findViewById(AbstractC5955f.ageTypeTxt);
                this.f29045w = (TextView) view.findViewById(AbstractC5955f.seatNoTxt);
                this.f29046x = (TextView) view.findViewById(AbstractC5955f.sumTxt);
            }
        }

        private class c extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f29048u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f29049v;

            private void G() {
                this.f29048u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                TicketDeliveryListActivity.this.f29032o.clear();
                TicketDeliveryListActivity.this.f29033p.clear();
                if (z8) {
                    for (int i9 = 1; i9 < TicketDeliveryListActivity.this.f29030m.size() + 1; i9++) {
                        TicketDeliveryListActivity.this.f29032o.put(Integer.valueOf(i9), b.this.c(i9));
                        TicketDeliveryListActivity.this.f29033p.add(Integer.valueOf(i9));
                    }
                }
                b.this.notifyDataSetChanged();
                TicketDeliveryListActivity.this.f29036s.setEnabled(TicketDeliveryListActivity.this.f29032o.size() > 0);
            }

            @Override // com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity.b.a
            public void setEventListener(int i8) {
                this.f29048u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity.b.a
            public void setText(int i8) {
                this.f29049v.setText((String) b.this.c(i8));
            }

            @Override // com.korail.talk.ui.ticket.delivery.TicketDeliveryListActivity.b.a
            public void setView(int i8) {
                G();
                this.f29048u.setVisibility(i8 == 0 ? 0 : 4);
                if (this.f29048u.getVisibility() == 0) {
                    this.f29048u.setChecked(TicketDeliveryListActivity.this.f29030m.size() == TicketDeliveryListActivity.this.f29032o.size());
                }
                setEventListener(i8);
            }

            private c(View view) {
                super(view);
                this.f29048u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f29049v = (TextView) view.findViewById(AbstractC5955f.tv_title);
            }
        }

        private b() {
            this.f29038d = 0;
            this.f29039e = 1;
            this.f29040f = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return TicketDeliveryListActivity.this.f29031n.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(TicketDeliveryListActivity.this.f29031n)) {
                return 0;
            }
            return TicketDeliveryListActivity.this.f29031n.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            Object objC = c(i8);
            if (objC instanceof TicketDetailDao.TicketDetailResponse) {
                return 1;
            }
            return objC instanceof ExtraProductInfo.AddSrvInfo ? 2 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(a aVar, int i8) {
            aVar.setView(i8);
            aVar.setText(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            a c0258b;
            if (i8 == 0) {
                c0258b = new c(LayoutInflater.from(TicketDeliveryListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_title, viewGroup, false));
            } else {
                if (i8 != 1) {
                    return null;
                }
                c0258b = new C0258b(LayoutInflater.from(TicketDeliveryListActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_ticket, viewGroup, false));
            }
            return c0258b;
        }
    }

    private void A0() {
        this.f29036s.setOnClickListener(this);
    }

    private void B0() {
        m0();
        this.f29037t = (TextView) findViewById(AbstractC5955f.tv_train_info);
        Button button = (Button) findViewById(AbstractC5955f.sendBtn);
        this.f29036s = button;
        button.setEnabled(false);
        this.f29034q = (RecyclerView) findViewById(AbstractC5955f.rv);
        this.f29035r = new b();
        this.f29034q.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        this.f29034q.setAdapter(this.f29035r);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.ticket_handling_return_ticket_return);
        this.f29037t.append(C6642p.getTrainData((TicketDetailDao.TicketDetailResponse) this.f29030m.get(0)));
    }

    private void x0() {
        this.f29031n.add(getString(AbstractC5959j.normal_ticket));
        this.f29031n.addAll(this.f29030m);
        this.f29035r.notifyDataSetChanged();
    }

    private TicketPresentDao.TicketPresentRequest y0() throws NumberFormatException {
        TicketPresentDao.TicketPresentRequest ticketPresentRequest = new TicketPresentDao.TicketPresentRequest();
        ticketPresentRequest.setHidInfoInpDvCd(TicketPresentDao.DEFAULT_HID_INFO_INP_DV_CD);
        int i8 = 0;
        ticketPresentRequest.setHidPnrNo(((TicketDetailDao.TicketDetailResponse) this.f29030m.get(0)).getH_pnr_no());
        ticketPresentRequest.setHidSaleCnt(String.valueOf(this.f29033p.size()));
        ticketPresentRequest.setHidRsvChgNo(getIntent().getStringExtra("NUMBER_RESERVATION_CHANGES"));
        TicketPresentDao.TicketPresentParams ticketPresentParams = new TicketPresentDao().new TicketPresentParams();
        int i9 = 0;
        while (i8 < this.f29033p.size()) {
            TicketDetailDao.TicketDetailResponse ticketDetailResponse = (TicketDetailDao.TicketDetailResponse) this.f29032o.get(this.f29033p.get(i8));
            String h_orgtk_wct_no = ticketDetailResponse.getH_orgtk_wct_no();
            String h_sale_dt = ticketDetailResponse.getH_sale_dt();
            String h_orgtk_sale_sqno = ticketDetailResponse.getH_orgtk_sale_sqno();
            String h_orgtk_ret_pwd = ticketDetailResponse.getH_orgtk_ret_pwd();
            i8++;
            ticketPresentParams.setHidSaleWctNo(i8, h_orgtk_wct_no);
            ticketPresentParams.setHidSaleDt(i8, h_sale_dt);
            ticketPresentParams.setHidSaleSqno(i8, h_orgtk_sale_sqno);
            ticketPresentParams.setHidRetPwd(i8, h_orgtk_ret_pwd);
            i9 = Integer.parseInt(ticketDetailResponse.getH_tot_rcvd_amt());
        }
        ticketPresentRequest.setHidTotNewStlAmt(String.valueOf(i9));
        ticketPresentRequest.setTicketPresentParams(ticketPresentParams);
        return ticketPresentRequest;
    }

    private void z0() {
        this.f29030m = (ArrayList) M(getIntent(), "TICKET_RESPONSE");
        this.f29031n = new ArrayList();
        this.f29032o = new HashMap();
        this.f29033p = new ArrayList();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i9 == -1 && i8 == 100) {
            setResult(-1);
            finish();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        O(view);
        if (AbstractC5955f.sendBtn != view.getId()) {
            super.onClick(view);
            return;
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) DeliveryActivity.class);
        intent.putExtra("PRESENT_REQUEST", y0());
        intent.putExtra("PRESENT_JRNY_INFO", N(this.f29037t));
        intent.putExtra("PRESENT_NCARD_ADD_USER_FLAG", ((TicketDetailDao.TicketDetailResponse) this.f29030m.get(0)).getPbpAcepPsQryFl());
        startActivityForResult(intent, 100);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_send_list);
        if (C6630d.isNull(bundle)) {
            z0();
            B0();
            setText();
            A0();
            x0();
        }
    }
}
