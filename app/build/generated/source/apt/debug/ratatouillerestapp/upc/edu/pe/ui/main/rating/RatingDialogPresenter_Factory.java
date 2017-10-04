package ratatouillerestapp.upc.edu.pe.ui.main.rating;

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
public final class RatingDialogPresenter_Factory<
        V extends RatingDialogMvpView, I extends RatingDialogMvpInteractor>
    implements Factory<RatingDialogPresenter<V, I>> {
  private final MembersInjector<RatingDialogPresenter<V, I>> ratingDialogPresenterMembersInjector;

  private final Provider<I> mvpInteractorProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public RatingDialogPresenter_Factory(
      MembersInjector<RatingDialogPresenter<V, I>> ratingDialogPresenterMembersInjector,
      Provider<I> mvpInteractorProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert ratingDialogPresenterMembersInjector != null;
    this.ratingDialogPresenterMembersInjector = ratingDialogPresenterMembersInjector;
    assert mvpInteractorProvider != null;
    this.mvpInteractorProvider = mvpInteractorProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public RatingDialogPresenter<V, I> get() {
    return MembersInjectors.injectMembers(
        ratingDialogPresenterMembersInjector,
        new RatingDialogPresenter<V, I>(
            mvpInteractorProvider.get(),
            schedulerProvider.get(),
            compositeDisposableProvider.get()));
  }

  public static <V extends RatingDialogMvpView, I extends RatingDialogMvpInteractor>
      Factory<RatingDialogPresenter<V, I>> create(
          MembersInjector<RatingDialogPresenter<V, I>> ratingDialogPresenterMembersInjector,
          Provider<I> mvpInteractorProvider,
          Provider<SchedulerProvider> schedulerProvider,
          Provider<CompositeDisposable> compositeDisposableProvider) {
    return new RatingDialogPresenter_Factory<V, I>(
        ratingDialogPresenterMembersInjector,
        mvpInteractorProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
