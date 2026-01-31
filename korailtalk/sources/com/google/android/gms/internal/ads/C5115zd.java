package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5115zd {

    /* renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f24189a = new ByteArrayOutputStream(4096);

    /* renamed from: b, reason: collision with root package name */
    Base64OutputStream f24190b = new Base64OutputStream(this.f24189a, 10);

    public final String toString() throws IOException {
        String string;
        try {
            this.f24190b.close();
        } catch (IOException e8) {
            L1.n.zzh("HashManager: Unable to convert to Base64.", e8);
        }
        try {
            try {
                this.f24189a.close();
                string = this.f24189a.toString();
            } catch (IOException e9) {
                L1.n.zzh("HashManager: Unable to convert to Base64.", e9);
                string = "";
            }
            return string;
        } finally {
            this.f24189a = null;
            this.f24190b = null;
        }
    }
}
