package ratatouillerestapp.upc.edu.pe.ui.feed;

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
public final class FeedInteractor_Factory implements Factory<FeedInteractor> {
  private final MembersInjector<FeedInteractor> feedInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  public FeedInteractor_Factory(
      MembersInjector<FeedInteractor> feedInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    assert feedInteractorMembersInjector != null;
    this.feedInteractorMembersInjector = feedInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
  }

  @Override
  public FeedInteractor get() {
    return MembersInjectors.injectMembers(
        feedInteractorMembersInjector,
        new FeedInteractor(preferencesHelperProvider.get(), apiHelperProvider.get()));
  }

  public static Factory<FeedInteractor> create(
      MembersInjector<FeedInteractor> feedInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider) {
    return new FeedInteractor_Factory(
        feedInteractorMembersInjector, preferencesHelperProvider, apiHelperProvider);
  }
}
