package com.korail.talk.ui.web;

import Q7.X;
import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.DatePicker;
import android.widget.Toast;
import com.kakao.sdk.common.Constants;
import com.korail.talk.network.response.seatMovie.RsvInquiryResponse;
import com.korail.talk.ui.booking.mainBooking.MainBookingActivity;
import com.korail.talk.ui.menu.BasketTicketActivity;
import com.korail.talk.ui.payment.PaymentActivity;
import com.korail.talk.ui.web.BaseWebViewActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5959j;
import n4.C5950a;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C6054a;
import r4.g;
import r4.i;
import u4.C6418b;
import z4.C6630d;
import z4.C6637k;
import z4.C6641o;
import z4.G;
import z4.H;
import z4.N;
import z4.q;
import z4.t;
import z4.u;

/* loaded from: classes.dex */
public class BaseWebViewActivity extends BaseViewActivity {
    public static final int APP_BACK = 1;
    public static final int APP_HIDE_LOADING_DIALOG = 6;
    public static final int APP_SHOW_LOADING_DIALOG = 5;
    public static final int CERTIFICATION_ID_SUCCESS = 8;
    public static final int CERTIFICATION_PW_SUCCESS = 9;
    public static final int CHANGE_LANGUAGE = 11;
    public static final int CLEAR_HISTORY = 14;
    public static final int GO_HOME = 12;
    public static final int GO_MAAS_PAYMENT = 18;
    public static final int GO_PAYMENT = 10;
    public static final int GO_SELECT_FROM_DATE = 19;
    public static final int GO_SELECT_TO_DATE = 20;
    public static final int GO_TO_BASKET = 22;
    public static final int IDENTITY_VERIFICATION_SUCCESS = 16;
    public static final int LOGIN = 3;
    public static final int MOVE_TO_TRAIN_TIME = 15;
    public static final int REFRESH_CUST_TRIP = 13;
    public static final int SEAT_MAP_COMPLETE = 17;
    public static final int SEND_CALENDAR = 7;
    public static final int SESSION_EXPIRED = 4;
    public static final int WINDOW_CLOSE = 2;

    /* renamed from: k, reason: collision with root package name */
    protected boolean f29252k;

    /* renamed from: l, reason: collision with root package name */
    private JSONObject f29253l;

    /* renamed from: m, reason: collision with root package name */
    private ValueCallback f29254m;

    /* renamed from: n, reason: collision with root package name */
    protected View f29255n;

    /* renamed from: o, reason: collision with root package name */
    protected WebView f29256o;

    /* renamed from: i, reason: collision with root package name */
    protected final String f29250i = g.PUSH_APPTYPE;

    /* renamed from: j, reason: collision with root package name */
    private final int f29251j = 0;

    /* renamed from: p, reason: collision with root package name */
    private boolean f29257p = false;

    /* renamed from: q, reason: collision with root package name */
    protected String f29258q = "";

    /* renamed from: r, reason: collision with root package name */
    private final Handler f29259r = new Handler(new b());

    /* renamed from: s, reason: collision with root package name */
    private boolean f29260s = false;

    class a extends WebChromeClient {
        a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            super.onGeolocationPermissionsShowPrompt(str, callback);
            callback.invoke(str, true, false);
        }
    }

    class b implements Handler.Callback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(DatePicker datePicker, JSONObject jSONObject) {
            BaseWebViewActivity.this.H0(jSONObject);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            t.e("what : " + message.what);
            t.e("obj : " + message.obj);
            switch (message.what) {
                case 1:
                    BaseWebViewActivity.this.onBackPressed();
                    return true;
                case 2:
                    BaseWebViewActivity.this.finish();
                    return true;
                case 3:
                    Intent intent = new Intent();
                    intent.putExtra("USER_AUTHENTICATION", (String) message.obj);
                    BaseWebViewActivity.this.setResult(3, intent);
                    BaseWebViewActivity.this.finish();
                    return true;
                case 4:
                    BaseWebViewActivity.this.f29253l = (JSONObject) message.obj;
                    if (H.getBoolean(BaseWebViewActivity.this.getApplicationContext(), "KEY_AUTO_LOGIN")) {
                        BaseWebViewActivity.this.E();
                    } else {
                        C6641o.moveToLogin(BaseWebViewActivity.this.K());
                    }
                    return true;
                case 5:
                    BaseWebViewActivity.this.showLoading();
                    return true;
                case 6:
                    BaseWebViewActivity.this.dismissLoading();
                    return true;
                case 7:
                    C6418b c6418b = new C6418b(BaseWebViewActivity.this.K(), (JSONObject) message.obj);
                    c6418b.setOnDatePickerSetListener(new C6418b.a() { // from class: com.korail.talk.ui.web.a
                        @Override // u4.C6418b.a
                        public final void onDateSet(DatePicker datePicker, JSONObject jSONObject) {
                            this.f29323a.b(datePicker, jSONObject);
                        }
                    });
                    c6418b.show();
                    return true;
                case 8:
                    Intent intent2 = new Intent();
                    intent2.putExtra("USER_ID", (String) message.obj);
                    BaseWebViewActivity.this.setResult(8, intent2);
                    BaseWebViewActivity.this.finish();
                    return true;
                case 9:
                    Intent intent3 = new Intent();
                    intent3.putExtra("USER_PW", (String) message.obj);
                    BaseWebViewActivity.this.setResult(9, intent3);
                    BaseWebViewActivity.this.finish();
                    return true;
                case 10:
                case 18:
                    String str = (String) message.obj;
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(str);
                    Intent intent4 = new Intent(BaseWebViewActivity.this.getApplicationContext(), (Class<?>) PaymentActivity.class);
                    intent4.putExtra("PNR_NO_LIST", arrayList);
                    if (message.what == 10) {
                        intent4.putExtra("PAYMENT_TYPE", i.PAYMENT_PRODUCT);
                    } else {
                        intent4.putExtra("PAYMENT_TYPE", i.PAYMENT_MAAS);
                    }
                    intent4.putExtra("IS_POINT_STEP", true);
                    intent4.putExtra("PRODUCT_NO", str);
                    BaseWebViewActivity.this.startActivity(intent4);
                    return true;
                case 11:
                    H.putString(BaseWebViewActivity.this.getApplicationContext(), "IS_MULTI_LANGUAGE_TYPE", (String) message.obj);
                    return true;
                case 12:
                    C6641o.navigation(BaseWebViewActivity.this.getApplicationContext(), MainBookingActivity.class);
                    return true;
                case 13:
                    H.putBoolean(BaseWebViewActivity.this.getApplicationContext(), "CONVENIENCE_SETTING_UPDATE", true);
                    return true;
                case 14:
                    BaseWebViewActivity.this.f29256o.clearHistory();
                    return true;
                case 15:
                    Intent intent5 = new Intent(BaseWebViewActivity.this.getApplicationContext(), (Class<?>) TrainServiceInfoWebViewActivity.class);
                    intent5.putExtra("TRAIN_INFO", (Serializable) q.fromJson((String) message.obj, RsvInquiryResponse.TrainInfo.class));
                    BaseWebViewActivity.this.startActivity(intent5);
                    return true;
                case 16:
                    Intent intent6 = new Intent();
                    intent6.putExtra("IDENTITY_VERIFICATION_SUCCESS", (String) message.obj);
                    BaseWebViewActivity.this.setResult(16, intent6);
                    return true;
                case 17:
                    t.d("To Do");
                    Intent intent7 = new Intent();
                    t.d("(String) message.obj : " + ((String) message.obj));
                    intent7.putExtra("dd", (String) message.obj);
                    BaseWebViewActivity.this.setResult(-1, intent7);
                    return true;
                case 19:
                    Intent intent8 = new Intent();
                    intent8.putExtra("MAAS_RESELECT_DATE_CODE", "MAAS_SERVICE_RENTCAR_RENT_DATE");
                    String stringExtra = BaseWebViewActivity.this.getIntent().getStringExtra("MAAS_RENTCAR_UI");
                    if (stringExtra != null && (stringExtra.equals("M30") || stringExtra.equals("M10"))) {
                        intent8.putExtra("MAAS_RENTCAR_UI", stringExtra);
                    }
                    BaseWebViewActivity.this.setResult(-1, intent8);
                    BaseWebViewActivity.this.finish();
                    return true;
                case 20:
                    Intent intent9 = new Intent();
                    intent9.putExtra("MAAS_RESELECT_DATE_CODE", "MAAS_SERVICE_RENTCAR_RETURN_DATE");
                    String stringExtra2 = BaseWebViewActivity.this.getIntent().getStringExtra("MAAS_RENTCAR_UI");
                    if (stringExtra2 != null && (stringExtra2.equals("M30") || stringExtra2.equals("M10"))) {
                        intent9.putExtra("MAAS_RENTCAR_UI", stringExtra2);
                    }
                    BaseWebViewActivity.this.setResult(-1, intent9);
                    BaseWebViewActivity.this.finish();
                    return true;
                case 21:
                default:
                    return true;
                case 22:
                    Intent intent10 = new Intent();
                    C6641o.navigation(BaseWebViewActivity.this.getApplicationContext(), BasketTicketActivity.class);
                    BaseWebViewActivity.this.setResult(-1, intent10);
                    BaseWebViewActivity.this.finish();
                    return true;
            }
        }
    }

    protected class c {
        protected c() {
        }

        @JavascriptInterface
        public void appBack(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void cartlist() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 22;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void certificationIdSuccess(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 8;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void certificationPwSuccess(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 9;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void changeLanguage(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 11;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void clearHistory() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 14;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void fn_webViewOpenRsult(String str) {
            t.d("fn_webViewOpenRsult() : " + str);
        }

        @JavascriptInterface
        public void fn_webViewSeatSetResult(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            t.d("fn_webViewSeatSetResult() selectedSeats : " + str);
            Toast.makeText(BaseWebViewActivity.this.getApplicationContext(), str, 0).show();
            try {
                new JSONObject(str);
            } catch (JSONException e8) {
                t.w(e8.getMessage());
            }
        }

        @JavascriptInterface
        public void goHome() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 12;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void goMaasPayment(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 18;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void goPayment(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 10;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void goSelectFromDate() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 19;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void goSelectToDate() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 20;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void hideLoadingDialog(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 6;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void identityVerificationSuccess(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 16;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void login(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void moveToTrainTime(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 15;
            messageObtain.obj = str;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void refreshCustTrip() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 13;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void sendCalendar(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Message messageObtain = Message.obtain();
                messageObtain.what = 7;
                messageObtain.obj = jSONObject;
                BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
            } catch (JSONException e8) {
                t.e(e8.getMessage());
            }
        }

        @JavascriptInterface
        public void sessionExpired(String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                messageObtain.obj = jSONObject;
                BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
            } catch (JSONException e8) {
                t.w(e8.getMessage());
            }
        }

        @JavascriptInterface
        public void setTitle(String str) {
            BaseWebViewActivity.this.setAppTitle(str);
        }

        @JavascriptInterface
        public void showLoadingDialog(String str) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 5;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }

        @JavascriptInterface
        public void showToast(String str) {
            Toast.makeText(BaseWebViewActivity.this.getApplicationContext(), str, 0).show();
        }

        @JavascriptInterface
        public void windowClose() {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            BaseWebViewActivity.this.f29259r.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public class d extends WebChromeClient {

        class a implements DialogInterface.OnKeyListener {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f29265a;

            a(WebView webView) {
                this.f29265a = webView;
            }

            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
                if (i8 != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                dialogInterface.dismiss();
                this.f29265a.destroy();
                return false;
            }
        }

        protected d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void d(JsResult jsResult, DialogInterface dialogInterface, int i8) {
            if (100 == i8) {
                jsResult.cancel();
            } else if (102 == i8) {
                jsResult.confirm();
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            t.d("onCloseWindow " + webView + " of " + webView.getUrl());
            webView.loadUrl("about:blank");
            webView.clearHistory();
            webView.removeAllViews();
            ((ViewGroup) webView.getParent()).removeView(webView);
            webView.destroy();
            Object tag = webView.getTag();
            if (tag != null && (tag instanceof Dialog)) {
                ((Dialog) tag).dismiss();
            }
            super.onCloseWindow(webView);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            t.d(consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return super.onConsoleMessage(consoleMessage);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z8, boolean z9, Message message) {
            t.d("onCreateWindow " + webView + " isDialog " + z8 + " isUserGesture " + z9 + " resultMsg " + message);
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new f(BaseWebViewActivity.this, null));
            webView2.setWebChromeClient(BaseWebViewActivity.this.new d());
            WebSettings settings = webView2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setSupportMultipleWindows(true);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setMixedContentMode(2);
            Dialog dialog = new Dialog(webView.getContext(), R.style.Theme.NoTitleBar.Fullscreen);
            webView2.setTag(dialog);
            dialog.setContentView(webView2);
            dialog.show();
            dialog.setOnKeyListener(new a(webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            C6637k.getCDialog(BaseWebViewActivity.this.K(), 1001, 0, BaseWebViewActivity.this.getString(AbstractC5959j.dialog_title)).setContent(str2).setButtonListener(new DialogInterface.OnClickListener() { // from class: m6.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    jsResult.confirm();
                }
            }).showDialog();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            C6637k.getCDialog(BaseWebViewActivity.this.K(), 1002, 0, BaseWebViewActivity.this.getString(AbstractC5959j.dialog_title)).setContent(str2).setButtonListener(new DialogInterface.OnClickListener() { // from class: m6.c
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    BaseWebViewActivity.d.d(jsResult, dialogInterface, i8);
                }
            }).showDialog();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (BaseWebViewActivity.this.f29258q.contains(g.LIMOUSINE_HOST_URL)) {
                BaseWebViewActivity.this.setAppTitle("광명역 도심공항 터미널 이용 안내");
                super.onReceivedTitle(webView, str);
                return;
            }
            if (str.equals("승차권 지도")) {
                str = BaseWebViewActivity.this.getString(AbstractC5959j.common_train_service_info);
            }
            super.onReceivedTitle(webView, str);
            if (webView == BaseWebViewActivity.this.f29256o && !N.isNull(str)) {
                BaseWebViewActivity.this.setAppTitle(str);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            t.d("***** onShowFileChooser()");
            if (BaseWebViewActivity.this.f29254m != null) {
                BaseWebViewActivity.this.f29254m.onReceiveValue(null);
                BaseWebViewActivity.this.f29254m = null;
            }
            BaseWebViewActivity.this.f29254m = valueCallback;
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            BaseWebViewActivity.this.startActivityForResult(intent, 0);
            return true;
        }
    }

    protected class e extends WebViewClient {
        protected e() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            BaseWebViewActivity.this.f29260s = false;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i8, String str, String str2) {
            super.onReceivedError(webView, i8, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return C6630d.isShouldOverrideUrlLoading(BaseWebViewActivity.this.K(), str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webResourceError.getErrorCode() == -2 && !C6630d.isNull(BaseWebViewActivity.this.f29255n)) {
                t.d("WebViewClient.ERROR_HOST_LOOKUP");
            }
            super.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    private class f extends e {
        private f() {
            super();
        }

        @Override // com.korail.talk.ui.web.BaseWebViewActivity.e, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) throws URISyntaxException {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            t.e("OnePassWeb scheme = " + scheme + ", url = " + str + " , isOnepassScheme = " + u.isOnepassScheme(BaseWebViewActivity.this.getApplicationContext(), uri));
            if (u.isOnepassScheme(BaseWebViewActivity.this.getApplicationContext(), uri)) {
                Intent intent = new Intent();
                intent.putExtra("userKey", uri.getQueryParameter("userKey"));
                BaseWebViewActivity.this.setResult(-1, intent);
                BaseWebViewActivity.this.finish();
                return true;
            }
            if (!str.contains("kr.go.gfido.m")) {
                if (!"http".equals(scheme)) {
                    if (!Constants.SCHEME.equals(scheme)) {
                        if (!"intent".equals(scheme)) {
                            return true;
                        }
                        G.playApp(BaseWebViewActivity.this.K(), str);
                        return true;
                    }
                    uri.toString().contains("letskorail.com/happy_talk/initChat.html");
                }
                return false;
            }
            try {
                Intent uri2 = Intent.parseUri(str, 1);
                Intent launchIntentForPackage = webView.getContext().getPackageManager().getLaunchIntentForPackage(uri2.getPackage());
                uri2.addFlags(268435456);
                if (launchIntentForPackage != null) {
                    webView.getContext().startActivity(uri2);
                } else {
                    G.moveToGooglePlay(BaseWebViewActivity.this.K(), uri2.getPackage());
                }
                return true;
            } catch (URISyntaxException e8) {
                t.e(e8.getMessage());
                return true;
            }
        }

        /* synthetic */ f(BaseWebViewActivity baseWebViewActivity, a aVar) {
            this();
        }
    }

    private void I0() {
        if (this.f29257p) {
            new Thread(new Runnable() { // from class: m6.b
                @Override // java.lang.Runnable
                public final void run() throws InterruptedException {
                    this.f34116a.J0();
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0() throws InterruptedException {
        this.f29260s = true;
        try {
            Thread.sleep(8000L);
        } catch (InterruptedException e8) {
            t.e(e8.getMessage());
        }
        if (this.f29260s) {
            L0(this.f29258q);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0() {
        this.f29256o.loadUrl(this.f29258q);
    }

    private boolean L0(String str) {
        if (!str.contains(g.TRAIN_MAP_URL)) {
            return false;
        }
        this.f29258q = str;
        runOnUiThread(new Runnable() { // from class: m6.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f34115a.K0();
            }
        });
        I0();
        return true;
    }

    protected void H0(JSONObject jSONObject) {
        if (C6630d.isNull(this.f29256o)) {
            return;
        }
        String strOptString = jSONObject.optString("callback");
        jSONObject.remove("callback");
        if (N.isNull(strOptString)) {
            return;
        }
        if (jSONObject.length() == 0) {
            this.f29256o.loadUrl("javascript:" + strOptString + "()");
            return;
        }
        this.f29256o.loadUrl("javascript:" + strOptString + "('" + jSONObject.toString() + "')");
    }

    protected void M0() {
        Intent intent;
        String stringExtra = getIntent().hasExtra("WEB_POST_URL") ? getIntent().getStringExtra("WEB_POST_URL") : getIntent().getStringExtra("WEB_GET_URL");
        String str = "WEB_POST_PARAMETER";
        if (getIntent().hasExtra("WEB_POST_PARAMETER")) {
            intent = getIntent();
        } else {
            intent = getIntent();
            str = "WEB_GET_PARAMETER";
        }
        String stringExtra2 = intent.getStringExtra(str);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_WEB_DEFAULT_PARAMETER", true);
        StringBuilder sb = new StringBuilder();
        if (booleanExtra) {
            sb.append(g.COMMON_PARAMETER);
        }
        this.f29258q = stringExtra + "?" + stringExtra2;
        if (N.isNotNull(stringExtra2)) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(stringExtra2);
        }
        t.e("loadUrl :: default");
        t.e("loadUrl :: isPost = " + getIntent().hasExtra("WEB_POST_URL"));
        t.e("loadUrl :: url = " + stringExtra);
        t.e("loadUrl :: parameter = " + sb.toString());
        if (L0(this.f29258q)) {
            return;
        }
        if (getIntent().hasExtra("WEB_POST_URL")) {
            this.f29256o.postUrl(stringExtra, sb.toString().getBytes());
            return;
        }
        if (!getIntent().getBooleanExtra("IS_MAAS_URL", false)) {
            this.f29256o.loadUrl(stringExtra + "?" + sb.toString());
            return;
        }
        if (stringExtra.contains("?")) {
            this.f29256o.loadUrl(stringExtra + "&" + sb.toString());
            return;
        }
        this.f29256o.loadUrl(stringExtra + "?" + sb.toString());
    }

    protected void N0(String str) {
        Intent intent;
        String str2 = "WEB_POST_PARAMETER";
        if (getIntent().hasExtra("WEB_POST_PARAMETER")) {
            intent = getIntent();
        } else {
            intent = getIntent();
            str2 = "WEB_GET_PARAMETER";
        }
        String stringExtra = intent.getStringExtra(str2);
        StringBuilder sb = new StringBuilder();
        sb.append(g.COMMON_PARAMETER);
        if (N.isNotNull(stringExtra)) {
            sb.append("&");
            sb.append(stringExtra);
        }
        t.e("loadUrl :: post");
        t.e("loadUrl :: isPost = " + getIntent().hasExtra("WEB_POST_URL"));
        t.e("loadUrl :: url = " + str);
        t.e("loadUrl :: parameter = " + sb.toString());
        this.f29258q = str;
        if (L0(str)) {
            return;
        }
        this.f29256o.postUrl(str, sb.toString().getBytes());
    }

    protected void O0(WebChromeClient webChromeClient) {
        if (C6630d.isNull(this.f29256o)) {
            return;
        }
        this.f29256o.setWebChromeClient(webChromeClient);
    }

    protected void P0(Object obj, boolean z8) {
        this.f29255n = findViewById(AbstractC5955f.v_webview_network_error);
        WebView webView = (WebView) findViewById(AbstractC5955f.webview);
        this.f29256o = webView;
        webView.setLayerType(2, null);
        this.f29256o.setHorizontalScrollBarEnabled(false);
        this.f29256o.addJavascriptInterface(obj, g.PUSH_APPTYPE);
        if (C6054a.IS_DEBUG_LOG) {
            WebView.setWebContentsDebuggingEnabled(false);
        }
        this.f29256o.setWebChromeClient(new a());
        WebSettings settings = this.f29256o.getSettings();
        if (getIntent().getBooleanExtra("IS_MAP_VIEW", false) || z8) {
            this.f29257p = true;
            settings.setCacheMode(-1);
        } else {
            this.f29257p = false;
            settings.setCacheMode(2);
        }
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSaveFormData(false);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(settings.getUserAgentString() + X.SPACE + g.PUSH_APPTYPE + " AppVersion/" + C5950a.VERSION_NAME);
        settings.setSupportMultipleWindows(true);
        settings.setTextZoom(100);
        settings.setMixedContentMode(2);
        if (this.f29257p) {
            return;
        }
        this.f29256o.clearCache(true);
    }

    protected void Q0(WebViewClient webViewClient) {
        if (C6630d.isNull(this.f29256o)) {
            return;
        }
        this.f29256o.setWebViewClient(webViewClient);
    }

    public String getCurrentUrl() {
        return this.f29256o.getUrl();
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i8, int i9, Intent intent) {
        t.d("***** onActivityResult() - data : " + intent);
        if (i8 == 0) {
            if (i9 == -1) {
                this.f29254m.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(i9, intent));
                this.f29254m = null;
            } else {
                ValueCallback valueCallback = this.f29254m;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(null);
                    this.f29254m = null;
                }
            }
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isOpenDrawer()) {
            closeDrawer();
            return;
        }
        if (this.f29252k || (C6630d.isNotNull(this.f29255n) && this.f29255n.getVisibility() == 0)) {
            finish();
        } else if (this.f29256o.canGoBack()) {
            this.f29256o.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f29252k = getIntent().getBooleanExtra("IS_CLOSE_VIEW", false);
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.appcompat.app.e, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onDestroy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!C6630d.isNull(this.f29256o)) {
            this.f29260s = false;
            this.f29256o.removeAllViews();
            this.f29256o.clearHistory();
            if (!this.f29257p) {
                this.f29256o.clearCache(true);
            }
            this.f29256o.destroy();
            this.f29256o = null;
        }
        super.onDestroy();
    }

    @Override // com.korail.talk.view.base.BaseActivity
    public void onLoginSuccess() {
        if (C6630d.isNull(this.f29253l)) {
            this.f29256o.reload();
        } else {
            H0(this.f29253l);
            this.f29253l = null;
        }
    }
}
