package com.journeyapps.barcodescanner;

import K3.k;
import K3.l;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;

/* loaded from: classes2.dex */
public class CaptureActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private e f27454a;

    /* renamed from: b, reason: collision with root package name */
    private DecoratedBarcodeView f27455b;

    protected DecoratedBarcodeView a() {
        setContentView(l.zxing_capture);
        return (DecoratedBarcodeView) findViewById(k.zxing_barcode_scanner);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f27455b = a();
        e eVar = new e(this, this.f27455b);
        this.f27454a = eVar;
        eVar.initializeFromIntent(getIntent(), bundle);
        this.f27454a.decode();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f27454a.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        return this.f27455b.onKeyDown(i8, keyEvent) || super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() throws InterruptedException {
        super.onPause();
        this.f27454a.onPause();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        this.f27454a.onRequestPermissionsResult(i8, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f27454a.onResume();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f27454a.onSaveInstanceState(bundle);
    }
}
