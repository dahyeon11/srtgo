package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* renamed from: com.google.android.gms.internal.ads.uj0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4558uj0 implements V60 {

    /* renamed from: a, reason: collision with root package name */
    private Message f23099a;

    /* renamed from: b, reason: collision with root package name */
    private C2007Vj0 f23100b;

    /* synthetic */ C4558uj0(AbstractC1923Ti0 abstractC1923Ti0) {
    }

    private final void a() {
        this.f23099a = null;
        this.f23100b = null;
        C2007Vj0.a(this);
    }

    @Override // com.google.android.gms.internal.ads.V60
    public final void zza() {
        Message message = this.f23099a;
        message.getClass();
        message.sendToTarget();
        a();
    }

    public final C4558uj0 zzb(Message message, C2007Vj0 c2007Vj0) {
        this.f23099a = message;
        this.f23100b = c2007Vj0;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.f23099a;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        a();
        return zSendMessageAtFrontOfQueue;
    }
}
