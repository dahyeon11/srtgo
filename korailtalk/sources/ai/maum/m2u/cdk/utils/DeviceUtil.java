package ai.maum.m2u.cdk.utils;

import android.content.Context;
import android.graphics.Point;
import android.os.Environment;
import android.os.StatFs;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class DeviceUtil {
    private static final String TAG = "DeviceUtil";

    private DeviceUtil() {
    }

    public static long getExternalStorageFreeSpace() throws Throwable {
        String strNullToBlankTrim = StringUtil.nullToBlankTrim(Environment.getExternalStorageDirectory().getAbsolutePath());
        if (StringUtil.isBlank(strNullToBlankTrim)) {
            return -1L;
        }
        StatFs statFs = new StatFs(strNullToBlankTrim);
        long blockSize = statFs.getBlockSize() * statFs.getAvailableBlocks();
        LogUtil.i(TAG, "Available Size(Byte) = " + blockSize);
        return blockSize;
    }

    public static boolean isAvailableSaveSpace(long j8) {
        return j8 > 0 && getExternalStorageFreeSpace() > 0 && getExternalStorageFreeSpace() > j8;
    }

    public static boolean isPhoneScreenType(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        Point point = new Point();
        defaultDisplay.getSize(point);
        if (rotation == 0 || 2 == rotation) {
            if (point.x > point.y) {
                return false;
            }
        } else if (point.x <= point.y) {
            return false;
        }
        return true;
    }
}
