package d7;

import Q7.C;
import S6.AbstractC0758b;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements k7.m {

    /* renamed from: a, reason: collision with root package name */
    private final File f30103a;

    /* renamed from: b, reason: collision with root package name */
    private final j f30104b;

    /* renamed from: c, reason: collision with root package name */
    private final f7.l f30105c;

    /* renamed from: d, reason: collision with root package name */
    private final f7.l f30106d;

    /* renamed from: e, reason: collision with root package name */
    private final f7.p f30107e;

    /* renamed from: f, reason: collision with root package name */
    private final int f30108f;

    private static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            Intrinsics.checkNotNullParameter(rootDir, "rootDir");
        }
    }

    private final class b extends AbstractC0758b {

        /* renamed from: c, reason: collision with root package name */
        private final ArrayDeque f30109c;

        private final class a extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f30111b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f30112c;

            /* renamed from: d, reason: collision with root package name */
            private int f30113d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f30114e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b f30115f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f30115f = bVar;
            }

            @Override // d7.i.c
            public File step() {
                if (!this.f30114e && this.f30112c == null) {
                    f7.l lVar = i.this.f30105c;
                    if (lVar != null && !((Boolean) lVar.invoke(getRoot())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = getRoot().listFiles();
                    this.f30112c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        f7.p pVar = i.this.f30107e;
                        if (pVar != null) {
                            pVar.invoke(getRoot(), new C5330a(getRoot(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f30114e = true;
                    }
                }
                File[] fileArr = this.f30112c;
                if (fileArr != null) {
                    int i8 = this.f30113d;
                    Intrinsics.checkNotNull(fileArr);
                    if (i8 < fileArr.length) {
                        File[] fileArr2 = this.f30112c;
                        Intrinsics.checkNotNull(fileArr2);
                        int i9 = this.f30113d;
                        this.f30113d = i9 + 1;
                        return fileArr2[i9];
                    }
                }
                if (!this.f30111b) {
                    this.f30111b = true;
                    return getRoot();
                }
                f7.l lVar2 = i.this.f30106d;
                if (lVar2 != null) {
                    lVar2.invoke(getRoot());
                }
                return null;
            }
        }

        /* renamed from: d7.i$b$b, reason: collision with other inner class name */
        private final class C0273b extends c {

            /* renamed from: b, reason: collision with root package name */
            private boolean f30116b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f30117c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0273b(b bVar, File rootFile) {
                super(rootFile);
                Intrinsics.checkNotNullParameter(rootFile, "rootFile");
                this.f30117c = bVar;
            }

            @Override // d7.i.c
            public File step() {
                if (this.f30116b) {
                    return null;
                }
                this.f30116b = true;
                return getRoot();
            }
        }

        private final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            private boolean f30118b;

            /* renamed from: c, reason: collision with root package name */
            private File[] f30119c;

            /* renamed from: d, reason: collision with root package name */
            private int f30120d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b f30121e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                Intrinsics.checkNotNullParameter(rootDir, "rootDir");
                this.f30121e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // d7.i.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.io.File step() {
                /*
                    r10 = this;
                    boolean r0 = r10.f30118b
                    r1 = 0
                    if (r0 != 0) goto L28
                    d7.i$b r0 = r10.f30121e
                    d7.i r0 = d7.i.this
                    f7.l r0 = d7.i.access$getOnEnter$p(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.getRoot()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.f30118b = r0
                    java.io.File r0 = r10.getRoot()
                    return r0
                L28:
                    java.io.File[] r0 = r10.f30119c
                    if (r0 == 0) goto L47
                    int r2 = r10.f30120d
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    d7.i$b r0 = r10.f30121e
                    d7.i r0 = d7.i.this
                    f7.l r0 = d7.i.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.f30119c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.getRoot()
                    java.io.File[] r0 = r0.listFiles()
                    r10.f30119c = r0
                    if (r0 != 0) goto L77
                    d7.i$b r0 = r10.f30121e
                    d7.i r0 = d7.i.this
                    f7.p r0 = d7.i.access$getOnFail$p(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.getRoot()
                    d7.a r9 = new d7.a
                    java.io.File r4 = r10.getRoot()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.f30119c
                    if (r0 == 0) goto L81
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    d7.i$b r0 = r10.f30121e
                    d7.i r0 = d7.i.this
                    f7.l r0 = d7.i.access$getOnLeave$p(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.getRoot()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.f30119c
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    int r1 = r10.f30120d
                    int r2 = r1 + 1
                    r10.f30120d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: d7.i.b.c.step():java.io.File");
            }
        }

        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.TOP_DOWN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.BOTTOM_UP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f30109c = arrayDeque;
            if (i.this.f30103a.isDirectory()) {
                arrayDeque.push(e(i.this.f30103a));
            } else if (i.this.f30103a.isFile()) {
                arrayDeque.push(new C0273b(this, i.this.f30103a));
            } else {
                b();
            }
        }

        private final a e(File file) {
            int i8 = d.$EnumSwitchMapping$0[i.this.f30104b.ordinal()];
            if (i8 == 1) {
                return new c(this, file);
            }
            if (i8 == 2) {
                return new a(this, file);
            }
            throw new R6.n();
        }

        private final File f() {
            File fileStep;
            while (true) {
                c cVar = (c) this.f30109c.peek();
                if (cVar == null) {
                    return null;
                }
                fileStep = cVar.step();
                if (fileStep == null) {
                    this.f30109c.pop();
                } else {
                    if (Intrinsics.areEqual(fileStep, cVar.getRoot()) || !fileStep.isDirectory() || this.f30109c.size() >= i.this.f30108f) {
                        break;
                    }
                    this.f30109c.push(e(fileStep));
                }
            }
            return fileStep;
        }

        @Override // S6.AbstractC0758b
        protected void a() {
            File fileF = f();
            if (fileF != null) {
                c(fileF);
            } else {
                b();
            }
        }
    }

    private static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        private final File f30122a;

        public c(File root) {
            Intrinsics.checkNotNullParameter(root, "root");
            this.f30122a = root;
        }

        public final File getRoot() {
            return this.f30122a;
        }

        public abstract File step();
    }

    private i(File file, j jVar, f7.l lVar, f7.l lVar2, f7.p pVar, int i8) {
        this.f30103a = file;
        this.f30104b = jVar;
        this.f30105c = lVar;
        this.f30106d = lVar2;
        this.f30107e = pVar;
        this.f30108f = i8;
    }

    @Override // k7.m
    public Iterator<File> iterator() {
        return new b();
    }

    public final i maxDepth(int i8) {
        if (i8 > 0) {
            return new i(this.f30103a, this.f30104b, this.f30105c, this.f30106d, this.f30107e, i8);
        }
        throw new IllegalArgumentException("depth must be positive, but was " + i8 + C.PACKAGE_SEPARATOR_CHAR);
    }

    public final i onEnter(f7.l function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new i(this.f30103a, this.f30104b, function, this.f30106d, this.f30107e, this.f30108f);
    }

    public final i onFail(f7.p function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new i(this.f30103a, this.f30104b, this.f30105c, this.f30106d, function, this.f30108f);
    }

    public final i onLeave(f7.l function) {
        Intrinsics.checkNotNullParameter(function, "function");
        return new i(this.f30103a, this.f30104b, this.f30105c, function, this.f30107e, this.f30108f);
    }

    /* synthetic */ i(File file, j jVar, f7.l lVar, f7.l lVar2, f7.p pVar, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i9 & 2) != 0 ? j.TOP_DOWN : jVar, lVar, lVar2, pVar, (i9 & 32) != 0 ? Integer.MAX_VALUE : i8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(File start, j direction) {
        this(start, direction, null, null, null, 0, 32, null);
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(direction, "direction");
    }

    public /* synthetic */ i(File file, j jVar, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i8 & 2) != 0 ? j.TOP_DOWN : jVar);
    }
}
