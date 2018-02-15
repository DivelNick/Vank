package divelnick.ru.vank.ui.splash;


import divelnick.ru.vank.base.BaseModel;

class SplashModel extends BaseModel{

    boolean isIntroShown(){
        return mRepository.isIntroShown();
    }


}
