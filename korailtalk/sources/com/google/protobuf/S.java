package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
final class S implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Field f26301a;

    /* renamed from: b, reason: collision with root package name */
    private final X f26302b;

    /* renamed from: c, reason: collision with root package name */
    private final Class f26303c;

    /* renamed from: d, reason: collision with root package name */
    private final int f26304d;

    /* renamed from: e, reason: collision with root package name */
    private final Field f26305e;

    /* renamed from: f, reason: collision with root package name */
    private final int f26306f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f26307g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f26308h;

    /* renamed from: i, reason: collision with root package name */
    private final Y0 f26309i;

    /* renamed from: j, reason: collision with root package name */
    private final Field f26310j;

    /* renamed from: k, reason: collision with root package name */
    private final Class f26311k;

    /* renamed from: l, reason: collision with root package name */
    private final Object f26312l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC5227l0.e f26313m;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26314a;

        static {
            int[] iArr = new int[X.values().length];
            f26314a = iArr;
            try {
                iArr[X.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26314a[X.GROUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26314a[X.MESSAGE_LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26314a[X.GROUP_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private Field f26315a;

        /* renamed from: b, reason: collision with root package name */
        private X f26316b;

        /* renamed from: c, reason: collision with root package name */
        private int f26317c;

        /* renamed from: d, reason: collision with root package name */
        private Field f26318d;

        /* renamed from: e, reason: collision with root package name */
        private int f26319e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f26320f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f26321g;

        /* renamed from: h, reason: collision with root package name */
        private Y0 f26322h;

        /* renamed from: i, reason: collision with root package name */
        private Class f26323i;

        /* renamed from: j, reason: collision with root package name */
        private Object f26324j;

        /* renamed from: k, reason: collision with root package name */
        private AbstractC5227l0.e f26325k;

        /* renamed from: l, reason: collision with root package name */
        private Field f26326l;

        /* synthetic */ b(a aVar) {
            this();
        }

        public S build() {
            Y0 y02 = this.f26322h;
            if (y02 != null) {
                return S.forOneofMemberField(this.f26317c, this.f26316b, y02, this.f26323i, this.f26321g, this.f26325k);
            }
            Object obj = this.f26324j;
            if (obj != null) {
                return S.forMapField(this.f26315a, this.f26317c, obj, this.f26325k);
            }
            Field field = this.f26318d;
            if (field != null) {
                return this.f26320f ? S.forProto2RequiredField(this.f26315a, this.f26317c, this.f26316b, field, this.f26319e, this.f26321g, this.f26325k) : S.forProto2OptionalField(this.f26315a, this.f26317c, this.f26316b, field, this.f26319e, this.f26321g, this.f26325k);
            }
            AbstractC5227l0.e eVar = this.f26325k;
            if (eVar != null) {
                Field field2 = this.f26326l;
                return field2 == null ? S.forFieldWithEnumVerifier(this.f26315a, this.f26317c, this.f26316b, eVar) : S.forPackedFieldWithEnumVerifier(this.f26315a, this.f26317c, this.f26316b, eVar, field2);
            }
            Field field3 = this.f26326l;
            return field3 == null ? S.forField(this.f26315a, this.f26317c, this.f26316b, this.f26321g) : S.forPackedField(this.f26315a, this.f26317c, this.f26316b, field3);
        }

        public b withCachedSizeField(Field field) {
            this.f26326l = field;
            return this;
        }

        public b withEnforceUtf8(boolean z8) {
            this.f26321g = z8;
            return this;
        }

        public b withEnumVerifier(AbstractC5227l0.e eVar) {
            this.f26325k = eVar;
            return this;
        }

        public b withField(Field field) {
            if (this.f26322h != null) {
                throw new IllegalStateException("Cannot set field when building a oneof.");
            }
            this.f26315a = field;
            return this;
        }

        public b withFieldNumber(int i8) {
            this.f26317c = i8;
            return this;
        }

        public b withMapDefaultEntry(Object obj) {
            this.f26324j = obj;
            return this;
        }

        public b withOneof(Y0 y02, Class<?> cls) {
            if (this.f26315a != null || this.f26318d != null) {
                throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
            }
            this.f26322h = y02;
            this.f26323i = cls;
            return this;
        }

        public b withPresence(Field field, int i8) {
            this.f26318d = (Field) AbstractC5227l0.b(field, "presenceField");
            this.f26319e = i8;
            return this;
        }

        public b withRequired(boolean z8) {
            this.f26320f = z8;
            return this;
        }

        public b withType(X x8) {
            this.f26316b = x8;
            return this;
        }

        private b() {
        }
    }

    private S(Field field, int i8, X x8, Class cls, Field field2, int i9, boolean z8, boolean z9, Y0 y02, Class cls2, Object obj, AbstractC5227l0.e eVar, Field field3) {
        this.f26301a = field;
        this.f26302b = x8;
        this.f26303c = cls;
        this.f26304d = i8;
        this.f26305e = field2;
        this.f26306f = i9;
        this.f26307g = z8;
        this.f26308h = z9;
        this.f26309i = y02;
        this.f26311k = cls2;
        this.f26312l = obj;
        this.f26313m = eVar;
        this.f26310j = field3;
    }

    private static void a(int i8) {
        if (i8 > 0) {
            return;
        }
        throw new IllegalArgumentException("fieldNumber must be positive: " + i8);
    }

    private static boolean b(int i8) {
        return i8 != 0 && (i8 & (i8 + (-1))) == 0;
    }

    public static S forField(Field field, int i8, X x8, boolean z8) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        AbstractC5227l0.b(x8, "fieldType");
        if (x8 == X.MESSAGE_LIST || x8 == X.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new S(field, i8, x8, null, null, 0, false, z8, null, null, null, null, null);
    }

    public static S forFieldWithEnumVerifier(Field field, int i8, X x8, AbstractC5227l0.e eVar) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        return new S(field, i8, x8, null, null, 0, false, false, null, null, null, eVar, null);
    }

    public static S forMapField(Field field, int i8, Object obj, AbstractC5227l0.e eVar) {
        AbstractC5227l0.b(obj, "mapDefaultEntry");
        a(i8);
        AbstractC5227l0.b(field, "field");
        return new S(field, i8, X.MAP, null, null, 0, false, true, null, null, obj, eVar, null);
    }

    public static S forOneofMemberField(int i8, X x8, Y0 y02, Class<?> cls, boolean z8, AbstractC5227l0.e eVar) {
        a(i8);
        AbstractC5227l0.b(x8, "fieldType");
        AbstractC5227l0.b(y02, "oneof");
        AbstractC5227l0.b(cls, "oneofStoredType");
        if (x8.isScalar()) {
            return new S(null, i8, x8, null, null, 0, false, z8, y02, cls, null, eVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i8 + " is of type " + x8);
    }

    public static S forPackedField(Field field, int i8, X x8, Field field2) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        AbstractC5227l0.b(x8, "fieldType");
        if (x8 == X.MESSAGE_LIST || x8 == X.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new S(field, i8, x8, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static S forPackedFieldWithEnumVerifier(Field field, int i8, X x8, AbstractC5227l0.e eVar, Field field2) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        return new S(field, i8, x8, null, null, 0, false, false, null, null, null, eVar, field2);
    }

    public static S forProto2OptionalField(Field field, int i8, X x8, Field field2, int i9, boolean z8, AbstractC5227l0.e eVar) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        AbstractC5227l0.b(x8, "fieldType");
        AbstractC5227l0.b(field2, "presenceField");
        if (field2 == null || b(i9)) {
            return new S(field, i8, x8, null, field2, i9, false, z8, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i9);
    }

    public static S forProto2RequiredField(Field field, int i8, X x8, Field field2, int i9, boolean z8, AbstractC5227l0.e eVar) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        AbstractC5227l0.b(x8, "fieldType");
        AbstractC5227l0.b(field2, "presenceField");
        if (field2 == null || b(i9)) {
            return new S(field, i8, x8, null, field2, i9, true, z8, null, null, null, eVar, null);
        }
        throw new IllegalArgumentException("presenceMask must have exactly one bit set: " + i9);
    }

    public static S forRepeatedMessageField(Field field, int i8, X x8, Class<?> cls) {
        a(i8);
        AbstractC5227l0.b(field, "field");
        AbstractC5227l0.b(x8, "fieldType");
        AbstractC5227l0.b(cls, "messageClass");
        return new S(field, i8, x8, cls, null, 0, false, false, null, null, null, null, null);
    }

    public static b newBuilder() {
        return new b(null);
    }

    public Field getCachedSizeField() {
        return this.f26310j;
    }

    public AbstractC5227l0.e getEnumVerifier() {
        return this.f26313m;
    }

    public Field getField() {
        return this.f26301a;
    }

    public int getFieldNumber() {
        return this.f26304d;
    }

    public Class<?> getListElementType() {
        return this.f26303c;
    }

    public Object getMapDefaultEntry() {
        return this.f26312l;
    }

    public Class<?> getMessageFieldClass() {
        int i8 = a.f26314a[this.f26302b.ordinal()];
        if (i8 == 1 || i8 == 2) {
            Field field = this.f26301a;
            return field != null ? field.getType() : this.f26311k;
        }
        if (i8 == 3 || i8 == 4) {
            return this.f26303c;
        }
        return null;
    }

    public Y0 getOneof() {
        return this.f26309i;
    }

    public Class<?> getOneofStoredType() {
        return this.f26311k;
    }

    public Field getPresenceField() {
        return this.f26305e;
    }

    public int getPresenceMask() {
        return this.f26306f;
    }

    public X getType() {
        return this.f26302b;
    }

    public boolean isEnforceUtf8() {
        return this.f26308h;
    }

    public boolean isRequired() {
        return this.f26307g;
    }

    @Override // java.lang.Comparable
    public int compareTo(S s8) {
        return this.f26304d - s8.f26304d;
    }
}
