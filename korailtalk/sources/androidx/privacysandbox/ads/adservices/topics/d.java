package androidx.privacysandbox.ads.adservices.topics;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p0.C6048b;

/* loaded from: classes.dex */
public abstract class d {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d obtain(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C6048b c6048b = C6048b.INSTANCE;
            if (c6048b.version() >= 5) {
                return new l(context);
            }
            if (c6048b.version() == 4) {
                return new g(context);
            }
            return null;
        }

        private a() {
        }
    }

    public static final d obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getTopics(androidx.privacysandbox.ads.adservices.topics.a aVar, W6.d<? super b> dVar);
}
