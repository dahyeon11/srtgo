package T4;

import android.content.Context;
import com.korail.talk.network.dao.trainsInfo.TourTrainInfoDao;
import java.util.List;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import r4.r;
import z4.C6630d;
import z4.J;

/* loaded from: classes.dex */
public class k extends c {

    /* renamed from: F, reason: collision with root package name */
    private r f4918F;

    /* renamed from: G, reason: collision with root package name */
    private TourTrainInfoDao.SeatInfos f4919G;

    public k(Context context) {
        super(context);
    }

    private void D() {
        if (J.isFamilySeatType(this.f4918F)) {
            findViewById(AbstractC5955f.expandView).setVisibility(8);
        } else {
            findViewById(AbstractC5955f.expandView).setVisibility(0);
        }
    }

    private int[] E(r rVar, TourTrainInfoDao.SeatInfos seatInfos) {
        int[] iArr = new int[2];
        if (C6630d.isNotNull(rVar) && C6630d.isNotNull(seatInfos)) {
            List<TourTrainInfoDao.SeatInfo> seat_info = seatInfos.getSeat_info();
            int i8 = 0;
            while (true) {
                if (i8 >= seat_info.size()) {
                    break;
                }
                TourTrainInfoDao.SeatInfo seatInfo = seat_info.get(i8);
                if (seatInfo.getH_seat_att_cd().equals(rVar.getCode())) {
                    List<TourTrainInfoDao.SeatAddInfo> seat_add_info = seatInfo.getSeat_add_infos().getSeat_add_info();
                    iArr[0] = seat_add_info.get(0).getH_psg_num();
                    iArr[1] = seat_add_info.get(seat_add_info.size() - 1).getH_psg_num();
                    break;
                }
                i8++;
            }
        } else {
            iArr[0] = 0;
            iArr[1] = 9;
        }
        return iArr;
    }

    private void F(r rVar, TourTrainInfoDao.SeatInfos seatInfos) {
        m();
        this.f4918F = rVar;
        this.f4919G = seatInfos;
    }

    private void G(r rVar, TourTrainInfoDao.SeatInfos seatInfos) {
        if (C6630d.isNotNull(seatInfos)) {
            List<TourTrainInfoDao.SeatInfo> seat_info = seatInfos.getSeat_info();
            for (int i8 = 0; i8 < seat_info.size(); i8++) {
                TourTrainInfoDao.SeatInfo seatInfo = seat_info.get(i8);
                if (seatInfo.getH_seat_att_cd().equals(rVar.getCode())) {
                    this.f4865g = seatInfo.getSeat_add_infos().getSeat_add_info().get(0).getH_psg_num();
                }
            }
        }
    }

    public void init(r rVar, TourTrainInfoDao.SeatInfos seatInfos) {
        F(rVar, seatInfos);
        D();
        v();
    }

    @Override // T4.c
    protected void w() {
        int[] iArrE = E(this.f4918F, this.f4919G);
        this.f4882x = iArrE[0];
        this.f4881w = iArrE[iArrE.length - 1];
        if (J.isFamilySeatType(this.f4918F)) {
            this.f4865g = 4;
        } else if (J.isSpecialRoom(this.f4918F)) {
            G(this.f4918F, this.f4919G);
        } else {
            this.f4865g = 1;
        }
    }

    @Override // T4.c
    protected void x() {
        if (J.isFamilySeatType(this.f4918F)) {
            this.f4860B.setText(getContext().getString(AbstractC5959j.booking_1_set_4_seats));
        } else {
            super.x();
        }
    }

    public k(Context context, r rVar, TourTrainInfoDao.SeatInfos seatInfos) {
        this(context);
        init(rVar, seatInfos);
    }
}
