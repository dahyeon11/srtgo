package K6;

import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface b extends Closeable {

    public interface a {
        void ackSettings();

        void alternateService(int i8, String str, P7.f fVar, String str2, int i9, long j8);

        void data(boolean z8, int i8, P7.e eVar, int i9);

        void goAway(int i8, K6.a aVar, P7.f fVar);

        void headers(boolean z8, boolean z9, int i8, int i9, List<d> list, e eVar);

        void ping(boolean z8, int i8, int i9);

        void priority(int i8, int i9, int i10, boolean z8);

        void pushPromise(int i8, int i9, List<d> list);

        void rstStream(int i8, K6.a aVar);

        void settings(boolean z8, i iVar);

        void windowUpdate(int i8, long j8);
    }

    boolean nextFrame(a aVar);

    void readConnectionPreface();
}
