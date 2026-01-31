package androidx.viewpager2.adapter;

import H0.y;
import O.e;
import Z.h;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC0985p0;
import androidx.fragment.app.ActivityC1010e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.g;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.h implements androidx.viewpager2.adapter.b {

    /* renamed from: d, reason: collision with root package name */
    final AbstractC1019h f10942d;

    /* renamed from: e, reason: collision with root package name */
    final FragmentManager f10943e;

    /* renamed from: f, reason: collision with root package name */
    final e f10944f;

    /* renamed from: g, reason: collision with root package name */
    private final e f10945g;

    /* renamed from: h, reason: collision with root package name */
    private final e f10946h;

    /* renamed from: i, reason: collision with root package name */
    private FragmentMaxLifecycleEnforcer f10947i;

    /* renamed from: j, reason: collision with root package name */
    boolean f10948j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10949k;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a, reason: collision with root package name */
        private g.i f10955a;

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView.j f10956b;

        /* renamed from: c, reason: collision with root package name */
        private InterfaceC1023l f10957c;

        /* renamed from: d, reason: collision with root package name */
        private g f10958d;

        /* renamed from: e, reason: collision with root package name */
        private long f10959e = -1;

        class a extends g.i {
            a() {
            }

            @Override // androidx.viewpager2.widget.g.i
            public void onPageScrollStateChanged(int i8) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.g.i
            public void onPageSelected(int i8) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        class b extends d {
            b() {
                super(null);
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.d, androidx.recyclerview.widget.RecyclerView.j
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        private g a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof g) {
                return (g) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        void b(RecyclerView recyclerView) {
            this.f10958d = a(recyclerView);
            a aVar = new a();
            this.f10955a = aVar;
            this.f10958d.registerOnPageChangeCallback(aVar);
            b bVar = new b();
            this.f10956b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            InterfaceC1023l interfaceC1023l = new InterfaceC1023l() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.InterfaceC1023l
                public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar2) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.f10957c = interfaceC1023l;
            FragmentStateAdapter.this.f10942d.addObserver(interfaceC1023l);
        }

        void c(RecyclerView recyclerView) {
            a(recyclerView).unregisterOnPageChangeCallback(this.f10955a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f10956b);
            FragmentStateAdapter.this.f10942d.removeObserver(this.f10957c);
            this.f10958d = null;
        }

        void d(boolean z8) {
            int currentItem;
            Fragment fragment;
            if (FragmentStateAdapter.this.n() || this.f10958d.getScrollState() != 0 || FragmentStateAdapter.this.f10944f.isEmpty() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.f10958d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.f10959e || z8) && (fragment = (Fragment) FragmentStateAdapter.this.f10944f.get(itemId)) != null && fragment.isAdded()) {
                this.f10959e = itemId;
                x xVarBeginTransaction = FragmentStateAdapter.this.f10943e.beginTransaction();
                Fragment fragment2 = null;
                for (int i8 = 0; i8 < FragmentStateAdapter.this.f10944f.size(); i8++) {
                    long jKeyAt = FragmentStateAdapter.this.f10944f.keyAt(i8);
                    Fragment fragment3 = (Fragment) FragmentStateAdapter.this.f10944f.valueAt(i8);
                    if (fragment3.isAdded()) {
                        if (jKeyAt != this.f10959e) {
                            xVarBeginTransaction.setMaxLifecycle(fragment3, AbstractC1019h.b.STARTED);
                        } else {
                            fragment2 = fragment3;
                        }
                        fragment3.setMenuVisibility(jKeyAt == this.f10959e);
                    }
                }
                if (fragment2 != null) {
                    xVarBeginTransaction.setMaxLifecycle(fragment2, AbstractC1019h.b.RESUMED);
                }
                if (xVarBeginTransaction.isEmpty()) {
                    return;
                }
                xVarBeginTransaction.commitNow();
            }
        }
    }

    class a implements View.OnLayoutChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FrameLayout f10964a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.viewpager2.adapter.a f10965b;

        a(FrameLayout frameLayout, androidx.viewpager2.adapter.a aVar) {
            this.f10964a = frameLayout;
            this.f10965b = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
            if (this.f10964a.getParent() != null) {
                this.f10964a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.j(this.f10965b);
            }
        }
    }

    class b extends FragmentManager.m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f10967a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout f10968b;

        b(Fragment fragment, FrameLayout frameLayout) {
            this.f10967a = fragment;
            this.f10968b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f10967a) {
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                FragmentStateAdapter.this.b(view, this.f10968b);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f10948j = false;
            fragmentStateAdapter.e();
        }
    }

    private static abstract class d extends RecyclerView.j {
        private d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i8, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeInserted(int i8, int i9) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeMoved(int i8, int i9, int i10) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeRemoved(int i8, int i9) {
            onChanged();
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void onItemRangeChanged(int i8, int i9, Object obj) {
            onChanged();
        }
    }

    public FragmentStateAdapter(ActivityC1010e activityC1010e) {
        this(activityC1010e.getSupportFragmentManager(), activityC1010e.getLifecycle());
    }

    private static String c(String str, long j8) {
        return str + j8;
    }

    private void d(int i8) {
        long itemId = getItemId(i8);
        if (this.f10944f.containsKey(itemId)) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i8);
        fragmentCreateFragment.setInitialSavedState((Fragment.m) this.f10945g.get(itemId));
        this.f10944f.put(itemId, fragmentCreateFragment);
    }

    private boolean f(long j8) {
        View view;
        if (this.f10946h.containsKey(j8)) {
            return true;
        }
        Fragment fragment = (Fragment) this.f10944f.get(j8);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean g(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long h(int i8) {
        Long lValueOf = null;
        for (int i9 = 0; i9 < this.f10946h.size(); i9++) {
            if (((Integer) this.f10946h.valueAt(i9)).intValue() == i8) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.f10946h.keyAt(i9));
            }
        }
        return lValueOf;
    }

    private static long i(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void k(long j8) {
        ViewParent parent;
        Fragment fragment = (Fragment) this.f10944f.get(j8);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j8)) {
            this.f10945g.remove(j8);
        }
        if (!fragment.isAdded()) {
            this.f10944f.remove(j8);
            return;
        }
        if (n()) {
            this.f10949k = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j8)) {
            this.f10945g.put(j8, this.f10943e.saveFragmentInstanceState(fragment));
        }
        this.f10943e.beginTransaction().remove(fragment).commitNow();
        this.f10944f.remove(j8);
    }

    private void l() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final c cVar = new c();
        this.f10942d.addObserver(new InterfaceC1023l() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.5
            @Override // androidx.lifecycle.InterfaceC1023l
            public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                if (aVar == AbstractC1019h.a.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    interfaceC1025n.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(cVar, y.MIN_BACKOFF_MILLIS);
    }

    private void m(Fragment fragment, FrameLayout frameLayout) {
        this.f10943e.registerFragmentLifecycleCallbacks(new b(fragment, frameLayout), false);
    }

    void b(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j8) {
        return j8 >= 0 && j8 < ((long) getItemCount());
    }

    public abstract Fragment createFragment(int i8);

    void e() {
        if (!this.f10949k || n()) {
            return;
        }
        O.b bVar = new O.b();
        for (int i8 = 0; i8 < this.f10944f.size(); i8++) {
            long jKeyAt = this.f10944f.keyAt(i8);
            if (!containsItem(jKeyAt)) {
                bVar.add(Long.valueOf(jKeyAt));
                this.f10946h.remove(jKeyAt);
            }
        }
        if (!this.f10948j) {
            this.f10949k = false;
            for (int i9 = 0; i9 < this.f10944f.size(); i9++) {
                long jKeyAt2 = this.f10944f.keyAt(i9);
                if (!f(jKeyAt2)) {
                    bVar.add(Long.valueOf(jKeyAt2));
                }
            }
        }
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            k(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long getItemId(int i8) {
        return i8;
    }

    void j(final androidx.viewpager2.adapter.a aVar) {
        Fragment fragment = (Fragment) this.f10944f.get(aVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutH = aVar.H();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            m(fragment, frameLayoutH);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutH) {
                b(view, frameLayoutH);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            b(view, frameLayoutH);
            return;
        }
        if (n()) {
            if (this.f10943e.isDestroyed()) {
                return;
            }
            this.f10942d.addObserver(new InterfaceC1023l() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.lifecycle.InterfaceC1023l
                public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar2) {
                    if (FragmentStateAdapter.this.n()) {
                        return;
                    }
                    interfaceC1025n.getLifecycle().removeObserver(this);
                    if (AbstractC0985p0.isAttachedToWindow(aVar.H())) {
                        FragmentStateAdapter.this.j(aVar);
                    }
                }
            });
            return;
        }
        m(fragment, frameLayoutH);
        this.f10943e.beginTransaction().add(fragment, "f" + aVar.getItemId()).setMaxLifecycle(fragment, AbstractC1019h.b.STARTED).commitNow();
        this.f10947i.d(false);
    }

    boolean n() {
        return this.f10943e.isStateSaved();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        h.checkArgument(this.f10947i == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f10947i = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f10947i.c(recyclerView);
        this.f10947i = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final boolean onFailedToRecycleView(androidx.viewpager2.adapter.a aVar) {
        return true;
    }

    @Override // androidx.viewpager2.adapter.b
    public final void restoreState(Parcelable parcelable) {
        if (!this.f10945g.isEmpty() || !this.f10944f.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (g(str, "f#")) {
                this.f10944f.put(i(str, "f#"), this.f10943e.getFragment(bundle, str));
            } else {
                if (!g(str, "s#")) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long jI = i(str, "s#");
                Fragment.m mVar = (Fragment.m) bundle.getParcelable(str);
                if (containsItem(jI)) {
                    this.f10945g.put(jI, mVar);
                }
            }
        }
        if (this.f10944f.isEmpty()) {
            return;
        }
        this.f10949k = true;
        this.f10948j = true;
        e();
        l();
    }

    @Override // androidx.viewpager2.adapter.b
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.f10944f.size() + this.f10945g.size());
        for (int i8 = 0; i8 < this.f10944f.size(); i8++) {
            long jKeyAt = this.f10944f.keyAt(i8);
            Fragment fragment = (Fragment) this.f10944f.get(jKeyAt);
            if (fragment != null && fragment.isAdded()) {
                this.f10943e.putFragment(bundle, c("f#", jKeyAt), fragment);
            }
        }
        for (int i9 = 0; i9 < this.f10945g.size(); i9++) {
            long jKeyAt2 = this.f10945g.keyAt(i9);
            if (containsItem(jKeyAt2)) {
                bundle.putParcelable(c("s#", jKeyAt2), (Parcelable) this.f10945g.get(jKeyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void setHasStableIds(boolean z8) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(androidx.viewpager2.adapter.a aVar, int i8) {
        long itemId = aVar.getItemId();
        int id = aVar.H().getId();
        Long lH = h(id);
        if (lH != null && lH.longValue() != itemId) {
            k(lH.longValue());
            this.f10946h.remove(lH.longValue());
        }
        this.f10946h.put(itemId, Integer.valueOf(id));
        d(i8);
        FrameLayout frameLayoutH = aVar.H();
        if (AbstractC0985p0.isAttachedToWindow(frameLayoutH)) {
            if (frameLayoutH.getParent() != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            frameLayoutH.addOnLayoutChangeListener(new a(frameLayoutH, aVar));
        }
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final androidx.viewpager2.adapter.a onCreateViewHolder(ViewGroup viewGroup, int i8) {
        return androidx.viewpager2.adapter.a.G(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewAttachedToWindow(androidx.viewpager2.adapter.a aVar) {
        j(aVar);
        e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onViewRecycled(androidx.viewpager2.adapter.a aVar) {
        Long lH = h(aVar.H().getId());
        if (lH != null) {
            k(lH.longValue());
            this.f10946h.remove(lH.longValue());
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, AbstractC1019h abstractC1019h) {
        this.f10944f = new e();
        this.f10945g = new e();
        this.f10946h = new e();
        this.f10948j = false;
        this.f10949k = false;
        this.f10943e = fragmentManager;
        this.f10942d = abstractC1019h;
        super.setHasStableIds(true);
    }
}
