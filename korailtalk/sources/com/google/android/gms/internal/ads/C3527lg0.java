package com.google.android.gms.internal.ads;

import D1.a;
import I2.AbstractC0608l;
import I2.AbstractC0611o;
import I2.InterfaceC0603g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.lg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3527lg0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f20719a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f20720b;

    /* renamed from: c, reason: collision with root package name */
    private final C1876Sf0 f20721c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1958Uf0 f20722d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3413kg0 f20723e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3413kg0 f20724f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC0608l f20725g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC0608l f20726h;

    C3527lg0(Context context, Executor executor, C1876Sf0 c1876Sf0, AbstractC1958Uf0 abstractC1958Uf0, C3186ig0 c3186ig0, C3299jg0 c3299jg0) {
        this.f20719a = context;
        this.f20720b = executor;
        this.f20721c = c1876Sf0;
        this.f20722d = abstractC1958Uf0;
        this.f20723e = c3186ig0;
        this.f20724f = c3299jg0;
    }

    private static O9 d(AbstractC0608l abstractC0608l, O9 o9) {
        return !abstractC0608l.isSuccessful() ? o9 : (O9) abstractC0608l.getResult();
    }

    private final AbstractC0608l e(Callable callable) {
        return AbstractC0611o.call(this.f20720b, callable).addOnFailureListener(this.f20720b, new InterfaceC0603g() { // from class: com.google.android.gms.internal.ads.hg0
            @Override // I2.InterfaceC0603g
            public final void onFailure(Exception exc) {
                this.zza.c(exc);
            }
        });
    }

    public static C3527lg0 zze(Context context, Executor executor, C1876Sf0 c1876Sf0, AbstractC1958Uf0 abstractC1958Uf0) {
        final C3527lg0 c3527lg0 = new C3527lg0(context, executor, c1876Sf0, abstractC1958Uf0, new C3186ig0(), new C3299jg0());
        if (c3527lg0.f20722d.zzd()) {
            c3527lg0.f20725g = c3527lg0.e(new Callable() { // from class: com.google.android.gms.internal.ads.fg0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.a();
                }
            });
        } else {
            c3527lg0.f20725g = AbstractC0611o.forResult(c3527lg0.f20723e.zza());
        }
        c3527lg0.f20726h = c3527lg0.e(new Callable() { // from class: com.google.android.gms.internal.ads.gg0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.b();
            }
        });
        return c3527lg0;
    }

    final /* synthetic */ O9 a() {
        C3357k9 c3357k9Zza = O9.zza();
        a.C0017a advertisingIdInfo = D1.a.getAdvertisingIdInfo(this.f20719a);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID uuidFromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
            byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            c3357k9Zza.zzt(id);
            c3357k9Zza.zzs(advertisingIdInfo.isLimitAdTrackingEnabled());
            c3357k9Zza.zzu(EnumC4268s9.DEVICE_IDENTIFIER_ANDROID_AD_ID);
        }
        return (O9) c3357k9Zza.zzbr();
    }

    final /* synthetic */ O9 b() throws PackageManager.NameNotFoundException {
        Context context = this.f20719a;
        return AbstractC2269ag0.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    final /* synthetic */ void c(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f20721c.zzc(2025, -1L, exc);
    }

    public final O9 zza() {
        return d(this.f20725g, this.f20723e.zza());
    }

    public final O9 zzb() {
        return d(this.f20726h, this.f20724f.zza());
    }
}
