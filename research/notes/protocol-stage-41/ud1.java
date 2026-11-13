package defpackage;

import com.yandex.messaging.core.net.entities.ChangeChatMembersParams;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.GetChatInfoData;
import com.yandex.messaging.core.net.entities.GetChatInfoParam;
import com.yandex.messaging.core.net.entities.chatcreate.AddRemoveUserError;
import com.yandex.messaging.core.net.entities.chatcreate.GroupChatData;
import com.yandex.messaging.json.JsonAdapter;
import com.yandex.messaging.mediaviewer.docs.net.DocViewerErrorData;
import com.yandex.messaging.mediaviewer.docs.net.DocViewerResponse$Error;
import com.yandex.messaging.mediaviewer.docs.net.DocViewerResponse$Success;
import com.yandex.messaging.mediaviewer.video.ErrorData;
import com.yandex.messaging.mediaviewer.video.StreamInfoResponse$Error;
import com.yandex.messaging.mediaviewer.video.StreamInfoResponse$Success;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class ud1 extends bff {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    public /* synthetic */ ud1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.j = obj3;
        this.m = obj4;
        this.n = obj5;
    }

    public final boolean C(f7f f7fVar) {
        switch (this.i) {
            case 0:
                mqd.z(f7fVar, "error");
                return ((rd1) this.k).l(f7fVar.a);
            case 1:
                mqd.z(f7fVar, "error");
                return ((rd1) this.k).l(f7fVar.a);
            case 2:
                mqd.z(f7fVar, "error");
                ((pd1) this.k).j(new rh9(f7fVar.a, f7fVar.b, (String) this.m));
                return false;
            case 3:
                mqd.z(f7fVar, "error");
                gw3 gw3Var = (gw3) this.n;
                String str = f7fVar.b;
                if (str == null) {
                    str = "unknown";
                }
                String str2 = f7fVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                gw3Var.f(new DocViewerResponse$Error("error", new DocViewerErrorData(str, str2, "network")));
                return true;
            default:
                mqd.z(f7fVar, "error");
                gw3 gw3Var2 = (gw3) this.n;
                String str3 = f7fVar.b;
                if (str3 == null) {
                    str3 = "unknown";
                }
                String str4 = f7fVar.c;
                if (str4 == null) {
                    str4 = "";
                }
                gw3Var2.f(new StreamInfoResponse$Error("error", new ErrorData(str3, str4, "network")));
                return true;
        }
    }

    public final void E(Object obj) {
        switch (this.i) {
            case 0:
                ChatData chatData = (ChatData) obj;
                mqd.z(chatData, "response");
                ((rd1) this.k).c0(chatData);
                break;
            case 1:
                GroupChatData groupChatData = (GroupChatData) obj;
                qe1 qe1Var = (qe1) this.j;
                mqd.z(groupChatData, "response");
                AddRemoveUserError[] errors = groupChatData.getErrors();
                if (errors == null || errors.length == 0) {
                    ((rd1) this.k).c0(groupChatData);
                } else {
                    qe1Var.g.a(errors);
                    m04 m04Var = qe1Var.h;
                    m04Var.getClass();
                    m04Var.e.c(tt0.g1(errors));
                    ((lib) this.m).invoke(groupChatData);
                }
                break;
            case 2:
                GetChatInfoData getChatInfoData = (GetChatInfoData) obj;
                pd1 pd1Var = (pd1) this.k;
                mqd.z(getChatInfoData, "response");
                ChatData[] chatDataArr = getChatInfoData.chats;
                if (chatDataArr.length != 0) {
                    ChatData chatData2 = chatDataArr[0];
                    mqd.u(chatData2);
                    pd1Var.s(chatData2, null);
                } else {
                    pd1Var.j(new oh9((String) this.m));
                }
                break;
            case 3:
                f58 f58Var = (f58) obj;
                mqd.z(f58Var, "response");
                ((gw3) this.n).f(f58Var);
                break;
            default:
                iyn iynVar = (iyn) obj;
                mqd.z(iynVar, "response");
                ((gw3) this.n).f(iynVar);
                break;
        }
    }

    public void F() {
        switch (this.i) {
            case 1:
                ((kib) this.n).invoke();
                break;
            case 2:
                ((pd1) this.k).j(new vh9((String) this.m));
                break;
            case 3:
                ((gw3) this.n).f(new DocViewerResponse$Error("error", new DocViewerErrorData("timeout", "timeout", "network")));
                break;
            case 4:
                ((gw3) this.n).f(new StreamInfoResponse$Error("error", new ErrorData("timeout", "timeout", "network")));
                break;
        }
    }

    public final g5l I() {
        switch (this.i) {
            case 0:
                exc excVar = ((qe1) this.j).c;
                String str = String.format("change_chat_avatar/%s", Arrays.copyOf(new Object[]{(String) this.m}, 1));
                go5 go5Var = (go5) this.n;
                excVar.getClass();
                g5l g5lVarC = excVar.c(str, new HashMap());
                g5lVarC.g(nxp.class, nxp.FileUpload);
                g5lVarC.f(go5Var);
                return g5lVarC;
            case 1:
                return ((qe1) this.j).b.a((ChangeChatMembersParams) this.l, "change_chat_members");
            case 2:
                return ((qe1) this.j).b.a(new GetChatInfoParam((String[]) this.n), "get_chats_info");
            case 3:
                e58 e58Var = (e58) this.k;
                g5l g5lVarA = ((x48) this.l).c.a(wq1.h("docviewer_link/", e58Var.a), f3r.I(new qek("tld", e58Var.b)));
                String str2 = e58Var.c;
                if (str2 != null) {
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                    if (str2 != null) {
                        g5lVarA.a("X-Invite-Hash", str2);
                    }
                }
                g5lVarA.g(b7b.class, new b7b(x48.e));
                return g5lVarA;
            default:
                bqc bqcVar = (bqc) this.k;
                g5l g5lVarA2 = ((vbr) this.l).c.a(wq1.h("video_streams/", bqcVar.a), jc9.a);
                String str3 = bqcVar.b;
                if (str3 != null) {
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        g5lVarA2.a("X-Invite-Hash", str3);
                    }
                }
                g5lVarA2.g(b7b.class, new b7b(vbr.e));
                return g5lVarA2;
        }
    }

    public boolean i() {
        switch (this.i) {
            case 3:
                return false;
            case 4:
                return false;
            default:
                return super.i();
        }
    }

    public final znc s(ocl oclVar) {
        DocViewerResponse$Success docViewerResponse$SuccessE;
        DocViewerResponse$Error docViewerResponse$ErrorE;
        StreamInfoResponse$Success streamInfoResponse$SuccessE;
        StreamInfoResponse$Error streamInfoResponse$ErrorE;
        switch (this.i) {
            case 0:
                znc zncVarJ = fde.j(((qe1) this.j).b, "change_chat_avatar/%s", ChatData.class, oclVar);
                return zncVarJ instanceof ldi ? new ldi(((ldi) zncVarJ).i) : new ndi(zncVarJ.w(), 1);
            case 1:
                return fde.j(((qe1) this.j).b, "change_chat_members", GroupChatData.class, oclVar);
            case 2:
                return fde.j(((qe1) this.j).b, "get_chats_info", GetChatInfoData.class, oclVar);
            case 3:
                String str = oclVar.c;
                int i = oclVar.d;
                tcl tclVar = oclVar.g;
                if (tclVar == null) {
                    return znc.p(i, str);
                }
                String strW = tclVar.w();
                try {
                    docViewerResponse$SuccessE = (DocViewerResponse$Success) ((JsonAdapter) this.j).b(strW);
                    break;
                } catch (Throwable th) {
                    docViewerResponse$SuccessE = nzn.E(th);
                }
                if (docViewerResponse$SuccessE instanceof jel) {
                    docViewerResponse$SuccessE = null;
                }
                DocViewerResponse$Success docViewerResponse$Success = docViewerResponse$SuccessE;
                if (docViewerResponse$Success != null && mqd.s(docViewerResponse$Success.getStatus(), "ok")) {
                    return new ldi(docViewerResponse$Success);
                }
                try {
                    docViewerResponse$ErrorE = (DocViewerResponse$Error) ((JsonAdapter) this.m).b(strW);
                    break;
                } catch (Throwable th2) {
                    docViewerResponse$ErrorE = nzn.E(th2);
                }
                DocViewerResponse$Error docViewerResponse$Error = docViewerResponse$ErrorE instanceof jel ? null : docViewerResponse$ErrorE;
                return (docViewerResponse$Error == null || !mqd.s(docViewerResponse$Error.getStatus(), "error")) ? znc.p(i, str) : new ldi(docViewerResponse$Error);
            default:
                String str2 = oclVar.c;
                int i2 = oclVar.d;
                tcl tclVar2 = oclVar.g;
                if (tclVar2 == null) {
                    return znc.p(i2, str2);
                }
                String strW2 = tclVar2.w();
                try {
                    streamInfoResponse$SuccessE = (StreamInfoResponse$Success) ((JsonAdapter) this.j).b(strW2);
                    break;
                } catch (Throwable th3) {
                    streamInfoResponse$SuccessE = nzn.E(th3);
                }
                if (streamInfoResponse$SuccessE instanceof jel) {
                    streamInfoResponse$SuccessE = null;
                }
                StreamInfoResponse$Success streamInfoResponse$Success = streamInfoResponse$SuccessE;
                if (streamInfoResponse$Success != null && mqd.s(streamInfoResponse$Success.getStatus(), "ok")) {
                    return new ldi(streamInfoResponse$Success);
                }
                try {
                    streamInfoResponse$ErrorE = (StreamInfoResponse$Error) ((JsonAdapter) this.m).b(strW2);
                    break;
                } catch (Throwable th4) {
                    streamInfoResponse$ErrorE = nzn.E(th4);
                }
                StreamInfoResponse$Error streamInfoResponse$Error = streamInfoResponse$ErrorE instanceof jel ? null : streamInfoResponse$ErrorE;
                return (streamInfoResponse$Error == null || !mqd.s(streamInfoResponse$Error.getStatus(), "error")) ? znc.p(i2, str2) : new ldi(streamInfoResponse$Error);
        }
    }

    public final wf z() {
        switch (this.i) {
            case 0:
                wf wfVarA = ((rd1) this.k).a();
                return wfVarA == null ? (wf) this.l : wfVarA;
            case 1:
                return new wf(true);
            case 2:
                wf wfVarA2 = ((pd1) this.k).a();
                return wfVarA2 == null ? (wf) this.l : wfVarA2;
            case 3:
                return new wf(true);
            default:
                return new wf(true);
        }
    }

    public ud1(pd1 pd1Var, wf wfVar, qe1 qe1Var, String[] strArr, String str) {
        this.i = 2;
        this.k = pd1Var;
        this.l = wfVar;
        this.j = qe1Var;
        this.n = strArr;
        this.m = str;
    }

    public ud1(qe1 qe1Var, ChangeChatMembersParams changeChatMembersParams, lib libVar, rd1 rd1Var, kib kibVar) {
        this.i = 1;
        this.j = qe1Var;
        this.l = changeChatMembersParams;
        this.m = libVar;
        this.k = rd1Var;
        this.n = kibVar;
    }
}
