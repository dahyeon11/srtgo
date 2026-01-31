package G;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.B0;
import androidx.camera.core.InterfaceC0902s0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: G.a$a, reason: collision with other inner class name */
    public static final class C0031a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private EnumC0032a f1352a;

        /* renamed from: G.a$a$a, reason: collision with other inner class name */
        public enum EnumC0032a {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        C0031a(String str, EnumC0032a enumC0032a) {
            super(str);
            this.f1352a = enumC0032a;
        }

        public EnumC0032a getFailureType() {
            return this.f1352a;
        }
    }

    private static byte[] a(byte[] bArr, Rect rect, int i8) throws C0031a, IOException {
        try {
            BitmapRegionDecoder bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap bitmapDecodeRegion = bitmapRegionDecoderNewInstance.decodeRegion(rect, new BitmapFactory.Options());
            bitmapRegionDecoderNewInstance.recycle();
            if (bitmapDecodeRegion == null) {
                throw new C0031a("Decode byte array failed.", C0031a.EnumC0032a.DECODE_FAILED);
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            if (!bitmapDecodeRegion.compress(Bitmap.CompressFormat.JPEG, i8, byteArrayOutputStream)) {
                throw new C0031a("Encode bitmap failed.", C0031a.EnumC0032a.ENCODE_FAILED);
            }
            bitmapDecodeRegion.recycle();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new C0031a("Decode byte array failed.", C0031a.EnumC0032a.DECODE_FAILED);
        } catch (IllegalArgumentException e8) {
            throw new C0031a("Decode byte array failed with illegal argument." + e8, C0031a.EnumC0032a.DECODE_FAILED);
        }
    }

    private static Rational b(Rational rational) {
        return rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator());
    }

    private static boolean c(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = rational.getNumerator();
        float denominator = rational.getDenominator();
        return (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) ? false : true;
    }

    public static Rect computeCropRectFromAspectRatio(Size size, Rational rational) {
        int i8;
        if (!isAspectRatioValid(rational)) {
            B0.w("ImageUtil", "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f8 = width;
        float f9 = height;
        float f10 = f8 / f9;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i9 = 0;
        if (rational.floatValue() > f10) {
            int iRound = Math.round((f8 / numerator) * denominator);
            i8 = (height - iRound) / 2;
            height = iRound;
        } else {
            int iRound2 = Math.round((f9 / denominator) * numerator);
            int i10 = (width - iRound2) / 2;
            width = iRound2;
            i8 = 0;
            i9 = i10;
        }
        return new Rect(i9, i8, width + i9, height + i8);
    }

    public static Rect computeCropRectFromDispatchInfo(Rect rect, int i8, Size size, int i9) {
        Matrix matrix = new Matrix();
        matrix.setRotate(i9 - i8);
        float[] fArrSizeToVertexes = sizeToVertexes(size);
        matrix.mapPoints(fArrSizeToVertexes);
        matrix.postTranslate(-min(fArrSizeToVertexes[0], fArrSizeToVertexes[2], fArrSizeToVertexes[4], fArrSizeToVertexes[6]), -min(fArrSizeToVertexes[1], fArrSizeToVertexes[3], fArrSizeToVertexes[5], fArrSizeToVertexes[7]));
        matrix.invert(matrix);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, new RectF(rect));
        rectF.sort();
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    private static byte[] d(byte[] bArr, int i8, int i9, Rect rect, int i10) throws C0031a {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        YuvImage yuvImage = new YuvImage(bArr, 17, i8, i9, null);
        if (rect == null) {
            rect = new Rect(0, 0, i8, i9);
        }
        if (yuvImage.compressToJpeg(rect, i10, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new C0031a("YuvImage failed to encode jpeg.", C0031a.EnumC0032a.ENCODE_FAILED);
    }

    public static Rational getRotatedAspectRatio(int i8, Rational rational) {
        return (i8 == 90 || i8 == 270) ? b(rational) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static boolean isAspectRatioValid(Rational rational) {
        return (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) ? false : true;
    }

    public static byte[] jpegImageToJpegByteArray(InterfaceC0902s0 interfaceC0902s0) {
        if (interfaceC0902s0.getFormat() != 256) {
            throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0902s0.getFormat());
        }
        ByteBuffer buffer = interfaceC0902s0.getPlanes()[0].getBuffer();
        byte[] bArr = new byte[buffer.capacity()];
        buffer.rewind();
        buffer.get(bArr);
        return bArr;
    }

    public static float min(float f8, float f9, float f10, float f11) {
        return Math.min(Math.min(f8, f9), Math.min(f10, f11));
    }

    public static boolean shouldCropImage(InterfaceC0902s0 interfaceC0902s0) {
        return shouldCropImage(interfaceC0902s0.getWidth(), interfaceC0902s0.getHeight(), interfaceC0902s0.getCropRect().width(), interfaceC0902s0.getCropRect().height());
    }

    public static float[] sizeToVertexes(Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static byte[] yuvImageToJpegByteArray(InterfaceC0902s0 interfaceC0902s0, Rect rect, int i8) {
        if (interfaceC0902s0.getFormat() == 35) {
            return d(yuv_420_888toNv21(interfaceC0902s0), interfaceC0902s0.getWidth(), interfaceC0902s0.getHeight(), rect, i8);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0902s0.getFormat());
    }

    public static byte[] yuv_420_888toNv21(InterfaceC0902s0 interfaceC0902s0) {
        InterfaceC0902s0.a aVar = interfaceC0902s0.getPlanes()[0];
        InterfaceC0902s0.a aVar2 = interfaceC0902s0.getPlanes()[1];
        InterfaceC0902s0.a aVar3 = interfaceC0902s0.getPlanes()[2];
        ByteBuffer buffer = aVar.getBuffer();
        ByteBuffer buffer2 = aVar2.getBuffer();
        ByteBuffer buffer3 = aVar3.getBuffer();
        buffer.rewind();
        buffer2.rewind();
        buffer3.rewind();
        int iRemaining = buffer.remaining();
        byte[] bArr = new byte[((interfaceC0902s0.getWidth() * interfaceC0902s0.getHeight()) / 2) + iRemaining];
        int width = 0;
        for (int i8 = 0; i8 < interfaceC0902s0.getHeight(); i8++) {
            buffer.get(bArr, width, interfaceC0902s0.getWidth());
            width += interfaceC0902s0.getWidth();
            buffer.position(Math.min(iRemaining, (buffer.position() - interfaceC0902s0.getWidth()) + aVar.getRowStride()));
        }
        int height = interfaceC0902s0.getHeight() / 2;
        int width2 = interfaceC0902s0.getWidth() / 2;
        int rowStride = aVar3.getRowStride();
        int rowStride2 = aVar2.getRowStride();
        int pixelStride = aVar3.getPixelStride();
        int pixelStride2 = aVar2.getPixelStride();
        byte[] bArr2 = new byte[rowStride];
        byte[] bArr3 = new byte[rowStride2];
        for (int i9 = 0; i9 < height; i9++) {
            buffer3.get(bArr2, 0, Math.min(rowStride, buffer3.remaining()));
            buffer2.get(bArr3, 0, Math.min(rowStride2, buffer2.remaining()));
            int i10 = 0;
            int i11 = 0;
            for (int i12 = 0; i12 < width2; i12++) {
                int i13 = width + 1;
                bArr[width] = bArr2[i10];
                width += 2;
                bArr[i13] = bArr3[i11];
                i10 += pixelStride;
                i11 += pixelStride2;
            }
        }
        return bArr;
    }

    public static boolean isAspectRatioValid(Size size, Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && c(size, rational) && !rational.isNaN();
    }

    public static boolean shouldCropImage(int i8, int i9, int i10, int i11) {
        return (i8 == i10 && i9 == i11) ? false : true;
    }

    public static byte[] jpegImageToJpegByteArray(InterfaceC0902s0 interfaceC0902s0, Rect rect, int i8) {
        if (interfaceC0902s0.getFormat() == 256) {
            return a(jpegImageToJpegByteArray(interfaceC0902s0), rect, i8);
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + interfaceC0902s0.getFormat());
    }
}
