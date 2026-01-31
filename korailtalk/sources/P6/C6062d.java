package p6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import z4.N;

/* renamed from: p6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6062d extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private int f34628a = 2;

    /* renamed from: b, reason: collision with root package name */
    private int f34629b = N.dpToPx(5.0f);

    /* renamed from: c, reason: collision with root package name */
    private int f34630c = N.dpToPx(5.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b9) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view) - 1;
        int i8 = this.f34628a;
        int i9 = childAdapterPosition % i8;
        int i10 = childAdapterPosition / i8;
        int i11 = (itemCount - 1) / i8;
        int i12 = this.f34629b;
        rect.left = (i9 * i12) / i8;
        rect.right = i12 - (((i9 + 1) * i12) / i8);
        rect.top = i12 * 2;
        if (i10 == i11) {
            rect.bottom = this.f34630c;
        }
    }
}
