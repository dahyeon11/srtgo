package androidx.coordinatorlayout.widget;

import O.h;
import Z.e;
import Z.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final e f8669a = new f(10);

    /* renamed from: b, reason: collision with root package name */
    private final h f8670b = new h();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f8671c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f8672d = new HashSet();

    private void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f8670b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i8 = 0; i8 < size; i8++) {
                a(arrayList2.get(i8), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList b() {
        ArrayList arrayList = (ArrayList) this.f8669a.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void c(ArrayList arrayList) {
        arrayList.clear();
        this.f8669a.release(arrayList);
    }

    public void addEdge(Object obj, Object obj2) {
        if (!this.f8670b.containsKey(obj) || !this.f8670b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListB = (ArrayList) this.f8670b.get(obj);
        if (arrayListB == null) {
            arrayListB = b();
            this.f8670b.put(obj, arrayListB);
        }
        arrayListB.add(obj2);
    }

    public void addNode(Object obj) {
        if (this.f8670b.containsKey(obj)) {
            return;
        }
        this.f8670b.put(obj, null);
    }

    public void clear() {
        int size = this.f8670b.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList = (ArrayList) this.f8670b.valueAt(i8);
            if (arrayList != null) {
                c(arrayList);
            }
        }
        this.f8670b.clear();
    }

    public boolean contains(Object obj) {
        return this.f8670b.containsKey(obj);
    }

    public List getIncomingEdges(Object obj) {
        return (List) this.f8670b.get(obj);
    }

    public List<Object> getOutgoingEdges(Object obj) {
        int size = this.f8670b.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList2 = (ArrayList) this.f8670b.valueAt(i8);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f8670b.keyAt(i8));
            }
        }
        return arrayList;
    }

    public ArrayList<Object> getSortedList() {
        this.f8671c.clear();
        this.f8672d.clear();
        int size = this.f8670b.size();
        for (int i8 = 0; i8 < size; i8++) {
            a(this.f8670b.keyAt(i8), this.f8671c, this.f8672d);
        }
        return this.f8671c;
    }

    public boolean hasOutgoingEdges(Object obj) {
        int size = this.f8670b.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList arrayList = (ArrayList) this.f8670b.valueAt(i8);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
