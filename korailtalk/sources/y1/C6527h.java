package y1;

import H1.C0525c1;
import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.Set;

/* renamed from: y1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6527h {
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* renamed from: a, reason: collision with root package name */
    protected final C0525c1 f37577a;

    /* renamed from: y1.h$a */
    public static class a extends AbstractC6520a {
        public C6527h build() {
            return new C6527h(this);
        }

        @Override // y1.AbstractC6520a
        public a self() {
            return this;
        }
    }

    protected C6527h(AbstractC6520a abstractC6520a) {
        this.f37577a = new C0525c1(abstractC6520a.f37565a, null);
    }

    public String getAdString() {
        return this.f37577a.zzj();
    }

    public String getContentUrl() {
        return this.f37577a.zzk();
    }

    @Deprecated
    public <T extends O1.a> Bundle getCustomEventExtrasBundle(Class<T> cls) {
        return this.f37577a.zzd(cls);
    }

    public Bundle getCustomTargeting() {
        return this.f37577a.zze();
    }

    public Set<String> getKeywords() {
        return this.f37577a.zzp();
    }

    public List<String> getNeighboringContentUrls() {
        return this.f37577a.zzn();
    }

    public <T> Bundle getNetworkExtrasBundle(Class<T> cls) {
        return this.f37577a.zzf(cls);
    }

    public String getRequestAgent() {
        return this.f37577a.zzm();
    }

    public boolean isTestDevice(Context context) {
        return this.f37577a.zzr(context);
    }

    public final C0525c1 zza() {
        return this.f37577a;
    }
}
