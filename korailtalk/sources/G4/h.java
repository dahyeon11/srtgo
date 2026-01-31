package g4;

/* loaded from: classes2.dex */
public enum h {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);


    /* renamed from: a, reason: collision with root package name */
    private final int[] f31347a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31348b;

    h(int[] iArr, int i8) {
        this.f31347a = iArr;
        this.f31348b = i8;
    }

    public static h forBits(int i8) {
        if (i8 == 0) {
            return TERMINATOR;
        }
        if (i8 == 1) {
            return NUMERIC;
        }
        if (i8 == 2) {
            return ALPHANUMERIC;
        }
        if (i8 == 3) {
            return STRUCTURED_APPEND;
        }
        if (i8 == 4) {
            return BYTE;
        }
        if (i8 == 5) {
            return FNC1_FIRST_POSITION;
        }
        if (i8 == 7) {
            return ECI;
        }
        if (i8 == 8) {
            return KANJI;
        }
        if (i8 == 9) {
            return FNC1_SECOND_POSITION;
        }
        if (i8 == 13) {
            return HANZI;
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.f31348b;
    }

    public int getCharacterCountBits(j jVar) {
        int versionNumber = jVar.getVersionNumber();
        return this.f31347a[versionNumber <= 9 ? (char) 0 : versionNumber <= 26 ? (char) 1 : (char) 2];
    }
}
