package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.C0895o0;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p.InterfaceC6046a;
import s.C6203b;
import t.C6307w;
import t.X;
import u.C6372C;
import z.AbstractC6586j;
import z.C6562K;
import z.C6588k;
import z.EnumC6590l;
import z.EnumC6592m;
import z.EnumC6594n;
import z.EnumC6596o;
import z.InterfaceC6600q;

/* loaded from: classes.dex */
class X {

    /* renamed from: a, reason: collision with root package name */
    private final C6307w f36557a;

    /* renamed from: b, reason: collision with root package name */
    private final x.o f36558b;

    /* renamed from: c, reason: collision with root package name */
    private final z.z0 f36559c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f36560d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f36561e;

    /* renamed from: f, reason: collision with root package name */
    private int f36562f = 1;

    static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final C6307w f36563a;

        /* renamed from: b, reason: collision with root package name */
        private final x.j f36564b;

        /* renamed from: c, reason: collision with root package name */
        private final int f36565c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f36566d = false;

        a(C6307w c6307w, int i8, x.j jVar) {
            this.f36563a = c6307w;
            this.f36565c = i8;
            this.f36564b = jVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object c(c.a aVar) {
            this.f36563a.getFocusMeteringControl().B(aVar);
            this.f36564b.onAePrecaptureStarted();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean d(Void r02) {
            return Boolean.TRUE;
        }

        @Override // t.X.d
        public boolean isCaptureResultNeeded() {
            return this.f36565c == 0;
        }

        @Override // t.X.d
        public void postCapture() {
            if (this.f36566d) {
                androidx.camera.core.B0.d("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f36563a.getFocusMeteringControl().g(false, true);
                this.f36564b.onAePrecaptureFinished();
            }
        }

        @Override // t.X.d
        public com.google.common.util.concurrent.C preCapture(TotalCaptureResult totalCaptureResult) {
            if (!X.a(this.f36565c, totalCaptureResult)) {
                return B.f.immediateFuture(Boolean.FALSE);
            }
            androidx.camera.core.B0.d("Camera2CapturePipeline", "Trigger AE");
            this.f36566d = true;
            return B.d.from(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.V
                @Override // androidx.concurrent.futures.c.InterfaceC0123c
                public final Object attachCompleter(c.a aVar) {
                    return this.f36554a.c(aVar);
                }
            })).transform(new InterfaceC6046a() { // from class: t.W
                @Override // p.InterfaceC6046a
                public final Object apply(Object obj) {
                    return X.a.d((Void) obj);
                }
            }, A.a.directExecutor());
        }
    }

    static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final C6307w f36567a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f36568b = false;

        b(C6307w c6307w) {
            this.f36567a = c6307w;
        }

        @Override // t.X.d
        public boolean isCaptureResultNeeded() {
            return true;
        }

        @Override // t.X.d
        public void postCapture() {
            if (this.f36568b) {
                androidx.camera.core.B0.d("Camera2CapturePipeline", "cancel TriggerAF");
                this.f36567a.getFocusMeteringControl().g(true, false);
            }
        }

        @Override // t.X.d
        public com.google.common.util.concurrent.C preCapture(TotalCaptureResult totalCaptureResult) {
            Integer num;
            com.google.common.util.concurrent.C cImmediateFuture = B.f.immediateFuture(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return cImmediateFuture;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                androidx.camera.core.B0.d("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    androidx.camera.core.B0.d("Camera2CapturePipeline", "Trigger AF");
                    this.f36568b = true;
                    this.f36567a.getFocusMeteringControl().C(null, false);
                }
            }
            return cImmediateFuture;
        }
    }

    static class c {

        /* renamed from: i, reason: collision with root package name */
        private static final long f36569i;

        /* renamed from: j, reason: collision with root package name */
        private static final long f36570j;

        /* renamed from: a, reason: collision with root package name */
        private final int f36571a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f36572b;

        /* renamed from: c, reason: collision with root package name */
        private final C6307w f36573c;

        /* renamed from: d, reason: collision with root package name */
        private final x.j f36574d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f36575e;

        /* renamed from: f, reason: collision with root package name */
        private long f36576f = f36569i;

        /* renamed from: g, reason: collision with root package name */
        final List f36577g = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        private final d f36578h = new a();

        class a implements d {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean b(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // t.X.d
            public boolean isCaptureResultNeeded() {
                Iterator it = c.this.f36577g.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).isCaptureResultNeeded()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // t.X.d
            public void postCapture() {
                Iterator it = c.this.f36577g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).postCapture();
                }
            }

            @Override // t.X.d
            public com.google.common.util.concurrent.C preCapture(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c.this.f36577g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d) it.next()).preCapture(totalCaptureResult));
                }
                return B.f.transform(B.f.allAsList(arrayList), new InterfaceC6046a() { // from class: t.e0
                    @Override // p.InterfaceC6046a
                    public final Object apply(Object obj) {
                        return X.c.a.b((List) obj);
                    }
                }, A.a.directExecutor());
            }
        }

        class b extends AbstractC6586j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f36580a;

            b(c.a aVar) {
                this.f36580a = aVar;
            }

            @Override // z.AbstractC6586j
            public void onCaptureCancelled() {
                this.f36580a.setException(new C0895o0(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // z.AbstractC6586j
            public void onCaptureCompleted(InterfaceC6600q interfaceC6600q) {
                this.f36580a.set(null);
            }

            @Override // z.AbstractC6586j
            public void onCaptureFailed(C6588k c6588k) {
                this.f36580a.setException(new C0895o0(2, "Capture request failed with reason " + c6588k.getReason(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f36569i = timeUnit.toNanos(1L);
            f36570j = timeUnit.toNanos(5L);
        }

        c(int i8, Executor executor, C6307w c6307w, boolean z8, x.j jVar) {
            this.f36571a = i8;
            this.f36572b = executor;
            this.f36573c = c6307w;
            this.f36575e = z8;
            this.f36574d = jVar;
        }

        private void h(C6562K.a aVar) {
            C6203b.a aVar2 = new C6203b.a();
            aVar2.setCaptureRequestOption(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.addImplementationOptions(aVar2.build());
        }

        private void i(C6562K.a aVar, C6562K c6562k) {
            int i8 = (this.f36571a != 3 || this.f36575e) ? c6562k.getTemplateType() == -1 ? 2 : -1 : 4;
            if (i8 != -1) {
                aVar.setTemplateType(i8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            C6278h c6278h = new C6278h(totalCaptureResult);
            boolean z8 = c6278h.getAfMode() == EnumC6592m.OFF || c6278h.getAfMode() == EnumC6592m.UNKNOWN || c6278h.getAfState() == EnumC6594n.PASSIVE_FOCUSED || c6278h.getAfState() == EnumC6594n.PASSIVE_NOT_FOCUSED || c6278h.getAfState() == EnumC6594n.LOCKED_FOCUSED || c6278h.getAfState() == EnumC6594n.LOCKED_NOT_FOCUSED;
            boolean z9 = c6278h.getAeState() == EnumC6590l.CONVERGED || c6278h.getAeState() == EnumC6590l.FLASH_REQUIRED || c6278h.getAeState() == EnumC6590l.UNKNOWN;
            boolean z10 = c6278h.getAwbState() == EnumC6596o.CONVERGED || c6278h.getAwbState() == EnumC6596o.UNKNOWN;
            androidx.camera.core.B0.d("Camera2CapturePipeline", "checkCaptureResult, AE=" + c6278h.getAeState() + " AF =" + c6278h.getAfState() + " AWB=" + c6278h.getAwbState());
            return z8 && z9 && z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.C l(int i8, TotalCaptureResult totalCaptureResult) {
            if (X.a(i8, totalCaptureResult)) {
                q(f36570j);
            }
            return this.f36578h.preCapture(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.C m(Boolean bool) {
            return bool.booleanValue() ? s(this.f36576f, new e.a() { // from class: t.d0
                @Override // t.X.e.a
                public final boolean check(TotalCaptureResult totalCaptureResult) {
                    return this.f36665a.k(totalCaptureResult);
                }
            }) : B.f.immediateFuture(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.C n(List list, int i8, TotalCaptureResult totalCaptureResult) {
            return r(list, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o() {
            this.f36578h.postCapture();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object p(C6562K.a aVar, c.a aVar2) {
            aVar.addCameraCaptureCallback(new b(aVar2));
            return "submitStillCapture";
        }

        private void q(long j8) {
            this.f36576f = j8;
        }

        private com.google.common.util.concurrent.C s(long j8, e.a aVar) {
            e eVar = new e(j8, aVar);
            this.f36573c.k(eVar);
            return eVar.getFuture();
        }

        void g(d dVar) {
            this.f36577g.add(dVar);
        }

        com.google.common.util.concurrent.C j(final List list, final int i8) {
            com.google.common.util.concurrent.C cImmediateFuture = B.f.immediateFuture(null);
            if (!this.f36577g.isEmpty()) {
                cImmediateFuture = B.d.from(this.f36578h.isCaptureResultNeeded() ? s(0L, null) : B.f.immediateFuture(null)).transformAsync(new B.a() { // from class: t.Y
                    @Override // B.a
                    public final com.google.common.util.concurrent.C apply(Object obj) {
                        return this.f36616a.l(i8, (TotalCaptureResult) obj);
                    }
                }, this.f36572b).transformAsync(new B.a() { // from class: t.Z
                    @Override // B.a
                    public final com.google.common.util.concurrent.C apply(Object obj) {
                        return this.f36620a.m((Boolean) obj);
                    }
                }, this.f36572b);
            }
            B.d dVarTransformAsync = B.d.from(cImmediateFuture).transformAsync(new B.a() { // from class: t.a0
                @Override // B.a
                public final com.google.common.util.concurrent.C apply(Object obj) {
                    return this.f36623a.n(list, i8, (TotalCaptureResult) obj);
                }
            }, this.f36572b);
            dVarTransformAsync.addListener(new Runnable() { // from class: t.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36627a.o();
                }
            }, this.f36572b);
            return dVarTransformAsync;
        }

        com.google.common.util.concurrent.C r(List list, int i8) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6562K c6562k = (C6562K) it.next();
                final C6562K.a aVarFrom = C6562K.a.from(c6562k);
                i(aVarFrom, c6562k);
                if (this.f36574d.shouldSetAeModeAlwaysFlash(i8)) {
                    h(aVarFrom);
                }
                arrayList.add(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.c0
                    @Override // androidx.concurrent.futures.c.InterfaceC0123c
                    public final Object attachCompleter(c.a aVar) {
                        return this.f36634a.p(aVarFrom, aVar);
                    }
                }));
                arrayList2.add(aVarFrom.build());
            }
            this.f36573c.O(arrayList2);
            return B.f.allAsList(arrayList);
        }
    }

    interface d {
        boolean isCaptureResultNeeded();

        void postCapture();

        com.google.common.util.concurrent.C preCapture(TotalCaptureResult totalCaptureResult);
    }

    static class e implements C6307w.c {

        /* renamed from: a, reason: collision with root package name */
        private c.a f36582a;

        /* renamed from: c, reason: collision with root package name */
        private final long f36584c;

        /* renamed from: d, reason: collision with root package name */
        private final a f36585d;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.common.util.concurrent.C f36583b = androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.f0
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return this.f36670a.b(aVar);
            }
        });

        /* renamed from: e, reason: collision with root package name */
        private volatile Long f36586e = null;

        interface a {
            boolean check(TotalCaptureResult totalCaptureResult);
        }

        e(long j8, a aVar) {
            this.f36584c = j8;
            this.f36585d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object b(c.a aVar) {
            this.f36582a = aVar;
            return "waitFor3AResult";
        }

        public com.google.common.util.concurrent.C getFuture() {
            return this.f36583b;
        }

        @Override // t.C6307w.c
        public boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            Long l8 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l8 != null && this.f36586e == null) {
                this.f36586e = l8;
            }
            Long l9 = this.f36586e;
            if (0 == this.f36584c || l9 == null || l8 == null || l8.longValue() - l9.longValue() <= this.f36584c) {
                a aVar = this.f36585d;
                if (aVar != null && !aVar.check(totalCaptureResult)) {
                    return false;
                }
                this.f36582a.set(totalCaptureResult);
                return true;
            }
            this.f36582a.set(null);
            androidx.camera.core.B0.d("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l8 + " first: " + l9);
            return true;
        }
    }

    static class f implements d {

        /* renamed from: a, reason: collision with root package name */
        private final C6307w f36587a;

        /* renamed from: b, reason: collision with root package name */
        private final int f36588b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f36589c = false;

        f(C6307w c6307w, int i8) {
            this.f36587a = c6307w;
            this.f36588b = i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object c(c.a aVar) {
            this.f36587a.getTorchControl().g(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean d(Void r02) {
            return Boolean.TRUE;
        }

        @Override // t.X.d
        public boolean isCaptureResultNeeded() {
            return this.f36588b == 0;
        }

        @Override // t.X.d
        public void postCapture() {
            if (this.f36589c) {
                this.f36587a.getTorchControl().g(null, false);
                androidx.camera.core.B0.d("Camera2CapturePipeline", "Turn off torch");
            }
        }

        @Override // t.X.d
        public com.google.common.util.concurrent.C preCapture(TotalCaptureResult totalCaptureResult) {
            if (X.a(this.f36588b, totalCaptureResult)) {
                if (!this.f36587a.y()) {
                    androidx.camera.core.B0.d("Camera2CapturePipeline", "Turn on torch");
                    this.f36589c = true;
                    return B.d.from(androidx.concurrent.futures.c.getFuture(new c.InterfaceC0123c() { // from class: t.g0
                        @Override // androidx.concurrent.futures.c.InterfaceC0123c
                        public final Object attachCompleter(c.a aVar) {
                            return this.f36674a.c(aVar);
                        }
                    })).transform(new InterfaceC6046a() { // from class: t.h0
                        @Override // p.InterfaceC6046a
                        public final Object apply(Object obj) {
                            return X.f.d((Void) obj);
                        }
                    }, A.a.directExecutor());
                }
                androidx.camera.core.B0.d("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return B.f.immediateFuture(Boolean.FALSE);
        }
    }

    X(C6307w c6307w, C6372C c6372c, z.z0 z0Var, Executor executor) {
        this.f36557a = c6307w;
        Integer num = (Integer) c6372c.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f36561e = num != null && num.intValue() == 2;
        this.f36560d = executor;
        this.f36559c = z0Var;
        this.f36558b = new x.o(z0Var);
    }

    static boolean a(int i8, TotalCaptureResult totalCaptureResult) {
        if (i8 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i8 == 1) {
            return true;
        }
        if (i8 == 2) {
            return false;
        }
        throw new AssertionError(i8);
    }

    private boolean b(int i8) {
        return this.f36558b.shouldUseTorchAsFlash() || this.f36562f == 3 || i8 == 1;
    }

    public void setTemplate(int i8) {
        this.f36562f = i8;
    }

    public com.google.common.util.concurrent.C submitStillCaptures(List<C6562K> list, int i8, int i9, int i10) {
        x.j jVar = new x.j(this.f36559c);
        c cVar = new c(this.f36562f, this.f36560d, this.f36557a, this.f36561e, jVar);
        if (i8 == 0) {
            cVar.g(new b(this.f36557a));
        }
        if (b(i10)) {
            cVar.g(new f(this.f36557a, i9));
        } else {
            cVar.g(new a(this.f36557a, i9, jVar));
        }
        return B.f.nonCancellationPropagating(cVar.j(list, i9));
    }
}
