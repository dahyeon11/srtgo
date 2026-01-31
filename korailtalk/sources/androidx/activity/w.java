package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class w {

    static final class a extends Lambda implements f7.l {
        public static final a INSTANCE = new a();

        a() {
            super(1);
        }

        @Override // f7.l
        public final View invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object parent = it.getParent();
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
        public final t invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object tag = it.getTag(u.view_tree_on_back_pressed_dispatcher_owner);
            if (tag instanceof t) {
                return (t) tag;
            }
            return null;
        }
    }

    public static final t get(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (t) k7.p.firstOrNull(k7.p.mapNotNull(k7.p.generateSequence(view, a.INSTANCE), b.INSTANCE));
    }

    public static final void set(View view, t onBackPressedDispatcherOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(u.view_tree_on_back_pressed_dispatcher_owner, onBackPressedDispatcherOwner);
    }
}
