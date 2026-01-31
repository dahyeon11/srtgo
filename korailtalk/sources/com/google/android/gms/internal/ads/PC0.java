package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.kakao.sdk.template.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PC0 implements Ky0 {

    /* renamed from: a */
    private final Context f15233a;

    /* renamed from: b */
    private final List f15234b = new ArrayList();

    /* renamed from: c */
    private final Ky0 f15235c;

    /* renamed from: d */
    private Ky0 f15236d;

    /* renamed from: e */
    private Ky0 f15237e;

    /* renamed from: f */
    private Ky0 f15238f;

    /* renamed from: g */
    private Ky0 f15239g;

    /* renamed from: h */
    private Ky0 f15240h;

    /* renamed from: i */
    private Ky0 f15241i;

    /* renamed from: j */
    private Ky0 f15242j;

    /* renamed from: k */
    private Ky0 f15243k;

    public PC0(Context context, Ky0 ky0) {
        this.f15233a = context.getApplicationContext();
        this.f15235c = ky0;
    }

    private final Ky0 a() {
        if (this.f15237e == null) {
            C2528cv0 c2528cv0 = new C2528cv0(this.f15233a);
            this.f15237e = c2528cv0;
            b(c2528cv0);
        }
        return this.f15237e;
    }

    private final void b(Ky0 ky0) {
        for (int i8 = 0; i8 < this.f15234b.size(); i8++) {
            ky0.zzf((InterfaceC4279sE0) this.f15234b.get(i8));
        }
    }

    private static final void c(Ky0 ky0, InterfaceC4279sE0 interfaceC4279sE0) {
        if (ky0 != null) {
            ky0.zzf(interfaceC4279sE0);
        }
    }

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) {
        Ky0 ky0 = this.f15243k;
        ky0.getClass();
        return ky0.zza(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) {
        Ky0 ky0;
        F10.zzf(this.f15243k == null);
        String scheme = nb0.zza.getScheme();
        Uri uri = nb0.zza;
        int i8 = AbstractC2281am0.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || "file".equals(scheme2)) {
            String path = nb0.zza.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f15236d == null) {
                    C2911gE0 c2911gE0 = new C2911gE0();
                    this.f15236d = c2911gE0;
                    b(c2911gE0);
                }
                this.f15243k = this.f15236d;
            } else {
                this.f15243k = a();
            }
        } else if ("asset".equals(scheme)) {
            this.f15243k = a();
        } else if (Constants.CONTENT.equals(scheme)) {
            if (this.f15238f == null) {
                C2991gx0 c2991gx0 = new C2991gx0(this.f15233a);
                this.f15238f = c2991gx0;
                b(c2991gx0);
            }
            this.f15243k = this.f15238f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f15239g == null) {
                try {
                    Ky0 ky02 = (Ky0) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.f15239g = ky02;
                    b(ky02);
                } catch (ClassNotFoundException unused) {
                    AbstractC2834fc0.zzf("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e8) {
                    throw new RuntimeException("Error instantiating RTMP extension", e8);
                }
                if (this.f15239g == null) {
                    this.f15239g = this.f15235c;
                }
            }
            this.f15243k = this.f15239g;
        } else if ("udp".equals(scheme)) {
            if (this.f15240h == null) {
                C4507uE0 c4507uE0 = new C4507uE0(Z1.b.CREDENTIAL_PICKER_REQUEST_CODE);
                this.f15240h = c4507uE0;
                b(c4507uE0);
            }
            this.f15243k = this.f15240h;
        } else if ("data".equals(scheme)) {
            if (this.f15241i == null) {
                Hx0 hx0 = new Hx0();
                this.f15241i = hx0;
                b(hx0);
            }
            this.f15243k = this.f15241i;
        } else {
            if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f15242j == null) {
                    C4052qE0 c4052qE0 = new C4052qE0(this.f15233a);
                    this.f15242j = c4052qE0;
                    b(c4052qE0);
                }
                ky0 = this.f15242j;
            } else {
                ky0 = this.f15235c;
            }
            this.f15243k = ky0;
        }
        return this.f15243k.zzb(nb0);
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        Ky0 ky0 = this.f15243k;
        if (ky0 == null) {
            return null;
        }
        return ky0.zzc();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzd() {
        Ky0 ky0 = this.f15243k;
        if (ky0 != null) {
            try {
                ky0.zzd();
            } finally {
                this.f15243k = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Map zze() {
        Ky0 ky0 = this.f15243k;
        return ky0 == null ? Collections.emptyMap() : ky0.zze();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzf(InterfaceC4279sE0 interfaceC4279sE0) {
        interfaceC4279sE0.getClass();
        this.f15235c.zzf(interfaceC4279sE0);
        this.f15234b.add(interfaceC4279sE0);
        c(this.f15236d, interfaceC4279sE0);
        c(this.f15237e, interfaceC4279sE0);
        c(this.f15238f, interfaceC4279sE0);
        c(this.f15239g, interfaceC4279sE0);
        c(this.f15240h, interfaceC4279sE0);
        c(this.f15241i, interfaceC4279sE0);
        c(this.f15242j, interfaceC4279sE0);
    }
}
