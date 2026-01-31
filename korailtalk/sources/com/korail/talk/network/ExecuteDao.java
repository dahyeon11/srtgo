package com.korail.talk.network;

import com.google.android.material.timepicker.c;
import com.google.gson.e;
import java.net.HttpURLConnection;
import kr.scripters.dynapath.sdk.android.DynaPathException;
import kr.scripters.dynapath.sdk.android.DynaPathMobileSDK;
import p4.C6054a;
import retrofit.RestAdapter;
import retrofit.client.Request;
import retrofit.client.UrlConnectionClient;
import retrofit.converter.GsonConverter;
import z4.t;
import z4.z;

/* loaded from: classes.dex */
public class ExecuteDao {

    /* renamed from: com.korail.talk.network.ExecuteDao$1 */
    class AnonymousClass1 extends UrlConnectionClient {
        AnonymousClass1() {
        }

        @Override // retrofit.client.UrlConnectionClient
        protected HttpURLConnection openConnection(Request request) {
            HttpURLConnection httpURLConnectionOpenConnection = super.openConnection(request);
            httpURLConnectionOpenConnection.setConnectTimeout(60000);
            httpURLConnectionOpenConnection.setReadTimeout(60000);
            t.d("KTConst.IS_MACRO_ACTIVE = " + C6054a.IS_MACRO_ACTIVE);
            if (C6054a.IS_MACRO_ACTIVE) {
                String[] strArr = {"/classes/com.korail.mobile.certification.TicketReservation", "/classes/com.korail.mobile.nonMember.NonMemTicket", "/classes/com.korail.mobile.seatMovie.ScheduleView", "/classes/com.korail.mobile.seatMovie.ScheduleViewSpecial", "/classes/com.korail.mobile.trn.prcFare.do", "/classes/com.korail.mobile.login.Login"};
                boolean z8 = false;
                int i8 = 0;
                while (true) {
                    if (i8 >= 6) {
                        break;
                    }
                    String str = strArr[i8];
                    if (request.getUrl().contains(str)) {
                        t.d("str = " + str);
                        z8 = true;
                        break;
                    }
                    i8++;
                }
                t.d("isMacroUrl = " + z8);
                if (z8) {
                    try {
                        String strGenerate = DynaPathMobileSDK.Companion.generate();
                        t.d("token = " + strGenerate);
                        httpURLConnectionOpenConnection.setRequestProperty("x-dynapath-m-token", strGenerate);
                    } catch (DynaPathException e8) {
                        e8.printStackTrace();
                        t.d(String.format(c.NUMBER_FORMAT, Integer.valueOf(e8.getCode())) + ", " + e8.getMessage());
                    }
                }
            }
            return httpURLConnectionOpenConnection;
        }
    }

    protected RestAdapter.Builder getDefaultRestAdapterBuilder() {
        return new RestAdapter.Builder().setLogLevel(C6054a.IS_DEBUG_LOG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE).setConverter(new GsonConverter(new e().create())).setClient(new UrlConnectionClient() { // from class: com.korail.talk.network.ExecuteDao.1
            AnonymousClass1() {
            }

            @Override // retrofit.client.UrlConnectionClient
            protected HttpURLConnection openConnection(Request request) {
                HttpURLConnection httpURLConnectionOpenConnection = super.openConnection(request);
                httpURLConnectionOpenConnection.setConnectTimeout(60000);
                httpURLConnectionOpenConnection.setReadTimeout(60000);
                t.d("KTConst.IS_MACRO_ACTIVE = " + C6054a.IS_MACRO_ACTIVE);
                if (C6054a.IS_MACRO_ACTIVE) {
                    String[] strArr = {"/classes/com.korail.mobile.certification.TicketReservation", "/classes/com.korail.mobile.nonMember.NonMemTicket", "/classes/com.korail.mobile.seatMovie.ScheduleView", "/classes/com.korail.mobile.seatMovie.ScheduleViewSpecial", "/classes/com.korail.mobile.trn.prcFare.do", "/classes/com.korail.mobile.login.Login"};
                    boolean z8 = false;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= 6) {
                            break;
                        }
                        String str = strArr[i8];
                        if (request.getUrl().contains(str)) {
                            t.d("str = " + str);
                            z8 = true;
                            break;
                        }
                        i8++;
                    }
                    t.d("isMacroUrl = " + z8);
                    if (z8) {
                        try {
                            String strGenerate = DynaPathMobileSDK.Companion.generate();
                            t.d("token = " + strGenerate);
                            httpURLConnectionOpenConnection.setRequestProperty("x-dynapath-m-token", strGenerate);
                        } catch (DynaPathException e8) {
                            e8.printStackTrace();
                            t.d(String.format(c.NUMBER_FORMAT, Integer.valueOf(e8.getCode())) + ", " + e8.getMessage());
                        }
                    }
                }
                return httpURLConnectionOpenConnection;
            }
        });
    }

    protected RestAdapter.Builder getRestAdapterBuilder() {
        return getDefaultRestAdapterBuilder().setEndpoint(z.getSSLHost());
    }

    public <T> T getService(Class<T> cls) {
        return (T) getRestAdapterBuilder().build().create(cls);
    }
}
