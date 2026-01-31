package Y0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class e {
    public static final e COMPOSITION = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    private final List f5577a;

    /* renamed from: b, reason: collision with root package name */
    private f f5578b;

    public e(String... strArr) {
        this.f5577a = Arrays.asList(strArr);
    }

    private boolean a() {
        return ((String) this.f5577a.get(r0.size() - 1)).equals("**");
    }

    private boolean b(String str) {
        return "__container".equals(str);
    }

    public e addKey(String str) {
        e eVar = new e(this);
        eVar.f5577a.add(str);
        return eVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f5577a.equals(eVar.f5577a)) {
            return false;
        }
        f fVar = this.f5578b;
        f fVar2 = eVar.f5578b;
        return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
    }

    public boolean fullyResolvesTo(String str, int i8) {
        if (i8 >= this.f5577a.size()) {
            return false;
        }
        boolean z8 = i8 == this.f5577a.size() - 1;
        String str2 = (String) this.f5577a.get(i8);
        if (!str2.equals("**")) {
            return (z8 || (i8 == this.f5577a.size() + (-2) && a())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z8 && ((String) this.f5577a.get(i8 + 1)).equals(str)) {
            return i8 == this.f5577a.size() + (-2) || (i8 == this.f5577a.size() + (-3) && a());
        }
        if (z8) {
            return true;
        }
        int i9 = i8 + 1;
        if (i9 < this.f5577a.size() - 1) {
            return false;
        }
        return ((String) this.f5577a.get(i9)).equals(str);
    }

    public f getResolvedElement() {
        return this.f5578b;
    }

    public int hashCode() {
        int iHashCode = this.f5577a.hashCode() * 31;
        f fVar = this.f5578b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public int incrementDepthBy(String str, int i8) {
        if (b(str)) {
            return 0;
        }
        if (((String) this.f5577a.get(i8)).equals("**")) {
            return (i8 != this.f5577a.size() - 1 && ((String) this.f5577a.get(i8 + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public String keysToString() {
        return this.f5577a.toString();
    }

    public boolean matches(String str, int i8) {
        if (b(str)) {
            return true;
        }
        if (i8 >= this.f5577a.size()) {
            return false;
        }
        return ((String) this.f5577a.get(i8)).equals(str) || ((String) this.f5577a.get(i8)).equals("**") || ((String) this.f5577a.get(i8)).equals("*");
    }

    public boolean propagateToChildren(String str, int i8) {
        return "__container".equals(str) || i8 < this.f5577a.size() - 1 || ((String) this.f5577a.get(i8)).equals("**");
    }

    public e resolve(f fVar) {
        e eVar = new e(this);
        eVar.f5578b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("KeyPath{keys=");
        sb.append(this.f5577a);
        sb.append(",resolved=");
        sb.append(this.f5578b != null);
        sb.append('}');
        return sb.toString();
    }

    private e(e eVar) {
        this.f5577a = new ArrayList(eVar.f5577a);
        this.f5578b = eVar.f5578b;
    }
}
