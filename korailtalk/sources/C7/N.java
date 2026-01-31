package C7;

/* loaded from: classes3.dex */
public interface N {

    public interface a {
        N newWebSocket(H h8, O o8);
    }

    void cancel();

    boolean close(int i8, String str);

    long queueSize();

    H request();

    boolean send(P7.f fVar);

    boolean send(String str);
}
