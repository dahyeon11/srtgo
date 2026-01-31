package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.f;
import org.tensorflow.lite.h;
import org.tensorflow.lite.nnapi.NnApiDelegateImpl;
import org.tensorflow.lite.nnapi.a;

@UsedByReflection("InterpreterFactory.java")
/* loaded from: classes3.dex */
class InterpreterFactoryImpl implements g {
    private static native String nativeRuntimeVersion();

    private static native String nativeSchemaVersion();

    @Override // org.tensorflow.lite.g
    public f create(File file, f.a aVar) {
        return new h(file, aVar == null ? null : new h.a(aVar));
    }

    @Override // org.tensorflow.lite.g
    public a.b createNnApiDelegateImpl(a.C0362a c0362a) {
        return new NnApiDelegateImpl(c0362a);
    }

    @Override // org.tensorflow.lite.g
    public String runtimeVersion() {
        TensorFlowLite.init();
        return nativeRuntimeVersion();
    }

    @Override // org.tensorflow.lite.g
    public String schemaVersion() {
        TensorFlowLite.init();
        return nativeSchemaVersion();
    }

    @Override // org.tensorflow.lite.g
    public f create(ByteBuffer byteBuffer, f.a aVar) {
        return new h(byteBuffer, aVar == null ? null : new h.a(aVar));
    }
}
