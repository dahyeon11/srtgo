package H1;

import y1.AbstractC6524e;

/* loaded from: classes.dex */
public final class T1 extends I {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC6524e f1630a;

    public T1(AbstractC6524e abstractC6524e) {
        this.f1630a = abstractC6524e;
    }

    public final AbstractC6524e zzb() {
        return this.f1630a;
    }

    @Override // H1.I, H1.J
    public final void zzc() {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdClicked();
        }
    }

    @Override // H1.I, H1.J
    public final void zzd() {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdClosed();
        }
    }

    @Override // H1.I, H1.J
    public final void zzf(C0534f1 c0534f1) {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdFailedToLoad(c0534f1.zzb());
        }
    }

    @Override // H1.I, H1.J
    public final void zzg() {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdImpression();
        }
    }

    @Override // H1.I, H1.J
    public final void zzi() {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdLoaded();
        }
    }

    @Override // H1.I, H1.J
    public final void zzj() {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdOpened();
        }
    }

    @Override // H1.I, H1.J
    public final void zzk() {
        AbstractC6524e abstractC6524e = this.f1630a;
        if (abstractC6524e != null) {
            abstractC6524e.onAdSwipeGestureClicked();
        }
    }

    @Override // H1.I, H1.J
    public final void zzh() {
    }

    @Override // H1.I, H1.J
    public final void zze(int i8) {
    }
}
