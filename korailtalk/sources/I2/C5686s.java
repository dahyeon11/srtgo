package i2;

import android.content.Context;
import android.content.res.Resources;
import f2.AbstractC5404n;

/* renamed from: i2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5686s {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f31851a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31852b;

    public C5686s(Context context) {
        AbstractC5683p.checkNotNull(context);
        Resources resources = context.getResources();
        this.f31851a = resources;
        this.f31852b = resources.getResourcePackageName(AbstractC5404n.common_google_play_services_unknown_issue);
    }

    public String getString(String str) {
        int identifier = this.f31851a.getIdentifier(str, "string", this.f31852b);
        if (identifier == 0) {
            return null;
        }
        return this.f31851a.getString(identifier);
    }
}
