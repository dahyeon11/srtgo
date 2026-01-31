package t;

import androidx.camera.core.C0907v;
import u.C6386i;

/* renamed from: t.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6300s0 {
    public static C0907v createFrom(C6386i c6386i) {
        int reason = c6386i.getReason();
        int i8 = 1;
        if (reason != 1) {
            i8 = 2;
            if (reason != 2) {
                i8 = 3;
                if (reason != 3) {
                    i8 = 4;
                    if (reason != 4) {
                        i8 = 5;
                        if (reason != 5) {
                            i8 = reason != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C0907v(i8, c6386i);
    }
}
