package x6;

import Q7.X;
import android.content.Context;
import android.graphics.Color;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.N;

/* renamed from: x6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6495c extends C6493a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    private TextView f37518b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f37519c;

    public ViewOnClickListenerC6495c(Context context) {
        super(context);
        h();
    }

    private void h() {
        View.inflate(getContext(), AbstractC5957h.view_n_payment_seat_info, this);
        j();
        i();
    }

    private void i() {
        findViewById(AbstractC5955f.tv_n_payment_seat_info_detail).setOnClickListener(this);
    }

    private void j() {
        this.f37518b = (TextView) findViewById(AbstractC5955f.v_n_payment_seat_info_img);
        this.f37519c = (TextView) findViewById(AbstractC5955f.tv_n_payment_seat_info);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.tv_n_payment_seat_info_detail == view.getId()) {
            g();
        }
    }

    @Override // x6.C6493a
    public void setJrnyData(List<ReservationResponse.JrnyInfo> list) {
        super.setJrnyData(list);
        this.f37518b.setVisibility(list.size() == 1 ? 8 : 0);
        for (int i8 = 0; i8 < list.size(); i8++) {
            List<ReservationResponse.SeatInfo> seat_info = list.get(i8).getSeat_infos().getSeat_info();
            Iterator<ReservationResponse.SeatInfo> it = seat_info.iterator();
            if (it.hasNext()) {
                ReservationResponse.SeatInfo next = it.next();
                this.f37519c.append(c(AbstractC5959j.common_cart_no, Integer.valueOf(Integer.parseInt(next.getH_srcar_no()))) + X.SPACE + next.getH_seat_no());
            }
            if (i8 < list.size() - 1 && 2 == list.size()) {
                this.f37519c.append(N.applySpannable(" | ", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
            }
            if (i8 == list.size() - 1 && seat_info.size() > 1) {
                this.f37519c.append(" 외 " + (seat_info.size() - 1) + "석");
            }
        }
    }

    public ViewOnClickListenerC6495c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }
}
