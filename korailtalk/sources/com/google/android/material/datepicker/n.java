package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.AbstractC0985p0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;

/* loaded from: classes2.dex */
class n extends RecyclerView.h {

    /* renamed from: d, reason: collision with root package name */
    private final Context f24753d;

    /* renamed from: e, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f24754e;

    /* renamed from: f, reason: collision with root package name */
    private final h.l f24755f;

    /* renamed from: g, reason: collision with root package name */
    private final int f24756g;

    class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f24757a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f24757a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i8, long j8) {
            if (this.f24757a.getAdapter().i(i8)) {
                n.this.f24755f.onDayClick(this.f24757a.getAdapter().getItem(i8).longValue());
            }
        }
    }

    public static class b extends RecyclerView.E {

        /* renamed from: t, reason: collision with root package name */
        final TextView f24759t;

        /* renamed from: u, reason: collision with root package name */
        final MaterialCalendarGridView f24760u;

        b(LinearLayout linearLayout, boolean z8) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(J2.f.month_title);
            this.f24759t = textView;
            AbstractC0985p0.setAccessibilityHeading(textView, true);
            this.f24760u = (MaterialCalendarGridView) linearLayout.findViewById(J2.f.month_grid);
            if (z8) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    n(Context context, d dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l lVarI = aVar.i();
        l lVarF = aVar.f();
        l lVarH = aVar.h();
        if (lVarI.compareTo(lVarH) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVarH.compareTo(lVarF) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int iZ0 = m.f24748e * h.z0(context);
        int iZ02 = i.D0(context) ? h.z0(context) : 0;
        this.f24753d = context;
        this.f24756g = iZ0 + iZ02;
        this.f24754e = aVar;
        this.f24755f = lVar;
        setHasStableIds(true);
    }

    l c(int i8) {
        return this.f24754e.i().j(i8);
    }

    CharSequence d(int i8) {
        return c(i8).h(this.f24753d);
    }

    int e(l lVar) {
        return this.f24754e.i().k(lVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f24754e.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i8) {
        return this.f24754e.i().j(i8).i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(b bVar, int i8) {
        l lVarJ = this.f24754e.i().j(i8);
        bVar.f24759t.setText(lVarJ.h(bVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f24760u.findViewById(J2.f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !lVarJ.equals(materialCalendarGridView.getAdapter().f24749a)) {
            m mVar = new m(lVarJ, null, this.f24754e);
            materialCalendarGridView.setNumColumns(lVarJ.f24744d);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().updateSelectedStates(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public b onCreateViewHolder(ViewGroup viewGroup, int i8) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(J2.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!i.D0(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f24756g));
        return new b(linearLayout, true);
    }
}
