package f2;

import java.util.Arrays;

/* renamed from: f2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class BinderC5387C extends AbstractBinderC5386B {

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f30526b;

    BinderC5387C(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f30526b = bArr;
    }

    @Override // f2.AbstractBinderC5386B
    final byte[] c() {
        return this.f30526b;
    }
}
