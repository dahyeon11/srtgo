package io.grpc;

/* loaded from: classes.dex */
public abstract class w0 {

    public static abstract class a {
        public void onCancel() {
        }

        public void onComplete() {
        }

        public void onHalfClose() {
        }

        public void onMessage(Object obj) {
        }

        public void onReady() {
        }
    }

    public abstract void close(J0 j02, C5728h0 c5728h0);

    public C5713a getAttributes() {
        return C5713a.EMPTY;
    }

    public String getAuthority() {
        return null;
    }

    public abstract C5730i0 getMethodDescriptor();

    public t0 getSecurityLevel() {
        return t0.NONE;
    }

    public abstract boolean isCancelled();

    public boolean isReady() {
        return true;
    }

    public abstract void request(int i8);

    public abstract void sendHeaders(C5728h0 c5728h0);

    public abstract void sendMessage(Object obj);

    public void setCompression(String str) {
    }

    public void setMessageCompression(boolean z8) {
    }
}
