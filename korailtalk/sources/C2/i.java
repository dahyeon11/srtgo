package c2;

import android.content.Intent;
import b2.C1074c;
import b2.InterfaceC1072a;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import g2.AbstractC5544f;
import g2.AbstractC5546h;
import g2.AbstractC5547i;

/* loaded from: classes.dex */
public final class i implements InterfaceC1072a {
    private static GoogleSignInOptions a(AbstractC5544f abstractC5544f) {
        return ((h) abstractC5544f.getClient(Y1.a.zzh)).zzo();
    }

    @Override // b2.InterfaceC1072a
    public final Intent getSignInIntent(AbstractC5544f abstractC5544f) {
        return k.zzc(abstractC5544f.getContext(), a(abstractC5544f));
    }

    @Override // b2.InterfaceC1072a
    public final C1074c getSignInResultFromIntent(Intent intent) {
        return k.getSignInResultFromIntent(intent);
    }

    @Override // b2.InterfaceC1072a
    public final AbstractC5547i revokeAccess(AbstractC5544f abstractC5544f) {
        return k.zzd(abstractC5544f, abstractC5544f.getContext(), false);
    }

    @Override // b2.InterfaceC1072a
    public final AbstractC5547i signOut(AbstractC5544f abstractC5544f) {
        return k.zzc(abstractC5544f, abstractC5544f.getContext(), false);
    }

    @Override // b2.InterfaceC1072a
    public final AbstractC5546h silentSignIn(AbstractC5544f abstractC5544f) {
        return k.zzc(abstractC5544f, abstractC5544f.getContext(), a(abstractC5544f), false);
    }
}
