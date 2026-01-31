package Q0;

import H0.x;
import P0.r;
import com.google.common.util.concurrent.C;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c f3938a = androidx.work.impl.utils.futures.c.create();

    class a extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.i f3939b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f3940c;

        a(I0.i iVar, List list) {
            this.f3939b = iVar;
            this.f3940c = list;
        }

        @Override // Q0.p
        public List<H0.v> runInternal() {
            return (List) P0.r.WORK_INFO_MAPPER.apply(this.f3939b.getWorkDatabase().workSpecDao().getWorkStatusPojoForIds(this.f3940c));
        }
    }

    class b extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.i f3941b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ UUID f3942c;

        b(I0.i iVar, UUID uuid) {
            this.f3941b = iVar;
            this.f3942c = uuid;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Q0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H0.v runInternal() {
            r.c workStatusPojoForId = this.f3941b.getWorkDatabase().workSpecDao().getWorkStatusPojoForId(this.f3942c.toString());
            if (workStatusPojoForId != null) {
                return workStatusPojoForId.toWorkInfo();
            }
            return null;
        }
    }

    class c extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.i f3943b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3944c;

        c(I0.i iVar, String str) {
            this.f3943b = iVar;
            this.f3944c = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Q0.p
        public List runInternal() {
            return (List) P0.r.WORK_INFO_MAPPER.apply(this.f3943b.getWorkDatabase().workSpecDao().getWorkStatusPojoForTag(this.f3944c));
        }
    }

    class d extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.i f3945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f3946c;

        d(I0.i iVar, String str) {
            this.f3945b = iVar;
            this.f3946c = str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Q0.p
        public List runInternal() {
            return (List) P0.r.WORK_INFO_MAPPER.apply(this.f3945b.getWorkDatabase().workSpecDao().getWorkStatusPojoForName(this.f3946c));
        }
    }

    class e extends p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ I0.i f3947b;

        e(I0.i iVar, x xVar) {
            this.f3947b = iVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // Q0.p
        public List runInternal() {
            return (List) P0.r.WORK_INFO_MAPPER.apply(this.f3947b.getWorkDatabase().rawWorkInfoDao().getWorkInfoPojos(m.workQueryToRawQuery(null)));
        }
    }

    public static p forStringIds(I0.i iVar, List<String> list) {
        return new a(iVar, list);
    }

    public static p forTag(I0.i iVar, String str) {
        return new c(iVar, str);
    }

    public static p forUUID(I0.i iVar, UUID uuid) {
        return new b(iVar, uuid);
    }

    public static p forUniqueWork(I0.i iVar, String str) {
        return new d(iVar, str);
    }

    public static p forWorkQuerySpec(I0.i iVar, x xVar) {
        return new e(iVar, xVar);
    }

    public C getFuture() {
        return this.f3938a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f3938a.set(runInternal());
        } catch (Throwable th) {
            this.f3938a.setException(th);
        }
    }

    abstract Object runInternal();
}
