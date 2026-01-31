package E3;

import Q7.C0709m;
import Q7.X;
import com.google.gson.Gson;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.o;
import com.google.protobuf.A1;
import com.google.protobuf.AbstractC5235o;
import com.google.protobuf.B;
import com.google.protobuf.C1;
import com.google.protobuf.C5208f;
import com.google.protobuf.C5212g0;
import com.google.protobuf.C5218i0;
import com.google.protobuf.C5223k;
import com.google.protobuf.C5230m0;
import com.google.protobuf.C5234n1;
import com.google.protobuf.C5238p;
import com.google.protobuf.C5240p1;
import com.google.protobuf.C5253v0;
import com.google.protobuf.C5269x;
import com.google.protobuf.C5273z;
import com.google.protobuf.E;
import com.google.protobuf.H0;
import com.google.protobuf.N0;
import com.google.protobuf.N1;
import com.google.protobuf.T;
import com.google.protobuf.X0;
import com.google.protobuf.Z;
import com.google.protobuf.w1;
import com.google.protobuf.z1;
import e3.w;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a */
    private static final Logger f972a = Logger.getLogger(d.class.getName());

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f973a;

        static {
            int[] iArr = new int[C5269x.g.c.values().length];
            f973a = iArr;
            try {
                iArr[C5269x.g.c.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f973a[C5269x.g.c.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f973a[C5269x.g.c.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f973a[C5269x.g.c.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f973a[C5269x.g.c.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f973a[C5269x.g.c.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f973a[C5269x.g.c.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f973a[C5269x.g.c.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f973a[C5269x.g.c.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f973a[C5269x.g.c.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f973a[C5269x.g.c.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f973a[C5269x.g.c.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f973a[C5269x.g.c.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f973a[C5269x.g.c.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f973a[C5269x.g.c.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f973a[C5269x.g.c.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f973a[C5269x.g.c.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f973a[C5269x.g.c.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private static final class b implements h {

        /* renamed from: a */
        private final Appendable f974a;

        /* synthetic */ b(Appendable appendable, a aVar) {
            this(appendable);
        }

        @Override // E3.d.h
        public void print(CharSequence charSequence) throws IOException {
            this.f974a.append(charSequence);
        }

        private b(Appendable appendable) {
            this.f974a = appendable;
        }

        @Override // E3.d.h
        public void indent() {
        }

        @Override // E3.d.h
        public void outdent() {
        }
    }

    public static class c {

        /* renamed from: a */
        private final z1 f975a;

        /* renamed from: b */
        private final i f976b;

        /* renamed from: c */
        private final boolean f977c;

        /* renamed from: d */
        private final int f978d;

        /* synthetic */ c(z1 z1Var, i iVar, boolean z8, int i8, a aVar) {
            this(z1Var, iVar, z8, i8);
        }

        public c ignoringUnknownFields() {
            return new c(this.f975a, this.f976b, true, this.f978d);
        }

        public void merge(String str, H0.a aVar) throws C5230m0 {
            new C0022d(this.f975a, this.f976b, this.f977c, this.f978d).m(str, aVar);
        }

        public c usingTypeRegistry(i iVar) {
            if (this.f976b == i.getEmptyTypeRegistry() && this.f975a == z1.getEmptyTypeRegistry()) {
                return new c(z1.getEmptyTypeRegistry(), iVar, this.f977c, this.f978d);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }

        private c(z1 z1Var, i iVar, boolean z8, int i8) {
            this.f975a = z1Var;
            this.f976b = iVar;
            this.f977c = z8;
            this.f978d = i8;
        }

        public void merge(Reader reader, H0.a aVar) throws IOException {
            new C0022d(this.f975a, this.f976b, this.f977c, this.f978d).l(reader, aVar);
        }

        public c usingTypeRegistry(z1 z1Var) {
            if (this.f976b == i.getEmptyTypeRegistry() && this.f975a == z1.getEmptyTypeRegistry()) {
                return new c(z1Var, this.f976b, this.f977c, this.f978d);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }
    }

    /* renamed from: E3.d$d */
    private static class C0022d {

        /* renamed from: g */
        private static final Map f979g = i();

        /* renamed from: h */
        private static final BigInteger f980h = new BigInteger("FFFFFFFFFFFFFFFF", 16);

        /* renamed from: i */
        private static final BigDecimal f981i;

        /* renamed from: j */
        private static final BigDecimal f982j;

        /* renamed from: k */
        private static final BigDecimal f983k;

        /* renamed from: a */
        private final z1 f984a;

        /* renamed from: b */
        private final i f985b;

        /* renamed from: c */
        private final boolean f986c;

        /* renamed from: d */
        private final int f987d;

        /* renamed from: f */
        private final Map f989f = new HashMap();

        /* renamed from: e */
        private int f988e = 0;

        /* renamed from: E3.d$d$a */
        class a implements i {
            a() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.n(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$b */
        class b implements i {
            b() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.z(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$c */
        class c implements i {
            c() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.x(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$d */
        class C0023d implements i {
            C0023d() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.o(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$e */
        class e implements i {
            e() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) {
                c0022d.q(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$f */
        class f implements i {
            f() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.w(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$g */
        class g implements i {
            g() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.r(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$h */
        class h implements i {
            h() {
            }

            @Override // E3.d.C0022d.i
            public void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
                c0022d.y(iVar, aVar);
            }
        }

        /* renamed from: E3.d$d$i */
        private interface i {
            void merge(C0022d c0022d, com.google.gson.i iVar, H0.a aVar);
        }

        static {
            BigDecimal bigDecimal = new BigDecimal(String.valueOf(1.000001d));
            f981i = bigDecimal;
            f982j = new BigDecimal(String.valueOf(Double.MAX_VALUE)).multiply(bigDecimal);
            f983k = new BigDecimal(String.valueOf(-1.7976931348623157E308d)).multiply(bigDecimal);
        }

        C0022d(z1 z1Var, i iVar, boolean z8, int i8) {
            this.f984a = z1Var;
            this.f985b = iVar;
            this.f986c = z8;
            this.f987d = i8;
        }

        private boolean A(com.google.gson.i iVar) throws C5230m0 {
            if (iVar.getAsString().equals(C0709m.TRUE)) {
                return true;
            }
            if (iVar.getAsString().equals(C0709m.FALSE)) {
                return false;
            }
            throw new C5230m0("Invalid bool value: " + iVar);
        }

        private AbstractC5235o B(com.google.gson.i iVar) {
            try {
                return AbstractC5235o.copyFrom(h3.b.base64().decode(iVar.getAsString()));
            } catch (IllegalArgumentException unused) {
                return AbstractC5235o.copyFrom(h3.b.base64Url().decode(iVar.getAsString()));
            }
        }

        private double C(com.google.gson.i iVar) throws C5230m0 {
            if (iVar.getAsString().equals("NaN")) {
                return Double.NaN;
            }
            if (iVar.getAsString().equals("Infinity")) {
                return Double.POSITIVE_INFINITY;
            }
            if (iVar.getAsString().equals("-Infinity")) {
                return Double.NEGATIVE_INFINITY;
            }
            try {
                BigDecimal bigDecimal = new BigDecimal(iVar.getAsString());
                if (bigDecimal.compareTo(f982j) <= 0 && bigDecimal.compareTo(f983k) >= 0) {
                    return bigDecimal.doubleValue();
                }
                throw new C5230m0("Out of range double value: " + iVar);
            } catch (RuntimeException e8) {
                C5230m0 c5230m0 = new C5230m0("Not a double value: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        private C5269x.f D(C5269x.e eVar, com.google.gson.i iVar) throws C5230m0 {
            String asString = iVar.getAsString();
            C5269x.f fVarFindValueByName = eVar.findValueByName(asString);
            if (fVarFindValueByName == null) {
                try {
                    int iG = G(iVar);
                    fVarFindValueByName = eVar.getFile().getSyntax() == C5269x.h.b.PROTO3 ? eVar.findValueByNumberCreatingIfUnknown(iG) : eVar.findValueByNumber(iG);
                } catch (C5230m0 unused) {
                }
                if (fVarFindValueByName == null && !this.f986c) {
                    throw new C5230m0("Invalid enum value: " + asString + " for enum type: " + eVar.getFullName());
                }
            }
            return fVarFindValueByName;
        }

        private Object E(C5269x.g gVar, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            if (iVar instanceof k) {
                if (gVar.getJavaType() == C5269x.g.b.MESSAGE && gVar.getMessageType().getFullName().equals(N1.getDescriptor().getFullName())) {
                    return aVar.newBuilderForField(gVar).mergeFrom(N1.newBuilder().setNullValueValue(0).build().toByteString()).build();
                }
                if (gVar.getJavaType() == C5269x.g.b.ENUM && gVar.getEnumType().getFullName().equals(X0.getDescriptor().getFullName())) {
                    return gVar.getEnumType().findValueByNumber(0);
                }
                return null;
            }
            if ((iVar instanceof l) && gVar.getType() != C5269x.g.c.MESSAGE && gVar.getType() != C5269x.g.c.GROUP) {
                throw new C5230m0(String.format("Invalid value: %s for expected type: %s", iVar, gVar.getType()));
            }
            switch (a.f973a[gVar.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return Integer.valueOf(G(iVar));
                case 4:
                case 5:
                case 6:
                    return Long.valueOf(H(iVar));
                case 7:
                    return Boolean.valueOf(A(iVar));
                case 8:
                    return Float.valueOf(F(iVar));
                case 9:
                    return Double.valueOf(C(iVar));
                case 10:
                case 11:
                    return Integer.valueOf(J(iVar));
                case 12:
                case 13:
                    return Long.valueOf(K(iVar));
                case 14:
                    return I(iVar);
                case 15:
                    return B(iVar);
                case 16:
                    return D(gVar.getEnumType(), iVar);
                case 17:
                case 18:
                    int i8 = this.f988e;
                    if (i8 >= this.f987d) {
                        throw new C5230m0("Hit recursion limit.");
                    }
                    this.f988e = i8 + 1;
                    H0.a aVarNewBuilderForField = aVar.newBuilderForField(gVar);
                    k(iVar, aVarNewBuilderForField);
                    this.f988e--;
                    return aVarNewBuilderForField.build();
                default:
                    throw new C5230m0("Invalid field type: " + gVar.getType());
            }
        }

        private float F(com.google.gson.i iVar) throws NumberFormatException, C5230m0 {
            if (iVar.getAsString().equals("NaN")) {
                return Float.NaN;
            }
            if (iVar.getAsString().equals("Infinity")) {
                return Float.POSITIVE_INFINITY;
            }
            if (iVar.getAsString().equals("-Infinity")) {
                return Float.NEGATIVE_INFINITY;
            }
            try {
                double d9 = Double.parseDouble(iVar.getAsString());
                if (d9 <= 3.402826869208755E38d && d9 >= -3.402826869208755E38d) {
                    return (float) d9;
                }
                throw new C5230m0("Out of range float value: " + iVar);
            } catch (RuntimeException e8) {
                new C5230m0("Not a float value: " + iVar).initCause(e8);
                throw e8;
            }
        }

        private int G(com.google.gson.i iVar) throws C5230m0 {
            try {
                try {
                    return Integer.parseInt(iVar.getAsString());
                } catch (RuntimeException unused) {
                    return new BigDecimal(iVar.getAsString()).intValueExact();
                }
            } catch (RuntimeException e8) {
                C5230m0 c5230m0 = new C5230m0("Not an int32 value: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        private long H(com.google.gson.i iVar) throws C5230m0 {
            try {
                try {
                    return Long.parseLong(iVar.getAsString());
                } catch (RuntimeException unused) {
                    return new BigDecimal(iVar.getAsString()).longValueExact();
                }
            } catch (RuntimeException e8) {
                C5230m0 c5230m0 = new C5230m0("Not an int64 value: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        private String I(com.google.gson.i iVar) {
            return iVar.getAsString();
        }

        private int J(com.google.gson.i iVar) throws NumberFormatException, C5230m0 {
            try {
                try {
                    long j8 = Long.parseLong(iVar.getAsString());
                    if (j8 >= 0 && j8 <= 4294967295L) {
                        return (int) j8;
                    }
                    throw new C5230m0("Out of range uint32 value: " + iVar);
                } catch (RuntimeException unused) {
                    BigInteger bigIntegerExact = new BigDecimal(iVar.getAsString()).toBigIntegerExact();
                    if (bigIntegerExact.signum() >= 0 && bigIntegerExact.compareTo(new BigInteger("FFFFFFFF", 16)) <= 0) {
                        return bigIntegerExact.intValue();
                    }
                    throw new C5230m0("Out of range uint32 value: " + iVar);
                }
            } catch (RuntimeException e8) {
                C5230m0 c5230m0 = new C5230m0("Not an uint32 value: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        private long K(com.google.gson.i iVar) throws C5230m0 {
            try {
                BigInteger bigIntegerExact = new BigDecimal(iVar.getAsString()).toBigIntegerExact();
                if (bigIntegerExact.compareTo(BigInteger.ZERO) >= 0 && bigIntegerExact.compareTo(f980h) <= 0) {
                    return bigIntegerExact.longValue();
                }
                throw new C5230m0("Out of range uint64 value: " + iVar);
            } catch (RuntimeException e8) {
                C5230m0 c5230m0 = new C5230m0("Not an uint64 value: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        private static Map i() {
            HashMap map = new HashMap();
            map.put(C5208f.getDescriptor().getFullName(), new a());
            b bVar = new b();
            map.put(C5223k.getDescriptor().getFullName(), bVar);
            map.put(C5212g0.getDescriptor().getFullName(), bVar);
            map.put(A1.getDescriptor().getFullName(), bVar);
            map.put(C5218i0.getDescriptor().getFullName(), bVar);
            map.put(C1.getDescriptor().getFullName(), bVar);
            map.put(C5234n1.getDescriptor().getFullName(), bVar);
            map.put(C5238p.getDescriptor().getFullName(), bVar);
            map.put(Z.getDescriptor().getFullName(), bVar);
            map.put(C5273z.getDescriptor().getFullName(), bVar);
            map.put(w1.getDescriptor().getFullName(), new c());
            map.put(B.getDescriptor().getFullName(), new C0023d());
            map.put(T.getDescriptor().getFullName(), new e());
            map.put(C5240p1.getDescriptor().getFullName(), new f());
            map.put(C5253v0.getDescriptor().getFullName(), new g());
            map.put(N1.getDescriptor().getFullName(), new h());
            return map;
        }

        private Map j(C5269x.b bVar) {
            if (this.f989f.containsKey(bVar)) {
                return (Map) this.f989f.get(bVar);
            }
            HashMap map = new HashMap();
            for (C5269x.g gVar : bVar.getFields()) {
                map.put(gVar.getName(), gVar);
                map.put(gVar.getJsonName(), gVar);
            }
            this.f989f.put(bVar, map);
            return map;
        }

        private void k(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            i iVar2 = (i) f979g.get(aVar.getDescriptorForType().getFullName());
            if (iVar2 != null) {
                iVar2.merge(this, iVar, aVar);
            } else {
                t(iVar, aVar, false);
            }
        }

        public void n(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            C5269x.b descriptorForType = aVar.getDescriptorForType();
            C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName("type_url");
            C5269x.g gVarFindFieldByName2 = descriptorForType.findFieldByName("value");
            if (gVarFindFieldByName == null || gVarFindFieldByName2 == null || gVarFindFieldByName.getType() != C5269x.g.c.STRING || gVarFindFieldByName2.getType() != C5269x.g.c.BYTES) {
                throw new C5230m0("Invalid Any type.");
            }
            if (!(iVar instanceof l)) {
                throw new C5230m0("Expect message object but got: " + iVar);
            }
            l lVar = (l) iVar;
            if (lVar.entrySet().isEmpty()) {
                return;
            }
            com.google.gson.i iVar2 = lVar.get("@type");
            if (iVar2 == null) {
                throw new C5230m0("Missing type url when parsing: " + iVar);
            }
            String asString = iVar2.getAsString();
            C5269x.b descriptorForTypeUrl = this.f984a.getDescriptorForTypeUrl(asString);
            if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.f985b.a(asString)) == null) {
                throw new C5230m0("Cannot resolve type: " + asString);
            }
            aVar.setField(gVarFindFieldByName, asString);
            E.c cVarNewBuilderForType = E.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
            i iVar3 = (i) f979g.get(descriptorForTypeUrl.getFullName());
            if (iVar3 != null) {
                com.google.gson.i iVar4 = lVar.get("value");
                if (iVar4 != null) {
                    iVar3.merge(this, iVar4, cVarNewBuilderForType);
                }
            } else {
                t(iVar, cVarNewBuilderForType, true);
            }
            aVar.setField(gVarFindFieldByName2, cVarNewBuilderForType.build().toByteString());
        }

        public void o(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            try {
                aVar.mergeFrom(E3.a.parse(iVar.getAsString()).toByteString());
            } catch (UnsupportedOperationException | ParseException e8) {
                C5230m0 c5230m0 = new C5230m0("Failed to parse duration: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        private void p(C5269x.g gVar, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            if (gVar.isRepeated()) {
                if (aVar.getRepeatedFieldCount(gVar) > 0) {
                    throw new C5230m0("Field " + gVar.getFullName() + " has already been set.");
                }
            } else if (aVar.hasField(gVar)) {
                throw new C5230m0("Field " + gVar.getFullName() + " has already been set.");
            }
            if (gVar.isRepeated() && (iVar instanceof k)) {
                return;
            }
            if (gVar.isMapField()) {
                s(gVar, iVar, aVar);
                return;
            }
            if (gVar.isRepeated()) {
                v(gVar, iVar, aVar);
                return;
            }
            if (gVar.getContainingOneof() != null) {
                u(gVar, iVar, aVar);
                return;
            }
            Object objE = E(gVar, iVar, aVar);
            if (objE != null) {
                aVar.setField(gVar, objE);
            }
        }

        public void q(com.google.gson.i iVar, H0.a aVar) {
            aVar.mergeFrom(E3.c.fromJsonString(iVar.getAsString()).toByteString());
        }

        public void r(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            C5269x.g gVarFindFieldByName = aVar.getDescriptorForType().findFieldByName("values");
            if (gVarFindFieldByName == null) {
                throw new C5230m0("Invalid ListValue type.");
            }
            v(gVarFindFieldByName, iVar, aVar);
        }

        private void s(C5269x.g gVar, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            if (!(iVar instanceof l)) {
                throw new C5230m0("Expect a map object but found: " + iVar);
            }
            C5269x.b messageType = gVar.getMessageType();
            C5269x.g gVarFindFieldByName = messageType.findFieldByName("key");
            C5269x.g gVarFindFieldByName2 = messageType.findFieldByName("value");
            if (gVarFindFieldByName == null || gVarFindFieldByName2 == null) {
                throw new C5230m0("Invalid map field: " + gVar.getFullName());
            }
            for (Map.Entry<String, com.google.gson.i> entry : ((l) iVar).entrySet()) {
                H0.a aVarNewBuilderForField = aVar.newBuilderForField(gVar);
                Object objE = E(gVarFindFieldByName, new o(entry.getKey()), aVarNewBuilderForField);
                Object objE2 = E(gVarFindFieldByName2, entry.getValue(), aVarNewBuilderForField);
                if (objE2 != null) {
                    aVarNewBuilderForField.setField(gVarFindFieldByName, objE);
                    aVarNewBuilderForField.setField(gVarFindFieldByName2, objE2);
                    aVar.addRepeatedField(gVar, aVarNewBuilderForField.build());
                } else if (!this.f986c || gVarFindFieldByName2.getType() != C5269x.g.c.ENUM) {
                    throw new C5230m0("Map value cannot be null.");
                }
            }
        }

        private void t(com.google.gson.i iVar, H0.a aVar, boolean z8) throws C5230m0 {
            if (!(iVar instanceof l)) {
                throw new C5230m0("Expect message object but got: " + iVar);
            }
            Map mapJ = j(aVar.getDescriptorForType());
            for (Map.Entry<String, com.google.gson.i> entry : ((l) iVar).entrySet()) {
                if (!z8 || !entry.getKey().equals("@type")) {
                    C5269x.g gVar = (C5269x.g) mapJ.get(entry.getKey());
                    if (gVar != null) {
                        p(gVar, entry.getValue(), aVar);
                    } else if (!this.f986c) {
                        throw new C5230m0("Cannot find field: " + entry.getKey() + " in message " + aVar.getDescriptorForType().getFullName());
                    }
                }
            }
        }

        private void u(C5269x.g gVar, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            Object objE = E(gVar, iVar, aVar);
            if (objE == null) {
                return;
            }
            if (aVar.getOneofFieldDescriptor(gVar.getContainingOneof()) == null) {
                aVar.setField(gVar, objE);
                return;
            }
            throw new C5230m0("Cannot set field " + gVar.getFullName() + " because another field " + aVar.getOneofFieldDescriptor(gVar.getContainingOneof()).getFullName() + " belonging to the same oneof has already been set ");
        }

        private void v(C5269x.g gVar, com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            if (!(iVar instanceof com.google.gson.f)) {
                throw new C5230m0("Expected an array for " + gVar.getName() + " but found " + iVar);
            }
            com.google.gson.f fVar = (com.google.gson.f) iVar;
            for (int i8 = 0; i8 < fVar.size(); i8++) {
                Object objE = E(gVar, fVar.get(i8), aVar);
                if (objE != null) {
                    aVar.addRepeatedField(gVar, objE);
                } else if (!this.f986c || gVar.getType() != C5269x.g.c.ENUM) {
                    throw new C5230m0("Repeated field elements cannot be null in field: " + gVar.getFullName());
                }
            }
        }

        public void w(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            C5269x.g gVarFindFieldByName = aVar.getDescriptorForType().findFieldByName("fields");
            if (gVarFindFieldByName == null) {
                throw new C5230m0("Invalid Struct type.");
            }
            s(gVarFindFieldByName, iVar, aVar);
        }

        public void x(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            try {
                aVar.mergeFrom(E3.e.parse(iVar.getAsString()).toByteString());
            } catch (UnsupportedOperationException | ParseException e8) {
                C5230m0 c5230m0 = new C5230m0("Failed to parse timestamp: " + iVar);
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }

        public void y(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            C5269x.b descriptorForType = aVar.getDescriptorForType();
            if (iVar instanceof o) {
                o oVar = (o) iVar;
                if (oVar.isBoolean()) {
                    aVar.setField(descriptorForType.findFieldByName("bool_value"), Boolean.valueOf(oVar.getAsBoolean()));
                    return;
                } else if (oVar.isNumber()) {
                    aVar.setField(descriptorForType.findFieldByName("number_value"), Double.valueOf(oVar.getAsDouble()));
                    return;
                } else {
                    aVar.setField(descriptorForType.findFieldByName("string_value"), oVar.getAsString());
                    return;
                }
            }
            if (iVar instanceof l) {
                C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName("struct_value");
                H0.a aVarNewBuilderForField = aVar.newBuilderForField(gVarFindFieldByName);
                k(iVar, aVarNewBuilderForField);
                aVar.setField(gVarFindFieldByName, aVarNewBuilderForField.build());
                return;
            }
            if (iVar instanceof com.google.gson.f) {
                C5269x.g gVarFindFieldByName2 = descriptorForType.findFieldByName("list_value");
                H0.a aVarNewBuilderForField2 = aVar.newBuilderForField(gVarFindFieldByName2);
                k(iVar, aVarNewBuilderForField2);
                aVar.setField(gVarFindFieldByName2, aVarNewBuilderForField2.build());
                return;
            }
            if (iVar instanceof k) {
                aVar.setField(descriptorForType.findFieldByName("null_value"), X0.NULL_VALUE.getValueDescriptor());
                return;
            }
            throw new IllegalStateException("Unexpected json data: " + iVar);
        }

        public void z(com.google.gson.i iVar, H0.a aVar) throws C5230m0 {
            C5269x.b descriptorForType = aVar.getDescriptorForType();
            C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName("value");
            if (gVarFindFieldByName != null) {
                aVar.setField(gVarFindFieldByName, E(gVarFindFieldByName, iVar, aVar));
                return;
            }
            throw new C5230m0("Invalid wrapper type: " + descriptorForType.getFullName());
        }

        void l(Reader reader, H0.a aVar) throws IOException {
            try {
                D3.a aVar2 = new D3.a(reader);
                aVar2.setLenient(false);
                k(n.parseReader(aVar2), aVar);
            } catch (j e8) {
                if (!(e8.getCause() instanceof IOException)) {
                    throw new C5230m0(e8.getMessage(), e8);
                }
                throw ((IOException) e8.getCause());
            } catch (RuntimeException e9) {
                throw new C5230m0(e9.getMessage(), e9);
            }
        }

        void m(String str, H0.a aVar) throws C5230m0 {
            try {
                D3.a aVar2 = new D3.a(new StringReader(str));
                aVar2.setLenient(false);
                k(n.parseReader(aVar2), aVar);
            } catch (RuntimeException e8) {
                C5230m0 c5230m0 = new C5230m0(e8.getMessage());
                c5230m0.initCause(e8);
                throw c5230m0;
            }
        }
    }

    private static final class e implements h {

        /* renamed from: a */
        private final Appendable f990a;

        /* renamed from: b */
        private final StringBuilder f991b;

        /* renamed from: c */
        private boolean f992c;

        /* synthetic */ e(Appendable appendable, a aVar) {
            this(appendable);
        }

        private void a(CharSequence charSequence) throws IOException {
            if (charSequence.length() == 0) {
                return;
            }
            if (this.f992c) {
                this.f992c = false;
                this.f990a.append(this.f991b);
            }
            this.f990a.append(charSequence);
        }

        @Override // E3.d.h
        public void indent() {
            this.f991b.append("  ");
        }

        @Override // E3.d.h
        public void outdent() {
            int length = this.f991b.length();
            if (length < 2) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.f991b.delete(length - 2, length);
        }

        @Override // E3.d.h
        public void print(CharSequence charSequence) throws IOException {
            int length = charSequence.length();
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                if (charSequence.charAt(i9) == '\n') {
                    int i10 = i9 + 1;
                    a(charSequence.subSequence(i8, i10));
                    this.f992c = true;
                    i8 = i10;
                }
            }
            a(charSequence.subSequence(i8, length));
        }

        private e(Appendable appendable) {
            this.f991b = new StringBuilder();
            this.f992c = true;
            this.f990a = appendable;
        }
    }

    public static class f {

        /* renamed from: a */
        private final z1 f993a;

        /* renamed from: b */
        private final i f994b;

        /* renamed from: c */
        private boolean f995c;

        /* renamed from: d */
        private Set f996d;

        /* renamed from: e */
        private final boolean f997e;

        /* renamed from: f */
        private final boolean f998f;

        /* renamed from: g */
        private final boolean f999g;

        /* renamed from: h */
        private final boolean f1000h;

        /* synthetic */ f(z1 z1Var, i iVar, boolean z8, Set set, boolean z9, boolean z10, boolean z11, boolean z12, a aVar) {
            this(z1Var, iVar, z8, set, z9, z10, z11, z12);
        }

        private void a() {
            if (this.f995c || !this.f996d.isEmpty()) {
                throw new IllegalStateException("JsonFormat includingDefaultValueFields has already been set.");
            }
        }

        private void b() {
            if (this.f999g) {
                throw new IllegalStateException("JsonFormat printingEnumsAsInts has already been set.");
            }
        }

        public void appendTo(N0 n02, Appendable appendable) throws C5230m0 {
            new g(this.f993a, this.f994b, this.f995c, this.f996d, this.f997e, appendable, this.f998f, this.f999g, this.f1000h).j(n02);
        }

        public f includingDefaultValueFields() {
            a();
            return new f(this.f993a, this.f994b, true, Collections.emptySet(), this.f997e, this.f998f, this.f999g, this.f1000h);
        }

        public f omittingInsignificantWhitespace() {
            return new f(this.f993a, this.f994b, this.f995c, this.f996d, this.f997e, true, this.f999g, this.f1000h);
        }

        public f preservingProtoFieldNames() {
            return new f(this.f993a, this.f994b, this.f995c, this.f996d, true, this.f998f, this.f999g, this.f1000h);
        }

        public String print(N0 n02) throws C5230m0 {
            try {
                StringBuilder sb = new StringBuilder();
                appendTo(n02, sb);
                return sb.toString();
            } catch (C5230m0 e8) {
                throw e8;
            } catch (IOException e9) {
                throw new IllegalStateException(e9);
            }
        }

        public f printingEnumsAsInts() {
            b();
            return new f(this.f993a, this.f994b, this.f995c, this.f996d, this.f997e, this.f998f, true, this.f1000h);
        }

        public f sortingMapKeys() {
            return new f(this.f993a, this.f994b, this.f995c, this.f996d, this.f997e, this.f998f, this.f999g, true);
        }

        public f usingTypeRegistry(i iVar) {
            if (this.f994b == i.getEmptyTypeRegistry() && this.f993a == z1.getEmptyTypeRegistry()) {
                return new f(z1.getEmptyTypeRegistry(), iVar, this.f995c, this.f996d, this.f997e, this.f998f, this.f999g, this.f1000h);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }

        private f(z1 z1Var, i iVar, boolean z8, Set set, boolean z9, boolean z10, boolean z11, boolean z12) {
            this.f993a = z1Var;
            this.f994b = iVar;
            this.f995c = z8;
            this.f996d = set;
            this.f997e = z9;
            this.f998f = z10;
            this.f999g = z11;
            this.f1000h = z12;
        }

        public f includingDefaultValueFields(Set<C5269x.g> set) {
            w.checkArgument((set == null || set.isEmpty()) ? false : true, "Non-empty Set must be supplied for includingDefaultValueFields.");
            a();
            return new f(this.f993a, this.f994b, false, Collections.unmodifiableSet(new HashSet(set)), this.f997e, this.f998f, this.f999g, this.f1000h);
        }

        public f usingTypeRegistry(z1 z1Var) {
            if (this.f994b == i.getEmptyTypeRegistry() && this.f993a == z1.getEmptyTypeRegistry()) {
                return new f(z1Var, this.f994b, this.f995c, this.f996d, this.f997e, this.f998f, this.f999g, this.f1000h);
            }
            throw new IllegalArgumentException("Only one registry is allowed.");
        }
    }

    private static final class g {

        /* renamed from: l */
        private static final Map f1001l = i();

        /* renamed from: a */
        private final z1 f1002a;

        /* renamed from: b */
        private final i f1003b;

        /* renamed from: c */
        private final boolean f1004c;

        /* renamed from: d */
        private final Set f1005d;

        /* renamed from: e */
        private final boolean f1006e;

        /* renamed from: f */
        private final boolean f1007f;

        /* renamed from: g */
        private final boolean f1008g;

        /* renamed from: h */
        private final h f1009h;

        /* renamed from: i */
        private final Gson f1010i = j.f1014a;

        /* renamed from: j */
        private final CharSequence f1011j;

        /* renamed from: k */
        private final CharSequence f1012k;

        class a implements k {
            a() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) throws C5230m0 {
                gVar.l(n02);
            }
        }

        class b implements k {
            b() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) throws C5230m0 {
                gVar.x(n02);
            }
        }

        class c implements k {
            c() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) {
                gVar.v(n02);
            }
        }

        /* renamed from: E3.d$g$d */
        class C0024d implements k {
            C0024d() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) {
                gVar.m(n02);
            }
        }

        class e implements k {
            e() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) {
                gVar.o(n02);
            }
        }

        class f implements k {
            f() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) throws C5230m0 {
                gVar.u(n02);
            }
        }

        /* renamed from: E3.d$g$g */
        class C0025g implements k {
            C0025g() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) throws C5230m0 {
                gVar.w(n02);
            }
        }

        class h implements k {
            h() {
            }

            @Override // E3.d.g.k
            public void print(g gVar, N0 n02) throws C5230m0 {
                gVar.p(n02);
            }
        }

        class i implements Comparator {
            i() {
            }

            @Override // java.util.Comparator
            public int compare(Object obj, Object obj2) {
                return AbstractC5235o.unsignedLexicographicalComparator().compare(AbstractC5235o.copyFromUtf8((String) obj), AbstractC5235o.copyFromUtf8((String) obj2));
            }
        }

        private static class j {

            /* renamed from: a */
            private static final Gson f1014a = new com.google.gson.e().create();
        }

        private interface k {
            void print(g gVar, N0 n02);
        }

        g(z1 z1Var, i iVar, boolean z8, Set set, boolean z9, Appendable appendable, boolean z10, boolean z11, boolean z12) {
            this.f1002a = z1Var;
            this.f1003b = iVar;
            this.f1004c = z8;
            this.f1005d = set;
            this.f1006e = z9;
            this.f1007f = z11;
            this.f1008g = z12;
            if (z10) {
                this.f1009h = new b(appendable, null);
                this.f1011j = "";
                this.f1012k = "";
            } else {
                this.f1009h = new e(appendable, null);
                this.f1011j = X.SPACE;
                this.f1012k = X.LF;
            }
        }

        private static Map i() {
            HashMap map = new HashMap();
            map.put(C5208f.getDescriptor().getFullName(), new a());
            b bVar = new b();
            map.put(C5223k.getDescriptor().getFullName(), bVar);
            map.put(C5212g0.getDescriptor().getFullName(), bVar);
            map.put(A1.getDescriptor().getFullName(), bVar);
            map.put(C5218i0.getDescriptor().getFullName(), bVar);
            map.put(C1.getDescriptor().getFullName(), bVar);
            map.put(C5234n1.getDescriptor().getFullName(), bVar);
            map.put(C5238p.getDescriptor().getFullName(), bVar);
            map.put(Z.getDescriptor().getFullName(), bVar);
            map.put(C5273z.getDescriptor().getFullName(), bVar);
            map.put(w1.getDescriptor().getFullName(), new c());
            map.put(B.getDescriptor().getFullName(), new C0024d());
            map.put(T.getDescriptor().getFullName(), new e());
            map.put(C5240p1.getDescriptor().getFullName(), new f());
            map.put(N1.getDescriptor().getFullName(), new C0025g());
            map.put(C5253v0.getDescriptor().getFullName(), new h());
            return map;
        }

        private void k(N0 n02, String str) throws C5230m0 {
            boolean z8;
            Map<C5269x.g, Object> allFields;
            this.f1009h.print("{" + ((Object) this.f1012k));
            this.f1009h.indent();
            if (str != null) {
                this.f1009h.print("\"@type\":" + ((Object) this.f1011j) + this.f1010i.toJson(str));
                z8 = true;
            } else {
                z8 = false;
            }
            if (this.f1004c || !this.f1005d.isEmpty()) {
                TreeMap treeMap = new TreeMap(n02.getAllFields());
                for (C5269x.g gVar : n02.getDescriptorForType().getFields()) {
                    if (gVar.isOptional()) {
                        if (gVar.getJavaType() != C5269x.g.b.MESSAGE || n02.hasField(gVar)) {
                            if (gVar.getContainingOneof() == null || n02.hasField(gVar)) {
                            }
                        }
                    }
                    if (!treeMap.containsKey(gVar) && (this.f1004c || this.f1005d.contains(gVar))) {
                        treeMap.put(gVar, n02.getField(gVar));
                    }
                }
                allFields = treeMap;
            } else {
                allFields = n02.getAllFields();
            }
            for (Map.Entry<C5269x.g, Object> entry : allFields.entrySet()) {
                if (z8) {
                    this.f1009h.print("," + ((Object) this.f1012k));
                } else {
                    z8 = true;
                }
                n(entry.getKey(), entry.getValue());
            }
            if (z8) {
                this.f1009h.print(this.f1012k);
            }
            this.f1009h.outdent();
            this.f1009h.print("}");
        }

        public void l(N0 n02) throws C5230m0 {
            if (C5208f.getDefaultInstance().equals(n02)) {
                this.f1009h.print("{}");
                return;
            }
            C5269x.b descriptorForType = n02.getDescriptorForType();
            C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName("type_url");
            C5269x.g gVarFindFieldByName2 = descriptorForType.findFieldByName("value");
            if (gVarFindFieldByName == null || gVarFindFieldByName2 == null || gVarFindFieldByName.getType() != C5269x.g.c.STRING || gVarFindFieldByName2.getType() != C5269x.g.c.BYTES) {
                throw new C5230m0("Invalid Any type.");
            }
            String str = (String) n02.getField(gVarFindFieldByName);
            C5269x.b descriptorForTypeUrl = this.f1002a.getDescriptorForTypeUrl(str);
            if (descriptorForTypeUrl == null && (descriptorForTypeUrl = this.f1003b.a(str)) == null) {
                throw new C5230m0("Cannot find type for url: " + str);
            }
            H0 h02 = (H0) E.getDefaultInstance(descriptorForTypeUrl).getParserForType().parseFrom((AbstractC5235o) n02.getField(gVarFindFieldByName2));
            k kVar = (k) f1001l.get(d.e(str));
            if (kVar == null) {
                k(h02, str);
                return;
            }
            this.f1009h.print("{" + ((Object) this.f1012k));
            this.f1009h.indent();
            this.f1009h.print("\"@type\":" + ((Object) this.f1011j) + this.f1010i.toJson(str) + "," + ((Object) this.f1012k));
            h hVar = this.f1009h;
            StringBuilder sb = new StringBuilder();
            sb.append("\"value\":");
            sb.append((Object) this.f1011j);
            hVar.print(sb.toString());
            kVar.print(this, h02);
            this.f1009h.print(this.f1012k);
            this.f1009h.outdent();
            this.f1009h.print("}");
        }

        public void m(N0 n02) {
            B from = B.parseFrom(y(n02));
            this.f1009h.print("\"" + E3.a.toString(from) + "\"");
        }

        private void n(C5269x.g gVar, Object obj) throws C5230m0 {
            if (this.f1006e) {
                this.f1009h.print("\"" + gVar.getName() + "\":" + ((Object) this.f1011j));
            } else {
                this.f1009h.print("\"" + gVar.getJsonName() + "\":" + ((Object) this.f1011j));
            }
            if (gVar.isMapField()) {
                q(gVar, obj);
            } else if (gVar.isRepeated()) {
                r(gVar, obj);
            } else {
                s(gVar, obj);
            }
        }

        public void o(N0 n02) {
            T from = T.parseFrom(y(n02));
            this.f1009h.print("\"" + E3.c.toJsonString(from) + "\"");
        }

        public void p(N0 n02) throws C5230m0 {
            C5269x.g gVarFindFieldByName = n02.getDescriptorForType().findFieldByName("values");
            if (gVarFindFieldByName == null) {
                throw new C5230m0("Invalid ListValue type.");
            }
            r(gVarFindFieldByName, n02.getField(gVarFindFieldByName));
        }

        private void q(C5269x.g gVar, Object obj) throws C5230m0 {
            C5269x.b messageType = gVar.getMessageType();
            C5269x.g gVarFindFieldByName = messageType.findFieldByName("key");
            C5269x.g gVarFindFieldByName2 = messageType.findFieldByName("value");
            if (gVarFindFieldByName == null || gVarFindFieldByName2 == null) {
                throw new C5230m0("Invalid map field.");
            }
            this.f1009h.print("{" + ((Object) this.f1012k));
            this.f1009h.indent();
            Collection<H0> collectionValues = (List) obj;
            if (this.f1008g && !collectionValues.isEmpty()) {
                TreeMap treeMap = new TreeMap(gVarFindFieldByName.getType() == C5269x.g.c.STRING ? new i() : null);
                for (Object obj2 : collectionValues) {
                    treeMap.put(((H0) obj2).getField(gVarFindFieldByName), obj2);
                }
                collectionValues = treeMap.values();
            }
            boolean z8 = false;
            for (H0 h02 : collectionValues) {
                Object field = h02.getField(gVarFindFieldByName);
                Object field2 = h02.getField(gVarFindFieldByName2);
                if (z8) {
                    this.f1009h.print("," + ((Object) this.f1012k));
                } else {
                    z8 = true;
                }
                t(gVarFindFieldByName, field, true);
                this.f1009h.print(":" + ((Object) this.f1011j));
                s(gVarFindFieldByName2, field2);
            }
            if (z8) {
                this.f1009h.print(this.f1012k);
            }
            this.f1009h.outdent();
            this.f1009h.print("}");
        }

        private void r(C5269x.g gVar, Object obj) {
            this.f1009h.print("[");
            boolean z8 = false;
            for (Object obj2 : (List) obj) {
                if (z8) {
                    this.f1009h.print("," + ((Object) this.f1011j));
                } else {
                    z8 = true;
                }
                s(gVar, obj2);
            }
            this.f1009h.print("]");
        }

        private void s(C5269x.g gVar, Object obj) {
            t(gVar, obj, false);
        }

        private void t(C5269x.g gVar, Object obj, boolean z8) {
            switch (a.f973a[gVar.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    if (z8) {
                        this.f1009h.print("\"");
                    }
                    this.f1009h.print(((Integer) obj).toString());
                    if (z8) {
                        this.f1009h.print("\"");
                        break;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    this.f1009h.print("\"" + ((Long) obj).toString() + "\"");
                    break;
                case 7:
                    if (z8) {
                        this.f1009h.print("\"");
                    }
                    if (((Boolean) obj).booleanValue()) {
                        this.f1009h.print(C0709m.TRUE);
                    } else {
                        this.f1009h.print(C0709m.FALSE);
                    }
                    if (z8) {
                        this.f1009h.print("\"");
                        break;
                    }
                    break;
                case 8:
                    Float f8 = (Float) obj;
                    if (!f8.isNaN()) {
                        if (!f8.isInfinite()) {
                            if (z8) {
                                this.f1009h.print("\"");
                            }
                            this.f1009h.print(f8.toString());
                            if (z8) {
                                this.f1009h.print("\"");
                                break;
                            }
                        } else if (f8.floatValue() >= 0.0f) {
                            this.f1009h.print("\"Infinity\"");
                            break;
                        } else {
                            this.f1009h.print("\"-Infinity\"");
                            break;
                        }
                    } else {
                        this.f1009h.print("\"NaN\"");
                        break;
                    }
                    break;
                case 9:
                    Double d9 = (Double) obj;
                    if (!d9.isNaN()) {
                        if (!d9.isInfinite()) {
                            if (z8) {
                                this.f1009h.print("\"");
                            }
                            this.f1009h.print(d9.toString());
                            if (z8) {
                                this.f1009h.print("\"");
                                break;
                            }
                        } else if (d9.doubleValue() >= 0.0d) {
                            this.f1009h.print("\"Infinity\"");
                            break;
                        } else {
                            this.f1009h.print("\"-Infinity\"");
                            break;
                        }
                    } else {
                        this.f1009h.print("\"NaN\"");
                        break;
                    }
                    break;
                case 10:
                case 11:
                    if (z8) {
                        this.f1009h.print("\"");
                    }
                    this.f1009h.print(d.f(((Integer) obj).intValue()));
                    if (z8) {
                        this.f1009h.print("\"");
                        break;
                    }
                    break;
                case 12:
                case 13:
                    this.f1009h.print("\"" + d.g(((Long) obj).longValue()) + "\"");
                    break;
                case 14:
                    this.f1009h.print(this.f1010i.toJson(obj));
                    break;
                case 15:
                    this.f1009h.print("\"");
                    this.f1009h.print(h3.b.base64().encode(((AbstractC5235o) obj).toByteArray()));
                    this.f1009h.print("\"");
                    break;
                case 16:
                    if (!gVar.getEnumType().getFullName().equals("google.protobuf.NullValue")) {
                        if (!this.f1007f) {
                            C5269x.f fVar = (C5269x.f) obj;
                            if (fVar.getIndex() != -1) {
                                this.f1009h.print("\"" + fVar.getName() + "\"");
                                break;
                            }
                        }
                        this.f1009h.print(String.valueOf(((C5269x.f) obj).getNumber()));
                        break;
                    } else {
                        if (z8) {
                            this.f1009h.print("\"");
                        }
                        this.f1009h.print("null");
                        if (z8) {
                            this.f1009h.print("\"");
                            break;
                        }
                    }
                    break;
                case 17:
                case 18:
                    j((H0) obj);
                    break;
            }
        }

        public void u(N0 n02) throws C5230m0 {
            C5269x.g gVarFindFieldByName = n02.getDescriptorForType().findFieldByName("fields");
            if (gVarFindFieldByName == null) {
                throw new C5230m0("Invalid Struct type.");
            }
            q(gVarFindFieldByName, n02.getField(gVarFindFieldByName));
        }

        public void v(N0 n02) {
            w1 from = w1.parseFrom(y(n02));
            this.f1009h.print("\"" + E3.e.toString(from) + "\"");
        }

        public void w(N0 n02) throws C5230m0 {
            Map<C5269x.g, Object> allFields = n02.getAllFields();
            if (allFields.isEmpty()) {
                this.f1009h.print("null");
                return;
            }
            if (allFields.size() != 1) {
                throw new C5230m0("Invalid Value type.");
            }
            for (Map.Entry<C5269x.g, Object> entry : allFields.entrySet()) {
                C5269x.g key = entry.getKey();
                if (key.getType() == C5269x.g.c.DOUBLE) {
                    Double d9 = (Double) entry.getValue();
                    if (d9.isNaN() || d9.isInfinite()) {
                        throw new IllegalArgumentException("google.protobuf.Value cannot encode double values for infinity or nan, because they would be parsed as a string.");
                    }
                }
                s(key, entry.getValue());
            }
        }

        public void x(N0 n02) throws C5230m0 {
            C5269x.g gVarFindFieldByName = n02.getDescriptorForType().findFieldByName("value");
            if (gVarFindFieldByName == null) {
                throw new C5230m0("Invalid Wrapper type.");
            }
            s(gVarFindFieldByName, n02.getField(gVarFindFieldByName));
        }

        private AbstractC5235o y(N0 n02) {
            return n02 instanceof H0 ? ((H0) n02).toByteString() : ((H0.a) n02).build().toByteString();
        }

        void j(N0 n02) throws C5230m0 {
            k kVar = (k) f1001l.get(n02.getDescriptorForType().getFullName());
            if (kVar != null) {
                kVar.print(this, n02);
            } else {
                k(n02, null);
            }
        }
    }

    interface h {
        void indent();

        void outdent();

        void print(CharSequence charSequence);
    }

    public static class i {

        /* renamed from: a */
        private final Map f1015a;

        public static class a {

            /* renamed from: a */
            private final Set f1016a;

            /* renamed from: b */
            private final Map f1017b;

            /* renamed from: c */
            private boolean f1018c;

            /* synthetic */ a(a aVar) {
                this();
            }

            private void a(C5269x.h hVar) {
                if (this.f1016a.add(hVar.getFullName())) {
                    Iterator<C5269x.h> it = hVar.getDependencies().iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                    Iterator<C5269x.b> it2 = hVar.getMessageTypes().iterator();
                    while (it2.hasNext()) {
                        b(it2.next());
                    }
                }
            }

            private void b(C5269x.b bVar) {
                Iterator<C5269x.b> it = bVar.getNestedTypes().iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                if (!this.f1017b.containsKey(bVar.getFullName())) {
                    this.f1017b.put(bVar.getFullName(), bVar);
                    return;
                }
                d.f972a.warning("Type " + bVar.getFullName() + " is added multiple times.");
            }

            public a add(C5269x.b bVar) {
                if (this.f1018c) {
                    throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
                }
                a(bVar.getFile());
                return this;
            }

            public i build() {
                this.f1018c = true;
                return new i(this.f1017b, null);
            }

            private a() {
                this.f1016a = new HashSet();
                this.f1017b = new HashMap();
                this.f1018c = false;
            }

            public a add(Iterable<C5269x.b> iterable) {
                if (!this.f1018c) {
                    Iterator<C5269x.b> it = iterable.iterator();
                    while (it.hasNext()) {
                        a(it.next().getFile());
                    }
                    return this;
                }
                throw new IllegalStateException("A TypeRegistry.Builder can only be used once.");
            }
        }

        private static class b {

            /* renamed from: a */
            private static final i f1019a = new i(Collections.emptyMap(), null);
        }

        /* synthetic */ i(Map map, a aVar) {
            this(map);
        }

        public static i getEmptyTypeRegistry() {
            return b.f1019a;
        }

        public static a newBuilder() {
            return new a(null);
        }

        C5269x.b a(String str) {
            return find(d.e(str));
        }

        public C5269x.b find(String str) {
            return (C5269x.b) this.f1015a.get(str);
        }

        private i(Map map) {
            this.f1015a = map;
        }
    }

    public static String e(String str) throws C5230m0 {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new C5230m0("Invalid type url found: " + str);
    }

    public static String f(int i8) {
        return i8 >= 0 ? Integer.toString(i8) : Long.toString(i8 & 4294967295L);
    }

    public static String g(long j8) {
        return j8 >= 0 ? Long.toString(j8) : BigInteger.valueOf(j8 & Long.MAX_VALUE).setBit(63).toString();
    }

    public static c parser() {
        return new c(z1.getEmptyTypeRegistry(), i.getEmptyTypeRegistry(), false, 100, null);
    }

    public static f printer() {
        return new f(z1.getEmptyTypeRegistry(), i.getEmptyTypeRegistry(), false, Collections.emptySet(), false, false, false, false, null);
    }
}
