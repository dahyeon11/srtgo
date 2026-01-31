package com.korail.talk.network.dao.delay;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.response.delay.RefundResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class DptnBankDao extends BaseDao {

    public class DptnBank {
        private String dptnBankCd;
        private String dptnBankNm;

        public DptnBank() {
        }

        public String getDptnBankCd() {
            return this.dptnBankCd;
        }

        public String getDptnBankNm() {
            return this.dptnBankNm;
        }
    }

    public class DptnBankResponse extends RefundResponse {
        private List<DptnBank> dptnBank;

        public DptnBankResponse() {
        }

        public List<DptnBank> getDptnBank() {
            return this.dptnBank;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        DelayService delayService = (DelayService) getService(DelayService.class);
        BaseRequest request = getRequest();
        return delayService.dptnBank(request.getDevice(), request.getVersion(), request.getKey());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_dptn_bank;
    }
}
