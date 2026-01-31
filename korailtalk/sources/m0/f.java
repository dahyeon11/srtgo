package M0;

import H0.l;
import H0.m;
import P0.r;
import android.content.Context;

/* loaded from: classes.dex */
public class f extends c {

    /* renamed from: e, reason: collision with root package name */
    private static final String f3093e = l.tagWithPrefix("NetworkNotRoamingCtrlr");

    public f(Context context, R0.a aVar) {
        super(N0.g.getInstance(context, aVar).getNetworkStateTracker());
    }

    @Override // M0.c
    boolean a(r rVar) {
        return rVar.constraints.getRequiredNetworkType() == m.NOT_ROAMING;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M0.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(L0.b bVar) {
        return (bVar.isConnected() && bVar.isNotRoaming()) ? false : true;
    }
}
