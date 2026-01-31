package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class T30 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16400a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f16401b;

    T30(Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f16400a = context;
        this.f16401b = interfaceExecutorServiceC1974Un0;
    }

    final /* synthetic */ S30 a() {
        Bundle bundle;
        G1.u.zzp();
        String string = !((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgl)).booleanValue() ? "" : this.f16400a.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
        String string2 = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgn)).booleanValue() ? this.f16400a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "") : "";
        G1.u.zzp();
        Context context = this.f16400a;
        R30 r30 = null;
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgm)).booleanValue()) {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i8 = 0; i8 < 4; i8++) {
                String str = strArr[i8];
                if (defaultSharedPreferences.contains(str)) {
                    bundle.putString(str, defaultSharedPreferences.getString(str, null));
                }
            }
        } else {
            bundle = null;
        }
        return new S30(string, string2, bundle, r30);
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 18;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f16401b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.Q30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        });
    }
}
