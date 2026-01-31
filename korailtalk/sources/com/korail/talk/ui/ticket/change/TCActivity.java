package com.korail.talk.ui.ticket.change;

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
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.ui.booking.change.TCBookingActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import z4.C6630d;
import z4.C6642p;
import z4.N;

/* loaded from: classes.dex */
public class TCActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    protected final String f28906i = "AMOUNT";

    /* renamed from: j, reason: collision with root package name */
    protected final String f28907j = "AGE_TYPE";

    /* renamed from: k, reason: collision with root package name */
    protected final String f28908k = "SEAT_NO";

    /* renamed from: l, reason: collision with root package name */
    protected ArrayList f28909l;

    /* renamed from: m, reason: collision with root package name */
    protected List f28910m;

    /* renamed from: n, reason: collision with root package name */
    protected TreeMap f28911n;

    /* renamed from: o, reason: collision with root package name */
    protected ArrayList f28912o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f28913p;

    /* renamed from: q, reason: collision with root package name */
    private Button f28914q;

    /* renamed from: r, reason: collision with root package name */
    private b f28915r;

    private class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private final int f28916d;

        /* renamed from: e, reason: collision with root package name */
        private final int f28917e;

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

        /* renamed from: com.korail.talk.ui.ticket.change.TCActivity$b$b, reason: collision with other inner class name */
        private class C0255b extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f28920u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f28921v;

            /* renamed from: w, reason: collision with root package name */
            private final TextView f28922w;

            /* renamed from: x, reason: collision with root package name */
            private final TextView f28923x;

            private Bundle G(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
                Bundle bundle = new Bundle();
                List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
                bundle.putString("AMOUNT", TCActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(ticketDetailResponse.getH_tot_rcvd_amt())));
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
                        sb2.append(TCActivity.this.getString(AbstractC5959j.ticket_handling_return_train_number, h_srcar_no, h_seat_no));
                    }
                    bundle.putString("AGE_TYPE", sb.toString());
                    bundle.putString("SEAT_NO", sb2.toString());
                }
                return bundle;
            }

            private void H() {
                this.f28920u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                if (z8) {
                    TCActivity.this.f28911n.put(Integer.valueOf(i8), b.this.c(i8));
                    TCActivity.this.f28912o.add(Integer.valueOf(i8));
                } else {
                    TCActivity.this.f28911n.remove(Integer.valueOf(i8));
                    TCActivity.this.f28912o.remove(Integer.valueOf(i8));
                }
                b.this.notifyDataSetChanged();
                TCActivity.this.f28914q.setEnabled(TCActivity.this.f28911n.size() > 0);
            }

            @Override // com.korail.talk.ui.ticket.change.TCActivity.b.a
            public void setEventListener(int i8) {
                this.f28920u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.change.TCActivity.b.a
            public void setText(int i8) {
                Bundle bundleG = G((TicketDetailDao.TicketDetailResponse) b.this.c(i8));
                this.f28921v.setText(bundleG.getString("AGE_TYPE"));
                this.f28922w.setText(bundleG.getString("SEAT_NO"));
                this.f28923x.setText(bundleG.getString("AMOUNT"));
            }

            @Override // com.korail.talk.ui.ticket.change.TCActivity.b.a
            public void setView(int i8) {
                H();
                this.f28920u.setChecked(!C6630d.isNull(TCActivity.this.f28911n.get(Integer.valueOf(i8))));
                setEventListener(i8);
            }

            private C0255b(View view) {
                super(view);
                this.f28920u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f28921v = (TextView) view.findViewById(AbstractC5955f.ageTypeTxt);
                this.f28922w = (TextView) view.findViewById(AbstractC5955f.seatNoTxt);
                this.f28923x = (TextView) view.findViewById(AbstractC5955f.sumTxt);
            }
        }

        private class c extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f28925u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f28926v;

            private void G() {
                this.f28925u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                TCActivity.this.f28911n.clear();
                TCActivity.this.f28912o.clear();
                if (z8) {
                    for (int i9 = 1; i9 < TCActivity.this.f28909l.size() + 1; i9++) {
                        TCActivity.this.f28911n.put(Integer.valueOf(i9), b.this.c(i9));
                        TCActivity.this.f28912o.add(Integer.valueOf(i9));
                    }
                }
                b.this.notifyDataSetChanged();
                TCActivity.this.f28914q.setEnabled(TCActivity.this.f28911n.size() > 0);
            }

            @Override // com.korail.talk.ui.ticket.change.TCActivity.b.a
            public void setEventListener(int i8) {
                this.f28925u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.change.TCActivity.b.a
            public void setText(int i8) {
                this.f28926v.setText((String) b.this.c(i8));
            }

            @Override // com.korail.talk.ui.ticket.change.TCActivity.b.a
            public void setView(int i8) {
                G();
                this.f28925u.setVisibility(i8 == 0 ? 0 : 4);
                if (this.f28925u.getVisibility() == 0) {
                    this.f28925u.setChecked(TCActivity.this.f28909l.size() == TCActivity.this.f28911n.size());
                }
                setEventListener(i8);
            }

            private c(View view) {
                super(view);
                this.f28925u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f28926v = (TextView) view.findViewById(AbstractC5955f.tv_title);
            }
        }

        private b() {
            this.f28916d = 0;
            this.f28917e = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return TCActivity.this.f28910m.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(TCActivity.this.f28910m)) {
                return 0;
            }
            return TCActivity.this.f28910m.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            return c(i8) instanceof TicketDetailDao.TicketDetailResponse ? 1 : 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(a aVar, int i8) {
            aVar.setView(i8);
            aVar.setText(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return i8 == 0 ? new c(LayoutInflater.from(TCActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_title, viewGroup, false)) : new C0255b(LayoutInflater.from(TCActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_ticket, viewGroup, false));
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_tc);
        this.f28913p.append(C6642p.getTrainData((TicketDetailDao.TicketDetailResponse) this.f28909l.get(0)));
    }

    private void t0() {
        this.f28910m.add(getString(AbstractC5959j.normal_ticket));
        this.f28910m.addAll(this.f28909l);
        this.f28915r.notifyDataSetChanged();
    }

    private void u0() {
        this.f28910m = new ArrayList();
        this.f28909l = (ArrayList) M(getIntent(), "TICKET_RESPONSE");
        this.f28911n = new TreeMap();
        this.f28912o = new ArrayList();
    }

    private void v0() {
        this.f28914q.setOnClickListener(this);
    }

    private void w0() {
        n0(false);
        this.f28913p = (TextView) findViewById(AbstractC5955f.tv_train_info);
        Button button = (Button) findViewById(AbstractC5955f.changeBtn);
        this.f28914q = button;
        button.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv);
        this.f28915r = new b();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(this.f28915r);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.changeBtn != view.getId()) {
            super.onClick(view);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f28911n.keySet().iterator();
        while (it.hasNext()) {
            arrayList.add((TicketDetailDao.TicketDetailResponse) this.f28911n.get((Integer) it.next()));
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TCBookingActivity.class);
        intent.putExtra("TICKET_TOTAL_COUNT", this.f28909l.size());
        intent.putExtra("TICKET_RESPONSE", arrayList);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_tc);
        if (C6630d.isNull(bundle)) {
            u0();
            w0();
            setText();
            v0();
            t0();
        }
    }
}
