package Q5;

import P5.d;
import R5.c;
import R5.e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import n4.AbstractC5957h;

/* loaded from: classes.dex */
public class a extends RecyclerView.h {
    public static final int TYPE_COMMUTATION_RESERVATION = 1;
    public static final int TYPE_DEFAULT_RESERVATION = 0;
    public static final int TYPE_MESSAGE = 3;
    public static final int TYPE_N_CARD_RESERVATION = 2;

    /* renamed from: d, reason: collision with root package name */
    private final d f4062d;

    /* renamed from: e, reason: collision with root package name */
    private final List f4063e;

    public a(d dVar, List<b> list) {
        this.f4062d = dVar;
        this.f4063e = list;
    }

    private b b(int i8) {
        return (b) this.f4063e.get(i8);
    }

    private d c() {
        return this.f4062d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f4063e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i8) {
        return ((b) this.f4063e.get(i8)).getViewType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(R5.a aVar, int i8) {
        b bVarB = b(i8);
        aVar.setView(bVarB, i8);
        aVar.setText(bVarB, i8);
        aVar.setEventListener(bVarB, i8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public R5.a onCreateViewHolder(ViewGroup viewGroup, int i8) {
        if (1 == i8) {
            return new R5.b(c(), LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.item_reservation_confirm_commutation, viewGroup, false));
        }
        if (2 == i8) {
            return new e(c(), LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.item_reservation_confirm_n_card, viewGroup, false));
        }
        if (3 == i8) {
            return new R5.d(c(), LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.item_reservation_confirm_message, viewGroup, false));
        }
        return new c(c(), LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.item_reservation_confirm_default, viewGroup, false));
    }
}
