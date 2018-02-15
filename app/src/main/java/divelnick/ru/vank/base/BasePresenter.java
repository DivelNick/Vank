package divelnick.ru.vank.base;


import io.reactivex.disposables.CompositeDisposable;

public abstract class BasePresenter<T extends BaseView> {


    private T mView;

    protected CompositeDisposable mCompositeDisposable;


    public void takeView(T view) {
        mCompositeDisposable = new CompositeDisposable();
        mView = view;
    }

    public abstract void initView();

    public void dropView(){
        if(mCompositeDisposable != null){
            mCompositeDisposable.clear();
        }
        mView = null;
    }

    public T getView() {
        return mView;
    }


}
