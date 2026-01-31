package c2;

import android.content.Context;
import b2.C1074c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import g2.AbstractC5544f;
import g2.C5539a;

/* loaded from: classes.dex */
final class j extends p {

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Context f11460r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ GoogleSignInOptions f11461s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(AbstractC5544f abstractC5544f, Context context, GoogleSignInOptions googleSignInOptions) {
        super(abstractC5544f);
        this.f11460r = context;
        this.f11461s = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ g2.n createFailedResult(Status status) {
        return new C1074c(null, status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1103b
    protected final /* synthetic */ void d(C5539a.b bVar) {
        ((v) ((h) bVar).getService()).zzc(new m(this), this.f11461s);
    }
}
