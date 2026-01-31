package B2;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import i2.AbstractC5683p;

/* loaded from: classes2.dex */
final class F extends c0 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ String f220e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f221f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f222g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Bundle f223h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ n0 f224i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    F(n0 n0Var, String str, String str2, Context context, Bundle bundle) {
        super(n0Var, true);
        this.f224i = n0Var;
        this.f220e = str;
        this.f221f = str2;
        this.f222g = context;
        this.f223h = bundle;
    }

    @Override // B2.c0
    public final void zza() {
        String str;
        String str2;
        String str3;
        try {
            n0 n0Var = this.f224i;
            if (n0.g(this.f220e, this.f221f)) {
                str3 = this.f221f;
                str2 = this.f220e;
                str = this.f224i.f310a;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            AbstractC5683p.checkNotNull(this.f222g);
            n0 n0Var2 = this.f224i;
            n0Var2.f318i = n0Var2.i(this.f222g, true);
            if (this.f224i.f318i == null) {
                Log.w(this.f224i.f310a, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.f222g, "com.google.android.gms.measurement.dynamite");
            ((InterfaceC0452k) AbstractC5683p.checkNotNull(this.f224i.f318i)).initialize(r2.b.wrap(this.f222g), new C0460t(61000L, Math.max(localVersion, r0), DynamiteModule.getRemoteVersion(this.f222g, "com.google.android.gms.measurement.dynamite") < localVersion, str, str2, str3, this.f223h, E2.a.zza(this.f222g)), this.f284a);
        } catch (Exception e8) {
            this.f224i.d(e8, true, false);
        }
    }
}
