package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.ads.Vl */
/* loaded from: classes2.dex */
public final class C2010Vl implements R7 {

    /* renamed from: a */
    private volatile C1437Hl f16892a;

    /* renamed from: b */
    private final Context f16893b;

    public C2010Vl(Context context) {
        this.f16893b = context;
    }

    static /* bridge */ /* synthetic */ void b(C2010Vl c2010Vl) {
        if (c2010Vl.f16892a == null) {
            return;
        }
        c2010Vl.f16892a.disconnect();
        Binder.flushPendingCommands();
    }

    @Override // com.google.android.gms.internal.ads.R7
    public final V7 zza(Z7 z72) throws C2898g8 {
        Parcelable.Creator<C1519Jl> creator = C1519Jl.CREATOR;
        Map mapZzl = z72.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i8 = 0;
        int i9 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i9] = (String) entry.getKey();
            strArr2[i9] = (String) entry.getValue();
            i9++;
        }
        C1519Jl c1519Jl = new C1519Jl(z72.zzk(), strArr, strArr2);
        long jElapsedRealtime = G1.u.zzB().elapsedRealtime();
        try {
            C1203Bt c1203Bt = new C1203Bt();
            this.f16892a = new C1437Hl(this.f16893b, G1.u.zzt().zzb(), new C1928Tl(this, c1203Bt), new C1969Ul(this, c1203Bt));
            this.f16892a.checkAvailabilityAndConnect();
            C1846Rl c1846Rl = new C1846Rl(this, c1519Jl);
            InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0 = AbstractC4805wt.zza;
            com.google.common.util.concurrent.C cZzo = AbstractC1483In0.zzo(AbstractC1483In0.zzn(c1203Bt, c1846Rl, interfaceExecutorServiceC1974Un0), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzey)).intValue(), TimeUnit.MILLISECONDS, AbstractC4805wt.zzd);
            cZzo.addListener(new RunnableC1887Sl(this), interfaceExecutorServiceC1974Un0);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) cZzo.get();
            AbstractC0667v0.zza("Http assets remote cache took " + (G1.u.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            C1601Ll c1601Ll = (C1601Ll) new C2290ar(parcelFileDescriptor).zza(C1601Ll.CREATOR);
            if (c1601Ll == null) {
                return null;
            }
            if (c1601Ll.zza) {
                throw new C2898g8(c1601Ll.zzb);
            }
            if (c1601Ll.zze.length != c1601Ll.zzf.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = c1601Ll.zze;
                if (i8 >= strArr3.length) {
                    return new V7(c1601Ll.zzc, c1601Ll.zzd, map, c1601Ll.zzg, c1601Ll.zzh);
                }
                map.put(strArr3[i8], c1601Ll.zzf[i8]);
                i8++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            AbstractC0667v0.zza("Http assets remote cache took " + (G1.u.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            AbstractC0667v0.zza("Http assets remote cache took " + (G1.u.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
