package com.google.android.gms.internal.ads;

import H1.C0534f1;
import y1.C6521b;

/* loaded from: classes2.dex */
final class YZ implements InterfaceC3371kG {

    /* renamed from: a */
    boolean f17397a = false;

    /* renamed from: b */
    final /* synthetic */ C3511lX f17398b;

    /* renamed from: c */
    final /* synthetic */ C1203Bt f17399c;

    /* renamed from: d */
    final /* synthetic */ ZZ f17400d;

    YZ(ZZ zz, C3511lX c3511lX, C1203Bt c1203Bt) {
        this.f17398b = c3511lX;
        this.f17399c = c1203Bt;
        this.f17400d = zz;
    }

    private final synchronized void a(C0534f1 c0534f1) {
        int i8 = 1;
        if (true == ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzfA)).booleanValue()) {
            i8 = 3;
        }
        this.f17399c.zzd(new C3625mX(i8, c0534f1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3371kG
    public final synchronized void zza(int i8) {
        if (this.f17397a) {
            return;
        }
        this.f17397a = true;
        a(new C0534f1(i8, ZZ.c(this.f17398b.zza, i8), C6521b.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3371kG
    public final synchronized void zzb(C0534f1 c0534f1) {
        if (this.f17397a) {
            return;
        }
        this.f17397a = true;
        a(c0534f1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3371kG
    public final synchronized void zzc(int i8, String str) {
        try {
            if (this.f17397a) {
                return;
            }
            this.f17397a = true;
            if (str == null) {
                str = ZZ.c(this.f17398b.zza, i8);
            }
            a(new C0534f1(i8, str, C6521b.UNDEFINED_DOMAIN, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3371kG
    public final synchronized void zzd() {
        this.f17399c.zzc(null);
    }
}
