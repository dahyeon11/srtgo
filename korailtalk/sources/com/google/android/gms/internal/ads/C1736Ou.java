package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.gms.internal.ads.Ou, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1736Ou implements Ky0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f15160a;

    /* renamed from: b, reason: collision with root package name */
    private final Ky0 f15161b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15162c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15163d;

    /* renamed from: f, reason: collision with root package name */
    private InputStream f15165f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15166g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f15167h;

    /* renamed from: i, reason: collision with root package name */
    private volatile C3067he f15168i;

    /* renamed from: m, reason: collision with root package name */
    private NB0 f15172m;

    /* renamed from: j, reason: collision with root package name */
    private boolean f15169j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f15170k = false;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicLong f15171l = new AtomicLong(-1);

    /* renamed from: e, reason: collision with root package name */
    private final boolean f15164e = ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbR)).booleanValue();

    public C1736Ou(Context context, Ky0 ky0, String str, int i8, InterfaceC4279sE0 interfaceC4279sE0, InterfaceC1695Nu interfaceC1695Nu) {
        this.f15160a = context;
        this.f15161b = ky0;
        this.f15162c = str;
        this.f15163d = i8;
    }

    private final boolean a() {
        if (!this.f15164e) {
            return false;
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzer)).booleanValue() || this.f15169j) {
            return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzes)).booleanValue() && !this.f15170k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.Ky0, com.google.android.gms.internal.ads.UL0
    public final int zza(byte[] bArr, int i8, int i9) throws IOException {
        if (!this.f15166g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f15165f;
        return inputStream != null ? inputStream.read(bArr, i8, i9) : this.f15161b.zza(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final long zzb(NB0 nb0) throws IOException {
        Long l8;
        if (this.f15166g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f15166g = true;
        Uri uri = nb0.zza;
        this.f15167h = uri;
        this.f15172m = nb0;
        this.f15168i = C3067he.zza(uri);
        C2722ee c2722eeZzb = null;
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzeo)).booleanValue()) {
            if (this.f15168i != null) {
                this.f15168i.zzh = nb0.zze;
                this.f15168i.zzi = AbstractC1802Qj0.zzc(this.f15162c);
                this.f15168i.zzj = this.f15163d;
                c2722eeZzb = G1.u.zzc().zzb(this.f15168i);
            }
            if (c2722eeZzb != null && c2722eeZzb.zze()) {
                this.f15169j = c2722eeZzb.zzg();
                this.f15170k = c2722eeZzb.zzf();
                if (!a()) {
                    this.f15165f = c2722eeZzb.zzc();
                    return -1L;
                }
            }
        } else if (this.f15168i != null) {
            this.f15168i.zzh = nb0.zze;
            this.f15168i.zzi = AbstractC1802Qj0.zzc(this.f15162c);
            this.f15168i.zzj = this.f15163d;
            if (this.f15168i.zzg) {
                l8 = (Long) H1.C.zzc().zza(AbstractC4439th.zzeq);
            } else {
                l8 = (Long) H1.C.zzc().zza(AbstractC4439th.zzep);
            }
            long jLongValue = l8.longValue();
            G1.u.zzB().elapsedRealtime();
            G1.u.zzd();
            Future futureZza = C4433te.zza(this.f15160a, this.f15168i);
            try {
                try {
                    C4547ue c4547ue = (C4547ue) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                    c4547ue.zzd();
                    this.f15169j = c4547ue.zzf();
                    this.f15170k = c4547ue.zze();
                    c4547ue.zza();
                    if (!a()) {
                        this.f15165f = c4547ue.zzc();
                    }
                } catch (InterruptedException unused) {
                    futureZza.cancel(false);
                    Thread.currentThread().interrupt();
                } catch (ExecutionException | TimeoutException unused2) {
                    futureZza.cancel(false);
                }
            } catch (Throwable unused3) {
            }
            G1.u.zzB().elapsedRealtime();
            throw null;
        }
        if (this.f15168i != null) {
            LA0 la0Zza = nb0.zza();
            la0Zza.zzd(Uri.parse(this.f15168i.zza));
            this.f15172m = la0Zza.zze();
        }
        return this.f15161b.zzb(this.f15172m);
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final Uri zzc() {
        return this.f15167h;
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzd() throws IOException {
        if (!this.f15166g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f15166g = false;
        this.f15167h = null;
        InputStream inputStream = this.f15165f;
        if (inputStream == null) {
            this.f15161b.zzd();
        } else {
            o2.l.closeQuietly(inputStream);
            this.f15165f = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.Ky0
    public final void zzf(InterfaceC4279sE0 interfaceC4279sE0) {
    }
}
