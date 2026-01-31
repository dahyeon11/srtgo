package f1;

import T0.AbstractC0786c;
import V0.u;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* loaded from: classes.dex */
public abstract class j {
    public static final int SECOND_IN_NANOS = 1000000000;

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f30520a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f30521b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f30522c = new c();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f30523d = new d();

    /* renamed from: e, reason: collision with root package name */
    private static final float f30524e = (float) (Math.sqrt(2.0d) / 2.0d);

    class a extends ThreadLocal {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    class b extends ThreadLocal {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    class c extends ThreadLocal {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    class d extends ThreadLocal {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    public static void applyTrimPathIfNeeded(Path path, u uVar) {
        if (uVar == null || uVar.isHidden()) {
            return;
        }
        applyTrimPathIfNeeded(path, ((W0.d) uVar.getStart()).getFloatValue() / 100.0f, ((W0.d) uVar.getEnd()).getFloatValue() / 100.0f, ((W0.d) uVar.getOffset()).getFloatValue() / 360.0f);
    }

    public static void closeQuietly(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e8) {
                throw e8;
            } catch (Exception unused) {
            }
        }
    }

    public static Path createPath(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f8 = pointF3.x + pointF.x;
            float f9 = pointF.y + pointF3.y;
            float f10 = pointF2.x;
            float f11 = f10 + pointF4.x;
            float f12 = pointF2.y;
            path.cubicTo(f8, f9, f11, f12 + pointF4.y, f10, f12);
        }
        return path;
    }

    public static float dpScale() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getAnimationScale(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static float getScale(Matrix matrix) {
        float[] fArr = (float[]) f30523d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f8 = f30524e;
        fArr[2] = f8;
        fArr[3] = f8;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean hasZeroScaleAxis(Matrix matrix) {
        float[] fArr = (float[]) f30523d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int hashFor(float f8, float f9, float f10, float f11) {
        int i8 = f8 != 0.0f ? (int) (527 * f8) : 17;
        if (f9 != 0.0f) {
            i8 = (int) (i8 * 31 * f9);
        }
        if (f10 != 0.0f) {
            i8 = (int) (i8 * 31 * f10);
        }
        return f11 != 0.0f ? (int) (i8 * 31 * f11) : i8;
    }

    public static boolean isAtLeastVersion(int i8, int i9, int i10, int i11, int i12, int i13) {
        if (i8 < i11) {
            return false;
        }
        if (i8 > i11) {
            return true;
        }
        if (i9 < i12) {
            return false;
        }
        return i9 > i12 || i10 >= i13;
    }

    public static boolean isNetworkException(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Bitmap renderPath(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        U0.a aVar = new U0.a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return bitmapCreateBitmap;
    }

    public static Bitmap resizeBitmapIfNeeded(Bitmap bitmap, int i8, int i9) {
        if (bitmap.getWidth() == i8 && bitmap.getHeight() == i9) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i8, i9, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint) {
        saveLayerCompat(canvas, rectF, paint, 31);
    }

    public static void saveLayerCompat(Canvas canvas, RectF rectF, Paint paint, int i8) {
        AbstractC0786c.beginSection("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        AbstractC0786c.endSection("Utils#saveLayer");
    }

    public static void applyTrimPathIfNeeded(Path path, float f8, float f9, float f10) {
        AbstractC0786c.beginSection("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = (PathMeasure) f30520a.get();
        Path path2 = (Path) f30521b.get();
        Path path3 = (Path) f30522c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f8 == 1.0f && f9 == 0.0f) {
            AbstractC0786c.endSection("applyTrimPathIfNeeded");
            return;
        }
        if (length >= 1.0f && Math.abs((f9 - f8) - 1.0f) >= 0.01d) {
            float f11 = f8 * length;
            float f12 = f9 * length;
            float f13 = f10 * length;
            float fMin = Math.min(f11, f12) + f13;
            float fMax = Math.max(f11, f12) + f13;
            if (fMin >= length && fMax >= length) {
                fMin = i.b(fMin, length);
                fMax = i.b(fMax, length);
            }
            if (fMin < 0.0f) {
                fMin = i.b(fMin, length);
            }
            if (fMax < 0.0f) {
                fMax = i.b(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                AbstractC0786c.endSection("applyTrimPathIfNeeded");
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            AbstractC0786c.endSection("applyTrimPathIfNeeded");
            return;
        }
        AbstractC0786c.endSection("applyTrimPathIfNeeded");
    }
}
