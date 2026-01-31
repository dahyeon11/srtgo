package I0;

import H0.l;
import H0.n;
import H0.o;
import H0.u;
import H0.y;
import Q0.p;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import com.google.common.util.concurrent.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends u {

    /* renamed from: j */
    private static final String f1917j = l.tagWithPrefix("WorkContinuationImpl");

    /* renamed from: a */
    private final i f1918a;

    /* renamed from: b */
    private final String f1919b;

    /* renamed from: c */
    private final H0.f f1920c;

    /* renamed from: d */
    private final List f1921d;

    /* renamed from: e */
    private final List f1922e;

    /* renamed from: f */
    private final List f1923f;

    /* renamed from: g */
    private final List f1924g;

    /* renamed from: h */
    private boolean f1925h;

    /* renamed from: i */
    private o f1926i;

    public g(i iVar, List<? extends y> list) {
        this(iVar, null, H0.f.KEEP, list, null);
    }

    private static boolean b(g gVar, Set set) {
        set.addAll(gVar.getIds());
        Set<String> setPrerequisitesFor = prerequisitesFor(gVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setPrerequisitesFor.contains((String) it.next())) {
                return true;
            }
        }
        List<g> parents = gVar.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<g> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (b(it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.getIds());
        return false;
    }

    public static Set<String> prerequisitesFor(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> parents = gVar.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<g> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }

    @Override // H0.u
    protected u a(List list) {
        n nVar = (n) new n.a(CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((g) ((u) it.next()));
        }
        return new g(this.f1918a, null, H0.f.KEEP, Collections.singletonList(nVar), arrayList);
    }

    @Override // H0.u
    public o enqueue() {
        if (this.f1925h) {
            l.get().warning(f1917j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f1922e)), new Throwable[0]);
        } else {
            Q0.b bVar = new Q0.b(this);
            this.f1918a.getWorkTaskExecutor().executeOnBackgroundThread(bVar);
            this.f1926i = bVar.getOperation();
        }
        return this.f1926i;
    }

    public List<String> getAllIds() {
        return this.f1923f;
    }

    public H0.f getExistingWorkPolicy() {
        return this.f1920c;
    }

    public List<String> getIds() {
        return this.f1922e;
    }

    public String getName() {
        return this.f1919b;
    }

    public List<g> getParents() {
        return this.f1924g;
    }

    public List<? extends y> getWork() {
        return this.f1921d;
    }

    @Override // H0.u
    public C getWorkInfos() {
        p pVarForStringIds = p.forStringIds(this.f1918a, this.f1923f);
        this.f1918a.getWorkTaskExecutor().executeOnBackgroundThread(pVarForStringIds);
        return pVarForStringIds.getFuture();
    }

    @Override // H0.u
    public LiveData getWorkInfosLiveData() {
        return this.f1918a.a(this.f1923f);
    }

    public i getWorkManagerImpl() {
        return this.f1918a;
    }

    public boolean hasCycles() {
        return b(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.f1925h;
    }

    public void markEnqueued() {
        this.f1925h = true;
    }

    @Override // H0.u
    public u then(List<n> list) {
        return list.isEmpty() ? this : new g(this.f1918a, this.f1919b, H0.f.KEEP, list, Collections.singletonList(this));
    }

    public g(i iVar, String str, H0.f fVar, List<? extends y> list) {
        this(iVar, str, fVar, list, null);
    }

    public g(i iVar, String str, H0.f fVar, List<? extends y> list, List<g> list2) {
        this.f1918a = iVar;
        this.f1919b = str;
        this.f1920c = fVar;
        this.f1921d = list;
        this.f1924g = list2;
        this.f1922e = new ArrayList(list.size());
        this.f1923f = new ArrayList();
        if (list2 != null) {
            Iterator<g> it = list2.iterator();
            while (it.hasNext()) {
                this.f1923f.addAll(it.next().f1923f);
            }
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            String stringId = list.get(i8).getStringId();
            this.f1922e.add(stringId);
            this.f1923f.add(stringId);
        }
    }
}
