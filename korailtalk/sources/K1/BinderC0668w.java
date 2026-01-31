package K1;

import H1.C0534f1;
import android.content.Context;

/* renamed from: K1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC0668w extends H1.D0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f2849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C0674z f2850b;

    BinderC0668w(C0674z c0674z, Context context) {
        this.f2849a = context;
        this.f2850b = c0674z;
    }

    @Override // H1.D0, H1.F0
    public final void zze(C0534f1 c0534f1) {
        if (c0534f1 == null) {
            return;
        }
        this.f2850b.a(this.f2849a, c0534f1.zzb, true, true);
    }
}
