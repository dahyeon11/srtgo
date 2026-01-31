package S1;

import G1.u;
import H1.C;
import K1.K0;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.AbstractC1802Qj0;
import com.google.android.gms.internal.ads.AbstractC3414kh;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.kakao.sdk.common.Constants;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4599a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4600b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4601c;

    public a(Context context, L1.a aVar) {
        this.f4599a = context;
        this.f4600b = context.getPackageName();
        this.f4601c = aVar.afmaVersion;
    }

    public void set(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put(Constants.OS, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        u.zzp();
        map.put(Constants.DEVICE, K0.zzr());
        map.put("app", this.f4600b);
        u.zzp();
        map.put("is_lite_sdk", true != K0.zzE(this.f4599a) ? "0" : "1");
        AbstractC3414kh abstractC3414kh = AbstractC4439th.zza;
        List listZzb = C.zza().zzb();
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzhd)).booleanValue()) {
            listZzb.addAll(u.zzo().zzi().zzh().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", this.f4601c);
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzlp)).booleanValue()) {
            u.zzp();
            map.put("is_bstar", true != K0.zzB(this.f4599a) ? "0" : "1");
        }
        if (((Boolean) C.zzc().zza(AbstractC4439th.zzju)).booleanValue()) {
            if (((Boolean) C.zzc().zza(AbstractC4439th.zzck)).booleanValue()) {
                map.put("plugin", AbstractC1802Qj0.zzc(u.zzo().zzn()));
            }
        }
    }
}
