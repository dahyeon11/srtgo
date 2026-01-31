package com.google.android.gms.internal.ads;

import H1.C0534f1;
import y1.C6521b;

/* renamed from: com.google.android.gms.internal.ads.b00 */
/* loaded from: classes2.dex */
public class BinderC2310b00 extends AbstractBinderC2055Wn {

    /* renamed from: a */
    private final C4850xF f18066a;

    /* renamed from: b */
    private final BJ f18067b;

    /* renamed from: c */
    private final TF f18068c;

    /* renamed from: d */
    private final C3144iG f18069d;

    /* renamed from: e */
    private final C3713nG f18070e;

    /* renamed from: f */
    private final ZH f18071f;

    /* renamed from: g */
    private final IG f18072g;

    /* renamed from: h */
    private final ZJ f18073h;

    /* renamed from: i */
    private final VH f18074i;

    /* renamed from: j */
    private final MF f18075j;

    public BinderC2310b00(C4850xF c4850xF, BJ bj, TF tf, C3144iG c3144iG, C3713nG c3713nG, ZH zh, IG ig, ZJ zj, VH vh, MF mf) {
        this.f18066a = c4850xF;
        this.f18067b = bj;
        this.f18068c = tf;
        this.f18069d = c3144iG;
        this.f18070e = c3713nG;
        this.f18071f = zh;
        this.f18072g = ig;
        this.f18073h = zj;
        this.f18074i = vh;
        this.f18075j = mf;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zze() {
        this.f18066a.onAdClicked();
        this.f18067b.zzdG();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzf() {
        this.f18072g.zzdu(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzg(int i8) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzi(int i8, String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    @Deprecated
    public final void zzj(int i8) {
        zzk(new C0534f1(i8, "", C6521b.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzk(C0534f1 c0534f1) {
        this.f18075j.zza(AbstractC4542ub0.zzc(8, c0534f1));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzl(String str) {
        zzk(new C0534f1(0, str, C6521b.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public void zzm() {
        this.f18068c.zza();
        this.f18074i.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzn() {
        this.f18069d.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzo() {
        this.f18070e.zzs();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzp() {
        this.f18072g.zzdr();
        this.f18074i.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzq(String str, String str2) {
        this.f18071f.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzr(InterfaceC4899xj interfaceC4899xj, String str) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public void zzs(C1242Cr c1242Cr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public void zzt(InterfaceC1406Gr interfaceC1406Gr) {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public void zzu() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public void zzv() {
        this.f18073h.zza();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzw() {
        this.f18073h.zzb();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzx() {
        this.f18073h.zzc();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public void zzy() {
        this.f18073h.zzd();
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC2055Wn, com.google.android.gms.internal.ads.InterfaceC2096Xn
    public final void zzh(C0534f1 c0534f1) {
    }
}
