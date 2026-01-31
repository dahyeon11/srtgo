package io.grpc;

/* renamed from: io.grpc.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5786j {

    /* renamed from: io.grpc.j$a */
    public static abstract class a {
        public void onClose(J0 j02, C5728h0 c5728h0) {
        }

        public void onHeaders(C5728h0 c5728h0) {
        }

        public void onMessage(Object obj) {
        }

        public void onReady() {
        }
    }

    public abstract void cancel(String str, Throwable th);

    public C5713a getAttributes() {
        return C5713a.EMPTY;
    }

    public abstract void halfClose();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i8);

    public abstract void sendMessage(Object obj);

    public void setMessageCompression(boolean z8) {
    }

    public abstract void start(a aVar, C5728h0 c5728h0);
}
