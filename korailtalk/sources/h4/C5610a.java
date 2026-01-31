package h4;

import F3.s;

/* renamed from: h4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5610a extends s {

    /* renamed from: c, reason: collision with root package name */
    private final float f31549c;

    C5610a(float f8, float f9, float f10) {
        super(f8, f9);
        this.f31549c = f10;
    }

    boolean b(float f8, float f9, float f10) {
        if (Math.abs(f9 - getY()) > f8 || Math.abs(f10 - getX()) > f8) {
            return false;
        }
        float fAbs = Math.abs(f8 - this.f31549c);
        return fAbs <= 1.0f || fAbs <= this.f31549c;
    }

    C5610a c(float f8, float f9, float f10) {
        return new C5610a((getX() + f9) / 2.0f, (getY() + f8) / 2.0f, (this.f31549c + f10) / 2.0f);
    }
}
