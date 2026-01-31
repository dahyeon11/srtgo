package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class y {
    public static final x ANYRTL_LTR;
    public static final x FIRSTSTRONG_LTR;
    public static final x FIRSTSTRONG_RTL;
    public static final x LOCALE;
    public static final x LTR = new e(null, false);
    public static final x RTL = new e(null, true);

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f9074b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f9075a;

        private a(boolean z8) {
            this.f9075a = z8;
        }

        @Override // androidx.core.text.y.c
        public int checkRtl(CharSequence charSequence, int i8, int i9) {
            int i10 = i9 + i8;
            boolean z8 = false;
            while (i8 < i10) {
                int iA = y.a(Character.getDirectionality(charSequence.charAt(i8)));
                if (iA != 0) {
                    if (iA != 1) {
                        continue;
                        i8++;
                        z8 = z8;
                    } else if (!this.f9075a) {
                        return 1;
                    }
                } else if (this.f9075a) {
                    return 0;
                }
                z8 = true;
                i8++;
                z8 = z8;
            }
            if (z8) {
                return this.f9075a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f9076a = new b();

        private b() {
        }

        @Override // androidx.core.text.y.c
        public int checkRtl(CharSequence charSequence, int i8, int i9) {
            int i10 = i9 + i8;
            int iB = 2;
            while (i8 < i10 && iB == 2) {
                iB = y.b(Character.getDirectionality(charSequence.charAt(i8)));
                i8++;
            }
            return iB;
        }
    }

    private interface c {
        int checkRtl(CharSequence charSequence, int i8, int i9);
    }

    private static abstract class d implements x {

        /* renamed from: a, reason: collision with root package name */
        private final c f9077a;

        d(c cVar) {
            this.f9077a = cVar;
        }

        private boolean b(CharSequence charSequence, int i8, int i9) {
            int iCheckRtl = this.f9077a.checkRtl(charSequence, i8, i9);
            if (iCheckRtl == 0) {
                return true;
            }
            if (iCheckRtl != 1) {
                return a();
            }
            return false;
        }

        protected abstract boolean a();

        @Override // androidx.core.text.x
        public boolean isRtl(char[] cArr, int i8, int i9) {
            return isRtl(CharBuffer.wrap(cArr), i8, i9);
        }

        @Override // androidx.core.text.x
        public boolean isRtl(CharSequence charSequence, int i8, int i9) {
            if (charSequence == null || i8 < 0 || i9 < 0 || charSequence.length() - i9 < i8) {
                throw new IllegalArgumentException();
            }
            return this.f9077a == null ? a() : b(charSequence, i8, i9);
        }
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f9078b;

        e(c cVar, boolean z8) {
            super(cVar);
            this.f9078b = z8;
        }

        @Override // androidx.core.text.y.d
        protected boolean a() {
            return this.f9078b;
        }
    }

    private static class f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final f f9079b = new f();

        f() {
            super(null);
        }

        @Override // androidx.core.text.y.d
        protected boolean a() {
            return z.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f9076a;
        FIRSTSTRONG_LTR = new e(bVar, false);
        FIRSTSTRONG_RTL = new e(bVar, true);
        ANYRTL_LTR = new e(a.f9074b, false);
        LOCALE = f.f9079b;
    }

    static int a(int i8) {
        if (i8 != 0) {
            return (i8 == 1 || i8 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i8) {
        if (i8 != 0) {
            if (i8 == 1 || i8 == 2) {
                return 0;
            }
            switch (i8) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
