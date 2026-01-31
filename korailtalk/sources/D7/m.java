package d7;

import R6.G;
import S6.AbstractC0765i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import l7.C5900f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends l {

    static final class a extends Lambda implements f7.l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f30125a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f30125a = arrayList;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f30125a.add(it);
        }
    }

    public static final void appendBytes(File file, byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            G g8 = G.INSTANCE;
            AbstractC5332c.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void appendText(File file, String text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        appendBytes(file, bytes);
    }

    public static /* synthetic */ void appendText$default(File file, String str, Charset charset, int i8, Object obj) throws IOException {
        if ((i8 & 2) != 0) {
            charset = C5900f.UTF_8;
        }
        appendText(file, str, charset);
    }

    public static final void forEachBlock(File file, f7.p action) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        forEachBlock(file, 4096, action);
    }

    public static final void forEachLine(File file, Charset charset, f7.l action) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(action, "action");
        t.forEachLine(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void forEachLine$default(File file, Charset charset, f7.l lVar, int i8, Object obj) throws IOException {
        if ((i8 & 1) != 0) {
            charset = C5900f.UTF_8;
        }
        forEachLine(file, charset, lVar);
    }

    public static byte[] readBytes(File file) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i8 = (int) length;
            byte[] bArrCopyInto = new byte[i8];
            int i9 = i8;
            int i10 = 0;
            while (i9 > 0) {
                int i11 = fileInputStream.read(bArrCopyInto, i10, i9);
                if (i11 < 0) {
                    break;
                }
                i9 -= i11;
                i10 += i11;
            }
            if (i9 > 0) {
                bArrCopyInto = Arrays.copyOf(bArrCopyInto, i10);
                Intrinsics.checkNotNullExpressionValue(bArrCopyInto, "copyOf(...)");
            } else {
                int i12 = fileInputStream.read();
                if (i12 != -1) {
                    C5334e c5334e = new C5334e(8193);
                    c5334e.write(i12);
                    AbstractC5331b.copyTo$default(fileInputStream, c5334e, 0, 2, null);
                    int size = c5334e.size() + i8;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer = c5334e.getBuffer();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrCopyInto, size);
                    Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
                    bArrCopyInto = AbstractC0765i.copyInto(buffer, bArrCopyOf, i8, 0, c5334e.size());
                }
            }
            AbstractC5332c.closeFinally(fileInputStream, null);
            return bArrCopyInto;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5332c.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final List<String> readLines(File file, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ArrayList arrayList = new ArrayList();
        forEachLine(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List readLines$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = C5900f.UTF_8;
        }
        return readLines(file, charset);
    }

    public static final String readText(File file, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String text = t.readText(inputStreamReader);
            AbstractC5332c.closeFinally(inputStreamReader, null);
            return text;
        } finally {
        }
    }

    public static /* synthetic */ String readText$default(File file, Charset charset, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = C5900f.UTF_8;
        }
        return readText(file, charset);
    }

    public static final <T> T useLines(File file, Charset charset, f7.l block) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T t8 = (T) block.invoke(t.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            if (a7.b.apiVersionIsAtLeast(1, 1, 0)) {
                AbstractC5332c.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            InlineMarker.finallyEnd(1);
            return t8;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (a7.b.apiVersionIsAtLeast(1, 1, 0)) {
                    AbstractC5332c.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static /* synthetic */ Object useLines$default(File file, Charset charset, f7.l block, int i8, Object obj) throws IOException {
        if ((i8 & 1) != 0) {
            charset = C5900f.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object objInvoke = block.invoke(t.lineSequence(bufferedReader));
            InlineMarker.finallyStart(1);
            if (a7.b.apiVersionIsAtLeast(1, 1, 0)) {
                AbstractC5332c.closeFinally(bufferedReader, null);
            } else {
                bufferedReader.close();
            }
            InlineMarker.finallyEnd(1);
            return objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                if (a7.b.apiVersionIsAtLeast(1, 1, 0)) {
                    AbstractC5332c.closeFinally(bufferedReader, th);
                } else {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused) {
                    }
                }
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
    }

    public static final void writeBytes(File file, byte[] array) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            G g8 = G.INSTANCE;
            AbstractC5332c.closeFinally(fileOutputStream, null);
        } finally {
        }
    }

    public static final void writeText(File file, String text, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = text.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        writeBytes(file, bytes);
    }

    public static /* synthetic */ void writeText$default(File file, String str, Charset charset, int i8, Object obj) throws IOException {
        if ((i8 & 2) != 0) {
            charset = C5900f.UTF_8;
        }
        writeText(file, str, charset);
    }

    public static final void forEachBlock(File file, int i8, f7.p action) throws IOException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        byte[] bArr = new byte[j7.s.coerceAtLeast(i8, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i9 = fileInputStream.read(bArr);
                if (i9 <= 0) {
                    G g8 = G.INSTANCE;
                    AbstractC5332c.closeFinally(fileInputStream, null);
                    return;
                }
                action.invoke(bArr, Integer.valueOf(i9));
            } finally {
            }
        }
    }
}
