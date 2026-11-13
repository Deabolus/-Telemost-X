package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import com.yandex.passport.api.k2;
import com.yandex.passport.internal.properties.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.goloom.lib.model.telemetry.ApplyDevicesEvent;
import ru.yandex.goloom.lib.model.telemetry.ApplyDevicesFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.ApplyDevicesFinishedEvent;
import ru.yandex.goloom.lib.model.telemetry.ApplyDevicesRequestedEvent;
import ru.yandex.goloom.lib.model.telemetry.ApplyDevicesStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPlayFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPlayFinishedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPlayRequestedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPlayStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPlayStoppedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPreloadFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPreloadFinishedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPreloadRequestedEvent;
import ru.yandex.goloom.lib.model.telemetry.AudioPlayerPreloadStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.EventTelemetry;
import ru.yandex.goloom.lib.model.telemetry.NetworkConfigurationChanged;
import ru.yandex.goloom.lib.model.telemetry.PcReconnectFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.PcReconnectFinishedEvent;
import ru.yandex.goloom.lib.model.telemetry.PcReconnectStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.PublisherConfigurationEvent;
import ru.yandex.goloom.lib.model.telemetry.RawEvent;
import ru.yandex.goloom.lib.model.telemetry.SelectDeviceEvent;
import ru.yandex.goloom.lib.model.telemetry.SharingFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.SharingRequestedEvent;
import ru.yandex.goloom.lib.model.telemetry.SharingStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.SharingStoppedEvent;
import ru.yandex.goloom.lib.model.telemetry.SignalingReconnectFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.SignalingReconnectFinishedEvent;
import ru.yandex.goloom.lib.model.telemetry.SignalingReconnectStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.SoundProcessingFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.SoundProcessingRequestedEvent;
import ru.yandex.goloom.lib.model.telemetry.SoundProcessingStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.SoundProcessingStoppedEvent;
import ru.yandex.goloom.lib.model.telemetry.UpdatedCurrentDevicesEvent;
import ru.yandex.goloom.lib.model.telemetry.VideoProcessingFailedEvent;
import ru.yandex.goloom.lib.model.telemetry.VideoProcessingRequestedEvent;
import ru.yandex.goloom.lib.model.telemetry.VideoProcessingStartedEvent;
import ru.yandex.goloom.lib.model.telemetry.VideoProcessingStoppedEvent;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class c8g implements lib {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c8g(int i, Object obj, Object obj2, List list) {
        this.a = i;
        this.b = obj;
        this.d = list;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x048c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0493  */
    /* JADX WARN: Code duplicated, block: B:111:0x049e  */
    /* JADX WARN: Code duplicated, block: B:113:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:115:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:119:0x04c4  */
    public final Object invoke(Object obj) {
        String[] strArr;
        wnf wnfVar;
        dgc dgcVar;
        ForwardMessageRef[] forwardMessageRefArr;
        Object next;
        amk amkVar;
        Float fValueOf;
        wlk wlkVar;
        slk slkVarC;
        ra9 ra9Var;
        Object value;
        int i;
        int i2 = this.a;
        int i3 = 1;
        fcq fcqVar = fcq.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i2) {
            case 0:
                g8g g8gVar = (g8g) obj4;
                List list = (List) obj2;
                SearchData.Message message = (SearchData.Message) obj;
                mqd.z(message, "item");
                ServerMessage serverMessage = message.serverMessage;
                mqd.y(serverMessage, "serverMessage");
                PlainMessage plainMessage = serverMessage.clientMessage.plain;
                mqd.u(plainMessage);
                Message messageC = g8gVar.g.c(serverMessage, plainMessage, false);
                g8gVar.c.d((veg) obj3, messageC);
                SearchData.Message.Matches matches = message.matches;
                List listG1 = (matches == null || (strArr = matches.text) == null) ? null : tt0.g1(strArr);
                if (listG1 == null) {
                    listG1 = jc9.a;
                }
                return g8gVar.a(serverMessage, plainMessage, messageC, !listG1.isEmpty() ? listG1 : list, null);
            case 1:
                d3n d3nVar = (d3n) obj3;
                lo7.z((ue6) obj4, (ie6) null, (ze6) null, new sg0(d3nVar, ((Float) obj).floatValue(), (ic6) null, 3), 3).H0(new urg(d3nVar, (kib) obj2, 0));
                return fcqVar;
            case 2:
                mqd.z((j18) obj, "$this$DisposableEffect");
                ((pib) obj4).invoke(Float.valueOf(((jri) obj3).k()), Float.valueOf(((jri) obj2).k()));
                return new oa0(3);
            case 3:
                v6h v6hVar = (v6h) obj3;
                int iIntValue = ((Integer) obj).intValue();
                return Boolean.valueOf(((Set) obj4).contains(k5d.X(iIntValue, (List) obj2)) && (wnfVar = (wnf) v6hVar.get(iIntValue)) != null && (dgcVar = wnfVar.b) != null && dgcVar.a);
            case 4:
                mqd.z((j18) obj, "$this$DisposableEffect");
                return new w9((qbp) obj4, (a9h) obj3, (a9h) obj2, 5);
            case 5:
                j4i j4iVar = (j4i) obj3;
                j4i j4iVar2 = (j4i) obj2;
                qd0 qd0Var = (qd0) obj;
                mqd.z(qd0Var, "$this$animateTo");
                esk eskVarY = mb6.y(j4iVar.a, j4iVar2.a, ((Number) qd0Var.e()).floatValue());
                esk eskVarY2 = mb6.y(j4iVar.b, j4iVar2.b, ((Number) qd0Var.e()).floatValue());
                float f = j4iVar.c;
                ((l4i) obj4).a.setValue(new j4i(eskVarY, eskVarY2, (((Number) qd0Var.e()).floatValue() * (j4iVar2.c - f)) + f));
                return fcqVar;
            case 6:
                fw1 fw1Var = (fw1) obj;
                mqd.z(fw1Var, "it");
                return ((d6i) obj4).c((zkk) obj3, fw1Var, (ij0) obj2);
            case 7:
                fw1 fw1Var2 = (fw1) obj;
                mqd.z(fw1Var2, "it");
                return ((j6i) obj4).c.b((zkk) obj3, fw1Var2, (ij0) obj2);
            case 8:
                ij0 ij0Var = (ij0) obj;
                mqd.z(ij0Var, "it");
                return ((f9i) obj4).c((zkk) obj3, (fw1) obj2, ij0Var);
            case 9:
                ij0 ij0Var2 = (ij0) obj;
                mqd.z(ij0Var2, "it");
                return ((r9i) obj4).c((zkk) obj3, (fw1) obj2, ij0Var2);
            case 10:
                imi imiVar = (imi) obj3;
                n00 n00Var = (n00) obj2;
                oje ojeVar = (oje) obj;
                long j = ((m9n) ((jh2) obj4).get()).a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                if (fIntBitsToFloat > 0.0f) {
                    float fT0 = ojeVar.t0(sji.a);
                    rw3 rw3Var = ojeVar.a;
                    float fT1 = ojeVar.t0(imiVar.b(ojeVar.getLayoutDirection()));
                    float fA = n00Var.a(anf.S(fIntBitsToFloat), anf.S((Float.intBitsToFloat((int) (rw3Var.e() >> 32)) - fT1) - ojeVar.t0(imiVar.c(ojeVar.getLayoutDirection()))), ojeVar.getLayoutDirection()) + fT1;
                    float f2 = 2;
                    float f3 = fIntBitsToFloat / f2;
                    float f4 = fA + f3;
                    float f5 = (f4 - f3) - fT0;
                    float f6 = f5 < 0.0f ? 0.0f : f5;
                    float f7 = f4 + f3 + fT0;
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (rw3Var.e() >> 32));
                    float f8 = f7 > fIntBitsToFloat2 ? fIntBitsToFloat2 : f7;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j & 4294967295L));
                    float f9 = (-fIntBitsToFloat3) / f2;
                    float f10 = fIntBitsToFloat3 / f2;
                    po1 po1Var = rw3Var.b;
                    long jM = po1Var.m();
                    po1Var.i().p();
                    try {
                        ((afs) po1Var.b).l(f6, f9, f8, f10, 0);
                        ojeVar.b();
                    } finally {
                        wqh.t(po1Var, jM);
                    }
                } else {
                    ojeVar.b();
                }
                return fcqVar;
            case 11:
                String str = (String) obj3;
                String str2 = (String) obj2;
                e eVar = (e) obj;
                k2 k2VarF = zum.f((nb1) obj4);
                eVar.getClass();
                eVar.a = k2VarF;
                mqd.z(str, "<set-?>");
                eVar.c = str;
                mqd.z(str2, "<set-?>");
                eVar.b = str2;
                return fcqVar;
            case 12:
                n6j n6jVar = (n6j) obj4;
                bn4 bn4Var = (bn4) obj3;
                mqd.z((aml) obj, "<unused var>");
                mqd.z(bn4Var, "chatRequest");
                e6j e6jVar = new e6j(bn4Var, bn4Var.L());
                sjl sjlVar = n6jVar.a;
                ((Number) h6i.M(sjlVar, false, true, new yih(16, n6jVar, e6jVar))).longValue();
                ((Number) h6i.M(sjlVar, false, true, new yih(17, n6jVar, (o6j) obj2))).longValue();
                return fcqVar;
            case 13:
                n6j n6jVar2 = (n6j) obj4;
                List list2 = (List) obj2;
                String str3 = (String) obj3;
                aml amlVar = (aml) obj;
                mqd.z(amlVar, "_connection");
                gml gmlVarR1 = amlVar.r1("UPDATE pending_message_to_chat_request SET message_forwards = ? WHERE message_id = ?");
                try {
                    eab eabVar = (eab) n6jVar2.g.getValue();
                    if (list2 != null) {
                        eabVar.getClass();
                        forwardMessageRefArr = (ForwardMessageRef[]) list2.toArray(new ForwardMessageRef[0]);
                    } else {
                        forwardMessageRefArr = null;
                    }
                    String strE = eabVar.e(forwardMessageRefArr);
                    if (strE == null) {
                        gmlVarR1.q(1);
                    } else {
                        gmlVarR1.K(1, strE);
                    }
                    gmlVarR1.K(2, str3);
                    gmlVarR1.m1();
                    return fcqVar;
                } finally {
                    gmlVarR1.close();
                }
            case 14:
                bn4 bn4Var2 = (bn4) obj3;
                String str4 = (String) obj2;
                mqd.z((aml) obj, "<unused var>");
                mqd.z(bn4Var2, "chatRequest");
                mqd.z(str4, "messageId");
                sjl sjlVar2 = ((n6j) obj4).a;
                if (((Number) h6i.M(sjlVar2, false, true, new krg(str4, 5))).intValue() > 0) {
                    String strL = bn4Var2.L();
                    mqd.z(strL, "chatRequestId");
                    if (((Number) h6i.M(sjlVar2, true, false, new krg(strL, 6))).intValue() == 0) {
                        String strL2 = bn4Var2.L();
                        mqd.z(strL2, "chatRequestId");
                        ((Number) h6i.M(sjlVar2, false, true, new krg(strL2, 4))).intValue();
                    }
                }
                return fcqVar;
            case 15:
                zj zjVar = (zj) obj4;
                x3k x3kVar = (x3k) obj3;
                mqd.z((j18) obj, "$this$DisposableEffect");
                la1 la1Var = new la1(x3kVar, (bsp) obj2);
                zjVar.c(chg.PROFILE_DETAILS_EDIT_PROFILE, la1Var);
                zjVar.c(chg.PROFILE_DETAILS_EDIT_AVATAR, la1Var);
                zjVar.c(chg.PROFILE_DETAILS_EDIT_SECURE_PHONE, new yzj(x3kVar, 1));
                return new zzj(zjVar, 1);
            case 16:
                ProxyPassportActivity proxyPassportActivity = (ProxyPassportActivity) obj4;
                Bundle bundle = (Bundle) obj3;
                String str5 = (String) obj2;
                int i4 = ProxyPassportActivity.c;
                p0j p0jVarB = new iu6(((ev6) obj).c, proxyPassportActivity).b();
                if (bundle == null || !bundle.containsKey("action") || !str5.equals(bundle.getString("action"))) {
                    if (str5.equals("BIND_PHONE")) {
                        Intent intentA = p0jVarB.a(null, proxyPassportActivity.getIntent().getStringExtra("phone_number"));
                        if (intentA != null) {
                            proxyPassportActivity.startActivityForResult(intentA, 2);
                        }
                    } else {
                        if (!str5.equals("LOGIN")) {
                            throw new IllegalStateException("known action is expected, action = ".concat(str5));
                        }
                        Intent intentB = p0jVarB.b("action_login");
                        if (intentB != null) {
                            proxyPassportActivity.startActivityForResult(intentB, 1);
                        }
                    }
                }
                return fcqVar;
            case 17:
                zlk zlkVar = (zlk) obj4;
                a9h a9hVar = (a9h) obj3;
                a9h a9hVar2 = (a9h) obj2;
                qmk qmkVar = (rmk) obj;
                mqd.z(qmkVar, "event");
                if (qmkVar instanceof qmk) {
                    qmk qmkVar2 = qmkVar;
                    ra9 ra9Var2 = qmkVar2.a;
                    emk emkVar = (emk) a9hVar.getValue();
                    f3f f3fVar = qmkVar2.b;
                    Float f11 = (Float) a9hVar2.getValue();
                    lib libVar = zlkVar.d;
                    rsh rshVar = zlkVar.c;
                    mqd.z(ra9Var2, "reaction");
                    int i5 = ra9Var2.c;
                    mqd.z(emkVar, "launchArea");
                    if (f3fVar != null) {
                        amk amkVar2 = (amk) rshVar.invoke();
                        int i6 = 0;
                        for (umk umkVar : amkVar2.a) {
                            int i7 = i6 + 1;
                            w89 w89Var = umkVar.b;
                            if (w89Var == null) {
                                ra9Var = ra9Var2;
                            } else {
                                ra9Var = ra9Var2;
                                if (w89Var.a == f3fVar.a) {
                                    slk slkVar = umkVar.a;
                                    wlk wlkVar2 = new wlk(((Number) ((qd0) w89Var.b).e()).floatValue(), f3fVar.b);
                                    float fFloatValue = ((Number) ((qd0) w89Var.c).e()).floatValue();
                                    e0f e0fVar = s19.b;
                                    umk umkVar2 = new umk(new slk(slkVar.a, ra9Var, slkVar.c, slkVar.d, slkVar.e, slkVar.f, slkVar.g, slkVar.h, wlkVar2, fFloatValue, y62.T(anf.S((1.0f - fFloatValue) * s19.n(cmk.b)), x19.d)), (w89) null);
                                    List list3 = amkVar2.a;
                                    ArrayList arrayList = new ArrayList(ac5.Y(list3, 10));
                                    int i8 = 0;
                                    for (Object obj5 : list3) {
                                        int i9 = i8 + 1;
                                        if (i8 < 0) {
                                            f3r.W();
                                            throw null;
                                        }
                                        umk umkVar3 = (umk) obj5;
                                        if (i8 == i6) {
                                            umkVar3 = umkVar2;
                                        }
                                        arrayList.add(umkVar3);
                                        i8 = i9;
                                    }
                                    libVar.invoke(amk.a(amkVar2, arrayList));
                                }
                            }
                            i6 = i7;
                            ra9Var2 = ra9Var;
                        }
                        ra9 ra9Var3 = ra9Var2;
                        amkVar = (amk) rshVar.invoke();
                        if (f3fVar != null) {
                            fValueOf = Float.valueOf(f3fVar.b);
                        } else {
                            fValueOf = Float.valueOf(cmk.a(i5));
                            if (i5 <= 0) {
                                fValueOf = null;
                            }
                        }
                        if (fValueOf != null) {
                            float fFloatValue2 = fValueOf.floatValue();
                            wlkVar = new wlk(fFloatValue2, fFloatValue2);
                        } else {
                            wlkVar = xlk.a;
                        }
                        wlk wlkVar3 = wlkVar;
                        slkVarC = zlkVar.c(amkVar.b, ra9Var3, emkVar, wlkVar3, f11, wlkVar3.a());
                        if (slkVarC != null) {
                            libVar.invoke(zlk.a(amkVar, new umk(slkVarC, (w89) null)));
                        }
                    } else {
                        ra9 ra9Var4 = ra9Var2;
                        amkVar = (amk) rshVar.invoke();
                        if (f3fVar != null) {
                            fValueOf = Float.valueOf(f3fVar.b);
                        } else {
                            fValueOf = Float.valueOf(cmk.a(i5));
                            if (i5 <= 0) {
                                fValueOf = null;
                            }
                        }
                        if (fValueOf != null) {
                            float fFloatValue3 = fValueOf.floatValue();
                            wlkVar = new wlk(fFloatValue3, fFloatValue3);
                        } else {
                            wlkVar = xlk.a;
                        }
                        wlk wlkVar4 = wlkVar;
                        slkVarC = zlkVar.c(amkVar.b, ra9Var4, emkVar, wlkVar4, f11, wlkVar4.a());
                        if (slkVarC != null) {
                            libVar.invoke(zlk.a(amkVar, new umk(slkVarC, (w89) null)));
                        }
                    }
                } else {
                    if (!(qmkVar instanceof pmk)) {
                        throw new mnh();
                    }
                    g3f g3fVar = ((pmk) qmkVar).a;
                    emk emkVar2 = (emk) a9hVar.getValue();
                    Float f12 = (Float) a9hVar2.getValue();
                    lib libVar2 = zlkVar.d;
                    mqd.z(emkVar2, "launchArea");
                    if (g3fVar == null) {
                        zlkVar.b();
                    } else {
                        amk amkVar3 = (amk) zlkVar.c.invoke();
                        ra9 ra9Var5 = g3fVar.a;
                        f3f f3fVar2 = g3fVar.b;
                        long j2 = f3fVar2.a;
                        float f13 = f3fVar2.b;
                        Iterator it = amkVar3.a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                w89 w89Var2 = ((umk) next).b;
                                if (w89Var2 == null || w89Var2.a != j2) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        umk umkVar4 = (umk) next;
                        w89 w89Var3 = umkVar4 != null ? umkVar4.b : null;
                        if (w89Var3 != null) {
                            ((jri) w89Var3.d).l(f13);
                        } else {
                            List list4 = amkVar3.a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj6 : list4) {
                                if (((umk) obj6).b == null) {
                                    arrayList2.add(obj6);
                                }
                            }
                            amk amkVarA = amk.a(amkVar3, arrayList2);
                            slk slkVarC2 = zlkVar.c(amkVar3.b, ra9Var5, emkVar2, new wlk(0.6f, f13), f12, 1.6f);
                            if (slkVarC2 == null) {
                                libVar2.invoke(amkVarA);
                            } else {
                                w89 w89Var4 = new w89();
                                w89Var4.a = j2;
                                w89Var4.b = ob2.a(0.6f);
                                w89Var4.c = ob2.a(0.0f);
                                w89Var4.d = new jri(f13);
                                libVar2.invoke(zlk.a(amkVarA, new umk(slkVarC2, w89Var4)));
                            }
                        }
                    }
                }
                return fcqVar;
            case 18:
                mqd.z((j18) obj, "$this$DisposableEffect");
                return new w9((nrn) obj4, (Activity) obj3, (lib) obj2, 6);
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                List list5 = (List) obj2;
                vke vkeVar = (vke) obj;
                mqd.z(vkeVar, "$this$LazyVerticalGrid");
                vkeVar.X(list5.size(), (lib) null, new eq(23, list5), new ii5(new gq(6, (lib) obj4, (vdd) obj3, list5), true, -1117249557));
                return fcqVar;
            case 20:
                q5j q5jVar = (q5j) obj3;
                yqk yqkVar = (yqk) obj2;
                EventTelemetry eventTelemetry = (EventTelemetry) obj;
                mqd.z(eventTelemetry, "$this$wrapEventTelemetry");
                String str6 = (String) ((ConcurrentHashMap) ((j7d) obj4).c).remove(new xqk(q5jVar, yqkVar.b));
                if (str6 == null) {
                    str6 = "";
                }
                return EventTelemetry.copy$default(eventTelemetry, 0.0d, (String) null, (String) null, (SelectDeviceEvent) null, (ApplyDevicesEvent) null, (UpdatedCurrentDevicesEvent) null, (ApplyDevicesRequestedEvent) null, (ApplyDevicesStartedEvent) null, (ApplyDevicesFailedEvent) null, (ApplyDevicesFinishedEvent) null, (SharingRequestedEvent) null, (SharingStartedEvent) null, (SharingFailedEvent) null, (SharingStoppedEvent) null, (PublisherConfigurationEvent) null, (PcReconnectStartedEvent) null, (PcReconnectFailedEvent) null, new PcReconnectFinishedEvent(str6, j7d.W(q5jVar), yqkVar.a, k5d.h0(yqkVar.c).name(), yqkVar.b, (String) null, (bn2) null, 96, (DefaultConstructorMarker) null), (SignalingReconnectStartedEvent) null, (SignalingReconnectFailedEvent) null, (SignalingReconnectFinishedEvent) null, (VideoProcessingRequestedEvent) null, (VideoProcessingStartedEvent) null, (VideoProcessingFailedEvent) null, (VideoProcessingStoppedEvent) null, (SoundProcessingRequestedEvent) null, (SoundProcessingStartedEvent) null, (SoundProcessingFailedEvent) null, (SoundProcessingStoppedEvent) null, (AudioPlayerPreloadRequestedEvent) null, (AudioPlayerPreloadStartedEvent) null, (AudioPlayerPreloadFailedEvent) null, (AudioPlayerPreloadFinishedEvent) null, (AudioPlayerPlayRequestedEvent) null, (AudioPlayerPlayStartedEvent) null, (AudioPlayerPlayFinishedEvent) null, (AudioPlayerPlayFailedEvent) null, (AudioPlayerPlayStoppedEvent) null, (NetworkConfigurationChanged) null, (RawEvent) null, (bn2) null, -131073, 511, (Object) null);
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                lib libVar3 = (lib) obj4;
                n87 n87Var = (n87) obj2;
                my9 my9Var = (my9) obj;
                mqd.z(my9Var, "intervalUi");
                libVar3.invoke(new d3l(my9Var));
                Set set = ((d1a) obj3).e;
                if (set.isEmpty() && my9Var == my9.b) {
                    libVar3.invoke(new s2l(hum.l(set, n87Var)));
                }
                return fcqVar;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                lib libVar4 = (lib) obj4;
                vxk vxkVar = (vxk) obj3;
                Map map = (Map) obj2;
                gzc gzcVar = (hzc) obj;
                mqd.z(gzcVar, "res");
                if (gzcVar instanceof gzc) {
                    gzc gzcVar2 = gzcVar;
                    int i10 = gzcVar2.b;
                    if (i10 / 100 == 2) {
                        libVar4.invoke(vxkVar.invoke(gzcVar));
                    } else if (map.containsKey(Integer.valueOf(i10))) {
                        libVar4.invoke(new mel(xgf.i0(map, Integer.valueOf(i10))));
                    } else {
                        libVar4.invoke(new mel(nzn.E(new rwc(i10, gzcVar2.a))));
                    }
                } else if (gzcVar instanceof ezc) {
                    String str7 = ((fzc) ((ezc) gzcVar)).a;
                    mqd.z(str7, "message");
                    libVar4.invoke(new mel(nzn.E(new wea(str7))));
                } else if (gzcVar instanceof dzc) {
                    String str8 = ((fzc) ((dzc) gzcVar)).a;
                    mqd.z(str8, "message");
                    libVar4.invoke(new mel(nzn.E(new lxc(str8))));
                } else {
                    if (!(gzcVar instanceof czc)) {
                        throw new mnh();
                    }
                    libVar4.invoke(new mel(new yl0()));
                }
                return fcqVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                kql kqlVar = (kql) obj4;
                pql pqlVar = (pql) obj2;
                s8h s8hVar = kqlVar.b;
                if (s8hVar.b(obj3)) {
                    throw new IllegalArgumentException(wqh.i(obj3, "Key ", " was used multiple times ").toString());
                }
                kqlVar.a.remove(obj3);
                s8hVar.m(obj3, pqlVar);
                return new w9(kqlVar, obj3, pqlVar, 7);
            case 24:
                wuk wukVar = (wuk) obj3;
                vuk vukVar = (vuk) obj2;
                mqd.z((woj) obj, "it");
                lxd lxdVar = (lxd) ((zuk) obj4).a;
                if (lxdVar != null) {
                    lxdVar.i((CancellationException) null);
                }
                wukVar.a = 0.0f;
                vukVar.a = false;
                return fcqVar;
            case 25:
                tam tamVar = (tam) obj4;
                ue6 ue6Var = (ue6) obj3;
                d3n d3nVar2 = (d3n) obj2;
                cmm cmmVar = (cmm) obj;
                qrn qrnVar = tamVar.m;
                do {
                    value = qrnVar.getValue();
                } while (!qrnVar.m(value, mam.a((mam) value, null, null, null, false, false, false, false, cmmVar, null, null, false, 1919)));
                if (cmmVar != null) {
                    lam.B(d3nVar2, ue6Var, new iam(tamVar, i3));
                }
                return fcqVar;
            case 26:
                lrn lrnVar = (lrn) obj4;
                jfm jfmVar = (jfm) obj3;
                sfm sfmVar = (sfm) obj2;
                jne jneVar = (jne) obj;
                mqd.z(jneVar, "$this$LazyColumn");
                List list6 = ((ofm) lrnVar.getValue()).a;
                jneVar.Z(list6.size(), new vbe(13, new a8m(8), list6), new eq(27, list6), new ii5(new fq(list6, jfmVar, sfmVar, lrnVar), true, 802480018));
                if (((ofm) lrnVar.getValue()).b) {
                    i = 3;
                    jne.Y(jneVar, (Object) null, new ii5(new bzj(5, jfmVar, sfmVar), true, -1804567041), 3);
                } else {
                    i = 3;
                }
                jne.Y(jneVar, (Object) null, oyg.b, i);
                return fcqVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                a9h a9hVar3 = (a9h) obj3;
                gnq gnqVar = (gnq) obj;
                mqd.z(gnqVar, "userAvailabilityStatus");
                ((lib) obj4).invoke(new ft9(gnqVar));
                for (sjk sjkVar : (List) obj2) {
                    if (sjkVar.b == gnqVar) {
                        a9hVar3.setValue(sjkVar);
                        return fcqVar;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 28:
                vuk vukVar2 = (vuk) obj2;
                woj wojVar = (woj) obj;
                if (((k2h) obj4).C(wojVar.c, (gim) obj3)) {
                    wojVar.a();
                    vukVar2.a = true;
                }
                return fcqVar;
            default:
                xum xumVar = (xum) obj4;
                lib libVar5 = (lib) obj3;
                jne jneVar2 = (jne) obj;
                mqd.z(jneVar2, "$this$LazyColumn");
                jne.Y(jneVar2, "profile_settings_general", new ii5(new uum(xumVar, libVar5, 0), true, -1657148814), 2);
                jne.Y(jneVar2, "profile_settings_general_separator", dsh.e, 2);
                jne.Y(jneVar2, "profile_settings_chats", new ii5(new vum(xumVar, (xpi) obj2, libVar5), true, -1845908566), 2);
                if (xumVar.a.d) {
                    jne.Y(jneVar2, "profile_settings_chats_separator", dsh.f, 2);
                    jne.Y(jneVar2, "profile_settings_calls", new ii5(new uum(xumVar, libVar5, 1), true, 1522593988), 2);
                }
                return fcqVar;
        }
    }

    public /* synthetic */ c8g(tam tamVar, lam lamVar, ue6 ue6Var, d3n d3nVar) {
        this.a = 25;
        this.b = tamVar;
        this.c = ue6Var;
        this.d = d3nVar;
    }

    public /* synthetic */ c8g(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ c8g(List list, lib libVar, vdd vddVar) {
        this.a = 19;
        this.d = list;
        this.b = libVar;
        this.c = vddVar;
    }
}
