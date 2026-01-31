package V0;

import T0.y;
import a1.C0827d;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import b1.AbstractC1064b;
import g1.C5536c;

/* loaded from: classes.dex */
public class i extends a {

    /* renamed from: A, reason: collision with root package name */
    private final W0.a f5130A;

    /* renamed from: B, reason: collision with root package name */
    private W0.q f5131B;

    /* renamed from: r, reason: collision with root package name */
    private final String f5132r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f5133s;

    /* renamed from: t, reason: collision with root package name */
    private final O.e f5134t;

    /* renamed from: u, reason: collision with root package name */
    private final O.e f5135u;

    /* renamed from: v, reason: collision with root package name */
    private final RectF f5136v;

    /* renamed from: w, reason: collision with root package name */
    private final a1.g f5137w;

    /* renamed from: x, reason: collision with root package name */
    private final int f5138x;

    /* renamed from: y, reason: collision with root package name */
    private final W0.a f5139y;

    /* renamed from: z, reason: collision with root package name */
    private final W0.a f5140z;

    public i(com.airbnb.lottie.p pVar, AbstractC1064b abstractC1064b, a1.f fVar) {
        super(pVar, abstractC1064b, fVar.getCapType().toPaintCap(), fVar.getJoinType().toPaintJoin(), fVar.getMiterLimit(), fVar.getOpacity(), fVar.getWidth(), fVar.getLineDashPattern(), fVar.getDashOffset());
        this.f5134t = new O.e();
        this.f5135u = new O.e();
        this.f5136v = new RectF();
        this.f5132r = fVar.getName();
        this.f5137w = fVar.getGradientType();
        this.f5133s = fVar.isHidden();
        this.f5138x = (int) (pVar.getComposition().getDuration() / 32.0f);
        W0.a aVarCreateAnimation = fVar.getGradientColor().createAnimation();
        this.f5139y = aVarCreateAnimation;
        aVarCreateAnimation.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation);
        W0.a aVarCreateAnimation2 = fVar.getStartPoint().createAnimation();
        this.f5140z = aVarCreateAnimation2;
        aVarCreateAnimation2.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation2);
        W0.a aVarCreateAnimation3 = fVar.getEndPoint().createAnimation();
        this.f5130A = aVarCreateAnimation3;
        aVarCreateAnimation3.addUpdateListener(this);
        abstractC1064b.addAnimation(aVarCreateAnimation3);
    }

    private int[] c(int[] iArr) {
        W0.q qVar = this.f5131B;
        if (qVar != null) {
            Integer[] numArr = (Integer[]) qVar.getValue();
            int i8 = 0;
            if (iArr.length == numArr.length) {
                while (i8 < iArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i8 < numArr.length) {
                    iArr[i8] = numArr[i8].intValue();
                    i8++;
                }
            }
        }
        return iArr;
    }

    private int d() {
        int iRound = Math.round(this.f5140z.getProgress() * this.f5138x);
        int iRound2 = Math.round(this.f5130A.getProgress() * this.f5138x);
        int iRound3 = Math.round(this.f5139y.getProgress() * this.f5138x);
        int i8 = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i8 = i8 * 31 * iRound2;
        }
        return iRound3 != 0 ? i8 * 31 * iRound3 : i8;
    }

    private LinearGradient e() {
        long jD = d();
        LinearGradient linearGradient = (LinearGradient) this.f5134t.get(jD);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF pointF = (PointF) this.f5140z.getValue();
        PointF pointF2 = (PointF) this.f5130A.getValue();
        C0827d c0827d = (C0827d) this.f5139y.getValue();
        LinearGradient linearGradient2 = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, c(c0827d.getColors()), c0827d.getPositions(), Shader.TileMode.CLAMP);
        this.f5134t.put(jD, linearGradient2);
        return linearGradient2;
    }

    private RadialGradient f() {
        long jD = d();
        RadialGradient radialGradient = (RadialGradient) this.f5135u.get(jD);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF pointF = (PointF) this.f5140z.getValue();
        PointF pointF2 = (PointF) this.f5130A.getValue();
        C0827d c0827d = (C0827d) this.f5139y.getValue();
        int[] iArrC = c(c0827d.getColors());
        float[] positions = c0827d.getPositions();
        RadialGradient radialGradient2 = new RadialGradient(pointF.x, pointF.y, (float) Math.hypot(pointF2.x - r7, pointF2.y - r8), iArrC, positions, Shader.TileMode.CLAMP);
        this.f5135u.put(jD, radialGradient2);
        return radialGradient2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // V0.a, V0.k, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        super.addValueCallback(t8, c5536c);
        if (t8 == y.GRADIENT_COLOR) {
            W0.q qVar = this.f5131B;
            if (qVar != null) {
                this.f5062f.removeAnimation(qVar);
            }
            if (c5536c == null) {
                this.f5131B = null;
                return;
            }
            W0.q qVar2 = new W0.q(c5536c);
            this.f5131B = qVar2;
            qVar2.addUpdateListener(this);
            this.f5062f.addAnimation(this.f5131B);
        }
    }

    @Override // V0.a, V0.e
    public void draw(Canvas canvas, Matrix matrix, int i8) {
        if (this.f5133s) {
            return;
        }
        getBounds(this.f5136v, matrix, false);
        Shader shaderE = this.f5137w == a1.g.LINEAR ? e() : f();
        shaderE.setLocalMatrix(matrix);
        this.f5065i.setShader(shaderE);
        super.draw(canvas, matrix, i8);
    }

    @Override // V0.a, V0.k, V0.c, V0.e
    public String getName() {
        return this.f5132r;
    }
}
