package b1;

import T0.y;
import W0.q;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.p;
import g1.C5536c;

/* renamed from: b1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1070h extends AbstractC1064b {

    /* renamed from: D, reason: collision with root package name */
    private final RectF f11365D;

    /* renamed from: E, reason: collision with root package name */
    private final Paint f11366E;

    /* renamed from: F, reason: collision with root package name */
    private final float[] f11367F;

    /* renamed from: G, reason: collision with root package name */
    private final Path f11368G;

    /* renamed from: H, reason: collision with root package name */
    private final C1067e f11369H;

    /* renamed from: I, reason: collision with root package name */
    private W0.a f11370I;

    C1070h(p pVar, C1067e c1067e) {
        super(pVar, c1067e);
        this.f11365D = new RectF();
        U0.a aVar = new U0.a();
        this.f11366E = aVar;
        this.f11367F = new float[8];
        this.f11368G = new Path();
        this.f11369H = c1067e;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(c1067e.k());
    }

    @Override // b1.AbstractC1064b, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        super.addValueCallback(t8, c5536c);
        if (t8 == y.COLOR_FILTER) {
            if (c5536c == null) {
                this.f11370I = null;
            } else {
                this.f11370I = new q(c5536c);
            }
        }
    }

    @Override // b1.AbstractC1064b
    public void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        int iAlpha = Color.alpha(this.f11369H.k());
        if (iAlpha == 0) {
            return;
        }
        int iIntValue = (int) ((i8 / 255.0f) * (((iAlpha / 255.0f) * (this.f11317x.getOpacity() == null ? 100 : ((Integer) this.f11317x.getOpacity().getValue()).intValue())) / 100.0f) * 255.0f);
        this.f11366E.setAlpha(iIntValue);
        W0.a aVar = this.f11370I;
        if (aVar != null) {
            this.f11366E.setColorFilter((ColorFilter) aVar.getValue());
        }
        if (iIntValue > 0) {
            float[] fArr = this.f11367F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.f11369H.m();
            float[] fArr2 = this.f11367F;
            fArr2[3] = 0.0f;
            fArr2[4] = this.f11369H.m();
            this.f11367F[5] = this.f11369H.l();
            float[] fArr3 = this.f11367F;
            fArr3[6] = 0.0f;
            fArr3[7] = this.f11369H.l();
            matrix.mapPoints(this.f11367F);
            this.f11368G.reset();
            Path path = this.f11368G;
            float[] fArr4 = this.f11367F;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.f11368G;
            float[] fArr5 = this.f11367F;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.f11368G;
            float[] fArr6 = this.f11367F;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.f11368G;
            float[] fArr7 = this.f11367F;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.f11368G;
            float[] fArr8 = this.f11367F;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.f11368G.close();
            canvas.drawPath(this.f11368G, this.f11366E);
        }
    }

    @Override // b1.AbstractC1064b, V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        super.getBounds(rectF, matrix, z8);
        this.f11365D.set(0.0f, 0.0f, this.f11369H.m(), this.f11369H.l());
        this.f11308o.mapRect(this.f11365D);
        rectF.set(this.f11365D);
    }
}
