package O6;

import androidx.core.app.r;
import com.kakao.sdk.template.Constants;
import com.korail.talk.network.dao.research.CmtrInfoDao;
import e3.p;
import e3.w;
import io.grpc.AbstractC5714a0;
import io.grpc.C;
import io.grpc.C5713a;
import io.grpc.C5803u;
import io.grpc.EnumC5802t;
import io.grpc.J0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public class h extends AbstractC5714a0 {

    /* renamed from: g */
    static final C5713a.c f3533g = C5713a.c.create("state-info");

    /* renamed from: h */
    private static final J0 f3534h = J0.OK.withDescription("no subchannels ready");

    /* renamed from: b */
    private final AbstractC5714a0.d f3535b;

    /* renamed from: e */
    private EnumC5802t f3538e;

    /* renamed from: c */
    private final Map f3536c = new HashMap();

    /* renamed from: f */
    protected e f3539f = new b(f3534h);

    /* renamed from: d */
    private final Random f3537d = new Random();

    class a implements AbstractC5714a0.j {

        /* renamed from: a */
        final /* synthetic */ AbstractC5714a0.h f3540a;

        a(AbstractC5714a0.h hVar) {
            this.f3540a = hVar;
        }

        @Override // io.grpc.AbstractC5714a0.j
        public void onSubchannelState(C5803u c5803u) {
            h.this.g(this.f3540a, c5803u);
        }
    }

    static final class b extends e {

        /* renamed from: a */
        private final J0 f3542a;

        b(J0 j02) {
            this.f3542a = (J0) w.checkNotNull(j02, r.CATEGORY_STATUS);
        }

        @Override // O6.h.e
        public boolean isEquivalentTo(e eVar) {
            if (eVar instanceof b) {
                b bVar = (b) eVar;
                if (e3.r.equal(this.f3542a, bVar.f3542a) || (this.f3542a.isOk() && bVar.f3542a.isOk())) {
                    return true;
                }
            }
            return false;
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return this.f3542a.isOk() ? AbstractC5714a0.e.withNoResult() : AbstractC5714a0.e.withError(this.f3542a);
        }

        public String toString() {
            return p.toStringHelper((Class<?>) b.class).add(r.CATEGORY_STATUS, this.f3542a).toString();
        }
    }

    static class c extends e {

        /* renamed from: c */
        private static final AtomicIntegerFieldUpdater f3543c = AtomicIntegerFieldUpdater.newUpdater(c.class, CmtrInfoDao.CmtrInfoRequest.JOB_DV_CD_B);

        /* renamed from: a */
        private final List f3544a;

        /* renamed from: b */
        private volatile int f3545b;

        public c(List<AbstractC5714a0.h> list, int i8) {
            w.checkArgument(!list.isEmpty(), "empty list");
            this.f3544a = list;
            this.f3545b = i8 - 1;
        }

        private AbstractC5714a0.h a() {
            int size = this.f3544a.size();
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3543c;
            int iIncrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            if (iIncrementAndGet >= size) {
                int i8 = iIncrementAndGet % size;
                atomicIntegerFieldUpdater.compareAndSet(this, iIncrementAndGet, i8);
                iIncrementAndGet = i8;
            }
            return (AbstractC5714a0.h) this.f3544a.get(iIncrementAndGet);
        }

        @Override // O6.h.e
        public boolean isEquivalentTo(e eVar) {
            if (!(eVar instanceof c)) {
                return false;
            }
            c cVar = (c) eVar;
            return cVar == this || (this.f3544a.size() == cVar.f3544a.size() && new HashSet(this.f3544a).containsAll(cVar.f3544a));
        }

        @Override // io.grpc.AbstractC5714a0.i
        public AbstractC5714a0.e pickSubchannel(AbstractC5714a0.f fVar) {
            return AbstractC5714a0.e.withSubchannel(a());
        }

        public String toString() {
            return p.toStringHelper((Class<?>) c.class).add(Constants.TYPE_LIST, this.f3544a).toString();
        }
    }

    static final class d {

        /* renamed from: a */
        Object f3546a;

        d(Object obj) {
            this.f3546a = obj;
        }
    }

    public static abstract class e extends AbstractC5714a0.i {
        public abstract boolean isEquivalentTo(e eVar);
    }

    public h(AbstractC5714a0.d dVar) {
        this.f3535b = (AbstractC5714a0.d) w.checkNotNull(dVar, "helper");
    }

    private static List c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AbstractC5714a0.h hVar = (AbstractC5714a0.h) it.next();
            if (f(hVar)) {
                arrayList.add(hVar);
            }
        }
        return arrayList;
    }

    private static d d(AbstractC5714a0.h hVar) {
        return (d) w.checkNotNull((d) hVar.getAttributes().get(f3533g), "STATE_INFO");
    }

    static boolean f(AbstractC5714a0.h hVar) {
        return ((C5803u) d(hVar).f3546a).getState() == EnumC5802t.READY;
    }

    public void g(AbstractC5714a0.h hVar, C5803u c5803u) {
        if (this.f3536c.get(j(hVar.getAddresses())) != hVar) {
            return;
        }
        EnumC5802t state = c5803u.getState();
        EnumC5802t enumC5802t = EnumC5802t.TRANSIENT_FAILURE;
        if (state == enumC5802t || c5803u.getState() == EnumC5802t.IDLE) {
            this.f3535b.refreshNameResolution();
        }
        EnumC5802t state2 = c5803u.getState();
        EnumC5802t enumC5802t2 = EnumC5802t.IDLE;
        if (state2 == enumC5802t2) {
            hVar.requestConnection();
        }
        d dVarD = d(hVar);
        if (((C5803u) dVarD.f3546a).getState().equals(enumC5802t) && (c5803u.getState().equals(EnumC5802t.CONNECTING) || c5803u.getState().equals(enumC5802t2))) {
            return;
        }
        dVarD.f3546a = c5803u;
        l();
    }

    private static Set h(Set set, Set set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    private void i(AbstractC5714a0.h hVar) {
        hVar.shutdown();
        d(hVar).f3546a = C5803u.forNonError(EnumC5802t.SHUTDOWN);
    }

    private static C j(C c9) {
        return new C(c9.getAddresses());
    }

    private static Map k(List list) {
        HashMap map = new HashMap(list.size() * 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C c9 = (C) it.next();
            map.put(j(c9), c9);
        }
        return map;
    }

    private void l() {
        List listC = c(e());
        if (!listC.isEmpty()) {
            m(EnumC5802t.READY, b(listC));
            return;
        }
        J0 status = f3534h;
        Iterator it = e().iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            C5803u c5803u = (C5803u) d((AbstractC5714a0.h) it.next()).f3546a;
            if (c5803u.getState() == EnumC5802t.CONNECTING || c5803u.getState() == EnumC5802t.IDLE) {
                z8 = true;
            }
            if (status == f3534h || !status.isOk()) {
                status = c5803u.getStatus();
            }
        }
        m(z8 ? EnumC5802t.CONNECTING : EnumC5802t.TRANSIENT_FAILURE, new b(status));
    }

    private void m(EnumC5802t enumC5802t, e eVar) {
        if (enumC5802t == this.f3538e && eVar.isEquivalentTo(this.f3539f)) {
            return;
        }
        this.f3535b.updateBalancingState(enumC5802t, eVar);
        this.f3538e = enumC5802t;
        this.f3539f = eVar;
    }

    @Override // io.grpc.AbstractC5714a0
    public boolean acceptResolvedAddresses(AbstractC5714a0.g gVar) {
        if (gVar.getAddresses().isEmpty()) {
            handleNameResolutionError(J0.UNAVAILABLE.withDescription("NameResolver returned no usable address. addrs=" + gVar.getAddresses() + ", attrs=" + gVar.getAttributes()));
            return false;
        }
        List<C> addresses = gVar.getAddresses();
        Set setKeySet = this.f3536c.keySet();
        Map mapK = k(addresses);
        Set setH = h(setKeySet, mapK.keySet());
        for (Map.Entry entry : mapK.entrySet()) {
            C c9 = (C) entry.getKey();
            C c10 = (C) entry.getValue();
            AbstractC5714a0.h hVar = (AbstractC5714a0.h) this.f3536c.get(c9);
            if (hVar != null) {
                hVar.updateAddresses(Collections.singletonList(c10));
            } else {
                AbstractC5714a0.h hVar2 = (AbstractC5714a0.h) w.checkNotNull(this.f3535b.createSubchannel(AbstractC5714a0.b.newBuilder().setAddresses(c10).setAttributes(C5713a.newBuilder().set(f3533g, new d(C5803u.forNonError(EnumC5802t.IDLE))).build()).build()), "subchannel");
                hVar2.start(new a(hVar2));
                this.f3536c.put(c9, hVar2);
                hVar2.requestConnection();
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = setH.iterator();
        while (it.hasNext()) {
            arrayList.add((AbstractC5714a0.h) this.f3536c.remove((C) it.next()));
        }
        l();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            i((AbstractC5714a0.h) it2.next());
        }
        return true;
    }

    protected e b(List list) {
        return new c(list, this.f3537d.nextInt(list.size()));
    }

    protected Collection e() {
        return this.f3536c.values();
    }

    @Override // io.grpc.AbstractC5714a0
    public void handleNameResolutionError(J0 j02) {
        if (this.f3538e != EnumC5802t.READY) {
            m(EnumC5802t.TRANSIENT_FAILURE, new b(j02));
        }
    }

    @Override // io.grpc.AbstractC5714a0
    public void shutdown() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            i((AbstractC5714a0.h) it.next());
        }
        this.f3536c.clear();
    }
}
