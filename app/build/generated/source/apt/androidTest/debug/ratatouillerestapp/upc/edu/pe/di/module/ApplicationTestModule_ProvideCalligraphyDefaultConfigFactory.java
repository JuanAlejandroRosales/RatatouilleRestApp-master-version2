package ratatouillerestapp.upc.edu.pe.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApplicationTestModule_ProvideCalligraphyDefaultConfigFactory
    implements Factory<CalligraphyConfig> {
  private final ApplicationTestModule module;

  public ApplicationTestModule_ProvideCalligraphyDefaultConfigFactory(
      ApplicationTestModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public CalligraphyConfig get() {
    return Preconditions.checkNotNull(
        module.provideCalligraphyDefaultConfig(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CalligraphyConfig> create(ApplicationTestModule module) {
    return new ApplicationTestModule_ProvideCalligraphyDefaultConfigFactory(module);
  }

  /** Proxies {@link ApplicationTestModule#provideCalligraphyDefaultConfig()}. */
  public static CalligraphyConfig proxyProvideCalligraphyDefaultConfig(
      ApplicationTestModule instance) {
    return instance.provideCalligraphyDefaultConfig();
  }
}
