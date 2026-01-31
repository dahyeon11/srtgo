package P5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.korail.talk.data.reservation.BReservationData;
import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.response.certification.ReservationResponse;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import r4.k;
import z4.C6630d;

/* loaded from: classes.dex */
public class a extends BaseViewActivity implements d {

    /* renamed from: i, reason: collision with root package name */
    private BReservationData f3745i;

    /* renamed from: j, reason: collision with root package name */
    protected List f3746j;

    /* renamed from: k, reason: collision with root package name */
    protected View f3747k;

    /* renamed from: l, reason: collision with root package name */
    protected Button f3748l;

    /* renamed from: m, reason: collision with root package name */
    protected Button f3749m;

    /* renamed from: n, reason: collision with root package name */
    protected Button f3750n;

    @Override // P5.d
    public k getReservationType() {
        return null;
    }

    @Override // P5.d
    public boolean isLinkageReservation() {
        return false;
    }

    @Override // P5.d
    public boolean isWait() {
        return false;
    }

    @Override // P5.d
    public void moveToWebView(String str) {
        Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_POST_URL", str);
        intent.putExtra("IS_CLOSE_VIEW", true);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_reservation_confirm);
    }

    @Override // P5.d
    public void setFinish(int i8) {
        setResult(i8);
        finish();
    }

    protected Object t0() {
        return this.f3745i;
    }

    protected void u0() {
        this.f3745i = (BReservationData) M(getIntent(), "RESERVATION_DATA");
        this.f3746j = new ArrayList();
    }

    protected void v0() {
        this.f3748l.setOnClickListener(this);
        this.f3750n.setOnClickListener(this);
        this.f3749m.setOnClickListener(this);
    }

    protected void w0() {
        List<ReservationMessageData> reservationMessageDataList = ((BReservationData) t0()).getReservationMessageDataList();
        if (C6630d.isNotNull(reservationMessageDataList)) {
            for (ReservationMessageData reservationMessageData : reservationMessageDataList) {
                Q5.b bVar = new Q5.b();
                bVar.setViewType(3);
                bVar.setCommissionList(reservationMessageData);
                this.f3746j.add(bVar);
            }
        }
    }

    protected void x0() {
        l0();
        RecyclerView recyclerView = (RecyclerView) findViewById(AbstractC5955f.rv_reservation_confirm);
        Q5.a aVar = new Q5.a(s0(), this.f3746j);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(aVar);
        this.f3747k = findViewById(AbstractC5955f.v_reservation_confirm_agree);
        this.f3748l = (Button) findViewById(AbstractC5955f.btn_reservation_confirm_left);
        this.f3749m = (Button) findViewById(AbstractC5955f.btn_reservation_confirm_mid);
        this.f3750n = (Button) findViewById(AbstractC5955f.btn_reservation_confirm_right);
    }

    protected d s0() {
        return this;
    }

    @Override // P5.d
    public void executeAddCart(ReservationResponse reservationResponse) {
    }

    @Override // P5.d
    public void executeAddProduct(ReservationResponse reservationResponse) {
    }

    @Override // P5.d
    public void executeRsvCancel(ReservationResponse reservationResponse) {
    }

    @Override // P5.d
    public void executeTicketChangeCancel(ReservationResponse reservationResponse) {
    }
}
