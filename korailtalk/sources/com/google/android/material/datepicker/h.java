package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C0923a;
import androidx.core.view.accessibility.H;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import k0.AbstractC5837a;

/* loaded from: classes2.dex */
public final class h<S> extends p {

    /* renamed from: l0 */
    static final Object f24685l0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: m0 */
    static final Object f24686m0 = "NAVIGATION_PREV_TAG";

    /* renamed from: n0 */
    static final Object f24687n0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: o0 */
    static final Object f24688o0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: c0 */
    private int f24689c0;

    /* renamed from: d0 */
    private com.google.android.material.datepicker.a f24690d0;

    /* renamed from: e0 */
    private com.google.android.material.datepicker.l f24691e0;

    /* renamed from: f0 */
    private k f24692f0;

    /* renamed from: g0 */
    private com.google.android.material.datepicker.c f24693g0;

    /* renamed from: h0 */
    private RecyclerView f24694h0;

    /* renamed from: i0 */
    private RecyclerView f24695i0;

    /* renamed from: j0 */
    private View f24696j0;

    /* renamed from: k0 */
    private View f24697k0;

    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f24698a;

        a(int i8) {
            this.f24698a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f24695i0.smoothScrollToPosition(this.f24698a);
        }
    }

    class b extends C0923a {
        b() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setCollectionInfo(null);
        }
    }

    class c extends q {

        /* renamed from: I */
        final /* synthetic */ int f24701I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i8, boolean z8, int i9) {
            super(context, i8, z8);
            this.f24701I = i9;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void x(RecyclerView.B b9, int[] iArr) {
            if (this.f24701I == 0) {
                iArr[0] = h.this.f24695i0.getWidth();
                iArr[1] = h.this.f24695i0.getWidth();
            } else {
                iArr[0] = h.this.f24695i0.getHeight();
                iArr[1] = h.this.f24695i0.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        @Override // com.google.android.material.datepicker.h.l
        public void onDayClick(long j8) {
            if (h.this.f24690d0.getDateValidator().isValid(j8)) {
                h.r0(h.this);
                throw null;
            }
        }
    }

    class e extends RecyclerView.o {

        /* renamed from: a */
        private final Calendar f24704a = s.i();

        /* renamed from: b */
        private final Calendar f24705b = s.i();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.B b9) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                h.r0(h.this);
                throw null;
            }
        }
    }

    class f extends C0923a {
        f() {
        }

        @Override // androidx.core.view.C0923a
        public void onInitializeAccessibilityNodeInfo(View view, H h8) {
            super.onInitializeAccessibilityNodeInfo(view, h8);
            h8.setHintText(h.this.f24697k0.getVisibility() == 0 ? h.this.getString(J2.j.mtrl_picker_toggle_to_year_selection) : h.this.getString(J2.j.mtrl_picker_toggle_to_day_selection));
        }
    }

    class g extends RecyclerView.u {

        /* renamed from: a */
        final /* synthetic */ n f24708a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f24709b;

        g(n nVar, MaterialButton materialButton) {
            this.f24708a = nVar;
            this.f24709b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
            if (i8 == 0) {
                recyclerView.announceForAccessibility(this.f24709b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            int iFindFirstVisibleItemPosition = i8 < 0 ? h.this.A0().findFirstVisibleItemPosition() : h.this.A0().findLastVisibleItemPosition();
            h.this.f24691e0 = this.f24708a.c(iFindFirstVisibleItemPosition);
            this.f24709b.setText(this.f24708a.d(iFindFirstVisibleItemPosition));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    class ViewOnClickListenerC0199h implements View.OnClickListener {
        ViewOnClickListenerC0199h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.E0();
        }
    }

    class i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ n f24712a;

        i(n nVar) {
            this.f24712a = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindFirstVisibleItemPosition = h.this.A0().findFirstVisibleItemPosition() + 1;
            if (iFindFirstVisibleItemPosition < h.this.f24695i0.getAdapter().getItemCount()) {
                h.this.C0(this.f24712a.c(iFindFirstVisibleItemPosition));
            }
        }
    }

    class j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ n f24714a;

        j(n nVar) {
            this.f24714a = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iFindLastVisibleItemPosition = h.this.A0().findLastVisibleItemPosition() - 1;
            if (iFindLastVisibleItemPosition >= 0) {
                h.this.C0(this.f24714a.c(iFindLastVisibleItemPosition));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void onDayClick(long j8);
    }

    private void B0(int i8) {
        this.f24695i0.post(new a(i8));
    }

    public static <T> h<T> newInstance(com.google.android.material.datepicker.d dVar, int i8, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i8);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.h());
        hVar.setArguments(bundle);
        return hVar;
    }

    static /* synthetic */ com.google.android.material.datepicker.d r0(h hVar) {
        hVar.getClass();
        return null;
    }

    private void u0(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(J2.f.month_navigation_fragment_toggle);
        materialButton.setTag(f24688o0);
        AbstractC0985p0.setAccessibilityDelegate(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(J2.f.month_navigation_previous);
        materialButton2.setTag(f24686m0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(J2.f.month_navigation_next);
        materialButton3.setTag(f24687n0);
        this.f24696j0 = view.findViewById(J2.f.mtrl_calendar_year_selector_frame);
        this.f24697k0 = view.findViewById(J2.f.mtrl_calendar_day_selector_frame);
        D0(k.DAY);
        materialButton.setText(this.f24691e0.h(view.getContext()));
        this.f24695i0.addOnScrollListener(new g(nVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0199h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.o v0() {
        return new e();
    }

    static int z0(Context context) {
        return context.getResources().getDimensionPixelSize(J2.d.mtrl_calendar_day_height);
    }

    LinearLayoutManager A0() {
        return (LinearLayoutManager) this.f24695i0.getLayoutManager();
    }

    void C0(com.google.android.material.datepicker.l lVar) {
        n nVar = (n) this.f24695i0.getAdapter();
        int iE = nVar.e(lVar);
        int iE2 = iE - nVar.e(this.f24691e0);
        boolean z8 = Math.abs(iE2) > 3;
        boolean z9 = iE2 > 0;
        this.f24691e0 = lVar;
        if (z8 && z9) {
            this.f24695i0.scrollToPosition(iE - 3);
            B0(iE);
        } else if (!z8) {
            B0(iE);
        } else {
            this.f24695i0.scrollToPosition(iE + 3);
            B0(iE);
        }
    }

    void D0(k kVar) {
        this.f24692f0 = kVar;
        if (kVar == k.YEAR) {
            this.f24694h0.getLayoutManager().scrollToPosition(((t) this.f24694h0.getAdapter()).b(this.f24691e0.f24743c));
            this.f24696j0.setVisibility(0);
            this.f24697k0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f24696j0.setVisibility(8);
            this.f24697k0.setVisibility(0);
            C0(this.f24691e0);
        }
    }

    void E0() {
        k kVar = this.f24692f0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            D0(k.DAY);
        } else if (kVar == k.DAY) {
            D0(kVar2);
        }
    }

    @Override // com.google.android.material.datepicker.p
    public boolean addOnSelectionChangedListener(o oVar) {
        return super.addOnSelectionChangedListener(oVar);
    }

    public com.google.android.material.datepicker.d getDateSelector() {
        return null;
    }

    @Override // com.google.android.material.datepicker.p, androidx.fragment.app.Fragment, androidx.lifecycle.InterfaceC1018g
    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f24689c0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.f.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f24690d0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f24691e0 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i8;
        int i9;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f24689c0);
        this.f24693g0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l lVarI = this.f24690d0.i();
        if (com.google.android.material.datepicker.i.D0(contextThemeWrapper)) {
            i8 = J2.h.mtrl_calendar_vertical;
            i9 = 1;
        } else {
            i8 = J2.h.mtrl_calendar_horizontal;
            i9 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i8, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(J2.f.mtrl_calendar_days_of_week);
        AbstractC0985p0.setAccessibilityDelegate(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(lVarI.f24744d);
        gridView.setEnabled(false);
        this.f24695i0 = (RecyclerView) viewInflate.findViewById(J2.f.mtrl_calendar_months);
        this.f24695i0.setLayoutManager(new c(getContext(), i9, false, i9));
        this.f24695i0.setTag(f24685l0);
        n nVar = new n(contextThemeWrapper, null, this.f24690d0, new d());
        this.f24695i0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(J2.g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(J2.f.mtrl_calendar_year_selector_frame);
        this.f24694h0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f24694h0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f24694h0.setAdapter(new t(this));
            this.f24694h0.addItemDecoration(v0());
        }
        if (viewInflate.findViewById(J2.f.month_navigation_fragment_toggle) != null) {
            u0(viewInflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.D0(contextThemeWrapper)) {
            new androidx.recyclerview.widget.k().attachToRecyclerView(this.f24695i0);
        }
        this.f24695i0.scrollToPosition(nVar.e(this.f24691e0));
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f24689c0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f24690d0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f24691e0);
    }

    com.google.android.material.datepicker.a w0() {
        return this.f24690d0;
    }

    com.google.android.material.datepicker.c x0() {
        return this.f24693g0;
    }

    com.google.android.material.datepicker.l y0() {
        return this.f24691e0;
    }
}
