package J1;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.InterfaceC2065Wv;

/* loaded from: classes.dex */
public final class p {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public p(InterfaceC2065Wv interfaceC2065Wv) throws n {
        this.zzb = interfaceC2065Wv.getLayoutParams();
        ViewParent parent = interfaceC2065Wv.getParent();
        this.zzd = interfaceC2065Wv.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new n("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(interfaceC2065Wv.zzF());
        viewGroup.removeView(interfaceC2065Wv.zzF());
        interfaceC2065Wv.zzaq(true);
    }
}
