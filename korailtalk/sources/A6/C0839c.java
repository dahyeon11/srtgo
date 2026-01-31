package a6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b6.C1084a;
import c6.C1094a;
import c6.C1095b;
import c6.g;
import c6.i;
import c6.j;
import d6.C5327a;
import d6.C5328b;
import d6.C5329c;
import d6.d;
import d6.e;
import java.util.ArrayList;
import n4.AbstractC5957h;
import z4.C6630d;
import z4.t;

/* renamed from: a6.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0839c extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList f5983d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC0837a f5984e;

    public C0839c(ArrayList<Bundle> arrayList) {
        this.f5983d = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        if (C6630d.isNull(this.f5983d)) {
            return 0;
        }
        return this.f5983d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i8) {
        return ((Bundle) this.f5983d.get(i8)).getInt("TICKET_KIND", 0);
    }

    public void setITicketListEventListener(InterfaceC0837a interfaceC0837a) {
        this.f5984e = interfaceC0837a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(C1084a c1084a, int i8) {
        try {
            c1084a.setItem(c1084a.itemView.getContext(), this.f5984e, (Bundle) this.f5983d.get(i8));
        } catch (Exception e8) {
            t.e(e8.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public C1084a onCreateViewHolder(ViewGroup viewGroup, int i8) {
        if (i8 == -7) {
            return new C1095b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_limousine_direct_old, viewGroup, false), "old");
        }
        if (i8 == 1) {
            return new j(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_transfer, viewGroup, false));
        }
        if (i8 == 2) {
            return new i(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_transfer, viewGroup, false));
        }
        if (i8 == 3) {
            return new C5327a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_commutation_direct, viewGroup, false));
        }
        if (i8 == 4) {
            return new C5328b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_commutation_transfer, viewGroup, false));
        }
        if (i8 == 5) {
            return new e(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_pass, viewGroup, false));
        }
        switch (i8) {
            case 7:
                return new C1095b(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_limousine_direct, viewGroup, false), "new");
            case 8:
                return new d(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_n_card, viewGroup, false));
            case 9:
                return new g(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_maas_service, viewGroup, false));
            case 10:
                return new C5329c(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_commutation_gpass, viewGroup, false));
            default:
                return new C1094a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC5957h.ticket_item_transfer, viewGroup, false));
        }
    }
}
