package Q5;

import com.korail.talk.data.reservation.ReservationMessageData;
import com.korail.talk.network.dao.pass.CommReservationDao;
import com.korail.talk.network.dao.research.NCardReservationDao;
import com.korail.talk.network.response.certification.ReservationResponse;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private int f4064a;

    /* renamed from: b, reason: collision with root package name */
    private ReservationMessageData f4065b;

    /* renamed from: c, reason: collision with root package name */
    private ReservationResponse f4066c;

    /* renamed from: d, reason: collision with root package name */
    private CommReservationDao.CommReservationResponse.MainInfo f4067d;

    /* renamed from: e, reason: collision with root package name */
    private NCardReservationDao.NCardReservationResponse f4068e;

    public ReservationMessageData getCommissionList() {
        return this.f4065b;
    }

    public CommReservationDao.CommReservationResponse.MainInfo getMainInfo() {
        return this.f4067d;
    }

    public NCardReservationDao.NCardReservationResponse getNCardReservationResponse() {
        return this.f4068e;
    }

    public ReservationResponse getReservationResponse() {
        return this.f4066c;
    }

    public int getViewType() {
        return this.f4064a;
    }

    public void setCommissionList(ReservationMessageData reservationMessageData) {
        this.f4065b = reservationMessageData;
    }

    public void setMainInfo(CommReservationDao.CommReservationResponse.MainInfo mainInfo) {
        this.f4067d = mainInfo;
    }

    public void setNCardReservationResponse(NCardReservationDao.NCardReservationResponse nCardReservationResponse) {
        this.f4068e = nCardReservationResponse;
    }

    public void setReservationResponse(ReservationResponse reservationResponse) {
        this.f4066c = reservationResponse;
    }

    public void setViewType(int i8) {
        this.f4064a = i8;
    }
}
