package j3;

/* renamed from: j3.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5823e {

    /* renamed from: a, reason: collision with root package name */
    final String f33426a;

    /* renamed from: b, reason: collision with root package name */
    final int f33427b;

    private C5823e(String str, int i8) {
        this.f33426a = str;
        this.f33427b = i8;
    }

    static C5823e a(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = str.charAt(0);
        int i8 = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (cCharAt == '#') {
            str = str.substring(1);
        } else if (cCharAt != '0' || str.length() <= 1) {
            i8 = 10;
        } else {
            str = str.substring(1);
            i8 = 8;
        }
        return new C5823e(str, i8);
    }
}
