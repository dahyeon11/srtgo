package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import org.tensorflow.lite.f;
import org.tensorflow.lite.h;

/* loaded from: classes3.dex */
public final class e extends h implements f {

    /* renamed from: b, reason: collision with root package name */
    NativeInterpreterWrapperExperimental f34538b;

    /* renamed from: c, reason: collision with root package name */
    String[] f34539c;

    public static class a extends h.a {
        public a() {
        }

        public a setAllowBufferHandleOutput(boolean z8) {
            this.f34549h = Boolean.valueOf(z8);
            return this;
        }

        @Deprecated
        public a setAllowFp16PrecisionForFp32(boolean z8) {
            this.f34548g = Boolean.valueOf(z8);
            return this;
        }

        public a setUseXNNPACK(boolean z8) {
            this.f34550i = Boolean.valueOf(z8);
            return this;
        }

        public a(f.a aVar) {
            super(aVar);
        }

        @Override // org.tensorflow.lite.f.a
        public a addDelegate(c cVar) {
            super.addDelegate(cVar);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        public a addDelegateFactory(d dVar) {
            super.addDelegateFactory(dVar);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        public a setCancellable(boolean z8) {
            super.setCancellable(z8);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        public a setNumThreads(int i8) {
            super.setNumThreads(i8);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        public a setRuntime(f.a.EnumC0361a enumC0361a) {
            super.setRuntime(enumC0361a);
            return this;
        }

        @Override // org.tensorflow.lite.f.a
        public a setUseNNAPI(boolean z8) {
            super.setUseNNAPI(z8);
            return this;
        }
    }

    public e(File file) {
        this(file, (a) null);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void allocateTensors() {
        super.allocateTensors();
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f, java.lang.AutoCloseable
    public /* bridge */ /* synthetic */ void close() {
        super.close();
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int getInputIndex(String str) {
        return super.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ j getInputTensor(int i8) {
        return super.getInputTensor(i8);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int getInputTensorCount() {
        return super.getInputTensorCount();
    }

    public j getInputTensorFromSignature(String str, String str2) {
        a();
        if (str2 == null) {
            String[] strArr = this.f34539c;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.f34547a.e(str, str2);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.f34539c));
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ Long getLastNativeInferenceDurationNanoseconds() {
        return super.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int getOutputIndex(String str) {
        return super.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ j getOutputTensor(int i8) {
        return super.getOutputTensor(i8);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ int getOutputTensorCount() {
        return super.getOutputTensorCount();
    }

    public j getOutputTensorFromSignature(String str, String str2) {
        a();
        if (str2 == null) {
            String[] strArr = this.f34539c;
            if (strArr.length == 1) {
                str2 = strArr[0];
            }
        }
        if (str2 != null) {
            return this.f34547a.g(str, str2);
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.f34539c));
    }

    public String[] getSignatureInputs(String str) {
        a();
        return this.f34547a.h(str);
    }

    public String[] getSignatureKeys() {
        a();
        return this.f34547a.getSignatureKeys();
    }

    public String[] getSignatureOutputs(String str) {
        a();
        return this.f34547a.i(str);
    }

    public void resetVariableTensors() {
        a();
        this.f34538b.q();
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void resizeInput(int i8, int[] iArr) {
        super.resizeInput(i8, iArr);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void run(Object obj, Object obj2) {
        super.run(obj, obj2);
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void runForMultipleInputsOutputs(Object[] objArr, Map map) {
        super.runForMultipleInputsOutputs(objArr, map);
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        a();
        if (str == null) {
            String[] strArr = this.f34539c;
            if (strArr.length == 1) {
                str = strArr[0];
            }
        }
        if (str != null) {
            this.f34547a.runSignature(map, map2, str);
            return;
        }
        throw new IllegalArgumentException("Input error: SignatureDef signatureKey should not be null. null is only allowed if the model has a single Signature. Available Signatures: " + Arrays.toString(this.f34539c));
    }

    public void setCancelled(boolean z8) {
        this.f34547a.p(z8);
    }

    public e(File file, a aVar) {
        this(new NativeInterpreterWrapperExperimental(file.getAbsolutePath(), aVar));
    }

    @Override // org.tensorflow.lite.h, org.tensorflow.lite.f
    public /* bridge */ /* synthetic */ void resizeInput(int i8, int[] iArr, boolean z8) {
        super.resizeInput(i8, iArr, z8);
    }

    public e(ByteBuffer byteBuffer) {
        this(byteBuffer, (a) null);
    }

    public e(ByteBuffer byteBuffer, a aVar) {
        this(new NativeInterpreterWrapperExperimental(byteBuffer, aVar));
    }

    private e(NativeInterpreterWrapperExperimental nativeInterpreterWrapperExperimental) {
        super(nativeInterpreterWrapperExperimental);
        this.f34538b = nativeInterpreterWrapperExperimental;
        this.f34539c = getSignatureKeys();
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2) {
        a();
        runSignature(map, map2, null);
    }
}
