package n7;

import W6.g;
import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;

/* renamed from: n7.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5993l0 extends I implements Closeable {
    public static final a Key = new a(null);

    /* renamed from: n7.l0$a */
    public static final class a extends W6.b {

        /* renamed from: n7.l0$a$a, reason: collision with other inner class name */
        static final class C0355a extends Lambda implements f7.l {
            public static final C0355a INSTANCE = new C0355a();

            C0355a() {
                super(1);
            }

            @Override // f7.l
            public final AbstractC5993l0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC5993l0) {
                    return (AbstractC5993l0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(I.Key, C0355a.INSTANCE);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    public abstract Executor getExecutor();
}
