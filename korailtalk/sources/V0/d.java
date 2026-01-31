package V0;

import W0.a;
import a1.InterfaceC0826c;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import b1.AbstractC1064b;
import g1.C5536c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d implements e, m, a.b, Y0.f {

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5077a;

    /* renamed from: b, reason: collision with root package name */
    private final RectF f5078b;

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f5079c;

    /* renamed from: d, reason: collision with root package name */
    private final Path f5080d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f5081e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5082f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5083g;

    /* renamed from: h, reason: collision with root package name */
    private final List f5084h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.lottie.p f5085i;

    /* renamed from: j, reason: collision with root package name */
    private List f5086j;

    /* renamed from: k, reason: collision with root package name */
    private W0.p f5087k;

    public d(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.p pVar2) {
        this(pVar, abstractC1064b, pVar2.getName(), pVar2.isHidden(), a(pVar, abstractC1064b, pVar2.getItems()), b(pVar2.getItems()));
    }

    private static List a(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            c content = ((InterfaceC0826c) list.get(i8)).toContent(pVar, abstractC1064b);
            if (content != null) {
                arrayList.add(content);
            }
        }
        return arrayList;
    }

    static Z0.l b(List list) {
        for (int i8 = 0; i8 < list.size(); i8++) {
            InterfaceC0826c interfaceC0826c = (InterfaceC0826c) list.get(i8);
            if (interfaceC0826c instanceof Z0.l) {
                return (Z0.l) interfaceC0826c;
            }
        }
        return null;
    }

    private boolean e() {
        int i8 = 0;
        for (int i9 = 0; i9 < this.f5084h.size(); i9++) {
            if ((this.f5084h.get(i9) instanceof e) && (i8 = i8 + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    @Override // Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        W0.p pVar = this.f5087k;
        if (pVar != null) {
            pVar.applyValueCallback(t8, c5536c);
        }
    }

    List c() {
        if (this.f5086j == null) {
            this.f5086j = new ArrayList();
            for (int i8 = 0; i8 < this.f5084h.size(); i8++) {
                c cVar = (c) this.f5084h.get(i8);
                if (cVar instanceof m) {
                    this.f5086j.add((m) cVar);
                }
            }
        }
        return this.f5086j;
    }

    Matrix d() {
        W0.p pVar = this.f5087k;
        if (pVar != null) {
            return pVar.getMatrix();
        }
        this.f5079c.reset();
        return this.f5079c;
    }

    @Override // V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.f5083g) {
            return;
        }
        this.f5079c.set(matrix);
        W0.p pVar = this.f5087k;
        if (pVar != null) {
            this.f5079c.preConcat(pVar.getMatrix());
            i8 = (int) (((((this.f5087k.getOpacity() == null ? 100 : ((Integer) this.f5087k.getOpacity().getValue()).intValue()) / 100.0f) * i8) / 255.0f) * 255.0f);
        }
        boolean z8 = this.f5085i.isApplyingOpacityToLayersEnabled() && e() && i8 != 255;
        if (z8) {
            this.f5078b.set(0.0f, 0.0f, 0.0f, 0.0f);
            getBounds(this.f5078b, this.f5079c, true);
            this.f5077a.setAlpha(i8);
            f1.j.saveLayerCompat(canvas, this.f5078b, this.f5077a);
        }
        if (z8) {
            i8 = 255;
        }
        for (int size = this.f5084h.size() - 1; size >= 0; size--) {
            Object obj = this.f5084h.get(size);
            if (obj instanceof e) {
                ((e) obj).draw(canvas, this.f5079c, i8);
            }
        }
        if (z8) {
            canvas.restore();
        }
    }

    @Override // V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        this.f5079c.set(matrix);
        W0.p pVar = this.f5087k;
        if (pVar != null) {
            this.f5079c.preConcat(pVar.getMatrix());
        }
        this.f5081e.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f5084h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f5084h.get(size);
            if (cVar instanceof e) {
                ((e) cVar).getBounds(this.f5081e, this.f5079c, z8);
                rectF.union(this.f5081e);
            }
        }
    }

    @Override // V0.e
    public String getName() {
        return this.f5082f;
    }

    @Override // V0.m
    public Path getPath() {
        this.f5079c.reset();
        W0.p pVar = this.f5087k;
        if (pVar != null) {
            this.f5079c.set(pVar.getMatrix());
        }
        this.f5080d.reset();
        if (this.f5083g) {
            return this.f5080d;
        }
        for (int size = this.f5084h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f5084h.get(size);
            if (cVar instanceof m) {
                this.f5080d.addPath(((m) cVar).getPath(), this.f5079c);
            }
        }
        return this.f5080d;
    }

    @Override // W0.a.b
    public void onValueChanged() {
        this.f5085i.invalidateSelf();
    }

    @Override // Y0.f
    public void resolveKeyPath(Y0.e eVar, int i8, List<Y0.e> list, Y0.e eVar2) {
        if (eVar.matches(getName(), i8) || "__container".equals(getName())) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.addKey(getName());
                if (eVar.fullyResolvesTo(getName(), i8)) {
                    list.add(eVar2.resolve(this));
                }
            }
            if (eVar.propagateToChildren(getName(), i8)) {
                int iIncrementDepthBy = i8 + eVar.incrementDepthBy(getName(), i8);
                for (int i9 = 0; i9 < this.f5084h.size(); i9++) {
                    c cVar = (c) this.f5084h.get(i9);
                    if (cVar instanceof Y0.f) {
                        ((Y0.f) cVar).resolveKeyPath(eVar, iIncrementDepthBy, list, eVar2);
                    }
                }
            }
        }
    }

    @Override // V0.e
    public void setContents(List<c> list, List<c> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f5084h.size());
        arrayList.addAll(list);
        for (int size = this.f5084h.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f5084h.get(size);
            cVar.setContents(arrayList, this.f5084h.subList(0, size));
            arrayList.add(cVar);
        }
    }

    d(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, String str, boolean z8, List list, Z0.l lVar) {
        this.f5077a = new U0.a();
        this.f5078b = new RectF();
        this.f5079c = new Matrix();
        this.f5080d = new Path();
        this.f5081e = new RectF();
        this.f5082f = str;
        this.f5085i = pVar;
        this.f5083g = z8;
        this.f5084h = list;
        if (lVar != null) {
            W0.p pVarCreateAnimation = lVar.createAnimation();
            this.f5087k = pVarCreateAnimation;
            pVarCreateAnimation.addAnimationsToLayer(abstractC1064b);
            this.f5087k.addListener(this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            c cVar = (c) list.get(size);
            if (cVar instanceof j) {
                arrayList.add((j) cVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((j) arrayList.get(size2)).absorbContent(list.listIterator(list.size()));
        }
    }
}
