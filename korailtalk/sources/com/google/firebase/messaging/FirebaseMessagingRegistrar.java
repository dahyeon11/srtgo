package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Arrays;
import java.util.List;
import m1.AbstractC5905c;
import m1.C5904b;
import s3.InterfaceC6215c;

@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements n3.i {

    public static class c implements m1.g {
        @Override // m1.g
        public <T> m1.f getTransport(String str, Class<T> cls, m1.e eVar) {
            return new b();
        }

        @Override // m1.g
        public <T> m1.f getTransport(String str, Class<T> cls, C5904b c5904b, m1.e eVar) {
            return new b();
        }
    }

    static m1.g determineFactory(m1.g gVar) {
        return (gVar == null || !com.google.android.datatransport.cct.a.LEGACY_INSTANCE.getSupportedEncodings().contains(C5904b.of("json"))) ? new c() : gVar;
    }

    static final /* synthetic */ FirebaseMessaging lambda$getComponents$0$FirebaseMessagingRegistrar(n3.f fVar) {
        return new FirebaseMessaging((l3.c) fVar.get(l3.c.class), (FirebaseInstanceId) fVar.get(FirebaseInstanceId.class), fVar.getProvider(y3.h.class), fVar.getProvider(InterfaceC6215c.class), (com.google.firebase.installations.h) fVar.get(com.google.firebase.installations.h.class), determineFactory((m1.g) fVar.get(m1.g.class)), (r3.d) fVar.get(r3.d.class));
    }

    @Override // n3.i
    @Keep
    public List<n3.e> getComponents() {
        return Arrays.asList(n3.e.builder(FirebaseMessaging.class).add(n3.o.required(l3.c.class)).add(n3.o.required(FirebaseInstanceId.class)).add(n3.o.optionalProvider(y3.h.class)).add(n3.o.optionalProvider(InterfaceC6215c.class)).add(n3.o.optional(m1.g.class)).add(n3.o.required(com.google.firebase.installations.h.class)).add(n3.o.required(r3.d.class)).factory(s.f25811a).alwaysEager().build(), y3.g.create("fire-fcm", "20.1.7_1p"));
    }

    private static class b implements m1.f {
        private b() {
        }

        @Override // m1.f
        public void schedule(AbstractC5905c abstractC5905c, m1.h hVar) {
            hVar.onSchedule(null);
        }

        @Override // m1.f
        public void send(AbstractC5905c abstractC5905c) {
        }
    }
}
