package O;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int[] f3352a;

    /* renamed from: b, reason: collision with root package name */
    private int f3353b;

    /* renamed from: c, reason: collision with root package name */
    private int f3354c;

    /* renamed from: d, reason: collision with root package name */
    private int f3355d;

    public c() {
        this(8);
    }

    private void a() {
        int[] iArr = this.f3352a;
        int length = iArr.length;
        int i8 = this.f3353b;
        int i9 = length - i8;
        int i10 = length << 1;
        if (i10 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, i8, iArr2, 0, i9);
        System.arraycopy(this.f3352a, 0, iArr2, i9, this.f3353b);
        this.f3352a = iArr2;
        this.f3353b = 0;
        this.f3354c = length;
        this.f3355d = i10 - 1;
    }

    public void addFirst(int i8) {
        int i9 = (this.f3353b - 1) & this.f3355d;
        this.f3353b = i9;
        this.f3352a[i9] = i8;
        if (i9 == this.f3354c) {
            a();
        }
    }

    public void addLast(int i8) {
        int[] iArr = this.f3352a;
        int i9 = this.f3354c;
        iArr[i9] = i8;
        int i10 = this.f3355d & (i9 + 1);
        this.f3354c = i10;
        if (i10 == this.f3353b) {
            a();
        }
    }

    public void clear() {
        this.f3354c = this.f3353b;
    }

    public int get(int i8) {
        if (i8 < 0 || i8 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f3352a[this.f3355d & (this.f3353b + i8)];
    }

    public int getFirst() {
        int i8 = this.f3353b;
        if (i8 != this.f3354c) {
            return this.f3352a[i8];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int getLast() {
        int i8 = this.f3353b;
        int i9 = this.f3354c;
        if (i8 != i9) {
            return this.f3352a[(i9 - 1) & this.f3355d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean isEmpty() {
        return this.f3353b == this.f3354c;
    }

    public int popFirst() {
        int i8 = this.f3353b;
        if (i8 == this.f3354c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i9 = this.f3352a[i8];
        this.f3353b = (i8 + 1) & this.f3355d;
        return i9;
    }

    public int popLast() {
        int i8 = this.f3353b;
        int i9 = this.f3354c;
        if (i8 == i9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i10 = this.f3355d & (i9 - 1);
        int i11 = this.f3352a[i10];
        this.f3354c = i10;
        return i11;
    }

    public void removeFromEnd(int i8) {
        if (i8 <= 0) {
            return;
        }
        if (i8 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f3354c = this.f3355d & (this.f3354c - i8);
    }

    public void removeFromStart(int i8) {
        if (i8 <= 0) {
            return;
        }
        if (i8 > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f3353b = this.f3355d & (this.f3353b + i8);
    }

    public int size() {
        return (this.f3354c - this.f3353b) & this.f3355d;
    }

    public c(int i8) {
        if (i8 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (i8 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        i8 = Integer.bitCount(i8) != 1 ? Integer.highestOneBit(i8 - 1) << 1 : i8;
        this.f3355d = i8 - 1;
        this.f3352a = new int[i8];
    }
}
