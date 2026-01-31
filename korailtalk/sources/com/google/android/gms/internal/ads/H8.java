package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class H8 implements I8 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f13281b = Logger.getLogger(H8.class.getName());

    /* renamed from: a, reason: collision with root package name */
    final ThreadLocal f13282a = new G8(this);

    public abstract L8 zza(String str, byte[] bArr, String str2);

    @Override // com.google.android.gms.internal.ads.I8
    public final L8 zzb(InterfaceC4277sD0 interfaceC4277sD0, M8 m8) throws EOFException {
        int iZza;
        long jZzc;
        long jZzb = interfaceC4277sD0.zzb();
        ((ByteBuffer) this.f13282a.get()).rewind().limit(8);
        do {
            iZza = interfaceC4277sD0.zza((ByteBuffer) this.f13282a.get());
            if (iZza == 8) {
                ((ByteBuffer) this.f13282a.get()).rewind();
                long jZze = K8.zze((ByteBuffer) this.f13282a.get());
                byte[] bArr = null;
                if (jZze < 8 && jZze > 1) {
                    Logger logger = f13281b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jZze);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f13282a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jZze == 1) {
                        ((ByteBuffer) this.f13282a.get()).limit(16);
                        interfaceC4277sD0.zza((ByteBuffer) this.f13282a.get());
                        ((ByteBuffer) this.f13282a.get()).position(8);
                        jZzc = K8.zzf((ByteBuffer) this.f13282a.get()) - 16;
                    } else {
                        jZzc = jZze == 0 ? interfaceC4277sD0.zzc() - interfaceC4277sD0.zzb() : jZze - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f13282a.get()).limit(((ByteBuffer) this.f13282a.get()).limit() + 16);
                        interfaceC4277sD0.zza((ByteBuffer) this.f13282a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.f13282a.get()).position() - 16; iPosition < ((ByteBuffer) this.f13282a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.f13282a.get()).position() - 16)] = ((ByteBuffer) this.f13282a.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j8 = jZzc;
                    L8 l8Zza = zza(str, bArr, m8 instanceof L8 ? ((L8) m8).zza() : "");
                    l8Zza.zzc(m8);
                    ((ByteBuffer) this.f13282a.get()).rewind();
                    l8Zza.zzb(interfaceC4277sD0, (ByteBuffer) this.f13282a.get(), j8, this);
                    return l8Zza;
                } catch (UnsupportedEncodingException e8) {
                    throw new RuntimeException(e8);
                }
            }
        } while (iZza >= 0);
        interfaceC4277sD0.zze(jZzb);
        throw new EOFException();
    }
}
