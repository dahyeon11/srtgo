package com.google.firebase.messaging;

import android.content.Intent;
import i2.AbstractC5683p;
import o3.InterfaceC6036d;
import o3.InterfaceC6037e;

/* loaded from: classes2.dex */
final class t {

    /* renamed from: a */
    private final String f25812a;

    /* renamed from: b */
    private final Intent f25813b;

    static class a implements InterfaceC6036d {
        a() {
        }

        @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
        public void encode(t tVar, InterfaceC6037e interfaceC6037e) {
            Intent intentB = tVar.b();
            interfaceC6037e.add("ttl", x.q(intentB));
            interfaceC6037e.add(androidx.core.app.r.CATEGORY_EVENT, tVar.a());
            interfaceC6037e.add("instanceId", x.e());
            interfaceC6037e.add("priority", x.n(intentB));
            interfaceC6037e.add("packageName", x.m());
            interfaceC6037e.add("sdkPlatform", "ANDROID");
            interfaceC6037e.add("messageType", x.k(intentB));
            String strG = x.g(intentB);
            if (strG != null) {
                interfaceC6037e.add("messageId", strG);
            }
            String strP = x.p(intentB);
            if (strP != null) {
                interfaceC6037e.add("topic", strP);
            }
            String strB = x.b(intentB);
            if (strB != null) {
                interfaceC6037e.add("collapseKey", strB);
            }
            if (x.h(intentB) != null) {
                interfaceC6037e.add("analyticsLabel", x.h(intentB));
            }
            if (x.d(intentB) != null) {
                interfaceC6037e.add("composerLabel", x.d(intentB));
            }
            String strO = x.o();
            if (strO != null) {
                interfaceC6037e.add("projectNumber", strO);
            }
        }
    }

    static final class b {

        /* renamed from: a */
        private final t f25814a;

        b(t tVar) {
            this.f25814a = (t) AbstractC5683p.checkNotNull(tVar);
        }

        final t a() {
            return this.f25814a;
        }
    }

    static final class c implements InterfaceC6036d {
        c() {
        }

        @Override // o3.InterfaceC6036d, o3.InterfaceC6034b
        public final void encode(b bVar, InterfaceC6037e interfaceC6037e) {
            interfaceC6037e.add("messaging_client_event", bVar.a());
        }
    }

    t(String str, Intent intent) {
        this.f25812a = AbstractC5683p.checkNotEmpty(str, "evenType must be non-null");
        this.f25813b = (Intent) AbstractC5683p.checkNotNull(intent, "intent must be non-null");
    }

    final String a() {
        return this.f25812a;
    }

    final Intent b() {
        return this.f25813b;
    }
}
