package b1;

import Q7.X;
import T0.y;
import W0.o;
import W0.q;
import Y0.b;
import Z0.k;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.p;
import f1.j;
import g1.C5536c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1071i extends AbstractC1064b {

    /* renamed from: D, reason: collision with root package name */
    private final StringBuilder f11371D;

    /* renamed from: E, reason: collision with root package name */
    private final RectF f11372E;

    /* renamed from: F, reason: collision with root package name */
    private final Matrix f11373F;

    /* renamed from: G, reason: collision with root package name */
    private final Paint f11374G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f11375H;

    /* renamed from: I, reason: collision with root package name */
    private final Map f11376I;

    /* renamed from: J, reason: collision with root package name */
    private final O.e f11377J;

    /* renamed from: K, reason: collision with root package name */
    private final o f11378K;

    /* renamed from: L, reason: collision with root package name */
    private final p f11379L;

    /* renamed from: M, reason: collision with root package name */
    private final T0.h f11380M;

    /* renamed from: N, reason: collision with root package name */
    private W0.a f11381N;

    /* renamed from: O, reason: collision with root package name */
    private W0.a f11382O;

    /* renamed from: P, reason: collision with root package name */
    private W0.a f11383P;

    /* renamed from: Q, reason: collision with root package name */
    private W0.a f11384Q;

    /* renamed from: R, reason: collision with root package name */
    private W0.a f11385R;

    /* renamed from: S, reason: collision with root package name */
    private W0.a f11386S;

    /* renamed from: T, reason: collision with root package name */
    private W0.a f11387T;

    /* renamed from: U, reason: collision with root package name */
    private W0.a f11388U;

    /* renamed from: V, reason: collision with root package name */
    private W0.a f11389V;

    /* renamed from: W, reason: collision with root package name */
    private W0.a f11390W;

    /* renamed from: b1.i$a */
    class a extends Paint {
        a(int i8) {
            super(i8);
            setStyle(Paint.Style.FILL);
        }
    }

    /* renamed from: b1.i$b */
    class b extends Paint {
        b(int i8) {
            super(i8);
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: b1.i$c */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11393a;

        static {
            int[] iArr = new int[b.a.values().length];
            f11393a = iArr;
            try {
                iArr[b.a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11393a[b.a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11393a[b.a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    C1071i(p pVar, C1067e c1067e) {
        Z0.b bVar;
        Z0.b bVar2;
        Z0.a aVar;
        Z0.a aVar2;
        super(pVar, c1067e);
        this.f11371D = new StringBuilder(2);
        this.f11372E = new RectF();
        this.f11373F = new Matrix();
        this.f11374G = new a(1);
        this.f11375H = new b(1);
        this.f11376I = new HashMap();
        this.f11377J = new O.e();
        this.f11379L = pVar;
        this.f11380M = c1067e.a();
        o oVarCreateAnimation = c1067e.o().createAnimation();
        this.f11378K = oVarCreateAnimation;
        oVarCreateAnimation.addUpdateListener(this);
        addAnimation(oVarCreateAnimation);
        k kVarP = c1067e.p();
        if (kVarP != null && (aVar2 = kVarP.color) != null) {
            W0.a aVarCreateAnimation = aVar2.createAnimation();
            this.f11381N = aVarCreateAnimation;
            aVarCreateAnimation.addUpdateListener(this);
            addAnimation(this.f11381N);
        }
        if (kVarP != null && (aVar = kVarP.stroke) != null) {
            W0.a aVarCreateAnimation2 = aVar.createAnimation();
            this.f11383P = aVarCreateAnimation2;
            aVarCreateAnimation2.addUpdateListener(this);
            addAnimation(this.f11383P);
        }
        if (kVarP != null && (bVar2 = kVarP.strokeWidth) != null) {
            W0.a aVarCreateAnimation3 = bVar2.createAnimation();
            this.f11385R = aVarCreateAnimation3;
            aVarCreateAnimation3.addUpdateListener(this);
            addAnimation(this.f11385R);
        }
        if (kVarP == null || (bVar = kVarP.tracking) == null) {
            return;
        }
        W0.a aVarCreateAnimation4 = bVar.createAnimation();
        this.f11387T = aVarCreateAnimation4;
        aVarCreateAnimation4.addUpdateListener(this);
        addAnimation(this.f11387T);
    }

    private String A(String str, int i8) {
        int iCodePointAt = str.codePointAt(i8);
        int iCharCount = Character.charCount(iCodePointAt) + i8;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!N(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j8 = iCodePointAt;
        if (this.f11377J.containsKey(j8)) {
            return (String) this.f11377J.get(j8);
        }
        this.f11371D.setLength(0);
        while (i8 < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i8);
            this.f11371D.appendCodePoint(iCodePointAt3);
            i8 += Character.charCount(iCodePointAt3);
        }
        String string = this.f11371D.toString();
        this.f11377J.put(j8, string);
        return string;
    }

    private void B(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private void C(Y0.d dVar, Matrix matrix, float f8, Y0.b bVar, Canvas canvas) {
        List listJ = J(dVar);
        for (int i8 = 0; i8 < listJ.size(); i8++) {
            Path path = ((V0.d) listJ.get(i8)).getPath();
            path.computeBounds(this.f11372E, false);
            this.f11373F.set(matrix);
            this.f11373F.preTranslate(0.0f, (-bVar.baselineShift) * j.dpScale());
            this.f11373F.preScale(f8, f8);
            path.transform(this.f11373F);
            if (bVar.strokeOverFill) {
                F(path, this.f11374G, canvas);
                F(path, this.f11375H, canvas);
            } else {
                F(path, this.f11375H, canvas);
                F(path, this.f11374G, canvas);
            }
        }
    }

    private void D(String str, Y0.b bVar, Canvas canvas) {
        if (bVar.strokeOverFill) {
            B(str, this.f11374G, canvas);
            B(str, this.f11375H, canvas);
        } else {
            B(str, this.f11375H, canvas);
            B(str, this.f11374G, canvas);
        }
    }

    private void E(String str, Y0.b bVar, Canvas canvas, float f8) {
        int length = 0;
        while (length < str.length()) {
            String strA = A(str, length);
            length += strA.length();
            D(strA, bVar, canvas);
            canvas.translate(this.f11374G.measureText(strA) + f8, 0.0f);
        }
    }

    private void F(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void G(String str, Y0.b bVar, Matrix matrix, Y0.c cVar, Canvas canvas, float f8, float f9) {
        float fFloatValue;
        for (int i8 = 0; i8 < str.length(); i8++) {
            Y0.d dVar = (Y0.d) this.f11380M.getCharacters().get(Y0.d.hashFor(str.charAt(i8), cVar.getFamily(), cVar.getStyle()));
            if (dVar != null) {
                C(dVar, matrix, f9, bVar, canvas);
                float width = ((float) dVar.getWidth()) * f9 * j.dpScale() * f8;
                float f10 = bVar.tracking / 10.0f;
                W0.a aVar = this.f11388U;
                if (aVar != null) {
                    fFloatValue = ((Float) aVar.getValue()).floatValue();
                } else {
                    W0.a aVar2 = this.f11387T;
                    if (aVar2 != null) {
                        fFloatValue = ((Float) aVar2.getValue()).floatValue();
                    }
                    canvas.translate(width + (f10 * f8), 0.0f);
                }
                f10 += fFloatValue;
                canvas.translate(width + (f10 * f8), 0.0f);
            }
        }
    }

    private void H(Y0.b bVar, Matrix matrix, Y0.c cVar, Canvas canvas) {
        W0.a aVar = this.f11389V;
        float fFloatValue = (aVar != null ? ((Float) aVar.getValue()).floatValue() : bVar.size) / 100.0f;
        float scale = j.getScale(matrix);
        String str = bVar.text;
        float fDpScale = bVar.lineHeight * j.dpScale();
        List listL = L(str);
        int size = listL.size();
        for (int i8 = 0; i8 < size; i8++) {
            String str2 = (String) listL.get(i8);
            float fK = K(str2, cVar, fFloatValue, scale);
            canvas.save();
            z(bVar.justification, canvas, fK);
            canvas.translate(0.0f, (i8 * fDpScale) - (((size - 1) * fDpScale) / 2.0f));
            G(str2, bVar, matrix, cVar, canvas, scale, fFloatValue);
            canvas.restore();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[LOOP:0: B:20:0x008d->B:21:0x008f, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void I(Y0.b r8, Y0.c r9, android.graphics.Canvas r10) {
        /*
            r7 = this;
            android.graphics.Typeface r9 = r7.M(r9)
            if (r9 != 0) goto L7
            return
        L7:
            java.lang.String r0 = r8.text
            com.airbnb.lottie.p r1 = r7.f11379L
            T0.G r1 = r1.getTextDelegate()
            if (r1 == 0) goto L19
            java.lang.String r2 = r7.getName()
            java.lang.String r0 = r1.getTextInternal(r2, r0)
        L19:
            android.graphics.Paint r1 = r7.f11374G
            r1.setTypeface(r9)
            W0.a r9 = r7.f11389V
            if (r9 == 0) goto L2d
            java.lang.Object r9 = r9.getValue()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L2f
        L2d:
            float r9 = r8.size
        L2f:
            android.graphics.Paint r1 = r7.f11374G
            float r2 = f1.j.dpScale()
            float r2 = r2 * r9
            r1.setTextSize(r2)
            android.graphics.Paint r1 = r7.f11375H
            android.graphics.Paint r2 = r7.f11374G
            android.graphics.Typeface r2 = r2.getTypeface()
            r1.setTypeface(r2)
            android.graphics.Paint r1 = r7.f11375H
            android.graphics.Paint r2 = r7.f11374G
            float r2 = r2.getTextSize()
            r1.setTextSize(r2)
            float r1 = r8.lineHeight
            float r2 = f1.j.dpScale()
            float r1 = r1 * r2
            int r2 = r8.tracking
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            W0.a r3 = r7.f11388U
            if (r3 == 0) goto L6c
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6a:
            float r2 = r2 + r3
            goto L7b
        L6c:
            W0.a r3 = r7.f11387T
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r3.getValue()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6a
        L7b:
            float r3 = f1.j.dpScale()
            float r2 = r2 * r3
            float r2 = r2 * r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 / r9
            java.util.List r9 = r7.L(r0)
            int r0 = r9.size()
            r3 = 0
        L8d:
            if (r3 >= r0) goto Lc3
            java.lang.Object r4 = r9.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            android.graphics.Paint r5 = r7.f11375H
            float r5 = r5.measureText(r4)
            int r6 = r4.length()
            int r6 = r6 + (-1)
            float r6 = (float) r6
            float r6 = r6 * r2
            float r5 = r5 + r6
            r10.save()
            Y0.b$a r6 = r8.justification
            r7.z(r6, r10, r5)
            int r5 = r0 + (-1)
            float r5 = (float) r5
            float r5 = r5 * r1
            r6 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r6
            float r6 = (float) r3
            float r6 = r6 * r1
            float r6 = r6 - r5
            r5 = 0
            r10.translate(r5, r6)
            r7.E(r4, r8, r10, r2)
            r10.restore()
            int r3 = r3 + 1
            goto L8d
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.C1071i.I(Y0.b, Y0.c, android.graphics.Canvas):void");
    }

    private List J(Y0.d dVar) {
        if (this.f11376I.containsKey(dVar)) {
            return (List) this.f11376I.get(dVar);
        }
        List<a1.p> shapes = dVar.getShapes();
        int size = shapes.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(new V0.d(this.f11379L, this, shapes.get(i8)));
        }
        this.f11376I.put(dVar, arrayList);
        return arrayList;
    }

    private float K(String str, Y0.c cVar, float f8, float f9) {
        float width = 0.0f;
        for (int i8 = 0; i8 < str.length(); i8++) {
            Y0.d dVar = (Y0.d) this.f11380M.getCharacters().get(Y0.d.hashFor(str.charAt(i8), cVar.getFamily(), cVar.getStyle()));
            if (dVar != null) {
                width = (float) (width + (dVar.getWidth() * f8 * j.dpScale() * f9));
            }
        }
        return width;
    }

    private List L(String str) {
        return Arrays.asList(str.replaceAll("\r\n", X.CR).replaceAll(X.LF, X.CR).split(X.CR));
    }

    private Typeface M(Y0.c cVar) {
        Typeface typeface;
        W0.a aVar = this.f11390W;
        if (aVar != null && (typeface = (Typeface) aVar.getValue()) != null) {
            return typeface;
        }
        Typeface typeface2 = this.f11379L.getTypeface(cVar.getFamily(), cVar.getStyle());
        return typeface2 != null ? typeface2 : cVar.getTypeface();
    }

    private boolean N(int i8) {
        return Character.getType(i8) == 16 || Character.getType(i8) == 27 || Character.getType(i8) == 6 || Character.getType(i8) == 28 || Character.getType(i8) == 8 || Character.getType(i8) == 19;
    }

    private void z(b.a aVar, Canvas canvas, float f8) {
        int i8 = c.f11393a[aVar.ordinal()];
        if (i8 == 2) {
            canvas.translate(-f8, 0.0f);
        } else {
            if (i8 != 3) {
                return;
            }
            canvas.translate((-f8) / 2.0f, 0.0f);
        }
    }

    @Override // b1.AbstractC1064b, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        super.addValueCallback(t8, c5536c);
        if (t8 == y.COLOR) {
            W0.a aVar = this.f11382O;
            if (aVar != null) {
                removeAnimation(aVar);
            }
            if (c5536c == null) {
                this.f11382O = null;
                return;
            }
            q qVar = new q(c5536c);
            this.f11382O = qVar;
            qVar.addUpdateListener(this);
            addAnimation(this.f11382O);
            return;
        }
        if (t8 == y.STROKE_COLOR) {
            W0.a aVar2 = this.f11384Q;
            if (aVar2 != null) {
                removeAnimation(aVar2);
            }
            if (c5536c == null) {
                this.f11384Q = null;
                return;
            }
            q qVar2 = new q(c5536c);
            this.f11384Q = qVar2;
            qVar2.addUpdateListener(this);
            addAnimation(this.f11384Q);
            return;
        }
        if (t8 == y.STROKE_WIDTH) {
            W0.a aVar3 = this.f11386S;
            if (aVar3 != null) {
                removeAnimation(aVar3);
            }
            if (c5536c == null) {
                this.f11386S = null;
                return;
            }
            q qVar3 = new q(c5536c);
            this.f11386S = qVar3;
            qVar3.addUpdateListener(this);
            addAnimation(this.f11386S);
            return;
        }
        if (t8 == y.TEXT_TRACKING) {
            W0.a aVar4 = this.f11388U;
            if (aVar4 != null) {
                removeAnimation(aVar4);
            }
            if (c5536c == null) {
                this.f11388U = null;
                return;
            }
            q qVar4 = new q(c5536c);
            this.f11388U = qVar4;
            qVar4.addUpdateListener(this);
            addAnimation(this.f11388U);
            return;
        }
        if (t8 == y.TEXT_SIZE) {
            W0.a aVar5 = this.f11389V;
            if (aVar5 != null) {
                removeAnimation(aVar5);
            }
            if (c5536c == null) {
                this.f11389V = null;
                return;
            }
            q qVar5 = new q(c5536c);
            this.f11389V = qVar5;
            qVar5.addUpdateListener(this);
            addAnimation(this.f11389V);
            return;
        }
        if (t8 != y.TYPEFACE) {
            if (t8 == y.TEXT) {
                this.f11378K.setStringValueCallback(c5536c);
                return;
            }
            return;
        }
        W0.a aVar6 = this.f11390W;
        if (aVar6 != null) {
            removeAnimation(aVar6);
        }
        if (c5536c == null) {
            this.f11390W = null;
            return;
        }
        q qVar6 = new q(c5536c);
        this.f11390W = qVar6;
        qVar6.addUpdateListener(this);
        addAnimation(this.f11390W);
    }

    @Override // b1.AbstractC1064b
    void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        canvas.save();
        if (!this.f11379L.useTextGlyphs()) {
            canvas.concat(matrix);
        }
        Y0.b bVar = (Y0.b) this.f11378K.getValue();
        Y0.c cVar = this.f11380M.getFonts().get(bVar.fontName);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        W0.a aVar = this.f11382O;
        if (aVar != null) {
            this.f11374G.setColor(((Integer) aVar.getValue()).intValue());
        } else {
            W0.a aVar2 = this.f11381N;
            if (aVar2 != null) {
                this.f11374G.setColor(((Integer) aVar2.getValue()).intValue());
            } else {
                this.f11374G.setColor(bVar.color);
            }
        }
        W0.a aVar3 = this.f11384Q;
        if (aVar3 != null) {
            this.f11375H.setColor(((Integer) aVar3.getValue()).intValue());
        } else {
            W0.a aVar4 = this.f11383P;
            if (aVar4 != null) {
                this.f11375H.setColor(((Integer) aVar4.getValue()).intValue());
            } else {
                this.f11375H.setColor(bVar.strokeColor);
            }
        }
        int iIntValue = ((this.f11317x.getOpacity() == null ? 100 : ((Integer) this.f11317x.getOpacity().getValue()).intValue()) * 255) / 100;
        this.f11374G.setAlpha(iIntValue);
        this.f11375H.setAlpha(iIntValue);
        W0.a aVar5 = this.f11386S;
        if (aVar5 != null) {
            this.f11375H.setStrokeWidth(((Float) aVar5.getValue()).floatValue());
        } else {
            W0.a aVar6 = this.f11385R;
            if (aVar6 != null) {
                this.f11375H.setStrokeWidth(((Float) aVar6.getValue()).floatValue());
            } else {
                this.f11375H.setStrokeWidth(bVar.strokeWidth * j.dpScale() * j.getScale(matrix));
            }
        }
        if (this.f11379L.useTextGlyphs()) {
            H(bVar, matrix, cVar, canvas);
        } else {
            I(bVar, cVar, canvas);
        }
        canvas.restore();
    }

    @Override // b1.AbstractC1064b, V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        super.getBounds(rectF, matrix, z8);
        rectF.set(0.0f, 0.0f, this.f11380M.getBounds().width(), this.f11380M.getBounds().height());
    }
}
