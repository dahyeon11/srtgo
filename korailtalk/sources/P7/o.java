package P7;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class o extends AbstractList implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    final f[] f3801a;

    /* renamed from: b, reason: collision with root package name */
    final int[] f3802b;

    private o(f[] fVarArr, int[] iArr) {
        this.f3801a = fVarArr;
        this.f3802b = iArr;
    }

    private static void a(long j8, c cVar, int i8, List list, int i9, int i10, List list2) {
        int iIntValue;
        int i11;
        int i12;
        int i13;
        int i14;
        c cVar2;
        if (i9 >= i10) {
            throw new AssertionError();
        }
        for (int i15 = i9; i15 < i10; i15++) {
            if (((f) list.get(i15)).size() < i8) {
                throw new AssertionError();
            }
        }
        f fVar = (f) list.get(i9);
        f fVar2 = (f) list.get(i10 - 1);
        if (i8 == fVar.size()) {
            int i16 = i9 + 1;
            i11 = i16;
            iIntValue = ((Integer) list2.get(i9)).intValue();
            fVar = (f) list.get(i16);
        } else {
            iIntValue = -1;
            i11 = i9;
        }
        if (fVar.getByte(i8) == fVar2.getByte(i8)) {
            int iMin = Math.min(fVar.size(), fVar2.size());
            int i17 = 0;
            for (int i18 = i8; i18 < iMin && fVar.getByte(i18) == fVar2.getByte(i18); i18++) {
                i17++;
            }
            long jB = 1 + j8 + b(cVar) + 2 + i17;
            cVar.writeInt(-i17);
            cVar.writeInt(iIntValue);
            int i19 = i8;
            while (true) {
                i12 = i8 + i17;
                if (i19 >= i12) {
                    break;
                }
                cVar.writeInt(fVar.getByte(i19) & 255);
                i19++;
            }
            if (i11 + 1 == i10) {
                if (i12 != ((f) list.get(i11)).size()) {
                    throw new AssertionError();
                }
                cVar.writeInt(((Integer) list2.get(i11)).intValue());
                return;
            } else {
                c cVar3 = new c();
                cVar.writeInt((int) ((b(cVar3) + jB) * (-1)));
                a(jB, cVar3, i12, list, i11, i10, list2);
                cVar.write(cVar3, cVar3.size());
                return;
            }
        }
        int i20 = 1;
        for (int i21 = i11 + 1; i21 < i10; i21++) {
            if (((f) list.get(i21 - 1)).getByte(i8) != ((f) list.get(i21)).getByte(i8)) {
                i20++;
            }
        }
        long jB2 = j8 + b(cVar) + 2 + (i20 * 2);
        cVar.writeInt(i20);
        cVar.writeInt(iIntValue);
        for (int i22 = i11; i22 < i10; i22++) {
            byte b9 = ((f) list.get(i22)).getByte(i8);
            if (i22 == i11 || b9 != ((f) list.get(i22 - 1)).getByte(i8)) {
                cVar.writeInt(b9 & 255);
            }
        }
        c cVar4 = new c();
        int i23 = i11;
        while (i23 < i10) {
            byte b10 = ((f) list.get(i23)).getByte(i8);
            int i24 = i23 + 1;
            int i25 = i24;
            while (true) {
                if (i25 >= i10) {
                    i13 = i10;
                    break;
                } else {
                    if (b10 != ((f) list.get(i25)).getByte(i8)) {
                        i13 = i25;
                        break;
                    }
                    i25++;
                }
            }
            if (i24 == i13 && i8 + 1 == ((f) list.get(i23)).size()) {
                cVar.writeInt(((Integer) list2.get(i23)).intValue());
                i14 = i13;
                cVar2 = cVar4;
            } else {
                cVar.writeInt((int) ((b(cVar4) + jB2) * (-1)));
                i14 = i13;
                cVar2 = cVar4;
                a(jB2, cVar4, i8 + 1, list, i23, i13, list2);
            }
            cVar4 = cVar2;
            i23 = i14;
        }
        c cVar5 = cVar4;
        cVar.write(cVar5, cVar5.size());
    }

    private static int b(c cVar) {
        return (int) (cVar.size() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ba, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static P7.o of(P7.f... r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: P7.o.of(P7.f[]):P7.o");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3801a.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public f get(int i8) {
        return this.f3801a[i8];
    }
}
