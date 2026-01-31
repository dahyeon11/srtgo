package z;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import z.C0;
import z.M0;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f37745a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f37746b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    interface a {
        boolean filter(b bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C0 f37747a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f37748b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f37749c = false;

        b(C0 c02) {
            this.f37747a = c02;
        }

        boolean a() {
            return this.f37749c;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b() {
            return this.f37748b;
        }

        C0 c() {
            return this.f37747a;
        }

        void d(boolean z8) {
            this.f37749c = z8;
        }

        void e(boolean z8) {
            this.f37748b = z8;
        }
    }

    public M0(String str) {
        this.f37745a = str;
    }

    private b c(String str, C0 c02) {
        b bVar = (b) this.f37746b.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(c02);
        this.f37746b.put(str, bVar2);
        return bVar2;
    }

    private Collection d(a aVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f37746b.entrySet()) {
            if (aVar == null || aVar.filter((b) entry.getValue())) {
                arrayList.add(((b) entry.getValue()).c());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean e(b bVar) {
        return bVar.a() && bVar.b();
    }

    public C0.f getActiveAndAttachedBuilder() {
        C0.f fVar = new C0.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f37746b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.a() && bVar.b()) {
                String str = (String) entry.getKey();
                fVar.add(bVar.c());
                arrayList.add(str);
            }
        }
        androidx.camera.core.B0.d("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + this.f37745a);
        return fVar;
    }

    public Collection<C0> getActiveAndAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(d(new a() { // from class: z.L0
            @Override // z.M0.a
            public final boolean filter(M0.b bVar) {
                return M0.e(bVar);
            }
        }));
    }

    public C0.f getAttachedBuilder() {
        C0.f fVar = new C0.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f37746b.entrySet()) {
            b bVar = (b) entry.getValue();
            if (bVar.b()) {
                fVar.add(bVar.c());
                arrayList.add((String) entry.getKey());
            }
        }
        androidx.camera.core.B0.d("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f37745a);
        return fVar;
    }

    public Collection<C0> getAttachedSessionConfigs() {
        return Collections.unmodifiableCollection(d(new a() { // from class: z.K0
            @Override // z.M0.a
            public final boolean filter(M0.b bVar) {
                return bVar.b();
            }
        }));
    }

    public boolean isUseCaseAttached(String str) {
        if (this.f37746b.containsKey(str)) {
            return ((b) this.f37746b.get(str)).b();
        }
        return false;
    }

    public void removeUseCase(String str) {
        this.f37746b.remove(str);
    }

    public void setUseCaseActive(String str, C0 c02) {
        c(str, c02).d(true);
    }

    public void setUseCaseAttached(String str, C0 c02) {
        c(str, c02).e(true);
    }

    public void setUseCaseDetached(String str) {
        if (this.f37746b.containsKey(str)) {
            b bVar = (b) this.f37746b.get(str);
            bVar.e(false);
            if (bVar.a()) {
                return;
            }
            this.f37746b.remove(str);
        }
    }

    public void setUseCaseInactive(String str) {
        if (this.f37746b.containsKey(str)) {
            b bVar = (b) this.f37746b.get(str);
            bVar.d(false);
            if (bVar.b()) {
                return;
            }
            this.f37746b.remove(str);
        }
    }

    public void updateUseCase(String str, C0 c02) {
        if (this.f37746b.containsKey(str)) {
            b bVar = new b(c02);
            b bVar2 = (b) this.f37746b.get(str);
            bVar.e(bVar2.b());
            bVar.d(bVar2.a());
            this.f37746b.put(str, bVar);
        }
    }
}
