package H1;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.InterfaceC2168Zi;
import com.google.android.gms.internal.ads.InterfaceC4899xj;
import r2.InterfaceC6172a;
import y1.C6514A;

/* renamed from: H1.v1 */
/* loaded from: classes.dex */
public final class C0581v1 implements y1.o {

    /* renamed from: a */
    private final InterfaceC2168Zi f1754a;

    /* renamed from: b */
    private final C6514A f1755b = new C6514A();

    /* renamed from: c */
    private final InterfaceC4899xj f1756c;

    public C0581v1(InterfaceC2168Zi interfaceC2168Zi, InterfaceC4899xj interfaceC4899xj) {
        this.f1754a = interfaceC2168Zi;
        this.f1756c = interfaceC4899xj;
    }

    @Override // y1.o
    public final float getAspectRatio() {
        try {
            return this.f1754a.zze();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return 0.0f;
        }
    }

    @Override // y1.o
    public final float getCurrentTime() {
        try {
            return this.f1754a.zzf();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return 0.0f;
        }
    }

    @Override // y1.o
    public final float getDuration() {
        try {
            return this.f1754a.zzg();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return 0.0f;
        }
    }

    @Override // y1.o
    public final Drawable getMainImage() {
        try {
            InterfaceC6172a interfaceC6172aZzi = this.f1754a.zzi();
            if (interfaceC6172aZzi != null) {
                return (Drawable) r2.b.unwrap(interfaceC6172aZzi);
            }
            return null;
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return null;
        }
    }

    @Override // y1.o
    public final C6514A getVideoController() {
        try {
            if (this.f1754a.zzh() != null) {
                this.f1755b.zzb(this.f1754a.zzh());
            }
        } catch (RemoteException e8) {
            L1.n.zzh("Exception occurred while getting video controller", e8);
        }
        return this.f1755b;
    }

    @Override // y1.o
    public final boolean hasVideoContent() {
        try {
            return this.f1754a.zzl();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }

    @Override // y1.o
    public final void setMainImage(Drawable drawable) {
        try {
            this.f1754a.zzj(r2.b.wrap(drawable));
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
        }
    }

    @Override // y1.o
    public final InterfaceC4899xj zza() {
        return this.f1756c;
    }

    @Override // y1.o
    public final boolean zzb() {
        try {
            return this.f1754a.zzk();
        } catch (RemoteException e8) {
            L1.n.zzh("", e8);
            return false;
        }
    }

    public final InterfaceC2168Zi zzc() {
        return this.f1754a;
    }
}
