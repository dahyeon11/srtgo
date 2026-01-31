package b1;

import T0.AbstractC0786c;
import T0.y;
import W0.q;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import b1.C1067e;
import com.airbnb.lottie.p;
import f1.j;
import g1.C5536c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: b1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1065c extends AbstractC1064b {

    /* renamed from: D, reason: collision with root package name */
    private W0.a f11322D;

    /* renamed from: E, reason: collision with root package name */
    private final List f11323E;

    /* renamed from: F, reason: collision with root package name */
    private final RectF f11324F;

    /* renamed from: G, reason: collision with root package name */
    private final RectF f11325G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f11326H;

    /* renamed from: I, reason: collision with root package name */
    private Boolean f11327I;

    /* renamed from: J, reason: collision with root package name */
    private Boolean f11328J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f11329K;

    /* renamed from: b1.c$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11330a;

        static {
            int[] iArr = new int[C1067e.b.values().length];
            f11330a = iArr;
            try {
                iArr[C1067e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11330a[C1067e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C1065c(p pVar, C1067e c1067e, List<C1067e> list, T0.h hVar) {
        int i8;
        AbstractC1064b abstractC1064b;
        super(pVar, c1067e);
        this.f11323E = new ArrayList();
        this.f11324F = new RectF();
        this.f11325G = new RectF();
        this.f11326H = new Paint();
        this.f11329K = true;
        Z0.b bVarQ = c1067e.q();
        if (bVarQ != null) {
            W0.a aVarCreateAnimation = bVarQ.createAnimation();
            this.f11322D = aVarCreateAnimation;
            addAnimation(aVarCreateAnimation);
            this.f11322D.addUpdateListener(this);
        } else {
            this.f11322D = null;
        }
        O.e eVar = new O.e(hVar.getLayers().size());
        int size = list.size() - 1;
        AbstractC1064b abstractC1064b2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            C1067e c1067e2 = list.get(size);
            AbstractC1064b abstractC1064bL = AbstractC1064b.l(this, c1067e2, pVar, hVar);
            if (abstractC1064bL != null) {
                eVar.put(abstractC1064bL.m().getId(), abstractC1064bL);
                if (abstractC1064b2 != null) {
                    abstractC1064b2.v(abstractC1064bL);
                    abstractC1064b2 = null;
                } else {
                    this.f11323E.add(0, abstractC1064bL);
                    int i9 = a.f11330a[c1067e2.d().ordinal()];
                    if (i9 == 1 || i9 == 2) {
                        abstractC1064b2 = abstractC1064bL;
                    }
                }
            }
            size--;
        }
        for (i8 = 0; i8 < eVar.size(); i8++) {
            AbstractC1064b abstractC1064b3 = (AbstractC1064b) eVar.get(eVar.keyAt(i8));
            if (abstractC1064b3 != null && (abstractC1064b = (AbstractC1064b) eVar.get(abstractC1064b3.m().f())) != null) {
                abstractC1064b3.w(abstractC1064b);
            }
        }
    }

    @Override // b1.AbstractC1064b, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        super.addValueCallback(t8, c5536c);
        if (t8 == y.TIME_REMAP) {
            if (c5536c == null) {
                W0.a aVar = this.f11322D;
                if (aVar != null) {
                    aVar.setValueCallback(null);
                    return;
                }
                return;
            }
            q qVar = new q(c5536c);
            this.f11322D = qVar;
            qVar.addUpdateListener(this);
            addAnimation(this.f11322D);
        }
    }

    @Override // b1.AbstractC1064b
    void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        AbstractC0786c.beginSection("CompositionLayer#draw");
        this.f11325G.set(0.0f, 0.0f, this.f11310q.h(), this.f11310q.g());
        matrix.mapRect(this.f11325G);
        boolean z8 = this.f11309p.isApplyingOpacityToLayersEnabled() && this.f11323E.size() > 1 && i8 != 255;
        if (z8) {
            this.f11326H.setAlpha(i8);
            j.saveLayerCompat(canvas, this.f11325G, this.f11326H);
        } else {
            canvas.save();
        }
        if (z8) {
            i8 = 255;
        }
        for (int size = this.f11323E.size() - 1; size >= 0; size--) {
            if (((this.f11329K || !"__container".equals(this.f11310q.e())) && !this.f11325G.isEmpty()) ? canvas.clipRect(this.f11325G) : true) {
                ((AbstractC1064b) this.f11323E.get(size)).draw(canvas, matrix, i8);
            }
        }
        canvas.restore();
        AbstractC0786c.endSection("CompositionLayer#draw");
    }

    @Override // b1.AbstractC1064b, V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        super.getBounds(rectF, matrix, z8);
        for (int size = this.f11323E.size() - 1; size >= 0; size--) {
            this.f11324F.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((AbstractC1064b) this.f11323E.get(size)).getBounds(this.f11324F, this.f11308o, true);
            rectF.union(this.f11324F);
        }
    }

    public boolean hasMasks() {
        if (this.f11328J == null) {
            for (int size = this.f11323E.size() - 1; size >= 0; size--) {
                AbstractC1064b abstractC1064b = (AbstractC1064b) this.f11323E.get(size);
                if (abstractC1064b instanceof C1069g) {
                    if (abstractC1064b.n()) {
                        this.f11328J = Boolean.TRUE;
                        return true;
                    }
                } else if ((abstractC1064b instanceof C1065c) && ((C1065c) abstractC1064b).hasMasks()) {
                    this.f11328J = Boolean.TRUE;
                    return true;
                }
            }
            this.f11328J = Boolean.FALSE;
        }
        return this.f11328J.booleanValue();
    }

    public boolean hasMatte() {
        if (this.f11327I == null) {
            if (o()) {
                this.f11327I = Boolean.TRUE;
                return true;
            }
            for (int size = this.f11323E.size() - 1; size >= 0; size--) {
                if (((AbstractC1064b) this.f11323E.get(size)).o()) {
                    this.f11327I = Boolean.TRUE;
                    return true;
                }
            }
            this.f11327I = Boolean.FALSE;
        }
        return this.f11327I.booleanValue();
    }

    public void setClipToCompositionBounds(boolean z8) {
        this.f11329K = z8;
    }

    @Override // b1.AbstractC1064b
    public void setOutlineMasksAndMattes(boolean z8) {
        super.setOutlineMasksAndMattes(z8);
        Iterator it = this.f11323E.iterator();
        while (it.hasNext()) {
            ((AbstractC1064b) it.next()).setOutlineMasksAndMattes(z8);
        }
    }

    @Override // b1.AbstractC1064b
    public void setProgress(float f8) {
        super.setProgress(f8);
        if (this.f11322D != null) {
            f8 = ((((Float) this.f11322D.getValue()).floatValue() * this.f11310q.a().getFrameRate()) - this.f11310q.a().getStartFrame()) / (this.f11309p.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.f11322D == null) {
            f8 -= this.f11310q.n();
        }
        if (this.f11310q.r() != 0.0f && !"__container".equals(this.f11310q.e())) {
            f8 /= this.f11310q.r();
        }
        for (int size = this.f11323E.size() - 1; size >= 0; size--) {
            ((AbstractC1064b) this.f11323E.get(size)).setProgress(f8);
        }
    }

    @Override // b1.AbstractC1064b
    protected void u(Y0.e eVar, int i8, List list, Y0.e eVar2) {
        for (int i9 = 0; i9 < this.f11323E.size(); i9++) {
            ((AbstractC1064b) this.f11323E.get(i9)).resolveKeyPath(eVar, i8, list, eVar2);
        }
    }
}
