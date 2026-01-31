package androidx.work.impl.diagnostics;

import H0.l;
import H0.n;
import H0.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11199a = l.tagWithPrefix("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        l.get().debug(f11199a, "Requesting diagnostics", new Throwable[0]);
        try {
            w.getInstance(context).enqueue(n.from((Class<? extends ListenableWorker>) DiagnosticsWorker.class));
        } catch (IllegalStateException e8) {
            l.get().error(f11199a, "WorkManager is not initialized", e8);
        }
    }
}
