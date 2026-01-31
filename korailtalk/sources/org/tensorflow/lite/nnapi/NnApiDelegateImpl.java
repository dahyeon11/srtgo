package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.c;
import org.tensorflow.lite.nnapi.a;

/* loaded from: classes3.dex */
public class NnApiDelegateImpl implements a.b, c, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private long f34554a;

    public NnApiDelegateImpl(a.C0362a c0362a) {
        TensorFlowLite.init();
        this.f34554a = createDelegate(c0362a.getExecutionPreference(), c0362a.getAcceleratorName(), c0362a.getCacheDir(), c0362a.getModelToken(), c0362a.getMaxNumberOfDelegatedPartitions(), c0362a.getUseNnapiCpu() != null, c0362a.getUseNnapiCpu() == null || !c0362a.getUseNnapiCpu().booleanValue(), c0362a.getAllowFp16(), c0362a.getNnApiSupportLibraryHandle());
    }

    private void a() {
        if (this.f34554a == 0) {
            throw new IllegalStateException("Should not access delegate after it has been closed.");
        }
    }

    private static native long createDelegate(int i8, String str, String str2, String str3, int i9, boolean z8, boolean z9, boolean z10, long j8);

    private static native void deleteDelegate(long j8);

    private static native int getNnapiErrno(long j8);

    @Override // org.tensorflow.lite.nnapi.a.b, org.tensorflow.lite.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j8 = this.f34554a;
        if (j8 != 0) {
            deleteDelegate(j8);
            this.f34554a = 0L;
        }
    }

    @Override // org.tensorflow.lite.nnapi.a.b, org.tensorflow.lite.c
    public long getNativeHandle() {
        return this.f34554a;
    }

    @Override // org.tensorflow.lite.nnapi.a.b
    public int getNnapiErrno() {
        a();
        return getNnapiErrno(this.f34554a);
    }
}
