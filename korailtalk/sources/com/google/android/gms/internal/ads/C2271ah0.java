package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.ah0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2271ah0 {

    /* renamed from: a, reason: collision with root package name */
    final InterfaceC2615dh0 f18001a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f18002b;

    private C2271ah0(InterfaceC2615dh0 interfaceC2615dh0) {
        this.f18001a = interfaceC2615dh0;
        this.f18002b = interfaceC2615dh0 != null;
    }

    public static C2271ah0 zzb(Context context, String str, String str2) throws C1182Bg0 {
        InterfaceC2615dh0 c2386bh0;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        c2386bh0 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        c2386bh0 = iInterfaceQueryLocalInterface instanceof InterfaceC2615dh0 ? (InterfaceC2615dh0) iInterfaceQueryLocalInterface : new C2386bh0(iBinderInstantiate);
                    }
                    c2386bh0.zze(r2.b.wrap(context), str, null);
                    return new C2271ah0(c2386bh0);
                } catch (Exception e8) {
                    throw new C1182Bg0(e8);
                }
            } catch (RemoteException | C1182Bg0 | NullPointerException | SecurityException unused) {
                return new C2271ah0(new BinderC2729eh0());
            }
        } catch (Exception e9) {
            throw new C1182Bg0(e9);
        }
    }

    public static C2271ah0 zzc() {
        return new C2271ah0(new BinderC2729eh0());
    }

    public final C2165Zg0 zza(byte[] bArr) {
        return new C2165Zg0(this, bArr, null);
    }
}
