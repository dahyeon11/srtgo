package z2;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e extends AbstractC6619b {
    public e() {
        super(4);
    }

    public final e zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final e zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    e(int i8) {
        super(4);
    }
}
