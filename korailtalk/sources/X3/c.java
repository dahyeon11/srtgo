package X3;

import F3.s;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f5441a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f5442b;

    /* renamed from: c, reason: collision with root package name */
    private final s[] f5443c;

    public c(int i8, int[] iArr, int i9, int i10, int i11) {
        this.f5441a = i8;
        this.f5442b = iArr;
        float f8 = i9;
        float f9 = i11;
        this.f5443c = new s[]{new s(f8, f9), new s(i10, f9)};
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f5441a == ((c) obj).f5441a;
    }

    public s[] getResultPoints() {
        return this.f5443c;
    }

    public int[] getStartEnd() {
        return this.f5442b;
    }

    public int getValue() {
        return this.f5441a;
    }

    public int hashCode() {
        return this.f5441a;
    }
}
