package d7;

import R6.G;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public abstract class t {

    static final class a extends Lambda implements f7.l {

        /* renamed from: a */
        final /* synthetic */ ArrayList f30133a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ArrayList arrayList) {
            super(1);
            this.f30133a = arrayList;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((String) obj);
            return G.INSTANCE;
        }

        public final void invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.f30133a.add(it);
        }
    }

    public static final long copyTo(Reader reader, Writer out, int i8) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        char[] cArr = new char[i8];
        int i9 = reader.read(cArr);
        long j8 = 0;
        while (i9 >= 0) {
            out.write(cArr, 0, i9);
            j8 += i9;
            i9 = reader.read(cArr);
        }
        return j8;
    }

    public static /* synthetic */ long copyTo$default(Reader reader, Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return copyTo(reader, writer, i8);
    }

    public static final void forEachLine(Reader reader, f7.l action) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            Iterator<Object> it = lineSequence(bufferedReader).iterator();
            while (it.hasNext()) {
                action.invoke(it.next());
            }
            G g8 = G.INSTANCE;
            AbstractC5332c.closeFinally(bufferedReader, null);
        } finally {
        }
    }

    public static final k7.m lineSequence(BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return k7.p.constrainOnce(new p(bufferedReader));
    }

    public static final byte[] readBytes(URL url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "<this>");
        InputStream inputStreamOpenStream = url.openStream();
        try {
            Intrinsics.checkNotNull(inputStreamOpenStream);
            byte[] bytes = AbstractC5331b.readBytes(inputStreamOpenStream);
            AbstractC5332c.closeFinally(inputStreamOpenStream, null);
            return bytes;
        } finally {
        }
    }

    public static final List<String> readLines(Reader reader) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        forEachLine(reader, new a(arrayList));
        return arrayList;
    }

    public static final String readText(Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        copyTo$default(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final <T> T useLines(Reader reader, f7.l block) throws IOException {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T t8 = (T) block.invoke(lineSequence(bufferedReader));
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
}
