package androidx.appcompat.widget;

/* loaded from: classes.dex */
class i0 {
    public static final int UNDEFINED = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private int f7134a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f7135b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f7136c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f7137d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f7138e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f7139f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7140g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7141h = false;

    i0() {
    }

    public int getEnd() {
        return this.f7140g ? this.f7134a : this.f7135b;
    }

    public int getLeft() {
        return this.f7134a;
    }

    public int getRight() {
        return this.f7135b;
    }

    public int getStart() {
        return this.f7140g ? this.f7135b : this.f7134a;
    }

    public void setAbsolute(int i8, int i9) {
        this.f7141h = false;
        if (i8 != Integer.MIN_VALUE) {
            this.f7138e = i8;
            this.f7134a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f7139f = i9;
            this.f7135b = i9;
        }
    }

    public void setDirection(boolean z8) {
        if (z8 == this.f7140g) {
            return;
        }
        this.f7140g = z8;
        if (!this.f7141h) {
            this.f7134a = this.f7138e;
            this.f7135b = this.f7139f;
            return;
        }
        if (z8) {
            int i8 = this.f7137d;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f7138e;
            }
            this.f7134a = i8;
            int i9 = this.f7136c;
            if (i9 == Integer.MIN_VALUE) {
                i9 = this.f7139f;
            }
            this.f7135b = i9;
            return;
        }
        int i10 = this.f7136c;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f7138e;
        }
        this.f7134a = i10;
        int i11 = this.f7137d;
        if (i11 == Integer.MIN_VALUE) {
            i11 = this.f7139f;
        }
        this.f7135b = i11;
    }

    public void setRelative(int i8, int i9) {
        this.f7136c = i8;
        this.f7137d = i9;
        this.f7141h = true;
        if (this.f7140g) {
            if (i9 != Integer.MIN_VALUE) {
                this.f7134a = i9;
            }
            if (i8 != Integer.MIN_VALUE) {
                this.f7135b = i8;
                return;
            }
            return;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f7134a = i8;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f7135b = i9;
        }
    }
}
