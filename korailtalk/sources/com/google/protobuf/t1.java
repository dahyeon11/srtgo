package com.google.protobuf;

import Q7.C0709m;
import com.google.protobuf.C5269x;
import com.google.protobuf.E;
import com.google.protobuf.G1;
import com.google.protobuf.H0;
import com.google.protobuf.K;
import com.google.protobuf.O0;
import com.j256.ormlite.stmt.query.SimpleComparison;
import e3.AbstractC5358c;
import java.io.IOException;
import java.lang.Character;
import java.math.BigInteger;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class t1 {

    /* renamed from: a */
    private static final Logger f26758a = Logger.getLogger(t1.class.getName());

    /* renamed from: b */
    private static final d f26759b = d.newBuilder().build();

    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26760a;

        /* renamed from: b */
        static final /* synthetic */ int[] f26761b;

        static {
            int[] iArr = new int[C5269x.g.c.values().length];
            f26761b = iArr;
            try {
                iArr[C5269x.g.c.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26761b[C5269x.g.c.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26761b[C5269x.g.c.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26761b[C5269x.g.c.INT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26761b[C5269x.g.c.SINT64.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26761b[C5269x.g.c.SFIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26761b[C5269x.g.c.BOOL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f26761b[C5269x.g.c.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f26761b[C5269x.g.c.DOUBLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f26761b[C5269x.g.c.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f26761b[C5269x.g.c.FIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f26761b[C5269x.g.c.UINT64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f26761b[C5269x.g.c.FIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f26761b[C5269x.g.c.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f26761b[C5269x.g.c.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f26761b[C5269x.g.c.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f26761b[C5269x.g.c.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f26761b[C5269x.g.c.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[C5269x.g.b.values().length];
            f26760a = iArr2;
            try {
                iArr2[C5269x.g.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f26760a[C5269x.g.b.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f26760a[C5269x.g.b.INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f26760a[C5269x.g.b.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    public static class b extends IOException {
        b(String str) {
            super(str);
        }
    }

    public static class c extends IOException {

        /* renamed from: a */
        private final int f26762a;

        /* renamed from: b */
        private final int f26763b;

        public c(String str) {
            this(-1, -1, str);
        }

        public int getColumn() {
            return this.f26763b;
        }

        public int getLine() {
            return this.f26762a;
        }

        public c(int i8, int i9, String str) {
            super(Integer.toString(i8) + ":" + i9 + ": " + str);
            this.f26762a = i8;
            this.f26763b = i9;
        }
    }

    public static class d {

        /* renamed from: a */
        private final z1 f26764a;

        /* renamed from: b */
        private final boolean f26765b;

        /* renamed from: c */
        private final boolean f26766c;

        /* renamed from: d */
        private final boolean f26767d;

        /* renamed from: e */
        private final b f26768e;

        public static class a {

            /* renamed from: a */
            private boolean f26769a = false;

            /* renamed from: b */
            private boolean f26770b = false;

            /* renamed from: c */
            private boolean f26771c = false;

            /* renamed from: d */
            private b f26772d = b.ALLOW_SINGULAR_OVERWRITES;

            /* renamed from: e */
            private z1 f26773e = z1.getEmptyTypeRegistry();

            public d build() {
                return new d(this.f26773e, this.f26769a, this.f26770b, this.f26771c, this.f26772d, null, null);
            }

            public a setAllowUnknownExtensions(boolean z8) {
                this.f26771c = z8;
                return this;
            }

            public a setAllowUnknownFields(boolean z8) {
                this.f26769a = z8;
                return this;
            }

            public a setParseInfoTreeBuilder(v1 v1Var) {
                return this;
            }

            public a setSingularOverwritePolicy(b bVar) {
                this.f26772d = bVar;
                return this;
            }

            public a setTypeRegistry(z1 z1Var) {
                this.f26773e = z1Var;
                return this;
            }
        }

        public enum b {
            ALLOW_SINGULAR_OVERWRITES,
            FORBID_SINGULAR_OVERWRITES
        }

        static final class c {

            /* renamed from: a */
            final String f26775a;

            /* renamed from: b */
            final a f26776b;

            enum a {
                FIELD,
                EXTENSION
            }

            c(String str, a aVar) {
                this.f26775a = str;
                this.f26776b = aVar;
            }
        }

        /* synthetic */ d(z1 z1Var, boolean z8, boolean z9, boolean z10, b bVar, v1 v1Var, a aVar) {
            this(z1Var, z8, z9, z10, bVar, v1Var);
        }

        private void a(List list) throws c {
            int i8;
            if (list.isEmpty()) {
                return;
            }
            StringBuilder sb = new StringBuilder("Input contains unknown fields and/or extensions:");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                sb.append('\n');
                sb.append(cVar.f26775a);
            }
            if (this.f26765b) {
                t1.f26758a.warning(sb.toString());
                return;
            }
            if (this.f26767d) {
                Iterator it2 = list.iterator();
                i8 = 0;
                while (it2.hasNext()) {
                    if (((c) it2.next()).f26776b != c.a.FIELD) {
                        i8++;
                    }
                }
                t1.f26758a.warning(sb.toString());
                return;
            }
            i8 = 0;
            String[] strArrSplit = ((c) list.get(i8)).f26775a.split(":");
            throw new c(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), sb.toString());
        }

        private void b(g gVar, K k8, O0.e eVar, C5269x.g gVar2, K.c cVar, v1 v1Var, List list) throws c {
            String str;
            Object objFinish;
            if (this.f26768e == b.FORBID_SINGULAR_OVERWRITES && !gVar2.isRepeated()) {
                if (eVar.hasField(gVar2)) {
                    throw gVar.u("Non-repeated field \"" + gVar2.getFullName() + "\" cannot be overwritten.");
                }
                if (gVar2.getContainingOneof() != null && eVar.hasOneof(gVar2.getContainingOneof())) {
                    C5269x.l containingOneof = gVar2.getContainingOneof();
                    throw gVar.u("Field \"" + gVar2.getFullName() + "\" is specified along with field \"" + eVar.getOneofFieldDescriptor(containingOneof).getFullName() + "\", another member of oneof \"" + containingOneof.getName() + "\".");
                }
            }
            Object objValueOf = null;
            if (gVar2.getJavaType() == C5269x.g.b.MESSAGE) {
                if (gVar.w(SimpleComparison.LESS_THAN_OPERATION)) {
                    str = SimpleComparison.GREATER_THAN_OPERATION;
                } else {
                    gVar.c("{");
                    str = "}";
                }
                String str2 = str;
                if (gVar2.getMessageType().getFullName().equals("google.protobuf.Any") && gVar.w("[")) {
                    O0.e eVarNewMergeTargetForField = eVar.newMergeTargetForField(gVar2, E.getDefaultInstance(gVar2.getMessageType()));
                    g(gVar, k8, eVarNewMergeTargetForField, v1Var, list, gVar2.getMessageType());
                    objFinish = eVarNewMergeTargetForField.finish();
                    gVar.c(str2);
                } else {
                    O0.e eVarNewMergeTargetForField2 = eVar.newMergeTargetForField(gVar2, cVar != null ? cVar.defaultInstance : null);
                    while (!gVar.w(str2)) {
                        if (gVar.b()) {
                            throw gVar.t("Expected \"" + str2 + "\".");
                        }
                        h(gVar, k8, eVarNewMergeTargetForField2, v1Var, list);
                    }
                    objFinish = eVarNewMergeTargetForField2.finish();
                }
                objValueOf = objFinish;
            } else {
                switch (a.f26761b[gVar2.getType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        objValueOf = Integer.valueOf(gVar.g());
                        break;
                    case 4:
                    case 5:
                    case 6:
                        objValueOf = Long.valueOf(gVar.h());
                        break;
                    case 7:
                        objValueOf = Boolean.valueOf(gVar.consumeBoolean());
                        break;
                    case 8:
                        objValueOf = Float.valueOf(gVar.consumeFloat());
                        break;
                    case 9:
                        objValueOf = Double.valueOf(gVar.consumeDouble());
                        break;
                    case 10:
                    case 11:
                        objValueOf = Integer.valueOf(gVar.i());
                        break;
                    case 12:
                    case 13:
                        objValueOf = Long.valueOf(gVar.j());
                        break;
                    case 14:
                        objValueOf = gVar.consumeString();
                        break;
                    case 15:
                        objValueOf = gVar.d();
                        break;
                    case 16:
                        C5269x.e enumType = gVar2.getEnumType();
                        if (gVar.r()) {
                            int iG = gVar.g();
                            objValueOf = enumType.findValueByNumber(iG);
                            if (objValueOf == null) {
                                String str3 = "Enum type \"" + enumType.getFullName() + "\" has no value with number " + iG + Q7.C.PACKAGE_SEPARATOR_CHAR;
                                if (this.f26766c) {
                                    t1.f26758a.warning(str3);
                                    return;
                                }
                                throw gVar.u("Enum type \"" + enumType.getFullName() + "\" has no value with number " + iG + Q7.C.PACKAGE_SEPARATOR_CHAR);
                            }
                        } else {
                            String strF = gVar.f();
                            objValueOf = enumType.findValueByName(strF);
                            if (objValueOf == null) {
                                String str4 = "Enum type \"" + enumType.getFullName() + "\" has no value named \"" + strF + "\".";
                                if (!this.f26766c) {
                                    throw gVar.u(str4);
                                }
                                t1.f26758a.warning(str4);
                                return;
                            }
                        }
                        break;
                    case 17:
                    case 18:
                        throw new RuntimeException("Can't get here.");
                }
            }
            if (gVar2.isRepeated()) {
                eVar.addRepeatedField(gVar2, objValueOf);
            } else {
                eVar.setField(gVar2, objValueOf);
            }
        }

        private void c(g gVar, K k8, O0.e eVar, C5269x.g gVar2, K.c cVar, v1 v1Var, List list) throws c {
            if (!gVar2.isRepeated() || !gVar.w("[")) {
                b(gVar, k8, eVar, gVar2, cVar, v1Var, list);
            } else {
                if (gVar.w("]")) {
                    return;
                }
                while (true) {
                    b(gVar, k8, eVar, gVar2, cVar, v1Var, list);
                    if (gVar.w("]")) {
                        return;
                    } else {
                        gVar.c(",");
                    }
                }
            }
        }

        private String d(g gVar) throws c {
            if (!gVar.w("[")) {
                return gVar.f();
            }
            String strF = gVar.f();
            while (gVar.w(".")) {
                strF = strF + "." + gVar.f();
            }
            if (gVar.w("/")) {
                strF = strF + "/" + gVar.f();
                while (gVar.w(".")) {
                    strF = strF + "." + gVar.f();
                }
            }
            gVar.c("]");
            return strF;
        }

        private void e(g gVar, C5269x.b bVar, String str) {
        }

        private void f(g gVar, C5269x.b bVar) throws c {
            boolean zW = gVar.w(":");
            if (gVar.q("[")) {
                l(gVar, zW, bVar);
            } else if (!zW || gVar.q("{") || gVar.q(SimpleComparison.LESS_THAN_OPERATION)) {
                k(gVar, bVar);
            } else {
                m(gVar);
            }
        }

        private void g(g gVar, K k8, O0.e eVar, v1 v1Var, List list, C5269x.b bVar) throws c {
            String str;
            StringBuilder sb = new StringBuilder();
            while (true) {
                sb.append(gVar.f());
                if (gVar.w("]")) {
                    e(gVar, bVar, sb.toString());
                    gVar.w(":");
                    if (gVar.w(SimpleComparison.LESS_THAN_OPERATION)) {
                        str = SimpleComparison.GREATER_THAN_OPERATION;
                    } else {
                        gVar.c("{");
                        str = "}";
                    }
                    String str2 = str;
                    String string = sb.toString();
                    try {
                        C5269x.b descriptorForTypeUrl = this.f26764a.getDescriptorForTypeUrl(string);
                        if (descriptorForTypeUrl == null) {
                            throw gVar.t("Unable to parse Any of type: " + string + ". Please make sure that the TypeRegistry contains the descriptors for the given types.");
                        }
                        E.c cVarNewBuilderForType = E.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                        O0.b bVar2 = new O0.b(cVarNewBuilderForType);
                        while (!gVar.w(str2)) {
                            h(gVar, k8, bVar2, v1Var, list);
                        }
                        eVar.setField(bVar.findFieldByName("type_url"), sb.toString());
                        eVar.setField(bVar.findFieldByName("value"), cVarNewBuilderForType.build().toByteString());
                        return;
                    } catch (C5230m0 unused) {
                        throw gVar.t("Invalid valid type URL. Found: " + string);
                    }
                }
                if (gVar.w("/")) {
                    sb.append("/");
                } else {
                    if (!gVar.w(".")) {
                        throw gVar.u("Expected a valid type URL.");
                    }
                    sb.append(".");
                }
            }
        }

        private void h(g gVar, K k8, O0.e eVar, v1 v1Var, List list) throws c {
            String strF;
            K.c cVar;
            gVar.m();
            gVar.l();
            C5269x.b descriptorForType = eVar.getDescriptorForType();
            if ("google.protobuf.Any".equals(descriptorForType.getFullName()) && gVar.w("[")) {
                g(gVar, k8, eVar, v1Var, list, descriptorForType);
                return;
            }
            C5269x.g gVar2 = null;
            if (gVar.w("[")) {
                StringBuilder sb = new StringBuilder(gVar.f());
                while (gVar.w(".")) {
                    sb.append(Q7.C.PACKAGE_SEPARATOR_CHAR);
                    sb.append(gVar.f());
                }
                strF = sb.toString();
                K.c cVarFindExtensionByName = eVar.findExtensionByName(k8, strF);
                if (cVarFindExtensionByName == null) {
                    list.add(new c((gVar.o() + 1) + ":" + (gVar.n() + 1) + ":\t" + descriptorForType.getFullName() + ".[" + strF + "]", c.a.EXTENSION));
                } else {
                    if (cVarFindExtensionByName.descriptor.getContainingType() != descriptorForType) {
                        throw gVar.u("Extension \"" + strF + "\" does not extend message type \"" + descriptorForType.getFullName() + "\".");
                    }
                    gVar2 = cVarFindExtensionByName.descriptor;
                }
                gVar.c("]");
                cVar = cVarFindExtensionByName;
            } else {
                strF = gVar.f();
                C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName(strF);
                if (gVarFindFieldByName == null && (gVarFindFieldByName = descriptorForType.findFieldByName(strF.toLowerCase(Locale.US))) != null && gVarFindFieldByName.getType() != C5269x.g.c.GROUP) {
                    gVarFindFieldByName = null;
                }
                if (gVarFindFieldByName != null && gVarFindFieldByName.getType() == C5269x.g.c.GROUP && !gVarFindFieldByName.getMessageType().getName().equals(strF)) {
                    gVarFindFieldByName = null;
                }
                if (gVarFindFieldByName == null) {
                    list.add(new c((gVar.o() + 1) + ":" + (gVar.n() + 1) + ":\t" + descriptorForType.getFullName() + "." + strF, c.a.FIELD));
                }
                C5269x.g gVar3 = gVarFindFieldByName;
                cVar = null;
                gVar2 = gVar3;
            }
            if (gVar2 == null) {
                e(gVar, descriptorForType, strF);
                f(gVar, descriptorForType);
                return;
            }
            if (gVar2.getJavaType() == C5269x.g.b.MESSAGE) {
                e(gVar, descriptorForType, gVar2.getFullName());
                gVar.w(":");
                c(gVar, k8, eVar, gVar2, cVar, v1Var, list);
            } else {
                e(gVar, descriptorForType, gVar2.getFullName());
                gVar.c(":");
                c(gVar, k8, eVar, gVar2, cVar, v1Var, list);
            }
            if (gVar.w(";")) {
                return;
            }
            gVar.w(",");
        }

        private void i(g gVar, K k8, O0.e eVar, List list) throws c {
            h(gVar, k8, eVar, null, list);
        }

        private void j(g gVar, C5269x.b bVar) {
            e(gVar, bVar, d(gVar));
            f(gVar, bVar);
            if (gVar.w(";")) {
                return;
            }
            gVar.w(",");
        }

        private void k(g gVar, C5269x.b bVar) throws c {
            String str;
            if (gVar.w(SimpleComparison.LESS_THAN_OPERATION)) {
                str = SimpleComparison.GREATER_THAN_OPERATION;
            } else {
                gVar.c("{");
                str = "}";
            }
            while (!gVar.q(SimpleComparison.GREATER_THAN_OPERATION) && !gVar.q("}")) {
                j(gVar, bVar);
            }
            gVar.c(str);
        }

        private void l(g gVar, boolean z8, C5269x.b bVar) throws c {
            if (!gVar.w("[") || gVar.w("]")) {
                return;
            }
            while (true) {
                if (gVar.q("{") || gVar.q(SimpleComparison.LESS_THAN_OPERATION)) {
                    k(gVar, bVar);
                } else {
                    if (!z8) {
                        throw gVar.t("Invalid repeated scalar field: missing \":\" before \"[\".");
                    }
                    m(gVar);
                }
                if (gVar.w("]")) {
                    return;
                } else {
                    gVar.c(",");
                }
            }
        }

        private void m(g gVar) throws c {
            if (gVar.z()) {
                while (gVar.z()) {
                }
                return;
            }
            if (gVar.x() || gVar.y() || gVar.tryConsumeUInt64() || gVar.tryConsumeDouble() || gVar.tryConsumeFloat()) {
                return;
            }
            throw gVar.t("Invalid field value: " + gVar.f26795c);
        }

        private static StringBuilder n(Readable readable) throws IOException {
            StringBuilder sb = new StringBuilder();
            CharBuffer charBufferAllocate = CharBuffer.allocate(4096);
            while (true) {
                int i8 = readable.read(charBufferAllocate);
                if (i8 == -1) {
                    return sb;
                }
                AbstractC5236o0.b(charBufferAllocate);
                sb.append((CharSequence) charBufferAllocate, 0, i8);
            }
        }

        public static a newBuilder() {
            return new a();
        }

        public void merge(Readable readable, H0.a aVar) throws c {
            merge(readable, K.getEmptyRegistry(), aVar);
        }

        private d(z1 z1Var, boolean z8, boolean z9, boolean z10, b bVar, v1 v1Var) {
            this.f26764a = z1Var;
            this.f26765b = z8;
            this.f26766c = z9;
            this.f26767d = z10;
            this.f26768e = bVar;
        }

        public void merge(CharSequence charSequence, H0.a aVar) throws c {
            merge(charSequence, K.getEmptyRegistry(), aVar);
        }

        public void merge(Readable readable, K k8, H0.a aVar) throws c {
            merge(n(readable), k8, aVar);
        }

        public void merge(CharSequence charSequence, K k8, H0.a aVar) throws c {
            g gVar = new g(charSequence, null);
            O0.b bVar = new O0.b(aVar);
            ArrayList arrayList = new ArrayList();
            while (!gVar.b()) {
                i(gVar, k8, bVar, arrayList);
            }
            a(arrayList);
        }
    }

    public static final class e {

        /* renamed from: c */
        private static final e f26778c = new e(true, z1.getEmptyTypeRegistry());

        /* renamed from: a */
        private final boolean f26779a;

        /* renamed from: b */
        private final z1 f26780b;

        private static class a implements Comparable {

            /* renamed from: a */
            private Object f26781a;

            /* renamed from: b */
            private C5274z0 f26782b;

            /* renamed from: c */
            private final C5269x.g.b f26783c;

            a(Object obj, C5269x.g gVar) {
                if (obj instanceof C5274z0) {
                    this.f26782b = (C5274z0) obj;
                } else {
                    this.f26781a = obj;
                }
                this.f26783c = a(gVar);
            }

            private static C5269x.g.b a(C5269x.g gVar) {
                return gVar.getMessageType().getFields().get(0).getJavaType();
            }

            Object b() {
                C5274z0 c5274z0 = this.f26782b;
                return c5274z0 != null ? c5274z0 : this.f26781a;
            }

            Object c() {
                C5274z0 c5274z0 = this.f26782b;
                if (c5274z0 != null) {
                    return c5274z0.getKey();
                }
                return null;
            }

            @Override // java.lang.Comparable
            public int compareTo(a aVar) {
                if (c() == null || aVar.c() == null) {
                    t1.f26758a.info("Invalid key for map field.");
                    return -1;
                }
                int i8 = a.f26760a[this.f26783c.ordinal()];
                if (i8 == 1) {
                    Boolean bool = (Boolean) c();
                    bool.booleanValue();
                    Boolean bool2 = (Boolean) aVar.c();
                    bool2.booleanValue();
                    return bool.compareTo(bool2);
                }
                if (i8 == 2) {
                    Long l8 = (Long) c();
                    l8.longValue();
                    Long l9 = (Long) aVar.c();
                    l9.longValue();
                    return l8.compareTo(l9);
                }
                if (i8 == 3) {
                    Integer num = (Integer) c();
                    num.intValue();
                    Integer num2 = (Integer) aVar.c();
                    num2.intValue();
                    return num.compareTo(num2);
                }
                if (i8 != 4) {
                    return 0;
                }
                String str = (String) c();
                String str2 = (String) aVar.c();
                if (str == null && str2 == null) {
                    return 0;
                }
                if (str == null && str2 != null) {
                    return -1;
                }
                if (str == null || str2 != null) {
                    return str.compareTo(str2);
                }
                return 1;
            }
        }

        private e(boolean z8, z1 z1Var) {
            this.f26779a = z8;
            this.f26780b = z1Var;
        }

        private void c(N0 n02, f fVar) throws IOException {
            if (n02.getDescriptorForType().getFullName().equals("google.protobuf.Any") && d(n02, fVar)) {
                return;
            }
            g(n02, fVar);
        }

        private boolean d(N0 n02, f fVar) throws IOException {
            C5269x.b descriptorForType = n02.getDescriptorForType();
            C5269x.g gVarFindFieldByNumber = descriptorForType.findFieldByNumber(1);
            C5269x.g gVarFindFieldByNumber2 = descriptorForType.findFieldByNumber(2);
            if (gVarFindFieldByNumber != null && gVarFindFieldByNumber.getType() == C5269x.g.c.STRING && gVarFindFieldByNumber2 != null && gVarFindFieldByNumber2.getType() == C5269x.g.c.BYTES) {
                String str = (String) n02.getField(gVarFindFieldByNumber);
                if (str.isEmpty()) {
                    return false;
                }
                Object field = n02.getField(gVarFindFieldByNumber2);
                try {
                    C5269x.b descriptorForTypeUrl = this.f26780b.getDescriptorForTypeUrl(str);
                    if (descriptorForTypeUrl == null) {
                        return false;
                    }
                    E.c cVarNewBuilderForType = E.getDefaultInstance(descriptorForTypeUrl).newBuilderForType();
                    cVarNewBuilderForType.mergeFrom((AbstractC5235o) field);
                    fVar.print("[");
                    fVar.print(str);
                    fVar.print("] {");
                    fVar.eol();
                    fVar.indent();
                    c(cVarNewBuilderForType, fVar);
                    fVar.outdent();
                    fVar.print("}");
                    fVar.eol();
                    return true;
                } catch (C5230m0 unused) {
                }
            }
            return false;
        }

        private void e(C5269x.g gVar, Object obj, f fVar) throws IOException {
            if (!gVar.isMapField()) {
                if (!gVar.isRepeated()) {
                    h(gVar, obj, fVar);
                    return;
                }
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    h(gVar, it.next(), fVar);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                arrayList.add(new a(it2.next(), gVar));
            }
            Collections.sort(arrayList);
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                h(gVar, ((a) it3.next()).b(), fVar);
            }
        }

        private void f(C5269x.g gVar, Object obj, f fVar) throws IOException {
            switch (a.f26761b[gVar.getType().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    fVar.print(((Integer) obj).toString());
                    break;
                case 4:
                case 5:
                case 6:
                    fVar.print(((Long) obj).toString());
                    break;
                case 7:
                    fVar.print(((Boolean) obj).toString());
                    break;
                case 8:
                    fVar.print(((Float) obj).toString());
                    break;
                case 9:
                    fVar.print(((Double) obj).toString());
                    break;
                case 10:
                case 11:
                    fVar.print(t1.unsignedToString(((Integer) obj).intValue()));
                    break;
                case 12:
                case 13:
                    fVar.print(t1.unsignedToString(((Long) obj).longValue()));
                    break;
                case 14:
                    fVar.print("\"");
                    fVar.print(this.f26779a ? u1.e((String) obj) : t1.escapeDoubleQuotesAndBackslashes((String) obj).replace(Q7.X.LF, "\\n"));
                    fVar.print("\"");
                    break;
                case 15:
                    fVar.print("\"");
                    if (obj instanceof AbstractC5235o) {
                        fVar.print(t1.escapeBytes((AbstractC5235o) obj));
                    } else {
                        fVar.print(t1.escapeBytes((byte[]) obj));
                    }
                    fVar.print("\"");
                    break;
                case 16:
                    fVar.print(((C5269x.f) obj).getName());
                    break;
                case 17:
                case 18:
                    c((N0) obj, fVar);
                    break;
            }
        }

        private void g(N0 n02, f fVar) throws IOException {
            for (Map.Entry<C5269x.g, Object> entry : n02.getAllFields().entrySet()) {
                e(entry.getKey(), entry.getValue(), fVar);
            }
            k(n02.getUnknownFields(), fVar);
        }

        private void h(C5269x.g gVar, Object obj, f fVar) throws IOException {
            if (gVar.isExtension()) {
                fVar.print("[");
                if (gVar.getContainingType().getOptions().getMessageSetWireFormat() && gVar.getType() == C5269x.g.c.MESSAGE && gVar.isOptional() && gVar.getExtensionScope() == gVar.getMessageType()) {
                    fVar.print(gVar.getMessageType().getFullName());
                } else {
                    fVar.print(gVar.getFullName());
                }
                fVar.print("]");
            } else if (gVar.getType() == C5269x.g.c.GROUP) {
                fVar.print(gVar.getMessageType().getName());
            } else {
                fVar.print(gVar.getName());
            }
            C5269x.g.b javaType = gVar.getJavaType();
            C5269x.g.b bVar = C5269x.g.b.MESSAGE;
            if (javaType == bVar) {
                fVar.print(" {");
                fVar.eol();
                fVar.indent();
            } else {
                fVar.print(": ");
            }
            f(gVar, obj, fVar);
            if (gVar.getJavaType() == bVar) {
                fVar.outdent();
                fVar.print("}");
            }
            fVar.eol();
        }

        private static void i(int i8, int i9, List list, f fVar) throws IOException {
            for (Object obj : list) {
                fVar.print(String.valueOf(i8));
                fVar.print(": ");
                j(i9, obj, fVar);
                fVar.eol();
            }
        }

        private static void j(int i8, Object obj, f fVar) throws IOException {
            int tagWireType = P1.getTagWireType(i8);
            if (tagWireType == 0) {
                fVar.print(t1.unsignedToString(((Long) obj).longValue()));
                return;
            }
            if (tagWireType == 1) {
                fVar.print(String.format(null, "0x%016x", (Long) obj));
                return;
            }
            if (tagWireType != 2) {
                if (tagWireType == 3) {
                    k((G1) obj, fVar);
                    return;
                } else {
                    if (tagWireType == 5) {
                        fVar.print(String.format(null, "0x%08x", (Integer) obj));
                        return;
                    }
                    throw new IllegalArgumentException("Bad tag: " + i8);
                }
            }
            try {
                G1 from = G1.parseFrom((AbstractC5235o) obj);
                fVar.print("{");
                fVar.eol();
                fVar.indent();
                k(from, fVar);
                fVar.outdent();
                fVar.print("}");
            } catch (C5230m0 unused) {
                fVar.print("\"");
                fVar.print(t1.escapeBytes((AbstractC5235o) obj));
                fVar.print("\"");
            }
        }

        public static void k(G1 g12, f fVar) throws IOException {
            for (Map.Entry<Integer, G1.c> entry : g12.asMap().entrySet()) {
                int iIntValue = entry.getKey().intValue();
                G1.c value = entry.getValue();
                i(iIntValue, 0, value.getVarintList(), fVar);
                i(iIntValue, 5, value.getFixed32List(), fVar);
                i(iIntValue, 1, value.getFixed64List(), fVar);
                i(iIntValue, 2, value.getLengthDelimitedList(), fVar);
                for (G1 g13 : value.getGroupList()) {
                    fVar.print(entry.getKey().toString());
                    fVar.print(" {");
                    fVar.eol();
                    fVar.indent();
                    k(g13, fVar);
                    fVar.outdent();
                    fVar.print("}");
                    fVar.eol();
                }
            }
        }

        public e escapingNonAscii(boolean z8) {
            return new e(z8, this.f26780b);
        }

        public void print(N0 n02, Appendable appendable) throws IOException {
            c(n02, t1.g(appendable));
        }

        public void printField(C5269x.g gVar, Object obj, Appendable appendable) throws IOException {
            e(gVar, obj, t1.g(appendable));
        }

        public String printFieldToString(C5269x.g gVar, Object obj) {
            try {
                StringBuilder sb = new StringBuilder();
                printField(gVar, obj, sb);
                return sb.toString();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        public void printFieldValue(C5269x.g gVar, Object obj, Appendable appendable) throws IOException {
            f(gVar, obj, t1.g(appendable));
        }

        public String printToString(N0 n02) {
            try {
                StringBuilder sb = new StringBuilder();
                print(n02, sb);
                return sb.toString();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        public String shortDebugString(N0 n02) {
            try {
                StringBuilder sb = new StringBuilder();
                c(n02, t1.n(sb));
                return sb.toString();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        public e usingTypeRegistry(z1 z1Var) {
            if (this.f26780b == z1.getEmptyTypeRegistry()) {
                return new e(this.f26779a, z1Var);
            }
            throw new IllegalArgumentException("Only one typeRegistry is allowed.");
        }

        public void print(G1 g12, Appendable appendable) throws IOException {
            k(g12, t1.g(appendable));
        }

        public String printToString(G1 g12) {
            try {
                StringBuilder sb = new StringBuilder();
                print(g12, sb);
                return sb.toString();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        public String shortDebugString(C5269x.g gVar, Object obj) {
            try {
                StringBuilder sb = new StringBuilder();
                e(gVar, obj, t1.n(sb));
                return sb.toString();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }

        public String shortDebugString(G1 g12) {
            try {
                StringBuilder sb = new StringBuilder();
                k(g12, t1.n(sb));
                return sb.toString();
            } catch (IOException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    private static final class f {

        /* renamed from: a */
        private final Appendable f26784a;

        /* renamed from: b */
        private final StringBuilder f26785b;

        /* renamed from: c */
        private final boolean f26786c;

        /* renamed from: d */
        private boolean f26787d;

        /* synthetic */ f(Appendable appendable, boolean z8, a aVar) {
            this(appendable, z8);
        }

        public void eol() throws IOException {
            if (!this.f26786c) {
                this.f26784a.append(Q7.X.LF);
            }
            this.f26787d = true;
        }

        public void indent() {
            this.f26785b.append("  ");
        }

        public void outdent() {
            int length = this.f26785b.length();
            if (length == 0) {
                throw new IllegalArgumentException(" Outdent() without matching Indent().");
            }
            this.f26785b.setLength(length - 2);
        }

        public void print(CharSequence charSequence) throws IOException {
            if (this.f26787d) {
                this.f26787d = false;
                this.f26784a.append(this.f26786c ? Q7.X.SPACE : this.f26785b);
            }
            this.f26784a.append(charSequence);
        }

        private f(Appendable appendable, boolean z8) {
            this.f26785b = new StringBuilder();
            this.f26787d = false;
            this.f26784a = appendable;
            this.f26786c = z8;
        }
    }

    private static final class g {

        /* renamed from: k */
        private static final Pattern f26788k = Pattern.compile("(\\s|(#.*$))++", 8);

        /* renamed from: l */
        private static final Pattern f26789l = Pattern.compile("[a-zA-Z_][0-9a-zA-Z_+-]*+|[.]?[0-9+-][0-9a-zA-Z_.+-]*+|\"([^\"\n\\\\]|\\\\.)*+(\"|\\\\?$)|'([^'\n\\\\]|\\\\.)*+('|\\\\?$)", 8);

        /* renamed from: m */
        private static final Pattern f26790m = Pattern.compile("-?inf(inity)?", 2);

        /* renamed from: n */
        private static final Pattern f26791n = Pattern.compile("-?inf(inity)?f?", 2);

        /* renamed from: o */
        private static final Pattern f26792o = Pattern.compile("nanf?", 2);

        /* renamed from: a */
        private final CharSequence f26793a;

        /* renamed from: b */
        private final Matcher f26794b;

        /* renamed from: c */
        private String f26795c;

        /* renamed from: d */
        private int f26796d;

        /* renamed from: e */
        private int f26797e;

        /* renamed from: f */
        private int f26798f;

        /* renamed from: g */
        private int f26799g;

        /* renamed from: h */
        private int f26800h;

        /* renamed from: i */
        private boolean f26801i;

        /* renamed from: j */
        private boolean f26802j;

        /* synthetic */ g(CharSequence charSequence, a aVar) {
            this(charSequence);
        }

        private void e(List list) throws c {
            char cCharAt = this.f26795c.length() > 0 ? this.f26795c.charAt(0) : (char) 0;
            if (cCharAt != '\"' && cCharAt != '\'') {
                throw t("Expected string.");
            }
            if (this.f26795c.length() >= 2) {
                String str = this.f26795c;
                if (str.charAt(str.length() - 1) == cCharAt) {
                    try {
                        String str2 = this.f26795c;
                        AbstractC5235o abstractC5235oUnescapeBytes = t1.unescapeBytes(str2.substring(1, str2.length() - 1));
                        s();
                        list.add(abstractC5235oUnescapeBytes);
                        return;
                    } catch (b e8) {
                        throw t(e8.getMessage());
                    }
                }
            }
            throw t("String missing ending quote.");
        }

        private c k(NumberFormatException numberFormatException) {
            return t("Couldn't parse number: " + numberFormatException.getMessage());
        }

        private c p(NumberFormatException numberFormatException) {
            return t("Couldn't parse integer: " + numberFormatException.getMessage());
        }

        private void v() {
            this.f26794b.usePattern(f26788k);
            if (this.f26794b.lookingAt()) {
                Matcher matcher = this.f26794b;
                matcher.region(matcher.end(), this.f26794b.regionEnd());
            }
        }

        boolean b() {
            return this.f26795c.length() == 0;
        }

        void c(String str) throws c {
            if (w(str)) {
                return;
            }
            throw t("Expected \"" + str + "\".");
        }

        public boolean consumeBoolean() throws c {
            if (this.f26795c.equals(C0709m.TRUE) || this.f26795c.equals("True") || this.f26795c.equals("t") || this.f26795c.equals("1")) {
                s();
                return true;
            }
            if (this.f26795c.equals(C0709m.FALSE) || this.f26795c.equals("False") || this.f26795c.equals("f") || this.f26795c.equals("0")) {
                s();
                return false;
            }
            throw t("Expected \"true\" or \"false\". Found \"" + this.f26795c + "\".");
        }

        public double consumeDouble() throws c, NumberFormatException {
            if (f26790m.matcher(this.f26795c).matches()) {
                boolean zStartsWith = this.f26795c.startsWith(g5.e.STATE_NAME_NONE);
                s();
                return zStartsWith ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
            }
            if (this.f26795c.equalsIgnoreCase("nan")) {
                s();
                return Double.NaN;
            }
            try {
                double d9 = Double.parseDouble(this.f26795c);
                s();
                return d9;
            } catch (NumberFormatException e8) {
                throw k(e8);
            }
        }

        public float consumeFloat() throws c, NumberFormatException {
            if (f26791n.matcher(this.f26795c).matches()) {
                boolean zStartsWith = this.f26795c.startsWith(g5.e.STATE_NAME_NONE);
                s();
                return zStartsWith ? Float.NEGATIVE_INFINITY : Float.POSITIVE_INFINITY;
            }
            if (f26792o.matcher(this.f26795c).matches()) {
                s();
                return Float.NaN;
            }
            try {
                float f8 = Float.parseFloat(this.f26795c);
                s();
                return f8;
            } catch (NumberFormatException e8) {
                throw k(e8);
            }
        }

        public String consumeString() {
            return d().toStringUtf8();
        }

        AbstractC5235o d() throws c {
            ArrayList arrayList = new ArrayList();
            e(arrayList);
            while (true) {
                if (!this.f26795c.startsWith("'") && !this.f26795c.startsWith("\"")) {
                    return AbstractC5235o.copyFrom(arrayList);
                }
                e(arrayList);
            }
        }

        String f() throws c {
            for (int i8 = 0; i8 < this.f26795c.length(); i8++) {
                char cCharAt = this.f26795c.charAt(i8);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && !(('0' <= cCharAt && cCharAt <= '9') || cCharAt == '_' || cCharAt == '.'))) {
                    throw t("Expected identifier. Found '" + this.f26795c + "'");
                }
            }
            String str = this.f26795c;
            s();
            return str;
        }

        int g() throws c {
            try {
                int iH = t1.h(this.f26795c);
                s();
                return iH;
            } catch (NumberFormatException e8) {
                throw p(e8);
            }
        }

        long h() throws c {
            try {
                long jI = t1.i(this.f26795c);
                s();
                return jI;
            } catch (NumberFormatException e8) {
                throw p(e8);
            }
        }

        int i() throws c {
            try {
                int iK = t1.k(this.f26795c);
                s();
                return iK;
            } catch (NumberFormatException e8) {
                throw p(e8);
            }
        }

        long j() throws c {
            try {
                long jL = t1.l(this.f26795c);
                s();
                return jL;
            } catch (NumberFormatException e8) {
                throw p(e8);
            }
        }

        int l() {
            return this.f26798f;
        }

        int m() {
            return this.f26797e;
        }

        int n() {
            return this.f26800h;
        }

        int o() {
            return this.f26799g;
        }

        boolean q(String str) {
            return this.f26795c.equals(str);
        }

        boolean r() {
            if (this.f26795c.length() == 0) {
                return false;
            }
            char cCharAt = this.f26795c.charAt(0);
            return ('0' <= cCharAt && cCharAt <= '9') || cCharAt == '-' || cCharAt == '+';
        }

        void s() {
            this.f26799g = this.f26797e;
            this.f26800h = this.f26798f;
            while (this.f26796d < this.f26794b.regionStart()) {
                if (this.f26793a.charAt(this.f26796d) == '\n') {
                    this.f26797e++;
                    this.f26798f = 0;
                } else {
                    this.f26798f++;
                }
                this.f26796d++;
            }
            if (this.f26794b.regionStart() == this.f26794b.regionEnd()) {
                this.f26795c = "";
                return;
            }
            this.f26794b.usePattern(f26789l);
            if (this.f26794b.lookingAt()) {
                this.f26795c = this.f26794b.group();
                Matcher matcher = this.f26794b;
                matcher.region(matcher.end(), this.f26794b.regionEnd());
            } else {
                this.f26795c = String.valueOf(this.f26793a.charAt(this.f26796d));
                Matcher matcher2 = this.f26794b;
                matcher2.region(this.f26796d + 1, matcher2.regionEnd());
            }
            v();
        }

        c t(String str) {
            return new c(this.f26797e + 1, this.f26798f + 1, str);
        }

        public boolean tryConsumeDouble() throws NumberFormatException {
            try {
                consumeDouble();
                return true;
            } catch (c unused) {
                return false;
            }
        }

        public boolean tryConsumeFloat() throws NumberFormatException {
            try {
                consumeFloat();
                return true;
            } catch (c unused) {
                return false;
            }
        }

        public boolean tryConsumeUInt64() {
            try {
                j();
                return true;
            } catch (c unused) {
                return false;
            }
        }

        c u(String str) {
            return new c(this.f26799g + 1, this.f26800h + 1, str);
        }

        boolean w(String str) {
            if (!this.f26795c.equals(str)) {
                return false;
            }
            s();
            return true;
        }

        boolean x() {
            try {
                f();
                return true;
            } catch (c unused) {
                return false;
            }
        }

        boolean y() {
            try {
                h();
                return true;
            } catch (c unused) {
                return false;
            }
        }

        boolean z() {
            try {
                consumeString();
                return true;
            } catch (c unused) {
                return false;
            }
        }

        private g(CharSequence charSequence) {
            this.f26796d = 0;
            this.f26797e = 0;
            this.f26798f = 0;
            this.f26799g = 0;
            this.f26800h = 0;
            this.f26801i = false;
            this.f26802j = false;
            this.f26793a = charSequence;
            this.f26794b = f26788k.matcher(charSequence);
            v();
            s();
        }
    }

    private static int d(byte b9) {
        return (48 > b9 || b9 > 57) ? (97 > b9 || b9 > 122) ? b9 - 55 : b9 - 87 : b9 - 48;
    }

    private static boolean e(byte b9) {
        return (48 <= b9 && b9 <= 57) || (97 <= b9 && b9 <= 102) || (65 <= b9 && b9 <= 70);
    }

    public static String escapeBytes(AbstractC5235o abstractC5235o) {
        return u1.a(abstractC5235o);
    }

    public static String escapeDoubleQuotesAndBackslashes(String str) {
        return u1.d(str);
    }

    private static boolean f(byte b9) {
        return 48 <= b9 && b9 <= 55;
    }

    public static f g(Appendable appendable) {
        return new f(appendable, false, null);
    }

    public static d getParser() {
        return f26759b;
    }

    static int h(String str) {
        return (int) j(str, true, false);
    }

    static long i(String str) {
        return j(str, true, true);
    }

    private static long j(String str, boolean z8, boolean z9) throws NumberFormatException {
        int i8;
        int i9 = 0;
        if (str.startsWith(g5.e.STATE_NAME_NONE, 0)) {
            if (!z8) {
                throw new NumberFormatException("Number must be positive: " + str);
            }
            i9 = 1;
        }
        int i10 = i9;
        if (str.startsWith("0x", i9)) {
            i9 += 2;
            i8 = 16;
        } else {
            i8 = str.startsWith("0", i9) ? 8 : 10;
        }
        String strSubstring = str.substring(i9);
        if (strSubstring.length() < 16) {
            long j8 = Long.parseLong(strSubstring, i8);
            if (i10 != 0) {
                j8 = -j8;
            }
            if (z9) {
                return j8;
            }
            if (z8) {
                if (j8 <= 2147483647L && j8 >= -2147483648L) {
                    return j8;
                }
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
            if (j8 < 4294967296L && j8 >= 0) {
                return j8;
            }
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        BigInteger bigInteger = new BigInteger(strSubstring, i8);
        if (i10 != 0) {
            bigInteger = bigInteger.negate();
        }
        if (z9) {
            if (z8) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: " + str);
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: " + str);
            }
        } else if (z8) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: " + str);
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: " + str);
        }
        return bigInteger.longValue();
    }

    static int k(String str) {
        return (int) j(str, false, false);
    }

    static long l(String str) {
        return j(str, false, true);
    }

    private static void m(int i8, Object obj, f fVar) throws IOException {
        int tagWireType = P1.getTagWireType(i8);
        if (tagWireType == 0) {
            fVar.print(unsignedToString(((Long) obj).longValue()));
            return;
        }
        if (tagWireType == 1) {
            fVar.print(String.format(null, "0x%016x", (Long) obj));
            return;
        }
        if (tagWireType != 2) {
            if (tagWireType == 3) {
                e.k((G1) obj, fVar);
                return;
            } else {
                if (tagWireType == 5) {
                    fVar.print(String.format(null, "0x%08x", (Integer) obj));
                    return;
                }
                throw new IllegalArgumentException("Bad tag: " + i8);
            }
        }
        try {
            G1 from = G1.parseFrom((AbstractC5235o) obj);
            fVar.print("{");
            fVar.eol();
            fVar.indent();
            e.k(from, fVar);
            fVar.outdent();
            fVar.print("}");
        } catch (C5230m0 unused) {
            fVar.print("\"");
            fVar.print(escapeBytes((AbstractC5235o) obj));
            fVar.print("\"");
        }
    }

    public static void merge(Readable readable, H0.a aVar) throws c {
        f26759b.merge(readable, aVar);
    }

    public static f n(Appendable appendable) {
        return new f(appendable, true, null);
    }

    public static <T extends H0> T parse(CharSequence charSequence, Class<T> cls) throws c {
        H0.a aVarNewBuilderForType = ((H0) AbstractC5227l0.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, aVarNewBuilderForType);
        return (T) aVarNewBuilderForType.build();
    }

    @Deprecated
    public static void print(N0 n02, Appendable appendable) throws IOException {
        printer().print(n02, appendable);
    }

    @Deprecated
    public static void printField(C5269x.g gVar, Object obj, Appendable appendable) throws IOException {
        printer().printField(gVar, obj, appendable);
    }

    @Deprecated
    public static String printFieldToString(C5269x.g gVar, Object obj) {
        return printer().printFieldToString(gVar, obj);
    }

    @Deprecated
    public static void printFieldValue(C5269x.g gVar, Object obj, Appendable appendable) throws IOException {
        printer().printFieldValue(gVar, obj, appendable);
    }

    @Deprecated
    public static String printToString(N0 n02) {
        return printer().printToString(n02);
    }

    @Deprecated
    public static String printToUnicodeString(N0 n02) {
        return printer().escapingNonAscii(false).printToString(n02);
    }

    @Deprecated
    public static void printUnicode(N0 n02, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(n02, appendable);
    }

    @Deprecated
    public static void printUnicodeFieldValue(C5269x.g gVar, Object obj, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).printFieldValue(gVar, obj, appendable);
    }

    public static void printUnknownFieldValue(int i8, Object obj, Appendable appendable) throws IOException {
        m(i8, obj, g(appendable));
    }

    public static e printer() {
        return e.f26778c;
    }

    public static String shortDebugString(N0 n02) {
        return printer().shortDebugString(n02);
    }

    public static AbstractC5235o unescapeBytes(CharSequence charSequence) throws b {
        int i8;
        int i9;
        int length;
        int i10;
        AbstractC5235o abstractC5235oCopyFromUtf8 = AbstractC5235o.copyFromUtf8(charSequence.toString());
        int size = abstractC5235oCopyFromUtf8.size();
        byte[] bArr = new byte[size];
        int i11 = 0;
        int i12 = 0;
        while (i11 < abstractC5235oCopyFromUtf8.size()) {
            byte bByteAt = abstractC5235oCopyFromUtf8.byteAt(i11);
            if (bByteAt == 92) {
                int i13 = i11 + 1;
                if (i13 >= abstractC5235oCopyFromUtf8.size()) {
                    throw new b("Invalid escape sequence: '\\' at end of string.");
                }
                byte bByteAt2 = abstractC5235oCopyFromUtf8.byteAt(i13);
                if (f(bByteAt2)) {
                    int iD = d(bByteAt2);
                    int i14 = i11 + 2;
                    if (i14 < abstractC5235oCopyFromUtf8.size() && f(abstractC5235oCopyFromUtf8.byteAt(i14))) {
                        iD = (iD * 8) + d(abstractC5235oCopyFromUtf8.byteAt(i14));
                        i13 = i14;
                    }
                    i11 = i13 + 1;
                    if (i11 >= abstractC5235oCopyFromUtf8.size() || !f(abstractC5235oCopyFromUtf8.byteAt(i11))) {
                        i11 = i13;
                    } else {
                        iD = (iD * 8) + d(abstractC5235oCopyFromUtf8.byteAt(i11));
                    }
                    i10 = i12 + 1;
                    bArr[i12] = (byte) iD;
                } else {
                    if (bByteAt2 == 34) {
                        i8 = i12 + 1;
                        bArr[i12] = 34;
                    } else if (bByteAt2 == 39) {
                        i8 = i12 + 1;
                        bArr[i12] = 39;
                    } else if (bByteAt2 != 63) {
                        if (bByteAt2 == 85) {
                            int i15 = i11 + 2;
                            i9 = i11 + 9;
                            if (i9 >= abstractC5235oCopyFromUtf8.size()) {
                                throw new b("Invalid escape sequence: '\\U' with too few hex chars");
                            }
                            int iD2 = 0;
                            int i16 = i15;
                            while (true) {
                                int i17 = i11 + 10;
                                if (i16 < i17) {
                                    byte bByteAt3 = abstractC5235oCopyFromUtf8.byteAt(i16);
                                    if (!e(bByteAt3)) {
                                        throw new b("Invalid escape sequence: '\\U' with too few hex chars");
                                    }
                                    iD2 = (iD2 << 4) | d(bByteAt3);
                                    i16++;
                                } else {
                                    if (!Character.isValidCodePoint(iD2)) {
                                        throw new b("Invalid escape sequence: '\\U" + abstractC5235oCopyFromUtf8.substring(i15, i17).toStringUtf8() + "' is not a valid code point value");
                                    }
                                    Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(iD2);
                                    if (unicodeBlockOf != null && (unicodeBlockOf.equals(Character.UnicodeBlock.LOW_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_SURROGATES) || unicodeBlockOf.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                        throw new b("Invalid escape sequence: '\\U" + abstractC5235oCopyFromUtf8.substring(i15, i17).toStringUtf8() + "' refers to a surrogate code unit");
                                    }
                                    byte[] bytes = new String(new int[]{iD2}, 0, 1).getBytes(AbstractC5227l0.f26567b);
                                    System.arraycopy(bytes, 0, bArr, i12, bytes.length);
                                    length = bytes.length;
                                }
                            }
                        } else if (bByteAt2 == 92) {
                            i8 = i12 + 1;
                            bArr[i12] = 92;
                        } else if (bByteAt2 == 102) {
                            i8 = i12 + 1;
                            bArr[i12] = AbstractC5358c.FF;
                        } else if (bByteAt2 == 110) {
                            i8 = i12 + 1;
                            bArr[i12] = 10;
                        } else if (bByteAt2 == 114) {
                            i8 = i12 + 1;
                            bArr[i12] = AbstractC5358c.CR;
                        } else if (bByteAt2 == 120) {
                            int i18 = i11 + 2;
                            if (i18 >= abstractC5235oCopyFromUtf8.size() || !e(abstractC5235oCopyFromUtf8.byteAt(i18))) {
                                throw new b("Invalid escape sequence: '\\x' with no digits");
                            }
                            int iD3 = d(abstractC5235oCopyFromUtf8.byteAt(i18));
                            i11 += 3;
                            if (i11 >= abstractC5235oCopyFromUtf8.size() || !e(abstractC5235oCopyFromUtf8.byteAt(i11))) {
                                i11 = i18;
                            } else {
                                iD3 = (iD3 * 16) + d(abstractC5235oCopyFromUtf8.byteAt(i11));
                            }
                            i10 = i12 + 1;
                            bArr[i12] = (byte) iD3;
                        } else if (bByteAt2 == 97) {
                            i8 = i12 + 1;
                            bArr[i12] = 7;
                        } else if (bByteAt2 != 98) {
                            switch (bByteAt2) {
                                case 116:
                                    i8 = i12 + 1;
                                    bArr[i12] = 9;
                                    break;
                                case 117:
                                    int i19 = i11 + 2;
                                    i9 = i11 + 5;
                                    if (i9 < abstractC5235oCopyFromUtf8.size() && e(abstractC5235oCopyFromUtf8.byteAt(i19))) {
                                        int i20 = i11 + 3;
                                        if (e(abstractC5235oCopyFromUtf8.byteAt(i20))) {
                                            int i21 = i11 + 4;
                                            if (e(abstractC5235oCopyFromUtf8.byteAt(i21)) && e(abstractC5235oCopyFromUtf8.byteAt(i9))) {
                                                char cD = (char) ((d(abstractC5235oCopyFromUtf8.byteAt(i21)) << 4) | (d(abstractC5235oCopyFromUtf8.byteAt(i19)) << 12) | (d(abstractC5235oCopyFromUtf8.byteAt(i20)) << 8) | d(abstractC5235oCopyFromUtf8.byteAt(i9)));
                                                if (cD >= 55296 && cD <= 57343) {
                                                    throw new b("Invalid escape sequence: '\\u' refers to a surrogate");
                                                }
                                                byte[] bytes2 = Character.toString(cD).getBytes(AbstractC5227l0.f26567b);
                                                System.arraycopy(bytes2, 0, bArr, i12, bytes2.length);
                                                length = bytes2.length;
                                                break;
                                            }
                                        }
                                    }
                                    throw new b("Invalid escape sequence: '\\u' with too few hex chars");
                                case 118:
                                    i8 = i12 + 1;
                                    bArr[i12] = AbstractC5358c.VT;
                                    break;
                                default:
                                    throw new b("Invalid escape sequence: '\\" + ((char) bByteAt2) + '\'');
                            }
                        } else {
                            i8 = i12 + 1;
                            bArr[i12] = 8;
                        }
                        i12 += length;
                        i11 = i9;
                    } else {
                        i8 = i12 + 1;
                        bArr[i12] = 63;
                    }
                    i12 = i8;
                    i11 = i13;
                }
                i12 = i10;
            } else {
                bArr[i12] = bByteAt;
                i12++;
            }
            i11++;
        }
        return size == i12 ? AbstractC5235o.s(bArr) : AbstractC5235o.copyFrom(bArr, 0, i12);
    }

    public static String unsignedToString(int i8) {
        return i8 >= 0 ? Integer.toString(i8) : Long.toString(i8 & 4294967295L);
    }

    public static String escapeBytes(byte[] bArr) {
        return u1.c(bArr);
    }

    public static void merge(CharSequence charSequence, H0.a aVar) throws c {
        f26759b.merge(charSequence, aVar);
    }

    @Deprecated
    public static void print(G1 g12, Appendable appendable) throws IOException {
        printer().print(g12, appendable);
    }

    @Deprecated
    public static String printToString(G1 g12) {
        return printer().printToString(g12);
    }

    @Deprecated
    public static String printToUnicodeString(G1 g12) {
        return printer().escapingNonAscii(false).printToString(g12);
    }

    @Deprecated
    public static void printUnicode(G1 g12, Appendable appendable) throws IOException {
        printer().escapingNonAscii(false).print(g12, appendable);
    }

    @Deprecated
    public static String shortDebugString(C5269x.g gVar, Object obj) {
        return printer().shortDebugString(gVar, obj);
    }

    public static void merge(Readable readable, K k8, H0.a aVar) throws c {
        f26759b.merge(readable, k8, aVar);
    }

    @Deprecated
    public static String shortDebugString(G1 g12) {
        return printer().shortDebugString(g12);
    }

    public static String unsignedToString(long j8) {
        if (j8 >= 0) {
            return Long.toString(j8);
        }
        return BigInteger.valueOf(j8 & Long.MAX_VALUE).setBit(63).toString();
    }

    public static void merge(CharSequence charSequence, K k8, H0.a aVar) throws c {
        f26759b.merge(charSequence, k8, aVar);
    }

    public static <T extends H0> T parse(CharSequence charSequence, K k8, Class<T> cls) throws c {
        H0.a aVarNewBuilderForType = ((H0) AbstractC5227l0.getDefaultInstance(cls)).newBuilderForType();
        merge(charSequence, k8, aVarNewBuilderForType);
        return (T) aVarNewBuilderForType.build();
    }
}
