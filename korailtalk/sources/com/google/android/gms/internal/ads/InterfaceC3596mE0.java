package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mE0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC3596mE0 extends Ky0 {
    public static final InterfaceC1229Cj0 zza = new InterfaceC1229Cj0() { // from class: com.google.android.gms.internal.ads.hE0
        @Override // com.google.android.gms.internal.ads.InterfaceC1229Cj0
        public final boolean zza(Object obj) {
            String str = (String) obj;
            if (str == null) {
                return false;
            }
            String strZza = AbstractC2963gj0.zza(str);
            if (TextUtils.isEmpty(strZza)) {
                return false;
            }
            return ((strZza.contains("text") && !strZza.contains("text/vtt")) || strZza.contains("html") || strZza.contains("xml")) ? false : true;
        }
    };

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    /* synthetic */ int zza(byte[] bArr, int i8, int i9);

    @Override // com.google.android.gms.internal.ads.Ky0
    /* synthetic */ long zzb(NB0 nb0);

    @Override // com.google.android.gms.internal.ads.Ky0
    /* synthetic */ Uri zzc();

    @Override // com.google.android.gms.internal.ads.Ky0
    /* synthetic */ void zzd();

    @Override // com.google.android.gms.internal.ads.Ky0
    Map zze();

    @Override // com.google.android.gms.internal.ads.Ky0
    /* synthetic */ void zzf(InterfaceC4279sE0 interfaceC4279sE0);
}
