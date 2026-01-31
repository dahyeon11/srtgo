package P7;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
public final class k implements w {

    /* renamed from: a, reason: collision with root package name */
    private final e f3791a;

    /* renamed from: b, reason: collision with root package name */
    private final Inflater f3792b;

    /* renamed from: c, reason: collision with root package name */
    private int f3793c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3794d;

    public k(w wVar, Inflater inflater) {
        this(n.buffer(wVar), inflater);
    }

    private void a() {
        int i8 = this.f3793c;
        if (i8 == 0) {
            return;
        }
        int remaining = i8 - this.f3792b.getRemaining();
        this.f3793c -= remaining;
        this.f3791a.skip(remaining);
    }

    @Override // P7.w, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3794d) {
            return;
        }
        this.f3792b.end();
        this.f3794d = true;
        this.f3791a.close();
    }

    @Override // P7.w
    public long read(c cVar, long j8) throws DataFormatException, IOException {
        boolean zRefill;
        if (j8 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j8);
        }
        if (this.f3794d) {
            throw new IllegalStateException("closed");
        }
        if (j8 == 0) {
            return 0L;
        }
        do {
            zRefill = refill();
            try {
                s sVarG = cVar.g(1);
                int iInflate = this.f3792b.inflate(sVarG.f3813a, sVarG.f3815c, (int) Math.min(j8, 8192 - sVarG.f3815c));
                if (iInflate > 0) {
                    sVarG.f3815c += iInflate;
                    long j9 = iInflate;
                    cVar.f3775b += j9;
                    return j9;
                }
                if (!this.f3792b.finished() && !this.f3792b.needsDictionary()) {
                }
                a();
                if (sVarG.f3814b != sVarG.f3815c) {
                    return -1L;
                }
                cVar.f3774a = sVarG.pop();
                t.a(sVarG);
                return -1L;
            } catch (DataFormatException e8) {
                throw new IOException(e8);
            }
        } while (!zRefill);
        throw new EOFException("source exhausted prematurely");
    }

    public final boolean refill() {
        if (!this.f3792b.needsInput()) {
            return false;
        }
        a();
        if (this.f3792b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        }
        if (this.f3791a.exhausted()) {
            return true;
        }
        s sVar = this.f3791a.buffer().f3774a;
        int i8 = sVar.f3815c;
        int i9 = sVar.f3814b;
        int i10 = i8 - i9;
        this.f3793c = i10;
        this.f3792b.setInput(sVar.f3813a, i9, i10);
        return false;
    }

    @Override // P7.w
    public x timeout() {
        return this.f3791a.timeout();
    }

    k(e eVar, Inflater inflater) {
        if (eVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (inflater == null) {
            throw new IllegalArgumentException("inflater == null");
        }
        this.f3791a = eVar;
        this.f3792b = inflater;
    }
}
