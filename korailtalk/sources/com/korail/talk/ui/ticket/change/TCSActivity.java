package com.korail.talk.ui.ticket.change;

import Q7.X;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.network.dao.myTicket.TicketListDao;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.view.CCheckBox;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
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
public class TCSActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    protected final String f28928i = "AMOUNT";

    /* renamed from: j, reason: collision with root package name */
    protected final String f28929j = "AGE_TYPE";

    /* renamed from: k, reason: collision with root package name */
    protected final String f28930k = "SEAT_NO";

    /* renamed from: l, reason: collision with root package name */
    protected ArrayList f28931l;

    /* renamed from: m, reason: collision with root package name */
    protected List f28932m;

    /* renamed from: n, reason: collision with root package name */
    private TextView f28933n;

    /* renamed from: o, reason: collision with root package name */
    private Button f28934o;

    /* renamed from: p, reason: collision with root package name */
    private Button f28935p;

    /* renamed from: q, reason: collision with root package name */
    private b f28936q;

    /* JADX INFO: Access modifiers changed from: private */
    class b extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private int f28937d;

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

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.korail.talk.ui.ticket.change.TCSActivity$b$b, reason: collision with other inner class name */
        class C0256b extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CCheckBox f28940u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f28941v;

            /* renamed from: w, reason: collision with root package name */
            private final TextView f28942w;

            /* renamed from: x, reason: collision with root package name */
            private final TextView f28943x;

            private Bundle H(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
                Bundle bundle = new Bundle();
                List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
                bundle.putString("AMOUNT", TCSActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(ticketDetailResponse.getH_tot_rcvd_amt())));
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
                        sb2.append(TCSActivity.this.getString(AbstractC5959j.ticket_handling_return_train_number, h_srcar_no, h_seat_no));
                    }
                    bundle.putString("AGE_TYPE", sb.toString());
                    bundle.putString("SEAT_NO", sb2.toString());
                }
                return bundle;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void I(View view) {
                int bindingAdapterPosition = getBindingAdapterPosition();
                if (bindingAdapterPosition == -1 || bindingAdapterPosition == b.this.f28937d) {
                    return;
                }
                onCustomCheckedChanged(this.f28940u, true, bindingAdapterPosition);
            }

            private void J() {
                this.f28940u.setOnCheckedChangeListener(null);
                this.itemView.setOnClickListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                int i9 = b.this.f28937d;
                if (z8) {
                    b.this.f28937d = i8;
                    if (i9 != -1) {
                        b.this.notifyItemChanged(i9);
                    }
                    b.this.notifyItemChanged(i8);
                    TCSActivity.this.f28934o.setEnabled(b.this.f28937d != -1);
                    return;
                }
                if (i8 == b.this.f28937d) {
                    this.f28940u.setOnCheckedChangeListener(null);
                    this.f28940u.setChecked(true);
                    this.f28940u.setOnCheckedChangeListener(new C6432b(this, i8));
                }
            }

            @Override // com.korail.talk.ui.ticket.change.TCSActivity.b.a
            public void setEventListener(int i8) {
                this.f28940u.setOnCheckedChangeListener(new C6432b(this, i8));
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.korail.talk.ui.ticket.change.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28965a.I(view);
                    }
                });
            }

            @Override // com.korail.talk.ui.ticket.change.TCSActivity.b.a
            public void setText(int i8) {
                Bundle bundleH = H((TicketDetailDao.TicketDetailResponse) b.this.e(i8));
                this.f28941v.setText(bundleH.getString("AGE_TYPE"));
                this.f28942w.setText(bundleH.getString("SEAT_NO"));
                this.f28943x.setText(bundleH.getString("AMOUNT"));
            }

            @Override // com.korail.talk.ui.ticket.change.TCSActivity.b.a
            public void setView(int i8) {
                J();
                this.f28940u.setChecked(i8 == b.this.f28937d);
                setEventListener(i8);
            }

            private C0256b(View view) {
                super(view);
                this.f28940u = (CCheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f28941v = (TextView) view.findViewById(AbstractC5955f.ageTypeTxt);
                this.f28942w = (TextView) view.findViewById(AbstractC5955f.seatNoTxt);
                this.f28943x = (TextView) view.findViewById(AbstractC5955f.sumTxt);
            }
        }

        private b() {
            this.f28937d = -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object e(int i8) {
            return TCSActivity.this.f28932m.get(i8);
        }

        TicketDetailDao.TicketDetailResponse f() {
            int i8 = this.f28937d;
            if (i8 < 0 || i8 >= TCSActivity.this.f28932m.size()) {
                return null;
            }
            return (TicketDetailDao.TicketDetailResponse) TCSActivity.this.f28932m.get(this.f28937d);
        }

        void g(int i8) {
            int i9 = this.f28937d;
            this.f28937d = i8;
            if (i9 != -1) {
                notifyItemChanged(i9);
            }
            if (i8 != -1) {
                notifyItemChanged(i8);
            }
            TCSActivity.this.f28934o.setEnabled(this.f28937d != -1);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(TCSActivity.this.f28932m)) {
                return 0;
            }
            return TCSActivity.this.f28932m.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i8) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(a aVar, int i8) {
            aVar.setView(i8);
            aVar.setText(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new C0256b(LayoutInflater.from(TCSActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_seat_ticket, viewGroup, false));
        }
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_seat_change);
        this.f28933n.append(C6642p.getTrainData((TicketDetailDao.TicketDetailResponse) this.f28931l.get(0)));
    }

    private void t0() {
        ArrayList arrayList = this.f28931l;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        this.f28932m.addAll(this.f28931l);
        this.f28936q.g(0);
        this.f28934o.setEnabled(true);
        this.f28936q.notifyDataSetChanged();
    }

    private void u0() {
        this.f28932m = new ArrayList();
        this.f28931l = (ArrayList) M(getIntent(), "TICKET_RESPONSE");
    }

    private void v0() {
        this.f28934o.setOnClickListener(this);
        this.f28935p.setOnClickListener(this);
    }

    private void w0() {
        n0(false);
        this.f28933n = (TextView) findViewById(AbstractC5955f.tv_train_info);
        this.f28934o = (Button) findViewById(AbstractC5955f.changeBtn);
        this.f28935p = (Button) findViewById(AbstractC5955f.cancelBtn);
        this.f28934o.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv);
        this.f28936q = new b();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(this.f28936q);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.changeBtn != id) {
            if (AbstractC5955f.cancelBtn == id) {
                finish();
                return;
            } else {
                super.onClick(view);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        TicketDetailDao.TicketDetailResponse ticketDetailResponseF = this.f28936q.f();
        if (ticketDetailResponseF != null) {
            arrayList.add(ticketDetailResponseF);
        }
        Intent intent = new Intent(getApplicationContext(), (Class<?>) TCSOptionsActivity.class);
        intent.putExtra("TICKET_TOTAL_COUNT", this.f28931l.size());
        intent.putExtra("TICKET_RESPONSE", arrayList);
        intent.putExtra("TICKET_TRAIN_RESPONSE", (TicketListDao.TrainInfo) M(getIntent(), "TICKET_TRAIN_RESPONSE"));
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_tcs);
        if (C6630d.isNull(bundle)) {
            u0();
            w0();
            setText();
            v0();
            t0();
        }
    }
}
