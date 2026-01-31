package j4;

import android.content.Context;
import android.content.Intent;
import g.AbstractC5530a;

/* loaded from: classes2.dex */
public class p extends AbstractC5530a {
    @Override // g.AbstractC5530a
    public Intent createIntent(Context context, r rVar) {
        return rVar.createScanIntent(context);
    }

    @Override // g.AbstractC5530a
    public q parseResult(int i8, Intent intent) {
        return q.parseActivityResult(i8, intent);
    }
}
