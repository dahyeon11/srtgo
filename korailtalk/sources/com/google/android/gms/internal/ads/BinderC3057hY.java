package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import r2.InterfaceC6172a;

/* renamed from: com.google.android.gms.internal.ads.hY */
/* loaded from: classes2.dex */
public final class BinderC3057hY extends AbstractBinderC1160Ar implements InterfaceC3485lG {

    /* renamed from: a */
    private InterfaceC1201Br f19825a;

    /* renamed from: b */
    private InterfaceC3371kG f19826b;

    /* renamed from: c */
    private OJ f19827c;

    @Override // com.google.android.gms.internal.ads.InterfaceC3485lG
    public final synchronized void zza(InterfaceC3371kG interfaceC3371kG) {
        this.f19826b = interfaceC3371kG;
    }

    public final synchronized void zzc(InterfaceC1201Br interfaceC1201Br) {
        this.f19825a = interfaceC1201Br;
    }

    public final synchronized void zzd(OJ oj) {
        this.f19827c = oj;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zze(InterfaceC6172a interfaceC6172a) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            ((PZ) interfaceC1201Br).f15356b.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzf(InterfaceC6172a interfaceC6172a) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            interfaceC1201Br.zzf(interfaceC6172a);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzg(InterfaceC6172a interfaceC6172a, int i8) {
        InterfaceC3371kG interfaceC3371kG = this.f19826b;
        if (interfaceC3371kG != null) {
            interfaceC3371kG.zza(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzh(InterfaceC6172a interfaceC6172a) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            ((PZ) interfaceC1201Br).f15357c.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzi(InterfaceC6172a interfaceC6172a) {
        InterfaceC3371kG interfaceC3371kG = this.f19826b;
        if (interfaceC3371kG != null) {
            interfaceC3371kG.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzj(InterfaceC6172a interfaceC6172a) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            ((PZ) interfaceC1201Br).f15355a.zzdr();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzk(InterfaceC6172a interfaceC6172a, int i8) {
        OJ oj = this.f19827c;
        if (oj != null) {
            L1.n.zzj("Fail to initialize adapter ".concat(String.valueOf(((OZ) oj).f15128c.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzl(InterfaceC6172a interfaceC6172a) {
        OJ oj = this.f19827c;
        if (oj != null) {
            Executor executor = ((OZ) oj).f15129d.f15823b;
            final C3511lX c3511lX = ((OZ) oj).f15128c;
            final C4654va0 c4654va0 = ((OZ) oj).f15127b;
            final C1457Ia0 c1457Ia0 = ((OZ) oj).f15126a;
            final OZ oz = (OZ) oj;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.NZ
                @Override // java.lang.Runnable
                public final void run() {
                    QZ qz = oz.f15129d;
                    QZ.c(c1457Ia0, c4654va0, c3511lX);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzm(InterfaceC6172a interfaceC6172a, C1242Cr c1242Cr) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            ((PZ) interfaceC1201Br).f15358d.zza(c1242Cr);
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzn(InterfaceC6172a interfaceC6172a) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            ((PZ) interfaceC1201Br).f15357c.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC1160Ar, com.google.android.gms.internal.ads.InterfaceC1201Br
    public final synchronized void zzo(InterfaceC6172a interfaceC6172a) {
        InterfaceC1201Br interfaceC1201Br = this.f19825a;
        if (interfaceC1201Br != null) {
            ((PZ) interfaceC1201Br).f15358d.zzc();
        }
    }
}
