package a6;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import com.korail.talk.data.QRData;
import com.squareup.picasso.p;
import com.squareup.picasso.s;
import n4.AbstractC5954e;
import z4.N;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class AsyncTaskC0838b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5976a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5977b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f5978c;

    /* renamed from: d, reason: collision with root package name */
    private int f5979d = -15574641;

    /* renamed from: e, reason: collision with root package name */
    private int f5980e = -1971213;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f5981f = new a();

    /* renamed from: a6.b$a */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            QRData qRData = (QRData) message.obj;
            int i8 = message.arg1;
            if (i8 == 0) {
                s.get().load(qRData.mQRCodeFile).networkPolicy(p.OFFLINE, new p[0]).error(AbstractC5954e.qr_korail_logo).resize(N.dpToPx(82.0f), N.dpToPx(82.0f)).into(qRData.mIvQRCode);
            } else if (i8 == 1) {
                qRData.mIvQRCode.setImageResource(AbstractC5954e.qr_korail_logo);
            }
        }
    }

    public AsyncTaskC0838b(Context context, String str, ImageView imageView) {
        this.f5976a = context;
        this.f5977b = str;
        this.f5978c = imageView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Void doInBackground(java.lang.Void... r10) throws java.lang.Throwable {
        /*
            r9 = this;
            com.korail.talk.data.QRData r10 = new com.korail.talk.data.QRData
            r10.<init>()
            android.widget.ImageView r0 = r9.f5978c
            r10.mIvQRCode = r0
            r0 = 1
            r1 = 0
            android.content.Context r2 = r9.f5976a     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r3 = "qr"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r5 = r9.f5977b     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r5 = ".jpg"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.io.File r2 = z4.C6639m.getFile(r2, r3, r4)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            boolean r3 = z4.C6630d.isNotNull(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 == 0) goto L76
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            if (r3 == 0) goto L45
            long r3 = r2.length()     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L45
            r3 = r1
            goto L65
        L3e:
            r2 = move-exception
            goto Lab
        L41:
            r2 = move-exception
            r4 = r0
            r3 = r1
            goto L97
        L45:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3e java.lang.Exception -> L41
            java.lang.String r4 = r9.f5977b     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r5 = 1118044160(0x42a40000, float:82.0)
            int r6 = z4.N.dpToPx(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            int r5 = z4.N.dpToPx(r5)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            int r7 = r9.f5979d     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            int r8 = r9.f5980e     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            android.graphics.Bitmap r4 = z4.C6633g.createQRCode(r4, r6, r5, r7, r8)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
            r6 = 70
            r4.compress(r5, r6, r3)     // Catch: java.lang.Throwable -> L70 java.lang.Exception -> L73
        L65:
            r4 = 0
            r10.mQRCodeFile = r2     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6e
            r0 = r4
            goto L77
        L6a:
            r2 = move-exception
            r1 = r3
            r0 = r4
            goto Lab
        L6e:
            r2 = move-exception
            goto L97
        L70:
            r2 = move-exception
            r1 = r3
            goto Lab
        L73:
            r2 = move-exception
            r4 = r0
            goto L97
        L76:
            r3 = r1
        L77:
            boolean r2 = z4.C6630d.isNotNull(r3)
            if (r2 == 0) goto L89
            r3.close()     // Catch: java.io.IOException -> L81
            goto L89
        L81:
            r2 = move-exception
        L82:
            java.lang.String r2 = r2.getMessage()
            z4.t.e(r2)
        L89:
            android.os.Message r2 = android.os.Message.obtain()
            r2.arg1 = r0
            r2.obj = r10
            android.os.Handler r10 = r9.f5981f
            r10.sendMessage(r2)
            goto Laa
        L97:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L6a
            z4.t.e(r2)     // Catch: java.lang.Throwable -> L6a
            boolean r2 = z4.C6630d.isNotNull(r3)
            if (r2 == 0) goto L89
            r3.close()     // Catch: java.io.IOException -> La8
            goto L89
        La8:
            r2 = move-exception
            goto L82
        Laa:
            return r1
        Lab:
            boolean r3 = z4.C6630d.isNotNull(r1)
            if (r3 == 0) goto Lbd
            r1.close()     // Catch: java.io.IOException -> Lb5
            goto Lbd
        Lb5:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            z4.t.e(r1)
        Lbd:
            android.os.Message r1 = android.os.Message.obtain()
            r1.arg1 = r0
            r1.obj = r10
            android.os.Handler r10 = r9.f5981f
            r10.sendMessage(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a6.AsyncTaskC0838b.doInBackground(java.lang.Void[]):java.lang.Void");
    }

    public void setColors(int i8, int i9) {
        this.f5979d = i8;
        this.f5980e = i9;
    }
}
