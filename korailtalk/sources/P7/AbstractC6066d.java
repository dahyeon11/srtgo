package p7;

import j3.AbstractC5822d;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.KFunction;
import n7.InterfaceC5996n;
import s7.K;
import s7.N;

/* renamed from: p7.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6066d {

    /* renamed from: a */
    private static final C6073k f34662a = new C6073k(-1, null, null, 0);
    public static final int SEGMENT_SIZE = N.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);

    /* renamed from: b */
    private static final int f34663b = N.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
    public static final K BUFFERED = new K("BUFFERED");

    /* renamed from: c */
    private static final K f34664c = new K("SHOULD_BUFFER");

    /* renamed from: d */
    private static final K f34665d = new K("S_RESUMING_BY_RCV");

    /* renamed from: e */
    private static final K f34666e = new K("RESUMING_BY_EB");

    /* renamed from: f */
    private static final K f34667f = new K("POISONED");

    /* renamed from: g */
    private static final K f34668g = new K("DONE_RCV");

    /* renamed from: h */
    private static final K f34669h = new K("INTERRUPTED_SEND");

    /* renamed from: i */
    private static final K f34670i = new K("INTERRUPTED_RCV");

    /* renamed from: j */
    private static final K f34671j = new K("CHANNEL_CLOSED");

    /* renamed from: k */
    private static final K f34672k = new K("SUSPEND");

    /* renamed from: l */
    private static final K f34673l = new K("SUSPEND_NO_WAITER");

    /* renamed from: m */
    private static final K f34674m = new K("FAILED");

    /* renamed from: n */
    private static final K f34675n = new K("NO_RECEIVE_RESULT");

    /* renamed from: o */
    private static final K f34676o = new K("CLOSE_HANDLER_CLOSED");

    /* renamed from: p */
    private static final K f34677p = new K("CLOSE_HANDLER_INVOKED");

    /* renamed from: q */
    private static final K f34678q = new K("NO_CLOSE_CAUSE");

    /* renamed from: p7.d$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements f7.p {
        public static final a INSTANCE = new a();

        a() {
            super(2, AbstractC6066d.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }

        @Override // f7.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (C6073k) obj2);
        }

        public final C6073k invoke(long j8, C6073k c6073k) {
            return AbstractC6066d.c(j8, c6073k);
        }
    }

    public static final long a(long j8, boolean z8) {
        return (z8 ? AbstractC5822d.MAX_POWER_OF_TWO : 0L) + j8;
    }

    public static final long b(long j8, int i8) {
        return (i8 << 60) + j8;
    }

    public static final C6073k c(long j8, C6073k c6073k) {
        return new C6073k(j8, c6073k, c6073k.getChannel(), 0);
    }

    public static final <E> KFunction<C6073k> createSegmentFunction() {
        return a.INSTANCE;
    }

    public static final long d(int i8) {
        if (i8 == 0) {
            return 0L;
        }
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        return Long.MAX_VALUE;
    }

    public static final boolean e(InterfaceC5996n interfaceC5996n, Object obj, f7.l lVar) {
        Object objTryResume = interfaceC5996n.tryResume(obj, null, lVar);
        if (objTryResume == null) {
            return false;
        }
        interfaceC5996n.completeResume(objTryResume);
        return true;
    }

    static /* synthetic */ boolean f(InterfaceC5996n interfaceC5996n, Object obj, f7.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        return e(interfaceC5996n, obj, lVar);
    }

    public static final K getCHANNEL_CLOSED() {
        return f34671j;
    }
}
