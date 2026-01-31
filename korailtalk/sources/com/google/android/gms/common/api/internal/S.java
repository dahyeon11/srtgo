package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class S implements Runnable {

    /* renamed from: a */
    final /* synthetic */ T f11951a;

    S(T t8) {
        this.f11951a = t8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        U u8 = this.f11951a.f11952a;
        u8.f11954b.disconnect(u8.f11954b.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
