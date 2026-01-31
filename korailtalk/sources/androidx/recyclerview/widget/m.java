package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
abstract class m {
    static int a(RecyclerView.B b9, j jVar, View view, View view2, RecyclerView.p pVar, boolean z8) {
        if (pVar.getChildCount() == 0 || b9.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1;
        }
        return Math.min(jVar.getTotalSpace(), jVar.getDecoratedEnd(view2) - jVar.getDecoratedStart(view));
    }

    static int b(RecyclerView.B b9, j jVar, View view, View view2, RecyclerView.p pVar, boolean z8, boolean z9) {
        if (pVar.getChildCount() == 0 || b9.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z9 ? Math.max(0, (b9.getItemCount() - Math.max(pVar.getPosition(view), pVar.getPosition(view2))) - 1) : Math.max(0, Math.min(pVar.getPosition(view), pVar.getPosition(view2)));
        if (z8) {
            return Math.round((iMax * (Math.abs(jVar.getDecoratedEnd(view2) - jVar.getDecoratedStart(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1))) + (jVar.getStartAfterPadding() - jVar.getDecoratedStart(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.B b9, j jVar, View view, View view2, RecyclerView.p pVar, boolean z8) {
        if (pVar.getChildCount() == 0 || b9.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z8) {
            return b9.getItemCount();
        }
        return (int) (((jVar.getDecoratedEnd(view2) - jVar.getDecoratedStart(view)) / (Math.abs(pVar.getPosition(view) - pVar.getPosition(view2)) + 1)) * b9.getItemCount());
    }
}
