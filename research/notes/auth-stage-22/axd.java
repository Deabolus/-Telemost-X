package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import android.view.SurfaceView;
import android.webkit.WebView;
import com.google.protobuf.DescriptorProtos;
import com.yandex.io.JniDirectiveObservable;
import com.yandex.messenger.MainApplication;
import com.yandex.passport.R;
import com.yandex.passport.api.v;
import com.yandex.passport.internal.analytics.d0;
import com.yandex.passport.internal.analytics.x;
import com.yandex.passport.internal.core.accounts.b;
import com.yandex.passport.internal.core.accounts.c;
import com.yandex.passport.internal.core.announcing.AccountsChangedReceiver;
import com.yandex.passport.internal.credentials.e;
import com.yandex.passport.internal.d;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.flags.experiments.o;
import com.yandex.passport.internal.flags.experiments.p;
import com.yandex.passport.internal.k;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.properties.y;
import com.yandex.passport.internal.provider.InternalProvider;
import com.yandex.passport.internal.t;
import com.yandex.passport.internal.w;
import com.yandex.passport.legacy.a;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.IReporterYandex;
import io.appmetrica.analytics.impl.K1;
import io.appmetrica.analytics.impl.L6;
import io.appmetrica.analytics.impl.Y8;
import io.appmetrica.analytics.impl.c1;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.sentry.util.g;
import java.lang.ref.WeakReference;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.yandex.quasar.protobuf.Directive;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final /* synthetic */ class axd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ axd(AccountsChangedReceiver accountsChangedReceiver, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.a = 29;
        this.b = context;
        this.c = intent;
        this.d = pendingResult;
    }

    private final void a() {
        Y8.a((Y8) this.b, (Bundle) this.c, (L6) this.d);
    }

    private final void b() {
        c1.a((c1) this.b, (PluginErrorDetails) this.c, (String) this.d);
    }

    private final void c() {
        x analyticsTrackerWrapper;
        y yVar = (y) this.b;
        MainApplication mainApplication = (MainApplication) this.c;
        IReporterYandex iReporterYandex = (IReporterYandex) this.d;
        l6c l6cVar = l6c.a;
        w wVar = new w(mainApplication, iReporterYandex, (e) yVar.a.get(v.a));
        PackageManager packageManager = wVar.b;
        Context context = wVar.a;
        String str = wVar.c;
        a.a("validateAndThrow: start");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            wVar.i(arrayList);
            if (!(context.getString(R.string.passport_sync_adapter_prefix) + str).equals(context.getString(R.string.passport_sync_adapter_content_authority))) {
                w.a("Invalid value in passport_sync_adapter_content_authority", arrayList);
            }
            wVar.l(arrayList);
            if ((packageManager.getApplicationInfo(str, 0).flags & 32768) == 32768) {
                w.a("allowBackup='true' is not allowed", arrayList);
            }
            wVar.b(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", "reaction to system events", 3, true);
            wVar.c(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", wVar.g("android.accounts.LOGIN_ACCOUNTS_CHANGED", (String) null, (String) null), 3);
            wVar.c(arrayList2, "com.yandex.passport.internal.core.announcing.AccountsChangedReceiver", wVar.g("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED", (String) null, (String) null), 3);
            wVar.m(arrayList2);
            wVar.k(arrayList2);
            try {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(wVar.b(arrayList2, "com.yandex.passport.internal.core.sync.SyncService", "accounts backup", 2, false), 128);
                wVar.e(arrayList2, serviceInfo);
                Bundle bundle = serviceInfo.metaData;
                if (bundle == null || bundle.get("android.provider.CONTACTS_STRUCTURE") == null) {
                    w.a("Passport library verification error: There is no contacts metadata in BackupAccountsService declaration please copy \n<meta-data\nandroid:name=\"android.provider.CONTACTS_STRUCTURE\"\nandroid:resource=\"@xml/contacts\" />\nto declaration of com.yandex.auth.sync.BackupAccountsService in AndroidManifest.xml", arrayList2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            wVar.j(arrayList2);
            wVar.d(arrayList2);
            if (!w.i.contains(str) && w.h.equals(wVar.e)) {
                arrayList2.add(new IllegalStateException("Don't use credentials from the sample in your application"));
            }
        } catch (Exception e) {
            arrayList2.add(new IllegalStateException("Passport library verification error", e));
        }
        wVar.h(arrayList2);
        wVar.h(arrayList);
        if ((context.getApplicationInfo().flags & 2) != 0) {
            arrayList.addAll(arrayList2);
        }
        a.a("validateAndThrow: end: errorList.size()=" + arrayList2.size() + " fatalErrorList.size()=" + arrayList.size());
        if (arrayList.size() > 0) {
            Log.e("PassportRuntime", ((IllegalStateException) arrayList.get(0)).getMessage().toString());
            System.exit(0);
        }
        try {
            PassportProcessGlobalComponent passportProcessGlobalComponentA = com.yandex.passport.internal.di.a.a();
            mqd.y(passportProcessGlobalComponentA, "getPassportProcessGlobalComponent(...)");
            c accountsRetriever = passportProcessGlobalComponentA.getAccountsRetriever();
            d0 currentAccountAnalyticsHelper = passportProcessGlobalComponentA.getCurrentAccountAnalyticsHelper();
            d dVarA = accountsRetriever.a();
            p experimentsUpdater = passportProcessGlobalComponentA.getExperimentsUpdater();
            o oVar = o.a;
            int i = p.h;
            g gVar = com.yandex.passport.common.core.d.b;
            experimentsUpdater.a(oVar);
            passportProcessGlobalComponentA.getFlagRepository().a();
            currentAccountAnalyticsHelper.a(dVarA);
            if (!((Boolean) passportProcessGlobalComponentA.getFlagRepository().b(com.yandex.passport.internal.flags.p.A)).booleanValue()) {
                t.f(passportProcessGlobalComponentA, dVarA);
                t.b(mainApplication, passportProcessGlobalComponentA);
                t.c(passportProcessGlobalComponentA);
                passportProcessGlobalComponentA.getCoroutineScopes().getClass();
                lo7.z(l6cVar, (ie6) null, (ze6) null, new l(passportProcessGlobalComponentA, (ic6) null, 1), 3);
                passportProcessGlobalComponentA.getCoroutineScopes().getClass();
                lo7.z(l6cVar, (ie6) null, (ze6) null, new l(passportProcessGlobalComponentA, (ic6) null, 2), 3);
                passportProcessGlobalComponentA.getCoroutineScopes().getClass();
                lo7.z(l6cVar, (ie6) null, (ze6) null, new l(passportProcessGlobalComponentA, (ic6) null, 0), 3);
                passportProcessGlobalComponentA.getCoroutineScopes().getClass();
                lo7.z(l6cVar, (ie6) null, (ze6) null, new b0o(passportProcessGlobalComponentA, mainApplication, yVar, (ic6) null, 17), 3);
            }
            passportProcessGlobalComponentA.getCoroutineScopes().getClass();
            lo7.z(l6cVar, (ie6) null, (ze6) null, new kuq(mainApplication, passportProcessGlobalComponentA, (ic6) null, 17), 3);
            passportProcessGlobalComponentA.getCoroutineScopes().getClass();
            lo7.z(l6cVar, passportProcessGlobalComponentA.getCoroutineDispatchers().c, (ze6) null, new k(passportProcessGlobalComponentA, (ic6) null, 2), 2);
        } catch (Exception e2) {
            boolean z = InternalProvider.d;
            Log.e("throwIfDebug", "throwIfDebug: isInPassportProcess=" + InternalProvider.d, e2);
            if (InternalProvider.d) {
                try {
                    PassportProcessGlobalComponent passportProcessGlobalComponent = com.yandex.passport.internal.di.a.a;
                    if (passportProcessGlobalComponent == null || (analyticsTrackerWrapper = passportProcessGlobalComponent.getAnalyticsTrackerWrapper()) == null) {
                        Log.e("throwIfDebug", "throwIfDebug: something very wrong just happened");
                    } else {
                        analyticsTrackerWrapper.d(com.yandex.passport.internal.analytics.w.a, e2);
                    }
                } catch (Exception e3) {
                    Log.e("throwIfDebug", "throwIfDebug: something very wrong just happened", e3);
                }
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: mnh */
    /* JADX WARN: Code duplicated, block: B:73:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Boolean boolE;
        jc9 jc9Var;
        xni xniVar;
        boolean zBooleanValue;
        d1s d1sVarD;
        ArrayList arrayList;
        Object b1jVar;
        p7q p7qVar;
        Object obj;
        Object[] objArr;
        char c = 2;
        boolean z = true;
        int i = 0;
        boolean zB = false;
        switch (this.a) {
            case 0:
                ((JniDirectiveObservable) this.b).lambda$notifyDecoded$0((bxd) this.c, (Directive) this.d);
                return;
            case 1:
                ((K1) this.b).b((Context) this.c, (AppMetricaConfig) this.d);
                return;
            case 2:
                nqe nqeVar = (nqe) this.b;
                X509Certificate x509Certificate = (X509Certificate) this.c;
                String str = (String) this.d;
                try {
                    mqd.u(str);
                    boolE = nqeVar.a(str, x509Certificate);
                    break;
                } catch (Throwable th) {
                    boolE = nzn.E(th);
                }
                Boolean bool = boolE instanceof jel ? null : boolE;
                if (mqd.s(bool, Boolean.TRUE)) {
                    nqe.e.add(x509Certificate);
                } else if (mqd.s(bool, Boolean.FALSE)) {
                    nqe.f.add(x509Certificate);
                } else if (bool != null) {
                    throw new mnh();
                }
                HashMap map = nqe.g;
                synchronized (map) {
                    jc9Var = (List) map.remove(x509Certificate);
                }
                if (jc9Var == null) {
                    jc9Var = jc9.a;
                }
                nqe.d.post(new c8a(24, jc9Var, bool));
                return;
            case 3:
                sse sseVar = (sse) this.b;
                String str2 = (String) this.c;
                String str3 = (String) this.d;
                if (sseVar.e) {
                    return;
                }
                wa1 wa1Var = sseVar.b;
                mqd.z(str2, "guid");
                mqd.z(str3, "yambToken");
                mwk mwkVar = wa1Var.a;
                ne6.c(mwkVar.k);
                SharedPreferences.Editor editorRemove = ((SharedPreferences) mwkVar.b.get()).edit().remove("guid").remove("yambtoken");
                mqd.y(editorRemove, "remove(...)");
                editorRemove.putString("guid", str2).putString("yambtoken", str3).apply();
                mwkVar.a(wa1Var, new va1(mwkVar, new po1(str2, new uc1(str3, 0))));
                return;
            case 4:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.b;
                fo3 fo3Var = (fo3) this.c;
                fp fpVar = (fp) this.d;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    fpVar.invoke();
                    fo3Var.b((Object) null);
                    return;
                } catch (Throwable th2) {
                    fo3Var.c(th2);
                    return;
                }
            case 5:
                om7 om7Var = (om7) this.b;
                eye eyeVar = (eye) this.c;
                eye eyeVar2 = (eye) this.d;
                r7h r7hVar = (r7h) om7Var.b;
                if (eyeVar != null) {
                    r7hVar.i(eyeVar);
                }
                r7hVar.f(eyeVar2);
                return;
            case 6:
                xtf xtfVar = (xtf) this.b;
                a9d a9dVar = (a9d) this.c;
                euf eufVar = (euf) this.d;
                be7 be7Var = xtfVar.c;
                vwk vwkVarF = a9dVar.f();
                jng jngVar = be7Var.d;
                olj oljVar = be7Var.g;
                oljVar.getClass();
                jngVar.getClass();
                jngVar.b = f9d.k(vwkVarF);
                if (!vwkVarF.isEmpty()) {
                    jngVar.e = (euf) vwkVarF.get(0);
                    eufVar.getClass();
                    jngVar.f = eufVar;
                }
                if (((euf) jngVar.d) == null) {
                    jngVar.d = jng.f(oljVar, (f9d) jngVar.b, (euf) jngVar.e, (hjp) jngVar.a);
                }
                jngVar.q(oljVar.C());
                return;
            case 7:
                tuf tufVar = (tuf) this.b;
                Pair pair = (Pair) this.c;
                ((be7) tufVar.b.i).a(((Integer) pair.first).intValue(), (euf) pair.second, (Exception) this.d);
                return;
            case 8:
                ((kh) ((cph) this.b).b.get()).a(new c24((bn4) this.c, (Bundle) this.d));
                return;
            case 9:
                coi coiVar = (coi) this.b;
                zni zniVar = (zni) this.c;
                yni yniVar = (yni) this.d;
                WeakReference weakReference = coiVar.l;
                if (weakReference == null || (xniVar = (xni) weakReference.get()) == null) {
                    return;
                }
                xniVar.A(zniVar, yniVar);
                return;
            case 10:
                coi coiVar2 = (coi) this.b;
                zni zniVar2 = (zni) this.c;
                uni uniVar = (uni) this.d;
                ArrayList arrayList2 = coiVar2.f;
                int iOrdinal = zniVar2.ordinal();
                if (iOrdinal == 0) {
                    arrayList2.clear();
                    arrayList2.addAll(uniVar.a);
                    zni zniVar3 = zni.a;
                    yni yniVar2 = yni.d;
                    coiVar2.g(zniVar3, yniVar2);
                    if (!uniVar.b) {
                        coiVar2.g(zni.c, yniVar2);
                    }
                    if (!uniVar.c) {
                        coiVar2.g(zni.b, yniVar2);
                    }
                } else if (iOrdinal == 1) {
                    List list = uniVar.a;
                    if (list.isEmpty()) {
                        coiVar2.g(zni.b, yni.d);
                        return;
                    }
                    arrayList2.addAll(list);
                    coiVar2.g(zni.b, uniVar.c ? yni.a : yni.d);
                    int size = coiVar2.k - list.size();
                    coiVar2.k = size;
                    if (size > 0) {
                        coiVar2.e(new wf(false));
                    }
                } else {
                    if (iOrdinal != 2) {
                        throw new mnh();
                    }
                    List list2 = uniVar.a;
                    if (list2.isEmpty()) {
                        coiVar2.g(zni.c, yni.d);
                        return;
                    }
                    arrayList2.addAll(0, list2);
                    coiVar2.g(zni.c, uniVar.b ? yni.a : yni.d);
                    int size2 = coiVar2.j - list2.size();
                    coiVar2.j = size2;
                    if (size2 > 0) {
                        coiVar2.f(new wf(false));
                    }
                }
                coiVar2.b.post(new ye(coiVar2, new ArrayList(arrayList2), zniVar2, uniVar.a, 12));
                return;
            case 11:
                y70.a((y70) this.b, (SurfaceView) this.c, (xfg) this.d);
                return;
            case 12:
                b1k b1kVar = (b1k) this.b;
                jo3 jo3Var = (jo3) this.c;
                k2s k2sVar = (k2s) this.d;
                b1kVar.getClass();
                try {
                    zBooleanValue = ((Boolean) jo3Var.b.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (b1kVar.k) {
                    try {
                        d1sVarD = sum.d(k2sVar.a);
                        String str4 = d1sVarD.a;
                        if (b1kVar.c(str4) == k2sVar) {
                            b1kVar.b(str4);
                        }
                        a7f.u().o(b1k.l, b1k.class.getSimpleName() + " " + str4 + " executed; reschedule = " + zBooleanValue);
                        arrayList = new ArrayList(b1kVar.j);
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((i6a) it.next()).a(d1sVarD, zBooleanValue);
                }
                return;
            case 13:
                ((tck) this.b).a((String) this.c, (String) this.d);
                return;
            case 14:
                mwk mwkVar2 = (mwk) this.b;
                nb1 nb1Var = (nb1) this.c;
                gaa gaaVar = (gaa) this.d;
                g1j g1jVarJ = ((ks6) mwkVar2.l.b).j();
                oxk oxkVar = (oxk) ((bs6) mwkVar2.l.c).F0.get();
                k0j k0jVar = g1jVarJ.b;
                if (k0jVar == null) {
                    g1jVarJ.e("checkMasterToken");
                    cw3.T.getClass();
                    b1jVar = hlk.b;
                } else {
                    b1jVar = new b1j(k0jVar, oxkVar, g1jVarJ.c, new sc9(nb1Var, 19));
                }
                gaaVar.u1(mwk.r[1], null, b1jVar);
                return;
            case 15:
                nl4 nl4Var = (nl4) this.b;
                gq3 gq3Var = (gq3) this.c;
                gxe gxeVar = (gxe) this.d;
                nl4Var.getClass();
                Log.d("RequestMonitor", "RequestListener " + gq3Var + " done " + nl4Var);
                nl4Var.b.remove(gxeVar);
                return;
            case 16:
                ((hvk) this.b).r((c9o) this.c, (Map.Entry) this.d);
                return;
            case 17:
                fao faoVar = (fao) this.b;
                s9o s9oVar = (s9o) this.c;
                kx3 kx3Var = (kx3) this.d;
                eao eaoVar = faoVar.f;
                eaoVar.a();
                if (eaoVar.g) {
                    eaoVar.g = false;
                    s9oVar.c();
                    s9oVar.i.b((Object) null);
                    return;
                }
                eaoVar.b = s9oVar;
                eaoVar.d = kx3Var;
                Size size3 = s9oVar.b;
                eaoVar.a = size3;
                eaoVar.f = false;
                if (eaoVar.b()) {
                    return;
                }
                iym.F("SurfaceViewImpl", "Wait for new Surface creation.");
                eaoVar.h.e.getHolder().setFixedSize(size3.getWidth(), size3.getHeight());
                return;
            case 18:
                ((vco) this.b).i((pck) this.c, (String) this.d);
                return;
            case DescriptorProtos.FieldOptions.TARGETS_FIELD_NUMBER /* 19 */:
                ogo ogoVar = (ogo) this.b;
                WebView webView = (WebView) this.c;
                String str5 = (String) this.d;
                String url = webView.getUrl();
                if (TextUtils.isEmpty(url) || url.equals(str5)) {
                    ogoVar.a(str5);
                    return;
                }
                return;
            case 20:
                n7q n7qVar = (n7q) this.b;
                List list3 = (List) this.c;
                q9j q9jVar = (q9j) this.d;
                zgj zgjVar = n7qVar.b;
                if (zgjVar == null || (p7qVar = (p7q) zgjVar.e) == null) {
                    return;
                }
                HashMap map2 = (HashMap) zgjVar.b;
                String quantityString = "";
                q7q q7qVar = (q7q) zgjVar.f;
                Context context = q7qVar.d;
                if (!list3.isEmpty()) {
                    if (!q9jVar.d || q9jVar.c()) {
                        int size4 = list3.size();
                        if (size4 > 2) {
                            quantityString = context.getResources().getQuantityString(2131886097, size4, Integer.valueOf(size4));
                        } else {
                            StringBuilder sb = new StringBuilder();
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                String str6 = (String) it2.next();
                                if (!map2.containsKey(str6)) {
                                    b3c b3cVar = q7qVar.a;
                                    ym ymVar = new ym(6, zgjVar, str6);
                                    b3cVar.getClass();
                                    mqd.z(str6, "guid");
                                    map2.put(str6, b3cVar.b.d(new c3c(str6, z), new ex3(ymVar, 6)));
                                }
                                wrq wrqVar = (wrq) ((HashMap) zgjVar.c).get(str6);
                                if (wrqVar != null) {
                                    fvq fvqVar = q7qVar.b;
                                    mqd.z(str6, "userId");
                                    long jLongValue = ((Number) fvqVar.b.g.getValue()).longValue();
                                    wrq wrqVarB = fvqVar.a.b().b(str6);
                                    sb.append(q6n.f(wrqVarB == null ? new evq(null, gvq.c) : fvqVar.c.a(wrqVarB, jLongValue), context.getResources(), wrqVar.a));
                                    sb.append(", ");
                                    i++;
                                }
                                zgjVar = zgjVar;
                                c = c;
                                it2 = it2;
                                z = true;
                            }
                            if (sb.length() != 0) {
                                sb.replace(sb.length() - 2, sb.length(), "");
                                sb.append(" ");
                                sb.append(context.getString(i > 1 ? 2132017824 : 2132017825));
                                quantityString = sb.toString();
                            } else {
                                quantityString = context.getResources().getQuantityString(2131886097, size4, Integer.valueOf(size4));
                            }
                        }
                    } else {
                        quantityString = context.getString(2132017825);
                    }
                }
                p7qVar.b(quantityString);
                return;
            case DescriptorProtos.FieldOptions.FEATURES_FIELD_NUMBER /* 21 */:
                sar sarVar = (sar) this.b;
                a9b a9bVar = (a9b) this.c;
                fc7 fc7Var = (fc7) this.d;
                q8a q8aVar = (q8a) sarVar.b;
                int i2 = z2r.a;
                be7 be7Var2 = q8aVar.a.r;
                b30 b30VarW = be7Var2.W();
                be7Var2.X(b30VarW, 1017, new vd7(b30VarW, a9bVar, fc7Var, 0));
                return;
            case DescriptorProtos.FieldOptions.FEATURE_SUPPORT_FIELD_NUMBER /* 22 */:
                sar sarVar2 = (sar) this.b;
                nqn nqnVar = (nqn) this.c;
                b1k b1kVar2 = (b1k) sarVar2.a;
                b1kVar2.getClass();
                d1s d1sVar = nqnVar.a;
                String str7 = d1sVar.a;
                ArrayList arrayList3 = new ArrayList();
                u1s u1sVar = (u1s) b1kVar2.e.V0(new j8l(new mp7(b1kVar2, arrayList3, str7, 1), 4));
                if (u1sVar == null) {
                    a7f.u().C(b1k.l, "Didn't find WorkSpec for id " + d1sVar);
                    b1kVar2.d.e.execute(new a1k(0, b1kVar2, d1sVar));
                    return;
                }
                Object obj2 = b1kVar2.k;
                synchronized (obj2) {
                    try {
                        synchronized (b1kVar2.k) {
                            try {
                                try {
                                    objArr = b1kVar2.c(str7) != null;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    while (true) {
                                        try {
                                            throw th;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        }
                        if (objArr == true) {
                            Set set = (Set) b1kVar2.h.get(str7);
                            if (((nqn) set.iterator().next()).a.b == d1sVar.b) {
                                set.add(nqnVar);
                                a7f.u().o(b1k.l, "Work " + d1sVar + " is already enqueued for processing");
                            } else {
                                b1kVar2.d.e.execute(new a1k(0, b1kVar2, d1sVar));
                            }
                            return;
                        }
                        if (u1sVar.t != d1sVar.b) {
                            b1kVar2.d.e.execute(new a1k(0, b1kVar2, d1sVar));
                            return;
                        }
                        try {
                            k2s k2sVar2 = new k2s(new fi5(b1kVar2.b, b1kVar2.c, b1kVar2.d, b1kVar2, b1kVar2.e, u1sVar, arrayList3));
                            le6 le6Var = k2sVar2.d.b;
                            nxd nxdVarG = as1.g();
                            le6Var.getClass();
                            jo3 jo3VarH = z3i.H(m51.I(le6Var, nxdVarG), new i2s(k2sVar2, (ic6) null, 1));
                            jo3VarH.b.b(new axd(b1kVar2, jo3VarH, k2sVar2, 12), b1kVar2.d.e);
                            b1kVar2.g.put(str7, k2sVar2);
                            HashSet hashSet = new HashSet();
                            hashSet.add(nqnVar);
                            b1kVar2.h.put(str7, hashSet);
                            a7f.u().o(b1k.l, b1k.class.getSimpleName() + ": processing " + d1sVar);
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            obj = obj2;
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        obj = obj2;
                    }
                }
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.b;
                fo3 fo3Var2 = (fo3) this.c;
                kib kibVar = (kib) this.d;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    fo3Var2.b(kibVar.invoke());
                    return;
                } catch (Throwable th9) {
                    fo3Var2.c(th9);
                    return;
                }
            case 24:
                e2s e2sVar = (h2s) this.b;
                vuk vukVar = (vuk) this.c;
                k2s k2sVar3 = (k2s) this.d;
                if (!(e2sVar instanceof e2s)) {
                    if (e2sVar instanceof d2s) {
                        k2s.a(k2sVar3, new ixe());
                        vukVar.a = false;
                        return;
                    } else if (e2sVar instanceof f2s) {
                        vukVar.a = k2s.b(k2sVar3, ((f2s) e2sVar).a);
                        return;
                    } else {
                        if (!(e2sVar instanceof g2s)) {
                            throw new mnh();
                        }
                        if (((g2s) e2sVar).a) {
                            zB = k2s.b(k2sVar3, -256);
                        } else {
                            k2s.a(k2sVar3, new ixe());
                        }
                        vukVar.a = zB;
                        return;
                    }
                }
                kxe kxeVar = e2sVar.a;
                v1s v1sVar = k2sVar3.i;
                String str8 = k2sVar3.c;
                e1s e1sVarB = v1sVar.b(str8);
                o1s o1sVarC1 = k2sVar3.h.c1();
                o1sVarC1.getClass();
                h6i.M(o1sVarC1.a, false, true, new uuq(str8, 18));
                if (e1sVarB == null) {
                    z = false;
                } else if (e1sVarB == e1s.b) {
                    u1s u1sVar2 = k2sVar3.a;
                    String str9 = k2sVar3.l;
                    if (kxeVar instanceof kxe) {
                        String str10 = l2s.a;
                        a7f.u().y(str10, "Worker result SUCCESS for " + str9);
                        if (u1sVar2.b()) {
                            k2sVar3.e();
                        } else {
                            v1sVar.h(e1s.c, str8);
                            tw6 tw6Var = kxeVar.a;
                            mqd.y(tw6Var, "getOutputData(...)");
                            h6i.M(v1sVar.a, false, true, new wzr(3, tw6Var, str8));
                            k2sVar3.f.getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            zr7 zr7Var = k2sVar3.j;
                            for (String str11 : zr7Var.a(str8)) {
                                if (v1sVar.b(str11) == e1s.e && ((Boolean) h6i.M(zr7Var.a, true, false, new cx4(str11, 20))).booleanValue()) {
                                    a7f.u().y(l2s.a, "Setting status to enqueued for ".concat(str11));
                                    v1sVar.h(e1s.a, str11);
                                    v1sVar.g(jCurrentTimeMillis, str11);
                                    k2sVar3.n.add(str11);
                                }
                            }
                        }
                    } else if (kxeVar instanceof jxe) {
                        String str12 = l2s.a;
                        a7f.u().y(str12, "Worker result RETRY for " + str9);
                        k2sVar3.d(-256);
                    } else {
                        String str13 = l2s.a;
                        a7f.u().y(str13, "Worker result FAILURE for " + str9);
                        if (u1sVar2.b()) {
                            k2sVar3.e();
                        } else {
                            k2sVar3.f(kxeVar);
                        }
                    }
                    z = false;
                } else if (e1sVarB.b()) {
                    z = false;
                } else {
                    k2sVar3.d(-512);
                }
                vukVar.a = z;
                return;
            case 25:
                t4s t4sVar = (t4s) this.b;
                s4s s4sVar = (s4s) this.c;
                Object obj3 = this.d;
                if (t4sVar.i) {
                    return;
                }
                taa taaVarA = s4sVar.c;
                Handler handler = s4sVar.d;
                atl.s(handler.getLooper(), Looper.myLooper(), null);
                if (s4sVar.i) {
                    return;
                }
                handler.removeCallbacksAndMessages(null);
                int iP = s4sVar.b.p(obj3);
                if (s4sVar.i) {
                    return;
                }
                if (iP == 0) {
                    s4sVar.b();
                    return;
                }
                if ((iP == 1 || iP == 2) && s4sVar.h < s4sVar.e) {
                    if (iP == 2) {
                        taaVarA = taaVarA.a();
                    }
                    handler.postDelayed(s4sVar, taaVarA.c(s4sVar.h, s4sVar.f));
                    return;
                }
                return;
            case 26:
                a();
                return;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                b();
                return;
            case 28:
                c();
                return;
            default:
                Context context2 = (Context) this.b;
                Intent intent = (Intent) this.c;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.d;
                int i3 = AccountsChangedReceiver.a;
                try {
                    try {
                        PassportProcessGlobalComponent passportProcessGlobalComponentA = com.yandex.passport.internal.di.a.a();
                        mqd.y(passportProcessGlobalComponentA, "getPassportProcessGlobalComponent(...)");
                        com.yandex.passport.internal.core.announcing.e announcingHelper = passportProcessGlobalComponentA.getAnnouncingHelper();
                        com.yandex.passport.internal.report.reporters.g announcementReporter = passportProcessGlobalComponentA.getAnnouncementReporter();
                        b accountsBackuper = passportProcessGlobalComponentA.getAccountsBackuper();
                        com.yandex.passport.internal.core.announcing.b accountsChangesAnnouncer = passportProcessGlobalComponentA.getAccountsChangesAnnouncer();
                        if (AccountsChangedReceiver.a(context2, passportProcessGlobalComponentA.getAccountSharingConfigStorage())) {
                            com.yandex.passport.internal.core.announcing.d dVarA = announcingHelper.a(intent);
                            if (dVarA != null) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, (String) null, "onReceive: received " + dVarA, 8);
                                }
                                announcementReporter.n(dVarA);
                                if (!TextUtils.equals(dVarA.c, context2.getPackageName())) {
                                    accountsBackuper.d("android.accounts.LOGIN_ACCOUNTS_CHANGED");
                                    accountsChangesAnnouncer.getClass();
                                    accountsChangesAnnouncer.a(true);
                                } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, (String) null, "onReceive: ignored because sent by me", 8);
                                }
                            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, (String) null, "onReceive: can't get announcement from intent", 8);
                            }
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, (String) null, "onReceive: ignored because is not trusted application", 8);
                        }
                    } finally {
                        pendingResult.finish();
                    }
                } catch (Exception e) {
                    a.e(e);
                }
                return;
        }
    }

    public /* synthetic */ axd(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
