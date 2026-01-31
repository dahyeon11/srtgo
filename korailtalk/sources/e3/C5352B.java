package e3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: e3.B */
/* loaded from: classes2.dex */
public final class C5352B {

    /* renamed from: a */
    private final AbstractC5360e f30302a;

    /* renamed from: b */
    private final boolean f30303b;

    /* renamed from: c */
    private final h f30304c;

    /* renamed from: d */
    private final int f30305d;

    /* renamed from: e3.B$a */
    class a implements h {

        /* renamed from: a */
        final /* synthetic */ AbstractC5360e f30306a;

        /* renamed from: e3.B$a$a */
        class C0275a extends g {
            C0275a(C5352B c5352b, CharSequence charSequence) {
                super(c5352b, charSequence);
            }

            @Override // e3.C5352B.g
            int separatorEnd(int i8) {
                return i8 + 1;
            }

            @Override // e3.C5352B.g
            int separatorStart(int i8) {
                return a.this.f30306a.indexIn(this.f30318c, i8);
            }
        }

        a(AbstractC5360e abstractC5360e) {
            this.f30306a = abstractC5360e;
        }

        @Override // e3.C5352B.h
        public g iterator(C5352B c5352b, CharSequence charSequence) {
            return new C0275a(c5352b, charSequence);
        }
    }

    /* renamed from: e3.B$b */
    class b implements h {

        /* renamed from: a */
        final /* synthetic */ String f30308a;

        /* renamed from: e3.B$b$a */
        class a extends g {
            a(C5352B c5352b, CharSequence charSequence) {
                super(c5352b, charSequence);
            }

            @Override // e3.C5352B.g
            public int separatorEnd(int i8) {
                return i8 + b.this.f30308a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
            
                r6 = r6 + 1;
             */
            @Override // e3.C5352B.g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int separatorStart(int r6) {
                /*
                    r5 = this;
                    e3.B$b r0 = e3.C5352B.b.this
                    java.lang.String r0 = r0.f30308a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f30318c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f30318c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    e3.B$b r4 = e3.C5352B.b.this
                    java.lang.String r4 = r4.f30308a
                    char r4 = r4.charAt(r2)
                    if (r3 == r4) goto L29
                    int r6 = r6 + 1
                    goto Lf
                L29:
                    int r2 = r2 + 1
                    goto L12
                L2c:
                    return r6
                L2d:
                    r6 = -1
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: e3.C5352B.b.a.separatorStart(int):int");
            }
        }

        b(String str) {
            this.f30308a = str;
        }

        @Override // e3.C5352B.h
        public g iterator(C5352B c5352b, CharSequence charSequence) {
            return new a(c5352b, charSequence);
        }
    }

    /* renamed from: e3.B$c */
    class c implements h {

        /* renamed from: a */
        final /* synthetic */ AbstractC5366h f30310a;

        /* renamed from: e3.B$c$a */
        class a extends g {

            /* renamed from: h */
            final /* synthetic */ AbstractC5365g f30311h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, C5352B c5352b, CharSequence charSequence, AbstractC5365g abstractC5365g) {
                super(c5352b, charSequence);
                this.f30311h = abstractC5365g;
            }

            @Override // e3.C5352B.g
            public int separatorEnd(int i8) {
                return this.f30311h.end();
            }

            @Override // e3.C5352B.g
            public int separatorStart(int i8) {
                if (this.f30311h.find(i8)) {
                    return this.f30311h.start();
                }
                return -1;
            }
        }

        c(AbstractC5366h abstractC5366h) {
            this.f30310a = abstractC5366h;
        }

        @Override // e3.C5352B.h
        public g iterator(C5352B c5352b, CharSequence charSequence) {
            return new a(this, c5352b, charSequence, this.f30310a.matcher(charSequence));
        }
    }

    /* renamed from: e3.B$d */
    class d implements h {

        /* renamed from: a */
        final /* synthetic */ int f30312a;

        d(int i8) {
            this.f30312a = i8;
        }

        @Override // e3.C5352B.h
        public g iterator(C5352B c5352b, CharSequence charSequence) {
            return new a(c5352b, charSequence);
        }

        /* renamed from: e3.B$d$a */
        class a extends g {
            a(C5352B c5352b, CharSequence charSequence) {
                super(c5352b, charSequence);
            }

            @Override // e3.C5352B.g
            public int separatorStart(int i8) {
                int i9 = i8 + d.this.f30312a;
                if (i9 < this.f30318c.length()) {
                    return i9;
                }
                return -1;
            }

            @Override // e3.C5352B.g
            public int separatorEnd(int i8) {
                return i8;
            }
        }
    }

    /* renamed from: e3.B$e */
    class e implements Iterable {

        /* renamed from: a */
        final /* synthetic */ CharSequence f30314a;

        e(CharSequence charSequence) {
            this.f30314a = charSequence;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return C5352B.this.f(this.f30314a);
        }

        public String toString() {
            o oVarOn = o.on(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder sbAppendTo = oVarOn.appendTo(sb, (Iterable<? extends Object>) this);
            sbAppendTo.append(']');
            return sbAppendTo.toString();
        }
    }

    /* renamed from: e3.B$f */
    public static final class f {

        /* renamed from: a */
        private final C5352B f30316a;

        /* renamed from: b */
        private final C5352B f30317b;

        /* synthetic */ f(C5352B c5352b, C5352B c5352b2, a aVar) {
            this(c5352b, c5352b2);
        }

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f30316a.split(charSequence)) {
                Iterator itF = this.f30317b.f(str);
                w.checkArgument(itF.hasNext(), "Chunk [%s] is not a valid entry", str);
                String str2 = (String) itF.next();
                w.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                w.checkArgument(itF.hasNext(), "Chunk [%s] is not a valid entry", str);
                linkedHashMap.put(str2, (String) itF.next());
                w.checkArgument(!itF.hasNext(), "Chunk [%s] is not a valid entry", str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private f(C5352B c5352b, C5352B c5352b2) {
            this.f30316a = c5352b;
            this.f30317b = (C5352B) w.checkNotNull(c5352b2);
        }
    }

    /* renamed from: e3.B$g */
    private static abstract class g extends AbstractC5357b {

        /* renamed from: c */
        final CharSequence f30318c;

        /* renamed from: d */
        final AbstractC5360e f30319d;

        /* renamed from: e */
        final boolean f30320e;

        /* renamed from: f */
        int f30321f = 0;

        /* renamed from: g */
        int f30322g;

        protected g(C5352B c5352b, CharSequence charSequence) {
            this.f30319d = c5352b.f30302a;
            this.f30320e = c5352b.f30303b;
            this.f30322g = c5352b.f30305d;
            this.f30318c = charSequence;
        }

        /* JADX WARN: Code restructure failed: missing block: B:81:0x0060, code lost:
        
            r3 = r6.f30322g;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0063, code lost:
        
            if (r3 != 1) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0065, code lost:
        
            r1 = r6.f30318c.length();
            r6.f30321f = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x006d, code lost:
        
            if (r1 <= r0) goto L108;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x007d, code lost:
        
            if (r6.f30319d.matches(r6.f30318c.charAt(r1 - 1)) == false) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x007f, code lost:
        
            r1 = r1 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0082, code lost:
        
            r6.f30322g = r3 - 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x008f, code lost:
        
            return r6.f30318c.subSequence(r0, r1).toString();
         */
        @Override // e3.AbstractC5357b
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String a() {
            /*
                r6 = this;
                int r0 = r6.f30321f
            L2:
                int r1 = r6.f30321f
                r2 = -1
                if (r1 == r2) goto L90
                int r1 = r6.separatorStart(r1)
                if (r1 != r2) goto L16
                java.lang.CharSequence r1 = r6.f30318c
                int r1 = r1.length()
                r6.f30321f = r2
                goto L1c
            L16:
                int r3 = r6.separatorEnd(r1)
                r6.f30321f = r3
            L1c:
                int r3 = r6.f30321f
                if (r3 != r0) goto L2f
                int r3 = r3 + 1
                r6.f30321f = r3
                java.lang.CharSequence r1 = r6.f30318c
                int r1 = r1.length()
                if (r3 <= r1) goto L2
                r6.f30321f = r2
                goto L2
            L2f:
                if (r0 >= r1) goto L42
                e3.e r3 = r6.f30319d
                java.lang.CharSequence r4 = r6.f30318c
                char r4 = r4.charAt(r0)
                boolean r3 = r3.matches(r4)
                if (r3 == 0) goto L42
                int r0 = r0 + 1
                goto L2f
            L42:
                if (r1 <= r0) goto L57
                e3.e r3 = r6.f30319d
                java.lang.CharSequence r4 = r6.f30318c
                int r5 = r1 + (-1)
                char r4 = r4.charAt(r5)
                boolean r3 = r3.matches(r4)
                if (r3 == 0) goto L57
                int r1 = r1 + (-1)
                goto L42
            L57:
                boolean r3 = r6.f30320e
                if (r3 == 0) goto L60
                if (r0 != r1) goto L60
                int r0 = r6.f30321f
                goto L2
            L60:
                int r3 = r6.f30322g
                r4 = 1
                if (r3 != r4) goto L82
                java.lang.CharSequence r1 = r6.f30318c
                int r1 = r1.length()
                r6.f30321f = r2
            L6d:
                if (r1 <= r0) goto L85
                e3.e r2 = r6.f30319d
                java.lang.CharSequence r3 = r6.f30318c
                int r4 = r1 + (-1)
                char r3 = r3.charAt(r4)
                boolean r2 = r2.matches(r3)
                if (r2 == 0) goto L85
                int r1 = r1 + (-1)
                goto L6d
            L82:
                int r3 = r3 - r4
                r6.f30322g = r3
            L85:
                java.lang.CharSequence r2 = r6.f30318c
                java.lang.CharSequence r0 = r2.subSequence(r0, r1)
                java.lang.String r0 = r0.toString()
                return r0
            L90:
                java.lang.Object r0 = r6.b()
                java.lang.String r0 = (java.lang.String) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.C5352B.g.a():java.lang.String");
        }

        abstract int separatorEnd(int i8);

        abstract int separatorStart(int i8);
    }

    /* renamed from: e3.B$h */
    private interface h {
        Iterator<String> iterator(C5352B c5352b, CharSequence charSequence);
    }

    private C5352B(h hVar) {
        this(hVar, false, AbstractC5360e.none(), Integer.MAX_VALUE);
    }

    private static C5352B e(AbstractC5366h abstractC5366h) {
        w.checkArgument(!abstractC5366h.matcher("").matches(), "The pattern may not match the empty string: %s", abstractC5366h);
        return new C5352B(new c(abstractC5366h));
    }

    public Iterator f(CharSequence charSequence) {
        return this.f30304c.iterator(this, charSequence);
    }

    public static C5352B fixedLength(int i8) {
        w.checkArgument(i8 > 0, "The length may not be less than 1");
        return new C5352B(new d(i8));
    }

    public static C5352B on(char c9) {
        return on(AbstractC5360e.is(c9));
    }

    public static C5352B onPattern(String str) {
        return e(v.a(str));
    }

    public C5352B limit(int i8) {
        w.checkArgument(i8 > 0, "must be greater than zero: %s", i8);
        return new C5352B(this.f30304c, this.f30303b, this.f30302a, i8);
    }

    public C5352B omitEmptyStrings() {
        return new C5352B(this.f30304c, true, this.f30302a, this.f30305d);
    }

    public Iterable<String> split(CharSequence charSequence) {
        w.checkNotNull(charSequence);
        return new e(charSequence);
    }

    public List<String> splitToList(CharSequence charSequence) {
        w.checkNotNull(charSequence);
        Iterator itF = f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itF.hasNext()) {
            arrayList.add((String) itF.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public C5352B trimResults() {
        return trimResults(AbstractC5360e.whitespace());
    }

    public f withKeyValueSeparator(String str) {
        return withKeyValueSeparator(on(str));
    }

    private C5352B(h hVar, boolean z8, AbstractC5360e abstractC5360e, int i8) {
        this.f30304c = hVar;
        this.f30303b = z8;
        this.f30302a = abstractC5360e;
        this.f30305d = i8;
    }

    public static C5352B on(AbstractC5360e abstractC5360e) {
        w.checkNotNull(abstractC5360e);
        return new C5352B(new a(abstractC5360e));
    }

    public C5352B trimResults(AbstractC5360e abstractC5360e) {
        w.checkNotNull(abstractC5360e);
        return new C5352B(this.f30304c, this.f30303b, abstractC5360e, this.f30305d);
    }

    public f withKeyValueSeparator(char c9) {
        return withKeyValueSeparator(on(c9));
    }

    public f withKeyValueSeparator(C5352B c5352b) {
        return new f(this, c5352b, null);
    }

    public static C5352B on(String str) {
        w.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return on(str.charAt(0));
        }
        return new C5352B(new b(str));
    }

    public static C5352B on(Pattern pattern) {
        return e(new n(pattern));
    }
}
