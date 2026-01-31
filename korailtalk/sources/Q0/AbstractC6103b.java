package q0;

import R6.G;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.C;
import f7.l;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import n7.T;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6103b {

    /* renamed from: q0.b$a */
    static final class a extends Lambda implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f34913a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ T f34914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c.a aVar, T t8) {
            super(1);
            this.f34913a = aVar;
            this.f34914b = t8;
        }

        @Override // f7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return G.INSTANCE;
        }

        public final void invoke(Throwable th) {
            if (th == null) {
                this.f34913a.set(this.f34914b.getCompleted());
            } else if (th instanceof CancellationException) {
                this.f34913a.setCancelled();
            } else {
                this.f34913a.setException(th);
            }
        }
    }

    public static final <T> C asListenableFuture(final T t8, final Object obj) {
        Intrinsics.checkNotNullParameter(t8, "<this>");
        C future = c.getFuture(new c.InterfaceC0123c() { // from class: q0.a
            @Override // androidx.concurrent.futures.c.InterfaceC0123c
            public final Object attachCompleter(c.a aVar) {
                return AbstractC6103b.b(t8, obj, aVar);
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return future;
    }

    public static /* synthetic */ C asListenableFuture$default(T t8, Object obj, int i8, Object obj2) {
        if ((i8 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(t8, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b(T this_asListenableFuture, Object obj, c.a completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
