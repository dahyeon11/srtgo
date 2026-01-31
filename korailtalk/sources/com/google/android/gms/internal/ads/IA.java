package com.google.android.gms.internal.ads;

import K1.InterfaceC0671x0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import com.korail.talk.network.dao.pay.StbkAcntDao;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class IA {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13417a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0671x0 f13418b;

    /* renamed from: c, reason: collision with root package name */
    private final C2711eX f13419c;

    /* renamed from: d, reason: collision with root package name */
    private final C3845oP f13420d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f13421e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f13422f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f13423g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC4343sq f13424h;

    /* renamed from: i, reason: collision with root package name */
    InterfaceC4343sq f13425i;

    IA(Context context, InterfaceC0671x0 interfaceC0671x0, C2711eX c2711eX, C3845oP c3845oP, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02, ScheduledExecutorService scheduledExecutorService) {
        this.f13417a = context;
        this.f13418b = interfaceC0671x0;
        this.f13419c = c2711eX;
        this.f13420d = c3845oP;
        this.f13421e = interfaceExecutorServiceC1974Un0;
        this.f13422f = interfaceExecutorServiceC1974Un02;
        this.f13423g = scheduledExecutorService;
    }

    private final com.google.common.util.concurrent.C h(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) H1.C.zzc().zza(AbstractC4439th.zzkh)) || this.f13418b.zzS()) {
                return AbstractC1483In0.zzh(str);
            }
            final Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
            builderBuildUpon.appendQueryParameter((String) H1.C.zzc().zza(AbstractC4439th.zzki), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return AbstractC1483In0.zzf(AbstractC1483In0.zzn(AbstractC5136zn0.zzu(this.f13419c.zza()), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.BA
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        return this.zza.c(builderBuildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f13422f), Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.CA
                    @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
                    public final com.google.common.util.concurrent.C zza(Object obj) {
                        return this.zza.d(builderBuildUpon, (Throwable) obj);
                    }
                }, this.f13421e);
            }
            builderBuildUpon.appendQueryParameter((String) H1.C.zzc().zza(AbstractC4439th.zzkj), "11");
            return AbstractC1483In0.zzh(builderBuildUpon.toString());
        } catch (Exception e8) {
            return AbstractC1483In0.zzg(e8);
        }
    }

    public static boolean zzj(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) H1.C.zzc().zza(AbstractC4439th.zzkh));
    }

    final /* synthetic */ com.google.common.util.concurrent.C b(String str, final Throwable th) {
        this.f13421e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.AA
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.f(th);
            }
        });
        return AbstractC1483In0.zzh(str);
    }

    final /* synthetic */ com.google.common.util.concurrent.C c(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) H1.C.zzc().zza(AbstractC4439th.zzkj), "10");
            return AbstractC1483In0.zzh(builder.toString());
        }
        Uri.Builder builderBuildUpon = builder.build().buildUpon();
        builderBuildUpon.appendQueryParameter((String) H1.C.zzc().zza(AbstractC4439th.zzkk), "1");
        builderBuildUpon.appendQueryParameter((String) H1.C.zzc().zza(AbstractC4439th.zzkj), "12");
        if (str.contains((CharSequence) H1.C.zzc().zza(AbstractC4439th.zzkl))) {
            builderBuildUpon.authority((String) H1.C.zzc().zza(AbstractC4439th.zzkm));
        }
        return AbstractC1483In0.zzn(AbstractC5136zn0.zzu(this.f13419c.zzb(builderBuildUpon.build(), inputEvent)), new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.DA
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                String str2 = (String) H1.C.zzc().zza(AbstractC4439th.zzkj);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return AbstractC1483In0.zzh(builder2.toString());
            }
        }, this.f13422f);
    }

    final /* synthetic */ com.google.common.util.concurrent.C d(Uri.Builder builder, final Throwable th) {
        this.f13421e.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zA
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.g(th);
            }
        });
        builder.appendQueryParameter((String) H1.C.zzc().zza(AbstractC4439th.zzkj), StbkAcntDao.DELETE_ACCOUNT);
        return AbstractC1483In0.zzh(builder.toString());
    }

    final /* synthetic */ void f(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzko)).booleanValue()) {
            InterfaceC4343sq interfaceC4343sqZzc = C4116qq.zzc(this.f13417a);
            this.f13425i = interfaceC4343sqZzc;
            interfaceC4343sqZzc.zzh(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            InterfaceC4343sq interfaceC4343sqZza = C4116qq.zza(this.f13417a);
            this.f13424h = interfaceC4343sqZza;
            interfaceC4343sqZza.zzh(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ void g(Throwable th) {
        if (((Boolean) H1.C.zzc().zza(AbstractC4439th.zzko)).booleanValue()) {
            InterfaceC4343sq interfaceC4343sqZzc = C4116qq.zzc(this.f13417a);
            this.f13425i = interfaceC4343sqZzc;
            interfaceC4343sqZzc.zzh(th, "AttributionReporting");
        } else {
            InterfaceC4343sq interfaceC4343sqZza = C4116qq.zza(this.f13417a);
            this.f13424h = interfaceC4343sqZza;
            interfaceC4343sqZza.zzh(th, "AttributionReportingSampled");
        }
    }

    public final com.google.common.util.concurrent.C zzb(final String str, Random random) {
        return TextUtils.isEmpty(str) ? AbstractC1483In0.zzh(str) : AbstractC1483In0.zzf(h(str, this.f13420d.zza(), random), Throwable.class, new InterfaceC3997pn0() { // from class: com.google.android.gms.internal.ads.yA
            @Override // com.google.android.gms.internal.ads.InterfaceC3997pn0
            public final com.google.common.util.concurrent.C zza(Object obj) {
                return this.zza.b(str, (Throwable) obj);
            }
        }, this.f13421e);
    }

    public final void zzi(String str, C3865oe0 c3865oe0, Random random) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC1483In0.zzr(AbstractC1483In0.zzo(h(str, this.f13420d.zza(), random), ((Integer) H1.C.zzc().zza(AbstractC4439th.zzkn)).intValue(), TimeUnit.MILLISECONDS, this.f13423g), new HA(this, c3865oe0, str), this.f13421e);
    }
}
