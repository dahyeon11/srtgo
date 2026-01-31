package com.h2osystech.smartalimi.common;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class LogFile {
    private static final int LOG_FILE_MAX_COUNT = 4;
    private static final String LOG_FILE_NAME = "korail%g.txt";
    private static final int LOG_FILE_SIZE_LIMIT = 524288;
    private static final String TAG = "LogFile";
    private static FileHandler fileHandler;
    private static Logger logger;
    private static final SimpleDateFormat formatter = new SimpleDateFormat("MM-dd HH:mm:ss.SSS: ", Locale.getDefault());
    private static final Date date = new Date();

    public static void createHandler() throws SecurityException {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(Environment.getExternalStorageDirectory());
            String str = File.separator;
            sb.append(str);
            sb.append("H2O");
            String string = sb.toString();
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
            FileHandler fileHandler2 = new FileHandler(string + str + LOG_FILE_NAME, 524288, 4, true);
            fileHandler = fileHandler2;
            fileHandler2.setFormatter(new Formatter() { // from class: com.h2osystech.smartalimi.common.LogFile.1
                @Override // java.util.logging.Formatter
                public String format(LogRecord logRecord) {
                    LogFile.date.setTime(System.currentTimeMillis());
                    StringBuilder sb2 = new StringBuilder(80);
                    sb2.append(LogFile.formatter.format(LogFile.date));
                    sb2.append(logRecord.getMessage());
                    return sb2.toString();
                }
            });
            Logger logger2 = Logger.getLogger(LogFile.class.getName());
            logger = logger2;
            logger2.addHandler(fileHandler);
            logger.setLevel(Level.ALL);
            logger.setUseParentHandlers(false);
        } catch (IOException e8) {
            Log.e(TAG, "LOG INIT !!!" + e8.getMessage());
            fileHandler = null;
            logger = null;
        }
    }

    public static void log(String str, int i8, String str2) {
        if (i8 > Const.logLevel) {
            int i9 = Const.SB_ERR_INVALID_TOKEN;
        }
    }
}
