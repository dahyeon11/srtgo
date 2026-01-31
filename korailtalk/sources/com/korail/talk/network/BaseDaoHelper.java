package com.korail.talk.network;

import android.content.Context;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C6054a;
import retrofit.RetrofitError;
import retrofit.client.Header;
import retrofit.mime.TypedInput;
import u4.c;
import y4.C6536a;
import y4.C6537b;
import z4.C6630d;
import z4.t;

/* loaded from: classes.dex */
public class BaseDaoHelper {
    private c mCLoadingDialog;
    private HttpTask mHttpTask;

    public class HttpTask extends AsyncTask<String, Void, IBaseDao> {
        private IBaseDao mDao;
        private C6536a mException;

        public HttpTask(IBaseDao iBaseDao) {
            this.mDao = iBaseDao;
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            if (!this.mDao.isPending() || this.mDao.getBase().isFinishing()) {
                return;
            }
            BaseDaoHelper.this.showLoading(this.mDao.isLoadingCancelable());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public IBaseDao doInBackground(String... strArr) throws InterruptedException, IOException {
            try {
                Thread.sleep(100L);
                this.mDao.setResponse(this.mDao.executeDao());
            } catch (InterruptedException e8) {
                t.e(e8.getMessage());
                e8.printStackTrace();
            } catch (RetrofitError e9) {
                this.mException = new C6537b();
                t.e(e9.getMessage());
                e9.printStackTrace();
                if (e9.getMessage().contains("403") && e9.getMessage().toLowerCase().contains("forbidden")) {
                    for (Header header : e9.getResponse().getHeaders()) {
                        t.e(String.valueOf(header));
                        t.e(header.getName());
                        t.e(header.getValue());
                        if (header.getName() != null && header.getName().equals("DynaPath-Result")) {
                            if (Integer.parseInt(header.getValue()) < 0) {
                                TypedInput body = e9.getResponse().getBody();
                                String string = null;
                                if (body != null) {
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(body.in()));
                                        StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            sb.append(line);
                                        }
                                        string = sb.toString();
                                        bufferedReader.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                    }
                                }
                                t.e(string);
                                try {
                                    JSONObject jSONObject = new JSONObject(string);
                                    if (jSONObject.has("message")) {
                                        string = jSONObject.get("message").toString();
                                    }
                                    this.mDao.setMacroShowDialog(string);
                                } catch (JSONException e11) {
                                    throw new RuntimeException(e11);
                                }
                            }
                            return this.mDao;
                        }
                    }
                }
            }
            return this.mDao;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        public void onPostExecute(IBaseDao iBaseDao) {
            super.onPostExecute((HttpTask) iBaseDao);
            try {
                try {
                    NetfunnelDao netfunnelDao = this.mDao.getNetfunnelDao();
                    if (netfunnelDao != null) {
                        netfunnelDao.runRunner();
                    }
                    this.mDao.getINetworkResult().onIntegrationResult(iBaseDao, this.mException);
                    if (!iBaseDao.isPending() || this.mDao.getBase().isFinishing()) {
                        return;
                    }
                } catch (Exception e8) {
                    if (C6054a.IS_DEBUG_LOG) {
                        e8.printStackTrace();
                    }
                    t.e(e8.getMessage());
                    if (!iBaseDao.isPending() || this.mDao.getBase().isFinishing()) {
                        return;
                    }
                }
                BaseDaoHelper.this.dismissLoading();
            } catch (Throwable th) {
                if (iBaseDao.isPending() && !this.mDao.getBase().isFinishing()) {
                    BaseDaoHelper.this.dismissLoading();
                }
                throw th;
            }
        }
    }

    public BaseDaoHelper() {
    }

    public void dismissLoading() {
        if (C6630d.isNull(this.mCLoadingDialog)) {
            return;
        }
        this.mCLoadingDialog.dismiss();
    }

    public void executeDao(IBaseDao iBaseDao) {
        t.d("executeDao -  " + iBaseDao.getClass().getSimpleName() + " : " + iBaseDao.getBase().getClass().getSimpleName());
        HttpTask httpTask = new HttpTask(iBaseDao);
        this.mHttpTask = httpTask;
        httpTask.execute(new String[0]);
    }

    public void onCancelDao() {
        if (C6630d.isNull(this.mHttpTask)) {
            return;
        }
        this.mHttpTask.cancel(true);
        dismissLoading();
    }

    public void onDestroy() {
        onCancelDao();
        this.mHttpTask = null;
        dismissLoading();
        this.mCLoadingDialog = null;
    }

    public void showLoading(boolean z8) {
        if (C6630d.isNull(this.mCLoadingDialog)) {
            return;
        }
        this.mCLoadingDialog.setCancelable(z8);
        this.mCLoadingDialog.show();
    }

    public BaseDaoHelper(Context context) {
        this.mCLoadingDialog = new c(context);
    }

    public void showLoading() {
        if (C6630d.isNull(this.mCLoadingDialog)) {
            return;
        }
        this.mCLoadingDialog.show();
    }
}
