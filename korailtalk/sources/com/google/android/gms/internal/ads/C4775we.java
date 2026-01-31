package com.google.android.gms.internal.ads;

import K1.AbstractC0667v0;
import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.we */
/* loaded from: classes2.dex */
public final class C4775we {

    /* renamed from: a */
    private final C1300Ee f23529a;

    /* renamed from: b */
    private final C1713Og f23530b;

    /* renamed from: c */
    private final boolean f23531c;

    private C4775we() {
        this.f23530b = C1754Pg.zzj();
        this.f23531c = false;
        this.f23529a = new C1300Ee();
    }

    private final synchronized String a(EnumC5003ye enumC5003ye) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f23530b.zzah(), Long.valueOf(G1.u.zzB().elapsedRealtime()), Integer.valueOf(enumC5003ye.zza()), Base64.encodeToString(((C1754Pg) this.f23530b.zzbr()).zzaV(), 3));
    }

    private final synchronized void b(EnumC5003ye enumC5003ye) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(AbstractC3529lh0.zza(AbstractC3415kh0.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(a(enumC5003ye).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        AbstractC0667v0.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                AbstractC0667v0.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    AbstractC0667v0.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            AbstractC0667v0.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void c(EnumC5003ye enumC5003ye) {
        C1713Og c1713Og = this.f23530b;
        c1713Og.zzq();
        c1713Og.zzj(K1.K0.zzd());
        C1259De c1259De = new C1259De(this.f23529a, ((C1754Pg) this.f23530b.zzbr()).zzaV(), null);
        c1259De.zza(enumC5003ye.zza());
        c1259De.zzc();
        AbstractC0667v0.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(enumC5003ye.zza(), 10))));
    }

    public static C4775we zza() {
        return new C4775we();
    }

    public final synchronized void zzb(EnumC5003ye enumC5003ye) {
        if (this.f23531c) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeU)).booleanValue()) {
                b(enumC5003ye);
            } else {
                c(enumC5003ye);
            }
        }
    }

    public final synchronized void zzc(InterfaceC4661ve interfaceC4661ve) {
        if (this.f23531c) {
            try {
                interfaceC4661ve.zza(this.f23530b);
            } catch (NullPointerException e8) {
                G1.u.zzo().zzw(e8, "AdMobClearcutLogger.modify");
            }
        }
    }

    public C4775we(C1300Ee c1300Ee) {
        this.f23530b = C1754Pg.zzj();
        this.f23529a = c1300Ee;
        this.f23531c = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeT)).booleanValue();
    }
}
