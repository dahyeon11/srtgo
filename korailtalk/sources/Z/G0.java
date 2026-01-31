package z;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f37726a = new ArrayList();

    private static void a(List list, int i8, int[] iArr, int i9) {
        if (i9 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= i9) {
                    iArr[i9] = i10;
                    a(list, i8, iArr, i9 + 1);
                    break;
                } else if (i10 == iArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
    }

    private List b(int i8) {
        ArrayList arrayList = new ArrayList();
        a(arrayList, i8, new int[i8], 0);
        return arrayList;
    }

    public boolean addSurfaceConfig(H0 h02) {
        return this.f37726a.add(h02);
    }

    public List<H0> getSurfaceConfigList() {
        return this.f37726a;
    }

    public boolean isSupported(List<H0> list) {
        if (list.isEmpty()) {
            return true;
        }
        if (list.size() > this.f37726a.size()) {
            return false;
        }
        for (int[] iArr : b(this.f37726a.size())) {
            boolean zIsSupported = true;
            for (int i8 = 0; i8 < this.f37726a.size() && (iArr[i8] >= list.size() || ((zIsSupported = zIsSupported & ((H0) this.f37726a.get(i8)).isSupported(list.get(iArr[i8]))))); i8++) {
            }
            if (zIsSupported) {
                return true;
            }
        }
        return false;
    }

    public boolean removeSurfaceConfig(H0 h02) {
        return this.f37726a.remove(h02);
    }
}
