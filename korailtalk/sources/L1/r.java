package L1;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* loaded from: classes.dex */
public abstract class r {
    private static DynamiteModule a(Context context) throws q {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID);
        } catch (Exception e8) {
            throw new q(e8);
        }
    }

    public static Context zza(Context context) {
        return a(context).getModuleContext();
    }

    public static Object zzb(Context context, String str, p pVar) throws q {
        try {
            return pVar.zza(a(context).instantiate(str));
        } catch (Exception e8) {
            throw new q(e8);
        }
    }
}
