package androidx.camera.core;

import G.a;
import android.net.Uri;
import androidx.camera.core.C0889l0;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: androidx.camera.core.y0 */
/* loaded from: classes.dex */
final class RunnableC0914y0 implements Runnable {

    /* renamed from: a */
    private final InterfaceC0902s0 f7877a;

    /* renamed from: b */
    private final int f7878b;

    /* renamed from: c */
    private final int f7879c;

    /* renamed from: d */
    private final Executor f7880d;

    /* renamed from: e */
    private final b f7881e;

    /* renamed from: f */
    private final Executor f7882f;

    /* renamed from: androidx.camera.core.y0$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7883a;

        static {
            int[] iArr = new int[a.C0031a.EnumC0032a.values().length];
            f7883a = iArr;
            try {
                iArr[a.C0031a.EnumC0032a.ENCODE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7883a[a.C0031a.EnumC0032a.DECODE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7883a[a.C0031a.EnumC0032a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: androidx.camera.core.y0$b */
    public interface b {
        void onError(c cVar, String str, Throwable th);

        void onImageSaved(C0889l0.n nVar);
    }

    /* renamed from: androidx.camera.core.y0$c */
    public enum c {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    RunnableC0914y0(InterfaceC0902s0 interfaceC0902s0, C0889l0.m mVar, int i8, int i9, Executor executor, Executor executor2, b bVar) {
        this.f7877a = interfaceC0902s0;
        this.f7878b = i8;
        this.f7879c = i9;
        this.f7881e = bVar;
        this.f7880d = executor;
        this.f7882f = executor2;
    }

    private byte[] e(InterfaceC0902s0 interfaceC0902s0, int i8) {
        boolean zShouldCropImage = G.a.shouldCropImage(interfaceC0902s0);
        int format = interfaceC0902s0.getFormat();
        if (format == 256) {
            return !zShouldCropImage ? G.a.jpegImageToJpegByteArray(interfaceC0902s0) : G.a.jpegImageToJpegByteArray(interfaceC0902s0, interfaceC0902s0.getCropRect(), i8);
        }
        if (format == 35) {
            return G.a.yuvImageToJpegByteArray(interfaceC0902s0, zShouldCropImage ? interfaceC0902s0.getCropRect() : null, i8);
        }
        B0.w("ImageSaver", "Unrecognized image format: " + format);
        return null;
    }

    private boolean f() {
        throw null;
    }

    private boolean g() {
        throw null;
    }

    private boolean h() {
        throw null;
    }

    public /* synthetic */ void i(c cVar, String str, Throwable th) {
        this.f7881e.onError(cVar, str, th);
    }

    public /* synthetic */ void j(Uri uri) {
        this.f7881e.onImageSaved(new C0889l0.n(uri));
    }

    private void l(final c cVar, final String str, final Throwable th) {
        try {
            this.f7880d.execute(new Runnable() { // from class: androidx.camera.core.w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7868a.i(cVar, str, th);
                }
            });
        } catch (RejectedExecutionException unused) {
            B0.e("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    private void m(final Uri uri) {
        try {
            this.f7880d.execute(new Runnable() { // from class: androidx.camera.core.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7873a.j(uri);
                }
            });
        } catch (RejectedExecutionException unused) {
            B0.e("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File n() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            boolean r1 = r7.f()     // Catch: java.io.IOException -> L8f
            if (r1 != 0) goto L91
            java.lang.String r1 = "CameraX"
            java.lang.String r2 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r1, r2)     // Catch: java.io.IOException -> L8f
            androidx.camera.core.s0 r2 = r7.f7877a     // Catch: G.a.C0031a -> L59 java.lang.IllegalArgumentException -> L5b java.io.IOException -> L5d
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L4d
            androidx.camera.core.s0 r4 = r7.f7877a     // Catch: java.lang.Throwable -> L41
            int r5 = r7.f7879c     // Catch: java.lang.Throwable -> L41
            byte[] r4 = r7.e(r4, r5)     // Catch: java.lang.Throwable -> L41
            r3.write(r4)     // Catch: java.lang.Throwable -> L41
            androidx.camera.core.impl.utils.f r4 = androidx.camera.core.impl.utils.f.createFromFile(r1)     // Catch: java.lang.Throwable -> L41
            androidx.camera.core.s0 r5 = r7.f7877a     // Catch: java.lang.Throwable -> L41
            androidx.camera.core.impl.utils.f r5 = androidx.camera.core.impl.utils.f.createFromImageProxy(r5)     // Catch: java.lang.Throwable -> L41
            r5.copyToCroppedImage(r4)     // Catch: java.lang.Throwable -> L41
            F.a r5 = new F.a     // Catch: java.lang.Throwable -> L41
            r5.<init>()     // Catch: java.lang.Throwable -> L41
            androidx.camera.core.s0 r6 = r7.f7877a     // Catch: java.lang.Throwable -> L41
            boolean r5 = r5.shouldUseExifOrientation(r6)     // Catch: java.lang.Throwable -> L41
            if (r5 != 0) goto L43
            int r5 = r7.f7878b     // Catch: java.lang.Throwable -> L41
            r4.rotate(r5)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r4 = move-exception
            goto L44
        L43:
            throw r0     // Catch: java.lang.Throwable -> L41
        L44:
            r3.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L4d
        L4c:
            throw r4     // Catch: java.lang.Throwable -> L4d
        L4d:
            r3 = move-exception
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.lang.Throwable -> L54
            goto L5f
        L54:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: G.a.C0031a -> L59 java.lang.IllegalArgumentException -> L5b java.io.IOException -> L5d
            goto L5f
        L59:
            r2 = move-exception
            goto L60
        L5b:
            r2 = move-exception
            goto L81
        L5d:
            r2 = move-exception
            goto L81
        L5f:
            throw r3     // Catch: G.a.C0031a -> L59 java.lang.IllegalArgumentException -> L5b java.io.IOException -> L5d
        L60:
            int[] r3 = androidx.camera.core.RunnableC0914y0.a.f7883a
            G.a$a$a r4 = r2.getFailureType()
            int r4 = r4.ordinal()
            r3 = r3[r4]
            r4 = 1
            if (r3 == r4) goto L7c
            r4 = 2
            if (r3 == r4) goto L77
            androidx.camera.core.y0$c r3 = androidx.camera.core.RunnableC0914y0.c.UNKNOWN
            java.lang.String r4 = "Failed to transcode mImage"
            goto L85
        L77:
            androidx.camera.core.y0$c r3 = androidx.camera.core.RunnableC0914y0.c.CROP_FAILED
            java.lang.String r4 = "Failed to crop mImage"
            goto L85
        L7c:
            androidx.camera.core.y0$c r3 = androidx.camera.core.RunnableC0914y0.c.ENCODE_FAILED
            java.lang.String r4 = "Failed to encode mImage"
            goto L85
        L81:
            androidx.camera.core.y0$c r3 = androidx.camera.core.RunnableC0914y0.c.FILE_IO_FAILED
            java.lang.String r4 = "Failed to write temp file"
        L85:
            if (r3 == 0) goto L8e
            r7.l(r3, r4, r2)
            r1.delete()
            return r0
        L8e:
            return r1
        L8f:
            r1 = move-exception
            goto L94
        L91:
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L8f
            throw r0
        L94:
            androidx.camera.core.y0$c r2 = androidx.camera.core.RunnableC0914y0.c.FILE_IO_FAILED
            java.lang.String r3 = "Failed to create temp file"
            r7.l(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.RunnableC0914y0.n():java.io.File");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0033  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(java.io.File r5) {
        /*
            r4 = this;
            Z.h.checkNotNull(r5)
            r0 = 0
            boolean r1 = r4.g()     // Catch: java.lang.Throwable -> L1e java.lang.IllegalArgumentException -> L20 java.io.IOException -> L22
            if (r1 != 0) goto L25
            boolean r1 = r4.h()     // Catch: java.lang.Throwable -> L1e java.lang.IllegalArgumentException -> L20 java.io.IOException -> L22
            if (r1 != 0) goto L24
            boolean r1 = r4.f()     // Catch: java.lang.Throwable -> L1e java.lang.IllegalArgumentException -> L20 java.io.IOException -> L22
            if (r1 != 0) goto L1d
            r5.delete()
            r1 = r0
            r2 = r1
            r3 = r2
            goto L2d
        L1d:
            throw r0     // Catch: java.lang.Throwable -> L1e
        L1e:
            r0 = move-exception
            goto L37
        L20:
            r1 = move-exception
            goto L26
        L22:
            r1 = move-exception
            goto L26
        L24:
            throw r0     // Catch: java.lang.Throwable -> L1e
        L25:
            throw r0     // Catch: java.lang.Throwable -> L1e
        L26:
            androidx.camera.core.y0$c r2 = androidx.camera.core.RunnableC0914y0.c.FILE_IO_FAILED     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = "Failed to write destination file."
            r5.delete()
        L2d:
            if (r2 == 0) goto L33
            r4.l(r2, r3, r1)
            goto L36
        L33:
            r4.m(r0)
        L36:
            return
        L37:
            r5.delete()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.RunnableC0914y0.k(java.io.File):void");
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        final File fileN = n();
        if (fileN != null) {
            this.f7882f.execute(new Runnable() { // from class: androidx.camera.core.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7864a.k(fileN);
                }
            });
        }
    }
}
