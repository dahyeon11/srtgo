package androidx.lifecycle;

import android.view.View;
import k0.AbstractC5841e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class P {

    static final class a extends Lambda implements f7.l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // f7.l
        public final View invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object parent = view.getParent();
            if (parent instanceof View) {
                return (View) parent;
            }
            return null;
        }
    }

    static final class b extends Lambda implements f7.l {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // f7.l
        public final N invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object tag = view.getTag(AbstractC5841e.view_tree_view_model_store_owner);
            if (tag instanceof N) {
                return (N) tag;
            }
            return null;
        }
    }

    public static final N get(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (N) k7.p.firstOrNull(k7.p.mapNotNull(k7.p.generateSequence(view, a.INSTANCE), b.INSTANCE));
    }

    public static final void set(View view, N n8) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(AbstractC5841e.view_tree_view_model_store_owner, n8);
    }
}
