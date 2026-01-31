package t;

import android.media.CamcorderProfile;
import u.C6372C;
import z.AbstractC6584i;
import z.InterfaceC6582h;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6274f implements InterfaceC6582h {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f36667a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36668b;

    /* renamed from: c, reason: collision with root package name */
    private final x.c f36669c;

    public C6274f(String str, C6372C c6372c) throws NumberFormatException {
        boolean z8;
        int i8;
        try {
            i8 = Integer.parseInt(str);
            z8 = true;
        } catch (NumberFormatException unused) {
            androidx.camera.core.B0.w("Camera2CamcorderProfileProvider", "Camera id is not an integer: " + str + ", unable to create CamcorderProfileProvider");
            z8 = false;
            i8 = -1;
        }
        this.f36667a = z8;
        this.f36668b = i8;
        this.f36669c = new x.c((w.e) w.g.get(str, c6372c).get(w.e.class));
    }

    private AbstractC6584i a(int i8) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f36668b, i8);
        } catch (RuntimeException e8) {
            androidx.camera.core.B0.w("Camera2CamcorderProfileProvider", "Unable to get CamcorderProfile by quality: " + i8, e8);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return AbstractC6584i.fromCamcorderProfile(camcorderProfile);
        }
        return null;
    }

    @Override // z.InterfaceC6582h
    public AbstractC6584i get(int i8) {
        if (!this.f36667a || !CamcorderProfile.hasProfile(this.f36668b, i8)) {
            return null;
        }
        AbstractC6584i abstractC6584iA = a(i8);
        if (this.f36669c.hasValidVideoResolution(abstractC6584iA)) {
            return abstractC6584iA;
        }
        return null;
    }

    @Override // z.InterfaceC6582h
    public boolean hasProfile(int i8) {
        if (!this.f36667a || !CamcorderProfile.hasProfile(this.f36668b, i8)) {
            return false;
        }
        if (!this.f36669c.hasQuirk()) {
            return true;
        }
        return this.f36669c.hasValidVideoResolution(a(i8));
    }
}
