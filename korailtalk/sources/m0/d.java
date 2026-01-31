package M0;

import H0.m;
import P0.r;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class d extends c {
    public d(Context context, R0.a aVar) {
        super(N0.g.getInstance(context, aVar).getNetworkStateTracker());
    }

    @Override // M0.c
    boolean a(r rVar) {
        return rVar.constraints.getRequiredNetworkType() == m.CONNECTED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M0.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(L0.b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? (bVar.isConnected() && bVar.isValidated()) ? false : true : !bVar.isConnected();
    }
}
