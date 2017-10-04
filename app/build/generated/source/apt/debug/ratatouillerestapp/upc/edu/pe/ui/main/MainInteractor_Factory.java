package ratatouillerestapp.upc.edu.pe.ui.main;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.db.repository.QuestionRepository;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.prefs.PreferencesHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainInteractor_Factory implements Factory<MainInteractor> {
  private final MembersInjector<MainInteractor> mainInteractorMembersInjector;

  private final Provider<PreferencesHelper> preferencesHelperProvider;

  private final Provider<ApiHelper> apiHelperProvider;

  private final Provider<QuestionRepository> questionRepositoryProvider;

  public MainInteractor_Factory(
      MembersInjector<MainInteractor> mainInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<QuestionRepository> questionRepositoryProvider) {
    assert mainInteractorMembersInjector != null;
    this.mainInteractorMembersInjector = mainInteractorMembersInjector;
    assert preferencesHelperProvider != null;
    this.preferencesHelperProvider = preferencesHelperProvider;
    assert apiHelperProvider != null;
    this.apiHelperProvider = apiHelperProvider;
    assert questionRepositoryProvider != null;
    this.questionRepositoryProvider = questionRepositoryProvider;
  }

  @Override
  public MainInteractor get() {
    return MembersInjectors.injectMembers(
        mainInteractorMembersInjector,
        new MainInteractor(
            preferencesHelperProvider.get(),
            apiHelperProvider.get(),
            questionRepositoryProvider.get()));
  }

  public static Factory<MainInteractor> create(
      MembersInjector<MainInteractor> mainInteractorMembersInjector,
      Provider<PreferencesHelper> preferencesHelperProvider,
      Provider<ApiHelper> apiHelperProvider,
      Provider<QuestionRepository> questionRepositoryProvider) {
    return new MainInteractor_Factory(
        mainInteractorMembersInjector,
        preferencesHelperProvider,
        apiHelperProvider,
        questionRepositoryProvider);
  }
}
