package l4;

import D1.a;
import android.content.Context;
import android.os.AsyncTask;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5890a {

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    public interface InterfaceC0346a {
        void getAdvertisingIdClientInfo(a.C0017a c0017a);
    }

    /* renamed from: l4.a$b */
    private class b extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private InterfaceC0346a f33979a;

        public b(InterfaceC0346a interfaceC0346a) {
            this.f33979a = interfaceC0346a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.C0017a doInBackground(Context... contextArr) {
            try {
                return D1.a.getAdvertisingIdInfo(contextArr[0]);
            } catch (Exception e8) {
                e8.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(a.C0017a c0017a) {
            super.onPostExecute(c0017a);
            this.f33979a.getAdvertisingIdClientInfo(c0017a);
        }
    }

    public void getAdvertising(Context context, InterfaceC0346a interfaceC0346a) {
        new b(interfaceC0346a).execute(context);
    }
}
