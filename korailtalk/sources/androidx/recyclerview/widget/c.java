package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC0985p0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class c extends n {

    /* renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f10506s;

    /* renamed from: h, reason: collision with root package name */
    private ArrayList f10507h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f10508i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private ArrayList f10509j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    private ArrayList f10510k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    ArrayList f10511l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    ArrayList f10512m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    ArrayList f10513n = new ArrayList();

    /* renamed from: o, reason: collision with root package name */
    ArrayList f10514o = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    ArrayList f10515p = new ArrayList();

    /* renamed from: q, reason: collision with root package name */
    ArrayList f10516q = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    ArrayList f10517r = new ArrayList();

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10518a;

        a(ArrayList arrayList) {
            this.f10518a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f10518a.iterator();
            while (it.hasNext()) {
                j jVar = (j) it.next();
                c.this.e(jVar.holder, jVar.fromX, jVar.fromY, jVar.toX, jVar.toY);
            }
            this.f10518a.clear();
            c.this.f10512m.remove(this.f10518a);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10520a;

        b(ArrayList arrayList) {
            this.f10520a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f10520a.iterator();
            while (it.hasNext()) {
                c.this.d((i) it.next());
            }
            this.f10520a.clear();
            c.this.f10513n.remove(this.f10520a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0163c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f10522a;

        RunnableC0163c(ArrayList arrayList) {
            this.f10522a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f10522a.iterator();
            while (it.hasNext()) {
                c.this.c((RecyclerView.E) it.next());
            }
            this.f10522a.clear();
            c.this.f10511l.remove(this.f10522a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f10524a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10525b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10526c;

        d(RecyclerView.E e8, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10524a = e8;
            this.f10525b = viewPropertyAnimator;
            this.f10526c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10525b.setListener(null);
            this.f10526c.setAlpha(1.0f);
            c.this.dispatchRemoveFinished(this.f10524a);
            c.this.f10516q.remove(this.f10524a);
            c.this.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchRemoveStarting(this.f10524a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f10528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f10529b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10530c;

        e(RecyclerView.E e8, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f10528a = e8;
            this.f10529b = view;
            this.f10530c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10529b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10530c.setListener(null);
            c.this.dispatchAddFinished(this.f10528a);
            c.this.f10514o.remove(this.f10528a);
            c.this.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchAddStarting(this.f10528a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f10532a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f10535d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10536e;

        f(RecyclerView.E e8, int i8, View view, int i9, ViewPropertyAnimator viewPropertyAnimator) {
            this.f10532a = e8;
            this.f10533b = i8;
            this.f10534c = view;
            this.f10535d = i9;
            this.f10536e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f10533b != 0) {
                this.f10534c.setTranslationX(0.0f);
            }
            if (this.f10535d != 0) {
                this.f10534c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10536e.setListener(null);
            c.this.dispatchMoveFinished(this.f10532a);
            c.this.f10515p.remove(this.f10532a);
            c.this.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchMoveStarting(this.f10532a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f10538a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10539b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10540c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10538a = iVar;
            this.f10539b = viewPropertyAnimator;
            this.f10540c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10539b.setListener(null);
            this.f10540c.setAlpha(1.0f);
            this.f10540c.setTranslationX(0.0f);
            this.f10540c.setTranslationY(0.0f);
            c.this.dispatchChangeFinished(this.f10538a.oldHolder, true);
            c.this.f10517r.remove(this.f10538a.oldHolder);
            c.this.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchChangeStarting(this.f10538a.oldHolder, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f10542a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f10543b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f10544c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f10542a = iVar;
            this.f10543b = viewPropertyAnimator;
            this.f10544c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10543b.setListener(null);
            this.f10544c.setAlpha(1.0f);
            this.f10544c.setTranslationX(0.0f);
            this.f10544c.setTranslationY(0.0f);
            c.this.dispatchChangeFinished(this.f10542a.newHolder, false);
            c.this.f10517r.remove(this.f10542a.newHolder);
            c.this.h();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.dispatchChangeStarting(this.f10542a.newHolder, false);
        }
    }

    private static class j {
        public int fromX;
        public int fromY;
        public RecyclerView.E holder;
        public int toX;
        public int toY;

        j(RecyclerView.E e8, int i8, int i9, int i10, int i11) {
            this.holder = e8;
            this.fromX = i8;
            this.fromY = i9;
            this.toX = i10;
            this.toY = i11;
        }
    }

    private void f(RecyclerView.E e8) {
        View view = e8.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f10516q.add(e8);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(e8, viewPropertyAnimatorAnimate, view)).start();
    }

    private void i(List list, RecyclerView.E e8) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (k(iVar, e8) && iVar.oldHolder == null && iVar.newHolder == null) {
                list.remove(iVar);
            }
        }
    }

    private void j(i iVar) {
        RecyclerView.E e8 = iVar.oldHolder;
        if (e8 != null) {
            k(iVar, e8);
        }
        RecyclerView.E e9 = iVar.newHolder;
        if (e9 != null) {
            k(iVar, e9);
        }
    }

    private boolean k(i iVar, RecyclerView.E e8) {
        boolean z8 = false;
        if (iVar.newHolder == e8) {
            iVar.newHolder = null;
        } else {
            if (iVar.oldHolder != e8) {
                return false;
            }
            iVar.oldHolder = null;
            z8 = true;
        }
        e8.itemView.setAlpha(1.0f);
        e8.itemView.setTranslationX(0.0f);
        e8.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(e8, z8);
        return true;
    }

    private void l(RecyclerView.E e8) {
        if (f10506s == null) {
            f10506s = new ValueAnimator().getInterpolator();
        }
        e8.itemView.animate().setInterpolator(f10506s);
        endAnimation(e8);
    }

    @Override // androidx.recyclerview.widget.n
    public boolean animateAdd(RecyclerView.E e8) {
        l(e8);
        e8.itemView.setAlpha(0.0f);
        this.f10508i.add(e8);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean animateChange(RecyclerView.E e8, RecyclerView.E e9, int i8, int i9, int i10, int i11) {
        if (e8 == e9) {
            return animateMove(e8, i8, i9, i10, i11);
        }
        float translationX = e8.itemView.getTranslationX();
        float translationY = e8.itemView.getTranslationY();
        float alpha = e8.itemView.getAlpha();
        l(e8);
        int i12 = (int) ((i10 - i8) - translationX);
        int i13 = (int) ((i11 - i9) - translationY);
        e8.itemView.setTranslationX(translationX);
        e8.itemView.setTranslationY(translationY);
        e8.itemView.setAlpha(alpha);
        if (e9 != null) {
            l(e9);
            e9.itemView.setTranslationX(-i12);
            e9.itemView.setTranslationY(-i13);
            e9.itemView.setAlpha(0.0f);
        }
        this.f10510k.add(new i(e8, e9, i8, i9, i10, i11));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean animateMove(RecyclerView.E e8, int i8, int i9, int i10, int i11) {
        View view = e8.itemView;
        int translationX = i8 + ((int) view.getTranslationX());
        int translationY = i9 + ((int) e8.itemView.getTranslationY());
        l(e8);
        int i12 = i10 - translationX;
        int i13 = i11 - translationY;
        if (i12 == 0 && i13 == 0) {
            dispatchMoveFinished(e8);
            return false;
        }
        if (i12 != 0) {
            view.setTranslationX(-i12);
        }
        if (i13 != 0) {
            view.setTranslationY(-i13);
        }
        this.f10509j.add(new j(e8, translationX, translationY, i10, i11));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean animateRemove(RecyclerView.E e8) {
        l(e8);
        this.f10507h.add(e8);
        return true;
    }

    void c(RecyclerView.E e8) {
        View view = e8.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f10514o.add(e8);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(e8, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean canReuseUpdatedViewHolder(RecyclerView.E e8, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(e8, list);
    }

    void d(i iVar) {
        RecyclerView.E e8 = iVar.oldHolder;
        View view = e8 == null ? null : e8.itemView;
        RecyclerView.E e9 = iVar.newHolder;
        View view2 = e9 != null ? e9.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f10517r.add(iVar.oldHolder);
            duration.translationX(iVar.toX - iVar.fromX);
            duration.translationY(iVar.toY - iVar.fromY);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f10517r.add(iVar.newHolder);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void e(RecyclerView.E e8, int i8, int i9, int i10, int i11) {
        View view = e8.itemView;
        int i12 = i10 - i8;
        int i13 = i11 - i9;
        if (i12 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i13 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f10515p.add(e8);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new f(e8, i12, view, i13, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimation(RecyclerView.E e8) {
        View view = e8.itemView;
        view.animate().cancel();
        int size = this.f10509j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f10509j.get(size)).holder == e8) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(e8);
                this.f10509j.remove(size);
            }
        }
        i(this.f10510k, e8);
        if (this.f10507h.remove(e8)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(e8);
        }
        if (this.f10508i.remove(e8)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(e8);
        }
        for (int size2 = this.f10513n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f10513n.get(size2);
            i(arrayList, e8);
            if (arrayList.isEmpty()) {
                this.f10513n.remove(size2);
            }
        }
        for (int size3 = this.f10512m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f10512m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).holder == e8) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(e8);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f10512m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f10511l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f10511l.get(size5);
            if (arrayList3.remove(e8)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(e8);
                if (arrayList3.isEmpty()) {
                    this.f10511l.remove(size5);
                }
            }
        }
        this.f10516q.remove(e8);
        this.f10514o.remove(e8);
        this.f10517r.remove(e8);
        this.f10515p.remove(e8);
        h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void endAnimations() {
        int size = this.f10509j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f10509j.get(size);
            View view = jVar.holder.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.holder);
            this.f10509j.remove(size);
        }
        for (int size2 = this.f10507h.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished((RecyclerView.E) this.f10507h.get(size2));
            this.f10507h.remove(size2);
        }
        int size3 = this.f10508i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.E e8 = (RecyclerView.E) this.f10508i.get(size3);
            e8.itemView.setAlpha(1.0f);
            dispatchAddFinished(e8);
            this.f10508i.remove(size3);
        }
        for (int size4 = this.f10510k.size() - 1; size4 >= 0; size4--) {
            j((i) this.f10510k.get(size4));
        }
        this.f10510k.clear();
        if (isRunning()) {
            for (int size5 = this.f10512m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f10512m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.holder.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.holder);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f10512m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f10511l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f10511l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.E e9 = (RecyclerView.E) arrayList2.get(size8);
                    e9.itemView.setAlpha(1.0f);
                    dispatchAddFinished(e9);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f10511l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f10513n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f10513n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    j((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f10513n.remove(arrayList3);
                    }
                }
            }
            g(this.f10516q);
            g(this.f10515p);
            g(this.f10514o);
            g(this.f10517r);
            dispatchAnimationsFinished();
        }
    }

    void g(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.E) list.get(size)).itemView.animate().cancel();
        }
    }

    void h() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean isRunning() {
        return (this.f10508i.isEmpty() && this.f10510k.isEmpty() && this.f10509j.isEmpty() && this.f10507h.isEmpty() && this.f10515p.isEmpty() && this.f10516q.isEmpty() && this.f10514o.isEmpty() && this.f10517r.isEmpty() && this.f10512m.isEmpty() && this.f10511l.isEmpty() && this.f10513n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void runPendingAnimations() {
        boolean zIsEmpty = this.f10507h.isEmpty();
        boolean zIsEmpty2 = this.f10509j.isEmpty();
        boolean zIsEmpty3 = this.f10510k.isEmpty();
        boolean zIsEmpty4 = this.f10508i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f10507h.iterator();
        while (it.hasNext()) {
            f((RecyclerView.E) it.next());
        }
        this.f10507h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f10509j);
            this.f10512m.add(arrayList);
            this.f10509j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                AbstractC0985p0.postOnAnimationDelayed(((j) arrayList.get(0)).holder.itemView, aVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f10510k);
            this.f10513n.add(arrayList2);
            this.f10510k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                AbstractC0985p0.postOnAnimationDelayed(((i) arrayList2.get(0)).oldHolder.itemView, bVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f10508i);
        this.f10511l.add(arrayList3);
        this.f10508i.clear();
        RunnableC0163c runnableC0163c = new RunnableC0163c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0163c.run();
        } else {
            AbstractC0985p0.postOnAnimationDelayed(((RecyclerView.E) arrayList3.get(0)).itemView, runnableC0163c, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    private static class i {
        public int fromX;
        public int fromY;
        public RecyclerView.E newHolder;
        public RecyclerView.E oldHolder;
        public int toX;
        public int toY;

        private i(RecyclerView.E e8, RecyclerView.E e9) {
            this.oldHolder = e8;
            this.newHolder = e9;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.oldHolder + ", newHolder=" + this.newHolder + ", fromX=" + this.fromX + ", fromY=" + this.fromY + ", toX=" + this.toX + ", toY=" + this.toY + '}';
        }

        i(RecyclerView.E e8, RecyclerView.E e9, int i8, int i9, int i10, int i11) {
            this(e8, e9);
            this.fromX = i8;
            this.fromY = i9;
            this.toX = i10;
            this.toY = i11;
        }
    }
}
