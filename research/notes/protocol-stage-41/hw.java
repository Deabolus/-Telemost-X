package defpackage;

import com.yandex.messaging.core.net.entities.ActivateChatRequestParams;
import com.yandex.messaging.core.net.entities.AddFilesParams;
import com.yandex.messaging.core.net.entities.AddFilesResponse;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.BucketsData;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.ChatParticipantsData;
import com.yandex.messaging.core.net.entities.ChatParticipantsParams;
import com.yandex.messaging.core.net.entities.ChatSettingsParams;
import com.yandex.messaging.core.net.entities.EmptyResponse;
import com.yandex.messaging.core.net.entities.GetChatInfoByAlias;
import com.yandex.messaging.core.net.entities.GetChatInfoData;
import com.yandex.messaging.core.net.entities.GetChatSettingsParams;
import com.yandex.messaging.core.net.entities.GetMediaMessagesParams;
import com.yandex.messaging.core.net.entities.GetOrganizationsParams;
import com.yandex.messaging.core.net.entities.GetOrganizationsResponse;
import com.yandex.messaging.core.net.entities.GetStaffDataParam;
import com.yandex.messaging.core.net.entities.GetSuggestData;
import com.yandex.messaging.core.net.entities.GetSuggestParam;
import com.yandex.messaging.core.net.entities.GetUserGapsParam;
import com.yandex.messaging.core.net.entities.GetUsersDataParam;
import com.yandex.messaging.core.net.entities.JoinParams;
import com.yandex.messaging.core.net.entities.MediaMessageListData;
import com.yandex.messaging.core.net.entities.ResolveYaDiskParams;
import com.yandex.messaging.core.net.entities.ResolveYaDiskResponse;
import com.yandex.messaging.core.net.entities.SearchData;
import com.yandex.messaging.core.net.entities.SearchParams;
import com.yandex.messaging.core.net.entities.ShareFileParams;
import com.yandex.messaging.core.net.entities.ShareFileResponse;
import com.yandex.messaging.core.net.entities.StaffUserDataData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.core.net.entities.UserGap;
import com.yandex.messaging.core.net.entities.UserGaps;
import com.yandex.messaging.core.net.entities.UsersData;
import com.yandex.messaging.core.net.entities.YaDiskErrorInfo;
import com.yandex.messaging.internal.net.ai.AiTextEditData;
import com.yandex.messaging.techprofile.logout.HttpLogoutApiCalls;
import io.appmetrica.analytics.AppMetricaYandex;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspaces/-Telemost-X/research/artifacts/dex/classes2.dex */
public final class hw extends bff {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ hw(qe1 qe1Var, Object obj, String str, de7 de7Var, int i) {
        this.i = i;
        this.k = qe1Var;
        this.m = obj;
        this.l = str;
        this.j = de7Var;
    }

    public boolean C(f7f f7fVar) {
        switch (this.i) {
            case 0:
                mqd.z(f7fVar, "error");
                ((de7) this.j).l(f7fVar.a);
                return true;
            case 1:
                mqd.z(f7fVar, "error");
                ((de7) this.j).l(f7fVar.a);
                return true;
            case 2:
            case 4:
            case 5:
            case 11:
            case 16:
            default:
                return super.C(f7fVar);
            case 3:
                mqd.z(f7fVar, "error");
                if (f7fVar.a != 404) {
                    return false;
                }
                ((pd1) this.k).j(nh9.c);
                return true;
            case 6:
                mqd.z(f7fVar, "error");
                ((rd1) this.j).l(f7fVar.a);
                return false;
            case 7:
                mqd.z(f7fVar, "error");
                ((de7) this.j).l(f7fVar.a);
                return true;
            case 8:
                mqd.z(f7fVar, "error");
                return ((rd1) this.k).l(f7fVar.a);
            case 9:
                mqd.z(f7fVar, "error");
                ((de7) this.j).l(f7fVar.a);
                return true;
            case 10:
                mqd.z(f7fVar, "error");
                return ((rd1) this.k).l(f7fVar.a);
            case 12:
                mqd.z(f7fVar, "error");
                ((nm5) this.j).invoke(Integer.valueOf(f7fVar.a), f7fVar.b);
                return true;
            case 13:
                mqd.z(f7fVar, "error");
                ((ppr) this.j).d(new YaDiskErrorInfo(f7fVar.a, f7fVar.b));
                return true;
            case 14:
                mqd.z(f7fVar, "error");
                ((rd1) this.j).l(f7fVar.a);
                return false;
            case 15:
                od1 od1Var = (od1) this.j;
                mqd.z(f7fVar, "error");
                if (f7fVar.a == 409 || mqd.s(f7fVar.b, "object_version_is_mismatch")) {
                    od1Var.z();
                    return false;
                }
                od1Var.p();
                return true;
            case 17:
                mqd.z(f7fVar, "error");
                ((pxc) this.k).d.post(new oxc((xmh) this.j, 0));
                return true;
        }
    }

    public final void E(Object obj) {
        switch (this.i) {
            case 0:
                AiTextEditData aiTextEditData = (AiTextEditData) obj;
                mqd.z(aiTextEditData, "response");
                ((de7) this.j).c0(aiTextEditData);
                break;
            case 1:
                EmptyResponse emptyResponse = (EmptyResponse) obj;
                mqd.z(emptyResponse, "response");
                ((de7) this.j).c0(emptyResponse);
                break;
            case 2:
                AddFilesResponse addFilesResponse = (AddFilesResponse) obj;
                mqd.z(addFilesResponse, "response");
                ((de7) this.j).c0(addFilesResponse);
                break;
            case 3:
                GetChatInfoData getChatInfoData = (GetChatInfoData) obj;
                pd1 pd1Var = (pd1) this.k;
                mqd.z(getChatInfoData, "response");
                ChatData[] chatDataArr = getChatInfoData.chats;
                mqd.y(chatDataArr, "chats");
                if (chatDataArr.length != 0) {
                    ChatData chatData = getChatInfoData.chats[0];
                    mqd.u(chatData);
                    pd1Var.s(chatData, null);
                } else {
                    pd1Var.j(nh9.c);
                }
                break;
            case 4:
                ChatParticipantsData chatParticipantsData = (ChatParticipantsData) obj;
                mqd.z(chatParticipantsData, "response");
                ((de7) this.j).c0(chatParticipantsData);
                break;
            case 5:
                ChatSettingsParams chatSettingsParams = (ChatSettingsParams) obj;
                mqd.z(chatSettingsParams, "response");
                ((de7) this.j).c0(chatSettingsParams);
                break;
            case 6:
                MediaMessageListData mediaMessageListData = (MediaMessageListData) obj;
                mqd.z(mediaMessageListData, "response");
                ((rd1) this.j).c0(mediaMessageListData);
                break;
            case 7:
                GetOrganizationsResponse getOrganizationsResponse = (GetOrganizationsResponse) obj;
                mqd.z(getOrganizationsResponse, "response");
                ((de7) this.j).c0(getOrganizationsResponse);
                break;
            case 8:
                StaffUserDataData staffUserDataData = (StaffUserDataData) obj;
                mqd.z(staffUserDataData, "response");
                ((rd1) this.k).c0(staffUserDataData.getUser());
                break;
            case 9:
                GetSuggestData getSuggestData = (GetSuggestData) obj;
                mqd.z(getSuggestData, "response");
                ((de7) this.j).c0(getSuggestData);
                break;
            case 10:
                UserData userData = (UserData) obj;
                mqd.z(userData, "response");
                ((rd1) this.k).c0(userData);
                break;
            case 11:
                List list = (List) obj;
                mqd.z(list, "response");
                ((de7) this.j).c0(list);
                break;
            case 12:
                ChatData chatData2 = (ChatData) obj;
                mqd.z(chatData2, "response");
                ((yr2) this.m).invoke(chatData2);
                break;
            case 13:
                ResolveYaDiskResponse resolveYaDiskResponse = (ResolveYaDiskResponse) obj;
                mqd.z(resolveYaDiskResponse, "response");
                gw3 gw3Var = (gw3) ((ppr) this.j).a;
                if (as1.L(gw3Var.e)) {
                    gw3Var.f(new kel(resolveYaDiskResponse));
                }
                break;
            case 14:
                SearchData searchData = (SearchData) obj;
                mqd.z(searchData, "response");
                ((rd1) this.j).c0(searchData);
                break;
            case 15:
                ((od1) this.j).v((Bucket) obj);
                break;
            case 16:
                ShareFileResponse shareFileResponse = (ShareFileResponse) obj;
                mqd.z(shareFileResponse, "response");
                ((de7) this.j).c0(shareFileResponse);
                break;
            default:
                mqd.z((fcq) obj, "response");
                ((pxc) this.k).d.post(new oxc((xmh) this.j, 1));
                break;
        }
    }

    public void F() {
        switch (this.i) {
            case 0:
                ((de7) this.j).l(-1);
                break;
            case 13:
                if (!((b6s) ((qe1) this.l).j.get()).c) {
                    ((ppr) this.j).d(new YaDiskErrorInfo(-1, null));
                }
                break;
        }
    }

    public final g5l I() {
        switch (this.i) {
            case 0:
                g5l g5lVarA = ((iw) this.k).a.a(this.m, (String) this.l);
                g5lVarA.g(Object.class, tyc.c);
                return g5lVarA;
            case 1:
                return ((qe1) this.l).b.a((ActivateChatRequestParams) this.m, "activate_chat");
            case 2:
                return ((qe1) this.l).b.a((AddFilesParams) this.m, "add_files");
            case 3:
                return ((qe1) this.m).b.a((GetChatInfoByAlias) this.j, "get_chats_info");
            case 4:
                return ((qe1) this.l).b.a((ChatParticipantsParams) this.m, "get_chat_members");
            case 5:
                return ((qe1) this.l).b.a((GetChatSettingsParams) this.m, "get_chat_settings");
            case 6:
                return ((qe1) this.l).b.a((GetMediaMessagesParams) this.m, "get_media_messages");
            case 7:
                return ((qe1) this.k).b.a(new GetOrganizationsParams((List) this.m, (String) this.l), "get_organizations");
            case 8:
                return ((qe1) this.m).b.a((GetStaffDataParam) this.j, "get_user_by_nickname");
            case 9:
                return ((qe1) this.l).b.a((GetSuggestParam) this.m, "get_suggest");
            case 10:
                return ((qe1) this.m).b.a((GetUsersDataParam) this.j, "get_users_data");
            case 11:
                return ((qe1) this.k).b.a((GetUserGapsParam) this.m, "staff_proxy");
            case 12:
                return ((qe1) this.k).b.a((JoinParams) this.l, "invite");
            case 13:
                qe1 qe1Var = (qe1) this.l;
                g5l g5lVarA2 = qe1Var.b.a((ResolveYaDiskParams) this.m, "upload_to_disk");
                String deviceId = AppMetricaYandex.getDeviceId(((a7s) qe1Var.k).a);
                if (deviceId != null) {
                    g5lVarA2.a("X-Device-Id", deviceId);
                }
                return g5lVarA2;
            case 14:
                t8n t8nVar = (t8n) this.k;
                if (t8nVar != null) {
                    t8nVar.O(2);
                }
                return ((qe1) this.l).b.a((SearchParams) this.m, "search");
            case 15:
                return ((qe1) this.k).b.a((Bucket) this.l, "set_bucket");
            case 16:
                return ((qe1) this.l).b.a((ShareFileParams) this.m, "share_file");
            default:
                g5l g5lVar = new g5l();
                l0d l0dVar = new l0d();
                l0dVar.l("https");
                l0dVar.g((String) this.l);
                l0dVar.c("logout_client/", false);
                g5lVar.a = l0dVar.e();
                g5lVar.f(rcd.d(((pxc) this.k).c, new HttpLogoutApiCalls.ApiRequest(new HttpLogoutApiCalls.Params((String) this.m))));
                return g5lVar;
        }
    }

    public int K() {
        switch (this.i) {
            case 0:
                return 1;
            case 6:
                return Integer.MAX_VALUE;
            case 13:
                return !((b6s) ((qe1) this.l).j.get()).c ? 1 : 3;
            default:
                return super.K();
        }
    }

    public boolean W(int i) {
        switch (this.i) {
            case 0:
                return false;
            case 13:
                Set set = g5s.d;
                if (g5s.e.contains(Integer.valueOf(i))) {
                    return false;
                }
                return super.W(i);
            default:
                return super.W(i);
        }
    }

    public boolean X() {
        switch (this.i) {
            case 0:
                return true;
            default:
                return super.X();
        }
    }

    public boolean i() {
        switch (this.i) {
            case 0:
                return false;
            case 13:
                if (((b6s) ((qe1) this.l).j.get()).c) {
                    return !false;
                }
                return false;
            default:
                return super.i();
        }
    }

    public final znc s(ocl oclVar) {
        UserGap[] userGapArr;
        Object objJ;
        int i = this.i;
        int i2 = 3;
        Object obj = this.m;
        Object obj2 = this.k;
        Object obj3 = this.l;
        switch (i) {
            case 0:
                return fde.j(((iw) obj2).a, (String) obj3, AiTextEditData.class, oclVar);
            case 1:
                return fde.j(((qe1) obj3).b, "activate_chat", EmptyResponse.class, oclVar);
            case 2:
                return fde.j(((qe1) obj3).b, "add_files", AddFilesResponse.class, oclVar);
            case 3:
                return fde.j(((qe1) obj).b, "get_chats_info", GetChatInfoData.class, oclVar);
            case 4:
                return fde.j(((qe1) obj3).b, "get_chat_members", ChatParticipantsData.class, oclVar);
            case 5:
                return fde.j(((qe1) obj3).b, "get_chat_settings", ChatSettingsParams.class, oclVar);
            case 6:
                return fde.j(((qe1) obj3).b, "get_media_messages", MediaMessageListData.class, oclVar);
            case 7:
                return fde.j(((qe1) obj2).b, "get_organizations", GetOrganizationsResponse.class, oclVar);
            case 8:
                znc zncVarJ = fde.j(((qe1) obj).b, "get_user_by_nickname", StaffUserDataData.class, oclVar);
                return zncVarJ instanceof ldi ? new ldi(((ldi) zncVarJ).i) : znc.p(oclVar.d, oclVar.c);
            case 9:
                return fde.j(((qe1) obj3).b, "get_suggest", GetSuggestData.class, oclVar);
            case 10:
                znc zncVarJ2 = fde.j(((qe1) obj).b, "get_users_data", UsersData.class, oclVar);
                if (zncVarJ2 instanceof ldi) {
                    Object obj4 = ((ldi) zncVarJ2).i;
                    if (((UsersData) obj4).users.length == 1) {
                        return new ldi(((UsersData) obj4).users[0]);
                    }
                }
                return znc.p(oclVar.d, oclVar.c);
            case 11:
                String str = (String) obj3;
                znc zncVarB = ((qe1) obj2).b.b("staff_proxy", gum.i(Map.class, new Type[]{String.class, UserGaps.class}), oclVar, new vd1(i2));
                if (!(zncVarB instanceof ldi)) {
                    return znc.p(404, "User not found");
                }
                Object obj5 = ((ldi) zncVarB).i;
                if (((Map) obj5).get(str) == null) {
                    objJ = new ArrayList();
                } else {
                    UserGaps userGaps = (UserGaps) ((Map) obj5).get(str);
                    if (userGaps == null || (userGapArr = userGaps.gaps) == null) {
                        userGapArr = new UserGap[0];
                    }
                    objJ = f3r.J(Arrays.copyOf(userGapArr, userGapArr.length));
                }
                return new ldi(objJ);
            case 12:
                return fde.j(((qe1) obj2).b, "invite", ChatData.class, oclVar);
            case 13:
                return fde.j(((qe1) obj3).b, "upload_to_disk", ResolveYaDiskResponse.class, oclVar);
            case 14:
                t8n t8nVar = (t8n) obj2;
                if (t8nVar != null) {
                    t8nVar.O(3);
                }
                znc zncVarJ3 = fde.j(((qe1) obj3).b, "search", SearchData.class, oclVar);
                if (t8nVar != null) {
                    t8nVar.O(4);
                }
                return zncVarJ3;
            case 15:
                int i3 = oclVar.d;
                znc zncVarJ4 = fde.j(((qe1) obj2).b, "set_bucket", BucketsData.class, oclVar);
                if (zncVarJ4 instanceof ldi) {
                    Object obj6 = ((ldi) zncVarJ4).i;
                    mqd.y(obj6, "getResponse(...)");
                    Bucket bucketA = ((BucketsData) obj6).a((Class) obj);
                    if (bucketA != null) {
                        return new ldi(bucketA);
                    }
                }
                return zncVarJ4.A() ? znc.l(i3, zncVarJ4.w().b, zncVarJ4.w().c) : znc.p(i3, oclVar.c);
            case 16:
                return fde.j(((qe1) obj3).b, "share_file", ShareFileResponse.class, oclVar);
            default:
                tcl tclVar = oclVar.g;
                if (tclVar != null) {
                    tclVar.close();
                }
                if (oclVar.i()) {
                    return new ldi(fcq.a);
                }
                int i4 = oclVar.d;
                return znc.p(i4, "HTTP_" + i4);
        }
    }

    public wf z() {
        switch (this.i) {
            case 1:
                return (wf) this.k;
            case 2:
                return (wf) this.k;
            case 3:
                wf wfVarA = ((pd1) this.k).a();
                return wfVarA == null ? (wf) this.l : wfVarA;
            case 4:
                return (wf) this.k;
            case 5:
                return (wf) this.k;
            case 6:
                return (wf) this.k;
            case 7:
            case 11:
            default:
                return super.z();
            case 8:
                wf wfVarA2 = ((rd1) this.k).a();
                return wfVarA2 == null ? (wf) this.l : wfVarA2;
            case 9:
                return (wf) this.k;
            case 10:
                wf wfVarA3 = ((rd1) this.k).a();
                return wfVarA3 == null ? (wf) this.l : wfVarA3;
            case 12:
                return new wf(true);
            case 13:
                return (wf) this.k;
            case 14:
                return new wf(true);
            case 15:
                return new wf(true);
            case 16:
                return (wf) this.k;
        }
    }

    public /* synthetic */ hw(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.i = i;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.j = obj4;
    }

    public hw(String str, pxc pxcVar, String str2, xmh xmhVar) {
        this.i = 17;
        this.l = str;
        this.k = pxcVar;
        this.m = str2;
        this.j = xmhVar;
    }
}
