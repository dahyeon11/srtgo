package d7;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C5334e extends ByteArrayOutputStream {
    public C5334e(int i8) {
        super(i8);
    }

    public final byte[] getBuffer() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
