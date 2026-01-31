package Z2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f5707i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    private static final float[] f5708j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f5709k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f5710l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final Paint f5711a;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f5712b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5713c;

    /* renamed from: d, reason: collision with root package name */
    private int f5714d;

    /* renamed from: e, reason: collision with root package name */
    private int f5715e;

    /* renamed from: f, reason: collision with root package name */
    private int f5716f;

    /* renamed from: g, reason: collision with root package name */
    private final Path f5717g;

    /* renamed from: h, reason: collision with root package name */
    private Paint f5718h;

    public a() {
        this(-16777216);
    }

    public void drawCornerShadow(Canvas canvas, Matrix matrix, RectF rectF, int i8, float f8, float f9) {
        boolean z8 = f9 < 0.0f;
        Path path = this.f5717g;
        if (z8) {
            int[] iArr = f5709k;
            iArr[0] = 0;
            iArr[1] = this.f5716f;
            iArr[2] = this.f5715e;
            iArr[3] = this.f5714d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f8, f9);
            path.close();
            float f10 = -i8;
            rectF.inset(f10, f10);
            int[] iArr2 = f5709k;
            iArr2[0] = 0;
            iArr2[1] = this.f5714d;
            iArr2[2] = this.f5715e;
            iArr2[3] = this.f5716f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f11 = 1.0f - (i8 / fWidth);
        float[] fArr = f5710l;
        fArr[1] = f11;
        fArr[2] = ((1.0f - f11) / 2.0f) + f11;
        this.f5712b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f5709k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z8) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f5718h);
        }
        canvas.drawArc(rectF, f8, f9, true, this.f5712b);
        canvas.restore();
    }

    public void drawEdgeShadow(Canvas canvas, Matrix matrix, RectF rectF, int i8) {
        rectF.bottom += i8;
        rectF.offset(0.0f, -i8);
        int[] iArr = f5707i;
        iArr[0] = this.f5716f;
        iArr[1] = this.f5715e;
        iArr[2] = this.f5714d;
        Paint paint = this.f5713c;
        float f8 = rectF.left;
        paint.setShader(new LinearGradient(f8, rectF.top, f8, rectF.bottom, iArr, f5708j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f5713c);
        canvas.restore();
    }

    public Paint getShadowPaint() {
        return this.f5711a;
    }

    public void setShadowColor(int i8) {
        this.f5714d = androidx.core.graphics.a.setAlphaComponent(i8, 68);
        this.f5715e = androidx.core.graphics.a.setAlphaComponent(i8, 20);
        this.f5716f = androidx.core.graphics.a.setAlphaComponent(i8, 0);
        this.f5711a.setColor(this.f5714d);
    }

    public a(int i8) {
        this.f5717g = new Path();
        this.f5718h = new Paint();
        this.f5711a = new Paint();
        setShadowColor(i8);
        this.f5718h.setColor(0);
        Paint paint = new Paint(4);
        this.f5712b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5713c = new Paint(paint);
    }
}
