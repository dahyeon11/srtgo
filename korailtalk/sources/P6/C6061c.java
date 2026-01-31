package p6;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import z4.N;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6061c extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    private int f34627a = N.dpToPx(14.0f);

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.B b9) {
        rect.bottom = this.f34627a;
    }
}
