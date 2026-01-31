package l7;

import R6.G;
import f7.InterfaceC5519a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class n implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final Pattern f34040a;

    /* renamed from: b */
    private Set f34041b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(int i8) {
            return (i8 & 2) != 0 ? i8 | 64 : i8;
        }

        public final String escape(String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuote = Pattern.quote(literal);
            Intrinsics.checkNotNullExpressionValue(strQuote, "quote(...)");
            return strQuote;
        }

        public final String escapeReplacement(String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            String strQuoteReplacement = Matcher.quoteReplacement(literal);
            Intrinsics.checkNotNullExpressionValue(strQuoteReplacement, "quoteReplacement(...)");
            return strQuoteReplacement;
        }

        public final n fromLiteral(String literal) {
            Intrinsics.checkNotNullParameter(literal, "literal");
            return new n(literal, p.LITERAL);
        }

        private a() {
        }
    }

    static final class b extends Lambda implements InterfaceC5519a {

        /* renamed from: b */
        final /* synthetic */ CharSequence f34043b;

        /* renamed from: c */
        final /* synthetic */ int f34044c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i8) {
            super(0);
            this.f34043b = charSequence;
            this.f34044c = i8;
        }

        @Override // f7.InterfaceC5519a
        public final l invoke() {
            return n.this.find(this.f34043b, this.f34044c);
        }
    }

    /* synthetic */ class c extends FunctionReferenceImpl implements f7.l {
        public static final c INSTANCE = new c();

        c() {
            super(1, l.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        @Override // f7.l
        public final l invoke(l p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return p02.next();
        }
    }

    static final class d extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ int f34045a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(1);
            this.f34045a = i8;
        }

        @Override // f7.l
        public final Boolean invoke(p pVar) {
            p pVar2 = pVar;
            return Boolean.valueOf((this.f34045a & pVar2.getMask()) == pVar2.getValue());
        }
    }

    static final class e extends Y6.k implements f7.p {

        /* renamed from: c */
        Object f34046c;

        /* renamed from: d */
        int f34047d;

        /* renamed from: e */
        int f34048e;

        /* renamed from: f */
        private /* synthetic */ Object f34049f;

        /* renamed from: h */
        final /* synthetic */ CharSequence f34051h;

        /* renamed from: i */
        final /* synthetic */ int f34052i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(CharSequence charSequence, int i8, W6.d dVar) {
            super(2, dVar);
            this.f34051h = charSequence;
            this.f34052i = i8;
        }

        @Override // Y6.a
        public final W6.d<G> create(Object obj, W6.d<?> dVar) {
            e eVar = n.this.new e(this.f34051h, this.f34052i, dVar);
            eVar.f34049f = obj;
            return eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0070 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x009c A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x006e -> B:56:0x0071). Please report as a decompilation issue!!! */
        @Override // Y6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = X6.b.getCOROUTINE_SUSPENDED()
                int r1 = r9.f34048e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L32
                if (r1 == r4) goto L2d
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                R6.r.throwOnFailure(r10)
                goto L9d
            L16:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1e:
                int r1 = r9.f34047d
                java.lang.Object r5 = r9.f34046c
                java.util.regex.Matcher r5 = (java.util.regex.Matcher) r5
                java.lang.Object r6 = r9.f34049f
                k7.o r6 = (k7.o) r6
                R6.r.throwOnFailure(r10)
                r10 = r5
                goto L71
            L2d:
                R6.r.throwOnFailure(r10)
                goto Laf
            L32:
                R6.r.throwOnFailure(r10)
                java.lang.Object r10 = r9.f34049f
                k7.o r10 = (k7.o) r10
                l7.n r1 = l7.n.this
                java.util.regex.Pattern r1 = l7.n.access$getNativePattern$p(r1)
                java.lang.CharSequence r5 = r9.f34051h
                java.util.regex.Matcher r1 = r1.matcher(r5)
                int r5 = r9.f34052i
                if (r5 == r4) goto La0
                boolean r5 = r1.find()
                if (r5 != 0) goto L50
                goto La0
            L50:
                r5 = 0
                r6 = r10
                r10 = r1
                r1 = r5
            L54:
                java.lang.CharSequence r7 = r9.f34051h
                int r8 = r10.start()
                java.lang.CharSequence r5 = r7.subSequence(r5, r8)
                java.lang.String r5 = r5.toString()
                r9.f34049f = r6
                r9.f34046c = r10
                r9.f34047d = r1
                r9.f34048e = r3
                java.lang.Object r5 = r6.yield(r5, r9)
                if (r5 != r0) goto L71
                return r0
            L71:
                int r5 = r10.end()
                int r1 = r1 + r4
                int r7 = r9.f34052i
                int r7 = r7 - r4
                if (r1 == r7) goto L81
                boolean r7 = r10.find()
                if (r7 != 0) goto L54
            L81:
                java.lang.CharSequence r10 = r9.f34051h
                int r1 = r10.length()
                java.lang.CharSequence r10 = r10.subSequence(r5, r1)
                java.lang.String r10 = r10.toString()
                r1 = 0
                r9.f34049f = r1
                r9.f34046c = r1
                r9.f34048e = r2
                java.lang.Object r10 = r6.yield(r10, r9)
                if (r10 != r0) goto L9d
                return r0
            L9d:
                R6.G r10 = R6.G.INSTANCE
                return r10
            La0:
                java.lang.CharSequence r1 = r9.f34051h
                java.lang.String r1 = r1.toString()
                r9.f34048e = r4
                java.lang.Object r10 = r10.yield(r1, r9)
                if (r10 != r0) goto Laf
                return r0
            Laf:
                R6.G r10 = R6.G.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: l7.n.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // f7.p
        public final Object invoke(k7.o oVar, W6.d<? super G> dVar) {
            return ((e) create(oVar, dVar)).invokeSuspend(G.INSTANCE);
        }
    }

    public n(Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f34040a = nativePattern;
    }

    public static /* synthetic */ l find$default(n nVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return nVar.find(charSequence, i8);
    }

    public static /* synthetic */ k7.m findAll$default(n nVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return nVar.findAll(charSequence, i8);
    }

    public static /* synthetic */ List split$default(n nVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return nVar.split(charSequence, i8);
    }

    public static /* synthetic */ k7.m splitToSequence$default(n nVar, CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return nVar.splitToSequence(charSequence, i8);
    }

    public final boolean containsMatchIn(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f34040a.matcher(input).find();
    }

    public final l find(CharSequence input, int i8) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f34040a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return o.a(matcher, i8, input);
    }

    public final k7.m findAll(CharSequence input, int i8) {
        Intrinsics.checkNotNullParameter(input, "input");
        if (i8 >= 0 && i8 <= input.length()) {
            return k7.p.generateSequence((InterfaceC5519a) new b(input, i8), (f7.l) c.INSTANCE);
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i8 + ", input length: " + input.length());
    }

    public final Set<p> getOptions() {
        Set<p> set = this.f34041b;
        if (set != null) {
            return set;
        }
        int iFlags = this.f34040a.flags();
        EnumSet enumSetAllOf = EnumSet.allOf(p.class);
        Intrinsics.checkNotNull(enumSetAllOf);
        S6.r.retainAll(enumSetAllOf, new d(iFlags));
        Set<p> setUnmodifiableSet = Collections.unmodifiableSet(enumSetAllOf);
        Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        this.f34041b = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    public final String getPattern() {
        String strPattern = this.f34040a.pattern();
        Intrinsics.checkNotNullExpressionValue(strPattern, "pattern(...)");
        return strPattern;
    }

    public final l matchAt(CharSequence input, int i8) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcherRegion = this.f34040a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i8, input.length());
        if (!matcherRegion.lookingAt()) {
            return null;
        }
        Intrinsics.checkNotNull(matcherRegion);
        return new m(matcherRegion, input);
    }

    public final l matchEntire(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f34040a.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return o.b(matcher, input);
    }

    public final boolean matches(CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f34040a.matcher(input).matches();
    }

    public final boolean matchesAt(CharSequence input, int i8) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f34040a.matcher(input).useAnchoringBounds(false).useTransparentBounds(true).region(i8, input.length()).lookingAt();
    }

    public final String replace(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceAll = this.f34040a.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String replaceFirst(CharSequence input, String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String strReplaceFirst = this.f34040a.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(strReplaceFirst, "replaceFirst(...)");
        return strReplaceFirst;
    }

    public final List<String> split(CharSequence input, int i8) {
        Intrinsics.checkNotNullParameter(input, "input");
        B.requireNonNegativeLimit(i8);
        Matcher matcher = this.f34040a.matcher(input);
        if (i8 == 1 || !matcher.find()) {
            return S6.r.listOf(input.toString());
        }
        ArrayList arrayList = new ArrayList(i8 > 0 ? j7.s.coerceAtMost(i8, 10) : 10);
        int i9 = i8 - 1;
        int iEnd = 0;
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i9 >= 0 && arrayList.size() == i9) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final k7.m splitToSequence(CharSequence input, int i8) {
        Intrinsics.checkNotNullParameter(input, "input");
        B.requireNonNegativeLimit(i8);
        return k7.p.sequence(new e(input, i8, null));
    }

    public final Pattern toPattern() {
        return this.f34040a;
    }

    public String toString() {
        String string = this.f34040a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String replace(CharSequence input, f7.l transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int iIntValue = 0;
        l lVarFind$default = find$default(this, input, 0, 2, null);
        if (lVarFind$default == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append(input, iIntValue, lVarFind$default.getRange().getStart().intValue());
            sb.append((CharSequence) transform.invoke(lVarFind$default));
            iIntValue = lVarFind$default.getRange().getEndInclusive().intValue() + 1;
            lVarFind$default = lVarFind$default.next();
            if (iIntValue >= length) {
                break;
            }
        } while (lVarFind$default != null);
        if (iIntValue < length) {
            sb.append(input, iIntValue, length);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String pattern, p option) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(option, "option");
        Pattern patternCompile = Pattern.compile(pattern, Companion.a(option.getValue()));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(String pattern, Set<? extends p> options) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(options, "options");
        Pattern patternCompile = Pattern.compile(pattern, Companion.a(o.e(options)));
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        this(patternCompile);
    }
}
