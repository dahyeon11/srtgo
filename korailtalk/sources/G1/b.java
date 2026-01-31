package G1;

import K1.K0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C1323Eq;
import com.google.android.gms.internal.ads.InterfaceC4233rs;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1391a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1392b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4233rs f1393c;

    /* renamed from: d, reason: collision with root package name */
    private final C1323Eq f1394d = new C1323Eq(false, Collections.emptyList());

    public b(Context context, InterfaceC4233rs interfaceC4233rs, C1323Eq c1323Eq) {
        this.f1391a = context;
        this.f1393c = interfaceC4233rs;
    }

    private final boolean a() {
        InterfaceC4233rs interfaceC4233rs = this.f1393c;
        return (interfaceC4233rs != null && interfaceC4233rs.zza().zzf) || this.f1394d.zza;
    }

    public final void zza() {
        this.f1392b = true;
    }

    public final void zzb(String str) {
        List<String> list;
        if (a()) {
            if (str == null) {
                str = "";
            }
            InterfaceC4233rs interfaceC4233rs = this.f1393c;
            if (interfaceC4233rs != null) {
                interfaceC4233rs.zzd(str, null, 3);
                return;
            }
            C1323Eq c1323Eq = this.f1394d;
            if (!c1323Eq.zza || (list = c1323Eq.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    Context context = this.f1391a;
                    u.zzp();
                    K0.zzL(context, "", strReplace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !a() || this.f1392b;
    }
}
