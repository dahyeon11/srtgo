package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4139r10 implements InterfaceC4709w10 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4253s10 f22332a;

    C4139r10(C4253s10 c4253s10) {
        this.f22332a = c4253s10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final void zza() {
        synchronized (this.f22332a) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4709w10
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.f22332a) {
            this.f22332a.f22544c = ((YC) obj).zzl();
            ((YC) obj).zzj();
        }
    }
}
