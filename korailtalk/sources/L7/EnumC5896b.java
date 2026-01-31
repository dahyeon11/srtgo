package l7;

import R6.AbstractC0756j;
import R6.InterfaceC0755i;
import S6.Q;
import f7.InterfaceC5519a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* renamed from: l7.b */
/* loaded from: classes3.dex */
public final class EnumC5896b extends Enum {
    public static final C0348b Companion;

    /* renamed from: b */
    private static final InterfaceC0755i f34013b;

    /* renamed from: c */
    private static final /* synthetic */ EnumC5896b[] f34014c;

    /* renamed from: d */
    private static final /* synthetic */ Z6.a f34015d;

    /* renamed from: a */
    private final int f34016a;
    public static final EnumC5896b UNDEFINED = new EnumC5896b("UNDEFINED", 0, -1);
    public static final EnumC5896b LEFT_TO_RIGHT = new EnumC5896b("LEFT_TO_RIGHT", 1, 0);
    public static final EnumC5896b RIGHT_TO_LEFT = new EnumC5896b("RIGHT_TO_LEFT", 2, 1);
    public static final EnumC5896b RIGHT_TO_LEFT_ARABIC = new EnumC5896b("RIGHT_TO_LEFT_ARABIC", 3, 2);
    public static final EnumC5896b EUROPEAN_NUMBER = new EnumC5896b("EUROPEAN_NUMBER", 4, 3);
    public static final EnumC5896b EUROPEAN_NUMBER_SEPARATOR = new EnumC5896b("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
    public static final EnumC5896b EUROPEAN_NUMBER_TERMINATOR = new EnumC5896b("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
    public static final EnumC5896b ARABIC_NUMBER = new EnumC5896b("ARABIC_NUMBER", 7, 6);
    public static final EnumC5896b COMMON_NUMBER_SEPARATOR = new EnumC5896b("COMMON_NUMBER_SEPARATOR", 8, 7);
    public static final EnumC5896b NONSPACING_MARK = new EnumC5896b("NONSPACING_MARK", 9, 8);
    public static final EnumC5896b BOUNDARY_NEUTRAL = new EnumC5896b("BOUNDARY_NEUTRAL", 10, 9);
    public static final EnumC5896b PARAGRAPH_SEPARATOR = new EnumC5896b("PARAGRAPH_SEPARATOR", 11, 10);
    public static final EnumC5896b SEGMENT_SEPARATOR = new EnumC5896b("SEGMENT_SEPARATOR", 12, 11);
    public static final EnumC5896b WHITESPACE = new EnumC5896b("WHITESPACE", 13, 12);
    public static final EnumC5896b OTHER_NEUTRALS = new EnumC5896b("OTHER_NEUTRALS", 14, 13);
    public static final EnumC5896b LEFT_TO_RIGHT_EMBEDDING = new EnumC5896b("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
    public static final EnumC5896b LEFT_TO_RIGHT_OVERRIDE = new EnumC5896b("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
    public static final EnumC5896b RIGHT_TO_LEFT_EMBEDDING = new EnumC5896b("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
    public static final EnumC5896b RIGHT_TO_LEFT_OVERRIDE = new EnumC5896b("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
    public static final EnumC5896b POP_DIRECTIONAL_FORMAT = new EnumC5896b("POP_DIRECTIONAL_FORMAT", 19, 18);

    /* renamed from: l7.b$a */
    static final class a extends Lambda implements InterfaceC5519a {
        public static final a INSTANCE = ;

        a() {
        }

        @Override // f7.InterfaceC5519a
        public final Map<Integer, EnumC5896b> invoke() {
            Z6.a entries = EnumC5896b.getEntries();
            LinkedHashMap linkedHashMap = new LinkedHashMap(j7.s.coerceAtLeast(Q.mapCapacity(S6.r.collectionSizeOrDefault(entries, 10)), 16));
            for (Object obj : entries) {
                linkedHashMap.put(Integer.valueOf(((EnumC5896b) obj).getValue()), obj);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: l7.b$b */
    public static final class C0348b {
        public /* synthetic */ C0348b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map a() {
            return (Map) EnumC5896b.f34013b.getValue();
        }

        public final EnumC5896b valueOf(int i8) {
            EnumC5896b enumC5896b = (EnumC5896b) a().get(Integer.valueOf(i8));
            if (enumC5896b != null) {
                return enumC5896b;
            }
            throw new IllegalArgumentException("Directionality #" + i8 + " is not defined.");
        }

        private C0348b() {
        }
    }

    static {
        EnumC5896b[] enumC5896bArrA = a();
        f34014c = enumC5896bArrA;
        f34015d = Z6.b.enumEntries(enumC5896bArrA);
        Companion = new C0348b(null);
        f34013b = AbstractC0756j.lazy(a.INSTANCE);
    }

    private EnumC5896b(String str, int i8, int i9) {
        super(str, i8);
        this.f34016a = i9;
    }

    private static final /* synthetic */ EnumC5896b[] a() {
        return new EnumC5896b[]{UNDEFINED, LEFT_TO_RIGHT, RIGHT_TO_LEFT, RIGHT_TO_LEFT_ARABIC, EUROPEAN_NUMBER, EUROPEAN_NUMBER_SEPARATOR, EUROPEAN_NUMBER_TERMINATOR, ARABIC_NUMBER, COMMON_NUMBER_SEPARATOR, NONSPACING_MARK, BOUNDARY_NEUTRAL, PARAGRAPH_SEPARATOR, SEGMENT_SEPARATOR, WHITESPACE, OTHER_NEUTRALS, LEFT_TO_RIGHT_EMBEDDING, LEFT_TO_RIGHT_OVERRIDE, RIGHT_TO_LEFT_EMBEDDING, RIGHT_TO_LEFT_OVERRIDE, POP_DIRECTIONAL_FORMAT};
    }

    public static Z6.a getEntries() {
        return f34015d;
    }

    public static EnumC5896b valueOf(String str) {
        return (EnumC5896b) Enum.valueOf(EnumC5896b.class, str);
    }

    public static EnumC5896b[] values() {
        return (EnumC5896b[]) f34014c.clone();
    }

    public final int getValue() {
        return this.f34016a;
    }
}
