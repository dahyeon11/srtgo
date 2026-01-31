package d7;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
class n extends m {
    public static final i walk(File file, j direction) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new i(file, direction);
    }

    public static /* synthetic */ i walk$default(File file, j jVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            jVar = j.TOP_DOWN;
        }
        return walk(file, jVar);
    }

    public static final i walkBottomUp(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return walk(file, j.BOTTOM_UP);
    }

    public static final i walkTopDown(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return walk(file, j.TOP_DOWN);
    }
}
