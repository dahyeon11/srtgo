package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class S5 implements InterfaceC3349k5 {

    /* renamed from: a */
    private final C4099qh0 f16192a = new C4099qh0();

    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    public final void zza(byte[] bArr, int i8, int i9, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) {
        C4878xX c4878xXZzp;
        this.f16192a.zzI(bArr, i9 + i8);
        this.f16192a.zzK(i8);
        ArrayList arrayList = new ArrayList();
        while (true) {
            C4099qh0 c4099qh0 = this.f16192a;
            if (c4099qh0.zzb() <= 0) {
                interfaceC3462l40.zza(new C2433c5(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            F10.zze(c4099qh0.zzb() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            C4099qh0 c4099qh02 = this.f16192a;
            int iZzg = c4099qh02.zzg() - 8;
            if (c4099qh02.zzg() == 1987343459) {
                C4099qh0 c4099qh03 = this.f16192a;
                CharSequence charSequenceA = null;
                C4649vW c4649vWB = null;
                while (iZzg > 0) {
                    F10.zze(iZzg >= 8, "Incomplete vtt cue box header found.");
                    int iZzg2 = c4099qh03.zzg();
                    int iZzg3 = c4099qh03.zzg();
                    int i10 = iZzg - 8;
                    int i11 = iZzg2 - 8;
                    String strZzB = AbstractC2281am0.zzB(c4099qh03.zzM(), c4099qh03.zzd(), i11);
                    c4099qh03.zzL(i11);
                    if (iZzg3 == 1937011815) {
                        c4649vWB = AbstractC2435c6.b(strZzB);
                    } else if (iZzg3 == 1885436268) {
                        charSequenceA = AbstractC2435c6.a(null, strZzB.trim(), Collections.emptyList());
                    }
                    iZzg = i10 - i11;
                }
                if (charSequenceA == null) {
                    charSequenceA = "";
                }
                if (c4649vWB != null) {
                    c4649vWB.zzl(charSequenceA);
                    c4878xXZzp = c4649vWB.zzp();
                } else {
                    C2321b6 c2321b6 = new C2321b6();
                    c2321b6.zzc = charSequenceA;
                    c4878xXZzp = c2321b6.zza().zzp();
                }
                arrayList.add(c4878xXZzp);
            } else {
                this.f16192a.zzL(iZzg);
            }
        }
    }
}
