package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5728h0;
import io.grpc.internal.InterfaceC5774t;

/* loaded from: classes.dex */
public final class H extends C5771r0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f32471a;

    /* renamed from: b, reason: collision with root package name */
    private final io.grpc.J0 f32472b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC5774t.a f32473c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC5794n[] f32474d;

    public H(io.grpc.J0 j02, AbstractC5794n[] abstractC5794nArr) {
        this(j02, InterfaceC5774t.a.PROCESSED, abstractC5794nArr);
    }

    @Override // io.grpc.internal.C5771r0, io.grpc.internal.InterfaceC5772s
    public void appendTimeoutInsight(C5737a0 c5737a0) {
        c5737a0.appendKeyValue("error", this.f32472b).appendKeyValue(androidx.core.app.r.CATEGORY_PROGRESS, this.f32473c);
    }

    @Override // io.grpc.internal.C5771r0, io.grpc.internal.InterfaceC5772s
    public void start(InterfaceC5774t interfaceC5774t) {
        e3.w.checkState(!this.f32471a, "already started");
        this.f32471a = true;
        for (AbstractC5794n abstractC5794n : this.f32474d) {
            abstractC5794n.streamClosed(this.f32472b);
        }
        interfaceC5774t.closed(this.f32472b, this.f32473c, new C5728h0());
    }

    public H(io.grpc.J0 j02, InterfaceC5774t.a aVar, AbstractC5794n[] abstractC5794nArr) {
        e3.w.checkArgument(!j02.isOk(), "error must not be OK");
        this.f32472b = j02;
        this.f32473c = aVar;
        this.f32474d = abstractC5794nArr;
    }
}
