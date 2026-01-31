package C4;

import com.korail.talk.network.dao.cart.CartListDao;
import com.korail.talk.network.dao.pay.IntgStlDao;
import com.korail.talk.network.dao.pay.IntgStlDao.IntgStlRequest;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao;
import com.korail.talk.network.dao.payment.RsvPaymentDao.RsvPaymentRequest;
import com.korail.talk.network.request.payment.IPaymentRequest;
import com.korail.talk.network.response.certification.ReservationResponse;
import java.util.List;
import r4.e;
import z4.N;

/* loaded from: classes.dex */
public class b {
    public static IntgStlDao.IntgStlRequest getIntgStlRequest(String str) {
        return getIntgStlRequest("0001", str);
    }

    public static RsvPaymentDao.RsvPaymentRequest getRecalculationRsvPaymentRequest(IPaymentRequest iPaymentRequest, ReservationResponse reservationResponse) {
        RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = getRsvPaymentRequest(reservationResponse);
        if (iPaymentRequest instanceof RsvPaymentDao.RsvPaymentRequest) {
            RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest2 = (RsvPaymentDao.RsvPaymentRequest) iPaymentRequest;
            rsvPaymentRequest.setHidRsvChgNo(N.isNull(rsvPaymentRequest2.getHidRsvChgNo()) ? "0" : rsvPaymentRequest2.getHidRsvChgNo());
        } else if (iPaymentRequest instanceof IntgStlDao.IntgStlRequest) {
            IntgStlDao.IntgStlRequest intgStlRequest = (IntgStlDao.IntgStlRequest) iPaymentRequest;
            rsvPaymentRequest.setHidRsvChgNo(N.isNull(intgStlRequest.getHidRsvChgNo()) ? "0" : intgStlRequest.getHidRsvChgNo());
        } else {
            rsvPaymentRequest.setHidRsvChgNo("0");
        }
        return rsvPaymentRequest;
    }

    public static RsvPaymentDao.RsvPaymentRequest getRsvPaymentRequest(ReservationResponse reservationResponse) {
        RsvPaymentDao.RsvPaymentRequest rsvPaymentRequest = new RsvPaymentDao().new RsvPaymentRequest();
        rsvPaymentRequest.setHidPnrNo(reservationResponse.getH_pnr_no());
        rsvPaymentRequest.setWctNo(reservationResponse.getH_wct_no());
        rsvPaymentRequest.setJobSqNo1(reservationResponse.getH_tmp_job_sqno1());
        rsvPaymentRequest.setJobSqNo2(reservationResponse.getH_tmp_job_sqno2());
        rsvPaymentRequest.setHidRsvChgNo(reservationResponse.getJrny_infos().getJrny_info().get(0).getH_rsv_chg_no());
        return rsvPaymentRequest;
    }

    public static IntgStlDao.IntgStlRequest getSelfSeatIntgStlRequest(ReservationResponse reservationResponse) {
        IntgStlDao.IntgStlRequest intgStlRequest = new IntgStlDao().new IntgStlRequest();
        intgStlRequest.setStlPrsJobId("0001");
        intgStlRequest.setCtlDvCd("3584");
        intgStlRequest.setCart_LumpStlTgtNo(reservationResponse.getJrny_infos().getJrny_info().get(0).getLumpStlTgtNo());
        return intgStlRequest;
    }

    public static IntgStlDao.IntgStlRequest getIntgStlRequest(String str, String str2) {
        IntgStlDao.IntgStlRequest intgStlRequest = new IntgStlDao().new IntgStlRequest();
        intgStlRequest.setStlPrsJobId(str);
        intgStlRequest.setCart_LumpStlTgtNo(str2);
        return intgStlRequest;
    }

    public static IntgStlDao.IntgStlRequest getIntgStlRequest(ReservationResponse reservationResponse) {
        IntgStlDao.IntgStlRequest intgStlRequest = new IntgStlDao().new IntgStlRequest();
        intgStlRequest.setStlPrsJobId("0001");
        intgStlRequest.setCtlDvCd("3582");
        intgStlRequest.setCart_LumpStlTgtNo(reservationResponse.getJrny_infos().getJrny_info().get(0).getLumpStlTgtNo());
        return intgStlRequest;
    }

    public static IntgStlDao.IntgStlRequest getIntgStlRequest(List<CartListDao.CartInfo> list) {
        StringBuilder sb = new StringBuilder();
        for (CartListDao.CartInfo cartInfo : list) {
            if (!"2".equals(cartInfo.getH_item_dv_cd()) && !StbkAcntDao.ACCOUNT_REGISTER.equals(cartInfo.getH_item_dv_cd()) && (!"0".equals(cartInfo.getH_item_dv_cd()) || !e.TRANSFER.getCode().equals(cartInfo.getH_jrny_tp_cd()) || !cartInfo.getH_jrny_sqno().equals("0002"))) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(cartInfo.getH_lump_stl_tgt_no());
            }
        }
        IntgStlDao.IntgStlRequest intgStlRequest = new IntgStlDao().new IntgStlRequest();
        intgStlRequest.setStlPrsJobId("0001");
        intgStlRequest.setCart_LumpStlTgtNo(sb.toString());
        return intgStlRequest;
    }
}
