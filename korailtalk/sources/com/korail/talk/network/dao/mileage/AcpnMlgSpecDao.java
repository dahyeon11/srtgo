package com.korail.talk.network.dao.mileage;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class AcpnMlgSpecDao extends BaseDao {

    public class AcpnMlgSpecRequest extends BaseRequest {
        private String pnrNo;

        public AcpnMlgSpecRequest() {
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }
    }

    public class AcpnMlgSpecResponse extends BaseResponse {
        private List<Ticket> tkList;

        public AcpnMlgSpecResponse() {
        }

        public List<Ticket> getTkList() {
            return this.tkList;
        }
    }

    public class Jrny implements Serializable {
        private String jrnySqno;
        private String jrnyTpCd;
        private String psrmClCd;
        private String psrmClNm;
        private List<Seat> seatList;

        public Jrny() {
        }

        public String getJrnySqno() {
            return this.jrnySqno;
        }

        public String getJrnyTpCd() {
            return this.jrnyTpCd;
        }

        public String getPsrmClCd() {
            return this.psrmClCd;
        }

        public String getPsrmClNm() {
            return this.psrmClNm;
        }

        public List<Seat> getSeatList() {
            return this.seatList;
        }
    }

    public class Seat implements Serializable {
        private String mlgSaveFlg;
        private String mlgSaveTgt;
        private String psgTpDvCd;
        private String psgTpDvNm;
        private String scarNo;
        private String seatNo;
        private String seatSpec;

        public Seat() {
        }

        public String getMlgSaveFlg() {
            return this.mlgSaveFlg;
        }

        public String getMlgSaveTgt() {
            return this.mlgSaveTgt;
        }

        public String getPsgTpDvCd() {
            return this.psgTpDvCd;
        }

        public String getPsgTpDvNm() {
            return this.psgTpDvNm;
        }

        public String getScarNo() {
            return this.scarNo;
        }

        public String getSeatNo() {
            return this.seatNo;
        }

        public String getSeatSpec() {
            return this.seatSpec;
        }
    }

    public class Ticket implements Serializable {
        private List<Jrny> jrnyList;
        private String mbCrdNo;
        private String rsvPsHndyTeln;
        private String rsvPsNm;
        private String saleDt;
        private String saleSqno;
        private String saleWctNo;
        private String tkRetPwd;

        public Ticket() {
        }

        public List<Jrny> getJrnyList() {
            return this.jrnyList;
        }

        public String getMbCrdNo() {
            return this.mbCrdNo;
        }

        public String getRsvPsHndyTeln() {
            return this.rsvPsHndyTeln;
        }

        public String getRsvPsNm() {
            return this.rsvPsNm;
        }

        public String getSaleDt() {
            return this.saleDt;
        }

        public String getSaleSqno() {
            return this.saleSqno;
        }

        public String getSaleWctNo() {
            return this.saleWctNo;
        }

        public String getTkRetPwd() {
            return this.tkRetPwd;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        MileageService mileageService = (MileageService) getService(MileageService.class);
        AcpnMlgSpecRequest acpnMlgSpecRequest = (AcpnMlgSpecRequest) getRequest();
        return mileageService.acpnMlgSpec(acpnMlgSpecRequest.getDevice(), acpnMlgSpecRequest.getVersion(), acpnMlgSpecRequest.getKey(), acpnMlgSpecRequest.getPnrNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_acpn_mlg_spec;
    }
}
