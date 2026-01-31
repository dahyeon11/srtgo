package j4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;

/* loaded from: classes2.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private m f33481a;

    /* renamed from: b, reason: collision with root package name */
    private int f33482b;

    /* renamed from: c, reason: collision with root package name */
    private int f33483c;

    /* renamed from: d, reason: collision with root package name */
    private Rect f33484d;

    /* renamed from: e, reason: collision with root package name */
    private int f33485e = 1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33486f;

    public t(byte[] bArr, int i8, int i9, int i10, int i11) {
        this.f33481a = new m(bArr, i8, i9);
        this.f33483c = i11;
        this.f33482b = i10;
        if (i8 * i9 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i8 + "x" + i9 + " > " + bArr.length);
    }

    public F3.n createSource() {
        m mVarCropAndScale = this.f33481a.rotateCameraPreview(this.f33483c).cropAndScale(this.f33484d, this.f33485e);
        return new F3.n(mVarCropAndScale.getData(), mVarCropAndScale.getWidth(), mVarCropAndScale.getHeight(), 0, 0, mVarCropAndScale.getWidth(), mVarCropAndScale.getHeight(), false);
    }

    public Bitmap getBitmap() {
        return getBitmap(1);
    }

    public Rect getCropRect() {
        return this.f33484d;
    }

    public byte[] getData() {
        return this.f33481a.getData();
    }

    public int getDataHeight() {
        return this.f33481a.getHeight();
    }

    public int getDataWidth() {
        return this.f33481a.getWidth();
    }

    public int getImageFormat() {
        return this.f33482b;
    }

    public int getScalingFactor() {
        return this.f33485e;
    }

    public boolean isPreviewMirrored() {
        return this.f33486f;
    }

    public boolean isRotated() {
        return this.f33483c % 180 != 0;
    }

    public void setCropRect(Rect rect) {
        this.f33484d = rect;
    }

    public void setPreviewMirrored(boolean z8) {
        this.f33486f = z8;
    }

    public void setScalingFactor(int i8) {
        this.f33485e = i8;
    }

    public F3.s translateResultPoint(F3.s sVar) {
        float x8 = (sVar.getX() * this.f33485e) + this.f33484d.left;
        float y8 = (sVar.getY() * this.f33485e) + this.f33484d.top;
        if (this.f33486f) {
            x8 = this.f33481a.getWidth() - x8;
        }
        return new F3.s(x8, y8);
    }

    public Bitmap getBitmap(int i8) {
        return getBitmap(this.f33484d, i8);
    }

    public Bitmap getBitmap(Rect rect, int i8) {
        if (rect == null) {
            rect = new Rect(0, 0, this.f33481a.getWidth(), this.f33481a.getHeight());
        } else if (isRotated()) {
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        }
        YuvImage yuvImage = new YuvImage(this.f33481a.getData(), this.f33482b, this.f33481a.getWidth(), this.f33481a.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(rect, 90, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i8;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        if (this.f33483c == 0) {
            return bitmapDecodeByteArray;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(this.f33483c);
        return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
    }
}
