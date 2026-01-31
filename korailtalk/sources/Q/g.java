package Q;

/* loaded from: classes.dex */
class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f3864a;

    /* renamed from: b, reason: collision with root package name */
    private int f3865b;

    g(int i8) {
        if (i8 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f3864a = new Object[i8];
    }

    @Override // Q.f
    public Object acquire() {
        int i8 = this.f3865b;
        if (i8 <= 0) {
            return null;
        }
        int i9 = i8 - 1;
        Object[] objArr = this.f3864a;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f3865b = i8 - 1;
        return obj;
    }

    @Override // Q.f
    public boolean release(Object obj) {
        int i8 = this.f3865b;
        Object[] objArr = this.f3864a;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = obj;
        this.f3865b = i8 + 1;
        return true;
    }

    @Override // Q.f
    public void releaseAll(Object[] objArr, int i8) {
        if (i8 > objArr.length) {
            i8 = objArr.length;
        }
        for (int i9 = 0; i9 < i8; i9++) {
            Object obj = objArr[i9];
            int i10 = this.f3865b;
            Object[] objArr2 = this.f3864a;
            if (i10 < objArr2.length) {
                objArr2[i10] = obj;
                this.f3865b = i10 + 1;
            }
        }
    }
}
