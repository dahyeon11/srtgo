package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1949Ub extends AbstractCallableC4657vc {

    /* renamed from: j, reason: collision with root package name */
    private static final C4771wc f16691j = new C4771wc();

    /* renamed from: i, reason: collision with root package name */
    private final Context f16692i;

    public C1949Ub(C1294Eb c1294Eb, String str, String str2, C3357k9 c3357k9, int i8, int i9, Context context, C2327b9 c2327b9) {
        super(c1294Eb, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", c3357k9, i8, 27);
        this.f16692i = context;
    }

    private final String c() throws ExecutionException, InterruptedException {
        try {
            if (this.f23262b.zzl() != null) {
                this.f23262b.zzl().get();
            }
            O9 o9Zzc = this.f23262b.zzc();
            if (o9Zzc == null || !o9Zzc.zzar()) {
                return null;
            }
            return o9Zzc.zzi();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC4657vc
    protected final void a() {
        EnumC2900g9 enumC2900g9;
        C3628ma c3628ma;
        AtomicReference atomicReferenceZza = f16691j.zza(this.f16692i.getPackageName());
        synchronized (atomicReferenceZza) {
            try {
                C3628ma c3628ma2 = (C3628ma) atomicReferenceZza.get();
                if (c3628ma2 == null || AbstractC1417Hb.zzd(c3628ma2.zza) || c3628ma2.zza.equals("E") || c3628ma2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (AbstractC1417Hb.zzd(null)) {
                        AbstractC1417Hb.zzd(null);
                        enumC2900g9 = EnumC2900g9.ENUM_SIGNAL_SOURCE_ADSHIELD;
                    } else {
                        enumC2900g9 = EnumC2900g9.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED;
                    }
                    Boolean boolValueOf = Boolean.valueOf(enumC2900g9 == EnumC2900g9.ENUM_SIGNAL_SOURCE_ADSHIELD);
                    Boolean bool = (Boolean) H1.C.zzc().zza(AbstractC4439th.zzcu);
                    String strB = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzct)).booleanValue() ? b() : null;
                    if (bool.booleanValue() && this.f23262b.zzp() && AbstractC1417Hb.zzd(strB)) {
                        strB = c();
                    }
                    C3628ma c3628ma3 = new C3628ma((String) this.f23266f.invoke(null, this.f16692i, boolValueOf, strB));
                    if (AbstractC1417Hb.zzd(c3628ma3.zza) || c3628ma3.zza.equals("E")) {
                        int iOrdinal = enumC2900g9.ordinal();
                        if (iOrdinal == 3) {
                            String strC = c();
                            if (!AbstractC1417Hb.zzd(strC)) {
                                c3628ma3.zza = strC;
                            }
                        } else if (iOrdinal == 4) {
                            throw null;
                        }
                    }
                    atomicReferenceZza.set(c3628ma3);
                }
                c3628ma = (C3628ma) atomicReferenceZza.get();
            } finally {
            }
        }
        synchronized (this.f23265e) {
            if (c3628ma != null) {
                try {
                    this.f23265e.zzz(c3628ma.zza);
                    this.f23265e.zzae(c3628ma.zzb);
                    this.f23265e.zzag(c3628ma.zzc);
                    this.f23265e.zzj(c3628ma.zzd);
                    this.f23265e.zzy(c3628ma.zze);
                } finally {
                }
            }
        }
    }

    protected final String b() throws PackageManager.NameNotFoundException, CertificateException {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrZzf = AbstractC1417Hb.zzf((String) H1.C.zzc().zza(AbstractC4439th.zzcv));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrZzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(AbstractC1417Hb.zzf((String) H1.C.zzc().zza(AbstractC4439th.zzcw)))));
            }
            Context context = this.f16692i;
            String packageName = context.getPackageName();
            this.f23262b.zzk();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final C2514co0 c2514co0Zze = C2514co0.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.Ac
                public final void onChecksumsReady(List list) {
                    C2514co0 c2514co0 = c2514co0Zze;
                    if (list == null) {
                        c2514co0.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            ApkChecksum apkChecksumA = AbstractC4885xc.a(list.get(i8));
                            if (apkChecksumA.getType() == 8) {
                                c2514co0.zzc(AbstractC1417Hb.zzb(apkChecksumA.getValue()));
                                return;
                            }
                        }
                        c2514co0.zzc(null);
                    } catch (Throwable unused) {
                        c2514co0.zzc(null);
                    }
                }
            });
            return (String) c2514co0Zze.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
