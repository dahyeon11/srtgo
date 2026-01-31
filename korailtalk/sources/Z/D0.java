package z;

/* loaded from: classes.dex */
public interface D0 {

    public interface a {
        void onCaptureFailed(int i8);

        void onCaptureProcessStarted(int i8);

        void onCaptureSequenceAborted(int i8);

        void onCaptureSequenceCompleted(int i8);

        void onCaptureStarted(int i8, long j8);
    }

    void abortCapture(int i8);

    void deInitSession();

    C0 initSession(androidx.camera.core.r rVar, w0 w0Var, w0 w0Var2, w0 w0Var3);

    void onCaptureSessionEnd();

    void onCaptureSessionStart(B0 b02);

    void setParameters(InterfaceC6565N interfaceC6565N);

    int startCapture(a aVar);

    int startRepeating(a aVar);

    void stopRepeating();
}
