package com.google.android.datatransport.cct;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.kakao.sdk.common.Constants;
import io.grpc.internal.U;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import m1.C5904b;
import n1.AbstractC5925a;
import n1.AbstractC5935k;
import n1.AbstractC5937m;
import n1.AbstractC5939o;
import n1.AbstractC5940p;
import n1.AbstractC5942r;
import n1.AbstractC5944t;
import n1.AbstractC5945u;
import n1.EnumC5926b;
import n4.C5950a;
import o1.h;
import o3.C6035c;
import o3.InterfaceC6033a;
import p1.f;
import p1.g;
import p1.m;
import q1.AbstractC6104a;
import r1.AbstractC6170b;
import w1.InterfaceC6458a;

/* loaded from: classes.dex */
final class d implements m {

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f11730b;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6458a f11732d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6458a f11733e;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6033a f11729a = AbstractC5939o.zza();

    /* renamed from: c, reason: collision with root package name */
    final URL f11731c = d(com.google.android.datatransport.cct.a.f11721c);

    /* renamed from: f, reason: collision with root package name */
    private final int f11734f = 40000;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f11735a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC5935k f11736b;

        /* renamed from: c, reason: collision with root package name */
        final String f11737c;

        a(URL url, AbstractC5935k abstractC5935k, String str) {
            this.f11735a = url;
            this.f11736b = abstractC5935k;
            this.f11737c = str;
        }

        a a(URL url) {
            return new a(url, this.f11736b, this.f11737c);
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f11738a;

        /* renamed from: b, reason: collision with root package name */
        final URL f11739b;

        /* renamed from: c, reason: collision with root package name */
        final long f11740c;

        b(int i8, URL url, long j8) {
            this.f11738a = i8;
            this.f11739b = url;
            this.f11740c = j8;
        }
    }

    d(Context context, InterfaceC6458a interfaceC6458a, InterfaceC6458a interfaceC6458a2) {
        this.f11730b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f11732d = interfaceC6458a2;
        this.f11733e = interfaceC6458a;
    }

    static /* synthetic */ a a(a aVar, b bVar) {
        URL url = bVar.f11739b;
        if (url == null) {
            return null;
        }
        AbstractC6104a.d("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f11739b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b b(a aVar) throws IOException {
        AbstractC6104a.d("CctTransportBackend", "Making request to: %s", aVar.f11735a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f11735a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f11734f);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(U.HTTP_METHOD);
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "2.2.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f11737c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        WritableByteChannel writableByteChannelNewChannel = Channels.newChannel(httpURLConnection.getOutputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                try {
                    this.f11729a.encode(aVar.f11736b, new OutputStreamWriter(gZIPOutputStream));
                    gZIPOutputStream.close();
                    writableByteChannelNewChannel.write(ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
                    int responseCode = httpURLConnection.getResponseCode();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Status Code: ");
                    sb.append(responseCode);
                    AbstractC6104a.i("CctTransportBackend", sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Content-Type: ");
                    sb2.append(httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC6104a.i("CctTransportBackend", sb2.toString());
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Content-Encoding: ");
                    sb3.append(httpURLConnection.getHeaderField("Content-Encoding"));
                    AbstractC6104a.i("CctTransportBackend", sb3.toString());
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
                        InputStream inputStream = (headerField == null || !headerField.equals("gzip")) ? httpURLConnection.getInputStream() : new GZIPInputStream(httpURLConnection.getInputStream());
                        try {
                            return new b(responseCode, null, AbstractC5944t.zza(new InputStreamReader(inputStream)).zza());
                        } finally {
                            inputStream.close();
                        }
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                } catch (IOException | C6035c e8) {
                    AbstractC6104a.e("CctTransportBackend", "Couldn't encode request, returning with 400", e8);
                    return new b(400, null, 0L);
                }
            } finally {
                gZIPOutputStream.close();
            }
        } finally {
            writableByteChannelNewChannel.close();
        }
    }

    private static URL d(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // p1.m
    public h decorate(h hVar) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.f11730b.getActiveNetworkInfo();
        h.a aVarAddMetadata = hVar.toBuilder().addMetadata("sdk-version", Build.VERSION.SDK_INT).addMetadata("model", Build.MODEL).addMetadata("hardware", Build.HARDWARE).addMetadata(Constants.DEVICE, Build.DEVICE).addMetadata(C5950a.FLAVOR, Build.PRODUCT).addMetadata("os-uild", Build.ID).addMetadata("manufacturer", Build.MANUFACTURER).addMetadata("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        h.a aVarAddMetadata2 = aVarAddMetadata.addMetadata("tz-offset", TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000).addMetadata("net-type", activeNetworkInfo == null ? AbstractC5945u.c.zzs.zza() : activeNetworkInfo.getType());
        if (activeNetworkInfo == null) {
            subtype = AbstractC5945u.b.zza.zza();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = AbstractC5945u.b.zzu.zza();
            } else if (AbstractC5945u.b.zza(subtype) == null) {
                subtype = 0;
            }
        }
        return aVarAddMetadata2.addMetadata("mobile-subtype", subtype).build();
    }

    @Override // p1.m
    public g send(f fVar) {
        AbstractC5940p.a aVarZza;
        HashMap map = new HashMap();
        for (h hVar : fVar.getEvents()) {
            String transportName = hVar.getTransportName();
            if (map.containsKey(transportName)) {
                ((List) map.get(transportName)).add(hVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(hVar);
                map.put(transportName, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            h hVar2 = (h) ((List) entry.getValue()).get(0);
            AbstractC5942r.a aVarZza2 = AbstractC5942r.zza().zza(EnumC5926b.zza).zza(this.f11733e.getTime()).zzb(this.f11732d.getTime()).zza(AbstractC5937m.zza().zza(AbstractC5937m.b.zzb).zza(AbstractC5925a.zza().zza(hVar2.getInteger("sdk-version")).zze(hVar2.get("model")).zzc(hVar2.get("hardware")).zza(hVar2.get(Constants.DEVICE)).zzg(hVar2.get(C5950a.FLAVOR)).zzf(hVar2.get("os-uild")).zzd(hVar2.get("manufacturer")).zzb(hVar2.get("fingerprint")).zza()).zza());
            try {
                aVarZza2.zzb(Integer.valueOf((String) entry.getKey()).intValue());
            } catch (NumberFormatException unused) {
                aVarZza2.zzb((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (h hVar3 : (List) entry.getValue()) {
                o1.g encodedPayload = hVar3.getEncodedPayload();
                C5904b encoding = encodedPayload.getEncoding();
                if (encoding.equals(C5904b.of("proto"))) {
                    aVarZza = AbstractC5940p.zza(encodedPayload.getBytes());
                } else if (encoding.equals(C5904b.of("json"))) {
                    aVarZza = AbstractC5940p.zza(new String(encodedPayload.getBytes(), Charset.forName("UTF-8")));
                } else {
                    AbstractC6104a.w("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", encoding);
                }
                aVarZza.zza(hVar3.getEventMillis()).zzb(hVar3.getUptimeMillis()).zzc(hVar3.getLong("tz-offset")).zza(AbstractC5945u.zza().zza(AbstractC5945u.c.zza(hVar3.getInteger("net-type"))).zza(AbstractC5945u.b.zza(hVar3.getInteger("mobile-subtype"))).zza());
                if (hVar3.getCode() != null) {
                    aVarZza.zza(hVar3.getCode().intValue());
                }
                arrayList3.add(aVarZza.zza());
            }
            aVarZza2.zza(arrayList3);
            arrayList2.add(aVarZza2.zza());
        }
        AbstractC5935k abstractC5935kZza = AbstractC5935k.zza(arrayList2);
        URL urlD = this.f11731c;
        if (fVar.getExtras() != null) {
            try {
                com.google.android.datatransport.cct.a aVarFromByteArray = com.google.android.datatransport.cct.a.fromByteArray(fVar.getExtras());
                aPIKey = aVarFromByteArray.getAPIKey() != null ? aVarFromByteArray.getAPIKey() : null;
                if (aVarFromByteArray.getEndPoint() != null) {
                    urlD = d(aVarFromByteArray.getEndPoint());
                }
            } catch (IllegalArgumentException unused2) {
                return g.fatalError();
            }
        }
        try {
            b bVar = (b) AbstractC6170b.retry(5, new a(urlD, abstractC5935kZza, aPIKey), com.google.android.datatransport.cct.b.zza(this), c.zza());
            int i8 = bVar.f11738a;
            if (i8 == 200) {
                return g.ok(bVar.f11740c);
            }
            if (i8 < 500 && i8 != 404) {
                return g.fatalError();
            }
            return g.transientError();
        } catch (IOException e8) {
            AbstractC6104a.e("CctTransportBackend", "Could not make request to the backend", e8);
            return g.transientError();
        }
    }
}
