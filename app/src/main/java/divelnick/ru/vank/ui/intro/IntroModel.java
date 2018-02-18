package divelnick.ru.vank.ui.intro;


import divelnick.ru.vank.base.BaseModel;

class IntroModel extends BaseModel{

    void setIntroShown(boolean isShown){
        mRepository.setIntroShown(isShown);
    }

}
