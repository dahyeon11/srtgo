package R5;

import Q7.X;
import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.dao.research.NCardReservationDao;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6634h;
import z4.I;
import z4.N;

/* loaded from: classes.dex */
public class e extends a {

    /* renamed from: v, reason: collision with root package name */
    private TextView f4461v;

    public e(P5.d dVar, View view) {
        super(dVar, view);
    }

    @Override // R5.a
    public void setText(Q5.b bVar, int i8) {
        NCardReservationDao.NCardReservationResponse nCardReservationResponse = bVar.getNCardReservationResponse();
        this.f4461v.setText(N.applySpannable(C6634h.convertFormat(nCardReservationResponse.getVlidTrmStDt(), "yyyyMMdd", "yyyy년 MM월 dd일") + " ~ " + C6634h.convertFormat(nCardReservationResponse.getVlidTrmClsDt(), "yyyyMMdd", "yyyy년 MM월 dd일"), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.ocean_blue))));
        this.f4461v.append(X.LF);
        this.f4461v.append(N.applySpannable(I(AbstractC5959j.n_card_reservation_jrny_message, N.getIntegerString(nCardReservationResponse.getUsePsbTno())), new ForegroundColorSpan(Color.parseColor("#cc000000"))));
        this.f4461v.append(X.LF);
        this.f4461v.append(N.fromHtml(nCardReservationResponse.getStationInfo()));
        this.f4461v.append(X.LF);
        this.f4461v.append(N.applySpannable(I(AbstractC5959j.comm_rsv_inquiry_message, nCardReservationResponse.getUserNames()), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.tomato))));
    }

    @Override // R5.a
    public void setView(Q5.b bVar, int i8) {
        this.f4461v = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_n_card);
    }
}
