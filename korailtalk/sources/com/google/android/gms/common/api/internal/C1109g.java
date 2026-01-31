package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C1106d;
import f2.C5394d;
import g2.C5539a;
import h2.InterfaceC5593j;
import i2.AbstractC5683p;

/* renamed from: com.google.android.gms.common.api.internal.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1109g {
    public final AbstractC1108f register;
    public final AbstractC1111i zaa;
    public final Runnable zab;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC5593j f12027a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC5593j f12028b;

        /* renamed from: d, reason: collision with root package name */
        private C1106d f12030d;

        /* renamed from: e, reason: collision with root package name */
        private C5394d[] f12031e;

        /* renamed from: g, reason: collision with root package name */
        private int f12033g;

        /* renamed from: c, reason: collision with root package name */
        private Runnable f12029c = new Runnable() { // from class: h2.F
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f, reason: collision with root package name */
        private boolean f12032f = true;

        /* synthetic */ a(h2.G g8) {
        }

        public C1109g build() {
            AbstractC5683p.checkArgument(this.f12027a != null, "Must set register function");
            AbstractC5683p.checkArgument(this.f12028b != null, "Must set unregister function");
            AbstractC5683p.checkArgument(this.f12030d != null, "Must set holder");
            return new C1109g(new c0(this, this.f12030d, this.f12031e, this.f12032f, this.f12033g), new d0(this, (C1106d.a) AbstractC5683p.checkNotNull(this.f12030d.getListenerKey(), "Key must not be null")), this.f12029c, null);
        }

        public a onConnectionSuspended(Runnable runnable) {
            this.f12029c = runnable;
            return this;
        }

        public a register(InterfaceC5593j interfaceC5593j) {
            this.f12027a = interfaceC5593j;
            return this;
        }

        public a setAutoResolveMissingFeatures(boolean z8) {
            this.f12032f = z8;
            return this;
        }

        public a setFeatures(C5394d... c5394dArr) {
            this.f12031e = c5394dArr;
            return this;
        }

        public a setMethodKey(int i8) {
            this.f12033g = i8;
            return this;
        }

        public a unregister(InterfaceC5593j interfaceC5593j) {
            this.f12028b = interfaceC5593j;
            return this;
        }

        public a withHolder(C1106d c1106d) {
            this.f12030d = c1106d;
            return this;
        }
    }

    /* synthetic */ C1109g(AbstractC1108f abstractC1108f, AbstractC1111i abstractC1111i, Runnable runnable, h2.H h8) {
        this.register = abstractC1108f;
        this.zaa = abstractC1111i;
        this.zab = runnable;
    }

    public static <A extends C5539a.b, L> a builder() {
        return new a(null);
    }
}
