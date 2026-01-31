package A6;

/* loaded from: classes.dex */
public class h implements Cloneable {

    /* renamed from: r, reason: collision with root package name */
    private static h f114r;

    /* renamed from: a, reason: collision with root package name */
    private boolean f115a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f116b = false;

    /* renamed from: c, reason: collision with root package name */
    private String f117c = "http";

    /* renamed from: d, reason: collision with root package name */
    private String f118d = "nf2.netfunnel.co.kr";

    /* renamed from: e, reason: collision with root package name */
    private int f119e = 80;

    /* renamed from: f, reason: collision with root package name */
    private int f120f = 3;

    /* renamed from: g, reason: collision with root package name */
    private int f121g = 2;

    /* renamed from: h, reason: collision with root package name */
    private String f122h = "ts.wseq";

    /* renamed from: i, reason: collision with root package name */
    private String f123i = r4.g.NETFUNNEL_SERVER_ID;

    /* renamed from: j, reason: collision with root package name */
    private String f124j = "act_1";

    /* renamed from: k, reason: collision with root package name */
    private int f125k = 30;

    /* renamed from: l, reason: collision with root package name */
    private boolean f126l = false;

    /* renamed from: m, reason: collision with root package name */
    private int f127m = 5;

    /* renamed from: n, reason: collision with root package name */
    private int f128n = 100;

    /* renamed from: o, reason: collision with root package name */
    private int f129o = 0;

    /* renamed from: p, reason: collision with root package name */
    private int f130p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f131q = 0;

    public static h getDefaultInstance() {
        h hVar = f114r;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        f114r = hVar2;
        return hVar2;
    }

    public String getActionID() {
        return this.f124j;
    }

    public String getHost() {
        return this.f118d;
    }

    public int getMaxTTL() {
        return this.f125k;
    }

    public int getNotupdateWaitcountBypassLimit() {
        return this.f128n;
    }

    public int getNotupdateWaitcountChecktime() {
        return this.f127m;
    }

    public int getPort() {
        return this.f119e;
    }

    public String getProtocol() {
        return this.f117c;
    }

    public String getQuery() {
        return this.f122h;
    }

    public int getRetry() {
        return this.f121g;
    }

    public String getServiceID() {
        return this.f123i;
    }

    public int getTimeout() {
        return this.f120f;
    }

    public int getUiNextCountLimit() {
        return this.f131q;
    }

    public int getUiWaitCountLimit() {
        return this.f130p;
    }

    public int getUiWaitTimeLimit() {
        return this.f129o;
    }

    public boolean isBypass() {
        return this.f115a;
    }

    public boolean isErrorBypass() {
        return this.f116b;
    }

    public boolean isHostNotmodify() {
        return this.f126l;
    }

    public void set(h hVar) {
        setBypass(hVar.isBypass());
        setErrorBypass(hVar.isErrorBypass());
        setProtocol(hVar.getProtocol());
        setHost(hVar.getHost());
        setPort(hVar.getPort());
        setQuery(hVar.getQuery());
        setServiceID(hVar.getServiceID());
        setActionID(hVar.getActionID());
        setMaxTTL(hVar.getMaxTTL());
        setTimeout(hVar.getTimeout());
        setRetry(hVar.getRetry());
        setHostNotmodify(hVar.isHostNotmodify());
        setNotupdateWaitcountChecktime(hVar.getNotupdateWaitcountChecktime());
        setNotupdateWaitcountBypassLimit(hVar.getNotupdateWaitcountBypassLimit());
        setUiWaitTimeLimit(hVar.getUiWaitTimeLimit());
        setUiWaitCountLimit(hVar.getUiWaitCountLimit());
        setUiNextCountLimit(hVar.getUiNextCountLimit());
    }

    public void setActionID(String str) {
        this.f124j = str;
    }

    public void setBypass(boolean z8) {
        this.f115a = z8;
    }

    public void setErrorBypass(boolean z8) {
        this.f116b = z8;
    }

    public void setHost(String str) {
        this.f118d = str;
    }

    public void setHostNotmodify(boolean z8) {
        this.f126l = z8;
    }

    public void setMaxTTL(int i8) {
        this.f125k = i8;
    }

    public void setNotupdateWaitcountBypassLimit(int i8) {
        this.f128n = i8;
    }

    public void setNotupdateWaitcountChecktime(int i8) {
        this.f127m = i8;
    }

    public void setPort(int i8) {
        this.f119e = i8;
    }

    public void setProtocol(String str) {
        this.f117c = str;
    }

    public void setQuery(String str) {
        this.f122h = str;
    }

    public void setRetry(int i8) {
        this.f121g = i8;
    }

    public void setServiceID(String str) {
        this.f123i = str;
    }

    public void setTimeout(int i8) {
        this.f120f = i8;
    }

    public void setUiNextCountLimit(int i8) {
        this.f131q = i8;
    }

    public void setUiWaitCountLimit(int i8) {
        this.f130p = i8;
    }

    public void setUiWaitTimeLimit(int i8) {
        this.f129o = i8;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public h m1clone() {
        try {
            h hVar = (h) super.clone();
            hVar.set(this);
            return hVar;
        } catch (CloneNotSupportedException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
