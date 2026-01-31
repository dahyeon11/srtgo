package j4;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private Collection f33458a;

    /* renamed from: b, reason: collision with root package name */
    private Map f33459b;

    /* renamed from: c, reason: collision with root package name */
    private String f33460c;

    /* renamed from: d, reason: collision with root package name */
    private int f33461d;

    public j() {
    }

    @Override // j4.g
    public f createDecoder(Map<F3.e, ?> map) {
        EnumMap enumMap = new EnumMap(F3.e.class);
        enumMap.putAll(map);
        Map map2 = this.f33459b;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        Collection collection = this.f33458a;
        if (collection != null) {
            enumMap.put((EnumMap) F3.e.POSSIBLE_FORMATS, (F3.e) collection);
        }
        String str = this.f33460c;
        if (str != null) {
            enumMap.put((EnumMap) F3.e.CHARACTER_SET, (F3.e) str);
        }
        F3.k kVar = new F3.k();
        kVar.setHints(enumMap);
        int i8 = this.f33461d;
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? new f(kVar) : new l(kVar) : new k(kVar) : new f(kVar);
    }

    public j(Collection<F3.a> collection) {
        this.f33458a = collection;
    }

    public j(Collection<F3.a> collection, Map<F3.e, ?> map, String str, int i8) {
        this.f33458a = collection;
        this.f33459b = map;
        this.f33460c = str;
        this.f33461d = i8;
    }
}
