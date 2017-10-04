package ratatouillerestapp.upc.edu.pe.ui.customer;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.utils.rx.SchedulerProvider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CustomerPresenter_Factory<
        V extends CustomerMvpView, I extends CustomerMvpInteractor>
    implements Factory<CustomerPresenter<V, I>> {
  private final MembersInjector<CustomerPresenter<V, I>> customerPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public CustomerPresenter_Factory(
      MembersInjector<CustomerPresenter<V, I>> customerPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert customerPresenterMembersInjector != null;
    this.customerPresenterMembersInjector = customerPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public CustomerPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        customerPresenterMembersInjector,
        new CustomerPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends CustomerMvpView, I extends CustomerMvpInteractor>
      Factory<CustomerPresenter<V, I>> create(
          MembersInjector<CustomerPresenter<V, I>> customerPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new CustomerPresenter_Factory<V, I>(
        customerPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
