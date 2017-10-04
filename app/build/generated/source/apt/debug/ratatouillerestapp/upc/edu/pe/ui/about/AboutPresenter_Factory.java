package ratatouillerestapp.upc.edu.pe.ui.about;

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
public final class AboutPresenter_Factory<V extends AboutMvpView, I extends AboutMvpInteractor>
    implements Factory<AboutPresenter<V, I>> {
  private final MembersInjector<AboutPresenter<V, I>> aboutPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public AboutPresenter_Factory(
      MembersInjector<AboutPresenter<V, I>> aboutPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert aboutPresenterMembersInjector != null;
    this.aboutPresenterMembersInjector = aboutPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public AboutPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        aboutPresenterMembersInjector,
        new AboutPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends AboutMvpView, I extends AboutMvpInteractor>
      Factory<AboutPresenter<V, I>> create(
          MembersInjector<AboutPresenter<V, I>> aboutPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new AboutPresenter_Factory<V, I>(
        aboutPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
