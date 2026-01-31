package com.journeyapps.barcodescanner;

import F3.r;
import F3.s;
import K3.h;
import K3.n;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.core.app.AbstractC0918b;
import com.journeyapps.barcodescanner.a;
import j4.C5827b;
import j4.InterfaceC5826a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: o */
    private static final String f27512o = "e";

    /* renamed from: p */
    private static int f27513p = 250;

    /* renamed from: a */
    private Activity f27514a;

    /* renamed from: b */
    private DecoratedBarcodeView f27515b;

    /* renamed from: h */
    private h f27521h;

    /* renamed from: i */
    private K3.e f27522i;

    /* renamed from: j */
    private Handler f27523j;

    /* renamed from: m */
    private final a.f f27526m;

    /* renamed from: n */
    private boolean f27527n;

    /* renamed from: c */
    private int f27516c = -1;

    /* renamed from: d */
    private boolean f27517d = false;

    /* renamed from: e */
    private boolean f27518e = true;

    /* renamed from: f */
    private String f27519f = "";

    /* renamed from: g */
    private boolean f27520g = false;

    /* renamed from: k */
    private boolean f27524k = false;

    /* renamed from: l */
    private InterfaceC5826a f27525l = new a();

    class a implements InterfaceC5826a {
        a() {
        }

        public /* synthetic */ void b(C5827b c5827b) {
            e.this.t(c5827b);
        }

        @Override // j4.InterfaceC5826a
        public void barcodeResult(final C5827b c5827b) {
            e.this.f27515b.pause();
            e.this.f27522i.playBeepSoundAndVibrate();
            e.this.f27523j.post(new Runnable() { // from class: com.journeyapps.barcodescanner.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27510a.b(c5827b);
                }
            });
        }

        @Override // j4.InterfaceC5826a
        public void possibleResultPoints(List<s> list) {
        }
    }

    class b implements a.f {
        b() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void cameraClosed() {
            if (e.this.f27524k) {
                String unused = e.f27512o;
                e.this.q();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void cameraError(Exception exc) {
            e eVar = e.this;
            eVar.l(eVar.f27514a.getString(n.zxing_msg_camera_framework_bug));
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewSized() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewStarted() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void previewStopped() {
        }
    }

    public e(Activity activity, DecoratedBarcodeView decoratedBarcodeView) {
        b bVar = new b();
        this.f27526m = bVar;
        this.f27527n = false;
        this.f27514a = activity;
        this.f27515b = decoratedBarcodeView;
        decoratedBarcodeView.getBarcodeView().addStateListener(bVar);
        this.f27523j = new Handler();
        this.f27521h = new h(activity, new Runnable() { // from class: j4.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f33439a.q();
            }
        });
        this.f27522i = new K3.e(activity);
    }

    public static int getCameraPermissionReqCode() {
        return f27513p;
    }

    /* renamed from: m */
    public void q() {
        this.f27514a.finish();
    }

    private String n(C5827b c5827b) throws IOException {
        if (this.f27517d) {
            Bitmap bitmap = c5827b.getBitmap();
            try {
                File fileCreateTempFile = File.createTempFile("barcodeimage", ".jpg", this.f27514a.getCacheDir());
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.close();
                return fileCreateTempFile.getAbsolutePath();
            } catch (IOException e8) {
                Log.w(f27512o, "Unable to create temporary file and store bitmap! " + e8);
            }
        }
        return null;
    }

    public /* synthetic */ void o(DialogInterface dialogInterface, int i8) {
        q();
    }

    public /* synthetic */ void p(DialogInterface dialogInterface) {
        q();
    }

    public static Intent resultIntent(C5827b c5827b, String str) {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.addFlags(524288);
        intent.putExtra("SCAN_RESULT", c5827b.toString());
        intent.putExtra("SCAN_RESULT_FORMAT", c5827b.getBarcodeFormat().toString());
        byte[] rawBytes = c5827b.getRawBytes();
        if (rawBytes != null && rawBytes.length > 0) {
            intent.putExtra("SCAN_RESULT_BYTES", rawBytes);
        }
        Map<r, Object> resultMetadata = c5827b.getResultMetadata();
        if (resultMetadata != null) {
            r rVar = r.UPC_EAN_EXTENSION;
            if (resultMetadata.containsKey(rVar)) {
                intent.putExtra("SCAN_RESULT_UPC_EAN_EXTENSION", resultMetadata.get(rVar).toString());
            }
            Number number = (Number) resultMetadata.get(r.ORIENTATION);
            if (number != null) {
                intent.putExtra("SCAN_RESULT_ORIENTATION", number.intValue());
            }
            String str2 = (String) resultMetadata.get(r.ERROR_CORRECTION_LEVEL);
            if (str2 != null) {
                intent.putExtra("SCAN_RESULT_ERROR_CORRECTION_LEVEL", str2);
            }
            Iterable iterable = (Iterable) resultMetadata.get(r.BYTE_SEGMENTS);
            if (iterable != null) {
                Iterator it = iterable.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    intent.putExtra("SCAN_RESULT_BYTE_SEGMENTS_" + i8, (byte[]) it.next());
                    i8++;
                }
            }
        }
        if (str != null) {
            intent.putExtra("SCAN_RESULT_IMAGE_PATH", str);
        }
        return intent;
    }

    private void s() {
        if (androidx.core.content.a.checkSelfPermission(this.f27514a, "android.permission.CAMERA") == 0) {
            this.f27515b.resume();
        } else {
            if (this.f27527n) {
                return;
            }
            AbstractC0918b.requestPermissions(this.f27514a, new String[]{"android.permission.CAMERA"}, f27513p);
            this.f27527n = true;
        }
    }

    public static void setCameraPermissionReqCode(int i8) {
        f27513p = i8;
    }

    private void v() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("MISSING_CAMERA_PERMISSION", true);
        this.f27514a.setResult(0, intent);
    }

    public void decode() {
        this.f27515b.decodeSingle(this.f27525l);
    }

    public void initializeFromIntent(Intent intent, Bundle bundle) {
        this.f27514a.getWindow().addFlags(128);
        if (bundle != null) {
            this.f27516c = bundle.getInt("SAVED_ORIENTATION_LOCK", -1);
        }
        if (intent != null) {
            if (intent.getBooleanExtra("SCAN_ORIENTATION_LOCKED", true)) {
                r();
            }
            if ("com.google.zxing.client.android.SCAN".equals(intent.getAction())) {
                this.f27515b.initializeFromIntent(intent);
            }
            if (!intent.getBooleanExtra("BEEP_ENABLED", true)) {
                this.f27522i.setBeepEnabled(false);
            }
            if (intent.hasExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG")) {
                setShowMissingCameraPermissionDialog(intent.getBooleanExtra("SHOW_MISSING_CAMERA_PERMISSION_DIALOG", true), intent.getStringExtra("MISSING_CAMERA_PERMISSION_DIALOG_MESSAGE"));
            }
            if (intent.hasExtra("TIMEOUT")) {
                this.f27523j.postDelayed(new Runnable() { // from class: com.journeyapps.barcodescanner.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f27509a.u();
                    }
                }, intent.getLongExtra("TIMEOUT", 0L));
            }
            if (intent.getBooleanExtra("BARCODE_IMAGE_ENABLED", false)) {
                this.f27517d = true;
            }
        }
    }

    protected void k() {
        if (this.f27515b.getBarcodeView().isCameraClosed()) {
            q();
        } else {
            this.f27524k = true;
        }
        this.f27515b.pause();
        this.f27521h.cancel();
    }

    protected void l(String str) {
        if (this.f27514a.isFinishing() || this.f27520g || this.f27524k) {
            return;
        }
        if (str.isEmpty()) {
            str = this.f27514a.getString(n.zxing_msg_camera_framework_bug);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f27514a);
        builder.setTitle(this.f27514a.getString(n.zxing_app_name));
        builder.setMessage(str);
        builder.setPositiveButton(n.zxing_button_ok, new DialogInterface.OnClickListener() { // from class: j4.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                this.f33440a.o(dialogInterface, i8);
            }
        });
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: j4.e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f33441a.p(dialogInterface);
            }
        });
        builder.show();
    }

    public void onDestroy() {
        this.f27520g = true;
        this.f27521h.cancel();
        this.f27523j.removeCallbacksAndMessages(null);
    }

    public void onPause() throws InterruptedException {
        this.f27521h.cancel();
        this.f27515b.pauseAndWait();
    }

    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        if (i8 == f27513p) {
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f27515b.resume();
                return;
            }
            v();
            if (this.f27518e) {
                l(this.f27519f);
            } else {
                k();
            }
        }
    }

    public void onResume() {
        s();
        this.f27521h.start();
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("SAVED_ORIENTATION_LOCK", this.f27516c);
    }

    protected void r() {
        if (this.f27516c == -1) {
            int rotation = this.f27514a.getWindowManager().getDefaultDisplay().getRotation();
            int i8 = this.f27514a.getResources().getConfiguration().orientation;
            int i9 = 0;
            if (i8 == 2) {
                if (rotation != 0 && rotation != 1) {
                    i9 = 8;
                }
            } else if (i8 == 1) {
                i9 = (rotation == 0 || rotation == 3) ? 1 : 9;
            }
            this.f27516c = i9;
        }
        this.f27514a.setRequestedOrientation(this.f27516c);
    }

    public void setShowMissingCameraPermissionDialog(boolean z8) {
        setShowMissingCameraPermissionDialog(z8, "");
    }

    protected void t(C5827b c5827b) {
        this.f27514a.setResult(-1, resultIntent(c5827b, n(c5827b)));
        k();
    }

    protected void u() {
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        this.f27514a.setResult(0, intent);
        k();
    }

    public void setShowMissingCameraPermissionDialog(boolean z8, String str) {
        this.f27518e = z8;
        if (str == null) {
            str = "";
        }
        this.f27519f = str;
    }
}
