package M0;

import H0.m;
import P0.r;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class g extends c {
    public g(Context context, R0.a aVar) {
        super(N0.g.getInstance(context, aVar).getNetworkStateTracker());
    }

    @Override // M0.c
    boolean a(r rVar) {
        return rVar.constraints.getRequiredNetworkType() == m.UNMETERED || (Build.VERSION.SDK_INT >= 30 && rVar.constraints.getRequiredNetworkType() == m.TEMPORARILY_UNMETERED);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M0.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(L0.b bVar) {
        return !bVar.isConnected() || bVar.isMetered();
    }
}
