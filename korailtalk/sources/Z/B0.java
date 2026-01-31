package z;

import java.util.List;

/* loaded from: classes.dex */
public interface B0 {

    public interface a {
        void onCaptureBufferLost(b bVar, long j8, int i8);

        void onCaptureCompleted(b bVar, InterfaceC6600q interfaceC6600q);

        void onCaptureFailed(b bVar, C6588k c6588k);

        void onCaptureProgressed(b bVar, InterfaceC6600q interfaceC6600q);

        void onCaptureSequenceAborted(int i8);

        void onCaptureSequenceCompleted(int i8, long j8);

        void onCaptureStarted(b bVar, long j8, long j9);
    }

    public interface b {
        InterfaceC6565N getParameters();

        List<Integer> getTargetOutputConfigIds();

        int getTemplateId();
    }

    void abortCaptures();

    int setRepeating(b bVar, a aVar);

    void stopRepeating();

    int submit(List<b> list, a aVar);

    int submit(b bVar, a aVar);
}
