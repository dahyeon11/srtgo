package com.korail.talk.ui.booking.nCard;

import D4.a;
import Q4.g;
import V4.b;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.korail.talk.network.dao.research.NCardInquiryDao;
import com.korail.talk.network.dao.research.NCardReservationDao;
import com.korail.talk.ui.inquiry.SectionNCardInquiryActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.f;
import z4.C6630d;
import z4.C6637k;
import z4.M;
import z4.t;

/* loaded from: classes.dex */
public class NCard1SectionBookingVersion2Activity extends g implements v4.g {
    private void D0() {
        this.f4056m = new b[3];
    }

    private void K0() {
        F0();
        G0(this.f4052i.getTrnGpCd(), f.MEMBERONE);
        J0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.korail.talk.network.dao.research.NCardInquiryDao$NCardInquiryRequest[], java.io.Serializable] */
    private void M0() {
        int sectionCount = M.getSectionCount(this.f4056m);
        this.f4058o.setNCardSectionType(sectionCount);
        ?? r12 = new NCardInquiryDao.NCardInquiryRequest[sectionCount];
        for (int i8 = 0; i8 < sectionCount; i8++) {
            t.d("mRouteOptions[" + i8 + "] : " + this.f4056m[i8].getStartStationNm() + ", " + this.f4056m[i8].getArrivalStationNm());
            NCardInquiryDao.NCardInquiryRequest nCardInquiryVersion2Request = B4.b.getNCardInquiryVersion2Request(this.f4056m[i8], this.f4058o);
            r12[i8] = nCardInquiryVersion2Request;
            nCardInquiryVersion2Request.setTrnGpCd(this.f4052i.getTrnGpCd());
        }
        NCardReservationDao.NCardReservationRequest nCardReservationVersion2Request = a.getNCardReservationVersion2Request(this.f4058o);
        Intent intent = new Intent(getApplicationContext(), (Class<?>) SectionNCardInquiryActivity.class);
        intent.putExtra("TITLE_NAME", this.f4052i.getTitle());
        intent.putExtra("INQUIRY_ARRAY_REQUEST", (Serializable) r12);
        intent.putExtra("RESERVATION_REQUEST", nCardReservationVersion2Request);
        startActivity(intent);
    }

    @Override // Q4.g, com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Resources.NotFoundException {
        if (AbstractC5955f.btn_multi_n_card_inquiry != view.getId()) {
            super.onClick(view);
            return;
        }
        if (M.isStationSame(this.f4056m)) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.common_start_arrival_equal)).showDialog();
        } else if (M.isSectionStationSame(this.f4056m) || M.getSectionCount(this.f4056m) == 0) {
            C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(getString(AbstractC5959j.multi_n_card_section_equal)).showDialog();
        } else {
            M0();
        }
    }

    @Override // Q4.g, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            D0();
            K0();
            E0();
        }
    }
}
