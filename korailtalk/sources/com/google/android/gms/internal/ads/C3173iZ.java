package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.iZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3173iZ {

    /* renamed from: a, reason: collision with root package name */
    private final C3403kb0 f19944a;

    /* renamed from: b, reason: collision with root package name */
    private final C4756wP f19945b;

    /* renamed from: c, reason: collision with root package name */
    private final LQ f19946c;

    public C3173iZ(C3403kb0 c3403kb0, C4756wP c4756wP, LQ lq) {
        this.f19944a = c3403kb0;
        this.f19945b = c4756wP;
        this.f19946c = lq;
    }

    public final void zza(C4996ya0 c4996ya0, C4654va0 c4654va0, int i8, C3625mX c3625mX, long j8) {
        C4642vP c4642vPZza;
        KQ kqZza = this.f19946c.zza();
        kqZza.zzd(c4996ya0);
        kqZza.zzc(c4654va0);
        kqZza.zzb("action", "adapter_status");
        kqZza.zzb("adapter_l", String.valueOf(j8));
        kqZza.zzb("sc", Integer.toString(i8));
        if (c3625mX != null) {
            kqZza.zzb("arec", Integer.toString(c3625mX.zzb().zza));
            String strZza = this.f19944a.zza(c3625mX.getMessage());
            if (strZza != null) {
                kqZza.zzb("areec", strZza);
            }
        }
        C4756wP c4756wP = this.f19945b;
        Iterator it = c4654va0.zzu.iterator();
        while (true) {
            if (!it.hasNext()) {
                c4642vPZza = null;
                break;
            } else {
                c4642vPZza = c4756wP.zza((String) it.next());
                if (c4642vPZza != null) {
                    break;
                }
            }
        }
        if (c4642vPZza != null) {
            kqZza.zzb("ancn", c4642vPZza.zza);
            C2974gp c2974gp = c4642vPZza.zzb;
            if (c2974gp != null) {
                kqZza.zzb("adapter_v", c2974gp.toString());
            }
            C2974gp c2974gp2 = c4642vPZza.zzc;
            if (c2974gp2 != null) {
                kqZza.zzb("adapter_sv", c2974gp2.toString());
            }
        }
        kqZza.zzf();
    }
}
