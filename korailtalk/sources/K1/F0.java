package K1;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.d;
import com.google.android.gms.internal.ads.C1838Rh;
import com.google.android.gms.internal.ads.InterfaceC1797Qh;
import com.google.android.gms.internal.ads.YD0;

/* loaded from: classes.dex */
final class F0 implements InterfaceC1797Qh {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1838Rh f2765a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f2766b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f2767c;

    F0(K0 k02, C1838Rh c1838Rh, Context context, Uri uri) {
        this.f2765a = c1838Rh;
        this.f2766b = context;
        this.f2767c = uri;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1797Qh
    public final void zza() {
        androidx.browser.customtabs.d dVarBuild = new d.a(this.f2765a.zza()).build();
        dVarBuild.intent.setPackage(YD0.zza(this.f2766b));
        dVarBuild.launchUrl(this.f2766b, this.f2767c);
        this.f2765a.zzf((Activity) this.f2766b);
    }
}
