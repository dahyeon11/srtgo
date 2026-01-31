package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.d6 */
/* loaded from: classes2.dex */
public final class C2550d6 implements InterfaceC3349k5 {

    /* renamed from: a */
    private final C4099qh0 f18516a = new C4099qh0();

    /* renamed from: b */
    private final T5 f18517b = new T5();

    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    public final void zza(byte[] bArr, int i8, int i9, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) throws C1901Sv {
        this.f18516a.zzI(bArr, i9 + i8);
        this.f18516a.zzK(i8);
        ArrayList arrayList = new ArrayList();
        try {
            C4099qh0 c4099qh0 = this.f18516a;
            int iZzd = c4099qh0.zzd();
            Charset charset = AbstractC3647mj0.zzc;
            String strZzy = c4099qh0.zzy(charset);
            if (strZzy == null || !strZzy.startsWith("WEBVTT")) {
                c4099qh0.zzK(iZzd);
                throw C1901Sv.zza("Expected WEBVTT. Got ".concat(String.valueOf(c4099qh0.zzy(charset))), null);
            }
            while (!TextUtils.isEmpty(this.f18516a.zzy(AbstractC3647mj0.zzc))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                C4099qh0 c4099qh02 = this.f18516a;
                char c9 = 65535;
                int iZzd2 = 0;
                while (c9 == 65535) {
                    iZzd2 = c4099qh02.zzd();
                    String strZzy2 = c4099qh02.zzy(AbstractC3647mj0.zzc);
                    c9 = strZzy2 == null ? (char) 0 : "STYLE".equals(strZzy2) ? (char) 2 : strZzy2.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                c4099qh02.zzK(iZzd2);
                if (c9 == 0) {
                    AbstractC2662e5.zza(new C2894g6(arrayList2), c3235j5, interfaceC3462l40);
                    return;
                }
                if (c9 == 1) {
                    while (!TextUtils.isEmpty(this.f18516a.zzy(AbstractC3647mj0.zzc))) {
                    }
                } else if (c9 != 2) {
                    V5 v5Zzc = AbstractC2435c6.zzc(this.f18516a, arrayList);
                    if (v5Zzc != null) {
                        arrayList2.add(v5Zzc);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f18516a.zzy(AbstractC3647mj0.zzc);
                    arrayList.addAll(this.f18517b.zzb(this.f18516a));
                }
            }
        } catch (C1901Sv e8) {
            throw new IllegalArgumentException(e8);
        }
    }
}
