package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MaasStationListDao extends BaseDao {

    public class MaasStationListRequest extends BaseRequest {
        public String addSrvDvCd;

        public MaasStationListRequest() {
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public void setAddSrvDvCd(String str) {
            this.addSrvDvCd = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CommonService) getService(CommonService.class)).getMaasStationList(((MaasStationListRequest) getRequest()).getAddSrvDvCd());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_maas_station_list;
    }
}
