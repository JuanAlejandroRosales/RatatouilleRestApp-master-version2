package ratatouillerestapp.upc.edu.pe.ui.main;

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
public final class MainPresenter_Factory<V extends MainMvpView, I extends MainMvpInteractor>
    implements Factory<MainPresenter<V, I>> {
  private final MembersInjector<MainPresenter<V, I>> mainPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MainPresenter_Factory(
      MembersInjector<MainPresenter<V, I>> mainPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert mainPresenterMembersInjector != null;
    this.mainPresenterMembersInjector = mainPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MainPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        mainPresenterMembersInjector,
        new MainPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends MainMvpView, I extends MainMvpInteractor>
      Factory<MainPresenter<V, I>> create(
          MembersInjector<MainPresenter<V, I>> mainPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MainPresenter_Factory<V, I>(
        mainPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
