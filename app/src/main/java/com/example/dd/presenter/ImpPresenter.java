package com.example.dd.presenter;


import com.example.dd.base.BasePresenter;
import com.example.dd.bean.NewsBean;
import com.example.dd.contract.RelContract;
import com.example.dd.model.ImpModel;
import com.example.dd.utils.RelCallBack;

public class ImpPresenter extends BasePresenter<RelContract.RelModel<NewsBean>, RelContract.RelView> implements RelContract.RelPresenter {


    public ImpPresenter(RelContract.RelView view) {
        super(view);
    }

    @Override
    protected RelContract.RelModel<NewsBean> getModel() {
        return new ImpModel<NewsBean>();
    }

    @Override
    public void getData(String url) {
        model.getData(url, new RelCallBack<NewsBean>() {
            @Override
            public void onSucess(NewsBean newsBean) {
                view.onSucess(newsBean);
            }

            @Override
            public void onFail(String error) {
                view.onFail("错误" + error);
            }
        });
    }
}
