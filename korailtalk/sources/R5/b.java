package R5;

import Q7.X;
import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.dao.pass.CommReservationDao;
import n4.AbstractC5953d;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import z4.C6634h;
import z4.I;
import z4.N;
import z4.O;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: v, reason: collision with root package name */
    private TextView f4454v;

    public b(P5.d dVar, View view) {
        super(dVar, view);
    }

    @Override // R5.a
    public void setText(Q5.b bVar, int i8) {
        CommReservationDao.CommReservationResponse.MainInfo mainInfo = bVar.getMainInfo();
        this.f4454v.setText(N.applySpannable(C6634h.convertFormat(mainInfo.getH_use_open_dt(), "yyyyMMdd", "yyyy년 MM월 dd일") + " ~ " + C6634h.convertFormat(mainInfo.getH_use_cls_dt(), "yyyyMMdd", "yyyy년 MM월 dd일"), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.ocean_blue))));
        this.f4454v.append(X.LF);
        this.f4454v.append(N.applySpannable(I(AbstractC5959j.comm_rsv_jrny_message, mainInfo.getH_cmtr_utl_trm_nm(), O.getTrainGroupName(mainInfo.getH_trn_gp_cd())), new ForegroundColorSpan(Color.parseColor("#cc000000"))));
        this.f4454v.append(X.LF);
        this.f4454v.append(N.fromHtml(mainInfo.getStationInfo()));
        this.f4454v.append(X.LF);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(I(AbstractC5959j.comm_rsv_inquiry_message, mainInfo.getUserNames()));
        if (N.isNotNull(mainInfo.getH_rsv_trm_dup())) {
            stringBuffer.append("\n\n");
            stringBuffer.append(mainInfo.getH_rsv_trm_dup());
        }
        this.f4454v.append(N.applySpannable(stringBuffer.toString(), new ForegroundColorSpan(I.getColor(G(), AbstractC5953d.tomato))));
    }

    @Override // R5.a
    public void setView(Q5.b bVar, int i8) {
        this.f4454v = (TextView) this.itemView.findViewById(AbstractC5955f.tv_reservation_confirm_commutation);
    }
}
