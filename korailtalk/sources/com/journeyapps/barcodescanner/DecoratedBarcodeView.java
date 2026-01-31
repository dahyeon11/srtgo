package com.journeyapps.barcodescanner;

import F3.s;
import K3.f;
import K3.k;
import K3.l;
import K3.o;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import j4.C5827b;
import j4.InterfaceC5826a;
import j4.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k4.j;

/* loaded from: classes2.dex */
public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: a */
    private BarcodeView f27456a;

    /* renamed from: b */
    private ViewfinderView f27457b;

    /* renamed from: c */
    private TextView f27458c;

    public interface a {
    }

    private class b implements InterfaceC5826a {

        /* renamed from: a */
        private InterfaceC5826a f27459a;

        public b(InterfaceC5826a interfaceC5826a) {
            this.f27459a = interfaceC5826a;
        }

        @Override // j4.InterfaceC5826a
        public void barcodeResult(C5827b c5827b) {
            this.f27459a.barcodeResult(c5827b);
        }

        @Override // j4.InterfaceC5826a
        public void possibleResultPoints(List<s> list) {
            Iterator<s> it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f27457b.addPossibleResultPoint(it.next());
            }
            this.f27459a.possibleResultPoints(list);
        }
    }

    public DecoratedBarcodeView(Context context) {
        super(context);
        b();
    }

    private void b() {
        c(null);
    }

    private void c(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.zxing_view);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(o.zxing_view_zxing_scanner_layout, l.zxing_barcode_scanner);
        typedArrayObtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(k.zxing_barcode_surface);
        this.f27456a = barcodeView;
        if (barcodeView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
        }
        barcodeView.p(attributeSet);
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(k.zxing_viewfinder_view);
        this.f27457b = viewfinderView;
        if (viewfinderView == null) {
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        viewfinderView.setCameraPreview(this.f27456a);
        this.f27458c = (TextView) findViewById(k.zxing_status_view);
    }

    public void changeCameraParameters(j jVar) {
        this.f27456a.changeCameraParameters(jVar);
    }

    public void decodeContinuous(InterfaceC5826a interfaceC5826a) {
        this.f27456a.decodeContinuous(new b(interfaceC5826a));
    }

    public void decodeSingle(InterfaceC5826a interfaceC5826a) {
        this.f27456a.decodeSingle(new b(interfaceC5826a));
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(k.zxing_barcode_surface);
    }

    public k4.k getCameraSettings() {
        return this.f27456a.getCameraSettings();
    }

    public g getDecoderFactory() {
        return this.f27456a.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f27458c;
    }

    public ViewfinderView getViewFinder() {
        return this.f27457b;
    }

    public void initializeFromIntent(Intent intent) {
        int intExtra;
        Set<F3.a> decodeFormats = f.parseDecodeFormats(intent);
        Map<F3.e, ?> decodeHints = K3.g.parseDecodeHints(intent);
        k4.k kVar = new k4.k();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            kVar.setRequestedCameraId(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            setTorchOn();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new F3.k().setHints(decodeHints);
        this.f27456a.setCameraSettings(kVar);
        this.f27456a.setDecoderFactory(new j4.j(decodeFormats, decodeHints, stringExtra2, intExtra2));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (i8 == 24) {
            setTorchOn();
            return true;
        }
        if (i8 == 25) {
            setTorchOff();
            return true;
        }
        if (i8 == 27 || i8 == 80) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    public void pause() {
        this.f27456a.pause();
    }

    public void pauseAndWait() throws InterruptedException {
        this.f27456a.pauseAndWait();
    }

    public void resume() {
        this.f27456a.resume();
    }

    public void setCameraSettings(k4.k kVar) {
        this.f27456a.setCameraSettings(kVar);
    }

    public void setDecoderFactory(g gVar) {
        this.f27456a.setDecoderFactory(gVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f27458c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(a aVar) {
    }

    public void setTorchOff() {
        this.f27456a.setTorch(false);
    }

    public void setTorchOn() {
        this.f27456a.setTorch(true);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c(attributeSet);
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        c(attributeSet);
    }
}
