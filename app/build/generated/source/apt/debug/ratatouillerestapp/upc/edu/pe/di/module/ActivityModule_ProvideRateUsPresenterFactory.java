package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpPresenter;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpView;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideRateUsPresenterFactory
    implements Factory<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>> {
  private final ActivityModule module;

  private final Provider<RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
      presenterProvider;

  public ActivityModule_ProvideRateUsPresenterFactory(
      ActivityModule module,
      Provider<RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
          presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor> get() {
    return Preconditions.checkNotNull(
        module.provideRateUsPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
      create(
          ActivityModule module,
          Provider<RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>>
              presenterProvider) {
    return new ActivityModule_ProvideRateUsPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideRateUsPresenter(RatingDialogPresenter)}. */
  public static RatingDialogMvpPresenter<RatingDialogMvpView, RatingDialogMvpInteractor>
      proxyProvideRateUsPresenter(
          ActivityModule instance,
          RatingDialogPresenter<RatingDialogMvpView, RatingDialogMvpInteractor> presenter) {
    return instance.provideRateUsPresenter(presenter);
  }
}
