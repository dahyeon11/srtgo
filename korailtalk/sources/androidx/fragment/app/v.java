package androidx.fragment.app;

import Q7.X;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.AbstractC0985p0;
import androidx.fragment.app.D;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.N;

/* loaded from: classes.dex */
class v {

    /* renamed from: a */
    private final l f9779a;

    /* renamed from: b */
    private final w f9780b;

    /* renamed from: c */
    private final Fragment f9781c;

    /* renamed from: d */
    private boolean f9782d = false;

    /* renamed from: e */
    private int f9783e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f9784a;

        a(View view) {
            this.f9784a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f9784a.removeOnAttachStateChangeListener(this);
            AbstractC0985p0.requestApplyInsets(this.f9784a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f9786a;

        static {
            int[] iArr = new int[AbstractC1019h.b.values().length];
            f9786a = iArr;
            try {
                iArr[AbstractC1019h.b.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9786a[AbstractC1019h.b.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9786a[AbstractC1019h.b.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9786a[AbstractC1019h.b.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    v(l lVar, w wVar, Fragment fragment) {
        this.f9779a = lVar;
        this.f9780b = wVar;
        this.f9781c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f9781c.f9464H) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f9781c.f9464H) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f9781c.V(bundle);
        this.f9779a.j(this.f9781c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f9781c.f9464H != null) {
            t();
        }
        if (this.f9781c.f9485c != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f9781c.f9485c);
        }
        if (this.f9781c.f9486d != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f9781c.f9486d);
        }
        if (!this.f9781c.f9466J) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f9781c.f9466J);
        }
        return bundle;
    }

    void a() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ACTIVITY_CREATED: ");
            sb.append(this.f9781c);
        }
        Fragment fragment = this.f9781c;
        fragment.B(fragment.f9484b);
        l lVar = this.f9779a;
        Fragment fragment2 = this.f9781c;
        lVar.a(fragment2, fragment2.f9484b, false);
    }

    void b() {
        int iJ = this.f9780b.j(this.f9781c);
        Fragment fragment = this.f9781c;
        fragment.f9463G.addView(fragment.f9464H, iJ);
    }

    void c() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto ATTACHED: ");
            sb.append(this.f9781c);
        }
        Fragment fragment = this.f9781c;
        Fragment fragment2 = fragment.f9490h;
        v vVarN = null;
        if (fragment2 != null) {
            v vVarN2 = this.f9780b.n(fragment2.f9488f);
            if (vVarN2 == null) {
                throw new IllegalStateException("Fragment " + this.f9781c + " declared target fragment " + this.f9781c.f9490h + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f9781c;
            fragment3.f9491i = fragment3.f9490h.f9488f;
            fragment3.f9490h = null;
            vVarN = vVarN2;
        } else {
            String str = fragment.f9491i;
            if (str != null && (vVarN = this.f9780b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f9781c + " declared target fragment " + this.f9781c.f9491i + " that does not belong to this FragmentManager!");
            }
        }
        if (vVarN != null && (FragmentManager.f9557P || vVarN.k().f9483a < 1)) {
            vVarN.m();
        }
        Fragment fragment4 = this.f9781c;
        fragment4.f9502t = fragment4.f9501s.n0();
        Fragment fragment5 = this.f9781c;
        fragment5.f9504v = fragment5.f9501s.q0();
        this.f9779a.g(this.f9781c, false);
        this.f9781c.C();
        this.f9779a.b(this.f9781c, false);
    }

    int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f9781c;
        if (fragment2.f9501s == null) {
            return fragment2.f9483a;
        }
        int iMin = this.f9783e;
        int i8 = b.f9786a[fragment2.f9474R.ordinal()];
        if (i8 != 1) {
            iMin = i8 != 2 ? i8 != 3 ? i8 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f9781c;
        if (fragment3.f9496n) {
            if (fragment3.f9497o) {
                iMin = Math.max(this.f9783e, 2);
                View view = this.f9781c.f9464H;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f9783e < 4 ? Math.min(iMin, fragment3.f9483a) : Math.min(iMin, 1);
            }
        }
        if (!this.f9781c.f9494l) {
            iMin = Math.min(iMin, 1);
        }
        D.e.b bVarL = (!FragmentManager.f9557P || (viewGroup = (fragment = this.f9781c).f9463G) == null) ? null : D.m(viewGroup, fragment.getParentFragmentManager()).l(this);
        if (bVarL == D.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == D.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f9781c;
            if (fragment4.f9495m) {
                iMin = fragment4.x() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f9781c;
        if (fragment5.f9465I && fragment5.f9483a < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("computeExpectedState() of ");
            sb.append(iMin);
            sb.append(" for ");
            sb.append(this.f9781c);
        }
        return iMin;
    }

    void e() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATED: ");
            sb.append(this.f9781c);
        }
        Fragment fragment = this.f9781c;
        if (fragment.f9473Q) {
            fragment.b0(fragment.f9484b);
            this.f9781c.f9483a = 1;
            return;
        }
        this.f9779a.h(fragment, fragment.f9484b, false);
        Fragment fragment2 = this.f9781c;
        fragment2.F(fragment2.f9484b);
        l lVar = this.f9779a;
        Fragment fragment3 = this.f9781c;
        lVar.c(fragment3, fragment3.f9484b, false);
    }

    void f() {
        String resourceName;
        if (this.f9781c.f9496n) {
            return;
        }
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto CREATE_VIEW: ");
            sb.append(this.f9781c);
        }
        Fragment fragment = this.f9781c;
        LayoutInflater layoutInflaterL = fragment.L(fragment.f9484b);
        Fragment fragment2 = this.f9781c;
        ViewGroup viewGroup = fragment2.f9463G;
        if (viewGroup == null) {
            int i8 = fragment2.f9506x;
            if (i8 == 0) {
                viewGroup = null;
            } else {
                if (i8 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f9781c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.f9501s.k0().onFindViewById(this.f9781c.f9506x);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f9781c;
                    if (!fragment3.f9498p) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f9781c.f9506x);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f9781c.f9506x) + " (" + resourceName + ") for fragment " + this.f9781c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f9781c;
        fragment4.f9463G = viewGroup;
        fragment4.H(layoutInflaterL, viewGroup, fragment4.f9484b);
        View view = this.f9781c.f9464H;
        if (view != null) {
            boolean z8 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f9781c;
            fragment5.f9464H.setTag(f0.b.fragment_container_view_tag, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f9781c;
            if (fragment6.f9508z) {
                fragment6.f9464H.setVisibility(8);
            }
            if (AbstractC0985p0.isAttachedToWindow(this.f9781c.f9464H)) {
                AbstractC0985p0.requestApplyInsets(this.f9781c.f9464H);
            } else {
                View view2 = this.f9781c.f9464H;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f9781c.Y();
            l lVar = this.f9779a;
            Fragment fragment7 = this.f9781c;
            lVar.m(fragment7, fragment7.f9464H, fragment7.f9484b, false);
            int visibility = this.f9781c.f9464H.getVisibility();
            float alpha = this.f9781c.f9464H.getAlpha();
            if (FragmentManager.f9557P) {
                this.f9781c.m0(alpha);
                Fragment fragment8 = this.f9781c;
                if (fragment8.f9463G != null && visibility == 0) {
                    View viewFindFocus = fragment8.f9464H.findFocus();
                    if (viewFindFocus != null) {
                        this.f9781c.h0(viewFindFocus);
                        if (FragmentManager.x0(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("requestFocus: Saved focused view ");
                            sb2.append(viewFindFocus);
                            sb2.append(" for Fragment ");
                            sb2.append(this.f9781c);
                        }
                    }
                    this.f9781c.f9464H.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f9781c;
                if (visibility == 0 && fragment9.f9463G != null) {
                    z8 = true;
                }
                fragment9.f9469M = z8;
            }
        }
        this.f9781c.f9483a = 2;
    }

    void g() {
        Fragment fragmentF;
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATED: ");
            sb.append(this.f9781c);
        }
        Fragment fragment = this.f9781c;
        boolean zIsChangingConfigurations = true;
        boolean z8 = fragment.f9495m && !fragment.x();
        if (!z8 && !this.f9780b.p().r(this.f9781c)) {
            String str = this.f9781c.f9491i;
            if (str != null && (fragmentF = this.f9780b.f(str)) != null && fragmentF.f9458B) {
                this.f9781c.f9490h = fragmentF;
            }
            this.f9781c.f9483a = 0;
            return;
        }
        j jVar = this.f9781c.f9502t;
        if (jVar instanceof N) {
            zIsChangingConfigurations = this.f9780b.p().n();
        } else if (jVar.b() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) jVar.b()).isChangingConfigurations();
        }
        if (z8 || zIsChangingConfigurations) {
            this.f9780b.p().g(this.f9781c);
        }
        this.f9781c.I();
        this.f9779a.d(this.f9781c, false);
        for (v vVar : this.f9780b.l()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                if (this.f9781c.f9488f.equals(fragmentK.f9491i)) {
                    fragmentK.f9490h = this.f9781c;
                    fragmentK.f9491i = null;
                }
            }
        }
        Fragment fragment2 = this.f9781c;
        String str2 = fragment2.f9491i;
        if (str2 != null) {
            fragment2.f9490h = this.f9780b.f(str2);
        }
        this.f9780b.r(this);
    }

    void h() {
        View view;
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom CREATE_VIEW: ");
            sb.append(this.f9781c);
        }
        Fragment fragment = this.f9781c;
        ViewGroup viewGroup = fragment.f9463G;
        if (viewGroup != null && (view = fragment.f9464H) != null) {
            viewGroup.removeView(view);
        }
        this.f9781c.J();
        this.f9779a.n(this.f9781c, false);
        Fragment fragment2 = this.f9781c;
        fragment2.f9463G = null;
        fragment2.f9464H = null;
        fragment2.f9476T = null;
        fragment2.f9477U.setValue(null);
        this.f9781c.f9497o = false;
    }

    void i() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom ATTACHED: ");
            sb.append(this.f9781c);
        }
        this.f9781c.K();
        this.f9779a.e(this.f9781c, false);
        Fragment fragment = this.f9781c;
        fragment.f9483a = -1;
        fragment.f9502t = null;
        fragment.f9504v = null;
        fragment.f9501s = null;
        if ((!fragment.f9495m || fragment.x()) && !this.f9780b.p().r(this.f9781c)) {
            return;
        }
        if (FragmentManager.x0(3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("initState called for fragment: ");
            sb2.append(this.f9781c);
        }
        this.f9781c.v();
    }

    void j() {
        Fragment fragment = this.f9781c;
        if (fragment.f9496n && fragment.f9497o && !fragment.f9499q) {
            if (FragmentManager.x0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("moveto CREATE_VIEW: ");
                sb.append(this.f9781c);
            }
            Fragment fragment2 = this.f9781c;
            fragment2.H(fragment2.L(fragment2.f9484b), null, this.f9781c.f9484b);
            View view = this.f9781c.f9464H;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f9781c;
                fragment3.f9464H.setTag(f0.b.fragment_container_view_tag, fragment3);
                Fragment fragment4 = this.f9781c;
                if (fragment4.f9508z) {
                    fragment4.f9464H.setVisibility(8);
                }
                this.f9781c.Y();
                l lVar = this.f9779a;
                Fragment fragment5 = this.f9781c;
                lVar.m(fragment5, fragment5.f9464H, fragment5.f9484b, false);
                this.f9781c.f9483a = 2;
            }
        }
    }

    Fragment k() {
        return this.f9781c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f9782d) {
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring re-entrant call to moveToExpectedState() for ");
                sb.append(k());
                return;
            }
            return;
        }
        try {
            this.f9782d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.f9781c;
                int i8 = fragment.f9483a;
                if (iD == i8) {
                    if (FragmentManager.f9557P && fragment.f9470N) {
                        if (fragment.f9464H != null && (viewGroup = fragment.f9463G) != null) {
                            D dM = D.m(viewGroup, fragment.getParentFragmentManager());
                            if (this.f9781c.f9508z) {
                                dM.c(this);
                            } else {
                                dM.e(this);
                            }
                        }
                        Fragment fragment2 = this.f9781c;
                        FragmentManager fragmentManager = fragment2.f9501s;
                        if (fragmentManager != null) {
                            fragmentManager.w0(fragment2);
                        }
                        Fragment fragment3 = this.f9781c;
                        fragment3.f9470N = false;
                        fragment3.onHiddenChanged(fragment3.f9508z);
                    }
                    this.f9782d = false;
                    return;
                }
                if (iD <= i8) {
                    switch (i8 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f9781c.f9483a = 1;
                            break;
                        case 2:
                            fragment.f9497o = false;
                            fragment.f9483a = 2;
                            break;
                        case 3:
                            if (FragmentManager.x0(3)) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("movefrom ACTIVITY_CREATED: ");
                                sb2.append(this.f9781c);
                            }
                            Fragment fragment4 = this.f9781c;
                            if (fragment4.f9464H != null && fragment4.f9485c == null) {
                                t();
                            }
                            Fragment fragment5 = this.f9781c;
                            if (fragment5.f9464H != null && (viewGroup3 = fragment5.f9463G) != null) {
                                D.m(viewGroup3, fragment5.getParentFragmentManager()).d(this);
                            }
                            this.f9781c.f9483a = 3;
                            break;
                        case 4:
                            w();
                            break;
                        case 5:
                            fragment.f9483a = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i8 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.f9464H != null && (viewGroup2 = fragment.f9463G) != null) {
                                D.m(viewGroup2, fragment.getParentFragmentManager()).b(D.e.c.b(this.f9781c.f9464H.getVisibility()), this);
                            }
                            this.f9781c.f9483a = 4;
                            break;
                        case 5:
                            v();
                            break;
                        case 6:
                            fragment.f9483a = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f9782d = false;
            throw th;
        }
    }

    void n() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom RESUMED: ");
            sb.append(this.f9781c);
        }
        this.f9781c.Q();
        this.f9779a.f(this.f9781c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f9781c.f9484b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f9781c;
        fragment.f9485c = fragment.f9484b.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f9781c;
        fragment2.f9486d = fragment2.f9484b.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f9781c;
        fragment3.f9491i = fragment3.f9484b.getString("android:target_state");
        Fragment fragment4 = this.f9781c;
        if (fragment4.f9491i != null) {
            fragment4.f9492j = fragment4.f9484b.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f9781c;
        Boolean bool = fragment5.f9487e;
        if (bool != null) {
            fragment5.f9466J = bool.booleanValue();
            this.f9781c.f9487e = null;
        } else {
            fragment5.f9466J = fragment5.f9484b.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f9781c;
        if (fragment6.f9466J) {
            return;
        }
        fragment6.f9465I = true;
    }

    void p() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESUMED: ");
            sb.append(this.f9781c);
        }
        View viewL = this.f9781c.l();
        if (viewL != null && l(viewL)) {
            boolean zRequestFocus = viewL.requestFocus();
            if (FragmentManager.x0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(viewL);
                sb2.append(X.SPACE);
                sb2.append(zRequestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f9781c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f9781c.f9464H.findFocus());
            }
        }
        this.f9781c.h0(null);
        this.f9781c.U();
        this.f9779a.i(this.f9781c, false);
        Fragment fragment = this.f9781c;
        fragment.f9484b = null;
        fragment.f9485c = null;
        fragment.f9486d = null;
    }

    Fragment.m r() {
        Bundle bundleQ;
        if (this.f9781c.f9483a <= -1 || (bundleQ = q()) == null) {
            return null;
        }
        return new Fragment.m(bundleQ);
    }

    u s() {
        u uVar = new u(this.f9781c);
        Fragment fragment = this.f9781c;
        if (fragment.f9483a <= -1 || uVar.f9778m != null) {
            uVar.f9778m = fragment.f9484b;
        } else {
            Bundle bundleQ = q();
            uVar.f9778m = bundleQ;
            if (this.f9781c.f9491i != null) {
                if (bundleQ == null) {
                    uVar.f9778m = new Bundle();
                }
                uVar.f9778m.putString("android:target_state", this.f9781c.f9491i);
                int i8 = this.f9781c.f9492j;
                if (i8 != 0) {
                    uVar.f9778m.putInt("android:target_req_state", i8);
                }
            }
        }
        return uVar;
    }

    void t() {
        if (this.f9781c.f9464H == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f9781c.f9464H.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f9781c.f9485c = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f9781c.f9476T.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f9781c.f9486d = bundle;
    }

    void u(int i8) {
        this.f9783e = i8;
    }

    void v() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto STARTED: ");
            sb.append(this.f9781c);
        }
        this.f9781c.W();
        this.f9779a.k(this.f9781c, false);
    }

    void w() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("movefrom STARTED: ");
            sb.append(this.f9781c);
        }
        this.f9781c.X();
        this.f9779a.l(this.f9781c, false);
    }

    v(l lVar, w wVar, ClassLoader classLoader, i iVar, u uVar) {
        this.f9779a = lVar;
        this.f9780b = wVar;
        Fragment fragmentInstantiate = iVar.instantiate(classLoader, uVar.f9766a);
        this.f9781c = fragmentInstantiate;
        Bundle bundle = uVar.f9775j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentInstantiate.setArguments(uVar.f9775j);
        fragmentInstantiate.f9488f = uVar.f9767b;
        fragmentInstantiate.f9496n = uVar.f9768c;
        fragmentInstantiate.f9498p = true;
        fragmentInstantiate.f9505w = uVar.f9769d;
        fragmentInstantiate.f9506x = uVar.f9770e;
        fragmentInstantiate.f9507y = uVar.f9771f;
        fragmentInstantiate.f9458B = uVar.f9772g;
        fragmentInstantiate.f9495m = uVar.f9773h;
        fragmentInstantiate.f9457A = uVar.f9774i;
        fragmentInstantiate.f9508z = uVar.f9776k;
        fragmentInstantiate.f9474R = AbstractC1019h.b.values()[uVar.f9777l];
        Bundle bundle2 = uVar.f9778m;
        if (bundle2 != null) {
            fragmentInstantiate.f9484b = bundle2;
        } else {
            fragmentInstantiate.f9484b = new Bundle();
        }
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Instantiated fragment ");
            sb.append(fragmentInstantiate);
        }
    }

    v(l lVar, w wVar, Fragment fragment, u uVar) {
        this.f9779a = lVar;
        this.f9780b = wVar;
        this.f9781c = fragment;
        fragment.f9485c = null;
        fragment.f9486d = null;
        fragment.f9500r = 0;
        fragment.f9497o = false;
        fragment.f9494l = false;
        Fragment fragment2 = fragment.f9490h;
        fragment.f9491i = fragment2 != null ? fragment2.f9488f : null;
        fragment.f9490h = null;
        Bundle bundle = uVar.f9778m;
        if (bundle != null) {
            fragment.f9484b = bundle;
        } else {
            fragment.f9484b = new Bundle();
        }
    }
}
