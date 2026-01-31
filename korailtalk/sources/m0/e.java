package M0;

import H0.l;
import H0.m;
import P0.r;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public class e extends c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f3092e = l.tagWithPrefix("NetworkMeteredCtrlr");

    public e(Context context, R0.a aVar) {
        super(N0.g.getInstance(context, aVar).getNetworkStateTracker());
    }

    @Override // M0.c
    boolean a(r rVar) {
        return rVar.constraints.getRequiredNetworkType() == m.METERED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M0.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(L0.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.isConnected() && bVar.isMetered()) ? false : true;
        }
        l.get().debug(f3092e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.isConnected();
    }
}
