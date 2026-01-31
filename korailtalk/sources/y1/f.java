package Y1;

import android.content.Context;
import android.os.Looper;
import c2.h;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import g2.AbstractC5544f;
import g2.C5539a;
import i2.C5671d;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class f extends C5539a.AbstractC0301a {
    f() {
    }

    @Override // g2.C5539a.AbstractC0301a
    public final /* synthetic */ C5539a.f buildClient(Context context, Looper looper, C5671d c5671d, Object obj, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        return new h(context, looper, c5671d, (GoogleSignInOptions) obj, bVar, cVar);
    }

    @Override // g2.C5539a.e
    public final /* synthetic */ List getImpliedScopes(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        return googleSignInOptions == null ? Collections.emptyList() : googleSignInOptions.getScopes();
    }
}
