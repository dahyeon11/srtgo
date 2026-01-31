package d7;

import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q extends h {
    public /* synthetic */ q(File file, File file2, String str, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i8 & 2) != 0 ? null : file2, (i8 & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file, File file2, String str) {
        super(file, file2, str);
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
