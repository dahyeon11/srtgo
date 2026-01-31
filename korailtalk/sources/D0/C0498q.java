package D0;

import D0.AbstractC0494m;
import Q7.X;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: D0.q */
/* loaded from: classes.dex */
public class C0498q extends AbstractC0494m {
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER = 0;

    /* renamed from: K */
    private ArrayList f876K;

    /* renamed from: L */
    private boolean f877L;

    /* renamed from: M */
    int f878M;

    /* renamed from: N */
    boolean f879N;

    /* renamed from: O */
    private int f880O;

    /* renamed from: D0.q$a */
    class a extends C0495n {

        /* renamed from: a */
        final /* synthetic */ AbstractC0494m f881a;

        a(AbstractC0494m abstractC0494m) {
            this.f881a = abstractC0494m;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            this.f881a.C();
            abstractC0494m.removeListener(this);
        }
    }

    /* renamed from: D0.q$b */
    static class b extends C0495n {

        /* renamed from: a */
        C0498q f883a;

        b(C0498q c0498q) {
            this.f883a = c0498q;
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionEnd(AbstractC0494m abstractC0494m) {
            C0498q c0498q = this.f883a;
            int i8 = c0498q.f878M - 1;
            c0498q.f878M = i8;
            if (i8 == 0) {
                c0498q.f879N = false;
                c0498q.j();
            }
            abstractC0494m.removeListener(this);
        }

        @Override // D0.C0495n, D0.AbstractC0494m.g
        public void onTransitionStart(AbstractC0494m abstractC0494m) {
            C0498q c0498q = this.f883a;
            if (c0498q.f879N) {
                return;
            }
            c0498q.F();
            this.f883a.f879N = true;
        }
    }

    public C0498q() {
        this.f876K = new ArrayList();
        this.f877L = true;
        this.f879N = false;
        this.f880O = 0;
    }

    private void H(AbstractC0494m abstractC0494m) {
        this.f876K.add(abstractC0494m);
        abstractC0494m.f850r = this;
    }

    private void J() {
        b bVar = new b(this);
        Iterator it = this.f876K.iterator();
        while (it.hasNext()) {
            ((AbstractC0494m) it.next()).addListener(bVar);
        }
        this.f878M = this.f876K.size();
    }

    @Override // D0.AbstractC0494m
    protected void C() {
        if (this.f876K.isEmpty()) {
            F();
            j();
            return;
        }
        J();
        if (this.f877L) {
            Iterator it = this.f876K.iterator();
            while (it.hasNext()) {
                ((AbstractC0494m) it.next()).C();
            }
            return;
        }
        for (int i8 = 1; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8 - 1)).addListener(new a((AbstractC0494m) this.f876K.get(i8)));
        }
        AbstractC0494m abstractC0494m = (AbstractC0494m) this.f876K.get(0);
        if (abstractC0494m != null) {
            abstractC0494m.C();
        }
    }

    @Override // D0.AbstractC0494m
    void D(boolean z8) {
        super.D(z8);
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).D(z8);
        }
    }

    @Override // D0.AbstractC0494m
    String G(String str) {
        String strG = super.G(str);
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strG);
            sb.append(X.LF);
            sb.append(((AbstractC0494m) this.f876K.get(i8)).G(str + "  "));
            strG = sb.toString();
        }
        return strG;
    }

    @Override // D0.AbstractC0494m
    /* renamed from: I */
    public C0498q E(ViewGroup viewGroup) {
        super.E(viewGroup);
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).E(viewGroup);
        }
        return this;
    }

    public C0498q addTransition(AbstractC0494m abstractC0494m) {
        H(abstractC0494m);
        long j8 = this.f835c;
        if (j8 >= 0) {
            abstractC0494m.setDuration(j8);
        }
        if ((this.f880O & 1) != 0) {
            abstractC0494m.setInterpolator(getInterpolator());
        }
        if ((this.f880O & 2) != 0) {
            abstractC0494m.setPropagation(getPropagation());
        }
        if ((this.f880O & 4) != 0) {
            abstractC0494m.setPathMotion(getPathMotion());
        }
        if ((this.f880O & 8) != 0) {
            abstractC0494m.setEpicenterCallback(getEpicenterCallback());
        }
        return this;
    }

    @Override // D0.AbstractC0494m
    public void captureEndValues(t tVar) {
        if (s(tVar.view)) {
            Iterator it = this.f876K.iterator();
            while (it.hasNext()) {
                AbstractC0494m abstractC0494m = (AbstractC0494m) it.next();
                if (abstractC0494m.s(tVar.view)) {
                    abstractC0494m.captureEndValues(tVar);
                    tVar.f887a.add(abstractC0494m);
                }
            }
        }
    }

    @Override // D0.AbstractC0494m
    public void captureStartValues(t tVar) {
        if (s(tVar.view)) {
            Iterator it = this.f876K.iterator();
            while (it.hasNext()) {
                AbstractC0494m abstractC0494m = (AbstractC0494m) it.next();
                if (abstractC0494m.s(tVar.view)) {
                    abstractC0494m.captureStartValues(tVar);
                    tVar.f887a.add(abstractC0494m);
                }
            }
        }
    }

    @Override // D0.AbstractC0494m
    public AbstractC0494m excludeTarget(View view, boolean z8) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).excludeTarget(view, z8);
        }
        return super.excludeTarget(view, z8);
    }

    @Override // D0.AbstractC0494m
    void f(t tVar) {
        super.f(tVar);
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).f(tVar);
        }
    }

    public int getOrdering() {
        return !this.f877L ? 1 : 0;
    }

    public AbstractC0494m getTransitionAt(int i8) {
        if (i8 < 0 || i8 >= this.f876K.size()) {
            return null;
        }
        return (AbstractC0494m) this.f876K.get(i8);
    }

    public int getTransitionCount() {
        return this.f876K.size();
    }

    @Override // D0.AbstractC0494m
    protected void i(ViewGroup viewGroup, u uVar, u uVar2, ArrayList arrayList, ArrayList arrayList2) {
        long startDelay = getStartDelay();
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            AbstractC0494m abstractC0494m = (AbstractC0494m) this.f876K.get(i8);
            if (startDelay > 0 && (this.f877L || i8 == 0)) {
                long startDelay2 = abstractC0494m.getStartDelay();
                if (startDelay2 > 0) {
                    abstractC0494m.setStartDelay(startDelay2 + startDelay);
                } else {
                    abstractC0494m.setStartDelay(startDelay);
                }
            }
            abstractC0494m.i(viewGroup, uVar, uVar2, arrayList, arrayList2);
        }
    }

    @Override // D0.AbstractC0494m
    void o(ViewGroup viewGroup) {
        super.o(viewGroup);
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).o(viewGroup);
        }
    }

    @Override // D0.AbstractC0494m
    public void pause(View view) {
        super.pause(view);
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).pause(view);
        }
    }

    public C0498q removeTransition(AbstractC0494m abstractC0494m) {
        this.f876K.remove(abstractC0494m);
        abstractC0494m.f850r = null;
        return this;
    }

    @Override // D0.AbstractC0494m
    public void resume(View view) {
        super.resume(view);
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).resume(view);
        }
    }

    @Override // D0.AbstractC0494m
    public void setEpicenterCallback(AbstractC0494m.f fVar) {
        super.setEpicenterCallback(fVar);
        this.f880O |= 8;
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).setEpicenterCallback(fVar);
        }
    }

    public C0498q setOrdering(int i8) {
        if (i8 == 0) {
            this.f877L = true;
        } else {
            if (i8 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i8);
            }
            this.f877L = false;
        }
        return this;
    }

    @Override // D0.AbstractC0494m
    public void setPathMotion(AbstractC0488g abstractC0488g) {
        super.setPathMotion(abstractC0488g);
        this.f880O |= 4;
        if (this.f876K != null) {
            for (int i8 = 0; i8 < this.f876K.size(); i8++) {
                ((AbstractC0494m) this.f876K.get(i8)).setPathMotion(abstractC0488g);
            }
        }
    }

    @Override // D0.AbstractC0494m
    public void setPropagation(AbstractC0497p abstractC0497p) {
        super.setPropagation(abstractC0497p);
        this.f880O |= 2;
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).setPropagation(abstractC0497p);
        }
    }

    @Override // D0.AbstractC0494m
    public C0498q addListener(AbstractC0494m.g gVar) {
        return (C0498q) super.addListener(gVar);
    }

    @Override // D0.AbstractC0494m
    /* renamed from: clone */
    public AbstractC0494m mo6clone() {
        C0498q c0498q = (C0498q) super.mo6clone();
        c0498q.f876K = new ArrayList();
        int size = this.f876K.size();
        for (int i8 = 0; i8 < size; i8++) {
            c0498q.H(((AbstractC0494m) this.f876K.get(i8)).mo6clone());
        }
        return c0498q;
    }

    @Override // D0.AbstractC0494m
    public C0498q removeListener(AbstractC0494m.g gVar) {
        return (C0498q) super.removeListener(gVar);
    }

    @Override // D0.AbstractC0494m
    public C0498q setDuration(long j8) {
        ArrayList arrayList;
        super.setDuration(j8);
        if (this.f835c >= 0 && (arrayList = this.f876K) != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((AbstractC0494m) this.f876K.get(i8)).setDuration(j8);
            }
        }
        return this;
    }

    @Override // D0.AbstractC0494m
    public C0498q setInterpolator(TimeInterpolator timeInterpolator) {
        this.f880O |= 1;
        ArrayList arrayList = this.f876K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((AbstractC0494m) this.f876K.get(i8)).setInterpolator(timeInterpolator);
            }
        }
        return (C0498q) super.setInterpolator(timeInterpolator);
    }

    @Override // D0.AbstractC0494m
    public C0498q setStartDelay(long j8) {
        return (C0498q) super.setStartDelay(j8);
    }

    @Override // D0.AbstractC0494m
    public /* bridge */ /* synthetic */ AbstractC0494m addTarget(Class cls) {
        return addTarget((Class<?>) cls);
    }

    @Override // D0.AbstractC0494m
    public /* bridge */ /* synthetic */ AbstractC0494m removeTarget(Class cls) {
        return removeTarget((Class<?>) cls);
    }

    @Override // D0.AbstractC0494m
    public AbstractC0494m excludeTarget(String str, boolean z8) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).excludeTarget(str, z8);
        }
        return super.excludeTarget(str, z8);
    }

    @Override // D0.AbstractC0494m
    public C0498q addTarget(View view) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).addTarget(view);
        }
        return (C0498q) super.addTarget(view);
    }

    @Override // D0.AbstractC0494m
    public C0498q removeTarget(int i8) {
        for (int i9 = 0; i9 < this.f876K.size(); i9++) {
            ((AbstractC0494m) this.f876K.get(i9)).removeTarget(i8);
        }
        return (C0498q) super.removeTarget(i8);
    }

    public C0498q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f876K = new ArrayList();
        this.f877L = true;
        this.f879N = false;
        this.f880O = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0493l.f820i);
        setOrdering(androidx.core.content.res.k.getNamedInt(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // D0.AbstractC0494m
    public AbstractC0494m excludeTarget(int i8, boolean z8) {
        for (int i9 = 0; i9 < this.f876K.size(); i9++) {
            ((AbstractC0494m) this.f876K.get(i9)).excludeTarget(i8, z8);
        }
        return super.excludeTarget(i8, z8);
    }

    @Override // D0.AbstractC0494m
    public C0498q addTarget(int i8) {
        for (int i9 = 0; i9 < this.f876K.size(); i9++) {
            ((AbstractC0494m) this.f876K.get(i9)).addTarget(i8);
        }
        return (C0498q) super.addTarget(i8);
    }

    @Override // D0.AbstractC0494m
    public C0498q removeTarget(View view) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).removeTarget(view);
        }
        return (C0498q) super.removeTarget(view);
    }

    @Override // D0.AbstractC0494m
    public AbstractC0494m excludeTarget(Class<?> cls, boolean z8) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).excludeTarget(cls, z8);
        }
        return super.excludeTarget(cls, z8);
    }

    @Override // D0.AbstractC0494m
    public C0498q addTarget(String str) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).addTarget(str);
        }
        return (C0498q) super.addTarget(str);
    }

    @Override // D0.AbstractC0494m
    public C0498q removeTarget(Class<?> cls) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).removeTarget(cls);
        }
        return (C0498q) super.removeTarget(cls);
    }

    @Override // D0.AbstractC0494m
    public C0498q addTarget(Class<?> cls) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).addTarget(cls);
        }
        return (C0498q) super.addTarget(cls);
    }

    @Override // D0.AbstractC0494m
    public C0498q removeTarget(String str) {
        for (int i8 = 0; i8 < this.f876K.size(); i8++) {
            ((AbstractC0494m) this.f876K.get(i8)).removeTarget(str);
        }
        return (C0498q) super.removeTarget(str);
    }
}
