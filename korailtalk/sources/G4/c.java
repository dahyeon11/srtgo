package g4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
abstract class c {
    public static final c DATA_MASK_000;
    public static final c DATA_MASK_001;
    public static final c DATA_MASK_010;
    public static final c DATA_MASK_011;
    public static final c DATA_MASK_100;
    public static final c DATA_MASK_101;
    public static final c DATA_MASK_110;
    public static final c DATA_MASK_111;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ c[] f31333a;

    enum a extends c {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // g4.c
        boolean a(int i8, int i9) {
            return ((i8 + i9) & 1) == 0;
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        DATA_MASK_000 = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: g4.c.b
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return (i8 & 1) == 0;
            }
        };
        DATA_MASK_001 = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: g4.c.c
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return i9 % 3 == 0;
            }
        };
        DATA_MASK_010 = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: g4.c.d
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return (i8 + i9) % 3 == 0;
            }
        };
        DATA_MASK_011 = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: g4.c.e
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return (((i8 / 2) + (i9 / 3)) & 1) == 0;
            }
        };
        DATA_MASK_100 = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: g4.c.f
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return (i8 * i9) % 6 == 0;
            }
        };
        DATA_MASK_101 = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: g4.c.g
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return (i8 * i9) % 6 < 3;
            }
        };
        DATA_MASK_110 = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: g4.c.h
            {
                a aVar2 = null;
            }

            @Override // g4.c
            boolean a(int i8, int i9) {
                return (((i8 + i9) + ((i8 * i9) % 3)) & 1) == 0;
            }
        };
        DATA_MASK_111 = cVar7;
        f31333a = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    private c(String str, int i8) {
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f31333a.clone();
    }

    abstract boolean a(int i8, int i9);

    final void b(M3.b bVar, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            for (int i10 = 0; i10 < i8; i10++) {
                if (a(i9, i10)) {
                    bVar.flip(i10, i9);
                }
            }
        }
    }

    /* synthetic */ c(String str, int i8, a aVar) {
        this(str, i8);
    }
}
