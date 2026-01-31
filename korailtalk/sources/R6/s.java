package R6;

import com.korail.talk.network.dao.research.CmtrInfoDao;
import f7.InterfaceC5519a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
final class s implements InterfaceC0755i, Serializable {
    public static final a Companion = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f4482d = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B);

    /* renamed from: a, reason: collision with root package name */
    private volatile InterfaceC5519a f4483a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f4484b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f4485c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public s(InterfaceC5519a initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f4483a = initializer;
        C c9 = C.INSTANCE;
        this.f4484b = c9;
        this.f4485c = c9;
    }

    @Override // R6.InterfaceC0755i
    public Object getValue() {
        Object obj = this.f4484b;
        C c9 = C.INSTANCE;
        if (obj != c9) {
            return obj;
        }
        InterfaceC5519a interfaceC5519a = this.f4483a;
        if (interfaceC5519a != null) {
            Object objInvoke = interfaceC5519a.invoke();
            if (androidx.concurrent.futures.b.a(f4482d, this, c9, objInvoke)) {
                this.f4483a = null;
                return objInvoke;
            }
        }
        return this.f4484b;
    }

    @Override // R6.InterfaceC0755i
    public boolean isInitialized() {
        return this.f4484b != C.INSTANCE;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
