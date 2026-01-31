package com.korail.talk.ui.booking.option.date;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.l;
import z4.N;

/* loaded from: classes.dex */
public class RentCarHourPickScroll extends RecyclerView {

    /* renamed from: J0, reason: collision with root package name */
    private int f27826J0;

    /* renamed from: K0, reason: collision with root package name */
    private int f27827K0;

    /* renamed from: L0, reason: collision with root package name */
    private int f27828L0;

    /* renamed from: M0, reason: collision with root package name */
    private ArrayList f27829M0;

    /* renamed from: N0, reason: collision with root package name */
    private b f27830N0;

    /* renamed from: O0, reason: collision with root package name */
    private a f27831O0;

    /* renamed from: P0, reason: collision with root package name */
    private Context f27832P0;

    /* renamed from: Q0, reason: collision with root package name */
    private String f27833Q0;

    public class a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        ArrayList f27834d;

        /* renamed from: e, reason: collision with root package name */
        String f27835e;

        /* renamed from: com.korail.talk.ui.booking.option.date.RentCarHourPickScroll$a$a, reason: collision with other inner class name */
        public class C0237a extends RecyclerView.E {

            /* renamed from: t, reason: collision with root package name */
            private ViewGroup f27837t;

            /* renamed from: u, reason: collision with root package name */
            private TextView f27838u;

            /* renamed from: v, reason: collision with root package name */
            private TextView f27839v;

            public C0237a(View view) {
                super(view);
                this.f27837t = (ViewGroup) view.findViewById(AbstractC5955f.hourView);
                this.f27838u = (TextView) view.findViewById(AbstractC5955f.hourTxt);
                this.f27839v = (TextView) view.findViewById(AbstractC5955f.suffixTxt);
            }

            public ViewGroup getHourView() {
                return this.f27837t;
            }
        }

        public a(ArrayList<c> arrayList, String str) {
            this.f27835e = str;
            this.f27834d = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(int i8, c cVar, View view) {
            if (RentCarHourPickScroll.this.f27830N0 != null) {
                RentCarHourPickScroll.this.f27830N0.onHourChanged(i8, cVar.getHour());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f27834d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void onBindViewHolder(C0237a c0237a, final int i8) {
            final c cVar = (c) this.f27834d.get(i8);
            c0237a.f27837t.setBackgroundColor(i8 == RentCarHourPickScroll.this.f27828L0 ? -9918507 : 0);
            c0237a.f27838u.setTextColor(-16777216);
            c0237a.f27839v.setTextColor(-16777216);
            c0237a.f27837t.setSelected(i8 == RentCarHourPickScroll.this.f27828L0);
            c0237a.f27837t.setOnClickListener(new View.OnClickListener() { // from class: S4.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4652a.c(i8, cVar, view);
                }
            });
            c0237a.f27838u.setText(cVar.getHour());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public C0237a onCreateViewHolder(ViewGroup viewGroup, int i8) {
            return new C0237a(this.f27835e.equals("hour") ? View.inflate(RentCarHourPickScroll.this.getContext(), AbstractC5957h.booking_hour_scroll_item, null) : View.inflate(RentCarHourPickScroll.this.getContext(), AbstractC5957h.booking_min_scroll_item, null));
        }
    }

    public interface b {
        void onHourChanged(int i8, String str);
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private String f27841a;

        public c(String str) {
            this.f27841a = str;
        }

        public String getHour() {
            return this.f27841a;
        }
    }

    public RentCarHourPickScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        U0(context, attributeSet);
    }

    private void T0() {
        W0();
        X0();
    }

    private void U0(Context context, AttributeSet attributeSet) {
        this.f27832P0 = context;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, l.RentCarHourPickScroll, 0, 0);
        try {
            this.f27833Q0 = typedArrayObtainStyledAttributes.getString(l.RentCarHourPickScroll_viewType);
            typedArrayObtainStyledAttributes.recycle();
            T0();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void V0(int i8) {
        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(i8, (this.f27826J0 / 2) - (this.f27827K0 / 2));
    }

    private void W0() {
        this.f27829M0 = new ArrayList();
        if ("hour".equals(this.f27833Q0)) {
            for (int i8 = 9; i8 < 19; i8++) {
                this.f27829M0.add(new c(N.addZero(2, i8)));
            }
            View viewInflate = View.inflate(getContext(), AbstractC5957h.booking_hour_scroll_item, null);
            viewInflate.measure(0, 0);
            this.f27827K0 = viewInflate.getMeasuredWidth();
        } else if ("min30".equals(this.f27833Q0)) {
            for (int i9 = 0; i9 <= 30; i9 += 30) {
                this.f27829M0.add(new c(N.addZero(2, i9)));
            }
            View viewInflate2 = View.inflate(getContext(), AbstractC5957h.booking_min_scroll_item, null);
            viewInflate2.measure(0, 0);
            this.f27827K0 = viewInflate2.getMeasuredWidth();
        } else {
            for (int i10 = 0; i10 <= 50; i10 += 10) {
                this.f27829M0.add(new c(N.addZero(2, i10)));
            }
            View viewInflate3 = View.inflate(getContext(), AbstractC5957h.booking_min_scroll_item, null);
            viewInflate3.measure(0, 0);
            this.f27827K0 = viewInflate3.getMeasuredWidth();
        }
        this.f27826J0 = getContext().getResources().getDisplayMetrics().widthPixels;
    }

    private void X0() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, true);
        linearLayoutManager.setReverseLayout(false);
        setLayoutManager(linearLayoutManager);
        a aVar = new a(this.f27829M0, this.f27833Q0);
        this.f27831O0 = aVar;
        setAdapter(aVar);
    }

    public ArrayList<c> getHourItems() {
        return this.f27829M0;
    }

    public int getSelectedHour() {
        return this.f27828L0;
    }

    public String getViewType() {
        return this.f27833Q0;
    }

    public void selectHour(int i8) {
        if (i8 < 0 || i8 >= this.f27829M0.size()) {
            return;
        }
        this.f27828L0 = i8;
        this.f27831O0.notifyDataSetChanged();
        V0(i8);
    }

    public void selectItem(int i8) {
        this.f27831O0.notifyItemChanged(this.f27828L0);
        this.f27828L0 = i8;
        this.f27831O0.notifyItemChanged(i8);
        a.C0237a c0237a = (a.C0237a) findViewHolderForLayoutPosition(i8);
        if (c0237a != null) {
            ViewGroup hourView = c0237a.getHourView();
            int[] iArr = new int[2];
            hourView.getLocationOnScreen(iArr);
            int i9 = iArr[0];
            if (i9 < 0) {
                V0(i8);
            } else if (i9 + hourView.getRight() > getWidth()) {
                V0(i8);
            }
        }
    }

    public void setOnHourChangeListener(b bVar) {
        this.f27830N0 = bVar;
    }

    public void setViewType(String str) {
        this.f27833Q0 = str;
        W0();
        X0();
    }

    public RentCarHourPickScroll(Context context) {
        super(context);
        T0();
    }

    public RentCarHourPickScroll(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        T0();
    }
}
