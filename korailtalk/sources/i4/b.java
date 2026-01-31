package I4;

import com.korail.talk.network.request.inquiry.RsvInquiryRequest;
import java.lang.reflect.InvocationTargetException;
import org.json.JSONException;
import org.json.JSONObject;
import r4.s;
import z4.t;

/* loaded from: classes.dex */
public class b {
    public static final String ARV_RS_STN_CD = "arvRsStnCd";
    public static final String DPT_DT = "dptDt";
    public static final String DPT_RS_STN_CD = "dptRsStnCd";
    public static final String DPT_TM = "dptTm";
    public static final String TRAIN_NO = "txtGoTrnNo";

    /* renamed from: c, reason: collision with root package name */
    private static b f2056c;

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f2057a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2058b;

    public b() throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a();
    }

    private void a() throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        JSONObject jSONObject = new JSONObject();
        this.f2057a = jSONObject;
        try {
            s sVar = s.ALL;
            jSONObject.put("stlbTrnClsfCd", sVar.getCode());
            this.f2057a.put("trnGpCd", sVar.getCode());
            this.f2057a.put("arriveTime", "N");
            this.f2057a.put("rtYn", "N");
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
    }

    public static b getInstance() {
        if (f2056c == null) {
            f2056c = new b();
        }
        return f2056c;
    }

    public JSONObject getJsonObject() {
        return this.f2057a;
    }

    public boolean isCorpTransfer() {
        return this.f2058b;
    }

    public void setChtnDvCd(String str) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2057a.put("chtnDvCd", str);
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
    }

    public void setCorpTransfer(boolean z8) {
        this.f2058b = z8;
    }

    public void setMutMrkVrfCd(String str) throws IllegalAccessException, JSONException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t.e("mutMrkVrfCd : " + str);
        try {
            this.f2057a.put("mutMrkVrfCd", str);
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
    }

    public void setPassengerData(RsvInquiryRequest rsvInquiryRequest) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2057a.put("rqSeatAttCd", rsvInquiryRequest.getTxtSeatAttCd_4());
            this.f2057a.put("locSeatAttCd", rsvInquiryRequest.getTxtSeatAttCd_3());
            this.f2057a.put("psgNum1", rsvInquiryRequest.getTxtPsgFlg_1());
            this.f2057a.put("psgNum2", rsvInquiryRequest.getTxtPsgFlg_2());
            this.f2057a.put("psgNum3", rsvInquiryRequest.getTxtPsgFlg_3());
            this.f2057a.put("psgNum4", rsvInquiryRequest.getTxtPsgFlg_4());
            this.f2057a.put("psgNum5", rsvInquiryRequest.getTxtPsgFlg_5());
            JSONObject jSONObject = this.f2057a;
            jSONObject.put("psgNum", jSONObject.optInt("psgNum1") + this.f2057a.optInt("psgNum2") + this.f2057a.optInt("psgNum3") + this.f2057a.optInt("psgNum4") + this.f2057a.optInt("psgNum5"));
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
    }

    public void setTrainData(String str, String str2, String str3, String str4, String str5) throws JSONException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f2057a.put(TRAIN_NO, str);
            this.f2057a.put("dptRsStnCd", str2);
            this.f2057a.put(ARV_RS_STN_CD, str3);
            this.f2057a.put(DPT_DT, str4);
            this.f2057a.put(DPT_TM, str5);
        } catch (JSONException e8) {
            t.e(e8.getMessage());
        }
    }
}
