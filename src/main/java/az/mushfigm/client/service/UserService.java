package az.mushfigm.client.service;

import az.mushfigm.client.dto.request.ReqLogin;

public interface UserService {
    String login(ReqLogin reqLogin);
}
