package ratatouillerestapp.upc.edu.pe.ui.product;

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
public final class ProductPresenter_Factory<
        V extends ProductMvpView, I extends ProductMvpInteractor>
    implements Factory<ProductPresenter<V, I>> {
  private final MembersInjector<ProductPresenter<V, I>> productPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public ProductPresenter_Factory(
      MembersInjector<ProductPresenter<V, I>> productPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert productPresenterMembersInjector != null;
    this.productPresenterMembersInjector = productPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public ProductPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        productPresenterMembersInjector,
        new ProductPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends ProductMvpView, I extends ProductMvpInteractor>
      Factory<ProductPresenter<V, I>> create(
          MembersInjector<ProductPresenter<V, I>> productPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new ProductPresenter_Factory<V, I>(
        productPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
