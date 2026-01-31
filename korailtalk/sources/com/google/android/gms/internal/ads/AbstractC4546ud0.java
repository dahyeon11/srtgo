package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.ud0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4546ud0 {
    private static void a(com.google.common.util.concurrent.C c9, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0, boolean z8) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            AbstractC1483In0.zzr(AbstractC5136zn0.zzu(c9), new C4318sd0(runnableC4660vd0, interfaceC3407kd0, z8), AbstractC4805wt.zzf);
        }
    }

    public static EnumC1217Cd0 zza(C1825Ra0 c1825Ra0) {
        int iZzf = R1.W.zzf(c1825Ra0) - 1;
        return (iZzf == 0 || iZzf == 1) ? EnumC1217Cd0.CUI_NAME_ADREQUEST : EnumC1217Cd0.CUI_NAME_SCAR_RENDERING;
    }

    public static void zzb(com.google.common.util.concurrent.C c9, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0) {
        a(c9, runnableC4660vd0, interfaceC3407kd0, false);
    }

    public static void zzc(com.google.common.util.concurrent.C c9, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0) {
        a(c9, runnableC4660vd0, interfaceC3407kd0, true);
    }

    public static void zzd(com.google.common.util.concurrent.C c9, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            AbstractC1483In0.zzr(AbstractC5136zn0.zzu(c9), new C4432td0(runnableC4660vd0, interfaceC3407kd0), AbstractC4805wt.zzf);
        }
    }

    public static void zze(com.google.common.util.concurrent.C c9, InterfaceC3407kd0 interfaceC3407kd0) {
        if (((Boolean) AbstractC3302ji.zzc.zze()).booleanValue()) {
            AbstractC1483In0.zzr(AbstractC5136zn0.zzu(c9), new C4204rd0(interfaceC3407kd0), AbstractC4805wt.zzf);
        }
    }

    public static boolean zzf(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) H1.C.zzc().zza(AbstractC4439th.zziO), str);
    }
}
