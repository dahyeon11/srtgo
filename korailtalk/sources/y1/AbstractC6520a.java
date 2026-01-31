package y1;

import H1.C0522b1;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import i2.AbstractC5683p;
import java.util.List;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6520a {

    /* renamed from: a, reason: collision with root package name */
    protected final C0522b1 f37565a;

    protected AbstractC6520a() {
        C0522b1 c0522b1 = new C0522b1();
        this.f37565a = c0522b1;
        c0522b1.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public AbstractC6520a addCustomEventExtrasBundle(Class<? extends O1.a> cls, Bundle bundle) {
        this.f37565a.zzo(cls, bundle);
        return self();
    }

    public AbstractC6520a addKeyword(String str) {
        this.f37565a.zzq(str);
        return self();
    }

    public AbstractC6520a addNetworkExtrasBundle(Class<Object> cls, Bundle bundle) {
        this.f37565a.zzr(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.f37565a.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return self();
    }

    protected abstract AbstractC6520a self();

    public AbstractC6520a setAdString(String str) {
        this.f37565a.zzv(str);
        return self();
    }

    public AbstractC6520a setContentUrl(String str) {
        AbstractC5683p.checkNotNull(str, "Content URL must be non-null.");
        AbstractC5683p.checkNotEmpty(str, "Content URL must be non-empty.");
        int length = str.length();
        AbstractC5683p.checkArgument(length <= 512, "Content URL must not exceed %d in length.  Provided length was %d.", 512, Integer.valueOf(str.length()));
        this.f37565a.zzw(str);
        return self();
    }

    public AbstractC6520a setHttpTimeoutMillis(int i8) {
        this.f37565a.zzx(i8);
        return self();
    }

    public AbstractC6520a setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            L1.n.zzj("neighboring content URLs list should not be null");
            return self();
        }
        this.f37565a.zzz(list);
        return self();
    }

    public AbstractC6520a setRequestAgent(String str) {
        this.f37565a.zzB(str);
        return self();
    }

    @Deprecated
    public final AbstractC6520a zza(String str) {
        this.f37565a.zzt(str);
        return self();
    }

    @Deprecated
    public final AbstractC6520a zzb(boolean z8) {
        this.f37565a.zzy(z8);
        return self();
    }

    @Deprecated
    public final AbstractC6520a zzc(boolean z8) {
        this.f37565a.zzC(z8);
        return self();
    }
}
