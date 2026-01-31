package Y7;

/* loaded from: classes3.dex */
public class e extends j {
    public e(int i8, int i9, boolean z8) {
        super(i8, i9, z8);
    }

    public static e above(int i8) {
        return outsideOf(0, i8);
    }

    public static e below(int i8) {
        return outsideOf(i8, Integer.MAX_VALUE);
    }

    public static e between(int i8, int i9) {
        return new e(i8, i9, true);
    }

    public static e outsideOf(int i8, int i9) {
        return new e(i8, i9, false);
    }

    @Override // Y7.j
    protected String a(int i8) {
        char[] chars = Character.toChars(i8);
        return "\\u" + b.hex(chars[0]) + "\\u" + b.hex(chars[1]);
    }
}
