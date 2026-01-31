package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.Trace;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.xL0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4863xL0 implements InterfaceC5091zL0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23692a;

    @Deprecated
    public C4863xL0() {
        this.f23692a = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC5091zL0
    public final AL0 zzd(C4977yL0 c4977yL0) throws Throwable {
        Context context;
        int i8 = AbstractC2281am0.zza;
        if (i8 >= 23 && (i8 >= 31 || ((context = this.f23692a) != null && i8 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen")))) {
            int iZzb = AbstractC4239rv.zzb(c4977yL0.zzc.zzn);
            AbstractC2834fc0.zze("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(AbstractC2281am0.zzC(iZzb)));
            C3610mL0 c3610mL0 = new C3610mL0(iZzb);
            c3610mL0.zze(true);
            return c3610mL0.zzc(c4977yL0);
        }
        MediaCodec mediaCodec = null;
        try {
            String str = c4977yL0.zza.zza;
            Trace.beginSection("createCodec:".concat(str));
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            Trace.endSection();
            try {
                Trace.beginSection("configureCodec");
                mediaCodecCreateByCodecName.configure(c4977yL0.zzb, c4977yL0.zzd, (MediaCrypto) null, 0);
                Trace.endSection();
                Trace.beginSection("startCodec");
                mediaCodecCreateByCodecName.start();
                Trace.endSection();
                return new C3384kM0(mediaCodecCreateByCodecName, null);
            } catch (IOException | RuntimeException e8) {
                e = e8;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw e;
            }
        } catch (IOException e9) {
            e = e9;
        } catch (RuntimeException e10) {
            e = e10;
        }
    }

    public C4863xL0(Context context) {
        this.f23692a = context;
    }
}
