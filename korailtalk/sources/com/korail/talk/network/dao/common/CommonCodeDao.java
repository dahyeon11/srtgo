package com.korail.talk.network.dao.common;

import com.korail.talk.network.BaseDao;
import com.korail.talk.network.BaseRequest;
import com.korail.talk.network.BaseResponse;
import com.korail.talk.ui.intro.IntroActivity;
import java.util.List;
import n4.AbstractC5955f;
import z3.InterfaceC6622c;
import z4.N;

/* loaded from: classes.dex */
public class CommonCodeDao extends BaseDao {
    public static final String ATHN = "app.hndy.athn";
    public static final String BUY_NOW = "app.menu.buynow";
    public static final String DATA = "app.var.data";
    public static final String DEVICE_NOUGAT = "app.device.nougat";
    public static final String EASY_PAY = "app.event.easyPay";
    public static final String HOLIDAY_POPUP = "app.holiday.popup";
    public static final String IMAGE_DOWN_LOAD_DATA = "app.display.image";
    public static final String IS_NAVER_SHOW = "app.easyLogin.isShow";
    public static final String KORAIL_BOSS = "app.korail.boss";
    public static final String LIMOUSINE_MAIN_MSG = "app.limousine.mainMsg";
    public static final String LIMOUSINE_MSG = "app.limousine.airportBusMsg";
    public static final String LOGIN = "app.login.cphd";
    public static final String LOST_ARTICLE = "app.menu.lost112";
    public static final String MAAS_TEST = "app.MaaS.test";
    public static final String MAIN_POPUP = "app.main.popup";
    public static final String MENU_BIZ = "app.menu.biz";
    public static final String MENU_RAILPOINT = "app.menu.railpoint";
    public static final String PERIOD_COMMUTATION_DATA = "app.periodCommutation.data";
    public static final String POINT = "app.event.point";
    public static final String REPORT = "app.illegal.report";
    public static final String STATION_CD = "app.limousine.stationCd";
    public static final String STATION_NM = "app.limousine.stationNm";
    public static final String STBK_ACCEPT = "app.stbk.accept";
    public static final String VIEW_VISIBILITY = "app.view.visibility";
    private boolean mIsPending = true;

    public class Accept {
        private String isCheck;
        private String linkUrl;
        private String message;

        public Accept() {
        }

        public String getIsCheck() {
            return this.isCheck;
        }

        public String getLinkurl() {
            return this.linkUrl;
        }

        public String getMessage() {
            return this.message;
        }
    }

    public class Athn {
        private String athnBtn;
        private String cncBtn;
        private String isApply;
        private String message;
        private String title;

        public Athn() {
        }

        public String getAthnBtn() {
            return this.athnBtn;
        }

        public String getCncBtn() {
            return this.cncBtn;
        }

        public String getMessage() {
            return this.message;
        }

        public String getTitle() {
            return this.title;
        }

        public boolean isApply() {
            return this.isApply.toUpperCase().equals("Y");
        }
    }

    public class BuyNow {
        private String isApply;
        private String menuTitle;

        public BuyNow() {
        }

        public String getIsApply() {
            return this.isApply;
        }

        public String getMenuTitle() {
            return this.menuTitle;
        }
    }

    public class CommonCodeRequest extends BaseRequest {
        private int OSVersion;
        private String arrivalDate;
        private List<String> codeList;
        private String departDate;
        private int deviceHeight;
        private int deviceWidth;
        private String easyPayType;
        private String holidayYn;

        public CommonCodeRequest() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getArrivalDate() {
            return this.arrivalDate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<String> getCodeList() {
            return this.codeList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getDepartDate() {
            return this.departDate;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getDeviceHeight() {
            return this.deviceHeight;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getDeviceWidth() {
            return this.deviceWidth;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getHolidayYn() {
            return this.holidayYn;
        }

        public String getEasyPayType() {
            return this.easyPayType;
        }

        public int getOSVersion() {
            return this.OSVersion;
        }

        public void setArrivalDate(String str) {
            this.arrivalDate = str;
        }

        public void setCodeList(List<String> list) {
            this.codeList = list;
        }

        public void setDepartDate(String str) {
            this.departDate = str;
        }

        public void setDeviceHeight(int i8) {
            this.deviceHeight = i8;
        }

        public void setDeviceWidth(int i8) {
            this.deviceWidth = i8;
        }

        public void setEasyPayType(String str) {
            this.easyPayType = str;
        }

        public void setHolidayYn(String str) {
            this.holidayYn = str;
        }

        public void setOSVersion(int i8) {
            this.OSVersion = i8;
        }
    }

    public class CommonCodeResponse extends BaseResponse {

        @InterfaceC6622c(CommonCodeDao.STBK_ACCEPT)
        private List<Accept> accepts;

        @InterfaceC6622c(CommonCodeDao.ATHN)
        private Athn athn;

        @InterfaceC6622c(CommonCodeDao.BUY_NOW)
        private BuyNow buyNow;

        @InterfaceC6622c(CommonCodeDao.DATA)
        private Data data;

        @InterfaceC6622c(CommonCodeDao.DEVICE_NOUGAT)
        private DeviceOSPopUp deviceNougat;

        @InterfaceC6622c(CommonCodeDao.EASY_PAY)
        private EasyPay easyPay;

        @InterfaceC6622c(CommonCodeDao.HOLIDAY_POPUP)
        private HolidayPopup holidayPopup;

        @InterfaceC6622c(CommonCodeDao.IMAGE_DOWN_LOAD_DATA)
        private ImageDownLoadData imageDownLoadData;

        @InterfaceC6622c(CommonCodeDao.IS_NAVER_SHOW)
        private EasyLogin isEasyLoginShow;

        @InterfaceC6622c(CommonCodeDao.KORAIL_BOSS)
        private KorailBoss korailBoss;

        @InterfaceC6622c(CommonCodeDao.LIMOUSINE_MSG)
        private String limousine;

        @InterfaceC6622c(CommonCodeDao.LIMOUSINE_MAIN_MSG)
        private String limousineMainMsg;

        @InterfaceC6622c(CommonCodeDao.LOGIN)
        private Login login;

        @InterfaceC6622c(CommonCodeDao.LOST_ARTICLE)
        private LostArticle lostArticle;

        @InterfaceC6622c(CommonCodeDao.MAAS_TEST)
        private String maasTest;

        @InterfaceC6622c(CommonCodeDao.MAIN_POPUP)
        private MainPopup mainPopup;

        @InterfaceC6622c(CommonCodeDao.MENU_BIZ)
        private MenuBiz menuBiz;

        @InterfaceC6622c(CommonCodeDao.MENU_RAILPOINT)
        private MenuRailPoint menuRailPoint;

        @InterfaceC6622c(CommonCodeDao.PERIOD_COMMUTATION_DATA)
        private PeriodCommutationData periodCommutationData;

        @InterfaceC6622c(CommonCodeDao.POINT)
        private Point pointData;

        @InterfaceC6622c(CommonCodeDao.REPORT)
        private Report report;

        @InterfaceC6622c(CommonCodeDao.STATION_CD)
        private List<String> stationCd;

        @InterfaceC6622c(CommonCodeDao.STATION_NM)
        private List<String> stationNm;

        @InterfaceC6622c(CommonCodeDao.VIEW_VISIBILITY)
        private ViewVisibility viewVisibility;

        public CommonCodeResponse() {
        }

        public List<Accept> getAccepts() {
            return this.accepts;
        }

        public Athn getAthn() {
            return this.athn;
        }

        public BuyNow getBuyNow() {
            return this.buyNow;
        }

        public Data getData() {
            return this.data;
        }

        public DeviceOSPopUp getDeviceNougat() {
            return this.deviceNougat;
        }

        public EasyLogin getEasyLoginShow() {
            return this.isEasyLoginShow;
        }

        public EasyPay getEasyPay() {
            return this.easyPay;
        }

        public HolidayPopup getHolidayPopup() {
            return this.holidayPopup;
        }

        public ImageDownLoadData getImageDownLoadData() {
            return this.imageDownLoadData;
        }

        public KorailBoss getKorailBoss() {
            return this.korailBoss;
        }

        public String getLimousineMainMsg() {
            return this.limousineMainMsg;
        }

        public String getLimousineMsg() {
            return this.limousine;
        }

        public Login getLogin() {
            return this.login;
        }

        public LostArticle getLostArticle() {
            return this.lostArticle;
        }

        public String getMaasTest() {
            return this.maasTest;
        }

        public MainPopup getMainPopup() {
            return this.mainPopup;
        }

        public MenuBiz getMenuBiz() {
            return this.menuBiz;
        }

        public MenuRailPoint getMenuRailPoint() {
            return this.menuRailPoint;
        }

        public PeriodCommutationData getPeriodCommutationData() {
            return this.periodCommutationData;
        }

        public Point getPoint() {
            return this.pointData;
        }

        public Report getReport() {
            return this.report;
        }

        public List<String> getStationCd() {
            return this.stationCd;
        }

        public List<String> getStationNm() {
            return this.stationNm;
        }

        public ViewVisibility getViewVisibility() {
            return this.viewVisibility;
        }
    }

    public class Data {
        private String autoRefresh;
        private String csChatBot;
        private String isMacroEnable;
        private String knDelivery;
        private String knParkingLot;
        private String lotteglogisURL;
        private String newTabUI1;
        private String newTabUI2;
        private String suspendMode;

        public Data() {
        }

        public String getAutoRefresh() {
            return this.autoRefresh;
        }

        public String getCsChatBot() {
            return this.csChatBot;
        }

        public String getIsMacroEnable() {
            return this.isMacroEnable;
        }

        public String getKnDelivery() {
            return this.knDelivery;
        }

        public String getKnParkingLot() {
            return this.knParkingLot;
        }

        public String getLotteglogisURL() {
            return this.lotteglogisURL;
        }

        public String getNewTabUI1() {
            return this.newTabUI1;
        }

        public String getNewTabUI2() {
            return this.newTabUI2;
        }

        public String getSuspendMode() {
            return this.suspendMode;
        }

        public void setAutoRefresh(String str) {
            this.autoRefresh = str;
        }
    }

    public class DeviceOSPopUp {
        private String isStop;
        private String message;
        private String title;

        public DeviceOSPopUp() {
        }

        public String getMessage() {
            return this.message;
        }

        public String getTitle() {
            return this.title;
        }

        public String isStop() {
            return this.isStop;
        }
    }

    public class EasyLogin {
        private String isGoogleShow;
        private String isKakaoShow;
        private String isNaverShow;
        private String isOnepassShow;

        public EasyLogin() {
        }

        public boolean isGoogleShow() {
            return "Y".equals(this.isGoogleShow);
        }

        public boolean isKakaoShow() {
            return "Y".equals(this.isKakaoShow);
        }

        public boolean isNaverShow() {
            return "Y".equals(this.isNaverShow);
        }

        public boolean isOnepassShow() {
            return "Y".equals(this.isOnepassShow);
        }
    }

    public class EasyPay {
        private List<EasyPayData> list;
        private int tab;

        public EasyPay() {
        }

        public List<EasyPayData> getList() {
            return this.list;
        }

        public int getTab() {
            return this.tab;
        }
    }

    public class EasyPayData {
        private String displayType;
        private String isEnable;
        private String isNeedLogin;
        private String linkTitle;
        private String linkType;
        private String linkUrl;
        private String payTitle;
        private String payType;

        public EasyPayData() {
        }

        public String getDisplayType() {
            return this.displayType;
        }

        public String getIsEnable() {
            return this.isEnable;
        }

        public String getIsNeedLogin() {
            return this.isNeedLogin;
        }

        public String getLinkTitle() {
            return this.linkTitle;
        }

        public String getLinkType() {
            return this.linkType;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }

        public String getPayTitle() {
            return this.payTitle;
        }

        public String getPayType() {
            return this.payType;
        }
    }

    public class HolidayPopup {
        private String popup;
        private String popupAlt;
        private String popupImg;
        private String popupUrl;
        private String subUrl;

        public HolidayPopup() {
        }

        public String getPopup() {
            return this.popup;
        }

        public String getPopupAlt() {
            return this.popupAlt;
        }

        public String getPopupImg() {
            return this.popupImg;
        }

        public String getPopupUrl() {
            return this.popupUrl;
        }

        public String getSubUrl() {
            return this.subUrl;
        }

        public void setPopup(String str) {
            this.popup = str;
        }

        public void setPopupAlt(String str) {
            this.popupAlt = str;
        }

        public void setPopupImg(String str) {
            this.popupImg = str;
        }

        public void setPopupUrl(String str) {
            this.popupUrl = str;
        }

        public void setSubUrl(String str) {
            this.subUrl = str;
        }
    }

    public class ImageDownLoadData {
        private String applyDate;
        private long fileSize;
        private String isApply;
        private String subUrl;
        private String textColor;
        private String url;

        public ImageDownLoadData() {
        }

        public String getApplyDate() {
            return this.applyDate;
        }

        public long getFileSize() {
            return this.fileSize;
        }

        public String getIsApply() {
            return this.isApply;
        }

        public String getSubUrl() {
            return this.subUrl;
        }

        public String getTextColor() {
            return N.isNull(this.textColor) ? IntroActivity.INTRO_TEXT_COLOR : this.textColor;
        }

        public String getUrl() {
            return this.url;
        }
    }

    public class KorailBoss {
        private String name;
        private String terms;

        public KorailBoss() {
        }

        public String getName() {
            return this.name;
        }

        public String getTerms() {
            return this.terms;
        }
    }

    public class Login {
        private String idx;
        private String key;
        private String pwdAESCphd;

        public Login() {
        }

        public String getIdx() {
            return this.idx;
        }

        public String getKey() {
            return this.key;
        }

        public String getPwdAESCphd() {
            return this.pwdAESCphd;
        }
    }

    public class LostArticle {
        private String isApply;
        private String linkUrl;
        private String menuTitle;

        public LostArticle() {
        }

        public String getIsApply() {
            return this.isApply;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }

        public String getMenuTitle() {
            return this.menuTitle;
        }
    }

    public class MainPopup {
        private String buttonType;
        private int checkType;
        private String clsBtn;
        private String imageUrl;
        private String isExternalBrowser;
        private String isShow;
        private String linkTitle;
        private String linkUrl;
        private String message;
        private int noticeId;
        private String size;
        private String title;
        private String voice;

        public MainPopup() {
        }

        public String getButtonType() {
            return this.buttonType;
        }

        public int getCheckType() {
            return this.checkType;
        }

        public String getClsBtn() {
            return this.clsBtn;
        }

        public String getImageUrl() {
            return this.imageUrl;
        }

        public String getIsExternalBrowser() {
            return this.isExternalBrowser;
        }

        public String getLinkTitle() {
            return this.linkTitle;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }

        public String getMessage() {
            return this.message;
        }

        public int getNoticeId() {
            return this.noticeId;
        }

        public String getShow() {
            return this.isShow;
        }

        public String getSize() {
            return this.size;
        }

        public String getTitle() {
            return this.title;
        }

        public String getVoice() {
            return this.voice;
        }
    }

    public class MenuBiz {
        private String isApply;
        private String linkUrl;
        private String title;

        public MenuBiz() {
        }

        public String getIsApply() {
            return this.isApply;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }

        public String getTitle() {
            return this.title;
        }
    }

    public class MenuRailPoint {
        private String appScheme;
        private String installUrl;
        private String isApply;
        private String menuTitle;

        public MenuRailPoint() {
        }

        public String getAppScheme() {
            return this.appScheme;
        }

        public String getInstallUrl() {
            return this.installUrl;
        }

        public String getIsApply() {
            return this.isApply;
        }

        public String getMenuTitle() {
            return this.menuTitle;
        }
    }

    public class PeriodCommutationData {
        private String periodCd;
        private String periodNm;

        public PeriodCommutationData() {
        }

        public String getPeriodCd() {
            return this.periodCd;
        }

        public String getPeriodNm() {
            return this.periodNm;
        }
    }

    public class Point {
        private List<PointData> list;

        public Point() {
        }

        public List<PointData> getList() {
            return this.list;
        }
    }

    public class PointData {
        private String isEnable;
        private String isNeedLogin;
        private String linkTitle;
        private String linkType;
        private String linkUrl;
        private String pointTitle;
        private String pointType;

        public PointData() {
        }

        public String getIsEnable() {
            return this.isEnable;
        }

        public String getIsNeedLogin() {
            return this.isNeedLogin;
        }

        public String getLinkTitle() {
            return this.linkTitle;
        }

        public String getLinkType() {
            return this.linkType;
        }

        public String getLinkUrl() {
            return this.linkUrl;
        }

        public String getPointTitle() {
            return this.pointTitle;
        }

        public String getPointType() {
            return this.pointType;
        }
    }

    public class Report {
        private String enable;
        private String title;
        private String url;

        public Report() {
        }

        public String getEnable() {
            return this.enable;
        }

        public String getTitle() {
            return this.title;
        }

        public String getUrl() {
            return this.url;
        }
    }

    public class ViewVisibility {
        private String acpnMlgLead;
        private String acpnMlgSave;
        private String centralInlandMap;
        private String checkIn;
        private String crmNty;
        private String dlfeCashRfn;
        private String giftTicket;
        private String hearingImpaired;
        private String hearingImpairedExps;
        private String mbSced;
        private String mbilPbepAthn;
        private String wheelchair;

        public ViewVisibility() {
        }

        public String getAcpnMlgLead() {
            return this.acpnMlgLead;
        }

        public String getAcpnMlgSave() {
            return this.acpnMlgSave;
        }

        public String getCentralInlandMap() {
            return this.centralInlandMap;
        }

        public String getCheckIn() {
            return this.checkIn;
        }

        public String getCrmNty() {
            return this.crmNty;
        }

        public String getDlfeCashRfn() {
            return this.dlfeCashRfn;
        }

        public String getGiftTicket() {
            return this.giftTicket;
        }

        public String getHearingImpaired() {
            return this.hearingImpaired;
        }

        public String getHearingImpairedExps() {
            return this.hearingImpairedExps;
        }

        public String getMbSced() {
            return this.mbSced;
        }

        public String getMbilPbepAthn() {
            return this.mbilPbepAthn;
        }

        public String getWheelchair() {
            return this.wheelchair;
        }
    }

    @Override // com.korail.talk.network.IBaseDao
    public BaseResponse executeDao() {
        CommonService commonService = (CommonService) getService(CommonService.class);
        CommonCodeRequest commonCodeRequest = (CommonCodeRequest) getRequest();
        return commonService.getCommonCode(commonCodeRequest.getDevice(), commonCodeRequest.getVersion(), commonCodeRequest.getKey(), commonCodeRequest.getCodeList(), commonCodeRequest.getDeviceWidth(), commonCodeRequest.getDeviceHeight(), commonCodeRequest.getDepartDate(), commonCodeRequest.getArrivalDate(), commonCodeRequest.getHolidayYn(), commonCodeRequest.getOSVersion());
    }

    @Override // com.korail.talk.network.IBaseDao
    public int getId() {
        return AbstractC5955f.dao_common_code;
    }

    @Override // com.korail.talk.network.BaseDao, com.korail.talk.network.IBaseDao
    public boolean isPending() {
        return this.mIsPending;
    }

    public void setPending(boolean z8) {
        this.mIsPending = z8;
    }
}
