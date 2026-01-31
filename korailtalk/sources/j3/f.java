package J3;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes2.dex */
final class f {

    /* renamed from: e, reason: collision with root package name */
    static final f f2590e = new f(g.f2595b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final int f2591a;

    /* renamed from: b, reason: collision with root package name */
    private final g f2592b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2593c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2594d;

    private f(g gVar, int i8, int i9, int i10) {
        this.f2592b = gVar;
        this.f2591a = i8;
        this.f2593c = i9;
        this.f2594d = i10;
    }

    f a(int i8) {
        g gVarA = this.f2592b;
        int i9 = this.f2591a;
        int i10 = this.f2594d;
        if (i9 == 4 || i9 == 2) {
            int i11 = d.f2583c[i9][0];
            int i12 = 65535 & i11;
            int i13 = i11 >> 16;
            gVarA = gVarA.a(i12, i13);
            i10 += i13;
            i9 = 0;
        }
        int i14 = this.f2593c;
        f fVar = new f(gVarA, i9, i14 + 1, i10 + ((i14 == 0 || i14 == 31) ? 18 : i14 == 62 ? 9 : 8));
        return fVar.f2593c == 2078 ? fVar.b(i8 + 1) : fVar;
    }

    f b(int i8) {
        int i9 = this.f2593c;
        return i9 == 0 ? this : new f(this.f2592b.b(i8 - i9, i9), this.f2591a, 0, this.f2594d);
    }

    int c() {
        return this.f2593c;
    }

    int d() {
        return this.f2594d;
    }

    int e() {
        return this.f2591a;
    }

    boolean f(f fVar) {
        int i8;
        int i9 = this.f2594d + (d.f2583c[this.f2591a][fVar.f2591a] >> 16);
        int i10 = fVar.f2593c;
        if (i10 > 0 && ((i8 = this.f2593c) == 0 || i8 > i10)) {
            i9 += 10;
        }
        return i9 <= fVar.f2594d;
    }

    f g(int i8, int i9) {
        int i10 = this.f2594d;
        g gVarA = this.f2592b;
        int i11 = this.f2591a;
        if (i8 != i11) {
            int i12 = d.f2583c[i11][i8];
            int i13 = 65535 & i12;
            int i14 = i12 >> 16;
            gVarA = gVarA.a(i13, i14);
            i10 += i14;
        }
        int i15 = i8 == 2 ? 4 : 5;
        return new f(gVarA.a(i9, i15), i8, 0, i10 + i15);
    }

    f h(int i8, int i9) {
        g gVar = this.f2592b;
        int i10 = this.f2591a;
        int i11 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(d.f2585e[i10][i8], i11).a(i9, 5), this.f2591a, 0, this.f2594d + i11 + 5);
    }

    M3.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarC = b(bArr.length).f2592b; gVarC != null; gVarC = gVarC.c()) {
            linkedList.addFirst(gVarC);
        }
        M3.a aVar = new M3.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).appendTo(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f2582b[this.f2591a], Integer.valueOf(this.f2594d), Integer.valueOf(this.f2593c));
    }
}
