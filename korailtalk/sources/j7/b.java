package j7;

import S6.AbstractC0775q;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b extends AbstractC0775q {

    /* renamed from: a, reason: collision with root package name */
    private final int f33496a;

    /* renamed from: b, reason: collision with root package name */
    private final int f33497b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33498c;

    /* renamed from: d, reason: collision with root package name */
    private int f33499d;

    public b(char c9, char c10, int i8) {
        this.f33496a = i8;
        this.f33497b = c10;
        boolean z8 = false;
        if (i8 <= 0 ? Intrinsics.compare((int) c9, (int) c10) >= 0 : Intrinsics.compare((int) c9, (int) c10) <= 0) {
            z8 = true;
        }
        this.f33498c = z8;
        this.f33499d = z8 ? c9 : c10;
    }

    public final int getStep() {
        return this.f33496a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f33498c;
    }

    @Override // S6.AbstractC0775q
    public char nextChar() {
        int i8 = this.f33499d;
        if (i8 != this.f33497b) {
            this.f33499d = this.f33496a + i8;
        } else {
            if (!this.f33498c) {
                throw new NoSuchElementException();
            }
            this.f33498c = false;
        }
        return (char) i8;
    }
}
