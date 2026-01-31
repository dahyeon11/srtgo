package P0;

/* loaded from: classes.dex */
public class d {
    public String mKey;
    public Long mValue;

    public d(String str, boolean z8) {
        this(str, z8 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.mKey.equals(dVar.mKey)) {
            return false;
        }
        Long l8 = this.mValue;
        Long l9 = dVar.mValue;
        return l8 != null ? l8.equals(l9) : l9 == null;
    }

    public int hashCode() {
        int iHashCode = this.mKey.hashCode() * 31;
        Long l8 = this.mValue;
        return iHashCode + (l8 != null ? l8.hashCode() : 0);
    }

    public d(String str, long j8) {
        this.mKey = str;
        this.mValue = Long.valueOf(j8);
    }
}
