package g;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5530a {

    /* renamed from: g.a$a, reason: collision with other inner class name */
    public static final class C0300a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f31257a;

        public C0300a(Object obj) {
            this.f31257a = obj;
        }

        public final Object getValue() {
            return this.f31257a;
        }
    }

    public abstract Intent createIntent(Context context, Object obj);

    public C0300a getSynchronousResult(Context context, Object obj) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract Object parseResult(int i8, Intent intent);
}
