package androidx.core.graphics.drawable;

import Q7.X;
import Z.h;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.kakao.sdk.template.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_URI = 4;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;

    /* renamed from: c, reason: collision with root package name */
    static final PorterDuff.Mode f8988c = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    Object f8989a;

    /* renamed from: b, reason: collision with root package name */
    PorterDuff.Mode f8990b;
    public byte[] mData;
    public int mInt1;
    public int mInt2;
    public Parcelable mParcelable;
    public String mString1;
    public ColorStateList mTintList;
    public String mTintModeStr;
    public int mType;

    static class a {
        static IconCompat a(Context context, Icon icon) {
            int iE = e(icon);
            if (iE == 2) {
                String strD = d(icon);
                try {
                    return IconCompat.createWithResource(IconCompat.b(context, strD), strD, c(icon));
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            }
            if (iE == 4) {
                return IconCompat.createWithContentUri(f(icon));
            }
            if (iE == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(f(icon));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f8989a = icon;
            return iconCompat;
        }

        static IconCompat b(Object obj) {
            h.checkNotNull(obj);
            int iE = e(obj);
            if (iE == 2) {
                return IconCompat.createWithResource(null, d(obj), c(obj));
            }
            if (iE == 4) {
                return IconCompat.createWithContentUri(f(obj));
            }
            if (iE == 6) {
                return IconCompat.createWithAdaptiveBitmapContentUri(f(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f8989a = obj;
            return iconCompat;
        }

        static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            }
        }

        static String d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            }
        }

        static int e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e8);
                return -1;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                return -1;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            }
        }

        static Uri f(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            }
        }

        static Drawable g(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon h(IconCompat iconCompat, Context context) {
            Icon iconCreateWithBitmap;
            switch (iconCompat.mType) {
                case -1:
                    return (Icon) iconCompat.f8989a;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f8989a);
                    break;
                case 2:
                    iconCreateWithBitmap = Icon.createWithResource(iconCompat.getResPackage(), iconCompat.mInt1);
                    break;
                case 3:
                    iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.f8989a, iconCompat.mInt1, iconCompat.mInt2);
                    break;
                case 4:
                    iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.f8989a);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f8989a, false));
                        break;
                    } else {
                        iconCreateWithBitmap = b.b((Bitmap) iconCompat.f8989a);
                        break;
                    }
                case 6:
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 30) {
                        iconCreateWithBitmap = d.a(iconCompat.getUri());
                        break;
                    } else {
                        if (context == null) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.getUri());
                        }
                        InputStream uriInputStream = iconCompat.getUriInputStream(context);
                        if (uriInputStream == null) {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.getUri());
                        }
                        if (i8 < 26) {
                            iconCreateWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(uriInputStream), false));
                            break;
                        } else {
                            iconCreateWithBitmap = b.b(BitmapFactory.decodeStream(uriInputStream));
                            break;
                        }
                    }
            }
            ColorStateList colorStateList = iconCompat.mTintList;
            if (colorStateList != null) {
                iconCreateWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f8990b;
            if (mode != IconCompat.f8988c) {
                iconCreateWithBitmap.setTintMode(mode);
            }
            return iconCreateWithBitmap;
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.mType = -1;
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.f8990b = f8988c;
        this.mTintModeStr = null;
    }

    static Bitmap a(Bitmap bitmap, boolean z8) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f8 = iMin;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (z8) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    static Resources b(Context context, String str) throws PackageManager.NameNotFoundException {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e8);
            return null;
        }
    }

    private static String c(int i8) {
        switch (i8) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public static IconCompat createFromBundle(Bundle bundle) {
        int i8 = bundle.getInt("type");
        IconCompat iconCompat = new IconCompat(i8);
        iconCompat.mInt1 = bundle.getInt("int1");
        iconCompat.mInt2 = bundle.getInt("int2");
        iconCompat.mString1 = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.mTintList = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f8990b = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i8) {
            case -1:
            case 1:
            case 5:
                iconCompat.f8989a = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i8);
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.f8989a = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.f8989a = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat createFromIcon(Context context, Icon icon) {
        h.checkNotNull(icon);
        return a.a(context, icon);
    }

    public static IconCompat createFromIconOrNullIfZeroResId(Icon icon) {
        if (a.e(icon) == 2 && a.c(icon) == 0) {
            return null;
        }
        return a.b(icon);
    }

    public static IconCompat createWithAdaptiveBitmap(Bitmap bitmap) {
        Z.c.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(5);
        iconCompat.f8989a = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(String str) {
        Z.c.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f8989a = str;
        return iconCompat;
    }

    public static IconCompat createWithBitmap(Bitmap bitmap) {
        Z.c.requireNonNull(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f8989a = bitmap;
        return iconCompat;
    }

    public static IconCompat createWithContentUri(String str) {
        Z.c.requireNonNull(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f8989a = str;
        return iconCompat;
    }

    public static IconCompat createWithData(byte[] bArr, int i8, int i9) {
        Z.c.requireNonNull(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f8989a = bArr;
        iconCompat.mInt1 = i8;
        iconCompat.mInt2 = i9;
        return iconCompat;
    }

    public static IconCompat createWithResource(Context context, int i8) {
        Z.c.requireNonNull(context);
        return createWithResource(context.getResources(), context.getPackageName(), i8);
    }

    public void addToShortcutIntent(Intent intent, Drawable drawable, Context context) throws PackageManager.NameNotFoundException {
        Bitmap bitmapCopy;
        checkResource(context);
        int i8 = this.mType;
        if (i8 == 1) {
            bitmapCopy = (Bitmap) this.f8989a;
            if (drawable != null) {
                bitmapCopy = bitmapCopy.copy(bitmapCopy.getConfig(), true);
            }
        } else if (i8 == 2) {
            try {
                Context contextCreatePackageContext = context.createPackageContext(getResPackage(), 0);
                if (drawable == null) {
                    intent.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(contextCreatePackageContext, this.mInt1));
                    return;
                }
                Drawable drawable2 = androidx.core.content.a.getDrawable(contextCreatePackageContext, this.mInt1);
                if (drawable2.getIntrinsicWidth() <= 0 || drawable2.getIntrinsicHeight() <= 0) {
                    int launcherLargeIconSize = ((ActivityManager) contextCreatePackageContext.getSystemService("activity")).getLauncherLargeIconSize();
                    bitmapCopy = Bitmap.createBitmap(launcherLargeIconSize, launcherLargeIconSize, Bitmap.Config.ARGB_8888);
                } else {
                    bitmapCopy = Bitmap.createBitmap(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                }
                drawable2.setBounds(0, 0, bitmapCopy.getWidth(), bitmapCopy.getHeight());
                drawable2.draw(new Canvas(bitmapCopy));
            } catch (PackageManager.NameNotFoundException e8) {
                throw new IllegalArgumentException("Can't find package " + this.f8989a, e8);
            }
        } else {
            if (i8 != 5) {
                throw new IllegalArgumentException("Icon type not supported for intent shortcuts");
            }
            bitmapCopy = a((Bitmap) this.f8989a, true);
        }
        if (drawable != null) {
            int width = bitmapCopy.getWidth();
            int height = bitmapCopy.getHeight();
            drawable.setBounds(width / 2, height / 2, width, height);
            drawable.draw(new Canvas(bitmapCopy));
        }
        intent.putExtra("android.intent.extra.shortcut.ICON", bitmapCopy);
    }

    public void checkResource(Context context) {
        Object obj;
        if (this.mType != 2 || (obj = this.f8989a) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                return;
            }
            String resPackage = getResPackage();
            int identifier = b(context, resPackage).getIdentifier(str4, str3, str5);
            if (this.mInt1 != identifier) {
                StringBuilder sb = new StringBuilder();
                sb.append("Id has changed for ");
                sb.append(resPackage);
                sb.append(X.SPACE);
                sb.append(str);
                this.mInt1 = identifier;
            }
        }
    }

    public Bitmap getBitmap() {
        int i8 = this.mType;
        if (i8 == -1) {
            Object obj = this.f8989a;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i8 == 1) {
            return (Bitmap) this.f8989a;
        }
        if (i8 == 5) {
            return a((Bitmap) this.f8989a, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int getResId() {
        int i8 = this.mType;
        if (i8 == -1) {
            return a.c(this.f8989a);
        }
        if (i8 == 2) {
            return this.mInt1;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String getResPackage() {
        int i8 = this.mType;
        if (i8 == -1) {
            return a.d(this.f8989a);
        }
        if (i8 == 2) {
            String str = this.mString1;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f8989a).split(":", -1)[0] : this.mString1;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int getType() {
        int i8 = this.mType;
        return i8 == -1 ? a.e(this.f8989a) : i8;
    }

    public Uri getUri() {
        int i8 = this.mType;
        if (i8 == -1) {
            return a.f(this.f8989a);
        }
        if (i8 == 4 || i8 == 6) {
            return Uri.parse((String) this.f8989a);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream getUriInputStream(Context context) {
        Uri uri = getUri();
        String scheme = uri.getScheme();
        if (Constants.CONTENT.equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uri);
            } catch (Exception e8) {
                Log.w("IconCompat", "Unable to load image from URI: " + uri, e8);
                return null;
            }
        }
        try {
            return new FileInputStream(new File((String) this.f8989a));
        } catch (FileNotFoundException e9) {
            Log.w("IconCompat", "Unable to load image from path: " + uri, e9);
            return null;
        }
    }

    public Drawable loadDrawable(Context context) {
        checkResource(context);
        return a.g(toIcon(context), context);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPostParceling() {
        this.f8990b = PorterDuff.Mode.valueOf(this.mTintModeStr);
        switch (this.mType) {
            case -1:
                Parcelable parcelable = this.mParcelable;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                this.f8989a = parcelable;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.mParcelable;
                if (parcelable2 != null) {
                    this.f8989a = parcelable2;
                    return;
                }
                byte[] bArr = this.mData;
                this.f8989a = bArr;
                this.mType = 3;
                this.mInt1 = 0;
                this.mInt2 = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.mData, Charset.forName("UTF-16"));
                this.f8989a = str;
                if (this.mType == 2 && this.mString1 == null) {
                    this.mString1 = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f8989a = this.mData;
                return;
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void onPreParceling(boolean z8) {
        this.mTintModeStr = this.f8990b.name();
        switch (this.mType) {
            case -1:
                if (z8) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                this.mParcelable = (Parcelable) this.f8989a;
                return;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (!z8) {
                    this.mParcelable = (Parcelable) this.f8989a;
                    return;
                }
                Bitmap bitmap = (Bitmap) this.f8989a;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                this.mData = byteArrayOutputStream.toByteArray();
                return;
            case 2:
                this.mData = ((String) this.f8989a).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.mData = (byte[]) this.f8989a;
                return;
            case 4:
            case 6:
                this.mData = this.f8989a.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public IconCompat setTint(int i8) {
        return setTintList(ColorStateList.valueOf(i8));
    }

    public IconCompat setTintList(ColorStateList colorStateList) {
        this.mTintList = colorStateList;
        return this;
    }

    public IconCompat setTintMode(PorterDuff.Mode mode) {
        this.f8990b = mode;
        return this;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        switch (this.mType) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.f8989a);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.f8989a);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.f8989a);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.f8989a);
                break;
        }
        bundle.putInt("type", this.mType);
        bundle.putInt("int1", this.mInt1);
        bundle.putInt("int2", this.mInt2);
        bundle.putString("string1", this.mString1);
        ColorStateList colorStateList = this.mTintList;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.f8990b;
        if (mode != f8988c) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    @Deprecated
    public Icon toIcon() {
        return toIcon(null);
    }

    public String toString() {
        if (this.mType == -1) {
            return String.valueOf(this.f8989a);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(c(this.mType));
        switch (this.mType) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f8989a).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f8989a).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.mString1);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(getResId())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.mInt1);
                if (this.mInt2 != 0) {
                    sb.append(" off=");
                    sb.append(this.mInt2);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f8989a);
                break;
        }
        if (this.mTintList != null) {
            sb.append(" tint=");
            sb.append(this.mTintList);
        }
        if (this.f8990b != f8988c) {
            sb.append(" mode=");
            sb.append(this.f8990b);
        }
        sb.append(")");
        return sb.toString();
    }

    public Icon toIcon(Context context) {
        return a.h(this, context);
    }

    public static IconCompat createFromIcon(Icon icon) {
        return a.b(icon);
    }

    public static IconCompat createWithResource(Resources resources, String str, int i8) {
        Z.c.requireNonNull(str);
        if (i8 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.mInt1 = i8;
            if (resources != null) {
                try {
                    iconCompat.f8989a = resources.getResourceName(i8);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f8989a = str;
            }
            iconCompat.mString1 = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static IconCompat createWithAdaptiveBitmapContentUri(Uri uri) {
        Z.c.requireNonNull(uri);
        return createWithAdaptiveBitmapContentUri(uri.toString());
    }

    public static IconCompat createWithContentUri(Uri uri) {
        Z.c.requireNonNull(uri);
        return createWithContentUri(uri.toString());
    }

    IconCompat(int i8) {
        this.mData = null;
        this.mParcelable = null;
        this.mInt1 = 0;
        this.mInt2 = 0;
        this.mTintList = null;
        this.f8990b = f8988c;
        this.mTintModeStr = null;
        this.mType = i8;
    }
}
