package K6;

/* loaded from: classes.dex */
public final class i {
    public static final int ENABLE_PUSH = 2;
    public static final int INITIAL_WINDOW_SIZE = 7;
    public static final int MAX_CONCURRENT_STREAMS = 4;
    public static final int MAX_HEADER_LIST_SIZE = 6;

    /* renamed from: a, reason: collision with root package name */
    private int f2967a;

    /* renamed from: b, reason: collision with root package name */
    private int f2968b;

    /* renamed from: c, reason: collision with root package name */
    private int f2969c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f2970d = new int[10];

    int a() {
        if ((this.f2967a & 2) != 0) {
            return this.f2970d[1];
        }
        return -1;
    }

    int b(int i8) {
        return (this.f2967a & 32) != 0 ? this.f2970d[5] : i8;
    }

    int c() {
        return Integer.bitCount(this.f2967a);
    }

    public int get(int i8) {
        return this.f2970d[i8];
    }

    public boolean isSet(int i8) {
        return ((1 << i8) & this.f2967a) != 0;
    }

    public i set(int i8, int i9, int i10) {
        int[] iArr = this.f2970d;
        if (i8 >= iArr.length) {
            return this;
        }
        int i11 = 1 << i8;
        this.f2967a |= i11;
        if ((i9 & 1) != 0) {
            this.f2968b |= i11;
        } else {
            this.f2968b &= ~i11;
        }
        if ((i9 & 2) != 0) {
            this.f2969c |= i11;
        } else {
            this.f2969c &= ~i11;
        }
        iArr[i8] = i10;
        return this;
    }
}
