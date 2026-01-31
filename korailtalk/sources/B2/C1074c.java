package b2;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import g2.n;

/* renamed from: b2.c */
/* loaded from: classes.dex */
public class C1074c implements n {

    /* renamed from: a */
    private Status f11394a;

    /* renamed from: b */
    private GoogleSignInAccount f11395b;

    public C1074c(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f11395b = googleSignInAccount;
        this.f11394a = status;
    }

    public GoogleSignInAccount getSignInAccount() {
        return this.f11395b;
    }

    @Override // g2.n
    public Status getStatus() {
        return this.f11394a;
    }

    public boolean isSuccess() {
        return this.f11394a.isSuccess();
    }
}
