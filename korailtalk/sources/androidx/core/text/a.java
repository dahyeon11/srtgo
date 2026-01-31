package androidx.core.text;

import android.text.SpannableStringBuilder;
import e3.AbstractC5358c;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    static final x f9040d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f9041e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f9042f;

    /* renamed from: g, reason: collision with root package name */
    static final a f9043g;

    /* renamed from: h, reason: collision with root package name */
    static final a f9044h;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9045a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9046b;

    /* renamed from: c, reason: collision with root package name */
    private final x f9047c;

    private static class b {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f9051f = new byte[1792];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f9052a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9053b;

        /* renamed from: c, reason: collision with root package name */
        private final int f9054c;

        /* renamed from: d, reason: collision with root package name */
        private int f9055d;

        /* renamed from: e, reason: collision with root package name */
        private char f9056e;

        static {
            for (int i8 = 0; i8 < 1792; i8++) {
                f9051f[i8] = Character.getDirectionality(i8);
            }
        }

        b(CharSequence charSequence, boolean z8) {
            this.f9052a = charSequence;
            this.f9053b = z8;
            this.f9054c = charSequence.length();
        }

        private static byte c(char c9) {
            return c9 < 1792 ? f9051f[c9] : Character.getDirectionality(c9);
        }

        private byte f() {
            char cCharAt;
            int i8 = this.f9055d;
            do {
                int i9 = this.f9055d;
                if (i9 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9052a;
                int i10 = i9 - 1;
                this.f9055d = i10;
                cCharAt = charSequence.charAt(i10);
                this.f9056e = cCharAt;
                if (cCharAt == '&') {
                    return AbstractC5358c.FF;
                }
            } while (cCharAt != ';');
            this.f9055d = i8;
            this.f9056e = ';';
            return AbstractC5358c.CR;
        }

        private byte g() {
            char cCharAt;
            do {
                int i8 = this.f9055d;
                if (i8 >= this.f9054c) {
                    return AbstractC5358c.FF;
                }
                CharSequence charSequence = this.f9052a;
                this.f9055d = i8 + 1;
                cCharAt = charSequence.charAt(i8);
                this.f9056e = cCharAt;
            } while (cCharAt != ';');
            return AbstractC5358c.FF;
        }

        private byte h() {
            char cCharAt;
            int i8 = this.f9055d;
            while (true) {
                int i9 = this.f9055d;
                if (i9 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f9052a;
                int i10 = i9 - 1;
                this.f9055d = i10;
                char cCharAt2 = charSequence.charAt(i10);
                this.f9056e = cCharAt2;
                if (cCharAt2 == '<') {
                    return AbstractC5358c.FF;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i11 = this.f9055d;
                        if (i11 > 0) {
                            CharSequence charSequence2 = this.f9052a;
                            int i12 = i11 - 1;
                            this.f9055d = i12;
                            cCharAt = charSequence2.charAt(i12);
                            this.f9056e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f9055d = i8;
            this.f9056e = '>';
            return AbstractC5358c.CR;
        }

        private byte i() {
            char cCharAt;
            int i8 = this.f9055d;
            while (true) {
                int i9 = this.f9055d;
                if (i9 >= this.f9054c) {
                    this.f9055d = i8;
                    this.f9056e = '<';
                    return AbstractC5358c.CR;
                }
                CharSequence charSequence = this.f9052a;
                this.f9055d = i9 + 1;
                char cCharAt2 = charSequence.charAt(i9);
                this.f9056e = cCharAt2;
                if (cCharAt2 == '>') {
                    return AbstractC5358c.FF;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i10 = this.f9055d;
                        if (i10 < this.f9054c) {
                            CharSequence charSequence2 = this.f9052a;
                            this.f9055d = i10 + 1;
                            cCharAt = charSequence2.charAt(i10);
                            this.f9056e = cCharAt;
                        }
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f9052a.charAt(this.f9055d - 1);
            this.f9056e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f9052a, this.f9055d);
                this.f9055d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f9055d--;
            byte bC = c(this.f9056e);
            if (!this.f9053b) {
                return bC;
            }
            char c9 = this.f9056e;
            return c9 == '>' ? h() : c9 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f9052a.charAt(this.f9055d);
            this.f9056e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f9052a, this.f9055d);
                this.f9055d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f9055d++;
            byte bC = c(this.f9056e);
            if (!this.f9053b) {
                return bC;
            }
            char c9 = this.f9056e;
            return c9 == '<' ? i() : c9 == '&' ? g() : bC;
        }

        int d() {
            this.f9055d = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            while (this.f9055d < this.f9054c && i8 == 0) {
                byte b9 = b();
                if (b9 != 0) {
                    if (b9 == 1 || b9 == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                    } else if (b9 != 9) {
                        switch (b9) {
                            case 14:
                            case 15:
                                i10++;
                                i9 = -1;
                                continue;
                            case 16:
                            case 17:
                                i10++;
                                i9 = 1;
                                continue;
                            case 18:
                                i10--;
                                i9 = 0;
                                continue;
                        }
                    }
                } else if (i10 == 0) {
                    return -1;
                }
                i8 = i10;
            }
            if (i8 == 0) {
                return 0;
            }
            if (i9 != 0) {
                return i9;
            }
            while (this.f9055d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i8 == i10) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i8 == i10) {
                            return 1;
                        }
                        break;
                    case 18:
                        i10++;
                        continue;
                }
                i10--;
            }
            return 0;
        }

        int e() {
            this.f9055d = this.f9054c;
            int i8 = 0;
            while (true) {
                int i9 = i8;
                while (this.f9055d > 0) {
                    byte bA = a();
                    if (bA != 0) {
                        if (bA == 1 || bA == 2) {
                            if (i8 == 0) {
                                return 1;
                            }
                            if (i9 == 0) {
                                break;
                            }
                        } else if (bA != 9) {
                            switch (bA) {
                                case 14:
                                case 15:
                                    if (i9 == i8) {
                                        return -1;
                                    }
                                    i8--;
                                    break;
                                case 16:
                                case 17:
                                    if (i9 == i8) {
                                        return 1;
                                    }
                                    i8--;
                                    break;
                                case 18:
                                    i8++;
                                    break;
                                default:
                                    if (i9 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i8 == 0) {
                            return -1;
                        }
                        if (i9 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        x xVar = y.FIRSTSTRONG_LTR;
        f9040d = xVar;
        f9041e = Character.toString((char) 8206);
        f9042f = Character.toString((char) 8207);
        f9043g = new a(false, 2, xVar);
        f9044h = new a(true, 2, xVar);
    }

    a(boolean z8, int i8, x xVar) {
        this.f9045a = z8;
        this.f9046b = i8;
        this.f9047c = xVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    static boolean c(Locale locale) {
        return z.getLayoutDirectionFromLocale(locale) == 1;
    }

    private String d(CharSequence charSequence, x xVar) {
        boolean zIsRtl = xVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f9045a || !(zIsRtl || b(charSequence) == 1)) ? this.f9045a ? (!zIsRtl || b(charSequence) == -1) ? f9042f : "" : "" : f9041e;
    }

    private String e(CharSequence charSequence, x xVar) {
        boolean zIsRtl = xVar.isRtl(charSequence, 0, charSequence.length());
        return (this.f9045a || !(zIsRtl || a(charSequence) == 1)) ? this.f9045a ? (!zIsRtl || a(charSequence) == -1) ? f9042f : "" : "" : f9041e;
    }

    public static a getInstance() {
        return new C0139a().build();
    }

    public boolean getStereoReset() {
        return (this.f9046b & 2) != 0;
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtlContext() {
        return this.f9045a;
    }

    public String unicodeWrap(String str, x xVar, boolean z8) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, xVar, z8).toString();
    }

    /* renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    public static final class C0139a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f9048a;

        /* renamed from: b, reason: collision with root package name */
        private int f9049b;

        /* renamed from: c, reason: collision with root package name */
        private x f9050c;

        public C0139a() {
            b(a.c(Locale.getDefault()));
        }

        private static a a(boolean z8) {
            return z8 ? a.f9044h : a.f9043g;
        }

        private void b(boolean z8) {
            this.f9048a = z8;
            this.f9050c = a.f9040d;
            this.f9049b = 2;
        }

        public a build() {
            return (this.f9049b == 2 && this.f9050c == a.f9040d) ? a(this.f9048a) : new a(this.f9048a, this.f9049b, this.f9050c);
        }

        public C0139a setTextDirectionHeuristic(x xVar) {
            this.f9050c = xVar;
            return this;
        }

        public C0139a stereoReset(boolean z8) {
            if (z8) {
                this.f9049b |= 2;
            } else {
                this.f9049b &= -3;
            }
            return this;
        }

        public C0139a(boolean z8) {
            b(z8);
        }

        public C0139a(Locale locale) {
            b(a.c(locale));
        }
    }

    public static a getInstance(boolean z8) {
        return new C0139a(z8).build();
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.f9047c.isRtl(charSequence, 0, charSequence.length());
    }

    public CharSequence unicodeWrap(CharSequence charSequence, x xVar, boolean z8) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = xVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z8) {
            spannableStringBuilder.append((CharSequence) e(charSequence, zIsRtl ? y.RTL : y.LTR));
        }
        if (zIsRtl != this.f9045a) {
            spannableStringBuilder.append(zIsRtl ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z8) {
            spannableStringBuilder.append((CharSequence) d(charSequence, zIsRtl ? y.RTL : y.LTR));
        }
        return spannableStringBuilder;
    }

    public static a getInstance(Locale locale) {
        return new C0139a(locale).build();
    }

    public String unicodeWrap(String str, x xVar) {
        return unicodeWrap(str, xVar, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, x xVar) {
        return unicodeWrap(charSequence, xVar, true);
    }

    public String unicodeWrap(String str, boolean z8) {
        return unicodeWrap(str, this.f9047c, z8);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z8) {
        return unicodeWrap(charSequence, this.f9047c, z8);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.f9047c, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.f9047c, true);
    }
}
