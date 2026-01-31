package t;

import androidx.camera.core.AbstractC0905u;
import androidx.lifecycle.LiveData;
import java.util.Objects;
import z.C6558G;
import z.InterfaceC6553B;

/* renamed from: t.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C6298r0 {

    /* renamed from: a, reason: collision with root package name */
    private final C6558G f36761a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.lifecycle.t f36762b;

    /* renamed from: t.r0$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36763a;

        static {
            int[] iArr = new int[InterfaceC6553B.a.values().length];
            f36763a = iArr;
            try {
                iArr[InterfaceC6553B.a.PENDING_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36763a[InterfaceC6553B.a.OPENING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36763a[InterfaceC6553B.a.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36763a[InterfaceC6553B.a.CLOSING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36763a[InterfaceC6553B.a.RELEASING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36763a[InterfaceC6553B.a.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36763a[InterfaceC6553B.a.RELEASED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    C6298r0(C6558G c6558g) {
        this.f36761a = c6558g;
        androidx.lifecycle.t tVar = new androidx.lifecycle.t();
        this.f36762b = tVar;
        tVar.postValue(AbstractC0905u.create(AbstractC0905u.c.CLOSED));
    }

    private AbstractC0905u a() {
        return this.f36761a.isCameraClosing() ? AbstractC0905u.create(AbstractC0905u.c.OPENING) : AbstractC0905u.create(AbstractC0905u.c.PENDING_OPEN);
    }

    public LiveData getStateLiveData() {
        return this.f36762b;
    }

    public void updateState(InterfaceC6553B.a aVar, AbstractC0905u.b bVar) {
        AbstractC0905u abstractC0905uA;
        switch (a.f36763a[aVar.ordinal()]) {
            case 1:
                abstractC0905uA = a();
                break;
            case 2:
                abstractC0905uA = AbstractC0905u.create(AbstractC0905u.c.OPENING, bVar);
                break;
            case 3:
                abstractC0905uA = AbstractC0905u.create(AbstractC0905u.c.OPEN, bVar);
                break;
            case 4:
            case 5:
                abstractC0905uA = AbstractC0905u.create(AbstractC0905u.c.CLOSING, bVar);
                break;
            case 6:
            case 7:
                abstractC0905uA = AbstractC0905u.create(AbstractC0905u.c.CLOSED, bVar);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        androidx.camera.core.B0.d("CameraStateMachine", "New public camera state " + abstractC0905uA + " from " + aVar + " and " + bVar);
        if (Objects.equals((AbstractC0905u) this.f36762b.getValue(), abstractC0905uA)) {
            return;
        }
        androidx.camera.core.B0.d("CameraStateMachine", "Publishing new public camera state " + abstractC0905uA);
        this.f36762b.postValue(abstractC0905uA);
    }
}
