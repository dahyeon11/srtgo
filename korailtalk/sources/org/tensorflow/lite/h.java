package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import org.tensorflow.lite.f;

/* loaded from: classes3.dex */
class h implements f {

    /* renamed from: a, reason: collision with root package name */
    NativeInterpreterWrapper f34547a;

    static class a extends f.a {

        /* renamed from: g, reason: collision with root package name */
        Boolean f34548g;

        /* renamed from: h, reason: collision with root package name */
        Boolean f34549h;

        /* renamed from: i, reason: collision with root package name */
        Boolean f34550i;

        public a() {
        }

        public a(f.a aVar) {
            super(aVar);
        }

        public a(a aVar) {
            super(aVar);
            this.f34548g = aVar.f34548g;
            this.f34549h = aVar.f34549h;
            this.f34550i = aVar.f34550i;
        }
    }

    public h(File file) {
        this(file, (a) null);
    }

    void a() {
        if (this.f34547a == null) {
            throw new IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    @Override // org.tensorflow.lite.f
    public void allocateTensors() {
        a();
        this.f34547a.allocateTensors();
    }

    @Override // org.tensorflow.lite.f, java.lang.AutoCloseable
    public void close() {
        NativeInterpreterWrapper nativeInterpreterWrapper = this.f34547a;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f34547a = null;
        }
    }

    protected void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // org.tensorflow.lite.f
    public int getInputIndex(String str) {
        a();
        return this.f34547a.getInputIndex(str);
    }

    @Override // org.tensorflow.lite.f
    public j getInputTensor(int i8) {
        a();
        return this.f34547a.d(i8);
    }

    @Override // org.tensorflow.lite.f
    public int getInputTensorCount() {
        a();
        return this.f34547a.getInputTensorCount();
    }

    @Override // org.tensorflow.lite.f
    public Long getLastNativeInferenceDurationNanoseconds() {
        a();
        return this.f34547a.getLastNativeInferenceDurationNanoseconds();
    }

    @Override // org.tensorflow.lite.f
    public int getOutputIndex(String str) {
        a();
        return this.f34547a.getOutputIndex(str);
    }

    @Override // org.tensorflow.lite.f
    public j getOutputTensor(int i8) {
        a();
        return this.f34547a.f(i8);
    }

    @Override // org.tensorflow.lite.f
    public int getOutputTensorCount() {
        a();
        return this.f34547a.getOutputTensorCount();
    }

    @Override // org.tensorflow.lite.f
    public void resizeInput(int i8, int[] iArr) {
        a();
        this.f34547a.resizeInput(i8, iArr, false);
    }

    @Override // org.tensorflow.lite.f
    public void run(Object obj, Object obj2) {
        HashMap map = new HashMap();
        map.put(0, obj2);
        runForMultipleInputsOutputs(new Object[]{obj}, map);
    }

    @Override // org.tensorflow.lite.f
    public void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map) {
        a();
        this.f34547a.o(objArr, map);
    }

    public h(File file, a aVar) {
        this.f34547a = new NativeInterpreterWrapper(file.getAbsolutePath(), aVar);
    }

    @Override // org.tensorflow.lite.f
    public void resizeInput(int i8, int[] iArr, boolean z8) {
        a();
        this.f34547a.resizeInput(i8, iArr, z8);
    }

    public h(ByteBuffer byteBuffer) {
        this(byteBuffer, (a) null);
    }

    public h(ByteBuffer byteBuffer, a aVar) {
        this.f34547a = new NativeInterpreterWrapper(byteBuffer, aVar);
    }

    h(NativeInterpreterWrapper nativeInterpreterWrapper) {
        this.f34547a = nativeInterpreterWrapper;
    }
}
