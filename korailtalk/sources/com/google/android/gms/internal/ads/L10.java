package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class L10 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14141a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceExecutorServiceC1974Un0 f14142b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f14143c;

    /* renamed from: d, reason: collision with root package name */
    private final C1825Ra0 f14144d;

    /* renamed from: e, reason: collision with root package name */
    private final View f14145e;

    public L10(InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un0, InterfaceExecutorServiceC1974Un0 interfaceExecutorServiceC1974Un02, Context context, C1825Ra0 c1825Ra0, ViewGroup viewGroup) {
        this.f14141a = interfaceExecutorServiceC1974Un0;
        this.f14142b = interfaceExecutorServiceC1974Un02;
        this.f14143c = context;
        this.f14144d = c1825Ra0;
        this.f14145e = viewGroup;
    }

    private final List c() {
        ArrayList arrayList = new ArrayList();
        View view = this.f14145e;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    final /* synthetic */ N10 a() {
        return new N10(this.f14143c, this.f14144d.zze, c());
    }

    final /* synthetic */ N10 b() {
        return new N10(this.f14143c, this.f14144d.zze, c());
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        AbstractC4439th.zza(this.f14143c);
        return ((Boolean) H1.C.zzc().zza(AbstractC4439th.zzla)).booleanValue() ? this.f14142b.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.J10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.a();
            }
        }) : this.f14141a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.K10
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.b();
            }
        });
    }
}
