package l7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p implements h {
    public static final p CANON_EQ;
    public static final p COMMENTS;
    public static final p DOT_MATCHES_ALL;
    public static final p IGNORE_CASE;
    public static final p LITERAL;
    public static final p MULTILINE;
    public static final p UNIX_LINES;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ p[] f34053c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ Z6.a f34054d;

    /* renamed from: a, reason: collision with root package name */
    private final int f34055a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34056b;

    static {
        int i8 = 2;
        IGNORE_CASE = new p("IGNORE_CASE", 0, i8, 0, 2, null);
        int i9 = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i10 = 0;
        MULTILINE = new p("MULTILINE", 1, 8, i10, i9, defaultConstructorMarker);
        int i11 = 2;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        int i12 = 0;
        LITERAL = new p("LITERAL", i8, 16, i12, i11, defaultConstructorMarker2);
        UNIX_LINES = new p("UNIX_LINES", 3, 1, i10, i9, defaultConstructorMarker);
        COMMENTS = new p("COMMENTS", 4, 4, i12, i11, defaultConstructorMarker2);
        DOT_MATCHES_ALL = new p("DOT_MATCHES_ALL", 5, 32, i10, i9, defaultConstructorMarker);
        CANON_EQ = new p("CANON_EQ", 6, 128, i12, i11, defaultConstructorMarker2);
        p[] pVarArrA = a();
        f34053c = pVarArrA;
        f34054d = Z6.b.enumEntries(pVarArrA);
    }

    private p(String str, int i8, int i9, int i10) {
        this.f34055a = i9;
        this.f34056b = i10;
    }

    private static final /* synthetic */ p[] a() {
        return new p[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static Z6.a getEntries() {
        return f34054d;
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f34053c.clone();
    }

    @Override // l7.h
    public int getMask() {
        return this.f34056b;
    }

    @Override // l7.h
    public int getValue() {
        return this.f34055a;
    }

    /* synthetic */ p(String str, int i8, int i9, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i8, i9, (i11 & 2) != 0 ? i9 : i10);
    }
}
