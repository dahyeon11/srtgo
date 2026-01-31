package j7;

import S6.N;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class n extends N {

    /* renamed from: a, reason: collision with root package name */
    private final long f33520a;

    /* renamed from: b, reason: collision with root package name */
    private final long f33521b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33522c;

    /* renamed from: d, reason: collision with root package name */
    private long f33523d;

    public n(long j8, long j9, long j10) {
        this.f33520a = j10;
        this.f33521b = j9;
        boolean z8 = false;
        if (j10 <= 0 ? j8 >= j9 : j8 <= j9) {
            z8 = true;
        }
        this.f33522c = z8;
        this.f33523d = z8 ? j8 : j9;
    }

    public final long getStep() {
        return this.f33520a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33522c;
    }

    @Override // S6.N
    public long nextLong() {
        long j8 = this.f33523d;
        if (j8 != this.f33521b) {
            this.f33523d = this.f33520a + j8;
        } else {
            if (!this.f33522c) {
                throw new NoSuchElementException();
            }
            this.f33522c = false;
        }
        return j8;
    }
}
