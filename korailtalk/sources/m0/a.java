package M0;

import P0.r;
import android.content.Context;

/* loaded from: classes.dex */
public class a extends c {
    public a(Context context, R0.a aVar) {
        super(N0.g.getInstance(context, aVar).getBatteryChargingTracker());
    }

    @Override // M0.c
    boolean a(r rVar) {
        return rVar.constraints.requiresCharging();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // M0.c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Boolean bool) {
        return !bool.booleanValue();
    }
}
