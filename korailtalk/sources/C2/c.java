package c2;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import i2.AbstractC5683p;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f11450c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static c f11451d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f11452a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f11453b;

    c(Context context) {
        this.f11453b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public static c getInstance(Context context) {
        AbstractC5683p.checkNotNull(context);
        Lock lock = f11450c;
        lock.lock();
        try {
            if (f11451d == null) {
                f11451d = new c(context.getApplicationContext());
            }
            c cVar = f11451d;
            lock.unlock();
            return cVar;
        } catch (Throwable th) {
            f11450c.unlock();
            throw th;
        }
    }

    protected final String a(String str) {
        this.f11452a.lock();
        try {
            return this.f11453b.getString(str, null);
        } finally {
            this.f11452a.unlock();
        }
    }

    protected final void b(String str) {
        this.f11452a.lock();
        try {
            this.f11453b.edit().remove(str).apply();
        } finally {
            this.f11452a.unlock();
        }
    }

    protected final void c(String str, String str2) {
        this.f11452a.lock();
        try {
            this.f11453b.edit().putString(str, str2).apply();
        } finally {
            this.f11452a.unlock();
        }
    }

    public void clear() {
        this.f11452a.lock();
        try {
            this.f11453b.edit().clear().apply();
        } finally {
            this.f11452a.unlock();
        }
    }

    public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        String strA;
        String strA2 = a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strA2) || (strA = a(d("googleSignInAccount", strA2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.zab(strA);
        } catch (JSONException unused) {
            return null;
        }
    }

    public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        String strA;
        String strA2 = a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strA2) || (strA = a(d("googleSignInOptions", strA2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.zab(strA);
        } catch (JSONException unused) {
            return null;
        }
    }

    public String getSavedRefreshToken() {
        return a("refreshToken");
    }

    public void saveDefaultGoogleSignInAccount(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        AbstractC5683p.checkNotNull(googleSignInAccount);
        AbstractC5683p.checkNotNull(googleSignInOptions);
        c("defaultGoogleSignInAccount", googleSignInAccount.zac());
        AbstractC5683p.checkNotNull(googleSignInAccount);
        AbstractC5683p.checkNotNull(googleSignInOptions);
        String strZac = googleSignInAccount.zac();
        c(d("googleSignInAccount", strZac), googleSignInAccount.zad());
        c(d("googleSignInOptions", strZac), googleSignInOptions.zaf());
    }

    public final void zac() {
        String strA = a("defaultGoogleSignInAccount");
        b("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        b(d("googleSignInAccount", strA));
        b(d("googleSignInOptions", strA));
    }
}
