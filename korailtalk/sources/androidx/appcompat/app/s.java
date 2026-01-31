package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.P;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.core.view.A0;
import androidx.core.view.AbstractC0985p0;
import androidx.core.view.C1001x0;
import androidx.core.view.C1005z0;
import androidx.core.view.InterfaceC1003y0;
import androidx.fragment.app.ActivityC1010e;
import androidx.fragment.app.x;
import h.AbstractC5563a;
import h.AbstractC5568f;
import h.AbstractC5572j;
import i.AbstractC5638a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l.AbstractC5876b;
import l.C5875a;

/* loaded from: classes.dex */
public class s extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* renamed from: F */
    private static final Interpolator f6462F = new AccelerateInterpolator();

    /* renamed from: G */
    private static final Interpolator f6463G = new DecelerateInterpolator();

    /* renamed from: A */
    private boolean f6464A;

    /* renamed from: B */
    boolean f6465B;

    /* renamed from: a */
    Context f6469a;

    /* renamed from: b */
    private Context f6470b;

    /* renamed from: c */
    private Activity f6471c;

    /* renamed from: d */
    ActionBarOverlayLayout f6472d;

    /* renamed from: e */
    ActionBarContainer f6473e;

    /* renamed from: f */
    P f6474f;

    /* renamed from: g */
    ActionBarContextView f6475g;

    /* renamed from: h */
    View f6476h;

    /* renamed from: i */
    j0 f6477i;

    /* renamed from: k */
    private e f6479k;

    /* renamed from: m */
    private boolean f6481m;

    /* renamed from: n */
    d f6482n;

    /* renamed from: o */
    AbstractC5876b f6483o;

    /* renamed from: p */
    AbstractC5876b.a f6484p;

    /* renamed from: q */
    private boolean f6485q;

    /* renamed from: s */
    private boolean f6487s;

    /* renamed from: v */
    boolean f6490v;

    /* renamed from: w */
    boolean f6491w;

    /* renamed from: x */
    private boolean f6492x;

    /* renamed from: z */
    l.h f6494z;

    /* renamed from: j */
    private ArrayList f6478j = new ArrayList();

    /* renamed from: l */
    private int f6480l = -1;

    /* renamed from: r */
    private ArrayList f6486r = new ArrayList();

    /* renamed from: t */
    private int f6488t = 0;

    /* renamed from: u */
    boolean f6489u = true;

    /* renamed from: y */
    private boolean f6493y = true;

    /* renamed from: C */
    final InterfaceC1003y0 f6466C = new a();

    /* renamed from: D */
    final InterfaceC1003y0 f6467D = new b();

    /* renamed from: E */
    final A0 f6468E = new c();

    class a extends C1005z0 {
        a() {
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationEnd(View view) {
            View view2;
            s sVar = s.this;
            if (sVar.f6489u && (view2 = sVar.f6476h) != null) {
                view2.setTranslationY(0.0f);
                s.this.f6473e.setTranslationY(0.0f);
            }
            s.this.f6473e.setVisibility(8);
            s.this.f6473e.setTransitioning(false);
            s sVar2 = s.this;
            sVar2.f6494z = null;
            sVar2.d();
            ActionBarOverlayLayout actionBarOverlayLayout = s.this.f6472d;
            if (actionBarOverlayLayout != null) {
                AbstractC0985p0.requestApplyInsets(actionBarOverlayLayout);
            }
        }
    }

    class b extends C1005z0 {
        b() {
        }

        @Override // androidx.core.view.C1005z0, androidx.core.view.InterfaceC1003y0
        public void onAnimationEnd(View view) {
            s sVar = s.this;
            sVar.f6494z = null;
            sVar.f6473e.requestLayout();
        }
    }

    class c implements A0 {
        c() {
        }

        @Override // androidx.core.view.A0
        public void onAnimationUpdate(View view) {
            ((View) s.this.f6473e.getParent()).invalidate();
        }
    }

    public class d extends AbstractC5876b implements e.a {

        /* renamed from: c */
        private final Context f6498c;

        /* renamed from: d */
        private final androidx.appcompat.view.menu.e f6499d;

        /* renamed from: e */
        private AbstractC5876b.a f6500e;

        /* renamed from: f */
        private WeakReference f6501f;

        public d(Context context, AbstractC5876b.a aVar) {
            this.f6498c = context;
            this.f6500e = aVar;
            androidx.appcompat.view.menu.e defaultShowAsAction = new androidx.appcompat.view.menu.e(context).setDefaultShowAsAction(1);
            this.f6499d = defaultShowAsAction;
            defaultShowAsAction.setCallback(this);
        }

        public boolean dispatchOnCreate() {
            this.f6499d.stopDispatchingItemsChanged();
            try {
                return this.f6500e.onCreateActionMode(this, this.f6499d);
            } finally {
                this.f6499d.startDispatchingItemsChanged();
            }
        }

        @Override // l.AbstractC5876b
        public void finish() {
            s sVar = s.this;
            if (sVar.f6482n != this) {
                return;
            }
            if (s.b(sVar.f6490v, sVar.f6491w, false)) {
                this.f6500e.onDestroyActionMode(this);
            } else {
                s sVar2 = s.this;
                sVar2.f6483o = this;
                sVar2.f6484p = this.f6500e;
            }
            this.f6500e = null;
            s.this.animateToMode(false);
            s.this.f6475g.closeMode();
            s.this.f6474f.getViewGroup().sendAccessibilityEvent(32);
            s sVar3 = s.this;
            sVar3.f6472d.setHideOnContentScrollEnabled(sVar3.f6465B);
            s.this.f6482n = null;
        }

        @Override // l.AbstractC5876b
        public View getCustomView() {
            WeakReference weakReference = this.f6501f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // l.AbstractC5876b
        public Menu getMenu() {
            return this.f6499d;
        }

        @Override // l.AbstractC5876b
        public MenuInflater getMenuInflater() {
            return new l.g(this.f6498c);
        }

        @Override // l.AbstractC5876b
        public CharSequence getSubtitle() {
            return s.this.f6475g.getSubtitle();
        }

        @Override // l.AbstractC5876b
        public CharSequence getTitle() {
            return s.this.f6475g.getTitle();
        }

        @Override // l.AbstractC5876b
        public void invalidate() {
            if (s.this.f6482n != this) {
                return;
            }
            this.f6499d.stopDispatchingItemsChanged();
            try {
                this.f6500e.onPrepareActionMode(this, this.f6499d);
            } finally {
                this.f6499d.startDispatchingItemsChanged();
            }
        }

        @Override // l.AbstractC5876b
        public boolean isTitleOptional() {
            return s.this.f6475g.isTitleOptional();
        }

        public void onCloseMenu(androidx.appcompat.view.menu.e eVar, boolean z8) {
        }

        public void onCloseSubMenu(androidx.appcompat.view.menu.n nVar) {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            AbstractC5876b.a aVar = this.f6500e;
            if (aVar != null) {
                return aVar.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void onMenuModeChange(androidx.appcompat.view.menu.e eVar) {
            if (this.f6500e == null) {
                return;
            }
            invalidate();
            s.this.f6475g.showOverflowMenu();
        }

        public boolean onSubMenuSelected(androidx.appcompat.view.menu.n nVar) {
            if (this.f6500e == null) {
                return false;
            }
            if (!nVar.hasVisibleItems()) {
                return true;
            }
            new androidx.appcompat.view.menu.j(s.this.getThemedContext(), nVar).show();
            return true;
        }

        @Override // l.AbstractC5876b
        public void setCustomView(View view) {
            s.this.f6475g.setCustomView(view);
            this.f6501f = new WeakReference(view);
        }

        @Override // l.AbstractC5876b
        public void setSubtitle(CharSequence charSequence) {
            s.this.f6475g.setSubtitle(charSequence);
        }

        @Override // l.AbstractC5876b
        public void setTitle(CharSequence charSequence) {
            s.this.f6475g.setTitle(charSequence);
        }

        @Override // l.AbstractC5876b
        public void setTitleOptionalHint(boolean z8) {
            super.setTitleOptionalHint(z8);
            s.this.f6475g.setTitleOptional(z8);
        }

        @Override // l.AbstractC5876b
        public void setSubtitle(int i8) {
            setSubtitle(s.this.f6469a.getResources().getString(i8));
        }

        @Override // l.AbstractC5876b
        public void setTitle(int i8) {
            setTitle(s.this.f6469a.getResources().getString(i8));
        }
    }

    public class e extends a.d {

        /* renamed from: a */
        private Object f6503a;

        /* renamed from: b */
        private Drawable f6504b;

        /* renamed from: c */
        private CharSequence f6505c;

        /* renamed from: d */
        private CharSequence f6506d;

        /* renamed from: e */
        private int f6507e = -1;

        /* renamed from: f */
        private View f6508f;

        public e() {
        }

        public a.e getCallback() {
            return null;
        }

        @Override // androidx.appcompat.app.a.d
        public CharSequence getContentDescription() {
            return this.f6506d;
        }

        @Override // androidx.appcompat.app.a.d
        public View getCustomView() {
            return this.f6508f;
        }

        @Override // androidx.appcompat.app.a.d
        public Drawable getIcon() {
            return this.f6504b;
        }

        @Override // androidx.appcompat.app.a.d
        public int getPosition() {
            return this.f6507e;
        }

        @Override // androidx.appcompat.app.a.d
        public Object getTag() {
            return this.f6503a;
        }

        @Override // androidx.appcompat.app.a.d
        public CharSequence getText() {
            return this.f6505c;
        }

        @Override // androidx.appcompat.app.a.d
        public void select() {
            s.this.selectTab(this);
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setContentDescription(int i8) {
            return setContentDescription(s.this.f6469a.getResources().getText(i8));
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setCustomView(View view) {
            this.f6508f = view;
            int i8 = this.f6507e;
            if (i8 >= 0) {
                s.this.f6477i.updateTab(i8);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setIcon(Drawable drawable) {
            this.f6504b = drawable;
            int i8 = this.f6507e;
            if (i8 >= 0) {
                s.this.f6477i.updateTab(i8);
            }
            return this;
        }

        public void setPosition(int i8) {
            this.f6507e = i8;
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setTabListener(a.e eVar) {
            return this;
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setTag(Object obj) {
            this.f6503a = obj;
            return this;
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setText(CharSequence charSequence) {
            this.f6505c = charSequence;
            int i8 = this.f6507e;
            if (i8 >= 0) {
                s.this.f6477i.updateTab(i8);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setContentDescription(CharSequence charSequence) {
            this.f6506d = charSequence;
            int i8 = this.f6507e;
            if (i8 >= 0) {
                s.this.f6477i.updateTab(i8);
            }
            return this;
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setCustomView(int i8) {
            return setCustomView(LayoutInflater.from(s.this.getThemedContext()).inflate(i8, (ViewGroup) null));
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setIcon(int i8) {
            return setIcon(AbstractC5638a.getDrawable(s.this.f6469a, i8));
        }

        @Override // androidx.appcompat.app.a.d
        public a.d setText(int i8) {
            return setText(s.this.f6469a.getResources().getText(i8));
        }
    }

    public s(Activity activity, boolean z8) {
        this.f6471c = activity;
        View decorView = activity.getWindow().getDecorView();
        i(decorView);
        if (z8) {
            return;
        }
        this.f6476h = decorView.findViewById(R.id.content);
    }

    static boolean b(boolean z8, boolean z9, boolean z10) {
        if (z10) {
            return true;
        }
        return (z8 || z9) ? false : true;
    }

    private void c() {
        if (this.f6479k != null) {
            selectTab(null);
        }
        this.f6478j.clear();
        j0 j0Var = this.f6477i;
        if (j0Var != null) {
            j0Var.removeAllTabs();
        }
        this.f6480l = -1;
    }

    private void e(a.d dVar, int i8) {
        ((e) dVar).getCallback();
        throw new IllegalStateException("Action Bar Tab must have a Callback");
    }

    private void f() {
        if (this.f6477i != null) {
            return;
        }
        j0 j0Var = new j0(this.f6469a);
        if (this.f6487s) {
            j0Var.setVisibility(0);
            this.f6474f.setEmbeddedTabView(j0Var);
        } else {
            if (getNavigationMode() == 2) {
                j0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6472d;
                if (actionBarOverlayLayout != null) {
                    AbstractC0985p0.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                j0Var.setVisibility(8);
            }
            this.f6473e.setTabContainer(j0Var);
        }
        this.f6477i = j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private P g(View view) {
        if (view instanceof P) {
            return (P) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void h() {
        if (this.f6492x) {
            this.f6492x = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f6472d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m(false);
        }
    }

    private void i(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(AbstractC5568f.decor_content_parent);
        this.f6472d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f6474f = g(view.findViewById(AbstractC5568f.action_bar));
        this.f6475g = (ActionBarContextView) view.findViewById(AbstractC5568f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(AbstractC5568f.action_bar_container);
        this.f6473e = actionBarContainer;
        P p8 = this.f6474f;
        if (p8 == null || this.f6475g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f6469a = p8.getContext();
        boolean z8 = (this.f6474f.getDisplayOptions() & 4) != 0;
        if (z8) {
            this.f6481m = true;
        }
        C5875a c5875a = C5875a.get(this.f6469a);
        setHomeButtonEnabled(c5875a.enableHomeButtonByDefault() || z8);
        j(c5875a.hasEmbeddedTabs());
        TypedArray typedArrayObtainStyledAttributes = this.f6469a.obtainStyledAttributes(null, AbstractC5572j.ActionBar, AbstractC5563a.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(AbstractC5572j.ActionBar_hideOnContentScroll, false)) {
            setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC5572j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void j(boolean z8) {
        this.f6487s = z8;
        if (z8) {
            this.f6473e.setTabContainer(null);
            this.f6474f.setEmbeddedTabView(this.f6477i);
        } else {
            this.f6474f.setEmbeddedTabView(null);
            this.f6473e.setTabContainer(this.f6477i);
        }
        boolean z9 = getNavigationMode() == 2;
        j0 j0Var = this.f6477i;
        if (j0Var != null) {
            if (z9) {
                j0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6472d;
                if (actionBarOverlayLayout != null) {
                    AbstractC0985p0.requestApplyInsets(actionBarOverlayLayout);
                }
            } else {
                j0Var.setVisibility(8);
            }
        }
        this.f6474f.setCollapsible(!this.f6487s && z9);
        this.f6472d.setHasNonEmbeddedTabs(!this.f6487s && z9);
    }

    private boolean k() {
        return AbstractC0985p0.isLaidOut(this.f6473e);
    }

    private void l() {
        if (this.f6492x) {
            return;
        }
        this.f6492x = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6472d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        m(false);
    }

    private void m(boolean z8) {
        if (b(this.f6490v, this.f6491w, this.f6492x)) {
            if (this.f6493y) {
                return;
            }
            this.f6493y = true;
            doShow(z8);
            return;
        }
        if (this.f6493y) {
            this.f6493y = false;
            doHide(z8);
        }
    }

    @Override // androidx.appcompat.app.a
    public void addOnMenuVisibilityListener(a.b bVar) {
        this.f6486r.add(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar) {
        addTab(dVar, this.f6478j.isEmpty());
    }

    public void animateToMode(boolean z8) {
        C1001x0 c1001x0;
        C1001x0 c1001x02;
        if (z8) {
            l();
        } else {
            h();
        }
        if (!k()) {
            if (z8) {
                this.f6474f.setVisibility(4);
                this.f6475g.setVisibility(0);
                return;
            } else {
                this.f6474f.setVisibility(0);
                this.f6475g.setVisibility(8);
                return;
            }
        }
        if (z8) {
            c1001x02 = this.f6474f.setupAnimatorToVisibility(4, 100L);
            c1001x0 = this.f6475g.setupAnimatorToVisibility(0, 200L);
        } else {
            c1001x0 = this.f6474f.setupAnimatorToVisibility(0, 200L);
            c1001x02 = this.f6475g.setupAnimatorToVisibility(8, 100L);
        }
        l.h hVar = new l.h();
        hVar.playSequentially(c1001x02, c1001x0);
        hVar.start();
    }

    @Override // androidx.appcompat.app.a
    public boolean collapseActionView() {
        P p8 = this.f6474f;
        if (p8 == null || !p8.hasExpandedActionView()) {
            return false;
        }
        this.f6474f.collapseActionView();
        return true;
    }

    void d() {
        AbstractC5876b.a aVar = this.f6484p;
        if (aVar != null) {
            aVar.onDestroyActionMode(this.f6483o);
            this.f6483o = null;
            this.f6484p = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public void dispatchMenuVisibilityChanged(boolean z8) {
        if (z8 == this.f6485q) {
            return;
        }
        this.f6485q = z8;
        if (this.f6486r.size() <= 0) {
            return;
        }
        android.support.v4.media.session.f.a(this.f6486r.get(0));
        throw null;
    }

    public void doHide(boolean z8) {
        View view;
        l.h hVar = this.f6494z;
        if (hVar != null) {
            hVar.cancel();
        }
        if (this.f6488t != 0 || (!this.f6464A && !z8)) {
            this.f6466C.onAnimationEnd(null);
            return;
        }
        this.f6473e.setAlpha(1.0f);
        this.f6473e.setTransitioning(true);
        l.h hVar2 = new l.h();
        float f8 = -this.f6473e.getHeight();
        if (z8) {
            this.f6473e.getLocationInWindow(new int[]{0, 0});
            f8 -= r5[1];
        }
        C1001x0 c1001x0TranslationY = AbstractC0985p0.animate(this.f6473e).translationY(f8);
        c1001x0TranslationY.setUpdateListener(this.f6468E);
        hVar2.play(c1001x0TranslationY);
        if (this.f6489u && (view = this.f6476h) != null) {
            hVar2.play(AbstractC0985p0.animate(view).translationY(f8));
        }
        hVar2.setInterpolator(f6462F);
        hVar2.setDuration(250L);
        hVar2.setListener(this.f6466C);
        this.f6494z = hVar2;
        hVar2.start();
    }

    public void doShow(boolean z8) {
        View view;
        View view2;
        l.h hVar = this.f6494z;
        if (hVar != null) {
            hVar.cancel();
        }
        this.f6473e.setVisibility(0);
        if (this.f6488t == 0 && (this.f6464A || z8)) {
            this.f6473e.setTranslationY(0.0f);
            float f8 = -this.f6473e.getHeight();
            if (z8) {
                this.f6473e.getLocationInWindow(new int[]{0, 0});
                f8 -= r5[1];
            }
            this.f6473e.setTranslationY(f8);
            l.h hVar2 = new l.h();
            C1001x0 c1001x0TranslationY = AbstractC0985p0.animate(this.f6473e).translationY(0.0f);
            c1001x0TranslationY.setUpdateListener(this.f6468E);
            hVar2.play(c1001x0TranslationY);
            if (this.f6489u && (view2 = this.f6476h) != null) {
                view2.setTranslationY(f8);
                hVar2.play(AbstractC0985p0.animate(this.f6476h).translationY(0.0f));
            }
            hVar2.setInterpolator(f6463G);
            hVar2.setDuration(250L);
            hVar2.setListener(this.f6467D);
            this.f6494z = hVar2;
            hVar2.start();
        } else {
            this.f6473e.setAlpha(1.0f);
            this.f6473e.setTranslationY(0.0f);
            if (this.f6489u && (view = this.f6476h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f6467D.onAnimationEnd(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f6472d;
        if (actionBarOverlayLayout != null) {
            AbstractC0985p0.requestApplyInsets(actionBarOverlayLayout);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void enableContentAnimations(boolean z8) {
        this.f6489u = z8;
    }

    @Override // androidx.appcompat.app.a
    public View getCustomView() {
        return this.f6474f.getCustomView();
    }

    @Override // androidx.appcompat.app.a
    public int getDisplayOptions() {
        return this.f6474f.getDisplayOptions();
    }

    @Override // androidx.appcompat.app.a
    public float getElevation() {
        return AbstractC0985p0.getElevation(this.f6473e);
    }

    @Override // androidx.appcompat.app.a
    public int getHeight() {
        return this.f6473e.getHeight();
    }

    @Override // androidx.appcompat.app.a
    public int getHideOffset() {
        return this.f6472d.getActionBarHideOffset();
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationItemCount() {
        int navigationMode = this.f6474f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f6474f.getDropdownItemCount();
        }
        if (navigationMode != 2) {
            return 0;
        }
        return this.f6478j.size();
    }

    @Override // androidx.appcompat.app.a
    public int getNavigationMode() {
        return this.f6474f.getNavigationMode();
    }

    @Override // androidx.appcompat.app.a
    public int getSelectedNavigationIndex() {
        e eVar;
        int navigationMode = this.f6474f.getNavigationMode();
        if (navigationMode == 1) {
            return this.f6474f.getDropdownSelectedPosition();
        }
        if (navigationMode == 2 && (eVar = this.f6479k) != null) {
            return eVar.getPosition();
        }
        return -1;
    }

    @Override // androidx.appcompat.app.a
    public a.d getSelectedTab() {
        return this.f6479k;
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getSubtitle() {
        return this.f6474f.getSubtitle();
    }

    @Override // androidx.appcompat.app.a
    public a.d getTabAt(int i8) {
        return (a.d) this.f6478j.get(i8);
    }

    @Override // androidx.appcompat.app.a
    public int getTabCount() {
        return this.f6478j.size();
    }

    @Override // androidx.appcompat.app.a
    public Context getThemedContext() {
        if (this.f6470b == null) {
            TypedValue typedValue = new TypedValue();
            this.f6469a.getTheme().resolveAttribute(AbstractC5563a.actionBarWidgetTheme, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.f6470b = new ContextThemeWrapper(this.f6469a, i8);
            } else {
                this.f6470b = this.f6469a;
            }
        }
        return this.f6470b;
    }

    @Override // androidx.appcompat.app.a
    public CharSequence getTitle() {
        return this.f6474f.getTitle();
    }

    public boolean hasIcon() {
        return this.f6474f.hasIcon();
    }

    public boolean hasLogo() {
        return this.f6474f.hasLogo();
    }

    @Override // androidx.appcompat.app.a
    public void hide() {
        if (this.f6490v) {
            return;
        }
        this.f6490v = true;
        m(false);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void hideForSystem() {
        if (this.f6491w) {
            return;
        }
        this.f6491w = true;
        m(true);
    }

    @Override // androidx.appcompat.app.a
    public boolean isHideOnContentScrollEnabled() {
        return this.f6472d.isHideOnContentScrollEnabled();
    }

    @Override // androidx.appcompat.app.a
    public boolean isShowing() {
        int height = getHeight();
        return this.f6493y && (height == 0 || getHideOffset() < height);
    }

    @Override // androidx.appcompat.app.a
    public boolean isTitleTruncated() {
        P p8 = this.f6474f;
        return p8 != null && p8.isTitleTruncated();
    }

    @Override // androidx.appcompat.app.a
    public a.d newTab() {
        return new e();
    }

    @Override // androidx.appcompat.app.a
    public void onConfigurationChanged(Configuration configuration) {
        j(C5875a.get(this.f6469a).hasEmbeddedTabs());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onContentScrollStarted() {
        l.h hVar = this.f6494z;
        if (hVar != null) {
            hVar.cancel();
            this.f6494z = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onContentScrollStopped() {
    }

    @Override // androidx.appcompat.app.a
    public boolean onKeyShortcut(int i8, KeyEvent keyEvent) {
        Menu menu;
        d dVar = this.f6482n;
        if (dVar == null || (menu = dVar.getMenu()) == null) {
            return false;
        }
        menu.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menu.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i8) {
        this.f6488t = i8;
    }

    @Override // androidx.appcompat.app.a
    public void removeAllTabs() {
        c();
    }

    @Override // androidx.appcompat.app.a
    public void removeOnMenuVisibilityListener(a.b bVar) {
        this.f6486r.remove(bVar);
    }

    @Override // androidx.appcompat.app.a
    public void removeTab(a.d dVar) {
        removeTabAt(dVar.getPosition());
    }

    @Override // androidx.appcompat.app.a
    public void removeTabAt(int i8) {
        if (this.f6477i == null) {
            return;
        }
        e eVar = this.f6479k;
        int position = eVar != null ? eVar.getPosition() : this.f6480l;
        this.f6477i.removeTabAt(i8);
        e eVar2 = (e) this.f6478j.remove(i8);
        if (eVar2 != null) {
            eVar2.setPosition(-1);
        }
        int size = this.f6478j.size();
        for (int i9 = i8; i9 < size; i9++) {
            ((e) this.f6478j.get(i9)).setPosition(i9);
        }
        if (position == i8) {
            selectTab(this.f6478j.isEmpty() ? null : (e) this.f6478j.get(Math.max(0, i8 - 1)));
        }
    }

    public boolean requestFocus() {
        ViewGroup viewGroup = this.f6474f.getViewGroup();
        if (viewGroup == null || viewGroup.hasFocus()) {
            return false;
        }
        viewGroup.requestFocus();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void selectTab(a.d dVar) {
        if (getNavigationMode() != 2) {
            this.f6480l = dVar != null ? dVar.getPosition() : -1;
            return;
        }
        x xVarDisallowAddToBackStack = (!(this.f6471c instanceof ActivityC1010e) || this.f6474f.getViewGroup().isInEditMode()) ? null : ((ActivityC1010e) this.f6471c).getSupportFragmentManager().beginTransaction().disallowAddToBackStack();
        e eVar = this.f6479k;
        if (eVar != dVar) {
            this.f6477i.setTabSelected(dVar != null ? dVar.getPosition() : -1);
            e eVar2 = this.f6479k;
            if (eVar2 != null) {
                eVar2.getCallback();
                throw null;
            }
            e eVar3 = (e) dVar;
            this.f6479k = eVar3;
            if (eVar3 != null) {
                eVar3.getCallback();
                throw null;
            }
        } else if (eVar != null) {
            eVar.getCallback();
            throw null;
        }
        if (xVarDisallowAddToBackStack == null || xVarDisallowAddToBackStack.isEmpty()) {
            return;
        }
        xVarDisallowAddToBackStack.commit();
    }

    @Override // androidx.appcompat.app.a
    public void setBackgroundDrawable(Drawable drawable) {
        this.f6473e.setPrimaryBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(int i8) {
        setCustomView(LayoutInflater.from(getThemedContext()).inflate(i8, this.f6474f.getViewGroup(), false));
    }

    @Override // androidx.appcompat.app.a
    public void setDefaultDisplayHomeAsUpEnabled(boolean z8) {
        if (this.f6481m) {
            return;
        }
        setDisplayHomeAsUpEnabled(z8);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayHomeAsUpEnabled(boolean z8) {
        setDisplayOptions(z8 ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i8) {
        if ((i8 & 4) != 0) {
            this.f6481m = true;
        }
        this.f6474f.setDisplayOptions(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowCustomEnabled(boolean z8) {
        setDisplayOptions(z8 ? 16 : 0, 16);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowHomeEnabled(boolean z8) {
        setDisplayOptions(z8 ? 2 : 0, 2);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayShowTitleEnabled(boolean z8) {
        setDisplayOptions(z8 ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayUseLogoEnabled(boolean z8) {
        setDisplayOptions(z8 ? 1 : 0, 1);
    }

    @Override // androidx.appcompat.app.a
    public void setElevation(float f8) {
        AbstractC0985p0.setElevation(this.f6473e, f8);
    }

    @Override // androidx.appcompat.app.a
    public void setHideOffset(int i8) {
        if (i8 != 0 && !this.f6472d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to set a non-zero hide offset");
        }
        this.f6472d.setActionBarHideOffset(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 && !this.f6472d.isInOverlayMode()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f6465B = z8;
        this.f6472d.setHideOnContentScrollEnabled(z8);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(CharSequence charSequence) {
        this.f6474f.setNavigationContentDescription(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(Drawable drawable) {
        this.f6474f.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeButtonEnabled(boolean z8) {
        this.f6474f.setHomeButtonEnabled(z8);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(int i8) {
        this.f6474f.setIcon(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setListNavigationCallbacks(SpinnerAdapter spinnerAdapter, a.c cVar) {
        this.f6474f.setDropdownParams(spinnerAdapter, new n(cVar));
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(int i8) {
        this.f6474f.setLogo(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setNavigationMode(int i8) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        int navigationMode = this.f6474f.getNavigationMode();
        if (navigationMode == 2) {
            this.f6480l = getSelectedNavigationIndex();
            selectTab(null);
            this.f6477i.setVisibility(8);
        }
        if (navigationMode != i8 && !this.f6487s && (actionBarOverlayLayout = this.f6472d) != null) {
            AbstractC0985p0.requestApplyInsets(actionBarOverlayLayout);
        }
        this.f6474f.setNavigationMode(i8);
        boolean z8 = false;
        if (i8 == 2) {
            f();
            this.f6477i.setVisibility(0);
            int i9 = this.f6480l;
            if (i9 != -1) {
                setSelectedNavigationItem(i9);
                this.f6480l = -1;
            }
        }
        this.f6474f.setCollapsible(i8 == 2 && !this.f6487s);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6472d;
        if (i8 == 2 && !this.f6487s) {
            z8 = true;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z8);
    }

    @Override // androidx.appcompat.app.a
    public void setSelectedNavigationItem(int i8) {
        int navigationMode = this.f6474f.getNavigationMode();
        if (navigationMode == 1) {
            this.f6474f.setDropdownSelectedPosition(i8);
        } else {
            if (navigationMode != 2) {
                throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
            }
            selectTab((a.d) this.f6478j.get(i8));
        }
    }

    @Override // androidx.appcompat.app.a
    public void setShowHideAnimationEnabled(boolean z8) {
        l.h hVar;
        this.f6464A = z8;
        if (z8 || (hVar = this.f6494z) == null) {
            return;
        }
        hVar.cancel();
    }

    @Override // androidx.appcompat.app.a
    public void setSplitBackgroundDrawable(Drawable drawable) {
    }

    @Override // androidx.appcompat.app.a
    public void setStackedBackgroundDrawable(Drawable drawable) {
        this.f6473e.setStackedBackground(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(int i8) {
        setSubtitle(this.f6469a.getString(i8));
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(int i8) {
        setTitle(this.f6469a.getString(i8));
    }

    @Override // androidx.appcompat.app.a
    public void setWindowTitle(CharSequence charSequence) {
        this.f6474f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void show() {
        if (this.f6490v) {
            this.f6490v = false;
            m(false);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void showForSystem() {
        if (this.f6491w) {
            this.f6491w = false;
            m(true);
        }
    }

    @Override // androidx.appcompat.app.a
    public AbstractC5876b startActionMode(AbstractC5876b.a aVar) {
        d dVar = this.f6482n;
        if (dVar != null) {
            dVar.finish();
        }
        this.f6472d.setHideOnContentScrollEnabled(false);
        this.f6475g.killMode();
        d dVar2 = new d(this.f6475g.getContext(), aVar);
        if (!dVar2.dispatchOnCreate()) {
            return null;
        }
        this.f6482n = dVar2;
        dVar2.invalidate();
        this.f6475g.initForMode(dVar2);
        animateToMode(true);
        this.f6475g.sendAccessibilityEvent(32);
        return dVar2;
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar, int i8) {
        addTab(dVar, i8, this.f6478j.isEmpty());
    }

    @Override // androidx.appcompat.app.a
    public void setHomeActionContentDescription(int i8) {
        this.f6474f.setNavigationContentDescription(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setHomeAsUpIndicator(int i8) {
        this.f6474f.setNavigationIcon(i8);
    }

    @Override // androidx.appcompat.app.a
    public void setIcon(Drawable drawable) {
        this.f6474f.setIcon(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setLogo(Drawable drawable) {
        this.f6474f.setLogo(drawable);
    }

    @Override // androidx.appcompat.app.a
    public void setSubtitle(CharSequence charSequence) {
        this.f6474f.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void setTitle(CharSequence charSequence) {
        this.f6474f.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar, boolean z8) {
        f();
        this.f6477i.addTab(dVar, z8);
        e(dVar, this.f6478j.size());
        if (z8) {
            selectTab(dVar);
        }
    }

    @Override // androidx.appcompat.app.a
    public void setDisplayOptions(int i8, int i9) {
        int displayOptions = this.f6474f.getDisplayOptions();
        if ((i9 & 4) != 0) {
            this.f6481m = true;
        }
        this.f6474f.setDisplayOptions((i8 & i9) | ((~i9) & displayOptions));
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view) {
        this.f6474f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.a
    public void setCustomView(View view, a.C0110a c0110a) {
        view.setLayoutParams(c0110a);
        this.f6474f.setCustomView(view);
    }

    @Override // androidx.appcompat.app.a
    public void addTab(a.d dVar, int i8, boolean z8) {
        f();
        this.f6477i.addTab(dVar, i8, z8);
        e(dVar, i8);
        if (z8) {
            selectTab(dVar);
        }
    }

    public s(Dialog dialog) {
        i(dialog.getWindow().getDecorView());
    }

    public s(View view) {
        i(view);
    }
}
