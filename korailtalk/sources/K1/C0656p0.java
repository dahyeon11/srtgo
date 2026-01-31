package K1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: K1.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0656p0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C0659r0 f2822a;

    C0656p0(C0659r0 c0659r0) {
        this.f2822a = c0659r0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f2822a.b(context, intent);
    }
}
