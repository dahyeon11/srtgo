package p6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import z4.N;

/* renamed from: p6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6060b extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private final int f34624a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34625b = N.dpToPx(13.0f);

    /* renamed from: c, reason: collision with root package name */
    private final int f34626c = N.dpToPx(10.0f);

    public C6060b(int i8) {
        this.f34624a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b9) {
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        rect.bottom = this.f34625b;
        if (childLayoutPosition % this.f34624a != 0) {
            rect.left = this.f34626c;
        }
    }
}
