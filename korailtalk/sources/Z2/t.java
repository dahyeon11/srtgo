package z2;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public class t extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f37874a;

    public t() {
        this.f37874a = Looper.getMainLooper();
    }

    public t(Looper looper) {
        super(looper);
        this.f37874a = Looper.getMainLooper();
    }

    public t(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f37874a = Looper.getMainLooper();
    }
}
