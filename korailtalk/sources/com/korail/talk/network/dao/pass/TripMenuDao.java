package com.korail.talk.network.dao.pass;

import I4.h;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.network.dao.pass.DiscountMenuDao;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;
import z4.N;

/* loaded from: classes.dex */
public class TripMenuDao extends BaseDao {

    public class ContentInfo implements Serializable {
        private String cmtrKndCd;
        private String contDetail;
        private String contImage;
        private String contTitle;
        private String contUrl;
        private String detailType;
        private String passActive;
        private String passAgree;
        private DiscountMenuDao.PassMainInfo passData;
        private String passInfo;
        private String passType;

        public ContentInfo() {
        }

        public String getCmtrKndCd() {
            return this.cmtrKndCd;
        }

        public String getContDetail() {
            return this.contDetail;
        }

        public String getContImage() {
            return this.contImage;
        }

        public String getContTitle() {
            return this.contTitle;
        }

        public String getContUrl() {
            return this.contUrl;
        }

        public String getDetailType() {
            return this.detailType;
        }

        public String getPassActive() {
            return this.passActive;
        }

        public String getPassAgree() {
            return N.isNull(this.passAgree) ? "" : this.passAgree.replaceAll("\\{custNm\\}", h.getInstance().getMemberName());
        }

        public DiscountMenuDao.PassMainInfo getPassData() {
            return this.passData;
        }

        public String getPassInfo() {
            return this.passInfo;
        }

        public String getPassType() {
            return this.passType;
        }
    }

    public class TripMenu implements Serializable {
        private String contCount;
        private List<ContentInfo> contList;
        private String menuBtn;
        private String menuDetail;
        private String menuTitle;
        private String menuType;
        private String menuUrl;

        public TripMenu() {
        }

        public String getContCount() {
            return this.contCount;
        }

        public List<ContentInfo> getContList() {
            return this.contList;
        }

        public String getMenuBtn() {
            return this.menuBtn;
        }

        public String getMenuDetail() {
            return this.menuDetail;
        }

        public String getMenuTitle() {
            return this.menuTitle;
        }

        public String getMenuType() {
            return this.menuType;
        }

        public String getMenuUrl() {
            return this.menuUrl;
        }
    }

    public class TripMenuResponse extends BaseResponse {
        private List<TripMenu> menuList;
        public String poppMsg;

        public TripMenuResponse() {
        }

        public List<TripMenu> getList() {
            return this.menuList;
        }

        public String getPoppMsg() {
            return this.poppMsg;
        }

        public void setPoppMsg(String str) {
            this.poppMsg = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        BaseRequest request = getRequest();
        return passService.tripMenu(request.getDevice(), request.getVersion());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_trip_menu;
    }
}
