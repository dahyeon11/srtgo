package K1;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.HandlerC1634Mh0;

/* renamed from: K1.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0669w0 extends HandlerC1634Mh0 {
    public HandlerC0669w0(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.HandlerC1634Mh0
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            G1.u.zzp();
            K0.zzM(G1.u.zzo().zzd(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e8) {
            G1.u.zzo().zzw(e8, "AdMobHandler.handleMessage");
        }
    }
}
