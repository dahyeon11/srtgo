package o0;

import android.app.Application;
import android.content.Context;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ApplicationC6023b extends Application {
    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        AbstractC6022a.install(this);
    }
}
