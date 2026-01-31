package com.korail.talk.ui.booking.mainBooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.data.StationNameData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.common.MaasStationListDao;
import com.korail.talk.network.dao.common.MaasStationListDao.MaasStationListRequest;
import com.korail.talk.network.dao.common.StationDataDao;
import com.korail.talk.ui.booking.option.station.MaasStationSearch;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import z4.C6630d;
import z4.C6637k;

/* loaded from: classes.dex */
public class MaasSelectStationActivity extends BaseViewActivity implements MaasStationSearch.c {

    /* renamed from: i, reason: collision with root package name */
    private String f27692i;

    /* renamed from: j, reason: collision with root package name */
    private String f27693j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f27694k;

    /* renamed from: l, reason: collision with root package name */
    private MaasStationSearch f27695l;

    private void s0() {
        String stringExtra = getIntent().getStringExtra("MAAS_INFO");
        String stringExtra2 = getIntent().getStringExtra("MAAS_POPUP_IMAGE");
        if (stringExtra2 != null) {
            C6637k.getCImageDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra2).showDialog();
        } else if (stringExtra != null) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(stringExtra).showDialog();
        }
    }

    private void setText() {
        setAppTitle(this.f27692i);
    }

    private void t0(String str) {
        IBaseDao maasStationListDao = new MaasStationListDao();
        MaasStationListDao.MaasStationListRequest maasStationListRequest = new MaasStationListDao().new MaasStationListRequest();
        maasStationListRequest.setAddSrvDvCd(str);
        maasStationListDao.setRequest(maasStationListRequest);
        executeDao(maasStationListDao);
    }

    private void u0() {
        this.f27692i = getIntent().getStringExtra("MAAS_TITLE");
    }

    private void v0() {
        this.f27695l.setOnChangeStationListener(this);
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void w0() {
        m0();
        this.f27694k = (TextView) findViewById(AbstractC5955f.tv_station_name);
        this.f27695l = (MaasStationSearch) findViewById(AbstractC5955f.ss_maas_search_station);
    }

    @Override // com.korail.talk.ui.booking.option.station.MaasStationSearch.c
    public void onChangeStation(StationNameData stationNameData) {
        this.f27694k.setText(stationNameData.getDepartureStationName());
        ((CTextView) findViewById(AbstractC5955f.tv_right_text)).setText(stationNameData.getDepartureStationName());
        findViewById(AbstractC5955f.btn_right).setEnabled(true);
        this.f27693j = C6111b.getInstance().getStationDataByName(stationNameData.getDepartureStationName()).getStnCd();
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
        Intent intent = new Intent();
        intent.putExtra("MAAS_STATION_CODE", this.f27693j);
        String stringExtra = getIntent().getStringExtra("MAAS_RENTCAR_UI");
        if (stringExtra != null && !stringExtra.equals("")) {
            intent.putExtra("MAAS_RENTCAR_UI", stringExtra);
        }
        setResult(-1, intent);
        finish();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maas_select_station);
        if (C6630d.isNull(bundle)) {
            s0();
            u0();
            w0();
            setText();
            v0();
            t0(getIntent().getStringExtra("MAAS_ADDSRVDVCD"));
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_maas_station_list == iBaseDao.getId()) {
            this.f27695l.setStationList(((StationDataDao.StationDataResponse) iBaseDao.getResponse()).getStns().getStn());
            this.f27695l.refreshList();
        }
    }
}
