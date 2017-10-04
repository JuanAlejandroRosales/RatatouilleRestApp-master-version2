package ratatouillerestapp.upc.edu.pe.ui.product;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import ratatouillerestapp.upc.edu.pe.ui.base.BasePresenter;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.customer.CustomerMvpView;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

/**
 * Created by frank on 03/10/17.
 */

public class ProductPresenter <V extends ProductMvpView,
        I extends ProductMvpInteractor> extends BasePresenter<V, I>
        implements ProductMvpPresenter<V, I> {

    @Inject
    public ProductPresenter(I mvpInteractor,
                             SchedulerProvider schedulerProvider,
                             CompositeDisposable compositeDisposable) {
        super(mvpInteractor, schedulerProvider, compositeDisposable);
    }
}
