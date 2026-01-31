package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.yh */
/* loaded from: classes2.dex */
public final class C5009yh {

    /* renamed from: d */
    String f24001d;

    /* renamed from: e */
    Context f24002e;

    /* renamed from: f */
    String f24003f;

    /* renamed from: h */
    private AtomicBoolean f24005h;

    /* renamed from: i */
    private File f24006i;

    /* renamed from: a */
    final BlockingQueue f23998a = new ArrayBlockingQueue(100);

    /* renamed from: b */
    final LinkedHashMap f23999b = new LinkedHashMap();

    /* renamed from: c */
    final Map f24000c = new HashMap();

    /* renamed from: g */
    private final HashSet f24004g = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    private final void b(Map map, C1470Ih c1470Ih) throws Throwable {
        Uri.Builder builderBuildUpon = Uri.parse(this.f24001d).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String string = builderBuildUpon.build().toString();
        if (c1470Ih != null) {
            StringBuilder sb = new StringBuilder(string);
            if (!TextUtils.isEmpty(c1470Ih.zzb())) {
                sb.append("&it=");
                sb.append(c1470Ih.zzb());
            }
            if (!TextUtils.isEmpty(c1470Ih.zza())) {
                sb.append("&blat=");
                sb.append(c1470Ih.zza());
            }
            string = sb.toString();
        }
        if (!this.f24005h.get()) {
            G1.u.zzp();
            K1.K0.zzL(this.f24002e, this.f24003f, string);
            return;
        }
        File file = this.f24006i;
        if (file == null) {
            L1.n.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(string.getBytes());
                    fileOutputStream2.write(10);
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        L1.n.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e8);
                    }
                } catch (IOException e9) {
                    e = e9;
                    fileOutputStream = fileOutputStream2;
                    L1.n.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e10) {
                            L1.n.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e10);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e11) {
                            L1.n.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e11);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e12) {
            e = e12;
        }
    }

    public static /* synthetic */ void zzc(C5009yh c5009yh) throws Throwable {
        while (true) {
            try {
                C1511Jh c1511Jh = (C1511Jh) c5009yh.f23998a.take();
                C1470Ih c1470IhZza = c1511Jh.zza();
                if (!TextUtils.isEmpty(c1470IhZza.zzb())) {
                    c5009yh.b(c5009yh.a(c5009yh.f23999b, c1511Jh.zzb()), c1470IhZza);
                }
            } catch (InterruptedException e8) {
                L1.n.zzk("CsiReporter:reporter interrupted", e8);
                return;
            }
        }
    }

    final Map a(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final AbstractC1347Fh zza(String str) {
        AbstractC1347Fh abstractC1347Fh = (AbstractC1347Fh) this.f24000c.get(str);
        return abstractC1347Fh != null ? abstractC1347Fh : AbstractC1347Fh.zza;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.f24002e = context;
        this.f24003f = str;
        this.f24001d = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f24005h = atomicBoolean;
        atomicBoolean.set(((Boolean) AbstractC3530li.zzc.zze()).booleanValue());
        if (this.f24005h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f24006i = new File(AbstractC3529lh0.zza(AbstractC3415kh0.zza(), externalStorageDirectory, "sdk_csi_data.txt"));
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f23999b.put((String) entry.getKey(), (String) entry.getValue());
        }
        AbstractC4805wt.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.xh
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C5009yh.zzc(this.zza);
            }
        });
        Map map2 = this.f24000c;
        AbstractC1347Fh abstractC1347Fh = AbstractC1347Fh.zzb;
        map2.put("action", abstractC1347Fh);
        this.f24000c.put("ad_format", abstractC1347Fh);
        this.f24000c.put("e", AbstractC1347Fh.zzc);
    }

    public final void zze(String str) throws Throwable {
        if (this.f24004g.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sdkVersion", this.f24003f);
        linkedHashMap.put("ue", str);
        b(a(this.f23999b, linkedHashMap), null);
    }

    public final boolean zzf(C1511Jh c1511Jh) {
        return this.f23998a.offer(c1511Jh);
    }
}
