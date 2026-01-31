package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.r;
import androidx.core.graphics.drawable.IconCompat;
import com.kakao.sdk.template.Constants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
abstract class u {
    public static final String TAG = "NotificationCompat";

    /* renamed from: b */
    private static Field f8878b;

    /* renamed from: c */
    private static boolean f8879c;

    /* renamed from: e */
    private static Field f8881e;

    /* renamed from: f */
    private static Field f8882f;

    /* renamed from: g */
    private static Field f8883g;

    /* renamed from: h */
    private static Field f8884h;

    /* renamed from: i */
    private static boolean f8885i;

    /* renamed from: a */
    private static final Object f8877a = new Object();

    /* renamed from: d */
    private static final Object f8880d = new Object();

    private static boolean a() throws NoSuchFieldException, ClassNotFoundException, SecurityException {
        if (f8885i) {
            return false;
        }
        try {
            if (f8881e == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f8882f = cls.getDeclaredField("icon");
                f8883g = cls.getDeclaredField(Constants.TITLE);
                f8884h = cls.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f8881e = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e8) {
            Log.e(TAG, "Unable to access notification actions", e8);
            f8885i = true;
        } catch (NoSuchFieldException e9) {
            Log.e(TAG, "Unable to access notification actions", e9);
            f8885i = true;
        }
        return !f8885i;
    }

    private static D b(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
        HashSet hashSet = new HashSet();
        if (stringArrayList != null) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
        }
        return new D(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
    }

    public static SparseArray<Bundle> buildActionExtrasMap(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i8 = 0; i8 < size; i8++) {
            Bundle bundle = list.get(i8);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i8, bundle);
            }
        }
        return sparseArray;
    }

    private static D[] c(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        D[] dArr = new D[bundleArr.length];
        for (int i8 = 0; i8 < bundleArr.length; i8++) {
            dArr[i8] = b(bundleArr[i8]);
        }
        return dArr;
    }

    static r.b d(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("extras");
        return new r.b(bundle.getInt("icon"), bundle.getCharSequence(Constants.TITLE), (PendingIntent) bundle.getParcelable("actionIntent"), bundle.getBundle("extras"), c(f(bundle, "remoteInputs")), c(f(bundle, "dataOnlyRemoteInputs")), bundle2 != null ? bundle2.getBoolean("android.support.allowGeneratedReplies", false) : false, bundle.getInt("semanticAction"), bundle.getBoolean("showsUserInterface"), false, false);
    }

    private static Object[] e(Notification notification) {
        synchronized (f8880d) {
            if (!a()) {
                return null;
            }
            try {
                return (Object[]) f8881e.get(notification);
            } catch (IllegalAccessException e8) {
                Log.e(TAG, "Unable to access notification actions", e8);
                f8885i = true;
                return null;
            }
        }
    }

    private static Bundle[] f(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    static Bundle g(r.b bVar) {
        Bundle bundle = new Bundle();
        IconCompat iconCompat = bVar.getIconCompat();
        bundle.putInt("icon", iconCompat != null ? iconCompat.getResId() : 0);
        bundle.putCharSequence(Constants.TITLE, bVar.getTitle());
        bundle.putParcelable("actionIntent", bVar.getActionIntent());
        Bundle bundle2 = bVar.getExtras() != null ? new Bundle(bVar.getExtras()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", bVar.getAllowGeneratedReplies());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", i(bVar.getRemoteInputs()));
        bundle.putBoolean("showsUserInterface", bVar.getShowsUserInterface());
        bundle.putInt("semanticAction", bVar.getSemanticAction());
        return bundle;
    }

    public static r.b getAction(Notification notification, int i8) {
        SparseArray sparseParcelableArray;
        synchronized (f8880d) {
            try {
                try {
                    Object[] objArrE = e(notification);
                    if (objArrE != null) {
                        Object obj = objArrE[i8];
                        Bundle extras = getExtras(notification);
                        return readAction(f8882f.getInt(obj), (CharSequence) f8883g.get(obj), (PendingIntent) f8884h.get(obj), (extras == null || (sparseParcelableArray = extras.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i8));
                    }
                } catch (IllegalAccessException e8) {
                    Log.e(TAG, "Unable to access notification actions", e8);
                    f8885i = true;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static int getActionCount(Notification notification) {
        int length;
        synchronized (f8880d) {
            try {
                Object[] objArrE = e(notification);
                length = objArrE != null ? objArrE.length : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    public static Bundle getExtras(Notification notification) {
        synchronized (f8877a) {
            if (f8879c) {
                return null;
            }
            try {
                if (f8878b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e(TAG, "Notification.extras field is not of type Bundle");
                        f8879c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f8878b = declaredField;
                }
                Bundle bundle = (Bundle) f8878b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f8878b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e8) {
                Log.e(TAG, "Unable to access notification extras", e8);
                f8879c = true;
                return null;
            } catch (NoSuchFieldException e9) {
                Log.e(TAG, "Unable to access notification extras", e9);
                f8879c = true;
                return null;
            }
        }
    }

    private static Bundle h(D d9) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", d9.getResultKey());
        bundle.putCharSequence("label", d9.getLabel());
        bundle.putCharSequenceArray("choices", d9.getChoices());
        bundle.putBoolean("allowFreeFormInput", d9.getAllowFreeFormInput());
        bundle.putBundle("extras", d9.getExtras());
        Set<String> allowedDataTypes = d9.getAllowedDataTypes();
        if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(allowedDataTypes.size());
            Iterator<String> it = allowedDataTypes.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] i(D[] dArr) {
        if (dArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[dArr.length];
        for (int i8 = 0; i8 < dArr.length; i8++) {
            bundleArr[i8] = h(dArr[i8]);
        }
        return bundleArr;
    }

    public static r.b readAction(int i8, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        D[] dArrC;
        D[] dArrC2;
        boolean z8;
        if (bundle != null) {
            dArrC = c(f(bundle, "android.support.remoteInputs"));
            dArrC2 = c(f(bundle, "android.support.dataRemoteInputs"));
            z8 = bundle.getBoolean("android.support.allowGeneratedReplies");
        } else {
            dArrC = null;
            dArrC2 = null;
            z8 = false;
        }
        return new r.b(i8, charSequence, pendingIntent, bundle, dArrC, dArrC2, z8, 0, true, false, false);
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, r.b bVar) {
        IconCompat iconCompat = bVar.getIconCompat();
        builder.addAction(iconCompat != null ? iconCompat.getResId() : 0, bVar.getTitle(), bVar.getActionIntent());
        Bundle bundle = new Bundle(bVar.getExtras());
        if (bVar.getRemoteInputs() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", i(bVar.getRemoteInputs()));
        }
        if (bVar.getDataOnlyRemoteInputs() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", i(bVar.getDataOnlyRemoteInputs()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.getAllowGeneratedReplies());
        return bundle;
    }
}
