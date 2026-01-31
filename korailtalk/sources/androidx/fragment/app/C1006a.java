package androidx.fragment.app;

import Q7.X;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.x;
import androidx.lifecycle.AbstractC1019h;
import java.io.PrintWriter;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes.dex */
final class C1006a extends x implements FragmentManager.k, FragmentManager.q {

    /* renamed from: t */
    final FragmentManager f9628t;

    /* renamed from: u */
    boolean f9629u;

    /* renamed from: v */
    int f9630v;

    C1006a(FragmentManager fragmentManager) {
        super(fragmentManager.getFragmentFactory(), fragmentManager.n0() != null ? fragmentManager.n0().b().getClassLoader() : null);
        this.f9630v = -1;
        this.f9628t = fragmentManager;
    }

    private static boolean l(x.a aVar) {
        Fragment fragment = aVar.f9810b;
        return (fragment == null || !fragment.f9494l || fragment.f9464H == null || fragment.f9457A || fragment.f9508z || !fragment.y()) ? false : true;
    }

    @Override // androidx.fragment.app.x
    public int commit() {
        return f(false);
    }

    @Override // androidx.fragment.app.x
    public int commitAllowingStateLoss() {
        return f(true);
    }

    @Override // androidx.fragment.app.x
    public void commitNow() {
        disallowAddToBackStack();
        this.f9628t.Y(this, false);
    }

    @Override // androidx.fragment.app.x
    public void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.f9628t.Y(this, true);
    }

    @Override // androidx.fragment.app.x
    void d(int i8, Fragment fragment, String str, int i9) {
        super.d(i8, fragment, str, i9);
        fragment.f9501s = this.f9628t;
    }

    @Override // androidx.fragment.app.x
    public x detach(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f9501s;
        if (fragmentManager == null || fragmentManager == this.f9628t) {
            return super.detach(fragment);
        }
        throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void dump(String str, PrintWriter printWriter) {
        dump(str, printWriter, true);
    }

    void e(int i8) {
        if (this.f9798i) {
            if (FragmentManager.x0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i8);
            }
            int size = this.f9792c.size();
            for (int i9 = 0; i9 < size; i9++) {
                x.a aVar = (x.a) this.f9792c.get(i9);
                Fragment fragment = aVar.f9810b;
                if (fragment != null) {
                    fragment.f9500r += i8;
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f9810b);
                        sb2.append(" to ");
                        sb2.append(aVar.f9810b.f9500r);
                    }
                }
            }
        }
    }

    int f(boolean z8) {
        if (this.f9629u) {
            throw new IllegalStateException("commit already called");
        }
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Commit: ");
            sb.append(this);
            PrintWriter printWriter = new PrintWriter(new C("FragmentManager"));
            dump("  ", printWriter);
            printWriter.close();
        }
        this.f9629u = true;
        if (this.f9798i) {
            this.f9630v = this.f9628t.i();
        } else {
            this.f9630v = -1;
        }
        this.f9628t.V(this, z8);
        return this.f9630v;
    }

    void g() {
        int size = this.f9792c.size();
        for (int i8 = 0; i8 < size; i8++) {
            x.a aVar = (x.a) this.f9792c.get(i8);
            Fragment fragment = aVar.f9810b;
            if (fragment != null) {
                fragment.l0(false);
                fragment.j0(this.f9797h);
                fragment.n0(this.f9805p, this.f9806q);
            }
            switch (aVar.f9809a) {
                case 1:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.b1(fragment, false);
                    this.f9628t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9809a);
                case 3:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.R0(fragment);
                    break;
                case 4:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.v0(fragment);
                    break;
                case 5:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.b1(fragment, false);
                    this.f9628t.f1(fragment);
                    break;
                case 6:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.v(fragment);
                    break;
                case 7:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.b1(fragment, false);
                    this.f9628t.k(fragment);
                    break;
                case 8:
                    this.f9628t.d1(fragment);
                    break;
                case 9:
                    this.f9628t.d1(null);
                    break;
                case 10:
                    this.f9628t.c1(fragment, aVar.f9816h);
                    break;
            }
            if (!this.f9807r && aVar.f9809a != 1 && fragment != null && !FragmentManager.f9557P) {
                this.f9628t.G0(fragment);
            }
        }
        if (this.f9807r || FragmentManager.f9557P) {
            return;
        }
        FragmentManager fragmentManager = this.f9628t;
        fragmentManager.H0(fragmentManager.f9588q, true);
    }

    @Override // androidx.fragment.app.FragmentManager.q
    public boolean generateOps(ArrayList<C1006a> arrayList, ArrayList<Boolean> arrayList2) {
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f9798i) {
            return true;
        }
        this.f9628t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public CharSequence getBreadCrumbShortTitle() {
        return this.f9803n != 0 ? this.f9628t.n0().b().getText(this.f9803n) : this.f9804o;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getBreadCrumbShortTitleRes() {
        return this.f9803n;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public CharSequence getBreadCrumbTitle() {
        return this.f9801l != 0 ? this.f9628t.n0().b().getText(this.f9801l) : this.f9802m;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getBreadCrumbTitleRes() {
        return this.f9801l;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public int getId() {
        return this.f9630v;
    }

    @Override // androidx.fragment.app.FragmentManager.k
    public String getName() {
        return this.f9800k;
    }

    void h(boolean z8) {
        for (int size = this.f9792c.size() - 1; size >= 0; size--) {
            x.a aVar = (x.a) this.f9792c.get(size);
            Fragment fragment = aVar.f9810b;
            if (fragment != null) {
                fragment.l0(true);
                fragment.j0(FragmentManager.Y0(this.f9797h));
                fragment.n0(this.f9806q, this.f9805p);
            }
            switch (aVar.f9809a) {
                case 1:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.b1(fragment, true);
                    this.f9628t.R0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f9809a);
                case 3:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.g(fragment);
                    break;
                case 4:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.f1(fragment);
                    break;
                case 5:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.b1(fragment, true);
                    this.f9628t.v0(fragment);
                    break;
                case 6:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.k(fragment);
                    break;
                case 7:
                    fragment.f0(aVar.f9811c, aVar.f9812d, aVar.f9813e, aVar.f9814f);
                    this.f9628t.b1(fragment, true);
                    this.f9628t.v(fragment);
                    break;
                case 8:
                    this.f9628t.d1(null);
                    break;
                case 9:
                    this.f9628t.d1(fragment);
                    break;
                case 10:
                    this.f9628t.c1(fragment, aVar.f9815g);
                    break;
            }
            if (!this.f9807r && aVar.f9809a != 3 && fragment != null && !FragmentManager.f9557P) {
                this.f9628t.G0(fragment);
            }
        }
        if (this.f9807r || !z8 || FragmentManager.f9557P) {
            return;
        }
        FragmentManager fragmentManager = this.f9628t;
        fragmentManager.H0(fragmentManager.f9588q, true);
    }

    @Override // androidx.fragment.app.x
    public x hide(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f9501s;
        if (fragmentManager == null || fragmentManager == this.f9628t) {
            return super.hide(fragment);
        }
        throw new IllegalStateException("Cannot hide Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment i(java.util.ArrayList r17, androidx.fragment.app.Fragment r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f9792c
            int r5 = r5.size()
            if (r4 >= r5) goto Lba
            java.util.ArrayList r5 = r0.f9792c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.x$a r5 = (androidx.fragment.app.x.a) r5
            int r6 = r5.f9809a
            r7 = 1
            if (r6 == r7) goto Lb2
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L58
            if (r6 == r10) goto L41
            r8 = 6
            if (r6 == r8) goto L41
            r8 = 7
            if (r6 == r8) goto Lb2
            r8 = 8
            if (r6 == r8) goto L31
            goto Lb7
        L31:
            java.util.ArrayList r6 = r0.f9792c
            androidx.fragment.app.x$a r8 = new androidx.fragment.app.x$a
            r8.<init>(r11, r3)
            r6.add(r4, r8)
            int r4 = r4 + 1
            androidx.fragment.app.Fragment r3 = r5.f9810b
            goto Lb7
        L41:
            androidx.fragment.app.Fragment r6 = r5.f9810b
            r1.remove(r6)
            androidx.fragment.app.Fragment r5 = r5.f9810b
            if (r5 != r3) goto Lb7
            java.util.ArrayList r3 = r0.f9792c
            androidx.fragment.app.x$a r6 = new androidx.fragment.app.x$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lb7
        L58:
            androidx.fragment.app.Fragment r6 = r5.f9810b
            int r8 = r6.f9506x
            int r12 = r17.size()
            int r12 = r12 - r7
            r13 = 0
        L62:
            if (r12 < 0) goto La2
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.Fragment r14 = (androidx.fragment.app.Fragment) r14
            int r15 = r14.f9506x
            if (r15 != r8) goto L9f
            if (r14 != r6) goto L72
            r13 = r7
            goto L9f
        L72:
            if (r14 != r3) goto L81
            java.util.ArrayList r3 = r0.f9792c
            androidx.fragment.app.x$a r15 = new androidx.fragment.app.x$a
            r15.<init>(r11, r14)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L81:
            androidx.fragment.app.x$a r15 = new androidx.fragment.app.x$a
            r15.<init>(r10, r14)
            int r2 = r5.f9811c
            r15.f9811c = r2
            int r2 = r5.f9813e
            r15.f9813e = r2
            int r2 = r5.f9812d
            r15.f9812d = r2
            int r2 = r5.f9814f
            r15.f9814f = r2
            java.util.ArrayList r2 = r0.f9792c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        L9f:
            int r12 = r12 + (-1)
            goto L62
        La2:
            if (r13 == 0) goto Lac
            java.util.ArrayList r2 = r0.f9792c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lb7
        Lac:
            r5.f9809a = r7
            r1.add(r6)
            goto Lb7
        Lb2:
            androidx.fragment.app.Fragment r2 = r5.f9810b
            r1.add(r2)
        Lb7:
            int r4 = r4 + r7
            goto L7
        Lba:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1006a.i(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.x
    public boolean isEmpty() {
        return this.f9792c.isEmpty();
    }

    boolean j(int i8) {
        int size = this.f9792c.size();
        for (int i9 = 0; i9 < size; i9++) {
            Fragment fragment = ((x.a) this.f9792c.get(i9)).f9810b;
            int i10 = fragment != null ? fragment.f9506x : 0;
            if (i10 != 0 && i10 == i8) {
                return true;
            }
        }
        return false;
    }

    boolean k(ArrayList arrayList, int i8, int i9) {
        if (i9 == i8) {
            return false;
        }
        int size = this.f9792c.size();
        int i10 = -1;
        for (int i11 = 0; i11 < size; i11++) {
            Fragment fragment = ((x.a) this.f9792c.get(i11)).f9810b;
            int i12 = fragment != null ? fragment.f9506x : 0;
            if (i12 != 0 && i12 != i10) {
                for (int i13 = i8; i13 < i9; i13++) {
                    C1006a c1006a = (C1006a) arrayList.get(i13);
                    int size2 = c1006a.f9792c.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        Fragment fragment2 = ((x.a) c1006a.f9792c.get(i14)).f9810b;
                        if ((fragment2 != null ? fragment2.f9506x : 0) == i12) {
                            return true;
                        }
                    }
                }
                i10 = i12;
            }
        }
        return false;
    }

    boolean m() {
        for (int i8 = 0; i8 < this.f9792c.size(); i8++) {
            if (l((x.a) this.f9792c.get(i8))) {
                return true;
            }
        }
        return false;
    }

    void n(Fragment.l lVar) {
        for (int i8 = 0; i8 < this.f9792c.size(); i8++) {
            x.a aVar = (x.a) this.f9792c.get(i8);
            if (l(aVar)) {
                aVar.f9810b.k0(lVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.Fragment o(java.util.ArrayList r6, androidx.fragment.app.Fragment r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f9792c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f9792c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.x$a r2 = (androidx.fragment.app.x.a) r2
            int r3 = r2.f9809a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.h$b r3 = r2.f9815g
            r2.f9816h = r3
            goto L32
        L22:
            androidx.fragment.app.Fragment r7 = r2.f9810b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.Fragment r2 = r2.f9810b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.Fragment r2 = r2.f9810b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1006a.o(java.util.ArrayList, androidx.fragment.app.Fragment):androidx.fragment.app.Fragment");
    }

    @Override // androidx.fragment.app.x
    public x remove(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f9501s;
        if (fragmentManager == null || fragmentManager == this.f9628t) {
            return super.remove(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public void runOnCommitRunnables() {
        if (this.f9808s != null) {
            for (int i8 = 0; i8 < this.f9808s.size(); i8++) {
                ((Runnable) this.f9808s.get(i8)).run();
            }
            this.f9808s = null;
        }
    }

    @Override // androidx.fragment.app.x
    public x setMaxLifecycle(Fragment fragment, AbstractC1019h.b bVar) {
        if (fragment.f9501s != this.f9628t) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.f9628t);
        }
        if (bVar == AbstractC1019h.b.INITIALIZED && fragment.f9483a > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + " after the Fragment has been created");
        }
        if (bVar != AbstractC1019h.b.DESTROYED) {
            return super.setMaxLifecycle(fragment, bVar);
        }
        throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + bVar + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
    }

    @Override // androidx.fragment.app.x
    public x setPrimaryNavigationFragment(Fragment fragment) {
        FragmentManager fragmentManager;
        if (fragment == null || (fragmentManager = fragment.f9501s) == null || fragmentManager == this.f9628t) {
            return super.setPrimaryNavigationFragment(fragment);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    @Override // androidx.fragment.app.x
    public x show(Fragment fragment) {
        FragmentManager fragmentManager = fragment.f9501s;
        if (fragmentManager == null || fragmentManager == this.f9628t) {
            return super.show(fragment);
        }
        throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f9630v >= 0) {
            sb.append(" #");
            sb.append(this.f9630v);
        }
        if (this.f9800k != null) {
            sb.append(X.SPACE);
            sb.append(this.f9800k);
        }
        sb.append("}");
        return sb.toString();
    }

    public void dump(String str, PrintWriter printWriter, boolean z8) {
        String str2;
        if (z8) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f9800k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f9630v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f9629u);
            if (this.f9797h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f9797h));
            }
            if (this.f9793d != 0 || this.f9794e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9793d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9794e));
            }
            if (this.f9795f != 0 || this.f9796g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f9795f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f9796g));
            }
            if (this.f9801l != 0 || this.f9802m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9801l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f9802m);
            }
            if (this.f9803n != 0 || this.f9804o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f9803n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f9804o);
            }
        }
        if (this.f9792c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f9792c.size();
        for (int i8 = 0; i8 < size; i8++) {
            x.a aVar = (x.a) this.f9792c.get(i8);
            switch (aVar.f9809a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f9809a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i8);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(X.SPACE);
            printWriter.println(aVar.f9810b);
            if (z8) {
                if (aVar.f9811c != 0 || aVar.f9812d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f9811c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f9812d));
                }
                if (aVar.f9813e != 0 || aVar.f9814f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f9813e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f9814f));
                }
            }
        }
    }
}
