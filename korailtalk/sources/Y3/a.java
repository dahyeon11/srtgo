package Y3;

import java.util.List;

/* loaded from: classes2.dex */
abstract class a {
    static M3.a a(List list) {
        int size = list.size() << 1;
        int i8 = size - 1;
        if (((b) list.get(list.size() - 1)).d() == null) {
            i8 = size - 2;
        }
        M3.a aVar = new M3.a(i8 * 12);
        int i9 = 0;
        int value = ((b) list.get(0)).d().getValue();
        for (int i10 = 11; i10 >= 0; i10--) {
            if (((1 << i10) & value) != 0) {
                aVar.set(i9);
            }
            i9++;
        }
        for (int i11 = 1; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            int value2 = bVar.c().getValue();
            for (int i12 = 11; i12 >= 0; i12--) {
                if (((1 << i12) & value2) != 0) {
                    aVar.set(i9);
                }
                i9++;
            }
            if (bVar.d() != null) {
                int value3 = bVar.d().getValue();
                for (int i13 = 11; i13 >= 0; i13--) {
                    if (((1 << i13) & value3) != 0) {
                        aVar.set(i9);
                    }
                    i9++;
                }
            }
        }
        return aVar;
    }
}
