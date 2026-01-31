package Y6;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class g {
    private static final void a(int i8, int i9) {
        if (i9 <= i8) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i8 + ", got " + i9 + ". Please update the Kotlin standard library.").toString());
    }

    private static final f b(a aVar) {
        return (f) aVar.getClass().getAnnotation(f.class);
    }

    private static final int c(a aVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static final String[] getSpilledVariableFieldMapping(a aVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        ArrayList arrayList = new ArrayList();
        int iC = c(aVar);
        int[] iArrI = fVarB.i();
        int length = iArrI.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (iArrI[i8] == iC) {
                arrayList.add(fVarB.s()[i8]);
                arrayList.add(fVarB.n()[i8]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final StackTraceElement getStackTraceElement(a aVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        String strC;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        f fVarB = b(aVar);
        if (fVarB == null) {
            return null;
        }
        a(1, fVarB.v());
        int iC = c(aVar);
        int i8 = iC < 0 ? -1 : fVarB.l()[iC];
        String moduleName = i.INSTANCE.getModuleName(aVar);
        if (moduleName == null) {
            strC = fVarB.c();
        } else {
            strC = moduleName + '/' + fVarB.c();
        }
        return new StackTraceElement(strC, fVarB.m(), fVarB.f(), i8);
    }
}
