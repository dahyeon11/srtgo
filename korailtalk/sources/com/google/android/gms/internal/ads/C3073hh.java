package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.hh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3073hh extends AbstractC3414kh {
    C3073hh(int i8, String str, Float f8, Float f9) {
        super(1, str, f8, f9, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3414kh
    public final /* bridge */ /* synthetic */ Object zza(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(zzn(), ((Float) zzm()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3414kh
    public final /* bridge */ /* synthetic */ Object zzb(Bundle bundle) {
        return bundle.containsKey("com.google.android.gms.ads.flag.".concat(zzn())) ? Float.valueOf(bundle.getFloat("com.google.android.gms.ads.flag.".concat(zzn()))) : (Float) zzm();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3414kh
    public final /* bridge */ /* synthetic */ Object zzc(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(zzn(), ((Float) zzm()).floatValue()));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3414kh
    public final /* bridge */ /* synthetic */ void zzd(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(zzn(), ((Float) obj).floatValue());
    }
}
