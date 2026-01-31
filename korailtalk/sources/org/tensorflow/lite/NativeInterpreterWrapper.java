package org.tensorflow.lite;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.tensorflow.lite.annotations.UsedByReflection;
import org.tensorflow.lite.f;
import org.tensorflow.lite.h;

/* loaded from: classes3.dex */
class NativeInterpreterWrapper implements AutoCloseable {

    /* renamed from: q */
    private static final i f34499q = i.APPLICATION;

    /* renamed from: a */
    long f34500a;

    /* renamed from: b */
    long f34501b;

    /* renamed from: c */
    private long f34502c;

    /* renamed from: e */
    private ByteBuffer f34504e;

    /* renamed from: f */
    private Map f34505f;

    /* renamed from: g */
    private Map f34506g;

    /* renamed from: h */
    private Map f34507h;

    /* renamed from: i */
    private Map f34508i;

    /* renamed from: j */
    private Map f34509j;

    /* renamed from: k */
    private TensorImpl[] f34510k;

    /* renamed from: l */
    private TensorImpl[] f34511l;

    /* renamed from: d */
    private long f34503d = 0;

    @UsedByReflection("nativeinterpreterwrapper_jni.cc")
    private long inferenceDurationNanoseconds = -1;

    /* renamed from: m */
    private boolean f34512m = false;

    /* renamed from: n */
    private boolean f34513n = false;

    /* renamed from: o */
    private final List f34514o = new ArrayList();

    /* renamed from: p */
    private final List f34515p = new ArrayList();

    NativeInterpreterWrapper(String str, h.a aVar) {
        TensorFlowLite.init();
        long jCreateErrorReporter = createErrorReporter(512);
        k(jCreateErrorReporter, createModel(str, jCreateErrorReporter), aVar);
    }

    private void a(h.a aVar) {
        c cVarN;
        if (this.f34513n && (cVarN = n(aVar.getDelegates())) != null) {
            this.f34515p.add(cVarN);
            this.f34514o.add(cVarN);
        }
        b(aVar);
        Iterator<d> it = aVar.getDelegateFactories().iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.f.a(it.next());
            throw null;
        }
        if (aVar.getUseNNAPI()) {
            org.tensorflow.lite.nnapi.a aVar2 = new org.tensorflow.lite.nnapi.a();
            this.f34515p.add(aVar2);
            this.f34514o.add(aVar2);
        }
    }

    private static native long allocateTensors(long j8, long j9);

    private static native void allowBufferHandleOutput(long j8, boolean z8);

    private static native void allowFp16PrecisionForFp32(long j8, boolean z8);

    private void b(h.a aVar) {
        for (c cVar : aVar.getDelegates()) {
            if (aVar.getRuntime() != f.a.EnumC0361a.FROM_APPLICATION_ONLY && !(cVar instanceof org.tensorflow.lite.nnapi.a)) {
                throw new IllegalArgumentException("Instantiated delegates (other than NnApiDelegate) are not allowed when using TF Lite from Google Play Services. Please use InterpreterApi.Options.addDelegateFactory() with an appropriate DelegateFactory instead.");
            }
            this.f34514o.add(cVar);
        }
    }

    private boolean c() {
        int i8 = 0;
        if (this.f34512m) {
            return false;
        }
        this.f34512m = true;
        allocateTensors(this.f34501b, this.f34500a);
        while (true) {
            TensorImpl[] tensorImplArr = this.f34511l;
            if (i8 >= tensorImplArr.length) {
                return true;
            }
            TensorImpl tensorImpl = tensorImplArr[i8];
            if (tensorImpl != null) {
                tensorImpl.p();
            }
            i8++;
        }
    }

    private static native long createCancellationFlag(long j8);

    private static native long createErrorReporter(int i8);

    private static native long createInterpreter(long j8, long j9, int i8, boolean z8, List<Long> list);

    private static native long createModel(String str, long j8);

    private static native long createModelWithBuffer(ByteBuffer byteBuffer, long j8);

    private static native void delete(long j8, long j9, long j10);

    private static native long deleteCancellationFlag(long j8);

    private static native int getInputCount(long j8);

    private static native String[] getInputNames(long j8);

    private static native int getInputTensorIndex(long j8, int i8);

    private static native int getOutputCount(long j8);

    private static native String[] getOutputNames(long j8);

    private static native int getOutputTensorIndex(long j8, int i8);

    private static native String[] getSignatureKeys(long j8);

    private static native boolean hasUnresolvedFlexOp(long j8);

    private NativeSignatureRunnerWrapper j(String str) {
        if (this.f34509j == null) {
            this.f34509j = new HashMap();
        }
        if (!this.f34509j.containsKey(str)) {
            this.f34509j.put(str, new NativeSignatureRunnerWrapper(this.f34501b, this.f34500a, str));
        }
        return (NativeSignatureRunnerWrapper) this.f34509j.get(str);
    }

    private void k(long j8, long j9, h.a aVar) {
        if (aVar == null) {
            aVar = new h.a();
        }
        this.f34500a = j8;
        this.f34502c = j9;
        ArrayList arrayList = new ArrayList();
        Boolean bool = aVar.f34550i;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        long jCreateInterpreter = createInterpreter(j9, j8, aVar.getNumThreads(), zBooleanValue, arrayList);
        this.f34501b = jCreateInterpreter;
        this.f34513n = hasUnresolvedFlexOp(jCreateInterpreter);
        a(aVar);
        l();
        arrayList.ensureCapacity(this.f34514o.size());
        Iterator it = this.f34514o.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((c) it.next()).getNativeHandle()));
        }
        if (!arrayList.isEmpty()) {
            delete(0L, 0L, this.f34501b);
            this.f34501b = createInterpreter(j9, j8, aVar.getNumThreads(), zBooleanValue, arrayList);
        }
        Boolean bool2 = aVar.f34548g;
        if (bool2 != null) {
            allowFp16PrecisionForFp32(this.f34501b, bool2.booleanValue());
        }
        Boolean bool3 = aVar.f34549h;
        if (bool3 != null) {
            allowBufferHandleOutput(this.f34501b, bool3.booleanValue());
        }
        if (aVar.isCancellable()) {
            this.f34503d = createCancellationFlag(this.f34501b);
        }
        this.f34510k = new TensorImpl[getInputCount(this.f34501b)];
        this.f34511l = new TensorImpl[getOutputCount(this.f34501b)];
        Boolean bool4 = aVar.f34548g;
        if (bool4 != null) {
            allowFp16PrecisionForFp32(this.f34501b, bool4.booleanValue());
        }
        Boolean bool5 = aVar.f34549h;
        if (bool5 != null) {
            allowBufferHandleOutput(this.f34501b, bool5.booleanValue());
        }
        allocateTensors(this.f34501b, j8);
        this.f34512m = true;
    }

    private void m() {
        if (this.f34507h != null) {
            return;
        }
        this.f34507h = new HashMap();
        this.f34508i = new HashMap();
        int inputTensorCount = getInputTensorCount();
        for (int i8 = 0; i8 < inputTensorCount; i8++) {
            this.f34507h.put(Integer.valueOf(getInputTensorIndex(this.f34501b, i8)), Integer.valueOf(i8));
        }
        int outputTensorCount = getOutputTensorCount();
        for (int i9 = 0; i9 < outputTensorCount; i9++) {
            this.f34508i.put(Integer.valueOf(getOutputTensorIndex(this.f34501b, i9)), Integer.valueOf(i9));
        }
    }

    private static c n(List list) throws ClassNotFoundException {
        try {
            Class<?> cls = Class.forName("org.tensorflow.lite.flex.FlexDelegate");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (cls.isInstance((c) it.next())) {
                    return null;
                }
            }
            return (c) cls.getConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static native boolean resizeInput(long j8, long j9, int i8, int[] iArr, boolean z8);

    private static native void run(long j8, long j9);

    private static native void setCancelled(long j8, long j9, boolean z8);

    void allocateTensors() {
        c();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i8 = 0;
        while (true) {
            TensorImpl[] tensorImplArr = this.f34510k;
            if (i8 >= tensorImplArr.length) {
                break;
            }
            TensorImpl tensorImpl = tensorImplArr[i8];
            if (tensorImpl != null) {
                tensorImpl.b();
                this.f34510k[i8] = null;
            }
            i8++;
        }
        int i9 = 0;
        while (true) {
            TensorImpl[] tensorImplArr2 = this.f34511l;
            if (i9 >= tensorImplArr2.length) {
                break;
            }
            TensorImpl tensorImpl2 = tensorImplArr2[i9];
            if (tensorImpl2 != null) {
                tensorImpl2.b();
                this.f34511l[i9] = null;
            }
            i9++;
        }
        delete(this.f34500a, this.f34502c, this.f34501b);
        deleteCancellationFlag(this.f34503d);
        this.f34500a = 0L;
        this.f34502c = 0L;
        this.f34501b = 0L;
        this.f34503d = 0L;
        this.f34504e = null;
        this.f34505f = null;
        this.f34506g = null;
        this.f34512m = false;
        this.f34514o.clear();
        Iterator it = this.f34515p.iterator();
        while (it.hasNext()) {
            ((c) it.next()).close();
        }
        this.f34515p.clear();
    }

    TensorImpl d(int i8) {
        if (i8 >= 0) {
            TensorImpl[] tensorImplArr = this.f34510k;
            if (i8 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i8];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j8 = this.f34501b;
                TensorImpl tensorImplJ = TensorImpl.j(j8, getInputTensorIndex(j8, i8));
                tensorImplArr[i8] = tensorImplJ;
                return tensorImplJ;
            }
        }
        throw new IllegalArgumentException("Invalid input Tensor index: " + i8);
    }

    TensorImpl e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid input tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperJ = j(str2);
        return nativeSignatureRunnerWrapperJ.getSubgraphIndex() > 0 ? nativeSignatureRunnerWrapperJ.getInputTensor(str) : d(nativeSignatureRunnerWrapperJ.getInputIndex(str));
    }

    TensorImpl f(int i8) {
        if (i8 >= 0) {
            TensorImpl[] tensorImplArr = this.f34511l;
            if (i8 < tensorImplArr.length) {
                TensorImpl tensorImpl = tensorImplArr[i8];
                if (tensorImpl != null) {
                    return tensorImpl;
                }
                long j8 = this.f34501b;
                TensorImpl tensorImplJ = TensorImpl.j(j8, getOutputTensorIndex(j8, i8));
                tensorImplArr[i8] = tensorImplJ;
                return tensorImplJ;
            }
        }
        throw new IllegalArgumentException("Invalid output Tensor index: " + i8);
    }

    TensorImpl g(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid output tensor name provided (null)");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperJ = j(str2);
        return nativeSignatureRunnerWrapperJ.getSubgraphIndex() > 0 ? nativeSignatureRunnerWrapperJ.getOutputTensor(str) : f(nativeSignatureRunnerWrapperJ.getOutputIndex(str));
    }

    int getInputIndex(String str) {
        if (this.f34505f == null) {
            String[] inputNames = getInputNames(this.f34501b);
            this.f34505f = new HashMap();
            if (inputNames != null) {
                for (int i8 = 0; i8 < inputNames.length; i8++) {
                    this.f34505f.put(inputNames[i8], Integer.valueOf(i8));
                }
            }
        }
        if (this.f34505f.containsKey(str)) {
            return ((Integer) this.f34505f.get(str)).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any input. Names of inputs and their indexes are %s", str, this.f34505f));
    }

    int getInputTensorCount() {
        return this.f34510k.length;
    }

    Long getLastNativeInferenceDurationNanoseconds() {
        long j8 = this.inferenceDurationNanoseconds;
        if (j8 < 0) {
            return null;
        }
        return Long.valueOf(j8);
    }

    int getOutputIndex(String str) {
        if (this.f34506g == null) {
            String[] outputNames = getOutputNames(this.f34501b);
            this.f34506g = new HashMap();
            if (outputNames != null) {
                for (int i8 = 0; i8 < outputNames.length; i8++) {
                    this.f34506g.put(outputNames[i8], Integer.valueOf(i8));
                }
            }
        }
        if (this.f34506g.containsKey(str)) {
            return ((Integer) this.f34506g.get(str)).intValue();
        }
        throw new IllegalArgumentException(String.format("Input error: '%s' is not a valid name for any output. Names of outputs and their indexes are %s", str, this.f34506g));
    }

    int getOutputTensorCount() {
        return this.f34511l.length;
    }

    public String[] getSignatureKeys() {
        return getSignatureKeys(this.f34501b);
    }

    String[] h(String str) {
        return j(str).inputNames();
    }

    String[] i(String str) {
        return j(str).outputNames();
    }

    void l() {
        InterpreterFactoryImpl interpreterFactoryImpl = new InterpreterFactoryImpl();
        for (c cVar : this.f34514o) {
            if (cVar instanceof org.tensorflow.lite.nnapi.a) {
                ((org.tensorflow.lite.nnapi.a) cVar).initWithInterpreterFactoryApi(interpreterFactoryImpl);
            }
        }
    }

    void o(Object[] objArr, Map map) {
        this.inferenceDurationNanoseconds = -1L;
        if (objArr == null || objArr.length == 0) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        int i8 = 0;
        for (int i9 = 0; i9 < objArr.length; i9++) {
            int[] iArrM = d(i9).m(objArr[i9]);
            if (iArrM != null) {
                resizeInput(i9, iArrM);
            }
        }
        boolean zC = c();
        for (int i10 = 0; i10 < objArr.length; i10++) {
            d(i10).q(objArr[i10]);
        }
        long jNanoTime = System.nanoTime();
        run(this.f34501b, this.f34500a);
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (zC) {
            while (true) {
                TensorImpl[] tensorImplArr = this.f34511l;
                if (i8 >= tensorImplArr.length) {
                    break;
                }
                TensorImpl tensorImpl = tensorImplArr[i8];
                if (tensorImpl != null) {
                    tensorImpl.p();
                }
                i8++;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                f(((Integer) entry.getKey()).intValue()).f(entry.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    void p(boolean z8) {
        long j8 = this.f34503d;
        if (j8 == 0) {
            throw new IllegalStateException("Cannot cancel the inference. Have you called InterpreterApi.Options.setCancellable?");
        }
        setCancelled(this.f34501b, j8, z8);
    }

    void resizeInput(int i8, int[] iArr) {
        resizeInput(i8, iArr, false);
    }

    public void runSignature(Map<String, Object> map, Map<String, Object> map2, String str) {
        this.inferenceDurationNanoseconds = -1L;
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException("Input error: Inputs should not be null or empty.");
        }
        if (map2 == null) {
            throw new IllegalArgumentException("Input error: Outputs should not be null.");
        }
        NativeSignatureRunnerWrapper nativeSignatureRunnerWrapperJ = j(str);
        if (nativeSignatureRunnerWrapperJ.getSubgraphIndex() == 0) {
            m();
            Object[] objArr = new Object[map.size()];
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                objArr[nativeSignatureRunnerWrapperJ.getInputIndex(entry.getKey())] = entry.getValue();
            }
            TreeMap treeMap = new TreeMap();
            for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
                treeMap.put(Integer.valueOf(nativeSignatureRunnerWrapperJ.getOutputIndex(entry2.getKey())), entry2.getValue());
            }
            o(objArr, treeMap);
            return;
        }
        for (Map.Entry<String, Object> entry3 : map.entrySet()) {
            int[] iArrM = e(entry3.getKey(), str).m(entry3.getValue());
            if (iArrM != null) {
                nativeSignatureRunnerWrapperJ.resizeInput(entry3.getKey(), iArrM);
            }
        }
        nativeSignatureRunnerWrapperJ.allocateTensorsIfNeeded();
        for (Map.Entry<String, Object> entry4 : map.entrySet()) {
            nativeSignatureRunnerWrapperJ.getInputTensor(entry4.getKey()).q(entry4.getValue());
        }
        long jNanoTime = System.nanoTime();
        nativeSignatureRunnerWrapperJ.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        for (Map.Entry<String, Object> entry5 : map2.entrySet()) {
            if (entry5.getValue() != null) {
                nativeSignatureRunnerWrapperJ.getOutputTensor(entry5.getKey()).f(entry5.getValue());
            }
        }
        this.inferenceDurationNanoseconds = jNanoTime2;
    }

    void resizeInput(int i8, int[] iArr, boolean z8) {
        if (resizeInput(this.f34501b, this.f34500a, i8, iArr, z8)) {
            this.f34512m = false;
            TensorImpl tensorImpl = this.f34510k[i8];
            if (tensorImpl != null) {
                tensorImpl.p();
            }
        }
    }

    NativeInterpreterWrapper(ByteBuffer byteBuffer, h.a aVar) {
        TensorFlowLite.init();
        if (byteBuffer != null && ((byteBuffer instanceof MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == ByteOrder.nativeOrder()))) {
            this.f34504e = byteBuffer;
            long jCreateErrorReporter = createErrorReporter(512);
            k(jCreateErrorReporter, createModelWithBuffer(this.f34504e, jCreateErrorReporter), aVar);
            return;
        }
        throw new IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
    }
}
