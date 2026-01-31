package com.google.firebase.iid;

import I2.AbstractC0611o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import e2.AbstractC5348b;
import e2.C5347a;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC5348b {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f25630b = 0;

    private static Intent h(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // e2.AbstractC5348b
    protected final int b(Context context, C5347a c5347a) {
        try {
            return ((Integer) AbstractC0611o.await(new f(context).process(c5347a.getIntent()))).intValue();
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseInstanceId", "Failed to send message to service.", e8);
            return w.ERROR_UNKNOWN;
        }
    }

    @Override // e2.AbstractC5348b
    protected final void c(Context context, Bundle bundle) {
        try {
            AbstractC0611o.await(new f(context).process(h(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle)));
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseInstanceId", "Failed to send notification dismissed event to service.", e8);
        }
    }

    @Override // e2.AbstractC5348b
    protected final void d(Context context, Bundle bundle) {
        try {
            AbstractC0611o.await(new f(context).process(h(context, "com.google.firebase.messaging.NOTIFICATION_OPEN", bundle)));
        } catch (InterruptedException | ExecutionException e8) {
            Log.e("FirebaseInstanceId", "Failed to send notification open event to service.", e8);
        }
    }
}
