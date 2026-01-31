package G7;

import C7.H;
import C7.J;
import C7.z;
import P7.v;
import P7.w;

/* loaded from: classes3.dex */
public interface c {
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    void cancel();

    F7.e connection();

    v createRequestBody(H h8, long j8);

    void finishRequest();

    void flushRequest();

    w openResponseBodySource(J j8);

    J.a readResponseHeaders(boolean z8);

    long reportedContentLength(J j8);

    z trailers();

    void writeRequestHeaders(H h8);
}
