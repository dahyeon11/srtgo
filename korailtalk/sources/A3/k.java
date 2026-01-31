package a3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes2.dex */
public class k {
    public static final a3.c PILL = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    d f5896a;

    /* renamed from: b, reason: collision with root package name */
    d f5897b;

    /* renamed from: c, reason: collision with root package name */
    d f5898c;

    /* renamed from: d, reason: collision with root package name */
    d f5899d;

    /* renamed from: e, reason: collision with root package name */
    a3.c f5900e;

    /* renamed from: f, reason: collision with root package name */
    a3.c f5901f;

    /* renamed from: g, reason: collision with root package name */
    a3.c f5902g;

    /* renamed from: h, reason: collision with root package name */
    a3.c f5903h;

    /* renamed from: i, reason: collision with root package name */
    f f5904i;

    /* renamed from: j, reason: collision with root package name */
    f f5905j;

    /* renamed from: k, reason: collision with root package name */
    f f5906k;

    /* renamed from: l, reason: collision with root package name */
    f f5907l;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f5908a;

        /* renamed from: b, reason: collision with root package name */
        private d f5909b;

        /* renamed from: c, reason: collision with root package name */
        private d f5910c;

        /* renamed from: d, reason: collision with root package name */
        private d f5911d;

        /* renamed from: e, reason: collision with root package name */
        private a3.c f5912e;

        /* renamed from: f, reason: collision with root package name */
        private a3.c f5913f;

        /* renamed from: g, reason: collision with root package name */
        private a3.c f5914g;

        /* renamed from: h, reason: collision with root package name */
        private a3.c f5915h;

        /* renamed from: i, reason: collision with root package name */
        private f f5916i;

        /* renamed from: j, reason: collision with root package name */
        private f f5917j;

        /* renamed from: k, reason: collision with root package name */
        private f f5918k;

        /* renamed from: l, reason: collision with root package name */
        private f f5919l;

        public b() {
            this.f5908a = h.b();
            this.f5909b = h.b();
            this.f5910c = h.b();
            this.f5911d = h.b();
            this.f5912e = new C0833a(0.0f);
            this.f5913f = new C0833a(0.0f);
            this.f5914g = new C0833a(0.0f);
            this.f5915h = new C0833a(0.0f);
            this.f5916i = h.c();
            this.f5917j = h.c();
            this.f5918k = h.c();
            this.f5919l = h.c();
        }

        private static float m(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f5895a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f5866a;
            }
            return -1.0f;
        }

        public k build() {
            return new k(this);
        }

        public b setAllCornerSizes(a3.c cVar) {
            return setTopLeftCornerSize(cVar).setTopRightCornerSize(cVar).setBottomRightCornerSize(cVar).setBottomLeftCornerSize(cVar);
        }

        public b setAllCorners(int i8, float f8) {
            return setAllCorners(h.a(i8)).setAllCornerSizes(f8);
        }

        public b setAllEdges(f fVar) {
            return setLeftEdge(fVar).setTopEdge(fVar).setRightEdge(fVar).setBottomEdge(fVar);
        }

        public b setBottomEdge(f fVar) {
            this.f5918k = fVar;
            return this;
        }

        public b setBottomLeftCorner(int i8, float f8) {
            return setBottomLeftCorner(h.a(i8)).setBottomLeftCornerSize(f8);
        }

        public b setBottomLeftCornerSize(float f8) {
            this.f5915h = new C0833a(f8);
            return this;
        }

        public b setBottomRightCorner(int i8, float f8) {
            return setBottomRightCorner(h.a(i8)).setBottomRightCornerSize(f8);
        }

        public b setBottomRightCornerSize(float f8) {
            this.f5914g = new C0833a(f8);
            return this;
        }

        public b setLeftEdge(f fVar) {
            this.f5919l = fVar;
            return this;
        }

        public b setRightEdge(f fVar) {
            this.f5917j = fVar;
            return this;
        }

        public b setTopEdge(f fVar) {
            this.f5916i = fVar;
            return this;
        }

        public b setTopLeftCorner(int i8, float f8) {
            return setTopLeftCorner(h.a(i8)).setTopLeftCornerSize(f8);
        }

        public b setTopLeftCornerSize(float f8) {
            this.f5912e = new C0833a(f8);
            return this;
        }

        public b setTopRightCorner(int i8, float f8) {
            return setTopRightCorner(h.a(i8)).setTopRightCornerSize(f8);
        }

        public b setTopRightCornerSize(float f8) {
            this.f5913f = new C0833a(f8);
            return this;
        }

        public b setBottomLeftCornerSize(a3.c cVar) {
            this.f5915h = cVar;
            return this;
        }

        public b setBottomRightCornerSize(a3.c cVar) {
            this.f5914g = cVar;
            return this;
        }

        public b setTopLeftCornerSize(a3.c cVar) {
            this.f5912e = cVar;
            return this;
        }

        public b setTopRightCornerSize(a3.c cVar) {
            this.f5913f = cVar;
            return this;
        }

        public b setAllCorners(d dVar) {
            return setTopLeftCorner(dVar).setTopRightCorner(dVar).setBottomRightCorner(dVar).setBottomLeftCorner(dVar);
        }

        public b setBottomLeftCorner(int i8, a3.c cVar) {
            return setBottomLeftCorner(h.a(i8)).setBottomLeftCornerSize(cVar);
        }

        public b setBottomRightCorner(int i8, a3.c cVar) {
            return setBottomRightCorner(h.a(i8)).setBottomRightCornerSize(cVar);
        }

        public b setTopLeftCorner(int i8, a3.c cVar) {
            return setTopLeftCorner(h.a(i8)).setTopLeftCornerSize(cVar);
        }

        public b setTopRightCorner(int i8, a3.c cVar) {
            return setTopRightCorner(h.a(i8)).setTopRightCornerSize(cVar);
        }

        public b setAllCornerSizes(float f8) {
            return setTopLeftCornerSize(f8).setTopRightCornerSize(f8).setBottomRightCornerSize(f8).setBottomLeftCornerSize(f8);
        }

        public b setBottomLeftCorner(d dVar) {
            this.f5911d = dVar;
            float fM = m(dVar);
            if (fM != -1.0f) {
                setBottomLeftCornerSize(fM);
            }
            return this;
        }

        public b setBottomRightCorner(d dVar) {
            this.f5910c = dVar;
            float fM = m(dVar);
            if (fM != -1.0f) {
                setBottomRightCornerSize(fM);
            }
            return this;
        }

        public b setTopLeftCorner(d dVar) {
            this.f5908a = dVar;
            float fM = m(dVar);
            if (fM != -1.0f) {
                setTopLeftCornerSize(fM);
            }
            return this;
        }

        public b setTopRightCorner(d dVar) {
            this.f5909b = dVar;
            float fM = m(dVar);
            if (fM != -1.0f) {
                setTopRightCornerSize(fM);
            }
            return this;
        }

        public b(k kVar) {
            this.f5908a = h.b();
            this.f5909b = h.b();
            this.f5910c = h.b();
            this.f5911d = h.b();
            this.f5912e = new C0833a(0.0f);
            this.f5913f = new C0833a(0.0f);
            this.f5914g = new C0833a(0.0f);
            this.f5915h = new C0833a(0.0f);
            this.f5916i = h.c();
            this.f5917j = h.c();
            this.f5918k = h.c();
            this.f5919l = h.c();
            this.f5908a = kVar.f5896a;
            this.f5909b = kVar.f5897b;
            this.f5910c = kVar.f5898c;
            this.f5911d = kVar.f5899d;
            this.f5912e = kVar.f5900e;
            this.f5913f = kVar.f5901f;
            this.f5914g = kVar.f5902g;
            this.f5915h = kVar.f5903h;
            this.f5916i = kVar.f5904i;
            this.f5917j = kVar.f5905j;
            this.f5918k = kVar.f5906k;
            this.f5919l = kVar.f5907l;
        }
    }

    public interface c {
        a3.c apply(a3.c cVar);
    }

    private static b a(Context context, int i8, int i9, int i10) {
        return b(context, i8, i9, new C0833a(i10));
    }

    private static b b(Context context, int i8, int i9, a3.c cVar) throws Resources.NotFoundException {
        if (i9 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i8);
            i8 = i9;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i8, J2.l.ShapeAppearance);
        try {
            int i10 = typedArrayObtainStyledAttributes.getInt(J2.l.ShapeAppearance_cornerFamily, 0);
            int i11 = typedArrayObtainStyledAttributes.getInt(J2.l.ShapeAppearance_cornerFamilyTopLeft, i10);
            int i12 = typedArrayObtainStyledAttributes.getInt(J2.l.ShapeAppearance_cornerFamilyTopRight, i10);
            int i13 = typedArrayObtainStyledAttributes.getInt(J2.l.ShapeAppearance_cornerFamilyBottomRight, i10);
            int i14 = typedArrayObtainStyledAttributes.getInt(J2.l.ShapeAppearance_cornerFamilyBottomLeft, i10);
            a3.c cVarC = c(typedArrayObtainStyledAttributes, J2.l.ShapeAppearance_cornerSize, cVar);
            a3.c cVarC2 = c(typedArrayObtainStyledAttributes, J2.l.ShapeAppearance_cornerSizeTopLeft, cVarC);
            a3.c cVarC3 = c(typedArrayObtainStyledAttributes, J2.l.ShapeAppearance_cornerSizeTopRight, cVarC);
            a3.c cVarC4 = c(typedArrayObtainStyledAttributes, J2.l.ShapeAppearance_cornerSizeBottomRight, cVarC);
            return new b().setTopLeftCorner(i11, cVarC2).setTopRightCorner(i12, cVarC3).setBottomRightCorner(i13, cVarC4).setBottomLeftCorner(i14, c(typedArrayObtainStyledAttributes, J2.l.ShapeAppearance_cornerSizeBottomLeft, cVarC));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b builder() {
        return new b();
    }

    private static a3.c c(TypedArray typedArray, int i8, a3.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i8);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i9 = typedValuePeekValue.type;
        return i9 == 5 ? new C0833a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i9 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f getBottomEdge() {
        return this.f5906k;
    }

    public d getBottomLeftCorner() {
        return this.f5899d;
    }

    public a3.c getBottomLeftCornerSize() {
        return this.f5903h;
    }

    public d getBottomRightCorner() {
        return this.f5898c;
    }

    public a3.c getBottomRightCornerSize() {
        return this.f5902g;
    }

    public f getLeftEdge() {
        return this.f5907l;
    }

    public f getRightEdge() {
        return this.f5905j;
    }

    public f getTopEdge() {
        return this.f5904i;
    }

    public d getTopLeftCorner() {
        return this.f5896a;
    }

    public a3.c getTopLeftCornerSize() {
        return this.f5900e;
    }

    public d getTopRightCorner() {
        return this.f5897b;
    }

    public a3.c getTopRightCornerSize() {
        return this.f5901f;
    }

    public boolean isRoundRect(RectF rectF) {
        boolean z8 = this.f5907l.getClass().equals(f.class) && this.f5905j.getClass().equals(f.class) && this.f5904i.getClass().equals(f.class) && this.f5906k.getClass().equals(f.class);
        float cornerSize = this.f5900e.getCornerSize(rectF);
        return z8 && ((this.f5901f.getCornerSize(rectF) > cornerSize ? 1 : (this.f5901f.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f5903h.getCornerSize(rectF) > cornerSize ? 1 : (this.f5903h.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0 && (this.f5902g.getCornerSize(rectF) > cornerSize ? 1 : (this.f5902g.getCornerSize(rectF) == cornerSize ? 0 : -1)) == 0) && ((this.f5897b instanceof j) && (this.f5896a instanceof j) && (this.f5898c instanceof j) && (this.f5899d instanceof j));
    }

    public b toBuilder() {
        return new b(this);
    }

    public k withCornerSize(float f8) {
        return toBuilder().setAllCornerSizes(f8).build();
    }

    public k withTransformedCornerSizes(c cVar) {
        return toBuilder().setTopLeftCornerSize(cVar.apply(getTopLeftCornerSize())).setTopRightCornerSize(cVar.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cVar.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cVar.apply(getBottomRightCornerSize())).build();
    }

    private k(b bVar) {
        this.f5896a = bVar.f5908a;
        this.f5897b = bVar.f5909b;
        this.f5898c = bVar.f5910c;
        this.f5899d = bVar.f5911d;
        this.f5900e = bVar.f5912e;
        this.f5901f = bVar.f5913f;
        this.f5902g = bVar.f5914g;
        this.f5903h = bVar.f5915h;
        this.f5904i = bVar.f5916i;
        this.f5905j = bVar.f5917j;
        this.f5906k = bVar.f5918k;
        this.f5907l = bVar.f5919l;
    }

    public static b builder(Context context, AttributeSet attributeSet, int i8, int i9) {
        return builder(context, attributeSet, i8, i9, 0);
    }

    public k withCornerSize(a3.c cVar) {
        return toBuilder().setAllCornerSizes(cVar).build();
    }

    public static b builder(Context context, AttributeSet attributeSet, int i8, int i9, int i10) {
        return builder(context, attributeSet, i8, i9, new C0833a(i10));
    }

    public static b builder(Context context, AttributeSet attributeSet, int i8, int i9, a3.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, J2.l.MaterialShape, i8, i9);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(J2.l.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, cVar);
    }

    public static b builder(Context context, int i8, int i9) {
        return a(context, i8, i9, 0);
    }

    public k() {
        this.f5896a = h.b();
        this.f5897b = h.b();
        this.f5898c = h.b();
        this.f5899d = h.b();
        this.f5900e = new C0833a(0.0f);
        this.f5901f = new C0833a(0.0f);
        this.f5902g = new C0833a(0.0f);
        this.f5903h = new C0833a(0.0f);
        this.f5904i = h.c();
        this.f5905j = h.c();
        this.f5906k = h.c();
        this.f5907l = h.c();
    }
}
