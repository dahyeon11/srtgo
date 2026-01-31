package p7;

import java.util.concurrent.CancellationException;
import p7.InterfaceC6098w;
import p7.InterfaceC6099x;
import s7.L;

/* renamed from: p7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC6067e extends InterfaceC6099x, InterfaceC6098w {
    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;
    public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
    public static final b Factory = b.f34679a;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = Integer.MAX_VALUE;

    /* renamed from: p7.e$a */
    public static final class a {
        public static <E> v7.f getOnReceiveOrNull(InterfaceC6067e interfaceC6067e) {
            return InterfaceC6098w.a.getOnReceiveOrNull(interfaceC6067e);
        }

        public static <E> boolean offer(InterfaceC6067e interfaceC6067e, E e8) {
            return InterfaceC6099x.a.offer(interfaceC6067e, e8);
        }

        public static <E> E poll(InterfaceC6067e interfaceC6067e) {
            return (E) InterfaceC6098w.a.poll(interfaceC6067e);
        }

        public static <E> Object receiveOrNull(InterfaceC6067e interfaceC6067e, W6.d<? super E> dVar) {
            return InterfaceC6098w.a.receiveOrNull(interfaceC6067e, dVar);
        }
    }

    /* renamed from: p7.e$b */
    public static final class b {
        public static final int BUFFERED = -2;
        public static final int CONFLATED = -1;
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = Integer.MAX_VALUE;

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f34679a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final int f34680b = L.systemProp("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private b() {
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
            return f34680b;
        }
    }

    /* synthetic */ void cancel();

    /* synthetic */ void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    @Override // p7.InterfaceC6099x
    /* synthetic */ boolean close(Throwable th);

    /* synthetic */ v7.f getOnReceive();

    /* synthetic */ v7.f getOnReceiveCatching();

    /* synthetic */ v7.f getOnReceiveOrNull();

    @Override // p7.InterfaceC6099x
    /* synthetic */ v7.h getOnSend();

    @Override // p7.InterfaceC6099x
    /* synthetic */ void invokeOnClose(f7.l lVar);

    /* synthetic */ boolean isClosedForReceive();

    @Override // p7.InterfaceC6099x
    /* synthetic */ boolean isClosedForSend();

    /* synthetic */ boolean isEmpty();

    /* synthetic */ InterfaceC6069g iterator();

    @Override // p7.InterfaceC6099x
    /* synthetic */ boolean offer(Object obj);

    /* synthetic */ Object poll();

    /* synthetic */ Object receive(W6.d dVar);

    /* renamed from: receiveCatching-JP2dKIU */
    /* synthetic */ Object mo533receiveCatchingJP2dKIU(W6.d dVar);

    /* synthetic */ Object receiveOrNull(W6.d dVar);

    @Override // p7.InterfaceC6099x
    /* synthetic */ Object send(Object obj, W6.d dVar);

    /* renamed from: tryReceive-PtdJZtk */
    /* synthetic */ Object mo534tryReceivePtdJZtk();

    @Override // p7.InterfaceC6099x
    /* renamed from: trySend-JP2dKIU */
    /* synthetic */ Object mo535trySendJP2dKIU(Object obj);
}
