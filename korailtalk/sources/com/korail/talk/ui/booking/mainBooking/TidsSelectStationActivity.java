package com.korail.talk.ui.booking.mainBooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.korail.talk.data.StationNameData;
import com.korail.talk.database.model.StationData;
import com.korail.talk.network.dao.common.StationDataDao;
import com.korail.talk.ui.booking.option.station.MaasStationSearch;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import com.korail.talk.view.CButton;
import com.korail.talk.view.CTextView;
import com.korail.talk.view.base.BaseViewActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import q4.C6111b;
import r4.g;
import z4.C6630d;

/* loaded from: classes.dex */
public class TidsSelectStationActivity extends BaseViewActivity implements MaasStationSearch.c {

    /* renamed from: i, reason: collision with root package name */
    private String f27786i;

    /* renamed from: j, reason: collision with root package name */
    private String f27787j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f27788k;

    /* renamed from: l, reason: collision with root package name */
    private MaasStationSearch f27789l;

    /* renamed from: m, reason: collision with root package name */
    List f27790m;

    private static class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        public int compare(StationDataDao.STNSetter sTNSetter, StationDataDao.STNSetter sTNSetter2) {
            return Double.compare(Double.parseDouble(sTNSetter.getMajor()), Double.parseDouble(sTNSetter2.getMajor()));
        }
    }

    private void s0() {
        this.f27786i = getIntent().getStringExtra("MAAS_TITLE");
        List<StationData> allStationList = C6111b.getInstance().getAllStationList();
        ArrayList arrayList = new ArrayList(allStationList);
        Collections.copy(allStationList, arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.f27790m = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            if (((StationData) arrayList.get(i8)).getMajor() != null) {
                StationData stationData = (StationData) arrayList.get(i8);
                StationDataDao.STNSetter sTNSetter = new StationDataDao.STNSetter();
                sTNSetter.setStn_cd(stationData.getStnCd());
                sTNSetter.setStn_nm(stationData.getStnNm());
                sTNSetter.setLongitude(stationData.getLongitude());
                sTNSetter.setLatitude(stationData.getLatitude());
                sTNSetter.setGroup(stationData.getGroup());
                sTNSetter.setMajor(stationData.getMajor());
                arrayList2.add(sTNSetter);
            }
        }
        Collections.sort(arrayList2, new b());
        StationDataDao.STNSetter sTNSetter2 = new StationDataDao.STNSetter();
        sTNSetter2.setSetterType(1);
        arrayList2.add(sTNSetter2);
        this.f27790m.addAll(arrayList2);
        for (StationData stationData2 : allStationList) {
            StationDataDao.STNSetter sTNSetter3 = new StationDataDao.STNSetter();
            sTNSetter3.setStn_cd(stationData2.getStnCd());
            sTNSetter3.setStn_nm(stationData2.getStnNm());
            sTNSetter3.setLongitude(stationData2.getLongitude());
            sTNSetter3.setLatitude(stationData2.getLatitude());
            sTNSetter3.setGroup(stationData2.getGroup());
            sTNSetter3.setMajor(stationData2.getMajor());
            this.f27790m.add(sTNSetter3);
        }
    }

    private void setText() {
        setAppTitle(this.f27786i);
    }

    private void t0() {
        this.f27789l.setOnChangeStationListener(this);
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
    }

    private void u0() {
        m0();
        ((CButton) findViewById(AbstractC5955f.btn_right)).setText(AbstractC5959j.common_confirm);
        this.f27788k = (TextView) findViewById(AbstractC5955f.tv_station_name);
        MaasStationSearch maasStationSearch = (MaasStationSearch) findViewById(AbstractC5955f.ss_maas_search_station);
        this.f27789l = maasStationSearch;
        maasStationSearch.setStationList(this.f27790m);
        this.f27789l.setCustomMode(true);
        this.f27789l.refreshList();
    }

    @Override // com.korail.talk.ui.booking.option.station.MaasStationSearch.c
    public void onChangeStation(StationNameData stationNameData) {
        this.f27788k.setText(stationNameData.getDepartureStationName());
        ((CTextView) findViewById(AbstractC5955f.tv_right_text)).setText(stationNameData.getDepartureStationName());
        findViewById(AbstractC5955f.btn_right).setEnabled(true);
        O(this.f27789l);
        this.f27787j = C6111b.getInstance().getStationDataByName(stationNameData.getDepartureStationName()).getStnCd();
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
        Intent intent = new Intent(this, (Class<?>) IntegrationWebViewActivity.class);
        intent.putExtra("WEB_GET_URL", g.TIDS_URL);
        intent.putExtra("WEB_GET_PARAMETER", "dptRsStnCd=" + this.f27787j);
        startActivity(intent);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_maas_select_station);
        if (C6630d.isNull(bundle)) {
            s0();
            u0();
            setText();
            t0();
        }
    }
}
