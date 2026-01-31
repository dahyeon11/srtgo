package K1;

import i2.AbstractC5681n;

/* loaded from: classes.dex */
public final class G {
    public final String zza;
    public final double zzb;
    public final double zzc;
    public final double zzd;
    public final int zze;

    public G(String str, double d9, double d10, double d11, int i8) {
        this.zza = str;
        this.zzc = d9;
        this.zzb = d10;
        this.zzd = d11;
        this.zze = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        return AbstractC5681n.equal(this.zza, g8.zza) && this.zzb == g8.zzb && this.zzc == g8.zzc && this.zze == g8.zze && Double.compare(this.zzd, g8.zzd) == 0;
    }

    public final int hashCode() {
        return AbstractC5681n.hashCode(this.zza, Double.valueOf(this.zzb), Double.valueOf(this.zzc), Double.valueOf(this.zzd), Integer.valueOf(this.zze));
    }

    public final String toString() {
        return AbstractC5681n.toStringHelper(this).add("name", this.zza).add("minBound", Double.valueOf(this.zzc)).add("maxBound", Double.valueOf(this.zzb)).add("percent", Double.valueOf(this.zzd)).add("count", Integer.valueOf(this.zze)).toString();
    }
}
