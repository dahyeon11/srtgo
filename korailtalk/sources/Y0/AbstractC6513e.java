package y0;

import android.view.View;
import f7.l;
import k7.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: y0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6513e {

    /* renamed from: y0.e$a */
    static final class a extends Lambda implements l {
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

    /* renamed from: y0.e$b */
    static final class b extends Lambda implements l {
        public static final b INSTANCE = new b();

        b() {
            super(1);
        }

        @Override // f7.l
        public final InterfaceC6512d invoke(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Object tag = view.getTag(AbstractC6509a.view_tree_saved_state_registry_owner);
            if (tag instanceof InterfaceC6512d) {
                return (InterfaceC6512d) tag;
            }
            return null;
        }
    }

    public static final InterfaceC6512d get(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC6512d) p.firstOrNull(p.mapNotNull(p.generateSequence(view, a.INSTANCE), b.INSTANCE));
    }

    public static final void set(View view, InterfaceC6512d interfaceC6512d) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(AbstractC6509a.view_tree_saved_state_registry_owner, interfaceC6512d);
    }
}
