package retrofit.client;

/* loaded from: classes3.dex */
public interface Client {

    public interface Provider {
        Client get();
    }

    Response execute(Request request);
}
