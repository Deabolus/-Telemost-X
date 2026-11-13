package defpackage;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.Locale;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class hu7 {
    public final Context a;

    public hu7(Context context) {
        this.a = context;
    }

    public static void a(g5l g5lVar, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                g5lVar.a(str, "unexpected_value");
                return;
            }
        }
        g5lVar.a(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x006b  */
    public final void b(g5l g5lVar) {
        Pair pair;
        Context context = this.a;
        a(g5lVar, "X-App-Version", n9.b(context));
        a(g5lVar, "X-App-Id", context.getPackageName());
        a(g5lVar, "X-App-Platform", "android");
        a(g5lVar, "X-App-Platform-Version", String.valueOf(Build.VERSION.SDK_INT));
        a(g5lVar, "X-App-Device-Manufacturer", Build.MANUFACTURER);
        a(g5lVar, "X-App-Device-Model", Build.MODEL);
        a(g5lVar, "X-App-Device-Locale", Locale.getDefault().toString());
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            String networkOperator = telephonyManager.getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                pair = null;
            } else {
                pair = new Pair(networkOperator.substring(0, 3), networkOperator.substring(3));
            }
        } else {
            pair = null;
        }
        if (pair != null) {
            a(g5lVar, "X-App-Operator-MCC", (String) pair.first);
            a(g5lVar, "X-App-Operator-MNC", (String) pair.second);
        }
    }

    public final String c() {
        Context context = this.a;
        String packageName = context.getPackageName();
        String strB = n9.b(context);
        if (strB == null) {
            strB = "257.0";
        }
        return wq1.j("Android ", packageName, "/", strB, " MessengerKit/257.0");
    }
}
