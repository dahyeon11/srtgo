package com.h2osystech.smartalimi.common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.ContactsContract;
import android.widget.Toast;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class CommonUtil {
    private static final String TAG = "CommonUtil";

    private static Bitmap DownloadImage(String str) throws IOException {
        Bitmap bitmapDecodeStream = null;
        try {
            InputStream inputStreamOpenHttpConnection = OpenHttpConnection(str);
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenHttpConnection);
            inputStreamOpenHttpConnection.close();
            return bitmapDecodeStream;
        } catch (IOException e8) {
            e8.printStackTrace();
            return bitmapDecodeStream;
        }
    }

    private static InputStream OpenHttpConnection(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL("http://upload.wikimedia.org/wikipedia/commons/8/8c/JPEG_example_JPG_RIP_025.jpg").openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Not an HTTP connection");
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception unused) {
            throw new IOException("Error connecting");
        }
    }

    public static void WriteLog(String str) throws IOException {
        String str2 = Environment.getExternalStorageDirectory() + "/H2O";
        File file = new File(str2);
        String string = new SimpleDateFormat("yyyyMMdd").format(Long.valueOf(System.currentTimeMillis())).toString();
        try {
            if (!file.exists()) {
                file.mkdir();
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file.getAbsoluteFile(), "log" + string + "+.txt"));
                fileOutputStream.flush();
                fileOutputStream.close();
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(str2 + "/log" + string + ".txt", "rw");
            randomAccessFile.seek(randomAccessFile.length());
            randomAccessFile.writeBytes(new String(("\r\n[" + new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss").format(Long.valueOf(System.currentTimeMillis())) + "]\r\n" + str).getBytes("KSC5601"), "8859_1"));
            randomAccessFile.close();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static HashSet<String> defaultSet(Context context) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(Const.login_msg(context));
        return hashSet;
    }

    public static String getAppVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "0";
        }
    }

    public static Set<String> getBlackList(Context context) {
        return context.getSharedPreferences("info", 0).getStringSet("blacklist", null);
    }

    public static String getBootTime() {
        return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(System.currentTimeMillis()));
    }

    public static String getConnectedNetwork(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "";
            }
            String typeName = activeNetworkInfo.getTypeName();
            return typeName.equals("mobile") ? activeNetworkInfo.getSubtypeName() : typeName;
        } catch (NullPointerException e8) {
            LogFile.log(TAG, 0, "getConnectedNetwork: " + e8.getMessage());
            return "";
        }
    }

    public static String getExtension(String str) {
        return str.substring(str.lastIndexOf(".") + 1, str.length());
    }

    public static String getLocaleRegion(Context context) {
        return context.getResources().getConfiguration().locale.getCountry();
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String getOSType() {
        return Build.TYPE;
    }

    public static String getOSVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getPref(Context context, String str) {
        return context.getSharedPreferences("info", 0).getString(str, "");
    }

    public static int getResourceId(Context context, Object obj) {
        return context.getResources().getIdentifier((String) obj, "string", context.getPackageName());
    }

    public static int getSDKVersion() {
        return Build.VERSION.SDK_INT;
    }

    public static String getTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
    }

    public static byte[] intToByteArray(int i8) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i8);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        return byteBufferAllocate.array();
    }

    public static boolean isSaveMode(Context context) {
        boolean zIsPowerSaveMode = ((PowerManager) context.getSystemService("power")).isPowerSaveMode();
        LogFile.log(TAG, 3, "OnReceiveGCM: Power SaveMode Check is " + zIsPowerSaveMode);
        return zIsPowerSaveMode;
    }

    public static boolean isTablet(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 4) == 4;
    }

    public static boolean isUsingLogoutTR() {
        return false;
    }

    public static String matchContactName(ContentResolver contentResolver, String str) {
        Cursor cursorQuery = contentResolver.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"display_name"}, null, null, null);
        if (cursorQuery != null) {
            str = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : "";
            cursorQuery.close();
        }
        return str;
    }

    public static byte[] readFromStream(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        byte[] bArr = new byte[5242880];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10485760);
        try {
            byteArrayOutputStream.write(bArr, 0, inputStream.read(bArr));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void setBlackList(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("info", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("blacklist", null);
        if (stringSet == null) {
            stringSet = new HashSet<>();
        }
        stringSet.add(str);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putStringSet("blacklist", stringSet);
        editorEdit.commit();
    }

    public static void setPref(Context context, String str, String str2) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("info", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    public static byte[] strCharsetBytes(String str, int i8, Charset charset) {
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = 32;
        }
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public static void viewFile(Context context, String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        File file = new File(str, str2);
        Uri.fromFile(file);
        String extension = getExtension(file.getAbsolutePath());
        if (extension.equalsIgnoreCase("mp3")) {
            intent.setDataAndType(Uri.fromFile(file), "audio/*");
        } else if (extension.equalsIgnoreCase("mp4")) {
            intent.setDataAndType(Uri.fromFile(file), "vidio/*");
        } else if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("jpeg") || extension.equalsIgnoreCase("gif") || extension.equalsIgnoreCase("png") || extension.equalsIgnoreCase("bmp")) {
            intent.setDataAndType(Uri.fromFile(file), "image/*");
        } else if (extension.equalsIgnoreCase("txt")) {
            intent.setDataAndType(Uri.fromFile(file), "text/*");
        } else if (extension.equalsIgnoreCase("doc") || extension.equalsIgnoreCase("docx")) {
            intent.setDataAndType(Uri.fromFile(file), "application/msword");
        } else if (extension.equalsIgnoreCase("xls") || extension.equalsIgnoreCase("xlsx")) {
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.ms-excel");
        } else if (extension.equalsIgnoreCase("ppt") || extension.equalsIgnoreCase("pptx")) {
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.ms-powerpoint");
        } else if (extension.equalsIgnoreCase("pdf")) {
            intent.setDataAndType(Uri.fromFile(file), "application/pdf");
        } else if (extension.equalsIgnoreCase("hwp")) {
            intent.setDataAndType(Uri.fromFile(file), "application/haansofthwp");
        }
        if (context.getPackageManager().queryIntentActivities(intent, 128).size() != 0) {
            context.startActivity(intent);
            return;
        }
        Toast.makeText(context, str2 + "을 확인할 수 있는 앱이 설치되지 않았습니다.", 0).show();
    }
}
