package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import m7.AbstractC5916c;

/* loaded from: classes2.dex */
public final class M20 implements M50 {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f14525a;

    private M20(Integer num) {
        this.f14525a = num;
    }

    static /* bridge */ /* synthetic */ M20 a(L1.a aVar) {
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzka)).booleanValue()) {
            return new M20(null);
        }
        G1.u.zzp();
        int extensionVersion = 0;
        try {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkd)).booleanValue()) {
                    if (aVar.clientJarVersion >= ((Integer) H1.C.zzc().zza(AbstractC4439th.zzkc)).intValue() && i8 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(AbstractC5916c.NANOS_IN_MILLIS);
            }
        } catch (Exception e8) {
            G1.u.zzo().zzw(e8, "AdUtil.getAdServicesExtensionVersion");
        }
        return new M20(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.M50
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer num = this.f14525a;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
