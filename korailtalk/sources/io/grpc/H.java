package io.grpc;

import io.grpc.w0;

/* loaded from: classes.dex */
public abstract class H extends AbstractC5799p0 {

    public static abstract class a extends H {

        /* renamed from: a, reason: collision with root package name */
        private final w0.a f31961a;

        protected a(w0.a aVar) {
            this.f31961a = aVar;
        }

        @Override // io.grpc.H, io.grpc.AbstractC5799p0
        protected w0.a a() {
            return this.f31961a;
        }

        @Override // io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public /* bridge */ /* synthetic */ void onCancel() {
            super.onCancel();
        }

        @Override // io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public /* bridge */ /* synthetic */ void onComplete() {
            super.onComplete();
        }

        @Override // io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public /* bridge */ /* synthetic */ void onHalfClose() {
            super.onHalfClose();
        }

        @Override // io.grpc.H, io.grpc.AbstractC5799p0, io.grpc.w0.a
        public /* bridge */ /* synthetic */ void onReady() {
            super.onReady();
        }

        @Override // io.grpc.H, io.grpc.AbstractC5799p0
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    @Override // io.grpc.AbstractC5799p0
    protected abstract w0.a a();

    @Override // io.grpc.AbstractC5799p0, io.grpc.w0.a
    public /* bridge */ /* synthetic */ void onCancel() {
        super.onCancel();
    }

    @Override // io.grpc.AbstractC5799p0, io.grpc.w0.a
    public /* bridge */ /* synthetic */ void onComplete() {
        super.onComplete();
    }

    @Override // io.grpc.AbstractC5799p0, io.grpc.w0.a
    public /* bridge */ /* synthetic */ void onHalfClose() {
        super.onHalfClose();
    }

    @Override // io.grpc.w0.a
    public void onMessage(Object obj) {
        a().onMessage(obj);
    }

    @Override // io.grpc.AbstractC5799p0, io.grpc.w0.a
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // io.grpc.AbstractC5799p0
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
