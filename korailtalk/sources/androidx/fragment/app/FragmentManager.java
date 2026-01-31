package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.AbstractC1011f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import androidx.fragment.app.y;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import f.C5378a;
import f.InterfaceC5379b;
import f.h;
import g.AbstractC5530a;
import g.C5531b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class FragmentManager implements t {

    /* renamed from: O */
    private static boolean f9556O = false;

    /* renamed from: P */
    static boolean f9557P = true;
    public static final int POP_BACK_STACK_INCLUSIVE = 1;

    /* renamed from: A */
    private f.d f9558A;

    /* renamed from: B */
    private f.d f9559B;

    /* renamed from: D */
    private boolean f9561D;

    /* renamed from: E */
    private boolean f9562E;

    /* renamed from: F */
    private boolean f9563F;

    /* renamed from: G */
    private boolean f9564G;

    /* renamed from: H */
    private boolean f9565H;

    /* renamed from: I */
    private ArrayList f9566I;

    /* renamed from: J */
    private ArrayList f9567J;

    /* renamed from: K */
    private ArrayList f9568K;

    /* renamed from: L */
    private ArrayList f9569L;

    /* renamed from: M */
    private androidx.fragment.app.p f9570M;

    /* renamed from: b */
    private boolean f9573b;

    /* renamed from: d */
    ArrayList f9575d;

    /* renamed from: e */
    private ArrayList f9576e;

    /* renamed from: g */
    private OnBackPressedDispatcher f9578g;

    /* renamed from: l */
    private ArrayList f9583l;

    /* renamed from: r */
    private androidx.fragment.app.j f9589r;

    /* renamed from: s */
    private androidx.fragment.app.g f9590s;

    /* renamed from: t */
    private Fragment f9591t;

    /* renamed from: u */
    Fragment f9592u;

    /* renamed from: z */
    private f.d f9597z;

    /* renamed from: a */
    private final ArrayList f9572a = new ArrayList();

    /* renamed from: c */
    private final w f9574c = new w();

    /* renamed from: f */
    private final androidx.fragment.app.k f9577f = new androidx.fragment.app.k(this);

    /* renamed from: h */
    private final androidx.activity.r f9579h = new c(false);

    /* renamed from: i */
    private final AtomicInteger f9580i = new AtomicInteger();

    /* renamed from: j */
    private final Map f9581j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private final Map f9582k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m */
    private Map f9584m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n */
    private final y.g f9585n = new d();

    /* renamed from: o */
    private final androidx.fragment.app.l f9586o = new androidx.fragment.app.l(this);

    /* renamed from: p */
    private final CopyOnWriteArrayList f9587p = new CopyOnWriteArrayList();

    /* renamed from: q */
    int f9588q = -1;

    /* renamed from: v */
    private androidx.fragment.app.i f9593v = null;

    /* renamed from: w */
    private androidx.fragment.app.i f9594w = new e();

    /* renamed from: x */
    private E f9595x = null;

    /* renamed from: y */
    private E f9596y = new f();

    /* renamed from: C */
    ArrayDeque f9560C = new ArrayDeque();

    /* renamed from: N */
    private Runnable f9571N = new g();

    /* renamed from: androidx.fragment.app.FragmentManager$6 */
    class AnonymousClass6 implements InterfaceC1023l {

        /* renamed from: a */
        final /* synthetic */ String f9598a;

        /* renamed from: b */
        final /* synthetic */ androidx.fragment.app.s f9599b;

        /* renamed from: c */
        final /* synthetic */ AbstractC1019h f9600c;

        AnonymousClass6(String str, androidx.fragment.app.s sVar, AbstractC1019h abstractC1019h) {
            str = str;
            sVar = sVar;
            abstractC1019h = abstractC1019h;
        }

        @Override // androidx.lifecycle.InterfaceC1023l
        public void onStateChanged(InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
            Bundle bundle;
            if (aVar == AbstractC1019h.a.ON_START && (bundle = (Bundle) FragmentManager.this.f9581j.get(str)) != null) {
                sVar.onFragmentResult(str, bundle);
                FragmentManager.this.clearFragmentResult(str);
            }
            if (aVar == AbstractC1019h.a.ON_DESTROY) {
                abstractC1019h.removeObserver(this);
                FragmentManager.this.f9582k.remove(str);
            }
        }
    }

    class a implements InterfaceC5379b {
        a() {
        }

        @Override // f.InterfaceC5379b
        public void onActivityResult(C5378a c5378a) {
            n nVar = (n) FragmentManager.this.f9560C.pollFirst();
            if (nVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = nVar.f9616a;
            int i8 = nVar.f9617b;
            Fragment fragmentI = FragmentManager.this.f9574c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i8, c5378a.getResultCode(), c5378a.getData());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    class b implements InterfaceC5379b {
        b() {
        }

        @Override // f.InterfaceC5379b
        public void onActivityResult(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                iArr[i8] = ((Boolean) arrayList.get(i8)).booleanValue() ? 0 : -1;
            }
            n nVar = (n) FragmentManager.this.f9560C.pollFirst();
            if (nVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = nVar.f9616a;
            int i9 = nVar.f9617b;
            Fragment fragmentI = FragmentManager.this.f9574c.i(str);
            if (fragmentI != null) {
                fragmentI.onRequestPermissionsResult(i9, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    class c extends androidx.activity.r {
        c(boolean z8) {
            super(z8);
        }

        @Override // androidx.activity.r
        public void handleOnBackPressed() {
            FragmentManager.this.u0();
        }
    }

    class d implements y.g {
        d() {
        }

        @Override // androidx.fragment.app.y.g
        public void onComplete(Fragment fragment, androidx.core.os.e eVar) {
            if (eVar.isCanceled()) {
                return;
            }
            FragmentManager.this.Q0(fragment, eVar);
        }

        @Override // androidx.fragment.app.y.g
        public void onStart(Fragment fragment, androidx.core.os.e eVar) {
            FragmentManager.this.f(fragment, eVar);
        }
    }

    class e extends androidx.fragment.app.i {
        e() {
        }

        @Override // androidx.fragment.app.i
        public Fragment instantiate(ClassLoader classLoader, String str) {
            return FragmentManager.this.n0().instantiate(FragmentManager.this.n0().b(), str, null);
        }
    }

    class f implements E {
        f() {
        }

        @Override // androidx.fragment.app.E
        public D createController(ViewGroup viewGroup) {
            return new C1008c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.X(true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f9609a;

        /* renamed from: b */
        final /* synthetic */ View f9610b;

        /* renamed from: c */
        final /* synthetic */ Fragment f9611c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f9609a = viewGroup;
            this.f9610b = view;
            this.f9611c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9609a.endViewTransition(this.f9610b);
            animator.removeListener(this);
            Fragment fragment = this.f9611c;
            View view = fragment.f9464H;
            if (view == null || !fragment.f9508z) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class i implements androidx.fragment.app.q {

        /* renamed from: a */
        final /* synthetic */ Fragment f9613a;

        i(Fragment fragment) {
            this.f9613a = fragment;
        }

        @Override // androidx.fragment.app.q
        public void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
            this.f9613a.onAttachFragment(fragment);
        }
    }

    class j implements InterfaceC5379b {
        j() {
        }

        @Override // f.InterfaceC5379b
        public void onActivityResult(C5378a c5378a) {
            n nVar = (n) FragmentManager.this.f9560C.pollFirst();
            if (nVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = nVar.f9616a;
            int i8 = nVar.f9617b;
            Fragment fragmentI = FragmentManager.this.f9574c.i(str);
            if (fragmentI != null) {
                fragmentI.onActivityResult(i8, c5378a.getResultCode(), c5378a.getData());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    public interface k {
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Deprecated
        CharSequence getBreadCrumbTitle();

        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    static class l extends AbstractC5530a {
        l() {
        }

        @Override // g.AbstractC5530a
        public Intent createIntent(Context context, f.h hVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent fillInIntent = hVar.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    hVar = new h.a(hVar.getIntentSender()).setFillInIntent(null).setFlags(hVar.getFlagsValues(), hVar.getFlagsMask()).build();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", hVar);
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("CreateIntent created the following intent: ");
                sb.append(intent);
            }
            return intent;
        }

        @Override // g.AbstractC5530a
        public C5378a parseResult(int i8, Intent intent) {
            return new C5378a(i8, intent);
        }
    }

    public static abstract class m {
        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        }

        public void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        }

        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        }

        public void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        }
    }

    private static class o implements androidx.fragment.app.s {

        /* renamed from: a */
        private final AbstractC1019h f9618a;

        /* renamed from: b */
        private final androidx.fragment.app.s f9619b;

        /* renamed from: c */
        private final InterfaceC1023l f9620c;

        o(AbstractC1019h abstractC1019h, androidx.fragment.app.s sVar, InterfaceC1023l interfaceC1023l) {
            this.f9618a = abstractC1019h;
            this.f9619b = sVar;
            this.f9620c = interfaceC1023l;
        }

        public boolean isAtLeast(AbstractC1019h.b bVar) {
            return this.f9618a.getCurrentState().isAtLeast(bVar);
        }

        @Override // androidx.fragment.app.s
        public void onFragmentResult(String str, Bundle bundle) {
            this.f9619b.onFragmentResult(str, bundle);
        }

        public void removeObserver() {
            this.f9618a.removeObserver(this.f9620c);
        }
    }

    public interface p {
    }

    interface q {
        boolean generateOps(ArrayList<C1006a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class r implements q {

        /* renamed from: a */
        final String f9621a;

        /* renamed from: b */
        final int f9622b;

        /* renamed from: c */
        final int f9623c;

        r(String str, int i8, int i9) {
            this.f9621a = str;
            this.f9622b = i8;
            this.f9623c = i9;
        }

        @Override // androidx.fragment.app.FragmentManager.q
        public boolean generateOps(ArrayList<C1006a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f9592u;
            if (fragment == null || this.f9622b >= 0 || this.f9621a != null || !fragment.getChildFragmentManager().popBackStackImmediate()) {
                return FragmentManager.this.O0(arrayList, arrayList2, this.f9621a, this.f9622b, this.f9623c);
            }
            return false;
        }
    }

    static class s implements Fragment.l {

        /* renamed from: a */
        final boolean f9625a;

        /* renamed from: b */
        final C1006a f9626b;

        /* renamed from: c */
        private int f9627c;

        s(C1006a c1006a, boolean z8) {
            this.f9625a = z8;
            this.f9626b = c1006a;
        }

        void a() {
            C1006a c1006a = this.f9626b;
            c1006a.f9628t.r(c1006a, this.f9625a, false, false);
        }

        void b() {
            boolean z8 = this.f9627c > 0;
            for (Fragment fragment : this.f9626b.f9628t.getFragments()) {
                fragment.k0(null);
                if (z8 && fragment.y()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C1006a c1006a = this.f9626b;
            c1006a.f9628t.r(c1006a, this.f9625a, !z8, true);
        }

        public boolean isReady() {
            return this.f9627c == 0;
        }

        @Override // androidx.fragment.app.Fragment.l
        public void onStartEnterTransition() {
            int i8 = this.f9627c - 1;
            this.f9627c = i8;
            if (i8 != 0) {
                return;
            }
            this.f9626b.f9628t.a1();
        }

        @Override // androidx.fragment.app.Fragment.l
        public void startListening() {
            this.f9627c++;
        }
    }

    private void F0(O.b bVar) {
        int size = bVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            Fragment fragment = (Fragment) bVar.valueAt(i8);
            if (!fragment.f9494l) {
                View viewRequireView = fragment.requireView();
                fragment.f9471O = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    private void J(Fragment fragment) {
        if (fragment == null || !fragment.equals(c0(fragment.f9488f))) {
            return;
        }
        fragment.T();
    }

    private boolean N0(String str, int i8, int i9) {
        X(false);
        W(true);
        Fragment fragment = this.f9592u;
        if (fragment != null && i8 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean zO0 = O0(this.f9566I, this.f9567J, str, i8, i9);
        if (zO0) {
            this.f9573b = true;
            try {
                S0(this.f9566I, this.f9567J);
            } finally {
                o();
            }
        }
        i1();
        T();
        this.f9574c.b();
        return zO0;
    }

    private int P0(ArrayList arrayList, ArrayList arrayList2, int i8, int i9, O.b bVar) {
        int i10 = i9;
        for (int i11 = i9 - 1; i11 >= i8; i11--) {
            C1006a c1006a = (C1006a) arrayList.get(i11);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i11)).booleanValue();
            if (c1006a.m() && !c1006a.k(arrayList, i11 + 1, i9)) {
                if (this.f9569L == null) {
                    this.f9569L = new ArrayList();
                }
                s sVar = new s(c1006a, zBooleanValue);
                this.f9569L.add(sVar);
                c1006a.n(sVar);
                if (zBooleanValue) {
                    c1006a.g();
                } else {
                    c1006a.h(false);
                }
                i10--;
                if (i11 != i10) {
                    arrayList.remove(i11);
                    arrayList.add(i10, c1006a);
                }
                d(bVar);
            }
        }
        return i10;
    }

    private void Q(int i8) {
        try {
            this.f9573b = true;
            this.f9574c.d(i8);
            H0(i8, false);
            if (f9557P) {
                Iterator it = p().iterator();
                while (it.hasNext()) {
                    ((D) it.next()).j();
                }
            }
            this.f9573b = false;
            X(true);
        } catch (Throwable th) {
            this.f9573b = false;
            throw th;
        }
    }

    private void S0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        b0(arrayList, arrayList2);
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            if (!((C1006a) arrayList.get(i8)).f9807r) {
                if (i9 != i8) {
                    a0(arrayList, arrayList2, i9, i8);
                }
                i9 = i8 + 1;
                if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                    while (i9 < size && ((Boolean) arrayList2.get(i9)).booleanValue() && !((C1006a) arrayList.get(i9)).f9807r) {
                        i9++;
                    }
                }
                a0(arrayList, arrayList2, i8, i9);
                i8 = i9 - 1;
            }
            i8++;
        }
        if (i9 != size) {
            a0(arrayList, arrayList2, i9, size);
        }
    }

    private void T() {
        if (this.f9565H) {
            this.f9565H = false;
            g1();
        }
    }

    private void U() {
        if (f9557P) {
            Iterator it = p().iterator();
            while (it.hasNext()) {
                ((D) it.next()).j();
            }
        } else {
            if (this.f9584m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f9584m.keySet()) {
                l(fragment);
                I0(fragment);
            }
        }
    }

    private void U0() {
        ArrayList arrayList = this.f9583l;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.f.a(this.f9583l.get(0));
        throw null;
    }

    private void W(boolean z8) {
        if (this.f9573b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f9589r == null) {
            if (!this.f9564G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f9589r.c().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z8) {
            n();
        }
        if (this.f9566I == null) {
            this.f9566I = new ArrayList();
            this.f9567J = new ArrayList();
        }
        this.f9573b = true;
        try {
            b0(null, null);
        } finally {
            this.f9573b = false;
        }
    }

    static int Y0(int i8) {
        if (i8 == 4097) {
            return x.TRANSIT_FRAGMENT_CLOSE;
        }
        if (i8 == 4099) {
            return x.TRANSIT_FRAGMENT_FADE;
        }
        if (i8 != 8194) {
            return 0;
        }
        return x.TRANSIT_FRAGMENT_OPEN;
    }

    private static void Z(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        while (i8 < i9) {
            C1006a c1006a = (C1006a) arrayList.get(i8);
            if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                c1006a.e(-1);
                c1006a.h(i8 == i9 + (-1));
            } else {
                c1006a.e(1);
                c1006a.g();
            }
            i8++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    private void a0(ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        ?? r12;
        int i10;
        boolean z8;
        int i11;
        int i12;
        ArrayList arrayList3;
        int iP0;
        ArrayList arrayList4;
        int i13;
        boolean z9;
        boolean z10 = ((C1006a) arrayList.get(i8)).f9807r;
        ArrayList arrayList5 = this.f9568K;
        if (arrayList5 == null) {
            this.f9568K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f9568K.addAll(this.f9574c.o());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        boolean z11 = false;
        for (int i14 = i8; i14 < i9; i14++) {
            C1006a c1006a = (C1006a) arrayList.get(i14);
            primaryNavigationFragment = !((Boolean) arrayList2.get(i14)).booleanValue() ? c1006a.i(this.f9568K, primaryNavigationFragment) : c1006a.o(this.f9568K, primaryNavigationFragment);
            z11 = z11 || c1006a.f9798i;
        }
        this.f9568K.clear();
        if (z10 || this.f9588q < 1) {
            r12 = 1;
        } else if (f9557P) {
            for (int i15 = i8; i15 < i9; i15++) {
                Iterator it = ((C1006a) arrayList.get(i15)).f9792c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((x.a) it.next()).f9810b;
                    if (fragment != null && fragment.f9501s != null) {
                        this.f9574c.q(t(fragment));
                    }
                }
            }
            r12 = 1;
        } else {
            r12 = 1;
            y.A(this.f9589r.b(), this.f9590s, arrayList, arrayList2, i8, i9, false, this.f9585n);
        }
        Z(arrayList, arrayList2, i8, i9);
        if (f9557P) {
            boolean zBooleanValue = ((Boolean) arrayList2.get(i9 - 1)).booleanValue();
            for (int i16 = i8; i16 < i9; i16++) {
                C1006a c1006a2 = (C1006a) arrayList.get(i16);
                if (zBooleanValue) {
                    for (int size = c1006a2.f9792c.size() - r12; size >= 0; size--) {
                        Fragment fragment2 = ((x.a) c1006a2.f9792c.get(size)).f9810b;
                        if (fragment2 != null) {
                            t(fragment2).m();
                        }
                    }
                } else {
                    Iterator it2 = c1006a2.f9792c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = ((x.a) it2.next()).f9810b;
                        if (fragment3 != null) {
                            t(fragment3).m();
                        }
                    }
                }
            }
            H0(this.f9588q, r12);
            for (D d9 : q(arrayList, i8, i9)) {
                d9.q(zBooleanValue);
                d9.o();
                d9.g();
            }
            i13 = i9;
            arrayList4 = arrayList2;
        } else {
            if (z10) {
                O.b bVar = new O.b();
                d(bVar);
                i10 = r12;
                z8 = z10;
                i11 = i9;
                i12 = i8;
                arrayList3 = arrayList2;
                iP0 = P0(arrayList, arrayList2, i8, i9, bVar);
                F0(bVar);
            } else {
                i10 = r12;
                z8 = z10;
                i11 = i9;
                i12 = i8;
                arrayList3 = arrayList2;
                iP0 = i11;
            }
            if (iP0 == i12 || !z8) {
                arrayList4 = arrayList3;
                i13 = i11;
            } else {
                if (this.f9588q >= i10) {
                    arrayList4 = arrayList3;
                    int i17 = iP0;
                    i13 = i11;
                    z9 = i10;
                    y.A(this.f9589r.b(), this.f9590s, arrayList, arrayList2, i8, i17, true, this.f9585n);
                } else {
                    arrayList4 = arrayList3;
                    i13 = i11;
                    z9 = i10;
                }
                H0(this.f9588q, z9);
            }
        }
        for (int i18 = i8; i18 < i13; i18++) {
            C1006a c1006a3 = (C1006a) arrayList.get(i18);
            if (((Boolean) arrayList4.get(i18)).booleanValue() && c1006a3.f9630v >= 0) {
                c1006a3.f9630v = -1;
            }
            c1006a3.runOnCommitRunnables();
        }
        if (z11) {
            U0();
        }
    }

    private void b0(ArrayList arrayList, ArrayList arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList arrayList3 = this.f9569L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i8 = 0;
        while (i8 < size) {
            s sVar = (s) this.f9569L.get(i8);
            if (arrayList != null && !sVar.f9625a && (iIndexOf2 = arrayList.indexOf(sVar.f9626b)) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(iIndexOf2)).booleanValue()) {
                this.f9569L.remove(i8);
                i8--;
                size--;
                sVar.a();
            } else if (sVar.isReady() || (arrayList != null && sVar.f9626b.k(arrayList, 0, arrayList.size()))) {
                this.f9569L.remove(i8);
                i8--;
                size--;
                if (arrayList == null || sVar.f9625a || (iIndexOf = arrayList.indexOf(sVar.f9626b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(iIndexOf)).booleanValue()) {
                    sVar.b();
                } else {
                    sVar.a();
                }
            }
            i8++;
        }
    }

    private void d(O.b bVar) {
        int i8 = this.f9588q;
        if (i8 < 1) {
            return;
        }
        int iMin = Math.min(i8, 5);
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment.f9483a < iMin) {
                J0(fragment, iMin);
                if (fragment.f9464H != null && !fragment.f9508z && fragment.f9469M) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private static Fragment e0(View view) {
        while (view != null) {
            Fragment fragmentS0 = s0(view);
            if (fragmentS0 != null) {
                return fragmentS0;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void e1(Fragment fragment) {
        ViewGroup viewGroupL0 = l0(fragment);
        if (viewGroupL0 == null || fragment.h() + fragment.j() + fragment.p() + fragment.q() <= 0) {
            return;
        }
        if (viewGroupL0.getTag(f0.b.visible_removing_fragment_view_tag) == null) {
            viewGroupL0.setTag(f0.b.visible_removing_fragment_view_tag, fragment);
        }
        ((Fragment) viewGroupL0.getTag(f0.b.visible_removing_fragment_view_tag)).l0(fragment.o());
    }

    @Deprecated
    public static void enableDebugLogging(boolean z8) {
        f9556O = z8;
    }

    public static void enableNewStateManager(boolean z8) {
        f9557P = z8;
    }

    private void f0() {
        if (f9557P) {
            Iterator it = p().iterator();
            while (it.hasNext()) {
                ((D) it.next()).k();
            }
        } else if (this.f9569L != null) {
            while (!this.f9569L.isEmpty()) {
                ((s) this.f9569L.remove(0)).b();
            }
        }
    }

    public static <F extends Fragment> F findFragment(View view) {
        F f8 = (F) e0(view);
        if (f8 != null) {
            return f8;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    private boolean g0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f9572a) {
            try {
                if (this.f9572a.isEmpty()) {
                    return false;
                }
                int size = this.f9572a.size();
                boolean zGenerateOps = false;
                for (int i8 = 0; i8 < size; i8++) {
                    zGenerateOps |= ((q) this.f9572a.get(i8)).generateOps(arrayList, arrayList2);
                }
                this.f9572a.clear();
                this.f9589r.c().removeCallbacks(this.f9571N);
                return zGenerateOps;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void g1() {
        Iterator it = this.f9574c.l().iterator();
        while (it.hasNext()) {
            M0((v) it.next());
        }
    }

    private void h1(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C("FragmentManager"));
        androidx.fragment.app.j jVar = this.f9589r;
        if (jVar != null) {
            try {
                jVar.onDump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e8) {
                Log.e("FragmentManager", "Failed dumping state", e8);
                throw runtimeException;
            }
        }
        try {
            dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e9) {
            Log.e("FragmentManager", "Failed dumping state", e9);
            throw runtimeException;
        }
    }

    private void i1() {
        synchronized (this.f9572a) {
            try {
                if (this.f9572a.isEmpty()) {
                    this.f9579h.setEnabled(getBackStackEntryCount() > 0 && A0(this.f9591t));
                } else {
                    this.f9579h.setEnabled(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private androidx.fragment.app.p j0(Fragment fragment) {
        return this.f9570M.i(fragment);
    }

    private void l(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f9584m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.e) it.next()).cancel();
            }
            hashSet.clear();
            u(fragment);
            this.f9584m.remove(fragment);
        }
    }

    private ViewGroup l0(Fragment fragment) {
        ViewGroup viewGroup = fragment.f9463G;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.f9506x > 0 && this.f9590s.onHasView()) {
            View viewOnFindViewById = this.f9590s.onFindViewById(fragment.f9506x);
            if (viewOnFindViewById instanceof ViewGroup) {
                return (ViewGroup) viewOnFindViewById;
            }
        }
        return null;
    }

    private void n() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void o() {
        this.f9573b = false;
        this.f9567J.clear();
        this.f9566I.clear();
    }

    private Set p() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f9574c.l().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((v) it.next()).k().f9463G;
            if (viewGroup != null) {
                hashSet.add(D.n(viewGroup, r0()));
            }
        }
        return hashSet;
    }

    private Set q(ArrayList arrayList, int i8, int i9) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i8 < i9) {
            Iterator it = ((C1006a) arrayList.get(i8)).f9792c.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((x.a) it.next()).f9810b;
                if (fragment != null && (viewGroup = fragment.f9463G) != null) {
                    hashSet.add(D.m(viewGroup, this));
                }
            }
            i8++;
        }
        return hashSet;
    }

    private void s(Fragment fragment) {
        Animator animator;
        if (fragment.f9464H != null) {
            AbstractC1011f.d dVarC = AbstractC1011f.c(this.f9589r.b(), fragment, !fragment.f9508z, fragment.o());
            if (dVarC == null || (animator = dVarC.animator) == null) {
                if (dVarC != null) {
                    fragment.f9464H.startAnimation(dVarC.animation);
                    dVarC.animation.start();
                }
                fragment.f9464H.setVisibility((!fragment.f9508z || fragment.w()) ? 0 : 8);
                if (fragment.w()) {
                    fragment.i0(false);
                }
            } else {
                animator.setTarget(fragment.f9464H);
                if (!fragment.f9508z) {
                    fragment.f9464H.setVisibility(0);
                } else if (fragment.w()) {
                    fragment.i0(false);
                } else {
                    ViewGroup viewGroup = fragment.f9463G;
                    View view = fragment.f9464H;
                    viewGroup.startViewTransition(view);
                    dVarC.animator.addListener(new h(viewGroup, view, fragment));
                }
                dVarC.animator.start();
            }
        }
        w0(fragment);
        fragment.f9470N = false;
        fragment.onHiddenChanged(fragment.f9508z);
    }

    static Fragment s0(View view) {
        Object tag = view.getTag(f0.b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void u(Fragment fragment) {
        fragment.J();
        this.f9586o.n(fragment, false);
        fragment.f9463G = null;
        fragment.f9464H = null;
        fragment.f9476T = null;
        fragment.f9477U.setValue(null);
        fragment.f9497o = false;
    }

    static boolean x0(int i8) {
        return f9556O || Log.isLoggable("FragmentManager", i8);
    }

    private boolean y0(Fragment fragment) {
        return (fragment.f9460D && fragment.f9461E) || fragment.f9503u.m();
    }

    void A() {
        this.f9562E = false;
        this.f9563F = false;
        this.f9570M.q(false);
        Q(1);
    }

    boolean A0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.f9501s;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && A0(fragmentManager.f9591t);
    }

    boolean B(Menu menu, MenuInflater menuInflater) {
        if (this.f9588q < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z8 = false;
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null && z0(fragment) && fragment.G(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z8 = true;
            }
        }
        if (this.f9576e != null) {
            for (int i8 = 0; i8 < this.f9576e.size(); i8++) {
                Fragment fragment2 = (Fragment) this.f9576e.get(i8);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f9576e = arrayList;
        return z8;
    }

    boolean B0(int i8) {
        return this.f9588q >= i8;
    }

    void C() {
        this.f9564G = true;
        X(true);
        U();
        Q(-1);
        this.f9589r = null;
        this.f9590s = null;
        this.f9591t = null;
        if (this.f9578g != null) {
            this.f9579h.remove();
            this.f9578g = null;
        }
        f.d dVar = this.f9597z;
        if (dVar != null) {
            dVar.unregister();
            this.f9558A.unregister();
            this.f9559B.unregister();
        }
    }

    void C0(Fragment fragment, String[] strArr, int i8) {
        if (this.f9559B == null) {
            this.f9589r.onRequestPermissionsFromFragment(fragment, strArr, i8);
            return;
        }
        this.f9560C.addLast(new n(fragment.f9488f, i8));
        this.f9559B.launch(strArr);
    }

    void D() {
        Q(1);
    }

    void D0(Fragment fragment, Intent intent, int i8, Bundle bundle) {
        if (this.f9597z == null) {
            this.f9589r.onStartActivityFromFragment(fragment, intent, i8, bundle);
            return;
        }
        this.f9560C.addLast(new n(fragment.f9488f, i8));
        if (intent != null && bundle != null) {
            intent.putExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
        }
        this.f9597z.launch(intent);
    }

    void E() {
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null) {
                fragment.M();
            }
        }
    }

    void E0(Fragment fragment, IntentSender intentSender, int i8, Intent intent, int i9, int i10, int i11, Bundle bundle) {
        Intent intent2;
        if (this.f9558A == null) {
            this.f9589r.onStartIntentSenderFromFragment(fragment, intentSender, i8, intent, i9, i10, i11, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("ActivityOptions ");
                sb.append(bundle);
                sb.append(" were added to fillInIntent ");
                sb.append(intent2);
                sb.append(" for fragment ");
                sb.append(fragment);
            }
            intent2.putExtra(g.c.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
        } else {
            intent2 = intent;
        }
        f.h hVarBuild = new h.a(intentSender).setFillInIntent(intent2).setFlags(i10, i9).build();
        this.f9560C.addLast(new n(fragment.f9488f, i8));
        if (x0(2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Fragment ");
            sb2.append(fragment);
            sb2.append("is launching an IntentSender for result ");
        }
        this.f9558A.launch(hVarBuild);
    }

    void F(boolean z8) {
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null) {
                fragment.N(z8);
            }
        }
    }

    void G(Fragment fragment) {
        Iterator it = this.f9587p.iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.q) it.next()).onAttachFragment(this, fragment);
        }
    }

    void G0(Fragment fragment) {
        if (!this.f9574c.c(fragment.f9488f)) {
            if (x0(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.f9588q);
                sb.append("since it is not added to ");
                sb.append(this);
                return;
            }
            return;
        }
        I0(fragment);
        View view = fragment.f9464H;
        if (view != null && fragment.f9469M && fragment.f9463G != null) {
            float f8 = fragment.f9471O;
            if (f8 > 0.0f) {
                view.setAlpha(f8);
            }
            fragment.f9471O = 0.0f;
            fragment.f9469M = false;
            AbstractC1011f.d dVarC = AbstractC1011f.c(this.f9589r.b(), fragment, true, fragment.o());
            if (dVarC != null) {
                Animation animation = dVarC.animation;
                if (animation != null) {
                    fragment.f9464H.startAnimation(animation);
                } else {
                    dVarC.animator.setTarget(fragment.f9464H);
                    dVarC.animator.start();
                }
            }
        }
        if (fragment.f9470N) {
            s(fragment);
        }
    }

    boolean H(MenuItem menuItem) {
        if (this.f9588q < 1) {
            return false;
        }
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null && fragment.O(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void H0(int i8, boolean z8) {
        androidx.fragment.app.j jVar;
        if (this.f9589r == null && i8 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z8 || i8 != this.f9588q) {
            this.f9588q = i8;
            if (f9557P) {
                this.f9574c.s();
            } else {
                Iterator it = this.f9574c.o().iterator();
                while (it.hasNext()) {
                    G0((Fragment) it.next());
                }
                for (v vVar : this.f9574c.l()) {
                    Fragment fragmentK = vVar.k();
                    if (!fragmentK.f9469M) {
                        G0(fragmentK);
                    }
                    if (fragmentK.f9495m && !fragmentK.x()) {
                        this.f9574c.r(vVar);
                    }
                }
            }
            g1();
            if (this.f9561D && (jVar = this.f9589r) != null && this.f9588q == 7) {
                jVar.onSupportInvalidateOptionsMenu();
                this.f9561D = false;
            }
        }
    }

    void I(Menu menu) {
        if (this.f9588q < 1) {
            return;
        }
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null) {
                fragment.P(menu);
            }
        }
    }

    void I0(Fragment fragment) {
        J0(fragment, this.f9588q);
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void J0(androidx.fragment.app.Fragment r10, int r11) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.J0(androidx.fragment.app.Fragment, int):void");
    }

    void K() {
        Q(5);
    }

    void K0() {
        if (this.f9589r == null) {
            return;
        }
        this.f9562E = false;
        this.f9563F = false;
        this.f9570M.q(false);
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null) {
                fragment.A();
            }
        }
    }

    void L(boolean z8) {
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null) {
                fragment.R(z8);
            }
        }
    }

    void L0(FragmentContainerView fragmentContainerView) {
        View view;
        for (v vVar : this.f9574c.l()) {
            Fragment fragmentK = vVar.k();
            if (fragmentK.f9506x == fragmentContainerView.getId() && (view = fragmentK.f9464H) != null && view.getParent() == null) {
                fragmentK.f9463G = fragmentContainerView;
                vVar.b();
            }
        }
    }

    boolean M(Menu menu) {
        boolean z8 = false;
        if (this.f9588q < 1) {
            return false;
        }
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null && z0(fragment) && fragment.S(menu)) {
                z8 = true;
            }
        }
        return z8;
    }

    void M0(v vVar) {
        Fragment fragmentK = vVar.k();
        if (fragmentK.f9465I) {
            if (this.f9573b) {
                this.f9565H = true;
                return;
            }
            fragmentK.f9465I = false;
            if (f9557P) {
                vVar.m();
            } else {
                I0(fragmentK);
            }
        }
    }

    void N() {
        i1();
        J(this.f9592u);
    }

    void O() {
        this.f9562E = false;
        this.f9563F = false;
        this.f9570M.q(false);
        Q(7);
    }

    boolean O0(ArrayList arrayList, ArrayList arrayList2, String str, int i8, int i9) {
        int i10;
        ArrayList arrayList3 = this.f9575d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i8 < 0 && (i9 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f9575d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i8 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C1006a c1006a = (C1006a) this.f9575d.get(size2);
                    if ((str != null && str.equals(c1006a.getName())) || (i8 >= 0 && i8 == c1006a.f9630v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i9 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C1006a c1006a2 = (C1006a) this.f9575d.get(size2);
                        if (str == null || !str.equals(c1006a2.getName())) {
                            if (i8 < 0 || i8 != c1006a2.f9630v) {
                                break;
                            }
                        }
                    }
                }
                i10 = size2;
            } else {
                i10 = -1;
            }
            if (i10 == this.f9575d.size() - 1) {
                return false;
            }
            for (int size3 = this.f9575d.size() - 1; size3 > i10; size3--) {
                arrayList.add(this.f9575d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void P() {
        this.f9562E = false;
        this.f9563F = false;
        this.f9570M.q(false);
        Q(5);
    }

    void Q0(Fragment fragment, androidx.core.os.e eVar) {
        HashSet hashSet = (HashSet) this.f9584m.get(fragment);
        if (hashSet != null && hashSet.remove(eVar) && hashSet.isEmpty()) {
            this.f9584m.remove(fragment);
            if (fragment.f9483a < 5) {
                u(fragment);
                I0(fragment);
            }
        }
    }

    void R() {
        this.f9563F = true;
        this.f9570M.q(true);
        Q(4);
    }

    void R0(Fragment fragment) {
        if (x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.f9500r);
        }
        boolean zX = fragment.x();
        if (fragment.f9457A && zX) {
            return;
        }
        this.f9574c.t(fragment);
        if (y0(fragment)) {
            this.f9561D = true;
        }
        fragment.f9495m = true;
        e1(fragment);
    }

    void S() {
        Q(2);
    }

    void T0(Fragment fragment) {
        this.f9570M.o(fragment);
    }

    void V(q qVar, boolean z8) {
        if (!z8) {
            if (this.f9589r == null) {
                if (!this.f9564G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            n();
        }
        synchronized (this.f9572a) {
            try {
                if (this.f9589r == null) {
                    if (!z8) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9572a.add(qVar);
                    a1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void V0(Parcelable parcelable, androidx.fragment.app.n nVar) {
        if (this.f9589r instanceof N) {
            h1(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f9570M.p(nVar);
        W0(parcelable);
    }

    void W0(Parcelable parcelable) {
        v vVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.o oVar = (androidx.fragment.app.o) parcelable;
        if (oVar.f9745a == null) {
            return;
        }
        this.f9574c.u();
        Iterator it = oVar.f9745a.iterator();
        while (it.hasNext()) {
            u uVar = (u) it.next();
            if (uVar != null) {
                Fragment fragmentH = this.f9570M.h(uVar.f9767b);
                if (fragmentH != null) {
                    if (x0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: re-attaching retained ");
                        sb.append(fragmentH);
                    }
                    vVar = new v(this.f9586o, this.f9574c, fragmentH, uVar);
                } else {
                    vVar = new v(this.f9586o, this.f9574c, this.f9589r.b().getClassLoader(), getFragmentFactory(), uVar);
                }
                Fragment fragmentK = vVar.k();
                fragmentK.f9501s = this;
                if (x0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("restoreSaveState: active (");
                    sb2.append(fragmentK.f9488f);
                    sb2.append("): ");
                    sb2.append(fragmentK);
                }
                vVar.o(this.f9589r.b().getClassLoader());
                this.f9574c.q(vVar);
                vVar.u(this.f9588q);
            }
        }
        for (Fragment fragment : this.f9570M.k()) {
            if (!this.f9574c.c(fragment.f9488f)) {
                if (x0(2)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Discarding retained Fragment ");
                    sb3.append(fragment);
                    sb3.append(" that was not found in the set of active Fragments ");
                    sb3.append(oVar.f9745a);
                }
                this.f9570M.o(fragment);
                fragment.f9501s = this;
                v vVar2 = new v(this.f9586o, this.f9574c, fragment);
                vVar2.u(1);
                vVar2.m();
                fragment.f9495m = true;
                vVar2.m();
            }
        }
        this.f9574c.v(oVar.f9746b);
        if (oVar.f9747c != null) {
            this.f9575d = new ArrayList(oVar.f9747c.length);
            int i8 = 0;
            while (true) {
                C1007b[] c1007bArr = oVar.f9747c;
                if (i8 >= c1007bArr.length) {
                    break;
                }
                C1006a c1006aInstantiate = c1007bArr[i8].instantiate(this);
                if (x0(2)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("restoreAllState: back stack #");
                    sb4.append(i8);
                    sb4.append(" (index ");
                    sb4.append(c1006aInstantiate.f9630v);
                    sb4.append("): ");
                    sb4.append(c1006aInstantiate);
                    PrintWriter printWriter = new PrintWriter(new C("FragmentManager"));
                    c1006aInstantiate.dump("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9575d.add(c1006aInstantiate);
                i8++;
            }
        } else {
            this.f9575d = null;
        }
        this.f9580i.set(oVar.f9748d);
        String str = oVar.f9749e;
        if (str != null) {
            Fragment fragmentC0 = c0(str);
            this.f9592u = fragmentC0;
            J(fragmentC0);
        }
        ArrayList arrayList = oVar.f9750f;
        if (arrayList != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                Bundle bundle = (Bundle) oVar.f9751g.get(i9);
                bundle.setClassLoader(this.f9589r.b().getClassLoader());
                this.f9581j.put(arrayList.get(i9), bundle);
            }
        }
        this.f9560C = new ArrayDeque(oVar.f9752h);
    }

    boolean X(boolean z8) {
        W(z8);
        boolean z9 = false;
        while (g0(this.f9566I, this.f9567J)) {
            z9 = true;
            this.f9573b = true;
            try {
                S0(this.f9566I, this.f9567J);
            } finally {
                o();
            }
        }
        i1();
        T();
        this.f9574c.b();
        return z9;
    }

    androidx.fragment.app.n X0() {
        if (this.f9589r instanceof N) {
            h1(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f9570M.l();
    }

    void Y(q qVar, boolean z8) {
        if (z8 && (this.f9589r == null || this.f9564G)) {
            return;
        }
        W(z8);
        if (qVar.generateOps(this.f9566I, this.f9567J)) {
            this.f9573b = true;
            try {
                S0(this.f9566I, this.f9567J);
            } finally {
                o();
            }
        }
        i1();
        T();
        this.f9574c.b();
    }

    Parcelable Z0() {
        int size;
        f0();
        U();
        X(true);
        this.f9562E = true;
        this.f9570M.q(true);
        ArrayList arrayListW = this.f9574c.w();
        C1007b[] c1007bArr = null;
        if (arrayListW.isEmpty()) {
            x0(2);
            return null;
        }
        ArrayList arrayListX = this.f9574c.x();
        ArrayList arrayList = this.f9575d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            c1007bArr = new C1007b[size];
            for (int i8 = 0; i8 < size; i8++) {
                c1007bArr[i8] = new C1007b((C1006a) this.f9575d.get(i8));
                if (x0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding back stack #");
                    sb.append(i8);
                    sb.append(": ");
                    sb.append(this.f9575d.get(i8));
                }
            }
        }
        androidx.fragment.app.o oVar = new androidx.fragment.app.o();
        oVar.f9745a = arrayListW;
        oVar.f9746b = arrayListX;
        oVar.f9747c = c1007bArr;
        oVar.f9748d = this.f9580i.get();
        Fragment fragment = this.f9592u;
        if (fragment != null) {
            oVar.f9749e = fragment.f9488f;
        }
        oVar.f9750f.addAll(this.f9581j.keySet());
        oVar.f9751g.addAll(this.f9581j.values());
        oVar.f9752h = new ArrayList(this.f9560C);
        return oVar;
    }

    void a1() {
        synchronized (this.f9572a) {
            try {
                ArrayList arrayList = this.f9569L;
                boolean z8 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                boolean z9 = this.f9572a.size() == 1;
                if (z8 || z9) {
                    this.f9589r.c().removeCallbacks(this.f9571N);
                    this.f9589r.c().post(this.f9571N);
                    i1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void addFragmentOnAttachListener(androidx.fragment.app.q qVar) {
        this.f9587p.add(qVar);
    }

    public void addOnBackStackChangedListener(p pVar) {
        if (this.f9583l == null) {
            this.f9583l = new ArrayList();
        }
        this.f9583l.add(pVar);
    }

    void b1(Fragment fragment, boolean z8) {
        ViewGroup viewGroupL0 = l0(fragment);
        if (viewGroupL0 == null || !(viewGroupL0 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupL0).setDrawDisappearingViewsLast(!z8);
    }

    public x beginTransaction() {
        return new C1006a(this);
    }

    Fragment c0(String str) {
        return this.f9574c.f(str);
    }

    void c1(Fragment fragment, AbstractC1019h.b bVar) {
        if (fragment.equals(c0(fragment.f9488f)) && (fragment.f9502t == null || fragment.f9501s == this)) {
            fragment.f9474R = bVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    @Override // androidx.fragment.app.t
    public final void clearFragmentResult(String str) {
        this.f9581j.remove(str);
    }

    @Override // androidx.fragment.app.t
    public final void clearFragmentResultListener(String str) {
        o oVar = (o) this.f9582k.remove(str);
        if (oVar != null) {
            oVar.removeObserver();
        }
    }

    Fragment d0(String str) {
        return this.f9574c.i(str);
    }

    void d1(Fragment fragment) {
        if (fragment == null || (fragment.equals(c0(fragment.f9488f)) && (fragment.f9502t == null || fragment.f9501s == this))) {
            Fragment fragment2 = this.f9592u;
            this.f9592u = fragment;
            J(fragment2);
            J(this.f9592u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f9574c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f9576e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size2; i8++) {
                Fragment fragment = (Fragment) this.f9576e.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f9575d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size; i9++) {
                C1006a c1006a = (C1006a) this.f9575d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c1006a.toString());
                c1006a.dump(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9580i.get());
        synchronized (this.f9572a) {
            try {
                int size3 = this.f9572a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size3; i10++) {
                        q qVar = (q) this.f9572a.get(i10);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i10);
                        printWriter.print(": ");
                        printWriter.println(qVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9589r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9590s);
        if (this.f9591t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9591t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9588q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9562E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9563F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9564G);
        if (this.f9561D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9561D);
        }
    }

    void e(C1006a c1006a) {
        if (this.f9575d == null) {
            this.f9575d = new ArrayList();
        }
        this.f9575d.add(c1006a);
    }

    public boolean executePendingTransactions() {
        boolean zX = X(true);
        f0();
        return zX;
    }

    void f(Fragment fragment, androidx.core.os.e eVar) {
        if (this.f9584m.get(fragment) == null) {
            this.f9584m.put(fragment, new HashSet());
        }
        ((HashSet) this.f9584m.get(fragment)).add(eVar);
    }

    void f1(Fragment fragment) {
        if (x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
        }
        if (fragment.f9508z) {
            fragment.f9508z = false;
            fragment.f9470N = !fragment.f9470N;
        }
    }

    public Fragment findFragmentById(int i8) {
        return this.f9574c.g(i8);
    }

    public Fragment findFragmentByTag(String str) {
        return this.f9574c.h(str);
    }

    v g(Fragment fragment) {
        if (x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
        }
        v vVarT = t(fragment);
        fragment.f9501s = this;
        this.f9574c.q(vVarT);
        if (!fragment.f9457A) {
            this.f9574c.a(fragment);
            fragment.f9495m = false;
            if (fragment.f9464H == null) {
                fragment.f9470N = false;
            }
            if (y0(fragment)) {
                this.f9561D = true;
            }
        }
        return vVarT;
    }

    public k getBackStackEntryAt(int i8) {
        return (k) this.f9575d.get(i8);
    }

    public int getBackStackEntryCount() {
        ArrayList arrayList = this.f9575d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public Fragment getFragment(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentC0 = c0(string);
        if (fragmentC0 == null) {
            h1(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentC0;
    }

    public androidx.fragment.app.i getFragmentFactory() {
        androidx.fragment.app.i iVar = this.f9593v;
        if (iVar != null) {
            return iVar;
        }
        Fragment fragment = this.f9591t;
        return fragment != null ? fragment.f9501s.getFragmentFactory() : this.f9594w;
    }

    public List<Fragment> getFragments() {
        return this.f9574c.o();
    }

    public Fragment getPrimaryNavigationFragment() {
        return this.f9592u;
    }

    void h(Fragment fragment) {
        this.f9570M.f(fragment);
    }

    int h0() {
        return this.f9574c.k();
    }

    int i() {
        return this.f9580i.getAndIncrement();
    }

    List i0() {
        return this.f9574c.m();
    }

    public boolean isDestroyed() {
        return this.f9564G;
    }

    public boolean isStateSaved() {
        return this.f9562E || this.f9563F;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void j(androidx.fragment.app.j jVar, androidx.fragment.app.g gVar, Fragment fragment) {
        String str;
        if (this.f9589r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f9589r = jVar;
        this.f9590s = gVar;
        this.f9591t = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new i(fragment));
        } else if (jVar instanceof androidx.fragment.app.q) {
            addFragmentOnAttachListener((androidx.fragment.app.q) jVar);
        }
        if (this.f9591t != null) {
            i1();
        }
        if (jVar instanceof androidx.activity.t) {
            androidx.activity.t tVar = (androidx.activity.t) jVar;
            OnBackPressedDispatcher onBackPressedDispatcher = tVar.getOnBackPressedDispatcher();
            this.f9578g = onBackPressedDispatcher;
            InterfaceC1025n interfaceC1025n = tVar;
            if (fragment != null) {
                interfaceC1025n = fragment;
            }
            onBackPressedDispatcher.addCallback(interfaceC1025n, this.f9579h);
        }
        if (fragment != null) {
            this.f9570M = fragment.f9501s.j0(fragment);
        } else if (jVar instanceof N) {
            this.f9570M = androidx.fragment.app.p.j(((N) jVar).getViewModelStore());
        } else {
            this.f9570M = new androidx.fragment.app.p(false);
        }
        this.f9570M.q(isStateSaved());
        this.f9574c.y(this.f9570M);
        Object obj = this.f9589r;
        if (obj instanceof f.g) {
            f.f activityResultRegistry = ((f.g) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.f9488f + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f9597z = activityResultRegistry.register(str2 + "StartActivityForResult", new g.c(), new j());
            this.f9558A = activityResultRegistry.register(str2 + "StartIntentSenderForResult", new l(), new a());
            this.f9559B = activityResultRegistry.register(str2 + "RequestPermissions", new C5531b(), new b());
        }
    }

    void k(Fragment fragment) {
        if (x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
        }
        if (fragment.f9457A) {
            fragment.f9457A = false;
            if (fragment.f9494l) {
                return;
            }
            this.f9574c.a(fragment);
            if (x0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("add from attach: ");
                sb2.append(fragment);
            }
            if (y0(fragment)) {
                this.f9561D = true;
            }
        }
    }

    androidx.fragment.app.g k0() {
        return this.f9590s;
    }

    boolean m() {
        boolean zY0 = false;
        for (Fragment fragment : this.f9574c.m()) {
            if (fragment != null) {
                zY0 = y0(fragment);
            }
            if (zY0) {
                return true;
            }
        }
        return false;
    }

    w m0() {
        return this.f9574c;
    }

    androidx.fragment.app.j n0() {
        return this.f9589r;
    }

    LayoutInflater.Factory2 o0() {
        return this.f9577f;
    }

    @Deprecated
    public x openTransaction() {
        return beginTransaction();
    }

    androidx.fragment.app.l p0() {
        return this.f9586o;
    }

    public void popBackStack() {
        V(new r(null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return N0(null, -1, 0);
    }

    public void putFragment(Bundle bundle, String str, Fragment fragment) {
        if (fragment.f9501s != this) {
            h1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.f9488f);
    }

    Fragment q0() {
        return this.f9591t;
    }

    void r(C1006a c1006a, boolean z8, boolean z9, boolean z10) {
        if (z8) {
            c1006a.h(z10);
        } else {
            c1006a.g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c1006a);
        arrayList2.add(Boolean.valueOf(z8));
        if (z9 && this.f9588q >= 1) {
            y.A(this.f9589r.b(), this.f9590s, arrayList, arrayList2, 0, 1, true, this.f9585n);
        }
        if (z10) {
            H0(this.f9588q, true);
        }
        for (Fragment fragment : this.f9574c.m()) {
            if (fragment != null && fragment.f9464H != null && fragment.f9469M && c1006a.j(fragment.f9506x)) {
                float f8 = fragment.f9471O;
                if (f8 > 0.0f) {
                    fragment.f9464H.setAlpha(f8);
                }
                if (z10) {
                    fragment.f9471O = 0.0f;
                } else {
                    fragment.f9471O = -1.0f;
                    fragment.f9469M = false;
                }
            }
        }
    }

    E r0() {
        E e8 = this.f9595x;
        if (e8 != null) {
            return e8;
        }
        Fragment fragment = this.f9591t;
        return fragment != null ? fragment.f9501s.r0() : this.f9596y;
    }

    public void registerFragmentLifecycleCallbacks(m mVar, boolean z8) {
        this.f9586o.registerFragmentLifecycleCallbacks(mVar, z8);
    }

    public void removeFragmentOnAttachListener(androidx.fragment.app.q qVar) {
        this.f9587p.remove(qVar);
    }

    public void removeOnBackStackChangedListener(p pVar) {
        ArrayList arrayList = this.f9583l;
        if (arrayList != null) {
            arrayList.remove(pVar);
        }
    }

    public Fragment.m saveFragmentInstanceState(Fragment fragment) {
        v vVarN = this.f9574c.n(fragment.f9488f);
        if (vVarN == null || !vVarN.k().equals(fragment)) {
            h1(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return vVarN.r();
    }

    public void setFragmentFactory(androidx.fragment.app.i iVar) {
        this.f9593v = iVar;
    }

    @Override // androidx.fragment.app.t
    public final void setFragmentResult(String str, Bundle bundle) {
        o oVar = (o) this.f9582k.get(str);
        if (oVar == null || !oVar.isAtLeast(AbstractC1019h.b.STARTED)) {
            this.f9581j.put(str, bundle);
        } else {
            oVar.onFragmentResult(str, bundle);
        }
    }

    @Override // androidx.fragment.app.t
    public final void setFragmentResultListener(String str, InterfaceC1025n interfaceC1025n, androidx.fragment.app.s sVar) {
        AbstractC1019h lifecycle = interfaceC1025n.getLifecycle();
        if (lifecycle.getCurrentState() == AbstractC1019h.b.DESTROYED) {
            return;
        }
        AnonymousClass6 anonymousClass6 = new InterfaceC1023l() { // from class: androidx.fragment.app.FragmentManager.6

            /* renamed from: a */
            final /* synthetic */ String f9598a;

            /* renamed from: b */
            final /* synthetic */ androidx.fragment.app.s f9599b;

            /* renamed from: c */
            final /* synthetic */ AbstractC1019h f9600c;

            AnonymousClass6(String str2, androidx.fragment.app.s sVar2, AbstractC1019h lifecycle2) {
                str = str2;
                sVar = sVar2;
                abstractC1019h = lifecycle2;
            }

            @Override // androidx.lifecycle.InterfaceC1023l
            public void onStateChanged(InterfaceC1025n interfaceC1025n2, AbstractC1019h.a aVar) {
                Bundle bundle;
                if (aVar == AbstractC1019h.a.ON_START && (bundle = (Bundle) FragmentManager.this.f9581j.get(str)) != null) {
                    sVar.onFragmentResult(str, bundle);
                    FragmentManager.this.clearFragmentResult(str);
                }
                if (aVar == AbstractC1019h.a.ON_DESTROY) {
                    abstractC1019h.removeObserver(this);
                    FragmentManager.this.f9582k.remove(str);
                }
            }
        };
        lifecycle2.addObserver(anonymousClass6);
        o oVar = (o) this.f9582k.put(str2, new o(lifecycle2, sVar2, anonymousClass6));
        if (oVar != null) {
            oVar.removeObserver();
        }
    }

    v t(Fragment fragment) {
        v vVarN = this.f9574c.n(fragment.f9488f);
        if (vVarN != null) {
            return vVarN;
        }
        v vVar = new v(this.f9586o, this.f9574c, fragment);
        vVar.o(this.f9589r.b().getClassLoader());
        vVar.u(this.f9588q);
        return vVar;
    }

    M t0(Fragment fragment) {
        return this.f9570M.m(fragment);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f9591t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9591t)));
            sb.append("}");
        } else {
            androidx.fragment.app.j jVar = this.f9589r;
            if (jVar != null) {
                sb.append(jVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f9589r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    void u0() {
        X(true);
        if (this.f9579h.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.f9578g.onBackPressed();
        }
    }

    public void unregisterFragmentLifecycleCallbacks(m mVar) {
        this.f9586o.unregisterFragmentLifecycleCallbacks(mVar);
    }

    void v(Fragment fragment) {
        if (x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
        }
        if (fragment.f9457A) {
            return;
        }
        fragment.f9457A = true;
        if (fragment.f9494l) {
            if (x0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("remove from detach: ");
                sb2.append(fragment);
            }
            this.f9574c.t(fragment);
            if (y0(fragment)) {
                this.f9561D = true;
            }
            e1(fragment);
        }
    }

    void v0(Fragment fragment) {
        if (x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
        }
        if (fragment.f9508z) {
            return;
        }
        fragment.f9508z = true;
        fragment.f9470N = true ^ fragment.f9470N;
        e1(fragment);
    }

    void w() {
        this.f9562E = false;
        this.f9563F = false;
        this.f9570M.q(false);
        Q(4);
    }

    void w0(Fragment fragment) {
        if (fragment.f9494l && y0(fragment)) {
            this.f9561D = true;
        }
    }

    void x() {
        this.f9562E = false;
        this.f9563F = false;
        this.f9570M.q(false);
        Q(0);
    }

    void y(Configuration configuration) {
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null) {
                fragment.D(configuration);
            }
        }
    }

    boolean z(MenuItem menuItem) {
        if (this.f9588q < 1) {
            return false;
        }
        for (Fragment fragment : this.f9574c.o()) {
            if (fragment != null && fragment.E(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean z0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    public void popBackStack(String str, int i8) {
        V(new r(str, -1, i8), false);
    }

    public boolean popBackStackImmediate(String str, int i8) {
        return N0(str, -1, i8);
    }

    static class n implements Parcelable {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a */
        String f9616a;

        /* renamed from: b */
        int f9617b;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public n createFromParcel(Parcel parcel) {
                return new n(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public n[] newArray(int i8) {
                return new n[i8];
            }
        }

        n(String str, int i8) {
            this.f9616a = str;
            this.f9617b = i8;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f9616a);
            parcel.writeInt(this.f9617b);
        }

        n(Parcel parcel) {
            this.f9616a = parcel.readString();
            this.f9617b = parcel.readInt();
        }
    }

    public void popBackStack(int i8, int i9) {
        if (i8 >= 0) {
            V(new r(null, i8, i9), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }

    public boolean popBackStackImmediate(int i8, int i9) {
        if (i8 >= 0) {
            return N0(null, i8, i9);
        }
        throw new IllegalArgumentException("Bad id: " + i8);
    }
}
