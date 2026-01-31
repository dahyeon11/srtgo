package E3;

import E3.c;
import com.google.protobuf.C5269x;
import com.google.protobuf.H0;
import com.google.protobuf.T;
import e3.C5352B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: b */
    private static final Logger f966b = Logger.getLogger(b.class.getName());

    /* renamed from: a */
    private final C0021b f967a = new C0021b();

    b() {
    }

    private static void b(C0021b c0021b, String str, List list) {
        if (c0021b.f968a.isEmpty()) {
            list.add(str);
            return;
        }
        for (Map.Entry entry : c0021b.f968a.entrySet()) {
            b((C0021b) entry.getValue(), str.isEmpty() ? (String) entry.getKey() : str + "." + ((String) entry.getKey()), list);
        }
    }

    private static void d(C0021b c0021b, H0 h02, H0.a aVar, c.a aVar2) {
        if (h02.getDescriptorForType() != aVar.getDescriptorForType()) {
            throw new IllegalArgumentException(String.format("source (%s) and destination (%s) descriptor must be equal", h02.getDescriptorForType().getFullName(), aVar.getDescriptorForType().getFullName()));
        }
        C5269x.b descriptorForType = h02.getDescriptorForType();
        for (Map.Entry entry : c0021b.f968a.entrySet()) {
            C5269x.g gVarFindFieldByName = descriptorForType.findFieldByName((String) entry.getKey());
            if (gVarFindFieldByName == null) {
                f966b.warning("Cannot find field \"" + ((String) entry.getKey()) + "\" in message type " + descriptorForType.getFullName());
            } else if (((C0021b) entry.getValue()).f968a.isEmpty()) {
                if (gVarFindFieldByName.isRepeated()) {
                    if (aVar2.replaceRepeatedFields()) {
                        aVar.setField(gVarFindFieldByName, h02.getField(gVarFindFieldByName));
                    } else {
                        Iterator it = ((List) h02.getField(gVarFindFieldByName)).iterator();
                        while (it.hasNext()) {
                            aVar.addRepeatedField(gVarFindFieldByName, it.next());
                        }
                    }
                } else if (gVarFindFieldByName.getJavaType() == C5269x.g.b.MESSAGE) {
                    if (aVar2.replaceMessageFields()) {
                        if (h02.hasField(gVarFindFieldByName)) {
                            aVar.setField(gVarFindFieldByName, h02.getField(gVarFindFieldByName));
                        } else {
                            aVar.clearField(gVarFindFieldByName);
                        }
                    } else if (h02.hasField(gVarFindFieldByName)) {
                        aVar.setField(gVarFindFieldByName, ((H0) aVar.getField(gVarFindFieldByName)).toBuilder().mergeFrom((H0) h02.getField(gVarFindFieldByName)).build());
                    }
                } else if (h02.hasField(gVarFindFieldByName) || !aVar2.replacePrimitiveFields()) {
                    aVar.setField(gVarFindFieldByName, h02.getField(gVarFindFieldByName));
                } else {
                    aVar.clearField(gVarFindFieldByName);
                }
            } else if (gVarFindFieldByName.isRepeated() || gVarFindFieldByName.getJavaType() != C5269x.g.b.MESSAGE) {
                f966b.warning("Field \"" + gVarFindFieldByName.getFullName() + "\" is not a singular message field and cannot have sub-fields.");
            } else if (h02.hasField(gVarFindFieldByName) || aVar.hasField(gVarFindFieldByName)) {
                H0.a builder = ((H0) aVar.getField(gVarFindFieldByName)).toBuilder();
                d((C0021b) entry.getValue(), (H0) h02.getField(gVarFindFieldByName), builder, aVar2);
                aVar.setField(gVarFindFieldByName, builder.buildPartial());
            }
        }
    }

    private static boolean h(C0021b c0021b, List list, int i8) {
        String str = (String) list.get(i8);
        if (!c0021b.f968a.containsKey(str)) {
            return false;
        }
        if (i8 == list.size() - 1) {
            c0021b.f968a.remove(str);
            return c0021b.f968a.isEmpty();
        }
        if (h((C0021b) c0021b.f968a.get(str), list, i8 + 1)) {
            c0021b.f968a.remove(str);
        }
        return c0021b.f968a.isEmpty();
    }

    b a(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return this;
        }
        C0021b c0021b = this.f967a;
        boolean z8 = false;
        for (String str2 : strArrSplit) {
            if (!z8 && c0021b != this.f967a && c0021b.f968a.isEmpty()) {
                return this;
            }
            if (c0021b.f968a.containsKey(str2)) {
                c0021b = (C0021b) c0021b.f968a.get(str2);
            } else {
                C0021b c0021b2 = new C0021b();
                c0021b.f968a.put(str2, c0021b2);
                z8 = true;
                c0021b = c0021b2;
            }
        }
        c0021b.f968a.clear();
        return this;
    }

    void c(String str, b bVar) {
        if (this.f967a.f968a.isEmpty()) {
            return;
        }
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 0) {
            return;
        }
        C0021b c0021b = this.f967a;
        for (String str2 : strArrSplit) {
            if (c0021b != this.f967a && c0021b.f968a.isEmpty()) {
                bVar.a(str);
                return;
            } else {
                if (!c0021b.f968a.containsKey(str2)) {
                    return;
                }
                c0021b = (C0021b) c0021b.f968a.get(str2);
            }
        }
        ArrayList arrayList = new ArrayList();
        b(c0021b, str, arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bVar.a((String) it.next());
        }
    }

    void e(H0 h02, H0.a aVar, c.a aVar2) {
        if (h02.getDescriptorForType() != aVar.getDescriptorForType()) {
            throw new IllegalArgumentException("Cannot merge messages of different types.");
        }
        if (this.f967a.f968a.isEmpty()) {
            return;
        }
        d(this.f967a, h02, aVar, aVar2);
    }

    b f(T t8) {
        Iterator it = t8.getPathsList().iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
        return this;
    }

    b g(String str) {
        List<String> listSplitToList = C5352B.onPattern("\\.").splitToList(str);
        if (listSplitToList.isEmpty()) {
            return this;
        }
        h(this.f967a, listSplitToList, 0);
        return this;
    }

    b i(T t8) {
        Iterator it = t8.getPathsList().iterator();
        while (it.hasNext()) {
            g((String) it.next());
        }
        return this;
    }

    T j() {
        if (this.f967a.f968a.isEmpty()) {
            return T.getDefaultInstance();
        }
        ArrayList arrayList = new ArrayList();
        b(this.f967a, "", arrayList);
        return T.newBuilder().addAllPaths(arrayList).build();
    }

    public String toString() {
        return c.toString(j());
    }

    /* renamed from: E3.b$b */
    private static final class C0021b {

        /* renamed from: a */
        final SortedMap f968a;

        private C0021b() {
            this.f968a = new TreeMap();
        }

        /* synthetic */ C0021b(a aVar) {
            this();
        }
    }

    b(T t8) {
        f(t8);
    }
}
