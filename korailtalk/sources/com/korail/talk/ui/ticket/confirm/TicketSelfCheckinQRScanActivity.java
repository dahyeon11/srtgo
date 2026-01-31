package com.korail.talk.ui.ticket.confirm;

import com.journeyapps.barcodescanner.CaptureActivity;
import com.journeyapps.barcodescanner.DecoratedBarcodeView;
import n4.AbstractC5955f;
import n4.AbstractC5957h;

/* loaded from: classes.dex */
public class TicketSelfCheckinQRScanActivity extends CaptureActivity {
    @Override // com.journeyapps.barcodescanner.CaptureActivity
    protected DecoratedBarcodeView a() {
        setContentView(AbstractC5957h.capture_small);
        return (DecoratedBarcodeView) findViewById(AbstractC5955f.zxing_barcode_scanner);
    }
}
