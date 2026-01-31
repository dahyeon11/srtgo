package B6;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private List f358c;

    /* renamed from: d, reason: collision with root package name */
    private List f359d;

    /* renamed from: a, reason: collision with root package name */
    private c f356a = null;

    /* renamed from: b, reason: collision with root package name */
    private b f357b = b.GET;

    /* renamed from: e, reason: collision with root package name */
    private int f360e = -1;

    /* renamed from: f, reason: collision with root package name */
    private String f361f = "";

    public a() {
        this.f358c = null;
        this.f359d = null;
        this.f358c = new ArrayList();
        this.f359d = new ArrayList();
    }

    public void addHead(String str, String str2) {
        if (str.length() < 1) {
            return;
        }
        removeHead(str);
        this.f358c.add(new BasicNameValuePair(str, str2));
    }

    public void addParam(String str, String str2) {
        if (str.length() < 1) {
            return;
        }
        removeParam(str);
        this.f359d.add(new BasicNameValuePair(str, str2));
    }

    public void clear() {
        c cVar = this.f356a;
        if (cVar != null) {
            cVar.clear();
        }
        this.f357b = b.GET;
        List list = this.f358c;
        if (list != null) {
            list.clear();
        }
        List list2 = this.f359d;
        if (list2 != null) {
            list2.clear();
        }
        this.f360e = -1;
        this.f361f = "";
    }

    public String execute() throws Throwable {
        String strExecute = execute(this.f356a.toString(), this.f357b, this.f358c, this.f359d, this.f360e);
        this.f361f = strExecute;
        return strExecute;
    }

    public String getResponse() throws IOException {
        String str = this.f361f;
        if (str != null) {
            return str;
        }
        throw new IOException("not response");
    }

    public int getTimeout() {
        return this.f360e;
    }

    public c getURL() {
        return this.f356a;
    }

    public void removeHead(String str) {
        if (str.length() < 1) {
            return;
        }
        for (int i8 = 0; i8 < this.f358c.size(); i8++) {
            if (((NameValuePair) this.f358c.get(i8)).getName() == str) {
                this.f358c.remove(i8);
                return;
            }
        }
    }

    public void removeParam(String str) {
        if (str.length() < 1) {
            return;
        }
        for (int i8 = 0; i8 < this.f359d.size(); i8++) {
            if (((NameValuePair) this.f359d.get(i8)).getName() == str) {
                this.f359d.remove(i8);
                return;
            }
        }
    }

    public void setTimeout(int i8) {
        this.f360e = i8;
    }

    public void setURL(c cVar) {
        this.f356a = cVar;
    }

    public static String execute(String str) {
        return execute(str, b.GET, null, null, -1);
    }

    public void setURL(String str) {
        this.f356a = new c(str);
    }

    public static String execute(String str, int i8) {
        return execute(str, b.GET, null, null, i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String execute(String str, b bVar, List<NameValuePair> list, List<NameValuePair> list2, int i8) throws Throwable {
        DefaultHttpClient defaultHttpClient = null;
        HttpGet httpGet = null;
        try {
            try {
                DefaultHttpClient defaultHttpClient2 = new DefaultHttpClient();
                int i9 = i8 * 1000;
                if (i8 > 0) {
                    try {
                        HttpParams params = defaultHttpClient2.getParams();
                        HttpConnectionParams.setConnectionTimeout(params, i9);
                        HttpConnectionParams.setSoTimeout(params, i9);
                        ConnManagerParams.setTimeout(params, i9);
                    } catch (UnsupportedEncodingException e8) {
                        e = e8;
                        e.printStackTrace();
                        throw e;
                    } catch (ClientProtocolException e9) {
                        e = e9;
                        e.printStackTrace();
                        throw e;
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        defaultHttpClient = defaultHttpClient2;
                        if (defaultHttpClient != null) {
                            try {
                                defaultHttpClient.getConnectionManager().shutdown();
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                }
                if (bVar == b.POST) {
                    HttpPost httpPost = new HttpPost(str);
                    httpGet = httpPost;
                    if (list2 != null) {
                        httpGet = httpPost;
                        if (list2.size() > 0) {
                            httpPost.setEntity(new UrlEncodedFormEntity(list2));
                            httpGet = httpPost;
                        }
                    }
                } else if (bVar == b.GET) {
                    if (list2 != null && list2.size() > 0) {
                        String str2 = URLEncodedUtils.format(list2, "utf-8");
                        if (str2.length() > 1) {
                            str = (str.endsWith("?") ? str + "&" : str + "?") + str2;
                        }
                    }
                    httpGet = new HttpGet(str);
                }
                if (list != null) {
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        httpGet.addHeader(list.get(i10).getName(), list.get(i10).getValue());
                    }
                }
                HttpResponse httpResponseExecute = defaultHttpClient2.execute(httpGet);
                if (httpResponseExecute != null) {
                    String string = EntityUtils.toString(httpResponseExecute.getEntity());
                    try {
                        defaultHttpClient2.getConnectionManager().shutdown();
                    } catch (Exception unused2) {
                    }
                    return string;
                }
                throw new IOException("not response");
            } catch (UnsupportedEncodingException e11) {
                e = e11;
            } catch (ClientProtocolException e12) {
                e = e12;
            } catch (IOException e13) {
                e = e13;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
