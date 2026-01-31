package com.google.android.gms.internal.ads;

import H1.C0534f1;
import H1.InterfaceC0517a;
import H1.InterfaceC0533f0;
import H1.InterfaceC0554m0;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.h10 */
/* loaded from: classes2.dex */
public final class C3000h10 implements z1.e, YG, InterfaceC3941pG, CF, VF, InterfaceC0517a, InterfaceC5078zF, NG, RF, DJ {

    /* renamed from: i */
    final LQ f19742i;

    /* renamed from: a */
    private final AtomicReference f19734a = new AtomicReference();

    /* renamed from: b */
    private final AtomicReference f19735b = new AtomicReference();

    /* renamed from: c */
    private final AtomicReference f19736c = new AtomicReference();

    /* renamed from: d */
    private final AtomicReference f19737d = new AtomicReference();

    /* renamed from: e */
    private final AtomicReference f19738e = new AtomicReference();

    /* renamed from: f */
    private final AtomicBoolean f19739f = new AtomicBoolean(true);

    /* renamed from: g */
    private final AtomicBoolean f19740g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicBoolean f19741h = new AtomicBoolean(false);

    /* renamed from: j */
    final BlockingQueue f19743j = new ArrayBlockingQueue(((Integer) H1.C.zzc().zza(AbstractC4439th.zziR)).intValue());

    public C3000h10(LQ lq) {
        this.f19742i = lq;
    }

    private final void a() {
        if (this.f19740g.get() && this.f19741h.get()) {
            for (final Pair pair : this.f19743j) {
                X80.zza(this.f19735b, new W80() { // from class: com.google.android.gms.internal.ads.R00
                    @Override // com.google.android.gms.internal.ads.W80
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((InterfaceC0533f0) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.f19743j.clear();
            this.f19739f.set(false);
        }
    }

    @Override // H1.InterfaceC0517a
    public final void onAdClicked() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkM)).booleanValue()) {
            return;
        }
        X80.zza(this.f19734a, new C2770f10());
    }

    @Override // z1.e
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (!this.f19739f.get()) {
            X80.zza(this.f19735b, new W80() { // from class: com.google.android.gms.internal.ads.Y00
                @Override // com.google.android.gms.internal.ads.W80
                public final void zza(Object obj) {
                    ((InterfaceC0533f0) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.f19743j.offer(new Pair(str, str2))) {
            L1.n.zze("The queue for app events is full, dropping the new event.");
            LQ lq = this.f19742i;
            if (lq != null) {
                KQ kqZza = lq.zza();
                kqZza.zzb("action", "dae_action");
                kqZza.zzb("dae_name", str);
                kqZza.zzb("dae_data", str2);
                kqZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zza() {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.O00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzd();
            }
        });
        X80.zza(this.f19738e, new W80() { // from class: com.google.android.gms.internal.ads.P00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC0554m0) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzb() {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.Z00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzc() {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.b10
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzj();
            }
        });
        X80.zza(this.f19738e, new W80() { // from class: com.google.android.gms.internal.ads.c10
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC0554m0) obj).zzf();
            }
        });
        X80.zza(this.f19738e, new W80() { // from class: com.google.android.gms.internal.ads.d10
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC0554m0) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.CF
    public final void zzdB(final C0534f1 c0534f1) {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.S00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzf(c0534f1);
            }
        });
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.T00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zze(c0534f1.zza);
            }
        });
        X80.zza(this.f19737d, new W80() { // from class: com.google.android.gms.internal.ads.U00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.M) obj).zzb(c0534f1);
            }
        });
        this.f19739f.set(false);
        this.f19743j.clear();
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdG() {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzkM)).booleanValue()) {
            X80.zza(this.f19734a, new C2770f10());
        }
        X80.zza(this.f19738e, new W80() { // from class: com.google.android.gms.internal.ads.Q00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC0554m0) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.DJ
    public final void zzdf() {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.a10
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzk();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdn(C2519cr c2519cr) {
    }

    @Override // com.google.android.gms.internal.ads.YG
    public final void zzdo(C1457Ia0 c1457Ia0) {
        this.f19739f.set(true);
        this.f19741h.set(false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzds(InterfaceC4118qr interfaceC4118qr, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5078zF
    public final void zzf() {
    }

    public final synchronized H1.J zzg() {
        return (H1.J) this.f19734a.get();
    }

    @Override // com.google.android.gms.internal.ads.NG
    public final void zzh(final H1.f2 f2Var) {
        X80.zza(this.f19736c, new W80() { // from class: com.google.android.gms.internal.ads.g10
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.L0) obj).zze(f2Var);
            }
        });
    }

    public final synchronized InterfaceC0533f0 zzi() {
        return (InterfaceC0533f0) this.f19735b.get();
    }

    public final void zzj(H1.J j8) {
        this.f19734a.set(j8);
    }

    public final void zzk(H1.M m8) {
        this.f19737d.set(m8);
    }

    public final void zzl(H1.L0 l02) {
        this.f19736c.set(l02);
    }

    public final void zzm(InterfaceC0533f0 interfaceC0533f0) {
        this.f19735b.set(interfaceC0533f0);
        this.f19740g.set(true);
        a();
    }

    public final void zzn(InterfaceC0554m0 interfaceC0554m0) {
        this.f19738e.set(interfaceC0554m0);
    }

    @Override // com.google.android.gms.internal.ads.RF
    public final void zzq(final C0534f1 c0534f1) {
        X80.zza(this.f19738e, new W80() { // from class: com.google.android.gms.internal.ads.X00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((InterfaceC0554m0) obj).zzd(c0534f1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.VF
    public final void zzr() {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.N00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3941pG
    public final synchronized void zzs() {
        X80.zza(this.f19734a, new W80() { // from class: com.google.android.gms.internal.ads.V00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.J) obj).zzi();
            }
        });
        X80.zza(this.f19737d, new W80() { // from class: com.google.android.gms.internal.ads.W00
            @Override // com.google.android.gms.internal.ads.W80
            public final void zza(Object obj) {
                ((H1.M) obj).zzc();
            }
        });
        this.f19741h.set(true);
        a();
    }
}
