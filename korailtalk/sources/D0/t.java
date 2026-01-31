package D0;

import Q7.X;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class t {
    public View view;
    public final Map<String, Object> values = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f887a = new ArrayList();

    @Deprecated
    public t() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.view == tVar.view && this.values.equals(tVar.values);
    }

    public int hashCode() {
        return (this.view.hashCode() * 31) + this.values.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.view + X.LF) + "    values:";
        for (String str2 : this.values.keySet()) {
            str = str + "    " + str2 + ": " + this.values.get(str2) + X.LF;
        }
        return str;
    }

    public t(View view) {
        this.view = view;
    }
}
