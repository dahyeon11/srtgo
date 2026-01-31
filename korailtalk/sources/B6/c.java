package B6;

import A6.h;
import com.kakao.sdk.common.Constants;
import java.net.URL;

/* loaded from: classes.dex */
public class c implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private String f364a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f365b = "";

    /* renamed from: c, reason: collision with root package name */
    private int f366c = -1;

    /* renamed from: d, reason: collision with root package name */
    private String f367d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f368e = "";

    public c() {
    }

    public static c make(String str, String str2, int i8, String str3) {
        c cVar = new c();
        cVar.setProtocol(str);
        cVar.setHost(str2);
        cVar.setPort(i8);
        cVar.setPath(str3);
        return cVar;
    }

    public void clear() {
        this.f364a = "";
        this.f365b = "";
        this.f366c = -1;
        this.f367d = "";
        this.f368e = "";
    }

    public String getHost() {
        return this.f365b;
    }

    public String getPath() {
        return this.f367d;
    }

    public int getPort() {
        return this.f366c;
    }

    public String getProtocol() {
        return this.f364a;
    }

    public String getQuery() {
        return this.f368e;
    }

    public void setHost(String str) {
        this.f365b = str;
    }

    public void setPath(String str) {
        this.f367d = str;
    }

    public void setPort(int i8) {
        this.f366c = i8;
    }

    public void setProtocol(String str) {
        this.f364a = str;
    }

    public void setQuery(String str) {
        this.f368e = str;
    }

    public String toString() {
        String str = new String();
        String str2 = this.f364a;
        if (str2 != null && str2.length() > 0) {
            str = str + this.f364a + "://";
        }
        String str3 = this.f365b;
        if (str3 != null && str3.length() > 0) {
            str = str + this.f365b;
        }
        if (this.f366c > 0) {
            if (this.f364a.equals("http")) {
                if (this.f366c != 80) {
                    str = str + ":" + this.f366c;
                }
            } else if (!this.f364a.equals(Constants.SCHEME)) {
                str = str + ":" + this.f366c;
            } else if (this.f366c != 443) {
                str = str + ":" + this.f366c;
            }
        }
        String str4 = str + "/";
        String str5 = this.f367d;
        if (str5 != null && str5.length() > 0) {
            str4 = str4 + this.f367d;
        }
        String str6 = this.f368e;
        if (str6 == null || str6.length() <= 0) {
            return str4;
        }
        return str4 + "?" + this.f368e;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public c m4clone() {
        try {
            c cVar = (c) super.clone();
            cVar.setProtocol(this.f364a);
            cVar.setHost(this.f365b);
            cVar.setPort(this.f366c);
            cVar.setPath(this.f367d);
            cVar.setQuery(this.f368e);
            return cVar;
        } catch (CloneNotSupportedException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static c make(h hVar) {
        return make(hVar.getProtocol(), hVar.getHost(), hVar.getPort(), hVar.getQuery());
    }

    public c(String str) {
        URL url = new URL(str);
        setProtocol(url.getProtocol());
        setHost(url.getHost());
        setPath(url.getPath());
        setQuery(url.getQuery());
        setPort(url.getPort());
    }
}
