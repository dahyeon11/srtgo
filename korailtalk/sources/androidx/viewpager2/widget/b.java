package androidx.viewpager2.widget;

import androidx.viewpager2.widget.g;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class b extends g.i {

    /* renamed from: a */
    private final List f10974a;

    b(int i8) {
        this.f10974a = new ArrayList(i8);
    }

    private void c(ConcurrentModificationException concurrentModificationException) {
        throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", concurrentModificationException);
    }

    void a(g.i iVar) {
        this.f10974a.add(iVar);
    }

    void b(g.i iVar) {
        this.f10974a.remove(iVar);
    }

    @Override // androidx.viewpager2.widget.g.i
    public void onPageScrollStateChanged(int i8) {
        try {
            Iterator it = this.f10974a.iterator();
            while (it.hasNext()) {
                ((g.i) it.next()).onPageScrollStateChanged(i8);
            }
        } catch (ConcurrentModificationException e8) {
            c(e8);
        }
    }

    @Override // androidx.viewpager2.widget.g.i
    public void onPageScrolled(int i8, float f8, int i9) {
        try {
            Iterator it = this.f10974a.iterator();
            while (it.hasNext()) {
                ((g.i) it.next()).onPageScrolled(i8, f8, i9);
            }
        } catch (ConcurrentModificationException e8) {
            c(e8);
        }
    }

    @Override // androidx.viewpager2.widget.g.i
    public void onPageSelected(int i8) {
        try {
            Iterator it = this.f10974a.iterator();
            while (it.hasNext()) {
                ((g.i) it.next()).onPageSelected(i8);
            }
        } catch (ConcurrentModificationException e8) {
            c(e8);
        }
    }
}
