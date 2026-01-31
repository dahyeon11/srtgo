package P7;

/* loaded from: classes3.dex */
final class s {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f3813a;

    /* renamed from: b, reason: collision with root package name */
    int f3814b;

    /* renamed from: c, reason: collision with root package name */
    int f3815c;

    /* renamed from: d, reason: collision with root package name */
    boolean f3816d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3817e;

    /* renamed from: f, reason: collision with root package name */
    s f3818f;

    /* renamed from: g, reason: collision with root package name */
    s f3819g;

    s() {
        this.f3813a = new byte[8192];
        this.f3817e = true;
        this.f3816d = false;
    }

    final s a() {
        this.f3816d = true;
        return new s(this.f3813a, this.f3814b, this.f3815c, true, false);
    }

    final s b() {
        return new s((byte[]) this.f3813a.clone(), this.f3814b, this.f3815c, false, true);
    }

    public final void compact() {
        s sVar = this.f3819g;
        if (sVar == this) {
            throw new IllegalStateException();
        }
        if (sVar.f3817e) {
            int i8 = this.f3815c - this.f3814b;
            if (i8 > (8192 - sVar.f3815c) + (sVar.f3816d ? 0 : sVar.f3814b)) {
                return;
            }
            writeTo(sVar, i8);
            pop();
            t.a(this);
        }
    }

    public final s pop() {
        s sVar = this.f3818f;
        s sVar2 = sVar != this ? sVar : null;
        s sVar3 = this.f3819g;
        sVar3.f3818f = sVar;
        this.f3818f.f3819g = sVar3;
        this.f3818f = null;
        this.f3819g = null;
        return sVar2;
    }

    public final s push(s sVar) {
        sVar.f3819g = this;
        sVar.f3818f = this.f3818f;
        this.f3818f.f3819g = sVar;
        this.f3818f = sVar;
        return sVar;
    }

    public final s split(int i8) {
        s sVarB;
        if (i8 <= 0 || i8 > this.f3815c - this.f3814b) {
            throw new IllegalArgumentException();
        }
        if (i8 >= 1024) {
            sVarB = a();
        } else {
            sVarB = t.b();
            System.arraycopy(this.f3813a, this.f3814b, sVarB.f3813a, 0, i8);
        }
        sVarB.f3815c = sVarB.f3814b + i8;
        this.f3814b += i8;
        this.f3819g.push(sVarB);
        return sVarB;
    }

    public final void writeTo(s sVar, int i8) {
        if (!sVar.f3817e) {
            throw new IllegalArgumentException();
        }
        int i9 = sVar.f3815c;
        if (i9 + i8 > 8192) {
            if (sVar.f3816d) {
                throw new IllegalArgumentException();
            }
            int i10 = sVar.f3814b;
            if ((i9 + i8) - i10 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sVar.f3813a;
            System.arraycopy(bArr, i10, bArr, 0, i9 - i10);
            sVar.f3815c -= sVar.f3814b;
            sVar.f3814b = 0;
        }
        System.arraycopy(this.f3813a, this.f3814b, sVar.f3813a, sVar.f3815c, i8);
        sVar.f3815c += i8;
        this.f3814b += i8;
    }

    s(byte[] bArr, int i8, int i9, boolean z8, boolean z9) {
        this.f3813a = bArr;
        this.f3814b = i8;
        this.f3815c = i9;
        this.f3816d = z8;
        this.f3817e = z9;
    }
}
