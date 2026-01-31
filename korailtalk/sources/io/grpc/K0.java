package io.grpc;

/* loaded from: classes.dex */
public class K0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final J0 f31986a;

    /* renamed from: b, reason: collision with root package name */
    private final C5728h0 f31987b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31988c;

    public K0(J0 j02) {
        this(j02, null);
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f31988c ? super.fillInStackTrace() : this;
    }

    public final J0 getStatus() {
        return this.f31986a;
    }

    public final C5728h0 getTrailers() {
        return this.f31987b;
    }

    public K0(J0 j02, C5728h0 c5728h0) {
        this(j02, c5728h0, true);
    }

    K0(J0 j02, C5728h0 c5728h0, boolean z8) {
        super(J0.d(j02), j02.getCause());
        this.f31986a = j02;
        this.f31987b = c5728h0;
        this.f31988c = z8;
        fillInStackTrace();
    }
}
