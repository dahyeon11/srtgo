package s7;

import R6.C0751e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.F0;
import n7.InterfaceC5973b0;
import n7.InterfaceC5996n;
import n7.V;

/* renamed from: s7.B, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6235B extends F0 implements n7.V {

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f36318b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36319c;

    public /* synthetic */ C6235B(Throwable th, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(th, (i8 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void d() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f36318b
            if (r0 == 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f36319c
            if (r1 == 0) goto L25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L27
        L25:
            java.lang.String r1 = ""
        L27:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f36318b
            r1.<init>(r0, r2)
            throw r1
        L36:
            s7.AbstractC6234A.throwMissingMainDispatcherException()
            R6.e r0 = new R6.e
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.C6235B.d():java.lang.Void");
    }

    @Override // n7.V
    public Object delay(long j8, W6.d<? super R6.G> dVar) {
        return V.a.delay(this, j8, dVar);
    }

    @Override // n7.V
    public InterfaceC5973b0 invokeOnTimeout(long j8, Runnable runnable, W6.g gVar) {
        d();
        throw new C0751e();
    }

    @Override // n7.I
    public boolean isDispatchNeeded(W6.g gVar) {
        d();
        throw new C0751e();
    }

    @Override // n7.F0, n7.I
    public n7.I limitedParallelism(int i8) {
        d();
        throw new C0751e();
    }

    @Override // n7.F0, n7.I
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f36318b != null) {
            str = ", cause=" + this.f36318b;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public C6235B(Throwable th, String str) {
        this.f36318b = th;
        this.f36319c = str;
    }

    @Override // n7.I
    /* renamed from: dispatch, reason: merged with bridge method [inline-methods] */
    public Void mo570dispatch(W6.g gVar, Runnable runnable) {
        d();
        throw new C0751e();
    }

    @Override // n7.V
    /* renamed from: scheduleResumeAfterDelay, reason: merged with bridge method [inline-methods] */
    public Void mo571scheduleResumeAfterDelay(long j8, InterfaceC5996n interfaceC5996n) {
        d();
        throw new C0751e();
    }

    @Override // n7.F0
    public F0 getImmediate() {
        return this;
    }
}
