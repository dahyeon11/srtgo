package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1019h;
import androidx.lifecycle.InterfaceC1023l;
import androidx.lifecycle.InterfaceC1025n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class J {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f9132a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f9133b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f9134c = new HashMap();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1019h f9135a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1023l f9136b;

        a(AbstractC1019h abstractC1019h, InterfaceC1023l interfaceC1023l) {
            this.f9135a = abstractC1019h;
            this.f9136b = interfaceC1023l;
            abstractC1019h.addObserver(interfaceC1023l);
        }

        void a() {
            this.f9135a.removeObserver(this.f9136b);
            this.f9136b = null;
        }
    }

    public J(Runnable runnable) {
        this.f9132a = runnable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(L l8, InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
        if (aVar == AbstractC1019h.a.ON_DESTROY) {
            removeMenuProvider(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(AbstractC1019h.b bVar, L l8, InterfaceC1025n interfaceC1025n, AbstractC1019h.a aVar) {
        if (aVar == AbstractC1019h.a.upTo(bVar)) {
            addMenuProvider(l8);
            return;
        }
        if (aVar == AbstractC1019h.a.ON_DESTROY) {
            removeMenuProvider(l8);
        } else if (aVar == AbstractC1019h.a.downFrom(bVar)) {
            this.f9133b.remove(l8);
            this.f9132a.run();
        }
    }

    public void addMenuProvider(L l8) {
        this.f9133b.add(l8);
        this.f9132a.run();
    }

    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f9133b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    public void onMenuClosed(Menu menu) {
        Iterator it = this.f9133b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    public boolean onMenuItemSelected(MenuItem menuItem) {
        Iterator it = this.f9133b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.f.a(it.next());
        throw null;
    }

    public void onPrepareMenu(Menu menu) {
        Iterator it = this.f9133b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
    }

    public void removeMenuProvider(L l8) {
        this.f9133b.remove(l8);
        a aVar = (a) this.f9134c.remove(l8);
        if (aVar != null) {
            aVar.a();
        }
        this.f9132a.run();
    }

    public void addMenuProvider(final L l8, InterfaceC1025n interfaceC1025n) {
        addMenuProvider(l8);
        AbstractC1019h lifecycle = interfaceC1025n.getLifecycle();
        a aVar = (a) this.f9134c.remove(l8);
        if (aVar != null) {
            aVar.a();
        }
        this.f9134c.put(l8, new a(lifecycle, new InterfaceC1023l(l8) { // from class: androidx.core.view.I
            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n2, AbstractC1019h.a aVar2) {
                this.f9131a.c(null, interfaceC1025n2, aVar2);
            }
        }));
    }

    public void addMenuProvider(final L l8, InterfaceC1025n interfaceC1025n, final AbstractC1019h.b bVar) {
        AbstractC1019h lifecycle = interfaceC1025n.getLifecycle();
        a aVar = (a) this.f9134c.remove(l8);
        if (aVar != null) {
            aVar.a();
        }
        this.f9134c.put(l8, new a(lifecycle, new InterfaceC1023l(bVar, l8) { // from class: androidx.core.view.H

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractC1019h.b f9120b;

            @Override // androidx.lifecycle.InterfaceC1023l
            public final void onStateChanged(InterfaceC1025n interfaceC1025n2, AbstractC1019h.a aVar2) {
                this.f9119a.d(this.f9120b, null, interfaceC1025n2, aVar2);
            }
        }));
    }
}
