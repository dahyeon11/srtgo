package com.google.android.gms.common.api.internal;

import I2.C0609m;
import f2.C5394d;
import g2.C5539a;
import h2.InterfaceC5593j;
import i2.AbstractC5683p;
import o2.InterfaceC6032d;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: classes.dex */
public abstract class AbstractC1110h {

    /* renamed from: a */
    private final C5394d[] f12036a;

    /* renamed from: b */
    private final boolean f12037b;

    /* renamed from: c */
    private final int f12038c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    public static class a {

        /* renamed from: a */
        private InterfaceC5593j f12039a;

        /* renamed from: c */
        private C5394d[] f12041c;

        /* renamed from: b */
        private boolean f12040b = true;

        /* renamed from: d */
        private int f12042d = 0;

        /* synthetic */ a(h2.O o8) {
        }

        public AbstractC1110h build() {
            AbstractC5683p.checkArgument(this.f12039a != null, "execute parameter required");
            return new f0(this, this.f12041c, this.f12040b, this.f12042d);
        }

        @Deprecated
        public a execute(final InterfaceC6032d interfaceC6032d) {
            this.f12039a = new InterfaceC5593j(interfaceC6032d) { // from class: h2.N
                public final /* synthetic */ InterfaceC6032d zaa;

                @Override // h2.InterfaceC5593j
                public final void accept(Object obj, Object obj2) {
                    throw null;
                }
            };
            return this;
        }

        public a run(InterfaceC5593j interfaceC5593j) {
            this.f12039a = interfaceC5593j;
            return this;
        }

        public a setAutoResolveMissingFeatures(boolean z8) {
            this.f12040b = z8;
            return this;
        }

        public a setFeatures(C5394d... c5394dArr) {
            this.f12041c = c5394dArr;
            return this;
        }

        public a setMethodKey(int i8) {
            this.f12042d = i8;
            return this;
        }
    }

    @Deprecated
    public AbstractC1110h() {
        this.f12036a = null;
        this.f12037b = false;
        this.f12038c = 0;
    }

    public static <A extends C5539a.b, ResultT> a builder() {
        return new a(null);
    }

    protected abstract void a(C5539a.b bVar, C0609m c0609m);

    public boolean shouldAutoResolveMissingFeatures() {
        return this.f12037b;
    }

    public final int zaa() {
        return this.f12038c;
    }

    public final C5394d[] zab() {
        return this.f12036a;
    }

    protected AbstractC1110h(C5394d[] c5394dArr, boolean z8, int i8) {
        this.f12036a = c5394dArr;
        boolean z9 = false;
        if (c5394dArr != null && z8) {
            z9 = true;
        }
        this.f12037b = z9;
        this.f12038c = i8;
    }
}
