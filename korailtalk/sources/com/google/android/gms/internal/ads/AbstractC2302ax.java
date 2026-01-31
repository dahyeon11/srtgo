package com.google.android.gms.internal.ads;

import K1.AbstractC0665u0;
import K1.C0644j0;
import R1.BinderC0733l;
import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.ax */
/* loaded from: classes2.dex */
public abstract class AbstractC2302ax implements InterfaceC1946Tz {

    /* renamed from: a */
    private static AbstractC2302ax f18058a;

    private static synchronized AbstractC2302ax a(Context context, InterfaceC1850Rn interfaceC1850Rn, int i8, boolean z8, int i9, C1412Gx c1412Gx) {
        try {
            AbstractC2302ax abstractC2302ax = f18058a;
            if (abstractC2302ax != null) {
                return abstractC2302ax;
            }
            long jCurrentTimeMillis = G1.u.zzB().currentTimeMillis();
            AbstractC4439th.zza(context);
            if (((Boolean) AbstractC3189ii.zze.zze()).booleanValue()) {
                AbstractC2499ch.zzd(context);
            }
            C3859ob0 c3859ob0Zzd = C3859ob0.zzd(context);
            L1.a aVarZzc = c3859ob0Zzd.zzc(241806000, false, i9);
            c3859ob0Zzd.zzf(interfaceC1850Rn);
            C4815wy c4815wy = new C4815wy(null);
            C2417bx c2417bx = new C2417bx();
            c2417bx.zzf(aVarZzc);
            c2417bx.zze(context);
            c2417bx.zzd(jCurrentTimeMillis);
            c4815wy.zzb(new C2645dx(c2417bx, null));
            c4815wy.zzc(new C3564lz(c1412Gx));
            AbstractC2302ax abstractC2302axZza = c4815wy.zza();
            G1.u.zzo().zzu(context, aVarZzc);
            G1.u.zzc().zzi(context);
            G1.u.zzp().zzl(context);
            G1.u.zzp().zzk(context);
            AbstractC0665u0.zza(context);
            G1.u.zzb().zzd(context);
            G1.u.zzv().zzb(context);
            abstractC2302axZza.zza().zzc();
            AbstractC1448Hs.zzd(context);
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzgs)).booleanValue()) {
                if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaw)).booleanValue()) {
                    new C3055hW(context, aVarZzc, new C4775we(new C1300Ee(context)), new LV(new HV(context), abstractC2302axZza.zzA())).zzb(G1.u.zzo().zzi().zzS());
                }
            }
            f18058a = abstractC2302axZza;
            return abstractC2302axZza;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static AbstractC2302ax zzb(Context context, InterfaceC1850Rn interfaceC1850Rn, int i8) {
        return a(context, interfaceC1850Rn, 241806000, false, i8, new C1412Gx());
    }

    protected abstract AbstractC3694n60 b(C4493u70 c4493u70);

    public abstract InterfaceExecutorServiceC1974Un0 zzA();

    public abstract Executor zzB();

    public abstract ScheduledExecutorService zzC();

    public abstract C0644j0 zza();

    public abstract BinderC4703vz zzc();

    public abstract InterfaceC4956yB zzd();

    public abstract InterfaceC3705nC zze();

    public abstract SG zzf();

    public abstract DK zzg();

    public abstract InterfaceC2236aL zzh();

    public abstract QO zzi();

    public abstract LQ zzj();

    public abstract InterfaceC4644vR zzk();

    public abstract C3734nS zzl();

    public abstract KS zzm();

    public abstract GW zzn();

    public abstract R1.Q zzo();

    public abstract R1.X zzp();

    public abstract BinderC0733l zzq();

    @Override // com.google.android.gms.internal.ads.InterfaceC1946Tz
    public final AbstractC3694n60 zzr(C2519cr c2519cr, int i8) {
        return b(new C4493u70(c2519cr, i8));
    }

    public abstract Q70 zzt();

    public abstract G80 zzu();

    public abstract InterfaceC4953y90 zzv();

    public abstract InterfaceC3857oa0 zzw();

    public abstract C3062hb0 zzx();

    public abstract C4200rb0 zzy();

    public abstract RunnableC5002yd0 zzz();
}
