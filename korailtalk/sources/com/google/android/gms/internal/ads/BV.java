package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class BV implements InterfaceC1215Cc0 {

    /* renamed from: d */
    private static final Pattern f12285d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a */
    private final String f12286a;

    /* renamed from: b */
    private final InterfaceC3407kd0 f12287b;

    /* renamed from: c */
    private final RunnableC4660vd0 f12288c;

    public BV(String str, RunnableC4660vd0 runnableC4660vd0, InterfaceC3407kd0 interfaceC3407kd0) {
        this.f12286a = str;
        this.f12288c = runnableC4660vd0;
        this.f12287b = interfaceC3407kd0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1215Cc0
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws RS {
        RS rs;
        String strConcat;
        AV av = (AV) obj;
        int iOptInt = av.f12181a.optInt("http_timeout_millis", 60000);
        C2863fr c2863fr = av.f12182b;
        String strJoin = "";
        if (c2863fr.zza() != -2) {
            if (c2863fr.zza() == 1) {
                if (c2863fr.zzh() != null) {
                    strJoin = TextUtils.join(", ", c2863fr.zzh());
                    L1.n.zzg(strJoin);
                }
                rs = new RS(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                rs = new RS(1);
            }
            RunnableC4660vd0 runnableC4660vd0 = this.f12288c;
            InterfaceC3407kd0 interfaceC3407kd0 = this.f12287b;
            interfaceC3407kd0.zzi(rs);
            interfaceC3407kd0.zzh(false);
            runnableC4660vd0.zza(interfaceC3407kd0);
            throw rs;
        }
        HashMap map = new HashMap();
        if (av.f12182b.zzj() && !TextUtils.isEmpty(this.f12286a)) {
            if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzaP)).booleanValue()) {
                String str = this.f12286a;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f12285d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.f12286a);
            }
        }
        if (av.f12182b.zzk()) {
            CV.zza(map, av.f12181a);
        }
        if (av.f12182b != null && !TextUtils.isEmpty(av.f12182b.zzf())) {
            strJoin = av.f12182b.zzf();
        }
        RunnableC4660vd0 runnableC4660vd02 = this.f12288c;
        InterfaceC3407kd0 interfaceC3407kd02 = this.f12287b;
        interfaceC3407kd02.zzh(true);
        runnableC4660vd02.zza(interfaceC3407kd02);
        return new C4762wV(av.f12182b.zzg(), iOptInt, map, strJoin.getBytes(AbstractC3647mj0.zzc), "", av.f12182b.zzk());
    }
}
