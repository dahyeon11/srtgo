package K1;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.C1493Iw;
import com.google.android.gms.internal.ads.C2988gw;
import com.google.android.gms.internal.ads.C4775we;
import com.google.android.gms.internal.ads.GW;
import com.google.android.gms.internal.ads.InterfaceC2065Wv;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class L0 extends AbstractC0629c {
    public L0() {
        super(null);
    }

    @Override // K1.AbstractC0629c
    public final CookieManager zza(Context context) {
        G1.u.zzp();
        if (K0.zzF()) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            L1.n.zzh("Failed to obtain CookieManager.", th);
            G1.u.zzo().zzv(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    @Override // K1.AbstractC0629c
    public final WebResourceResponse zzb(String str, String str2, int i8, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i8, str3, map, inputStream);
    }

    @Override // K1.AbstractC0629c
    public final C2988gw zzc(InterfaceC2065Wv interfaceC2065Wv, C4775we c4775we, boolean z8, GW gw) {
        return new C1493Iw(interfaceC2065Wv, c4775we, z8, gw);
    }
}
