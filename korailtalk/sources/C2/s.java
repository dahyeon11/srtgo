package c2;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: d, reason: collision with root package name */
    private static s f11466d;

    /* renamed from: a, reason: collision with root package name */
    private c f11467a;

    /* renamed from: b, reason: collision with root package name */
    private GoogleSignInAccount f11468b;

    /* renamed from: c, reason: collision with root package name */
    private GoogleSignInOptions f11469c;

    private s(Context context) {
        c cVar = c.getInstance(context);
        this.f11467a = cVar;
        this.f11468b = cVar.getSavedDefaultGoogleSignInAccount();
        this.f11469c = this.f11467a.getSavedDefaultGoogleSignInOptions();
    }

    private static synchronized s a(Context context) {
        s sVar = f11466d;
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(context);
        f11466d = sVar2;
        return sVar2;
    }

    public static synchronized s zzd(Context context) {
        return a(context.getApplicationContext());
    }

    public final synchronized void clear() {
        this.f11467a.clear();
        this.f11468b = null;
        this.f11469c = null;
    }

    public final synchronized void zzc(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f11467a.saveDefaultGoogleSignInAccount(googleSignInAccount, googleSignInOptions);
        this.f11468b = googleSignInAccount;
        this.f11469c = googleSignInOptions;
    }

    public final synchronized GoogleSignInAccount zzr() {
        return this.f11468b;
    }

    public final synchronized GoogleSignInOptions zzs() {
        return this.f11469c;
    }
}
