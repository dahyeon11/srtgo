package e3;

import java.util.Arrays;
import java.util.BitSet;

/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5360e implements e3.x {

    /* renamed from: e3.e$A */
    private static class A extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        private final String f30343a;

        /* renamed from: b, reason: collision with root package name */
        private final char[] f30344b;

        /* renamed from: c, reason: collision with root package name */
        private final char[] f30345c;

        A(String str, char[] cArr, char[] cArr2) {
            this.f30343a = str;
            this.f30344b = cArr;
            this.f30345c = cArr2;
            e3.w.checkArgument(cArr.length == cArr2.length);
            int i8 = 0;
            while (i8 < cArr.length) {
                e3.w.checkArgument(cArr[i8] <= cArr2[i8]);
                int i9 = i8 + 1;
                if (i9 < cArr.length) {
                    e3.w.checkArgument(cArr2[i8] < cArr[i9]);
                }
                i8 = i9;
            }
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            int iBinarySearch = Arrays.binarySearch(this.f30344b, c9);
            if (iBinarySearch >= 0) {
                return true;
            }
            int i8 = (~iBinarySearch) - 1;
            return i8 >= 0 && c9 <= this.f30345c[i8];
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return this.f30343a;
        }
    }

    /* renamed from: e3.e$B */
    private static final class B extends A {

        /* renamed from: d, reason: collision with root package name */
        static final B f30346d = new B();

        private B() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺﷿\ufeffￜ".toCharArray());
        }
    }

    /* renamed from: e3.e$C */
    static final class C extends v {

        /* renamed from: b, reason: collision with root package name */
        static final int f30347b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c, reason: collision with root package name */
        static final C f30348c = new C();

        C() {
            super("CharMatcher.whitespace()");
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            for (int i8 = 0; i8 < 32; i8++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i8));
            }
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return "\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c9) >>> f30347b) == c9;
        }
    }

    /* renamed from: e3.e$a, reason: case insensitive filesystem */
    class C5361a extends x {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30349b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5361a(AbstractC5360e abstractC5360e, AbstractC5360e abstractC5360e2, String str) {
            super(abstractC5360e2);
            this.f30349b = str;
        }

        @Override // e3.AbstractC5360e.w, e3.AbstractC5360e
        public String toString() {
            return this.f30349b;
        }
    }

    /* renamed from: e3.e$b, reason: case insensitive filesystem */
    private static final class C5362b extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5360e f30350a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC5360e f30351b;

        C5362b(AbstractC5360e abstractC5360e, AbstractC5360e abstractC5360e2) {
            this.f30350a = (AbstractC5360e) e3.w.checkNotNull(abstractC5360e);
            this.f30351b = (AbstractC5360e) e3.w.checkNotNull(abstractC5360e2);
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f30350a.g(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f30351b.g(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return this.f30350a.matches(c9) && this.f30351b.matches(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.and(" + this.f30350a + ", " + this.f30351b + ")";
        }
    }

    /* renamed from: e3.e$c, reason: case insensitive filesystem */
    private static final class C5363c extends v {

        /* renamed from: b, reason: collision with root package name */
        static final C5363c f30352b = new C5363c();

        private C5363c() {
            super("CharMatcher.any()");
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e and(AbstractC5360e abstractC5360e) {
            return (AbstractC5360e) e3.w.checkNotNull(abstractC5360e);
        }

        @Override // e3.AbstractC5360e
        public String collapseFrom(CharSequence charSequence, char c9) {
            return charSequence.length() == 0 ? "" : String.valueOf(c9);
        }

        @Override // e3.AbstractC5360e
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // e3.AbstractC5360e
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // e3.AbstractC5360e
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return true;
        }

        @Override // e3.AbstractC5360e
        public boolean matchesAllOf(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return true;
        }

        @Override // e3.AbstractC5360e
        public boolean matchesNoneOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // e3.AbstractC5360e.i, e3.AbstractC5360e
        public AbstractC5360e negate() {
            return AbstractC5360e.none();
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e or(AbstractC5360e abstractC5360e) {
            e3.w.checkNotNull(abstractC5360e);
            return this;
        }

        @Override // e3.AbstractC5360e
        public String removeFrom(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return "";
        }

        @Override // e3.AbstractC5360e
        public String replaceFrom(CharSequence charSequence, char c9) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c9);
            return new String(cArr);
        }

        @Override // e3.AbstractC5360e
        public String trimFrom(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return "";
        }

        @Override // e3.AbstractC5360e
        public int indexIn(CharSequence charSequence, int i8) {
            int length = charSequence.length();
            e3.w.checkPositionIndex(i8, length);
            if (i8 == length) {
                return -1;
            }
            return i8;
        }

        @Override // e3.AbstractC5360e
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i8 = 0; i8 < charSequence.length(); i8++) {
                sb.append(charSequence2);
            }
            return sb.toString();
        }
    }

    /* renamed from: e3.e$d */
    private static final class d extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        private final char[] f30353a;

        public d(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f30353a = charArray;
            Arrays.sort(charArray);
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            for (char c9 : this.f30353a) {
                bitSet.set(c9);
            }
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return Arrays.binarySearch(this.f30353a, c9) >= 0;
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c9 : this.f30353a) {
                sb.append(AbstractC5360e.h(c9));
            }
            sb.append("\")");
            return sb.toString();
        }
    }

    /* renamed from: e3.e$e, reason: collision with other inner class name */
    private static final class C0278e extends v {

        /* renamed from: b, reason: collision with root package name */
        static final C0278e f30354b = new C0278e();

        C0278e() {
            super("CharMatcher.ascii()");
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return c9 <= 127;
        }
    }

    /* renamed from: e3.e$f */
    private static final class f extends v {

        /* renamed from: b, reason: collision with root package name */
        private final BitSet f30355b;

        /* synthetic */ f(BitSet bitSet, String str, C5361a c5361a) {
            this(bitSet, str);
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            bitSet.or(this.f30355b);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return this.f30355b.get(c9);
        }

        private f(BitSet bitSet, String str) {
            super(str);
            this.f30355b = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* renamed from: e3.e$g */
    private static final class g extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        static final AbstractC5360e f30356a = new g();

        private g() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            if (c9 != ' ' && c9 != 133 && c9 != 5760) {
                if (c9 == 8199) {
                    return false;
                }
                if (c9 != 8287 && c9 != 12288 && c9 != 8232 && c9 != 8233) {
                    switch (c9) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c9 < 8192 || c9 > 8202) {
                                break;
                            }
                            break;
                    }
                    return false;
                }
            }
            return true;
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* renamed from: e3.e$h */
    private static final class h extends A {

        /* renamed from: d, reason: collision with root package name */
        static final h f30357d = new h();

        private h() {
            super("CharMatcher.digit()", j(), i());
        }

        private static char[] i() {
            char[] cArr = new char[37];
            for (int i8 = 0; i8 < 37; i8++) {
                cArr[i8] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".charAt(i8) + '\t');
            }
            return cArr;
        }

        private static char[] j() {
            return "0٠۰߀०০੦૦୦௦౦೦൦෦๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐꧰꩐꯰０".toCharArray();
        }
    }

    /* renamed from: e3.e$j */
    private static final class j extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        private final e3.x f30358a;

        j(e3.x xVar) {
            this.f30358a = (e3.x) e3.w.checkNotNull(xVar);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return this.f30358a.apply(Character.valueOf(c9));
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f30358a + ")";
        }

        @Override // e3.AbstractC5360e, e3.x
        public boolean apply(Character ch) {
            return this.f30358a.apply(e3.w.checkNotNull(ch));
        }
    }

    /* renamed from: e3.e$k */
    private static final class k extends i {

        /* renamed from: a, reason: collision with root package name */
        private final char f30359a;

        /* renamed from: b, reason: collision with root package name */
        private final char f30360b;

        k(char c9, char c10) {
            e3.w.checkArgument(c10 >= c9);
            this.f30359a = c9;
            this.f30360b = c10;
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            bitSet.set(this.f30359a, this.f30360b + 1);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return this.f30359a <= c9 && c9 <= this.f30360b;
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.inRange('" + AbstractC5360e.h(this.f30359a) + "', '" + AbstractC5360e.h(this.f30360b) + "')";
        }
    }

    /* renamed from: e3.e$l */
    private static final class l extends A {

        /* renamed from: d, reason: collision with root package name */
        static final l f30361d = new l();

        private l() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* renamed from: e3.e$m */
    private static final class m extends i {

        /* renamed from: a, reason: collision with root package name */
        private final char f30362a;

        m(char c9) {
            this.f30362a = c9;
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e and(AbstractC5360e abstractC5360e) {
            return abstractC5360e.matches(this.f30362a) ? this : AbstractC5360e.none();
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            bitSet.set(this.f30362a);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return c9 == this.f30362a;
        }

        @Override // e3.AbstractC5360e.i, e3.AbstractC5360e
        public AbstractC5360e negate() {
            return AbstractC5360e.isNot(this.f30362a);
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e or(AbstractC5360e abstractC5360e) {
            return abstractC5360e.matches(this.f30362a) ? abstractC5360e : super.or(abstractC5360e);
        }

        @Override // e3.AbstractC5360e
        public String replaceFrom(CharSequence charSequence, char c9) {
            return charSequence.toString().replace(this.f30362a, c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.is('" + AbstractC5360e.h(this.f30362a) + "')";
        }
    }

    /* renamed from: e3.e$n */
    private static final class n extends i {

        /* renamed from: a, reason: collision with root package name */
        private final char f30363a;

        /* renamed from: b, reason: collision with root package name */
        private final char f30364b;

        n(char c9, char c10) {
            this.f30363a = c9;
            this.f30364b = c10;
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            bitSet.set(this.f30363a);
            bitSet.set(this.f30364b);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return c9 == this.f30363a || c9 == this.f30364b;
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.anyOf(\"" + AbstractC5360e.h(this.f30363a) + AbstractC5360e.h(this.f30364b) + "\")";
        }
    }

    /* renamed from: e3.e$o */
    private static final class o extends i {

        /* renamed from: a, reason: collision with root package name */
        private final char f30365a;

        o(char c9) {
            this.f30365a = c9;
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e and(AbstractC5360e abstractC5360e) {
            return abstractC5360e.matches(this.f30365a) ? super.and(abstractC5360e) : abstractC5360e;
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            bitSet.set(0, this.f30365a);
            bitSet.set(this.f30365a + 1, 65536);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return c9 != this.f30365a;
        }

        @Override // e3.AbstractC5360e.i, e3.AbstractC5360e
        public AbstractC5360e negate() {
            return AbstractC5360e.is(this.f30365a);
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e or(AbstractC5360e abstractC5360e) {
            return abstractC5360e.matches(this.f30365a) ? AbstractC5360e.any() : this;
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.isNot('" + AbstractC5360e.h(this.f30365a) + "')";
        }
    }

    /* renamed from: e3.e$p */
    private static final class p extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        static final p f30366a = new p();

        private p() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return Character.isDigit(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* renamed from: e3.e$q */
    private static final class q extends v {

        /* renamed from: b, reason: collision with root package name */
        static final q f30367b = new q();

        private q() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return c9 <= 31 || (c9 >= 127 && c9 <= 159);
        }
    }

    /* renamed from: e3.e$r */
    private static final class r extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        static final r f30368a = new r();

        private r() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return Character.isLetter(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* renamed from: e3.e$s */
    private static final class s extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        static final s f30369a = new s();

        private s() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return Character.isLetterOrDigit(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* renamed from: e3.e$t */
    private static final class t extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        static final t f30370a = new t();

        private t() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return Character.isLowerCase(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* renamed from: e3.e$u */
    private static final class u extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        static final u f30371a = new u();

        private u() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return Character.isUpperCase(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* renamed from: e3.e$v */
    static abstract class v extends i {

        /* renamed from: a, reason: collision with root package name */
        private final String f30372a;

        v(String str) {
            this.f30372a = (String) e3.w.checkNotNull(str);
        }

        @Override // e3.AbstractC5360e
        public final String toString() {
            return this.f30372a;
        }
    }

    /* renamed from: e3.e$w */
    private static class w extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5360e f30373a;

        w(AbstractC5360e abstractC5360e) {
            this.f30373a = (AbstractC5360e) e3.w.checkNotNull(abstractC5360e);
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f30373a.countIn(charSequence);
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f30373a.g(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return !this.f30373a.matches(c9);
        }

        @Override // e3.AbstractC5360e
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f30373a.matchesNoneOf(charSequence);
        }

        @Override // e3.AbstractC5360e
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f30373a.matchesAllOf(charSequence);
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e negate() {
            return this.f30373a;
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return this.f30373a + ".negate()";
        }
    }

    /* renamed from: e3.e$y */
    private static final class y extends v {

        /* renamed from: b, reason: collision with root package name */
        static final y f30374b = new y();

        private y() {
            super("CharMatcher.none()");
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e and(AbstractC5360e abstractC5360e) {
            e3.w.checkNotNull(abstractC5360e);
            return this;
        }

        @Override // e3.AbstractC5360e
        public String collapseFrom(CharSequence charSequence, char c9) {
            return charSequence.toString();
        }

        @Override // e3.AbstractC5360e
        public int countIn(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return 0;
        }

        @Override // e3.AbstractC5360e
        public int indexIn(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return -1;
        }

        @Override // e3.AbstractC5360e
        public int lastIndexIn(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return -1;
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return false;
        }

        @Override // e3.AbstractC5360e
        public boolean matchesAllOf(CharSequence charSequence) {
            return charSequence.length() == 0;
        }

        @Override // e3.AbstractC5360e
        public boolean matchesNoneOf(CharSequence charSequence) {
            e3.w.checkNotNull(charSequence);
            return true;
        }

        @Override // e3.AbstractC5360e.i, e3.AbstractC5360e
        public AbstractC5360e negate() {
            return AbstractC5360e.any();
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e or(AbstractC5360e abstractC5360e) {
            return (AbstractC5360e) e3.w.checkNotNull(abstractC5360e);
        }

        @Override // e3.AbstractC5360e
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // e3.AbstractC5360e
        public String replaceFrom(CharSequence charSequence, char c9) {
            return charSequence.toString();
        }

        @Override // e3.AbstractC5360e
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // e3.AbstractC5360e
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // e3.AbstractC5360e
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // e3.AbstractC5360e
        public int indexIn(CharSequence charSequence, int i8) {
            e3.w.checkPositionIndex(i8, charSequence.length());
            return -1;
        }

        @Override // e3.AbstractC5360e
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            e3.w.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* renamed from: e3.e$z */
    private static final class z extends AbstractC5360e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5360e f30375a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC5360e f30376b;

        z(AbstractC5360e abstractC5360e, AbstractC5360e abstractC5360e2) {
            this.f30375a = (AbstractC5360e) e3.w.checkNotNull(abstractC5360e);
            this.f30376b = (AbstractC5360e) e3.w.checkNotNull(abstractC5360e2);
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        void g(BitSet bitSet) {
            this.f30375a.g(bitSet);
            this.f30376b.g(bitSet);
        }

        @Override // e3.AbstractC5360e
        public boolean matches(char c9) {
            return this.f30375a.matches(c9) || this.f30376b.matches(c9);
        }

        @Override // e3.AbstractC5360e
        public String toString() {
            return "CharMatcher.or(" + this.f30375a + ", " + this.f30376b + ")";
        }
    }

    protected AbstractC5360e() {
    }

    public static AbstractC5360e any() {
        return C5363c.f30352b;
    }

    public static AbstractC5360e anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new d(charSequence) : c(charSequence.charAt(0), charSequence.charAt(1)) : is(charSequence.charAt(0)) : none();
    }

    public static AbstractC5360e ascii() {
        return C0278e.f30354b;
    }

    private String b(CharSequence charSequence, int i8, int i9, char c9, StringBuilder sb, boolean z8) {
        while (i8 < i9) {
            char cCharAt = charSequence.charAt(i8);
            if (!matches(cCharAt)) {
                sb.append(cCharAt);
                z8 = false;
            } else if (!z8) {
                sb.append(c9);
                z8 = true;
            }
            i8++;
        }
        return sb.toString();
    }

    public static AbstractC5360e breakingWhitespace() {
        return g.f30356a;
    }

    private static n c(char c9, char c10) {
        return new n(c9, c10);
    }

    private static boolean d(int i8, int i9) {
        return i8 <= 1023 && i9 > i8 * 64;
    }

    @Deprecated
    public static AbstractC5360e digit() {
        return h.f30357d;
    }

    private static AbstractC5360e f(int i8, BitSet bitSet, String str) {
        if (i8 == 0) {
            return none();
        }
        if (i8 == 1) {
            return is((char) bitSet.nextSetBit(0));
        }
        if (i8 != 2) {
            return d(i8, bitSet.length()) ? C5351A.k(bitSet, str) : new f(bitSet, str, null);
        }
        char cNextSetBit = (char) bitSet.nextSetBit(0);
        return c(cNextSetBit, (char) bitSet.nextSetBit(cNextSetBit + 1));
    }

    public static AbstractC5360e forPredicate(e3.x xVar) {
        return xVar instanceof AbstractC5360e ? (AbstractC5360e) xVar : new j(xVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String h(char c9) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i8 = 0; i8 < 4; i8++) {
            cArr[5 - i8] = "0123456789ABCDEF".charAt(c9 & 15);
            c9 = (char) (c9 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static AbstractC5360e inRange(char c9, char c10) {
        return new k(c9, c10);
    }

    @Deprecated
    public static AbstractC5360e invisible() {
        return l.f30361d;
    }

    public static AbstractC5360e is(char c9) {
        return new m(c9);
    }

    public static AbstractC5360e isNot(char c9) {
        return new o(c9);
    }

    @Deprecated
    public static AbstractC5360e javaDigit() {
        return p.f30366a;
    }

    public static AbstractC5360e javaIsoControl() {
        return q.f30367b;
    }

    @Deprecated
    public static AbstractC5360e javaLetter() {
        return r.f30368a;
    }

    @Deprecated
    public static AbstractC5360e javaLetterOrDigit() {
        return s.f30369a;
    }

    @Deprecated
    public static AbstractC5360e javaLowerCase() {
        return t.f30370a;
    }

    @Deprecated
    public static AbstractC5360e javaUpperCase() {
        return u.f30371a;
    }

    public static AbstractC5360e none() {
        return y.f30374b;
    }

    public static AbstractC5360e noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static AbstractC5360e singleWidth() {
        return B.f30346d;
    }

    public static AbstractC5360e whitespace() {
        return C.f30348c;
    }

    public AbstractC5360e and(AbstractC5360e abstractC5360e) {
        return new C5362b(this, abstractC5360e);
    }

    public String collapseFrom(CharSequence charSequence, char c9) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length) {
            char cCharAt = charSequence.charAt(i8);
            if (matches(cCharAt)) {
                if (cCharAt != c9 || (i8 != length - 1 && matches(charSequence.charAt(i8 + 1)))) {
                    StringBuilder sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i8);
                    sb.append(c9);
                    return b(charSequence, i8 + 1, length, c9, sb, true);
                }
                i8++;
            }
            i8++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i8 = 0;
        for (int i9 = 0; i9 < charSequence.length(); i9++) {
            if (matches(charSequence.charAt(i9))) {
                i8++;
            }
        }
        return i8;
    }

    AbstractC5360e e() {
        String strSubstring;
        BitSet bitSet = new BitSet();
        g(bitSet);
        int iCardinality = bitSet.cardinality();
        if (iCardinality * 2 <= 65536) {
            return f(iCardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i8 = 65536 - iCardinality;
        String string = toString();
        if (string.endsWith(".negate()")) {
            strSubstring = string.substring(0, string.length() - 9);
        } else {
            strSubstring = string + ".negate()";
        }
        return new C5361a(this, f(i8, bitSet, strSubstring), string);
    }

    void g(BitSet bitSet) {
        for (int i8 = 65535; i8 >= 0; i8--) {
            if (matches((char) i8)) {
                bitSet.set(i8);
            }
        }
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c9);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        return indexIn(charSequence) == -1;
    }

    public AbstractC5360e negate() {
        return new w(this);
    }

    public AbstractC5360e or(AbstractC5360e abstractC5360e) {
        return new z(this, abstractC5360e);
    }

    public AbstractC5360e precomputed() {
        return e3.v.g(this);
    }

    public String removeFrom(CharSequence charSequence) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        int i8 = 1;
        while (true) {
            iIndexIn++;
            while (iIndexIn != charArray.length) {
                if (matches(charArray[iIndexIn])) {
                    break;
                }
                charArray[iIndexIn - i8] = charArray[iIndexIn];
                iIndexIn++;
            }
            return new String(charArray, 0, iIndexIn - i8);
            i8++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c9) {
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        char[] charArray = string.toCharArray();
        charArray[iIndexIn] = c9;
        while (true) {
            iIndexIn++;
            if (iIndexIn >= charArray.length) {
                return new String(charArray);
            }
            if (matches(charArray[iIndexIn])) {
                charArray[iIndexIn] = c9;
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c9) {
        int length = charSequence.length();
        int i8 = length - 1;
        int i9 = 0;
        while (i9 < length && matches(charSequence.charAt(i9))) {
            i9++;
        }
        int i10 = i8;
        while (i10 > i9 && matches(charSequence.charAt(i10))) {
            i10--;
        }
        if (i9 == 0 && i10 == i8) {
            return collapseFrom(charSequence, c9);
        }
        int i11 = i10 + 1;
        return b(charSequence, i9, i11, c9, new StringBuilder(i11 - i9), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        while (i8 < length && matches(charSequence.charAt(i8))) {
            i8++;
        }
        int i9 = length - 1;
        while (i9 > i8 && matches(charSequence.charAt(i9))) {
            i9--;
        }
        return charSequence.subSequence(i8, i9 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i8 = 0; i8 < length; i8++) {
            if (!matches(charSequence.charAt(i8))) {
                return charSequence.subSequence(i8, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // e3.x
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        e3.w.checkPositionIndex(i8, length);
        while (i8 < length) {
            if (matches(charSequence.charAt(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i8 = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String string = charSequence.toString();
        int iIndexIn = indexIn(string);
        if (iIndexIn == -1) {
            return string;
        }
        int length2 = string.length();
        StringBuilder sb = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb.append((CharSequence) string, i8, iIndexIn);
            sb.append(charSequence2);
            i8 = iIndexIn + 1;
            iIndexIn = indexIn(string, i8);
        } while (iIndexIn != -1);
        sb.append((CharSequence) string, i8, length2);
        return sb.toString();
    }

    /* renamed from: e3.e$i */
    static abstract class i extends AbstractC5360e {
        i() {
        }

        @Override // e3.AbstractC5360e, e3.x
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Object obj) {
            return super.apply((Character) obj);
        }

        @Override // e3.AbstractC5360e
        public AbstractC5360e negate() {
            return new x(this);
        }

        @Override // e3.AbstractC5360e
        public final AbstractC5360e precomputed() {
            return this;
        }
    }

    /* renamed from: e3.e$x */
    static class x extends w {
        x(AbstractC5360e abstractC5360e) {
            super(abstractC5360e);
        }

        @Override // e3.AbstractC5360e
        public final AbstractC5360e precomputed() {
            return this;
        }
    }
}
