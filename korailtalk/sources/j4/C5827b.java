package j4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: j4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5827b {

    /* renamed from: a, reason: collision with root package name */
    protected F3.q f33436a;

    /* renamed from: b, reason: collision with root package name */
    protected t f33437b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33438c = 2;

    public C5827b(F3.q qVar, t tVar) {
        this.f33436a = qVar;
        this.f33437b = tVar;
    }

    private static void a(Canvas canvas, Paint paint, F3.s sVar, F3.s sVar2, int i8) {
        if (sVar == null || sVar2 == null) {
            return;
        }
        float f8 = i8;
        canvas.drawLine(sVar.getX() / f8, sVar.getY() / f8, sVar2.getX() / f8, sVar2.getY() / f8, paint);
    }

    public static List<F3.s> transformResultPoints(List<F3.s> list, t tVar) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<F3.s> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tVar.translateResultPoint(it.next()));
        }
        return arrayList;
    }

    public F3.a getBarcodeFormat() {
        return this.f33436a.getBarcodeFormat();
    }

    public Bitmap getBitmap() {
        return this.f33437b.getBitmap(null, 2);
    }

    public int getBitmapScaleFactor() {
        return 2;
    }

    public Bitmap getBitmapWithResultPoints(int i8) {
        Bitmap bitmap = getBitmap();
        List<F3.s> transformedResultPoints = getTransformedResultPoints();
        if (transformedResultPoints.isEmpty() || bitmap == null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        Paint paint = new Paint();
        paint.setColor(i8);
        if (transformedResultPoints.size() == 2) {
            paint.setStrokeWidth(4.0f);
            a(canvas, paint, transformedResultPoints.get(0), transformedResultPoints.get(1), 2);
        } else if (transformedResultPoints.size() == 4 && (this.f33436a.getBarcodeFormat() == F3.a.UPC_A || this.f33436a.getBarcodeFormat() == F3.a.EAN_13)) {
            a(canvas, paint, transformedResultPoints.get(0), transformedResultPoints.get(1), 2);
            a(canvas, paint, transformedResultPoints.get(2), transformedResultPoints.get(3), 2);
        } else {
            paint.setStrokeWidth(10.0f);
            for (F3.s sVar : transformedResultPoints) {
                if (sVar != null) {
                    canvas.drawPoint(sVar.getX() / 2.0f, sVar.getY() / 2.0f, paint);
                }
            }
        }
        return bitmapCreateBitmap;
    }

    public byte[] getRawBytes() {
        return this.f33436a.getRawBytes();
    }

    public F3.q getResult() {
        return this.f33436a;
    }

    public Map<F3.r, Object> getResultMetadata() {
        return this.f33436a.getResultMetadata();
    }

    public F3.s[] getResultPoints() {
        return this.f33436a.getResultPoints();
    }

    public String getText() {
        return this.f33436a.getText();
    }

    public long getTimestamp() {
        return this.f33436a.getTimestamp();
    }

    public List<F3.s> getTransformedResultPoints() {
        return this.f33436a.getResultPoints() == null ? Collections.emptyList() : transformResultPoints(Arrays.asList(this.f33436a.getResultPoints()), this.f33437b);
    }

    public String toString() {
        return this.f33436a.getText();
    }
}
