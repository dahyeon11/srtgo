package x;

import u.C6372C;
import w.q;

/* loaded from: classes.dex */
public class n {
    public static final int RATIO_16_9 = 1;
    public static final int RATIO_4_3 = 0;
    public static final int RATIO_MAX_JPEG = 2;
    public static final int RATIO_ORIGINAL = 3;

    public int get(String str, C6372C c6372c) {
        q qVar = (q) w.i.get(q.class);
        if (qVar != null) {
            return qVar.getCorrectedAspectRatio();
        }
        w.c cVar = (w.c) w.g.get(str, c6372c).get(w.c.class);
        if (cVar != null) {
            return cVar.getCorrectedAspectRatio();
        }
        return 3;
    }
}
