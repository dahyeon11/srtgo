package G1;

import com.google.android.gms.internal.ads.C2373bb;
import com.google.android.gms.internal.ads.C2487cb;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f1415a;

    p(t tVar) {
        this.f1415a = tVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        t tVar = this.f1415a;
        return new C2487cb(C2373bb.zzt(tVar.f1423a.afmaVersion, tVar.f1426d, false));
    }
}
