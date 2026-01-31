package R5;

import F4.C0500a;
import I4.h;
import Q7.X;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.List;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.k;
import v4.e;
import z4.C6642p;
import z4.I;
import z4.N;

/* loaded from: classes.dex */
public class c extends a implements e.a {

    /* renamed from: v, reason: collision with root package name */
    private TextView f4455v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f4456w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f4457x;

    /* renamed from: y, reason: collision with root package name */
    private View f4458y;

    public c(P5.d dVar, View view) {
        super(dVar, view);
    }

    private k M() {
        return this.f4448u.getReservationType();
    }

    private boolean N() {
        return this.f4448u.isLinkageReservation();
    }

    private boolean O() {
        return this.f4448u.isWait();
    }

    private void P() {
        int i8 = 8;
        if (!h.getInstance().isNonMember() && k.TICKET_CHANGE != M()) {
            i8 = 0;
        }
        this.f4458y.findViewById(AbstractC5955f.btn_reservation_confirm_reservation_basket).setVisibility(i8);
    }

    private void Q() {
        this.f4458y.setVisibility((O() || N()) ? 8 : 0);
    }

    private void R() {
        TextView textView = (TextView) this.f4458y.findViewById(AbstractC5955f.btn_reservation_confirm_reservation_cancel);
        if (k.TICKET_CHANGE == M()) {
            textView.setText(AbstractC5959j.reserved_ticket_reservation_change_cancel);
        } else {
            textView.setText(AbstractC5959j.reserved_ticket_reservation_cancel);
        }
        textView.setVisibility(0);
    }

    @Override // v4.e.a
    public void onCustomClick(View view, Q5.b bVar, int i8) {
        ReservationResponse reservationResponse = bVar.getReservationResponse();
        int id = view.getId();
        if (AbstractC5955f.btn_reservation_confirm_reservation_cancel != id) {
            if (AbstractC5955f.btn_reservation_confirm_reservation_basket == id) {
                this.f4448u.executeAddCart(reservationResponse);
            }
        } else if (!h.getInstance().isLogin()) {
            L(0);
        } else if (k.TICKET_CHANGE == M()) {
            this.f4448u.executeTicketChangeCancel(reservationResponse);
        } else {
            this.f4448u.executeRsvCancel(reservationResponse);
        }
    }

    @Override // R5.a
    public void setEventListener(Q5.b bVar, int i8) {
        this.f4458y.findViewById(AbstractC5955f.btn_reservation_confirm_reservation_cancel).setOnClickListener(new v4.e(this, bVar, i8));
        this.f4458y.findViewById(AbstractC5955f.btn_reservation_confirm_reservation_basket).setOnClickListener(new v4.e(this, bVar, i8));
    }

    @Override // R5.a
    public void setText(Q5.b bVar, int i8) throws IllegalAccessException, NoSuchMethodException, SecurityException, ParseException, IllegalArgumentException, InvocationTargetException {
        ReservationResponse reservationResponse = bVar.getReservationResponse();
        List<ReservationResponse.JrnyInfo> jrny_info = reservationResponse.getJrny_infos().getJrny_info();
        this.f4455v.setText(C6642p.getDate(reservationResponse));
        this.f4456w.setText(C6642p.getTicketCount(G(), M(), reservationResponse));
        int i9 = 0;
        while (true) {
            if (i9 >= jrny_info.size()) {
                break;
            }
            ReservationResponse.JrnyInfo jrnyInfo = jrny_info.get(i9);
            boolean zIsLimousine = C0500a.isLimousine(jrny_info);
            this.f4457x.append(C6642p.getTrainRoute(jrnyInfo));
            if (!zIsLimousine) {
                this.f4457x.append(X.LF);
            }
            if (O()) {
                this.f4457x.append(N.applySpannable(H(AbstractC5959j.inquiry_reservation_dialog_no_result), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.tomato))));
                break;
            }
            if (!zIsLimousine) {
                this.f4457x.append(C6642p.getSeat(G(), jrnyInfo));
                if (i9 < jrny_info.size() - 1) {
                    this.f4457x.append(X.LF);
                }
            }
            i9++;
        }
        if (O()) {
            return;
        }
        String limit = C6642p.getLimit(reservationResponse);
        if (N.isNotNull(limit)) {
            this.f4457x.append(X.LF);
            this.f4457x.append(N.applySpannable(H(AbstractC5959j.reserved_ticket_pay_deadline_pre), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.tomato))));
            this.f4457x.append(X.LF);
            this.f4457x.append(N.applySpannable(I(AbstractC5959j.reserved_ticket_pay_deadline_content, limit), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.tomato))));
            this.f4457x.append(X.LF);
            this.f4457x.append(N.applySpannable(H(AbstractC5959j.reserved_ticket_pay_deadline_desc), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.tomato))));
        }
        this.f4458y.findViewById(AbstractC5955f.btn_reservation_confirm_reservation_basket).setEnabled(true);
        if (reservationResponse.getH_payment_flg() == null || !reservationResponse.getH_payment_flg().equals("N")) {
            return;
        }
        this.f4458y.findViewById(AbstractC5955f.btn_reservation_confirm_reservation_basket).setEnabled(false);
    }

    @Override // R5.a
    public void setView(Q5.b bVar, int i8) {
        this.f4455v = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_reservation_date);
        this.f4456w = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_reservation_count);
        this.f4457x = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_reservation_jrny);
        this.f4458y = this.itemView.findViewById(AbstractC5955f.v_reservation_confirm_reservation_bottom);
        Q();
        R();
        P();
    }
}
