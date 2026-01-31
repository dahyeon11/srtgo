package P7;

/* loaded from: classes3.dex */
final class p implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f3803a;

    /* renamed from: b, reason: collision with root package name */
    private final c f3804b;

    /* renamed from: c, reason: collision with root package name */
    private s f3805c;

    /* renamed from: d, reason: collision with root package name */
    private int f3806d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3807e;

    /* renamed from: f, reason: collision with root package name */
    private long f3808f;

    p(e eVar) {
        this.f3803a = eVar;
        c cVarBuffer = eVar.buffer();
        this.f3804b = cVarBuffer;
        s sVar = cVarBuffer.f3774a;
        this.f3805c = sVar;
        this.f3806d = sVar != null ? sVar.f3814b : -1;
    }

    @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3807e = true;
    }

    @Override // P7.w
    public long read(c cVar, long j8) {
        s sVar;
        s sVar2;
        if (j8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
        if (this.f3807e) {
            throw new IllegalStateException("closed");
        }
        s sVar3 = this.f3805c;
        if (sVar3 != null && (sVar3 != (sVar2 = this.f3804b.f3774a) || this.f3806d != sVar2.f3814b)) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j8 == 0) {
            return 0L;
        }
        if (!this.f3803a.request(this.f3808f + 1)) {
            return -1L;
        }
        if (this.f3805c == null && (sVar = this.f3804b.f3774a) != null) {
            this.f3805c = sVar;
            this.f3806d = sVar.f3814b;
        }
        long jMin = Math.min(j8, this.f3804b.f3775b - this.f3808f);
        this.f3804b.copyTo(cVar, this.f3808f, jMin);
        this.f3808f += jMin;
        return jMin;
    }

    @Override // P7.w
    public x timeout() {
        return this.f3803a.timeout();
    }
}
