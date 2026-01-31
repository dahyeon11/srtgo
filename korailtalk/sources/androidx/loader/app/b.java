package androidx.loader.app;

import O.i;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.InterfaceC1025n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.loader.app.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import k0.AbstractC5837a;
import l0.C5880b;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f10071c = false;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1025n f10072a;

    /* renamed from: b, reason: collision with root package name */
    private final c f10073b;

    public static class a extends t implements C5880b.InterfaceC0342b {

        /* renamed from: l, reason: collision with root package name */
        private final int f10074l;

        /* renamed from: m, reason: collision with root package name */
        private final Bundle f10075m;

        /* renamed from: n, reason: collision with root package name */
        private final C5880b f10076n;

        /* renamed from: o, reason: collision with root package name */
        private InterfaceC1025n f10077o;

        /* renamed from: p, reason: collision with root package name */
        private C0157b f10078p;

        /* renamed from: q, reason: collision with root package name */
        private C5880b f10079q;

        a(int i8, Bundle bundle, C5880b c5880b, C5880b c5880b2) {
            this.f10074l = i8;
            this.f10075m = bundle;
            this.f10076n = c5880b;
            this.f10079q = c5880b2;
            c5880b.registerListener(i8, this);
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f10074l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f10075m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f10076n);
            this.f10076n.dump(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f10078p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f10078p);
                this.f10078p.dump(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(i().dataToString(getValue()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(hasActiveObservers());
        }

        @Override // androidx.lifecycle.LiveData
        protected void f() {
            if (b.f10071c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
            }
            this.f10076n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        protected void g() {
            if (b.f10071c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
            }
            this.f10076n.stopLoading();
        }

        C5880b h(boolean z8) {
            if (b.f10071c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
            }
            this.f10076n.cancelLoad();
            this.f10076n.abandon();
            C0157b c0157b = this.f10078p;
            if (c0157b != null) {
                removeObserver(c0157b);
                if (z8) {
                    c0157b.b();
                }
            }
            this.f10076n.unregisterListener(this);
            if ((c0157b == null || c0157b.a()) && !z8) {
                return this.f10076n;
            }
            this.f10076n.reset();
            return this.f10079q;
        }

        C5880b i() {
            return this.f10076n;
        }

        boolean j() {
            C0157b c0157b;
            return (!hasActiveObservers() || (c0157b = this.f10078p) == null || c0157b.a()) ? false : true;
        }

        void k() {
            InterfaceC1025n interfaceC1025n = this.f10077o;
            C0157b c0157b = this.f10078p;
            if (interfaceC1025n == null || c0157b == null) {
                return;
            }
            super.removeObserver(c0157b);
            observe(interfaceC1025n, c0157b);
        }

        C5880b l(InterfaceC1025n interfaceC1025n, a.InterfaceC0156a interfaceC0156a) {
            C0157b c0157b = new C0157b(this.f10076n, interfaceC0156a);
            observe(interfaceC1025n, c0157b);
            u uVar = this.f10078p;
            if (uVar != null) {
                removeObserver(uVar);
            }
            this.f10077o = interfaceC1025n;
            this.f10078p = c0157b;
            return this.f10076n;
        }

        @Override // l0.C5880b.InterfaceC0342b
        public void onLoadComplete(C5880b c5880b, Object obj) {
            if (b.f10071c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                setValue(obj);
                return;
            }
            if (b.f10071c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            postValue(obj);
        }

        @Override // androidx.lifecycle.LiveData
        public void removeObserver(u uVar) {
            super.removeObserver(uVar);
            this.f10077o = null;
            this.f10078p = null;
        }

        @Override // androidx.lifecycle.t, androidx.lifecycle.LiveData
        public void setValue(Object obj) {
            super.setValue(obj);
            C5880b c5880b = this.f10079q;
            if (c5880b != null) {
                c5880b.reset();
                this.f10079q = null;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f10074l);
            sb.append(" : ");
            Z.b.buildShortClassTag(this.f10076n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0157b implements u {

        /* renamed from: a, reason: collision with root package name */
        private final C5880b f10080a;

        /* renamed from: b, reason: collision with root package name */
        private final a.InterfaceC0156a f10081b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f10082c = false;

        C0157b(C5880b c5880b, a.InterfaceC0156a interfaceC0156a) {
            this.f10080a = c5880b;
            this.f10081b = interfaceC0156a;
        }

        boolean a() {
            return this.f10082c;
        }

        void b() {
            if (this.f10082c) {
                if (b.f10071c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f10080a);
                }
                this.f10081b.onLoaderReset(this.f10080a);
            }
        }

        public void dump(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f10082c);
        }

        @Override // androidx.lifecycle.u
        public void onChanged(Object obj) {
            if (b.f10071c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f10080a);
                sb.append(": ");
                sb.append(this.f10080a.dataToString(obj));
            }
            this.f10081b.onLoadFinished(this.f10080a, obj);
            this.f10082c = true;
        }

        public String toString() {
            return this.f10081b.toString();
        }
    }

    static class c extends J {

        /* renamed from: f, reason: collision with root package name */
        private static final K.b f10083f = new a();

        /* renamed from: d, reason: collision with root package name */
        private i f10084d = new i();

        /* renamed from: e, reason: collision with root package name */
        private boolean f10085e = false;

        static class a implements K.b {
            a() {
            }

            @Override // androidx.lifecycle.K.b
            public /* bridge */ /* synthetic */ J create(Class cls, AbstractC5837a abstractC5837a) {
                return super.create(cls, abstractC5837a);
            }

            @Override // androidx.lifecycle.K.b
            public <T extends J> T create(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c g(M m8) {
            return (c) new K(m8, f10083f).get(c.class);
        }

        @Override // androidx.lifecycle.J
        protected void d() {
            super.d();
            int size = this.f10084d.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((a) this.f10084d.valueAt(i8)).h(true);
            }
            this.f10084d.clear();
        }

        public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f10084d.size() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i8 = 0; i8 < this.f10084d.size(); i8++) {
                    a aVar = (a) this.f10084d.valueAt(i8);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f10084d.keyAt(i8));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            this.f10085e = false;
        }

        a h(int i8) {
            return (a) this.f10084d.get(i8);
        }

        boolean i() {
            int size = this.f10084d.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (((a) this.f10084d.valueAt(i8)).j()) {
                    return true;
                }
            }
            return false;
        }

        boolean j() {
            return this.f10085e;
        }

        void k() {
            int size = this.f10084d.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((a) this.f10084d.valueAt(i8)).k();
            }
        }

        void l(int i8, a aVar) {
            this.f10084d.put(i8, aVar);
        }

        void m(int i8) {
            this.f10084d.remove(i8);
        }

        void n() {
            this.f10085e = true;
        }
    }

    b(InterfaceC1025n interfaceC1025n, M m8) {
        this.f10072a = interfaceC1025n;
        this.f10073b = c.g(m8);
    }

    private C5880b a(int i8, Bundle bundle, a.InterfaceC0156a interfaceC0156a, C5880b c5880b) {
        try {
            this.f10073b.n();
            C5880b c5880bOnCreateLoader = interfaceC0156a.onCreateLoader(i8, bundle);
            if (c5880bOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (c5880bOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(c5880bOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c5880bOnCreateLoader);
            }
            a aVar = new a(i8, bundle, c5880bOnCreateLoader, c5880b);
            if (f10071c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Created new loader ");
                sb.append(aVar);
            }
            this.f10073b.l(i8, aVar);
            this.f10073b.f();
            return aVar.l(this.f10072a, interfaceC0156a);
        } catch (Throwable th) {
            this.f10073b.f();
            throw th;
        }
    }

    @Override // androidx.loader.app.a
    public void destroyLoader(int i8) {
        if (this.f10073b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f10071c) {
            StringBuilder sb = new StringBuilder();
            sb.append("destroyLoader in ");
            sb.append(this);
            sb.append(" of ");
            sb.append(i8);
        }
        a aVarH = this.f10073b.h(i8);
        if (aVarH != null) {
            aVarH.h(true);
            this.f10073b.m(i8);
        }
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10073b.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public <D> C5880b getLoader(int i8) {
        if (this.f10073b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        a aVarH = this.f10073b.h(i8);
        if (aVarH != null) {
            return aVarH.i();
        }
        return null;
    }

    @Override // androidx.loader.app.a
    public boolean hasRunningLoaders() {
        return this.f10073b.i();
    }

    @Override // androidx.loader.app.a
    public <D> C5880b initLoader(int i8, Bundle bundle, a.InterfaceC0156a interfaceC0156a) {
        if (this.f10073b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarH = this.f10073b.h(i8);
        if (f10071c) {
            StringBuilder sb = new StringBuilder();
            sb.append("initLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        if (aVarH == null) {
            return a(i8, bundle, interfaceC0156a, null);
        }
        if (f10071c) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  Re-using existing loader ");
            sb2.append(aVarH);
        }
        return aVarH.l(this.f10072a, interfaceC0156a);
    }

    @Override // androidx.loader.app.a
    public void markForRedelivery() {
        this.f10073b.k();
    }

    @Override // androidx.loader.app.a
    public <D> C5880b restartLoader(int i8, Bundle bundle, a.InterfaceC0156a interfaceC0156a) {
        if (this.f10073b.j()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f10071c) {
            StringBuilder sb = new StringBuilder();
            sb.append("restartLoader in ");
            sb.append(this);
            sb.append(": args=");
            sb.append(bundle);
        }
        a aVarH = this.f10073b.h(i8);
        return a(i8, bundle, interfaceC0156a, aVarH != null ? aVarH.h(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Z.b.buildShortClassTag(this.f10072a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
