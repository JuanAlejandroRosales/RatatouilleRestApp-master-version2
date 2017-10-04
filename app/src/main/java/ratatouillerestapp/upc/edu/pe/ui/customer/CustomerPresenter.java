package ratatouillerestapp.upc.edu.pe.ui.customer;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.about.AboutMvpView;
import ratatouillerestapp.upc.edu.pe.ui.base.BasePresenter;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

/**
 * Created by frank on 03/10/17.
 */

public class CustomerPresenter<V extends CustomerMvpView,
        I extends CustomerMvpInteractor> extends BasePresenter<V, I>
        implements CustomerMvpPresenter<V, I> {

    @Inject
    public CustomerPresenter(I mvpInteractor,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(mvpInteractor, schedulerProvider, compositeDisposable);
    }
}
