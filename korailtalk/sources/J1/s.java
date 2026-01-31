package J1;

import K1.K0;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes.dex */
final class s extends K1.B {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u f2547c;

    /* synthetic */ s(u uVar, r rVar) {
        this.f2547c = uVar;
    }

    @Override // K1.B
    public final void zza() {
        final BitmapDrawable bitmapDrawable;
        Bitmap bitmapZza = G1.u.zzu().zza(Integer.valueOf(this.f2547c.f2550b.zzo.zzf));
        if (bitmapZza != null) {
            G1.u.zzp();
            u uVar = this.f2547c;
            G1.k kVar = uVar.f2550b.zzo;
            boolean z8 = kVar.zzd;
            float f8 = kVar.zze;
            Activity activity = uVar.f2549a;
            if (!z8 || f8 <= 0.0f || f8 > 25.0f) {
                bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
            } else {
                try {
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapZza, bitmapZza.getWidth(), bitmapZza.getHeight(), false);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                    RenderScript renderScriptCreate = RenderScript.create(activity);
                    ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                    Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                    Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                    scriptIntrinsicBlurCreate.setRadius(f8);
                    scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                    scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                    allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                } catch (RuntimeException unused) {
                    bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapZza);
                }
            }
            K0.zza.post(new Runnable() { // from class: J1.q
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.f2547c.f2549a.getWindow().setBackgroundDrawable(bitmapDrawable);
                }
            });
        }
    }
}
