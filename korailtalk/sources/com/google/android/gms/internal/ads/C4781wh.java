package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.kakao.sdk.common.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.wh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4781wh {

    /* renamed from: a, reason: collision with root package name */
    private final String f23535a = (String) AbstractC3416ki.zzb.zze();

    /* renamed from: b, reason: collision with root package name */
    private final Map f23536b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f23537c;

    /* renamed from: d, reason: collision with root package name */
    private final String f23538d;

    public C4781wh(Context context, String str) {
        this.f23537c = context;
        this.f23538d = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f23536b = linkedHashMap;
        linkedHashMap.put("s", "gmob_sdk");
        linkedHashMap.put("v", "3");
        linkedHashMap.put(Constants.OS, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        G1.u.zzp();
        linkedHashMap.put(Constants.DEVICE, K1.K0.zzr());
        linkedHashMap.put("app", context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        G1.u.zzp();
        linkedHashMap.put("is_lite_sdk", true != K1.K0.zzE(context) ? "0" : "1");
        Future futureZzb = G1.u.zzm().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((C3093hr) futureZzb.get()).zzk));
            linkedHashMap.put("network_fine", Integer.toString(((C3093hr) futureZzb.get()).zzl));
        } catch (Exception e8) {
            G1.u.zzo().zzw(e8, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzlp)).booleanValue()) {
            Map map = this.f23536b;
            G1.u.zzp();
            map.put("is_bstar", true != K1.K0.zzB(context) ? "0" : "1");
        }
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzju)).booleanValue()) {
            if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzck)).booleanValue() || AbstractC1802Qj0.zzd(G1.u.zzo().zzn())) {
                return;
            }
            this.f23536b.put("plugin", G1.u.zzo().zzn());
        }
    }

    final Context a() {
        return this.f23537c;
    }

    final String b() {
        return this.f23538d;
    }

    final String c() {
        return this.f23535a;
    }

    final Map d() {
        return this.f23536b;
    }
}
