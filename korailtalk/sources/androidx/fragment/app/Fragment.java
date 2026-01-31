package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.AbstractC0920d;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.C1026o;
import androidx.lifecycle.InterfaceC1018g;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.K;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import f.InterfaceC5379b;
import f.InterfaceC5380c;
import g.AbstractC5530a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import k0.AbstractC5837a;
import p.InterfaceC6046a;
import y0.AbstractC6513e;
import y0.C6511c;
import y0.InterfaceC6512d;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1025n, N, InterfaceC1018g, InterfaceC6512d, InterfaceC5380c {

    /* renamed from: a0 */
    static final Object f9456a0 = new Object();

    /* renamed from: A */
    boolean f9457A;

    /* renamed from: B */
    boolean f9458B;

    /* renamed from: C */
    boolean f9459C;

    /* renamed from: D */
    boolean f9460D;

    /* renamed from: E */
    boolean f9461E;

    /* renamed from: F */
    private boolean f9462F;

    /* renamed from: G */
    ViewGroup f9463G;

    /* renamed from: H */
    View f9464H;

    /* renamed from: I */
    boolean f9465I;

    /* renamed from: J */
    boolean f9466J;

    /* renamed from: K */
    i f9467K;

    /* renamed from: L */
    Runnable f9468L;

    /* renamed from: M */
    boolean f9469M;

    /* renamed from: N */
    boolean f9470N;

    /* renamed from: O */
    float f9471O;

    /* renamed from: P */
    LayoutInflater f9472P;

    /* renamed from: Q */
    boolean f9473Q;

    /* renamed from: R */
    AbstractC1019h.b f9474R;

    /* renamed from: S */
    C1026o f9475S;

    /* renamed from: T */
    B f9476T;

    /* renamed from: U */
    androidx.lifecycle.t f9477U;

    /* renamed from: V */
    K.b f9478V;

    /* renamed from: W */
    C6511c f9479W;

    /* renamed from: X */
    private int f9480X;

    /* renamed from: Y */
    private final AtomicInteger f9481Y;

    /* renamed from: Z */
    private final ArrayList f9482Z;

    /* renamed from: a */
    int f9483a;

    /* renamed from: b */
    Bundle f9484b;

    /* renamed from: c */
    SparseArray f9485c;

    /* renamed from: d */
    Bundle f9486d;

    /* renamed from: e */
    Boolean f9487e;

    /* renamed from: f */
    String f9488f;

    /* renamed from: g */
    Bundle f9489g;

    /* renamed from: h */
    Fragment f9490h;

    /* renamed from: i */
    String f9491i;

    /* renamed from: j */
    int f9492j;

    /* renamed from: k */
    private Boolean f9493k;

    /* renamed from: l */
    boolean f9494l;

    /* renamed from: m */
    boolean f9495m;

    /* renamed from: n */
    boolean f9496n;

    /* renamed from: o */
    boolean f9497o;

    /* renamed from: p */
    boolean f9498p;

    /* renamed from: q */
    boolean f9499q;

    /* renamed from: r */
    int f9500r;

    /* renamed from: s */
    FragmentManager f9501s;

    /* renamed from: t */
    androidx.fragment.app.j f9502t;

    /* renamed from: u */
    FragmentManager f9503u;

    /* renamed from: v */
    Fragment f9504v;

    /* renamed from: w */
    int f9505w;

    /* renamed from: x */
    int f9506x;

    /* renamed from: y */
    String f9507y;

    /* renamed from: z */
    boolean f9508z;

    /* renamed from: androidx.fragment.app.Fragment$5 */
    class AnonymousClass5 implements InterfaceC1023l {
        AnonymousClass5() {
        }

        @Override // androidx.lifecycle.InterfaceC1023l
        public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
            View view;
            if (aVar != AbstractC1019h.a.ON_STOP || (view = Fragment.this.f9464H) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.a(false);
        }
    }

    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ D f9512a;

        c(D d9) {
            this.f9512a = d9;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9512a.g();
        }
    }

    class d extends androidx.fragment.app.g {
        d() {
        }

        @Override // androidx.fragment.app.g
        public View onFindViewById(int i8) {
            View view = Fragment.this.f9464H;
            if (view != null) {
                return view.findViewById(i8);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean onHasView() {
            return Fragment.this.f9464H != null;
        }
    }

    class e implements InterfaceC6046a {
        e() {
        }

        @Override // p.InterfaceC6046a
        public f.f apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.f9502t;
            return obj instanceof f.g ? ((f.g) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    class f implements InterfaceC6046a {

        /* renamed from: a */
        final /* synthetic */ f.f f9516a;

        f(f.f fVar) {
            this.f9516a = fVar;
        }

        @Override // p.InterfaceC6046a
        public f.f apply(Void r12) {
            return this.f9516a;
        }
    }

    class g extends k {

        /* renamed from: a */
        final /* synthetic */ InterfaceC6046a f9518a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f9519b;

        /* renamed from: c */
        final /* synthetic */ AbstractC5530a f9520c;

        /* renamed from: d */
        final /* synthetic */ InterfaceC5379b f9521d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(InterfaceC6046a interfaceC6046a, AtomicReference atomicReference, AbstractC5530a abstractC5530a, InterfaceC5379b interfaceC5379b) {
            super(null);
            this.f9518a = interfaceC6046a;
            this.f9519b = atomicReference;
            this.f9520c = abstractC5530a;
            this.f9521d = interfaceC5379b;
        }

        @Override // androidx.fragment.app.Fragment.k
        void a() {
            String strE = Fragment.this.e();
            this.f9519b.set(((f.f) this.f9518a.apply(null)).register(strE, Fragment.this, this.f9520c, this.f9521d));
        }
    }

    class h extends f.d {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f9523a;

        /* renamed from: b */
        final /* synthetic */ AbstractC5530a f9524b;

        h(AtomicReference atomicReference, AbstractC5530a abstractC5530a) {
            this.f9523a = atomicReference;
            this.f9524b = abstractC5530a;
        }

        @Override // f.d
        public AbstractC5530a getContract() {
            return this.f9524b;
        }

        @Override // f.d
        public void launch(Object obj, AbstractC0920d abstractC0920d) {
            f.d dVar = (f.d) this.f9523a.get();
            if (dVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            dVar.launch(obj, abstractC0920d);
        }

        @Override // f.d
        public void unregister() {
            f.d dVar = (f.d) this.f9523a.getAndSet(null);
            if (dVar != null) {
                dVar.unregister();
            }
        }
    }

    static class i {

        /* renamed from: a */
        View f9526a;

        /* renamed from: b */
        Animator f9527b;

        /* renamed from: c */
        boolean f9528c;

        /* renamed from: d */
        int f9529d;

        /* renamed from: e */
        int f9530e;

        /* renamed from: f */
        int f9531f;

        /* renamed from: g */
        int f9532g;

        /* renamed from: h */
        int f9533h;

        /* renamed from: i */
        ArrayList f9534i;

        /* renamed from: j */
        ArrayList f9535j;

        /* renamed from: k */
        Object f9536k = null;

        /* renamed from: l */
        Object f9537l;

        /* renamed from: m */
        Object f9538m;

        /* renamed from: n */
        Object f9539n;

        /* renamed from: o */
        Object f9540o;

        /* renamed from: p */
        Object f9541p;

        /* renamed from: q */
        Boolean f9542q;

        /* renamed from: r */
        Boolean f9543r;

        /* renamed from: s */
        androidx.core.app.E f9544s;

        /* renamed from: t */
        androidx.core.app.E f9545t;

        /* renamed from: u */
        float f9546u;

        /* renamed from: v */
        View f9547v;

        /* renamed from: w */
        boolean f9548w;

        /* renamed from: x */
        l f9549x;

        /* renamed from: y */
        boolean f9550y;

        i() {
            Object obj = Fragment.f9456a0;
            this.f9537l = obj;
            this.f9538m = null;
            this.f9539n = obj;
            this.f9540o = null;
            this.f9541p = obj;
            this.f9544s = null;
            this.f9545t = null;
            this.f9546u = 1.0f;
            this.f9547v = null;
        }
    }

    public static class j extends RuntimeException {
        public j(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class k {
        private k() {
        }

        abstract void a();

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    interface l {
        void onStartEnterTransition();

        void startListening();
    }

    public Fragment() {
        this.f9483a = -1;
        this.f9488f = UUID.randomUUID().toString();
        this.f9491i = null;
        this.f9493k = null;
        this.f9503u = new androidx.fragment.app.m();
        this.f9461E = true;
        this.f9466J = true;
        this.f9468L = new a();
        this.f9474R = AbstractC1019h.b.RESUMED;
        this.f9477U = new androidx.lifecycle.t();
        this.f9481Y = new AtomicInteger();
        this.f9482Z = new ArrayList();
        u();
    }

    private f.d Z(AbstractC5530a abstractC5530a, InterfaceC6046a interfaceC6046a, InterfaceC5379b interfaceC5379b) {
        if (this.f9483a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            a0(new g(interfaceC6046a, atomicReference, abstractC5530a, interfaceC5379b));
            return new h(atomicReference, abstractC5530a);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void a0(k kVar) {
        if (this.f9483a >= 0) {
            kVar.a();
        } else {
            this.f9482Z.add(kVar);
        }
    }

    private i c() {
        if (this.f9467K == null) {
            this.f9467K = new i();
        }
        return this.f9467K;
    }

    private void c0() {
        if (FragmentManager.x0(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("moveto RESTORE_VIEW_STATE: ");
            sb.append(this);
        }
        if (this.f9464H != null) {
            d0(this.f9484b);
        }
        this.f9484b = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private int m() {
        AbstractC1019h.b bVar = this.f9474R;
        return (bVar == AbstractC1019h.b.INITIALIZED || this.f9504v == null) ? bVar.ordinal() : Math.min(bVar.ordinal(), this.f9504v.m());
    }

    private void u() {
        this.f9475S = new C1026o(this);
        this.f9479W = C6511c.create(this);
        this.f9478V = null;
    }

    void A() {
        this.f9503u.K0();
    }

    void B(Bundle bundle) {
        this.f9503u.K0();
        this.f9483a = 3;
        this.f9462F = false;
        onActivityCreated(bundle);
        if (this.f9462F) {
            c0();
            this.f9503u.w();
        } else {
            throw new F("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void C() {
        Iterator it = this.f9482Z.iterator();
        while (it.hasNext()) {
            ((k) it.next()).a();
        }
        this.f9482Z.clear();
        this.f9503u.j(this.f9502t, b(), this);
        this.f9483a = 0;
        this.f9462F = false;
        onAttach(this.f9502t.b());
        if (this.f9462F) {
            this.f9501s.G(this);
            this.f9503u.x();
        } else {
            throw new F("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void D(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f9503u.y(configuration);
    }

    boolean E(MenuItem menuItem) {
        if (this.f9508z) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.f9503u.z(menuItem);
    }

    void F(Bundle bundle) {
        this.f9503u.K0();
        this.f9483a = 1;
        this.f9462F = false;
        this.f9475S.addObserver(new InterfaceC1023l() { // from class: androidx.fragment.app.Fragment.5
            AnonymousClass5() {
            }

            @Override // androidx.lifecycle.InterfaceC1023l
            public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
                View view;
                if (aVar != AbstractC1019h.a.ON_STOP || (view = Fragment.this.f9464H) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f9479W.performRestore(bundle);
        onCreate(bundle);
        this.f9473Q = true;
        if (this.f9462F) {
            this.f9475S.handleLifecycleEvent(AbstractC1019h.a.ON_CREATE);
            return;
        }
        throw new F("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean G(Menu menu, MenuInflater menuInflater) {
        boolean z8 = false;
        if (this.f9508z) {
            return false;
        }
        if (this.f9460D && this.f9461E) {
            onCreateOptionsMenu(menu, menuInflater);
            z8 = true;
        }
        return z8 | this.f9503u.B(menu, menuInflater);
    }

    void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f9503u.K0();
        this.f9499q = true;
        this.f9476T = new B(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.f9464H = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.f9476T.c()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f9476T = null;
        } else {
            this.f9476T.b();
            O.set(this.f9464H, this.f9476T);
            P.set(this.f9464H, this.f9476T);
            AbstractC6513e.set(this.f9464H, this.f9476T);
            this.f9477U.setValue(this.f9476T);
        }
    }

    void I() {
        this.f9503u.C();
        this.f9475S.handleLifecycleEvent(AbstractC1019h.a.ON_DESTROY);
        this.f9483a = 0;
        this.f9462F = false;
        this.f9473Q = false;
        onDestroy();
        if (this.f9462F) {
            return;
        }
        throw new F("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void J() {
        this.f9503u.D();
        if (this.f9464H != null && this.f9476T.getLifecycle().getCurrentState().isAtLeast(AbstractC1019h.b.CREATED)) {
            this.f9476T.a(AbstractC1019h.a.ON_DESTROY);
        }
        this.f9483a = 1;
        this.f9462F = false;
        onDestroyView();
        if (this.f9462F) {
            androidx.loader.app.a.getInstance(this).markForRedelivery();
            this.f9499q = false;
        } else {
            throw new F("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void K() {
        this.f9483a = -1;
        this.f9462F = false;
        onDetach();
        this.f9472P = null;
        if (this.f9462F) {
            if (this.f9503u.isDestroyed()) {
                return;
            }
            this.f9503u.C();
            this.f9503u = new androidx.fragment.app.m();
            return;
        }
        throw new F("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater L(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.f9472P = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void M() {
        onLowMemory();
        this.f9503u.E();
    }

    void N(boolean z8) {
        onMultiWindowModeChanged(z8);
        this.f9503u.F(z8);
    }

    boolean O(MenuItem menuItem) {
        if (this.f9508z) {
            return false;
        }
        if (this.f9460D && this.f9461E && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.f9503u.H(menuItem);
    }

    void P(Menu menu) {
        if (this.f9508z) {
            return;
        }
        if (this.f9460D && this.f9461E) {
            onOptionsMenuClosed(menu);
        }
        this.f9503u.I(menu);
    }

    void Q() {
        this.f9503u.K();
        if (this.f9464H != null) {
            this.f9476T.a(AbstractC1019h.a.ON_PAUSE);
        }
        this.f9475S.handleLifecycleEvent(AbstractC1019h.a.ON_PAUSE);
        this.f9483a = 6;
        this.f9462F = false;
        onPause();
        if (this.f9462F) {
            return;
        }
        throw new F("Fragment " + this + " did not call through to super.onPause()");
    }

    void R(boolean z8) {
        onPictureInPictureModeChanged(z8);
        this.f9503u.L(z8);
    }

    boolean S(Menu menu) {
        boolean z8 = false;
        if (this.f9508z) {
            return false;
        }
        if (this.f9460D && this.f9461E) {
            onPrepareOptionsMenu(menu);
            z8 = true;
        }
        return z8 | this.f9503u.M(menu);
    }

    void T() {
        boolean zA0 = this.f9501s.A0(this);
        Boolean bool = this.f9493k;
        if (bool == null || bool.booleanValue() != zA0) {
            this.f9493k = Boolean.valueOf(zA0);
            onPrimaryNavigationFragmentChanged(zA0);
            this.f9503u.N();
        }
    }

    void U() {
        this.f9503u.K0();
        this.f9503u.X(true);
        this.f9483a = 7;
        this.f9462F = false;
        onResume();
        if (!this.f9462F) {
            throw new F("Fragment " + this + " did not call through to super.onResume()");
        }
        C1026o c1026o = this.f9475S;
        AbstractC1019h.a aVar = AbstractC1019h.a.ON_RESUME;
        c1026o.handleLifecycleEvent(aVar);
        if (this.f9464H != null) {
            this.f9476T.a(aVar);
        }
        this.f9503u.O();
    }

    void V(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.f9479W.performSave(bundle);
        Parcelable parcelableZ0 = this.f9503u.Z0();
        if (parcelableZ0 != null) {
            bundle.putParcelable("android:support:fragments", parcelableZ0);
        }
    }

    void W() {
        this.f9503u.K0();
        this.f9503u.X(true);
        this.f9483a = 5;
        this.f9462F = false;
        onStart();
        if (!this.f9462F) {
            throw new F("Fragment " + this + " did not call through to super.onStart()");
        }
        C1026o c1026o = this.f9475S;
        AbstractC1019h.a aVar = AbstractC1019h.a.ON_START;
        c1026o.handleLifecycleEvent(aVar);
        if (this.f9464H != null) {
            this.f9476T.a(aVar);
        }
        this.f9503u.P();
    }

    void X() {
        this.f9503u.R();
        if (this.f9464H != null) {
            this.f9476T.a(AbstractC1019h.a.ON_STOP);
        }
        this.f9475S.handleLifecycleEvent(AbstractC1019h.a.ON_STOP);
        this.f9483a = 4;
        this.f9462F = false;
        onStop();
        if (this.f9462F) {
            return;
        }
        throw new F("Fragment " + this + " did not call through to super.onStop()");
    }

    void Y() {
        onViewCreated(this.f9464H, this.f9484b);
        this.f9503u.S();
    }

    void a(boolean z8) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        i iVar = this.f9467K;
        l lVar = null;
        if (iVar != null) {
            iVar.f9548w = false;
            l lVar2 = iVar.f9549x;
            iVar.f9549x = null;
            lVar = lVar2;
        }
        if (lVar != null) {
            lVar.onStartEnterTransition();
            return;
        }
        if (!FragmentManager.f9557P || this.f9464H == null || (viewGroup = this.f9463G) == null || (fragmentManager = this.f9501s) == null) {
            return;
        }
        D dM = D.m(viewGroup, fragmentManager);
        dM.o();
        if (z8) {
            this.f9502t.c().post(new c(dM));
        } else {
            dM.g();
        }
    }

    androidx.fragment.app.g b() {
        return new d();
    }

    void b0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.f9503u.W0(parcelable);
        this.f9503u.A();
    }

    Fragment d(String str) {
        return str.equals(this.f9488f) ? this : this.f9503u.d0(str);
    }

    final void d0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f9485c;
        if (sparseArray != null) {
            this.f9464H.restoreHierarchyState(sparseArray);
            this.f9485c = null;
        }
        if (this.f9464H != null) {
            this.f9476T.d(this.f9486d);
            this.f9486d = null;
        }
        this.f9462F = false;
        onViewStateRestored(bundle);
        if (this.f9462F) {
            if (this.f9464H != null) {
                this.f9476T.a(AbstractC1019h.a.ON_CREATE);
            }
        } else {
            throw new F("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f9505w));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f9506x));
        printWriter.print(" mTag=");
        printWriter.println(this.f9507y);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f9483a);
        printWriter.print(" mWho=");
        printWriter.print(this.f9488f);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f9500r);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f9494l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f9495m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f9496n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f9497o);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f9508z);
        printWriter.print(" mDetached=");
        printWriter.print(this.f9457A);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f9461E);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f9460D);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f9458B);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f9466J);
        if (this.f9501s != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f9501s);
        }
        if (this.f9502t != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f9502t);
        }
        if (this.f9504v != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f9504v);
        }
        if (this.f9489g != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f9489g);
        }
        if (this.f9484b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f9484b);
        }
        if (this.f9485c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f9485c);
        }
        if (this.f9486d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f9486d);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f9492j);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(o());
        if (h() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(h());
        }
        if (j() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(j());
        }
        if (p() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(p());
        }
        if (q() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(q());
        }
        if (this.f9463G != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f9463G);
        }
        if (this.f9464H != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f9464H);
        }
        if (f() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(f());
        }
        if (getContext() != null) {
            androidx.loader.app.a.getInstance(this).dump(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f9503u + ":");
        this.f9503u.dump(str + "  ", fileDescriptor, printWriter, strArr);
    }

    String e() {
        return "fragment_" + this.f9488f + "_rq#" + this.f9481Y.getAndIncrement();
    }

    void e0(View view) {
        c().f9526a = view;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    View f() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9526a;
    }

    void f0(int i8, int i9, int i10, int i11) {
        if (this.f9467K == null && i8 == 0 && i9 == 0 && i10 == 0 && i11 == 0) {
            return;
        }
        c().f9529d = i8;
        c().f9530e = i9;
        c().f9531f = i10;
        c().f9532g = i11;
    }

    Animator g() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9527b;
    }

    void g0(Animator animator) {
        c().f9527b = animator;
    }

    public final ActivityC1010e getActivity() {
        androidx.fragment.app.j jVar = this.f9502t;
        if (jVar == null) {
            return null;
        }
        return (ActivityC1010e) jVar.a();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.f9467K;
        if (iVar == null || (bool = iVar.f9543r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.f9467K;
        if (iVar == null || (bool = iVar.f9542q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Bundle getArguments() {
        return this.f9489g;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.f9502t != null) {
            return this.f9503u;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        androidx.fragment.app.j jVar = this.f9502t;
        if (jVar == null) {
            return null;
        }
        return jVar.b();
    }

    public /* bridge */ /* synthetic */ AbstractC5837a getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // androidx.lifecycle.InterfaceC1018g
    public K.b getDefaultViewModelProviderFactory() {
        Application application;
        if (this.f9501s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f9478V == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.x0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find Application instance from Context ");
                sb.append(requireContext().getApplicationContext());
                sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f9478V = new androidx.lifecycle.F(application, this, getArguments());
        }
        return this.f9478V;
    }

    public Object getEnterTransition() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9536k;
    }

    public Object getExitTransition() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9538m;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.f9501s;
    }

    public final Object getHost() {
        androidx.fragment.app.j jVar = this.f9502t;
        if (jVar == null) {
            return null;
        }
        return jVar.onGetHost();
    }

    public final int getId() {
        return this.f9505w;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.f9472P;
        return layoutInflater == null ? L(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC1025n, y0.InterfaceC6512d, androidx.activity.t
    public AbstractC1019h getLifecycle() {
        return this.f9475S;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.getInstance(this);
    }

    public final Fragment getParentFragment() {
        return this.f9504v;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.f9501s;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public Object getReenterTransition() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f9539n;
        return obj == f9456a0 ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.f9458B;
    }

    public Object getReturnTransition() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f9537l;
        return obj == f9456a0 ? getEnterTransition() : obj;
    }

    @Override // y0.InterfaceC6512d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.f9479W.getSavedStateRegistry();
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9540o;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f9541p;
        return obj == f9456a0 ? getSharedElementEnterTransition() : obj;
    }

    public final String getString(int i8) {
        return getResources().getString(i8);
    }

    public final String getTag() {
        return this.f9507y;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.f9490h;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.f9501s;
        if (fragmentManager == null || (str = this.f9491i) == null) {
            return null;
        }
        return fragmentManager.c0(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.f9492j;
    }

    public final CharSequence getText(int i8) {
        return getResources().getText(i8);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.f9466J;
    }

    public View getView() {
        return this.f9464H;
    }

    public InterfaceC1025n getViewLifecycleOwner() {
        B b9 = this.f9476T;
        if (b9 != null) {
            return b9;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData getViewLifecycleOwnerLiveData() {
        return this.f9477U;
    }

    @Override // androidx.lifecycle.N
    public M getViewModelStore() {
        if (this.f9501s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m() != AbstractC1019h.b.INITIALIZED.ordinal()) {
            return this.f9501s.t0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    int h() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return 0;
        }
        return iVar.f9529d;
    }

    void h0(View view) {
        c().f9547v = view;
    }

    public final boolean hasOptionsMenu() {
        return this.f9460D;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    androidx.core.app.E i() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9544s;
    }

    void i0(boolean z8) {
        c().f9550y = z8;
    }

    public final boolean isAdded() {
        return this.f9502t != null && this.f9494l;
    }

    public final boolean isDetached() {
        return this.f9457A;
    }

    public final boolean isHidden() {
        return this.f9508z;
    }

    public final boolean isInLayout() {
        return this.f9497o;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.f9461E && ((fragmentManager = this.f9501s) == null || fragmentManager.z0(this.f9504v));
    }

    public final boolean isRemoving() {
        return this.f9495m;
    }

    public final boolean isResumed() {
        return this.f9483a >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.f9501s;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.isStateSaved();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.f9464H) == null || view.getWindowToken() == null || this.f9464H.getVisibility() != 0) ? false : true;
    }

    int j() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return 0;
        }
        return iVar.f9530e;
    }

    void j0(int i8) {
        if (this.f9467K == null && i8 == 0) {
            return;
        }
        c();
        this.f9467K.f9533h = i8;
    }

    androidx.core.app.E k() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9545t;
    }

    void k0(l lVar) {
        c();
        i iVar = this.f9467K;
        l lVar2 = iVar.f9549x;
        if (lVar == lVar2) {
            return;
        }
        if (lVar != null && lVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (iVar.f9548w) {
            iVar.f9549x = lVar;
        }
        if (lVar != null) {
            lVar.startListening();
        }
    }

    View l() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return null;
        }
        return iVar.f9547v;
    }

    void l0(boolean z8) {
        if (this.f9467K == null) {
            return;
        }
        c().f9528c = z8;
    }

    void m0(float f8) {
        c().f9546u = f8;
    }

    int n() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return 0;
        }
        return iVar.f9533h;
    }

    void n0(ArrayList arrayList, ArrayList arrayList2) {
        c();
        i iVar = this.f9467K;
        iVar.f9534i = arrayList;
        iVar.f9535j = arrayList2;
    }

    boolean o() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return false;
        }
        return iVar.f9528c;
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.f9462F = true;
    }

    @Deprecated
    public void onActivityResult(int i8, int i9, Intent intent) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i8);
            sb.append(" resultCode: ");
            sb.append(i9);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    public void onAttach(Context context) {
        this.f9462F = true;
        androidx.fragment.app.j jVar = this.f9502t;
        Activity activityA = jVar == null ? null : jVar.a();
        if (activityA != null) {
            this.f9462F = false;
            onAttach(activityA);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f9462F = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.f9462F = true;
        b0(bundle);
        if (this.f9503u.B0(1)) {
            return;
        }
        this.f9503u.A();
    }

    public Animation onCreateAnimation(int i8, boolean z8, int i9) {
        return null;
    }

    public Animator onCreateAnimator(int i8, boolean z8, int i9) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i8 = this.f9480X;
        if (i8 != 0) {
            return layoutInflater.inflate(i8, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.f9462F = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.f9462F = true;
    }

    public void onDetach() {
        this.f9462F = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z8) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f9462F = true;
        androidx.fragment.app.j jVar = this.f9502t;
        Activity activityA = jVar == null ? null : jVar.a();
        if (activityA != null) {
            this.f9462F = false;
            onInflate(activityA, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f9462F = true;
    }

    public void onMultiWindowModeChanged(boolean z8) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.f9462F = true;
    }

    public void onPictureInPictureModeChanged(boolean z8) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z8) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.f9462F = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.f9462F = true;
    }

    public void onStop() {
        this.f9462F = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.f9462F = true;
    }

    int p() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return 0;
        }
        return iVar.f9531f;
    }

    public void postponeEnterTransition() {
        c().f9548w = true;
    }

    int q() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return 0;
        }
        return iVar.f9532g;
    }

    float r() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f9546u;
    }

    @Override // f.InterfaceC5380c
    public final <I, O> f.d registerForActivityResult(AbstractC5530a abstractC5530a, InterfaceC5379b interfaceC5379b) {
        return Z(abstractC5530a, new e(), interfaceC5379b);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i8) {
        if (this.f9502t != null) {
            getParentFragmentManager().C0(this, strArr, i8);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final ActivityC1010e requireActivity() {
        ActivityC1010e activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    ArrayList s() {
        ArrayList arrayList;
        i iVar = this.f9467K;
        return (iVar == null || (arrayList = iVar.f9534i) == null) ? new ArrayList() : arrayList;
    }

    public void setAllowEnterTransitionOverlap(boolean z8) {
        c().f9543r = Boolean.valueOf(z8);
    }

    public void setAllowReturnTransitionOverlap(boolean z8) {
        c().f9542q = Boolean.valueOf(z8);
    }

    public void setArguments(Bundle bundle) {
        if (this.f9501s != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f9489g = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.E e8) {
        c().f9544s = e8;
    }

    public void setEnterTransition(Object obj) {
        c().f9536k = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.E e8) {
        c().f9545t = e8;
    }

    public void setExitTransition(Object obj) {
        c().f9538m = obj;
    }

    public void setHasOptionsMenu(boolean z8) {
        if (this.f9460D != z8) {
            this.f9460D = z8;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.f9502t.onSupportInvalidateOptionsMenu();
        }
    }

    public void setInitialSavedState(m mVar) {
        Bundle bundle;
        if (this.f9501s != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (mVar == null || (bundle = mVar.f9551a) == null) {
            bundle = null;
        }
        this.f9484b = bundle;
    }

    public void setMenuVisibility(boolean z8) {
        if (this.f9461E != z8) {
            this.f9461E = z8;
            if (this.f9460D && isAdded() && !isHidden()) {
                this.f9502t.onSupportInvalidateOptionsMenu();
            }
        }
    }

    public void setReenterTransition(Object obj) {
        c().f9539n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z8) {
        this.f9458B = z8;
        FragmentManager fragmentManager = this.f9501s;
        if (fragmentManager == null) {
            this.f9459C = true;
        } else if (z8) {
            fragmentManager.h(this);
        } else {
            fragmentManager.T0(this);
        }
    }

    public void setReturnTransition(Object obj) {
        c().f9537l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        c().f9540o = obj;
    }

    public void setSharedElementReturnTransition(Object obj) {
        c().f9541p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i8) {
        FragmentManager fragmentManager = this.f9501s;
        FragmentManager fragmentManager2 = fragment != null ? fragment.f9501s : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.f9491i = null;
            this.f9490h = null;
        } else if (this.f9501s == null || fragment.f9501s == null) {
            this.f9491i = null;
            this.f9490h = fragment;
        } else {
            this.f9491i = fragment.f9488f;
            this.f9490h = null;
        }
        this.f9492j = i8;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z8) {
        if (!this.f9466J && z8 && this.f9483a < 5 && this.f9501s != null && isAdded() && this.f9473Q) {
            FragmentManager fragmentManager = this.f9501s;
            fragmentManager.M0(fragmentManager.t(this));
        }
        this.f9466J = z8;
        this.f9465I = this.f9483a < 5 && !z8;
        if (this.f9484b != null) {
            this.f9487e = Boolean.valueOf(z8);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        androidx.fragment.app.j jVar = this.f9502t;
        if (jVar != null) {
            return jVar.onShouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i8) {
        startActivityForResult(intent, i8, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        if (this.f9502t == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i8);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            sb.append(bundle);
        }
        getParentFragmentManager().E0(this, intentSender, i8, intent, i9, i10, i11, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.f9467K == null || !c().f9548w) {
            return;
        }
        if (this.f9502t == null) {
            c().f9548w = false;
        } else if (Looper.myLooper() != this.f9502t.c().getLooper()) {
            this.f9502t.c().postAtFrontOfQueue(new b());
        } else {
            a(true);
        }
    }

    ArrayList t() {
        ArrayList arrayList;
        i iVar = this.f9467K;
        return (iVar == null || (arrayList = iVar.f9535j) == null) ? new ArrayList() : arrayList;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f9488f);
        if (this.f9505w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9505w));
        }
        if (this.f9507y != null) {
            sb.append(" tag=");
            sb.append(this.f9507y);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    void v() {
        u();
        this.f9488f = UUID.randomUUID().toString();
        this.f9494l = false;
        this.f9495m = false;
        this.f9496n = false;
        this.f9497o = false;
        this.f9498p = false;
        this.f9500r = 0;
        this.f9501s = null;
        this.f9503u = new androidx.fragment.app.m();
        this.f9502t = null;
        this.f9505w = 0;
        this.f9506x = 0;
        this.f9507y = null;
        this.f9508z = false;
        this.f9457A = false;
    }

    boolean w() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return false;
        }
        return iVar.f9550y;
    }

    final boolean x() {
        return this.f9500r > 0;
    }

    boolean y() {
        i iVar = this.f9467K;
        if (iVar == null) {
            return false;
        }
        return iVar.f9548w;
    }

    final boolean z() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.z());
    }

    public static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a */
        final Bundle f9551a;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public m[] newArray(int i8) {
                return new m[i8];
            }

            @Override // android.os.Parcelable.Creator
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }
        }

        m(Bundle bundle) {
            this.f9551a = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeBundle(this.f9551a);
        }

        m(Parcel parcel, ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f9551a = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = androidx.fragment.app.i.loadFragmentClass(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e8) {
            throw new j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (InstantiationException e9) {
            throw new j("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new j("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new j("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }

    public final String getString(int i8, Object... objArr) {
        return getResources().getString(i8, objArr);
    }

    public final void postponeEnterTransition(long j8, TimeUnit timeUnit) {
        c().f9548w = true;
        FragmentManager fragmentManager = this.f9501s;
        Handler handlerC = fragmentManager != null ? fragmentManager.n0().c() : new Handler(Looper.getMainLooper());
        handlerC.removeCallbacks(this.f9468L);
        handlerC.postDelayed(this.f9468L, timeUnit.toMillis(j8));
    }

    @Override // f.InterfaceC5380c
    public final <I, O> f.d registerForActivityResult(AbstractC5530a abstractC5530a, f.f fVar, InterfaceC5379b interfaceC5379b) {
        return Z(abstractC5530a, new f(fVar), interfaceC5379b);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        androidx.fragment.app.j jVar = this.f9502t;
        if (jVar != null) {
            jVar.onStartActivityFromFragment(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i8, Bundle bundle) {
        if (this.f9502t != null) {
            getParentFragmentManager().D0(this, intent, i8, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        androidx.fragment.app.j jVar = this.f9502t;
        if (jVar != null) {
            LayoutInflater layoutInflaterOnGetLayoutInflater = jVar.onGetLayoutInflater();
            androidx.core.view.D.setFactory2(layoutInflaterOnGetLayoutInflater, this.f9503u.o0());
            return layoutInflaterOnGetLayoutInflater;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.f9462F = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f9462F = true;
    }

    public Fragment(int i8) {
        this();
        this.f9480X = i8;
    }
}
