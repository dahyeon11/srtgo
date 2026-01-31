package J4;

import android.app.Activity;
import android.os.AsyncTask;
import com.kakao.sdk.user.Constants;
import com.nhn.android.naverlogin.OAuthLogin;
import com.nhn.android.naverlogin.OAuthLoginHandler;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C6054a;
import r4.g;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2603a;

    /* renamed from: b, reason: collision with root package name */
    private OAuthLogin f2604b;

    /* renamed from: c, reason: collision with root package name */
    private G4.a f2605c;

    /* renamed from: d, reason: collision with root package name */
    private OAuthLoginHandler f2606d = new a();

    class a extends OAuthLoginHandler {
        a() {
        }

        @Override // com.nhn.android.naverlogin.OAuthLoginHandler
        public void run(boolean z8) {
            if (z8) {
                new c(b.this, null).execute(new Void[0]);
            }
        }
    }

    /* renamed from: J4.b$b, reason: collision with other inner class name */
    private class AsyncTaskC0046b extends AsyncTask {
        private AsyncTaskC0046b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) throws InterruptedException {
            boolean zLogoutAndDeleteToken = b.this.f2604b.logoutAndDeleteToken(b.this.d());
            t.e("errorCode : " + b.this.f2604b.getLastErrorCode(b.this.d()));
            t.e("errorDesc : " + b.this.f2604b.getLastErrorDesc(b.this.d()));
            t.e("isSuccessDeleteToken : " + zLogoutAndDeleteToken);
            return Boolean.valueOf(zLogoutAndDeleteToken);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            b.this.f2605c.easyLogoutSuccess("N");
        }

        /* synthetic */ AsyncTaskC0046b(b bVar, a aVar) {
            this();
        }
    }

    private class c extends AsyncTask {
        private c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            return b.this.f2604b.requestApi(b.this.d(), b.this.f2604b.getAccessToken(b.this.d()), g.NAVER_REQUEST_API);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String strOptString = jSONObject.optString("resultcode");
                t.e("jsonObject : " + jSONObject.toString());
                if ("00".equals(strOptString)) {
                    if (C6630d.isNotNull(b.this.f2605c)) {
                        b.this.f2605c.easyLoginSuccess("N", jSONObject.optJSONObject("response").optString(Constants.ID));
                    }
                } else if (C6630d.isNotNull(b.this.f2605c)) {
                    b.this.f2605c.easyLoginFail("N", jSONObject.optString("message"));
                }
            } catch (JSONException e8) {
                t.e(e8.getMessage());
            }
        }

        /* synthetic */ c(b bVar, a aVar) {
            this();
        }
    }

    public b(Activity activity) throws InterruptedException {
        this.f2603a = activity;
        e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity d() {
        return this.f2603a;
    }

    private void e() throws InterruptedException {
        OAuthLogin oAuthLogin = OAuthLogin.getInstance();
        this.f2604b = oAuthLogin;
        oAuthLogin.showDevelopersLog(C6054a.IS_DEBUG_LOG);
        this.f2604b.init(d(), "e7vxk6JebCxy3BN9stZ7", "JnuFloSPUb", "코레일톡");
    }

    public void login() {
        this.f2604b.startOauthLoginActivity(d(), this.f2606d);
    }

    public void logout() {
        new AsyncTaskC0046b(this, null).execute(new Void[0]);
    }

    public void setListener(G4.a aVar) {
        this.f2605c = aVar;
    }
}
