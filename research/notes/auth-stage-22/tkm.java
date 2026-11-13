package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackSupportEntity;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackTelemostEntity;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackTelemostRequest;
import com.yandex.messaging.internal.calls.feedback.CallFeedbackToolsEntity;
import com.yandex.messaging.internal.entities.feedback.CallFeedbackReason;
import io.appmetrica.analytics.AppMetricaYandex;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class tkm extends dv1 {
    public final ye3 g;

    public tkm(bn4 bn4Var, ye3 ye3Var) {
        super(bn4Var);
        this.g = ye3Var;
    }

    @Override // defpackage.jf
    public final boolean e(jf jfVar) {
        if (jfVar instanceof tkm) {
            return Objects.equals(this.g.a, ((tkm) jfVar).g.a);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0207  */
    /* JADX WARN: Code duplicated, block: B:42:0x025b  */
    /* JADX WARN: Code duplicated, block: B:91:0x038e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0393  */
    /* JADX WARN: Code duplicated, block: B:95:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:96:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:99:0x0431  */
    @Override // defpackage.tn4
    public final void w(sc4 sc4Var, xr6 xr6Var) {
        String str;
        Context context;
        String str2;
        ArrayList arrayList;
        String str3;
        String strQ;
        g5l g5lVar;
        String string;
        String str4;
        ArrayList arrayList2;
        fp3 fp3Var = (fp3) xr6Var.m0.get();
        q9j q9jVar = fp3Var.a;
        eqq eqqVar = fp3Var.j;
        ueg uegVar = fp3Var.f;
        hu7 hu7Var = fp3Var.d;
        n2d n2dVar = fp3Var.e;
        hqq hqqVar = fp3Var.c;
        ye3 ye3Var = this.g;
        mqd.z(ye3Var, "feedback");
        String str5 = ye3Var.f;
        String str6 = ye3Var.e;
        int i = ye3Var.b;
        String str7 = ye3Var.a;
        Integer num = ye3Var.g;
        Looper looper = fp3Var.h;
        atl.s(looper, Looper.myLooper(), null);
        ze3 ze3Var = fp3Var.i;
        atl.s(looper, Looper.myLooper(), null);
        Set set = ye3Var.c;
        Set set2 = ye3Var.d;
        HashSet hashSet = new HashSet(set.size());
        for (Iterator it = set.iterator(); it.hasNext(); it = it) {
            hashSet.add(((CallFeedbackReason) it.next()).name);
        }
        HashSet hashSet2 = new HashSet(set2.size());
        for (Iterator it2 = set2.iterator(); it2.hasNext(); it2 = it2) {
            hashSet2.add(((CallFeedbackReason) it2.next()).name);
        }
        CallFeedbackToolsEntity callFeedbackToolsEntity = new CallFeedbackToolsEntity();
        callFeedbackToolsEntity.userGuid = hqqVar.a;
        callFeedbackToolsEntity.callGuid = str7;
        callFeedbackToolsEntity.score = i;
        callFeedbackToolsEntity.details = str6;
        callFeedbackToolsEntity.audioReasons = (String[]) hashSet.toArray(new String[0]);
        callFeedbackToolsEntity.videoReasons = (String[]) hashSet2.toArray(new String[0]);
        callFeedbackToolsEntity.environment = (String) fp3Var.b.d(new j43(12));
        callFeedbackToolsEntity.meetingId = str5;
        callFeedbackToolsEntity.callEndedReason = num != null ? xo7.q(num.intValue()) : null;
        ze3Var.getClass();
        zd3 zd3Var = (zd3) ze3Var.b;
        String str8 = (String) ze3Var.f;
        k4e k4eVar = (k4e) ze3Var.g;
        k4eVar.getClass();
        g4e g4eVarD = rcd.d(k4eVar.a(CallFeedbackToolsEntity.class), callFeedbackToolsEntity);
        g5l g5lVarG = ze3Var.g();
        g5lVarG.f(g4eVarD);
        zd3Var.a(g5lVarG.b()).d(new wlc(8));
        wpm wpmVar = fp3Var.g;
        wpmVar.getClass();
        Set set3 = set;
        ArrayList arrayList3 = new ArrayList(ac5.Y(set3, 10));
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((CallFeedbackReason) it3.next()).name);
        }
        Set set4 = set2;
        ArrayList arrayList4 = new ArrayList(ac5.Y(set4, 10));
        Iterator it4 = set4.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((CallFeedbackReason) it4.next()).name);
        }
        LinkedHashMap linkedHashMapN0 = xgf.n0(new ypi[]{new ypi("datetime", ((SimpleDateFormat) wpmVar.e).format(new Date())), new ypi("call_guid", str7), new ypi("user_guid", ((hqq) wpmVar.d).a), new ypi("session_id", (String) wpmVar.b), new ypi("meeting_id", str5), new ypi("meeting_end_reason", num), new ypi("score", Integer.valueOf(i)), new ypi("reasons", zb5.l1(zb5.S0(arrayList4, arrayList3)))});
        if (str6 != null) {
            linkedHashMapN0.put("text", str6);
        }
        ((x20) wpmVar.c).reportEvent("RTC_USER_CALL_QUALITY_SCORE", linkedHashMapN0);
        CallFeedbackSupportEntity callFeedbackSupportEntity = new CallFeedbackSupportEntity();
        zcj zcjVarO = uegVar.O();
        String str9 = "-";
        if (zcjVarO == null || (str = zcjVarO.d) == null) {
            str = "-";
        } else {
            if (str.length() <= 0) {
                str = null;
            }
            if (str == null) {
                str = "-";
            }
        }
        callFeedbackSupportEntity.login = str;
        hu7Var.getClass();
        Context context2 = hu7Var.a;
        callFeedbackSupportEntity.os = wq1.h("android ", String.valueOf(Build.VERSION.SDK_INT));
        callFeedbackSupportEntity.appVersion = n9.b(context2);
        callFeedbackSupportEntity.device = k87.k(Build.MANUFACTURER, " ", Build.MODEL);
        callFeedbackSupportEntity.client = CallFeedbackTelemostEntity.CLIENT_ANDROID;
        callFeedbackSupportEntity.score = i;
        callFeedbackSupportEntity.guid = hqqVar.a;
        callFeedbackSupportEntity.callGuid = str7;
        a7s a7sVar = (a7s) n2dVar;
        Context context3 = a7sVar.a;
        Context context4 = a7sVar.a;
        callFeedbackSupportEntity.uuid = AppMetricaYandex.getUuid(context3);
        callFeedbackSupportEntity.deviceId = AppMetricaYandex.getDeviceId(context4);
        if (str6 == null) {
            str6 = "-";
        } else {
            if (str6.length() <= 0) {
                str6 = null;
            }
            if (str6 == null) {
                str6 = "-";
            }
        }
        callFeedbackSupportEntity.details = str6;
        String strB = eqqVar.b();
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                str9 = strB;
            }
        }
        callFeedbackSupportEntity.email = str9;
        callFeedbackSupportEntity.meetingId = str5;
        callFeedbackSupportEntity.callEndReason = num != null ? xo7.q(num.intValue()) : null;
        callFeedbackSupportEntity.service = f3r.I("10294459");
        callFeedbackSupportEntity.messageSubject = f3r.I("10294469");
        Boolean bool = ye3Var.h;
        callFeedbackSupportEntity.isInitiator = bool != null ? String.valueOf(bool.booleanValue()) : null;
        Long l = ye3Var.i;
        callFeedbackSupportEntity.timestamp = l != null ? String.valueOf(l.longValue()) : null;
        callFeedbackSupportEntity.chatId = q9jVar.b;
        g4e g4eVarD2 = rcd.d(k4eVar.a(CallFeedbackSupportEntity.class), callFeedbackSupportEntity);
        g5l g5lVar2 = new g5l();
        g5lVar2.i("https://forms-ext-api.yandex.ru/v3/surveys/9481/form/");
        g5lVar2.a("User-Agent", str8);
        g5lVar2.a("Content-Type", "application/json");
        g5lVar2.f(g4eVarD2);
        zd3Var.a(g5lVar2.b()).d(new wlc(8));
        zcj zcjVarO2 = uegVar.O();
        LinkedHashSet linkedHashSetK = hum.k(set, set4);
        ArrayList arrayList5 = new ArrayList(ac5.Y(linkedHashSetK, 10));
        Iterator it5 = linkedHashSetK.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((CallFeedbackReason) it5.next()).name);
        }
        String str10 = ye3Var.f;
        String str11 = hqqVar.a;
        String strB2 = n9.b(context2);
        boolean z = zcjVarO2 != null ? zcjVarO2.h : false;
        if (zcjVarO2 != null) {
            ycj[] ycjVarArr = zcjVarO2.k;
            ArrayList arrayList6 = new ArrayList();
            int length = ycjVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2;
                ycj ycjVar = ycjVarArr[i3];
                Context context5 = context4;
                if (ycjVar.d || ycjVar.e) {
                    str4 = str10;
                    arrayList2 = arrayList5;
                } else {
                    str4 = str10;
                    arrayList2 = arrayList5;
                    if (ycjVar.a != 0) {
                        arrayList6.add(ycjVar);
                    }
                }
                i2 = i3 + 1;
                context4 = context5;
                str10 = str4;
                arrayList5 = arrayList2;
            }
            context = context4;
            str2 = str10;
            arrayList = arrayList5;
            ycj ycjVar2 = (ycj) zb5.B0(arrayList6);
            String strValueOf = ycjVar2 != null ? String.valueOf(ycjVar2.a) : null;
            int i4 = ye3Var.b;
            String str12 = ye3Var.e;
            if (zcjVarO2 != null) {
                str3 = zcjVarO2.d;
            } else {
                str3 = null;
            }
            String strH = wq1.h("android ", String.valueOf(Build.VERSION.SDK_INT));
            String strK = k87.k(Build.MANUFACTURER, " ", Build.MODEL);
            String str13 = ye3Var.a;
            String uuid = AppMetricaYandex.getUuid(context);
            String deviceId = AppMetricaYandex.getDeviceId(context);
            String strB3 = eqqVar.b();
            if (num != null) {
                strQ = xo7.q(num.intValue());
            } else {
                strQ = null;
            }
            g4e g4eVarD3 = rcd.d(k4eVar.a(CallFeedbackTelemostRequest.class), new CallFeedbackTelemostRequest(new CallFeedbackTelemostEntity(null, str2, str11, null, strB2, z, strValueOf, i4, arrayList, str12, str3, strH, strK, null, str13, uuid, deviceId, strB3, strQ, ye3Var.h, ye3Var.i, q9jVar.b, 8201, null)));
            g5lVar = new g5l();
            fsc fscVar = (fsc) ze3Var.h;
            g5lVar.i("https://" + ((String) fscVar.a.d(fscVar.f)) + "/v1/telemost/stat/log");
            g5lVar.a("User-Agent", str8);
            string = ((SharedPreferences) ze3Var.i).getString("oauth_token", null);
            if (string != null) {
                g5lVar.a("Authorization", "OAuth ".concat(string));
            }
            g5lVar.f(g4eVarD3);
            zd3Var.a(g5lVar.b()).d(new wlc(8));
            g();
        }
        context = context4;
        str2 = str10;
        arrayList = arrayList5;
        int i5 = ye3Var.b;
        String str14 = ye3Var.e;
        if (zcjVarO2 != null) {
            str3 = zcjVarO2.d;
        } else {
            str3 = null;
        }
        String strH2 = wq1.h("android ", String.valueOf(Build.VERSION.SDK_INT));
        String strK2 = k87.k(Build.MANUFACTURER, " ", Build.MODEL);
        String str15 = ye3Var.a;
        String uuid2 = AppMetricaYandex.getUuid(context);
        String deviceId2 = AppMetricaYandex.getDeviceId(context);
        String strB4 = eqqVar.b();
        if (num != null) {
            strQ = xo7.q(num.intValue());
        } else {
            strQ = null;
        }
        g4e g4eVarD4 = rcd.d(k4eVar.a(CallFeedbackTelemostRequest.class), new CallFeedbackTelemostRequest(new CallFeedbackTelemostEntity(null, str2, str11, null, strB2, z, strValueOf, i5, arrayList, str14, str3, strH2, strK2, null, str15, uuid2, deviceId2, strB4, strQ, ye3Var.h, ye3Var.i, q9jVar.b, 8201, null)));
        g5lVar = new g5l();
        fsc fscVar2 = (fsc) ze3Var.h;
        g5lVar.i("https://" + ((String) fscVar2.a.d(fscVar2.f)) + "/v1/telemost/stat/log");
        g5lVar.a("User-Agent", str8);
        string = ((SharedPreferences) ze3Var.i).getString("oauth_token", null);
        if (string != null) {
            g5lVar.a("Authorization", "OAuth ".concat(string));
        }
        g5lVar.f(g4eVarD4);
        zd3Var.a(g5lVar.b()).d(new wlc(8));
        g();
    }
}
