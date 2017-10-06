package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideDatabaseNameFactory implements Factory<String> {
  private final ApplicationTestModule module;

  public ApplicationTestModule_ProvideDatabaseNameFactory(ApplicationTestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public String get() {
    return Preconditions.checkNotNull(
        module.provideDatabaseName(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<String> create(ApplicationTestModule module) {
    return new ApplicationTestModule_ProvideDatabaseNameFactory(module);
  }

  /** Proxies {@link ApplicationTestModule#provideDatabaseName()}. */
  public static String proxyProvideDatabaseName(ApplicationTestModule instance) {
    return instance.provideDatabaseName();
  }
}
