package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import com.squareup.picasso.s;

/* loaded from: classes.dex */
final class t extends BitmapDrawable {

    /* renamed from: h */
    private static final Paint f29870h = new Paint();

    /* renamed from: a */
    private final boolean f29871a;

    /* renamed from: b */
    private final float f29872b;

    /* renamed from: c */
    private final s.e f29873c;

    /* renamed from: d */
    Drawable f29874d;

    /* renamed from: e */
    long f29875e;

    /* renamed from: f */
    boolean f29876f;

    /* renamed from: g */
    int f29877g;

    t(Context context, Bitmap bitmap, Drawable drawable, s.e eVar, boolean z8, boolean z9) {
        super(context.getResources(), bitmap);
        this.f29877g = 255;
        this.f29871a = z9;
        this.f29872b = context.getResources().getDisplayMetrics().density;
        this.f29873c = eVar;
        if (eVar == s.e.MEMORY || z8) {
            return;
        }
        this.f29874d = drawable;
        this.f29876f = true;
        this.f29875e = SystemClock.uptimeMillis();
    }

    private void a(Canvas canvas) {
        Paint paint = f29870h;
        paint.setColor(-1);
        canvas.drawPath(b(0, 0, (int) (this.f29872b * 16.0f)), paint);
        paint.setColor(this.f29873c.f29868a);
        canvas.drawPath(b(0, 0, (int) (this.f29872b * 15.0f)), paint);
    }

    private static Path b(int i8, int i9, int i10) {
        Path path = new Path();
        float f8 = i8;
        float f9 = i9;
        path.moveTo(f8, f9);
        path.lineTo(i8 + i10, f9);
        path.lineTo(f8, i9 + i10);
        return path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static void c(ImageView imageView, Context context, Bitmap bitmap, s.e eVar, boolean z8, boolean z9) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        imageView.setImageDrawable(new t(context, bitmap, drawable, eVar, z8, z9));
    }

    static void d(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof Animatable) {
            ((Animatable) imageView.getDrawable()).start();
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f29876f) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f29875e) / 200.0f;
            if (fUptimeMillis >= 1.0f) {
                this.f29876f = false;
                this.f29874d = null;
                super.draw(canvas);
            } else {
                Drawable drawable = this.f29874d;
                if (drawable != null) {
                    drawable.draw(canvas);
                }
                super.setAlpha((int) (this.f29877g * fUptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f29877g);
            }
        } else {
            super.draw(canvas);
        }
        if (this.f29871a) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f29874d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        this.f29877g = i8;
        Drawable drawable = this.f29874d;
        if (drawable != null) {
            drawable.setAlpha(i8);
        }
        super.setAlpha(i8);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f29874d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }
}
