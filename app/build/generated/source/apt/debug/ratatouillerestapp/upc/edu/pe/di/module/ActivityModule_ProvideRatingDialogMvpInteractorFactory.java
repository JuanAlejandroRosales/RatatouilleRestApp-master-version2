package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogInteractor;
import ratatouillerestapp.upc.edu.pe.ui.main.rating.RatingDialogMvpInteractor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideRatingDialogMvpInteractorFactory
    implements Factory<RatingDialogMvpInteractor> {
  private final ActivityModule module;

  private final Provider<RatingDialogInteractor> interactorProvider;

  public ActivityModule_ProvideRatingDialogMvpInteractorFactory(
      ActivityModule module, Provider<RatingDialogInteractor> interactorProvider) {
    assert module != null;
    this.module = module;
    assert interactorProvider != null;
    this.interactorProvider = interactorProvider;
  }

  @Override
  public RatingDialogMvpInteractor get() {
    return Preconditions.checkNotNull(
        module.provideRatingDialogMvpInteractor(interactorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RatingDialogMvpInteractor> create(
      ActivityModule module, Provider<RatingDialogInteractor> interactorProvider) {
    return new ActivityModule_ProvideRatingDialogMvpInteractorFactory(module, interactorProvider);
  }

  /** Proxies {@link ActivityModule#provideRatingDialogMvpInteractor(RatingDialogInteractor)}. */
  public static RatingDialogMvpInteractor proxyProvideRatingDialogMvpInteractor(
      ActivityModule instance, RatingDialogInteractor interactor) {
    return instance.provideRatingDialogMvpInteractor(interactor);
  }
}
