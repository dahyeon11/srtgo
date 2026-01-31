package K6;

import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface c extends Closeable {
    void ackSettings(i iVar);

    void connectionPreface();

    void data(boolean z8, int i8, P7.c cVar, int i9);

    void flush();

    void goAway(int i8, a aVar, byte[] bArr);

    void headers(int i8, List<d> list);

    int maxDataLength();

    void ping(boolean z8, int i8, int i9);

    void pushPromise(int i8, int i9, List<d> list);

    void rstStream(int i8, a aVar);

    void settings(i iVar);

    void synReply(boolean z8, int i8, List<d> list);

    void synStream(boolean z8, boolean z9, int i8, int i9, List<d> list);

    void windowUpdate(int i8, long j8);
}
