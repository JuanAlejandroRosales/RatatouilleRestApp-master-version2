package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import ratatouillerestapp.upc.edu.pe.data.network.ApiHelper;
import ratatouillerestapp.upc.edu.pe.data.network.AppApiHelper;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideApiHelperFactory implements Factory<ApiHelper> {
  private final ApplicationTestModule module;

  private final Provider<AppApiHelper> appApiHelperProvider;

  public ApplicationTestModule_ProvideApiHelperFactory(
      ApplicationTestModule module, Provider<AppApiHelper> appApiHelperProvider) {
    assert module != null;
    this.module = module;
    assert appApiHelperProvider != null;
    this.appApiHelperProvider = appApiHelperProvider;
  }

  @Override
  public ApiHelper get() {
    return Preconditions.checkNotNull(
        module.provideApiHelper(appApiHelperProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ApiHelper> create(
      ApplicationTestModule module, Provider<AppApiHelper> appApiHelperProvider) {
    return new ApplicationTestModule_ProvideApiHelperFactory(module, appApiHelperProvider);
  }

  /** Proxies {@link ApplicationTestModule#provideApiHelper(AppApiHelper)}. */
  public static ApiHelper proxyProvideApiHelper(
      ApplicationTestModule instance, AppApiHelper appApiHelper) {
    return instance.provideApiHelper(appApiHelper);
  }
}
