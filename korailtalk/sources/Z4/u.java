package z4;

import android.content.Context;
import android.net.Uri;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.korail.talk.data.login.DoNotLookAgainData;
import com.korail.talk.data.login.LoginPopUpData;
import com.korail.talk.network.dao.addService.HelpSrvCustDao;
import com.korail.talk.network.dao.common.CommonCodeDao;
import com.korail.talk.network.dao.login.LoginDao;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import com.korail.talk.ui.ticket.confirm.TicketListActivity;
import com.korail.talk.ui.web.IntegrationWebViewActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import n4.AbstractC5959j;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class u extends C6632f {
    public static String getLoginAuthenticationPostData(LoginDao loginDao) {
        LoginDao.LoginRequest loginRequest = (LoginDao.LoginRequest) loginDao.getRequest();
        LoginDao.LoginResponse loginResponse = (LoginDao.LoginResponse) loginDao.getResponse();
        StringBuilder sb = new StringBuilder();
        sb.append("callLogin=Y&");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("memId=");
        sb2.append(N.isNotNull(loginRequest.getLoginId()) ? loginRequest.getLoginId() : loginRequest.getCustId());
        sb2.append("&");
        sb.append(sb2.toString());
        sb.append("inputFlg=" + loginRequest.getLoginType() + "&");
        try {
            JSONObject jSONObject = new JSONObject(q.toJson(loginResponse));
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next);
                if (!"strResult".equals(next) && !"h_msg_txt".equals(next)) {
                    sb.append(next + SimpleComparison.EQUAL_TO_OPERATION + strOptString);
                    sb.append("&");
                }
            }
            sb.setLength(sb.length() - 1);
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
        return sb.toString();
    }

    public static ArrayList<LoginPopUpData> getLoginSuccessPopupData(Context context, LoginDao.LoginResponse loginResponse, boolean z8) {
        ArrayList<LoginPopUpData> arrayList = new ArrayList<>();
        String str = loginResponse.gethMsgCd();
        String notiTpCd = loginResponse.getNotiTpCd();
        String strAthnFlg5 = loginResponse.getStrAthnFlg5();
        CommonCodeDao.Athn athn = (CommonCodeDao.Athn) q.fromJson(H.getString(context, "ATHN"), CommonCodeDao.Athn.class);
        if ("MC".equals(notiTpCd) || "MM".equals(notiTpCd)) {
            HashMap<String, String> map = new HashMap<>();
            map.put("notiTpCd", "MC");
            LoginPopUpData loginPopUpData = new LoginPopUpData();
            loginPopUpData.setDialogType(1004);
            loginPopUpData.setTitle(C6632f.a(context, AbstractC5959j.dialog_title));
            loginPopUpData.setMessage(C6632f.b(context, AbstractC5959j.macro_alert_message, loginResponse.getStrCustNm(), loginResponse.getStrMbCrdNo()));
            loginPopUpData.setCheckBoxMessage(C6632f.a(context, AbstractC5959j.dialog_checkbox_confirm));
            loginPopUpData.setBtnNames(N.getStringArray(C6632f.a(context, AbstractC5959j.common_confirm)));
            loginPopUpData.setExecuteData(map);
            arrayList.add(loginPopUpData);
            if ("MM".equals(notiTpCd)) {
                new HashMap().put("notiTpCd", "MM");
                LoginPopUpData loginPopUpData2 = new LoginPopUpData();
                loginPopUpData2.setDialogType(1004);
                loginPopUpData2.setTitle(C6632f.a(context, AbstractC5959j.dialog_title));
                loginPopUpData2.setMessage(C6632f.b(context, AbstractC5959j.macro_alert_message, loginResponse.getStrCustNm(), loginResponse.getStrMbCrdNo()));
                loginPopUpData2.setCheckBoxMessage(C6632f.a(context, AbstractC5959j.dialog_checkbox_confirm));
                loginPopUpData2.setBtnNames(N.getStringArray(C6632f.a(context, AbstractC5959j.common_confirm)));
                loginPopUpData2.setExecuteData(map);
                arrayList.add(loginPopUpData2);
            }
        } else if ("MS".equals(notiTpCd)) {
            HashMap<String, String> map2 = new HashMap<>();
            map2.put("notiTpCd", "MS");
            LoginPopUpData loginPopUpData3 = new LoginPopUpData();
            loginPopUpData3.setDialogType(1004);
            loginPopUpData3.setTitle(C6632f.a(context, AbstractC5959j.dialog_title));
            loginPopUpData3.setMessage(context.getString(AbstractC5959j.many_alert_message));
            loginPopUpData3.setHasHtml(true);
            loginPopUpData3.setDim(true);
            loginPopUpData3.setCheckBoxMessage(C6632f.a(context, AbstractC5959j.dialog_checkbox_confirm));
            loginPopUpData3.setBtnNames(N.getStringArray(C6632f.a(context, AbstractC5959j.common_confirm)));
            loginPopUpData3.setExecuteData(map2);
            arrayList.add(loginPopUpData3);
        }
        if ("S200".equals(str)) {
            LoginPopUpData loginPopUpData4 = new LoginPopUpData();
            loginPopUpData4.setDialogType(1002);
            loginPopUpData4.setAClass(TicketListActivity.class);
            loginPopUpData4.setTitle(C6632f.a(context, AbstractC5959j.dialog_title));
            loginPopUpData4.setMessage(loginResponse.gethMsgTxt());
            loginPopUpData4.setBtnNames(N.getStringArray(C6632f.a(context, AbstractC5959j.common_cancel), C6632f.a(context, AbstractC5959j.common_confirm)));
            arrayList.add(loginPopUpData4);
        }
        if ("Y".equals(loginResponse.getDlayDscpInfo())) {
            DoNotLookAgainData doNotLookAgainData = new DoNotLookAgainData();
            doNotLookAgainData.setCustMgNo(loginResponse.getStrCustNo());
            doNotLookAgainData.setDoNotLookAgainType(0);
            doNotLookAgainData.setTitle(C6632f.a(context, AbstractC5959j.dialog_title_delay_compensate));
            doNotLookAgainData.setMessage(C6632f.a(context, AbstractC5959j.dialog_delay_compensate_msg1));
            doNotLookAgainData.setCheckBoxMessage(C6632f.a(context, AbstractC5959j.do_not_show_one_week));
            doNotLookAgainData.setBtnNames(N.getStringArray(C6632f.a(context, AbstractC5959j.common_later), C6632f.a(context, AbstractC5959j.common_move)));
            arrayList.add(doNotLookAgainData);
        }
        if ("N".equals(strAthnFlg5) && athn.isApply() && z8) {
            LoginPopUpData loginPopUpData5 = new LoginPopUpData();
            loginPopUpData5.setDialogType(1002);
            loginPopUpData5.setAClass(IntegrationWebViewActivity.class);
            loginPopUpData5.setTitle(athn.getTitle());
            loginPopUpData5.setMessage(athn.getMessage());
            loginPopUpData5.setBtnNames(N.getStringArray(athn.getCncBtn(), athn.getAthnBtn()));
            loginPopUpData5.setUrl(r4.g.PHONE_AUTH_URL);
            loginPopUpData5.setRequestCode(122);
            arrayList.add(loginPopUpData5);
        }
        return arrayList;
    }

    public static boolean isEasyLoginType(String str) {
        return "K".equals(str) || "N".equals(str) || y1.x.MAX_AD_CONTENT_RATING_G.equals(str) || HelpSrvCustDao.HelpSrvCustRequest.f27549D.equals(str);
    }

    public static boolean isLoginSuccess(String str) {
        return "IRZ000001".equals(str) || "S200".equals(str);
    }

    public static boolean isOnepassScheme(Context context, Uri uri) {
        return (uri.getScheme() + "://" + uri.getAuthority()).contains(context.getString(AbstractC5959j.korailtalk_scheme_certify));
    }

    public static void setLoginData(LoginDao.LoginResponse loginResponse) {
        I4.h hVar = I4.h.getInstance();
        hVar.setLogin(true);
        hVar.setMemberName(loginResponse.getStrCustNm());
        hVar.setMemberNum(loginResponse.getStrMbCrdNo());
        hVar.setMemberBirth(loginResponse.getStrBtdt());
        hVar.setMemberPhoneNo(loginResponse.getStrCpNo());
        hVar.setMemberEmailAdr(loginResponse.getStrEmailAdr());
        hVar.setCustNo(loginResponse.getStrCustNo());
        hVar.setEncryptMbCrdNo(loginResponse.getEncryptMbCrdNo());
        hVar.setEncryptCustNo(loginResponse.getEncryptCustNo());
        hVar.setEncryptHMbCrdNo(loginResponse.getEncryptHMbCrdNo());
        hVar.setCustClCd(loginResponse.getStrCustClCd());
        hVar.setDisableGrade(loginResponse.getStrSubtDcsClCd());
        hVar.setCustLeadFlg(loginResponse.getStrCustLeadFlg().equals("Y"));
        hVar.setHearingImpaired(loginResponse.getStrHdcpTpCd());
        hVar.setVisualImpairment(loginResponse.getStrHdcpTpCd());
        hVar.setPhysicalDisability(loginResponse.getStrHdcpTpCd());
        hVar.setStrAthnFlg7(loginResponse.getStrAthnFlg7());
        String strYouthAgrFlg = loginResponse.getStrYouthAgrFlg();
        if (N.isNotNull(strYouthAgrFlg)) {
            hVar.setYouthType("2".equals(strYouthAgrFlg) ? I4.h.TEENAGER_TYPE : StbkAcntDao.CHANGE_PASSWORD.equals(strYouthAgrFlg) ? I4.h.YOUTH_TYPE : "");
        }
        String strCustDvCd = loginResponse.getStrCustDvCd();
        String strCustSrtCd = loginResponse.getStrCustSrtCd();
        String strCustMgSrtCd = loginResponse.getStrCustMgSrtCd();
        t.d("cusDvCd : " + strCustDvCd + ", custSrtCd : " + strCustSrtCd + ", custMgSrtCd : " + strCustMgSrtCd + ", strLognTpCd6 : " + loginResponse.getStrLognTpCd6());
        if (N.isNotNull(strCustDvCd) && N.isNotNull(strCustSrtCd) && N.isNotNull(strCustMgSrtCd)) {
            if ("C".equals(strCustDvCd) && "317".equals(strCustSrtCd) && "C".equals(strCustMgSrtCd)) {
                hVar.setSejongMember(true);
                if ("P".equals(loginResponse.getStrLognTpCd6())) {
                    hVar.setSejongCertification(false);
                } else {
                    hVar.setSejongCertification(true);
                }
            } else if ("C".equals(strCustDvCd) && "317".equals(strCustSrtCd) && "N".equals(strCustMgSrtCd)) {
                hVar.setNaJuMember(true);
            } else if ("C".equals(strCustDvCd) && "317".equals(strCustSrtCd) && "K".equals(strCustMgSrtCd)) {
                hVar.setSinGyeongJu(true);
            }
        }
        hVar.setDeffMember("C".equals(strCustDvCd) && "311".equals(strCustSrtCd));
        hVar.setEmployee("S".equals(strCustMgSrtCd) && "320".equals(strCustSrtCd));
        if (I4.h.getInstance().isNonMember()) {
            I4.h.getInstance().initNonmemberData();
        }
    }
}
