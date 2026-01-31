package androidx.lifecycle;

import android.view.View;
import j0.AbstractC5810a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class O {

    static final class a extends Lambda implements f7.l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // f7.l
        public final View invoke(View currentView) {
            Intrinsics.checkNotNullParameter(currentView, "currentView");
            Object parent = currentView.getParent();
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
        public final InterfaceC1025n invoke(View viewParent) {
            Intrinsics.checkNotNullParameter(viewParent, "viewParent");
            Object tag = viewParent.getTag(AbstractC5810a.view_tree_lifecycle_owner);
            if (tag instanceof InterfaceC1025n) {
                return (InterfaceC1025n) tag;
            }
            return null;
        }
    }

    public static final InterfaceC1025n get(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (InterfaceC1025n) k7.p.firstOrNull(k7.p.mapNotNull(k7.p.generateSequence(view, a.INSTANCE), b.INSTANCE));
    }

    public static final void set(View view, InterfaceC1025n interfaceC1025n) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(AbstractC5810a.view_tree_lifecycle_owner, interfaceC1025n);
    }
}
