package H1;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC3530li;
import com.google.android.gms.internal.ads.AbstractC4439th;
import com.google.android.gms.internal.ads.AbstractC5125zi;

/* renamed from: H1.y */
/* loaded from: classes.dex */
abstract class AbstractC0588y {

    /* renamed from: a */
    private static final InterfaceC0542i0 f1770a;

    static {
        InterfaceC0542i0 c0536g0 = null;
        try {
            Object objNewInstance = C0585x.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    c0536g0 = iInterfaceQueryLocalInterface instanceof InterfaceC0542i0 ? (InterfaceC0542i0) iInterfaceQueryLocalInterface : new C0536g0(iBinder);
                }
            } else {
                L1.n.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            L1.n.zzj("Failed to instantiate ClientApi class.");
        }
        f1770a = c0536g0;
    }

    AbstractC0588y() {
    }

    private final Object a() {
        InterfaceC0542i0 interfaceC0542i0 = f1770a;
        if (interfaceC0542i0 == null) {
            L1.n.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzb(interfaceC0542i0);
        } catch (RemoteException e8) {
            L1.n.zzk("Cannot invoke local loader using ClientApi class.", e8);
            return null;
        }
    }

    private final Object b() {
        try {
            return zzc();
        } catch (RemoteException e8) {
            L1.n.zzk("Cannot invoke remote loader.", e8);
            return null;
        }
    }

    protected abstract Object zza();

    protected abstract Object zzb(InterfaceC0542i0 interfaceC0542i0);

    protected abstract Object zzc();

    public final Object zzd(Context context, boolean z8) {
        boolean z9;
        Object objA;
        if (!z8) {
            C0591z.zzb();
            if (!L1.g.zzt(context, 12451000)) {
                L1.n.zze("Google Play Services is not available.");
                z8 = true;
            }
        }
        boolean z10 = false;
        boolean z11 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        AbstractC4439th.zza(context);
        if (((Boolean) AbstractC3530li.zza.zze()).booleanValue()) {
            z9 = false;
        } else if (((Boolean) AbstractC3530li.zzb.zze()).booleanValue()) {
            z9 = true;
            z10 = true;
        } else {
            z10 = z8 | z11;
            z9 = false;
        }
        if (z10) {
            objA = a();
            if (objA == null && !z9) {
                objA = b();
            }
        } else {
            Object objB = b();
            if (objB == null) {
                if (C0591z.zze().nextInt(((Long) AbstractC5125zi.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    C0591z.zzb().zzo(context, C0591z.zzc().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            objA = objB == null ? a() : objB;
        }
        return objA == null ? zza() : objA;
    }
}
