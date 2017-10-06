package ratatouillerestapp.upc.edu.pe.ui.reservation;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;
import ratatouillerestapp.upc.edu.pe.ui.base.BasePresenter;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

/**
 * Created by Juan Alejandro on 6/10/2017.
 */

public class ReservationPresenter<V extends ReservationMvpView, I extends ReservationMvpInteractor>
        extends BasePresenter<V, I> implements ReservationMvpPresenter<V, I> {

    private static final String TAG = "ReservationPresenter";

    @Inject
    public ReservationPresenter(I mvpInteractor,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(mvpInteractor, schedulerProvider, compositeDisposable);
    }
}
