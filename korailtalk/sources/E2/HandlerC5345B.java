package e2;

import android.os.Looper;
import android.os.Message;

/* renamed from: e2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class HandlerC5345B extends y2.e {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C5349c f30244a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandlerC5345B(C5349c c5349c, Looper looper) {
        super(looper);
        this.f30244a = c5349c;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f30244a.g(message);
    }
}
