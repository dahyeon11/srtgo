package l1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5887f {

    /* renamed from: a, reason: collision with root package name */
    private int f33949a = 640;

    private final byte[] a(Image image) {
        int i8;
        int width = image.getWidth();
        int height = image.getHeight();
        int i9 = width * height;
        byte[] bArr = new byte[((i9 / 4) * 2) + i9];
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        ByteBuffer buffer2 = image.getPlanes()[1].getBuffer();
        ByteBuffer buffer3 = image.getPlanes()[2].getBuffer();
        int rowStride = image.getPlanes()[0].getRowStride();
        image.getPlanes()[0].getPixelStride();
        if (rowStride == width) {
            buffer.get(bArr, 0, i9);
            i8 = i9;
        } else {
            long j8 = rowStride;
            long j9 = -j8;
            i8 = 0;
            while (i8 < i9) {
                j9 += j8;
                buffer.position((int) j9);
                buffer.get(bArr, i8, width);
                i8 += width;
            }
        }
        int rowStride2 = image.getPlanes()[2].getRowStride();
        int pixelStride = image.getPlanes()[2].getPixelStride();
        image.getPlanes()[1].getRowStride();
        image.getPlanes()[1].getPixelStride();
        if (pixelStride == 2 && rowStride2 == width && buffer2.get(0) == buffer3.get(1)) {
            byte b9 = buffer3.get(1);
            byte b10 = (byte) (~b9);
            try {
                buffer3.put(1, b10);
                if (buffer2.get(0) == b10) {
                    buffer3.put(1, b9);
                    buffer3.position(0);
                    buffer2.position(0);
                    buffer3.get(bArr, i9, 1);
                    buffer2.get(bArr, i9 + 1, buffer2.remaining());
                    return bArr;
                }
            } catch (ReadOnlyBufferException unused) {
            }
            buffer3.put(1, b9);
        }
        int i10 = height / 2;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = i11 + 1;
            int i13 = width / 2;
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                int i16 = (i14 * pixelStride) + (i11 * rowStride2);
                int i17 = i8 + 1;
                bArr[i8] = buffer3.get(i16);
                i8 += 2;
                bArr[i17] = buffer2.get(i16);
                i14 = i15;
            }
            i11 = i12;
        }
        return bArr;
    }

    private final Bitmap b(Bitmap bitmap, boolean z8) {
        int i8;
        int i9;
        int i10;
        int i11;
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        if (z8) {
            float f8 = height;
            float f9 = 0.95f * f8;
            float f10 = f9 / 1.58f;
            i9 = (int) ((f8 - f10) * 0.5f);
            i8 = ((int) f10) + i9;
            i11 = (int) ((width - f9) * 0.5f);
            i10 = (int) (i11 + f9);
        } else {
            float f11 = height;
            int i12 = (int) (0.025f * f11);
            float f12 = width;
            float f13 = (r8 - i12) / 1.58f;
            i8 = (int) (f11 * 0.975f);
            i9 = i12;
            i10 = (int) ((f12 + f13) * 0.5f);
            i11 = (int) ((f12 - f13) * 0.5f);
        }
        Rect rect = new Rect(i9, i11, i8, i10);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(d(this, bitmap, 0, 2, null), rect.left, rect.top, rect.width(), rect.height());
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …     r.height()\n        )");
        return bitmapCreateBitmap;
    }

    private final Bitmap c(Bitmap bitmap, int i8) {
        Matrix matrix = new Matrix();
        switch (i8) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
            default:
                return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(bitmap, 0, …map.height, matrix, true)");
        return bitmapCreateBitmap;
    }

    static /* synthetic */ Bitmap d(C5887f c5887f, Bitmap bitmap, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 6;
        }
        return c5887f.c(bitmap, i8);
    }

    public static /* synthetic */ Bitmap recognitionImage$Code1CardScanLib_release$default(C5887f c5887f, Bitmap bitmap, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        return c5887f.recognitionImage$Code1CardScanLib_release(bitmap, z8);
    }

    public final Bitmap grayScaleImage$Code1CardScanLib_release(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Bitmap bmpGrayScale = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bmpGrayScale);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        Intrinsics.checkNotNullExpressionValue(bmpGrayScale, "bmpGrayScale");
        return bmpGrayScale;
    }

    public final Bitmap imgToBitmap2$Code1CardScanLib_release(Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        YuvImage yuvImage = new YuvImage(a(image), 17, image.getWidth(), image.getHeight(), null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, yuvImage.getWidth(), yuvImage.getHeight()), 75, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeByteArray, "decodeByteArray(imageBytes, 0, imageBytes.size)");
        return bitmapDecodeByteArray;
    }

    public final Bitmap recognitionImage$Code1CardScanLib_release(Bitmap bitmap, boolean z8) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        return resizeImage$Code1CardScanLib_release(b(bitmap, z8), this.f33949a);
    }

    public final Bitmap resizeImage$Code1CardScanLib_release(Bitmap bitmap, int i8) {
        float f8;
        float f9;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= i8 && height <= i8) {
            f8 = width;
            f9 = height;
        } else if (width > height) {
            float f10 = i8;
            f9 = height * (f10 / width);
            f8 = f10;
        } else if (width < height) {
            float f11 = i8;
            f8 = width * (f11 / height);
            f9 = f11;
        } else {
            f8 = 0.0f;
            f9 = 0.0f;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) f8, (int) f9, false);
        Bitmap canvasBitmap = Bitmap.createBitmap(i8, i8, Bitmap.Config.ARGB_8888);
        new Canvas(canvasBitmap).drawBitmap(bitmapCreateScaledBitmap, 0.0f, 0.0f, (Paint) null);
        Intrinsics.checkNotNullExpressionValue(canvasBitmap, "canvasBitmap");
        return canvasBitmap;
    }
}
