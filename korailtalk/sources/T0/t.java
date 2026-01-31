package T0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import e1.AbstractC5342c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f4839a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f4840b = {80, 75, 3, 4};

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z A(WeakReference weakReference, Context context, int i8, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return fromRawResSync(context, i8, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z B(Context context, String str, String str2) {
        z zVarFetchSync = AbstractC0786c.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && zVarFetchSync.getValue() != null) {
            Y0.g.getInstance().put(str2, (h) zVarFetchSync.getValue());
        }
        return zVarFetchSync;
    }

    private static String D(Context context, int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append("rawRes");
        sb.append(q(context) ? "_night_" : "_day_");
        sb.append(i8);
        return sb.toString();
    }

    public static void clearCache(Context context) {
        f4839a.clear();
        Y0.g.getInstance().clear();
        AbstractC0786c.networkCache(context).clear();
    }

    public static com.airbnb.lottie.q fromAsset(Context context, String str) {
        return fromAsset(context, str, "asset_" + str);
    }

    public static z fromAssetSync(Context context, String str) {
        return fromAssetSync(context, str, "asset_" + str);
    }

    @Deprecated
    public static com.airbnb.lottie.q fromJson(final JSONObject jSONObject, final String str) {
        return l(str, new Callable() { // from class: T0.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.fromJsonSync(jSONObject, str);
            }
        });
    }

    public static com.airbnb.lottie.q fromJsonInputStream(final InputStream inputStream, final String str) {
        return l(str, new Callable() { // from class: T0.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.fromJsonInputStreamSync(inputStream, str);
            }
        });
    }

    public static z fromJsonInputStreamSync(InputStream inputStream, String str) {
        return n(inputStream, str, true);
    }

    public static com.airbnb.lottie.q fromJsonReader(final AbstractC5342c abstractC5342c, final String str) {
        return l(str, new Callable() { // from class: T0.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.fromJsonReaderSync(abstractC5342c, str);
            }
        });
    }

    public static z fromJsonReaderSync(AbstractC5342c abstractC5342c, String str) {
        return o(abstractC5342c, str, true);
    }

    public static com.airbnb.lottie.q fromJsonString(final String str, final String str2) {
        return l(str2, new Callable() { // from class: T0.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.fromJsonStringSync(str, str2);
            }
        });
    }

    public static z fromJsonStringSync(String str, String str2) {
        return fromJsonReaderSync(AbstractC5342c.of(P7.n.buffer(P7.n.source(new ByteArrayInputStream(str.getBytes())))), str2);
    }

    @Deprecated
    public static z fromJsonSync(JSONObject jSONObject, String str) {
        return fromJsonStringSync(jSONObject.toString(), str);
    }

    public static com.airbnb.lottie.q fromRawRes(Context context, int i8) {
        return fromRawRes(context, i8, D(context, i8));
    }

    public static z fromRawResSync(Context context, int i8) {
        return fromRawResSync(context, i8, D(context, i8));
    }

    public static com.airbnb.lottie.q fromUrl(Context context, String str) {
        return fromUrl(context, str, "url_" + str);
    }

    public static z fromUrlSync(Context context, String str) {
        return fromUrlSync(context, str, str);
    }

    public static com.airbnb.lottie.q fromZipStream(final ZipInputStream zipInputStream, final String str) {
        return l(str, new Callable() { // from class: T0.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.fromZipStreamSync(zipInputStream, str);
            }
        });
    }

    public static z fromZipStreamSync(ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return p(zipInputStream, str);
        } finally {
            f1.j.closeQuietly(zipInputStream);
        }
    }

    private static com.airbnb.lottie.q l(final String str, Callable callable) {
        final h hVar = str == null ? null : Y0.g.getInstance().get(str);
        if (hVar != null) {
            return new com.airbnb.lottie.q(new Callable() { // from class: T0.r
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return t.t(hVar);
                }
            });
        }
        if (str != null) {
            Map map = f4839a;
            if (map.containsKey(str)) {
                return (com.airbnb.lottie.q) map.get(str);
            }
        }
        com.airbnb.lottie.q qVar = new com.airbnb.lottie.q(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qVar.addListener(new v() { // from class: T0.s
                @Override // T0.v
                public final void onResult(Object obj) {
                    t.u(str, atomicBoolean, (h) obj);
                }
            });
            qVar.addFailureListener(new v() { // from class: T0.j
                @Override // T0.v
                public final void onResult(Object obj) {
                    t.s(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                f4839a.put(str, qVar);
            }
        }
        return qVar;
    }

    private static u m(h hVar, String str) {
        for (u uVar : hVar.getImages().values()) {
            if (uVar.getFileName().equals(str)) {
                return uVar;
            }
        }
        return null;
    }

    private static z n(InputStream inputStream, String str, boolean z8) throws IOException {
        try {
            return fromJsonReaderSync(AbstractC5342c.of(P7.n.buffer(P7.n.source(inputStream))), str);
        } finally {
            if (z8) {
                f1.j.closeQuietly(inputStream);
            }
        }
    }

    private static z o(AbstractC5342c abstractC5342c, String str, boolean z8) throws IOException {
        try {
            try {
                h hVar = d1.w.parse(abstractC5342c);
                if (str != null) {
                    Y0.g.getInstance().put(str, hVar);
                }
                z zVar = new z(hVar);
                if (z8) {
                    f1.j.closeQuietly(abstractC5342c);
                }
                return zVar;
            } catch (Exception e8) {
                z zVar2 = new z((Throwable) e8);
                if (z8) {
                    f1.j.closeQuietly(abstractC5342c);
                }
                return zVar2;
            }
        } catch (Throwable th) {
            if (z8) {
                f1.j.closeQuietly(abstractC5342c);
            }
            throw th;
        }
    }

    private static z p(ZipInputStream zipInputStream, String str) throws IOException {
        HashMap map = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            h hVar = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().contains(".json")) {
                    hVar = (h) o(AbstractC5342c.of(P7.n.buffer(P7.n.source(zipInputStream))), null, false).getValue();
                } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                    map.put(name.split("/")[r1.length - 1], BitmapFactory.decodeStream(zipInputStream));
                } else {
                    zipInputStream.closeEntry();
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (hVar == null) {
                return new z((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                u uVarM = m(hVar, (String) entry.getKey());
                if (uVarM != null) {
                    uVarM.setBitmap(f1.j.resizeBitmapIfNeeded((Bitmap) entry.getValue(), uVarM.getWidth(), uVarM.getHeight()));
                }
            }
            for (Map.Entry<String, u> entry2 : hVar.getImages().entrySet()) {
                if (entry2.getValue().getBitmap() == null) {
                    return new z((Throwable) new IllegalStateException("There is no image for " + entry2.getValue().getFileName()));
                }
            }
            if (str != null) {
                Y0.g.getInstance().put(str, hVar);
            }
            return new z(hVar);
        } catch (IOException e8) {
            return new z((Throwable) e8);
        }
    }

    private static boolean q(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean r(P7.e eVar) {
        try {
            P7.e eVarPeek = eVar.peek();
            for (byte b9 : f4840b) {
                if (eVarPeek.readByte() != b9) {
                    return Boolean.FALSE;
                }
            }
            eVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e8) {
            f1.f.error("Failed to check zip file header", e8);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(String str, AtomicBoolean atomicBoolean, Throwable th) {
        f4839a.remove(str);
        atomicBoolean.set(true);
    }

    public static void setMaxCacheSize(int i8) {
        Y0.g.getInstance().resize(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ z t(h hVar) {
        return new z(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void u(String str, AtomicBoolean atomicBoolean, h hVar) {
        f4839a.remove(str);
        atomicBoolean.set(true);
    }

    public static com.airbnb.lottie.q fromRawRes(Context context, final int i8, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return l(str, new Callable() { // from class: T0.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.A(weakReference, applicationContext, i8, str);
            }
        });
    }

    public static z fromRawResSync(Context context, int i8, String str) {
        try {
            P7.e eVarBuffer = P7.n.buffer(P7.n.source(context.getResources().openRawResource(i8)));
            return r(eVarBuffer).booleanValue() ? fromZipStreamSync(new ZipInputStream(eVarBuffer.inputStream()), str) : fromJsonInputStreamSync(eVarBuffer.inputStream(), str);
        } catch (Resources.NotFoundException e8) {
            return new z((Throwable) e8);
        }
    }

    public static com.airbnb.lottie.q fromUrl(final Context context, final String str, final String str2) {
        return l(str2, new Callable() { // from class: T0.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.B(context, str, str2);
            }
        });
    }

    public static z fromUrlSync(Context context, String str, String str2) {
        z zVarFetchSync = AbstractC0786c.networkFetcher(context).fetchSync(str, str2);
        if (str2 != null && zVarFetchSync.getValue() != null) {
            Y0.g.getInstance().put(str2, (h) zVarFetchSync.getValue());
        }
        return zVarFetchSync;
    }

    public static com.airbnb.lottie.q fromAsset(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return l(str2, new Callable() { // from class: T0.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return t.fromAssetSync(applicationContext, str, str2);
            }
        });
    }

    public static z fromAssetSync(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return fromJsonInputStreamSync(context.getAssets().open(str), str2);
            }
            return fromZipStreamSync(new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e8) {
            return new z((Throwable) e8);
        }
    }
}
