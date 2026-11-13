package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.yandex.messaging.core.net.ApiRequest;
import com.yandex.messaging.core.net.ApiResponse;
import com.yandex.messaging.core.net.entities.ErrorResponseData;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class quc {
    public static final Object i = new Object();
    public final n2d a;
    public final x20 b;
    public final String c;
    public final String d;
    public final k4e e;
    public final r7j f;
    public final btm g;
    public final l0d h;

    public quc(n2d n2dVar, x20 x20Var, String str, String str2, k4e k4eVar, c8k c8kVar, r7j r7jVar, btm btmVar, fsc fscVar) {
        mqd.z(n2dVar, "identityProvider");
        mqd.z(x20Var, "analytics");
        mqd.z(str, "profileId");
        mqd.z(str2, "userAgent");
        mqd.z(k4eVar, "jsonSerializer");
        mqd.z(c8kVar, "proto");
        mqd.z(r7jVar, "performanceStatAccumulator");
        mqd.z(btmVar, "uuidHolder");
        mqd.z(fscVar, "hostEnvironmentProvider");
        this.a = n2dVar;
        this.b = x20Var;
        this.c = str;
        this.d = str2;
        this.e = k4eVar;
        this.f = r7jVar;
        this.g = btmVar;
        l0d l0dVar = new l0d();
        l0dVar.l("https");
        l0dVar.g((String) fscVar.a.d(fscVar.b));
        l0dVar.c("api/", false);
        this.h = l0dVar;
    }

    public static znc c(quc qucVar, String str, Type type, ocl oclVar) {
        return qucVar.b(str, type, oclVar, new vd1(3));
    }

    public final g5l a(Object obj, String str) {
        mqd.z(str, "method");
        if (obj == null) {
            obj = i;
        }
        ApiRequest apiRequest = new ApiRequest(str, obj);
        g5l g5lVar = new g5l();
        g5lVar.a = this.h.e();
        g5lVar.g(nxp.class, nxp.Api);
        g5lVar.g(Object.class, tyc.a);
        g5lVar.a("User-Agent", this.d);
        g5lVar.a("X-VERSION", "5");
        g5lVar.a("X-UUID", this.c);
        String str2 = this.g.a;
        mqd.y(str2, "uuid");
        g5lVar.a("X-Session-Id", str2);
        k4e k4eVar = this.e;
        k4eVar.getClass();
        g5lVar.f(rcd.d(k4eVar.a(ApiRequest.class), apiRequest));
        String uuid = AppMetricaYandex.getUuid(((a7s) this.a).a);
        if (uuid != null && uuid.length() != 0) {
            g5lVar.a("X-METRICA-UUID", uuid);
        }
        return g5lVar;
    }

    public final znc b(String str, Type type, ocl oclVar, vd1 vd1Var) {
        ndi ndiVarP;
        mdi mdiVarL;
        mqd.z(str, "method");
        mqd.z(oclVar, "response");
        String str2 = oclVar.c;
        int i2 = oclVar.d;
        long j = oclVar.l - oclVar.k;
        tcl tclVar = oclVar.g;
        ii2 ii2Var = oclVar.v(256L).d;
        x20 x20Var = this.b;
        try {
            if (tclVar == null) {
                x20Var.reportError(si2.e(str), new Exception("body is null"));
                return znc.l(i2, str2, "body is null");
            }
            try {
                boolean zI = oclVar.i();
                k4e k4eVar = this.e;
                if (zI) {
                    ApiResponse apiResponse = (ApiResponse) k4eVar.a(gum.i(ApiResponse.class, new Type[]{type})).g(tclVar.v());
                    if (apiResponse != null && "ok".equals(apiResponse.getStatus())) {
                        this.f.c(j * ((long) DescriptorProtos.Edition.EDITION_2023_VALUE), "time2".concat(str));
                        return new ldi(apiResponse.getData());
                    }
                    znc zncVarE = apiResponse != null ? vd1Var.E(apiResponse) : null;
                    if (zncVarE == null) {
                        String strB1 = ii2Var.b1();
                        x20Var.reportError(si2.e(str), new Exception(String.valueOf(i2)));
                        zncVarE = znc.l(i2, str2, strB1);
                    }
                    return zncVarE;
                }
                String strB2 = ii2Var.b1();
                if (i2 / 100 != 5) {
                    x20Var.reportError(si2.e(str), new Exception(String.valueOf(i2)));
                }
                ApiResponse apiResponse2 = (ApiResponse) k4eVar.a(gum.i(ApiResponse.class, new Type[]{ErrorResponseData.class})).g(tclVar.v());
                if (apiResponse2 == null || !"error".equals(apiResponse2.getStatus())) {
                    mdiVarL = znc.l(i2, str2, strB2);
                } else {
                    String str3 = ((ErrorResponseData) apiResponse2.getData()).code;
                    mqd.y(str3, "code");
                    Integer numI = w0o.I(str3);
                    mdiVarL = znc.l(numI != null ? numI.intValue() : i2, ((ErrorResponseData) apiResponse2.getData()).code, ((ErrorResponseData) apiResponse2.getData()).text);
                }
                return mdiVarL;
            } catch (j2e e) {
                x20Var.reportError(si2.e(str), e);
                ndiVarP = znc.p(i2, str2);
                return ndiVarP;
            } catch (IOException e2) {
                x20Var.reportError(si2.e(str), e2);
                ndiVarP = znc.p(i2, str2);
                return ndiVarP;
            }
        } finally {
            tclVar.close();
        }
    }
}
