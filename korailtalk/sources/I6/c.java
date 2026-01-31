package I6;

import e3.w;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
abstract class c implements K6.c {

    /* renamed from: a, reason: collision with root package name */
    private final K6.c f2182a;

    public c(K6.c cVar) {
        this.f2182a = (K6.c) w.checkNotNull(cVar, "delegate");
    }

    @Override // K6.c
    public void ackSettings(K6.i iVar) {
        this.f2182a.ackSettings(iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2182a.close();
    }

    @Override // K6.c
    public void connectionPreface() {
        this.f2182a.connectionPreface();
    }

    @Override // K6.c
    public void data(boolean z8, int i8, P7.c cVar, int i9) {
        this.f2182a.data(z8, i8, cVar, i9);
    }

    @Override // K6.c
    public void flush() {
        this.f2182a.flush();
    }

    @Override // K6.c
    public void goAway(int i8, K6.a aVar, byte[] bArr) {
        this.f2182a.goAway(i8, aVar, bArr);
    }

    @Override // K6.c
    public void headers(int i8, List<K6.d> list) {
        this.f2182a.headers(i8, list);
    }

    @Override // K6.c
    public int maxDataLength() {
        return this.f2182a.maxDataLength();
    }

    @Override // K6.c
    public void ping(boolean z8, int i8, int i9) {
        this.f2182a.ping(z8, i8, i9);
    }

    @Override // K6.c
    public void pushPromise(int i8, int i9, List<K6.d> list) {
        this.f2182a.pushPromise(i8, i9, list);
    }

    @Override // K6.c
    public void rstStream(int i8, K6.a aVar) {
        this.f2182a.rstStream(i8, aVar);
    }

    @Override // K6.c
    public void settings(K6.i iVar) {
        this.f2182a.settings(iVar);
    }

    @Override // K6.c
    public void synReply(boolean z8, int i8, List<K6.d> list) {
        this.f2182a.synReply(z8, i8, list);
    }

    @Override // K6.c
    public void synStream(boolean z8, boolean z9, int i8, int i9, List<K6.d> list) {
        this.f2182a.synStream(z8, z9, i8, i9, list);
    }

    @Override // K6.c
    public void windowUpdate(int i8, long j8) {
        this.f2182a.windowUpdate(i8, j8);
    }
}
