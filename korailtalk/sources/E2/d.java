package E2;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import i2.AbstractC5683p;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* loaded from: classes2.dex */
public abstract class d {
    public static Object zza(Object obj) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        ObjectOutputStream objectOutputStream;
        try {
            if (obj != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream.writeObject(obj);
                        objectOutputStream.flush();
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                    } catch (Throwable th2) {
                        th = th2;
                        objectInputStream = null;
                    }
                    try {
                        Object object = objectInputStream.readObject();
                        objectOutputStream.close();
                        objectInputStream.close();
                        return object;
                    } catch (Throwable th3) {
                        th = th3;
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                        if (objectInputStream == null) {
                            throw th;
                        }
                        objectInputStream.close();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    objectInputStream = null;
                    objectOutputStream = null;
                }
            }
        } catch (IOException | ClassNotFoundException unused) {
        }
        return null;
    }

    public static String zzb(String str, String[] strArr, String[] strArr2) {
        AbstractC5683p.checkNotNull(strArr);
        AbstractC5683p.checkNotNull(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i8 = 0; i8 < iMin; i8++) {
            String str2 = strArr[i8];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i8];
            }
        }
        return null;
    }

    public static String zzc(Context context, String str, String str2) {
        AbstractC5683p.checkNotNull(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = a.zza(context);
        }
        return a.zzb("google_app_id", resources, str2);
    }
}
