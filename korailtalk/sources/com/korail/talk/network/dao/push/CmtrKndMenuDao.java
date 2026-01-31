package com.korail.talk.network.dao.push;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class CmtrKndMenuDao extends BaseDao {

    public class CmtrKndMenuRequest extends BaseRequest {
        private String cmtrKndCd;

        public CmtrKndMenuRequest() {
        }

        public String getCmtrKndCd() {
            return this.cmtrKndCd;
        }

        public void setCmtrKndCd(String str) {
            this.cmtrKndCd = str;
        }
    }

    public class CmtrKndMenuResponse extends BaseResponse {
        private String afterDay;
        private String agree;
        private String information;
        private DiscountMenuDao.PassMainInfo passData;
        private String title;

        public CmtrKndMenuResponse() {
        }

        public String getAfterDay() {
            return this.afterDay;
        }

        public String getAgree() {
            return this.agree;
        }

        public String getInformation() {
            return this.information;
        }

        public DiscountMenuDao.PassMainInfo getPassData() {
            return this.passData;
        }

        public String getTitle() {
            return this.title;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PushService pushService = (PushService) getService(PushService.class);
        CmtrKndMenuRequest cmtrKndMenuRequest = (CmtrKndMenuRequest) getRequest();
        return pushService.cmtrKndPassMenu(cmtrKndMenuRequest.getDevice(), cmtrKndMenuRequest.getVersion(), cmtrKndMenuRequest.getKey(), cmtrKndMenuRequest.getCmtrKndCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_cmtrknd_info;
    }
}
