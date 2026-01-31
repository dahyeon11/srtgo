package com.korail.talk.ui.ticket.receipt;

import Q7.X;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.network.IBaseDao;
import com.korail.talk.network.dao.receipt.ReceiptDao;
import com.korail.talk.network.dao.receipt.ReceiptDao.ReceiptRequest;
import com.korail.talk.network.dao.refund.TicketDetailDao;
import com.korail.talk.ui.ticket.confirm.TicketSelfCheckinStatusActivity;
import com.korail.talk.ui.ticket.receipt.TicketReceiptActivity;
import com.korail.talk.view.base.BaseViewActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import n4.AbstractC5955f;
import n4.AbstractC5957h;
import n4.AbstractC5959j;
import o4.C6038a;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import r4.C6174a;
import r4.e;
import z4.C6630d;
import z4.C6633g;
import z4.C6634h;
import z4.C6639m;
import z4.G;
import z4.N;
import z4.t;

/* loaded from: classes.dex */
public class TicketReceiptActivity extends BaseViewActivity {

    /* renamed from: C, reason: collision with root package name */
    private static final Log f29124C = LogFactory.getLog(TicketReceiptActivity.class);

    /* renamed from: A, reason: collision with root package name */
    private View f29125A;

    /* renamed from: B, reason: collision with root package name */
    private TextView f29126B;

    /* renamed from: i, reason: collision with root package name */
    private final String f29127i = "11";

    /* renamed from: j, reason: collision with root package name */
    private TicketDetailDao.TicketDetailResponse f29128j;

    /* renamed from: k, reason: collision with root package name */
    private ReceiptDao.CashReceiptInfo f29129k;

    /* renamed from: l, reason: collision with root package name */
    private ViewGroup f29130l;

    /* renamed from: m, reason: collision with root package name */
    private View f29131m;

    /* renamed from: n, reason: collision with root package name */
    private View f29132n;

    /* renamed from: o, reason: collision with root package name */
    private View f29133o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f29134p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f29135q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f29136r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f29137s;

    /* renamed from: t, reason: collision with root package name */
    private TextView f29138t;

    /* renamed from: u, reason: collision with root package name */
    private TextView f29139u;

    /* renamed from: v, reason: collision with root package name */
    private TextView f29140v;

    /* renamed from: w, reason: collision with root package name */
    private TextView f29141w;

    /* renamed from: x, reason: collision with root package name */
    private TextView f29142x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f29143y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f29144z;

    private class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final ImageView f29145a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29146b;

        a(ImageView imageView, String str) {
            this.f29145a = imageView;
            this.f29146b = str;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BitmapDrawable doInBackground(Void... voidArr) {
            return new BitmapDrawable(TicketReceiptActivity.this.getResources(), C6633g.createQRCode(this.f29146b, N.dpToPx(120.0f), N.dpToPx(120.0f), -15574641, -1971213));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(BitmapDrawable bitmapDrawable) {
            super.onPostExecute(bitmapDrawable);
            this.f29145a.setImageBitmap(bitmapDrawable.getBitmap());
            TicketReceiptActivity.this.dismissLoading();
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            TicketReceiptActivity.this.showLoading();
        }
    }

    private boolean A0(String str, String str2) {
        return "13".equals(str) || "81".equals(str) || "98".equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void B0(String str, Uri uri) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        t.i("MediaScanner", "스캔 완료: " + str);
        t.i("MediaScanner", "-> MediaStore Uri: " + uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C0(String str) {
        Toast.makeText(K(), str, 0).show();
    }

    private void D0() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String str = "VIEW_CAPTURE_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date()) + ".png";
        if (Build.VERSION.SDK_INT >= 29) {
            F0(this.f29131m, str);
        } else {
            E0(this.f29131m, str);
        }
    }

    private void E0(View view, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        if (!externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
            t.e("saveToDownloadsLegacy", "Downloads 디렉토리 생성 실패");
            N0("영수증 파일 저장에 실패하였습니다.");
            return;
        }
        File file = new File(externalStoragePublicDirectory, str);
        if (!C6633g.captureViewAndSaveToFile(this.f29131m, file)) {
            t.e("saveToDownloadsLegacy", "Legacy 저장 실패 (Downloads)");
            N0("영수증 파일 저장에 실패하였습니다.");
            return;
        }
        t.i("saveToDownloadsLegacy", "Legacy 저장 성공 (Downloads): " + file.getAbsolutePath());
        N0(" 다운로드 폴더에 영수증을 저장하였습니다.");
        MediaScannerConnection.scanFile(K(), new String[]{file.getAbsolutePath()}, new String[]{"image/png"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: j6.b
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str2, Uri uri) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
                TicketReceiptActivity.B0(str2, uri);
            }
        });
    }

    private void F0(View view, String str) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OutputStream outputStreamOpenOutputStream;
        ContentResolver contentResolver = K().getContentResolver();
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("mime_type", "image/png");
        contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS);
        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
        if (uriInsert == null) {
            t.e("saveToDownloadsUsingMediaStore", "MediaStore를 통해 Uri 생성 실패 (Downloads)");
            N0("영수증 파일 저장에 실패하였습니다.");
            return;
        }
        File file = new File(K().getCacheDir(), "temp_" + str);
        try {
            if (!C6633g.captureViewAndSaveToFile(this.f29131m, file)) {
                t.e("saveToDownloadsUsingMediaStore", "임시 파일로 View 캡처 실패");
                contentResolver.delete(uriInsert, null, null);
                N0("영수증 파일 저장에 실패하였습니다.");
                return;
            }
            try {
                outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
            } catch (IOException unused) {
                contentResolver.delete(uriInsert, null, null);
                N0("영수증 파일 저장에 실패하였습니다.");
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    if (outputStreamOpenOutputStream == null) {
                        throw new IOException("OutputStream 생성 실패");
                    }
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i8 = fileInputStream.read(bArr);
                        if (i8 == -1) {
                            break;
                        } else {
                            outputStreamOpenOutputStream.write(bArr, 0, i8);
                        }
                    }
                    outputStreamOpenOutputStream.flush();
                    t.i("saveToDownloadsUsingMediaStore", "MediaStore 저장 성공 (Downloads): " + uriInsert);
                    N0(" 다운로드 폴더에 영수증을 저장하였습니다.");
                    fileInputStream.close();
                    outputStreamOpenOutputStream.close();
                } finally {
                }
            } catch (Throwable th) {
                if (outputStreamOpenOutputStream != null) {
                    try {
                        outputStreamOpenOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } finally {
            file.delete();
        }
    }

    private void G0() {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        if (C6633g.receiptSaveToBitmapFile(file, this.f29131m)) {
            C6630d.sendReceiptMail(K(), file, "코레일톡 영수증", "코레일톡에서 구매한 승차권 영수증입니다.");
        } else {
            Toast.makeText(getApplicationContext(), "이메일 발송에 실패하셨습니다.", 0).show();
        }
    }

    private void H0() {
        this.f29128j = (TicketDetailDao.TicketDetailResponse) getIntent().getSerializableExtra("TICKET_RESPONSE");
    }

    private void I0() {
        findViewById(AbstractC5955f.btn_left).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_right_end).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_stbk_receipt).setOnClickListener(this);
        findViewById(AbstractC5955f.btn_delay_return_receipt).setOnClickListener(this);
    }

    private void J0(ReceiptDao.ReceiptResponse receiptResponse) {
        ReceiptDao.ReceiptInfo receiptInfo = receiptResponse.getReceipt_infos().getReceipt_info().get(0);
        for (ReceiptDao.StlInfo stlInfo : e.DIRECT.getCode().equals(receiptInfo.getH_jrny_tp_cd()) ? receiptInfo.getStl_info() : receiptInfo.getStl_info().subList(0, receiptInfo.getStl_info().size() / 2)) {
            View viewInflate = View.inflate(getApplicationContext(), AbstractC5957h.view_ticket_receipt, null);
            String h_stl_way_nm = stlInfo.getH_stl_way_nm();
            viewInflate.findViewById(AbstractC5955f.v_receipt_payment_type).setVisibility(N.isNull(h_stl_way_nm) ? 8 : 0);
            ((TextView) viewInflate.findViewById(AbstractC5955f.tv_receipt_payment_type)).setText(h_stl_way_nm);
            viewInflate.findViewById(AbstractC5955f.v_receipt_no).setVisibility((N.isNotNull(stlInfo.getH_stl_crd_no()) || N.isNotNull(stlInfo.getH_xpot_no())) ? 0 : 8);
            if (viewInflate.findViewById(AbstractC5955f.v_receipt_no).getVisibility() == 0) {
                TextView textView = (TextView) viewInflate.findViewById(AbstractC5955f.tv_receipt_no_label);
                TextView textView2 = (TextView) viewInflate.findViewById(AbstractC5955f.tv_receipt_no);
                if (N.isNotNull(stlInfo.getH_stl_crd_no())) {
                    textView.setText(AbstractC5959j.common_card_number);
                    StringBuilder sb = new StringBuilder();
                    sb.append(stlInfo.getH_stl_crd_no());
                    sb.append(X.SPACE);
                    sb.append(stlInfo.getH_ismt_mnth_num() > 0 ? "(" + stlInfo.getH_ismt_mnth_num() + "개월)" : "(일시불)");
                    textView2.setText(sb.toString());
                } else if (N.isNotNull(stlInfo.getH_xpot_no())) {
                    textView.setText(AbstractC5959j.common_point_number);
                    textView2.setText(stlInfo.getH_xpot_no());
                }
            }
            ((TextView) viewInflate.findViewById(AbstractC5955f.tv_receipt_credit_accept_date)).setText(C6634h.convertFormat(stlInfo.getH_apv_dt(), "yyyyMMdd", "yyyy.MM.dd"));
            viewInflate.findViewById(AbstractC5955f.v_receipt_credit_accept_no).setVisibility(N.isNull(stlInfo.getH_apv_no()) ? 8 : 0);
            ((TextView) viewInflate.findViewById(AbstractC5955f.tv_receipt_credit_accept_no)).setText(stlInfo.getH_apv_no());
            ((TextView) viewInflate.findViewById(AbstractC5955f.tv_receipt_credit_amount)).setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(stlInfo.getH_stl_amt())));
            if (C6630d.isNotNull(receiptInfo.getCash_rcet_info()) && receiptInfo.getCash_rcet_info().size() > 0) {
                this.f29129k = receiptInfo.getCash_rcet_info().get(0);
                findViewById(AbstractC5955f.btn_stbk_receipt).setVisibility(0);
            }
            this.f29130l.addView(viewInflate);
        }
    }

    private void K0() {
        new a((ImageView) findViewById(AbstractC5955f.qrcodeImg), this.f29128j.getH_qrcode()).execute(new Void[0]);
    }

    private void L0(ReceiptDao.ReceiptResponse receiptResponse) {
        ReceiptDao.ReceiptInfo receiptInfo = receiptResponse.getReceipt_infos().getReceipt_info().get(0);
        boolean zZ0 = z0(receiptInfo.getH_prt_type());
        setAppTitle(AbstractC5959j.refund_ticket_info);
        this.f29136r.setText(zZ0 ? AbstractC5959j.title_receipt_return : AbstractC5959j.common_receipt);
        this.f29137s.setText(v0(receiptResponse));
        String[] strArrY0 = y0(receiptResponse);
        String[] strArrSplit = strArrY0[0].split("\\|");
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            this.f29138t.append(strArrSplit[i8]);
            if (i8 < strArrSplit.length - 1) {
                this.f29138t.append(N.applySpannable("|", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
            }
        }
        this.f29139u.append(strArrY0[1]);
        String[] strArrSplit2 = w0(receiptResponse).split("\\|");
        for (int i9 = 0; i9 < strArrSplit2.length; i9++) {
            this.f29140v.append(strArrSplit2[i9]);
            if (i9 < strArrSplit2.length - 1) {
                this.f29140v.append(N.applySpannable("|", new ForegroundColorSpan(Color.parseColor("#CCCCCC"))));
            }
        }
        J0(receiptResponse);
        this.f29141w.setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(receiptInfo.getH_rcvd_amt())));
        this.f29132n.setVisibility(zZ0 ? 0 : 8);
        this.f29142x.setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(receiptInfo.getH_ret_fee())));
        this.f29133o.setVisibility(zZ0 ? 0 : 8);
        this.f29143y.setText(receiptInfo.getH_xpoint_ret_amt() == 0 ? AbstractC5959j.receipt_return_amount : AbstractC5959j.receipt_mileage_return_amount);
        this.f29144z.setText(getString(AbstractC5959j.common_amount, N.getDecimalFormatString(receiptInfo.getH_ret_rcvd_amt())));
        if ("11".equals(receiptInfo.getH_tk_stt_cd())) {
            this.f29125A.setVisibility(0);
        }
        this.f29126B.setText(getString(AbstractC5959j.company_info, C6634h.getToday("yyyy-MM-dd HH:mm")));
        this.f29131m.setVisibility(0);
    }

    private void M0() {
        n0(false);
        K0();
        this.f29131m = findViewById(AbstractC5955f.v_receipt_fax);
        this.f29132n = findViewById(AbstractC5955f.v_receipt_commission_amount);
        this.f29133o = findViewById(AbstractC5955f.v_receipt_return_amount);
        this.f29134p = (TextView) findViewById(AbstractC5955f.tv_receipt_ticket_number);
        this.f29135q = (TextView) findViewById(AbstractC5955f.tv_receipt_issue_date);
        this.f29136r = (TextView) findViewById(AbstractC5955f.tv_receipt_title);
        this.f29137s = (TextView) findViewById(AbstractC5955f.tv_receipt_depart_date);
        this.f29138t = (TextView) findViewById(AbstractC5955f.tv_receipt_train_info);
        this.f29139u = (TextView) findViewById(AbstractC5955f.tv_receipt_station_info);
        this.f29140v = (TextView) findViewById(AbstractC5955f.tv_receipt_passenger_info);
        this.f29130l = (ViewGroup) findViewById(AbstractC5955f.fl_receipt);
        this.f29141w = (TextView) findViewById(AbstractC5955f.tv_receipt_total_amount);
        this.f29142x = (TextView) findViewById(AbstractC5955f.tv_receipt_commission_amount);
        this.f29143y = (TextView) findViewById(AbstractC5955f.tv_receipt_return_amount_label);
        this.f29144z = (TextView) findViewById(AbstractC5955f.tv_receipt_return_amount);
        this.f29125A = findViewById(AbstractC5955f.ll_delay_return_receipt);
        this.f29126B = (TextView) findViewById(AbstractC5955f.tv_receipt_info);
        findViewById(AbstractC5955f.ic_bn).setVisibility(8);
    }

    private void N0(final String str) {
        K().runOnUiThread(new Runnable() { // from class: j6.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f33491a.C0(str);
            }
        });
    }

    private void setText() {
        this.f29134p.setText(x0());
        this.f29135q.setText(C6634h.convertFormat(this.f29128j.getH_sale_dt() + this.f29128j.getH_sale_tm(), "yyyyMMddHHmmss", "yyyy년 MM월 dd일 (E) HH:mm"));
    }

    private void u0() {
        ReceiptDao receiptDao = new ReceiptDao();
        ReceiptDao.ReceiptRequest receiptRequest = receiptDao.new ReceiptRequest();
        receiptRequest.setH_orgtk_sale_dt(this.f29128j.getH_orgtk_ret_sale_dt());
        receiptRequest.setH_orgtk_wct_no(this.f29128j.getH_orgtk_wct_no());
        receiptRequest.setH_orgtk_sale_sqno(this.f29128j.getH_orgtk_sale_sqno());
        receiptRequest.setH_orgtk_tk_ret_pwd(this.f29128j.getH_orgtk_ret_pwd());
        receiptDao.setRequest(receiptRequest);
        executeDao(receiptDao);
    }

    private String v0(ReceiptDao.ReceiptResponse receiptResponse) {
        return C6634h.convertFormat(receiptResponse.getReceipt_infos().getReceipt_info().get(0).getH_abrd_dt(), "yyyyMMdd", "yyyy년 MM월 dd일 (E)");
    }

    private String w0(ReceiptDao.ReceiptResponse receiptResponse) {
        String string;
        ReceiptDao.ReceiptInfo receiptInfo = receiptResponse.getReceipt_infos().getReceipt_info().get(0);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(AbstractC5959j.common_adult) + X.SPACE + getString(AbstractC5959j.common_s_ticket_count, Integer.valueOf(receiptInfo.getH_psg_type1_cnt())));
        sb.append(", " + getString(AbstractC5959j.common_child) + X.SPACE + getString(AbstractC5959j.common_s_ticket_count, Integer.valueOf(receiptInfo.getH_psg_type2_cnt())));
        sb.append(" | " + getString(AbstractC5959j.receipt_discount) + X.SPACE + getString(AbstractC5959j.common_s_person_count, Integer.valueOf(receiptInfo.getH_psg_type3_cnt())));
        if (N.isNull(receiptInfo.getH_prt_disc_knd_nm())) {
            string = getString(AbstractC5959j.common_empty);
        } else {
            string = " | " + receiptInfo.getH_prt_disc_knd_nm();
        }
        sb.append(string);
        return sb.toString();
    }

    private String x0() {
        return C6038a.getReturnNumberWithDash(this.f29128j.getH_orgtk_wct_no(), this.f29128j.getH_orgtk_ret_sale_dt(), this.f29128j.getH_orgtk_sale_sqno(), this.f29128j.getH_orgtk_ret_pwd());
    }

    private String[] y0(ReceiptDao.ReceiptResponse receiptResponse) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        List<ReceiptDao.ReceiptInfo> receipt_info = receiptResponse.getReceipt_infos().getReceipt_info();
        for (int i8 = 0; i8 < receipt_info.size(); i8++) {
            ReceiptDao.ReceiptInfo receiptInfo = receipt_info.get(i8);
            String h_tk_knd_cd = receiptInfo.getH_tk_knd_cd();
            String h_trn_clsf_cd = receiptInfo.getH_trn_clsf_cd();
            sb.append(receiptInfo.getH_trn_clsf_nm());
            boolean zA0 = A0(h_tk_knd_cd, h_trn_clsf_cd);
            String str = X.SPACE;
            sb.append(zA0 ? "" : X.SPACE + receiptInfo.getH_trn_no());
            String str2 = " | ";
            sb.append((A0(h_tk_knd_cd, h_trn_clsf_cd) || receiptInfo.getH_psrm_cl_nm().isEmpty()) ? "" : " | ");
            sb.append((A0(h_tk_knd_cd, h_trn_clsf_cd) || receiptInfo.getH_psrm_cl_nm().isEmpty()) ? "" : receiptInfo.getH_psrm_cl_nm());
            if (A0(h_tk_knd_cd, h_trn_clsf_cd)) {
                str2 = "";
            } else if (receiptInfo.getH_psrm_cl_nm().isEmpty()) {
                str2 = X.SPACE;
            }
            sb.append(str2);
            if (!A0(h_tk_knd_cd, h_trn_clsf_cd)) {
                List<TicketDetailDao.TicketSeatInfo> tk_seat_info = this.f29128j.getTicket_infos().getTicket_info().get(i8).getTk_seat_info();
                for (int i9 = 0; i9 < tk_seat_info.size(); i9++) {
                    TicketDetailDao.TicketSeatInfo ticketSeatInfo = tk_seat_info.get(i9);
                    sb.append(getString(AbstractC5959j.common_s_seat, ticketSeatInfo.getH_srcar_no(), ticketSeatInfo.getH_seat_no()));
                    if (i9 < tk_seat_info.size() - 1) {
                        sb.append(", ");
                    }
                }
            }
            if (i8 == 0 && receipt_info.size() > 1) {
                sb.append("\n > ");
            }
            sb2.append(receiptInfo.getH_dpt_rs_stn_nm());
            sb2.append(A0(h_tk_knd_cd, h_trn_clsf_cd) ? "" : X.SPACE);
            sb2.append(A0(h_tk_knd_cd, h_trn_clsf_cd) ? "" : C6634h.convertFormat(receiptInfo.getH_dpt_tm(), "HHmmss", "HH:mm"));
            sb2.append(" > ");
            sb2.append(receiptInfo.getH_arv_rs_stn_nm());
            if (A0(h_tk_knd_cd, h_trn_clsf_cd)) {
                str = "";
            }
            sb2.append(str);
            sb2.append(A0(h_tk_knd_cd, h_trn_clsf_cd) ? "" : C6634h.convertFormat(receiptInfo.getH_arv_tm(), "HHmmss", "HH:mm"));
            if (i8 == 0 && receipt_info.size() > 1) {
                sb2.append(" > ");
            }
        }
        return new String[]{sb.toString(), sb2.toString()};
    }

    private boolean z0(String str) {
        return "09".equals(str) || "10".equals(str) || "11".equals(str) || "12".equals(str);
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        int id = view.getId();
        if (AbstractC5955f.btn_stbk_receipt == id) {
            Intent intent = new Intent(getApplicationContext(), (Class<?>) TicketStbkReceiptActivity.class);
            intent.putExtra("TICKET_RESPONSE", this.f29128j);
            intent.putExtra("STBK_RECEIPT_APPROVE_NAME", this.f29129k.getH_apv_mtd_nm());
            intent.putExtra("STBK_RECEIPT_RECOGNIZE_NO", this.f29129k.getH_athn_dmn_rcgn_no());
            intent.putExtra("STBK_RECEIPT_PURPOSE", getString(TicketSelfCheckinStatusActivity.CHECKIN_STATUS_NOT_USE.equals(this.f29129k.getH_cash_rcet_txn_dv_cd()) ? AbstractC5959j.receipt_business : AbstractC5959j.receipt_personal));
            intent.putExtra("STBK_RECEIPT_APPROVE_NO", this.f29129k.getH_cash_rcet_apv_no());
            intent.putExtra("STBK_RECEIPT_APPROVE_AMOUNT", Integer.toString(this.f29129k.getH_tot_apv_amt()));
            startActivityForResult(intent, 0);
            return;
        }
        if (AbstractC5955f.btn_delay_return_receipt == id) {
            Intent intent2 = new Intent(getApplicationContext(), (Class<?>) DelayReturnReceiptActivity.class);
            intent2.putExtra("TICKET_RESPONSE", this.f29128j);
            startActivity(intent2);
        } else {
            if (AbstractC5955f.btn_left == id) {
                sendFax();
                return;
            }
            if (AbstractC5955f.btn_right == id) {
                G0();
            } else if (AbstractC5955f.btn_right_end == id) {
                D0();
            } else {
                super.onClick(view);
            }
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, androidx.activity.ComponentActivity, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onCreate(bundle);
        setContentView(AbstractC5957h.activity_ticket_receipt);
        if (C6630d.isNull(bundle)) {
            H0();
            M0();
            setText();
            I0();
            u0();
        }
    }

    @Override // com.korail.talk.view.base.BaseViewActivity, com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f29352h.sendEmptyMessage(1);
    }

    @Override // com.korail.talk.view.base.BaseActivity, com.korail.talk.network.IBase
    public void onReceive(IBaseDao iBaseDao) {
        super.onReceive(iBaseDao);
        if (AbstractC5955f.dao_ticket_receipt == iBaseDao.getId()) {
            L0((ReceiptDao.ReceiptResponse) iBaseDao.getResponse());
        }
    }

    @Override // com.korail.talk.view.base.BaseActivity, androidx.fragment.app.ActivityC1010e, android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f29352h.sendEmptyMessageDelayed(0, 1000L);
    }

    public void sendFax() throws Throwable {
        File file = C6639m.getFile(getApplicationContext(), C6174a.VOLATILITY_FOLDER, C6174a.RECEIPT_IMAGE_NM);
        C6633g.createMobileFaxBitmapFile(file, this.f29131m);
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(G.getIntentFax(K(), file));
        playAppData.setShowDialog(true);
        playAppData.setTitle(getString(AbstractC5959j.receipt_mobile_install_dialog_title));
        playAppData.setMessageList(getString(AbstractC5959j.receipt_mobile_install_dialog_content));
        G.playApp(K(), playAppData);
    }
}
