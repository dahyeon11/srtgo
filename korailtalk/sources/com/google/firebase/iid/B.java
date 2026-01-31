package com.google.firebase.iid;

import I2.AbstractC0608l;
import I2.InterfaceC0602f;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.iid.E;

/* loaded from: classes2.dex */
public class B extends Binder {

    /* renamed from: a, reason: collision with root package name */
    private final a f25608a;

    public interface a {
        AbstractC0608l handle(Intent intent);
    }

    public B(a aVar) {
        this.f25608a = aVar;
    }

    void b(final E.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        this.f25608a.handle(aVar.f25617a).addOnCompleteListener(h.a(), new InterfaceC0602f(aVar) { // from class: com.google.firebase.iid.A

            /* renamed from: a, reason: collision with root package name */
            private final E.a f25607a;

            {
                this.f25607a = aVar;
            }

            @Override // I2.InterfaceC0602f
            public final void onComplete(AbstractC0608l abstractC0608l) {
                this.f25607a.b();
            }
        });
    }
}
