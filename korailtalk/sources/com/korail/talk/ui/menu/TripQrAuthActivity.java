package com.korail.talk.ui.menu;

import I4.c;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.authQRLocationDao;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinQRScanActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import f.InterfaceC5379b;
import f.d;
import j4.p;
import j4.q;
import j4.r;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import r4.g;
import z4.C6630d;
import z4.C6637k;
import z4.t;

/* loaded from: classes.dex */
public class TripQrAuthActivity extends BaseViewActivity {

    /* renamed from: i, reason: collision with root package name */
    private String f28264i;

    /* renamed from: j, reason: collision with root package name */
    private c f28265j;

    /* renamed from: k, reason: collision with root package name */
    private final d f28266k = registerForActivityResult(new p(), new InterfaceC5379b() { // from class: w5.p
        @Override // f.InterfaceC5379b
        public final void onActivityResult(Object obj) {
            this.f37437a.w0((j4.q) obj);
        }
    });

    private void setText() {
        setAppTitle(AbstractC5959j.title_trip_qr_auth);
    }

    private void u0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v0() {
        /*
            r5 = this;
            I4.c r0 = r5.f28265j
            r0.requestLocationUpdates(r5)
            I4.c r0 = r5.f28265j
            boolean r0 = z4.C6630d.isNotNull(r0)
            if (r0 == 0) goto L2a
            I4.c r0 = r5.f28265j
            android.location.Location r0 = r0.getLastKnownLocation()
            boolean r1 = z4.C6630d.isNotNull(r0)
            if (r1 == 0) goto L2a
            double r1 = r0.getLatitude()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            double r2 = r0.getLongitude()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            goto L2d
        L2a:
            java.lang.String r1 = ""
            r0 = r1
        L2d:
            com.korail.talk.network.dao.common.authQRLocationDao r2 = new com.korail.talk.network.dao.common.authQRLocationDao
            r2.<init>()
            com.korail.talk.network.dao.common.authQRLocationDao$QRLocationRequest r3 = new com.korail.talk.network.dao.common.authQRLocationDao$QRLocationRequest
            r3.<init>()
            java.lang.String r4 = r5.f28264i
            r3.setQrcode(r4)
            r3.setLatitude(r1)
            r3.setLongitude(r0)
            r2.setRequest(r3)
            r5.executeDao(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.korail.talk.ui.menu.TripQrAuthActivity.v0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w0(q qVar) {
        if (qVar.getContents() != null) {
            this.f28264i = qVar.getContents();
            v0();
            return;
        }
        Intent originalIntent = qVar.getOriginalIntent();
        if (originalIntent == null) {
            t.d("Cancelled scan");
        } else if (originalIntent.hasExtra("MISSING_CAMERA_PERMISSION")) {
            t.d("Cancelled scan due to missing camera permission");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x0(DialogInterface dialogInterface, int i8) {
        finish();
    }

    private void y0() {
    }

    private void z0() {
        n0(false);
        l0();
        findViewById(AbstractC5955f.backBtn).setVisibility(0);
        findViewById(AbstractC5955f.btn_trip_confirm).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_qr_scan).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_qr_guide).setOnClickListener(this);
        this.f28265j = new c();
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (AbstractC5955f.btn_trip_confirm == id) {
            r rVar = new r();
            rVar.setOrientationLocked(false);
            rVar.setCaptureActivity(TicketSelfCheckinQRScanActivity.class);
            rVar.setPrompt(getString(AbstractC5959j.trip_qr_auth_scan_content));
            this.f28266k.launch(rVar);
            return;
        }
        if (AbstractC5955f.btn_qr_scan == id) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent.putExtra("WEB_POST_URL", g.TRIP_QR_AUTH_LOCATION_URL);
            startActivity(intent);
        } else {
            if (AbstractC5955f.btn_qr_guide != id) {
                super.onClick(view);
                return;
            }
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) IntegrationWebViewActivity.class);
            intent2.putExtra("WEB_POST_URL", g.TRIP_QR_AUTH_PRODUCT_URL);
            startActivity(intent2);
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_trip_qr_auth);
        if (C6630d.isNull(bundle)) {
            z0();
            setText();
            y0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_trip_qr_location == iBaseDao.getId()) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(((authQRLocationDao.QRLocationResponse) iBaseDao.getResponse()).gethMsgTxt()).setButtonListener(new DialogInterface.OnClickListener() { // from class: w5.q
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    this.f37438a.x0(dialogInterface, i8);
                }
            }).showDialog();
        }
    }
}
