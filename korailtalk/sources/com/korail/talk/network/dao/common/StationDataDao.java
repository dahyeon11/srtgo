package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseResponse;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class StationDataDao extends BaseDao {

    public static class STN {
        protected String group;
        protected String latitude;
        protected String longitude;
        protected String major;
        protected String popupLinkTitle;
        protected String popupLinkUrl;
        protected String popupMessage;
        protected int popupType;
        protected String stn_cd;
        protected String stn_nm;

        public String getGroup() {
            return this.group;
        }

        public String getLatitude() {
            return this.latitude;
        }

        public String getLongitude() {
            return this.longitude;
        }

        public String getMajor() {
            return this.major;
        }

        public String getPopupLinkTitle() {
            return this.popupLinkTitle;
        }

        public String getPopupLinkUrl() {
            return this.popupLinkUrl;
        }

        public String getPopupMessage() {
            return this.popupMessage;
        }

        public int getPopupType() {
            return this.popupType;
        }

        public String getStn_cd() {
            return this.stn_cd;
        }

        public String getStn_nm() {
            return this.stn_nm;
        }
    }

    public static class STNSetter extends STN {
        protected int setterType = -1;

        public int getSetterType() {
            return this.setterType;
        }

        public void setGroup(String str) {
            this.group = str;
        }

        public void setLatitude(String str) {
            this.latitude = str;
        }

        public void setLongitude(String str) {
            this.longitude = str;
        }

        public void setMajor(String str) {
            this.major = str;
        }

        public void setPopupLinkTitle(String str) {
            this.popupLinkTitle = str;
        }

        public void setPopupLinkUrl(String str) {
            this.popupLinkUrl = str;
        }

        public void setPopupMessage(String str) {
            this.popupMessage = str;
        }

        public void setPopupType(int i8) {
            this.popupType = i8;
        }

        public void setSetterType(int i8) {
            this.setterType = i8;
        }

        public void setStn_cd(String str) {
            this.stn_cd = str;
        }

        public void setStn_nm(String str) {
            this.stn_nm = str;
        }
    }

    public class STNs {
        private List<STN> stn;

        public STNs() {
        }

        public List<STN> getStn() {
            return this.stn;
        }
    }

    public class StationDataResponse extends BaseResponse {
        private STNs stns;

        public StationDataResponse() {
        }

        public STNs getStns() {
            return this.stns;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        return ((CommonService) getService(CommonService.class)).getStationData();
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_station_data;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return false;
    }
}
