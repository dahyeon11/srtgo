package v2;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import g2.AbstractC5544f;
import i2.AbstractC5674g;
import i2.C5671d;

/* loaded from: classes2.dex */
public final class c extends AbstractC5674g {

    /* renamed from: H */
    private final Bundle f37215H;

    public c(Context context, Looper looper, C5671d c5671d, Y1.c cVar, AbstractC5544f.b bVar, AbstractC5544f.c cVar2) {
        super(context, looper, 16, c5671d, bVar, cVar2);
        this.f37215H = new Bundle();
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof f ? (f) iInterfaceQueryLocalInterface : new g(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final Bundle e() {
        return this.f37215H;
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final boolean requiresSignIn() {
        C5671d c5671dF = F();
        return (TextUtils.isEmpty(c5671dF.getAccountName()) || c5671dF.getApplicableScopes(Y1.b.API).isEmpty()) ? false : true;
    }
}
