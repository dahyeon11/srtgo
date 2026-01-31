package t;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.core.C0903t;
import androidx.camera.core.C0907v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import u.C6386i;
import z.InterfaceC6552A;

/* renamed from: t.q0 */
/* loaded from: classes.dex */
abstract class AbstractC6297q0 {
    private static String a(u.P p8, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) p8.getCameraCharacteristicsCompat("0").get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) p8.getCameraCharacteristicsCompat("1").get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    static List b(C6311y c6311y, C0903t c0903t) throws androidx.camera.core.A0 {
        String strA;
        try {
            ArrayList arrayList = new ArrayList();
            List<String> listAsList = Arrays.asList(c6311y.getCameraManager().getCameraIdList());
            if (c0903t == null) {
                Iterator it = listAsList.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) it.next());
                }
                return arrayList;
            }
            try {
                strA = a(c6311y.getCameraManager(), c0903t.getLensFacing(), listAsList);
            } catch (IllegalStateException unused) {
                strA = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : listAsList) {
                if (!str.equals(strA)) {
                    arrayList2.add(c6311y.b(str));
                }
            }
            Iterator<androidx.camera.core.r> it2 = c0903t.filter(arrayList2).iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC6552A) it2.next()).getCameraId());
            }
            return arrayList;
        } catch (C0907v e8) {
            throw new androidx.camera.core.A0(e8);
        } catch (C6386i e9) {
            throw new androidx.camera.core.A0(AbstractC6300s0.createFrom(e9));
        }
    }
}
