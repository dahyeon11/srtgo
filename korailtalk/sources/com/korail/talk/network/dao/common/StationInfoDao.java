package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class StationInfoDao extends BaseDao {

    public class StationInfoResponse extends BaseResponse {
        private int count;
        private String map_version;

        public StationInfoResponse() {
        }

        public int getCount() {
            return this.count;
        }

        public String getMap_version() {
            return this.map_version;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CommonService) getService(CommonService.class)).getStationInfo(new BaseRequest().getDevice());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_station_info;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
