package g4;

import g4.j;

/* renamed from: g4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5556b {

    /* renamed from: a, reason: collision with root package name */
    private final int f31331a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f31332b;

    private C5556b(int i8, byte[] bArr) {
        this.f31331a = i8;
        this.f31332b = bArr;
    }

    static C5556b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.getTotalCodewords()) {
            throw new IllegalArgumentException();
        }
        j.b eCBlocksForLevel = jVar.getECBlocksForLevel(fVar);
        j.a[] eCBlocks = eCBlocksForLevel.getECBlocks();
        int count = 0;
        for (j.a aVar : eCBlocks) {
            count += aVar.getCount();
        }
        C5556b[] c5556bArr = new C5556b[count];
        int i8 = 0;
        for (j.a aVar2 : eCBlocks) {
            int i9 = 0;
            while (i9 < aVar2.getCount()) {
                int dataCodewords = aVar2.getDataCodewords();
                c5556bArr[i8] = new C5556b(dataCodewords, new byte[eCBlocksForLevel.getECCodewordsPerBlock() + dataCodewords]);
                i9++;
                i8++;
            }
        }
        int length = c5556bArr[0].f31332b.length;
        int i10 = count - 1;
        while (i10 >= 0 && c5556bArr[i10].f31332b.length != length) {
            i10--;
        }
        int i11 = i10 + 1;
        int eCCodewordsPerBlock = length - eCBlocksForLevel.getECCodewordsPerBlock();
        int i12 = 0;
        for (int i13 = 0; i13 < eCCodewordsPerBlock; i13++) {
            int i14 = 0;
            while (i14 < i8) {
                c5556bArr[i14].f31332b[i13] = bArr[i12];
                i14++;
                i12++;
            }
        }
        int i15 = i11;
        while (i15 < i8) {
            c5556bArr[i15].f31332b[eCCodewordsPerBlock] = bArr[i12];
            i15++;
            i12++;
        }
        int length2 = c5556bArr[0].f31332b.length;
        while (eCCodewordsPerBlock < length2) {
            int i16 = 0;
            while (i16 < i8) {
                c5556bArr[i16].f31332b[i16 < i11 ? eCCodewordsPerBlock : eCCodewordsPerBlock + 1] = bArr[i12];
                i16++;
                i12++;
            }
            eCCodewordsPerBlock++;
        }
        return c5556bArr;
    }

    byte[] a() {
        return this.f31332b;
    }

    int c() {
        return this.f31331a;
    }
}
