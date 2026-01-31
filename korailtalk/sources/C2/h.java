package c2;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import g2.AbstractC5544f;
import i2.AbstractC5674g;
import i2.C5671d;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h extends AbstractC5674g {

    /* renamed from: H */
    private final GoogleSignInOptions f11459H;

    public h(Context context, Looper looper, C5671d c5671d, GoogleSignInOptions googleSignInOptions, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        super(context, looper, 91, c5671d, bVar, cVar);
        GoogleSignInOptions.a aVar = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar.setLogSessionId(w2.b.zzw());
        if (!c5671d.getAllRequestedScopes().isEmpty()) {
            Iterator<Scope> it = c5671d.getAllRequestedScopes().iterator();
            while (it.hasNext()) {
                aVar.requestScopes(it.next(), new Scope[0]);
            }
        }
        this.f11459H = aVar.build();
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof v ? (v) iInterfaceQueryLocalInterface : new y(iBinder);
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final Intent getSignInIntent() {
        return k.zzc(getContext(), this.f11459H);
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final boolean providesSignIn() {
        return true;
    }

    public final GoogleSignInOptions zzo() {
        return this.f11459H;
    }
}
