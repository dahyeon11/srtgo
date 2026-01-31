package com.google.android.gms.internal.ads;

import android.net.Network;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.ads.Hh0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1430Hh0 extends AbstractC4668vh0 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC1843Rj0 f13350a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC1843Rj0 f13351b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1389Gh0 f13352c;

    /* renamed from: d, reason: collision with root package name */
    private HttpURLConnection f13353d;

    C1430Hh0(InterfaceC1843Rj0 interfaceC1843Rj0, InterfaceC1843Rj0 interfaceC1843Rj02, InterfaceC1389Gh0 interfaceC1389Gh0) {
        this.f13350a = interfaceC1843Rj0;
        this.f13351b = interfaceC1843Rj02;
        this.f13352c = interfaceC1389Gh0;
    }

    static /* synthetic */ Integer c() {
        return -1;
    }

    static /* synthetic */ Integer d() {
        return -1;
    }

    public static void zzs(HttpURLConnection httpURLConnection) {
        AbstractC4782wh0.zza();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzs(this.f13353d);
    }

    public HttpURLConnection zzm() {
        AbstractC4782wh0.zzb(((Integer) this.f13350a.zza()).intValue(), ((Integer) this.f13351b.zza()).intValue());
        InterfaceC1389Gh0 interfaceC1389Gh0 = this.f13352c;
        interfaceC1389Gh0.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) interfaceC1389Gh0.zza();
        this.f13353d = httpURLConnection;
        return httpURLConnection;
    }

    public HttpURLConnection zzn(InterfaceC1389Gh0 interfaceC1389Gh0, final int i8, final int i9) {
        this.f13350a = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.zh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return Integer.valueOf(i8);
            }
        };
        this.f13351b = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.Ah0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return Integer.valueOf(i9);
            }
        };
        this.f13352c = interfaceC1389Gh0;
        return zzm();
    }

    public HttpURLConnection zzo(final Network network, final URL url, final int i8, final int i9) {
        this.f13350a = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.Bh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return Integer.valueOf(i8);
            }
        };
        this.f13351b = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.Ch0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return Integer.valueOf(i9);
            }
        };
        this.f13352c = new InterfaceC1389Gh0() { // from class: com.google.android.gms.internal.ads.Dh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1389Gh0
            public final URLConnection zza() {
                return network.openConnection(url);
            }
        };
        return zzm();
    }

    public URLConnection zzr(final URL url, final int i8) {
        this.f13350a = new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.Eh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return Integer.valueOf(i8);
            }
        };
        this.f13352c = new InterfaceC1389Gh0() { // from class: com.google.android.gms.internal.ads.Fh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1389Gh0
            public final URLConnection zza() {
                return url.openConnection();
            }
        };
        return zzm();
    }

    C1430Hh0() {
        this(new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.xh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return C1430Hh0.c();
            }
        }, new InterfaceC1843Rj0() { // from class: com.google.android.gms.internal.ads.yh0
            @Override // com.google.android.gms.internal.ads.InterfaceC1843Rj0
            public final Object zza() {
                return C1430Hh0.d();
            }
        }, null);
    }
}
