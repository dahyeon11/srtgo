package com.korail.talk.ui.ticket.ticketReturn;

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
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import v4.C6432b;
import z4.C6630d;
import z4.C6634h;
import z4.N;

/* loaded from: classes.dex */
public class LimousineReturnActivity extends com.korail.talk.ui.ticket.ticketReturn.a {

    /* renamed from: A, reason: collision with root package name */
    private Button f29197A;

    /* renamed from: B, reason: collision with root package name */
    private b f29198B;

    /* renamed from: z, reason: collision with root package name */
    private TextView f29199z;

    private class b extends RecyclerView.h {

        public class a extends RecyclerView.E {
            protected abstract void setText(int i8);

            protected abstract void setView(int i8);

            private a(View view) {
                super(view);
            }
        }

        /* renamed from: com.korail.talk.ui.ticket.ticketReturn.LimousineReturnActivity$b$b, reason: collision with other inner class name */
        private class C0259b extends a implements C6432b.a {

            /* renamed from: u, reason: collision with root package name */
            private final CheckBox f29202u;

            /* renamed from: v, reason: collision with root package name */
            private final TextView f29203v;

            /* renamed from: w, reason: collision with root package name */
            private final TextView f29204w;

            /* renamed from: x, reason: collision with root package name */
            private final TextView f29205x;

            /* renamed from: y, reason: collision with root package name */
            private final TextView f29206y;

            private Bundle G(TicketDetailDao.TicketDetailResponse ticketDetailResponse) {
                Bundle bundle = new Bundle();
                List<TicketDetailDao.TicketInfo> ticket_info = ticketDetailResponse.getTicket_infos().getTicket_info();
                bundle.putString("AMOUNT", LimousineReturnActivity.this.getString(AbstractC5959j.common_amount, N.getDecimalFormatString(ticketDetailResponse.getH_tot_rcvd_amt())));
                bundle.putString("START_STATION_NM", ticket_info.get(0).getH_dpt_rs_stn_nm());
                bundle.putString("ARRIVAL_STATION_NM", ticket_info.get(0).getH_arv_rs_stn_nm());
                bundle.putString("SEAT_TOTAL_COUNT", String.valueOf(ticket_info.get(0).getTk_seat_info().size()));
                return bundle;
            }

            private void H() {
                this.f29202u.setOnCheckedChangeListener(null);
            }

            @Override // v4.C6432b.a
            public void onCustomCheckedChanged(CompoundButton compoundButton, boolean z8, int i8) {
                if (z8) {
                    LimousineReturnActivity.this.f29243u.put(Integer.valueOf(i8), b.this.c(i8));
                    LimousineReturnActivity.this.f29244v.add(Integer.valueOf(i8));
                } else {
                    LimousineReturnActivity.this.f29243u.remove(Integer.valueOf(i8));
                    LimousineReturnActivity.this.f29244v.remove(Integer.valueOf(i8));
                }
                b.this.notifyDataSetChanged();
                LimousineReturnActivity.this.f29197A.setEnabled(LimousineReturnActivity.this.f29243u.size() > 0 || LimousineReturnActivity.this.f29245w.size() > 0);
            }

            protected void setEventListener(int i8) {
                this.f29202u.setOnCheckedChangeListener(new C6432b(this, i8));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.LimousineReturnActivity.b.a
            protected void setText(int i8) {
                Bundle bundleG = G((TicketDetailDao.TicketDetailResponse) b.this.c(i8));
                this.f29203v.setText(bundleG.getString("START_STATION_NM"));
                this.f29204w.setText(bundleG.getString("ARRIVAL_STATION_NM"));
                this.f29205x.setText(bundleG.getString("SEAT_TOTAL_COUNT"));
                this.f29206y.setText(bundleG.getString("AMOUNT"));
            }

            @Override // com.korail.talk.ui.ticket.ticketReturn.LimousineReturnActivity.b.a
            protected void setView(int i8) {
                H();
                this.f29202u.setChecked(!C6630d.isNull(LimousineReturnActivity.this.f29243u.get(Integer.valueOf(i8))));
                setEventListener(i8);
            }

            private C0259b(View view) {
                super(view);
                this.f29202u = (CheckBox) view.findViewById(AbstractC5955f.cb_product);
                this.f29203v = (TextView) view.findViewById(AbstractC5955f.start_station_nm);
                this.f29204w = (TextView) view.findViewById(AbstractC5955f.arrival_station_nm);
                this.f29205x = (TextView) view.findViewById(AbstractC5955f.seat_total_count);
                this.f29206y = (TextView) view.findViewById(AbstractC5955f.sumTxt);
            }
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(int i8) {
            return LimousineReturnActivity.this.f29242t.get(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (C6630d.isNull(LimousineReturnActivity.this.f29242t)) {
                return 0;
            }
            return LimousineReturnActivity.this.f29242t.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(a aVar, int i8) {
            aVar.setView(i8);
            aVar.setText(i8);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new C0259b(LayoutInflater.from(LimousineReturnActivity.this.getApplicationContext()).inflate(AbstractC5957h.list_item_limousine_ticket, viewGroup, false));
        }
    }

    private void X0() {
        this.f29242t.addAll(this.f29240r);
        this.f29198B.notifyDataSetChanged();
    }

    private void Y0() {
        this.f29197A.setOnClickListener(this);
    }

    private void Z0() {
        m0();
        this.f29199z = (TextView) findViewById(AbstractC5955f.tv_train_info);
        Button button = (Button) findViewById(AbstractC5955f.returnBtn);
        this.f29197A = button;
        button.setEnabled(false);
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv);
        this.f29198B = new b();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(this.f29198B);
    }

    private void setText() {
        setAppTitle(AbstractC5959j.common_ticket_return);
        TicketDetailDao.TicketInfo ticketInfo = ((TicketDetailDao.TicketDetailResponse) this.f29240r.get(0)).getTicket_infos().getTicket_info().get(0);
        this.f29199z.append(C6634h.convertFormat(ticketInfo.getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        this.f29199z.append(", ");
        this.f29199z.append(getString(AbstractC5959j.return_limousine_info, Integer.valueOf(ticketInfo.getTk_seat_info().size())));
    }

    @Override // com.korail.talk.ui.ticket.ticketReturn.a, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_limousine_return);
        if (C6630d.isNull(bundle)) {
            Z0();
            setText();
            Y0();
            X0();
        }
    }
}
