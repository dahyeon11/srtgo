package com.korail.talk.network.dao.research;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CmtrInfoDao extends BaseDao {

    public class CmtrInfoRequest extends BaseRequest {
        public static final String JOB_DV_CD_A = "a";
        public static final String JOB_DV_CD_B = "b";
        public static final String JOB_DV_CD_C = "c";
        private String cmtrKndCd;
        private List<String> cmtrUtlAgeCd;
        private String inquiryType;
        private String jobDvCd;
        private String ogtkRetPwd;
        private String ogtkSaleDd;
        private String ogtkSaleSqno;
        private String ogtkSaleWctNo;
        private int psgCnt;
        private List<Integer> psgPrnb;

        public CmtrInfoRequest() {
        }

        public String getCmtrKndCd() {
            return this.cmtrKndCd;
        }

        public List<String> getCmtrUtlAgeCd() {
            return this.cmtrUtlAgeCd;
        }

        public String getInquiryType() {
            return this.inquiryType;
        }

        public String getJobDvCd() {
            return this.jobDvCd;
        }

        public String getOgtkRetPwd() {
            return this.ogtkRetPwd;
        }

        public String getOgtkSaleDd() {
            return this.ogtkSaleDd;
        }

        public String getOgtkSaleSqno() {
            return this.ogtkSaleSqno;
        }

        public String getOgtkSaleWctNo() {
            return this.ogtkSaleWctNo;
        }

        public int getPsgCnt() {
            return this.psgCnt;
        }

        public List<Integer> getPsgPrnb() {
            return this.psgPrnb;
        }

        public void setCmtrKndCd(String str) {
            this.cmtrKndCd = str;
        }

        public void setCmtrUtlAgeCd(List<String> list) {
            this.cmtrUtlAgeCd = list;
        }

        public void setInquiryType(String str) {
            this.inquiryType = str;
        }

        public void setJobDvCd(String str) {
            this.jobDvCd = str;
        }

        public void setOgtkRetPwd(String str) {
            this.ogtkRetPwd = str;
        }

        public void setOgtkSaleDd(String str) {
            this.ogtkSaleDd = str;
        }

        public void setOgtkSaleSqno(String str) {
            this.ogtkSaleSqno = str;
        }

        public void setOgtkSaleWctNo(String str) {
            this.ogtkSaleWctNo = str;
        }

        public void setPsgCnt(int i8) {
            this.psgCnt = i8;
        }

        public void setPsgPrnb(List<Integer> list) {
            this.psgPrnb = list;
        }
    }

    public class CmtrInfoResponse extends BaseResponse {
        private String addSrvGdFlg;
        private int avlPrnbFrom;
        private int avlPrnbTo;
        private String cmpaFlg;
        private String cmtrKndCd;
        private String cmtrUtlAgeCd;
        private String menuId;
        private String poppMsg;
        private String prmoMsg;
        private String prmoUrl;
        private List<Psg> psgList;
        private String seatAttCd1;

        public CmtrInfoResponse() {
        }

        public String getAddSrvGdFlg() {
            return this.addSrvGdFlg;
        }

        public int getAvlPrnbFrom() {
            return this.avlPrnbFrom;
        }

        public int getAvlPrnbTo() {
            return this.avlPrnbTo;
        }

        public String getCmpaFlg() {
            return this.cmpaFlg;
        }

        public String getCmtrKndCd() {
            return this.cmtrKndCd;
        }

        public String getCmtrUtlAgeCd() {
            return this.cmtrUtlAgeCd;
        }

        public String getMenuId() {
            return this.menuId;
        }

        public String getPoppMsg() {
            return this.poppMsg;
        }

        public String getPrmoMsg() {
            return this.prmoMsg;
        }

        public String getPrmoUrl() {
            return this.prmoUrl;
        }

        public List<Psg> getPsgList() {
            return this.psgList;
        }

        public String getSeatAttCd1() {
            return this.seatAttCd1;
        }
    }

    public class Psg {
        private String cmtrUtlAgeCd;
        private String comnCdNm;
        private int psgPrnbFrom;
        private int psgPrnbTo;

        public Psg() {
        }

        public String getCmtrUtlAgeCd() {
            return this.cmtrUtlAgeCd;
        }

        public String getComnCdNm() {
            return this.comnCdNm;
        }

        public int getPsgPrnbFrom() {
            return this.psgPrnbFrom;
        }

        public int getPsgPrnbTo() {
            return this.psgPrnbTo;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        ResearchService researchService = (ResearchService) getService(ResearchService.class);
        CmtrInfoRequest cmtrInfoRequest = (CmtrInfoRequest) getRequest();
        return researchService.getCmtrInfo(cmtrInfoRequest.getDevice(), cmtrInfoRequest.getVersion(), cmtrInfoRequest.getKey(), cmtrInfoRequest.getJobDvCd(), cmtrInfoRequest.getCmtrKndCd(), cmtrInfoRequest.getPsgCnt(), cmtrInfoRequest.getCmtrUtlAgeCd(), cmtrInfoRequest.getPsgPrnb(), cmtrInfoRequest.getOgtkSaleWctNo(), cmtrInfoRequest.getOgtkSaleDd(), cmtrInfoRequest.getOgtkSaleSqno(), cmtrInfoRequest.getOgtkRetPwd(), cmtrInfoRequest.getInquiryType());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cmtr_info;
    }
}
