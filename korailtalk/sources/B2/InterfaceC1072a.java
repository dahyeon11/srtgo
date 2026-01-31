package b2;

import android.content.Intent;
import g2.AbstractC5544f;
import g2.AbstractC5546h;
import g2.AbstractC5547i;

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1072a {
    public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    Intent getSignInIntent(AbstractC5544f abstractC5544f);

    C1074c getSignInResultFromIntent(Intent intent);

    AbstractC5547i revokeAccess(AbstractC5544f abstractC5544f);

    AbstractC5547i signOut(AbstractC5544f abstractC5544f);

    AbstractC5546h silentSignIn(AbstractC5544f abstractC5544f);
}
