package com.korail.talk.ui.booking.mainBooking;

import I4.h;
import P4.InterfaceC0686d;
import T4.i;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.korail.talk.data.CalendarData;
import com.korail.talk.ui.booking.option.station.StationSearch;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import z4.C6626B;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class MaasMainPassengerActivity extends BaseViewActivity implements InterfaceC0686d {

    /* renamed from: i, reason: collision with root package name */
    protected InterfaceC0686d f27688i;

    /* renamed from: j, reason: collision with root package name */
    private i f27689j;

    /* renamed from: k, reason: collision with root package name */
    protected ViewGroup f27690k;

    /* renamed from: l, reason: collision with root package name */
    private CTextView f27691l;

    private void setText() {
        setAppTitle(AbstractC5959j.normal_booking_passenger);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t0(Bundle bundle, int i8, String str) {
        this.f27688i.setPassengerData(bundle);
    }

    private void u0() {
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void w0() {
        if (C6630d.isNotNull(this.f27689j)) {
            this.f27689j.setGuideDogView(h.getInstance().isCustLeadFlg());
        }
    }

    private void x0() {
        m0();
        this.f27690k = (ViewGroup) findViewById(AbstractC5955f.ll_passenger_count);
        this.f27691l = (CTextView) findViewById(AbstractC5955f.tv_right_text);
        this.f27688i = this;
    }

    @Override // P4.InterfaceC0686d
    public void hideStationSearch() {
    }

    @Override // P4.InterfaceC0686d
    public void moveToTrainInquiryBySRT() {
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_left == id) {
            onBackPressed();
            return;
        }
        if (AbstractC5955f.btn_right != id) {
            super.onClick(view);
            return;
        }
        if (this.f27689j.getTotalCount() <= 0) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.normal_booking_min_passenger)).showDialog();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("TICKET_PASSENGER_INFO", this.f27689j.getPassengerInfo());
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maas_main_passenger);
        if (C6630d.isNull(bundle)) {
            x0();
            setText();
            u0();
            v0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    public void onResume() {
        super.onResume();
        w0();
    }

    @Override // P4.InterfaceC0686d
    public void setDate(CalendarData calendarData) {
    }

    @Override // P4.InterfaceC0686d
    public void setPassengerData(Bundle bundle) {
        this.f27691l.setText(this.f27689j.getTotalPassengerText());
    }

    @Override // P4.InterfaceC0686d
    public void setStationNm(String str, String str2) {
    }

    @Override // P4.InterfaceC0686d
    public void showStationSearch(StationSearch.c cVar) {
    }

    protected void v0() {
        i iVar = new i(K(), C6626B.getPassengerBundleData());
        this.f27689j = iVar;
        iVar.updatePassengerData(getIntent().getBundleExtra("TICKET_PASSENGER_INFO"));
        this.f27691l.setText(this.f27689j.getTotalPassengerText());
        this.f27690k.addView(this.f27689j);
        this.f27689j.setOnChangePersonInfoListener(new i.a() { // from class: P4.j
            @Override // T4.i.a
            public final void onChangePersonInfo(Bundle bundle, int i8, String str) {
                this.f3720a.t0(bundle, i8, str);
            }
        });
    }
}
