package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class F2 {

    /* renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f12910a;

    /* renamed from: b, reason: collision with root package name */
    private final DataOutputStream f12911b;

    public F2() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f12910a = byteArrayOutputStream;
        this.f12911b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] zza(E2 e22) throws IOException {
        this.f12910a.reset();
        try {
            a(this.f12911b, e22.zza);
            String str = e22.zzb;
            if (str == null) {
                str = "";
            }
            a(this.f12911b, str);
            this.f12911b.writeLong(e22.zzc);
            this.f12911b.writeLong(e22.zzd);
            this.f12911b.write(e22.zze);
            this.f12911b.flush();
            return this.f12910a.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
