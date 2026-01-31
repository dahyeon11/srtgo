package j7;

import S6.M;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class k extends M {

    /* renamed from: a, reason: collision with root package name */
    private final int f33512a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33513b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33514c;

    /* renamed from: d, reason: collision with root package name */
    private int f33515d;

    public k(int i8, int i9, int i10) {
        this.f33512a = i10;
        this.f33513b = i9;
        boolean z8 = false;
        if (i10 <= 0 ? i8 >= i9 : i8 <= i9) {
            z8 = true;
        }
        this.f33514c = z8;
        this.f33515d = z8 ? i8 : i9;
    }

    public final int getStep() {
        return this.f33512a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33514c;
    }

    @Override // S6.M
    public int nextInt() {
        int i8 = this.f33515d;
        if (i8 != this.f33513b) {
            this.f33515d = this.f33512a + i8;
        } else {
            if (!this.f33514c) {
                throw new NoSuchElementException();
            }
            this.f33514c = false;
        }
        return i8;
    }
}
