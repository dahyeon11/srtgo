package androidx.activity;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public abstract class v {

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
        public final q invoke(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Object tag = it.getTag(u.report_drawn);
            if (tag instanceof q) {
                return (q) tag;
            }
            return null;
        }
    }

    public static final q get(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (q) k7.p.firstOrNull(k7.p.mapNotNull(k7.p.generateSequence(view, a.INSTANCE), b.INSTANCE));
    }

    public static final void set(View view, q fullyDrawnReporterOwner) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(u.report_drawn, fullyDrawnReporterOwner);
    }
}
