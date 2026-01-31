package l5;

import I4.h;
import android.os.Bundle;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import j5.AbstractActivityC5831d;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import n4.AbstractC5955f;
import r4.EnumC6175b;
import r4.p;
import y4.C6536a;
import z4.C6630d;
import z4.J;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5891a extends AbstractActivityC5831d {

    /* renamed from: i0, reason: collision with root package name */
    protected EnumC6175b f33981i0;

    /* renamed from: j0, reason: collision with root package name */
    String f33982j0;

    private void L0() {
        this.f33981i0 = (EnumC6175b) getIntent().getSerializableExtra("MENU_TYPE");
        this.f33982j0 = ((TrainInquiryRequest) this.f31910Y[0]).getTkDptDt();
        Object[] objArr = (Object[]) getIntent().getSerializableExtra("TRIP_CHG_DATES");
        if (objArr != null) {
            this.f31913b0 = new ArrayList();
            for (Object obj : objArr) {
                this.f31913b0.add((String) obj);
            }
        }
    }

    private boolean y2() {
        h hVar = h.getInstance();
        return (B0() != EnumC6175b.DEFAULT || hVar.isSejongMember().booleanValue() || hVar.isNaJuMember() || hVar.isSinGyeongJu()) ? false : true;
    }

    @Override // h5.AbstractActivityC5621k
    protected void K0() {
        w2();
    }

    @Override // h5.AbstractActivityC5621k
    protected void O0(ReservationResponse reservationResponse) {
        x2(reservationResponse);
    }

    @Override // h5.AbstractActivityC5631u
    protected void m2() {
        int i8;
        super.m2();
        Z1();
        k2(B0() != EnumC6175b.TOUR_TRAIN);
        ArrayList<String> trainSeatFilterData = J.getTrainSeatFilterData();
        if (u2()) {
            trainSeatFilterData.add(p.EVACUATION_HELPER.getName());
        }
        g2(y2(), trainSeatFilterData);
        d2();
        String txtGoAbrdDt = this.f31909X.getTxtGoAbrdDt();
        if (this.f31913b0 != null) {
            i8 = 0;
            while (i8 < this.f31913b0.size()) {
                if (((String) this.f31913b0.get(i8)).equals(txtGoAbrdDt)) {
                    break;
                } else {
                    i8++;
                }
            }
            i8 = -1;
        } else {
            i8 = -1;
        }
        if (i8 != -1) {
            if (i8 == 0) {
                a2(4);
            }
            if (i8 == this.f31913b0.size() - 1) {
                X1(4);
            }
        } else {
            a2(4);
            X1(4);
        }
        if (getIntent().getBooleanExtra("TIME_CHANGE_EVENT", false)) {
            k2(false);
            g2(false, J.getTrainSeatFilterData());
        }
    }

    @Override // j5.AbstractActivityC5831d, i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // j5.AbstractActivityC5831d, i5.AbstractActivityC5703c, h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_train_inquiry == iBaseDao.getId()) {
            String txtGoAbrdDt = this.f31909X.getTxtGoAbrdDt();
            if (this.f31913b0 == null) {
                a2(4);
                X1(4);
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.f31913b0.size()) {
                        i8 = -1;
                        break;
                    } else if (((String) this.f31913b0.get(i8)).equals(txtGoAbrdDt)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 == 0) {
                    a2(4);
                } else {
                    a2(0);
                }
                if (i8 == this.f31913b0.size() - 1) {
                    X1(4);
                } else {
                    X1(0);
                }
            }
        }
        super.onReceive(iBaseDao);
    }

    @Override // i5.AbstractActivityC5703c, h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_train_inquiry == iBaseDao.getId()) {
            String txtGoAbrdDt = this.f31909X.getTxtGoAbrdDt();
            if (this.f31913b0 == null) {
                a2(4);
                X1(4);
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 >= this.f31913b0.size()) {
                        i8 = -1;
                        break;
                    } else if (((String) this.f31913b0.get(i8)).equals(txtGoAbrdDt)) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (i8 == 0) {
                    a2(4);
                } else {
                    a2(0);
                }
                if (i8 == this.f31913b0.size() - 1) {
                    X1(4);
                } else {
                    X1(0);
                }
            }
        }
        super.onReceiveError(iBaseDao, c6536a);
    }

    @Override // h5.AbstractActivityC5631u
    protected void Y1() {
    }
}
