package com.journeyapps.barcodescanner;

import K3.j;
import K3.o;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.journeyapps.barcodescanner.a;
import j4.s;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ViewfinderView extends View {

    /* renamed from: n, reason: collision with root package name */
    protected static final int[] f27461n = {0, 64, 128, 192, 255, 192, 128, 64};

    /* renamed from: a, reason: collision with root package name */
    protected final Paint f27462a;

    /* renamed from: b, reason: collision with root package name */
    protected Bitmap f27463b;

    /* renamed from: c, reason: collision with root package name */
    protected int f27464c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f27465d;

    /* renamed from: e, reason: collision with root package name */
    protected final int f27466e;

    /* renamed from: f, reason: collision with root package name */
    protected final int f27467f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f27468g;

    /* renamed from: h, reason: collision with root package name */
    protected int f27469h;

    /* renamed from: i, reason: collision with root package name */
    protected List f27470i;

    /* renamed from: j, reason: collision with root package name */
    protected List f27471j;

    /* renamed from: k, reason: collision with root package name */
    protected com.journeyapps.barcodescanner.a f27472k;

    /* renamed from: l, reason: collision with root package name */
    protected Rect f27473l;

    /* renamed from: m, reason: collision with root package name */
    protected s f27474m;

    class a implements a.f {
        a() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void cameraClosed() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void cameraError(Exception exc) {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewSized() {
            ViewfinderView.this.a();
            ViewfinderView.this.invalidate();
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewStarted() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewStopped() {
        }
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27462a = new Paint(1);
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.zxing_finder);
        this.f27464c = typedArrayObtainStyledAttributes.getColor(o.zxing_finder_zxing_viewfinder_mask, resources.getColor(j.zxing_viewfinder_mask));
        this.f27465d = typedArrayObtainStyledAttributes.getColor(o.zxing_finder_zxing_result_view, resources.getColor(j.zxing_result_view));
        this.f27466e = typedArrayObtainStyledAttributes.getColor(o.zxing_finder_zxing_viewfinder_laser, resources.getColor(j.zxing_viewfinder_laser));
        this.f27467f = typedArrayObtainStyledAttributes.getColor(o.zxing_finder_zxing_possible_result_points, resources.getColor(j.zxing_possible_result_points));
        this.f27468g = typedArrayObtainStyledAttributes.getBoolean(o.zxing_finder_zxing_viewfinder_laser_visibility, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f27469h = 0;
        this.f27470i = new ArrayList(20);
        this.f27471j = new ArrayList(20);
    }

    protected void a() {
        com.journeyapps.barcodescanner.a aVar = this.f27472k;
        if (aVar == null) {
            return;
        }
        Rect framingRect = aVar.getFramingRect();
        s previewSize = this.f27472k.getPreviewSize();
        if (framingRect == null || previewSize == null) {
            return;
        }
        this.f27473l = framingRect;
        this.f27474m = previewSize;
    }

    public void addPossibleResultPoint(F3.s sVar) {
        if (this.f27470i.size() < 20) {
            this.f27470i.add(sVar);
        }
    }

    public void drawResultBitmap(Bitmap bitmap) {
        this.f27463b = bitmap;
        invalidate();
    }

    public void drawViewfinder() {
        Bitmap bitmap = this.f27463b;
        this.f27463b = null;
        if (bitmap != null) {
            bitmap.recycle();
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        s sVar;
        a();
        Rect rect = this.f27473l;
        if (rect == null || (sVar = this.f27474m) == null) {
            return;
        }
        int width = getWidth();
        int height = getHeight();
        this.f27462a.setColor(this.f27463b != null ? this.f27465d : this.f27464c);
        float f8 = width;
        canvas.drawRect(0.0f, 0.0f, f8, rect.top, this.f27462a);
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom + 1, this.f27462a);
        canvas.drawRect(rect.right + 1, rect.top, f8, rect.bottom + 1, this.f27462a);
        canvas.drawRect(0.0f, rect.bottom + 1, f8, height, this.f27462a);
        if (this.f27463b != null) {
            this.f27462a.setAlpha(160);
            canvas.drawBitmap(this.f27463b, (Rect) null, rect, this.f27462a);
            return;
        }
        if (this.f27468g) {
            this.f27462a.setColor(this.f27466e);
            Paint paint = this.f27462a;
            int[] iArr = f27461n;
            paint.setAlpha(iArr[this.f27469h]);
            this.f27469h = (this.f27469h + 1) % iArr.length;
            int iHeight = (rect.height() / 2) + rect.top;
            canvas.drawRect(rect.left + 2, iHeight - 1, rect.right - 1, iHeight + 2, this.f27462a);
        }
        float width2 = getWidth() / sVar.width;
        float height2 = getHeight() / sVar.height;
        if (!this.f27471j.isEmpty()) {
            this.f27462a.setAlpha(80);
            this.f27462a.setColor(this.f27467f);
            for (F3.s sVar2 : this.f27471j) {
                canvas.drawCircle((int) (sVar2.getX() * width2), (int) (sVar2.getY() * height2), 3.0f, this.f27462a);
            }
            this.f27471j.clear();
        }
        if (!this.f27470i.isEmpty()) {
            this.f27462a.setAlpha(160);
            this.f27462a.setColor(this.f27467f);
            for (F3.s sVar3 : this.f27470i) {
                canvas.drawCircle((int) (sVar3.getX() * width2), (int) (sVar3.getY() * height2), 6.0f, this.f27462a);
            }
            List list = this.f27470i;
            List list2 = this.f27471j;
            this.f27470i = list2;
            this.f27471j = list;
            list2.clear();
        }
        postInvalidateDelayed(80L, rect.left - 6, rect.top - 6, rect.right + 6, rect.bottom + 6);
    }

    public void setCameraPreview(com.journeyapps.barcodescanner.a aVar) {
        this.f27472k = aVar;
        aVar.addStateListener(new a());
    }

    public void setLaserVisibility(boolean z8) {
        this.f27468g = z8;
    }

    public void setMaskColor(int i8) {
        this.f27464c = i8;
    }
}
