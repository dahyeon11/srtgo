package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class w {

    /* renamed from: a */
    private final ArrayList f9787a = new ArrayList();

    /* renamed from: b */
    private final HashMap f9788b = new HashMap();

    /* renamed from: c */
    private p f9789c;

    w() {
    }

    void a(Fragment fragment) {
        if (this.f9787a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f9787a) {
            this.f9787a.add(fragment);
        }
        fragment.f9494l = true;
    }

    void b() {
        this.f9788b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f9788b.get(str) != null;
    }

    void d(int i8) {
        for (v vVar : this.f9788b.values()) {
            if (vVar != null) {
                vVar.u(i8);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f9788b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (v vVar : this.f9788b.values()) {
                printWriter.print(str);
                if (vVar != null) {
                    Fragment fragmentK = vVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f9787a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i8 = 0; i8 < size; i8++) {
                Fragment fragment = (Fragment) this.f9787a.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        v vVar = (v) this.f9788b.get(str);
        if (vVar != null) {
            return vVar.k();
        }
        return null;
    }

    Fragment g(int i8) {
        for (int size = this.f9787a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f9787a.get(size);
            if (fragment != null && fragment.f9505w == i8) {
                return fragment;
            }
        }
        for (v vVar : this.f9788b.values()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                if (fragmentK.f9505w == i8) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f9787a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f9787a.get(size);
                if (fragment != null && str.equals(fragment.f9507y)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (v vVar : this.f9788b.values()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                if (str.equals(fragmentK.f9507y)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentD;
        for (v vVar : this.f9788b.values()) {
            if (vVar != null && (fragmentD = vVar.k().d(str)) != null) {
                return fragmentD;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.f9463G;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f9787a.indexOf(fragment);
        for (int i8 = iIndexOf - 1; i8 >= 0; i8--) {
            Fragment fragment2 = (Fragment) this.f9787a.get(i8);
            if (fragment2.f9463G == viewGroup && (view2 = fragment2.f9464H) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f9787a.size()) {
                return -1;
            }
            Fragment fragment3 = (Fragment) this.f9787a.get(iIndexOf);
            if (fragment3.f9463G == viewGroup && (view = fragment3.f9464H) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    int k() {
        return this.f9788b.size();
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.f9788b.values()) {
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }

    List m() {
        ArrayList arrayList = new ArrayList();
        for (v vVar : this.f9788b.values()) {
            if (vVar != null) {
                arrayList.add(vVar.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    v n(String str) {
        return (v) this.f9788b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f9787a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f9787a) {
            arrayList = new ArrayList(this.f9787a);
        }
        return arrayList;
    }

    p p() {
        return this.f9789c;
    }

    void q(v vVar) {
        Fragment fragmentK = vVar.k();
        if (c(fragmentK.f9488f)) {
            return;
        }
        this.f9788b.put(fragmentK.f9488f, vVar);
        if (fragmentK.f9459C) {
            if (fragmentK.f9458B) {
                this.f9789c.f(fragmentK);
            } else {
                this.f9789c.o(fragmentK);
            }
            fragmentK.f9459C = false;
        }
        if (FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Added fragment to active set ");
            sb.append(fragmentK);
        }
    }

    void r(v vVar) {
        Fragment fragmentK = vVar.k();
        if (fragmentK.f9458B) {
            this.f9789c.o(fragmentK);
        }
        if (((v) this.f9788b.put(fragmentK.f9488f, null)) != null && FragmentManager.x0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Removed fragment from active set ");
            sb.append(fragmentK);
        }
    }

    void s() {
        Iterator it = this.f9787a.iterator();
        while (it.hasNext()) {
            v vVar = (v) this.f9788b.get(((Fragment) it.next()).f9488f);
            if (vVar != null) {
                vVar.m();
            }
        }
        for (v vVar2 : this.f9788b.values()) {
            if (vVar2 != null) {
                vVar2.m();
                Fragment fragmentK = vVar2.k();
                if (fragmentK.f9495m && !fragmentK.x()) {
                    r(vVar2);
                }
            }
        }
    }

    void t(Fragment fragment) {
        synchronized (this.f9787a) {
            this.f9787a.remove(fragment);
        }
        fragment.f9494l = false;
    }

    void u() {
        this.f9788b.clear();
    }

    void v(List list) {
        this.f9787a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (FragmentManager.x0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("restoreSaveState: added (");
                    sb.append(str);
                    sb.append("): ");
                    sb.append(fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    ArrayList w() {
        ArrayList arrayList = new ArrayList(this.f9788b.size());
        for (v vVar : this.f9788b.values()) {
            if (vVar != null) {
                Fragment fragmentK = vVar.k();
                u uVarS = vVar.s();
                arrayList.add(uVarS);
                if (FragmentManager.x0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(fragmentK);
                    sb.append(": ");
                    sb.append(uVarS.f9778m);
                }
            }
        }
        return arrayList;
    }

    ArrayList x() {
        synchronized (this.f9787a) {
            try {
                if (this.f9787a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f9787a.size());
                Iterator it = this.f9787a.iterator();
                while (it.hasNext()) {
                    Fragment fragment = (Fragment) it.next();
                    arrayList.add(fragment.f9488f);
                    if (FragmentManager.x0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("saveAllState: adding fragment (");
                        sb.append(fragment.f9488f);
                        sb.append("): ");
                        sb.append(fragment);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void y(p pVar) {
        this.f9789c = pVar;
    }
}
