package O2;

import O2.d;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes2.dex */
public class c {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 2;

    /* renamed from: a, reason: collision with root package name */
    private final a f3401a;

    /* renamed from: b, reason: collision with root package name */
    private final View f3402b;

    /* renamed from: c, reason: collision with root package name */
    private final Path f3403c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f3404d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f3405e;

    /* renamed from: f, reason: collision with root package name */
    private d.e f3406f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f3407g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f3408h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f3409i;

    public interface a {
        void actualDraw(Canvas canvas);

        boolean actualIsOpaque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(a aVar) {
        this.f3401a = aVar;
        View view = (View) aVar;
        this.f3402b = view;
        view.setWillNotDraw(false);
        this.f3403c = new Path();
        this.f3404d = new Paint(7);
        Paint paint = new Paint(1);
        this.f3405e = paint;
        paint.setColor(0);
    }

    private void a(Canvas canvas) {
        if (e()) {
            Rect bounds = this.f3407g.getBounds();
            float fWidth = this.f3406f.centerX - (bounds.width() / 2.0f);
            float fHeight = this.f3406f.centerY - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f3407g.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    private float b(d.e eVar) {
        return V2.a.distanceToFurthestCorner(eVar.centerX, eVar.centerY, 0.0f, 0.0f, this.f3402b.getWidth(), this.f3402b.getHeight());
    }

    private void c() {
        if (STRATEGY == 1) {
            this.f3403c.rewind();
            d.e eVar = this.f3406f;
            if (eVar != null) {
                this.f3403c.addCircle(eVar.centerX, eVar.centerY, eVar.radius, Path.Direction.CW);
            }
        }
        this.f3402b.invalidate();
    }

    private boolean d() {
        d.e eVar = this.f3406f;
        boolean z8 = eVar == null || eVar.isInvalid();
        return STRATEGY == 0 ? !z8 && this.f3409i : !z8;
    }

    private boolean e() {
        return (this.f3408h || this.f3407g == null || this.f3406f == null) ? false : true;
    }

    private boolean f() {
        return (this.f3408h || Color.alpha(this.f3405e.getColor()) == 0) ? false : true;
    }

    public void buildCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f3408h = true;
            this.f3409i = false;
            this.f3402b.buildDrawingCache();
            Bitmap drawingCache = this.f3402b.getDrawingCache();
            if (drawingCache == null && this.f3402b.getWidth() != 0 && this.f3402b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f3402b.getWidth(), this.f3402b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f3402b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f3404d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f3408h = false;
            this.f3409i = true;
        }
    }

    public void destroyCircularRevealCache() {
        if (STRATEGY == 0) {
            this.f3409i = false;
            this.f3402b.destroyDrawingCache();
            this.f3404d.setShader(null);
            this.f3402b.invalidate();
        }
    }

    public void draw(Canvas canvas) {
        if (d()) {
            int i8 = STRATEGY;
            if (i8 == 0) {
                d.e eVar = this.f3406f;
                canvas.drawCircle(eVar.centerX, eVar.centerY, eVar.radius, this.f3404d);
                if (f()) {
                    d.e eVar2 = this.f3406f;
                    canvas.drawCircle(eVar2.centerX, eVar2.centerY, eVar2.radius, this.f3405e);
                }
            } else if (i8 == 1) {
                int iSave = canvas.save();
                canvas.clipPath(this.f3403c);
                this.f3401a.actualDraw(canvas);
                if (f()) {
                    canvas.drawRect(0.0f, 0.0f, this.f3402b.getWidth(), this.f3402b.getHeight(), this.f3405e);
                }
                canvas.restoreToCount(iSave);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i8);
                }
                this.f3401a.actualDraw(canvas);
                if (f()) {
                    canvas.drawRect(0.0f, 0.0f, this.f3402b.getWidth(), this.f3402b.getHeight(), this.f3405e);
                }
            }
        } else {
            this.f3401a.actualDraw(canvas);
            if (f()) {
                canvas.drawRect(0.0f, 0.0f, this.f3402b.getWidth(), this.f3402b.getHeight(), this.f3405e);
            }
        }
        a(canvas);
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f3407g;
    }

    public int getCircularRevealScrimColor() {
        return this.f3405e.getColor();
    }

    public d.e getRevealInfo() {
        d.e eVar = this.f3406f;
        if (eVar == null) {
            return null;
        }
        d.e eVar2 = new d.e(eVar);
        if (eVar2.isInvalid()) {
            eVar2.radius = b(eVar2);
        }
        return eVar2;
    }

    public boolean isOpaque() {
        return this.f3401a.actualIsOpaque() && !d();
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f3407g = drawable;
        this.f3402b.invalidate();
    }

    public void setCircularRevealScrimColor(int i8) {
        this.f3405e.setColor(i8);
        this.f3402b.invalidate();
    }

    public void setRevealInfo(d.e eVar) {
        if (eVar == null) {
            this.f3406f = null;
        } else {
            d.e eVar2 = this.f3406f;
            if (eVar2 == null) {
                this.f3406f = new d.e(eVar);
            } else {
                eVar2.set(eVar);
            }
            if (V2.a.geq(eVar.radius, b(eVar), 1.0E-4f)) {
                this.f3406f.radius = Float.MAX_VALUE;
            }
        }
        c();
    }
}
