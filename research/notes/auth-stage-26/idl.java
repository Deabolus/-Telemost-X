package defpackage;

import com.yandex.messaging.core.net.entities.RequestUserParams;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.chatcreate.CreateChannelParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreateFamilyChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.CreateGroupChatParam;
import com.yandex.messaging.core.net.entities.chatcreate.GroupChatData;
import com.yandex.messaging.core.net.entities.xiva.XivaSecretContainer;
import com.yandex.messaging.core.net.entities.xiva.XivaUser;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class idl extends bff {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ idl(jdl jdlVar, wpm wpmVar, wf wfVar, Object obj, int i) {
        this.i = i;
        this.k = jdlVar;
        this.j = wpmVar;
        this.l = obj;
    }

    public boolean C(f7f f7fVar) {
        switch (this.i) {
            case 0:
                wpm wpmVar = (wpm) this.j;
                ((y94) wpmVar.c).j(new rh9(f7fVar));
                return true;
            case 1:
                wpm wpmVar2 = (wpm) this.j;
                ((y94) wpmVar2.c).j(new rh9(f7fVar));
                return true;
            case 2:
                wpm wpmVar3 = (wpm) this.j;
                ((y94) wpmVar3.c).j(new rh9(f7fVar));
                return true;
            case 3:
            default:
                return super.C(f7fVar);
            case 4:
                mqd.z(f7fVar, "error");
                ((ycp) this.k).invoke(Integer.valueOf(f7fVar.a));
                return true;
        }
    }

    public final void E(Object obj) {
        switch (this.i) {
            case 0:
                GroupChatData groupChatData = (GroupChatData) obj;
                ((jdl) this.k).a.a(groupChatData.getErrors());
                ((wpm) this.j).s(groupChatData.getChatData(), (UserData) null);
                break;
            case 1:
                GroupChatData groupChatData2 = (GroupChatData) obj;
                ((jdl) this.k).a.a(groupChatData2.getErrors());
                ((wpm) this.j).s(groupChatData2.getChatData(), (UserData) null);
                break;
            case 2:
                GroupChatData groupChatData3 = (GroupChatData) obj;
                ((jdl) this.k).a.a(groupChatData3.getErrors());
                ((wpm) this.j).s(groupChatData3.getChatData(), (UserData) null);
                break;
            case 3:
                XivaSecretContainer xivaSecretContainer = (XivaSecretContainer) obj;
                mqd.z(xivaSecretContainer, "response");
                wzr wzrVar = (wzr) this.k;
                XivaUser xivaUser = xivaSecretContainer.user;
                long j = xivaUser.uid;
                String strValueOf = j != 0 ? String.valueOf(j) : xivaUser.guid;
                mqd.y(strValueOf, "getTokenUser(...)");
                String str = xivaSecretContainer.secret.sign;
                mqd.y(str, "sign");
                wzrVar.invoke(new w4s(strValueOf, str, xivaSecretContainer.secret.ts));
                break;
            default:
                ((iy2) this.l).invoke(Long.valueOf(((Number) obj).longValue()));
                break;
        }
    }

    public void F() {
        switch (this.i) {
            case 4:
                ((ycp) this.k).invoke(-1);
                break;
        }
    }

    public final g5l I() {
        switch (this.i) {
            case 0:
                return ((jdl) this.k).c.a((CreateGroupChatParam) this.l, "create_chat");
            case 1:
                return ((jdl) this.k).c.a((CreateFamilyChatParam) this.l, "create_chat");
            case 2:
                return ((jdl) this.k).c.a((CreateChannelParam) this.l, "create_chat");
            case 3:
                RequestUserParams requestUserParams = new RequestUserParams();
                requestUserParams.needXivaSecret = true;
                y8q y8qVar = (y8q) this.j;
                hu7 hu7Var = (hu7) y8qVar.d;
                g5l g5lVarA = ((quc) y8qVar.c).a(requestUserParams, "request_user");
                hu7Var.b(g5lVarA);
                return g5lVarA;
            default:
                g5l g5lVar = new g5l();
                g5lVar.i((String) this.j);
                g5lVar.g(nxp.class, nxp.FileUpload);
                g5lVar.e("HEAD", (f6l) null);
                return g5lVar;
        }
    }

    public boolean i() {
        switch (this.i) {
            case 4:
                return false;
            default:
                return super.i();
        }
    }

    public final znc s(ocl oclVar) {
        switch (this.i) {
            case 0:
                return fde.j(((jdl) this.k).c, "create_chat", GroupChatData.class, oclVar);
            case 1:
                return fde.j(((jdl) this.k).c, "create_chat", GroupChatData.class, oclVar);
            case 2:
                return fde.j(((jdl) this.k).c, "create_chat", GroupChatData.class, oclVar);
            case 3:
                znc zncVarJ = fde.j((quc) ((y8q) this.j).c, "request_user", XivaSecretContainer.class, oclVar);
                if (!(zncVarJ instanceof ldi)) {
                    return zncVarJ;
                }
                XivaUser xivaUser = ((XivaSecretContainer) ((ldi) zncVarJ).i).user;
                long j = xivaUser.uid;
                return !mqd.s((j > 0L ? 1 : (j == 0L ? 0 : -1)) != 0 ? String.valueOf(j) : xivaUser.guid, (String) this.l) ? new znc(17) : zncVarJ;
            default:
                tcl tclVar = oclVar.g;
                if (tclVar != null) {
                    tclVar.close();
                }
                if (oclVar.i()) {
                    String strC = ocl.c(oclVar, "Content-Length");
                    return new ldi(Long.valueOf(strC != null ? Long.parseLong(strC) : 0L));
                }
                int i = oclVar.d;
                return i == 404 ? new ldi(0L) : znc.p(i, oclVar.c);
        }
    }

    public wf z() {
        switch (this.i) {
            case 0:
                return ((y94) ((wpm) this.j).c).a();
            case 1:
                return ((y94) ((wpm) this.j).c).a();
            case 2:
                return ((y94) ((wpm) this.j).c).a();
            case 3:
            default:
                return super.z();
            case 4:
                return new wf(true);
        }
    }

    public /* synthetic */ idl(Object obj, Object obj2, lib libVar, int i) {
        this.i = i;
        this.j = obj;
        this.l = obj2;
        this.k = libVar;
    }
}
