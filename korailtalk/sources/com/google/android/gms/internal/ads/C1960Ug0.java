package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Ug0 */
/* loaded from: classes2.dex */
public final class C1960Ug0 {

    /* renamed from: f */
    private static final Object f16697f = new Object();

    /* renamed from: a */
    private final Context f16698a;

    /* renamed from: b */
    private final SharedPreferences f16699b;

    /* renamed from: c */
    private final String f16700c;

    /* renamed from: d */
    private final InterfaceC1141Ag0 f16701d;

    /* renamed from: e */
    private boolean f16702e;

    public C1960Ug0(Context context, EnumC1214Cc enumC1214Cc, InterfaceC1141Ag0 interfaceC1141Ag0, boolean z8) {
        this.f16702e = false;
        this.f16698a = context;
        this.f16700c = Integer.toString(enumC1214Cc.zza());
        this.f16699b = context.getSharedPreferences("pcvmspf", 0);
        this.f16701d = interfaceC1141Ag0;
        this.f16702e = z8;
    }

    private final File a(String str) {
        return new File(new File(this.f16698a.getDir("pccache", 0), this.f16700c), str);
    }

    private static String b(C1337Fc c1337Fc) {
        C1501Jc c1501JcZze = C1542Kc.zze();
        c1501JcZze.zze(c1337Fc.zzd().zzk());
        c1501JcZze.zza(c1337Fc.zzd().zzj());
        c1501JcZze.zzb(c1337Fc.zzd().zza());
        c1501JcZze.zzd(c1337Fc.zzd().zzd());
        c1501JcZze.zzc(c1337Fc.zzd().zzc());
        return o2.k.bytesToStringLowercase(((C1542Kc) c1501JcZze.zzbr()).zzaV());
    }

    private final String c() {
        return "FBAMTD".concat(String.valueOf(this.f16700c));
    }

    private final String d() {
        return "LATMTD".concat(String.valueOf(this.f16700c));
    }

    private final void e(int i8, long j8) {
        this.f16701d.zza(i8, j8);
    }

    private final void f(int i8, long j8, String str) {
        this.f16701d.zzb(i8, j8, str);
    }

    private final C1542Kc g(int i8) {
        String string = i8 == 1 ? this.f16699b.getString(d(), null) : this.f16699b.getString(c(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = o2.k.stringToBytes(string);
            AbstractC3677my0 abstractC3677my0 = AbstractC3677my0.zzb;
            return C1542Kc.zzi(AbstractC3677my0.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.f16702e ? Iy0.zza() : Iy0.zzb());
        } catch (C4021pz0 unused) {
            return null;
        } catch (NullPointerException unused2) {
            e(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            e(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(C1337Fc c1337Fc) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f16697f) {
            try {
                if (!AbstractC1673Ng0.zze(new File(a(c1337Fc.zzd().zzk()), "pcbc"), c1337Fc.zze().zzB())) {
                    e(4020, jCurrentTimeMillis);
                    return false;
                }
                String strB = b(c1337Fc);
                SharedPreferences.Editor editorEdit = this.f16699b.edit();
                editorEdit.putString(d(), strB);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    e(5015, jCurrentTimeMillis);
                } else {
                    e(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(C1337Fc c1337Fc, InterfaceC1919Tg0 interfaceC1919Tg0) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f16697f) {
            try {
                C1542Kc c1542KcG = g(1);
                String strZzk = c1337Fc.zzd().zzk();
                if (c1542KcG != null && c1542KcG.zzk().equals(strZzk)) {
                    e(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileA = a(strZzk);
                if (fileA.exists()) {
                    f(4023, jCurrentTimeMillis2, "d:" + (true != fileA.isDirectory() ? "0" : "1") + ",f:" + (true != fileA.isFile() ? "0" : "1"));
                    e(4015, jCurrentTimeMillis2);
                } else if (!fileA.mkdirs()) {
                    f(4024, jCurrentTimeMillis2, "cw:".concat(true != fileA.canWrite() ? "0" : "1"));
                    e(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileA2 = a(strZzk);
                File file = new File(fileA2, "pcam.jar");
                File file2 = new File(fileA2, "pcbc");
                if (!AbstractC1673Ng0.zze(file, c1337Fc.zzf().zzB())) {
                    e(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!AbstractC1673Ng0.zze(file2, c1337Fc.zze().zzB())) {
                    e(4017, jCurrentTimeMillis);
                    return false;
                }
                if (interfaceC1919Tg0 != null && !interfaceC1919Tg0.zza(file)) {
                    e(4018, jCurrentTimeMillis);
                    AbstractC1673Ng0.zzd(fileA2);
                    return false;
                }
                String strB = b(c1337Fc);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                String string = this.f16699b.getString(d(), null);
                SharedPreferences.Editor editorEdit = this.f16699b.edit();
                editorEdit.putString(d(), strB);
                if (string != null) {
                    editorEdit.putString(c(), string);
                }
                if (!editorEdit.commit()) {
                    e(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                C1542Kc c1542KcG2 = g(1);
                if (c1542KcG2 != null) {
                    hashSet.add(c1542KcG2.zzk());
                }
                C1542Kc c1542KcG3 = g(2);
                if (c1542KcG3 != null) {
                    hashSet.add(c1542KcG3.zzk());
                }
                for (File file3 : new File(this.f16698a.getDir("pccache", 0), this.f16700c).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        AbstractC1673Ng0.zzd(file3);
                    }
                }
                e(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1592Lg0 zzc(int i8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f16697f) {
            try {
                C1542Kc c1542KcG = g(1);
                if (c1542KcG == null) {
                    e(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileA = a(c1542KcG.zzk());
                File file = new File(fileA, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileA, "pcam");
                }
                File file2 = new File(fileA, "pcbc");
                File file3 = new File(fileA, "pcopt");
                e(5016, jCurrentTimeMillis);
                return new C1592Lg0(c1542KcG, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i8) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (f16697f) {
            try {
                C1542Kc c1542KcG = g(1);
                if (c1542KcG == null) {
                    e(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileA = a(c1542KcG.zzk());
                if (!new File(fileA, "pcam.jar").exists()) {
                    e(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileA, "pcbc").exists()) {
                    e(5019, jCurrentTimeMillis);
                    return true;
                }
                e(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
