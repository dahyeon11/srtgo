package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class a extends RecyclerView.E {
    private a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    static a G(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(AbstractC0985p0.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }

    FrameLayout H() {
        return (FrameLayout) this.itemView;
    }
}
