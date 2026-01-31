package J4;

import R6.G;
import android.app.Activity;
import com.kakao.sdk.auth.model.OAuthToken;
import com.kakao.sdk.user.UserApiClient;
import com.kakao.sdk.user.model.User;
import f7.p;
import java.security.NoSuchAlgorithmException;
import n4.AbstractC5959j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f2597a;

    /* renamed from: b, reason: collision with root package name */
    private G4.a f2598b;
    public String mToken = "";
    public String mExpireAt = "";

    /* renamed from: J4.a$a, reason: collision with other inner class name */
    class C0043a implements p {

        /* renamed from: J4.a$a$a, reason: collision with other inner class name */
        class C0044a implements p {
            C0044a() {
            }

            @Override // f7.p
            public G invoke(User user, Throwable th) {
                if (user == null) {
                    return null;
                }
                a.this.f2598b.easyLoginSuccess("K", String.valueOf(user.getId()));
                return null;
            }
        }

        C0043a() {
        }

        @Override // f7.p
        public G invoke(OAuthToken oAuthToken, Throwable th) {
            if (th != null) {
                a.this.f2598b.easyLoginFail("K", a.this.c().getString(AbstractC5959j.retry_easy_login));
                return null;
            }
            if (oAuthToken == null || oAuthToken.getAccessToken() == null) {
                a.this.f2598b.easyLoginFail("K", a.this.c().getString(AbstractC5959j.retry_easy_login));
                return null;
            }
            a.this.mToken = oAuthToken.getAccessToken();
            a.this.mExpireAt = oAuthToken.getAccessTokenExpiresAt() + "";
            UserApiClient.getInstance().me(new C0044a());
            return null;
        }
    }

    class b implements p {

        /* renamed from: J4.a$b$a, reason: collision with other inner class name */
        class C0045a implements p {
            C0045a() {
            }

            @Override // f7.p
            public G invoke(User user, Throwable th) {
                if (user == null) {
                    return null;
                }
                a.this.f2598b.easyLoginSuccess("K", String.valueOf(user.getId()));
                return null;
            }
        }

        b() {
        }

        @Override // f7.p
        public G invoke(OAuthToken oAuthToken, Throwable th) {
            if (th != null) {
                return null;
            }
            if (oAuthToken == null || oAuthToken.equals("")) {
                a.this.f2598b.easyLoginFail("K", a.this.c().getString(AbstractC5959j.retry_easy_login));
            } else {
                a.this.mToken = oAuthToken.getAccessToken();
                a.this.mExpireAt = oAuthToken.getAccessTokenExpiresAt() + "";
                UserApiClient.getInstance().me(new C0045a());
            }
            return null;
        }
    }

    public a(Activity activity) {
        this.f2597a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity c() {
        return this.f2597a;
    }

    public void login() throws NoSuchAlgorithmException {
        if (UserApiClient.getInstance().isKakaoTalkLoginAvailable(this.f2597a)) {
            UserApiClient.getInstance().loginWithKakaoTalk(this.f2597a, new C0043a());
        } else {
            UserApiClient.getInstance().loginWithKakaoAccount(this.f2597a, new b());
        }
    }

    public void setListener(G4.a aVar) {
        this.f2598b = aVar;
    }
}
