package l7;

import S6.AbstractC0757a;
import S6.AbstractC0759c;
import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l7.l;

/* loaded from: classes3.dex */
final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Matcher f34033a;

    /* renamed from: b, reason: collision with root package name */
    private final CharSequence f34034b;

    /* renamed from: c, reason: collision with root package name */
    private final j f34035c;

    /* renamed from: d, reason: collision with root package name */
    private List f34036d;

    public static final class a extends AbstractC0759c {
        a() {
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        @Override // S6.AbstractC0759c, S6.AbstractC0757a
        public int getSize() {
            return m.this.a().groupCount() + 1;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return indexOf((String) obj);
            }
            return -1;
        }

        @Override // S6.AbstractC0759c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return lastIndexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }

        @Override // S6.AbstractC0759c, java.util.List
        public String get(int i8) {
            String strGroup = m.this.a().group(i8);
            return strGroup == null ? "" : strGroup;
        }

        public /* bridge */ int indexOf(String str) {
            return super.indexOf((Object) str);
        }

        public /* bridge */ int lastIndexOf(String str) {
            return super.lastIndexOf((Object) str);
        }
    }

    public static final class b extends AbstractC0757a implements k {

        static final class a extends Lambda implements f7.l {
            a() {
                super(1);
            }

            @Override // f7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final i invoke(int i8) {
                return b.this.get(i8);
            }
        }

        b() {
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof i) {
                return contains((i) obj);
            }
            return false;
        }

        @Override // l7.k, l7.j
        public i get(int i8) {
            j7.l lVarD = o.d(m.this.a(), i8);
            if (lVarD.getStart().intValue() < 0) {
                return null;
            }
            String strGroup = m.this.a().group(i8);
            Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
            return new i(strGroup, lVarD);
        }

        @Override // S6.AbstractC0757a
        public int getSize() {
            return m.this.a().groupCount() + 1;
        }

        @Override // S6.AbstractC0757a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // S6.AbstractC0757a, java.util.Collection, java.lang.Iterable
        public Iterator<i> iterator() {
            return k7.p.map(S6.r.asSequence(S6.r.getIndices(this)), new a()).iterator();
        }

        public /* bridge */ boolean contains(i iVar) {
            return super.contains((Object) iVar);
        }

        @Override // l7.k
        public i get(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return a7.b.IMPLEMENTATIONS.getMatchResultNamedGroup(m.this.a(), name);
        }
    }

    public m(Matcher matcher, CharSequence input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f34033a = matcher;
        this.f34034b = input;
        this.f34035c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult a() {
        return this.f34033a;
    }

    @Override // l7.l
    public l.b getDestructured() {
        return l.a.getDestructured(this);
    }

    @Override // l7.l
    public List<String> getGroupValues() {
        if (this.f34036d == null) {
            this.f34036d = new a();
        }
        List<String> list = this.f34036d;
        Intrinsics.checkNotNull(list);
        return list;
    }

    @Override // l7.l
    public j getGroups() {
        return this.f34035c;
    }

    @Override // l7.l
    public j7.l getRange() {
        return o.c(a());
    }

    @Override // l7.l
    public String getValue() {
        String strGroup = a().group();
        Intrinsics.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // l7.l
    public l next() {
        int iEnd = a().end() + (a().end() == a().start() ? 1 : 0);
        if (iEnd > this.f34034b.length()) {
            return null;
        }
        Matcher matcher = this.f34033a.pattern().matcher(this.f34034b);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return o.a(matcher, iEnd, this.f34034b);
    }
}
