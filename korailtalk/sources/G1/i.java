package G1;

import com.google.android.gms.internal.ads.InterfaceC1141Ag0;

/* loaded from: classes.dex */
final class i implements InterfaceC1141Ag0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f1397a;

    i(j jVar) {
        this.f1397a = jVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1141Ag0
    public final void zza(int i8, long j8) {
        this.f1397a.f1405h.zzd(i8, System.currentTimeMillis() - j8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1141Ag0
    public final void zzb(int i8, long j8, String str) {
        this.f1397a.f1405h.zze(i8, System.currentTimeMillis() - j8, str);
    }
}
