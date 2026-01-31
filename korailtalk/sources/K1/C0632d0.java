package K1;

import android.content.Context;
import f2.C5399i;
import f2.C5400j;
import java.io.IOException;

/* renamed from: K1.d0 */
/* loaded from: classes.dex */
final class C0632d0 extends B {

    /* renamed from: c */
    private final Context f2807c;

    C0632d0(Context context) {
        this.f2807c = context;
    }

    @Override // K1.B
    public final void zza() {
        boolean isAdIdFakeForDebugLogging;
        try {
            isAdIdFakeForDebugLogging = D1.a.getIsAdIdFakeForDebugLogging(this.f2807c);
        } catch (C5399i | C5400j | IOException | IllegalStateException e8) {
            L1.n.zzh("Fail to get isAdIdFakeForDebugLogging", e8);
            isAdIdFakeForDebugLogging = false;
        }
        L1.m.zzj(isAdIdFakeForDebugLogging);
        L1.n.zzj("Update ad debug logging enablement as " + isAdIdFakeForDebugLogging);
    }
}
