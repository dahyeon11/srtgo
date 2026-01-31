package u2;

import I2.C0609m;
import com.google.android.gms.common.api.Status;
import h2.C5597n;

/* loaded from: classes2.dex */
final class o extends e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0609m f37111a;

    o(p pVar, C0609m c0609m) {
        this.f37111a = c0609m;
    }

    @Override // u2.e, u2.f
    public final void zzb(Status status, X1.f fVar) {
        C5597n.setResultOrApiException(status, fVar != null ? new X1.c(fVar.zzb(), fVar.zza()) : null, this.f37111a);
    }
}
