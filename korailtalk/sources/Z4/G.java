package z4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.h2osystech.smartalimi.servicealimi.BuildConfig;
import com.korail.talk.data.PlayAppData;
import com.korail.talk.ui.payment.PaymentActivity;
import java.io.File;
import java.net.URISyntaxException;
import n4.AbstractC5954e;
import n4.AbstractC5958i;
import org.json.JSONObject;
import p4.C6054a;
import r4.C6174a;
import s4.C6219c;

/* loaded from: classes.dex */
public class G extends C6632f {
    private static void d(final Activity activity, final PlayAppData playAppData) {
        C6219c cDialog = C6637k.getCDialog(activity, 1002, activity instanceof PaymentActivity ? 1 : 0, playAppData.getTitle());
        cDialog.setContent(playAppData.getMessageList());
        cDialog.setButtonListener(new DialogInterface.OnClickListener() { // from class: z4.F
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                G.e(playAppData, activity, dialogInterface, i8);
            }
        });
        cDialog.showDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(PlayAppData playAppData, Activity activity, DialogInterface dialogInterface, int i8) {
        if (100 == i8) {
            if (playAppData.isFinishActivity()) {
                activity.finish();
            }
        } else if (102 == i8) {
            moveToGooglePlay(activity, playAppData.getIntent().getPackage());
        }
    }

    public static Intent getIntentDefault(Activity activity, String str) {
        Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(str);
        if (!C6630d.isNull(launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage(str);
        return intent;
    }

    public static Intent getIntentFax(Activity activity, File file) {
        Uri uriForFile = FileProvider.getUriForFile(activity, C6174a.FILE_PROVIDER_AUTHORITIES, file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setPackage("com.dho.mobilefax");
        intent.setDataAndType(uriForFile, "*/*");
        intent.putExtra("customerCode", BuildConfig.FLAVOR);
        intent.putExtra("customerIcon", BitmapFactory.decodeResource(activity.getResources(), AbstractC5954e.c_bi_gray));
        intent.putExtra("customerSendIcon", BitmapFactory.decodeResource(activity.getResources(), AbstractC5958i.ic_launcher));
        activity.grantUriPermission("com.dho.mobilefax", uriForFile, 3);
        return intent;
    }

    public static Intent getIntentSRT(Activity activity, JSONObject jSONObject) {
        Intent intentDefault = getIntentDefault(activity, "kr.co.srail.newapp");
        intentDefault.setFlags(268468224);
        intentDefault.putExtra("PARAM", jSONObject.toString());
        I4.b.getInstance().setCorpTransfer(false);
        return intentDefault;
    }

    public static Intent getIntentScheme(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.setPackage(str2);
        return intent;
    }

    public static Intent getIntentShare(Activity activity, File file, String str, String str2) {
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("android.intent.action.SEND");
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.TEXT", str2);
        intent.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(activity, C6174a.FILE_PROVIDER_AUTHORITIES, file));
        return intent;
    }

    public static boolean isInstallApp(Activity activity, Intent intent) {
        return C6630d.isNotNull(intent.resolveActivity(activity.getPackageManager()));
    }

    public static void moveToGooglePlay(Activity activity, String str) {
        try {
            if (C6054a.IS_ONE_STORE) {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://onesto.re/0000751454")));
            } else {
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)));
            }
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, "앱 설치를 실패 하였습니다.", 1).show();
        }
    }

    public static void moveToGooglePlayByWeb(Activity activity, String str) {
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, "앱 설치를 실패 하였습니다.", 1).show();
        }
    }

    public static void playApp(Activity activity, Intent intent) {
        PlayAppData playAppData = new PlayAppData();
        playAppData.setIntent(intent);
        playApp(activity, playAppData);
    }

    public static void playApp(Activity activity, PlayAppData playAppData) {
        Intent intent = playAppData.getIntent();
        if (isInstallApp(activity, intent)) {
            activity.startActivity(intent);
        } else if (playAppData.isShowDialog()) {
            d(activity, playAppData);
        } else {
            moveToGooglePlay(activity, playAppData.getIntent().getPackage());
        }
    }

    public static void playApp(Activity activity, String str) {
        try {
            Intent uri = Intent.parseUri(str, 1);
            if (isInstallApp(activity, uri)) {
                activity.startActivity(uri);
            } else {
                moveToGooglePlay(activity, uri.getPackage());
            }
        } catch (URISyntaxException e8) {
            e8.printStackTrace();
        }
    }
}
