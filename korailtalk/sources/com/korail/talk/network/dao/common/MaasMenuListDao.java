package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import n4.AbstractC5955f;

/* loaded from: classes.dex */
public class MaasMenuListDao extends BaseDao {

    public class MaasMenuListResponse extends BaseResponse {
        String aBggTrsfRbtUrl;
        String aBisInfoUrl;
        String aElevatorUrl;
        String aParkingLotUrl;
        String dElevatorUrl;
        String dLeadNaviUrl;
        String dParkingLotUrl;
        private List<Menu> menuList;

        public MaasMenuListResponse() {
        }

        public List<Menu> getMenuList() {
            return this.menuList;
        }

        public String getaBggTrsfRbtUrl() {
            return this.aBggTrsfRbtUrl;
        }

        public String getaBisInfoUrl() {
            return this.aBisInfoUrl;
        }

        public String getaElevatorUrl() {
            return this.aElevatorUrl;
        }

        public String getaParkingLotUrl() {
            return this.aParkingLotUrl;
        }

        public String getdElevatorUrl() {
            return this.dElevatorUrl;
        }

        public String getdLeadNaviUrl() {
            return this.dLeadNaviUrl;
        }

        public String getdParkingLotUrl() {
            return this.dParkingLotUrl;
        }
    }

    public class MaasMenuRequest extends BaseRequest {
        private String addSrvReqNo;
        private String pnrNo;
        private ArrayList<String> tkRetNo;

        public MaasMenuRequest() {
        }

        public String getAddSrvReqNo() {
            return this.addSrvReqNo;
        }

        public String getPnrNo() {
            return this.pnrNo;
        }

        public ArrayList<String> getTkRetNo() {
            return this.tkRetNo;
        }

        public void setAddSrvReqNo(String str) {
            this.addSrvReqNo = str;
        }

        public void setPnrNo(String str) {
            this.pnrNo = str;
        }

        public void setTkRetNo(ArrayList<String> arrayList) {
            this.tkRetNo = arrayList;
        }
    }

    public class Menu implements Serializable {
        private String active;
        private String addSrvDvCd;
        private String appData;
        private String iconOff;
        private String iconOn;
        private String info;
        private String login;
        private String name;
        private String poppImg;
        private String type;
        private String url;

        public Menu() {
        }

        public String getActive() {
            return this.active;
        }

        public String getAddSrvDvCd() {
            return this.addSrvDvCd;
        }

        public String getAppData() {
            return this.appData;
        }

        public String getIconOff() {
            return this.iconOff;
        }

        public String getIconOn() {
            return this.iconOn;
        }

        public String getInfo() {
            return this.info;
        }

        public String getLogin() {
            return this.login;
        }

        public String getName() {
            return this.name;
        }

        public String getPoppImg() {
            return this.poppImg;
        }

        public String getType() {
            return this.type;
        }

        public String getUrl() {
            return this.url;
        }

        public void setPoppImg(String str) {
            this.poppImg = str;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        BaseRequest request = getRequest();
        if (!(request instanceof MaasMenuRequest)) {
            return commonService.getMaasMenuList(request.getDevice(), request.getVersion(), null, null, null);
        }
        MaasMenuRequest maasMenuRequest = (MaasMenuRequest) request;
        return commonService.getMaasMenuList(maasMenuRequest.getDevice(), maasMenuRequest.getVersion(), maasMenuRequest.getPnrNo(), maasMenuRequest.getTkRetNo(), maasMenuRequest.getAddSrvReqNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_maas_menu_list;
    }
}
