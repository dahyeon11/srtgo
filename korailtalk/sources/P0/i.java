package P0;

/* loaded from: classes.dex */
public class i {
    public final int systemId;
    public final String workSpecId;

    public i(String str, int i8) {
        this.workSpecId = str;
        this.systemId = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.systemId != iVar.systemId) {
            return false;
        }
        return this.workSpecId.equals(iVar.workSpecId);
    }

    public int hashCode() {
        return (this.workSpecId.hashCode() * 31) + this.systemId;
    }
}
