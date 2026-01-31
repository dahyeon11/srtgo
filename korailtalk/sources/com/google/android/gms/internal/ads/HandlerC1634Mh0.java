package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.Mh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class HandlerC1634Mh0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f14684a;

    public HandlerC1634Mh0() {
        this.f14684a = Looper.getMainLooper();
    }

    protected void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }

    public HandlerC1634Mh0(Looper looper) {
        super(looper);
        this.f14684a = Looper.getMainLooper();
    }
}
