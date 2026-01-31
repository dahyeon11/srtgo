package x6;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.C6626B;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnClickListenerC6494b extends C6493a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    private TextView f37517b;

    public ViewOnClickListenerC6494b(Context context) {
        super(context);
        h();
    }

    private void h() {
        View.inflate(getContext(), AbstractC5957h.view_m_payment_seat_info, this);
        j();
        i();
    }

    private void i() {
        findViewById(AbstractC5955f.tv_m_payment_seat_info_detail).setOnClickListener(this);
    }

    private void j() {
        this.f37517b = (TextView) findViewById(AbstractC5955f.tv_m_payment_seat_info);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (AbstractC5955f.tv_m_payment_seat_info_detail == view.getId()) {
            g();
        }
    }

    @Override // x6.C6493a
    public void setJrnyData(List<ReservationResponse.JrnyInfo> list) {
        super.setJrnyData(list);
        Bundle passengerBundleData = C6626B.getPassengerBundleData(list.get(0).getSeat_infos().getSeat_info());
        int i8 = passengerBundleData.getInt("ADULT_COUNT");
        int i9 = passengerBundleData.getInt("CHILD_COUNT");
        int i10 = passengerBundleData.getInt("CHILD_ACCOMPANY_COUNT");
        StringBuilder sb = new StringBuilder();
        if (i8 > 0) {
            sb.append("어른 ");
            sb.append(i8);
            sb.append("명");
        }
        if (i9 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("어린이 ");
            sb.append(i9);
            sb.append("명");
        }
        if (i10 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append("유아 ");
            sb.append(i10);
            sb.append("명");
        }
        this.f37517b.setText(sb.toString());
    }

    public ViewOnClickListenerC6494b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h();
    }
}
