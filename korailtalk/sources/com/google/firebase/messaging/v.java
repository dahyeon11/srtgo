package com.google.firebase.messaging;

import I2.AbstractC0608l;
import I2.AbstractC0611o;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import i2.AbstractC5683p;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
class v implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f25816a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC0608l f25817b;

    /* renamed from: c, reason: collision with root package name */
    private volatile InputStream f25818c;

    private v(URL url) {
        this.f25816a = url;
    }

    private byte[] a() throws IOException {
        URLConnection uRLConnectionOpenConnection = this.f25816a.openConnection();
        if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        try {
            this.f25818c = inputStream;
            byte[] bArrZza = A2.h.zza(A2.h.zza(inputStream, 1048577L));
            if (inputStream != null) {
                inputStream.close();
            }
            if (Log.isLoggable(AbstractC5186c.TAG, 2)) {
                int length = bArrZza.length;
                String strValueOf = String.valueOf(this.f25816a);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 34);
                sb.append("Downloaded ");
                sb.append(length);
                sb.append(" bytes from ");
                sb.append(strValueOf);
            }
            if (bArrZza.length <= 1048576) {
                return bArrZza;
            }
            throw new IOException("Image exceeds max size of 1048576");
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    A2.k.zza(th, th2);
                }
            }
            throw th;
        }
    }

    public static v create(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new v(new URL(str));
        } catch (MalformedURLException unused) {
            String strValueOf = String.valueOf(str);
            Log.w(AbstractC5186c.TAG, strValueOf.length() != 0 ? "Not downloading image, bad URL: ".concat(strValueOf) : new String("Not downloading image, bad URL: "));
            return null;
        }
    }

    public Bitmap blockingDownload() throws IOException {
        String strValueOf = String.valueOf(this.f25816a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
        sb.append("Starting download of: ");
        sb.append(strValueOf);
        byte[] bArrA = a();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrA, 0, bArrA.length);
        if (bitmapDecodeByteArray == null) {
            String strValueOf2 = String.valueOf(this.f25816a);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
            sb2.append("Failed to decode image: ");
            sb2.append(strValueOf2);
            throw new IOException(sb2.toString());
        }
        if (Log.isLoggable(AbstractC5186c.TAG, 3)) {
            String strValueOf3 = String.valueOf(this.f25816a);
            StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 31);
            sb3.append("Successfully downloaded image: ");
            sb3.append(strValueOf3);
        }
        return bitmapDecodeByteArray;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            A2.i.zza(this.f25818c);
        } catch (NullPointerException e8) {
            Log.e(AbstractC5186c.TAG, "Failed to close the image download stream.", e8);
        }
    }

    public AbstractC0608l getTask() {
        return (AbstractC0608l) AbstractC5683p.checkNotNull(this.f25817b);
    }

    public void start(Executor executor) {
        this.f25817b = AbstractC0611o.call(executor, new Callable(this) { // from class: com.google.firebase.messaging.u

            /* renamed from: a, reason: collision with root package name */
            private final v f25815a;

            {
                this.f25815a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f25815a.blockingDownload();
            }
        });
    }
}
