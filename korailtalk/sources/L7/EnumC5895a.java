package l7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5895a {
    public static final C0347a Companion;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC5895a[] f34009c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f34010d;

    /* renamed from: a, reason: collision with root package name */
    private final int f34011a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34012b;
    public static final EnumC5895a UNASSIGNED = new EnumC5895a("UNASSIGNED", 0, 0, "Cn");
    public static final EnumC5895a UPPERCASE_LETTER = new EnumC5895a("UPPERCASE_LETTER", 1, 1, "Lu");
    public static final EnumC5895a LOWERCASE_LETTER = new EnumC5895a("LOWERCASE_LETTER", 2, 2, "Ll");
    public static final EnumC5895a TITLECASE_LETTER = new EnumC5895a("TITLECASE_LETTER", 3, 3, "Lt");
    public static final EnumC5895a MODIFIER_LETTER = new EnumC5895a("MODIFIER_LETTER", 4, 4, "Lm");
    public static final EnumC5895a OTHER_LETTER = new EnumC5895a("OTHER_LETTER", 5, 5, "Lo");
    public static final EnumC5895a NON_SPACING_MARK = new EnumC5895a("NON_SPACING_MARK", 6, 6, "Mn");
    public static final EnumC5895a ENCLOSING_MARK = new EnumC5895a("ENCLOSING_MARK", 7, 7, "Me");
    public static final EnumC5895a COMBINING_SPACING_MARK = new EnumC5895a("COMBINING_SPACING_MARK", 8, 8, "Mc");
    public static final EnumC5895a DECIMAL_DIGIT_NUMBER = new EnumC5895a("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
    public static final EnumC5895a LETTER_NUMBER = new EnumC5895a("LETTER_NUMBER", 10, 10, "Nl");
    public static final EnumC5895a OTHER_NUMBER = new EnumC5895a("OTHER_NUMBER", 11, 11, "No");
    public static final EnumC5895a SPACE_SEPARATOR = new EnumC5895a("SPACE_SEPARATOR", 12, 12, "Zs");
    public static final EnumC5895a LINE_SEPARATOR = new EnumC5895a("LINE_SEPARATOR", 13, 13, "Zl");
    public static final EnumC5895a PARAGRAPH_SEPARATOR = new EnumC5895a("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
    public static final EnumC5895a CONTROL = new EnumC5895a("CONTROL", 15, 15, "Cc");
    public static final EnumC5895a FORMAT = new EnumC5895a("FORMAT", 16, 16, "Cf");
    public static final EnumC5895a PRIVATE_USE = new EnumC5895a("PRIVATE_USE", 17, 18, "Co");
    public static final EnumC5895a SURROGATE = new EnumC5895a("SURROGATE", 18, 19, "Cs");
    public static final EnumC5895a DASH_PUNCTUATION = new EnumC5895a("DASH_PUNCTUATION", 19, 20, "Pd");
    public static final EnumC5895a START_PUNCTUATION = new EnumC5895a("START_PUNCTUATION", 20, 21, "Ps");
    public static final EnumC5895a END_PUNCTUATION = new EnumC5895a("END_PUNCTUATION", 21, 22, "Pe");
    public static final EnumC5895a CONNECTOR_PUNCTUATION = new EnumC5895a("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
    public static final EnumC5895a OTHER_PUNCTUATION = new EnumC5895a("OTHER_PUNCTUATION", 23, 24, "Po");
    public static final EnumC5895a MATH_SYMBOL = new EnumC5895a("MATH_SYMBOL", 24, 25, "Sm");
    public static final EnumC5895a CURRENCY_SYMBOL = new EnumC5895a("CURRENCY_SYMBOL", 25, 26, "Sc");
    public static final EnumC5895a MODIFIER_SYMBOL = new EnumC5895a("MODIFIER_SYMBOL", 26, 27, "Sk");
    public static final EnumC5895a OTHER_SYMBOL = new EnumC5895a("OTHER_SYMBOL", 27, 28, "So");
    public static final EnumC5895a INITIAL_QUOTE_PUNCTUATION = new EnumC5895a("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
    public static final EnumC5895a FINAL_QUOTE_PUNCTUATION = new EnumC5895a("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");

    /* renamed from: l7.a$a, reason: collision with other inner class name */
    public static final class C0347a {
        public /* synthetic */ C0347a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC5895a valueOf(int i8) {
            if (new j7.l(0, 16).contains(i8)) {
                return (EnumC5895a) EnumC5895a.getEntries().get(i8);
            }
            if (new j7.l(18, 30).contains(i8)) {
                return (EnumC5895a) EnumC5895a.getEntries().get(i8 - 1);
            }
            throw new IllegalArgumentException("Category #" + i8 + " is not defined.");
        }

        private C0347a() {
        }
    }

    static {
        EnumC5895a[] enumC5895aArrA = a();
        f34009c = enumC5895aArrA;
        f34010d = Z6.b.enumEntries(enumC5895aArrA);
        Companion = new C0347a(null);
    }

    private EnumC5895a(String str, int i8, int i9, String str2) {
        this.f34011a = i9;
        this.f34012b = str2;
    }

    private static final /* synthetic */ EnumC5895a[] a() {
        return new EnumC5895a[]{UNASSIGNED, UPPERCASE_LETTER, LOWERCASE_LETTER, TITLECASE_LETTER, MODIFIER_LETTER, OTHER_LETTER, NON_SPACING_MARK, ENCLOSING_MARK, COMBINING_SPACING_MARK, DECIMAL_DIGIT_NUMBER, LETTER_NUMBER, OTHER_NUMBER, SPACE_SEPARATOR, LINE_SEPARATOR, PARAGRAPH_SEPARATOR, CONTROL, FORMAT, PRIVATE_USE, SURROGATE, DASH_PUNCTUATION, START_PUNCTUATION, END_PUNCTUATION, CONNECTOR_PUNCTUATION, OTHER_PUNCTUATION, MATH_SYMBOL, CURRENCY_SYMBOL, MODIFIER_SYMBOL, OTHER_SYMBOL, INITIAL_QUOTE_PUNCTUATION, FINAL_QUOTE_PUNCTUATION};
    }

    public static Z6.a getEntries() {
        return f34010d;
    }

    public static EnumC5895a valueOf(String str) {
        return (EnumC5895a) Enum.valueOf(EnumC5895a.class, str);
    }

    public static EnumC5895a[] values() {
        return (EnumC5895a[]) f34009c.clone();
    }

    public final boolean contains(char c9) {
        return Character.getType(c9) == this.f34011a;
    }

    public final String getCode() {
        return this.f34012b;
    }

    public final int getValue() {
        return this.f34011a;
    }
}
