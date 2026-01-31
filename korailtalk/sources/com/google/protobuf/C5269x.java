package com.google.protobuf;

import com.google.protobuf.AbstractC5227l0;
import com.google.protobuf.AbstractC5254w;
import com.google.protobuf.H0;
import com.google.protobuf.K0;
import com.google.protobuf.P1;
import com.google.protobuf.W;
import com.google.protobuf.t1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5269x {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f27314a = Logger.getLogger(C5269x.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f27315b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    private static final b[] f27316c = new b[0];

    /* renamed from: d, reason: collision with root package name */
    private static final g[] f27317d = new g[0];

    /* renamed from: e, reason: collision with root package name */
    private static final e[] f27318e = new e[0];

    /* renamed from: f, reason: collision with root package name */
    private static final m[] f27319f = new m[0];

    /* renamed from: g, reason: collision with root package name */
    private static final l[] f27320g = new l[0];

    /* renamed from: com.google.protobuf.x$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27321a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27322b;

        static {
            int[] iArr = new int[g.b.values().length];
            f27322b = iArr;
            try {
                iArr[g.b.ENUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27322b[g.b.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.c.values().length];
            f27321a = iArr2;
            try {
                iArr2[g.c.INT32.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27321a[g.c.SINT32.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27321a[g.c.SFIXED32.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27321a[g.c.UINT32.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27321a[g.c.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27321a[g.c.INT64.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27321a[g.c.SINT64.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27321a[g.c.SFIXED64.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27321a[g.c.UINT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27321a[g.c.FIXED64.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27321a[g.c.FLOAT.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f27321a[g.c.DOUBLE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f27321a[g.c.BOOL.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f27321a[g.c.STRING.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f27321a[g.c.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f27321a[g.c.ENUM.ordinal()] = 16;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f27321a[g.c.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f27321a[g.c.GROUP.ordinal()] = 18;
            } catch (NoSuchFieldError unused20) {
            }
        }
    }

    /* renamed from: com.google.protobuf.x$b */
    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        private final int f27323a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.C5256b f27324b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27325c;

        /* renamed from: d, reason: collision with root package name */
        private final h f27326d;

        /* renamed from: e, reason: collision with root package name */
        private final b f27327e;

        /* renamed from: f, reason: collision with root package name */
        private final b[] f27328f;

        /* renamed from: g, reason: collision with root package name */
        private final e[] f27329g;

        /* renamed from: h, reason: collision with root package name */
        private final g[] f27330h;

        /* renamed from: i, reason: collision with root package name */
        private final g[] f27331i;

        /* renamed from: j, reason: collision with root package name */
        private final g[] f27332j;

        /* renamed from: k, reason: collision with root package name */
        private final l[] f27333k;

        /* renamed from: l, reason: collision with root package name */
        private final int f27334l;

        /* renamed from: m, reason: collision with root package name */
        private final int[] f27335m;

        /* renamed from: n, reason: collision with root package name */
        private final int[] f27336n;

        /* synthetic */ b(AbstractC5254w.C5256b c5256b, h hVar, b bVar, int i8, a aVar) {
            this(c5256b, hVar, bVar, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() throws d {
            for (b bVar : this.f27328f) {
                bVar.c();
            }
            for (g gVar : this.f27330h) {
                gVar.e();
            }
            Arrays.sort(this.f27331i);
            e();
            for (g gVar2 : this.f27332j) {
                gVar2.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(AbstractC5254w.C5256b c5256b) {
            this.f27324b = c5256b;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                b[] bVarArr = this.f27328f;
                if (i9 >= bVarArr.length) {
                    break;
                }
                bVarArr[i9].d(c5256b.getNestedType(i9));
                i9++;
            }
            int i10 = 0;
            while (true) {
                l[] lVarArr = this.f27333k;
                if (i10 >= lVarArr.length) {
                    break;
                }
                lVarArr[i10].f(c5256b.getOneofDecl(i10));
                i10++;
            }
            int i11 = 0;
            while (true) {
                e[] eVarArr = this.f27329g;
                if (i11 >= eVarArr.length) {
                    break;
                }
                eVarArr[i11].c(c5256b.getEnumType(i11));
                i11++;
            }
            int i12 = 0;
            while (true) {
                g[] gVarArr = this.f27330h;
                if (i12 >= gVarArr.length) {
                    break;
                }
                gVarArr[i12].g(c5256b.getField(i12));
                i12++;
            }
            while (true) {
                g[] gVarArr2 = this.f27332j;
                if (i8 >= gVarArr2.length) {
                    return;
                }
                gVarArr2[i8].g(c5256b.getExtension(i8));
                i8++;
            }
        }

        private void e() throws d {
            int i8 = 0;
            while (true) {
                int i9 = i8 + 1;
                g[] gVarArr = this.f27331i;
                if (i9 >= gVarArr.length) {
                    return;
                }
                g gVar = gVarArr[i8];
                g gVar2 = gVarArr[i9];
                if (gVar.getNumber() == gVar2.getNumber()) {
                    throw new d(gVar2, "Field number " + gVar2.getNumber() + " has already been used in \"" + gVar2.getContainingType().getFullName() + "\" by field \"" + gVar.getName() + "\".", (a) null);
                }
                i8 = i9;
            }
        }

        public e findEnumTypeByName(String str) {
            i iVarC = this.f27326d.f27391h.c(this.f27325c + Q7.C.PACKAGE_SEPARATOR_CHAR + str);
            if (iVarC instanceof e) {
                return (e) iVarC;
            }
            return null;
        }

        public g findFieldByName(String str) {
            i iVarC = this.f27326d.f27391h.c(this.f27325c + Q7.C.PACKAGE_SEPARATOR_CHAR + str);
            if (iVarC instanceof g) {
                return (g) iVarC;
            }
            return null;
        }

        public g findFieldByNumber(int i8) {
            g[] gVarArr = this.f27331i;
            return (g) C5269x.j(gVarArr, gVarArr.length, g.f27364n, i8);
        }

        public b findNestedTypeByName(String str) {
            i iVarC = this.f27326d.f27391h.c(this.f27325c + Q7.C.PACKAGE_SEPARATOR_CHAR + str);
            if (iVarC instanceof b) {
                return (b) iVarC;
            }
            return null;
        }

        public b getContainingType() {
            return this.f27327e;
        }

        public List<e> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.f27329g));
        }

        public List<g> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.f27332j));
        }

        public List<g> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.f27330h));
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27326d;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27325c;
        }

        public int getIndex() {
            return this.f27323a;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27324b.getName();
        }

        public List<b> getNestedTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.f27328f));
        }

        public List<l> getOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.f27333k));
        }

        public AbstractC5254w.v getOptions() {
            return this.f27324b.getOptions();
        }

        public List<l> getRealOneofs() {
            return Collections.unmodifiableList(Arrays.asList(this.f27333k).subList(0, this.f27334l));
        }

        public boolean isExtendable() {
            return !this.f27324b.getExtensionRangeList().isEmpty();
        }

        public boolean isExtensionNumber(int i8) {
            int iBinarySearch = Arrays.binarySearch(this.f27335m, i8);
            if (iBinarySearch < 0) {
                iBinarySearch = (~iBinarySearch) - 1;
            }
            return iBinarySearch >= 0 && i8 < this.f27336n[iBinarySearch];
        }

        public boolean isReservedName(String str) {
            AbstractC5227l0.a(str);
            Iterator it = this.f27324b.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i8) {
            for (AbstractC5254w.C5256b.e eVar : this.f27324b.getReservedRangeList()) {
                if (eVar.getStart() <= i8 && i8 < eVar.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        b(String str) {
            String strSubstring;
            String strSubstring2;
            super(null);
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                strSubstring2 = str.substring(iLastIndexOf + 1);
                strSubstring = str.substring(0, iLastIndexOf);
            } else {
                strSubstring = "";
                strSubstring2 = str;
            }
            this.f27323a = 0;
            this.f27324b = AbstractC5254w.C5256b.newBuilder().setName(strSubstring2).addExtensionRange(AbstractC5254w.C5256b.c.newBuilder().setStart(1).setEnd(536870912).build()).build();
            this.f27325c = str;
            this.f27327e = null;
            this.f27328f = C5269x.f27316c;
            this.f27329g = C5269x.f27318e;
            this.f27330h = C5269x.f27317d;
            this.f27331i = C5269x.f27317d;
            this.f27332j = C5269x.f27317d;
            this.f27333k = C5269x.f27320g;
            this.f27334l = 0;
            this.f27326d = new h(strSubstring, this);
            this.f27335m = new int[]{1};
            this.f27336n = new int[]{536870912};
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.C5256b toProto() {
            return this.f27324b;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private b(AbstractC5254w.C5256b c5256b, h hVar, b bVar, int i8) throws d {
            l[] lVarArr;
            b[] bVarArr;
            e[] eVarArr;
            g[] gVarArr;
            g[] gVarArr2;
            a aVar = null;
            super(aVar);
            this.f27323a = i8;
            this.f27324b = c5256b;
            this.f27325c = C5269x.k(hVar, bVar, c5256b.getName());
            this.f27326d = hVar;
            this.f27327e = bVar;
            if (c5256b.getOneofDeclCount() <= 0) {
                lVarArr = C5269x.f27320g;
            } else {
                lVarArr = new l[c5256b.getOneofDeclCount()];
            }
            this.f27333k = lVarArr;
            int i9 = 0;
            for (int i10 = 0; i10 < c5256b.getOneofDeclCount(); i10++) {
                this.f27333k[i10] = new l(c5256b.getOneofDecl(i10), hVar, this, i10, null);
            }
            if (c5256b.getNestedTypeCount() <= 0) {
                bVarArr = C5269x.f27316c;
            } else {
                bVarArr = new b[c5256b.getNestedTypeCount()];
            }
            this.f27328f = bVarArr;
            for (int i11 = 0; i11 < c5256b.getNestedTypeCount(); i11++) {
                this.f27328f[i11] = new b(c5256b.getNestedType(i11), hVar, this, i11);
            }
            if (c5256b.getEnumTypeCount() <= 0) {
                eVarArr = C5269x.f27318e;
            } else {
                eVarArr = new e[c5256b.getEnumTypeCount()];
            }
            this.f27329g = eVarArr;
            for (int i12 = 0; i12 < c5256b.getEnumTypeCount(); i12++) {
                this.f27329g[i12] = new e(c5256b.getEnumType(i12), hVar, this, i12, null);
            }
            if (c5256b.getFieldCount() <= 0) {
                gVarArr = C5269x.f27317d;
            } else {
                gVarArr = new g[c5256b.getFieldCount()];
            }
            this.f27330h = gVarArr;
            for (int i13 = 0; i13 < c5256b.getFieldCount(); i13++) {
                this.f27330h[i13] = new g(c5256b.getField(i13), hVar, this, i13, false, null);
            }
            this.f27331i = c5256b.getFieldCount() > 0 ? (g[]) this.f27330h.clone() : C5269x.f27317d;
            if (c5256b.getExtensionCount() <= 0) {
                gVarArr2 = C5269x.f27317d;
            } else {
                gVarArr2 = new g[c5256b.getExtensionCount()];
            }
            this.f27332j = gVarArr2;
            for (int i14 = 0; i14 < c5256b.getExtensionCount(); i14++) {
                this.f27332j[i14] = new g(c5256b.getExtension(i14), hVar, this, i14, true, null);
            }
            for (int i15 = 0; i15 < c5256b.getOneofDeclCount(); i15++) {
                l lVar = this.f27333k[i15];
                lVar.f27407g = new g[lVar.getFieldCount()];
                this.f27333k[i15].f27406f = 0;
            }
            for (int i16 = 0; i16 < c5256b.getFieldCount(); i16++) {
                l containingOneof = this.f27330h[i16].getContainingOneof();
                if (containingOneof != null) {
                    containingOneof.f27407g[l.d(containingOneof)] = this.f27330h[i16];
                }
            }
            int i17 = 0;
            for (l lVar2 : this.f27333k) {
                if (lVar2.isSynthetic()) {
                    i17++;
                } else if (i17 > 0) {
                    throw new d(this, "Synthetic oneofs must come last.", aVar);
                }
            }
            this.f27334l = this.f27333k.length - i17;
            hVar.f27391h.b(this);
            if (c5256b.getExtensionRangeCount() <= 0) {
                this.f27335m = C5269x.f27315b;
                this.f27336n = C5269x.f27315b;
                return;
            }
            this.f27335m = new int[c5256b.getExtensionRangeCount()];
            this.f27336n = new int[c5256b.getExtensionRangeCount()];
            for (AbstractC5254w.C5256b.c cVar : c5256b.getExtensionRangeList()) {
                this.f27335m[i9] = cVar.getStart();
                this.f27336n[i9] = cVar.getEnd();
                i9++;
            }
            Arrays.sort(this.f27335m);
            Arrays.sort(this.f27336n);
        }
    }

    /* renamed from: com.google.protobuf.x$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f27337a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27338b;

        /* renamed from: c, reason: collision with root package name */
        private final Map f27339c = new HashMap();

        /* renamed from: com.google.protobuf.x$c$a */
        private static final class a extends i {

            /* renamed from: a, reason: collision with root package name */
            private final String f27340a;

            /* renamed from: b, reason: collision with root package name */
            private final String f27341b;

            /* renamed from: c, reason: collision with root package name */
            private final h f27342c;

            a(String str, String str2, h hVar) {
                super(null);
                this.f27342c = hVar;
                this.f27341b = str2;
                this.f27340a = str;
            }

            @Override // com.google.protobuf.C5269x.i
            public h getFile() {
                return this.f27342c;
            }

            @Override // com.google.protobuf.C5269x.i
            public String getFullName() {
                return this.f27341b;
            }

            @Override // com.google.protobuf.C5269x.i
            public String getName() {
                return this.f27340a;
            }

            @Override // com.google.protobuf.C5269x.i
            public H0 toProto() {
                return this.f27342c.toProto();
            }
        }

        /* renamed from: com.google.protobuf.x$c$b */
        enum b {
            TYPES_ONLY,
            AGGREGATES_ONLY,
            ALL_SYMBOLS
        }

        c(h[] hVarArr, boolean z8) {
            this.f27337a = Collections.newSetFromMap(new IdentityHashMap(hVarArr.length));
            this.f27338b = z8;
            for (h hVar : hVarArr) {
                this.f27337a.add(hVar);
                e(hVar);
            }
            for (h hVar2 : this.f27337a) {
                try {
                    a(hVar2.getPackage(), hVar2);
                } catch (d e8) {
                    throw new AssertionError(e8);
                }
            }
        }

        private void e(h hVar) {
            for (h hVar2 : hVar.getPublicDependencies()) {
                if (this.f27337a.add(hVar2)) {
                    e(hVar2);
                }
            }
        }

        static void i(i iVar) throws d {
            String name = iVar.getName();
            a aVar = null;
            if (name.length() == 0) {
                throw new d(iVar, "Missing name.", aVar);
            }
            for (int i8 = 0; i8 < name.length(); i8++) {
                char cCharAt = name.charAt(i8);
                if (('a' > cCharAt || cCharAt > 'z') && (('A' > cCharAt || cCharAt > 'Z') && cCharAt != '_' && ('0' > cCharAt || cCharAt > '9' || i8 <= 0))) {
                    throw new d(iVar, '\"' + name + "\" is not a valid identifier.", aVar);
                }
            }
        }

        void a(String str, h hVar) throws d {
            String strSubstring;
            int iLastIndexOf = str.lastIndexOf(46);
            if (iLastIndexOf == -1) {
                strSubstring = str;
            } else {
                a(str.substring(0, iLastIndexOf), hVar);
                strSubstring = str.substring(iLastIndexOf + 1);
            }
            i iVar = (i) this.f27339c.put(str, new a(strSubstring, str, hVar));
            if (iVar != null) {
                this.f27339c.put(str, iVar);
                if (iVar instanceof a) {
                    return;
                }
                throw new d(hVar, '\"' + strSubstring + "\" is already defined (as something other than a package) in file \"" + iVar.getFile().getName() + "\".", (a) null);
            }
        }

        void b(i iVar) throws d {
            i(iVar);
            String fullName = iVar.getFullName();
            i iVar2 = (i) this.f27339c.put(fullName, iVar);
            if (iVar2 != null) {
                this.f27339c.put(fullName, iVar2);
                a aVar = null;
                if (iVar.getFile() != iVar2.getFile()) {
                    throw new d(iVar, '\"' + fullName + "\" is already defined in file \"" + iVar2.getFile().getName() + "\".", aVar);
                }
                int iLastIndexOf = fullName.lastIndexOf(46);
                if (iLastIndexOf == -1) {
                    throw new d(iVar, '\"' + fullName + "\" is already defined.", aVar);
                }
                throw new d(iVar, '\"' + fullName.substring(iLastIndexOf + 1) + "\" is already defined in \"" + fullName.substring(0, iLastIndexOf) + "\".", aVar);
            }
        }

        i c(String str) {
            return d(str, b.ALL_SYMBOLS);
        }

        i d(String str, b bVar) {
            i iVar = (i) this.f27339c.get(str);
            if (iVar != null && (bVar == b.ALL_SYMBOLS || ((bVar == b.TYPES_ONLY && g(iVar)) || (bVar == b.AGGREGATES_ONLY && f(iVar))))) {
                return iVar;
            }
            Iterator it = this.f27337a.iterator();
            while (it.hasNext()) {
                i iVar2 = (i) ((h) it.next()).f27391h.f27339c.get(str);
                if (iVar2 != null && (bVar == b.ALL_SYMBOLS || ((bVar == b.TYPES_ONLY && g(iVar2)) || (bVar == b.AGGREGATES_ONLY && f(iVar2))))) {
                    return iVar2;
                }
            }
            return null;
        }

        boolean f(i iVar) {
            return (iVar instanceof b) || (iVar instanceof e) || (iVar instanceof a) || (iVar instanceof m);
        }

        boolean g(i iVar) {
            return (iVar instanceof b) || (iVar instanceof e);
        }

        i h(String str, i iVar, b bVar) throws d {
            i iVarD;
            String string;
            if (str.startsWith(".")) {
                string = str.substring(1);
                iVarD = d(string, bVar);
            } else {
                int iIndexOf = str.indexOf(46);
                String strSubstring = iIndexOf == -1 ? str : str.substring(0, iIndexOf);
                StringBuilder sb = new StringBuilder(iVar.getFullName());
                while (true) {
                    int iLastIndexOf = sb.lastIndexOf(".");
                    if (iLastIndexOf == -1) {
                        iVarD = d(str, bVar);
                        string = str;
                        break;
                    }
                    int i8 = iLastIndexOf + 1;
                    sb.setLength(i8);
                    sb.append(strSubstring);
                    i iVarD2 = d(sb.toString(), b.AGGREGATES_ONLY);
                    if (iVarD2 != null) {
                        if (iIndexOf != -1) {
                            sb.setLength(i8);
                            sb.append(str);
                            iVarD = d(sb.toString(), bVar);
                        } else {
                            iVarD = iVarD2;
                        }
                        string = sb.toString();
                    } else {
                        sb.setLength(iLastIndexOf);
                    }
                }
            }
            if (iVarD != null) {
                return iVarD;
            }
            if (!this.f27338b || bVar != b.TYPES_ONLY) {
                throw new d(iVar, '\"' + str + "\" is not defined.", (a) null);
            }
            C5269x.f27314a.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
            b bVar2 = new b(string);
            this.f27337a.add(bVar2.getFile());
            return bVar2;
        }
    }

    /* renamed from: com.google.protobuf.x$d */
    public static class d extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private final String f27344a;

        /* renamed from: b, reason: collision with root package name */
        private final H0 f27345b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27346c;

        /* synthetic */ d(h hVar, String str, a aVar) {
            this(hVar, str);
        }

        public String getDescription() {
            return this.f27346c;
        }

        public H0 getProblemProto() {
            return this.f27345b;
        }

        public String getProblemSymbolName() {
            return this.f27344a;
        }

        /* synthetic */ d(i iVar, String str, a aVar) {
            this(iVar, str);
        }

        /* synthetic */ d(i iVar, String str, Throwable th, a aVar) {
            this(iVar, str, th);
        }

        private d(i iVar, String str) {
            super(iVar.getFullName() + ": " + str);
            this.f27344a = iVar.getFullName();
            this.f27345b = iVar.toProto();
            this.f27346c = str;
        }

        private d(i iVar, String str, Throwable th) {
            this(iVar, str);
            initCause(th);
        }

        private d(h hVar, String str) {
            super(hVar.getName() + ": " + str);
            this.f27344a = hVar.getName();
            this.f27345b = hVar.toProto();
            this.f27346c = str;
        }
    }

    /* renamed from: com.google.protobuf.x$e */
    public static final class e extends i implements AbstractC5227l0.d {

        /* renamed from: a, reason: collision with root package name */
        private final int f27347a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.C5258d f27348b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27349c;

        /* renamed from: d, reason: collision with root package name */
        private final h f27350d;

        /* renamed from: e, reason: collision with root package name */
        private final b f27351e;

        /* renamed from: f, reason: collision with root package name */
        private final f[] f27352f;

        /* renamed from: g, reason: collision with root package name */
        private final f[] f27353g;

        /* renamed from: h, reason: collision with root package name */
        private final int f27354h;

        /* renamed from: i, reason: collision with root package name */
        private Map f27355i;

        /* renamed from: j, reason: collision with root package name */
        private ReferenceQueue f27356j;

        /* renamed from: com.google.protobuf.x$e$a */
        private static class a extends WeakReference {

            /* renamed from: a, reason: collision with root package name */
            private final int f27357a;

            /* synthetic */ a(int i8, f fVar, a aVar) {
                this(i8, fVar);
            }

            private a(int i8, f fVar) {
                super(fVar);
                this.f27357a = i8;
            }
        }

        /* synthetic */ e(AbstractC5254w.C5258d c5258d, h hVar, b bVar, int i8, a aVar) {
            this(c5258d, hVar, bVar, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(AbstractC5254w.C5258d c5258d) {
            this.f27348b = c5258d;
            int i8 = 0;
            while (true) {
                f[] fVarArr = this.f27352f;
                if (i8 >= fVarArr.length) {
                    return;
                }
                fVarArr[i8].b(c5258d.getValue(i8));
                i8++;
            }
        }

        public f findValueByName(String str) {
            i iVarC = this.f27350d.f27391h.c(this.f27349c + Q7.C.PACKAGE_SEPARATOR_CHAR + str);
            if (iVarC instanceof f) {
                return (f) iVarC;
            }
            return null;
        }

        public f findValueByNumberCreatingIfUnknown(int i8) {
            f fVar;
            f fVarFindValueByNumber = findValueByNumber(i8);
            if (fVarFindValueByNumber != null) {
                return fVarFindValueByNumber;
            }
            synchronized (this) {
                try {
                    if (this.f27356j == null) {
                        this.f27356j = new ReferenceQueue();
                        this.f27355i = new HashMap();
                    } else {
                        while (true) {
                            a aVar = (a) this.f27356j.poll();
                            if (aVar == null) {
                                break;
                            }
                            this.f27355i.remove(Integer.valueOf(aVar.f27357a));
                        }
                    }
                    WeakReference weakReference = (WeakReference) this.f27355i.get(Integer.valueOf(i8));
                    a aVar2 = null;
                    fVar = weakReference == null ? null : (f) weakReference.get();
                    if (fVar == null) {
                        fVar = new f(this, Integer.valueOf(i8), aVar2);
                        this.f27355i.put(Integer.valueOf(i8), new a(i8, fVar, aVar2));
                    }
                } finally {
                }
            }
            return fVar;
        }

        public b getContainingType() {
            return this.f27351e;
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27350d;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27349c;
        }

        public int getIndex() {
            return this.f27347a;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27348b.getName();
        }

        public AbstractC5254w.C5260f getOptions() {
            return this.f27348b.getOptions();
        }

        public List<f> getValues() {
            return Collections.unmodifiableList(Arrays.asList(this.f27352f));
        }

        public boolean isClosed() {
            return getFile().getSyntax() != h.b.PROTO3;
        }

        public boolean isReservedName(String str) {
            AbstractC5227l0.a(str);
            Iterator it = this.f27348b.getReservedNameList().iterator();
            while (it.hasNext()) {
                if (((String) it.next()).equals(str)) {
                    return true;
                }
            }
            return false;
        }

        public boolean isReservedNumber(int i8) {
            for (AbstractC5254w.C5258d.c cVar : this.f27348b.getReservedRangeList()) {
                if (cVar.getStart() <= i8 && i8 <= cVar.getEnd()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private e(AbstractC5254w.C5258d c5258d, h hVar, b bVar, int i8) throws d {
            a aVar = null;
            super(aVar);
            this.f27355i = null;
            this.f27356j = null;
            this.f27347a = i8;
            this.f27348b = c5258d;
            this.f27349c = C5269x.k(hVar, bVar, c5258d.getName());
            this.f27350d = hVar;
            this.f27351e = bVar;
            if (c5258d.getValueCount() == 0) {
                throw new d(this, "Enums must contain at least one value.", aVar);
            }
            this.f27352f = new f[c5258d.getValueCount()];
            int i9 = 0;
            for (int i10 = 0; i10 < c5258d.getValueCount(); i10++) {
                this.f27352f[i10] = new f(c5258d.getValue(i10), hVar, this, i10, null);
            }
            f[] fVarArr = (f[]) this.f27352f.clone();
            this.f27353g = fVarArr;
            Arrays.sort(fVarArr, f.f27358e);
            for (int i11 = 1; i11 < c5258d.getValueCount(); i11++) {
                f[] fVarArr2 = this.f27353g;
                f fVar = fVarArr2[i9];
                f fVar2 = fVarArr2[i11];
                if (fVar.getNumber() != fVar2.getNumber()) {
                    i9++;
                    this.f27353g[i9] = fVar2;
                }
            }
            int i12 = i9 + 1;
            this.f27354h = i12;
            Arrays.fill(this.f27353g, i12, c5258d.getValueCount(), (Object) null);
            hVar.f27391h.b(this);
        }

        @Override // com.google.protobuf.AbstractC5227l0.d
        public f findValueByNumber(int i8) {
            return (f) C5269x.j(this.f27353g, this.f27354h, f.f27359f, i8);
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.C5258d toProto() {
            return this.f27348b;
        }
    }

    /* renamed from: com.google.protobuf.x$f */
    public static final class f extends i implements AbstractC5227l0.c {

        /* renamed from: e, reason: collision with root package name */
        static final Comparator f27358e = new a();

        /* renamed from: f, reason: collision with root package name */
        static final k f27359f = new b();

        /* renamed from: a, reason: collision with root package name */
        private final int f27360a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.C5262h f27361b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27362c;

        /* renamed from: d, reason: collision with root package name */
        private final e f27363d;

        /* renamed from: com.google.protobuf.x$f$a */
        class a implements Comparator {
            a() {
            }

            @Override // java.util.Comparator
            public int compare(f fVar, f fVar2) {
                return Integer.valueOf(fVar.getNumber()).compareTo(Integer.valueOf(fVar2.getNumber()));
            }
        }

        /* renamed from: com.google.protobuf.x$f$b */
        class b implements k {
            b() {
            }

            @Override // com.google.protobuf.C5269x.k
            public int getNumber(f fVar) {
                return fVar.getNumber();
            }
        }

        /* synthetic */ f(AbstractC5254w.C5262h c5262h, h hVar, e eVar, int i8, a aVar) {
            this(c5262h, hVar, eVar, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(AbstractC5254w.C5262h c5262h) {
            this.f27361b = c5262h;
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27363d.f27350d;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27362c;
        }

        public int getIndex() {
            return this.f27360a;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27361b.getName();
        }

        @Override // com.google.protobuf.AbstractC5227l0.c
        public int getNumber() {
            return this.f27361b.getNumber();
        }

        public AbstractC5254w.C5264j getOptions() {
            return this.f27361b.getOptions();
        }

        public e getType() {
            return this.f27363d;
        }

        public String toString() {
            return this.f27361b.getName();
        }

        /* synthetic */ f(e eVar, Integer num, a aVar) {
            this(eVar, num);
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.C5262h toProto() {
            return this.f27361b;
        }

        private f(AbstractC5254w.C5262h c5262h, h hVar, e eVar, int i8) throws d {
            super(null);
            this.f27360a = i8;
            this.f27361b = c5262h;
            this.f27363d = eVar;
            this.f27362c = eVar.getFullName() + Q7.C.PACKAGE_SEPARATOR_CHAR + c5262h.getName();
            hVar.f27391h.b(this);
        }

        private f(e eVar, Integer num) {
            super(null);
            AbstractC5254w.C5262h c5262hBuild = AbstractC5254w.C5262h.newBuilder().setName("UNKNOWN_ENUM_VALUE_" + eVar.getName() + "_" + num).setNumber(num.intValue()).build();
            this.f27360a = -1;
            this.f27361b = c5262hBuild;
            this.f27363d = eVar;
            this.f27362c = eVar.getFullName() + Q7.C.PACKAGE_SEPARATOR_CHAR + c5262hBuild.getName();
        }
    }

    /* renamed from: com.google.protobuf.x$g */
    public static final class g extends i implements Comparable, W.c {

        /* renamed from: n, reason: collision with root package name */
        private static final k f27364n = new a();

        /* renamed from: o, reason: collision with root package name */
        private static final P1.b[] f27365o = P1.b.values();

        /* renamed from: a, reason: collision with root package name */
        private final int f27366a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.n f27367b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27368c;

        /* renamed from: d, reason: collision with root package name */
        private String f27369d;

        /* renamed from: e, reason: collision with root package name */
        private final h f27370e;

        /* renamed from: f, reason: collision with root package name */
        private final b f27371f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f27372g;

        /* renamed from: h, reason: collision with root package name */
        private c f27373h;

        /* renamed from: i, reason: collision with root package name */
        private b f27374i;

        /* renamed from: j, reason: collision with root package name */
        private b f27375j;

        /* renamed from: k, reason: collision with root package name */
        private l f27376k;

        /* renamed from: l, reason: collision with root package name */
        private e f27377l;

        /* renamed from: m, reason: collision with root package name */
        private Object f27378m;

        /* renamed from: com.google.protobuf.x$g$a */
        class a implements k {
            a() {
            }

            @Override // com.google.protobuf.C5269x.k
            public int getNumber(g gVar) {
                return gVar.getNumber();
            }
        }

        /* renamed from: com.google.protobuf.x$g$b */
        public enum b {
            INT(0),
            LONG(0L),
            FLOAT(Float.valueOf(0.0f)),
            DOUBLE(Double.valueOf(0.0d)),
            BOOLEAN(Boolean.FALSE),
            STRING(""),
            BYTE_STRING(AbstractC5235o.EMPTY),
            ENUM(null),
            MESSAGE(null);


            /* renamed from: a, reason: collision with root package name */
            private final Object f27380a;

            b(Object obj) {
                this.f27380a = obj;
            }
        }

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
        	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
        	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
        	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* renamed from: com.google.protobuf.x$g$c */
        public static final class c {
            public static final c BOOL;
            public static final c BYTES;
            public static final c DOUBLE;
            public static final c ENUM;
            public static final c FIXED32;
            public static final c FIXED64;
            public static final c FLOAT;
            public static final c GROUP;
            public static final c INT32;
            public static final c INT64;
            public static final c MESSAGE;
            public static final c SFIXED32;
            public static final c SFIXED64;
            public static final c SINT32;
            public static final c SINT64;
            public static final c STRING;
            public static final c UINT32;
            public static final c UINT64;

            /* renamed from: b, reason: collision with root package name */
            private static final c[] f27381b;

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ c[] f27382c;

            /* renamed from: a, reason: collision with root package name */
            private final b f27383a;

            static {
                c cVar = new c("DOUBLE", 0, b.DOUBLE);
                DOUBLE = cVar;
                c cVar2 = new c("FLOAT", 1, b.FLOAT);
                FLOAT = cVar2;
                b bVar = b.LONG;
                c cVar3 = new c("INT64", 2, bVar);
                INT64 = cVar3;
                c cVar4 = new c("UINT64", 3, bVar);
                UINT64 = cVar4;
                b bVar2 = b.INT;
                c cVar5 = new c("INT32", 4, bVar2);
                INT32 = cVar5;
                c cVar6 = new c("FIXED64", 5, bVar);
                FIXED64 = cVar6;
                c cVar7 = new c("FIXED32", 6, bVar2);
                FIXED32 = cVar7;
                c cVar8 = new c("BOOL", 7, b.BOOLEAN);
                BOOL = cVar8;
                c cVar9 = new c("STRING", 8, b.STRING);
                STRING = cVar9;
                b bVar3 = b.MESSAGE;
                c cVar10 = new c("GROUP", 9, bVar3);
                GROUP = cVar10;
                c cVar11 = new c("MESSAGE", 10, bVar3);
                MESSAGE = cVar11;
                c cVar12 = new c("BYTES", 11, b.BYTE_STRING);
                BYTES = cVar12;
                c cVar13 = new c("UINT32", 12, bVar2);
                UINT32 = cVar13;
                c cVar14 = new c("ENUM", 13, b.ENUM);
                ENUM = cVar14;
                c cVar15 = new c("SFIXED32", 14, bVar2);
                SFIXED32 = cVar15;
                c cVar16 = new c("SFIXED64", 15, bVar);
                SFIXED64 = cVar16;
                c cVar17 = new c("SINT32", 16, bVar2);
                SINT32 = cVar17;
                c cVar18 = new c("SINT64", 17, bVar);
                SINT64 = cVar18;
                f27382c = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18};
                f27381b = values();
            }

            private c(String str, int i8, b bVar) {
                this.f27383a = bVar;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f27382c.clone();
            }

            public b getJavaType() {
                return this.f27383a;
            }

            public AbstractC5254w.n.d toProto() {
                return AbstractC5254w.n.d.forNumber(ordinal() + 1);
            }

            public static c valueOf(AbstractC5254w.n.d dVar) {
                return f27381b[dVar.getNumber() - 1];
            }
        }

        static {
            if (c.f27381b.length != AbstractC5254w.n.d.values().length) {
                throw new RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
            }
        }

        /* synthetic */ g(AbstractC5254w.n nVar, h hVar, b bVar, int i8, boolean z8, a aVar) {
            this(nVar, hVar, bVar, i8, z8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public void e() throws d {
            a aVar = null;
            if (this.f27367b.hasExtendee()) {
                i iVarH = this.f27370e.f27391h.h(this.f27367b.getExtendee(), this, c.b.TYPES_ONLY);
                if (!(iVarH instanceof b)) {
                    throw new d(this, '\"' + this.f27367b.getExtendee() + "\" is not a message type.", aVar);
                }
                this.f27374i = (b) iVarH;
                if (!getContainingType().isExtensionNumber(getNumber())) {
                    throw new d(this, '\"' + getContainingType().getFullName() + "\" does not declare " + getNumber() + " as an extension number.", aVar);
                }
            }
            if (this.f27367b.hasTypeName()) {
                i iVarH2 = this.f27370e.f27391h.h(this.f27367b.getTypeName(), this, c.b.TYPES_ONLY);
                if (!this.f27367b.hasType()) {
                    if (iVarH2 instanceof b) {
                        this.f27373h = c.MESSAGE;
                    } else {
                        if (!(iVarH2 instanceof e)) {
                            throw new d(this, '\"' + this.f27367b.getTypeName() + "\" is not a type.", aVar);
                        }
                        this.f27373h = c.ENUM;
                    }
                }
                if (getJavaType() == b.MESSAGE) {
                    if (!(iVarH2 instanceof b)) {
                        throw new d(this, '\"' + this.f27367b.getTypeName() + "\" is not a message type.", aVar);
                    }
                    this.f27375j = (b) iVarH2;
                    if (this.f27367b.hasDefaultValue()) {
                        throw new d(this, "Messages can't have default values.", aVar);
                    }
                } else {
                    if (getJavaType() != b.ENUM) {
                        throw new d(this, "Field with primitive type has type_name.", aVar);
                    }
                    if (!(iVarH2 instanceof e)) {
                        throw new d(this, '\"' + this.f27367b.getTypeName() + "\" is not an enum type.", aVar);
                    }
                    this.f27377l = (e) iVarH2;
                }
            } else if (getJavaType() == b.MESSAGE || getJavaType() == b.ENUM) {
                throw new d(this, "Field with message or enum type missing type_name.", aVar);
            }
            if (this.f27367b.getOptions().getPacked() && !isPackable()) {
                throw new d(this, "[packed = true] can only be specified for repeated primitive fields.", aVar);
            }
            if (this.f27367b.hasDefaultValue()) {
                if (isRepeated()) {
                    throw new d(this, "Repeated fields cannot have default values.", aVar);
                }
                try {
                    switch (a.f27321a[getType().ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            this.f27378m = Integer.valueOf(t1.h(this.f27367b.getDefaultValue()));
                            break;
                        case 4:
                        case 5:
                            this.f27378m = Integer.valueOf(t1.k(this.f27367b.getDefaultValue()));
                            break;
                        case 6:
                        case 7:
                        case 8:
                            this.f27378m = Long.valueOf(t1.i(this.f27367b.getDefaultValue()));
                            break;
                        case 9:
                        case 10:
                            this.f27378m = Long.valueOf(t1.l(this.f27367b.getDefaultValue()));
                            break;
                        case 11:
                            if (!this.f27367b.getDefaultValue().equals("inf")) {
                                if (!this.f27367b.getDefaultValue().equals("-inf")) {
                                    if (!this.f27367b.getDefaultValue().equals("nan")) {
                                        this.f27378m = Float.valueOf(this.f27367b.getDefaultValue());
                                        break;
                                    } else {
                                        this.f27378m = Float.valueOf(Float.NaN);
                                        break;
                                    }
                                } else {
                                    this.f27378m = Float.valueOf(Float.NEGATIVE_INFINITY);
                                    break;
                                }
                            } else {
                                this.f27378m = Float.valueOf(Float.POSITIVE_INFINITY);
                                break;
                            }
                        case 12:
                            if (!this.f27367b.getDefaultValue().equals("inf")) {
                                if (!this.f27367b.getDefaultValue().equals("-inf")) {
                                    if (!this.f27367b.getDefaultValue().equals("nan")) {
                                        this.f27378m = Double.valueOf(this.f27367b.getDefaultValue());
                                        break;
                                    } else {
                                        this.f27378m = Double.valueOf(Double.NaN);
                                        break;
                                    }
                                } else {
                                    this.f27378m = Double.valueOf(Double.NEGATIVE_INFINITY);
                                    break;
                                }
                            } else {
                                this.f27378m = Double.valueOf(Double.POSITIVE_INFINITY);
                                break;
                            }
                        case 13:
                            this.f27378m = Boolean.valueOf(this.f27367b.getDefaultValue());
                            break;
                        case 14:
                            this.f27378m = this.f27367b.getDefaultValue();
                            break;
                        case 15:
                            try {
                                this.f27378m = t1.unescapeBytes(this.f27367b.getDefaultValue());
                                break;
                            } catch (t1.b e8) {
                                throw new d(this, "Couldn't parse default value: " + e8.getMessage(), e8, aVar);
                            }
                        case 16:
                            f fVarFindValueByName = this.f27377l.findValueByName(this.f27367b.getDefaultValue());
                            this.f27378m = fVarFindValueByName;
                            if (fVarFindValueByName == null) {
                                throw new d(this, "Unknown enum default value: \"" + this.f27367b.getDefaultValue() + '\"', aVar);
                            }
                            break;
                        case 17:
                        case 18:
                            throw new d(this, "Message type had default value.", aVar);
                    }
                } catch (NumberFormatException e9) {
                    throw new d(this, "Could not parse default value: \"" + this.f27367b.getDefaultValue() + '\"', e9, aVar);
                }
            } else if (isRepeated()) {
                this.f27378m = Collections.emptyList();
            } else {
                int i8 = a.f27322b[getJavaType().ordinal()];
                if (i8 == 1) {
                    this.f27378m = this.f27377l.getValues().get(0);
                } else if (i8 != 2) {
                    this.f27378m = getJavaType().f27380a;
                } else {
                    this.f27378m = null;
                }
            }
            b bVar = this.f27374i;
            if (bVar == null || !bVar.getOptions().getMessageSetWireFormat()) {
                return;
            }
            if (!isExtension()) {
                throw new d(this, "MessageSets cannot have fields, only extensions.", aVar);
            }
            if (!isOptional() || getType() != c.MESSAGE) {
                throw new d(this, "Extensions of MessageSets must be optional messages.", aVar);
            }
        }

        private static String f(String str) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            boolean z8 = false;
            for (int i8 = 0; i8 < length; i8++) {
                char cCharAt = str.charAt(i8);
                if (cCharAt == '_') {
                    z8 = true;
                } else if (z8) {
                    if ('a' <= cCharAt && cCharAt <= 'z') {
                        cCharAt = (char) (cCharAt - ' ');
                    }
                    sb.append(cCharAt);
                    z8 = false;
                } else {
                    sb.append(cCharAt);
                }
            }
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(AbstractC5254w.n nVar) {
            this.f27367b = nVar;
        }

        public l getContainingOneof() {
            return this.f27376k;
        }

        public b getContainingType() {
            return this.f27374i;
        }

        public Object getDefaultValue() {
            if (getJavaType() != b.MESSAGE) {
                return this.f27378m;
            }
            throw new UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
        }

        public b getExtensionScope() {
            if (isExtension()) {
                return this.f27371f;
            }
            throw new UnsupportedOperationException(String.format("This field is not an extension. (%s)", this.f27368c));
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27370e;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27368c;
        }

        public int getIndex() {
            return this.f27366a;
        }

        public b getJavaType() {
            return this.f27373h.getJavaType();
        }

        public String getJsonName() {
            String str = this.f27369d;
            if (str != null) {
                return str;
            }
            if (this.f27367b.hasJsonName()) {
                String jsonName = this.f27367b.getJsonName();
                this.f27369d = jsonName;
                return jsonName;
            }
            String strF = f(this.f27367b.getName());
            this.f27369d = strF;
            return strF;
        }

        @Override // com.google.protobuf.W.c
        public P1.c getLiteJavaType() {
            return getLiteType().getJavaType();
        }

        @Override // com.google.protobuf.W.c
        public P1.b getLiteType() {
            return f27365o[this.f27373h.ordinal()];
        }

        public b getMessageType() {
            if (getJavaType() == b.MESSAGE) {
                return this.f27375j;
            }
            throw new UnsupportedOperationException(String.format("This field is not of message type. (%s)", this.f27368c));
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27367b.getName();
        }

        @Override // com.google.protobuf.W.c
        public int getNumber() {
            return this.f27367b.getNumber();
        }

        public AbstractC5254w.p getOptions() {
            return this.f27367b.getOptions();
        }

        public l getRealContainingOneof() {
            l lVar = this.f27376k;
            if (lVar == null || lVar.isSynthetic()) {
                return null;
            }
            return this.f27376k;
        }

        public c getType() {
            return this.f27373h;
        }

        public boolean hasDefaultValue() {
            return this.f27367b.hasDefaultValue();
        }

        public boolean hasOptionalKeyword() {
            return this.f27372g || (this.f27370e.getSyntax() == h.b.PROTO2 && isOptional() && getContainingOneof() == null);
        }

        public boolean hasPresence() {
            if (isRepeated()) {
                return false;
            }
            return getType() == c.MESSAGE || getType() == c.GROUP || getContainingOneof() != null || this.f27370e.getSyntax() == h.b.PROTO2;
        }

        @Override // com.google.protobuf.W.c
        public K0.a internalMergeFrom(K0.a aVar, K0 k02) {
            return ((H0.a) aVar).mergeFrom((H0) k02);
        }

        public boolean isExtension() {
            return this.f27367b.hasExtendee();
        }

        public boolean isMapField() {
            return getType() == c.MESSAGE && isRepeated() && getMessageType().getOptions().getMapEntry();
        }

        public boolean isOptional() {
            return this.f27367b.getLabel() == AbstractC5254w.n.c.LABEL_OPTIONAL;
        }

        public boolean isPackable() {
            return isRepeated() && getLiteType().isPackable();
        }

        @Override // com.google.protobuf.W.c
        public boolean isPacked() {
            if (isPackable()) {
                return getFile().getSyntax() == h.b.PROTO2 ? getOptions().getPacked() : !getOptions().hasPacked() || getOptions().getPacked();
            }
            return false;
        }

        @Override // com.google.protobuf.W.c
        public boolean isRepeated() {
            return this.f27367b.getLabel() == AbstractC5254w.n.c.LABEL_REPEATED;
        }

        public boolean isRequired() {
            return this.f27367b.getLabel() == AbstractC5254w.n.c.LABEL_REQUIRED;
        }

        public boolean needsUtf8Check() {
            if (this.f27373h != c.STRING) {
                return false;
            }
            if (getContainingType().getOptions().getMapEntry() || getFile().getSyntax() == h.b.PROTO3) {
                return true;
            }
            return getFile().getOptions().getJavaStringCheckUtf8();
        }

        public String toString() {
            return getFullName();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private g(AbstractC5254w.n nVar, h hVar, b bVar, int i8, boolean z8) throws d {
            a aVar = null;
            super(aVar);
            this.f27366a = i8;
            this.f27367b = nVar;
            this.f27368c = C5269x.k(hVar, bVar, nVar.getName());
            this.f27370e = hVar;
            if (nVar.hasType()) {
                this.f27373h = c.valueOf(nVar.getType());
            }
            this.f27372g = nVar.getProto3Optional();
            if (getNumber() <= 0) {
                throw new d(this, "Field numbers must be positive integers.", aVar);
            }
            if (z8) {
                if (!nVar.hasExtendee()) {
                    throw new d(this, "FieldDescriptorProto.extendee not set for extension field.", aVar);
                }
                this.f27374i = null;
                if (bVar != null) {
                    this.f27371f = bVar;
                } else {
                    this.f27371f = null;
                }
                if (nVar.hasOneofIndex()) {
                    throw new d(this, "FieldDescriptorProto.oneof_index set for extension field.", aVar);
                }
                this.f27376k = null;
            } else {
                if (nVar.hasExtendee()) {
                    throw new d(this, "FieldDescriptorProto.extendee set for non-extension field.", aVar);
                }
                this.f27374i = bVar;
                if (!nVar.hasOneofIndex()) {
                    this.f27376k = null;
                } else {
                    if (nVar.getOneofIndex() < 0 || nVar.getOneofIndex() >= bVar.toProto().getOneofDeclCount()) {
                        throw new d(this, "FieldDescriptorProto.oneof_index is out of range for type " + bVar.getName(), aVar);
                    }
                    l lVar = bVar.getOneofs().get(nVar.getOneofIndex());
                    this.f27376k = lVar;
                    l.d(lVar);
                }
                this.f27371f = null;
            }
            hVar.f27391h.b(this);
        }

        @Override // java.lang.Comparable
        public int compareTo(g gVar) {
            if (gVar.f27374i == this.f27374i) {
                return getNumber() - gVar.getNumber();
            }
            throw new IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
        }

        @Override // com.google.protobuf.W.c
        public e getEnumType() {
            if (getJavaType() == b.ENUM) {
                return this.f27377l;
            }
            throw new UnsupportedOperationException(String.format("This field is not of enum type. (%s)", this.f27368c));
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.n toProto() {
            return this.f27367b;
        }
    }

    /* renamed from: com.google.protobuf.x$h */
    public static final class h extends i {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5254w.r f27384a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f27385b;

        /* renamed from: c, reason: collision with root package name */
        private final e[] f27386c;

        /* renamed from: d, reason: collision with root package name */
        private final m[] f27387d;

        /* renamed from: e, reason: collision with root package name */
        private final g[] f27388e;

        /* renamed from: f, reason: collision with root package name */
        private final h[] f27389f;

        /* renamed from: g, reason: collision with root package name */
        private final h[] f27390g;

        /* renamed from: h, reason: collision with root package name */
        private final c f27391h;

        /* renamed from: com.google.protobuf.x$h$a */
        public interface a {
            K a(h hVar);
        }

        /* renamed from: com.google.protobuf.x$h$b */
        public enum b {
            UNKNOWN("unknown"),
            PROTO2("proto2"),
            PROTO3("proto3");


            /* renamed from: a, reason: collision with root package name */
            private final String f27393a;

            b(String str) {
                this.f27393a = str;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private h(AbstractC5254w.r rVar, h[] hVarArr, c cVar, boolean z8) throws d {
            a aVar = null;
            super(aVar);
            this.f27391h = cVar;
            this.f27384a = rVar;
            this.f27389f = (h[]) hVarArr.clone();
            HashMap map = new HashMap();
            for (h hVar : hVarArr) {
                map.put(hVar.getName(), hVar);
            }
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < rVar.getPublicDependencyCount(); i8++) {
                int publicDependency = rVar.getPublicDependency(i8);
                if (publicDependency < 0 || publicDependency >= rVar.getDependencyCount()) {
                    throw new d(this, "Invalid public dependency index.", aVar);
                }
                String dependency = rVar.getDependency(publicDependency);
                h hVar2 = (h) map.get(dependency);
                if (hVar2 != null) {
                    arrayList.add(hVar2);
                } else if (!z8) {
                    throw new d(this, "Invalid public dependency: " + dependency, aVar);
                }
            }
            h[] hVarArr2 = new h[arrayList.size()];
            this.f27390g = hVarArr2;
            arrayList.toArray(hVarArr2);
            cVar.a(getPackage(), this);
            this.f27385b = rVar.getMessageTypeCount() > 0 ? new b[rVar.getMessageTypeCount()] : C5269x.f27316c;
            for (int i9 = 0; i9 < rVar.getMessageTypeCount(); i9++) {
                this.f27385b[i9] = new b(rVar.getMessageType(i9), this, null, i9, null);
            }
            this.f27386c = rVar.getEnumTypeCount() > 0 ? new e[rVar.getEnumTypeCount()] : C5269x.f27318e;
            for (int i10 = 0; i10 < rVar.getEnumTypeCount(); i10++) {
                this.f27386c[i10] = new e(rVar.getEnumType(i10), this, null, i10, null);
            }
            this.f27387d = rVar.getServiceCount() > 0 ? new m[rVar.getServiceCount()] : C5269x.f27319f;
            for (int i11 = 0; i11 < rVar.getServiceCount(); i11++) {
                this.f27387d[i11] = new m(rVar.getService(i11), this, i11, aVar);
            }
            this.f27388e = rVar.getExtensionCount() > 0 ? new g[rVar.getExtensionCount()] : C5269x.f27317d;
            for (int i12 = 0; i12 < rVar.getExtensionCount(); i12++) {
                this.f27388e[i12] = new g(rVar.getExtension(i12), this, null, i12, true, null);
            }
        }

        private void b() throws d {
            for (b bVar : this.f27385b) {
                bVar.c();
            }
            for (m mVar : this.f27387d) {
                mVar.c();
            }
            for (g gVar : this.f27388e) {
                gVar.e();
            }
        }

        public static h buildFrom(AbstractC5254w.r rVar, h[] hVarArr) {
            return buildFrom(rVar, hVarArr, false);
        }

        private static h[] c(Class cls, String[] strArr, String[] strArr2) {
            ArrayList arrayList = new ArrayList();
            for (int i8 = 0; i8 < strArr.length; i8++) {
                try {
                    arrayList.add((h) cls.getClassLoader().loadClass(strArr[i8]).getField("descriptor").get(null));
                } catch (Exception unused) {
                    C5269x.f27314a.warning("Descriptors for \"" + strArr2[i8] + "\" can not be found.");
                }
            }
            return (h[]) arrayList.toArray(new h[0]);
        }

        private static byte[] d(String[] strArr) {
            if (strArr.length == 1) {
                return strArr[0].getBytes(AbstractC5227l0.f26568c);
            }
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }
            return sb.toString().getBytes(AbstractC5227l0.f26568c);
        }

        private void e(AbstractC5254w.r rVar) {
            this.f27384a = rVar;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                b[] bVarArr = this.f27385b;
                if (i9 >= bVarArr.length) {
                    break;
                }
                bVarArr[i9].d(rVar.getMessageType(i9));
                i9++;
            }
            int i10 = 0;
            while (true) {
                e[] eVarArr = this.f27386c;
                if (i10 >= eVarArr.length) {
                    break;
                }
                eVarArr[i10].c(rVar.getEnumType(i10));
                i10++;
            }
            int i11 = 0;
            while (true) {
                m[] mVarArr = this.f27387d;
                if (i11 >= mVarArr.length) {
                    break;
                }
                mVarArr[i11].d(rVar.getService(i11));
                i11++;
            }
            while (true) {
                g[] gVarArr = this.f27388e;
                if (i8 >= gVarArr.length) {
                    return;
                }
                gVarArr[i8].g(rVar.getExtension(i8));
                i8++;
            }
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, h[] hVarArr, a aVar) {
            byte[] bArrD = d(strArr);
            try {
                AbstractC5254w.r from = AbstractC5254w.r.parseFrom(bArrD);
                try {
                    h hVarBuildFrom = buildFrom(from, hVarArr, true);
                    K kA = aVar.a(hVarBuildFrom);
                    if (kA != null) {
                        try {
                            hVarBuildFrom.e(AbstractC5254w.r.parseFrom(bArrD, kA));
                        } catch (C5230m0 e8) {
                            throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e8);
                        }
                    }
                } catch (d e9) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e9);
                }
            } catch (C5230m0 e10) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e10);
            }
        }

        public static void internalUpdateFileDescriptor(h hVar, K k8) {
            try {
                hVar.e(AbstractC5254w.r.parseFrom(hVar.f27384a.toByteString(), k8));
            } catch (C5230m0 e8) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e8);
            }
        }

        boolean f() {
            return getSyntax() == b.PROTO3;
        }

        public e findEnumTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
            }
            i iVarC = this.f27391h.c(str);
            if ((iVarC instanceof e) && iVarC.getFile() == this) {
                return (e) iVarC;
            }
            return null;
        }

        public g findExtensionByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
            }
            i iVarC = this.f27391h.c(str);
            if ((iVarC instanceof g) && iVarC.getFile() == this) {
                return (g) iVarC;
            }
            return null;
        }

        public b findMessageTypeByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
            }
            i iVarC = this.f27391h.c(str);
            if ((iVarC instanceof b) && iVarC.getFile() == this) {
                return (b) iVarC;
            }
            return null;
        }

        public m findServiceByName(String str) {
            if (str.indexOf(46) != -1) {
                return null;
            }
            String str2 = getPackage();
            if (!str2.isEmpty()) {
                str = str2 + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
            }
            i iVarC = this.f27391h.c(str);
            if ((iVarC instanceof m) && iVarC.getFile() == this) {
                return (m) iVarC;
            }
            return null;
        }

        public List<h> getDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.f27389f));
        }

        public List<e> getEnumTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.f27386c));
        }

        public List<g> getExtensions() {
            return Collections.unmodifiableList(Arrays.asList(this.f27388e));
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27384a.getName();
        }

        public List<b> getMessageTypes() {
            return Collections.unmodifiableList(Arrays.asList(this.f27385b));
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27384a.getName();
        }

        public AbstractC5254w.t getOptions() {
            return this.f27384a.getOptions();
        }

        public String getPackage() {
            return this.f27384a.getPackage();
        }

        public List<h> getPublicDependencies() {
            return Collections.unmodifiableList(Arrays.asList(this.f27390g));
        }

        public List<m> getServices() {
            return Collections.unmodifiableList(Arrays.asList(this.f27387d));
        }

        public b getSyntax() {
            b bVar = b.PROTO3;
            return bVar.f27393a.equals(this.f27384a.getSyntax()) ? bVar : b.PROTO2;
        }

        public static h buildFrom(AbstractC5254w.r rVar, h[] hVarArr, boolean z8) throws d {
            h hVar = new h(rVar, hVarArr, new c(hVarArr, z8), z8);
            hVar.b();
            return hVar;
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.r toProto() {
            return this.f27384a;
        }

        public static h internalBuildGeneratedFileFrom(String[] strArr, h[] hVarArr) {
            try {
                AbstractC5254w.r from = AbstractC5254w.r.parseFrom(d(strArr));
                try {
                    return buildFrom(from, hVarArr, true);
                } catch (d e8) {
                    throw new IllegalArgumentException("Invalid embedded descriptor for \"" + from.getName() + "\".", e8);
                }
            } catch (C5230m0 e9) {
                throw new IllegalArgumentException("Failed to parse protocol buffer descriptor for generated code.", e9);
            }
        }

        @Deprecated
        public static void internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3, a aVar) {
            internalBuildGeneratedFileFrom(strArr, c(cls, strArr2, strArr3), aVar);
        }

        public static h internalBuildGeneratedFileFrom(String[] strArr, Class<?> cls, String[] strArr2, String[] strArr3) {
            return internalBuildGeneratedFileFrom(strArr, c(cls, strArr2, strArr3));
        }

        h(String str, b bVar) throws d {
            super(null);
            c cVar = new c(new h[0], true);
            this.f27391h = cVar;
            this.f27384a = AbstractC5254w.r.newBuilder().setName(bVar.getFullName() + ".placeholder.proto").setPackage(str).addMessageType(bVar.toProto()).build();
            this.f27389f = new h[0];
            this.f27390g = new h[0];
            this.f27385b = new b[]{bVar};
            this.f27386c = C5269x.f27318e;
            this.f27387d = C5269x.f27319f;
            this.f27388e = C5269x.f27317d;
            cVar.a(str, this);
            cVar.b(bVar);
        }
    }

    /* renamed from: com.google.protobuf.x$i */
    public static abstract class i {
        /* synthetic */ i(a aVar) {
            this();
        }

        public abstract h getFile();

        public abstract String getFullName();

        public abstract String getName();

        public abstract H0 toProto();

        private i() {
        }
    }

    /* renamed from: com.google.protobuf.x$j */
    public static final class j extends i {

        /* renamed from: a, reason: collision with root package name */
        private final int f27394a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.x f27395b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27396c;

        /* renamed from: d, reason: collision with root package name */
        private final h f27397d;

        /* renamed from: e, reason: collision with root package name */
        private final m f27398e;

        /* renamed from: f, reason: collision with root package name */
        private b f27399f;

        /* renamed from: g, reason: collision with root package name */
        private b f27400g;

        /* synthetic */ j(AbstractC5254w.x xVar, h hVar, m mVar, int i8, a aVar) {
            this(xVar, hVar, mVar, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() throws d {
            c cVar = getFile().f27391h;
            String inputType = this.f27395b.getInputType();
            c.b bVar = c.b.TYPES_ONLY;
            i iVarH = cVar.h(inputType, this, bVar);
            a aVar = null;
            if (!(iVarH instanceof b)) {
                throw new d(this, '\"' + this.f27395b.getInputType() + "\" is not a message type.", aVar);
            }
            this.f27399f = (b) iVarH;
            i iVarH2 = getFile().f27391h.h(this.f27395b.getOutputType(), this, bVar);
            if (iVarH2 instanceof b) {
                this.f27400g = (b) iVarH2;
                return;
            }
            throw new d(this, '\"' + this.f27395b.getOutputType() + "\" is not a message type.", aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(AbstractC5254w.x xVar) {
            this.f27395b = xVar;
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27397d;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27396c;
        }

        public int getIndex() {
            return this.f27394a;
        }

        public b getInputType() {
            return this.f27399f;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27395b.getName();
        }

        public AbstractC5254w.z getOptions() {
            return this.f27395b.getOptions();
        }

        public b getOutputType() {
            return this.f27400g;
        }

        public m getService() {
            return this.f27398e;
        }

        public boolean isClientStreaming() {
            return this.f27395b.getClientStreaming();
        }

        public boolean isServerStreaming() {
            return this.f27395b.getServerStreaming();
        }

        private j(AbstractC5254w.x xVar, h hVar, m mVar, int i8) throws d {
            super(null);
            this.f27394a = i8;
            this.f27395b = xVar;
            this.f27397d = hVar;
            this.f27398e = mVar;
            this.f27396c = mVar.getFullName() + Q7.C.PACKAGE_SEPARATOR_CHAR + xVar.getName();
            hVar.f27391h.b(this);
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.x toProto() {
            return this.f27395b;
        }
    }

    /* renamed from: com.google.protobuf.x$k */
    private interface k {
        int getNumber(Object obj);
    }

    /* renamed from: com.google.protobuf.x$l */
    public static final class l extends i {

        /* renamed from: a, reason: collision with root package name */
        private final int f27401a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.B f27402b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27403c;

        /* renamed from: d, reason: collision with root package name */
        private final h f27404d;

        /* renamed from: e, reason: collision with root package name */
        private b f27405e;

        /* renamed from: f, reason: collision with root package name */
        private int f27406f;

        /* renamed from: g, reason: collision with root package name */
        private g[] f27407g;

        /* synthetic */ l(AbstractC5254w.B b9, h hVar, b bVar, int i8, a aVar) {
            this(b9, hVar, bVar, i8);
        }

        static /* synthetic */ int d(l lVar) {
            int i8 = lVar.f27406f;
            lVar.f27406f = i8 + 1;
            return i8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(AbstractC5254w.B b9) {
            this.f27402b = b9;
        }

        public b getContainingType() {
            return this.f27405e;
        }

        public g getField(int i8) {
            return this.f27407g[i8];
        }

        public int getFieldCount() {
            return this.f27406f;
        }

        public List<g> getFields() {
            return Collections.unmodifiableList(Arrays.asList(this.f27407g));
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27404d;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27403c;
        }

        public int getIndex() {
            return this.f27401a;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27402b.getName();
        }

        public AbstractC5254w.D getOptions() {
            return this.f27402b.getOptions();
        }

        public boolean isSynthetic() {
            g[] gVarArr = this.f27407g;
            return gVarArr.length == 1 && gVarArr[0].f27372g;
        }

        private l(AbstractC5254w.B b9, h hVar, b bVar, int i8) {
            super(null);
            this.f27402b = b9;
            this.f27403c = C5269x.k(hVar, bVar, b9.getName());
            this.f27404d = hVar;
            this.f27401a = i8;
            this.f27405e = bVar;
            this.f27406f = 0;
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.B toProto() {
            return this.f27402b;
        }
    }

    /* renamed from: com.google.protobuf.x$m */
    public static final class m extends i {

        /* renamed from: a, reason: collision with root package name */
        private final int f27408a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5254w.F f27409b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27410c;

        /* renamed from: d, reason: collision with root package name */
        private final h f27411d;

        /* renamed from: e, reason: collision with root package name */
        private j[] f27412e;

        /* synthetic */ m(AbstractC5254w.F f8, h hVar, int i8, a aVar) {
            this(f8, hVar, i8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() throws d {
            for (j jVar : this.f27412e) {
                jVar.c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(AbstractC5254w.F f8) {
            this.f27409b = f8;
            int i8 = 0;
            while (true) {
                j[] jVarArr = this.f27412e;
                if (i8 >= jVarArr.length) {
                    return;
                }
                jVarArr[i8].d(f8.getMethod(i8));
                i8++;
            }
        }

        public j findMethodByName(String str) {
            i iVarC = this.f27411d.f27391h.c(this.f27410c + Q7.C.PACKAGE_SEPARATOR_CHAR + str);
            if (iVarC instanceof j) {
                return (j) iVarC;
            }
            return null;
        }

        @Override // com.google.protobuf.C5269x.i
        public h getFile() {
            return this.f27411d;
        }

        @Override // com.google.protobuf.C5269x.i
        public String getFullName() {
            return this.f27410c;
        }

        public int getIndex() {
            return this.f27408a;
        }

        public List<j> getMethods() {
            return Collections.unmodifiableList(Arrays.asList(this.f27412e));
        }

        @Override // com.google.protobuf.C5269x.i
        public String getName() {
            return this.f27409b.getName();
        }

        public AbstractC5254w.H getOptions() {
            return this.f27409b.getOptions();
        }

        private m(AbstractC5254w.F f8, h hVar, int i8) throws d {
            super(null);
            this.f27408a = i8;
            this.f27409b = f8;
            this.f27410c = C5269x.k(hVar, null, f8.getName());
            this.f27411d = hVar;
            this.f27412e = new j[f8.getMethodCount()];
            for (int i9 = 0; i9 < f8.getMethodCount(); i9++) {
                this.f27412e[i9] = new j(f8.getMethod(i9), hVar, this, i9, null);
            }
            hVar.f27391h.b(this);
        }

        @Override // com.google.protobuf.C5269x.i
        public AbstractC5254w.F toProto() {
            return this.f27409b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object j(Object[] objArr, int i8, k kVar, int i9) {
        int i10 = i8 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            Object obj = objArr[i12];
            int number = kVar.getNumber(obj);
            if (i9 < number) {
                i10 = i12 - 1;
            } else {
                if (i9 <= number) {
                    return obj;
                }
                i11 = i12 + 1;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String k(h hVar, b bVar, String str) {
        if (bVar != null) {
            return bVar.getFullName() + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
        }
        String str2 = hVar.getPackage();
        if (str2.isEmpty()) {
            return str;
        }
        return str2 + Q7.C.PACKAGE_SEPARATOR_CHAR + str;
    }
}
