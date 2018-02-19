package divelnick.ru.vank.ui.main;


import divelnick.ru.vank.base.BaseModel;
import divelnick.ru.vank.data.network.response.User;
import divelnick.ru.vank.utils.RxUtils;
import io.reactivex.Observable;

class MainModel extends BaseModel {

    Observable<User> getUser(String ids, String fields) {
        return mRepository.getUser(ids, fields)
                .compose(RxUtils.async());
    }

}
