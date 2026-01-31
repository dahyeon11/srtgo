package com.korail.talk.ui.booking.option.date;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import z4.N;

/* loaded from: classes.dex */
public class BookingHourPickScroll extends RecyclerView {

    /* renamed from: J0, reason: collision with root package name */
    private int f27793J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f27794K0;

    /* renamed from: L0, reason: collision with root package name */
    private int f27795L0;

    /* renamed from: M0, reason: collision with root package name */
    private ArrayList f27796M0;

    /* renamed from: N0, reason: collision with root package name */
    private b f27797N0;

    /* renamed from: O0, reason: collision with root package name */
    private a f27798O0;

    public class a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        ArrayList f27799d;

        /* renamed from: com.korail.talk.ui.booking.option.date.BookingHourPickScroll$a$a, reason: collision with other inner class name */
        public class C0236a extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            private ViewGroup f27801t;

            /* renamed from: u, reason: collision with root package name */
            private TextView f27802u;

            /* renamed from: v, reason: collision with root package name */
            private TextView f27803v;

            public C0236a(View view) {
                super(view);
                this.f27801t = (ViewGroup) view.findViewById(AbstractC5955f.hourView);
                this.f27802u = (TextView) view.findViewById(AbstractC5955f.hourTxt);
                this.f27803v = (TextView) view.findViewById(AbstractC5955f.suffixTxt);
            }

            public ViewGroup getHourView() {
                return this.f27801t;
            }
        }

        public a(ArrayList<c> arrayList) {
            this.f27799d = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i8, View view) {
            if (BookingHourPickScroll.this.f27797N0 != null) {
                BookingHourPickScroll.this.f27797N0.onHourChanged(i8);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f27799d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(C0236a c0236a, final int i8) {
            c cVar = (c) this.f27799d.get(i8);
            c0236a.f27801t.setBackgroundColor(i8 == BookingHourPickScroll.this.f27795L0 ? -9918507 : 0);
            c0236a.f27802u.setTextColor(-16777216);
            c0236a.f27803v.setTextColor(-16777216);
            c0236a.f27801t.setSelected(i8 == BookingHourPickScroll.this.f27795L0);
            c0236a.f27801t.setOnClickListener(new View.OnClickListener() { // from class: S4.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4632a.c(i8, view);
                }
            });
            c0236a.f27802u.setText(cVar.getHour());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public C0236a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new C0236a(View.inflate(BookingHourPickScroll.this.getContext(), AbstractC5957h.booking_hour_scroll_item, null));
        }
    }

    public interface b {
        void onHourChanged(int i8);
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private String f27805a;

        public c(String str) {
            this.f27805a = str;
        }

        public String getHour() {
            return this.f27805a;
        }
    }

    public BookingHourPickScroll(Context context) {
        super(context);
        T0();
    }

    private void T0() {
        V0();
        W0();
    }

    private void U0(int i8) {
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(i8, (this.f27793J0 / 2) - (this.f27794K0 / 2));
    }

    private void V0() {
        this.f27796M0 = new ArrayList();
        for (int i8 = 0; i8 < 24; i8++) {
            this.f27796M0.add(new c(N.addZero(2, i8)));
        }
        View viewInflate = View.inflate(getContext(), AbstractC5957h.booking_hour_scroll_item, null);
        viewInflate.measure(0, 0);
        this.f27794K0 = viewInflate.getMeasuredWidth();
        this.f27793J0 = getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private void W0() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, true);
        linearLayoutManager.setReverseLayout(false);
        setLayoutManager(linearLayoutManager);
        a aVar = new a(this.f27796M0);
        this.f27798O0 = aVar;
        setAdapter(aVar);
    }

    public int getSelectedHour() {
        return this.f27795L0;
    }

    public void selectHour(int i8) {
        if (i8 < 0 || i8 >= this.f27796M0.size()) {
            return;
        }
        this.f27795L0 = i8;
        this.f27798O0.notifyDataSetChanged();
        U0(i8);
    }

    public void selectItem(int i8) {
        this.f27798O0.notifyItemChanged(this.f27795L0);
        this.f27795L0 = i8;
        this.f27798O0.notifyItemChanged(i8);
        a.C0236a c0236a = (a.C0236a) findViewHolderForLayoutPosition(i8);
        if (c0236a != null) {
            ViewGroup hourView = c0236a.getHourView();
            int[] iArr = new int[2];
            hourView.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            if (i9 < 0) {
                U0(i8);
            } else if (i9 + hourView.getRight() > getWidth()) {
                U0(i8);
            }
        }
    }

    public void setOnHourChangeListener(b bVar) {
        this.f27797N0 = bVar;
    }

    public BookingHourPickScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        T0();
    }

    public BookingHourPickScroll(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        T0();
    }
}
