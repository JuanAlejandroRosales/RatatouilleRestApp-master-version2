package ratatouillerestapp.upc.edu.pe.ui.main.rating;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class RatingDialogInteractor_Factory implements Factory<RatingDialogInteractor> {
  private final MembersInjector<RatingDialogInteractor> ratingDialogInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public RatingDialogInteractor_Factory(
      MembersInjector<RatingDialogInteractor> ratingDialogInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert ratingDialogInteractorMembersInjector != null;
    this.ratingDialogInteractorMembersInjector = ratingDialogInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public RatingDialogInteractor get() {
    return MembersInjectors.injectMembers(
        ratingDialogInteractorMembersInjector,
        new RatingDialogInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<RatingDialogInteractor> create(
      MembersInjector<RatingDialogInteractor> ratingDialogInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new RatingDialogInteractor_Factory(
        ratingDialogInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
