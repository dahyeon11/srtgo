package x1;

import android.util.SparseArray;
import java.util.EnumMap;
import m1.d;

/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6483a {

    /* renamed from: a, reason: collision with root package name */
    private static SparseArray f37502a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    private static EnumMap f37503b;

    static {
        EnumMap enumMap = new EnumMap(d.class);
        f37503b = enumMap;
        enumMap.put((EnumMap) d.DEFAULT, (d) 0);
        f37503b.put((EnumMap) d.VERY_LOW, (d) 1);
        f37503b.put((EnumMap) d.HIGHEST, (d) 2);
        for (d dVar : f37503b.keySet()) {
            f37502a.append(((Integer) f37503b.get(dVar)).intValue(), dVar);
        }
    }

    public static int toInt(d dVar) {
        Integer num = (Integer) f37503b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d valueOf(int i8) {
        d dVar = (d) f37502a.get(i8);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i8);
    }
}
