package i5;

import android.os.Bundle;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.research.SeatAssignScheduleViewDao;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import h5.AbstractActivityC5631u;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.p;
import r4.s;
import y4.C6536a;
import z4.C6630d;
import z4.C6634h;
import z4.C6637k;

/* renamed from: i5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC5704d extends AbstractActivityC5631u {

    /* renamed from: X, reason: collision with root package name */
    private String f31920X;

    /* renamed from: Y, reason: collision with root package name */
    private SeatAssignScheduleViewDao.SeatAssignScheduleViewRequest f31921Y;

    private void L0() {
        SeatAssignScheduleViewDao.SeatAssignScheduleViewRequest seatAssignScheduleViewRequest = (SeatAssignScheduleViewDao.SeatAssignScheduleViewRequest) getIntent().getSerializableExtra("INQUIRY_REQUEST");
        this.f31921Y = seatAssignScheduleViewRequest;
        this.f31920X = seatAssignScheduleViewRequest.getDptTm();
    }

    @Override // h5.AbstractActivityC5631u
    protected String A1() {
        return C6634h.convertFormat(this.f31921Y.getDptDt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)");
    }

    @Override // h5.AbstractActivityC5631u
    protected void B1() {
        this.f31921Y.setNextStartTime(this.f31586l);
        p2();
    }

    @Override // h5.AbstractActivityC5631u
    protected String C1() {
        return this.f31920X;
    }

    @Override // h5.AbstractActivityC5631u
    protected boolean F1() {
        return C6634h.isToday(this.f31921Y.getDptDt());
    }

    @Override // h5.AbstractActivityC5631u
    protected void T1() {
        this.f31921Y.setDptTm(C1());
        p2();
    }

    @Override // h5.AbstractActivityC5631u
    protected void f2(p pVar) {
        this.f31622P.setEnabled(!p.EVACUATION_HELPER.equals(pVar) && this.f31592r);
        this.f31921Y.setSeatAttCd1(pVar.getCode());
        this.f31921Y.setDptTm(C1());
        v0();
        p2();
    }

    @Override // h5.AbstractActivityC5631u
    protected void j2(s sVar) {
        v0();
        this.f31921Y.setTrnGpCd(sVar.getCode());
        this.f31921Y.setDptTm(C1());
        p2();
    }

    @Override // h5.AbstractActivityC5631u
    protected void n2() {
        v0();
        String[] nextDate = C6634h.getNextDate(this.f31921Y.getDptDt() + this.f31921Y.getDptTm());
        this.f31921Y.setDptDt(nextDate[0]);
        this.f31921Y.setDptTm(nextDate[1]);
        this.f31920X = this.f31921Y.getDptTm();
        V1();
        Z1();
        p2();
    }

    @Override // h5.AbstractActivityC5631u
    protected void o2() {
        v0();
        String[] previousDate = C6634h.getPreviousDate(this.f31921Y.getDptDt() + this.f31921Y.getDptTm());
        this.f31921Y.setDptDt(previousDate[0]);
        this.f31921Y.setDptTm(previousDate[1]);
        this.f31920X = this.f31921Y.getDptTm();
        V1();
        Z1();
        p2();
    }

    @Override // h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        if (C6630d.isNull(bundle)) {
            L0();
        }
    }

    @Override // h5.AbstractActivityC5631u, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        if (AbstractC5955f.dao_seat_assign_schedule_view != iBaseDao.getId()) {
            super.onReceive(iBaseDao);
            return;
        }
        SeatAssignScheduleViewDao.SeatAssignScheduleViewResponse seatAssignScheduleViewResponse = (SeatAssignScheduleViewDao.SeatAssignScheduleViewResponse) iBaseDao.getResponse();
        List<RsvInquiryResponse.TrainInfo> trn_info = seatAssignScheduleViewResponse.getTrn_infos().getTrn_info();
        Iterator<RsvInquiryResponse.TrainInfo> it = trn_info.iterator();
        while (it.hasNext()) {
            it.next().setTotPsgCnt(this.f31921Y.getPsgNum1());
        }
        List<RsvInquiryResponse.TrainInfo> directReorderList = this.f31591q ? B4.a.getDirectReorderList(this.f31586l, trn_info) : B4.a.getTransferReorderList(this.f31586l, trn_info);
        this.f31586l.addAll(directReorderList);
        P0(directReorderList);
        boolean zIsEmpty = this.f31587m.isEmpty();
        M0(zIsEmpty);
        if (!zIsEmpty) {
            boolean zEquals = seatAssignScheduleViewResponse.getH_next_pg_flg().equals("Y");
            this.f31583i = zEquals;
            if (!zEquals) {
                Y1();
            }
            S1();
        }
        e2(true);
    }

    @Override // h5.AbstractActivityC5621k, com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceiveError(IBaseDao iBaseDao, C6536a c6536a) {
        if (AbstractC5955f.dao_seat_assign_schedule_view != iBaseDao.getId()) {
            super.onReceiveError(iBaseDao, c6536a);
            return;
        }
        C6637k.getCDialog(K(), 1001, 0, getString(AbstractC5959j.dialog_title)).setContent(c6536a.getMessage()).showDialog();
        if (C6630d.isNull(this.f31587m) || this.f31587m.isEmpty()) {
            M0(true);
        }
        e2(true);
    }

    protected void p2() {
        SeatAssignScheduleViewDao seatAssignScheduleViewDao = new SeatAssignScheduleViewDao();
        seatAssignScheduleViewDao.setRequest(this.f31921Y);
        seatAssignScheduleViewDao.setNotShowDialog(true);
        executeDao(seatAssignScheduleViewDao);
    }

    @Override // h5.AbstractActivityC5621k
    protected String x0() {
        return this.f31921Y.getArvRsStnNm();
    }

    @Override // h5.AbstractActivityC5621k
    protected String y0() {
        return this.f31921Y.getDptDt();
    }

    @Override // h5.AbstractActivityC5621k
    protected String z0() {
        return this.f31921Y.getDptRsStnNm();
    }
}
