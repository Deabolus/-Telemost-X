package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.ChangeChatMembersParams;
import com.yandex.messaging.core.net.entities.GetStaffDataParam;
import com.yandex.messaging.core.net.entities.GetUsersDataParam;
import com.yandex.messaging.core.net.entities.RequestUserData;
import com.yandex.messaging.core.net.entities.RequestUserParams;
import com.yandex.messaging.core.net.entities.SearchParams;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class qe1 implements qck {
    public final ooq a;
    public final quc b;
    public final exc c;
    public final nla d;
    public final kna e;
    public final hu7 f;
    public final ryj g;
    public final m04 h;
    public final y9a i;
    public final ike j;
    public final n2d k;
    public final j78 l;
    public final ike m;
    public final k4e n;
    public final r7j o;

    public qe1(ooq ooqVar, quc qucVar, lt1 lt1Var, exc excVar, nla nlaVar, kna knaVar, hu7 hu7Var, ryj ryjVar, m04 m04Var, y9a y9aVar, ike ikeVar, n2d n2dVar, j78 j78Var, ike ikeVar2, k4e k4eVar, r7j r7jVar) {
        mqd.z(ooqVar, "httpRetrierFactory");
        mqd.z(qucVar, "apiCallFactory");
        mqd.z(lt1Var, "balancerApiCallFactory");
        mqd.z(excVar, "fileCallFactory");
        mqd.z(nlaVar, "cacheManager");
        mqd.z(knaVar, "fileProgressObservable");
        mqd.z(hu7Var, "deviceInfoProvider");
        mqd.z(ryjVar, "privacyApiRestrictionsObservable");
        mqd.z(m04Var, "changeChatMemberErrorsObservable");
        mqd.z(y9aVar, "experimentConfig");
        mqd.z(ikeVar, "yadiskResumableUploadsFeatureToggle");
        mqd.z(n2dVar, "identityProvider");
        mqd.z(j78Var, "downloadFileReporter");
        mqd.z(ikeVar2, "fastStartupSyncRetryFeatureToggle");
        mqd.z(k4eVar, "jsonSerializer");
        mqd.z(r7jVar, "performanceStatAccumulator");
        this.a = ooqVar;
        this.b = qucVar;
        this.c = excVar;
        this.d = nlaVar;
        this.e = knaVar;
        this.f = hu7Var;
        this.g = ryjVar;
        this.h = m04Var;
        this.i = y9aVar;
        this.j = ikeVar;
        this.k = n2dVar;
        this.l = j78Var;
        this.m = ikeVar2;
        this.n = k4eVar;
        this.o = r7jVar;
    }

    public static af1 d(qe1 qe1Var, rd1 rd1Var, ChangeChatMembersParams changeChatMembersParams, lib libVar, int i) {
        ld5 ld5Var = new ld5(1);
        if ((i & 8) != 0) {
            libVar = new bk0(18);
        }
        lib libVar2 = libVar;
        qe1Var.getClass();
        return qe1Var.a.a(new ud1(qe1Var, changeChatMembersParams, libVar2, rd1Var, (kib) ld5Var));
    }

    public static af1 e(qe1 qe1Var, String str, Object obj, Class cls, lib libVar, lib libVar2, boolean z, wf wfVar, taa taaVar, r2 r2Var, int i) {
        wf wfVar2 = (i & 64) != 0 ? new wf(false) : wfVar;
        taa taaVar2 = (i & 128) != 0 ? saa.c : taaVar;
        r2 bk0Var = (i & 256) != 0 ? new bk0(17) : r2Var;
        ooq ooqVar = qe1Var.a;
        zd1 zd1Var = new zd1(wfVar2, bk0Var, qe1Var, str, obj, z, cls, libVar, libVar2);
        ooqVar.getClass();
        String string = UUID.randomUUID().toString();
        mqd.y(string, "toString(...)");
        return ooqVar.b(string, zd1Var, taaVar2);
    }

    @Override // defpackage.qck
    public final cw3 a(tco tcoVar, String str, String str2, pck pckVar, String str3, boolean z, String str4, String str5, String str6) {
        mqd.z(str2, "deviceModel");
        mqd.z(pckVar, "pushToken");
        mqd.z(str3, "deviceId");
        return this.a.a(new le1(this, str, str2, pckVar.a, pckVar, str3, z, str4, str5, str6, tcoVar));
    }

    @Override // defpackage.qck
    public final cw3 b(pe9 pe9Var, String str, boolean z) {
        return this.a.a(new me1(this, str, z, pe9Var));
    }

    public final af1 c(rd1 rd1Var, go5 go5Var, String str) {
        mqd.z(str, "chatId");
        return this.a.a(new ud1(rd1Var, new wf(true), this, str, go5Var, 0));
    }

    public final af1 f(Class cls, lib libVar, Bucket.GetParams getParams, wf wfVar) {
        return this.a.a(new ee1(wfVar, this, getParams, cls, libVar));
    }

    public final af1 g(pd1 pd1Var, String str, wf wfVar) {
        mqd.z(str, "chatId");
        String strG = wq1.g("toString(...)");
        ud1 ud1Var = new ud1(pd1Var, wfVar, this, new String[]{str}, strG);
        ooq ooqVar = this.a;
        ooqVar.getClass();
        return ooqVar.b(strG, ud1Var, null);
    }

    public final af1 h(rd1 rd1Var, String str, wf wfVar) {
        mqd.z(str, "nickname");
        GetStaffDataParam getStaffDataParam = new GetStaffDataParam();
        getStaffDataParam.nickname = str;
        return this.a.a(new hw(rd1Var, wfVar, this, getStaffDataParam, 8));
    }

    public final af1 i(qd1 qd1Var, String... strArr) {
        mqd.z(strArr, "ids");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(new qek("id", str));
        }
        return this.a.a(new je1(this, arrayList, qd1Var));
    }

    public final af1 j(rd1 rd1Var, String str) {
        mqd.z(str, "userId");
        wf wfVar = new wf(false);
        GetUsersDataParam getUsersDataParam = new GetUsersDataParam();
        getUsersDataParam.guids = new String[]{str};
        return this.a.a(new hw(rd1Var, wfVar, this, getUsersDataParam, 10));
    }

    public final af1 k(rd1 rd1Var, SearchParams searchParams, t8n t8nVar) {
        return this.a.a(new hw(t8nVar, this, searchParams, rd1Var, 14));
    }

    public final af1 l(Class cls, od1 od1Var, Bucket bucket) {
        return this.a.a(new hw(this, bucket, cls, od1Var, 15));
    }

    public final af1 m(qd1 qd1Var, r2 r2Var, boolean z, Boolean bool, wf wfVar, boolean z2) {
        RequestUserParams requestUserParams = new RequestUserParams();
        requestUserParams.bindPhoneNumber = z;
        requestUserParams.enablePersonalDiscovery = bool;
        return e(this, "request_user", requestUserParams, RequestUserData.class, new nd1(qd1Var, 0), r2Var, z2, wfVar, null, new r2(1, this.f, hu7.class, "apply", "apply(Lokhttp3/Request$Builder;)Lokhttp3/Request$Builder;", 0, 26), 128);
    }
}
