package defpackage;

import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.BucketsData;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class ee1 extends bff {
    public final /* synthetic */ wf i;
    public final /* synthetic */ qe1 j;
    public final /* synthetic */ Bucket.GetParams k;
    public final /* synthetic */ Class l;
    public final /* synthetic */ lib m;

    public ee1(wf wfVar, qe1 qe1Var, Bucket.GetParams getParams, Class cls, lib libVar) {
        this.i = wfVar;
        this.j = qe1Var;
        this.k = getParams;
        this.l = cls;
        this.m = libVar;
    }

    public final void E(Object obj) {
        this.m.invoke((Bucket) obj);
    }

    public final g5l I() {
        return this.j.b.a(this.k, "get_bucket");
    }

    public final znc s(ocl oclVar) {
        znc zncVarJ = fde.j(this.j.b, "get_bucket", BucketsData.class, oclVar);
        if (zncVarJ instanceof ldi) {
            Object obj = ((ldi) zncVarJ).i;
            mqd.y(obj, "getResponse(...)");
            Bucket bucketA = ((BucketsData) obj).a(this.l);
            if (bucketA != null) {
                return new ldi(bucketA);
            }
        }
        return new znc(17);
    }

    public final wf z() {
        return this.i;
    }
}
