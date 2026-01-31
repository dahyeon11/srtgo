package com.korail.talk.ui.ticket.ticketReturn;

import Q7.X;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.addService.AdditionalServiceDao;
import com.korail.talk.network.dao.addService.ExtraProductListDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.network.data.addService.ExtraProductInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5954e;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import z4.C6630d;
import z4.C6637k;
import z4.C6642p;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TicketReturnActivity extends com.korail.talk.ui.ticket.ticketReturn.a {

    /* renamed from: A, reason: collision with root package name */
    private Button f29208A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f29209B;

    /* renamed from: z, reason: collision with root package name */
    private b f29210z;

    private class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f29211d;

        /* renamed from: e, reason: collision with root package name */
        private final int f29212e;

        /* renamed from: f, reason: collision with root package name */
        private final int f29213f;

        public class a extends RecyclerView.E {
            protected abstract void setText(int i8);

            protected abstract void setView(int i8);

            private a(View view) {
                super(view);
            }
        }

        /* renamed from: com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity$b$b, reason: collision with other inner class name */
        private class C0260b extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f29216u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f29217v;

            /* renamed from: w, reason: collision with root package name */
            private final TextView f29218w;

            /* renamed from: x, reason: collision with root package name */
            private final TextView f29219x;

            private void G() {
                this.f29216u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                if (z8 && TicketReturnActivity.this.f29245w.size() >= 20) {
                    G();
                    compoundButton.setChecked(false);
                    setEventListener(i8);
                    C6637k.getCDialog(TicketReturnActivity.this.K(), 1001, 0, TicketReturnActivity.this.getString(AbstractC5959j.dialog_title)).setContent(TicketReturnActivity.this.getString(AbstractC5959j.dialog_extra_product_max_msg)).showDialog();
                    return;
                }
                if (z8) {
                    TicketReturnActivity.this.f29245w.put(Integer.valueOf(i8), b.this.c(i8));
                } else {
                    TicketReturnActivity.this.f29245w.remove(Integer.valueOf(i8));
                }
                b.this.notifyDataSetChanged();
                TicketReturnActivity.this.f29208A.setEnabled(TicketReturnActivity.this.f29243u.size() > 0 || TicketReturnActivity.this.f29245w.size() > 0);
            }

            protected void setEventListener(int i8) {
                this.f29216u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity.b.a
            protected void setText(int i8) {
                ExtraProductInfo.AddSrvInfo addSrvInfo = (ExtraProductInfo.AddSrvInfo) b.this.c(i8);
                this.f29217v.setText(TicketReturnActivity.this.getString(AbstractC5959j.return_product_information, addSrvInfo.getSpvsRsStnCdNm(), addSrvInfo.getAddSrvMrkEntNm(), addSrvInfo.getAddSrvNm()));
                this.f29218w.setText(N.getIntegerString(addSrvInfo.getReqQnty()));
                this.f29219x.setText(N.getInteger(addSrvInfo.getAddSrvUtlAmt()) == 0 ? TicketReturnActivity.this.getString(AbstractC5959j.common_other_payment) : TicketReturnActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(addSrvInfo.getAddSrvUtlAmt())));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity.b.a
            protected void setView(int i8) {
                if (TicketReturnActivity.this.f29243u.size() <= 0 || TicketReturnActivity.this.f29243u.size() >= TicketReturnActivity.this.f29240r.size()) {
                    this.f29216u.setCompoundDrawablesWithIntrinsicBounds(AbstractC5954e.selector_checkbox_blue, 0, 0, 0);
                } else {
                    this.f29216u.setCompoundDrawablesWithIntrinsicBounds(AbstractC5954e.check_nor_dim, 0, 0, 0);
                }
                this.f29216u.setEnabled(TicketReturnActivity.this.f29243u.size() == 0);
                G();
                if (this.f29216u.isEnabled()) {
                    this.f29216u.setChecked(!C6630d.isNull(TicketReturnActivity.this.f29245w.get(Integer.valueOf(i8))));
                }
                setEventListener(i8);
            }

            private C0260b(View view) {
                super(view);
                this.f29216u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f29217v = (TextView) view.findViewById(AbstractC5955f.tv_product_info);
                this.f29218w = (TextView) view.findViewById(AbstractC5955f.tv_product_count);
                this.f29219x = (TextView) view.findViewById(AbstractC5955f.tv_product_amount);
            }
        }

        private class c extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f29221u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f29222v;

            /* renamed from: w, reason: collision with root package name */
            private final TextView f29223w;

            /* renamed from: x, reason: collision with root package name */
            private final TextView f29224x;

            private Bundle G(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
                Bundle bundle = new Bundle();
                List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
                bundle.putString("AMOUNT", TicketReturnActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(ticketDetailResponse.getH_tot_rcvd_amt())));
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
                        sb2.append(TicketReturnActivity.this.getString(AbstractC5959j.ticket_handling_return_train_number, h_srcar_no, h_seat_no));
                    }
                    bundle.putString("AGE_TYPE", sb.toString());
                    bundle.putString("SEAT_NO", sb2.toString());
                }
                return bundle;
            }

            private void H() {
                this.f29221u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                if (z8) {
                    TicketReturnActivity.this.f29243u.put(Integer.valueOf(i8), b.this.c(i8));
                    TicketReturnActivity.this.f29244v.add(Integer.valueOf(i8));
                } else {
                    TicketReturnActivity.this.f29243u.remove(Integer.valueOf(i8));
                    TicketReturnActivity.this.f29244v.remove(Integer.valueOf(i8));
                }
                b.this.notifyDataSetChanged();
                TicketReturnActivity.this.f29208A.setEnabled(TicketReturnActivity.this.f29243u.size() > 0 || TicketReturnActivity.this.f29245w.size() > 0);
            }

            protected void setEventListener(int i8) {
                this.f29221u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity.b.a
            protected void setText(int i8) {
                Bundle bundleG = G((TicketDetailDao.TicketDetailResponse) b.this.c(i8));
                this.f29221u.setContentDescription(bundleG.getString("AGE_TYPE") + bundleG.getString("SEAT_NO") + bundleG.getString("AMOUNT"));
                this.f29222v.setText(bundleG.getString("AGE_TYPE"));
                this.f29222v.setContentDescription(bundleG.getString("AGE_TYPE"));
                this.f29223w.setText(bundleG.getString("SEAT_NO"));
                this.f29223w.setContentDescription(bundleG.getString("SEAT_NO"));
                this.f29224x.setText(bundleG.getString("AMOUNT"));
                this.f29224x.setContentDescription(bundleG.getString("AMOUNT"));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity.b.a
            protected void setView(int i8) {
                H();
                this.f29221u.setChecked(!C6630d.isNull(TicketReturnActivity.this.f29243u.get(Integer.valueOf(i8))));
                setEventListener(i8);
            }

            private c(View view) {
                super(view);
                this.f29221u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f29222v = (TextView) view.findViewById(AbstractC5955f.ageTypeTxt);
                this.f29223w = (TextView) view.findViewById(AbstractC5955f.seatNoTxt);
                this.f29224x = (TextView) view.findViewById(AbstractC5955f.sumTxt);
            }
        }

        private class d extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f29226u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f29227v;

            private void G() {
                this.f29226u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                TicketReturnActivity.this.f29243u.clear();
                TicketReturnActivity.this.f29244v.clear();
                boolean z9 = true;
                if (z8) {
                    for (int i9 = 1; i9 < TicketReturnActivity.this.f29240r.size() + 1; i9++) {
                        TicketReturnActivity.this.f29243u.put(Integer.valueOf(i9), b.this.c(i9));
                        TicketReturnActivity.this.f29244v.add(Integer.valueOf(i9));
                    }
                }
                b.this.notifyDataSetChanged();
                Button button = TicketReturnActivity.this.f29208A;
                if (TicketReturnActivity.this.f29243u.size() <= 0 && TicketReturnActivity.this.f29245w.size() <= 0) {
                    z9 = false;
                }
                button.setEnabled(z9);
            }

            protected void setEventListener(int i8) {
                this.f29226u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity.b.a
            protected void setText(int i8) {
                String str = (String) b.this.c(i8);
                this.f29227v.setText(str);
                this.f29226u.setContentDescription("전체 승차권");
                this.f29227v.setContentDescription(str);
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.TicketReturnActivity.b.a
            protected void setView(int i8) {
                G();
                this.f29226u.setVisibility(i8 == 0 ? 0 : 4);
                if (this.f29226u.getVisibility() == 0) {
                    this.f29226u.setChecked(TicketReturnActivity.this.f29240r.size() == TicketReturnActivity.this.f29243u.size());
                }
                setEventListener(i8);
            }

            private d(View view) {
                super(view);
                this.f29226u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f29227v = (TextView) view.findViewById(AbstractC5955f.tv_title);
            }
        }

        private b() {
            this.f29211d = 0;
            this.f29212e = 1;
            this.f29213f = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return TicketReturnActivity.this.f29242t.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(TicketReturnActivity.this.f29242t)) {
                return 0;
            }
            return TicketReturnActivity.this.f29242t.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            Object objC = c(i8);
            if (objC instanceof String) {
                return 0;
            }
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
            return i8 == 0 ? new d(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.list_item_title, viewGroup, false)) : 1 == i8 ? new c(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.list_item_ticket, viewGroup, false)) : 2 == i8 ? new C0260b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.list_item_extra_product, viewGroup, false)) : new d(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.list_item_title, viewGroup, false));
        }
    }

    private void Z0() {
        this.f29242t.add(getString(AbstractC5959j.normal_ticket));
        this.f29242t.addAll(this.f29240r);
        this.f29210z.notifyDataSetChanged();
        try {
            if (((TicketDetailDao.TicketDetailResponse) this.f29240r.get(0)).getAddSrvList().getPnrList().get(0).getAddSrvList().size() > 0) {
                findViewById(AbstractC5955f.v_extra_product).setVisibility(0);
                new Handler().postDelayed(new Runnable() { // from class: com.korail.talk.ui.ticket.ticketReturn.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f29249a.E0();
                    }
                }, 100L);
            }
        } catch (IndexOutOfBoundsException e8) {
            t.e(e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a1(DialogInterface dialogInterface, int i8) {
        setResult(-1);
        finish();
    }

    private void b1() {
        this.f29208A.setOnClickListener(this);
    }

    private void c1() {
        m0();
        this.f29209B = (TextView) findViewById(AbstractC5955f.tv_train_info);
        Button button = (Button) findViewById(AbstractC5955f.returnBtn);
        this.f29208A = button;
        button.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv);
        this.f29210z = new b();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(this.f29210z);
    }

    private void setText() {
        setAppTitle(getIntent().getBooleanExtra("IS_DELIVERED", false) ? AbstractC5959j.common_delivery_ticket_return : AbstractC5959j.common_ticket_return);
        this.f29209B.append(C6642p.getTrainData((TicketDetailDao.TicketDetailResponse) this.f29240r.get(0)));
    }

    @Override // com.korail.talk.ui.ticket.ticketReturn.a, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.ticket_return_activity);
        if (C6630d.isNull(bundle)) {
            c1();
            setText();
            b1();
            Z0();
        }
    }

    @Override // com.korail.talk.ui.ticket.ticketReturn.a, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        int id = iBaseDao.getId();
        if (AbstractC5955f.dao_extra_product_list == id) {
            List<ExtraProductInfo> pnrList = ((ExtraProductListDao.ExtraProductListResponse) iBaseDao.getResponse()).getPnrList();
            this.f29242t.add(getString(AbstractC5959j.common_product));
            Iterator<ExtraProductInfo> it = pnrList.iterator();
            while (it.hasNext()) {
                this.f29242t.addAll(it.next().getAddSrvList());
            }
            this.f29210z.notifyDataSetChanged();
            return;
        }
        if (AbstractC5955f.dao_additional_service != id) {
            super.onReceive(iBaseDao);
            return;
        }
        Iterator<AdditionalServiceDao.OutRec2> it2 = ((AdditionalServiceDao.AdditionalServiceResponse) iBaseDao.getResponse()).getOutrec2().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next().getStlMnsCd().equals("13")) {
                C6630d.syncRailPlus(getApplicationContext());
                break;
            }
        }
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.ticket_handling_return_refund_complete)).setContent(getString(AbstractC5959j.ticket_handling_return_extra_product_complete)).setButtonListener(new DialogInterface.OnClickListener() { // from class: l6.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33992a.a1(dialogInterface, i8);
            }
        }).showDialog();
    }
}
