package com.korail.talk.network.dao.pass;

import I4.h;
import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import java.io.Serializable;
import java.util.List;
import n4.AbstractC5955f;
import z4.C6630d;
import z4.N;

/* loaded from: classes.dex */
public class DiscountMenuDao extends BaseDao {

    public class DiscountMenu implements Serializable {
        private int afterDay;
        private String agree;
        private String detailType;
        private String dtlDsc;
        private String enable;
        private GoodInfo goodsData;
        private String id;
        private String information;
        private String isExpand;
        private String parentId;
        private PassMainInfo passData;
        private String repSegArv;
        private String repSegDpt;
        private String title;
        private String trnGpCd;
        private String type;
        private WebData webData;

        public DiscountMenu() {
        }

        public int getAfterDay() {
            return this.afterDay;
        }

        public String getAgree() {
            return N.isNull(this.agree) ? "" : this.agree.replaceAll("\\{custNm\\}", h.getInstance().getMemberName());
        }

        public String getDetailType() {
            return this.detailType;
        }

        public String getDtlDsc() {
            return this.dtlDsc;
        }

        public String getEnable() {
            return this.enable;
        }

        public GoodInfo getGoodsData() {
            return this.goodsData;
        }

        public String getId() {
            return this.id;
        }

        public String getInformation() {
            return N.isNull(this.information) ? "" : this.information.replaceAll("\\{custNm\\}", h.getInstance().getMemberName());
        }

        public String getIsExpand() {
            return C6630d.isNotNull(this.isExpand) ? this.isExpand : "N";
        }

        public String getParentId() {
            return this.parentId;
        }

        public PassMainInfo getPassData() {
            return this.passData;
        }

        public String getRepSegArv() {
            return this.repSegArv;
        }

        public String getRepSegDpt() {
            return this.repSegDpt;
        }

        public String getTitle() {
            return this.title;
        }

        public String getTrnGpCd() {
            return this.trnGpCd;
        }

        public String getType() {
            return this.type;
        }

        public WebData getWebData() {
            return this.webData;
        }

        public String setDetailType(String str) {
            this.detailType = str;
            return str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setTrnGpCd(String str) {
            this.trnGpCd = str;
        }
    }

    public class DiscountMenuRequest extends BaseRequest {
        private String menuNo;

        public DiscountMenuRequest() {
        }

        public String getMenuNo() {
            return this.menuNo;
        }

        public void setMenuNo(String str) {
            this.menuNo = str;
        }
    }

    public class DiscountMenuResponse extends BaseResponse {
        private List<DiscountMenu> list;

        public DiscountMenuResponse() {
        }

        public List<DiscountMenu> getList() {
            return this.list;
        }
    }

    public class GoodInfo implements Serializable {
        private String h_cnd_flg_disc_no;
        private PsgInfos psg_infos;

        public GoodInfo() {
        }

        public String getH_cnd_flg_disc_no() {
            return this.h_cnd_flg_disc_no;
        }

        public PsgInfos getPsg_infos() {
            return this.psg_infos;
        }
    }

    public class PassAgeInfo implements Serializable {
        private String h_cmtr_utl_age_cd;
        private String h_comn_cd_nm;
        private String h_max_age;
        private String h_min_age;

        public PassAgeInfo() {
        }

        public String getH_cmtr_utl_age_cd() {
            return this.h_cmtr_utl_age_cd;
        }

        public String getH_comn_cd_nm() {
            return this.h_comn_cd_nm;
        }

        public String getH_max_age() {
            return this.h_max_age;
        }

        public String getH_min_age() {
            return this.h_min_age;
        }
    }

    public class PassMainInfo implements Serializable {
        private String h_cmtr_knd_cd;
        private String h_select_station;
        private List<PassAgeInfo> pass_ageinfo;
        private List<PassPeriodInfo> pass_periodinfo;

        public PassMainInfo() {
        }

        public String getH_cmtr_knd_cd() {
            return this.h_cmtr_knd_cd;
        }

        public String getH_select_station() {
            return this.h_select_station;
        }

        public List<PassAgeInfo> getPass_ageinfo() {
            return this.pass_ageinfo;
        }

        public List<PassPeriodInfo> getPass_periodinfo() {
            return this.pass_periodinfo;
        }
    }

    public class PassPeriodInfo implements Serializable {
        private String h_cmtr_utl_trm_cd;
        private String h_comn_cd_nm;

        public PassPeriodInfo() {
        }

        public String getH_cmtr_utl_trm_cd() {
            return this.h_cmtr_utl_trm_cd;
        }

        public String getH_comn_cd_nm() {
            return this.h_comn_cd_nm;
        }
    }

    public class PsgInfo implements Serializable {
        private int h_cls_prnb;
        private String h_dcnt_knd_cd;
        private int h_st_prnb;

        public PsgInfo() {
        }

        public int getH_cls_prnb() {
            return this.h_cls_prnb;
        }

        public String getH_dcnt_knd_cd() {
            return this.h_dcnt_knd_cd;
        }

        public int getH_st_prnb() {
            return this.h_st_prnb;
        }
    }

    public class PsgInfos implements Serializable {
        private String h_chtn_allw_flg;
        private String h_max_cnt;
        private String h_min_cnt;
        private List<PsgInfo> psg_info;

        public PsgInfos() {
        }

        public String getH_chtn_allw_flg() {
            return this.h_chtn_allw_flg;
        }

        public String getH_max_cnt() {
            return this.h_max_cnt;
        }

        public String getH_min_cnt() {
            return this.h_min_cnt;
        }

        public List<PsgInfo> getPsg_info() {
            return this.psg_info;
        }
    }

    public class WebData implements Serializable {
        String url;

        public WebData() {
        }

        public String getUrl() {
            return this.url;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        PassService passService = (PassService) getService(PassService.class);
        DiscountMenuRequest discountMenuRequest = (DiscountMenuRequest) getRequest();
        return passService.passMenu(discountMenuRequest.getDevice(), discountMenuRequest.getVersion(), discountMenuRequest.getKey(), discountMenuRequest.getMenuNo());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_discount_menu;
    }
}
