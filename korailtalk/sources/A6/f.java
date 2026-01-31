package A6;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class f implements Cloneable {

    /* renamed from: e */
    private static f f89e;

    /* renamed from: a */
    private String f90a = "";

    /* renamed from: b */
    private boolean f91b = true;

    /* renamed from: c */
    private int f92c = 30;

    /* renamed from: d */
    private long f93d = 0;

    public static boolean LOAD() {
        return getGlobalInstance().LoadCheck();
    }

    public static h Parser(String str) throws JSONException, b {
        if (str.length() == 0) {
            throw new b(a.ErrorData);
        }
        int iIndexOf = str.indexOf("{");
        if (iIndexOf < 0) {
            throw new b(a.ErrorData);
        }
        if (iIndexOf > 0) {
            str = str.substring(iIndexOf);
        }
        h hVarM1clone = h.getDefaultInstance().m1clone();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = jSONObject.getJSONObject("server");
            hVarM1clone.setProtocol(jSONObject2.getString("protocol"));
            hVarM1clone.setHost(jSONObject2.getString("host"));
            hVarM1clone.setPort(jSONObject2.getInt("port"));
            hVarM1clone.setTimeout(jSONObject2.getInt("timeout"));
            hVarM1clone.setRetry(jSONObject2.getInt("retry"));
            hVarM1clone.setErrorBypass(jSONObject2.getBoolean("err_bypass"));
            hVarM1clone.setBypass(jSONObject2.getBoolean("bypass"));
            hVarM1clone.setMaxTTL(jSONObject2.getInt("max_ttl"));
            hVarM1clone.setHostNotmodify(jSONObject2.getBoolean("host_notmodify"));
            hVarM1clone.setNotupdateWaitcountChecktime(jSONObject2.getInt("notupdate_waitcount_checktime"));
            hVarM1clone.setNotupdateWaitcountBypassLimit(jSONObject2.getInt("notupdate_waitcount_bypass_limit"));
            JSONObject jSONObject3 = jSONObject.getJSONObject("ui");
            hVarM1clone.setUiWaitTimeLimit(jSONObject3.getInt("waittime_limit"));
            hVarM1clone.setUiWaitCountLimit(jSONObject3.getInt("waitcount_limit"));
            hVarM1clone.setUiNextCountLimit(jSONObject3.getInt("nextcount_limit"));
            return hVarM1clone;
        } catch (Exception e8) {
            throw new b(a.ErrorData, e8.getMessage());
        }
    }

    public static f getGlobalInstance() {
        f fVar = f89e;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f();
        f89e = fVar2;
        return fVar2;
    }

    public boolean LoadCheck() {
        try {
            if (getUrl().length() < 1) {
                return true;
            }
            int i8 = this.f92c;
            if (i8 < 0) {
                if (this.f93d > 0) {
                    return true;
                }
            } else if (i8 > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                if (jCurrentTimeMillis - this.f93d < this.f92c) {
                    return true;
                }
                this.f93d = jCurrentTimeMillis;
            }
            h hVarParser = Parser(B6.a.execute(getUrl()));
            h.getDefaultInstance().set(hVarParser);
            hVarParser.setServiceID(g.getGlobalInstance().getProperty().getServiceID());
            hVarParser.setActionID(g.getGlobalInstance().getProperty().getActionID());
            g.getGlobalInstance().setProperty(hVarParser);
            this.f93d = System.currentTimeMillis() / 1000;
            return true;
        } catch (Exception unused) {
            return isErrBypass();
        }
    }

    public int getUpdateInterval() {
        return this.f92c;
    }

    public long getUpdateTimeMillis() {
        return this.f93d;
    }

    public String getUrl() {
        return this.f90a;
    }

    public boolean isErrBypass() {
        return this.f91b;
    }

    public void setErrBypass(boolean z8) {
        this.f91b = z8;
    }

    public void setUpdateInterval(int i8) {
        this.f92c = i8;
    }

    public void setUpdateTimeMillis(long j8) {
        this.f93d = j8;
    }

    public void setUrl(String str) {
        this.f90a = str;
    }

    /* renamed from: clone */
    public f m0clone() {
        try {
            f fVar = (f) super.clone();
            fVar.setErrBypass(this.f91b);
            fVar.setUpdateInterval(this.f92c);
            fVar.setUpdateTimeMillis(this.f93d);
            return fVar;
        } catch (CloneNotSupportedException e8) {
            e8.printStackTrace();
            return null;
        }
    }
}
