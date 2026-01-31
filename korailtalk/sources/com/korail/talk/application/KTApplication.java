package com.korail.talk.application;

import A6.h;
import I4.a;
import K1.S0;
import Q7.C0709m;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import com.j256.ormlite.stmt.query.SimpleComparison;
import com.kakao.sdk.common.Constants;
import com.kakao.sdk.common.KakaoSdk;
import io.grpc.internal.U;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.util.List;
import n4.AbstractC5959j;
import n4.C5950a;
import o0.ApplicationC6023b;
import q4.C6111b;
import r4.C6174a;
import r4.g;
import z4.C6630d;
import z4.C6639m;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class KTApplication extends ApplicationC6023b {

    /* renamed from: a, reason: collision with root package name */
    private static KTApplication f27547a;
    public static boolean isAppRunning;

    private void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannelA = S0.a("com.korail.talkemergency", "긴급공지", 4);
            NotificationChannel notificationChannelA2 = S0.a(C5950a.APPLICATION_ID, "일반공지", 4);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannelA);
                notificationManager.createNotificationChannel(notificationChannelA2);
            }
        }
    }

    private void b() {
        try {
            C6639m.deleteDir(C6639m.getFolder(getApplicationContext(), C6174a.VOLATILITY_FOLDER));
            C6639m.deleteDir(C6639m.getFolder(getApplicationContext(), C6174a.QR_FOLDER));
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    private void c() {
        f();
        i();
    }

    private void d() {
        f27547a = this;
        c();
        h();
        C6111b.init(getApplicationContext());
    }

    private void e() {
        a.getInstance().createTypeface(getApplicationContext());
    }

    private void f() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(cookieManager);
    }

    private void g() {
        h defaultInstance = h.getDefaultInstance();
        defaultInstance.setProtocol(Constants.SCHEME);
        defaultInstance.setHost("nf.letskorail.com");
        defaultInstance.setPort(U.DEFAULT_PORT_SSL);
        defaultInstance.setServiceID(g.NETFUNNEL_SERVER_ID);
        defaultInstance.setActionID(g.NETFUNNEL_ACTION_ID);
        defaultInstance.setTimeout(3);
    }

    public static KTApplication getInstance() {
        return f27547a;
    }

    private void h() {
        System.setProperty("http.keepAlive", C0709m.FALSE);
    }

    private void i() {
    }

    public void clearCookie() {
        android.webkit.CookieManager.getInstance().removeAllCookies(null);
        android.webkit.CookieManager.getInstance().flush();
        f();
    }

    public String getCookie() {
        List<HttpCookie> cookies;
        CookieManager cookieManager = (CookieManager) CookieHandler.getDefault();
        if (C6630d.isNotNull(cookieManager) && (cookies = cookieManager.getCookieStore().getCookies()) != null) {
            for (HttpCookie httpCookie : cookies) {
                if (httpCookie.getName().equals("JSESSIONID")) {
                    return httpCookie.getName() + SimpleComparison.EQUAL_TO_OPERATION + httpCookie.getValue();
                }
            }
        }
        return null;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        d();
        g();
        e();
        b();
        a();
        KakaoSdk.init(this, getString(AbstractC5959j.kakao_app_key));
    }

    public void setSessionId() {
        android.webkit.CookieManager.getInstance().setCookie(z.getSSLHost(), getCookie());
        android.webkit.CookieManager.getInstance().flush();
    }
}
