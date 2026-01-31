package N1;

import android.os.Bundle;
import y1.EnumC6522c;

/* loaded from: classes.dex */
public class n {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* renamed from: a, reason: collision with root package name */
    private final EnumC6522c f3204a;

    /* renamed from: b, reason: collision with root package name */
    private final Bundle f3205b;

    public n(EnumC6522c enumC6522c, Bundle bundle) {
        this.f3204a = enumC6522c;
        this.f3205b = bundle;
    }

    public EnumC6522c getFormat() {
        return this.f3204a;
    }

    public Bundle getServerParameters() {
        return this.f3205b;
    }
}
