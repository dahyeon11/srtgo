package I4;

import android.content.Context;
import com.korail.talk.application.KTApplication;
import p4.C6054a;
import z4.C6630d;
import z4.H;
import z4.N;

/* loaded from: classes.dex */
public class h {

    /* renamed from: E */
    private static h f2074E = null;
    public static final String TEENAGER_TYPE = "TEENAGER_TYPE";
    public static final String YOUTH_TYPE = "YOUTH_TYPE";

    /* renamed from: A */
    private String f2075A;

    /* renamed from: B */
    private String f2076B;

    /* renamed from: C */
    private String f2077C;

    /* renamed from: D */
    private String f2078D;

    /* renamed from: a */
    private boolean f2079a;

    /* renamed from: b */
    private String f2080b;

    /* renamed from: c */
    private String f2081c;

    /* renamed from: d */
    private String f2082d;

    /* renamed from: e */
    private String f2083e;

    /* renamed from: f */
    private String f2084f;

    /* renamed from: g */
    private String f2085g;

    /* renamed from: h */
    private String f2086h;

    /* renamed from: i */
    private String f2087i;

    /* renamed from: j */
    private String f2088j;

    /* renamed from: k */
    private String f2089k;

    /* renamed from: l */
    private String f2090l;

    /* renamed from: m */
    private String f2091m;

    /* renamed from: n */
    private String f2092n;

    /* renamed from: o */
    private boolean f2093o;

    /* renamed from: p */
    private boolean f2094p;

    /* renamed from: q */
    private boolean f2095q;

    /* renamed from: r */
    private boolean f2096r;

    /* renamed from: s */
    private boolean f2097s;

    /* renamed from: t */
    private boolean f2098t;

    /* renamed from: u */
    private boolean f2099u;

    /* renamed from: v */
    private boolean f2100v;

    /* renamed from: w */
    private boolean f2101w;

    /* renamed from: x */
    private boolean f2102x;

    /* renamed from: y */
    private boolean f2103y;

    /* renamed from: z */
    private boolean f2104z;

    public static h getInstance() {
        if (C6630d.isNull(f2074E)) {
            f2074E = new h();
        }
        return f2074E;
    }

    public String getCustClCd() {
        return this.f2089k;
    }

    public String getCustNo() {
        return this.f2085g;
    }

    public String getDisableGrade() {
        return C6630d.isNull(this.f2091m) ? "" : this.f2091m;
    }

    public String getEncryptCustNo() {
        return this.f2087i;
    }

    public String getEncryptHMbCrdNo() {
        return this.f2088j;
    }

    public String getEncryptMbCrdNo() {
        return this.f2086h;
    }

    public String getMemberBirthDay() {
        return this.f2082d;
    }

    public String getMemberEmailAdr() {
        return this.f2084f;
    }

    public String getMemberName() {
        return N.isNull(this.f2080b) ? "" : this.f2080b;
    }

    public String getMemberNum() {
        return this.f2081c;
    }

    public String getMemberPhoneNo() {
        return this.f2083e;
    }

    public String getNonMemberName() {
        return this.f2075A;
    }

    public String getNonMemberNumber() {
        return this.f2076B;
    }

    public String getNonMemberPassword() {
        return this.f2078D;
    }

    public String getNonMemberPhoneNumber() {
        return this.f2077C;
    }

    public String getStrAthnFlg7() {
        return this.f2092n;
    }

    public String getYouthType() {
        return C6630d.isNull(this.f2090l) ? "" : this.f2090l;
    }

    public void initLoginData(Context context) {
        KTApplication.getInstance().clearCookie();
        H.putBoolean(context, "KEY_AUTO_LOGIN", false);
        H.putString(context, "KEY_LOGIN_PW", "");
        setLogin(false);
        setMemberName("");
        setMemberNum("");
        setMemberBirth("");
        setMemberPhoneNo("");
        setMemberEmailAdr("");
        setCustNo("");
        setEncryptMbCrdNo("");
        setEncryptCustNo("");
        setEncryptHMbCrdNo("");
        setCustClCd("");
        setYouthType("");
        setSejongMember(false);
        setSejongCertification(true);
        setNaJuMember(false);
        setSinGyeongJu(false);
        setDeffMember(false);
        setEmployee(false);
        setCustLeadFlg(false);
        setHearingImpaired("");
        setVisualImpairment("");
        setPhysicalDisability("");
        setNotificationExist(false);
    }

    public void initNonmemberData() {
        setNonMember(false);
        setNonMemberName(null);
        setNonMemberNumber(null);
        setNonMemberPhoneNumber(null);
        setNonMemberPassword(null);
        setNotificationExist(false);
    }

    public boolean isCustLeadFlg() {
        return this.f2099u;
    }

    public boolean isDeffMember() {
        return this.f2097s;
    }

    public boolean isEmployee() {
        return this.f2098t;
    }

    public boolean isHearingImpaired() {
        return this.f2100v;
    }

    public boolean isLogin() {
        return this.f2079a;
    }

    public boolean isNaJuMember() {
        return this.f2095q;
    }

    public boolean isNonMember() {
        return this.f2104z;
    }

    public boolean isNotificationExist() {
        return this.f2103y;
    }

    public boolean isPhysicalDisability() {
        return this.f2102x;
    }

    public Boolean isSejongCertification() {
        return Boolean.valueOf(this.f2094p);
    }

    public Boolean isSejongMember() {
        return Boolean.valueOf(this.f2093o);
    }

    public boolean isSinGyeongJu() {
        return this.f2096r;
    }

    public boolean isVisualImpairment() {
        return this.f2101w;
    }

    public void setCustClCd(String str) {
        this.f2089k = str;
    }

    public void setCustLeadFlg(boolean z8) {
        this.f2099u = z8;
    }

    public void setCustNo(String str) {
        this.f2085g = str;
    }

    public void setDeffMember(boolean z8) {
        this.f2097s = z8;
    }

    public void setDisableGrade(String str) {
        this.f2091m = str;
    }

    public void setEmployee(boolean z8) {
        this.f2098t = z8;
    }

    public void setEncryptCustNo(String str) {
        this.f2087i = str;
    }

    public void setEncryptHMbCrdNo(String str) {
        this.f2088j = str;
    }

    public void setEncryptMbCrdNo(String str) {
        this.f2086h = str;
    }

    public void setHearingImpaired(String str) {
        this.f2100v = this.f2079a && (str.equals("30") || str.equals("31") || str.equals("32"));
    }

    public void setLogin(boolean z8) {
        this.f2079a = z8;
    }

    public void setMemberBirth(String str) {
        this.f2082d = str;
    }

    public void setMemberEmailAdr(String str) {
        this.f2084f = str;
    }

    public void setMemberName(String str) {
        this.f2080b = str;
    }

    public void setMemberNum(String str) {
        this.f2081c = str;
    }

    public void setMemberPhoneNo(String str) {
        this.f2083e = str;
    }

    public void setNaJuMember(boolean z8) {
        this.f2095q = z8;
    }

    public void setNonMember(boolean z8) {
        this.f2104z = z8;
    }

    public void setNonMemberName(String str) {
        this.f2075A = str;
    }

    public void setNonMemberNumber(String str) {
        this.f2076B = str;
    }

    public void setNonMemberPassword(String str) {
        this.f2078D = str;
    }

    public void setNonMemberPhoneNumber(String str) {
        this.f2077C = str;
    }

    public void setNotificationExist(boolean z8) {
        this.f2103y = z8;
    }

    public void setPhysicalDisability(String str) {
        this.f2102x = this.f2079a && (str.equals("11") || str.equals("13") || str.equals(C6054a.AFTER_DEPARTURE) || str.equals("20"));
    }

    public void setSejongCertification(boolean z8) {
        this.f2094p = z8;
    }

    public void setSejongMember(boolean z8) {
        this.f2093o = z8;
    }

    public void setSinGyeongJu(boolean z8) {
        this.f2096r = z8;
    }

    public void setStrAthnFlg7(String str) {
        this.f2092n = str;
    }

    public void setVisualImpairment(String str) {
        this.f2101w = this.f2079a && str.equals("20");
    }

    public void setYouthType(String str) {
        this.f2090l = str;
    }
}
