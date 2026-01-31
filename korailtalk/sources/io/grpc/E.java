package io.grpc;

import io.grpc.AbstractC5786j;

/* loaded from: classes.dex */
public abstract class E extends AbstractC5793m0 {

    public static abstract class a extends E {
        private final AbstractC5786j delegate;

        protected a(AbstractC5786j abstractC5786j) {
            this.delegate = abstractC5786j;
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public /* bridge */ /* synthetic */ void cancel(String str, Throwable th) {
            super.cancel(str, th);
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0
        protected AbstractC5786j delegate() {
            return this.delegate;
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public /* bridge */ /* synthetic */ C5713a getAttributes() {
            return super.getAttributes();
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public /* bridge */ /* synthetic */ void halfClose() {
            super.halfClose();
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public /* bridge */ /* synthetic */ boolean isReady() {
            return super.isReady();
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public /* bridge */ /* synthetic */ void request(int i8) {
            super.request(i8);
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
        public /* bridge */ /* synthetic */ void setMessageCompression(boolean z8) {
            super.setMessageCompression(z8);
        }

        @Override // io.grpc.E, io.grpc.AbstractC5793m0
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
    public /* bridge */ /* synthetic */ void cancel(String str, Throwable th) {
        super.cancel(str, th);
    }

    @Override // io.grpc.AbstractC5793m0
    protected abstract AbstractC5786j delegate();

    @Override // io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
    public /* bridge */ /* synthetic */ C5713a getAttributes() {
        return super.getAttributes();
    }

    @Override // io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
    public /* bridge */ /* synthetic */ void halfClose() {
        super.halfClose();
    }

    @Override // io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
    public /* bridge */ /* synthetic */ boolean isReady() {
        return super.isReady();
    }

    @Override // io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
    public /* bridge */ /* synthetic */ void request(int i8) {
        super.request(i8);
    }

    @Override // io.grpc.AbstractC5786j
    public void sendMessage(Object obj) {
        delegate().sendMessage(obj);
    }

    @Override // io.grpc.AbstractC5793m0, io.grpc.AbstractC5786j
    public /* bridge */ /* synthetic */ void setMessageCompression(boolean z8) {
        super.setMessageCompression(z8);
    }

    @Override // io.grpc.AbstractC5786j
    public void start(AbstractC5786j.a aVar, C5728h0 c5728h0) {
        delegate().start(aVar, c5728h0);
    }

    @Override // io.grpc.AbstractC5793m0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
