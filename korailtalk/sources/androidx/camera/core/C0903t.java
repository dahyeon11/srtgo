package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import z.C6585i0;
import z.InterfaceC6553B;

/* renamed from: androidx.camera.core.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0903t {
    public static final int LENS_FACING_BACK = 1;
    public static final int LENS_FACING_FRONT = 0;

    /* renamed from: a, reason: collision with root package name */
    private LinkedHashSet f7851a;
    public static final C0903t DEFAULT_FRONT_CAMERA = new a().requireLensFacing(0).build();
    public static final C0903t DEFAULT_BACK_CAMERA = new a().requireLensFacing(1).build();

    C0903t(LinkedHashSet linkedHashSet) {
        this.f7851a = linkedHashSet;
    }

    public List<r> filter(List<r> list) {
        List<r> arrayList = new ArrayList<>(list);
        Iterator it = this.f7851a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC0898q) it.next()).filter(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet<InterfaceC0898q> getCameraFilterSet() {
        return this.f7851a;
    }

    public Integer getLensFacing() {
        Iterator it = this.f7851a.iterator();
        Integer num = null;
        while (it.hasNext()) {
            InterfaceC0898q interfaceC0898q = (InterfaceC0898q) it.next();
            if (interfaceC0898q instanceof C6585i0) {
                Integer numValueOf = Integer.valueOf(((C6585i0) interfaceC0898q).getLensFacing());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public InterfaceC6553B select(LinkedHashSet<InterfaceC6553B> linkedHashSet) {
        Iterator<InterfaceC6553B> it = filter(linkedHashSet).iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new IllegalArgumentException("No available camera can be found");
    }

    /* renamed from: androidx.camera.core.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final LinkedHashSet f7852a;

        public a() {
            this.f7852a = new LinkedHashSet();
        }

        public static a fromSelector(C0903t c0903t) {
            return new a(c0903t.getCameraFilterSet());
        }

        public a addCameraFilter(InterfaceC0898q interfaceC0898q) {
            this.f7852a.add(interfaceC0898q);
            return this;
        }

        public C0903t build() {
            return new C0903t(this.f7852a);
        }

        public a requireLensFacing(int i8) {
            this.f7852a.add(new C6585i0(i8));
            return this;
        }

        private a(LinkedHashSet linkedHashSet) {
            this.f7852a = new LinkedHashSet(linkedHashSet);
        }
    }

    public LinkedHashSet<InterfaceC6553B> filter(LinkedHashSet<InterfaceC6553B> linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC6553B> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCameraInfo());
        }
        List<r> listFilter = filter(arrayList);
        LinkedHashSet<InterfaceC6553B> linkedHashSet2 = new LinkedHashSet<>();
        Iterator<InterfaceC6553B> it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            InterfaceC6553B next = it2.next();
            if (listFilter.contains(next.getCameraInfo())) {
                linkedHashSet2.add(next);
            }
        }
        return linkedHashSet2;
    }
}
