package androidx.camera.core;

import android.media.Image;
import android.media.ImageWriter;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.L;
import java.nio.ByteBuffer;
import java.util.Locale;
import z.InterfaceC6581g0;

/* loaded from: classes.dex */
abstract class ImageProcessingUtil {

    /* renamed from: a, reason: collision with root package name */
    private static int f7427a;

    enum a {
        UNKNOWN,
        SUCCESS,
        ERROR_CONVERSION
    }

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static boolean applyPixelShiftForYUV(InterfaceC0902s0 interfaceC0902s0) {
        if (!f(interfaceC0902s0)) {
            B0.e("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return false;
        }
        if (c(interfaceC0902s0) != a.ERROR_CONVERSION) {
            return true;
        }
        B0.e("ImageProcessingUtil", "One pixel shift for YUV failure");
        return false;
    }

    private static a c(InterfaceC0902s0 interfaceC0902s0) {
        int width = interfaceC0902s0.getWidth();
        int height = interfaceC0902s0.getHeight();
        int rowStride = interfaceC0902s0.getPlanes()[0].getRowStride();
        int rowStride2 = interfaceC0902s0.getPlanes()[1].getRowStride();
        int rowStride3 = interfaceC0902s0.getPlanes()[2].getRowStride();
        int pixelStride = interfaceC0902s0.getPlanes()[0].getPixelStride();
        int pixelStride2 = interfaceC0902s0.getPlanes()[1].getPixelStride();
        return nativeShiftPixel(interfaceC0902s0.getPlanes()[0].getBuffer(), rowStride, interfaceC0902s0.getPlanes()[1].getBuffer(), rowStride2, interfaceC0902s0.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, width, height, pixelStride, pixelStride2, pixelStride2) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    public static InterfaceC0902s0 convertYUVToRGB(final InterfaceC0902s0 interfaceC0902s0, InterfaceC6581g0 interfaceC6581g0, ByteBuffer byteBuffer, int i8, boolean z8) {
        if (!f(interfaceC0902s0)) {
            B0.e("ImageProcessingUtil", "Unsupported format for YUV to RGB");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!e(i8)) {
            B0.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate RGB");
            return null;
        }
        if (d(interfaceC0902s0, interfaceC6581g0.getSurface(), byteBuffer, i8, z8) == a.ERROR_CONVERSION) {
            B0.e("ImageProcessingUtil", "YUV to RGB conversion failure");
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            B0.d("ImageProcessingUtil", String.format(Locale.US, "Image processing performance profiling, duration: [%d], image count: %d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), Integer.valueOf(f7427a)));
            f7427a++;
        }
        final InterfaceC0902s0 interfaceC0902s0AcquireLatestImage = interfaceC6581g0.acquireLatestImage();
        if (interfaceC0902s0AcquireLatestImage == null) {
            B0.e("ImageProcessingUtil", "YUV to RGB acquireLatestImage failure");
            return null;
        }
        X0 x02 = new X0(interfaceC0902s0AcquireLatestImage);
        x02.a(new L.a() { // from class: androidx.camera.core.q0
            @Override // androidx.camera.core.L.a
            public final void onImageClose(InterfaceC0902s0 interfaceC0902s02) {
                ImageProcessingUtil.g(interfaceC0902s0AcquireLatestImage, interfaceC0902s0, interfaceC0902s02);
            }
        });
        return x02;
    }

    private static a d(InterfaceC0902s0 interfaceC0902s0, Surface surface, ByteBuffer byteBuffer, int i8, boolean z8) {
        int width = interfaceC0902s0.getWidth();
        int height = interfaceC0902s0.getHeight();
        int rowStride = interfaceC0902s0.getPlanes()[0].getRowStride();
        int rowStride2 = interfaceC0902s0.getPlanes()[1].getRowStride();
        int rowStride3 = interfaceC0902s0.getPlanes()[2].getRowStride();
        int pixelStride = interfaceC0902s0.getPlanes()[0].getPixelStride();
        int pixelStride2 = interfaceC0902s0.getPlanes()[1].getPixelStride();
        return nativeConvertAndroid420ToABGR(interfaceC0902s0.getPlanes()[0].getBuffer(), rowStride, interfaceC0902s0.getPlanes()[1].getBuffer(), rowStride2, interfaceC0902s0.getPlanes()[2].getBuffer(), rowStride3, pixelStride, pixelStride2, surface, byteBuffer, width, height, z8 ? pixelStride : 0, z8 ? pixelStride2 : 0, z8 ? pixelStride2 : 0, i8) != 0 ? a.ERROR_CONVERSION : a.SUCCESS;
    }

    private static boolean e(int i8) {
        return i8 == 0 || i8 == 90 || i8 == 180 || i8 == 270;
    }

    private static boolean f(InterfaceC0902s0 interfaceC0902s0) {
        return interfaceC0902s0.getFormat() == 35 && interfaceC0902s0.getPlanes().length == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(InterfaceC0902s0 interfaceC0902s0, InterfaceC0902s0 interfaceC0902s02, InterfaceC0902s0 interfaceC0902s03) {
        if (interfaceC0902s0 == null || interfaceC0902s02 == null) {
            return;
        }
        interfaceC0902s02.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(InterfaceC0902s0 interfaceC0902s0, InterfaceC0902s0 interfaceC0902s02, InterfaceC0902s0 interfaceC0902s03) {
        if (interfaceC0902s0 == null || interfaceC0902s02 == null) {
            return;
        }
        interfaceC0902s02.close();
    }

    private static a i(InterfaceC0902s0 interfaceC0902s0, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        int width = interfaceC0902s0.getWidth();
        int height = interfaceC0902s0.getHeight();
        int rowStride = interfaceC0902s0.getPlanes()[0].getRowStride();
        int rowStride2 = interfaceC0902s0.getPlanes()[1].getRowStride();
        int rowStride3 = interfaceC0902s0.getPlanes()[2].getRowStride();
        int pixelStride = interfaceC0902s0.getPlanes()[1].getPixelStride();
        Image imageDequeueInputImage = D.a.dequeueInputImage(imageWriter);
        if (imageDequeueInputImage == null) {
            return a.ERROR_CONVERSION;
        }
        if (nativeRotateYUV(interfaceC0902s0.getPlanes()[0].getBuffer(), rowStride, interfaceC0902s0.getPlanes()[1].getBuffer(), rowStride2, interfaceC0902s0.getPlanes()[2].getBuffer(), rowStride3, pixelStride, imageDequeueInputImage.getPlanes()[0].getBuffer(), imageDequeueInputImage.getPlanes()[0].getRowStride(), imageDequeueInputImage.getPlanes()[0].getPixelStride(), imageDequeueInputImage.getPlanes()[1].getBuffer(), imageDequeueInputImage.getPlanes()[1].getRowStride(), imageDequeueInputImage.getPlanes()[1].getPixelStride(), imageDequeueInputImage.getPlanes()[2].getBuffer(), imageDequeueInputImage.getPlanes()[2].getRowStride(), imageDequeueInputImage.getPlanes()[2].getPixelStride(), byteBuffer, byteBuffer2, byteBuffer3, width, height, i8) != 0) {
            return a.ERROR_CONVERSION;
        }
        D.a.queueInputImage(imageWriter, imageDequeueInputImage);
        return a.SUCCESS;
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, int i12, Surface surface, ByteBuffer byteBuffer4, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native int nativeRotateYUV(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, ByteBuffer byteBuffer4, int i12, int i13, ByteBuffer byteBuffer5, int i14, int i15, ByteBuffer byteBuffer6, int i16, int i17, ByteBuffer byteBuffer7, ByteBuffer byteBuffer8, ByteBuffer byteBuffer9, int i18, int i19, int i20);

    private static native int nativeShiftPixel(ByteBuffer byteBuffer, int i8, ByteBuffer byteBuffer2, int i9, ByteBuffer byteBuffer3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17);

    public static InterfaceC0902s0 rotateYUV(final InterfaceC0902s0 interfaceC0902s0, InterfaceC6581g0 interfaceC6581g0, ImageWriter imageWriter, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i8) {
        if (!f(interfaceC0902s0)) {
            B0.e("ImageProcessingUtil", "Unsupported format for rotate YUV");
            return null;
        }
        if (!e(i8)) {
            B0.e("ImageProcessingUtil", "Unsupported rotation degrees for rotate YUV");
            return null;
        }
        a aVar = a.ERROR_CONVERSION;
        if ((i8 > 0 ? i(interfaceC0902s0, imageWriter, byteBuffer, byteBuffer2, byteBuffer3, i8) : aVar) == aVar) {
            B0.e("ImageProcessingUtil", "rotate YUV failure");
            return null;
        }
        final InterfaceC0902s0 interfaceC0902s0AcquireLatestImage = interfaceC6581g0.acquireLatestImage();
        if (interfaceC0902s0AcquireLatestImage == null) {
            B0.e("ImageProcessingUtil", "YUV rotation acquireLatestImage failure");
            return null;
        }
        X0 x02 = new X0(interfaceC0902s0AcquireLatestImage);
        x02.a(new L.a() { // from class: androidx.camera.core.r0
            @Override // androidx.camera.core.L.a
            public final void onImageClose(InterfaceC0902s0 interfaceC0902s02) {
                ImageProcessingUtil.h(interfaceC0902s0AcquireLatestImage, interfaceC0902s0, interfaceC0902s02);
            }
        });
        return x02;
    }
}
