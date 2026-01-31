package com.google.firebase.iid;

import androidx.annotation.Keep;
import java.util.Arrays;
import java.util.List;
import s3.InterfaceC6215c;
import t3.InterfaceC6363a;

@Keep
/* loaded from: classes2.dex */
public final class Registrar implements n3.i {

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements InterfaceC6363a {

        /* renamed from: a, reason: collision with root package name */
        final FirebaseInstanceId f25631a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f25631a = firebaseInstanceId;
        }

        @Override // t3.InterfaceC6363a
        public String getId() {
            return this.f25631a.getId();
        }

        @Override // t3.InterfaceC6363a
        public String getToken() {
            return this.f25631a.getToken();
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(n3.f fVar) {
        return new FirebaseInstanceId((l3.c) fVar.get(l3.c.class), fVar.getProvider(y3.h.class), fVar.getProvider(InterfaceC6215c.class), (com.google.firebase.installations.h) fVar.get(com.google.firebase.installations.h.class));
    }

    static final /* synthetic */ InterfaceC6363a lambda$getComponents$1$Registrar(n3.f fVar) {
        return new a((FirebaseInstanceId) fVar.get(FirebaseInstanceId.class));
    }

    @Override // n3.i
    @Keep
    public final List<n3.e> getComponents() {
        return Arrays.asList(n3.e.builder(FirebaseInstanceId.class).add(n3.o.required(l3.c.class)).add(n3.o.optionalProvider(y3.h.class)).add(n3.o.optionalProvider(InterfaceC6215c.class)).add(n3.o.required(com.google.firebase.installations.h.class)).factory(s.f25672a).alwaysEager().build(), n3.e.builder(InterfaceC6363a.class).add(n3.o.required(FirebaseInstanceId.class)).factory(t.f25673a).build(), y3.g.create("fire-iid", "21.0.0"));
    }
}
