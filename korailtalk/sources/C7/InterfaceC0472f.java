package C7;

/* renamed from: C7.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0472f extends Cloneable {

    /* renamed from: C7.f$a */
    public interface a {
        InterfaceC0472f newCall(H h8);
    }

    void cancel();

    InterfaceC0472f clone();

    void enqueue(InterfaceC0473g interfaceC0473g);

    J execute();

    boolean isCanceled();

    boolean isExecuted();

    H request();

    P7.x timeout();
}
