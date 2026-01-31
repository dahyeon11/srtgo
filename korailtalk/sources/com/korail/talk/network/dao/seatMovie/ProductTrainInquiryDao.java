package com.korail.talk.network.dao.seatMovie;

import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.request.inquiry.ProductTrainInquiryRequest;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ProductTrainInquiryDao extends InquiryDao implements Serializable {
    @Override // com.korail.talk.network.dao.seatMovie.InquiryDao, com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        SeatMovieService seatMovieService = (SeatMovieService) getService(SeatMovieService.class);
        ProductTrainInquiryRequest productTrainInquiryRequest = (ProductTrainInquiryRequest) getRequest();
        return seatMovieService.getRsvProductInquiry(productTrainInquiryRequest.getDevice(), productTrainInquiryRequest.getVersion(), productTrainInquiryRequest.getTxtMenuId(), productTrainInquiryRequest.getRadJobId(), productTrainInquiryRequest.getSelGoTrain(), productTrainInquiryRequest.getTxtTrnGpCd(), productTrainInquiryRequest.getTxtGoStart(), productTrainInquiryRequest.getTxtGoEnd(), productTrainInquiryRequest.getTxtGoAbrdDt(), productTrainInquiryRequest.getTxtGoHour(), productTrainInquiryRequest.getTxtPsgFlg_1(), productTrainInquiryRequest.getTxtPsgFlg_2(), productTrainInquiryRequest.getTxtPsgFlg_3(), productTrainInquiryRequest.getTxtPsgFlg_4(), productTrainInquiryRequest.getTxtPsgFlg_5(), productTrainInquiryRequest.getTxtSeatAttCd_2(), productTrainInquiryRequest.getTxtSeatAttCd_3(), productTrainInquiryRequest.getTxtSeatAttCd_4(), productTrainInquiryRequest.getTxtGdNo(), productTrainInquiryRequest.getQryDvCd(), productTrainInquiryRequest.getQryStNo(), productTrainInquiryRequest.getQryStTrnNo(), productTrainInquiryRequest.getQryStTrnNo2(), productTrainInquiryRequest.getPgPrCnt(), productTrainInquiryRequest.getChtnCnt(), productTrainInquiryRequest.getChtnRsStnCd(), productTrainInquiryRequest.getTrnGpCnt(), productTrainInquiryRequest.getTrnGpCd());
    }
}
