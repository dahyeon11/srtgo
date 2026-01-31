package c2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b2.C1074c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1105c;
import g2.AbstractC5544f;
import g2.AbstractC5547i;
import g2.AbstractC5548j;
import java.util.Iterator;
import l2.C5888a;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a */
    private static C5888a f11462a = new C5888a("GoogleSignInCommon", new String[0]);

    private static void a(Context context) {
        s.zzd(context).clear();
        Iterator<AbstractC5544f> it = AbstractC5544f.getAllClients().iterator();
        while (it.hasNext()) {
            it.next().maybeSignOut();
        }
        C1105c.reportSignOut();
    }

    public static C1074c getSignInResultFromIntent(Intent intent) {
        if (intent == null) {
            return new C1074c(null, Status.RESULT_INTERNAL_ERROR);
        }
        Status status = (Status) intent.getParcelableExtra("googleSignInStatus");
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) intent.getParcelableExtra("googleSignInAccount");
        if (googleSignInAccount != null) {
            return new C1074c(googleSignInAccount, Status.RESULT_SUCCESS);
        }
        if (status == null) {
            status = Status.RESULT_INTERNAL_ERROR;
        }
        return new C1074c(null, status);
    }

    public static Intent zzc(Context context, GoogleSignInOptions googleSignInOptions) {
        f11462a.d("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    public static Intent zzd(Context context, GoogleSignInOptions googleSignInOptions) {
        f11462a.d("getFallbackSignInIntent()", new Object[0]);
        Intent intentZzc = zzc(context, googleSignInOptions);
        intentZzc.setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
        return intentZzc;
    }

    public static Intent zze(Context context, GoogleSignInOptions googleSignInOptions) {
        f11462a.d("getNoImplementationSignInIntent()", new Object[0]);
        Intent intentZzc = zzc(context, googleSignInOptions);
        intentZzc.setAction("com.google.android.gms.auth.NO_IMPL");
        return intentZzc;
    }

    public static AbstractC5547i zzd(AbstractC5544f abstractC5544f, Context context, boolean z8) {
        f11462a.d("Revoking access", new Object[0]);
        String savedRefreshToken = c.getInstance(context).getSavedRefreshToken();
        a(context);
        if (z8) {
            return g.zzi(savedRefreshToken);
        }
        return abstractC5544f.execute(new n(abstractC5544f));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static g2.AbstractC5546h zzc(g2.AbstractC5544f r5, android.content.Context r6, com.google.android.gms.auth.api.signin.GoogleSignInOptions r7, boolean r8) {
        /*
            l2.a r0 = c2.k.f11462a
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "silentSignIn()"
            r0.d(r3, r2)
            l2.a r0 = c2.k.f11462a
            java.lang.String r2 = "getEligibleSavedSignInResult()"
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r0.d(r2, r3)
            i2.AbstractC5683p.checkNotNull(r7)
            c2.s r0 = c2.s.zzd(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r0 = r0.zzs()
            r2 = 0
            if (r0 == 0) goto L87
            android.accounts.Account r3 = r0.getAccount()
            android.accounts.Account r4 = r7.getAccount()
            if (r3 != 0) goto L31
            if (r4 != 0) goto L2f
            r3 = 1
            goto L35
        L2f:
            r3 = r1
            goto L35
        L31:
            boolean r3 = r3.equals(r4)
        L35:
            if (r3 == 0) goto L87
            boolean r3 = r7.isServerAuthCodeRequested()
            if (r3 != 0) goto L87
            boolean r3 = r7.isIdTokenRequested()
            if (r3 == 0) goto L57
            boolean r3 = r0.isIdTokenRequested()
            if (r3 == 0) goto L87
            java.lang.String r3 = r7.getServerClientId()
            java.lang.String r4 = r0.getServerClientId()
            boolean r3 = i2.AbstractC5681n.equal(r3, r4)
            if (r3 == 0) goto L87
        L57:
            java.util.HashSet r3 = new java.util.HashSet
            java.util.ArrayList r0 = r0.getScopes()
            r3.<init>(r0)
            java.util.HashSet r0 = new java.util.HashSet
            java.util.ArrayList r4 = r7.getScopes()
            r0.<init>(r4)
            boolean r0 = r3.containsAll(r0)
            if (r0 == 0) goto L87
            c2.s r0 = c2.s.zzd(r6)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r0 = r0.zzr()
            if (r0 == 0) goto L87
            boolean r3 = r0.isExpired()
            if (r3 != 0) goto L87
            b2.c r3 = new b2.c
            com.google.android.gms.common.api.Status r4 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r3.<init>(r0, r4)
            goto L88
        L87:
            r3 = r2
        L88:
            if (r3 == 0) goto L98
            l2.a r6 = c2.k.f11462a
            java.lang.String r7 = "Eligible saved sign in result found"
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r6.d(r7, r8)
            g2.h r5 = g2.AbstractC5548j.immediatePendingResult(r3, r5)
            return r5
        L98:
            if (r8 == 0) goto Laa
            b2.c r6 = new b2.c
            com.google.android.gms.common.api.Status r7 = new com.google.android.gms.common.api.Status
            r8 = 4
            r7.<init>(r8)
            r6.<init>(r2, r7)
            g2.h r5 = g2.AbstractC5548j.immediatePendingResult(r6, r5)
            return r5
        Laa:
            l2.a r8 = c2.k.f11462a
            java.lang.String r0 = "trySilentSignIn()"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r8.d(r0, r1)
            c2.j r8 = new c2.j
            r8.<init>(r5, r6, r7)
            com.google.android.gms.common.api.internal.b r5 = r5.enqueue(r8)
            h2.i r6 = new h2.i
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.k.zzc(g2.f, android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions, boolean):g2.h");
    }

    public static AbstractC5547i zzc(AbstractC5544f abstractC5544f, Context context, boolean z8) {
        f11462a.d("Signing out", new Object[0]);
        a(context);
        if (z8) {
            return AbstractC5548j.immediatePendingResult(Status.RESULT_SUCCESS, abstractC5544f);
        }
        return abstractC5544f.execute(new l(abstractC5544f));
    }
}
