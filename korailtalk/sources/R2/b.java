package r2;

import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import i2.AbstractC5683p;
import java.lang.reflect.Field;
import r2.InterfaceC6172a;

/* loaded from: classes.dex */
public final class b extends InterfaceC6172a.AbstractBinderC0399a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f35726a;

    private b(Object obj) {
        this.f35726a = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T unwrap(InterfaceC6172a interfaceC6172a) throws SecurityException {
        if (interfaceC6172a instanceof b) {
            return (T) ((b) interfaceC6172a).f35726a;
        }
        IBinder iBinderAsBinder = interfaceC6172a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i8 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i8++;
                field = field2;
            }
        }
        if (i8 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC5683p.checkNotNull(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e8) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
        } catch (NullPointerException e9) {
            throw new IllegalArgumentException("Binder object is null.", e9);
        }
    }

    public static <T> InterfaceC6172a wrap(T t8) {
        return new b(t8);
    }
}
