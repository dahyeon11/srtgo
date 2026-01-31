package d7;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5333d {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
