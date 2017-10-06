package ratatouillerestapp.upc.edu.pe.di.module;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideApplicationFactory implements Factory<Application> {
  private final ApplicationTestModule module;

  public ApplicationTestModule_ProvideApplicationFactory(ApplicationTestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Application get() {
    return Preconditions.checkNotNull(
        module.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Application> create(ApplicationTestModule module) {
    return new ApplicationTestModule_ProvideApplicationFactory(module);
  }

  /** Proxies {@link ApplicationTestModule#provideApplication()}. */
  public static Application proxyProvideApplication(ApplicationTestModule instance) {
    return instance.provideApplication();
  }
}
