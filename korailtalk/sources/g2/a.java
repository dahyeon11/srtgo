package G2;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import f2.C5392b;
import g2.AbstractC5544f;
import i2.AbstractC5670c;
import i2.AbstractC5674g;
import i2.AbstractC5683p;
import i2.C5659S;
import i2.C5671d;
import i2.InterfaceC5677j;

/* loaded from: classes2.dex */
public class a extends AbstractC5674g implements F2.e {
    public static final /* synthetic */ int zaa = 0;

    /* renamed from: H */
    private final boolean f1462H;

    /* renamed from: I */
    private final C5671d f1463I;

    /* renamed from: J */
    private final Bundle f1464J;

    /* renamed from: K */
    private final Integer f1465K;

    public a(Context context, Looper looper, boolean z8, C5671d c5671d, Bundle bundle, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        super(context, looper, 44, c5671d, bVar, cVar);
        this.f1462H = true;
        this.f1463I = c5671d;
        this.f1464J = bundle;
        this.f1465K = c5671d.zab();
    }

    public static Bundle createBundleFromClientSettings(C5671d c5671d) {
        c5671d.zaa();
        Integer numZab = c5671d.zab();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c5671d.getAccount());
        if (numZab != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numZab.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final Bundle e() {
        if (!getContext().getPackageName().equals(this.f1463I.getRealClientPackageName())) {
            this.f1464J.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f1463I.getRealClientPackageName());
        }
        return this.f1464J;
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final boolean requiresSignIn() {
        return this.f1462H;
    }

    @Override // F2.e
    public final void zaa() {
        try {
            ((g) getService()).zae(((Integer) AbstractC5683p.checkNotNull(this.f1465K)).intValue());
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
        }
    }

    @Override // F2.e
    public final void zab() {
        connect(new AbstractC5670c.d());
    }

    @Override // F2.e
    public final void zac(InterfaceC5677j interfaceC5677j, boolean z8) {
        try {
            ((g) getService()).zaf(interfaceC5677j, ((Integer) AbstractC5683p.checkNotNull(this.f1465K)).intValue(), z8);
        } catch (RemoteException unused) {
            Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
        }
    }

    @Override // F2.e
    public final void zad(f fVar) {
        AbstractC5683p.checkNotNull(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountOrDefault = this.f1463I.getAccountOrDefault();
            ((g) getService()).zag(new j(1, new C5659S(accountOrDefault, ((Integer) AbstractC5683p.checkNotNull(this.f1465K)).intValue(), "<<default account>>".equals(accountOrDefault.name) ? c2.c.getInstance(getContext()).getSavedDefaultGoogleSignInAccount() : null)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.zab(new l(1, new C5392b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }
}
