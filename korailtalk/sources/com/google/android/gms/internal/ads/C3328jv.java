package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3328jv extends AbstractC2986gv {

    /* renamed from: f, reason: collision with root package name */
    private static final Set f20332f = Collections.synchronizedSet(new HashSet());

    /* renamed from: g, reason: collision with root package name */
    private static final DecimalFormat f20333g = new DecimalFormat("#,###");
    public static final /* synthetic */ int zzd = 0;

    /* renamed from: d, reason: collision with root package name */
    private File f20334d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20335e;

    public C3328jv(InterfaceC4579uu interfaceC4579uu) {
        super(interfaceC4579uu);
        File cacheDir = this.f19445a.getCacheDir();
        if (cacheDir == null) {
            L1.n.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(AbstractC3529lh0.zza(AbstractC3415kh0.zza(), cacheDir, "admobVideoStreams"));
        this.f20334d = file;
        if (!file.isDirectory() && !this.f20334d.mkdirs()) {
            L1.n.zzj("Could not create preload cache directory at ".concat(String.valueOf(this.f20334d.getAbsolutePath())));
            this.f20334d = null;
        } else {
            if (this.f20334d.setReadable(true, false) && this.f20334d.setExecutable(true, false)) {
                return;
            }
            L1.n.zzj("Could not set cache file permissions at ".concat(String.valueOf(this.f20334d.getAbsolutePath())));
            this.f20334d = null;
        }
    }

    private final File c(File file) {
        return new File(AbstractC3529lh0.zza(AbstractC3415kh0.zza(), this.f20334d, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    public final void zzf() {
        this.f20335e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x035f, code lost:
    
        r26 = r4;
        r24 = r14;
        r21 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0365, code lost:
    
        r26.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x036d, code lost:
    
        if (L1.n.zzm(3) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x036f, code lost:
    
        L1.n.zze("Preloaded " + com.google.android.gms.internal.ads.C3328jv.f20333g.format(r13) + " bytes from " + r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0392, code lost:
    
        r12.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x039b, code lost:
    
        if (r0.isFile() == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x039d, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03a5, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x041a  */
    @Override // com.google.android.gms.internal.ads.AbstractC2986gv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzt(final java.lang.String r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C3328jv.zzt(java.lang.String):boolean");
    }
}
