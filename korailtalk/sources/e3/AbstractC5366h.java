package e3;

/* renamed from: e3.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC5366h {
    AbstractC5366h() {
    }

    public static AbstractC5366h compile(String str) {
        return v.a(str);
    }

    public static boolean isPcreLike() {
        return v.f();
    }

    public abstract int flags();

    public abstract AbstractC5365g matcher(CharSequence charSequence);

    public abstract String pattern();

    public abstract String toString();
}
