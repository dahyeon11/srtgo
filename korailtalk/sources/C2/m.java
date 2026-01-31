package c2;

import b2.C1074c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class m extends e {

    /* renamed from: a */
    private final /* synthetic */ j f11463a;

    m(j jVar) {
        this.f11463a = jVar;
    }

    @Override // c2.e, c2.w, c2.t
    public final void zzc(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            s.zzd(this.f11463a.f11460r).zzc(this.f11463a.f11461s, googleSignInAccount);
        }
        this.f11463a.setResult((j) new C1074c(googleSignInAccount, status));
    }
}
