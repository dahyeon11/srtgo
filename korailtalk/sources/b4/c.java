package b4;

import F3.m;
import F3.s;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private M3.b f11402a;

    /* renamed from: b, reason: collision with root package name */
    private s f11403b;

    /* renamed from: c, reason: collision with root package name */
    private s f11404c;

    /* renamed from: d, reason: collision with root package name */
    private s f11405d;

    /* renamed from: e, reason: collision with root package name */
    private s f11406e;

    /* renamed from: f, reason: collision with root package name */
    private int f11407f;

    /* renamed from: g, reason: collision with root package name */
    private int f11408g;

    /* renamed from: h, reason: collision with root package name */
    private int f11409h;

    /* renamed from: i, reason: collision with root package name */
    private int f11410i;

    c(M3.b bVar, s sVar, s sVar2, s sVar3, s sVar4) throws m {
        if ((sVar == null && sVar3 == null) || ((sVar2 == null && sVar4 == null) || ((sVar != null && sVar2 == null) || (sVar3 != null && sVar4 == null)))) {
            throw m.getNotFoundInstance();
        }
        k(bVar, sVar, sVar2, sVar3, sVar4);
    }

    private void b() {
        if (this.f11403b == null) {
            this.f11403b = new s(0.0f, this.f11405d.getY());
            this.f11404c = new s(0.0f, this.f11406e.getY());
        } else if (this.f11405d == null) {
            this.f11405d = new s(this.f11402a.getWidth() - 1, this.f11403b.getY());
            this.f11406e = new s(this.f11402a.getWidth() - 1, this.f11404c.getY());
        }
        this.f11407f = (int) Math.min(this.f11403b.getX(), this.f11404c.getX());
        this.f11408g = (int) Math.max(this.f11405d.getX(), this.f11406e.getX());
        this.f11409h = (int) Math.min(this.f11403b.getY(), this.f11405d.getY());
        this.f11410i = (int) Math.max(this.f11404c.getY(), this.f11406e.getY());
    }

    private void k(M3.b bVar, s sVar, s sVar2, s sVar3, s sVar4) {
        this.f11402a = bVar;
        this.f11403b = sVar;
        this.f11404c = sVar2;
        this.f11405d = sVar3;
        this.f11406e = sVar4;
        b();
    }

    static c l(c cVar, c cVar2) {
        return cVar == null ? cVar2 : cVar2 == null ? cVar : new c(cVar.f11402a, cVar.f11403b, cVar.f11404c, cVar2.f11405d, cVar2.f11406e);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    b4.c a(int r13, int r14, boolean r15) {
        /*
            r12 = this;
            F3.s r0 = r12.f11403b
            F3.s r1 = r12.f11404c
            F3.s r2 = r12.f11405d
            F3.s r3 = r12.f11406e
            if (r13 <= 0) goto L2a
            if (r15 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r2
        Lf:
            float r5 = r4.getY()
            int r5 = (int) r5
            int r5 = r5 - r13
            if (r5 >= 0) goto L18
            r5 = 0
        L18:
            F3.s r13 = new F3.s
            float r4 = r4.getX()
            float r5 = (float) r5
            r13.<init>(r4, r5)
            if (r15 == 0) goto L27
            r8 = r13
        L25:
            r10 = r2
            goto L2c
        L27:
            r10 = r13
            r8 = r0
            goto L2c
        L2a:
            r8 = r0
            goto L25
        L2c:
            if (r14 <= 0) goto L5d
            if (r15 == 0) goto L33
            F3.s r13 = r12.f11404c
            goto L35
        L33:
            F3.s r13 = r12.f11406e
        L35:
            float r0 = r13.getY()
            int r0 = (int) r0
            int r0 = r0 + r14
            M3.b r14 = r12.f11402a
            int r14 = r14.getHeight()
            if (r0 < r14) goto L4b
            M3.b r14 = r12.f11402a
            int r14 = r14.getHeight()
            int r0 = r14 + (-1)
        L4b:
            F3.s r14 = new F3.s
            float r13 = r13.getX()
            float r0 = (float) r0
            r14.<init>(r13, r0)
            if (r15 == 0) goto L5a
            r9 = r14
        L58:
            r11 = r3
            goto L5f
        L5a:
            r11 = r14
            r9 = r1
            goto L5f
        L5d:
            r9 = r1
            goto L58
        L5f:
            r12.b()
            b4.c r13 = new b4.c
            M3.b r7 = r12.f11402a
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.c.a(int, int, boolean):b4.c");
    }

    s c() {
        return this.f11404c;
    }

    s d() {
        return this.f11406e;
    }

    int e() {
        return this.f11408g;
    }

    int f() {
        return this.f11410i;
    }

    int g() {
        return this.f11407f;
    }

    int h() {
        return this.f11409h;
    }

    s i() {
        return this.f11403b;
    }

    s j() {
        return this.f11405d;
    }

    c(c cVar) {
        k(cVar.f11402a, cVar.f11403b, cVar.f11404c, cVar.f11405d, cVar.f11406e);
    }
}
