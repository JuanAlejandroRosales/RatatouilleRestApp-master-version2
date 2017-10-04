package ratatouillerestapp.upc.edu.pe.ui.base;

import dagger.internal.Factory;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BasePresenter_Factory<V extends MvpView, I extends MvpInteractor>
    implements Factory<BasePresenter<V, I>> {
  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public BasePresenter_Factory(
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public BasePresenter<V, I> get() {
    return new BasePresenter<V, I>(
        mvpInteractorProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get());
  }

  public static <V extends MvpView, I extends MvpInteractor> Factory<BasePresenter<V, I>> create(
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new BasePresenter_Factory<V, I>(
        mvpInteractorProvider, schedulerProvider, compositeDisposableProvider);
  }
}
