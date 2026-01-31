package G1;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C2487cb;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class r extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f1416a;

    /* synthetic */ r(t tVar, q qVar) {
        this.f1416a = tVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String doInBackground(Void... voidArr) {
        try {
            t tVar = this.f1416a;
            tVar.f1430h = (C2487cb) tVar.f1425c.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            e = e8;
            L1.n.zzk("", e);
        } catch (ExecutionException e9) {
            e = e9;
            L1.n.zzk("", e);
        } catch (TimeoutException e10) {
            L1.n.zzk("", e10);
        }
        return this.f1416a.zzp();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        t tVar = this.f1416a;
        String str = (String) obj;
        if (tVar.f1428f == null || str == null) {
            return;
        }
        tVar.f1428f.loadUrl(str);
    }
}
