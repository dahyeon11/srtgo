package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.oA0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3816oA0 extends AbstractC4955yA0 {
    C3816oA0(int i8) {
        super(i8, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4955yA0
    public final void zza() {
        if (!zzj()) {
            for (int i8 = 0; i8 < zzb(); i8++) {
                Map.Entry entryZzg = zzg(i8);
                if (((Ny0) entryZzg.getKey()).zzg()) {
                    entryZzg.setValue(Collections.unmodifiableList((List) entryZzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((Ny0) entry.getKey()).zzg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
