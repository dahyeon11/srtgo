package c2;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* loaded from: classes.dex */
public final class x extends u {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11470a;

    public x(Context context) {
        this.f11470a = context;
    }

    private final void zzt() {
        if (o2.s.isGooglePlayServicesUid(this.f11470a, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play services.");
        throw new SecurityException(sb.toString());
    }

    @Override // c2.u, c2.r
    public final void zzp() {
        zzt();
        c cVar = c.getInstance(this.f11470a);
        GoogleSignInAccount savedDefaultGoogleSignInAccount = cVar.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions savedDefaultGoogleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            savedDefaultGoogleSignInOptions = cVar.getSavedDefaultGoogleSignInOptions();
        }
        com.google.android.gms.auth.api.signin.b client = com.google.android.gms.auth.api.signin.a.getClient(this.f11470a, savedDefaultGoogleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            client.revokeAccess();
        } else {
            client.signOut();
        }
    }

    @Override // c2.u, c2.r
    public final void zzq() {
        zzt();
        s.zzd(this.f11470a).clear();
    }
}
