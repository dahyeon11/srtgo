package C;

import android.graphics.Rect;
import android.media.ImageWriter;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.B0;
import androidx.camera.core.InterfaceC0902s0;
import androidx.camera.core.impl.utils.h;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import z.InterfaceC6563L;

/* loaded from: classes.dex */
public class l implements InterfaceC6563L {

    /* renamed from: h, reason: collision with root package name */
    private static final Rect f401h = new Rect(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private int f402a;

    /* renamed from: b, reason: collision with root package name */
    private final int f403b;

    /* renamed from: f, reason: collision with root package name */
    private ImageWriter f407f;

    /* renamed from: c, reason: collision with root package name */
    private final Object f404c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private boolean f405d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f406e = 0;

    /* renamed from: g, reason: collision with root package name */
    private Rect f408g = f401h;

    public l(int i8, int i9) {
        this.f402a = i8;
        this.f403b = i9;
    }

    private static androidx.camera.core.impl.utils.h a(InterfaceC0902s0 interfaceC0902s0) {
        h.b bVarBuilderForDevice = androidx.camera.core.impl.utils.h.builderForDevice();
        interfaceC0902s0.getImageInfo().populateExifData(bVarBuilderForDevice);
        return bVarBuilderForDevice.setImageWidth(interfaceC0902s0.getWidth()).setImageHeight(interfaceC0902s0.getHeight()).build();
    }

    public void close() {
        synchronized (this.f404c) {
            try {
                if (!this.f405d) {
                    this.f405d = true;
                    if (this.f406e != 0 || this.f407f == null) {
                        B0.d("YuvToJpegProcessor", "close() called while processing. Will close after completion.");
                    } else {
                        B0.d("YuvToJpegProcessor", "No processing in progress. Closing immediately.");
                        this.f407f.close();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6563L
    public void onOutputSurface(Surface surface, int i8) {
        Z.h.checkState(i8 == 256, "YuvToJpegProcessor only supports JPEG output format.");
        synchronized (this.f404c) {
            try {
                if (this.f405d) {
                    B0.w("YuvToJpegProcessor", "Cannot set output surface. Processor is closed.");
                } else {
                    if (this.f407f != null) {
                        throw new IllegalStateException("Output surface already set.");
                    }
                    this.f407f = D.a.newInstance(surface, this.f403b, i8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z.InterfaceC6563L
    public void onResolutionUpdate(Size size) {
        synchronized (this.f404c) {
            this.f408g = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0136 A[Catch: all -> 0x011f, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x011f, blocks: (B:47:0x00ec, B:80:0x0136), top: B:139:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015b  */
    @Override // z.InterfaceC6563L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void process(z.InterfaceC6579f0 r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C.l.process(z.f0):void");
    }

    public void setJpegQuality(int i8) {
        this.f402a = i8;
    }

    private static final class a extends OutputStream {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f409a;

        a(ByteBuffer byteBuffer) {
            this.f409a = byteBuffer;
        }

        @Override // java.io.OutputStream
        public void write(int i8) throws EOFException {
            if (!this.f409a.hasRemaining()) {
                throw new EOFException("Output ByteBuffer has no bytes remaining.");
            }
            this.f409a.put((byte) i8);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i8, int i9) throws EOFException {
            int i10;
            bArr.getClass();
            if (i8 < 0 || i8 > bArr.length || i9 < 0 || (i10 = i8 + i9) > bArr.length || i10 < 0) {
                throw new IndexOutOfBoundsException();
            }
            if (i9 == 0) {
                return;
            }
            if (this.f409a.remaining() >= i9) {
                this.f409a.put(bArr, i8, i9);
                return;
            }
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
    }
}
