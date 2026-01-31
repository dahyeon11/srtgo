package org.tensorflow.lite;

/* loaded from: classes3.dex */
final class NativeSignatureRunnerWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final long f34516a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34517b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34518c = false;

    NativeSignatureRunnerWrapper(long j8, long j9, String str) {
        this.f34517b = j9;
        long jNativeGetSignatureRunner = nativeGetSignatureRunner(j8, str);
        this.f34516a = jNativeGetSignatureRunner;
        if (jNativeGetSignatureRunner != -1) {
            return;
        }
        throw new IllegalArgumentException("Input error: Signature " + str + " not found.");
    }

    private static native void nativeAllocateTensors(long j8, long j9);

    private static native int nativeGetInputIndex(long j8, String str);

    private static native int nativeGetOutputIndex(long j8, String str);

    private static native long nativeGetSignatureRunner(long j8, String str);

    private static native int nativeGetSubgraphIndex(long j8);

    private static native String[] nativeInputNames(long j8);

    private static native void nativeInvoke(long j8, long j9);

    private static native String[] nativeOutputNames(long j8);

    private static native boolean nativeResizeInput(long j8, long j9, String str, int[] iArr);

    public void allocateTensorsIfNeeded() {
        if (this.f34518c) {
            return;
        }
        nativeAllocateTensors(this.f34516a, this.f34517b);
        this.f34518c = true;
    }

    public int getInputIndex(String str) {
        int iNativeGetInputIndex = nativeGetInputIndex(this.f34516a, str);
        if (iNativeGetInputIndex != -1) {
            return iNativeGetInputIndex;
        }
        throw new IllegalArgumentException("Input error: input " + str + " not found.");
    }

    public TensorImpl getInputTensor(String str) {
        return TensorImpl.k(this.f34516a, str);
    }

    public int getOutputIndex(String str) {
        int iNativeGetOutputIndex = nativeGetOutputIndex(this.f34516a, str);
        if (iNativeGetOutputIndex != -1) {
            return iNativeGetOutputIndex;
        }
        throw new IllegalArgumentException("Input error: output " + str + " not found.");
    }

    public TensorImpl getOutputTensor(String str) {
        return TensorImpl.l(this.f34516a, str);
    }

    public int getSubgraphIndex() {
        return nativeGetSubgraphIndex(this.f34516a);
    }

    public String[] inputNames() {
        return nativeInputNames(this.f34516a);
    }

    public void invoke() {
        nativeInvoke(this.f34516a, this.f34517b);
    }

    public String[] outputNames() {
        return nativeOutputNames(this.f34516a);
    }

    public boolean resizeInput(String str, int[] iArr) {
        this.f34518c = false;
        return nativeResizeInput(this.f34516a, this.f34517b, str, iArr);
    }
}
