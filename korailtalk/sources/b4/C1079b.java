package b4;

import a4.AbstractC0834a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C1079b {

    /* renamed from: a, reason: collision with root package name */
    private final Map f11401a = new HashMap();

    C1079b() {
    }

    int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry entry : this.f11401a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return AbstractC0834a.toIntArray(arrayList);
    }

    void b(int i8) {
        Integer num = (Integer) this.f11401a.get(Integer.valueOf(i8));
        if (num == null) {
            num = 0;
        }
        this.f11401a.put(Integer.valueOf(i8), Integer.valueOf(num.intValue() + 1));
    }

    public Integer getConfidence(int i8) {
        return (Integer) this.f11401a.get(Integer.valueOf(i8));
    }
}
