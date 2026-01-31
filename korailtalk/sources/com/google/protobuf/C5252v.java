package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.C5269x;
import com.google.protobuf.s1;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.protobuf.v */
/* loaded from: classes2.dex */
final class C5252v implements J0 {

    /* renamed from: a */
    private static final C5252v f26810a = new C5252v();

    /* renamed from: b */
    private static final Set f26811b = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));

    /* renamed from: c */
    private static d f26812c = new d();

    /* renamed from: d */
    public static final /* synthetic */ int f26813d = 0;

    /* renamed from: com.google.protobuf.v$a */
    class a implements AbstractC5227l0.e {

        /* renamed from: a */
        final /* synthetic */ C5269x.g f26814a;

        a(C5269x.g gVar) {
            this.f26814a = gVar;
        }

        @Override // com.google.protobuf.AbstractC5227l0.e
        public boolean isInRange(int i8) {
            return this.f26814a.getEnumType().findValueByNumber(i8) != null;
        }
    }

    /* renamed from: com.google.protobuf.v$b */
    class b implements AbstractC5227l0.e {

        /* renamed from: a */
        final /* synthetic */ C5269x.g f26815a;

        b(C5269x.g gVar) {
            this.f26815a = gVar;
        }

        @Override // com.google.protobuf.AbstractC5227l0.e
        public boolean isInRange(int i8) {
            return this.f26815a.getEnumType().findValueByNumber(i8) != null;
        }
    }

    /* renamed from: com.google.protobuf.v$c */
    static /* synthetic */ class c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26816a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26817b;

        /* renamed from: c */
        static final /* synthetic */ int[] f26818c;

        static {
            int[] iArr = new int[C5269x.g.c.values().length];
            f26818c = iArr;
            try {
                iArr[C5269x.g.c.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26818c[C5269x.g.c.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26818c[C5269x.g.c.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26818c[C5269x.g.c.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26818c[C5269x.g.c.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26818c[C5269x.g.c.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26818c[C5269x.g.c.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26818c[C5269x.g.c.GROUP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26818c[C5269x.g.c.INT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26818c[C5269x.g.c.INT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26818c[C5269x.g.c.MESSAGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26818c[C5269x.g.c.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26818c[C5269x.g.c.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26818c[C5269x.g.c.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26818c[C5269x.g.c.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26818c[C5269x.g.c.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26818c[C5269x.g.c.UINT32.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26818c[C5269x.g.c.UINT64.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[EnumC5239p0.values().length];
            f26817b = iArr2;
            try {
                iArr2[EnumC5239p0.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26817b[EnumC5239p0.BYTE_STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26817b[EnumC5239p0.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26817b[EnumC5239p0.FLOAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f26817b[EnumC5239p0.ENUM.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f26817b[EnumC5239p0.INT.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f26817b[EnumC5239p0.LONG.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f26817b[EnumC5239p0.STRING.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f26817b[EnumC5239p0.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr3 = new int[C5269x.h.b.values().length];
            f26816a = iArr3;
            try {
                iArr3[C5269x.h.b.PROTO2.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f26816a[C5269x.h.b.PROTO3.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    private C5252v() {
    }

    private static Field c(Class cls, int i8) {
        return k(cls, "bitField" + i8 + "_");
    }

    private static S d(Class cls, C5269x.g gVar, e eVar, boolean z8, AbstractC5227l0.e eVar2) {
        Y0 y0A = eVar.a(cls, gVar.getContainingOneof());
        X xO = o(gVar);
        return S.forOneofMemberField(gVar.getNumber(), xO, y0A, p(cls, gVar, xO), z8, eVar2);
    }

    private static Field e(Class cls, C5269x.g gVar) {
        return k(cls, l(gVar));
    }

    private static I0 f(Class cls, C5269x.b bVar) {
        int i8 = c.f26816a[bVar.getFile().getSyntax().ordinal()];
        if (i8 == 1) {
            return g(cls, bVar);
        }
        if (i8 == 2) {
            return h(cls, bVar);
        }
        throw new IllegalArgumentException("Unsupported syntax: " + bVar.getFile().getSyntax());
    }

    private static s1 g(Class cls, C5269x.b bVar) {
        List<C5269x.g> fields = bVar.getFields();
        s1.a aVarNewBuilder = s1.newBuilder(fields.size());
        aVarNewBuilder.withDefaultInstance(m(cls));
        aVarNewBuilder.withSyntax(EnumC5198b1.PROTO2);
        aVarNewBuilder.withMessageSetWireFormat(bVar.getOptions().getMessageSetWireFormat());
        AbstractC5227l0.e eVar = null;
        e eVar2 = new e(null);
        Field fieldC = null;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (i8 < fields.size()) {
            C5269x.g gVar = fields.get(i8);
            boolean javaStringCheckUtf8 = gVar.getFile().getOptions().getJavaStringCheckUtf8();
            C5269x.g.b javaType = gVar.getJavaType();
            C5269x.g.b bVar2 = C5269x.g.b.ENUM;
            AbstractC5227l0.e aVar = javaType == bVar2 ? new a(gVar) : eVar;
            if (gVar.getContainingOneof() != null) {
                aVarNewBuilder.withField(d(cls, gVar, eVar2, javaStringCheckUtf8, aVar));
            } else {
                Field fieldJ = j(cls, gVar);
                int number = gVar.getNumber();
                X xO = o(gVar);
                if (gVar.isMapField()) {
                    C5269x.g gVarFindFieldByNumber = gVar.getMessageType().findFieldByNumber(2);
                    if (gVarFindFieldByNumber.getJavaType() == bVar2) {
                        aVar = new b(gVarFindFieldByNumber);
                    }
                    aVarNewBuilder.withField(S.forMapField(fieldJ, number, AbstractC5225k1.C(cls, gVar.getName()), aVar));
                } else if (!gVar.isRepeated()) {
                    if (fieldC == null) {
                        fieldC = c(cls, i9);
                    }
                    if (gVar.isRequired()) {
                        aVarNewBuilder.withField(S.forProto2RequiredField(fieldJ, number, xO, fieldC, i10, javaStringCheckUtf8, aVar));
                    } else {
                        aVarNewBuilder.withField(S.forProto2OptionalField(fieldJ, number, xO, fieldC, i10, javaStringCheckUtf8, aVar));
                    }
                } else if (aVar != null) {
                    if (gVar.isPacked()) {
                        aVarNewBuilder.withField(S.forPackedFieldWithEnumVerifier(fieldJ, number, xO, aVar, e(cls, gVar)));
                    } else {
                        aVarNewBuilder.withField(S.forFieldWithEnumVerifier(fieldJ, number, xO, aVar));
                    }
                } else if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                    aVarNewBuilder.withField(S.forRepeatedMessageField(fieldJ, number, xO, r(cls, gVar)));
                } else if (gVar.isPacked()) {
                    aVarNewBuilder.withField(S.forPackedField(fieldJ, number, xO, e(cls, gVar)));
                } else {
                    aVarNewBuilder.withField(S.forField(fieldJ, number, xO, javaStringCheckUtf8));
                }
                i8++;
                eVar = null;
            }
            i10 <<= 1;
            if (i10 == 0) {
                i9++;
                i10 = 1;
                fieldC = null;
            }
            i8++;
            eVar = null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < fields.size(); i11++) {
            C5269x.g gVar2 = fields.get(i11);
            if (gVar2.isRequired() || (gVar2.getJavaType() == C5269x.g.b.MESSAGE && t(gVar2.getMessageType()))) {
                arrayList.add(Integer.valueOf(gVar2.getNumber()));
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            iArr[i12] = ((Integer) arrayList.get(i12)).intValue();
        }
        aVarNewBuilder.withCheckInitialized(iArr);
        return aVarNewBuilder.build();
    }

    public static C5252v getInstance() {
        return f26810a;
    }

    private static s1 h(Class cls, C5269x.b bVar) {
        List<C5269x.g> fields = bVar.getFields();
        s1.a aVarNewBuilder = s1.newBuilder(fields.size());
        aVarNewBuilder.withDefaultInstance(m(cls));
        aVarNewBuilder.withSyntax(EnumC5198b1.PROTO3);
        e eVar = new e(null);
        for (int i8 = 0; i8 < fields.size(); i8++) {
            C5269x.g gVar = fields.get(i8);
            if (gVar.getContainingOneof() != null && !gVar.getContainingOneof().isSynthetic()) {
                aVarNewBuilder.withField(d(cls, gVar, eVar, true, null));
            } else if (gVar.isMapField()) {
                aVarNewBuilder.withField(S.forMapField(j(cls, gVar), gVar.getNumber(), AbstractC5225k1.C(cls, gVar.getName()), null));
            } else if (gVar.isRepeated() && gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                aVarNewBuilder.withField(S.forRepeatedMessageField(j(cls, gVar), gVar.getNumber(), o(gVar), r(cls, gVar)));
            } else if (gVar.isPacked()) {
                aVarNewBuilder.withField(S.forPackedField(j(cls, gVar), gVar.getNumber(), o(gVar), e(cls, gVar)));
            } else {
                aVarNewBuilder.withField(S.forField(j(cls, gVar), gVar.getNumber(), o(gVar), true));
            }
        }
        return aVarNewBuilder.build();
    }

    private static C5269x.b i(Class cls) {
        return m(cls).getDescriptorForType();
    }

    private static Field j(Class cls, C5269x.g gVar) {
        return k(cls, n(gVar));
    }

    public static Field k(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Unable to find field " + str + " in message class " + cls.getName());
        }
    }

    private static String l(C5269x.g gVar) {
        return v(gVar.getName()) + "MemoizedSerializedSize";
    }

    private static H0 m(Class cls) {
        try {
            return (H0) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e8) {
            throw new IllegalArgumentException("Unable to get default instance for message class " + cls.getName(), e8);
        }
    }

    static String n(C5269x.g gVar) {
        String name = gVar.getType() == C5269x.g.c.GROUP ? gVar.getMessageType().getName() : gVar.getName();
        return v(name) + (f26811b.contains(w(name)) ? "__" : "_");
    }

    private static X o(C5269x.g gVar) {
        switch (c.f26818c[gVar.getType().ordinal()]) {
            case 1:
                return !gVar.isRepeated() ? X.BOOL : gVar.isPacked() ? X.BOOL_LIST_PACKED : X.BOOL_LIST;
            case 2:
                return gVar.isRepeated() ? X.BYTES_LIST : X.BYTES;
            case 3:
                return !gVar.isRepeated() ? X.DOUBLE : gVar.isPacked() ? X.DOUBLE_LIST_PACKED : X.DOUBLE_LIST;
            case 4:
                return !gVar.isRepeated() ? X.ENUM : gVar.isPacked() ? X.ENUM_LIST_PACKED : X.ENUM_LIST;
            case 5:
                return !gVar.isRepeated() ? X.FIXED32 : gVar.isPacked() ? X.FIXED32_LIST_PACKED : X.FIXED32_LIST;
            case 6:
                return !gVar.isRepeated() ? X.FIXED64 : gVar.isPacked() ? X.FIXED64_LIST_PACKED : X.FIXED64_LIST;
            case 7:
                return !gVar.isRepeated() ? X.FLOAT : gVar.isPacked() ? X.FLOAT_LIST_PACKED : X.FLOAT_LIST;
            case 8:
                return gVar.isRepeated() ? X.GROUP_LIST : X.GROUP;
            case 9:
                return !gVar.isRepeated() ? X.INT32 : gVar.isPacked() ? X.INT32_LIST_PACKED : X.INT32_LIST;
            case 10:
                return !gVar.isRepeated() ? X.INT64 : gVar.isPacked() ? X.INT64_LIST_PACKED : X.INT64_LIST;
            case 11:
                return gVar.isMapField() ? X.MAP : gVar.isRepeated() ? X.MESSAGE_LIST : X.MESSAGE;
            case 12:
                return !gVar.isRepeated() ? X.SFIXED32 : gVar.isPacked() ? X.SFIXED32_LIST_PACKED : X.SFIXED32_LIST;
            case 13:
                return !gVar.isRepeated() ? X.SFIXED64 : gVar.isPacked() ? X.SFIXED64_LIST_PACKED : X.SFIXED64_LIST;
            case 14:
                return !gVar.isRepeated() ? X.SINT32 : gVar.isPacked() ? X.SINT32_LIST_PACKED : X.SINT32_LIST;
            case 15:
                return !gVar.isRepeated() ? X.SINT64 : gVar.isPacked() ? X.SINT64_LIST_PACKED : X.SINT64_LIST;
            case 16:
                return gVar.isRepeated() ? X.STRING_LIST : X.STRING;
            case 17:
                return !gVar.isRepeated() ? X.UINT32 : gVar.isPacked() ? X.UINT32_LIST_PACKED : X.UINT32_LIST;
            case 18:
                return !gVar.isRepeated() ? X.UINT64 : gVar.isPacked() ? X.UINT64_LIST_PACKED : X.UINT64_LIST;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + gVar.getType());
        }
    }

    private static Class p(Class cls, C5269x.g gVar, X x8) {
        switch (c.f26817b[x8.getJavaType().ordinal()]) {
            case 1:
                return Boolean.class;
            case 2:
                return AbstractC5235o.class;
            case 3:
                return Double.class;
            case 4:
                return Float.class;
            case 5:
            case 6:
                return Integer.class;
            case 7:
                return Long.class;
            case 8:
                return String.class;
            case 9:
                return q(cls, gVar);
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + x8);
        }
    }

    private static Class q(Class cls, C5269x.g gVar) {
        try {
            return cls.getDeclaredMethod(s(gVar.getType() == C5269x.g.c.GROUP ? gVar.getMessageType().getName() : gVar.getName()), null).getReturnType();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }

    private static Class r(Class cls, C5269x.g gVar) {
        try {
            return cls.getDeclaredMethod(s(gVar.getType() == C5269x.g.c.GROUP ? gVar.getMessageType().getName() : gVar.getName()), Integer.TYPE).getReturnType();
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }

    private static String s(String str) {
        String strV = v(str);
        return "get" + Character.toUpperCase(strV.charAt(0)) + strV.substring(1, strV.length());
    }

    private static boolean t(C5269x.b bVar) {
        return f26812c.needsIsInitializedCheck(bVar);
    }

    private static String u(String str, boolean z8) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i8 = 0; i8 < str.length(); i8++) {
            char cCharAt = str.charAt(i8);
            if (cCharAt == '_') {
                z8 = true;
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
                z8 = true;
            } else if (z8) {
                sb.append(Character.toUpperCase(cCharAt));
                z8 = false;
            } else if (i8 == 0) {
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String v(String str) {
        return u(str, false);
    }

    private static String w(String str) {
        return u(str, true);
    }

    @Override // com.google.protobuf.J0
    public boolean isSupported(Class<?> cls) {
        return AbstractC5209f0.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.J0
    public I0 messageInfoFor(Class<?> cls) {
        if (AbstractC5209f0.class.isAssignableFrom(cls)) {
            return f(cls, i(cls));
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    /* renamed from: com.google.protobuf.v$d */
    static class d {

        /* renamed from: a */
        private final Map f26819a = new ConcurrentHashMap();

        /* renamed from: b */
        private int f26820b = 0;

        /* renamed from: c */
        private final Stack f26821c = new Stack();

        /* renamed from: d */
        private final Map f26822d = new HashMap();

        /* renamed from: com.google.protobuf.v$d$a */
        private static class a {

            /* renamed from: a */
            final C5269x.b f26823a;

            /* renamed from: b */
            final int f26824b;

            /* renamed from: c */
            int f26825c;

            /* renamed from: d */
            b f26826d = null;

            a(C5269x.b bVar, int i8) {
                this.f26823a = bVar;
                this.f26824b = i8;
                this.f26825c = i8;
            }
        }

        d() {
        }

        private void a(b bVar) {
            boolean z8;
            b bVar2;
            Iterator it = bVar.f26827a.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    z8 = false;
                    break;
                }
                C5269x.b bVar3 = (C5269x.b) it.next();
                z8 = true;
                if (bVar3.isExtendable()) {
                    break;
                }
                for (C5269x.g gVar : bVar3.getFields()) {
                    if (gVar.isRequired() || (gVar.getJavaType() == C5269x.g.b.MESSAGE && (bVar2 = ((a) this.f26822d.get(gVar.getMessageType())).f26826d) != bVar && bVar2.f26828b)) {
                        break loop0;
                    }
                }
            }
            bVar.f26828b = z8;
            Iterator it2 = bVar.f26827a.iterator();
            while (it2.hasNext()) {
                this.f26819a.put((C5269x.b) it2.next(), Boolean.valueOf(bVar.f26828b));
            }
        }

        private a b(C5269x.b bVar) {
            a aVar;
            int i8 = this.f26820b;
            this.f26820b = i8 + 1;
            a aVar2 = new a(bVar, i8);
            this.f26821c.push(aVar2);
            this.f26822d.put(bVar, aVar2);
            for (C5269x.g gVar : bVar.getFields()) {
                if (gVar.getJavaType() == C5269x.g.b.MESSAGE) {
                    a aVar3 = (a) this.f26822d.get(gVar.getMessageType());
                    if (aVar3 == null) {
                        aVar2.f26825c = Math.min(aVar2.f26825c, b(gVar.getMessageType()).f26825c);
                    } else if (aVar3.f26826d == null) {
                        aVar2.f26825c = Math.min(aVar2.f26825c, aVar3.f26825c);
                    }
                }
            }
            if (aVar2.f26824b == aVar2.f26825c) {
                b bVar2 = new b(null);
                do {
                    aVar = (a) this.f26821c.pop();
                    aVar.f26826d = bVar2;
                    bVar2.f26827a.add(aVar.f26823a);
                } while (aVar != aVar2);
                a(bVar2);
            }
            return aVar2;
        }

        public boolean needsIsInitializedCheck(C5269x.b bVar) {
            Boolean bool = (Boolean) this.f26819a.get(bVar);
            if (bool != null) {
                return bool.booleanValue();
            }
            synchronized (this) {
                try {
                    Boolean bool2 = (Boolean) this.f26819a.get(bVar);
                    if (bool2 != null) {
                        return bool2.booleanValue();
                    }
                    return b(bVar).f26826d.f26828b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: com.google.protobuf.v$d$b */
        private static class b {

            /* renamed from: a */
            final List f26827a;

            /* renamed from: b */
            boolean f26828b;

            private b() {
                this.f26827a = new ArrayList();
                this.f26828b = false;
            }

            /* synthetic */ b(a aVar) {
                this();
            }
        }
    }

    /* renamed from: com.google.protobuf.v$e */
    private static final class e {

        /* renamed from: a */
        private Y0[] f26829a;

        private e() {
            this.f26829a = new Y0[2];
        }

        private static Y0 b(Class cls, C5269x.l lVar) {
            String strV = C5252v.v(lVar.getName());
            return new Y0(lVar.getIndex(), C5252v.k(cls, strV + "Case_"), C5252v.k(cls, strV + "_"));
        }

        Y0 a(Class cls, C5269x.l lVar) {
            int index = lVar.getIndex();
            Y0[] y0Arr = this.f26829a;
            if (index >= y0Arr.length) {
                this.f26829a = (Y0[]) Arrays.copyOf(y0Arr, index * 2);
            }
            Y0 y02 = this.f26829a[index];
            if (y02 != null) {
                return y02;
            }
            Y0 y0B = b(cls, lVar);
            this.f26829a[index] = y0B;
            return y0B;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
