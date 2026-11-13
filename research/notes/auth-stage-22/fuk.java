package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.app.r0;
import com.google.protobuf.DescriptorProtos;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.core.net.entities.Metadata;
import com.yandex.messaging.core.net.entities.proto.message.ClientMessage;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ReducedMessage;
import com.yandex.messaging.views.KeyboardAwareEmojiEditText;
import com.yandex.passport.api.j2;
import com.yandex.telemost.newarch.screensharing.ScreenSharingService;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.RtmConfig;
import io.appmetrica.analytics.UserInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ru.yandex.video.m3.data.StartFromCacheInfo;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class fuk extends lao implements pib {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuk(pib pibVar, ic6 ic6Var) {
        super(2, ic6Var);
        this.e = 8;
        this.g = (lao) pibVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: mnh */
    public final Object invoke(Object obj, Object obj2) throws mnh {
        switch (this.e) {
            case 0:
                fuk fukVarQ = q((ic6) obj2, (ue6) obj);
                fcq fcqVar = fcq.a;
                fukVarQ.t(fcqVar);
                return fcqVar;
            case 1:
                fuk fukVarQ2 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar2 = fcq.a;
                fukVarQ2.t(fcqVar2);
                return fcqVar2;
            case 2:
                fuk fukVarQ3 = q((ic6) obj2, (List) obj);
                fcq fcqVar3 = fcq.a;
                fukVarQ3.t(fcqVar3);
                return fcqVar3;
            case 3:
                fuk fukVarQ4 = q((ic6) obj2, (List) obj);
                fcq fcqVar4 = fcq.a;
                fukVarQ4.t(fcqVar4);
                return fcqVar4;
            case 4:
                fuk fukVarQ5 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar5 = fcq.a;
                fukVarQ5.t(fcqVar5);
                return fcqVar5;
            case 5:
                fuk fukVarQ6 = q((ic6) obj2, (afo) obj);
                fcq fcqVar6 = fcq.a;
                fukVarQ6.t(fcqVar6);
                return fcqVar6;
            case 6:
                fuk fukVarQ7 = q((ic6) obj2, (vhl) obj);
                fcq fcqVar7 = fcq.a;
                fukVarQ7.t(fcqVar7);
                return fcqVar7;
            case 7:
                fuk fukVarQ8 = q((ic6) obj2, (hil) obj);
                fcq fcqVar8 = fcq.a;
                fukVarQ8.t(fcqVar8);
                return fcqVar8;
            case 8:
                return q((ic6) obj2, (ue6) obj).t(fcq.a);
            case 9:
                fuk fukVarQ9 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar9 = fcq.a;
                fukVarQ9.t(fcqVar9);
                return fcqVar9;
            case 10:
                fuk fukVarQ10 = q((ic6) obj2, (j2) obj);
                fcq fcqVar10 = fcq.a;
                fukVarQ10.t(fcqVar10);
                return fcqVar10;
            case 11:
                fuk fukVarQ11 = q((ic6) obj2, (pr5) obj);
                fcq fcqVar11 = fcq.a;
                fukVarQ11.t(fcqVar11);
                return fcqVar11;
            case 12:
                fuk fukVarQ12 = q((ic6) obj2, (kac) obj);
                fcq fcqVar12 = fcq.a;
                fukVarQ12.t(fcqVar12);
                return fcqVar12;
            case 13:
                fuk fukVarQ13 = q((ic6) obj2, (yh) obj);
                fcq fcqVar13 = fcq.a;
                fukVarQ13.t(fcqVar13);
                return fcqVar13;
            case 14:
                fuk fukVarQ14 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar14 = fcq.a;
                fukVarQ14.t(fcqVar14);
                return fcqVar14;
            case 15:
                fuk fukVarQ15 = q((ic6) obj2, obj);
                fcq fcqVar15 = fcq.a;
                fukVarQ15.t(fcqVar15);
                return fcqVar15;
            case 16:
                fuk fukVarQ16 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar16 = fcq.a;
                fukVarQ16.t(fcqVar16);
                return fcqVar16;
            case 17:
                fuk fukVarQ17 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar17 = fcq.a;
                fukVarQ17.t(fcqVar17);
                return fcqVar17;
            case 18:
                fuk fukVarQ18 = q((ic6) obj2, (ypi) obj);
                fcq fcqVar18 = fcq.a;
                fukVarQ18.t(fcqVar18);
                return fcqVar18;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                fuk fukVarQ19 = q((ic6) obj2, (afo) obj);
                fcq fcqVar19 = fcq.a;
                fukVarQ19.t(fcqVar19);
                return fcqVar19;
            case 20:
                fuk fukVarQ20 = q((ic6) obj2, (kac) obj);
                fcq fcqVar20 = fcq.a;
                fukVarQ20.t(fcqVar20);
                return fcqVar20;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                fuk fukVarQ21 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar21 = fcq.a;
                fukVarQ21.t(fcqVar21);
                return fcqVar21;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return q((ic6) obj2, (fcq) obj).t(fcq.a);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                fuk fukVarQ22 = q((ic6) obj2, (d35) obj);
                fcq fcqVar22 = fcq.a;
                fukVarQ22.t(fcqVar22);
                return fcqVar22;
            case 24:
                fuk fukVarQ23 = q((ic6) obj2, (omm) obj);
                fcq fcqVar23 = fcq.a;
                fukVarQ23.t(fcqVar23);
                return fcqVar23;
            case 25:
                fuk fukVarQ24 = q((ic6) obj2, (Metadata) obj);
                fcq fcqVar24 = fcq.a;
                fukVarQ24.t(fcqVar24);
                return fcqVar24;
            case 26:
                fuk fukVarQ25 = q((ic6) obj2, (omm) obj);
                fcq fcqVar25 = fcq.a;
                fukVarQ25.t(fcqVar25);
                return fcqVar25;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                fuk fukVarQ26 = q((ic6) obj2, (Metadata) obj);
                fcq fcqVar26 = fcq.a;
                fukVarQ26.t(fcqVar26);
                return fcqVar26;
            case 28:
                fuk fukVarQ27 = q((ic6) obj2, (ue6) obj);
                fcq fcqVar27 = fcq.a;
                fukVarQ27.t(fcqVar27);
                return fcqVar27;
            default:
                fuk fukVarQ28 = q((ic6) obj2, (cvn) obj);
                fcq fcqVar28 = fcq.a;
                fukVarQ28.t(fcqVar28);
                return fcqVar28;
        }
    }

    public final ic6 q(ic6 ic6Var, Object obj) {
        switch (this.e) {
            case 0:
                return new fuk((guk) this.f, (ReducedMessage) this.g, ic6Var, 0);
            case 1:
                return new fuk((mwk) this.f, (zfa) this.g, ic6Var, 1);
            case 2:
                fuk fukVar = new fuk((g1l) this.g, ic6Var, 2);
                fukVar.f = obj;
                return fukVar;
            case 3:
                fuk fukVar2 = new fuk((r7l) this.g, ic6Var, 3);
                fukVar2.f = obj;
                return fukVar2;
            case 4:
                return new fuk((CharSequence) this.f, ic6Var, (g8l) this.g);
            case 5:
                fuk fukVar3 = new fuk((kbl) this.g, ic6Var, 5);
                fukVar3.f = obj;
                return fukVar3;
            case 6:
                fuk fukVar4 = new fuk((bhl) this.g, ic6Var, 6);
                fukVar4.f = obj;
                return fukVar4;
            case 7:
                fuk fukVar5 = new fuk((mil) this.g, ic6Var, 7);
                fukVar5.f = obj;
                return fukVar5;
            case 8:
                fuk fukVar6 = new fuk((lao) this.g, ic6Var);
                fukVar6.f = obj;
                return fukVar6;
            case 9:
                return new fuk((iz8) this.f, (kib) this.g, ic6Var, 9);
            case 10:
                fuk fukVar7 = new fuk((zzl) this.g, ic6Var, 10);
                fukVar7.f = obj;
                return fukVar7;
            case 11:
                fuk fukVar8 = new fuk((c1m) this.g, ic6Var, 11);
                fukVar8.f = obj;
                return fukVar8;
            case 12:
                fuk fukVar9 = new fuk((o1m) this.g, ic6Var, 12);
                fukVar9.f = obj;
                return fukVar9;
            case 13:
                fuk fukVar10 = new fuk((ScreenSharingService) this.g, ic6Var, 13);
                fukVar10.f = obj;
                return fukVar10;
            case 14:
                return new fuk((zym) this.f, (iz8) this.g, ic6Var, 14);
            case 15:
                fuk fukVar11 = new fuk((fbm) this.g, ic6Var, 15);
                fukVar11.f = obj;
                return fukVar11;
            case 16:
                return new fuk((kib) this.f, (lrn) this.g, ic6Var, 16);
            case 17:
                return new fuk((kpm) this.f, (ClientMessage) this.g, ic6Var, 17);
            case 18:
                fuk fukVar12 = new fuk((esm) this.g, ic6Var, 18);
                fukVar12.f = obj;
                return fukVar12;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                return new fuk((yym) this.f, (ezm) this.g, ic6Var, 19);
            case 20:
                fuk fukVar13 = new fuk((x1n) this.g, ic6Var, 20);
                fukVar13.f = obj;
                return fukVar13;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                return new fuk((x1n) this.f, (Intent) this.g, ic6Var, 21);
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                return new fuk((tdn) this.f, (Set) this.g, ic6Var, 22);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                fuk fukVar14 = new fuk((sin) this.g, ic6Var, 23);
                fukVar14.f = obj;
                return fukVar14;
            case 24:
                fuk fukVar15 = new fuk((znn) this.g, ic6Var, 24);
                fukVar15.f = obj;
                return fukVar15;
            case 25:
                fuk fukVar16 = new fuk((fon) this.g, ic6Var, 25);
                fukVar16.f = obj;
                return fukVar16;
            case 26:
                fuk fukVar17 = new fuk((gon) this.g, ic6Var, 26);
                fukVar17.f = obj;
                return fukVar17;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                fuk fukVar18 = new fuk((oon) this.g, ic6Var, 27);
                fukVar18.f = obj;
                return fukVar18;
            case 28:
                return new fuk((upn) this.f, (StartFromCacheInfo) this.g, ic6Var, 28);
            default:
                fuk fukVar19 = new fuk((dvn) this.g, ic6Var, 29);
                fukVar19.f = obj;
                return fukVar19;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: mnh */
    /* JADX WARN: Code duplicated, block: B:271:0x0605  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object t(Object obj) throws mnh {
        ab1 wa1Var;
        String string;
        String strValueOf;
        s19 s19Var;
        HashSet hashSetJ1;
        fcq fcqVarE;
        int i = 8;
        f18 bnkVar = null;
        int i2 = 0;
        switch (this.e) {
            case 0:
                xe6 xe6Var = xe6.a;
                nzn.U(obj);
                guk gukVar = (guk) this.f;
                veg vegVarV = gukVar.b.V();
                ReducedMessage reducedMessage = (ReducedMessage) this.g;
                try {
                    vegVarV.z1(gukVar.a.a.a, reducedMessage.b, reducedMessage);
                    vegVarV.O();
                    vegVarV.close();
                    return fcq.a;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        vd1.v(vegVarV, th);
                        throw th2;
                    }
                }
            case 1:
                xe6 xe6Var2 = xe6.a;
                nzn.U(obj);
                mwk mwkVar = (mwk) this.f;
                fb1 fb1Var = mwkVar.c;
                ike ikeVar = mwkVar.b;
                Object obj2 = ikeVar.get();
                mqd.y(obj2, "get(...)");
                eb1 eb1VarA = fb1Var.a((SharedPreferences) obj2);
                String str = eb1VarA.b;
                String str2 = eb1VarA.c;
                nb1 nb1Var = mwkVar.a;
                if (nb1Var != null) {
                    if (!atl.u() && str2 != null) {
                        atl.y("Limited token must be absent for a passport user");
                    }
                    if (str2 != null) {
                        Object obj3 = ikeVar.get();
                        mqd.y(obj3, "get(...)");
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) obj3).edit();
                        editorEdit.remove("guid");
                        editorEdit.remove("yambtoken");
                        editorEdit.apply();
                        wa1Var = new xa1(mwkVar, nb1Var);
                    } else {
                        wa1Var = str == null ? new xa1(mwkVar, nb1Var) : new ya1(mwkVar, nb1Var, new po1(str, nb1Var, new tc1()));
                    }
                } else if (str2 != null) {
                    if (str == null) {
                        str = "";
                    }
                    wa1Var = new va1(mwkVar, new po1(str, new uc1(str2, 0)));
                } else {
                    wa1Var = new wa1(mwkVar);
                }
                mwkVar.g(wa1Var);
                mwkVar.h.reportEvent("tech_request_account");
                ne6.c(mwkVar.k);
                mwkVar.q.y(mwkVar, mwk.r[0], (lxd) null);
                if (mwkVar.o) {
                    mwkVar.n.b();
                }
                return fcq.a;
            case 2:
                List list = (List) this.f;
                xe6 xe6Var3 = xe6.a;
                nzn.U(obj);
                kk2 kk2Var = ((g1l) this.g).k;
                kk2Var.getClass();
                mqd.z(list, "chats");
                ((at6) kk2Var.g).B(list, kk2Var);
                return fcq.a;
            case 3:
                List list2 = (List) this.f;
                xe6 xe6Var4 = xe6.a;
                nzn.U(obj);
                r7l r7lVar = (r7l) this.g;
                if (!r7lVar.r && !list2.isEmpty()) {
                    r7lVar.r = true;
                    muq muqVar = r7lVar.t;
                    List list3 = list2;
                    muqVar.getClass();
                    muqVar.l.K(list3);
                    r7lVar.s.h0((String[]) list3.toArray(new String[0]));
                }
                return fcq.a;
            case 4:
                xe6 xe6Var5 = xe6.a;
                nzn.U(obj);
                CharSequence charSequence = (CharSequence) this.f;
                g8l g8lVar = (g8l) this.g;
                lnn lnnVar = g8lVar.m;
                if (lnnVar != null) {
                    lnnVar.i((CancellationException) null);
                }
                g8lVar.m = g8lVar.a(charSequence.toString());
                return fcq.a;
            case 5:
                afo afoVar = (afo) this.f;
                xe6 xe6Var6 = xe6.a;
                nzn.U(obj);
                ((nu1) ((kbl) this.g).i.a).c("save_meeting_rooms", wqh.p("meeting_room_count", String.valueOf(((iyf) afoVar.a()).f.size())));
                return fcq.a;
            case 6:
                fcq fcqVar = fcq.a;
                bhl bhlVar = (bhl) this.g;
                zgl zglVar = bhlVar.i;
                vhl vhlVar = (vhl) this.f;
                xe6 xe6Var7 = xe6.a;
                nzn.U(obj);
                if (vhlVar != null) {
                    uwf uwfVar = vhlVar.b;
                    a18 a18Var = vhlVar.c;
                    if (uwfVar.f == yyf.c) {
                        bhlVar.l.e.finishAndRemoveTask();
                    } else {
                        ImageView imageView = zglVar.f;
                        Drawable drawable = a18Var.b;
                        mqd.z(imageView, "<this>");
                        imageView.setImageDrawable(drawable);
                        zglVar.g.setText(a18Var.a);
                        TextView textView = zglVar.i;
                        String str3 = uwfVar.b;
                        ChatId.b.getClass();
                        if (ChatId.Companion.e(str3)) {
                            add addVar = bhlVar.n;
                            pwf pwfVar = vhlVar.a.d;
                            addVar.getClass();
                            string = ((Context) zglVar.b).getString(add.a(str3, pwfVar));
                            mqd.u(string);
                        } else {
                            string = vhlVar.d;
                        }
                        textView.setText(string);
                        TextView textView2 = zglVar.h;
                        if (bhlVar.o.c && vhlVar.e) {
                            i = 0;
                        }
                        textView2.setVisibility(i);
                    }
                } else {
                    bhlVar.l.e.finishAndRemoveTask();
                }
                return fcqVar;
            case 7:
                mil milVar = (mil) this.g;
                hil hilVar = (hil) this.f;
                xe6 xe6Var8 = xe6.a;
                nzn.U(obj);
                if (hilVar instanceof eil) {
                    milVar.g.a(true);
                } else if (hilVar instanceof fil) {
                    milVar.g.a(false);
                } else if (hilVar instanceof gil) {
                    milVar.g.c();
                } else if (!(hilVar instanceof dil)) {
                    throw new mnh();
                }
                return fcq.a;
            case 8:
                xe6 xe6Var9 = xe6.a;
                nzn.U(obj);
                ie6 ie6VarD1 = ((ue6) this.f).getCoroutineContext().d1(vmg.d);
                mqd.u(ie6VarD1);
                ie6 ie6Var = (lc6) ie6VarD1;
                qg5 qg5VarA = lq0.a();
                lo7.y(l6c.a, ie6Var, ze6.d, new oqk(qg5VarA, (lao) this.g, (ic6) null));
                while (!qg5VarA.h0()) {
                    try {
                        return lo7.K(ie6Var, new odk(qg5VarA, (ic6) null, 1));
                    } catch (InterruptedException unused) {
                    }
                }
                return qg5VarA.F();
            case 9:
                xe6 xe6Var10 = xe6.a;
                nzn.U(obj);
                iz8 iz8Var = (iz8) this.f;
                if (iz8Var != null && !iz8Var.a()) {
                    ((kib) this.g).invoke();
                }
                return fcq.a;
            case 10:
                zzl zzlVar = (zzl) this.g;
                xeo xeoVar = zzlVar.f;
                boolean z = zzlVar.h;
                j2 j2Var = (j2) this.f;
                xe6 xe6Var11 = xe6.a;
                nzn.U(obj);
                Long l = j2Var != null ? new Long(j2Var.getValue()) : null;
                if (z) {
                    ((IReporterYandex) xeoVar.getValue()).setUserInfo((l == null || (strValueOf = String.valueOf(l.longValue())) == null) ? new UserInfo() : new UserInfo(strValueOf));
                }
                zzlVar.d.a(l6f.h, "[USER] uid=" + (l == null ? "<none>" : l));
                if (z) {
                    IReporterYandex iReporterYandex = (IReporterYandex) xeoVar.getValue();
                    mqd.z(iReporterYandex, "$this$withReporter");
                    RtmConfig rtmConfigBuild = RtmConfig.newBuilder().withProjectName("telemost_android").withEnvironment(RtmConfig.Environment.PRODUCTION).withUserId(l != null ? String.valueOf(l.longValue()) : null).build();
                    mqd.y(rtmConfigBuild, "build(...)");
                    iReporterYandex.updateRtmConfig(rtmConfigBuild);
                }
                return fcq.a;
            case 11:
                pr5 pr5Var = (pr5) this.f;
                xe6 xe6Var12 = xe6.a;
                nzn.U(obj);
                c1m c1mVar = (c1m) this.g;
                y5e[] y5eVarArr = c1m.h;
                zp5 zp5Var = pr5Var.a;
                if (mqd.s(zp5Var, yp5.a) || mqd.s(zp5Var, pp5.a)) {
                    c1mVar.f.B(c1m.h[0], bnkVar);
                } else if (mqd.s(zp5Var, xp5.a)) {
                    bnkVar = new bnk(c1mVar);
                    c1mVar.f.B(c1m.h[0], bnkVar);
                }
                return fcq.a;
            case 12:
                m1m m1mVar = ((o1m) this.g).i;
                kac kacVar = (kac) this.f;
                xe6 xe6Var13 = xe6.a;
                nzn.U(obj);
                if (kacVar != null) {
                    m1mVar.getClass();
                    m1mVar.b();
                    m1mVar.a(hu0.I0(new rm8(6, kacVar.a.a.I, new tvf(2, m1mVar, m1m.class, "onScreenShareOutStateChanged", "onScreenShareOutStateChanged(Lru/yandex/goloom/lib/api/media/screenshare/model/ScreenShareState;)V", 4, 17)), (kn2) m1mVar.c.e));
                } else {
                    m1mVar.b();
                }
                return fcq.a;
            case 13:
                yh yhVar = (yh) this.f;
                xe6 xe6Var14 = xe6.a;
                nzn.U(obj);
                ScreenSharingService screenSharingService = (ScreenSharingService) this.g;
                sxr sxrVar = ScreenSharingService.h;
                r0 r0Var = screenSharingService.c;
                if (r0Var == null) {
                    mqd.Y("notificationManager");
                    throw null;
                }
                if (r0Var.b.areNotificationsEnabled()) {
                    r0 r0Var2 = screenSharingService.c;
                    if (r0Var2 == null) {
                        mqd.Y("notificationManager");
                        throw null;
                    }
                    r0Var2.d((String) null, 2457, screenSharingService.a(yhVar));
                }
                return fcq.a;
            case 14:
                iz8 iz8Var2 = (iz8) this.g;
                xe6 xe6Var15 = xe6.a;
                nzn.U(obj);
                if (((zym) this.f) != null && iz8Var2.a()) {
                    iz8Var2.b(false);
                }
                return fcq.a;
            case 15:
                Object obj4 = this.f;
                xe6 xe6Var16 = xe6.a;
                nzn.U(obj);
                fbm fbmVar = (fbm) this.g;
                ((qrn) fbmVar.f).n(obj4);
                szm szmVar = (szm) fbmVar.g;
                fcq fcqVar2 = fcq.a;
                szmVar.c(fcqVar2);
                return fcqVar2;
            case 16:
                xe6 xe6Var17 = xe6.a;
                nzn.U(obj);
                if (((Boolean) ((lrn) this.g).getValue()).booleanValue()) {
                    ((kib) this.f).invoke();
                }
                return fcq.a;
            case 17:
                xe6 xe6Var18 = xe6.a;
                nzn.U(obj);
                ((kpm) this.f).a.J.l(null, (ClientMessage) this.g);
                return fcq.a;
            case 18:
                esm esmVar = (esm) this.g;
                dsm dsmVar = esmVar.d;
                igh ighVar = esmVar.a;
                ypi ypiVar = (ypi) this.f;
                xe6 xe6Var19 = xe6.a;
                nzn.U(obj);
                kac kacVar2 = (kac) ypiVar.a;
                if (((kac) ypiVar.b) == null) {
                    ighVar.b.e(dsmVar);
                } else if (kacVar2 == null) {
                    qrn qrnVar = esmVar.b;
                    Boolean boolValueOf = Boolean.valueOf(ighVar.a());
                    qrnVar.getClass();
                    qrnVar.o((Object) null, boolValueOf);
                    ighVar.b.G(dsmVar);
                }
                return fcq.a;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                xe6 xe6Var20 = xe6.a;
                nzn.U(obj);
                yym yymVar = (yym) this.f;
                c93 c93Var = (c93) ((ezm) this.g).b;
                lo7.z(c93Var.j, (ie6) null, (ze6) null, new w83(c93Var, yymVar.a, null, 1), 3);
                return fcq.a;
            case 20:
                x1n x1nVar = (x1n) this.g;
                w1n w1nVar = x1nVar.n;
                kac kacVar3 = (kac) this.f;
                xe6 xe6Var21 = xe6.a;
                nzn.U(obj);
                if (kacVar3 != null) {
                    w1nVar.getClass();
                    w1nVar.b();
                    w1nVar.a(hu0.I0(new rm8(6, kacVar3.a.a.K, new tvf(2, w1nVar, w1n.class, "onScreenShareOutError", "onScreenShareOutError(Lru/yandex/goloom/lib/api/session/model/GoloomSdkException;)V", 4, 20)), (kn2) w1nVar.c.e));
                } else {
                    w1nVar.b();
                    ScreenSharingService screenSharingService2 = x1nVar.m;
                    if (screenSharingService2 != null) {
                        screenSharingService2.stopSelf();
                    }
                    x1nVar.m = null;
                }
                return fcq.a;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                xe6 xe6Var22 = xe6.a;
                nzn.U(obj);
                sxr sxrVar2 = ScreenSharingService.h;
                Context context = ((x1n) this.f).f;
                Intent intent = (Intent) this.g;
                sxrVar2.getClass();
                mqd.z(context, "context");
                mqd.z(intent, "permissionResult");
                Intent intent2 = new Intent(context, (Class<?>) ScreenSharingService.class);
                intent2.putExtra("permission_result", intent);
                context.startForegroundService(intent2);
                return fcq.a;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                xe6 xe6Var23 = xe6.a;
                nzn.U(obj);
                tdn tdnVar = (tdn) this.f;
                udn udnVar = tdnVar.b;
                Set set = (Set) this.g;
                udnVar.getClass();
                mqd.z(set, "streamTypes");
                HashMap map = udnVar.a.b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    xdn xdnVar = (xdn) entry.getKey();
                    if (set.isEmpty() || set.contains(xdnVar)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                ArrayList arrayList = new ArrayList();
                Iterator it = collectionValues.iterator();
                while (it.hasNext()) {
                    zdn zdnVarA = ((uek) it.next()).a();
                    if (zdnVarA != null) {
                        arrayList.add(zdnVarA);
                    }
                }
                zdn zdnVarL0 = zb5.L0(arrayList);
                if (zdnVarL0 == null) {
                    return null;
                }
                ben benVar = zdnVarL0.a.a;
                if (!zdnVarL0.b) {
                    zdnVarL0.b = true;
                    if (zdnVarL0.c && (s19Var = benVar.f) != null) {
                        lo7.z(tdnVar.d, (ie6) null, (ze6) null, new sdn(s19Var.a, tdnVar, zdnVarL0, (ic6) null), 3);
                    }
                }
                ymg ymgVar = zdnVarL0.e;
                if (ymgVar != null) {
                    return new pdn(benVar, zdnVarL0.c, ymgVar);
                }
                mqd.Y("handler");
                throw null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                d35 d35Var = (d35) this.f;
                xe6 xe6Var24 = xe6.a;
                nzn.U(obj);
                ((sin) this.g).e.a(d35Var);
                return fcq.a;
            case 24:
                omm ommVar = (omm) this.f;
                xe6 xe6Var25 = xe6.a;
                nzn.U(obj);
                znn znnVar = (znn) this.g;
                boolean z2 = ommVar.a;
                znn.h0(znnVar.m, z2);
                AppCompatImageView appCompatImageView = znnVar.l;
                if (appCompatImageView != null) {
                    znn.h0(appCompatImageView, z2);
                }
                return fcq.a;
            case 25:
                Metadata metadata = (Metadata) this.f;
                xe6 xe6Var26 = xe6.a;
                nzn.U(obj);
                fon fonVar = (fon) this.g;
                if (metadata != null && !metadata.viewImportantsList) {
                    i2 = 1;
                }
                fonVar.n = i2 ^ 1;
                return fcq.a;
            case 26:
                omm ommVar2 = (omm) this.f;
                xe6 xe6Var27 = xe6.a;
                nzn.U(obj);
                gon gonVar = (gon) this.g;
                po7 po7Var = gonVar.d;
                boolean z3 = ommVar2.a;
                if (z3) {
                    KeyboardAwareEmojiEditText keyboardAwareEmojiEditText = gonVar.g;
                    if (keyboardAwareEmojiEditText == null) {
                        mqd.Y("input");
                        throw null;
                    }
                    Editable editableText = keyboardAwareEmojiEditText.getEditableText();
                    mqd.y(editableText, "getEditableText(...)");
                    if (!p0o.b0(editableText)) {
                        gonVar.j = true;
                    }
                }
                gonVar.h(z3);
                View view = gonVar.m;
                if (view != null) {
                    view.setBackgroundResource((po7Var.c && z3) ? 2131233568 : 2131233567);
                }
                gonVar.a().j.a(false);
                if (po7Var.c) {
                    gonVar.c();
                }
                if (gonVar.g()) {
                    znn znnVarA = gonVar.a();
                    AppCompatImageView appCompatImageView2 = gonVar.l ? znnVarA.l : znnVarA.m;
                    if (appCompatImageView2 != null && appCompatImageView2.getVisibility() == 0) {
                        znnVarA.j.c(appCompatImageView2, tjd.e, false);
                    }
                }
                x20 x20Var = gonVar.b;
                ypi ypiVar2 = new ypi(BackendConfig.Restrictions.ENABLED, z3 ? "on" : "off");
                xjd xjdVar = gonVar.h;
                if (xjdVar == null) {
                    mqd.Y("chatInfoProvider");
                    throw null;
                }
                sc4 sc4Var = xjdVar.b.c1;
                x20Var.reportEvent("star pressed", xgf.k0(new ypi[]{ypiVar2, new ypi("chatId", sc4Var != null ? sc4Var.b : null)}));
                return fcq.a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                Metadata metadata2 = (Metadata) this.f;
                xe6 xe6Var28 = xe6.a;
                nzn.U(obj);
                ((oon) this.g).k.setVisibility((metadata2 == null || metadata2.viewImportantsList) ? false : true ? 8 : 0);
                return fcq.a;
            case 28:
                xe6 xe6Var29 = xe6.a;
                nzn.U(obj);
                pyh pyhVar = ((upn) this.f).a;
                StartFromCacheInfo startFromCacheInfo = (StartFromCacheInfo) this.g;
                if (!pyhVar.a) {
                    synchronized (pyhVar.b) {
                        hashSetJ1 = zb5.j1(pyhVar.c());
                    }
                    Iterator it2 = hashSetJ1.iterator();
                    while (it2.hasNext()) {
                        try {
                            ((vmj) it2.next()).J(startFromCacheInfo);
                            fcqVarE = fcq.a;
                        } catch (Throwable th3) {
                            fcqVarE = nzn.E(th3);
                        }
                        if (mel.a(fcqVarE) != null) {
                            qfp.a.getClass();
                            vhc.B(new Object[0]);
                        }
                        break;
                    }
                } else {
                    Object[] objArr = pyhVar.c;
                    int length = objArr.length;
                    while (i2 < length) {
                        try {
                            ((vmj) objArr[i2]).J(startFromCacheInfo);
                        } catch (Throwable th4) {
                            nzn.E(th4);
                        }
                        i2++;
                    }
                }
                return fcq.a;
            default:
                cvn cvnVar = (cvn) this.f;
                xe6 xe6Var30 = xe6.a;
                nzn.U(obj);
                dvn dvnVar = (dvn) this.g;
                dvnVar.j = cvnVar;
                m64 m64Var = dvnVar.h;
                m64Var.g = cvnVar.e;
                m64Var.g();
                m64 m64Var2 = dvnVar.g;
                m64Var2.g = cvnVar.d;
                m64Var2.g();
                return fcq.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuk(CharSequence charSequence, ic6 ic6Var, g8l g8lVar) {
        super(2, ic6Var);
        this.e = 4;
        this.f = charSequence;
        this.g = g8lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fuk(Object obj, ic6 ic6Var, int i) {
        super(2, ic6Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fuk(Object obj, Object obj2, ic6 ic6Var, int i) {
        super(2, ic6Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
