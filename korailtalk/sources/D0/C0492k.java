package D0;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: D0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0492k {

    /* renamed from: a, reason: collision with root package name */
    private Context f806a;

    /* renamed from: b, reason: collision with root package name */
    private int f807b;

    /* renamed from: c, reason: collision with root package name */
    private ViewGroup f808c;

    /* renamed from: d, reason: collision with root package name */
    private View f809d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f810e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f811f;

    public C0492k(ViewGroup viewGroup) {
        this.f807b = -1;
        this.f808c = viewGroup;
    }

    static void b(ViewGroup viewGroup, C0492k c0492k) {
        viewGroup.setTag(AbstractC0490i.transition_current_scene, c0492k);
    }

    public static C0492k getCurrentScene(ViewGroup viewGroup) {
        return (C0492k) viewGroup.getTag(AbstractC0490i.transition_current_scene);
    }

    public static C0492k getSceneForLayout(ViewGroup viewGroup, int i8, Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(AbstractC0490i.transition_scene_layoutid_cache);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(AbstractC0490i.transition_scene_layoutid_cache, sparseArray);
        }
        C0492k c0492k = (C0492k) sparseArray.get(i8);
        if (c0492k != null) {
            return c0492k;
        }
        C0492k c0492k2 = new C0492k(viewGroup, i8, context);
        sparseArray.put(i8, c0492k2);
        return c0492k2;
    }

    boolean a() {
        return this.f807b > 0;
    }

    public void enter() {
        if (this.f807b > 0 || this.f809d != null) {
            getSceneRoot().removeAllViews();
            if (this.f807b > 0) {
                LayoutInflater.from(this.f806a).inflate(this.f807b, this.f808c);
            } else {
                this.f808c.addView(this.f809d);
            }
        }
        Runnable runnable = this.f810e;
        if (runnable != null) {
            runnable.run();
        }
        b(this.f808c, this);
    }

    public void exit() {
        Runnable runnable;
        if (getCurrentScene(this.f808c) != this || (runnable = this.f811f) == null) {
            return;
        }
        runnable.run();
    }

    public ViewGroup getSceneRoot() {
        return this.f808c;
    }

    public void setEnterAction(Runnable runnable) {
        this.f810e = runnable;
    }

    public void setExitAction(Runnable runnable) {
        this.f811f = runnable;
    }

    private C0492k(ViewGroup viewGroup, int i8, Context context) {
        this.f806a = context;
        this.f808c = viewGroup;
        this.f807b = i8;
    }

    public C0492k(ViewGroup viewGroup, View view) {
        this.f807b = -1;
        this.f808c = viewGroup;
        this.f809d = view;
    }
}
