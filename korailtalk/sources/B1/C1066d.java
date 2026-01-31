package b1;

import T0.u;
import T0.y;
import W0.q;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.p;
import f1.j;
import g1.C5536c;

/* renamed from: b1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1066d extends AbstractC1064b {

    /* renamed from: D, reason: collision with root package name */
    private final Paint f11331D;

    /* renamed from: E, reason: collision with root package name */
    private final Rect f11332E;

    /* renamed from: F, reason: collision with root package name */
    private final Rect f11333F;

    /* renamed from: G, reason: collision with root package name */
    private final u f11334G;

    /* renamed from: H, reason: collision with root package name */
    private W0.a f11335H;

    /* renamed from: I, reason: collision with root package name */
    private W0.a f11336I;

    C1066d(p pVar, C1067e c1067e) {
        super(pVar, c1067e);
        this.f11331D = new U0.a(3);
        this.f11332E = new Rect();
        this.f11333F = new Rect();
        this.f11334G = pVar.getLottieImageAssetForId(c1067e.i());
    }

    private Bitmap z() {
        Bitmap bitmap;
        W0.a aVar = this.f11336I;
        if (aVar != null && (bitmap = (Bitmap) aVar.getValue()) != null) {
            return bitmap;
        }
        Bitmap bitmapForId = this.f11309p.getBitmapForId(this.f11310q.i());
        if (bitmapForId != null) {
            return bitmapForId;
        }
        u uVar = this.f11334G;
        if (uVar != null) {
            return uVar.getBitmap();
        }
        return null;
    }

    @Override // b1.AbstractC1064b, Y0.f
    public <T> void addValueCallback(T t8, C5536c c5536c) {
        super.addValueCallback(t8, c5536c);
        if (t8 == y.COLOR_FILTER) {
            if (c5536c == null) {
                this.f11335H = null;
                return;
            } else {
                this.f11335H = new q(c5536c);
                return;
            }
        }
        if (t8 == y.IMAGE) {
            if (c5536c == null) {
                this.f11336I = null;
            } else {
                this.f11336I = new q(c5536c);
            }
        }
    }

    @Override // b1.AbstractC1064b
    public void drawLayer(Canvas canvas, Matrix matrix, int i8) {
        Bitmap bitmapZ = z();
        if (bitmapZ == null || bitmapZ.isRecycled() || this.f11334G == null) {
            return;
        }
        float fDpScale = j.dpScale();
        this.f11331D.setAlpha(i8);
        W0.a aVar = this.f11335H;
        if (aVar != null) {
            this.f11331D.setColorFilter((ColorFilter) aVar.getValue());
        }
        canvas.save();
        canvas.concat(matrix);
        this.f11332E.set(0, 0, bitmapZ.getWidth(), bitmapZ.getHeight());
        if (this.f11309p.getMaintainOriginalImageBounds()) {
            this.f11333F.set(0, 0, (int) (this.f11334G.getWidth() * fDpScale), (int) (this.f11334G.getHeight() * fDpScale));
        } else {
            this.f11333F.set(0, 0, (int) (bitmapZ.getWidth() * fDpScale), (int) (bitmapZ.getHeight() * fDpScale));
        }
        canvas.drawBitmap(bitmapZ, this.f11332E, this.f11333F, this.f11331D);
        canvas.restore();
    }

    @Override // b1.AbstractC1064b, V0.e
    public void getBounds(RectF rectF, Matrix matrix, boolean z8) {
        super.getBounds(rectF, matrix, z8);
        if (this.f11334G != null) {
            float fDpScale = j.dpScale();
            rectF.set(0.0f, 0.0f, this.f11334G.getWidth() * fDpScale, this.f11334G.getHeight() * fDpScale);
            this.f11308o.mapRect(rectF);
        }
    }
}
