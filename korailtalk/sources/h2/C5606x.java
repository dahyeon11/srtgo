package h2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: h2.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5606x extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f31441a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC5605w f31442b;

    public C5606x(AbstractC5605w abstractC5605w) {
        this.f31442b = abstractC5605w;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f31442b.zaa();
            zab();
        }
    }

    public final void zaa(Context context) {
        this.f31441a = context;
    }

    public final synchronized void zab() {
        try {
            Context context = this.f31441a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f31441a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
