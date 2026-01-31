package K1;

import com.google.android.gms.internal.ads.C2898g8;
import com.google.android.gms.internal.ads.InterfaceC2325b8;

/* loaded from: classes.dex */
final class L implements InterfaceC2325b8 {

    /* renamed from: a */
    final /* synthetic */ String f2788a;

    /* renamed from: b */
    final /* synthetic */ P f2789b;

    L(T t8, String str, P p8) {
        this.f2788a = str;
        this.f2789b = p8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2325b8
    public final void zza(C2898g8 c2898g8) {
        L1.n.zzj("Failed to load URL: " + this.f2788a + Q7.X.LF + c2898g8.toString());
        this.f2789b.zza(null);
    }
}
