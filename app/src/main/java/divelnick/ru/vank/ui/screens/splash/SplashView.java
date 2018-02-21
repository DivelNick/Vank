package divelnick.ru.vank.ui.screens.splash;


import divelnick.ru.vank.base.BaseView;

interface SplashView extends BaseView {

    void showIntro();

    void authorize();

    void closeSplash(int delay);

    void showLoginBtn();
}
