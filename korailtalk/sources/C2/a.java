package C2;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class a extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f415a;

    public a() {
        this.f415a = Looper.getMainLooper();
    }

    public a(Looper looper) {
        super(looper);
        this.f415a = Looper.getMainLooper();
    }
}
