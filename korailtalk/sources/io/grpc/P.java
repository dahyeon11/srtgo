package io.grpc;

import io.grpc.AbstractC5714a0;
import io.grpc.C5713a;

/* loaded from: classes.dex */
public abstract class P {
    public static final C5713a.c KEY = C5713a.c.create("internal:io.grpc.config-selector");

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final J0 f32045a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f32046b;
        public InterfaceC5788k interceptor;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Object f32047a;

            /* renamed from: b, reason: collision with root package name */
            private InterfaceC5788k f32048b;

            public b build() {
                e3.w.checkState(this.f32047a != null, "config is not set");
                return new b(J0.OK, this.f32047a, this.f32048b);
            }

            public a setConfig(Object obj) {
                this.f32047a = e3.w.checkNotNull(obj, "config");
                return this;
            }

            public a setInterceptor(InterfaceC5788k interfaceC5788k) {
                this.f32048b = (InterfaceC5788k) e3.w.checkNotNull(interfaceC5788k, "interceptor");
                return this;
            }

            private a() {
            }
        }

        public static b forError(J0 j02) {
            e3.w.checkArgument(!j02.isOk(), "status is OK");
            return new b(j02, null, null);
        }

        public static a newBuilder() {
            return new a();
        }

        public Object getConfig() {
            return this.f32046b;
        }

        public InterfaceC5788k getInterceptor() {
            return this.interceptor;
        }

        public J0 getStatus() {
            return this.f32045a;
        }

        private b(J0 j02, Object obj, InterfaceC5788k interfaceC5788k) {
            this.f32045a = (J0) e3.w.checkNotNull(j02, androidx.core.app.r.CATEGORY_STATUS);
            this.f32046b = obj;
            this.interceptor = interfaceC5788k;
        }
    }

    public abstract b selectConfig(AbstractC5714a0.f fVar);
}
