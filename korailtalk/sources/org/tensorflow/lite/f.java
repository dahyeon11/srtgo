package org.tensorflow.lite;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface f extends AutoCloseable {
    static f create(File file, a aVar) {
        return TensorFlowLite.b(aVar == null ? null : aVar.getRuntime()).create(file, aVar);
    }

    void allocateTensors();

    @Override // java.lang.AutoCloseable
    void close();

    int getInputIndex(String str);

    j getInputTensor(int i8);

    int getInputTensorCount();

    Long getLastNativeInferenceDurationNanoseconds();

    int getOutputIndex(String str);

    j getOutputTensor(int i8);

    int getOutputTensorCount();

    void resizeInput(int i8, int[] iArr);

    void resizeInput(int i8, int[] iArr, boolean z8);

    void run(Object obj, Object obj2);

    void runForMultipleInputsOutputs(Object[] objArr, Map<Integer, Object> map);

    static f create(ByteBuffer byteBuffer, a aVar) {
        return TensorFlowLite.b(aVar == null ? null : aVar.getRuntime()).create(byteBuffer, aVar);
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        EnumC0361a f34540a;

        /* renamed from: b, reason: collision with root package name */
        int f34541b;

        /* renamed from: c, reason: collision with root package name */
        Boolean f34542c;

        /* renamed from: d, reason: collision with root package name */
        Boolean f34543d;

        /* renamed from: e, reason: collision with root package name */
        final List f34544e;

        /* renamed from: f, reason: collision with root package name */
        private final List f34545f;

        /* renamed from: org.tensorflow.lite.f$a$a, reason: collision with other inner class name */
        public enum EnumC0361a {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public a() {
            this.f34540a = EnumC0361a.FROM_APPLICATION_ONLY;
            this.f34541b = -1;
            this.f34544e = new ArrayList();
            this.f34545f = new ArrayList();
        }

        public a addDelegate(c cVar) {
            this.f34544e.add(cVar);
            return this;
        }

        public a addDelegateFactory(d dVar) {
            this.f34545f.add(dVar);
            return this;
        }

        public List<d> getDelegateFactories() {
            return Collections.unmodifiableList(this.f34545f);
        }

        public List<c> getDelegates() {
            return Collections.unmodifiableList(this.f34544e);
        }

        public int getNumThreads() {
            return this.f34541b;
        }

        public EnumC0361a getRuntime() {
            return this.f34540a;
        }

        public boolean getUseNNAPI() {
            Boolean bool = this.f34542c;
            return bool != null && bool.booleanValue();
        }

        public boolean isCancellable() {
            Boolean bool = this.f34543d;
            return bool != null && bool.booleanValue();
        }

        public a setCancellable(boolean z8) {
            this.f34543d = Boolean.valueOf(z8);
            return this;
        }

        public a setNumThreads(int i8) {
            this.f34541b = i8;
            return this;
        }

        public a setRuntime(EnumC0361a enumC0361a) {
            this.f34540a = enumC0361a;
            return this;
        }

        public a setUseNNAPI(boolean z8) {
            this.f34542c = Boolean.valueOf(z8);
            return this;
        }

        public a(a aVar) {
            this.f34540a = EnumC0361a.FROM_APPLICATION_ONLY;
            this.f34541b = -1;
            this.f34541b = aVar.f34541b;
            this.f34542c = aVar.f34542c;
            this.f34543d = aVar.f34543d;
            this.f34544e = new ArrayList(aVar.f34544e);
            this.f34545f = new ArrayList(aVar.f34545f);
            this.f34540a = aVar.f34540a;
        }
    }
}
