package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes2.dex */
final class JF0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, InterfaceC3909p0, SJ0, VN0, InterfaceC3612mM0, IE0, EE0 {
    public static final /* synthetic */ int zzb = 0;

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NF0 f13624a;

    /* synthetic */ JF0(NF0 nf0, IF0 if0) {
        this.f13624a = nf0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i8, int i9) {
        NF0.m(this.f13624a, surfaceTexture);
        this.f13624a.C(i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f13624a.F(null);
        this.f13624a.C(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i8, int i9) {
        this.f13624a.C(i8, i9);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i8, int i9, int i10) {
        this.f13624a.C(i9, i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f13624a.C(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zza(Exception exc) {
        this.f13624a.f14862q.zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzb(String str, long j8, long j9) {
        this.f13624a.f14862q.zzw(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzc(String str) {
        this.f13624a.f14862q.zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzd(LE0 le0) {
        this.f13624a.f14862q.zzy(le0);
        this.f13624a.f14825K = null;
        this.f13624a.f14831Q = null;
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zze(LE0 le0) {
        this.f13624a.f14831Q = le0;
        this.f13624a.f14862q.zzz(le0);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzf(Q5 q52, ME0 me0) {
        this.f13624a.f14825K = q52;
        this.f13624a.f14862q.zzA(q52, me0);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzg(long j8) {
        this.f13624a.f14862q.zzB(j8);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzh(Exception exc) {
        this.f13624a.f14862q.zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzi(TJ0 tj0) {
        this.f13624a.f14862q.zzD(tj0);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzj(TJ0 tj0) {
        this.f13624a.f14862q.zzE(tj0);
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzk(int i8, long j8, long j9) {
        this.f13624a.f14862q.zzF(i8, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzl(int i8, long j8) {
        this.f13624a.f14862q.zzG(i8, j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzm(Object obj, long j8) {
        this.f13624a.f14862q.zzH(obj, j8);
        NF0 nf0 = this.f13624a;
        if (nf0.f14826L == obj) {
            C1211Ca0 c1211Ca0 = nf0.f14856k;
            c1211Ca0.zzd(26, new Z80() { // from class: com.google.android.gms.internal.ads.HF0
                @Override // com.google.android.gms.internal.ads.Z80
                public final void zza(Object obj2) {
                }
            });
            c1211Ca0.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.SJ0
    public final void zzn(final boolean z8) {
        NF0 nf0 = this.f13624a;
        if (nf0.f14835U == z8) {
            return;
        }
        nf0.f14835U = z8;
        C1211Ca0 c1211Ca0 = this.f13624a.f14856k;
        c1211Ca0.zzd(23, new Z80() { // from class: com.google.android.gms.internal.ads.FF0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((EA) obj).zzn(z8);
            }
        });
        c1211Ca0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzo(Exception exc) {
        this.f13624a.f14862q.zzI(exc);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzp(String str, long j8, long j9) {
        this.f13624a.f14862q.zzJ(str, j8, j9);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzq(String str) {
        this.f13624a.f14862q.zzK(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzr(LE0 le0) {
        this.f13624a.f14862q.zzL(le0);
        this.f13624a.f14824J = null;
        this.f13624a.f14830P = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzs(LE0 le0) {
        this.f13624a.f14830P = le0;
        this.f13624a.f14862q.zzM(le0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzt(long j8, int i8) {
        this.f13624a.f14862q.zzN(j8, i8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzu(Q5 q52, ME0 me0) {
        this.f13624a.f14824J = q52;
        this.f13624a.f14862q.zzO(q52, me0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3909p0
    public final void zzv(final IQ iq) {
        this.f13624a.f14840Z = iq;
        C1211Ca0 c1211Ca0 = this.f13624a.f14856k;
        c1211Ca0.zzd(25, new Z80() { // from class: com.google.android.gms.internal.ads.GF0
            @Override // com.google.android.gms.internal.ads.Z80
            public final void zza(Object obj) {
                ((EA) obj).zzr(iq);
            }
        });
        c1211Ca0.zzc();
    }
}
