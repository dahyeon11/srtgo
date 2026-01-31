package androidx.camera.core;

/* renamed from: androidx.camera.core.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0895o0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f7794a;

    public C0895o0(int i8, String str, Throwable th) {
        super(str, th);
        this.f7794a = i8;
    }

    public int getImageCaptureError() {
        return this.f7794a;
    }
}
