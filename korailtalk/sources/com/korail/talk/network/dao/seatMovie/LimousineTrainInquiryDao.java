package com.korail.talk.network.dao.seatMovie;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.inquiry.TrainInquiryRequest;
import java.io.Serializable;
import z4.C6638l;

/* loaded from: classes.dex */
public class LimousineTrainInquiryDao extends InquiryDao implements Serializable {
    @Override // com.korail.talk.network.dao.seatMovie.InquiryDao, com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        SeatMovieService seatMovieService = (SeatMovieService) getService(SeatMovieService.class);
        TrainInquiryRequest trainInquiryRequest = (TrainInquiryRequest) getRequest();
        return seatMovieService.getRsvLimousineInquiry(trainInquiryRequest.getDevice(), trainInquiryRequest.getVersion(), C6638l.getSid(), trainInquiryRequest.getTxtMenuId(), trainInquiryRequest.getRadJobId(), trainInquiryRequest.getTxtJobDv(), trainInquiryRequest.getSelGoTrain(), trainInquiryRequest.getTxtTrnGpCd(), trainInquiryRequest.getTxtGoTrnNo(), trainInquiryRequest.getTxtGoStart(), trainInquiryRequest.getTxtGoEnd(), trainInquiryRequest.getTxtGoAbrdDt(), trainInquiryRequest.getTxtGoHour(), trainInquiryRequest.getTxtPsgFlg_1(), trainInquiryRequest.getTxtPsgFlg_2(), trainInquiryRequest.getTxtPsgFlg_3(), trainInquiryRequest.getTxtPsgFlg_4(), trainInquiryRequest.getTxtPsgFlg_5(), trainInquiryRequest.getTxtSeatAttCd_2(), trainInquiryRequest.getTxtSeatAttCd_3(), trainInquiryRequest.getTxtSeatAttCd_4(), trainInquiryRequest.getEbizCrossCheck(), trainInquiryRequest.getSrtCheckYn(), trainInquiryRequest.getRtYn());
    }
}
