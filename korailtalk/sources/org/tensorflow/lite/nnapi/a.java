package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.TensorFlowLite;
import org.tensorflow.lite.c;
import org.tensorflow.lite.g;

/* loaded from: classes3.dex */
public class a implements c, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    private C0362a f34555a;

    /* renamed from: b, reason: collision with root package name */
    private b f34556b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f34557c;

    /* renamed from: org.tensorflow.lite.nnapi.a$a, reason: collision with other inner class name */
    public static final class C0362a {
        public static final int EXECUTION_PREFERENCE_FAST_SINGLE_ANSWER = 1;
        public static final int EXECUTION_PREFERENCE_LOW_POWER = 0;
        public static final int EXECUTION_PREFERENCE_SUSTAINED_SPEED = 2;
        public static final int EXECUTION_PREFERENCE_UNDEFINED = -1;

        /* renamed from: a, reason: collision with root package name */
        private int f34558a = -1;

        /* renamed from: b, reason: collision with root package name */
        private String f34559b = null;

        /* renamed from: c, reason: collision with root package name */
        private String f34560c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f34561d = null;

        /* renamed from: e, reason: collision with root package name */
        private Integer f34562e = null;

        /* renamed from: f, reason: collision with root package name */
        private Boolean f34563f = null;

        /* renamed from: g, reason: collision with root package name */
        private Boolean f34564g = null;

        /* renamed from: h, reason: collision with root package name */
        private long f34565h = 0;

        public String getAcceleratorName() {
            return this.f34559b;
        }

        public boolean getAllowFp16() {
            Boolean bool = this.f34564g;
            return bool != null && bool.booleanValue();
        }

        public String getCacheDir() {
            return this.f34560c;
        }

        public int getExecutionPreference() {
            return this.f34558a;
        }

        public int getMaxNumberOfDelegatedPartitions() {
            Integer num = this.f34562e;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public String getModelToken() {
            return this.f34561d;
        }

        public long getNnApiSupportLibraryHandle() {
            return this.f34565h;
        }

        public Boolean getUseNnapiCpu() {
            return this.f34563f;
        }

        public C0362a setAcceleratorName(String str) {
            this.f34559b = str;
            return this;
        }

        public C0362a setAllowFp16(boolean z8) {
            this.f34564g = Boolean.valueOf(z8);
            return this;
        }

        public C0362a setCacheDir(String str) {
            this.f34560c = str;
            return this;
        }

        public C0362a setExecutionPreference(int i8) {
            this.f34558a = i8;
            return this;
        }

        public C0362a setMaxNumberOfDelegatedPartitions(int i8) {
            this.f34562e = Integer.valueOf(i8);
            return this;
        }

        public C0362a setModelToken(String str) {
            this.f34561d = str;
            return this;
        }

        public C0362a setNnApiSupportLibraryHandle(long j8) {
            this.f34565h = j8;
            return this;
        }

        public C0362a setUseNnapiCpu(boolean z8) {
            this.f34563f = Boolean.valueOf(z8);
            return this;
        }
    }

    public interface b extends c, AutoCloseable {
        @Override // org.tensorflow.lite.c, java.io.Closeable, java.lang.AutoCloseable
        void close();

        @Override // org.tensorflow.lite.c
        /* synthetic */ long getNativeHandle();

        int getNnapiErrno();
    }

    public a(C0362a c0362a) {
        TensorFlowLite.init();
        this.f34555a = c0362a;
    }

    private void a() {
        if (this.f34556b == null) {
            throw new IllegalStateException(this.f34557c ? "Should not access delegate after delegate has been closed." : "Should not access delegate before interpreter has been constructed.");
        }
    }

    @Override // org.tensorflow.lite.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b bVar = this.f34556b;
        if (bVar != null) {
            bVar.close();
            this.f34556b = null;
        }
    }

    @Override // org.tensorflow.lite.c
    public long getNativeHandle() {
        a();
        return this.f34556b.getNativeHandle();
    }

    public int getNnapiErrno() {
        if (!this.f34557c) {
            return 0;
        }
        a();
        return this.f34556b.getNnapiErrno();
    }

    public boolean hasErrors() {
        return getNnapiErrno() != 0;
    }

    public void initWithInterpreterFactoryApi(g gVar) {
        this.f34556b = gVar.createNnApiDelegateImpl(this.f34555a);
        this.f34557c = true;
    }

    public a() {
        this(new C0362a());
    }
}
