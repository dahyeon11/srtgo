package r6;

import Q7.X;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.A;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.j;
import y6.C6542b;
import z4.C6634h;

/* renamed from: r6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6181b extends C6542b {

    /* renamed from: a, reason: collision with root package name */
    private final int f35791a;

    /* renamed from: b, reason: collision with root package name */
    private final int f35792b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f35793c;

    public C6181b(Context context) {
        super(context);
        this.f35791a = 0;
        this.f35792b = 1;
        h();
    }

    private String g(j jVar, ReservationResponse.JrnyInfo jrnyInfo) {
        if (jVar == j.WAIT) {
            return b(AbstractC5959j.payment_reservation_waiting);
        }
        return jrnyInfo.getH_trn_clsf_nm() + X.SPACE + jrnyInfo.getH_trn_no();
    }

    private void h() {
        View.inflate(getContext(), AbstractC5957h.view_payment_train_info, this);
        k();
    }

    private View i(int i8) {
        ViewStub viewStub = (ViewStub) findViewById(AbstractC5955f.headerValStub);
        viewStub.setLayoutResource(i8 == 0 ? AbstractC5957h.train_info_option_header_val_one_way : AbstractC5957h.train_info_option_header_val_transfer);
        return viewStub.inflate();
    }

    private void j(j jVar, List list) {
        this.f35793c.setText(C6634h.convertFormat(((ReservationResponse.JrnyInfo) list.get(0)).getH_dpt_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)"));
        int i8 = 0;
        while (i8 < list.size()) {
            ((TextView) findViewById(i8 == 0 ? AbstractC5955f.tv_head_train_name : AbstractC5955f.tv_tail_train_name)).setText(g(jVar, (ReservationResponse.JrnyInfo) list.get(i8)));
            i8++;
        }
        boolean z8 = list.size() == 1;
        ((LinearLayout) findViewById(AbstractC5955f.v_head_train_name)).setGravity(z8 ? 17 : A.END);
        findViewById(AbstractC5955f.v_tail_trainName).setVisibility(z8 ? 8 : 0);
        findViewById(AbstractC5955f.tv_head_train_image).setVisibility(z8 ? 8 : 0);
        findViewById(AbstractC5955f.tv_tail_train_name_image).setVisibility(z8 ? 8 : 0);
        findViewById(AbstractC5955f.iv_train_name_arw).setVisibility(z8 ? 8 : 0);
    }

    private void k() {
        this.f35793c = (TextView) findViewById(AbstractC5955f.dateTxt);
    }

    private void setStationInfo(List<ReservationResponse.JrnyInfo> list) {
        View viewI = i(list.size() == 1 ? 0 : 1);
        for (int i8 = 0; i8 < list.size(); i8++) {
            ReservationResponse.JrnyInfo jrnyInfo = list.get(i8);
            TextView textView = (TextView) viewI.findViewById(f("tv_station_" + i8 + "_0"));
            TextView textView2 = (TextView) viewI.findViewById(f("tv_station_" + i8 + "_1"));
            TextView textView3 = (TextView) viewI.findViewById(f("tv_time_" + i8 + "_0"));
            TextView textView4 = (TextView) viewI.findViewById(f("tv_time_" + i8 + "_1"));
            textView.setText(jrnyInfo.getH_dpt_rs_stn_nm());
            textView2.setText(jrnyInfo.getH_arv_rs_stn_nm());
            textView3.setText(C6634h.convertFormat(jrnyInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
            textView4.setText(C6634h.convertFormat(jrnyInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
        }
        if (2 == list.size()) {
            viewI.findViewById(f("tv_station_1_0")).setVisibility(list.get(0).getH_arv_rs_stn_nm().equals(list.get(1).getH_dpt_rs_stn_nm()) ? 8 : 0);
        }
    }

    public void setJrnyData(j jVar, List<ReservationResponse.JrnyInfo> list) {
        j(jVar, list);
        setStationInfo(list);
    }

    public C6181b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35791a = 0;
        this.f35792b = 1;
        h();
    }
}
