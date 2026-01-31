package l7;

/* loaded from: classes3.dex */
final class q {
    public static final q INSTANCE = new q();
    public static final n value;

    static {
        String str = "[eE][+-]?(\\p{Digit}+)";
        value = new n("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ("((\\p{Digit}+)(\\.)?((\\p{Digit}+)?)(" + str + ")?)|(\\.((\\p{Digit}+))(" + str + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+))") + ")[pP][+-]?(\\p{Digit}+))") + ")[fFdD]?))[\\x00-\\x20]*");
    }

    private q() {
    }
}
