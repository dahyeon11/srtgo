package X0;

import T0.InterfaceC0785b;
import T0.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import f1.f;
import f1.j;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d, reason: collision with root package name */
    private static final Object f5411d = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f5412a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5413b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f5414c;

    public b(Drawable.Callback callback, String str, InterfaceC0785b interfaceC0785b, Map<String, u> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f5413b = str;
        } else {
            this.f5413b = str + '/';
        }
        if (callback instanceof View) {
            this.f5412a = ((View) callback).getContext();
            this.f5414c = map;
            setDelegate(interfaceC0785b);
        } else {
            f.warning("LottieDrawable must be inside of a view for images to work.");
            this.f5414c = new HashMap();
            this.f5412a = null;
        }
    }

    private Bitmap a(String str, Bitmap bitmap) {
        synchronized (f5411d) {
            ((u) this.f5414c.get(str)).setBitmap(bitmap);
        }
        return bitmap;
    }

    public Bitmap bitmapForId(String str) {
        u uVar = (u) this.f5414c.get(str);
        if (uVar == null) {
            return null;
        }
        Bitmap bitmap = uVar.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        String fileName = uVar.getFileName();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (fileName.startsWith("data:") && fileName.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
                return a(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException e8) {
                f.warning("data URL did not have correct base64 format.", e8);
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.f5413b)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                return a(str, j.resizeBitmapIfNeeded(BitmapFactory.decodeStream(this.f5412a.getAssets().open(this.f5413b + fileName), null, options), uVar.getWidth(), uVar.getHeight()));
            } catch (IllegalArgumentException e9) {
                f.warning("Unable to decode image.", e9);
                return null;
            }
        } catch (IOException e10) {
            f.warning("Unable to open asset.", e10);
            return null;
        }
    }

    public u getImageAssetById(String str) {
        return (u) this.f5414c.get(str);
    }

    public boolean hasSameContext(Context context) {
        return (context == null && this.f5412a == null) || this.f5412a.equals(context);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmap2 = ((u) this.f5414c.get(str)).getBitmap();
            a(str, bitmap);
            return bitmap2;
        }
        u uVar = (u) this.f5414c.get(str);
        Bitmap bitmap3 = uVar.getBitmap();
        uVar.setBitmap(null);
        return bitmap3;
    }

    public void setDelegate(InterfaceC0785b interfaceC0785b) {
    }
}
