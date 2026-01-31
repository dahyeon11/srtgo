package io.grpc;

import io.grpc.AbstractC5786j;

/* loaded from: classes.dex */
public abstract class F extends AbstractC5795n0 {

    public static abstract class a extends F {
        private final AbstractC5786j.a delegate;

        protected a(AbstractC5786j.a aVar) {
            this.delegate = aVar;
        }

        @Override // io.grpc.F, io.grpc.AbstractC5795n0
        protected AbstractC5786j.a delegate() {
            return this.delegate;
        }

        @Override // io.grpc.F, io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
        public /* bridge */ /* synthetic */ void onClose(J0 j02, C5728h0 c5728h0) {
            super.onClose(j02, c5728h0);
        }

        @Override // io.grpc.F, io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
        public /* bridge */ /* synthetic */ void onHeaders(C5728h0 c5728h0) {
            super.onHeaders(c5728h0);
        }

        @Override // io.grpc.F, io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // io.grpc.F, io.grpc.AbstractC5795n0
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.AbstractC5795n0
    protected abstract AbstractC5786j.a delegate();

    @Override // io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
    public /* bridge */ /* synthetic */ void onClose(J0 j02, C5728h0 c5728h0) {
        super.onClose(j02, c5728h0);
    }

    @Override // io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
    public /* bridge */ /* synthetic */ void onHeaders(C5728h0 c5728h0) {
        super.onHeaders(c5728h0);
    }

    @Override // io.grpc.AbstractC5786j.a
    public void onMessage(Object obj) {
        delegate().onMessage(obj);
    }

    @Override // io.grpc.AbstractC5795n0, io.grpc.AbstractC5786j.a
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // io.grpc.AbstractC5795n0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
