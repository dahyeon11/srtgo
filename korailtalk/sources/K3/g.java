package K3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.EnumMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2896a = "g";

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f2897b = Pattern.compile(",");

    public static Map<F3.e, Object> parseDecodeHints(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(F3.e.class);
        for (F3.e eVar : F3.e.values()) {
            if (eVar != F3.e.CHARACTER_SET && eVar != F3.e.NEED_RESULT_POINT_CALLBACK && eVar != F3.e.POSSIBLE_FORMATS) {
                String strName = eVar.name();
                if (extras.containsKey(strName)) {
                    if (eVar.getValueType().equals(Void.class)) {
                        enumMap.put((EnumMap) eVar, (F3.e) Boolean.TRUE);
                    } else {
                        Object obj = extras.get(strName);
                        if (eVar.getValueType().isInstance(obj)) {
                            enumMap.put((EnumMap) eVar, (F3.e) obj);
                        } else {
                            Log.w(f2896a, "Ignoring hint " + eVar + " because it is not assignable from " + obj);
                        }
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Hints from the Intent: ");
        sb.append(enumMap);
        return enumMap;
    }
}
