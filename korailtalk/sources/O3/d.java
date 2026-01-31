package O3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final a f3421a;

    /* renamed from: b, reason: collision with root package name */
    private final List f3422b;

    public d(a aVar) {
        this.f3421a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f3422b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i8) {
        if (i8 >= this.f3422b.size()) {
            List list = this.f3422b;
            b bVarI = (b) list.get(list.size() - 1);
            for (int size = this.f3422b.size(); size <= i8; size++) {
                a aVar = this.f3421a;
                bVarI = bVarI.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.getGeneratorBase())}));
                this.f3422b.add(bVarI);
            }
        }
        return (b) this.f3422b.get(i8);
    }

    public void encode(int[] iArr, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i8;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i8);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrE = new b(this.f3421a, iArr2).j(i8, 1).b(bVarA)[1].e();
        int length2 = i8 - iArrE.length;
        for (int i9 = 0; i9 < length2; i9++) {
            iArr[length + i9] = 0;
        }
        System.arraycopy(iArrE, 0, iArr, length + length2, iArrE.length);
    }
}
