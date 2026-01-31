package H1;

import y1.C6514A;

/* loaded from: classes.dex */
public final class Q1 extends X0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6514A.a f1629a;

    public Q1(C6514A.a aVar) {
        this.f1629a = aVar;
    }

    @Override // H1.X0, H1.Y0
    public final void zze() {
        this.f1629a.onVideoEnd();
    }

    @Override // H1.X0, H1.Y0
    public final void zzf(boolean z8) {
        this.f1629a.onVideoMute(z8);
    }

    @Override // H1.X0, H1.Y0
    public final void zzg() {
        this.f1629a.onVideoPause();
    }

    @Override // H1.X0, H1.Y0
    public final void zzh() {
        this.f1629a.onVideoPlay();
    }

    @Override // H1.X0, H1.Y0
    public final void zzi() {
        this.f1629a.onVideoStart();
    }
}
