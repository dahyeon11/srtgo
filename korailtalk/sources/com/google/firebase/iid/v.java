package com.google.firebase.iid;

import I2.AbstractC0608l;
import I2.InterfaceC0599c;
import android.util.Log;
import android.util.Pair;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f25676a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f25677b = new O.a();

    interface a {
        AbstractC0608l start();
    }

    v(Executor executor) {
        this.f25676a = executor;
    }

    synchronized AbstractC0608l a(String str, String str2, a aVar) {
        final Pair pair = new Pair(str, str2);
        AbstractC0608l abstractC0608l = (AbstractC0608l) this.f25677b.get(pair);
        if (abstractC0608l != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(pair);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                sb.append("Joining ongoing request for: ");
                sb.append(strValueOf);
            }
            return abstractC0608l;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String strValueOf2 = String.valueOf(pair);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Making new request for: ");
            sb2.append(strValueOf2);
        }
        AbstractC0608l abstractC0608lContinueWithTask = aVar.start().continueWithTask(this.f25676a, new InterfaceC0599c(this, pair) { // from class: com.google.firebase.iid.u

            /* renamed from: a, reason: collision with root package name */
            private final v f25674a;

            /* renamed from: b, reason: collision with root package name */
            private final Pair f25675b;

            {
                this.f25674a = this;
                this.f25675b = pair;
            }

            @Override // I2.InterfaceC0599c
            public final Object then(AbstractC0608l abstractC0608l2) {
                return this.f25674a.b(this.f25675b, abstractC0608l2);
            }
        });
        this.f25677b.put(pair, abstractC0608lContinueWithTask);
        return abstractC0608lContinueWithTask;
    }

    final /* synthetic */ AbstractC0608l b(Pair pair, AbstractC0608l abstractC0608l) {
        synchronized (this) {
            this.f25677b.remove(pair);
        }
        return abstractC0608l;
    }
}
