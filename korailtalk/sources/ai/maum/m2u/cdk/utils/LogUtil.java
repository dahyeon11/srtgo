package ai.maum.m2u.cdk.utils;

import android.os.Environment;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public class LogUtil {
    private static final String LOG_FILE = "log.txt";
    private static final String LOG_FOLDER = "/cdk/logs";
    private static boolean mIsPrintLog = true;
    private static boolean mIsSaveLogToFile = false;

    private LogUtil() {
    }

    public static void d(String str, String str2) throws Throwable {
        if (mIsPrintLog) {
            StringUtil.nullToBlankTrim(str2);
        }
        if (mIsSaveLogToFile) {
            saveLog(str, StringUtil.nullToBlankTrim(str2));
        }
    }

    public static void e(String str, String str2) throws Throwable {
        if (mIsPrintLog) {
            Log.e(str, StringUtil.nullToBlankTrim(str2));
        }
        if (mIsSaveLogToFile) {
            saveLog(str, StringUtil.nullToBlankTrim(str2));
        }
    }

    public static String getKorCurrentFormattedDate(String str) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.KOREA);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
        return simpleDateFormat.format(date);
    }

    private static String getLogFilePath() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            return "";
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (StringUtil.isBlank(absolutePath)) {
            return "";
        }
        String str = absolutePath + LOG_FOLDER;
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str + "/" + LOG_FILE;
    }

    public static String getStackTraceString(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void i(String str, String str2) throws Throwable {
        if (mIsPrintLog) {
            StringUtil.nullToBlankTrim(str2);
        }
        if (mIsSaveLogToFile) {
            saveLog(str, StringUtil.nullToBlankTrim(str2));
        }
    }

    public static boolean isPrintLog() {
        return mIsPrintLog;
    }

    public static boolean isSaveLogToFile() {
        return mIsSaveLogToFile;
    }

    private static void saveLog(String str, String str2) throws Throwable {
        String logFilePath = getLogFilePath();
        if (StringUtil.isBlank(logFilePath)) {
            return;
        }
        String str3 = String.format("%s : [%s] %s\r\n", getKorCurrentFormattedDate("HH:mm:ss.SSS"), str, str2);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(new File(logFilePath), true), 1024);
                    try {
                        bufferedWriter2.write(str3);
                        bufferedWriter2.close();
                    } catch (IOException e8) {
                        e = e8;
                        bufferedWriter = bufferedWriter2;
                        e.printStackTrace();
                        if (bufferedWriter != null) {
                            bufferedWriter.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e10) {
                e = e10;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static void setIsPrintLog(boolean z8) {
        mIsPrintLog = z8;
    }

    public static void setIsSaveLogToFile(boolean z8) {
        mIsSaveLogToFile = z8;
    }

    public static void v(String str, String str2) throws Throwable {
        if (mIsPrintLog) {
            StringUtil.nullToBlankTrim(str2);
        }
        if (mIsSaveLogToFile) {
            saveLog(str, StringUtil.nullToBlankTrim(str2));
        }
    }

    public static void w(String str, String str2) throws Throwable {
        if (mIsPrintLog) {
            Log.w(str, StringUtil.nullToBlankTrim(str2));
        }
        if (mIsSaveLogToFile) {
            saveLog(str, StringUtil.nullToBlankTrim(str2));
        }
    }

    public static void d(String str, String str2, Throwable th) throws Throwable {
        if (mIsPrintLog) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(StringUtil.nullToBlankTrim(str2));
            stringBuffer.append('\n');
            stringBuffer.append(getStackTraceString(th));
            d(str, stringBuffer.toString());
        }
    }

    public static void e(String str, String str2, Throwable th) throws Throwable {
        if (mIsPrintLog) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(StringUtil.nullToBlankTrim(str2));
            stringBuffer.append('\n');
            stringBuffer.append(getStackTraceString(th));
            e(str, stringBuffer.toString());
        }
    }

    public static void i(String str, String str2, Throwable th) throws Throwable {
        if (mIsPrintLog) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(StringUtil.nullToBlankTrim(str2));
            stringBuffer.append('\n');
            stringBuffer.append(getStackTraceString(th));
            i(str, stringBuffer.toString());
        }
    }

    public static void v(String str, String str2, Throwable th) throws Throwable {
        if (mIsPrintLog) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(StringUtil.nullToBlankTrim(str2));
            stringBuffer.append('\n');
            stringBuffer.append(getStackTraceString(th));
            v(str, stringBuffer.toString());
        }
    }

    public static void w(String str, String str2, Throwable th) throws Throwable {
        if (mIsPrintLog) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(StringUtil.nullToBlankTrim(str2));
            stringBuffer.append('\n');
            stringBuffer.append(getStackTraceString(th));
            w(str, stringBuffer.toString());
        }
    }
}
