package io.grpc.internal;

import io.grpc.AbstractC5794n;
import io.grpc.C5713a;
import io.grpc.C5728h0;
import io.grpc.C5804v;
import io.grpc.F0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class O0 {
    public static final O0 NOOP = new O0(new io.grpc.M0[0]);

    /* renamed from: a */
    private final io.grpc.M0[] f32512a;

    /* renamed from: b */
    private final AtomicBoolean f32513b = new AtomicBoolean(false);

    O0(io.grpc.M0[] m0Arr) {
        this.f32512a = m0Arr;
    }

    public static O0 newClientContext(AbstractC5794n[] abstractC5794nArr, C5713a c5713a, C5728h0 c5728h0) {
        O0 o02 = new O0(abstractC5794nArr);
        for (AbstractC5794n abstractC5794n : abstractC5794nArr) {
            abstractC5794n.streamCreated(c5713a, c5728h0);
        }
        return o02;
    }

    public static O0 newServerContext(List<? extends F0.a> list, String str, C5728h0 c5728h0) {
        if (list.isEmpty()) {
            return NOOP;
        }
        int size = list.size();
        io.grpc.M0[] m0Arr = new io.grpc.M0[size];
        for (int i8 = 0; i8 < size; i8++) {
            m0Arr[i8] = list.get(i8).newServerStreamTracer(str, c5728h0);
        }
        return new O0(m0Arr);
    }

    public void clientInboundHeaders() {
        for (io.grpc.M0 m02 : this.f32512a) {
            ((AbstractC5794n) m02).inboundHeaders();
        }
    }

    public void clientInboundTrailers(C5728h0 c5728h0) {
        for (io.grpc.M0 m02 : this.f32512a) {
            ((AbstractC5794n) m02).inboundTrailers(c5728h0);
        }
    }

    public void clientOutboundHeaders() {
        for (io.grpc.M0 m02 : this.f32512a) {
            ((AbstractC5794n) m02).outboundHeaders();
        }
    }

    public List<io.grpc.M0> getTracersForTest() {
        return new ArrayList(Arrays.asList(this.f32512a));
    }

    public void inboundMessage(int i8) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.inboundMessage(i8);
        }
    }

    public void inboundMessageRead(int i8, long j8, long j9) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.inboundMessageRead(i8, j8, j9);
        }
    }

    public void inboundUncompressedSize(long j8) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.inboundUncompressedSize(j8);
        }
    }

    public void inboundWireSize(long j8) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.inboundWireSize(j8);
        }
    }

    public void outboundMessage(int i8) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.outboundMessage(i8);
        }
    }

    public void outboundMessageSent(int i8, long j8, long j9) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.outboundMessageSent(i8, j8, j9);
        }
    }

    public void outboundUncompressedSize(long j8) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.outboundUncompressedSize(j8);
        }
    }

    public void outboundWireSize(long j8) {
        for (io.grpc.M0 m02 : this.f32512a) {
            m02.outboundWireSize(j8);
        }
    }

    public void serverCallStarted(F0.c cVar) {
        for (io.grpc.M0 m02 : this.f32512a) {
            ((io.grpc.F0) m02).serverCallStarted(cVar);
        }
    }

    public <ReqT, RespT> C5804v serverFilterContext(C5804v c5804v) {
        C5804v c5804vFilterContext = (C5804v) e3.w.checkNotNull(c5804v, "context");
        for (io.grpc.M0 m02 : this.f32512a) {
            c5804vFilterContext = ((io.grpc.F0) m02).filterContext(c5804vFilterContext);
            e3.w.checkNotNull(c5804vFilterContext, "%s returns null context", m02);
        }
        return c5804vFilterContext;
    }

    public void streamClosed(io.grpc.J0 j02) {
        if (this.f32513b.compareAndSet(false, true)) {
            for (io.grpc.M0 m02 : this.f32512a) {
                m02.streamClosed(j02);
            }
        }
    }
}
