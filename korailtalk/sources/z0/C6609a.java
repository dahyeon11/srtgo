package z0;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6609a implements InterfaceC6613e {

    /* renamed from: a, reason: collision with root package name */
    private final String f37851a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f37852b;

    public C6609a(String str, Object[] objArr) {
        this.f37851a = str;
        this.f37852b = objArr;
    }

    private static void a(InterfaceC6612d interfaceC6612d, int i8, Object obj) {
        if (obj == null) {
            interfaceC6612d.bindNull(i8);
            return;
        }
        if (obj instanceof byte[]) {
            interfaceC6612d.bindBlob(i8, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            interfaceC6612d.bindDouble(i8, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC6612d.bindDouble(i8, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC6612d.bindLong(i8, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            interfaceC6612d.bindLong(i8, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            interfaceC6612d.bindLong(i8, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            interfaceC6612d.bindLong(i8, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            interfaceC6612d.bindString(i8, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC6612d.bindLong(i8, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i8 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    public static void bind(InterfaceC6612d interfaceC6612d, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i8 = 0;
        while (i8 < length) {
            Object obj = objArr[i8];
            i8++;
            a(interfaceC6612d, i8, obj);
        }
    }

    @Override // z0.InterfaceC6613e
    public void bindTo(InterfaceC6612d interfaceC6612d) {
        bind(interfaceC6612d, this.f37852b);
    }

    @Override // z0.InterfaceC6613e
    public int getArgCount() {
        Object[] objArr = this.f37852b;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Override // z0.InterfaceC6613e
    public String getSql() {
        return this.f37851a;
    }

    public C6609a(String str) {
        this(str, null);
    }
}
