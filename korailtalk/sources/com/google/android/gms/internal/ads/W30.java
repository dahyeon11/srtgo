package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class W30 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16924a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f16925b;

    public W30(Context context, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0) {
        this.f16924a = context;
        this.f16925b = interfaceExecutorServiceC1974Un0;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 19;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return this.f16925b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.V30
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String strZzj;
                String strZzk;
                String strZze;
                G1.u.zzp();
                C4659vd c4659vdZzg = G1.u.zzo().zzi().zzg();
                Bundle bundle = null;
                if (c4659vdZzg != null && (!G1.u.zzo().zzi().zzP() || !G1.u.zzo().zzi().zzQ())) {
                    if (c4659vdZzg.zzh()) {
                        c4659vdZzg.zzg();
                    }
                    C3520ld c3520ldZza = c4659vdZzg.zza();
                    if (c3520ldZza != null) {
                        strZzj = c3520ldZza.zzd();
                        strZze = c3520ldZza.zze();
                        strZzk = c3520ldZza.zzf();
                        if (strZzj != null) {
                            G1.u.zzo().zzi().zzx(strZzj);
                        }
                        if (strZzk != null) {
                            G1.u.zzo().zzi().zzz(strZzk);
                        }
                    } else {
                        strZzj = G1.u.zzo().zzi().zzj();
                        strZzk = G1.u.zzo().zzi().zzk();
                        strZze = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    if (!G1.u.zzo().zzi().zzQ()) {
                        if (strZzk == null || TextUtils.isEmpty(strZzk)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strZzk);
                        }
                    }
                    if (strZzj != null && !G1.u.zzo().zzi().zzP()) {
                        bundle2.putString("fingerprint", strZzj);
                        if (!strZzj.equals(strZze)) {
                            bundle2.putString("v_fp", strZze);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new X30(bundle);
            }
        });
    }
}
