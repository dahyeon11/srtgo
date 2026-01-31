package E4;

import com.korail.talk.network.request.research.SeatSearchRequest;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;

/* loaded from: classes.dex */
public class b {
    public static SeatSearchRequest getSearchRequest(String str, String str2, RsvInquiryResponse.TrainInfo trainInfo) {
        SeatSearchRequest seatSearchRequest = new SeatSearchRequest();
        seatSearchRequest.setTxtMenuId(str);
        seatSearchRequest.setTxtRunDt(trainInfo.getH_run_dt());
        seatSearchRequest.setTxtDptDt(trainInfo.getH_dpt_dt());
        seatSearchRequest.setTxtTrnNo(trainInfo.getH_trn_no());
        seatSearchRequest.setTxtTrnClsfCd(trainInfo.getH_trn_clsf_cd());
        seatSearchRequest.setTxtTrnGpCd(trainInfo.getH_trn_gp_cd());
        seatSearchRequest.setTxtDptRsStnCd(trainInfo.getH_dpt_rs_stn_cd());
        seatSearchRequest.setTxtArvRsStnCd(trainInfo.getH_arv_rs_stn_cd());
        seatSearchRequest.setTxtPsrmClCd(str2);
        seatSearchRequest.setTxtSeatAttCd(trainInfo.getH_seat_att_cd());
        seatSearchRequest.setTxtDptStnRunOrdr(trainInfo.getH_dpt_stn_run_ordr());
        seatSearchRequest.setTxtArvStnRunOrdr(trainInfo.getH_arv_stn_run_ordr());
        seatSearchRequest.setTxtTotPsgCnt(trainInfo.getTotPsgCnt());
        seatSearchRequest.setTxtGdNo(trainInfo.getTxtGdNo());
        seatSearchRequest.setTrnClsfNm(trainInfo.getH_trn_clsf_nm());
        return seatSearchRequest;
    }
}
