package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    HashMap f8121a = new HashMap();

    float a(Object obj, String str, int i8) {
        if (!this.f8121a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap map = (HashMap) this.f8121a.get(obj);
        if (!map.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) map.get(str);
        if (fArr.length > i8) {
            return fArr[i8];
        }
        return Float.NaN;
    }

    void b(Object obj, String str, int i8, float f8) {
        if (!this.f8121a.containsKey(obj)) {
            HashMap map = new HashMap();
            float[] fArr = new float[i8 + 1];
            fArr[i8] = f8;
            map.put(str, fArr);
            this.f8121a.put(obj, map);
            return;
        }
        HashMap map2 = (HashMap) this.f8121a.get(obj);
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i8 + 1];
            fArr2[i8] = f8;
            map2.put(str, fArr2);
            this.f8121a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = (float[]) map2.get(str);
        if (fArrCopyOf.length <= i8) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i8 + 1);
        }
        fArrCopyOf[i8] = f8;
        map2.put(str, fArrCopyOf);
    }
}
