package A6;

import com.j256.ormlite.stmt.query.SimpleComparison;

/* loaded from: classes.dex */
public class i implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private a f132a = a.None;

    /* renamed from: b, reason: collision with root package name */
    private String f133b = "";

    /* renamed from: c, reason: collision with root package name */
    private int f134c = 0;

    /* renamed from: d, reason: collision with root package name */
    private String f135d = "";

    /* renamed from: e, reason: collision with root package name */
    private int f136e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f137f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f138g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f139h = 0;

    /* renamed from: i, reason: collision with root package name */
    private int f140i = 0;

    public static i Parser(String str) throws b {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf < 0) {
            throw new b(a.ErrorData);
        }
        i iVar = new i();
        try {
            iVar.setCode(a.toEnum(Integer.parseInt(str.substring(0, iIndexOf))));
            for (String str2 : str.substring(iIndexOf + 1).split("&")) {
                String[] strArrSplit = str2.split(SimpleComparison.EQUAL_TO_OPERATION);
                if (strArrSplit.length >= 2) {
                    if (strArrSplit[0].equals("key")) {
                        iVar.setKey(strArrSplit[1]);
                    } else if (strArrSplit[0].equals("utime")) {
                        iVar.setUptime(Integer.parseInt(strArrSplit[1]));
                    } else if (strArrSplit[0].equals("ip")) {
                        iVar.setHost(strArrSplit[1]);
                    } else if (strArrSplit[0].equals("port")) {
                        iVar.setPort(Integer.parseInt(strArrSplit[1]));
                    } else if (strArrSplit[0].equals("ttl")) {
                        iVar.setTTL(Integer.parseInt(strArrSplit[1]));
                    } else if (strArrSplit[0].equals("tps")) {
                        iVar.setTPS(Float.parseFloat(strArrSplit[1]));
                    } else if (strArrSplit[0].equals("nwait")) {
                        iVar.setWaitCount(Integer.parseInt(strArrSplit[1]));
                    } else if (strArrSplit[0].equals("nnext")) {
                        iVar.setNextCount(Integer.parseInt(strArrSplit[1]));
                    }
                }
            }
            return iVar;
        } catch (Exception e8) {
            throw new b(a.ErrorData, e8.getMessage());
        }
    }

    public void clear() {
        this.f132a = a.None;
        this.f133b = "";
        this.f134c = 0;
        this.f135d = "";
        this.f136e = 0;
        this.f137f = 0;
        this.f138g = 0.0f;
        this.f139h = 0;
        this.f140i = 0;
    }

    public a getCode() {
        return this.f132a;
    }

    public String getHost() {
        return this.f135d;
    }

    public String getKey() {
        return this.f133b;
    }

    public int getNextCount() {
        return this.f140i;
    }

    public int getPort() {
        return this.f136e;
    }

    public float getTPS() {
        return this.f138g;
    }

    public int getTTL() {
        return this.f137f;
    }

    public int getUptime() {
        return this.f134c;
    }

    public int getWaitCount() {
        return this.f139h;
    }

    public void setCode(a aVar) {
        this.f132a = aVar;
    }

    public void setHost(String str) {
        this.f135d = str;
    }

    public void setKey(String str) {
        this.f133b = str;
    }

    public void setNextCount(int i8) {
        this.f140i = i8;
    }

    public void setPort(int i8) {
        this.f136e = i8;
    }

    public void setTPS(float f8) {
        this.f138g = f8;
    }

    public void setTTL(int i8) {
        this.f137f = i8;
    }

    public void setUptime(int i8) {
        this.f134c = i8;
    }

    public void setWaitCount(int i8) {
        this.f139h = i8;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public i m2clone() {
        try {
            i iVar = (i) super.clone();
            iVar.setCode(this.f132a);
            iVar.setUptime(this.f134c);
            iVar.setKey(this.f133b);
            iVar.setHost(this.f135d);
            iVar.setPort(this.f136e);
            iVar.setTTL(this.f137f);
            iVar.setTPS(this.f138g);
            iVar.setWaitCount(this.f139h);
            iVar.setNextCount(this.f140i);
            return iVar;
        } catch (CloneNotSupportedException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public int getTTL(int i8, int i9) {
        int i10 = this.f137f;
        if (i8 <= 0 || i10 <= i8) {
            i8 = i10;
        }
        return i8 < i9 ? i9 : i8;
    }
}
