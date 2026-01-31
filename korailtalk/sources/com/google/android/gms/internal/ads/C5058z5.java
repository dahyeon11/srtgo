package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5058z5 implements InterfaceC3349k5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4099qh0 f24105a = new C4099qh0();

    /* renamed from: b, reason: collision with root package name */
    private final C4099qh0 f24106b = new C4099qh0();

    /* renamed from: c, reason: collision with root package name */
    private final C4944y5 f24107c = new C4944y5();

    /* renamed from: d, reason: collision with root package name */
    private Inflater f24108d;

    @Override // com.google.android.gms.internal.ads.InterfaceC3349k5
    public final void zza(byte[] bArr, int i8, int i9, C3235j5 c3235j5, InterfaceC3462l40 interfaceC3462l40) {
        this.f24105a.zzI(bArr, i9 + i8);
        this.f24105a.zzK(i8);
        C4099qh0 c4099qh0 = this.f24105a;
        if (c4099qh0.zzb() > 0 && c4099qh0.zzf() == 120) {
            if (this.f24108d == null) {
                this.f24108d = new Inflater();
            }
            if (AbstractC2281am0.zzI(c4099qh0, this.f24106b, this.f24108d)) {
                C4099qh0 c4099qh02 = this.f24106b;
                c4099qh0.zzI(c4099qh02.zzM(), c4099qh02.zze());
            }
        }
        this.f24107c.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            C4099qh0 c4099qh03 = this.f24105a;
            if (c4099qh03.zzb() < 3) {
                interfaceC3462l40.zza(new C2433c5(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
            C4944y5 c4944y5 = this.f24107c;
            int iZze = c4099qh03.zze();
            int iZzm = c4099qh03.zzm();
            int iZzq = c4099qh03.zzq();
            int iZzd = c4099qh03.zzd() + iZzq;
            C4878xX c4878xXZza = null;
            if (iZzd > iZze) {
                c4099qh03.zzK(iZze);
            } else {
                if (iZzm != 128) {
                    switch (iZzm) {
                        case 20:
                            C4944y5.c(c4944y5, c4099qh03, iZzq);
                            break;
                        case 21:
                            C4944y5.a(c4944y5, c4099qh03, iZzq);
                            break;
                        case 22:
                            C4944y5.b(c4944y5, c4099qh03, iZzq);
                            break;
                    }
                } else {
                    c4878xXZza = c4944y5.zza();
                    c4944y5.zze();
                }
                c4099qh03.zzK(iZzd);
            }
            if (c4878xXZza != null) {
                arrayList.add(c4878xXZza);
            }
        }
    }
}
