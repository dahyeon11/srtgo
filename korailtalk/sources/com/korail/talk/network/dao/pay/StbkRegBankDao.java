package com.korail.talk.network.dao.pay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class StbkRegBankDao extends BaseDao {

    public class Reg {
        private String acntNo;
        private String imageUrl;
        private String isPay;
        private String pwdErrMsg;
        private String stlBankCd;

        public Reg() {
        }

        public String getAcntNo() {
            return this.acntNo;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getIsPay() {
            return this.isPay;
        }

        public String getPwdErrMsg() {
            return this.pwdErrMsg;
        }

        public String getStlBankCd() {
            return this.stlBankCd;
        }
    }

    public class RegPsb implements Serializable {
        private String imageUrl;
        private String stlBankCd;

        public RegPsb() {
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getStlBankCd() {
            return this.stlBankCd;
        }
    }

    public class StbkRegBankResponse extends BaseResponse {
        private List<Reg> regList;
        private List<RegPsb> regPsbList;

        public StbkRegBankResponse() {
        }

        public List<Reg> getRegList() {
            return this.regList;
        }

        public List<RegPsb> getRegPsbLists() {
            return this.regPsbList;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PayService payService = (PayService) getService(PayService.class);
        BaseRequest request = getRequest();
        return payService.stbkRegBank(request.getDevice(), request.getVersion(), request.getKey());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_stbk_reg_bank;
    }
}
