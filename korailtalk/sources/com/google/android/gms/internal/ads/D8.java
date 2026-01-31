package com.google.android.gms.internal.ads;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/* loaded from: classes2.dex */
public class D8 extends Z7 {

    /* renamed from: m, reason: collision with root package name */
    private final Object f12638m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC2439c8 f12639n;

    public D8(int i8, String str, InterfaceC2439c8 interfaceC2439c8, InterfaceC2325b8 interfaceC2325b8) {
        super(i8, str, interfaceC2325b8);
        this.f12638m = new Object();
        this.f12639n = interfaceC2439c8;
    }

    @Override // com.google.android.gms.internal.ads.Z7
    protected final C2554d8 a(V7 v72) {
        String str;
        String str2;
        try {
            byte[] bArr = v72.zzb;
            Map map = v72.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get("Content-Type")) != null) {
                String[] strArrSplit = str2.split(";", 0);
                int i8 = 1;
                while (true) {
                    if (i8 >= strArrSplit.length) {
                        break;
                    }
                    String[] strArrSplit2 = strArrSplit[i8].trim().split(SimpleComparison.EQUAL_TO_OPERATION, 0);
                    if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                        str3 = strArrSplit2[1];
                        break;
                    }
                    i8++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(v72.zzb);
        }
        return C2554d8.zzb(str, AbstractC4608v8.zzb(v72));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.Z7
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void c(String str) {
        InterfaceC2439c8 interfaceC2439c8;
        synchronized (this.f12638m) {
            interfaceC2439c8 = this.f12639n;
        }
        interfaceC2439c8.zza(str);
    }
}
