package w2;

import Y1.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import g2.AbstractC5544f;
import i2.AbstractC5674g;
import i2.C5671d;

/* loaded from: classes2.dex */
public final class p extends AbstractC5674g {

    /* renamed from: H, reason: collision with root package name */
    private final a.C0091a f37388H;

    public p(Context context, Looper looper, C5671d c5671d, a.C0091a c0091a, AbstractC5544f.b bVar, AbstractC5544f.c cVar) {
        super(context, looper, 68, c5671d, bVar, cVar);
        this.f37388H = new a.C0091a.C0092a(c0091a == null ? a.C0091a.zzk : c0091a).zzc(b.zzw()).zze();
    }

    final a.C0091a I() {
        return this.f37388H;
    }

    @Override // i2.AbstractC5670c
    protected final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof w ? (w) iInterfaceQueryLocalInterface : new v(iBinder);
    }

    @Override // i2.AbstractC5670c
    protected final Bundle e() {
        return this.f37388H.toBundle();
    }

    @Override // i2.AbstractC5670c, g2.C5539a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // i2.AbstractC5670c
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // i2.AbstractC5670c
    protected final String h() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }
}
